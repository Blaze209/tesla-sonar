package om0;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends a implements Callable<Void> {
    public l(Runnable runnable, boolean z11) {
        super(runnable, z11);
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Void call() {
        this.f98062c = Thread.currentThread();
        try {
            try {
                this.f98060a.run();
                return null;
            } finally {
                lazySet(a.f98058d);
                this.f98062c = null;
            }
        } catch (Throwable th2) {
            tm0.a.r(th2);
            throw th2;
        }
    }

    @Override // om0.a, java.util.concurrent.atomic.AtomicReference
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
