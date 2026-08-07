package nk;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AtomicInteger f95083a = new AtomicInteger(0);

    public void a() {
        if (this.f95083a.compareAndSet(0, 2)) {
            d();
        }
    }

    protected abstract void b(T t11);

    protected abstract T c();

    protected abstract void d();

    protected abstract void e(Exception exc);

    protected abstract void f(T t11);

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f95083a.compareAndSet(0, 1)) {
            try {
                T tC = c();
                this.f95083a.set(3);
                try {
                    f(tC);
                } finally {
                    b(tC);
                }
            } catch (Exception e11) {
                this.f95083a.set(4);
                e(e11);
            }
        }
    }
}
