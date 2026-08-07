package um0;

import io.reactivex.rxjava3.core.h;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qm0.d;
import rm0.g;

/* JADX INFO: loaded from: classes9.dex */
public final class c<T> extends um0.a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final nm0.c<T> f116476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<Runnable> f116477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f116478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile boolean f116479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Throwable f116480f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    volatile boolean f116482h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f116486l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final AtomicReference<nr0.b<? super T>> f116481g = new AtomicReference<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final AtomicBoolean f116483i = new AtomicBoolean();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final qm0.a<T> f116484j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final AtomicLong f116485k = new AtomicLong();

    final class a extends qm0.a<T> {
        a() {
        }

        @Override // nr0.c
        public void cancel() {
            if (c.this.f116482h) {
                return;
            }
            c.this.f116482h = true;
            c.this.C();
            c.this.f116481g.lazySet(null);
            if (c.this.f116484j.getAndIncrement() == 0) {
                c.this.f116481g.lazySet(null);
                c cVar = c.this;
                if (cVar.f116486l) {
                    return;
                }
                cVar.f116476b.clear();
            }
        }

        @Override // fm0.h
        public void clear() {
            c.this.f116476b.clear();
        }

        @Override // fm0.h
        public boolean isEmpty() {
            return c.this.f116476b.isEmpty();
        }

        @Override // fm0.h
        public T poll() {
            return c.this.f116476b.poll();
        }

        @Override // nr0.c
        public void request(long j11) {
            if (d.validate(j11)) {
                rm0.c.a(c.this.f116485k, j11);
                c.this.D();
            }
        }

        @Override // fm0.d
        public int requestFusion(int i11) {
            if ((i11 & 2) == 0) {
                return 0;
            }
            c.this.f116486l = true;
            return 2;
        }
    }

    c(int i11, Runnable runnable, boolean z11) {
        this.f116476b = new nm0.c<>(i11);
        this.f116477c = new AtomicReference<>(runnable);
        this.f116478d = z11;
    }

    public static <T> c<T> B() {
        return new c<>(h.b(), null, true);
    }

    boolean A(boolean z11, boolean z12, boolean z13, nr0.b<? super T> bVar, nm0.c<T> cVar) {
        if (this.f116482h) {
            cVar.clear();
            this.f116481g.lazySet(null);
            return true;
        }
        if (!z12) {
            return false;
        }
        if (z11 && this.f116480f != null) {
            cVar.clear();
            this.f116481g.lazySet(null);
            bVar.onError(this.f116480f);
            return true;
        }
        if (!z13) {
            return false;
        }
        Throwable th2 = this.f116480f;
        this.f116481g.lazySet(null);
        if (th2 != null) {
            bVar.onError(th2);
        } else {
            bVar.onComplete();
        }
        return true;
    }

    void C() {
        Runnable andSet = this.f116477c.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    void D() {
        if (this.f116484j.getAndIncrement() != 0) {
            return;
        }
        nr0.b<? super T> bVar = this.f116481g.get();
        int iAddAndGet = 1;
        while (bVar == null) {
            iAddAndGet = this.f116484j.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                bVar = this.f116481g.get();
            }
        }
        if (this.f116486l) {
            E(bVar);
        } else {
            F(bVar);
        }
    }

    void E(nr0.b<? super T> bVar) {
        nm0.c<T> cVar = this.f116476b;
        boolean z11 = this.f116478d;
        int iAddAndGet = 1;
        while (!this.f116482h) {
            boolean z12 = this.f116479e;
            if (!z11 && z12 && this.f116480f != null) {
                cVar.clear();
                this.f116481g.lazySet(null);
                bVar.onError(this.f116480f);
                return;
            }
            bVar.onNext(null);
            if (z12) {
                this.f116481g.lazySet(null);
                Throwable th2 = this.f116480f;
                if (th2 != null) {
                    bVar.onError(th2);
                    return;
                } else {
                    bVar.onComplete();
                    return;
                }
            }
            iAddAndGet = this.f116484j.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        this.f116481g.lazySet(null);
    }

    void F(nr0.b<? super T> bVar) {
        nm0.c<T> cVar = this.f116476b;
        boolean z11 = !this.f116478d;
        int iAddAndGet = 1;
        do {
            long j11 = this.f116485k.get();
            long j12 = 0;
            while (j11 != j12) {
                boolean z12 = this.f116479e;
                T tPoll = cVar.poll();
                boolean z13 = tPoll == null;
                if (A(z11, z12, z13, bVar, cVar)) {
                    return;
                }
                if (z13) {
                    break;
                }
                bVar.onNext(tPoll);
                j12++;
            }
            if (j11 == j12 && A(z11, this.f116479e, cVar.isEmpty(), bVar, cVar)) {
                return;
            }
            if (j12 != 0 && j11 != Long.MAX_VALUE) {
                this.f116485k.addAndGet(-j12);
            }
            iAddAndGet = this.f116484j.addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // nr0.b
    public void onComplete() {
        if (this.f116479e || this.f116482h) {
            return;
        }
        this.f116479e = true;
        C();
        D();
    }

    @Override // nr0.b
    public void onError(Throwable th2) {
        g.c(th2, "onError called with a null Throwable.");
        if (this.f116479e || this.f116482h) {
            tm0.a.r(th2);
            return;
        }
        this.f116480f = th2;
        this.f116479e = true;
        C();
        D();
    }

    @Override // nr0.b
    public void onNext(T t11) {
        g.c(t11, "onNext called with a null value.");
        if (this.f116479e || this.f116482h) {
            return;
        }
        this.f116476b.offer(t11);
        D();
    }

    @Override // nr0.b
    public void onSubscribe(nr0.c cVar) {
        if (this.f116479e || this.f116482h) {
            cVar.cancel();
        } else {
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.rxjava3.core.h
    protected void y(nr0.b<? super T> bVar) {
        if (this.f116483i.get() || !this.f116483i.compareAndSet(false, true)) {
            qm0.c.error(new IllegalStateException("This processor allows only a single Subscriber"), bVar);
            return;
        }
        bVar.onSubscribe(this.f116484j);
        this.f116481g.set(bVar);
        if (this.f116482h) {
            this.f116481g.lazySet(null);
        } else {
            D();
        }
    }
}
