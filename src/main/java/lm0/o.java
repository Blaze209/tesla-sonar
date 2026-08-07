package lm0;

/* JADX INFO: loaded from: classes9.dex */
public final class o<T> extends lm0.a<T, T> {
    public o(io.reactivex.rxjava3.core.r<T> rVar) {
        super(rVar);
    }

    @Override // io.reactivex.rxjava3.core.o
    public void Q(io.reactivex.rxjava3.core.s<? super T> sVar) {
        this.f90266a.a(new a(sVar));
    }

    static final class a<T> implements io.reactivex.rxjava3.core.s<T>, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.s<? super T> f90421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        am0.b f90422b;

        a(io.reactivex.rxjava3.core.s<? super T> sVar) {
            this.f90421a = sVar;
        }

        @Override // am0.b
        public void dispose() {
            this.f90422b.dispose();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f90422b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            this.f90421a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            this.f90421a.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            this.f90422b = bVar;
            this.f90421a.onSubscribe(this);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
        }
    }
}
