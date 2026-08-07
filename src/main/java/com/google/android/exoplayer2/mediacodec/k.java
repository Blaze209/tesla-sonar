package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.u0;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import ts.p0;
import ts.u;
import ts.y;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f40256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f40257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f40258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f40259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f40260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f40261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f40262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f40263k;

    private static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d11) {
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty() || k.C()) {
                return 0;
            }
            j8.f.a();
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointA = j8.e.a(i11, i12, (int) d11);
            for (int i13 = 0; i13 < supportedPerformancePoints.size(); i13++) {
                if (j8.g.a(supportedPerformancePoints.get(i13)).covers(performancePointA)) {
                    return 2;
                }
            }
            return 1;
        }
    }

    k(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f40253a = (String) ts.a.e(str);
        this.f40254b = str2;
        this.f40255c = str3;
        this.f40256d = codecCapabilities;
        this.f40260h = z11;
        this.f40261i = z12;
        this.f40262j = z13;
        this.f40257e = z14;
        this.f40258f = z15;
        this.f40259g = z16;
        this.f40263k = y.o(str2);
    }

    private static boolean A(String str) {
        return p0.f115043d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean B(String str) {
        if (p0.f115040a > 22) {
            return false;
        }
        String str2 = p0.f115043d;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean C() {
        String str = p0.f115041b;
        if (str.equals("sabrina") || str.equals("boreal")) {
            return true;
        }
        String str2 = p0.f115043d;
        return str2.startsWith("Lenovo TB-X605") || str2.startsWith("Lenovo TB-X606") || str2.startsWith("Lenovo TB-X616");
    }

    private static boolean D(String str, int i11) {
        if (!"video/hevc".equals(str) || 2 != i11) {
            return false;
        }
        String str2 = p0.f115041b;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    private static boolean E(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(p0.f115041b)) ? false : true;
    }

    public static k F(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        return new k(str, str2, str3, codecCapabilities, z11, z12, z13, (z14 || codecCapabilities == null || !i(codecCapabilities) || B(str)) ? false : true, codecCapabilities != null && u(codecCapabilities), z15 || (codecCapabilities != null && s(codecCapabilities)));
    }

    private static int b(String str, String str2, int i11) {
        int i12;
        if (i11 > 1 || ((p0.f115040a >= 26 && i11 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i11;
        }
        if ("audio/ac3".equals(str2)) {
            i12 = 6;
        } else {
            i12 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        u.i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i11 + " to " + i12 + "]");
        return i12;
    }

    private static Point d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(p0.l(i11, widthAlignment) * widthAlignment, p0.l(i12, heightAlignment) * heightAlignment);
    }

    private static boolean e(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d11) {
        Point pointD = d(videoCapabilities, i11, i12);
        int i13 = pointD.x;
        int i14 = pointD.y;
        return (d11 == -1.0d || d11 < 1.0d) ? videoCapabilities.isSizeSupported(i13, i14) : videoCapabilities.areSizeAndRateSupported(i13, i14, Math.floor(d11));
    }

    private static MediaCodecInfo.CodecProfileLevel[] g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i11;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        if (iIntValue >= 180000000) {
            i11 = 1024;
        } else if (iIntValue >= 120000000) {
            i11 = 512;
        } else if (iIntValue >= 60000000) {
            i11 = 256;
        } else if (iIntValue >= 30000000) {
            i11 = 128;
        } else if (iIntValue >= 18000000) {
            i11 = 64;
        } else if (iIntValue >= 12000000) {
            i11 = 32;
        } else if (iIntValue >= 7200000) {
            i11 = 16;
        } else if (iIntValue >= 3600000) {
            i11 = 8;
        } else if (iIntValue >= 1800000) {
            i11 = 4;
        } else {
            i11 = iIntValue >= 800000 ? 2 : 1;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i11;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return p0.f115040a >= 19 && j(codecCapabilities);
    }

    private static boolean j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean m(u0 u0Var, boolean z11) {
        Pair<Integer, Integer> pairR = MediaCodecUtil.r(u0Var);
        if (pairR == null) {
            return true;
        }
        int iIntValue = ((Integer) pairR.first).intValue();
        int iIntValue2 = ((Integer) pairR.second).intValue();
        if ("video/dolby-vision".equals(u0Var.f40712l)) {
            if (!"video/avc".equals(this.f40254b)) {
                iIntValue = "video/hevc".equals(this.f40254b) ? 2 : 8;
            }
            iIntValue2 = 0;
        }
        if (!this.f40263k && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrH = h();
        if (p0.f115040a <= 23 && "video/x-vnd.on2.vp9".equals(this.f40254b) && codecProfileLevelArrH.length == 0) {
            codecProfileLevelArrH = g(this.f40256d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrH) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z11) && !D(this.f40254b, iIntValue))) {
                return true;
            }
        }
        y("codec.profileLevel, " + u0Var.f40709i + ", " + this.f40255c);
        return false;
    }

    private boolean q(u0 u0Var) {
        return this.f40254b.equals(u0Var.f40712l) || this.f40254b.equals(MediaCodecUtil.m(u0Var));
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return p0.f115040a >= 21 && t(codecCapabilities);
    }

    private static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return p0.f115040a >= 21 && v(codecCapabilities);
    }

    private static boolean v(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void x(String str) {
        u.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f40253a + ", " + this.f40254b + "] [" + p0.f115044e + "]");
    }

    private void y(String str) {
        u.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f40253a + ", " + this.f40254b + "] [" + p0.f115044e + "]");
    }

    private static boolean z(String str) {
        return "audio/opus".equals(str);
    }

    public Point c(int i11, int i12) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f40256d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return d(videoCapabilities, i11, i12);
    }

    public fr.g f(u0 u0Var, u0 u0Var2) {
        u0 u0Var3;
        u0 u0Var4;
        int i11 = !p0.c(u0Var.f40712l, u0Var2.f40712l) ? 8 : 0;
        if (this.f40263k) {
            if (u0Var.f40720t != u0Var2.f40720t) {
                i11 |= 1024;
            }
            if (!this.f40257e && (u0Var.f40717q != u0Var2.f40717q || u0Var.f40718r != u0Var2.f40718r)) {
                i11 |= 512;
            }
            if (!p0.c(u0Var.f40724x, u0Var2.f40724x)) {
                i11 |= 2048;
            }
            if (A(this.f40253a) && !u0Var.g(u0Var2)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new fr.g(this.f40253a, u0Var, u0Var2, u0Var.g(u0Var2) ? 3 : 2, 0);
            }
            u0Var3 = u0Var;
            u0Var4 = u0Var2;
        } else {
            u0Var3 = u0Var;
            u0Var4 = u0Var2;
            if (u0Var3.f40725y != u0Var4.f40725y) {
                i11 |= 4096;
            }
            if (u0Var3.f40726z != u0Var4.f40726z) {
                i11 |= PKIFailureInfo.certRevoked;
            }
            if (u0Var3.A != u0Var4.A) {
                i11 |= 16384;
            }
            if (i11 == 0 && "audio/mp4a-latm".equals(this.f40254b)) {
                Pair<Integer, Integer> pairR = MediaCodecUtil.r(u0Var3);
                Pair<Integer, Integer> pairR2 = MediaCodecUtil.r(u0Var4);
                if (pairR != null && pairR2 != null) {
                    int iIntValue = ((Integer) pairR.first).intValue();
                    int iIntValue2 = ((Integer) pairR2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new fr.g(this.f40253a, u0Var3, u0Var4, 3, 0);
                    }
                }
            }
            if (!u0Var3.g(u0Var4)) {
                i11 |= 32;
            }
            if (z(this.f40254b)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new fr.g(this.f40253a, u0Var3, u0Var4, 1, 0);
            }
        }
        return new fr.g(this.f40253a, u0Var3, u0Var4, 0, i11);
    }

    public MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f40256d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean k(int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f40256d;
        if (codecCapabilities == null) {
            y("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            y("channelCount.aCaps");
            return false;
        }
        if (b(this.f40253a, this.f40254b, audioCapabilities.getMaxInputChannelCount()) >= i11) {
            return true;
        }
        y("channelCount.support, " + i11);
        return false;
    }

    public boolean l(int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f40256d;
        if (codecCapabilities == null) {
            y("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            y("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i11)) {
            return true;
        }
        y("sampleRate.support, " + i11);
        return false;
    }

    public boolean n(u0 u0Var) {
        return q(u0Var) && m(u0Var, false);
    }

    public boolean o(u0 u0Var) {
        int i11;
        int i12;
        int i13;
        if (!q(u0Var) || !m(u0Var, true)) {
            return false;
        }
        if (!this.f40263k) {
            return p0.f115040a < 21 || (((i11 = u0Var.f40726z) == -1 || l(i11)) && ((i12 = u0Var.f40725y) == -1 || k(i12)));
        }
        int i14 = u0Var.f40717q;
        if (i14 <= 0 || (i13 = u0Var.f40718r) <= 0) {
            return true;
        }
        if (p0.f115040a >= 21) {
            return w(i14, i13, u0Var.f40719s);
        }
        boolean z11 = i14 * i13 <= MediaCodecUtil.L();
        if (!z11) {
            y("legacyFrameSize, " + u0Var.f40717q + "x" + u0Var.f40718r);
        }
        return z11;
    }

    public boolean p() {
        if (p0.f115040a >= 29 && "video/x-vnd.on2.vp9".equals(this.f40254b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean r(u0 u0Var) {
        if (this.f40263k) {
            return this.f40257e;
        }
        Pair<Integer, Integer> pairR = MediaCodecUtil.r(u0Var);
        return pairR != null && ((Integer) pairR.first).intValue() == 42;
    }

    public String toString() {
        return this.f40253a;
    }

    public boolean w(int i11, int i12, double d11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f40256d;
        if (codecCapabilities == null) {
            y("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            y("sizeAndRate.vCaps");
            return false;
        }
        if (p0.f115040a >= 29) {
            int iA = a.a(videoCapabilities, i11, i12, d11);
            if (iA == 2) {
                return true;
            }
            if (iA == 1) {
                y("sizeAndRate.cover, " + i11 + "x" + i12 + "@" + d11);
                return false;
            }
        }
        if (!e(videoCapabilities, i11, i12, d11)) {
            if (i11 >= i12 || !E(this.f40253a) || !e(videoCapabilities, i12, i11, d11)) {
                y("sizeAndRate.support, " + i11 + "x" + i12 + "@" + d11);
                return false;
            }
            x("sizeAndRate.rotated, " + i11 + "x" + i12 + "@" + d11);
        }
        return true;
    }
}
