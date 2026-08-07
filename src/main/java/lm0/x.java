package lm0;

/* JADX INFO: loaded from: classes9.dex */
public final class x<T> extends io.reactivex.rxjava3.core.j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.r<T> f90464a;

    static final class a<T> implements io.reactivex.rxjava3.core.s<T>, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.l<? super T> f90465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        am0.b f90466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        T f90467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f90468d;

        a(io.reactivex.rxjava3.core.l<? super T> lVar) {
            this.f90465a = lVar;
        }

        @Override // am0.b
        public void dispose() {
            this.f90466b.dispose();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f90466b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            if (this.f90468d) {
                return;
            }
            this.f90468d = true;
            T t11 = this.f90467c;
            this.f90467c = null;
            if (t11 == null) {
                this.f90465a.onComplete();
            } else {
                this.f90465a.onSuccess(t11);
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            if (this.f90468d) {
                tm0.a.r(th2);
            } else {
                this.f90468d = true;
                this.f90465a.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            if (this.f90468d) {
                return;
            }
            if (this.f90467c == null) {
                this.f90467c = t11;
                return;
            }
            this.f90468d = true;
            this.f90466b.dispose();
            this.f90465a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.validate(this.f90466b, bVar)) {
                this.f90466b = bVar;
                this.f90465a.onSubscribe(this);
            }
        }
    }

    public x(io.reactivex.rxjava3.core.r<T> rVar) {
        this.f90464a = rVar;
    }

    @Override // io.reactivex.rxjava3.core.j
    public void c(io.reactivex.rxjava3.core.l<? super T> lVar) {
        this.f90464a.a(new a(lVar));
    }
}
