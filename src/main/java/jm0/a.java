package jm0;

import am0.b;
import cm0.e;
import io.reactivex.rxjava3.core.j;
import io.reactivex.rxjava3.core.k;
import io.reactivex.rxjava3.core.l;
import io.reactivex.rxjava3.core.m;
import java.util.concurrent.atomic.AtomicReference;
import rm0.g;

/* JADX INFO: loaded from: classes9.dex */
public final class a<T> extends j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final m<T> f84007a;

    /* JADX INFO: renamed from: jm0.a$a, reason: collision with other inner class name */
    static final class C1776a<T> extends AtomicReference<b> implements k<T>, b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final l<? super T> f84008a;

        C1776a(l<? super T> lVar) {
            this.f84008a = lVar;
        }

        @Override // io.reactivex.rxjava3.core.k
        public boolean a(Throwable th2) {
            b andSet;
            if (th2 == null) {
                th2 = g.b("onError called with a null Throwable.");
            }
            b bVar = get();
            dm0.b bVar2 = dm0.b.DISPOSED;
            if (bVar == bVar2 || (andSet = getAndSet(bVar2)) == bVar2) {
                return false;
            }
            try {
                this.f84008a.onError(th2);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.k
        public void b(e eVar) {
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

        public void f(b bVar) {
            dm0.b.set(this, bVar);
        }

        @Override // am0.b
        public boolean isDisposed() {
            return dm0.b.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onComplete() {
            b andSet;
            b bVar = get();
            dm0.b bVar2 = dm0.b.DISPOSED;
            if (bVar == bVar2 || (andSet = getAndSet(bVar2)) == bVar2) {
                return;
            }
            try {
                this.f84008a.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onSuccess(T t11) {
            b andSet;
            b bVar = get();
            dm0.b bVar2 = dm0.b.DISPOSED;
            if (bVar == bVar2 || (andSet = getAndSet(bVar2)) == bVar2) {
                return;
            }
            try {
                if (t11 == null) {
                    this.f84008a.onError(g.b("onSuccess called with a null value."));
                } else {
                    this.f84008a.onSuccess(t11);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th2) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th2;
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C1776a.class.getSimpleName(), super.toString());
        }
    }

    public a(m<T> mVar) {
        this.f84007a = mVar;
    }

    @Override // io.reactivex.rxjava3.core.j
    protected void c(l<? super T> lVar) {
        C1776a c1776a = new C1776a(lVar);
        lVar.onSubscribe(c1776a);
        try {
            this.f84007a.a(c1776a);
        } catch (Throwable th2) {
            bm0.a.b(th2);
            c1776a.e(th2);
        }
    }
}
