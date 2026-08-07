package lm0;

/* JADX INFO: loaded from: classes9.dex */
public final class n<T> extends lm0.a<T, T> {

    static final class a<T> implements io.reactivex.rxjava3.core.s<T>, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.s<? super T> f90419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        am0.b f90420b;

        a(io.reactivex.rxjava3.core.s<? super T> sVar) {
            this.f90419a = sVar;
        }

        @Override // am0.b
        public void dispose() {
            this.f90420b.dispose();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f90420b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            this.f90419a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            this.f90419a.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            this.f90419a.onNext(t11);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.validate(this.f90420b, bVar)) {
                this.f90420b = bVar;
                this.f90419a.onSubscribe(this);
            }
        }
    }

    public n(io.reactivex.rxjava3.core.r<T> rVar) {
        super(rVar);
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void Q(io.reactivex.rxjava3.core.s<? super T> sVar) {
        this.f90266a.a(new a(sVar));
    }
}
