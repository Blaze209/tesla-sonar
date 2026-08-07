package nk0;

import io.reactivex.rxjava3.core.o;
import io.reactivex.rxjava3.core.s;
import io.reactivex.rxjava3.exceptions.CompositeException;
import retrofit2.y;

/* JADX INFO: loaded from: classes8.dex */
final class b<T> extends o<y<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final retrofit2.d<T> f95088a;

    private static final class a<T> implements am0.b, retrofit2.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final retrofit2.d<?> f95089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s<? super y<T>> f95090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f95091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f95092d = false;

        a(retrofit2.d<?> dVar, s<? super y<T>> sVar) {
            this.f95089a = dVar;
            this.f95090b = sVar;
        }

        @Override // am0.b
        public void dispose() {
            this.f95091c = true;
            this.f95089a.cancel();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f95091c;
        }

        @Override // retrofit2.f
        public void onFailure(retrofit2.d<T> dVar, Throwable th2) {
            if (dVar.isCanceled()) {
                return;
            }
            try {
                this.f95090b.onError(th2);
            } catch (Throwable th3) {
                bm0.a.b(th3);
                tm0.a.r(new CompositeException(th2, th3));
            }
        }

        @Override // retrofit2.f
        public void onResponse(retrofit2.d<T> dVar, y<T> yVar) {
            if (this.f95091c) {
                return;
            }
            try {
                this.f95090b.onNext(yVar);
                if (this.f95091c) {
                    return;
                }
                this.f95092d = true;
                this.f95090b.onComplete();
            } catch (Throwable th2) {
                bm0.a.b(th2);
                if (this.f95092d) {
                    tm0.a.r(th2);
                    return;
                }
                if (this.f95091c) {
                    return;
                }
                try {
                    this.f95090b.onError(th2);
                } catch (Throwable th3) {
                    bm0.a.b(th3);
                    tm0.a.r(new CompositeException(th2, th3));
                }
            }
        }
    }

    b(retrofit2.d<T> dVar) {
        this.f95088a = dVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void Q(s<? super y<T>> sVar) {
        retrofit2.d<T> dVarM123clone = this.f95088a.m123clone();
        a aVar = new a(dVarM123clone, sVar);
        sVar.onSubscribe(aVar);
        if (aVar.isDisposed()) {
            return;
        }
        dVarM123clone.enqueue(aVar);
    }
}
