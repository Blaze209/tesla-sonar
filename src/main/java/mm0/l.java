package mm0;

import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.y;
import io.reactivex.rxjava3.exceptions.CompositeException;

/* JADX INFO: loaded from: classes9.dex */
public final class l<T> extends u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y<? extends T> f92385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.h<? super Throwable, ? extends T> f92386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final T f92387c;

    final class a implements w<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w<? super T> f92388a;

        a(w<? super T> wVar) {
            this.f92388a = wVar;
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onError(Throwable th2) {
            T tApply;
            l lVar = l.this;
            cm0.h<? super Throwable, ? extends T> hVar = lVar.f92386b;
            if (hVar != null) {
                try {
                    tApply = hVar.apply(th2);
                } catch (Throwable th3) {
                    bm0.a.b(th3);
                    this.f92388a.onError(new CompositeException(th2, th3));
                    return;
                }
            } else {
                tApply = lVar.f92387c;
            }
            if (tApply != null) {
                this.f92388a.onSuccess(tApply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th2);
            this.f92388a.onError(nullPointerException);
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSubscribe(am0.b bVar) {
            this.f92388a.onSubscribe(bVar);
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSuccess(T t11) {
            this.f92388a.onSuccess(t11);
        }
    }

    public l(y<? extends T> yVar, cm0.h<? super Throwable, ? extends T> hVar, T t11) {
        this.f92385a = yVar;
        this.f92386b = hVar;
        this.f92387c = t11;
    }

    @Override // io.reactivex.rxjava3.core.u
    protected void u(w<? super T> wVar) {
        this.f92385a.a(new a(wVar));
    }
}
