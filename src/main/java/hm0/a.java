package hm0;

import java.util.concurrent.atomic.AtomicReference;
import rm0.g;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends io.reactivex.rxjava3.core.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.e f73180a;

    /* JADX INFO: renamed from: hm0.a$a, reason: collision with other inner class name */
    static final class C1539a extends AtomicReference<am0.b> implements io.reactivex.rxjava3.core.c, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.d f73181a;

        C1539a(io.reactivex.rxjava3.core.d dVar) {
            this.f73181a = dVar;
        }

        @Override // io.reactivex.rxjava3.core.c
        public boolean a(Throwable th2) {
            am0.b andSet;
            if (th2 == null) {
                th2 = g.b("onError called with a null Throwable.");
            }
            am0.b bVar = get();
            dm0.b bVar2 = dm0.b.DISPOSED;
            if (bVar == bVar2 || (andSet = getAndSet(bVar2)) == bVar2) {
                return false;
            }
            try {
                this.f73181a.onError(th2);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.c
        public void b(cm0.e eVar) {
            f(new dm0.a(eVar));
        }

        @Override // am0.b
        public void dispose() {
            dm0.b.dispose(this);
        }

        public void e(Throwable th2) {
            if (a(th2)) {
                return;
            }
            tm0.a.r(th2);
        }

        public void f(am0.b bVar) {
            dm0.b.set(this, bVar);
        }

        @Override // am0.b
        public boolean isDisposed() {
            return dm0.b.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.c
        public void onComplete() {
            am0.b andSet;
            am0.b bVar = get();
            dm0.b bVar2 = dm0.b.DISPOSED;
            if (bVar == bVar2 || (andSet = getAndSet(bVar2)) == bVar2) {
                return;
            }
            try {
                this.f73181a.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C1539a.class.getSimpleName(), super.toString());
        }
    }

    public a(io.reactivex.rxjava3.core.e eVar) {
        this.f73180a = eVar;
    }

    @Override // io.reactivex.rxjava3.core.b
    protected void j(io.reactivex.rxjava3.core.d dVar) {
        C1539a c1539a = new C1539a(dVar);
        dVar.onSubscribe(c1539a);
        try {
            this.f73180a.a(c1539a);
        } catch (Throwable th2) {
            bm0.a.b(th2);
            c1539a.e(th2);
        }
    }
}
