package mm0;

import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.x;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class a<T> extends u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final x<T> f92348a;

    /* JADX INFO: renamed from: mm0.a$a, reason: collision with other inner class name */
    static final class C1973a<T> extends AtomicReference<am0.b> implements v<T>, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final w<? super T> f92349a;

        C1973a(w<? super T> wVar) {
            this.f92349a = wVar;
        }

        @Override // io.reactivex.rxjava3.core.v
        public boolean a(Throwable th2) {
            am0.b andSet;
            if (th2 == null) {
                th2 = rm0.g.b("onError called with a null Throwable.");
            }
            am0.b bVar = get();
            dm0.b bVar2 = dm0.b.DISPOSED;
            if (bVar == bVar2 || (andSet = getAndSet(bVar2)) == bVar2) {
                return false;
            }
            try {
                this.f92349a.onError(th2);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public void b(cm0.e eVar) {
            e(new dm0.a(eVar));
        }

        @Override // am0.b
        public void dispose() {
            dm0.b.dispose(this);
        }

        public void e(am0.b bVar) {
            dm0.b.set(this, bVar);
        }

        @Override // am0.b
        public boolean isDisposed() {
            return dm0.b.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.v
        public void onError(Throwable th2) {
            if (a(th2)) {
                return;
            }
            tm0.a.r(th2);
        }

        @Override // io.reactivex.rxjava3.core.v
        public void onSuccess(T t11) {
            am0.b andSet;
            am0.b bVar = get();
            dm0.b bVar2 = dm0.b.DISPOSED;
            if (bVar == bVar2 || (andSet = getAndSet(bVar2)) == bVar2) {
                return;
            }
            try {
                if (t11 == null) {
                    this.f92349a.onError(rm0.g.b("onSuccess called with a null value."));
                } else {
                    this.f92349a.onSuccess(t11);
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
            return String.format("%s{%s}", C1973a.class.getSimpleName(), super.toString());
        }
    }

    public a(x<T> xVar) {
        this.f92348a = xVar;
    }

    @Override // io.reactivex.rxjava3.core.u
    protected void u(w<? super T> wVar) {
        C1973a c1973a = new C1973a(wVar);
        wVar.onSubscribe(c1973a);
        try {
            this.f92348a.a(c1973a);
        } catch (Throwable th2) {
            bm0.a.b(th2);
            c1973a.onError(th2);
        }
    }
}
