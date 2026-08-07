package d8;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.media3.common.ParserException;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.common.collect.f0;
import com.google.common.collect.x;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import org.webrtc.MediaStreamTrack;
import org.webrtc.WebrtcBuildVersion;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p7.g0;
import p7.u;
import q9.p;
import s7.k0;
import s7.q0;
import s7.r0;
import s7.t;

/* JADX INFO: loaded from: classes.dex */
public class d extends DefaultHandler implements androidx.media3.exoplayer.upstream.c.a<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f59791b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f59792c = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f59793d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f59794e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f59795f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f59796a;

    protected static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f59797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x<b> f59798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k f59799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f59800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList<p7.n.b> f59801e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList<e> f59802f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f59803g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<e> f59804h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final List<e> f59805i;

        public a(u uVar, List<b> list, k kVar, String str, ArrayList<p7.n.b> arrayList, ArrayList<e> arrayList2, List<e> list2, List<e> list3, long j11) {
            this.f59797a = uVar;
            this.f59798b = x.n(list);
            this.f59799c = kVar;
            this.f59800d = str;
            this.f59801e = arrayList;
            this.f59802f = arrayList2;
            this.f59804h = list2;
            this.f59805i = list3;
            this.f59803g = j11;
        }
    }

    public d() {
        try {
            this.f59796a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e11) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e11);
        }
    }

    protected static int D(List<e> list) {
        String str;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f59806a) && (str = eVar.f59807b) != null) {
                Matcher matcher = f59792c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                t.i("MpdParser", "Unable to parse CEA-608 channel number from: " + eVar.f59807b);
            }
        }
        return -1;
    }

    protected static int E(List<e> list) {
        String str;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f59806a) && (str = eVar.f59807b) != null) {
                Matcher matcher = f59793d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                t.i("MpdParser", "Unable to parse CEA-708 service block number from: " + eVar.f59807b);
            }
        }
        return -1;
    }

    protected static long H(XmlPullParser xmlPullParser, String str, long j11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j11 : q0.j1(attributeValue);
    }

    protected static e I(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strU0 = u0(xmlPullParser, "schemeIdUri", "");
        String strU1 = u0(xmlPullParser, "value", null);
        String strU2 = u0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!r0.d(xmlPullParser, str));
        return new e(strU0, strU1, strU2);
    }

    protected static int J(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || attributeValue.length() != 6) {
            return -1;
        }
        int i11 = Integer.parseInt(attributeValue, 16);
        return (8388608 & i11) != 0 ? L(str) : K(i11);
    }

    private static int K(int i11) {
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = f59794e;
            if (i12 >= iArr.length) {
                break;
            }
            i13 += ((i11 >> i12) & 1) * iArr[i12];
            i12++;
        }
        if (i13 == 0) {
            return -1;
        }
        return i13;
    }

    private static int L(String str) {
        String[] strArrG1 = q0.G1(str);
        if (strArrG1.length == 0) {
            return -1;
        }
        List<String> listG = ou.u.e(CoreConstants.DOT).g(ou.c.e(strArrG1[0].trim()));
        if (listG.size() != 4 || !listG.get(0).equals("ac-4")) {
            return -1;
        }
        String str2 = listG.get(3);
        str2.getClass();
        if (str2.equals("03")) {
            return 18;
        }
        return !str2.equals(WebrtcBuildVersion.webrtc_commit) ? -1 : 21;
    }

    protected static int M(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String strE = ou.c.e(attributeValue);
        strE.getClass();
        switch (strE) {
            case "4000":
                return 1;
            case "a000":
                return 2;
            case "f800":
                return 5;
            case "f801":
                return 6;
            case "fa01":
                return 8;
            default:
                return -1;
        }
    }

    protected static int N(XmlPullParser xmlPullParser) {
        int iX = X(xmlPullParser, "value", -1);
        if (iX <= 0 || iX >= 33) {
            return -1;
        }
        return iX;
    }

    protected static int O(XmlPullParser xmlPullParser) {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return iBitCount;
    }

    protected static long P(XmlPullParser xmlPullParser, String str, long j11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j11 : q0.k1(attributeValue);
    }

    protected static String Q(List<e> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            String str = eVar.f59806a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(eVar.f59807b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(eVar.f59807b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    protected static float U(XmlPullParser xmlPullParser, String str, float f11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f11 : Float.parseFloat(attributeValue);
    }

    protected static float V(XmlPullParser xmlPullParser, float f11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f59791b.matcher(attributeValue);
            if (matcher.matches()) {
                int i11 = Integer.parseInt(matcher.group(1));
                String strGroup = matcher.group(2);
                return !TextUtils.isEmpty(strGroup) ? i11 / Integer.parseInt(strGroup) : i11;
            }
        }
        return f11;
    }

    protected static int X(XmlPullParser xmlPullParser, String str, int i11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i11 : Integer.parseInt(attributeValue);
    }

    protected static long Z(List<e> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if (ou.c.a("http://dashif.org/guidelines/last-segment-number", eVar.f59806a)) {
                return Long.parseLong(eVar.f59807b);
            }
        }
        return -1L;
    }

    protected static long a0(XmlPullParser xmlPullParser, String str, long j11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j11 : Long.parseLong(attributeValue);
    }

    private long b(List<k.d> list, long j11, long j12, int i11, long j13) {
        int iO = i11 >= 0 ? i11 + 1 : (int) q0.o(j13 - j11, j12);
        for (int i12 = 0; i12 < iO; i12++) {
            list.add(m(j11, j12));
            j11 += j12;
        }
        return j11;
    }

    protected static int c0(XmlPullParser xmlPullParser) {
        int iX = X(xmlPullParser, "value", -1);
        if (iX >= 0) {
            int[] iArr = f59795f;
            if (iX < iArr.length) {
                return iArr[iX];
            }
        }
        return -1;
    }

    private static int p(int i11, int i12) {
        if (i11 == -1) {
            return i12;
        }
        if (i12 == -1) {
            return i11;
        }
        s7.a.h(i11 == i12);
        return i11;
    }

    private static String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        s7.a.h(str.equals(str2));
        return str;
    }

    private static void r(ArrayList<p7.n.b> arrayList) {
        String str;
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                str = null;
                break;
            }
            p7.n.b bVar = arrayList.get(i11);
            if (p7.h.f101350c.equals(bVar.f101435b) && (str = bVar.f101436c) != null) {
                arrayList.remove(i11);
                break;
            }
            i11++;
        }
        if (str == null) {
            return;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            p7.n.b bVar2 = arrayList.get(i12);
            if (p7.h.f101349b.equals(bVar2.f101435b) && bVar2.f101436c == null) {
                arrayList.set(i12, new p7.n.b(p7.h.f101350c, str, bVar2.f101437d, bVar2.f101438e));
            }
        }
    }

    private static void s(ArrayList<p7.n.b> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p7.n.b bVar = arrayList.get(size);
            if (!bVar.c()) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (arrayList.get(i11).a(bVar)) {
                        arrayList.remove(size);
                        break;
                    }
                }
            }
        }
    }

    private static long t(long j11, long j12) {
        if (j12 != -9223372036854775807L) {
            j11 = j12;
        }
        if (j11 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j11;
    }

    private static String u(String str, String str2) {
        if (g0.o(str)) {
            return g0.c(str2);
        }
        if (g0.t(str)) {
            return g0.n(str2);
        }
        if (g0.s(str) || g0.q(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String strG = g0.g(str2);
        return "text/vtt".equals(strG) ? "application/x-mp4-vtt" : strG;
    }

    protected static String u0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    private boolean v(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    protected static String v0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                w(xmlPullParser);
            }
        } while (!r0.d(xmlPullParser, str));
        return text;
    }

    public static void w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (r0.e(xmlPullParser)) {
            int i11 = 1;
            while (i11 != 0) {
                xmlPullParser.next();
                if (r0.e(xmlPullParser)) {
                    i11++;
                } else if (r0.c(xmlPullParser)) {
                    i11--;
                }
            }
        }
    }

    protected int A(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strU0 = u0(xmlPullParser, "schemeIdUri", null);
        strU0.getClass();
        int iN = -1;
        switch (strU0) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                iN = N(xmlPullParser);
                break;
            case "tag:dolby.com,2015:dash:audio_channel_configuration:2015":
                iN = J(xmlPullParser, str);
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                iN = X(xmlPullParser, "value", -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                iN = M(xmlPullParser);
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                iN = c0(xmlPullParser);
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                iN = O(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!r0.d(xmlPullParser, "AudioChannelConfiguration"));
        return iN;
    }

    protected long B(XmlPullParser xmlPullParser, long j11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j11;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    protected List<b> C(XmlPullParser xmlPullParser, List<b> list, boolean z11) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i11 = attributeValue != null ? Integer.parseInt(attributeValue) : z11 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i12 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String strV0 = v0(xmlPullParser, "BaseURL");
        if (k0.c(strV0)) {
            if (attributeValue3 == null) {
                attributeValue3 = strV0;
            }
            return f0.h(new b(strV0, attributeValue3, i11, i12));
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < list.size(); i13++) {
            b bVar = list.get(i13);
            String strF = k0.f(bVar.f59774a, strV0);
            String str = attributeValue3 == null ? strF : attributeValue3;
            if (z11) {
                i11 = bVar.f59776c;
                i12 = bVar.f59777d;
                str = bVar.f59775b;
            }
            arrayList.add(new b(strF, str, i11, i12));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0099  */
    /* JADX WARN: Code duplicated, block: B:69:0x0119  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9 */
    protected Pair<String, p7.n.b> F(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? text;
        ?? B;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue2 != null) {
            String strE = ou.c.e(attributeValue2);
            strE.getClass();
            switch (strE) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = p7.h.f101350c;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    B = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = p7.h.f101352e;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    B = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = p7.h.f101351d;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    B = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    String strB = r0.b(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(strB) && !"00000000-0000-0000-0000-000000000000".equals(strB)) {
                        String[] strArrSplit = strB.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                            uuidArr[i11] = UUID.fromString(strArrSplit[i11]);
                        }
                        uuid = p7.h.f101349b;
                        text = 0;
                        B = p.b(uuid, uuidArr, null);
                        break;
                    } else {
                        t.i("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        uuid = null;
                        uuid2 = uuid;
                        text = uuid2;
                        B = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    text = uuid2;
                    B = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            text = uuid2;
            B = uuid2;
        }
        do {
            xmlPullParser.next();
            if ((r0.f(xmlPullParser, "clearkey:Laurl") || r0.f(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                B = B;
                text = xmlPullParser.getText();
            } else if (r0.f(xmlPullParser, "ms:laurl")) {
                B = B;
                text = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (B == 0 && r0.g(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                UUID uuidF = p.f(bArrDecode);
                if (uuidF == null) {
                    t.i("MpdParser", "Skipping malformed cenc:pssh data");
                    uuid = uuidF;
                    B = 0;
                    text = text;
                } else {
                    B = bArrDecode;
                    uuid = uuidF;
                    text = text;
                }
            } else if (B == 0) {
                UUID uuid3 = p7.h.f101352e;
                if (uuid3.equals(uuid) && r0.f(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    B = p.a(uuid3, Base64.decode(xmlPullParser.getText(), 0));
                    text = text;
                } else {
                    w(xmlPullParser);
                    B = B;
                    text = text;
                }
            } else {
                w(xmlPullParser);
                B = B;
                text = text;
            }
        } while (!r0.d(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new p7.n.b(uuid, text, "video/mp4", B) : null);
    }

    protected int G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, CMSAttributeTableGenerator.CONTENT_TYPE);
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(attributeValue)) {
            return 1;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    protected Pair<Long, h9.a> R(XmlPullParser xmlPullParser, String str, String str2, long j11, long j12, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long jA0 = a0(xmlPullParser, "id", 0L);
        long jA1 = a0(xmlPullParser, "duration", -9223372036854775807L);
        long jA2 = a0(xmlPullParser, "presentationTime", 0L);
        long jS1 = q0.s1(jA1, 1000L, j11);
        long jS2 = q0.s1(jA2 - j12, 1000000L, j11);
        String strU0 = u0(xmlPullParser, "messageData", null);
        byte[] bArrS = S(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jS2);
        if (strU0 != null) {
            bArrS = q0.E0(strU0);
        }
        return Pair.create(lValueOf, d(str, str2, jA0, jS1, bArrS));
    }

    protected byte[] S(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
        xmlPullParser.nextToken();
        while (!r0.d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i11 = 0; i11 < xmlPullParser.getAttributeCount(); i11++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i11), xmlPullParser.getAttributeName(i11), xmlPullParser.getAttributeValue(i11));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    protected f T(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j11;
        String str;
        String str2;
        XmlPullParser xmlPullParser2;
        String strU0 = u0(xmlPullParser, "schemeIdUri", "");
        String strU1 = u0(xmlPullParser, "value", "");
        long jA0 = a0(xmlPullParser, "timescale", 1L);
        long jA1 = a0(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (r0.f(xmlPullParser, "Event")) {
                j11 = jA0;
                str = strU1;
                str2 = strU0;
                xmlPullParser2 = xmlPullParser;
                arrayList.add(R(xmlPullParser2, str2, str, j11, jA1, byteArrayOutputStream));
            } else {
                j11 = jA0;
                str = strU1;
                str2 = strU0;
                xmlPullParser2 = xmlPullParser;
                w(xmlPullParser2);
            }
            if (r0.d(xmlPullParser2, "EventStream")) {
                break;
            }
            xmlPullParser = xmlPullParser2;
            strU0 = str2;
            strU1 = str;
            jA0 = j11;
        }
        long[] jArr = new long[arrayList.size()];
        h9.a[] aVarArr = new h9.a[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Pair pair = (Pair) arrayList.get(i11);
            jArr[i11] = ((Long) pair.first).longValue();
            aVarArr[i11] = (h9.a) pair.second;
        }
        return e(str2, str, j11, jArr, aVarArr);
    }

    protected i W(XmlPullParser xmlPullParser) {
        return g0(xmlPullParser, "sourceURL", "range");
    }

    protected p7.x Y(XmlPullParser xmlPullParser) {
        return new p7.x(xmlPullParser.getAttributeValue(null, "lang"), v0(xmlPullParser, "Label"));
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e0 A[LOOP:0: B:24:0x00a5->B:81:0x01e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x019c A[SYNTHETIC] */
    protected c b0(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        long j11;
        ArrayList arrayList5;
        long j12;
        Throwable th2;
        long j13;
        d dVar = this;
        boolean zV = dVar.v(dVar.e0(xmlPullParser, "profiles", new String[0]));
        long jH = H(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long jP = P(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long jP2 = P(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean zEquals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long jP3 = zEquals ? P(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long jP4 = zEquals ? P(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long jP5 = zEquals ? P(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long jH2 = H(xmlPullParser, "publishTime", -9223372036854775807L);
        long j14 = zEquals ? 0L : -9223372036854775807L;
        ArrayList arrayListH = f0.h(new b(uri.toString(), uri.toString(), zV ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        long j15 = zEquals ? -9223372036854775807L : 0L;
        ArrayList arrayList8 = arrayListH;
        long jB = j14;
        boolean z11 = false;
        boolean z12 = false;
        h hVarF0 = null;
        o oVarZ0 = null;
        Uri uriG = null;
        l lVarT0 = null;
        while (true) {
            xmlPullParser.next();
            if (r0.f(xmlPullParser, "BaseURL")) {
                if (!z12) {
                    jB = dVar.B(xmlPullParser, jB);
                    z12 = true;
                }
                arrayList = arrayList8;
                arrayList2 = arrayList6;
                arrayList7.addAll(dVar.C(xmlPullParser, arrayList, zV));
            } else {
                arrayList = arrayList8;
                arrayList2 = arrayList6;
                if (r0.f(xmlPullParser, "ProgramInformation")) {
                    hVarF0 = f0(xmlPullParser);
                } else if (r0.f(xmlPullParser, "UTCTiming")) {
                    oVarZ0 = z0(xmlPullParser);
                } else if (r0.f(xmlPullParser, "Location")) {
                    uriG = k0.g(uri.toString(), xmlPullParser.nextText());
                } else {
                    if (r0.f(xmlPullParser, "ServiceDescription")) {
                        lVarT0 = t0(xmlPullParser);
                    } else if (!r0.f(xmlPullParser, "Period") || z11) {
                        arrayList3 = arrayList7;
                        arrayList8 = arrayList;
                        long j16 = j15;
                        long j17 = jB;
                        arrayList4 = arrayList2;
                        w(xmlPullParser);
                        j15 = j16;
                        j11 = j17;
                    } else {
                        if (arrayList7.isEmpty()) {
                            arrayList3 = arrayList7;
                            arrayList5 = arrayList;
                            arrayList4 = arrayList2;
                            arrayList8 = arrayList5;
                        } else {
                            arrayList5 = arrayList7;
                            arrayList3 = arrayList5;
                            arrayList8 = arrayList;
                            arrayList4 = arrayList2;
                        }
                        Pair<g, Long> pairD0 = d0(xmlPullParser, arrayList5, j15, jB, jH, jP4, zV);
                        g gVar = (g) pairD0.first;
                        if (gVar.f59815b != -9223372036854775807L) {
                            long jLongValue = ((Long) pairD0.second).longValue();
                            j12 = jLongValue == -9223372036854775807L ? -9223372036854775807L : gVar.f59815b + jLongValue;
                            arrayList4.add(gVar);
                        } else {
                            if (!zEquals) {
                                throw ParserException.c("Unable to determine start of period " + arrayList4.size(), null);
                            }
                            j12 = j15;
                            z11 = true;
                        }
                        j11 = jB;
                        j15 = j12;
                    }
                    if (r0.d(xmlPullParser, "MPD")) {
                        if (jP != -9223372036854775807L) {
                            th2 = null;
                            j13 = jP;
                        } else if (j15 != -9223372036854775807L) {
                            j13 = j15;
                            th2 = null;
                        } else {
                            if (!zEquals) {
                                throw ParserException.c("Unable to determine duration of static manifest.", null);
                            }
                            th2 = null;
                            j13 = jP;
                        }
                        if (arrayList4.isEmpty()) {
                            throw ParserException.c("No periods found.", th2);
                        }
                        return g(jH, j13, jP2, zEquals, jP3, jP4, jP5, jH2, hVarF0, oVarZ0, lVarT0, uriG, arrayList4);
                    }
                    long j18 = jP4;
                    long j19 = jP2;
                    ArrayList arrayList9 = arrayList4;
                    dVar = this;
                    zEquals = zEquals;
                    jP3 = jP3;
                    jB = j11;
                    arrayList6 = arrayList9;
                    arrayList7 = arrayList3;
                    jP2 = j19;
                    jP4 = j18;
                    jP = jP;
                }
            }
            arrayList3 = arrayList7;
            j11 = jB;
            arrayList4 = arrayList2;
            arrayList8 = arrayList;
            if (r0.d(xmlPullParser, "MPD")) {
                if (jP != -9223372036854775807L) {
                    th2 = null;
                    j13 = jP;
                } else if (j15 != -9223372036854775807L) {
                    j13 = j15;
                    th2 = null;
                } else {
                    if (!zEquals) {
                        throw ParserException.c("Unable to determine duration of static manifest.", null);
                    }
                    th2 = null;
                    j13 = jP;
                }
                if (arrayList4.isEmpty()) {
                    return g(jH, j13, jP2, zEquals, jP3, jP4, jP5, jH2, hVarF0, oVarZ0, lVarT0, uriG, arrayList4);
                }
                throw ParserException.c("No periods found.", th2);
            }
            long j110 = jP4;
            long j111 = jP2;
            ArrayList arrayList10 = arrayList4;
            dVar = this;
            zEquals = zEquals;
            jP3 = jP3;
            jB = j11;
            arrayList6 = arrayList10;
            arrayList7 = arrayList3;
            jP2 = j111;
            jP4 = j110;
            jP = jP;
        }
    }

    protected d8.a c(long j11, int i11, List<j> list, List<e> list2, List<e> list3, List<e> list4) {
        return new d8.a(j11, i11, list, list2, list3, list4);
    }

    protected h9.a d(String str, String str2, long j11, long j12, byte[] bArr) {
        return new h9.a(str, str2, j12, j11, bArr);
    }

    protected Pair<g, Long> d0(XmlPullParser xmlPullParser, List<b> list, long j11, long j12, long j13, long j14, boolean z11) throws XmlPullParserException, IOException {
        long jB;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j15;
        Object obj;
        long j16;
        k kVarO0;
        long j17;
        long j18;
        k kVar;
        ArrayList arrayList3;
        boolean z12;
        long j19;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        List list2;
        ArrayList arrayList7;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long jP = P(xmlPullParser2, "start", j11);
        long j21 = j13 != -9223372036854775807L ? j13 + jP : -9223372036854775807L;
        long jP2 = P(xmlPullParser2, "duration", -9223372036854775807L);
        ArrayList arrayList8 = new ArrayList();
        long j22 = -9223372036854775807L;
        ArrayList arrayList9 = new ArrayList();
        boolean z13 = false;
        e eVarI = null;
        long jB2 = j12;
        ArrayList arrayList10 = arrayList8;
        k kVar2 = null;
        long j23 = -9223372036854775807L;
        ArrayList arrayList11 = new ArrayList();
        while (true) {
            xmlPullParser2.next();
            if (r0.f(xmlPullParser2, "BaseURL")) {
                if (!z13) {
                    jB2 = B(xmlPullParser2, jB2);
                    z13 = true;
                }
                arrayList11.addAll(C(xmlPullParser2, list, z11));
                arrayList2 = arrayList10;
                j17 = jB2;
                arrayList = arrayList9;
                z12 = z13;
                j15 = j22;
                obj = null;
                jP2 = jP2;
                arrayList7 = arrayList11;
                eVarI = eVarI;
                xmlPullParser2 = xmlPullParser2;
                kVar = kVar2;
                j19 = j23;
                j21 = j21;
            } else {
                ArrayList arrayList12 = arrayList10;
                if (r0.f(xmlPullParser2, "AdaptationSet")) {
                    if (arrayList11.isEmpty()) {
                        arrayList6 = arrayList11;
                        list2 = list;
                    } else {
                        ArrayList arrayList13 = arrayList11;
                        arrayList6 = arrayList13;
                        list2 = arrayList13;
                    }
                    ArrayList arrayList14 = arrayList9;
                    long j24 = jB2;
                    long j25 = j21;
                    long j26 = jP2;
                    d8.a aVarY = y(xmlPullParser2, list2, kVar2, j26, j24, j23, j25, j14, z11);
                    j21 = j25;
                    jB = j23;
                    arrayList12.add(aVarY);
                    jP2 = j26;
                    arrayList = arrayList14;
                    obj = null;
                    j16 = j24;
                    arrayList2 = arrayList12;
                    j15 = -9223372036854775807L;
                    arrayList5 = arrayList6;
                } else {
                    ArrayList arrayList15 = arrayList11;
                    ArrayList arrayList16 = arrayList9;
                    long j27 = jB2;
                    jB = j23;
                    if (r0.f(xmlPullParser2, "EventStream")) {
                        arrayList16.add(T(xmlPullParser));
                        jP2 = jP2;
                        arrayList = arrayList16;
                        arrayList2 = arrayList12;
                        j15 = -9223372036854775807L;
                        obj = null;
                        j16 = j27;
                        arrayList5 = arrayList15;
                    } else {
                        if (r0.f(xmlPullParser2, "SegmentBase")) {
                            kVarO0 = m0(xmlPullParser2, null);
                            j17 = j27;
                            obj = null;
                            arrayList = arrayList16;
                            arrayList2 = arrayList12;
                            j15 = -9223372036854775807L;
                        } else if (r0.f(xmlPullParser2, "SegmentList")) {
                            long j28 = j21;
                            long j29 = jP2;
                            long jB3 = B(xmlPullParser2, -9223372036854775807L);
                            arrayList = arrayList16;
                            arrayList2 = arrayList12;
                            j15 = -9223372036854775807L;
                            k.b bVarN0 = n0(xmlPullParser2, null, j28, j29, j27, jB3, j14);
                            j17 = j27;
                            obj = null;
                            j21 = j28;
                            jP2 = j29;
                            eVarI = eVarI;
                            xmlPullParser2 = xmlPullParser2;
                            j18 = jB3;
                            kVar = bVarN0;
                            arrayList3 = arrayList15;
                        } else {
                            kVar2 = kVar2;
                            arrayList = arrayList16;
                            arrayList2 = arrayList12;
                            j15 = -9223372036854775807L;
                            if (r0.f(xmlPullParser2, "SegmentTemplate")) {
                                jB = B(xmlPullParser2, -9223372036854775807L);
                                obj = null;
                                kVarO0 = o0(xmlPullParser2, null, x.r(), j21, jP2, j27, jB, j14);
                                j17 = j27;
                            } else {
                                obj = null;
                                jP2 = jP2;
                                xmlPullParser2 = xmlPullParser2;
                                j16 = j27;
                                j21 = j21;
                                if (r0.f(xmlPullParser2, "AssetIdentifier")) {
                                    eVarI = I(xmlPullParser2, "AssetIdentifier");
                                    arrayList4 = arrayList15;
                                } else {
                                    w(xmlPullParser2);
                                    arrayList4 = arrayList15;
                                }
                                j17 = j16;
                                eVarI = eVarI;
                                j18 = jB;
                                kVar = kVar2;
                                arrayList3 = arrayList4;
                            }
                        }
                        j18 = jB;
                        kVar = kVarO0;
                        arrayList3 = arrayList15;
                    }
                    z12 = z13;
                    j19 = j18;
                    arrayList7 = arrayList3;
                }
                j21 = j21;
                arrayList4 = arrayList5;
                j17 = j16;
                eVarI = eVarI;
                j18 = jB;
                kVar = kVar2;
                arrayList3 = arrayList4;
                z12 = z13;
                j19 = j18;
                arrayList7 = arrayList3;
            }
            if (r0.d(xmlPullParser2, "Period")) {
                return Pair.create(h(attributeValue, jP, arrayList2, arrayList, eVarI), Long.valueOf(jP2));
            }
            xmlPullParser2 = xmlPullParser2;
            j21 = j21;
            kVar2 = kVar;
            j23 = j19;
            arrayList11 = arrayList7;
            arrayList10 = arrayList2;
            eVarI = eVarI;
            z13 = z12;
            jP2 = jP2;
            j22 = j15;
            jB2 = j17;
            arrayList9 = arrayList;
        }
    }

    protected f e(String str, String str2, long j11, long[] jArr, h9.a[] aVarArr) {
        return new f(str, str2, j11, jArr, aVarArr);
    }

    protected String[] e0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    protected u f(String str, String str2, int i11, int i12, float f11, int i13, int i14, int i15, String str3, List<e> list, List<e> list2, String str4, String str5, String str6, List<e> list3, List<e> list4) {
        String str7 = str5;
        String str8 = str4;
        String strU = u(str2, str8);
        if ("audio/eac3".equals(strU)) {
            strU = Q(list4);
            if ("audio/eac3-joc".equals(strU)) {
                str8 = "ec+3";
            }
        }
        if (g0.p(str8, str7)) {
            if (str7 == null) {
                str7 = str8;
            }
            strU = "video/dolby-vision";
            str8 = str7;
        }
        int iS0 = s0(list);
        int iL0 = l0(list) | i0(list2) | k0(list3) | k0(list4);
        Pair<Integer, Integer> pairW0 = w0(list3);
        u.b bVarN0 = new u.b().j0(str).W(str2).y0(strU).U(str8).t0(i15).A0(iS0).w0(iL0).n0(str3);
        int iE = -1;
        u.b bVarE0 = bVarN0.D0(pairW0 != null ? ((Integer) pairW0.first).intValue() : -1).E0(pairW0 != null ? ((Integer) pairW0.second).intValue() : -1);
        if (g0.t(strU)) {
            bVarE0.F0(i11).h0(i12).f0(f11);
        } else if (g0.o(strU)) {
            bVarE0.T(i13).z0(i14);
        } else if (g0.s(strU)) {
            if ("application/cea-608".equals(strU)) {
                iE = D(list2);
            } else if ("application/cea-708".equals(strU)) {
                iE = E(list2);
            }
            bVarE0.Q(iE);
        } else if (g0.q(strU)) {
            bVarE0.F0(i11).h0(i12);
        }
        return bVarE0.P();
    }

    protected h f0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String strU0 = u0(xmlPullParser, "moreInformationURL", null);
        String strU1 = u0(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (r0.f(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (r0.f(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (r0.f(xmlPullParser, "Copyright")) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                w(xmlPullParser);
            }
            String str = strNextText2;
            String str2 = strNextText;
            String str3 = strNextText3;
            if (r0.d(xmlPullParser, "ProgramInformation")) {
                return new h(str2, str, str3, strU0, strU1);
            }
            strNextText = str2;
            strNextText2 = str;
            strNextText3 = str3;
        }
    }

    protected c g(long j11, long j12, long j13, boolean z11, long j14, long j15, long j16, long j17, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        return new c(j11, j12, j13, z11, j14, j15, j16, j17, hVar, oVar, lVar, uri, list);
    }

    protected i g0(XmlPullParser xmlPullParser, String str, String str2) {
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j12 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j11 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j12 = (Long.parseLong(strArrSplit[1]) - j11) + 1;
            }
        } else {
            j11 = 0;
        }
        return i(attributeValue, j11, j12);
    }

    protected g h(String str, long j11, List<d8.a> list, List<f> list2, e eVar) {
        return new g(str, j11, list, list2, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x025f A[LOOP:0: B:3:0x007a->B:56:0x025f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0204 A[EDGE_INSN: B:57:0x0204->B:46:0x0204 BREAK  A[LOOP:0: B:3:0x007a->B:56:0x025f], SYNTHETIC] */
    protected a h0(XmlPullParser xmlPullParser, List<b> list, String str, String str2, String str3, String str4, int i11, int i12, float f11, int i13, int i14, String str5, List<e> list2, List<e> list3, List<e> list4, List<e> list5, k kVar, long j11, long j12, long j13, long j14, long j15, boolean z11) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        String str6;
        long j16;
        int iA;
        k kVarM0;
        ArrayList arrayList2;
        ArrayList arrayList3;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        int iX = X(xmlPullParser2, "bandwidth", -1);
        String strU0 = u0(xmlPullParser2, "mimeType", str);
        String strU1 = u0(xmlPullParser2, "codecs", str2);
        String strU2 = u0(xmlPullParser2, "scte214:supplementalCodecs", str3);
        String strU3 = u0(xmlPullParser2, "scte214:supplementalProfiles", str4);
        int iX2 = X(xmlPullParser2, Snapshot.WIDTH, i11);
        int iX3 = X(xmlPullParser2, Snapshot.HEIGHT, i12);
        float fV = V(xmlPullParser2, f11);
        int iX4 = X(xmlPullParser2, "audioSamplingRate", i14);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList(list4);
        ArrayList arrayList7 = new ArrayList(list5);
        int i15 = i13;
        long j17 = j14;
        String str7 = null;
        boolean z12 = false;
        k kVar2 = kVar;
        long jB = j13;
        ArrayList arrayList8 = new ArrayList();
        while (true) {
            xmlPullParser2.next();
            arrayList = arrayList4;
            if (r0.f(xmlPullParser2, "BaseURL")) {
                if (!z12) {
                    jB = B(xmlPullParser2, jB);
                    z12 = true;
                }
                str6 = attributeValue;
                arrayList8.addAll(C(xmlPullParser2, list, z11));
                iA = i15;
                z12 = z12;
                kVarM0 = kVar2;
            } else {
                k kVar3 = kVar2;
                str6 = attributeValue;
                if (r0.f(xmlPullParser2, "AudioChannelConfiguration")) {
                    kVarM0 = kVar3;
                    iA = A(xmlPullParser2, strU1);
                    z12 = z12;
                } else if (r0.f(xmlPullParser2, "SegmentBase")) {
                    arrayList = arrayList;
                    xmlPullParser2 = xmlPullParser2;
                    arrayList6 = arrayList6;
                    arrayList3 = arrayList8;
                    j17 = j17;
                    strU1 = strU1;
                    iX = iX;
                    iA = i15;
                    str7 = str7;
                    z12 = z12;
                    kVarM0 = m0(xmlPullParser2, (k.e) kVar3);
                    arrayList7 = arrayList7;
                    j16 = jB;
                    arrayList2 = arrayList3;
                } else if (r0.f(xmlPullParser2, "SegmentList")) {
                    long j18 = jB;
                    long jB2 = B(xmlPullParser2, j17);
                    arrayList = arrayList;
                    arrayList2 = arrayList8;
                    iX = iX;
                    arrayList5 = arrayList5;
                    k.b bVarN0 = n0(xmlPullParser2, (k.b) kVar3, j11, j12, j18, jB2, j15);
                    xmlPullParser2 = xmlPullParser2;
                    strU1 = strU1;
                    str7 = str7;
                    z12 = z12;
                    arrayList7 = arrayList7;
                    j16 = j18;
                    iA = i15;
                    kVarM0 = bVarN0;
                    arrayList6 = arrayList6;
                    j17 = jB2;
                } else {
                    arrayList = arrayList;
                    ArrayList arrayList9 = arrayList6;
                    ArrayList arrayList10 = arrayList7;
                    ArrayList arrayList11 = arrayList8;
                    j16 = jB;
                    iX = iX;
                    arrayList5 = arrayList5;
                    if (r0.f(xmlPullParser2, "SegmentTemplate")) {
                        long jB3 = B(xmlPullParser2, j17);
                        strU1 = strU1;
                        k.c cVarO0 = o0(xmlPullParser2, (k.c) kVar3, list5, j11, j12, j16, jB3, j15);
                        xmlPullParser2 = xmlPullParser2;
                        str7 = str7;
                        z12 = z12;
                        arrayList7 = arrayList10;
                        j16 = j16;
                        iA = i15;
                        kVarM0 = cVarO0;
                        arrayList6 = arrayList9;
                        j17 = jB3;
                        arrayList2 = arrayList11;
                    } else {
                        xmlPullParser2 = xmlPullParser2;
                        strU1 = strU1;
                        if (r0.f(xmlPullParser2, "ContentProtection")) {
                            Pair<String, p7.n.b> pairF = F(xmlPullParser);
                            Object obj = pairF.first;
                            if (obj != null) {
                                str7 = (String) obj;
                            }
                            Object obj2 = pairF.second;
                            if (obj2 != null) {
                                arrayList.add((p7.n.b) obj2);
                            }
                            str7 = str7;
                            arrayList6 = arrayList9;
                            arrayList7 = arrayList10;
                        } else {
                            if (r0.f(xmlPullParser2, "InbandEventStream")) {
                                arrayList5.add(I(xmlPullParser2, "InbandEventStream"));
                                arrayList6 = arrayList9;
                            } else {
                                if (r0.f(xmlPullParser2, "EssentialProperty")) {
                                    arrayList6 = arrayList9;
                                    arrayList6.add(I(xmlPullParser2, "EssentialProperty"));
                                } else {
                                    arrayList6 = arrayList9;
                                    if (r0.f(xmlPullParser2, "SupplementalProperty")) {
                                        arrayList7 = arrayList10;
                                        arrayList7.add(I(xmlPullParser2, "SupplementalProperty"));
                                    } else {
                                        arrayList7 = arrayList10;
                                        w(xmlPullParser2);
                                    }
                                }
                                str7 = str7;
                            }
                            arrayList7 = arrayList10;
                            str7 = str7;
                        }
                        iA = i15;
                        kVarM0 = kVar3;
                        arrayList2 = arrayList11;
                    }
                }
                if (r0.d(xmlPullParser2, "Representation")) {
                    break;
                }
                int i16 = iX2;
                ArrayList arrayList12 = arrayList5;
                String str8 = strU3;
                iX2 = i16;
                arrayList5 = arrayList12;
                arrayList6 = arrayList6;
                arrayList7 = arrayList7;
                arrayList4 = arrayList;
                kVar2 = kVarM0;
                jB = j16;
                j17 = j17;
                arrayList8 = arrayList2;
                strU1 = strU1;
                z12 = z12;
                str7 = str7;
                i15 = iA;
                strU2 = strU2;
                strU3 = str8;
                attributeValue = str6;
                iX = iX;
                xmlPullParser2 = xmlPullParser2;
            }
            arrayList3 = arrayList8;
            j16 = jB;
            arrayList2 = arrayList3;
            if (r0.d(xmlPullParser2, "Representation")) {
                break;
                break;
            }
            int i17 = iX2;
            ArrayList arrayList13 = arrayList5;
            String str9 = strU3;
            iX2 = i17;
            arrayList5 = arrayList13;
            arrayList6 = arrayList6;
            arrayList7 = arrayList7;
            arrayList4 = arrayList;
            kVar2 = kVarM0;
            jB = j16;
            j17 = j17;
            arrayList8 = arrayList2;
            strU1 = strU1;
            z12 = z12;
            str7 = str7;
            i15 = iA;
            strU2 = strU2;
            strU3 = str9;
            attributeValue = str6;
            iX = iX;
            xmlPullParser2 = xmlPullParser2;
        }
        ArrayList arrayList14 = arrayList5;
        String str10 = strU3;
        ArrayList arrayList15 = arrayList;
        String str11 = strU2;
        List<e> list6 = arrayList7;
        List<e> list7 = arrayList6;
        u uVarF = f(str6, strU0, iX2, iX3, fV, iA, iX4, iX, str5, list2, list3, strU1, str11, str10, list7, list6);
        if (kVarM0 == null) {
            kVarM0 = new k.e();
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        List list8 = arrayList2;
        if (zIsEmpty) {
            list8 = list;
        }
        return new a(uVarF, list8, kVarM0, str7, arrayList15, arrayList14, list7, list6, -1L);
    }

    protected i i(String str, long j11, long j12) {
        return new i(str, j11, j12);
    }

    protected int i0(List<e> list) {
        int iX0;
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            e eVar = list.get(i12);
            if (ou.c.a("urn:mpeg:dash:role:2011", eVar.f59806a)) {
                iX0 = j0(eVar.f59807b);
            } else {
                if (ou.c.a("urn:tva:metadata:cs:AudioPurposeCS:2007", eVar.f59806a)) {
                    iX0 = x0(eVar.f59807b);
                }
            }
            i11 |= iX0;
        }
        return i11;
    }

    protected j j(a aVar, String str, List<p7.x> list, String str2, ArrayList<p7.n.b> arrayList, ArrayList<e> arrayList2) {
        u.b bVarB = aVar.f59797a.b();
        if (str == null || !list.isEmpty()) {
            bVarB.m0(list);
        } else {
            bVarB.l0(str);
        }
        String str3 = aVar.f59800d;
        if (str3 == null) {
            str3 = str2;
        }
        ArrayList<p7.n.b> arrayList3 = aVar.f59801e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            s(arrayList3);
            bVarB.c0(new p7.n(str3, arrayList3));
        }
        ArrayList<e> arrayList4 = aVar.f59802f;
        arrayList4.addAll(arrayList2);
        return j.o(aVar.f59803g, bVarB.P(), aVar.f59798b, aVar.f59799c, arrayList4, aVar.f59804h, aVar.f59805i, null);
    }

    protected int j0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "subtitle":
            case "forced_subtitle":
            case "forced-subtitle":
                return 128;
            case "description":
                return 512;
            case "enhanced-audio-intelligibility":
                return 2048;
            case "alternate":
                return 2;
            case "dub":
                return 16;
            case "main":
                return 1;
            case "sign":
                return 256;
            case "caption":
                return 64;
            case "commentary":
                return 8;
            case "emergency":
                return 32;
            case "supplementary":
                return 4;
            default:
                return 0;
        }
    }

    protected k.b k(i iVar, long j11, long j12, long j13, long j14, List<k.d> list, long j15, List<i> list2, long j16, long j17) {
        return new k.b(iVar, j11, j12, j13, j14, list, j15, list2, q0.b1(j16), q0.b1(j17));
    }

    protected int k0(List<e> list) {
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (ou.c.a("http://dashif.org/guidelines/trickmode", list.get(i12).f59806a)) {
                i11 = 16384;
            }
        }
        return i11;
    }

    protected k.c l(i iVar, long j11, long j12, long j13, long j14, long j15, List<k.d> list, long j16, n nVar, n nVar2, long j17, long j18) {
        return new k.c(iVar, j11, j12, j13, j14, j15, list, j16, nVar, nVar2, q0.b1(j17), q0.b1(j18));
    }

    protected int l0(List<e> list) {
        int iJ0 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if (ou.c.a("urn:mpeg:dash:role:2011", eVar.f59806a)) {
                iJ0 |= j0(eVar.f59807b);
            }
        }
        return iJ0;
    }

    protected k.d m(long j11, long j12) {
        return new k.d(j11, j12);
    }

    protected k.e m0(XmlPullParser xmlPullParser, k.e eVar) throws XmlPullParserException, IOException {
        long jA0 = a0(xmlPullParser, "timescale", eVar != null ? eVar.f59843b : 1L);
        long jA1 = a0(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f59844c : 0L);
        long j11 = eVar != null ? eVar.f59857d : 0L;
        long j12 = eVar != null ? eVar.f59858e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j11 = Long.parseLong(strArrSplit[0]);
            j12 = (Long.parseLong(strArrSplit[1]) - j11) + 1;
        }
        long j13 = j12;
        i iVarW = eVar != null ? eVar.f59842a : null;
        while (true) {
            xmlPullParser.next();
            if (r0.f(xmlPullParser, "Initialization")) {
                iVarW = W(xmlPullParser);
            } else {
                w(xmlPullParser);
            }
            i iVar = iVarW;
            if (r0.d(xmlPullParser, "SegmentBase")) {
                return n(iVar, jA0, jA1, j11, j13);
            }
            iVarW = iVar;
        }
    }

    protected k.e n(i iVar, long j11, long j12, long j13, long j14) {
        return new k.e(iVar, j11, j12, j13, j14);
    }

    protected k.b n0(XmlPullParser xmlPullParser, k.b bVar, long j11, long j12, long j13, long j14, long j15) throws XmlPullParserException, IOException {
        long j16;
        long jA0 = a0(xmlPullParser, "timescale", bVar != null ? bVar.f59843b : 1L);
        long jA1 = a0(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f59844c : 0L);
        long jA2 = a0(xmlPullParser, "duration", bVar != null ? bVar.f59846e : -9223372036854775807L);
        long jA3 = a0(xmlPullParser, "startNumber", bVar != null ? bVar.f59845d : 1L);
        long jT = t(j13, j14);
        List<i> arrayList = null;
        i iVarW = null;
        List<k.d> listP0 = null;
        while (true) {
            xmlPullParser.next();
            if (r0.f(xmlPullParser, "Initialization")) {
                iVarW = W(xmlPullParser);
                j16 = jA0;
            } else if (r0.f(xmlPullParser, "SegmentTimeline")) {
                j16 = jA0;
                listP0 = p0(xmlPullParser, j16, j12);
            } else {
                j16 = jA0;
                if (r0.f(xmlPullParser, "SegmentURL")) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(q0(xmlPullParser));
                } else {
                    w(xmlPullParser);
                }
            }
            if (r0.d(xmlPullParser, "SegmentList")) {
                break;
            }
            jA0 = j16;
        }
        if (bVar != null) {
            if (iVarW == null) {
                iVarW = bVar.f59842a;
            }
            if (listP0 == null) {
                listP0 = bVar.f59847f;
            }
            if (arrayList == null) {
                arrayList = bVar.f59851j;
            }
        }
        return k(iVarW, j16, jA1, jA3, jA2, listP0, jT, arrayList, j15, j11);
    }

    protected o o(String str, String str2) {
        return new o(str, str2);
    }

    protected k.c o0(XmlPullParser xmlPullParser, k.c cVar, List<e> list, long j11, long j12, long j13, long j14, long j15) throws XmlPullParserException, IOException {
        long j16;
        d dVar = this;
        long jA0 = a0(xmlPullParser, "timescale", cVar != null ? cVar.f59843b : 1L);
        long jA1 = a0(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f59844c : 0L);
        long jA2 = a0(xmlPullParser, "duration", cVar != null ? cVar.f59846e : -9223372036854775807L);
        long jA3 = a0(xmlPullParser, "startNumber", cVar != null ? cVar.f59845d : 1L);
        long jZ = Z(list);
        long jT = t(j13, j14);
        n nVarY0 = dVar.y0(xmlPullParser, "media", cVar != null ? cVar.f59853k : null);
        n nVarY1 = dVar.y0(xmlPullParser, "initialization", cVar != null ? cVar.f59852j : null);
        i iVarW = null;
        List<k.d> listP0 = null;
        while (true) {
            xmlPullParser.next();
            if (r0.f(xmlPullParser, "Initialization")) {
                iVarW = W(xmlPullParser);
                j16 = jA0;
            } else if (r0.f(xmlPullParser, "SegmentTimeline")) {
                j16 = jA0;
                listP0 = dVar.p0(xmlPullParser, j16, j12);
            } else {
                j16 = jA0;
                w(xmlPullParser);
            }
            if (r0.d(xmlPullParser, "SegmentTemplate")) {
                break;
            }
            dVar = this;
            jT = jT;
            jZ = jZ;
            jA3 = jA3;
            jA1 = jA1;
            jA0 = j16;
        }
        if (cVar != null) {
            if (iVarW == null) {
                iVarW = cVar.f59842a;
            }
            if (listP0 == null) {
                listP0 = cVar.f59847f;
            }
        }
        return l(iVarW, j16, jA1, jA3, jZ, jA2, listP0, jT, nVarY1, nVarY0, j15, j11);
    }

    protected List<k.d> p0(XmlPullParser xmlPullParser, long j11, long j12) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jB = 0;
        long jA0 = -9223372036854775807L;
        boolean z11 = false;
        int iX = 0;
        do {
            xmlPullParser.next();
            if (r0.f(xmlPullParser, "S")) {
                long jA1 = a0(xmlPullParser, "t", -9223372036854775807L);
                if (z11) {
                    ArrayList arrayList2 = arrayList;
                    jB = b(arrayList2, jB, jA0, iX, jA1);
                    arrayList = arrayList2;
                }
                if (jA1 != -9223372036854775807L) {
                    jB = jA1;
                }
                jA0 = a0(xmlPullParser, DateTokenConverter.CONVERTER_KEY, -9223372036854775807L);
                iX = X(xmlPullParser, "r", 0);
                z11 = true;
            } else {
                w(xmlPullParser);
            }
        } while (!r0.d(xmlPullParser, "SegmentTimeline"));
        if (z11) {
            b(arrayList, jB, jA0, iX, q0.s1(j12, j11, 1000L));
        }
        return arrayList;
    }

    protected i q0(XmlPullParser xmlPullParser) {
        return g0(xmlPullParser, "media", "mediaRange");
    }

    protected int r0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    protected int s0(List<e> list) {
        int iR0 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if (ou.c.a("urn:mpeg:dash:role:2011", eVar.f59806a)) {
                iR0 |= r0(eVar.f59807b);
            }
        }
        return iR0;
    }

    protected l t0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long jA0 = -9223372036854775807L;
        long jA1 = -9223372036854775807L;
        long jA2 = -9223372036854775807L;
        float fU = -3.4028235E38f;
        float fU2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (r0.f(xmlPullParser, "Latency")) {
                jA0 = a0(xmlPullParser, "target", -9223372036854775807L);
                jA1 = a0(xmlPullParser, "min", -9223372036854775807L);
                jA2 = a0(xmlPullParser, "max", -9223372036854775807L);
            } else if (r0.f(xmlPullParser, "PlaybackRate")) {
                fU = U(xmlPullParser, "min", -3.4028235E38f);
                fU2 = U(xmlPullParser, "max", -3.4028235E38f);
            }
            long j11 = jA0;
            long j12 = jA1;
            long j13 = jA2;
            float f11 = fU;
            float f12 = fU2;
            if (r0.d(xmlPullParser, "ServiceDescription")) {
                return new l(j11, j12, j13, f11, f12);
            }
            jA0 = j11;
            jA1 = j12;
            jA2 = j13;
            fU = f11;
            fU2 = f12;
        }
    }

    protected Pair<Integer, Integer> w0(List<e> list) {
        String str;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if ((ou.c.a("http://dashif.org/thumbnail_tile", eVar.f59806a) || ou.c.a("http://dashif.org/guidelines/thumbnail_tile", eVar.f59806a)) && (str = eVar.f59807b) != null) {
                String[] strArrE1 = q0.E1(str, "x");
                if (strArrE1.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(strArrE1[0])), Integer.valueOf(Integer.parseInt(strArrE1[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.upstream.c.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public c a(Uri uri, InputStream inputStream) throws ParserException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f59796a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return b0(xmlPullParserNewPullParser, uri);
            }
            throw ParserException.c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e11) {
            throw ParserException.c(null, e11);
        }
    }

    protected int x0(String str) {
        if (str == null) {
            return 0;
        }
        byte b11 = -1;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    b11 = 0;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    b11 = 1;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    b11 = 2;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    b11 = 3;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    b11 = 4;
                }
                break;
        }
        switch (b11) {
            case 0:
                return 512;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x03cb A[LOOP:0: B:3:0x00a2->B:75:0x03cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x037b A[EDGE_INSN: B:76:0x037b->B:69:0x037b BREAK  A[LOOP:0: B:3:0x00a2->B:75:0x03cb], SYNTHETIC] */
    protected d8.a y(XmlPullParser xmlPullParser, List<b> list, k kVar, long j11, long j12, long j13, long j14, long j15, boolean z11) throws XmlPullParserException, IOException {
        String str;
        int i11;
        int iP;
        long j16;
        ArrayList arrayList;
        String str2;
        long j17;
        int i12;
        List<p7.x> list2;
        ArrayList arrayList2;
        List<b> list3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long jA0 = a0(xmlPullParser2, "id", -1L);
        int iG = G(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "scte214:supplementalCodecs");
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, "scte214:supplementalProfiles");
        int iX = X(xmlPullParser2, Snapshot.WIDTH, -1);
        int iX2 = X(xmlPullParser2, Snapshot.HEIGHT, -1);
        float fV = V(xmlPullParser2, -1.0f);
        int iX3 = X(xmlPullParser2, "audioSamplingRate", -1);
        String str3 = "lang";
        String attributeValue5 = xmlPullParser2.getAttributeValue(null, "lang");
        String attributeValue6 = xmlPullParser2.getAttributeValue(null, AnnotatedPrivateKey.LABEL);
        List<p7.x> arrayList9 = new ArrayList<>();
        ArrayList<p7.n.b> arrayList10 = new ArrayList<>();
        ArrayList<e> arrayList11 = new ArrayList<>();
        List<p7.x> list4 = arrayList9;
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList<e> arrayList15 = arrayList11;
        ArrayList arrayList16 = new ArrayList();
        String str4 = attributeValue;
        ArrayList arrayList17 = new ArrayList();
        long j18 = j13;
        String str5 = attributeValue4;
        int i13 = iX;
        int i14 = iX2;
        float f11 = fV;
        int iP2 = iG;
        String str6 = attributeValue5;
        boolean z12 = false;
        int iA = -1;
        String str7 = null;
        k kVarO0 = kVar;
        String str8 = attributeValue3;
        long jB = j12;
        ArrayList arrayList18 = new ArrayList();
        while (true) {
            xmlPullParser2.next();
            iA = iA;
            if (r0.f(xmlPullParser2, "BaseURL")) {
                if (!z12) {
                    jB = B(xmlPullParser2, jB);
                    z12 = true;
                }
                arrayList18.addAll(C(xmlPullParser2, list, z11));
                List<p7.x> list5 = list4;
                arrayList14 = arrayList14;
                list2 = list5;
                iA = iA;
                jB = jB;
                arrayList7 = arrayList18;
                arrayList10 = arrayList10;
                str3 = str3;
                arrayList12 = arrayList12;
                kVarO0 = kVarO0;
                arrayList17 = arrayList17;
                arrayList16 = arrayList16;
                iX3 = iX3;
                arrayList15 = arrayList15;
            } else {
                jB = jB;
                if (r0.f(xmlPullParser2, "ContentProtection")) {
                    Pair<String, p7.n.b> pairF = F(xmlPullParser);
                    arrayList6 = arrayList18;
                    Object obj = pairF.first;
                    if (obj != null) {
                        str7 = (String) obj;
                    }
                    Object obj2 = pairF.second;
                    if (obj2 != null) {
                        arrayList10.add((p7.n.b) obj2);
                    }
                    List<p7.x> list6 = list4;
                    arrayList14 = arrayList14;
                    list2 = list6;
                    iA = iA;
                } else {
                    ArrayList arrayList19 = arrayList18;
                    if (r0.f(xmlPullParser2, "ContentComponent")) {
                        String strQ = q(str6, xmlPullParser2.getAttributeValue(null, str3));
                        iP2 = p(iP2, G(xmlPullParser));
                        list2 = list4;
                        iA = iA;
                        str6 = strQ;
                    } else {
                        if (r0.f(xmlPullParser2, "Role")) {
                            arrayList13.add(I(xmlPullParser2, "Role"));
                        } else {
                            if (r0.f(xmlPullParser2, "AudioChannelConfiguration")) {
                                list2 = list4;
                                iA = A(xmlPullParser2, attributeValue2);
                            } else if (r0.f(xmlPullParser2, "Accessibility")) {
                                arrayList12.add(I(xmlPullParser2, "Accessibility"));
                            } else if (r0.f(xmlPullParser2, "EssentialProperty")) {
                                arrayList14.add(I(xmlPullParser2, "EssentialProperty"));
                            } else if (r0.f(xmlPullParser2, "SupplementalProperty")) {
                                arrayList16.add(I(xmlPullParser2, "SupplementalProperty"));
                            } else {
                                if (r0.f(xmlPullParser2, "Representation")) {
                                    if (arrayList19.isEmpty()) {
                                        list3 = list;
                                        arrayList3 = arrayList19;
                                    } else {
                                        ArrayList arrayList20 = arrayList19;
                                        arrayList3 = arrayList20;
                                        list3 = arrayList20;
                                    }
                                    a aVarH0 = h0(xmlPullParser2, list3, str4, attributeValue2, str8, str5, i13, i14, f11, iA, iX3, str6, arrayList13, arrayList12, arrayList14, arrayList16, kVarO0, j14, j11, jB, j18, j15, z11);
                                    str4 = str4;
                                    str8 = str8;
                                    str5 = str5;
                                    i14 = i14;
                                    f11 = f11;
                                    kVarO0 = kVarO0;
                                    arrayList13 = arrayList13;
                                    arrayList14 = arrayList14;
                                    str2 = attributeValue2;
                                    arrayList12 = arrayList12;
                                    iX3 = iX3;
                                    i13 = i13;
                                    iP = p(iP2, g0.k(aVarH0.f59797a.f101544o));
                                    ArrayList arrayList21 = arrayList17;
                                    arrayList21.add(aVarH0);
                                    xmlPullParser2 = xmlPullParser2;
                                    jB = jB;
                                    arrayList17 = arrayList21;
                                    arrayList16 = arrayList16;
                                    str6 = str6;
                                    arrayList2 = arrayList3;
                                } else {
                                    str3 = str3;
                                    arrayList12 = arrayList12;
                                    list4 = list4;
                                    arrayList15 = arrayList15;
                                    ArrayList arrayList22 = arrayList16;
                                    arrayList14 = arrayList14;
                                    str = str6;
                                    iX3 = iX3;
                                    ArrayList arrayList23 = arrayList17;
                                    i11 = iA;
                                    XmlPullParser xmlPullParser3 = xmlPullParser2;
                                    iP = iP2;
                                    j16 = jB;
                                    arrayList10 = arrayList10;
                                    kVarO0 = kVarO0;
                                    arrayList = arrayList19;
                                    arrayList13 = arrayList13;
                                    str2 = attributeValue2;
                                    j17 = j18;
                                    if (r0.f(xmlPullParser3, "SegmentBase")) {
                                        xmlPullParser2 = xmlPullParser3;
                                        kVarO0 = m0(xmlPullParser3, (k.e) kVarO0);
                                        j18 = j17;
                                        jB = j16;
                                        arrayList17 = arrayList23;
                                        arrayList16 = arrayList22;
                                        str6 = str;
                                        iA = i11;
                                        arrayList2 = arrayList;
                                    } else if (r0.f(xmlPullParser3, "SegmentList")) {
                                        long jB2 = B(xmlPullParser3, j17);
                                        arrayList17 = arrayList23;
                                        xmlPullParser2 = xmlPullParser;
                                        kVarO0 = n0(xmlPullParser2, (k.b) kVarO0, j14, j11, j16, jB2, j15);
                                        jB = j16;
                                        arrayList16 = arrayList22;
                                        iA = i11;
                                        iP2 = iP;
                                        arrayList15 = arrayList15;
                                        j18 = jB2;
                                        str6 = str;
                                        list2 = list4;
                                        arrayList8 = arrayList;
                                    } else {
                                        i12 = iP;
                                        xmlPullParser2 = xmlPullParser3;
                                        arrayList17 = arrayList23;
                                        if (r0.f(xmlPullParser2, "SegmentTemplate")) {
                                            long jB3 = B(xmlPullParser2, j17);
                                            arrayList16 = arrayList22;
                                            kVarO0 = o0(xmlPullParser2, (k.c) kVarO0, arrayList16, j14, j11, j16, jB3, j15);
                                            jB = j16;
                                            iP2 = i12;
                                            list2 = list4;
                                            arrayList15 = arrayList15;
                                            j18 = jB3;
                                            arrayList4 = arrayList;
                                        } else {
                                            arrayList16 = arrayList22;
                                            if (r0.f(xmlPullParser2, "InbandEventStream")) {
                                                arrayList15 = arrayList15;
                                                arrayList15.add(I(xmlPullParser2, "InbandEventStream"));
                                                list2 = list4;
                                                arrayList5 = arrayList;
                                            } else {
                                                arrayList15 = arrayList15;
                                                if (r0.f(xmlPullParser2, "Label")) {
                                                    list2 = list4;
                                                    list2.add(Y(xmlPullParser));
                                                    arrayList5 = arrayList;
                                                } else {
                                                    list2 = list4;
                                                    if (r0.e(xmlPullParser2)) {
                                                        arrayList5 = arrayList;
                                                        z(xmlPullParser);
                                                        arrayList5 = arrayList;
                                                    }
                                                }
                                            }
                                            arrayList5 = arrayList;
                                            iP2 = i12;
                                            j18 = j17;
                                            jB = j16;
                                            arrayList4 = arrayList5;
                                        }
                                        str6 = str;
                                        iA = i11;
                                        arrayList8 = arrayList4;
                                    }
                                }
                                list2 = list4;
                                arrayList15 = arrayList15;
                                iP2 = iP;
                                arrayList8 = arrayList2;
                            }
                            if (r0.d(xmlPullParser2, "AdaptationSet")) {
                                break;
                            }
                            ArrayList arrayList24 = arrayList14;
                            list4 = list2;
                            arrayList14 = arrayList24;
                            arrayList17 = arrayList17;
                            arrayList15 = arrayList15;
                            arrayList16 = arrayList16;
                            attributeValue2 = str2;
                            iX3 = iX3;
                            arrayList12 = arrayList12;
                            arrayList13 = arrayList13;
                            arrayList18 = arrayList8;
                            str3 = str3;
                            kVarO0 = kVarO0;
                            arrayList10 = arrayList10;
                        }
                        arrayList10 = arrayList10;
                        kVarO0 = kVarO0;
                        arrayList13 = arrayList13;
                        str2 = attributeValue2;
                        j17 = j18;
                        i12 = iP2;
                        j16 = jB;
                        List<p7.x> list7 = list4;
                        arrayList14 = arrayList14;
                        list2 = list7;
                        str3 = str3;
                        arrayList12 = arrayList12;
                        arrayList17 = arrayList17;
                        arrayList5 = arrayList19;
                        i11 = iA;
                        arrayList16 = arrayList16;
                        iX3 = iX3;
                        arrayList15 = arrayList15;
                        str = str6;
                        arrayList5 = arrayList;
                        iP2 = i12;
                        j18 = j17;
                        jB = j16;
                        arrayList4 = arrayList5;
                        str6 = str;
                        iA = i11;
                        arrayList8 = arrayList4;
                        if (r0.d(xmlPullParser2, "AdaptationSet")) {
                            break;
                            break;
                        }
                        ArrayList arrayList25 = arrayList14;
                        list4 = list2;
                        arrayList14 = arrayList25;
                        arrayList17 = arrayList17;
                        arrayList15 = arrayList15;
                        arrayList16 = arrayList16;
                        attributeValue2 = str2;
                        iX3 = iX3;
                        arrayList12 = arrayList12;
                        arrayList13 = arrayList13;
                        arrayList18 = arrayList8;
                        str3 = str3;
                        kVarO0 = kVarO0;
                        arrayList10 = arrayList10;
                    }
                    arrayList6 = arrayList19;
                }
                arrayList7 = arrayList6;
            }
            str2 = attributeValue2;
            arrayList8 = arrayList7;
            if (r0.d(xmlPullParser2, "AdaptationSet")) {
                break;
                break;
            }
            ArrayList arrayList26 = arrayList14;
            list4 = list2;
            arrayList14 = arrayList26;
            arrayList17 = arrayList17;
            arrayList15 = arrayList15;
            arrayList16 = arrayList16;
            attributeValue2 = str2;
            iX3 = iX3;
            arrayList12 = arrayList12;
            arrayList13 = arrayList13;
            arrayList18 = arrayList8;
            str3 = str3;
            kVarO0 = kVarO0;
            arrayList10 = arrayList10;
        }
        List<j> arrayList27 = new ArrayList<>(arrayList17.size());
        int i15 = 0;
        while (i15 < arrayList17.size()) {
            ArrayList<e> arrayList28 = arrayList15;
            List<p7.x> list8 = list2;
            String str9 = attributeValue6;
            arrayList27.add(j((a) arrayList17.get(i15), str9, list8, str7, arrayList10, arrayList28));
            i15++;
            attributeValue6 = str9;
            arrayList15 = arrayList28;
            list2 = list8;
        }
        return c(jA0, iP2, arrayList27, arrayList12, arrayList14, arrayList16);
    }

    protected n y0(XmlPullParser xmlPullParser, String str, n nVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? n.b(attributeValue) : nVar;
    }

    protected void z(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        w(xmlPullParser);
    }

    protected o z0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }
}
