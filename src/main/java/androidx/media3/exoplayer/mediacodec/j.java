package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Objects;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p7.g0;
import p7.u;
import s7.q0;
import s7.t;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f10558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f10564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f10565k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f10566l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f10569o = -3.4028235E38f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f10567m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f10568n = -1;

    j(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f10555a = (String) s7.a.f(str);
        this.f10556b = str2;
        this.f10557c = str3;
        this.f10558d = codecCapabilities;
        this.f10562h = z11;
        this.f10563i = z12;
        this.f10564j = z13;
        this.f10559e = z14;
        this.f10560f = z15;
        this.f10561g = z16;
        this.f10565k = z17;
        this.f10566l = g0.t(str2);
    }

    private static boolean A() {
        String str = Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals("OPPO") || str.equals("realme") || str.equals("motorola") || str.equals("LENOVO");
    }

    private static boolean B(String str) {
        return false;
    }

    private static boolean C(String str, int i11) {
        if (!"video/hevc".equals(str) || 2 != i11) {
            return false;
        }
        String str2 = Build.DEVICE;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    private static boolean D(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
    }

    public static j E(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        return new j(str, str2, str3, codecCapabilities, z11, z12, z13, (z14 || codecCapabilities == null || !i(codecCapabilities) || B(str)) ? false : true, codecCapabilities != null && u(codecCapabilities), z15 || (codecCapabilities != null && t(codecCapabilities)), n(codecCapabilities));
    }

    private static int a(String str, String str2, int i11) {
        int i12;
        if (i11 > 1 || ((Build.VERSION.SDK_INT >= 26 && i11 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i11;
        }
        if ("audio/ac3".equals(str2)) {
            i12 = 6;
        } else {
            i12 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        t.i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i11 + " to " + i12 + "]");
        return i12;
    }

    private static Point b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(q0.n(i11, widthAlignment) * widthAlignment, q0.n(i12, heightAlignment) * heightAlignment);
    }

    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d11) {
        Point pointB = b(videoCapabilities, i11, i12);
        int i13 = pointB.x;
        int i14 = pointB.y;
        if (d11 == -1.0d || d11 < 1.0d) {
            return videoCapabilities.isSizeSupported(i13, i14);
        }
        double dFloor = Math.floor(d11);
        if (!videoCapabilities.areSizeAndRateSupported(i13, i14, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i13, i14);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    private float f(int i11, int i12) {
        float f11 = 1024.0f;
        if (v(i11, i12, 1024.0f)) {
            return 1024.0f;
        }
        float f12 = BitmapDescriptorFactory.HUE_RED;
        while (true) {
            float f13 = f11 - f12;
            if (Math.abs(f13) <= 5.0f) {
                return f12;
            }
            float f14 = (f13 / 2.0f) + f12;
            if (v(i11, i12, f14)) {
                f12 = f14;
            } else {
                f11 = f14;
            }
        }
    }

    private static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean l(u uVar, boolean z11) {
        Pair<Integer, Integer> pairI = MediaCodecUtil.i(uVar);
        String str = uVar.f101544o;
        if (str != null && str.equals("video/mv-hevc")) {
            String strU = g0.u(this.f10557c);
            if (strU.equals("video/mv-hevc")) {
                return true;
            }
            if (strU.equals("video/hevc")) {
                pairI = MediaCodecUtil.q(uVar);
            }
        }
        if (pairI == null) {
            return true;
        }
        int iIntValue = ((Integer) pairI.first).intValue();
        int iIntValue2 = ((Integer) pairI.second).intValue();
        if ("video/dolby-vision".equals(uVar.f101544o)) {
            String str2 = this.f10556b;
            str2.getClass();
            switch (str2) {
                case "video/av01":
                case "video/hevc":
                    iIntValue2 = 0;
                    iIntValue = 2;
                    break;
                case "video/avc":
                    iIntValue = 8;
                    iIntValue2 = 0;
                    break;
            }
        }
        if (!this.f10566l && iIntValue != 42) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h()) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z11) && !C(this.f10556b, iIntValue))) {
                return true;
            }
        }
        x("codec.profileLevel, " + uVar.f101540k + ", " + this.f10557c);
        return false;
    }

    private boolean m(u uVar) {
        return (Objects.equals(uVar.f101544o, "audio/flac") && uVar.I == 22 && Build.VERSION.SDK_INT < 34 && this.f10555a.equals("c2.android.flac.decoder")) ? false : true;
    }

    private static boolean n(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !A();
    }

    private boolean r(u uVar) {
        return this.f10556b.equals(uVar.f101544o) || this.f10556b.equals(MediaCodecUtil.f(uVar));
    }

    private static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void w(String str) {
        t.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f10555a + ", " + this.f10556b + "] [" + q0.f110458e + "]");
    }

    private void x(String str) {
        t.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f10555a + ", " + this.f10556b + "] [" + q0.f110458e + "]");
    }

    private static boolean y(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean z(String str) {
        return Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public Point c(int i11, int i12) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10558d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return b(videoCapabilities, i11, i12);
    }

    public z7.c e(u uVar, u uVar2) {
        u uVar3;
        u uVar4;
        int i11;
        int i12 = !Objects.equals(uVar.f101544o, uVar2.f101544o) ? 8 : 0;
        if (this.f10566l) {
            if (uVar.A != uVar2.A) {
                i12 |= 1024;
            }
            boolean z11 = (uVar.f101551v == uVar2.f101551v && uVar.f101552w == uVar2.f101552w) ? false : true;
            if (!this.f10559e && z11) {
                i12 |= 512;
            }
            if ((!p7.i.i(uVar.E) || !p7.i.i(uVar2.E)) && !Objects.equals(uVar.E, uVar2.E)) {
                i12 |= 2048;
            }
            if (z(this.f10555a) && !uVar.h(uVar2)) {
                i12 |= 2;
            }
            int i13 = uVar.f101553x;
            if (i13 != -1 && (i11 = uVar.f101554y) != -1 && i13 == uVar2.f101553x && i11 == uVar2.f101554y && z11) {
                i12 |= 2;
            }
            if (i12 == 0) {
                return new z7.c(this.f10555a, uVar, uVar2, uVar.h(uVar2) ? 3 : 2, 0);
            }
            uVar3 = uVar;
            uVar4 = uVar2;
        } else {
            uVar3 = uVar;
            uVar4 = uVar2;
            if (uVar3.G != uVar4.G) {
                i12 |= 4096;
            }
            if (uVar3.H != uVar4.H) {
                i12 |= PKIFailureInfo.certRevoked;
            }
            if (uVar3.I != uVar4.I) {
                i12 |= 16384;
            }
            if (i12 == 0 && "audio/mp4a-latm".equals(this.f10556b)) {
                Pair<Integer, Integer> pairI = MediaCodecUtil.i(uVar3);
                Pair<Integer, Integer> pairI2 = MediaCodecUtil.i(uVar4);
                if (pairI != null && pairI2 != null) {
                    int iIntValue = ((Integer) pairI.first).intValue();
                    int iIntValue2 = ((Integer) pairI2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new z7.c(this.f10555a, uVar3, uVar4, 3, 0);
                    }
                }
            }
            if (!uVar3.h(uVar4)) {
                i12 |= 32;
            }
            if (y(this.f10556b)) {
                i12 |= 2;
            }
            if (i12 == 0) {
                return new z7.c(this.f10555a, uVar3, uVar4, 1, 0);
            }
        }
        return new z7.c(this.f10555a, uVar3, uVar4, 0, i12);
    }

    public float g(int i11, int i12) {
        if (!this.f10566l) {
            return -3.4028235E38f;
        }
        float f11 = this.f10569o;
        if (f11 != -3.4028235E38f && this.f10567m == i11 && this.f10568n == i12) {
            return f11;
        }
        float f12 = f(i11, i12);
        this.f10569o = f12;
        this.f10567m = i11;
        this.f10568n = i12;
        return f12;
    }

    public MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10558d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean j(int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10558d;
        if (codecCapabilities == null) {
            x("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            x("channelCount.aCaps");
            return false;
        }
        if (a(this.f10555a, this.f10556b, audioCapabilities.getMaxInputChannelCount()) >= i11) {
            return true;
        }
        x("channelCount.support, " + i11);
        return false;
    }

    public boolean k(int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10558d;
        if (codecCapabilities == null) {
            x("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            x("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i11)) {
            return true;
        }
        x("sampleRate.support, " + i11);
        return false;
    }

    public boolean o(u uVar) {
        return r(uVar) && l(uVar, false) && m(uVar);
    }

    public boolean p(u uVar) {
        int i11;
        int i12;
        if (!r(uVar) || !l(uVar, true) || !m(uVar)) {
            return false;
        }
        if (!this.f10566l) {
            int i13 = uVar.H;
            return (i13 == -1 || k(i13)) && ((i11 = uVar.G) == -1 || j(i11));
        }
        int i14 = uVar.f101551v;
        if (i14 <= 0 || (i12 = uVar.f101552w) <= 0) {
            return true;
        }
        return v(i14, i12, uVar.f101555z);
    }

    public boolean q() {
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(this.f10556b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean s(u uVar) {
        if (this.f10566l) {
            return this.f10559e;
        }
        Pair<Integer, Integer> pairI = MediaCodecUtil.i(uVar);
        return pairI != null && ((Integer) pairI.first).intValue() == 42;
    }

    public String toString() {
        return this.f10555a;
    }

    public boolean v(int i11, int i12, double d11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10558d;
        if (codecCapabilities == null) {
            x("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            x("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int iC = k.c(videoCapabilities, i11, i12, d11);
            if (iC == 2) {
                return true;
            }
            if (iC == 1) {
                x("sizeAndRate.cover, " + i11 + "x" + i12 + "@" + d11);
                return false;
            }
        }
        if (!d(videoCapabilities, i11, i12, d11)) {
            if (i11 >= i12 || !D(this.f10555a) || !d(videoCapabilities, i12, i11, d11)) {
                x("sizeAndRate.support, " + i11 + "x" + i12 + "@" + d11);
                return false;
            }
            w("sizeAndRate.rotated, " + i11 + "x" + i12 + "@" + d11);
        }
        return true;
    }
}
