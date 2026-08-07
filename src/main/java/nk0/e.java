package nk0;

import io.reactivex.rxjava3.core.o;
import io.reactivex.rxjava3.core.s;
import io.reactivex.rxjava3.exceptions.CompositeException;
import retrofit2.y;

/* JADX INFO: loaded from: classes8.dex */
final class e<T> extends o<d<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o<y<T>> f95098a;

    private static class a<R> implements s<y<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s<? super d<R>> f95099a;

        a(s<? super d<R>> sVar) {
            this.f95099a = sVar;
        }

        @Override // io.reactivex.rxjava3.core.s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(y<R> yVar) {
            this.f95099a.onNext(d.b(yVar));
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            this.f95099a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            try {
                this.f95099a.onNext(d.a(th2));
                this.f95099a.onComplete();
            } catch (Throwable th3) {
                try {
                    this.f95099a.onError(th3);
                } catch (Throwable th4) {
                    bm0.a.b(th4);
                    tm0.a.r(new CompositeException(th3, th4));
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            this.f95099a.onSubscribe(bVar);
        }
    }

    e(o<y<T>> oVar) {
        this.f95098a = oVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void Q(s<? super d<T>> sVar) {
        this.f95098a.a(new a(sVar));
    }
}
