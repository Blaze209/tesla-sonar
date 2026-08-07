package ns;

import android.text.Layout;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import gs.i;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import ts.p0;
import ts.r0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c extends gs.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f95378p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Pattern f95379q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f95380r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final Pattern f95381s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final Pattern f95382t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f95383u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pattern f95384v = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final b f95385w = new b(30.0f, 1, 1);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final a f95386x = new a(32, 15);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final XmlPullParserFactory f95387o;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f95388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f95389b;

        a(int i11, int i12) {
            this.f95388a = i11;
            this.f95389b = i12;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f95390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f95391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f95392c;

        b(float f11, int i11, int i12) {
            this.f95390a = f11;
            this.f95391b = i11;
            this.f95392c = i12;
        }
    }

    /* JADX INFO: renamed from: ns.c$c, reason: collision with other inner class name */
    private static final class C2034c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f95393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f95394b;

        C2034c(int i11, int i12) {
            this.f95393a = i11;
            this.f95394b = i12;
        }
    }

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f95387o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e11) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e11);
        }
    }

    private static g B(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static boolean C(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals(OrcaKeys.METADATA) || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static Layout.Alignment D(String str) {
        String strE = ou.c.e(str);
        strE.getClass();
        switch (strE) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static a E(XmlPullParser xmlPullParser, a aVar) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f95384v.matcher(attributeValue);
        if (!matcher.matches()) {
            u.i("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
        try {
            int i11 = Integer.parseInt((String) ts.a.e(matcher.group(1)));
            int i12 = Integer.parseInt((String) ts.a.e(matcher.group(2)));
            if (i11 != 0 && i12 != 0) {
                return new a(i11, i12);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + i11 + " " + i12);
        } catch (NumberFormatException unused) {
            u.i("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
    }

    private static void F(String str, g gVar) throws SubtitleDecoderException {
        Matcher matcher;
        String[] strArrP0 = p0.P0(str, "\\s+");
        if (strArrP0.length == 1) {
            matcher = f95380r.matcher(str);
        } else {
            if (strArrP0.length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + strArrP0.length + ".");
            }
            matcher = f95380r.matcher(strArrP0[1]);
            u.i("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        String str2 = (String) ts.a.e(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                gVar.z(3);
                break;
            case "em":
                gVar.z(2);
                break;
            case "px":
                gVar.z(1);
                break;
            default:
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.y(Float.parseFloat((String) ts.a.e(matcher.group(1))));
    }

    private static b G(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        float f11;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i11 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrP0 = p0.P0(attributeValue2, " ");
            if (strArrP0.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f11 = Integer.parseInt(strArrP0[0]) / Integer.parseInt(strArrP0[1]);
        } else {
            f11 = 1.0f;
        }
        b bVar = f95385w;
        int i12 = bVar.f95391b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        int i13 = bVar.f95392c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i13 = Integer.parseInt(attributeValue4);
        }
        return new b(i11 * f11, i12, i13);
    }

    private static Map<String, g> H(XmlPullParser xmlPullParser, Map<String, g> map, a aVar, C2034c c2034c, Map<String, e> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (r0.e(xmlPullParser, "style")) {
                String strA = r0.a(xmlPullParser, "style");
                g gVarM = M(xmlPullParser, new g());
                if (strA != null) {
                    for (String str : N(strA)) {
                        gVarM.a(map.get(str));
                    }
                }
                String strG = gVarM.g();
                if (strG != null) {
                    map.put(strG, gVarM);
                }
            } else if (r0.e(xmlPullParser, "region")) {
                e eVarK = K(xmlPullParser, aVar, c2034c);
                if (eVarK != null) {
                    map2.put(eVarK.f95408a, eVarK);
                }
            } else if (r0.e(xmlPullParser, OrcaKeys.METADATA)) {
                I(xmlPullParser, map3);
            }
        } while (!r0.c(xmlPullParser, "head"));
        return map;
    }

    private static void I(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (r0.e(xmlPullParser, "image") && (strA = r0.a(xmlPullParser, "id")) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!r0.c(xmlPullParser, OrcaKeys.METADATA));
    }

    private static d J(XmlPullParser xmlPullParser, d dVar, Map<String, e> map, b bVar) throws SubtitleDecoderException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser2.getAttributeCount();
        String strSubstring = null;
        g gVarM = M(xmlPullParser2, null);
        long jO = -9223372036854775807L;
        long jO2 = -9223372036854775807L;
        long jO3 = -9223372036854775807L;
        String[] strArr = null;
        String str = "";
        int i11 = 0;
        while (i11 < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i11);
            int i12 = attributeCount;
            String attributeValue = xmlPullParser2.getAttributeValue(i11);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    i11++;
                    xmlPullParser2 = xmlPullParser;
                    attributeCount = i12;
                    break;
                case "dur":
                    jO3 = O(attributeValue, bVar);
                    break;
                case "end":
                    jO2 = O(attributeValue, bVar);
                    break;
                case "begin":
                    jO = O(attributeValue, bVar);
                    break;
                case "style":
                    String[] strArrN = N(attributeValue);
                    if (strArrN.length > 0) {
                        strArr = strArrN;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
            i11++;
            xmlPullParser2 = xmlPullParser;
            attributeCount = i12;
        }
        if (dVar != null) {
            long j11 = dVar.f95398d;
            if (j11 != -9223372036854775807L) {
                if (jO != -9223372036854775807L) {
                    jO += j11;
                }
                if (jO2 != -9223372036854775807L) {
                    jO2 += j11;
                }
            }
        }
        long j12 = jO;
        if (jO2 == -9223372036854775807L) {
            if (jO3 != -9223372036854775807L) {
                jO2 = j12 + jO3;
            } else if (dVar != null) {
                long j13 = dVar.f95399e;
                if (j13 != -9223372036854775807L) {
                    jO2 = j13;
                }
            }
        }
        return d.c(xmlPullParser.getName(), j12, jO2, gVarM, strArr, str, strSubstring, dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x016a  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b5  */
    private static e K(XmlPullParser xmlPullParser, a aVar, C2034c c2034c) {
        float f11;
        float f12;
        float f13;
        float f14;
        int i11;
        float f15;
        int i12;
        String strA = r0.a(xmlPullParser, "id");
        if (strA == null) {
            return null;
        }
        String strA2 = r0.a(xmlPullParser, "origin");
        if (strA2 == null) {
            u.i("TtmlDecoder", "Ignoring region without an origin");
            return null;
        }
        Pattern pattern = f95382t;
        Matcher matcher = pattern.matcher(strA2);
        Pattern pattern2 = f95383u;
        Matcher matcher2 = pattern2.matcher(strA2);
        int i13 = 2;
        if (matcher.matches()) {
            try {
                f11 = Float.parseFloat((String) ts.a.e(matcher.group(1))) / 100.0f;
                f12 = Float.parseFloat((String) ts.a.e(matcher.group(2))) / 100.0f;
            } catch (NumberFormatException unused) {
                u.i("TtmlDecoder", "Ignoring region with malformed origin: " + strA2);
                return null;
            }
        } else {
            if (!matcher2.matches()) {
                u.i("TtmlDecoder", "Ignoring region with unsupported origin: " + strA2);
                return null;
            }
            if (c2034c == null) {
                u.i("TtmlDecoder", "Ignoring region with missing tts:extent: " + strA2);
                return null;
            }
            try {
                int i14 = Integer.parseInt((String) ts.a.e(matcher2.group(1)));
                int i15 = Integer.parseInt((String) ts.a.e(matcher2.group(2)));
                float f16 = i14 / c2034c.f95393a;
                float f17 = i15 / c2034c.f95394b;
                f11 = f16;
                f12 = f17;
            } catch (NumberFormatException unused2) {
                u.i("TtmlDecoder", "Ignoring region with malformed origin: " + strA2);
                return null;
            }
        }
        String strA3 = r0.a(xmlPullParser, "extent");
        if (strA3 == null) {
            u.i("TtmlDecoder", "Ignoring region without an extent");
            return null;
        }
        Matcher matcher3 = pattern.matcher(strA3);
        Matcher matcher4 = pattern2.matcher(strA3);
        if (matcher3.matches()) {
            try {
                f13 = Float.parseFloat((String) ts.a.e(matcher3.group(1))) / 100.0f;
                f14 = Float.parseFloat((String) ts.a.e(matcher3.group(2))) / 100.0f;
            } catch (NumberFormatException unused3) {
                u.i("TtmlDecoder", "Ignoring region with malformed extent: " + strA2);
                return null;
            }
        } else {
            if (!matcher4.matches()) {
                u.i("TtmlDecoder", "Ignoring region with unsupported extent: " + strA2);
                return null;
            }
            if (c2034c == null) {
                u.i("TtmlDecoder", "Ignoring region with missing tts:extent: " + strA2);
                return null;
            }
            try {
                int i16 = Integer.parseInt((String) ts.a.e(matcher4.group(1)));
                int i17 = Integer.parseInt((String) ts.a.e(matcher4.group(2)));
                float f18 = i16 / c2034c.f95393a;
                f14 = i17 / c2034c.f95394b;
                f13 = f18;
            } catch (NumberFormatException unused4) {
                u.i("TtmlDecoder", "Ignoring region with malformed extent: " + strA2);
                return null;
            }
        }
        float f19 = f14;
        String strA4 = r0.a(xmlPullParser, "displayAlign");
        if (strA4 != null) {
            String strE = ou.c.e(strA4);
            strE.getClass();
            if (strE.equals("center")) {
                f15 = f12 + (f19 / 2.0f);
                i11 = 1;
            } else if (strE.equals("after")) {
                f15 = f12 + f19;
                i11 = 2;
            } else {
                i11 = 0;
                f15 = f12;
            }
        } else {
            i11 = 0;
            f15 = f12;
        }
        float f21 = 1.0f / aVar.f95389b;
        String strA5 = r0.a(xmlPullParser, "writingMode");
        if (strA5 != null) {
            String strE2 = ou.c.e(strA5);
            strE2.getClass();
            switch (strE2) {
                case "tb":
                case "tblr":
                    i12 = i13;
                    break;
                case "tbrl":
                    i12 = 1;
                    break;
                default:
                    i13 = Integer.MIN_VALUE;
                    i12 = i13;
                    break;
            }
        } else {
            i13 = Integer.MIN_VALUE;
            i12 = i13;
        }
        return new e(strA, f11, f15, 0, i11, f13, f19, 1, f21, i12);
    }

    private static float L(String str) {
        Matcher matcher = f95381s.matcher(str);
        if (!matcher.matches()) {
            u.i("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) ts.a.e(matcher.group(1)))));
        } catch (NumberFormatException e11) {
            u.j("TtmlDecoder", "Failed to parse shear: " + str, e11);
            return Float.MAX_VALUE;
        }
    }

    private static g M(XmlPullParser xmlPullParser, g gVar) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i11 = 0; i11 < attributeCount; i11++) {
            String attributeValue = xmlPullParser.getAttributeValue(i11);
            String attributeName = xmlPullParser.getAttributeName(i11);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    gVar = B(gVar).B("italic".equalsIgnoreCase(attributeValue));
                    break;
                case "fontFamily":
                    gVar = B(gVar).x(attributeValue);
                    break;
                case "textAlign":
                    gVar = B(gVar).H(D(attributeValue));
                    break;
                case "textDecoration":
                    String strE = ou.c.e(attributeValue);
                    strE.getClass();
                    switch (strE) {
                        case "nounderline":
                            gVar = B(gVar).K(false);
                            break;
                        case "underline":
                            gVar = B(gVar).K(true);
                            break;
                        case "nolinethrough":
                            gVar = B(gVar).C(false);
                            break;
                        case "linethrough":
                            gVar = B(gVar).C(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    gVar = B(gVar).v("bold".equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        gVar = B(gVar).A(attributeValue);
                        break;
                    }
                    break;
                case "ruby":
                    String strE2 = ou.c.e(attributeValue);
                    strE2.getClass();
                    switch (strE2) {
                        case "baseContainer":
                        case "base":
                            gVar = B(gVar).F(2);
                            break;
                        case "container":
                            gVar = B(gVar).F(1);
                            break;
                        case "delimiter":
                            gVar = B(gVar).F(4);
                            break;
                        case "textContainer":
                        case "text":
                            gVar = B(gVar).F(3);
                            break;
                    }
                    break;
                case "color":
                    gVar = B(gVar);
                    try {
                        gVar.w(ts.f.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        u.i("TtmlDecoder", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                    break;
                case "shear":
                    gVar = B(gVar).G(L(attributeValue));
                    break;
                case "textCombine":
                    String strE3 = ou.c.e(attributeValue);
                    strE3.getClass();
                    if (!strE3.equals("all")) {
                        if (strE3.equals("none")) {
                            gVar = B(gVar).I(false);
                        }
                        break;
                    } else {
                        gVar = B(gVar).I(true);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        gVar = B(gVar);
                        F(attributeValue, gVar);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        u.i("TtmlDecoder", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                    break;
                case "textEmphasis":
                    gVar = B(gVar).J(ns.b.a(attributeValue));
                    break;
                case "rubyPosition":
                    String strE4 = ou.c.e(attributeValue);
                    strE4.getClass();
                    if (!strE4.equals("before")) {
                        if (strE4.equals("after")) {
                            gVar = B(gVar).E(2);
                        }
                        break;
                    } else {
                        gVar = B(gVar).E(1);
                        break;
                    }
                    break;
                case "backgroundColor":
                    gVar = B(gVar);
                    try {
                        gVar.u(ts.f.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        u.i("TtmlDecoder", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                    break;
                case "multiRowAlign":
                    gVar = B(gVar).D(D(attributeValue));
                    break;
            }
        }
        return gVar;
    }

    private static String[] N(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : p0.P0(strTrim, "\\s+");
    }

    private static long O(String str, b bVar) throws SubtitleDecoderException {
        double d11;
        double d12;
        Matcher matcher = f95378p.matcher(str);
        if (matcher.matches()) {
            double d13 = (Long.parseLong((String) ts.a.e(matcher.group(1))) * 3600) + (Long.parseLong((String) ts.a.e(matcher.group(2))) * 60) + Long.parseLong((String) ts.a.e(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d14 = d13 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d15 = d14 + (strGroup2 != null ? Long.parseLong(strGroup2) / bVar.f95390a : 0.0d);
            String strGroup3 = matcher.group(6);
            return (long) ((d15 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) bVar.f95391b)) / ((double) bVar.f95390a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f95379q.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException("Malformed time expression: " + str);
        }
        double d16 = Double.parseDouble((String) ts.a.e(matcher2.group(1)));
        String str2 = (String) ts.a.e(matcher2.group(2));
        str2.getClass();
        switch (str2) {
            case "f":
                d11 = bVar.f95390a;
                d16 /= d11;
                return (long) (d16 * 1000000.0d);
            case "h":
                d12 = 3600.0d;
                break;
            case "m":
                d12 = 60.0d;
                break;
            case "t":
                d11 = bVar.f95392c;
                d16 /= d11;
                return (long) (d16 * 1000000.0d);
            case "ms":
                d11 = 1000.0d;
                d16 /= d11;
                return (long) (d16 * 1000000.0d);
            default:
                return (long) (d16 * 1000000.0d);
        }
        d16 *= d12;
        return (long) (d16 * 1000000.0d);
    }

    private static C2034c P(XmlPullParser xmlPullParser) {
        String strA = r0.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f95383u.matcher(strA);
        if (!matcher.matches()) {
            u.i("TtmlDecoder", "Ignoring non-pixel tts extent: " + strA);
            return null;
        }
        try {
            return new C2034c(Integer.parseInt((String) ts.a.e(matcher.group(1))), Integer.parseInt((String) ts.a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            u.i("TtmlDecoder", "Ignoring malformed tts extent: " + strA);
            return null;
        }
    }

    @Override // gs.h
    protected i A(byte[] bArr, int i11, boolean z11) throws SubtitleDecoderException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f95387o.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e(""));
            int i12 = 0;
            C2034c c2034cP = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVarG = f95385w;
            a aVarE = f95386x;
            h hVar = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i12 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVarG = G(xmlPullParserNewPullParser);
                            aVarE = E(xmlPullParserNewPullParser, f95386x);
                            c2034cP = P(xmlPullParserNewPullParser);
                        }
                        b bVar = bVarG;
                        C2034c c2034c = c2034cP;
                        a aVar = aVarE;
                        if (C(name)) {
                            if ("head".equals(name)) {
                                H(xmlPullParserNewPullParser, map, aVar, c2034c, map2, map3);
                            } else {
                                try {
                                    d dVarJ = J(xmlPullParserNewPullParser, dVar, map2, bVar);
                                    arrayDeque.push(dVarJ);
                                    if (dVar != null) {
                                        dVar.a(dVarJ);
                                    }
                                } catch (SubtitleDecoderException e11) {
                                    u.j("TtmlDecoder", "Suppressing parser error", e11);
                                    i12++;
                                }
                            }
                            aVarE = aVar;
                            c2034cP = c2034c;
                            bVarG = bVar;
                        } else {
                            u.f("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i12++;
                        aVarE = aVar;
                        c2034cP = c2034c;
                        bVarG = bVar;
                    } else if (eventType == 4) {
                        ((d) ts.a.e(dVar)).a(d.d(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            hVar = new h((d) ts.a.e((d) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e12) {
            throw new IllegalStateException("Unexpected error when reading input.", e12);
        } catch (XmlPullParserException e13) {
            throw new SubtitleDecoderException("Unable to decode source", e13);
        }
    }
}
