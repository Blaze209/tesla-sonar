package androidx.media3.exoplayer.smoothstreaming.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.media3.common.ParserException;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.webrtc.MediaStreamTrack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p7.n;
import q9.p;
import q9.u;
import s7.k;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public class SsManifestParser implements androidx.media3.exoplayer.upstream.c.a<androidx.media3.exoplayer.smoothstreaming.manifest.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f10730a;

    public static class MissingFieldException extends ParserException {
        public MissingFieldException(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    private static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f10733c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<Pair<String, Object>> f10734d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f10733c = aVar;
            this.f10731a = str;
            this.f10732b = str2;
        }

        private a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new c(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new b(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new e(aVar, str2);
            }
            return null;
        }

        protected void a(Object obj) {
        }

        protected abstract Object b();

        protected final Object c(String str) {
            for (int i11 = 0; i11 < this.f10734d.size(); i11++) {
                Pair<String, Object> pair = this.f10734d.get(i11);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f10733c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        protected boolean d(String str) {
            return false;
        }

        public final Object f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f10732b.equals(name)) {
                        n(xmlPullParser);
                        z11 = true;
                    } else if (z11) {
                        if (i11 > 0) {
                            i11++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a aVarE = e(this, name, this.f10731a);
                            if (aVarE == null) {
                                i11 = 1;
                            } else {
                                a(aVarE.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z11 && i11 == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z11) {
                    continue;
                } else if (i11 > 0) {
                    i11--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        protected final boolean g(XmlPullParser xmlPullParser, String str, boolean z11) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z11;
        }

        protected void h(XmlPullParser xmlPullParser) {
        }

        protected final int i(XmlPullParser xmlPullParser, String str, int i11) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i11;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e11) {
                throw ParserException.c(null, e11);
            }
        }

        protected final long j(XmlPullParser xmlPullParser, String str, long j11) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j11;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e11) {
                throw ParserException.c(null, e11);
            }
        }

        protected final int k(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new MissingFieldException(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e11) {
                throw ParserException.c(null, e11);
            }
        }

        protected final long l(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new MissingFieldException(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e11) {
                throw ParserException.c(null, e11);
            }
        }

        protected final String m(XmlPullParser xmlPullParser, String str) throws MissingFieldException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new MissingFieldException(str);
        }

        protected abstract void n(XmlPullParser xmlPullParser);

        protected void o(XmlPullParser xmlPullParser) {
        }

        protected final void p(String str, Object obj) {
            this.f10734d.add(Pair.create(str, obj));
        }
    }

    private static class b extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f10735e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private UUID f10736f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f10737g;

        public b(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        private static u[] q(byte[] bArr) {
            return new u[]{new u(true, null, 8, r(bArr), 0, 0, null)};
        }

        private static byte[] r(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < bArr.length; i11 += 2) {
                sb2.append((char) bArr[i11]);
            }
            String string = sb2.toString();
            byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
            t(bArrDecode, 0, 3);
            t(bArrDecode, 1, 2);
            t(bArrDecode, 4, 5);
            t(bArrDecode, 6, 7);
            return bArrDecode;
        }

        private static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        private static void t(byte[] bArr, int i11, int i12) {
            byte b11 = bArr[i11];
            bArr[i11] = bArr[i12];
            bArr[i12] = b11;
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            UUID uuid = this.f10736f;
            return new androidx.media3.exoplayer.smoothstreaming.manifest.a.C0203a(uuid, p.a(uuid, this.f10737g), q(this.f10737g));
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.a
        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.a
        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f10735e = false;
            }
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f10735e = true;
                this.f10736f = UUID.fromString(s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.f10735e) {
                this.f10737g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    private static class c extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p7.u f10738e;

        public c(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        private static List<byte[]> q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] bArrW = q0.W(str);
                byte[][] bArrD = k.D(bArrW);
                if (bArrD == null) {
                    arrayList.add(bArrW);
                    return arrayList;
                }
                Collections.addAll(arrayList, bArrD);
            }
            return arrayList;
        }

        private static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            return this.f10738e;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) throws ParserException {
            int i11;
            p7.u.b bVar = new p7.u.b();
            String strR = r(m(xmlPullParser, "FourCC"));
            int iIntValue = ((Integer) c("Type")).intValue();
            if (iIntValue == 2) {
                bVar.W("video/mp4").F0(k(xmlPullParser, "MaxWidth")).h0(k(xmlPullParser, "MaxHeight")).k0(q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (iIntValue == 1) {
                if (strR == null) {
                    strR = "audio/mp4a-latm";
                }
                int iK = k(xmlPullParser, "Channels");
                int iK2 = k(xmlPullParser, "SamplingRate");
                List<byte[]> listQ = q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (listQ.isEmpty() && "audio/mp4a-latm".equals(strR)) {
                    listQ = Collections.singletonList(w8.a.a(iK2, iK));
                }
                bVar.W("audio/mp4").T(iK).z0(iK2).k0(listQ);
            } else if (iIntValue == 3) {
                String str = (String) c("Subtype");
                if (str == null) {
                    i11 = 0;
                } else if (str.equals("CAPT")) {
                    i11 = 64;
                } else if (str.equals("DESC")) {
                    i11 = 1024;
                } else {
                    i11 = 0;
                }
                bVar.W("application/mp4").w0(i11);
            } else {
                bVar.W("application/mp4");
            }
            this.f10738e = bVar.j0(xmlPullParser.getAttributeValue(null, "Index")).l0((String) c("Name")).y0(strR).S(k(xmlPullParser, "Bitrate")).n0((String) c("Language")).P();
        }
    }

    private static class d extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List<androidx.media3.exoplayer.smoothstreaming.manifest.a.b> f10739e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f10740f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f10741g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f10742h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f10743i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f10744j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f10745k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f10746l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private androidx.media3.exoplayer.smoothstreaming.manifest.a.C0203a f10747m;

        public d(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f10745k = -1;
            this.f10747m = null;
            this.f10739e = new LinkedList();
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.a
        public void a(Object obj) {
            if (obj instanceof androidx.media3.exoplayer.smoothstreaming.manifest.a.b) {
                this.f10739e.add((androidx.media3.exoplayer.smoothstreaming.manifest.a.b) obj);
            } else if (obj instanceof androidx.media3.exoplayer.smoothstreaming.manifest.a.C0203a) {
                s7.a.h(this.f10747m == null);
                this.f10747m = (androidx.media3.exoplayer.smoothstreaming.manifest.a.C0203a) obj;
            }
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            int size = this.f10739e.size();
            androidx.media3.exoplayer.smoothstreaming.manifest.a.b[] bVarArr = new androidx.media3.exoplayer.smoothstreaming.manifest.a.b[size];
            this.f10739e.toArray(bVarArr);
            if (this.f10747m != null) {
                androidx.media3.exoplayer.smoothstreaming.manifest.a.C0203a c0203a = this.f10747m;
                n nVar = new n(new n.b(c0203a.f10770a, "video/mp4", c0203a.f10771b));
                for (int i11 = 0; i11 < size; i11++) {
                    androidx.media3.exoplayer.smoothstreaming.manifest.a.b bVar = bVarArr[i11];
                    int i12 = bVar.f10773a;
                    if (i12 == 2 || i12 == 1) {
                        p7.u[] uVarArr = bVar.f10782j;
                        for (int i13 = 0; i13 < uVarArr.length; i13++) {
                            uVarArr[i13] = uVarArr[i13].b().c0(nVar).P();
                        }
                    }
                }
            }
            return new androidx.media3.exoplayer.smoothstreaming.manifest.a(this.f10740f, this.f10741g, this.f10742h, this.f10743i, this.f10744j, this.f10745k, this.f10746l, this.f10747m, bVarArr);
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) {
            this.f10740f = k(xmlPullParser, "MajorVersion");
            this.f10741g = k(xmlPullParser, "MinorVersion");
            this.f10742h = j(xmlPullParser, "TimeScale", 10000000L);
            this.f10743i = l(xmlPullParser, "Duration");
            this.f10744j = j(xmlPullParser, "DVRWindowLength", 0L);
            this.f10745k = i(xmlPullParser, "LookaheadCount", -1);
            this.f10746l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.f10742h));
        }
    }

    private static class e extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f10748e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List<p7.u> f10749f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f10750g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f10751h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f10752i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f10753j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f10754k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f10755l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f10756m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f10757n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f10758o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private String f10759p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private ArrayList<Long> f10760q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private long f10761r;

        public e(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f10748e = str;
            this.f10749f = new LinkedList();
        }

        private void q(XmlPullParser xmlPullParser) throws ParserException {
            int iS = s(xmlPullParser);
            this.f10750g = iS;
            p("Type", Integer.valueOf(iS));
            if (this.f10750g == 3) {
                this.f10751h = m(xmlPullParser, "Subtype");
            } else {
                this.f10751h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            p("Subtype", this.f10751h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f10753j = attributeValue;
            p("Name", attributeValue);
            this.f10754k = m(xmlPullParser, "Url");
            this.f10755l = i(xmlPullParser, "MaxWidth", -1);
            this.f10756m = i(xmlPullParser, "MaxHeight", -1);
            this.f10757n = i(xmlPullParser, "DisplayWidth", -1);
            this.f10758o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.f10759p = attributeValue2;
            p("Language", attributeValue2);
            long jI = i(xmlPullParser, "TimeScale", -1);
            this.f10752i = jI;
            if (jI == -1) {
                this.f10752i = ((Long) c("TimeScale")).longValue();
            }
            this.f10760q = new ArrayList<>();
        }

        private void r(XmlPullParser xmlPullParser) throws ParserException {
            int size = this.f10760q.size();
            long j11 = j(xmlPullParser, "t", -9223372036854775807L);
            int i11 = 1;
            if (j11 == -9223372036854775807L) {
                if (size == 0) {
                    j11 = 0;
                } else {
                    if (this.f10761r == -1) {
                        throw ParserException.c("Unable to infer start time", null);
                    }
                    j11 = this.f10761r + this.f10760q.get(size - 1).longValue();
                }
            }
            this.f10760q.add(Long.valueOf(j11));
            this.f10761r = j(xmlPullParser, DateTokenConverter.CONVERTER_KEY, -9223372036854775807L);
            long j12 = j(xmlPullParser, "r", 1L);
            if (j12 > 1 && this.f10761r == -9223372036854775807L) {
                throw ParserException.c("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j13 = i11;
                if (j13 >= j12) {
                    return;
                }
                this.f10760q.add(Long.valueOf((this.f10761r * j13) + j11));
                i11++;
            }
        }

        private int s(XmlPullParser xmlPullParser) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new MissingFieldException("Type");
            }
            if (MediaStreamTrack.AUDIO_TRACK_KIND.equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if (MediaStreamTrack.VIDEO_TRACK_KIND.equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw ParserException.c("Invalid key value[" + attributeValue + "]", null);
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.a
        public void a(Object obj) {
            if (obj instanceof p7.u) {
                this.f10749f.add((p7.u) obj);
            }
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            p7.u[] uVarArr = new p7.u[this.f10749f.size()];
            this.f10749f.toArray(uVarArr);
            return new androidx.media3.exoplayer.smoothstreaming.manifest.a.b(this.f10748e, this.f10754k, this.f10750g, this.f10751h, this.f10752i, this.f10753j, this.f10755l, this.f10756m, this.f10757n, this.f10758o, this.f10759p, uVarArr, this.f10760q, this.f10761r);
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.a
        public boolean d(String str) {
            return "c".equals(str);
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) throws ParserException {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }
    }

    public SsManifestParser() {
        try {
            this.f10730a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e11) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e11);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.c.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public androidx.media3.exoplayer.smoothstreaming.manifest.a a(Uri uri, InputStream inputStream) throws ParserException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f10730a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            return (androidx.media3.exoplayer.smoothstreaming.manifest.a) new d(null, uri.toString()).f(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e11) {
            throw ParserException.c(null, e11);
        }
    }
}
