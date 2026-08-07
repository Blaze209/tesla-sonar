package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.exoplayer2.u0;
import com.google.common.collect.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2Connection;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import ts.p0;
import ts.u;
import ts.y;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"InlinedApi"})
@Deprecated
public final class MediaCodecUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f40186a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap<b, List<k>> f40187b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f40188c = -1;

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f40189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f40190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f40191c;

        public b(String str, boolean z11, boolean z12) {
            this.f40189a = str;
            this.f40190b = z11;
            this.f40191c = z12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (TextUtils.equals(this.f40189a, bVar.f40189a) && this.f40190b == bVar.f40190b && this.f40191c == bVar.f40191c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f40189a.hashCode() + 31) * 31) + (this.f40190b ? 1231 : 1237)) * 31) + (this.f40191c ? 1231 : 1237);
        }
    }

    private interface c {
        boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        MediaCodecInfo b(int i11);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    private static final class d implements c {
        private d() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo b(int i11) {
            return MediaCodecList.getCodecInfoAt(i11);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return false;
        }
    }

    private static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f40192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f40193b;

        public e(boolean z11, boolean z12) {
            this.f40192a = (z11 || z12) ? 1 : 0;
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        private void f() {
            if (this.f40193b == null) {
                this.f40193b = new MediaCodecList(this.f40192a).getCodecInfos();
            }
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo b(int i11) {
            f();
            return this.f40193b[i11];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int d() {
            f();
            return this.f40193b.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface f<T> {
        int a(T t11);
    }

    private static Pair<Integer, Integer> A(String str, String[] strArr) {
        if (strArr.length < 3) {
            u.i("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i11 = Integer.parseInt(strArr[1]);
            int i12 = Integer.parseInt(strArr[2]);
            int iP = P(i11);
            if (iP == -1) {
                u.i("MediaCodecUtil", "Unknown VP9 profile: " + i11);
                return null;
            }
            int iO = O(i12);
            if (iO != -1) {
                return new Pair<>(Integer.valueOf(iP), Integer.valueOf(iO));
            }
            u.i("MediaCodecUtil", "Unknown VP9 level: " + i12);
            return null;
        } catch (NumberFormatException unused) {
            u.i("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static Integer B(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "H30":
                return 2;
            case "H60":
                return 8;
            case "H63":
                return 32;
            case "H90":
                return 128;
            case "H93":
                return 512;
            case "L30":
                return 1;
            case "L60":
                return 4;
            case "L63":
                return 16;
            case "L90":
                return 64;
            case "L93":
                return 256;
            case "H120":
                return 2048;
            case "H123":
                return Integer.valueOf(PKIFailureInfo.certRevoked);
            case "H150":
                return 32768;
            case "H153":
                return 131072;
            case "H156":
                return Integer.valueOf(PKIFailureInfo.signerNotTrusted);
            case "H180":
                return Integer.valueOf(PKIFailureInfo.badSenderNonce);
            case "H183":
                return 8388608;
            case "H186":
                return 33554432;
            case "L120":
                return 1024;
            case "L123":
                return 4096;
            case "L150":
                return 16384;
            case "L153":
                return 65536;
            case "L156":
                return 262144;
            case "L180":
                return Integer.valueOf(PKIFailureInfo.badCertTemplate);
            case "L183":
                return 4194304;
            case "L186":
                return Integer.valueOf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            default:
                return null;
        }
    }

    private static boolean C(MediaCodecInfo mediaCodecInfo) {
        return p0.f115040a >= 29 && D(mediaCodecInfo);
    }

    private static boolean D(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean E(MediaCodecInfo mediaCodecInfo, String str, boolean z11, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z11 && str.endsWith(".secure"))) {
            return false;
        }
        int i11 = p0.f115040a;
        if (i11 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i11 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = p0.f115041b;
            if ("a70".equals(str3) || ("Xiaomi".equals(p0.f115042c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i11 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = p0.f115041b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i11 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = p0.f115041b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i11 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(p0.f115042c))) {
            String str6 = p0.f115041b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i11 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(p0.f115042c)) {
            String str7 = p0.f115041b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i11 <= 19 && p0.f115041b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i11 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static boolean F(MediaCodecInfo mediaCodecInfo, String str) {
        return p0.f115040a >= 29 ? G(mediaCodecInfo) : !H(mediaCodecInfo, str);
    }

    private static boolean G(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean H(MediaCodecInfo mediaCodecInfo, String str) {
        if (p0.f115040a >= 29) {
            return I(mediaCodecInfo);
        }
        if (y.l(str)) {
            return true;
        }
        String strE = ou.c.e(mediaCodecInfo.getName());
        if (strE.startsWith("arc.")) {
            return false;
        }
        return strE.startsWith("omx.google.") || strE.startsWith("omx.ffmpeg.") || (strE.startsWith("omx.sec.") && strE.contains(".sw.")) || strE.equals("omx.qcom.video.decoder.hevcswvdec") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.") || !(strE.startsWith("omx.") || strE.startsWith("c2."));
    }

    private static boolean I(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean J(MediaCodecInfo mediaCodecInfo) {
        if (p0.f115040a >= 29) {
            return K(mediaCodecInfo);
        }
        String strE = ou.c.e(mediaCodecInfo.getName());
        return (strE.startsWith("omx.google.") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.")) ? false : true;
    }

    private static boolean K(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static int L() {
        if (f40188c == -1) {
            int iMax = 0;
            k kVarS = s("video/avc", false, false);
            if (kVarS != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrH = kVarS.h();
                int length = codecProfileLevelArrH.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(h(codecProfileLevelArrH[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, p0.f115040a >= 21 ? 345600 : 172800);
            }
            f40188c = iMax;
        }
        return f40188c;
    }

    private static int M(int i11) {
        int i12 = 17;
        if (i11 != 17) {
            i12 = 20;
            if (i11 != 20) {
                i12 = 23;
                if (i11 != 23) {
                    i12 = 29;
                    if (i11 != 29) {
                        i12 = 39;
                        if (i11 != 39) {
                            i12 = 42;
                            if (i11 != 42) {
                                switch (i11) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i12;
    }

    private static <T> void N(List<T> list, final f<T> fVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.exoplayer2.mediacodec.p
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.a(fVar, obj, obj2);
            }
        });
    }

    private static int O(int i11) {
        if (i11 == 10) {
            return 1;
        }
        if (i11 == 11) {
            return 2;
        }
        if (i11 == 20) {
            return 4;
        }
        if (i11 == 21) {
            return 8;
        }
        if (i11 == 30) {
            return 16;
        }
        if (i11 == 31) {
            return 32;
        }
        if (i11 == 40) {
            return 64;
        }
        if (i11 == 41) {
            return 128;
        }
        if (i11 == 50) {
            return 256;
        }
        if (i11 == 51) {
            return 512;
        }
        switch (i11) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return PKIFailureInfo.certRevoked;
            default:
                return -1;
        }
    }

    private static int P(int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return 2;
        }
        if (i11 != 2) {
            return i11 != 3 ? -1 : 8;
        }
        return 4;
    }

    public static /* synthetic */ int a(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    public static /* synthetic */ int b(k kVar) {
        String str = kVar.f40253a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (p0.f115040a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static /* synthetic */ int c(k kVar) {
        return kVar.f40253a.startsWith("OMX.google") ? 1 : 0;
    }

    public static /* synthetic */ int d(u0 u0Var, k kVar) {
        return kVar.n(u0Var) ? 1 : 0;
    }

    private static void e(String str, List<k> list) {
        if ("audio/raw".equals(str)) {
            if (p0.f115040a < 26 && p0.f115041b.equals("R9") && list.size() == 1 && list.get(0).f40253a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(k.F("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            N(list, new f() { // from class: com.google.android.exoplayer2.mediacodec.m
                @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
                public final int a(Object obj) {
                    return MediaCodecUtil.b((k) obj);
                }
            });
        }
        int i11 = p0.f115040a;
        if (i11 < 21 && list.size() > 1) {
            String str2 = list.get(0).f40253a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                N(list, new f() { // from class: com.google.android.exoplayer2.mediacodec.n
                    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
                    public final int a(Object obj) {
                        return MediaCodecUtil.c((k) obj);
                    }
                });
            }
        }
        if (i11 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f40253a)) {
            return;
        }
        list.add(list.remove(0));
    }

    private static int f(int i11) {
        switch (i11) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return PKIFailureInfo.certRevoked;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return PKIFailureInfo.signerNotTrusted;
            case 20:
                return PKIFailureInfo.badCertTemplate;
            case 21:
                return PKIFailureInfo.badSenderNonce;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int g(int i11) {
        switch (i11) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i11) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i11) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i11) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return PKIFailureInfo.certRevoked;
                                    default:
                                        switch (i11) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int h(int i11) {
        if (i11 == 1 || i11 == 2) {
            return 25344;
        }
        switch (i11) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return PKIFailureInfo.badSenderNonce;
            case PKIFailureInfo.certRevoked /* 8192 */:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case PKIFailureInfo.signerNotTrusted /* 524288 */:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int i(int i11) {
        if (i11 == 66) {
            return 1;
        }
        if (i11 == 77) {
            return 2;
        }
        if (i11 == 88) {
            return 4;
        }
        if (i11 == 100) {
            return 8;
        }
        if (i11 == 110) {
            return 16;
        }
        if (i11 != 122) {
            return i11 != 244 ? -1 : 64;
        }
        return 32;
    }

    private static Integer j(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "01":
                return 1;
            case "02":
                return 2;
            case "03":
                return 4;
            case "04":
                return 8;
            case "05":
                return 16;
            case "06":
                return 32;
            case "07":
                return 64;
            case "08":
                return 128;
            case "09":
                return 256;
            case "10":
                return 512;
            case "11":
                return 1024;
            case "12":
                return 2048;
            case "13":
                return 4096;
            default:
                return null;
        }
    }

    private static Integer k(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 2;
            case "02":
                return 4;
            case "03":
                return 8;
            case "04":
                return 16;
            case "05":
                return 32;
            case "06":
                return 64;
            case "07":
                return 128;
            case "08":
                return 256;
            case "09":
                return 512;
            default:
                return null;
        }
    }

    private static Pair<Integer, Integer> l(String str, String[] strArr) {
        int iM;
        if (strArr.length != 3) {
            u.i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(y.f(Integer.parseInt(strArr[1], 16))) && (iM = M(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iM), 0);
            }
        } catch (NumberFormatException unused) {
            u.i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    public static String m(u0 u0Var) {
        Pair<Integer, Integer> pairR;
        if ("audio/eac3-joc".equals(u0Var.f40712l)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(u0Var.f40712l) || (pairR = r(u0Var)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairR.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static List<k> n(l lVar, u0 u0Var, boolean z11, boolean z12) {
        String strM = m(u0Var);
        return strM == null ? x.r() : lVar.a(strM, z11, z12);
    }

    private static Pair<Integer, Integer> o(String str, String[] strArr, us.c cVar) {
        int i11;
        if (strArr.length < 4) {
            u.i("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i12 = 1;
        try {
            int i13 = Integer.parseInt(strArr[1]);
            int i14 = Integer.parseInt(strArr[2].substring(0, 2));
            int i15 = Integer.parseInt(strArr[3]);
            if (i13 != 0) {
                u.i("MediaCodecUtil", "Unknown AV1 profile: " + i13);
                return null;
            }
            if (i15 != 8 && i15 != 10) {
                u.i("MediaCodecUtil", "Unknown AV1 bit depth: " + i15);
                return null;
            }
            if (i15 != 8) {
                i12 = (cVar == null || !(cVar.f116546d != null || (i11 = cVar.f116545c) == 7 || i11 == 6)) ? 2 : 4096;
            }
            int iF = f(i14);
            if (iF != -1) {
                return new Pair<>(Integer.valueOf(i12), Integer.valueOf(iF));
            }
            u.i("MediaCodecUtil", "Unknown AV1 level: " + i14);
            return null;
        } catch (NumberFormatException unused) {
            u.i("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    private static Pair<Integer, Integer> p(String str, String[] strArr) {
        int i11;
        int i12;
        if (strArr.length < 2) {
            u.i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i12 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i11 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    u.i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i13 = Integer.parseInt(strArr[1]);
                i11 = Integer.parseInt(strArr[2]);
                i12 = i13;
            }
            int i14 = i(i12);
            if (i14 == -1) {
                u.i("MediaCodecUtil", "Unknown AVC profile: " + i12);
                return null;
            }
            int iG = g(i11);
            if (iG != -1) {
                return new Pair<>(Integer.valueOf(i14), Integer.valueOf(iG));
            }
            u.i("MediaCodecUtil", "Unknown AVC level: " + i11);
            return null;
        } catch (NumberFormatException unused) {
            u.i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    private static String q(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static Pair<Integer, Integer> r(u0 u0Var) {
        String str = u0Var.f40709i;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(u0Var.f40712l)) {
            return y(u0Var.f40709i, strArrSplit);
        }
        byte b11 = 0;
        String str2 = strArrSplit[0];
        str2.getClass();
        switch (str2.hashCode()) {
            case 3004662:
                if (!str2.equals("av01")) {
                    b11 = -1;
                }
                break;
            case 3006243:
                b11 = !str2.equals("avc1") ? (byte) -1 : (byte) 1;
                break;
            case 3006244:
                b11 = !str2.equals("avc2") ? (byte) -1 : (byte) 2;
                break;
            case 3199032:
                b11 = !str2.equals("hev1") ? (byte) -1 : (byte) 3;
                break;
            case 3214780:
                b11 = !str2.equals("hvc1") ? (byte) -1 : (byte) 4;
                break;
            case 3356560:
                b11 = !str2.equals("mp4a") ? (byte) -1 : (byte) 5;
                break;
            case 3624515:
                b11 = !str2.equals("vp09") ? (byte) -1 : (byte) 6;
                break;
            default:
                b11 = -1;
                break;
        }
        switch (b11) {
            case 0:
                return o(u0Var.f40709i, strArrSplit, u0Var.f40724x);
            case 1:
            case 2:
                return p(u0Var.f40709i, strArrSplit);
            case 3:
            case 4:
                return z(u0Var.f40709i, strArrSplit, u0Var.f40724x);
            case 5:
                return l(u0Var.f40709i, strArrSplit);
            case 6:
                return A(u0Var.f40709i, strArrSplit);
            default:
                return null;
        }
    }

    public static k s(String str, boolean z11, boolean z12) {
        List<k> listT = t(str, z11, z12);
        if (listT.isEmpty()) {
            return null;
        }
        return listT.get(0);
    }

    public static synchronized List<k> t(String str, boolean z11, boolean z12) {
        try {
            b bVar = new b(str, z11, z12);
            HashMap<b, List<k>> map = f40187b;
            List<k> list = map.get(bVar);
            if (list != null) {
                return list;
            }
            int i11 = p0.f115040a;
            ArrayList<k> arrayListU = u(bVar, i11 >= 21 ? new e(z11, z12) : new d());
            if (z11 && arrayListU.isEmpty() && 21 <= i11 && i11 <= 23) {
                arrayListU = u(bVar, new d());
                if (!arrayListU.isEmpty()) {
                    u.i("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListU.get(0).f40253a);
                }
            }
            e(str, arrayListU);
            x xVarN = x.n(arrayListU);
            map.put(bVar, xVarN);
            return xVarN;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x008b A[PHI: r16
      0x008b: PHI (r16v9 boolean) = (r16v5 boolean), (r16v11 boolean) binds: [B:41:0x009b, B:33:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa A[Catch: Exception -> 0x0144, TRY_ENTER, TryCatch #4 {Exception -> 0x0144, blocks: (B:3:0x0008, B:5:0x001b, B:68:0x0119, B:8:0x002b, B:11:0x0036, B:62:0x00f2, B:65:0x00fa, B:67:0x0100, B:69:0x0121, B:70:0x0142), top: B:83:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0121 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private static ArrayList<k> u(b bVar, c cVar) throws DecoderQueryException {
        int i11;
        boolean z11;
        boolean z12;
        b bVar2 = bVar;
        try {
            ArrayList<k> arrayList = new ArrayList<>();
            String str = bVar2.f40189a;
            int iD = cVar.d();
            boolean zE = cVar.e();
            int i12 = 0;
            while (i12 < iD) {
                MediaCodecInfo mediaCodecInfoB = cVar.b(i12);
                if (C(mediaCodecInfoB)) {
                    z11 = zE;
                    i11 = i12;
                } else {
                    String name = mediaCodecInfoB.getName();
                    if (E(mediaCodecInfoB, name, zE, str)) {
                        int i13 = i12;
                        String strQ = q(mediaCodecInfoB, name, str);
                        if (strQ == null) {
                            z11 = zE;
                            i11 = i13;
                        } else {
                            boolean z13 = zE;
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoB.getCapabilitiesForType(strQ);
                                boolean zC = cVar.c("tunneled-playback", strQ, capabilitiesForType);
                                boolean zA = cVar.a("tunneled-playback", strQ, capabilitiesForType);
                                boolean z14 = bVar2.f40191c;
                                if ((z14 || !zA) && (!z14 || zC)) {
                                    boolean zC2 = cVar.c("secure-playback", strQ, capabilitiesForType);
                                    boolean zA2 = cVar.a("secure-playback", strQ, capabilitiesForType);
                                    boolean z15 = bVar2.f40190b;
                                    if ((z15 || !zA2) && (!z15 || zC2)) {
                                        try {
                                            boolean zF = F(mediaCodecInfoB, str);
                                            try {
                                                boolean zH = H(mediaCodecInfoB, str);
                                                boolean zJ = J(mediaCodecInfoB);
                                                if (z13) {
                                                    z12 = zJ;
                                                    if (bVar2.f40190b == zC2) {
                                                        z11 = z13;
                                                        boolean z16 = z12;
                                                        i11 = i13;
                                                        try {
                                                            arrayList.add(k.F(name, str, strQ, capabilitiesForType, zF, zH, z16, false, false));
                                                        } catch (Exception e11) {
                                                            e = e11;
                                                            if (p0.f115040a <= 23) {
                                                            }
                                                            u.c("MediaCodecUtil", "Failed to query codec " + r6 + " (" + strQ + ")");
                                                            throw e;
                                                        }
                                                    }
                                                } else {
                                                    z12 = zJ;
                                                }
                                                if (!z13) {
                                                    try {
                                                        if (!bVar2.f40190b) {
                                                            z11 = z13;
                                                            boolean z17 = z12;
                                                            i11 = i13;
                                                            arrayList.add(k.F(name, str, strQ, capabilitiesForType, zF, zH, z17, false, false));
                                                        }
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        i11 = i13;
                                                        z11 = z13;
                                                        if (p0.f115040a <= 23 || arrayList.isEmpty()) {
                                                            u.c("MediaCodecUtil", "Failed to query codec " + r6 + " (" + strQ + ")");
                                                            throw e;
                                                        }
                                                        u.c("MediaCodecUtil", "Skipping codec " + name + " (failed to query capabilities)");
                                                        i12 = i11 + 1;
                                                        bVar2 = bVar;
                                                        zE = z11;
                                                    }
                                                }
                                                z11 = z13;
                                                boolean z18 = z12;
                                                i11 = i13;
                                                if (!z11 && zC2) {
                                                    try {
                                                        arrayList.add(k.F(name + ".secure", str, strQ, capabilitiesForType, zF, zH, z18, false, true));
                                                        break;
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        if (p0.f115040a <= 23) {
                                                        }
                                                        u.c("MediaCodecUtil", "Failed to query codec " + r6 + " (" + strQ + ")");
                                                        throw e;
                                                    }
                                                }
                                            } catch (Exception e14) {
                                                e = e14;
                                                i11 = i13;
                                                z11 = z13;
                                            }
                                        } catch (Exception e15) {
                                            e = e15;
                                            z11 = z13;
                                            i11 = i13;
                                        }
                                    } else {
                                        i11 = i13;
                                        z11 = z13;
                                    }
                                } else {
                                    i11 = i13;
                                    z11 = z13;
                                }
                            } catch (Exception e16) {
                                e = e16;
                                i11 = i13;
                                z11 = z13;
                            }
                        }
                    } else {
                        z11 = zE;
                        i11 = i12;
                    }
                }
                i12 = i11 + 1;
                bVar2 = bVar;
                zE = z11;
            }
            return arrayList;
        } catch (Exception e17) {
            throw new DecoderQueryException(e17);
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List<k> v(l lVar, u0 u0Var, boolean z11, boolean z12) {
        List<k> listA = lVar.a(u0Var.f40712l, z11, z12);
        return x.k().j(listA).j(n(lVar, u0Var, z11, z12)).k();
    }

    public static List<k> w(List<k> list, final u0 u0Var) {
        ArrayList arrayList = new ArrayList(list);
        N(arrayList, new f() { // from class: com.google.android.exoplayer2.mediacodec.o
            @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
            public final int a(Object obj) {
                return MediaCodecUtil.d(u0Var, (k) obj);
            }
        });
        return arrayList;
    }

    public static k x() {
        return s("audio/raw", false, false);
    }

    private static Pair<Integer, Integer> y(String str, String[] strArr) {
        if (strArr.length < 3) {
            u.i("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f40186a.matcher(strArr[1]);
        if (!matcher.matches()) {
            u.i("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numK = k(strGroup);
        if (numK == null) {
            u.i("MediaCodecUtil", "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numJ = j(str2);
        if (numJ != null) {
            return new Pair<>(numK, numJ);
        }
        u.i("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    private static Pair<Integer, Integer> z(String str, String[] strArr, us.c cVar) {
        if (strArr.length < 4) {
            u.i("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i11 = 1;
        Matcher matcher = f40186a.matcher(strArr[1]);
        if (!matcher.matches()) {
            u.i("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            if (!"2".equals(strGroup)) {
                u.i("MediaCodecUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
            i11 = (cVar == null || cVar.f116545c != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        Integer numB = B(str2);
        if (numB != null) {
            return new Pair<>(Integer.valueOf(i11), numB);
        }
        u.i("MediaCodecUtil", "Unknown HEVC level string: " + str2);
        return null;
    }
}
