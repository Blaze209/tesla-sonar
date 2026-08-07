package wm0;

import androidx.camera.view.i;
import fm0.h;
import io.reactivex.rxjava3.core.o;
import io.reactivex.rxjava3.core.s;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rm0.g;

/* JADX INFO: loaded from: classes9.dex */
public final class f<T> extends e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final nm0.c<T> f122080a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<Runnable> f122082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f122083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile boolean f122084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile boolean f122085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Throwable f122086g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f122089j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<s<? super T>> f122081b = new AtomicReference<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final AtomicBoolean f122087h = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final gm0.b<T> f122088i = new a();

    final class a extends gm0.b<T> {
        a() {
        }

        @Override // fm0.h
        public void clear() {
            f.this.f122080a.clear();
        }

        @Override // am0.b
        public void dispose() {
            if (f.this.f122084e) {
                return;
            }
            f.this.f122084e = true;
            f.this.d0();
            f.this.f122081b.lazySet(null);
            if (f.this.f122088i.getAndIncrement() == 0) {
                f.this.f122081b.lazySet(null);
                f fVar = f.this;
                if (fVar.f122089j) {
                    return;
                }
                fVar.f122080a.clear();
            }
        }

        @Override // am0.b
        public boolean isDisposed() {
            return f.this.f122084e;
        }

        @Override // fm0.h
        public boolean isEmpty() {
            return f.this.f122080a.isEmpty();
        }

        @Override // fm0.h
        public T poll() {
            return f.this.f122080a.poll();
        }

        @Override // fm0.d
        public int requestFusion(int i11) {
            if ((i11 & 2) == 0) {
                return 0;
            }
            f.this.f122089j = true;
            return 2;
        }
    }

    f(int i11, Runnable runnable, boolean z11) {
        this.f122080a = new nm0.c<>(i11);
        this.f122082c = new AtomicReference<>(runnable);
        this.f122083d = z11;
    }

    public static <T> f<T> c0() {
        return new f<>(o.b(), null, true);
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void Q(s<? super T> sVar) {
        if (this.f122087h.get() || !this.f122087h.compareAndSet(false, true)) {
            dm0.c.error(new IllegalStateException("Only a single observer allowed."), sVar);
            return;
        }
        sVar.onSubscribe(this.f122088i);
        this.f122081b.lazySet(sVar);
        if (this.f122084e) {
            this.f122081b.lazySet(null);
        } else {
            e0();
        }
    }

    @Override // wm0.e
    public boolean Y() {
        return this.f122085f && this.f122086g == null;
    }

    @Override // wm0.e
    public boolean Z() {
        return this.f122081b.get() != null;
    }

    @Override // wm0.e
    public boolean a0() {
        return this.f122085f && this.f122086g != null;
    }

    void d0() {
        Runnable runnable = this.f122082c.get();
        if (runnable == null || !i.a(this.f122082c, runnable, null)) {
            return;
        }
        runnable.run();
    }

    void e0() {
        if (this.f122088i.getAndIncrement() != 0) {
            return;
        }
        s<? super T> sVar = this.f122081b.get();
        int iAddAndGet = 1;
        while (sVar == null) {
            iAddAndGet = this.f122088i.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                sVar = this.f122081b.get();
            }
        }
        if (this.f122089j) {
            f0(sVar);
        } else {
            g0(sVar);
        }
    }

    void f0(s<? super T> sVar) {
        nm0.c<T> cVar = this.f122080a;
        boolean z11 = this.f122083d;
        int iAddAndGet = 1;
        while (!this.f122084e) {
            boolean z12 = this.f122085f;
            if (!z11 && z12 && i0(cVar, sVar)) {
                return;
            }
            sVar.onNext(null);
            if (z12) {
                h0(sVar);
                return;
            } else {
                iAddAndGet = this.f122088i.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        this.f122081b.lazySet(null);
    }

    void g0(s<? super T> sVar) {
        nm0.c<T> cVar = this.f122080a;
        boolean z11 = this.f122083d;
        boolean z12 = true;
        int iAddAndGet = 1;
        while (!this.f122084e) {
            boolean z13 = this.f122085f;
            T tPoll = this.f122080a.poll();
            boolean z14 = tPoll == null;
            if (z13) {
                if (!z11 && z12) {
                    if (i0(cVar, sVar)) {
                        return;
                    } else {
                        z12 = false;
                    }
                }
                if (z14) {
                    h0(sVar);
                    return;
                }
            }
            if (z14) {
                iAddAndGet = this.f122088i.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                sVar.onNext(tPoll);
            }
        }
        this.f122081b.lazySet(null);
        cVar.clear();
    }

    void h0(s<? super T> sVar) {
        this.f122081b.lazySet(null);
        Throwable th2 = this.f122086g;
        if (th2 != null) {
            sVar.onError(th2);
        } else {
            sVar.onComplete();
        }
    }

    boolean i0(h<T> hVar, s<? super T> sVar) {
        Throwable th2 = this.f122086g;
        if (th2 == null) {
            return false;
        }
        this.f122081b.lazySet(null);
        hVar.clear();
        sVar.onError(th2);
        return true;
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onComplete() {
        if (this.f122085f || this.f122084e) {
            return;
        }
        this.f122085f = true;
        d0();
        e0();
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onError(Throwable th2) {
        g.c(th2, "onError called with a null Throwable.");
        if (this.f122085f || this.f122084e) {
            tm0.a.r(th2);
            return;
        }
        this.f122086g = th2;
        this.f122085f = true;
        d0();
        e0();
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onNext(T t11) {
        g.c(t11, "onNext called with a null value.");
        if (this.f122085f || this.f122084e) {
            return;
        }
        this.f122080a.offer(t11);
        e0();
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onSubscribe(am0.b bVar) {
        if (this.f122085f || this.f122084e) {
            bVar.dispose();
        }
    }
}
