package i0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ScheduledExecutorService f74025a;

    private h() {
    }

    static ScheduledExecutorService a() {
        if (f74025a != null) {
            return f74025a;
        }
        synchronized (h.class) {
            try {
                if (f74025a == null) {
                    f74025a = new e(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f74025a;
    }
}
