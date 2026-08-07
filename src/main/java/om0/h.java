package om0;

import io.reactivex.rxjava3.core.t;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class h extends t.c implements am0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f98128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f98129b;

    public h(ThreadFactory threadFactory) {
        this.f98128a = n.a(threadFactory);
    }

    public m a(Runnable runnable, long j11, TimeUnit timeUnit, am0.c cVar) {
        m mVar = new m(tm0.a.t(runnable), cVar);
        if (cVar != null && !cVar.b(mVar)) {
            return mVar;
        }
        try {
            mVar.a(j11 <= 0 ? this.f98128a.submit((Callable) mVar) : this.f98128a.schedule((Callable) mVar, j11, timeUnit));
            return mVar;
        } catch (RejectedExecutionException e11) {
            if (cVar != null) {
                cVar.e(mVar);
            }
            tm0.a.r(e11);
            return mVar;
        }
    }

    public am0.b b(Runnable runnable, long j11, TimeUnit timeUnit) {
        l lVar = new l(tm0.a.t(runnable), true);
        try {
            lVar.b(j11 <= 0 ? this.f98128a.submit(lVar) : this.f98128a.schedule(lVar, j11, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e11) {
            tm0.a.r(e11);
            return dm0.c.INSTANCE;
        }
    }

    @Override // am0.b
    public void dispose() {
        if (this.f98129b) {
            return;
        }
        this.f98129b = true;
        this.f98128a.shutdownNow();
    }

    public am0.b e(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        Runnable runnableT = tm0.a.t(runnable);
        if (j12 <= 0) {
            e eVar = new e(runnableT, this.f98128a);
            try {
                eVar.b(j11 <= 0 ? this.f98128a.submit(eVar) : this.f98128a.schedule(eVar, j11, timeUnit));
                return eVar;
            } catch (RejectedExecutionException e11) {
                tm0.a.r(e11);
                return dm0.c.INSTANCE;
            }
        }
        k kVar = new k(runnableT, true);
        try {
            kVar.b(this.f98128a.scheduleAtFixedRate(kVar, j11, j12, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e12) {
            tm0.a.r(e12);
            return dm0.c.INSTANCE;
        }
    }

    public void f() {
        if (this.f98129b) {
            return;
        }
        this.f98129b = true;
        this.f98128a.shutdown();
    }

    @Override // am0.b
    public boolean isDisposed() {
        return this.f98129b;
    }

    @Override // io.reactivex.rxjava3.core.t.c
    public am0.b schedule(Runnable runnable) {
        return schedule(runnable, 0L, null);
    }

    @Override // io.reactivex.rxjava3.core.t.c
    public am0.b schedule(Runnable runnable, long j11, TimeUnit timeUnit) {
        return this.f98129b ? dm0.c.INSTANCE : a(runnable, j11, timeUnit, null);
    }
}
