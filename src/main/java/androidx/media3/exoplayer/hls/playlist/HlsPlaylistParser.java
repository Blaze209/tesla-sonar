package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.ParserException;
import g8.e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p7.f0;
import p7.g0;
import p7.h;
import p7.n;
import p7.u;
import q9.p;
import s7.k0;
import s7.q0;
import s7.t;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsPlaylistParser implements androidx.media3.exoplayer.upstream.c.a<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f10111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f10112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f10067c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f10069d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f10071e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f10073f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f10075g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f10077h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f10079i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f10081j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f10083k = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f10085l = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f10087m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f10089n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f10091o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f10093p = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Pattern f10095q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f10097r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f10099s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pattern f10101t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f10103u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pattern f10105v = c("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Pattern f10107w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Pattern f10108x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Pattern f10109y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Pattern f10110z = c("CAN-BLOCK-RELOAD");
    private static final Pattern A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern D = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern E = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern L = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    private static final Pattern M = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    private static final Pattern N = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    private static final Pattern O = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern P = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern Q = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern R = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    private static final Pattern S = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    private static final Pattern T = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    private static final Pattern U = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    private static final Pattern V = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern W = c("AUTOSELECT");
    private static final Pattern X = c("DEFAULT");
    private static final Pattern Y = c("FORCED");
    private static final Pattern Z = c("INDEPENDENT");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Pattern f10065a0 = c("GAP");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Pattern f10066b0 = c("PRECISE");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Pattern f10068c0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Pattern f10070d0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final Pattern f10072e0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final Pattern f10074f0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final Pattern f10076g0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final Pattern f10078h0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Pattern f10080i0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final Pattern f10082j0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final Pattern f10084k0 = c("END-ON-NEXT");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final Pattern f10086l0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final Pattern f10088m0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final Pattern f10090n0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final Pattern f10092o0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final Pattern f10094p0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final Pattern f10096q0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final Pattern f10098r0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Pattern f10100s0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final Pattern f10102t0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Pattern f10104u0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final Pattern f10106v0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public static final class DeltaUpdateException extends IOException {
    }

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BufferedReader f10113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Queue<String> f10114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10115c;

        public a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f10114b = queue;
            this.f10113a = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        public boolean a() throws IOException {
            String strTrim;
            if (this.f10115c != null) {
                return true;
            }
            if (!this.f10114b.isEmpty()) {
                this.f10115c = (String) s7.a.f(this.f10114b.poll());
                return true;
            }
            do {
                String line = this.f10113a.readLine();
                this.f10115c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f10115c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.f10115c;
            this.f10115c = null;
            return str;
        }
    }

    public HlsPlaylistParser() {
        this(d.f10231n, null);
    }

    private static c.h A(String str) {
        double dT = t(str, f10103u, -9.223372036854776E18d);
        long j11 = dT == -9.223372036854776E18d ? -9223372036854775807L : (long) (dT * 1000000.0d);
        boolean zS = s(str, f10105v, false);
        double dT2 = t(str, f10108x, -9.223372036854776E18d);
        long j12 = dT2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dT2 * 1000000.0d);
        double dT3 = t(str, f10109y, -9.223372036854776E18d);
        return new c.h(j11, zS, j12, dT3 != -9.223372036854776E18d ? (long) (dT3 * 1000000.0d) : -9223372036854775807L, s(str, f10110z, false));
    }

    private static String B(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String strX = x(str, pattern, map);
        if (strX != null) {
            return strX;
        }
        throw ParserException.c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    private static long C(String str, Pattern pattern) {
        return new BigDecimal(B(str, pattern, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String D(String str, Map<String, String> map) {
        Matcher matcher = f10104u0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int E(BufferedReader bufferedReader, boolean z11, int i11) throws IOException {
        while (i11 != -1 && Character.isWhitespace(i11) && (z11 || !q0.T0(i11))) {
            i11 = bufferedReader.read();
        }
        return i11;
    }

    private static boolean b(BufferedReader bufferedReader) throws IOException {
        int i11 = bufferedReader.read();
        if (i11 == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i11 = bufferedReader.read();
        }
        int iE = E(bufferedReader, true, i11);
        for (int i12 = 0; i12 < 7; i12++) {
            if (iE != "#EXTM3U".charAt(i12)) {
                return false;
            }
            iE = bufferedReader.read();
        }
        return q0.T0(E(bufferedReader, false, iE));
    }

    private static Pattern c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    private static n d(String str, n.b[] bVarArr) {
        n.b[] bVarArr2 = new n.b[bVarArr.length];
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            bVarArr2[i11] = bVarArr[i11].b(null);
        }
        return new n(str, bVarArr2);
    }

    private static String e(long j11, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j11);
    }

    private static d.b f(ArrayList<d.b> arrayList, String str) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            d.b bVar = arrayList.get(i11);
            if (str.equals(bVar.f10249d)) {
                return bVar;
            }
        }
        return null;
    }

    private static d.b g(ArrayList<d.b> arrayList, String str) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            d.b bVar = arrayList.get(i11);
            if (str.equals(bVar.f10250e)) {
                return bVar;
            }
        }
        return null;
    }

    private static d.b h(ArrayList<d.b> arrayList, String str) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            d.b bVar = arrayList.get(i11);
            if (str.equals(bVar.f10248c)) {
                return bVar;
            }
        }
        return null;
    }

    private static boolean i(String str, String str2, String str3, String str4) {
        if (!g0.p(str2, str3)) {
            return false;
        }
        if (str3 == null) {
            return true;
        }
        if (str == null || str4 == null) {
            return false;
        }
        return (!str.equals("PQ") || str4.equals("db1p")) && (!str.equals("SDR") || str4.equals("db2g")) && (!str.equals("HLG") || str4.startsWith("db4"));
    }

    private static c.b k(String str, String str2, Map<String, String> map) {
        String str3 = str2 + "=";
        int iIndexOf = str.indexOf(str3) + str3.length();
        String strSubstring = str.substring(iIndexOf, (str.length() == iIndexOf + 1 ? 1 : 2) + iIndexOf);
        if (strSubstring.startsWith("\"")) {
            return new c.b(str2, B(str, Pattern.compile(str2 + "=\"((?:.|\f)+?)\""), map), 0);
        }
        if (strSubstring.equals("0x") || strSubstring.equals("0X")) {
            return new c.b(str2, B(str, Pattern.compile(str2 + "=(0[xX][A-F0-9]+)"), map), 1);
        }
        return new c.b(str2, l(str, Pattern.compile(str2 + "=([\\d\\.]+)\\b")));
    }

    private static double l(String str, Pattern pattern) {
        return Double.parseDouble(B(str, pattern, Collections.EMPTY_MAP));
    }

    private static n.b m(String str, String str2, Map<String, String> map) throws ParserException {
        String strW = w(str, M, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strB = B(str, N, map);
            return new n.b(h.f101351d, "video/mp4", Base64.decode(strB.substring(strB.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new n.b(h.f101351d, "hls", q0.E0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strW)) {
            return null;
        }
        String strB2 = B(str, N, map);
        byte[] bArrDecode = Base64.decode(strB2.substring(strB2.indexOf(44)), 0);
        UUID uuid = h.f101352e;
        return new n.b(uuid, "video/mp4", p.a(uuid, bArrDecode));
    }

    private static String n(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    private static int o(String str, Pattern pattern) {
        return Integer.parseInt(B(str, pattern, Collections.EMPTY_MAP));
    }

    private static long p(String str, Pattern pattern) {
        return Long.parseLong(B(str, pattern, Collections.EMPTY_MAP));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 29541. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private static androidx.media3.exoplayer.hls.playlist.c q(androidx.media3.exoplayer.hls.playlist.d r91, androidx.media3.exoplayer.hls.playlist.c r92, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.a r93, java.lang.String r94) {
        /*
            Method dump skipped, instruction units count: 2954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.q(androidx.media3.exoplayer.hls.playlist.d, androidx.media3.exoplayer.hls.playlist.c, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$a, java.lang.String):androidx.media3.exoplayer.hls.playlist.c");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:168:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0152 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0155  */
    /* JADX WARN: Code duplicated, block: B:47:0x015c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0170  */
    /* JADX WARN: Code duplicated, block: B:51:0x0179  */
    /* JADX WARN: Code duplicated, block: B:56:0x0195  */
    /* JADX WARN: Code duplicated, block: B:58:0x019c  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:69:0x01da  */
    /* JADX WARN: Code duplicated, block: B:72:0x022c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0366  */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x015c, please report this as an issue */
    private static d r(a aVar, String str) throws ParserException {
        ArrayList arrayList;
        String strG;
        ArrayList arrayList2;
        int i11;
        String str2;
        String strG2;
        int i12;
        String str3;
        String str4;
        String strY;
        String strX;
        int i13;
        int i14;
        String strX2;
        float f11;
        Uri uriG;
        Uri uri;
        ArrayList arrayList3;
        int i15;
        int i16;
        int i17;
        String strZ;
        String str5 = str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            ArrayList arrayList12 = arrayList8;
            if (!aVar.a()) {
                ArrayList arrayList13 = arrayList9;
                ArrayList arrayList14 = arrayList5;
                ArrayList arrayList15 = arrayList6;
                ArrayList arrayList16 = arrayList7;
                ArrayList arrayList17 = arrayList11;
                ArrayList arrayList18 = arrayList10;
                boolean z13 = z12;
                ArrayList arrayList19 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                    d.b bVar = (d.b) arrayList4.get(i18);
                    if (hashSet.add(bVar.f10246a)) {
                        s7.a.h(bVar.f10247b.f101541l == null);
                        arrayList19.add(bVar.a(bVar.f10247b.b().r0(new f0(new f8.h(null, null, (List) s7.a.f((ArrayList) map.get(bVar.f10246a))))).P()));
                    }
                }
                ArrayList arrayList20 = null;
                u uVarP = null;
                int i19 = 0;
                while (i19 < arrayList13.size()) {
                    ArrayList arrayList21 = arrayList13;
                    String str6 = (String) arrayList21.get(i19);
                    String strB = B(str6, T, map2);
                    String strB2 = B(str6, S, map2);
                    u.b bVar2 = new u.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strB);
                    ArrayList arrayList22 = arrayList20;
                    sb2.append(":");
                    sb2.append(strB2);
                    u.b bVarN0 = bVar2.j0(sb2.toString()).l0(strB2).W("application/x-mpegURL").A0(z(str6)).w0(y(str6, map2)).n0(x(str6, R, map2));
                    String strX3 = x(str6, N, map2);
                    Uri uriG2 = strX3 == null ? null : k0.g(str5, strX3);
                    ArrayList arrayList23 = arrayList19;
                    f0 f0Var = new f0(new f8.h(strB, strB2, Collections.EMPTY_LIST));
                    String strB3 = B(str6, P, map2);
                    strB3.getClass();
                    switch (strB3) {
                        case "SUBTITLES":
                            arrayList = arrayList15;
                            d.b bVarG = g(arrayList4, strB);
                            if (bVarG != null) {
                                String strY2 = q0.Y(bVarG.f10247b.f101540k, 3);
                                bVarN0.U(strY2);
                                strG = g0.g(strY2);
                            } else {
                                strG = null;
                            }
                            if (strG == null) {
                                strG = "text/vtt";
                            }
                            bVarN0.y0(strG).r0(f0Var);
                            if (uriG2 != null) {
                                arrayList2 = arrayList16;
                                arrayList2.add(new d.a(uriG2, bVarN0.P(), strB, strB2));
                            } else {
                                arrayList2 = arrayList16;
                                t.i("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList20 = arrayList22;
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList = arrayList15;
                            String strB4 = B(str6, V, map2);
                            if (strB4.startsWith("CC")) {
                                i11 = Integer.parseInt(strB4.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                i11 = Integer.parseInt(strB4.substring(7));
                                str2 = "application/cea-708";
                            }
                            ArrayList arrayList24 = arrayList22 == null ? new ArrayList() : arrayList22;
                            bVarN0.y0(str2).Q(i11);
                            arrayList24.add(bVarN0.P());
                            arrayList20 = arrayList24;
                            arrayList2 = arrayList16;
                            break;
                        case "AUDIO":
                            arrayList14 = arrayList14;
                            d.b bVarF = f(arrayList4, strB);
                            if (bVarF != null) {
                                String strY3 = q0.Y(bVarF.f10247b.f101540k, 1);
                                bVarN0.U(strY3);
                                strG2 = g0.g(strY3);
                            } else {
                                strG2 = null;
                            }
                            String strX4 = x(str6, f10079i, map2);
                            if (strX4 != null) {
                                bVarN0.T(Integer.parseInt(q0.F1(strX4, "/")[0]));
                                if ("audio/eac3".equals(strG2) && strX4.endsWith("/JOC")) {
                                    bVarN0.U("ec+3");
                                    strG2 = "audio/eac3-joc";
                                }
                            }
                            bVarN0.y0(strG2);
                            if (uriG2 != null) {
                                bVarN0.r0(f0Var);
                                arrayList = arrayList15;
                                arrayList.add(new d.a(uriG2, bVarN0.P(), strB, strB2));
                            } else {
                                arrayList = arrayList15;
                                if (bVarF != null) {
                                    uVarP = bVarN0.P();
                                }
                            }
                            arrayList2 = arrayList16;
                            arrayList20 = arrayList22;
                            break;
                        case "VIDEO":
                            d.b bVarH = h(arrayList4, strB);
                            if (bVarH != null) {
                                u uVar = bVarH.f10247b;
                                String strY4 = q0.Y(uVar.f101540k, 2);
                                bVarN0.U(strY4).y0(g0.g(strY4)).F0(uVar.f101551v).h0(uVar.f101552w).f0(uVar.f101555z);
                            }
                            if (uriG2 != null) {
                                bVarN0.r0(f0Var);
                                arrayList14.add(new d.a(uriG2, bVarN0.P(), strB, strB2));
                                break;
                            }
                        default:
                            arrayList2 = arrayList16;
                            arrayList = arrayList15;
                            arrayList20 = arrayList22;
                            break;
                    }
                    i19++;
                    str5 = str;
                    arrayList15 = arrayList;
                    arrayList13 = arrayList21;
                    arrayList16 = arrayList2;
                    arrayList19 = arrayList23;
                }
                return new d(str, arrayList17, arrayList19, arrayList14, arrayList15, arrayList16, arrayList12, uVarP, z11 ? Collections.EMPTY_LIST : arrayList20, z13, map2, arrayList18);
            }
            String strB5 = aVar.b();
            if (strB5.startsWith("#EXT")) {
                arrayList11.add(strB5);
            }
            boolean zStartsWith = strB5.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            if (strB5.startsWith("#EXT-X-DEFINE")) {
                map2.put(B(strB5, S, map2), B(strB5, f10068c0, map2));
            } else {
                if (strB5.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    arrayList9 = arrayList9;
                    arrayList5 = arrayList5;
                    z12 = true;
                } else if (strB5.startsWith("#EXT-X-MEDIA")) {
                    arrayList9.add(strB5);
                } else if (strB5.startsWith("#EXT-X-SESSION-KEY")) {
                    n.b bVarM = m(strB5, w(strB5, L, "identity", map2), map2);
                    if (bVarM != null) {
                        arrayList10.add(new n(n(B(strB5, K, map2)), bVarM));
                    }
                } else if (strB5.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                    boolean zContains = z11 | strB5.contains("CLOSED-CAPTIONS=NONE");
                    int i21 = zStartsWith ? 16384 : 0;
                    int iO = o(strB5, f10077h);
                    int iU = u(strB5, f10067c, -1);
                    String strX5 = x(strB5, f10081j, map2);
                    boolean z14 = z12;
                    String strX6 = x(strB5, f10083k, map2);
                    String strX7 = x(strB5, f10085l, map2);
                    if (strX7 != null) {
                        String[] strArrE1 = q0.E1(q0.F1(strX7, ",")[0], "/");
                        String str7 = strArrE1[0];
                        if (strArrE1.length > 1) {
                            str4 = strArrE1[1];
                            arrayList9 = arrayList9;
                            arrayList5 = arrayList5;
                            str3 = str7;
                            i12 = 2;
                        } else {
                            str3 = str7;
                            i12 = 2;
                        }
                        strY = q0.Y(strX6, i12);
                        if (i(strX5, strY, str3, str4)) {
                            if (str3 == null) {
                                str3 = strY;
                            }
                            strZ = q0.Z(strX6, i12);
                            if (strZ != null) {
                                strX6 = str3 + "," + strZ;
                            } else {
                                strX6 = str3;
                            }
                        }
                        strX = x(strB5, f10087m, map2);
                        if (strX != null) {
                            String[] strArrE2 = q0.E1(strX, "x");
                            i15 = Integer.parseInt(strArrE2[0]);
                            i16 = Integer.parseInt(strArrE2[1]);
                            if (i15 > 0 || i16 <= 0) {
                                i16 = -1;
                                i17 = -1;
                            } else {
                                i17 = i15;
                            }
                            i14 = i16;
                            i13 = i17;
                        } else {
                            i13 = -1;
                            i14 = -1;
                        }
                        strX2 = x(strB5, f10089n, map2);
                        if (strX2 != null) {
                            f11 = Float.parseFloat(strX2);
                        } else {
                            f11 = -1.0f;
                        }
                        String strX8 = x(strB5, f10069d, map2);
                        String strX9 = x(strB5, f10071e, map2);
                        String strX10 = x(strB5, f10073f, map2);
                        String strX11 = x(strB5, f10075g, map2);
                        if (zStartsWith) {
                            uriG = k0.g(str5, B(strB5, N, map2));
                        } else {
                            if (aVar.a()) {
                                throw ParserException.c("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            uriG = k0.g(str5, D(aVar.b(), map2));
                        }
                        uri = uriG;
                        arrayList4.add(new d.b(uri, new u.b().i0(arrayList4.size()).W("application/x-mpegURL").U(strX6).S(iU).t0(iO).F0(i13).h0(i14).f0(f11).w0(i21).P(), strX8, strX9, strX10, strX11));
                        arrayList3 = (ArrayList) map.get(uri);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            map.put(uri, arrayList3);
                        }
                        arrayList3.add(new f8.h.a(iU, iO, strX8, strX9, strX10, strX11));
                        z11 = zContains;
                        z12 = z14;
                    } else {
                        i12 = 2;
                        str3 = null;
                    }
                    str4 = null;
                    strY = q0.Y(strX6, i12);
                    if (i(strX5, strY, str3, str4)) {
                        if (str3 == null) {
                            str3 = strY;
                        }
                        strZ = q0.Z(strX6, i12);
                        if (strZ != null) {
                            strX6 = str3 + "," + strZ;
                        } else {
                            strX6 = str3;
                        }
                    }
                    strX = x(strB5, f10087m, map2);
                    if (strX != null) {
                        String[] strArrE3 = q0.E1(strX, "x");
                        i15 = Integer.parseInt(strArrE3[0]);
                        i16 = Integer.parseInt(strArrE3[1]);
                        if (i15 > 0) {
                            i16 = -1;
                            i17 = -1;
                        } else {
                            i16 = -1;
                            i17 = -1;
                        }
                        i14 = i16;
                        i13 = i17;
                    } else {
                        i13 = -1;
                        i14 = -1;
                    }
                    strX2 = x(strB5, f10089n, map2);
                    if (strX2 != null) {
                        f11 = Float.parseFloat(strX2);
                    } else {
                        f11 = -1.0f;
                    }
                    String strX12 = x(strB5, f10069d, map2);
                    String strX13 = x(strB5, f10071e, map2);
                    String strX14 = x(strB5, f10073f, map2);
                    String strX15 = x(strB5, f10075g, map2);
                    if (zStartsWith) {
                        uriG = k0.g(str5, B(strB5, N, map2));
                    } else {
                        if (aVar.a()) {
                            throw ParserException.c("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        uriG = k0.g(str5, D(aVar.b(), map2));
                    }
                    uri = uriG;
                    arrayList4.add(new d.b(uri, new u.b().i0(arrayList4.size()).W("application/x-mpegURL").U(strX6).S(iU).t0(iO).F0(i13).h0(i14).f0(f11).w0(i21).P(), strX12, strX13, strX14, strX15));
                    arrayList3 = (ArrayList) map.get(uri);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        map.put(uri, arrayList3);
                    }
                    arrayList3.add(new f8.h.a(iU, iO, strX12, strX13, strX14, strX15));
                    z11 = zContains;
                    z12 = z14;
                }
                arrayList8 = arrayList12;
                arrayList11 = arrayList11;
                arrayList10 = arrayList10;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList5 = arrayList5;
                arrayList9 = arrayList9;
            }
            arrayList9 = arrayList9;
            arrayList5 = arrayList5;
            arrayList8 = arrayList12;
            arrayList11 = arrayList11;
            arrayList10 = arrayList10;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList5 = arrayList5;
            arrayList9 = arrayList9;
        }
    }

    private static boolean s(String str, Pattern pattern, boolean z11) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z11;
    }

    private static double t(String str, Pattern pattern, double d11) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) s7.a.f(matcher.group(1))) : d11;
    }

    private static int u(String str, Pattern pattern, int i11) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) s7.a.f(matcher.group(1))) : i11;
    }

    private static long v(String str, Pattern pattern, long j11) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) s7.a.f(matcher.group(1))) : j11;
    }

    private static String w(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) s7.a.f(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : D(str2, map);
    }

    private static String x(String str, Pattern pattern, Map<String, String> map) {
        return w(str, pattern, null, map);
    }

    private static int y(String str, Map<String, String> map) {
        String strX = x(str, U, map);
        if (TextUtils.isEmpty(strX)) {
            return 0;
        }
        String[] strArrE1 = q0.E1(strX, ",");
        int i11 = q0.u(strArrE1, "public.accessibility.describes-video") ? 512 : 0;
        if (q0.u(strArrE1, "public.accessibility.transcribes-spoken-dialog")) {
            i11 |= 4096;
        }
        if (q0.u(strArrE1, "public.accessibility.describes-music-and-sound")) {
            i11 |= 1024;
        }
        return q0.u(strArrE1, "public.easy-to-read") ? i11 | PKIFailureInfo.certRevoked : i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int z(String str) {
        boolean zS = s(str, X, false);
        ?? r11 = zS;
        if (s(str, Y, false)) {
            r11 = (zS ? 1 : 0) | 2;
        }
        return s(str, W, false) ? r11 | 4 : r11;
    }

    @Override // androidx.media3.exoplayer.upstream.c.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public e a(Uri uri, InputStream inputStream) throws ParserException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!b(bufferedReader)) {
                throw ParserException.c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    q0.p(bufferedReader);
                    throw ParserException.c("Failed to parse the playlist, could not identify any tags.", null);
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        d dVarR = r(new a(arrayDeque, bufferedReader), uri.toString());
                        q0.p(bufferedReader);
                        return dVarR;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    c cVarQ = q(this.f10111a, this.f10112b, new a(arrayDeque, bufferedReader), uri.toString());
                    q0.p(bufferedReader);
                    return cVarQ;
                }
            }
        } catch (Throwable th2) {
            q0.p(bufferedReader);
            throw th2;
        }
    }

    public HlsPlaylistParser(d dVar, c cVar) {
        this.f10111a = dVar;
        this.f10112b = cVar;
    }
}
