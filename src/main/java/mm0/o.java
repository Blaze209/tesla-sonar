package mm0;

import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.y;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class o<T> extends u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y<T> f92399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f92400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f92401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final t f92402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final y<? extends T> f92403e;

    static final class a<T> extends AtomicReference<am0.b> implements w<T>, Runnable, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final w<? super T> f92404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<am0.b> f92405b = new AtomicReference<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final C1975a<T> f92406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        y<? extends T> f92407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f92408e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final TimeUnit f92409f;

        /* JADX INFO: renamed from: mm0.o$a$a, reason: collision with other inner class name */
        static final class C1975a<T> extends AtomicReference<am0.b> implements w<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final w<? super T> f92410a;

            C1975a(w<? super T> wVar) {
                this.f92410a = wVar;
            }

            @Override // io.reactivex.rxjava3.core.w
            public void onError(Throwable th2) {
                this.f92410a.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.w
            public void onSubscribe(am0.b bVar) {
                dm0.b.setOnce(this, bVar);
            }

            @Override // io.reactivex.rxjava3.core.w
            public void onSuccess(T t11) {
                this.f92410a.onSuccess(t11);
            }
        }

        a(w<? super T> wVar, y<? extends T> yVar, long j11, TimeUnit timeUnit) {
            this.f92404a = wVar;
            this.f92407d = yVar;
            this.f92408e = j11;
            this.f92409f = timeUnit;
            if (yVar != null) {
                this.f92406c = new C1975a<>(wVar);
            } else {
                this.f92406c = null;
            }
        }

        @Override // am0.b
        public void dispose() {
            dm0.b.dispose(this);
            dm0.b.dispose(this.f92405b);
            C1975a<T> c1975a = this.f92406c;
            if (c1975a != null) {
                dm0.b.dispose(c1975a);
            }
        }

        @Override // am0.b
        public boolean isDisposed() {
            return dm0.b.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onError(Throwable th2) {
            am0.b bVar = get();
            dm0.b bVar2 = dm0.b.DISPOSED;
            if (bVar == bVar2 || !compareAndSet(bVar, bVar2)) {
                tm0.a.r(th2);
            } else {
                dm0.b.dispose(this.f92405b);
                this.f92404a.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSubscribe(am0.b bVar) {
            dm0.b.setOnce(this, bVar);
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSuccess(T t11) {
            am0.b bVar = get();
            dm0.b bVar2 = dm0.b.DISPOSED;
            if (bVar == bVar2 || !compareAndSet(bVar, bVar2)) {
                return;
            }
            dm0.b.dispose(this.f92405b);
            this.f92404a.onSuccess(t11);
        }

        @Override // java.lang.Runnable
        public void run() {
            am0.b bVar = get();
            dm0.b bVar2 = dm0.b.DISPOSED;
            if (bVar == bVar2 || !compareAndSet(bVar, bVar2)) {
                return;
            }
            if (bVar != null) {
                bVar.dispose();
            }
            y<? extends T> yVar = this.f92407d;
            if (yVar == null) {
                this.f92404a.onError(new TimeoutException(rm0.g.g(this.f92408e, this.f92409f)));
            } else {
                this.f92407d = null;
                yVar.a(this.f92406c);
            }
        }
    }

    public o(y<T> yVar, long j11, TimeUnit timeUnit, t tVar, y<? extends T> yVar2) {
        this.f92399a = yVar;
        this.f92400b = j11;
        this.f92401c = timeUnit;
        this.f92402d = tVar;
        this.f92403e = yVar2;
    }

    @Override // io.reactivex.rxjava3.core.u
    protected void u(w<? super T> wVar) {
        a aVar = new a(wVar, this.f92403e, this.f92400b, this.f92401c);
        wVar.onSubscribe(aVar);
        dm0.b.replace(aVar.f92405b, this.f92402d.scheduleDirect(aVar, this.f92400b, this.f92401c));
        this.f92399a.a(aVar);
    }
}
