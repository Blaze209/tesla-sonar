package mm0;

import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.y;
import io.reactivex.rxjava3.exceptions.CompositeException;

/* JADX INFO: loaded from: classes9.dex */
public final class e<T> extends u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y<T> f92362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.a f92363b;

    final class a implements w<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final w<? super T> f92364a;

        a(w<? super T> wVar) {
            this.f92364a = wVar;
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onError(Throwable th2) {
            try {
                e.this.f92363b.run();
            } catch (Throwable th3) {
                bm0.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f92364a.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSubscribe(am0.b bVar) {
            this.f92364a.onSubscribe(bVar);
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSuccess(T t11) {
            try {
                e.this.f92363b.run();
                this.f92364a.onSuccess(t11);
            } catch (Throwable th2) {
                bm0.a.b(th2);
                this.f92364a.onError(th2);
            }
        }
    }

    public e(y<T> yVar, cm0.a aVar) {
        this.f92362a = yVar;
        this.f92363b = aVar;
    }

    @Override // io.reactivex.rxjava3.core.u
    protected void u(w<? super T> wVar) {
        this.f92362a.a(new a(wVar));
    }
}
