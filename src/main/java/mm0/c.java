package mm0;

import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.y;
import io.reactivex.rxjava3.exceptions.CompositeException;

/* JADX INFO: loaded from: classes9.dex */
public final class c<T> extends u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y<T> f92354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.f<? super Throwable> f92355b;

    final class a implements w<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w<? super T> f92356a;

        a(w<? super T> wVar) {
            this.f92356a = wVar;
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onError(Throwable th2) {
            try {
                c.this.f92355b.accept(th2);
            } catch (Throwable th3) {
                bm0.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f92356a.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSubscribe(am0.b bVar) {
            this.f92356a.onSubscribe(bVar);
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSuccess(T t11) {
            this.f92356a.onSuccess(t11);
        }
    }

    public c(y<T> yVar, cm0.f<? super Throwable> fVar) {
        this.f92354a = yVar;
        this.f92355b = fVar;
    }

    @Override // io.reactivex.rxjava3.core.u
    protected void u(w<? super T> wVar) {
        this.f92354a.a(new a(wVar));
    }
}
