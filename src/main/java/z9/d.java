package z9;

import android.text.Layout;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.spongycastle.math.ec.Tnaf;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import s7.l;
import s7.n;
import s7.q0;
import s7.r0;
import s7.t;
import t9.j;
import t9.q;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f127919b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f127920c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f127921d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Pattern f127922e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Pattern f127923f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f127924g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f127925h = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f127926i = new a(30.0f, 1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f127927a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f127928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f127929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f127930c;

        a(float f11, int i11, int i12) {
            this.f127928a = f11;
            this.f127929b = i11;
            this.f127930c = i12;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f127931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f127932b;

        b(int i11, int i12) {
            this.f127931a = i11;
            this.f127932b = i12;
        }
    }

    public d() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f127927a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e11) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e11);
        }
    }

    private static g d(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static boolean e(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals(OrcaKeys.METADATA) || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static Layout.Alignment f(String str) {
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

    private static int g(XmlPullParser xmlPullParser, int i11) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i11;
        }
        Matcher matcher = f127925h.matcher(attributeValue);
        if (!matcher.matches()) {
            t.i("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i11;
        }
        boolean z11 = true;
        try {
            int i12 = Integer.parseInt((String) s7.a.f(matcher.group(1)));
            int i13 = Integer.parseInt((String) s7.a.f(matcher.group(2)));
            if (i12 == 0 || i13 == 0) {
                z11 = false;
            }
            s7.a.b(z11, "Invalid cell resolution " + i12 + " " + i13);
            return i13;
        } catch (NumberFormatException unused) {
            t.i("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i11;
        }
    }

    private static void h(String str, g gVar) throws SubtitleDecoderException {
        Matcher matcher;
        String[] strArrE1 = q0.E1(str, "\\s+");
        if (strArrE1.length == 1) {
            matcher = f127921d.matcher(str);
        } else {
            if (strArrE1.length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + strArrE1.length + ".");
            }
            matcher = f127921d.matcher(strArrE1[1]);
            t.i("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        String str2 = (String) s7.a.f(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                gVar.C(3);
                break;
            case "em":
                gVar.C(2);
                break;
            case "px":
                gVar.C(1);
                break;
            default:
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.B(Float.parseFloat((String) s7.a.f(matcher.group(1))));
    }

    private static a i(XmlPullParser xmlPullParser) {
        float f11;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i11 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrE1 = q0.E1(attributeValue2, " ");
            s7.a.b(strArrE1.length == 2, "frameRateMultiplier doesn't have 2 parts");
            f11 = Integer.parseInt(strArrE1[0]) / Integer.parseInt(strArrE1[1]);
        } else {
            f11 = 1.0f;
        }
        a aVar = f127926i;
        int i12 = aVar.f127929b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        int i13 = aVar.f127930c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i13 = Integer.parseInt(attributeValue4);
        }
        return new a(i11 * f11, i12, i13);
    }

    private static Map<String, g> j(XmlPullParser xmlPullParser, Map<String, g> map, int i11, b bVar, Map<String, e> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (r0.f(xmlPullParser, "style")) {
                String strA = r0.a(xmlPullParser, "style");
                g gVarO = o(xmlPullParser, new g());
                if (strA != null) {
                    for (String str : p(strA)) {
                        gVarO.a(map.get(str));
                    }
                }
                String strH = gVarO.h();
                if (strH != null) {
                    map.put(strH, gVarO);
                }
            } else if (r0.f(xmlPullParser, "region")) {
                e eVarM = m(xmlPullParser, i11, bVar, map);
                if (eVarM != null) {
                    map2.put(eVarM.f127933a, eVarM);
                }
            } else if (r0.f(xmlPullParser, OrcaKeys.METADATA)) {
                k(xmlPullParser, map3);
            }
        } while (!r0.d(xmlPullParser, "head"));
        return map;
    }

    private static void k(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (r0.f(xmlPullParser, "image") && (strA = r0.a(xmlPullParser, "id")) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!r0.d(xmlPullParser, OrcaKeys.METADATA));
    }

    private static c l(XmlPullParser xmlPullParser, c cVar, Map<String, e> map, a aVar) throws SubtitleDecoderException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser2.getAttributeCount();
        String strSubstring = null;
        g gVarO = o(xmlPullParser2, null);
        long jQ = -9223372036854775807L;
        long jQ2 = -9223372036854775807L;
        long jQ3 = -9223372036854775807L;
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
                    jQ3 = q(attributeValue, aVar);
                    break;
                case "end":
                    jQ2 = q(attributeValue, aVar);
                    break;
                case "begin":
                    jQ = q(attributeValue, aVar);
                    break;
                case "style":
                    String[] strArrP = p(attributeValue);
                    if (strArrP.length > 0) {
                        strArr = strArrP;
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
        if (cVar != null) {
            long j11 = cVar.f127909d;
            if (j11 != -9223372036854775807L) {
                if (jQ != -9223372036854775807L) {
                    jQ += j11;
                }
                if (jQ2 != -9223372036854775807L) {
                    jQ2 += j11;
                }
            }
        }
        long j12 = jQ;
        if (jQ2 == -9223372036854775807L) {
            if (jQ3 != -9223372036854775807L) {
                jQ2 = j12 + jQ3;
            } else if (cVar != null) {
                long j13 = cVar.f127910e;
                if (j13 != -9223372036854775807L) {
                    jQ2 = j13;
                }
            }
        }
        return c.c(xmlPullParser.getName(), j12, jQ2, gVarO, strArr, str, strSubstring, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x023d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static e m(XmlPullParser xmlPullParser, int i11, b bVar, Map<String, g> map) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i12;
        float f17;
        float f18;
        String strA;
        g gVar;
        String strA2;
        g gVar2;
        String strA3 = r0.a(xmlPullParser, "id");
        if (strA3 == null) {
            return null;
        }
        String strA4 = r0.a(xmlPullParser, "origin");
        if (strA4 == null && (strA2 = r0.a(xmlPullParser, "style")) != null && (gVar2 = map.get(strA2)) != null) {
            strA4 = gVar2.j();
        }
        int i13 = 2;
        if (strA4 != null) {
            Matcher matcher = f127923f.matcher(strA4);
            Matcher matcher2 = f127924g.matcher(strA4);
            if (matcher.matches()) {
                try {
                    f12 = Float.parseFloat((String) s7.a.f(matcher.group(1))) / 100.0f;
                    f11 = Float.parseFloat((String) s7.a.f(matcher.group(2))) / 100.0f;
                } catch (NumberFormatException unused) {
                    t.i("TtmlParser", "Ignoring region with malformed origin: " + strA4);
                    return null;
                }
            } else {
                if (!matcher2.matches()) {
                    t.i("TtmlParser", "Ignoring region with unsupported origin: " + strA4);
                    return null;
                }
                if (bVar == null) {
                    t.i("TtmlParser", "Ignoring region with missing tts:extent: " + strA4);
                    return null;
                }
                try {
                    int i14 = Integer.parseInt((String) s7.a.f(matcher2.group(1)));
                    int i15 = Integer.parseInt((String) s7.a.f(matcher2.group(2)));
                    float f19 = i14 / bVar.f127931a;
                    float f21 = i15 / bVar.f127932b;
                    f12 = f19;
                    f11 = f21;
                } catch (NumberFormatException unused2) {
                    t.i("TtmlParser", "Ignoring region with malformed origin: " + strA4);
                    return null;
                }
            }
        } else {
            f11 = BitmapDescriptorFactory.HUE_RED;
            f12 = 0.0f;
        }
        String strA5 = r0.a(xmlPullParser, "extent");
        if (strA5 == null && (strA = r0.a(xmlPullParser, "style")) != null && (gVar = map.get(strA)) != null) {
            strA5 = gVar.c();
        }
        if (strA5 != null) {
            Matcher matcher3 = f127923f.matcher(strA5);
            Matcher matcher4 = f127924g.matcher(strA5);
            f13 = 1.0f;
            if (matcher3.matches()) {
                try {
                    f14 = Float.parseFloat((String) s7.a.f(matcher3.group(1))) / 100.0f;
                    f18 = Float.parseFloat((String) s7.a.f(matcher3.group(2))) / 100.0f;
                } catch (NumberFormatException unused3) {
                    t.i("TtmlParser", "Ignoring region with malformed extent: " + strA4);
                    return null;
                }
            } else {
                if (!matcher4.matches()) {
                    t.i("TtmlParser", "Ignoring region with unsupported extent: " + strA4);
                    return null;
                }
                if (bVar == null) {
                    t.i("TtmlParser", "Ignoring region with missing tts:extent: " + strA4);
                    return null;
                }
                try {
                    int i16 = Integer.parseInt((String) s7.a.f(matcher4.group(1)));
                    int i17 = Integer.parseInt((String) s7.a.f(matcher4.group(2)));
                    float f22 = i16 / bVar.f127931a;
                    f18 = i17 / bVar.f127932b;
                    f14 = f22;
                } catch (NumberFormatException unused4) {
                    t.i("TtmlParser", "Ignoring region with malformed extent: " + strA4);
                    return null;
                }
            }
            f15 = f18;
        } else {
            f13 = 1.0f;
            f14 = 1.0f;
            f15 = 1.0f;
        }
        String strA6 = r0.a(xmlPullParser, "displayAlign");
        int i18 = 0;
        if (strA6 != null) {
            String strE = ou.c.e(strA6);
            strE.getClass();
            if (strE.equals("center")) {
                f17 = f11 + (f15 / 2.0f);
                i13 = 1;
            } else if (strE.equals("after")) {
                f17 = f11 + f15;
            } else {
                i11 = i11;
                i13 = 2;
                f16 = f11;
                i13 = 0;
            }
            f16 = f17;
        } else {
            i11 = i11;
            i13 = 2;
            f16 = f11;
            i13 = 0;
        }
        float f23 = f13 / i11;
        String strA7 = r0.a(xmlPullParser, "writingMode");
        if (strA7 != null) {
            String strE2 = ou.c.e(strA7);
            strE2.getClass();
            switch (strE2.hashCode()) {
                case 3694:
                    if (!strE2.equals("tb")) {
                        i18 = -1;
                    }
                    break;
                case 3553396:
                    i18 = !strE2.equals("tblr") ? -1 : 1;
                    break;
                case 3553576:
                    i18 = !strE2.equals("tbrl") ? -1 : i13;
                    break;
                default:
                    i18 = -1;
                    break;
            }
            switch (i18) {
                case 0:
                case 1:
                    i12 = i13;
                    break;
                case 2:
                    i12 = 1;
                    break;
                default:
                    i12 = Integer.MIN_VALUE;
                    break;
            }
        } else {
            i12 = Integer.MIN_VALUE;
        }
        return new e(strA3, f12, f16, 0, i13, f14, f15, 1, f23, i12);
    }

    private static float n(String str) {
        Matcher matcher = f127922e.matcher(str);
        if (!matcher.matches()) {
            t.i("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) s7.a.f(matcher.group(1)))));
        } catch (NumberFormatException e11) {
            t.j("TtmlParser", "Failed to parse shear: " + str, e11);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static g o(XmlPullParser xmlPullParser, g gVar) {
        byte b11;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i11 = 0; i11 < attributeCount; i11++) {
            String attributeValue = xmlPullParser.getAttributeValue(i11);
            String attributeName = xmlPullParser.getAttributeName(i11);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    b11 = attributeName.equals("fontStyle") ? (byte) 0 : (byte) -1;
                    break;
                case -1289044182:
                    b11 = attributeName.equals("extent") ? (byte) 1 : (byte) -1;
                    break;
                case -1224696685:
                    b11 = attributeName.equals("fontFamily") ? (byte) 2 : (byte) -1;
                    break;
                case -1065511464:
                    b11 = attributeName.equals("textAlign") ? (byte) 3 : (byte) -1;
                    break;
                case -1008619738:
                    b11 = attributeName.equals("origin") ? (byte) 4 : (byte) -1;
                    break;
                case -879295043:
                    b11 = attributeName.equals("textDecoration") ? (byte) 5 : (byte) -1;
                    break;
                case -734428249:
                    b11 = attributeName.equals("fontWeight") ? (byte) 6 : (byte) -1;
                    break;
                case 3355:
                    b11 = attributeName.equals("id") ? (byte) 7 : (byte) -1;
                    break;
                case 3511770:
                    b11 = attributeName.equals("ruby") ? (byte) 8 : (byte) -1;
                    break;
                case 94842723:
                    b11 = attributeName.equals("color") ? (byte) 9 : (byte) -1;
                    break;
                case 109403361:
                    b11 = attributeName.equals("shear") ? (byte) 10 : (byte) -1;
                    break;
                case 110138194:
                    b11 = attributeName.equals("textCombine") ? (byte) 11 : (byte) -1;
                    break;
                case 365601008:
                    b11 = attributeName.equals(OrcaFlavourKeys.FONT_SIZE) ? (byte) 12 : (byte) -1;
                    break;
                case 921125321:
                    b11 = attributeName.equals("textEmphasis") ? (byte) 13 : (byte) -1;
                    break;
                case 1115953443:
                    b11 = attributeName.equals("rubyPosition") ? (byte) 14 : (byte) -1;
                    break;
                case 1287124693:
                    b11 = attributeName.equals("backgroundColor") ? (byte) 15 : (byte) -1;
                    break;
                case 1754920356:
                    b11 = attributeName.equals("multiRowAlign") ? Tnaf.POW_2_WIDTH : (byte) -1;
                    break;
                default:
                    b11 = -1;
                    break;
            }
            switch (b11) {
                case 0:
                    gVar = d(gVar).E("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    gVar = d(gVar).y(attributeValue);
                    break;
                case 2:
                    gVar = d(gVar).A(attributeValue);
                    break;
                case 3:
                    gVar = d(gVar).L(f(attributeValue));
                    break;
                case 4:
                    gVar = d(gVar).H(attributeValue);
                    break;
                case 5:
                    String strE = ou.c.e(attributeValue);
                    strE.getClass();
                    switch (strE) {
                        case "nounderline":
                            gVar = d(gVar).O(false);
                            break;
                        case "underline":
                            gVar = d(gVar).O(true);
                            break;
                        case "nolinethrough":
                            gVar = d(gVar).F(false);
                            break;
                        case "linethrough":
                            gVar = d(gVar).F(true);
                            break;
                    }
                    break;
                case 6:
                    gVar = d(gVar).x("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        gVar = d(gVar).D(attributeValue);
                    }
                    break;
                case 8:
                    String strE2 = ou.c.e(attributeValue);
                    strE2.getClass();
                    switch (strE2) {
                        case "baseContainer":
                        case "base":
                            gVar = d(gVar).J(2);
                            break;
                        case "container":
                            gVar = d(gVar).J(1);
                            break;
                        case "delimiter":
                            gVar = d(gVar).J(4);
                            break;
                        case "textContainer":
                        case "text":
                            gVar = d(gVar).J(3);
                            break;
                    }
                    break;
                case 9:
                    gVar = d(gVar);
                    try {
                        gVar.z(l.c(attributeValue));
                    } catch (IllegalArgumentException unused) {
                        t.i("TtmlParser", "Failed parsing color value: " + attributeValue);
                    }
                    break;
                case 10:
                    gVar = d(gVar).K(n(attributeValue));
                    break;
                case 11:
                    String strE3 = ou.c.e(attributeValue);
                    strE3.getClass();
                    if (strE3.equals("all")) {
                        gVar = d(gVar).M(true);
                    } else if (strE3.equals("none")) {
                        gVar = d(gVar).M(false);
                    }
                    break;
                case 12:
                    try {
                        gVar = d(gVar);
                        h(attributeValue, gVar);
                    } catch (SubtitleDecoderException unused2) {
                        t.i("TtmlParser", "Failed parsing fontSize value: " + attributeValue);
                    }
                    break;
                case 13:
                    gVar = d(gVar).N(z9.b.a(attributeValue));
                    break;
                case 14:
                    String strE4 = ou.c.e(attributeValue);
                    strE4.getClass();
                    if (strE4.equals("before")) {
                        gVar = d(gVar).I(1);
                    } else if (strE4.equals("after")) {
                        gVar = d(gVar).I(2);
                    }
                    break;
                case 15:
                    gVar = d(gVar);
                    try {
                        gVar.w(l.c(attributeValue));
                    } catch (IllegalArgumentException unused3) {
                        t.i("TtmlParser", "Failed parsing background value: " + attributeValue);
                    }
                    break;
                case 16:
                    gVar = d(gVar).G(f(attributeValue));
                    break;
            }
        }
        return gVar;
    }

    private static String[] p(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : q0.E1(strTrim, "\\s+");
    }

    private static long q(String str, a aVar) throws SubtitleDecoderException {
        double d11;
        double d12;
        Matcher matcher = f127919b.matcher(str);
        if (matcher.matches()) {
            double d13 = (Long.parseLong((String) s7.a.f(matcher.group(1))) * 3600) + (Long.parseLong((String) s7.a.f(matcher.group(2))) * 60) + Long.parseLong((String) s7.a.f(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d14 = d13 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d15 = d14 + (strGroup2 != null ? Long.parseLong(strGroup2) / aVar.f127928a : 0.0d);
            String strGroup3 = matcher.group(6);
            return (long) ((d15 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) aVar.f127929b)) / ((double) aVar.f127928a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f127920c.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException("Malformed time expression: " + str);
        }
        double d16 = Double.parseDouble((String) s7.a.f(matcher2.group(1)));
        String str2 = (String) s7.a.f(matcher2.group(2));
        str2.getClass();
        switch (str2) {
            case "f":
                d11 = aVar.f127928a;
                d16 /= d11;
                return (long) (d16 * 1000000.0d);
            case "h":
                d12 = 3600.0d;
                break;
            case "m":
                d12 = 60.0d;
                break;
            case "t":
                d11 = aVar.f127930c;
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

    private static b r(XmlPullParser xmlPullParser) {
        String strA = r0.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f127924g.matcher(strA);
        if (!matcher.matches()) {
            t.i("TtmlParser", "Ignoring non-pixel tts extent: " + strA);
            return null;
        }
        try {
            return new b(Integer.parseInt((String) s7.a.f(matcher.group(1))), Integer.parseInt((String) s7.a.f(matcher.group(2))));
        } catch (NumberFormatException unused) {
            t.i("TtmlParser", "Ignoring malformed tts extent: " + strA);
            return null;
        }
    }

    @Override // t9.q
    public void a(byte[] bArr, int i11, int i12, q.b bVar, n<t9.d> nVar) {
        t9.h.c(c(bArr, i11, i12), bVar, nVar);
    }

    @Override // t9.q
    public int b() {
        return 1;
    }

    @Override // t9.q
    public j c(byte[] bArr, int i11, int i12) {
        char c11;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f127927a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e(""));
            h hVar = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i11, i12), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i13 = 0;
            int iG = 15;
            a aVarI = f127926i;
            b bVarR = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i13 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVarI = i(xmlPullParserNewPullParser);
                            c11 = 15;
                            iG = g(xmlPullParserNewPullParser, 15);
                            bVarR = r(xmlPullParserNewPullParser);
                        } else {
                            c11 = 15;
                        }
                        a aVar = aVarI;
                        b bVar = bVarR;
                        int i14 = iG;
                        if (e(name)) {
                            if ("head".equals(name)) {
                                j(xmlPullParserNewPullParser, map, i14, bVar, map2, map3);
                            } else {
                                try {
                                    c cVarL = l(xmlPullParserNewPullParser, cVar, map2, aVar);
                                    arrayDeque.push(cVarL);
                                    if (cVar != null) {
                                        cVar.a(cVarL);
                                    }
                                } catch (SubtitleDecoderException e11) {
                                    t.j("TtmlParser", "Suppressing parser error", e11);
                                    i13++;
                                }
                            }
                            iG = i14;
                            bVarR = bVar;
                            aVarI = aVar;
                        } else {
                            t.g("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i13++;
                        iG = i14;
                        bVarR = bVar;
                        aVarI = aVar;
                    } else {
                        c11 = 15;
                        if (eventType == 4) {
                            ((c) s7.a.f(cVar)).a(c.d(xmlPullParserNewPullParser.getText()));
                        } else if (eventType == 3) {
                            if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                hVar = new h((c) s7.a.f((c) arrayDeque.peek()), map, map2, map3);
                            }
                            arrayDeque.pop();
                        }
                    }
                } else if (eventType == 2) {
                    i13++;
                } else if (eventType == 3) {
                    i13--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (j) s7.a.f(hVar);
        } catch (IOException e12) {
            throw new IllegalStateException("Unexpected error when reading input.", e12);
        } catch (XmlPullParserException e13) {
            throw new IllegalStateException("Unable to decode source", e13);
        }
    }
}
