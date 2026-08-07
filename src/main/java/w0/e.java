package w0;

import android.os.SystemClock;
import androidx.camera.extensions.internal.compat.quirk.CrashWhenOnDisableTooSoon;
import c0.y0;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f120246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f120247b;

    public e() {
        this(androidx.camera.extensions.internal.compat.quirk.a.b(CrashWhenOnDisableTooSoon.class) != null);
    }

    private void a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f120247b;
        while (true) {
            long j12 = jElapsedRealtime - j11;
            if (j12 >= 100) {
                return;
            }
            long j13 = 100 - j12;
            try {
                y0.a("OnEnableDisableSessionDurationCheck", "onDisableSession too soon, wait " + j13 + " ms");
                Thread.sleep(j13);
                jElapsedRealtime = SystemClock.elapsedRealtime();
                j11 = this.f120247b;
            } catch (InterruptedException unused) {
                y0.c("OnEnableDisableSessionDurationCheck", "sleep interrupted");
                return;
            }
        }
    }

    public void b() {
        if (this.f120246a) {
            a();
        }
    }

    public void c() {
        if (this.f120246a) {
            this.f120247b = SystemClock.elapsedRealtime();
        }
    }

    e(boolean z11) {
        this.f120247b = 0L;
        this.f120246a = z11;
    }
}
