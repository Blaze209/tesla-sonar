package i1;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.h3;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import c0.y0;
import g1.l1;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l1 f74054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h3 f74055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CameraUseInconsistentTimebaseQuirk f74056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f74057d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h3 f74058e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f74059a;

        static {
            int[] iArr = new int[h3.values().length];
            f74059a = iArr;
            try {
                iArr[h3.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74059a[h3.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public f(@NonNull l1 l1Var, @NonNull h3 h3Var, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.f74054a = l1Var;
        this.f74055b = h3Var;
        this.f74056c = cameraUseInconsistentTimebaseQuirk;
    }

    private long a() {
        long j11 = Long.MAX_VALUE;
        long j12 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            long jB = this.f74054a.b();
            long jA = this.f74054a.a();
            long jB2 = this.f74054a.b();
            long j13 = jB2 - jB;
            if (i11 == 0 || j13 < j11) {
                j12 = jA - ((jB + jB2) >> 1);
                j11 = j13;
            }
        }
        return Math.max(0L, j12);
    }

    private boolean c() {
        return this.f74054a.a() - this.f74054a.b() > 3000000;
    }

    private boolean d(long j11) {
        return Math.abs(j11 - this.f74054a.a()) < Math.abs(j11 - this.f74054a.b());
    }

    @NonNull
    private h3 e(long j11) {
        boolean z11;
        String str;
        if (this.f74056c != null) {
            y0.l("VideoTimebaseConverter", "CameraUseInconsistentTimebaseQuirk is enabled");
            z11 = false;
        } else {
            if (!c()) {
                return this.f74055b;
            }
            z11 = true;
        }
        h3 h3Var = d(j11) ? h3.REALTIME : h3.UPTIME;
        if (!z11 || h3Var == this.f74055b) {
            y0.a("VideoTimebaseConverter", "Detect input timebase = " + h3Var);
            return h3Var;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            str = ", SOC: " + Build.SOC_MODEL;
        } else {
            str = "";
        }
        y0.c("VideoTimebaseConverter", String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i11), str, this.f74055b, h3Var));
        return h3Var;
    }

    public long b(long j11) {
        if (this.f74058e == null) {
            this.f74058e = e(j11);
        }
        int i11 = a.f74059a[this.f74058e.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return j11;
            }
            throw new AssertionError("Unknown timebase: " + this.f74058e);
        }
        if (this.f74057d == -1) {
            this.f74057d = a();
            y0.a("VideoTimebaseConverter", "mUptimeToRealtimeOffsetUs = " + this.f74057d);
        }
        return j11 - this.f74057d;
    }
}
