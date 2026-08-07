package th0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lth0/a0;", "Lth0/z;", "", "k", "()J", "startCaptureTimestamp", "Lzf0/u;", DateTokenConverter.CONVERTER_KEY, "()Lzf0/u;", "cameraProperties", "f", "startSelfieTimestamp", "", "e", "()Z", "manualCaptureEnabled", "Lth0/x1$a;", "Lth0/x1$d;", "Lth0/x1$l;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a0 extends z {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public static a1.b a(a0 a0Var) {
            return z.a.a(a0Var);
        }

        public static PoseConfig b(a0 a0Var) {
            return z.a.b(a0Var);
        }

        public static a1.b c(a0 a0Var) {
            return z.a.c(a0Var);
        }

        public static boolean d(a0 a0Var) {
            PoseConfig poseConfigJ = a0Var.j();
            if (!a0Var.a() || poseConfigJ.getManualCaptureEnabled()) {
                return (a0Var.a() && poseConfigJ.getAutoCaptureEnabled() && System.currentTimeMillis() - a0Var.k() <= poseConfigJ.getManualCaptureDelayMs()) ? false : true;
            }
            return false;
        }
    }

    zf0.u d();

    boolean e();

    long f();

    long k();
}
