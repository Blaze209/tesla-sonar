package nk0;

import io.reactivex.rxjava3.core.o;
import io.reactivex.rxjava3.core.s;
import io.reactivex.rxjava3.exceptions.CompositeException;
import retrofit2.y;

/* JADX INFO: loaded from: classes8.dex */
final class c<T> extends o<y<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final retrofit2.d<T> f95093a;

    private static final class a implements am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final retrofit2.d<?> f95094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f95095b;

        a(retrofit2.d<?> dVar) {
            this.f95094a = dVar;
        }

        @Override // am0.b
        public void dispose() {
            this.f95095b = true;
            this.f95094a.cancel();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f95095b;
        }
    }

    c(retrofit2.d<T> dVar) {
        this.f95093a = dVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void Q(s<? super y<T>> sVar) {
        retrofit2.d<T> dVarM123clone = this.f95093a.m123clone();
        a aVar = new a(dVarM123clone);
        sVar.onSubscribe(aVar);
        if (aVar.isDisposed()) {
            return;
        }
        boolean z11 = false;
        try {
            y<T> yVarExecute = dVarM123clone.execute();
            if (!aVar.isDisposed()) {
                sVar.onNext(yVarExecute);
            }
            if (aVar.isDisposed()) {
                return;
            }
            try {
                sVar.onComplete();
            } catch (Throwable th2) {
                th = th2;
                z11 = true;
                bm0.a.b(th);
                if (z11) {
                    tm0.a.r(th);
                    return;
                }
                if (aVar.isDisposed()) {
                    return;
                }
                try {
                    sVar.onError(th);
                } catch (Throwable th3) {
                    bm0.a.b(th3);
                    tm0.a.r(new CompositeException(th, th3));
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
