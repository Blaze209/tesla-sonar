package zl0;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import io.reactivex.rxjava3.core.t;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class c extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f128433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f128434b;

    private static final class a extends t.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f128435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f128436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f128437c;

        a(Handler handler, boolean z11) {
            this.f128435a = handler;
            this.f128436b = z11;
        }

        @Override // am0.b
        public void dispose() {
            this.f128437c = true;
            this.f128435a.removeCallbacksAndMessages(this);
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f128437c;
        }

        @Override // io.reactivex.rxjava3.core.t.c
        @SuppressLint({"NewApi"})
        public am0.b schedule(Runnable runnable, long j11, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f128437c) {
                return am0.b.c();
            }
            b bVar = new b(this.f128435a, tm0.a.t(runnable));
            Message messageObtain = Message.obtain(this.f128435a, bVar);
            messageObtain.obj = this;
            if (this.f128436b) {
                messageObtain.setAsynchronous(true);
            }
            this.f128435a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j11));
            if (!this.f128437c) {
                return bVar;
            }
            this.f128435a.removeCallbacks(bVar);
            return am0.b.c();
        }
    }

    private static final class b implements Runnable, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f128438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f128439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f128440c;

        b(Handler handler, Runnable runnable) {
            this.f128438a = handler;
            this.f128439b = runnable;
        }

        @Override // am0.b
        public void dispose() {
            this.f128438a.removeCallbacks(this);
            this.f128440c = true;
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f128440c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f128439b.run();
            } catch (Throwable th2) {
                tm0.a.r(th2);
            }
        }
    }

    c(Handler handler, boolean z11) {
        this.f128433a = handler;
        this.f128434b = z11;
    }

    @Override // io.reactivex.rxjava3.core.t
    public t.c createWorker() {
        return new a(this.f128433a, this.f128434b);
    }

    @Override // io.reactivex.rxjava3.core.t
    @SuppressLint({"NewApi"})
    public am0.b scheduleDirect(Runnable runnable, long j11, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        b bVar = new b(this.f128433a, tm0.a.t(runnable));
        Message messageObtain = Message.obtain(this.f128433a, bVar);
        if (this.f128434b) {
            messageObtain.setAsynchronous(true);
        }
        this.f128433a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j11));
        return bVar;
    }
}
