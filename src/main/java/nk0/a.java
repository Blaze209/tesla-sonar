package nk0;

import io.reactivex.rxjava3.core.o;
import io.reactivex.rxjava3.core.s;
import io.reactivex.rxjava3.exceptions.CompositeException;
import retrofit2.HttpException;
import retrofit2.y;

/* JADX INFO: loaded from: classes8.dex */
final class a<T> extends o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o<y<T>> f95085a;

    /* JADX INFO: renamed from: nk0.a$a, reason: collision with other inner class name */
    private static class C2027a<R> implements s<y<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s<? super R> f95086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f95087b;

        C2027a(s<? super R> sVar) {
            this.f95086a = sVar;
        }

        @Override // io.reactivex.rxjava3.core.s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(y<R> yVar) {
            if (yVar.g()) {
                this.f95086a.onNext(yVar.a());
                return;
            }
            this.f95087b = true;
            HttpException httpException = new HttpException(yVar);
            try {
                this.f95086a.onError(httpException);
            } catch (Throwable th2) {
                bm0.a.b(th2);
                tm0.a.r(new CompositeException(httpException, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            if (this.f95087b) {
                return;
            }
            this.f95086a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            if (!this.f95087b) {
                this.f95086a.onError(th2);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th2);
            tm0.a.r(assertionError);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            this.f95086a.onSubscribe(bVar);
        }
    }

    a(o<y<T>> oVar) {
        this.f95085a = oVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void Q(s<? super T> sVar) {
        this.f95085a.a(new C2027a(sVar));
    }
}
