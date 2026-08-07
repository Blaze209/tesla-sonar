package lm0;

/* JADX INFO: loaded from: classes9.dex */
public final class p<T> extends io.reactivex.rxjava3.core.b implements fm0.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.r<T> f90423a;

    public p(io.reactivex.rxjava3.core.r<T> rVar) {
        this.f90423a = rVar;
    }

    @Override // fm0.b
    public io.reactivex.rxjava3.core.o<T> a() {
        return tm0.a.n(new o(this.f90423a));
    }

    @Override // io.reactivex.rxjava3.core.b
    public void j(io.reactivex.rxjava3.core.d dVar) {
        this.f90423a.a(new a(dVar));
    }

    static final class a<T> implements io.reactivex.rxjava3.core.s<T>, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.d f90424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        am0.b f90425b;

        a(io.reactivex.rxjava3.core.d dVar) {
            this.f90424a = dVar;
        }

        @Override // am0.b
        public void dispose() {
            this.f90425b.dispose();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f90425b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            this.f90424a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            this.f90424a.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            this.f90425b = bVar;
            this.f90424a.onSubscribe(this);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
        }
    }
}
