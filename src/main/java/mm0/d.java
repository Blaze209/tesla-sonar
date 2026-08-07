package mm0;

import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.y;

/* JADX INFO: loaded from: classes9.dex */
public final class d<T> extends u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y<T> f92358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.f<? super T> f92359b;

    final class a implements w<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final w<? super T> f92360a;

        a(w<? super T> wVar) {
            this.f92360a = wVar;
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onError(Throwable th2) {
            this.f92360a.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSubscribe(am0.b bVar) {
            this.f92360a.onSubscribe(bVar);
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSuccess(T t11) {
            try {
                d.this.f92359b.accept(t11);
                this.f92360a.onSuccess(t11);
            } catch (Throwable th2) {
                bm0.a.b(th2);
                this.f92360a.onError(th2);
            }
        }
    }

    public d(y<T> yVar, cm0.f<? super T> fVar) {
        this.f92358a = yVar;
        this.f92359b = fVar;
    }

    @Override // io.reactivex.rxjava3.core.u
    protected void u(w<? super T> wVar) {
        this.f92358a.a(new a(wVar));
    }
}
