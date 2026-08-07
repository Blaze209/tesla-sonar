package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;
import p7.u;

/* JADX INFO: loaded from: classes3.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f10570a;

    private static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d11) {
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            j8.f.a();
            int iC = c(supportedPerformancePoints, j8.e.a(i11, i12, (int) d11));
            if (iC == 1 && k.f10570a == null) {
                Boolean unused = k.f10570a = Boolean.valueOf(d());
                if (k.f10570a.booleanValue()) {
                    return 0;
                }
            }
            return iC;
        }

        private static int b(boolean z11) {
            MediaCodecInfo.VideoCapabilities videoCapabilities;
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
            try {
                u uVarP = new u.b().y0("video/avc").P();
                if (uVarP.f101544o != null) {
                    List<j> listM = MediaCodecUtil.m(l.f10571a, uVarP, z11, false);
                    for (int i11 = 0; i11 < listM.size(); i11++) {
                        if (listM.get(i11).f10558d != null && (videoCapabilities = listM.get(i11).f10558d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            j8.f.a();
                            return c(supportedPerformancePoints, j8.e.a(1280, 720, 60));
                        }
                    }
                }
            } catch (MediaCodecUtil.DecoderQueryException unused) {
            }
            return 0;
        }

        private static int c(List<MediaCodecInfo.VideoCapabilities.PerformancePoint> list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (j8.g.a(list.get(i11)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean d() {
            if (Build.VERSION.SDK_INT >= 35) {
                return false;
            }
            int iB = b(false);
            int iB2 = b(true);
            if (iB == 0) {
                return true;
            }
            if (iB2 == 0) {
                return iB != 2;
            }
            return (iB == 2 && iB2 == 2) ? false : true;
        }
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d11) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = f10570a;
        if (bool == null || !bool.booleanValue()) {
            return a.a(videoCapabilities, i11, i12, d11);
        }
        return 0;
    }
}
