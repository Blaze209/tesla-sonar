package h0;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.utils.InterruptedRuntimeException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static /* synthetic */ void a(Runnable runnable, CountDownLatch countDownLatch) {
        try {
            runnable.run();
        } finally {
            countDownLatch.countDown();
        }
    }

    public static void b() {
        u5.h.j(d(), "Not in application's main thread");
    }

    @NonNull
    private static Handler c() {
        return new Handler(Looper.getMainLooper());
    }

    public static boolean d() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void e(@NonNull Runnable runnable) {
        if (d()) {
            runnable.run();
        } else {
            u5.h.j(c().post(runnable), "Unable to post to main thread");
        }
    }

    public static void f(@NonNull final Runnable runnable) {
        if (d()) {
            runnable.run();
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        u5.h.j(c().post(new Runnable() { // from class: h0.q
            @Override // java.lang.Runnable
            public final void run() {
                r.a(runnable, countDownLatch);
            }
        }), "Unable to post to main thread");
        try {
            if (countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
            } else {
                throw new IllegalStateException("Timeout to wait main thread execution");
            }
        } catch (InterruptedException e11) {
            throw new InterruptedRuntimeException(e11);
        }
    }
}
