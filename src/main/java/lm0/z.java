package lm0;

/* JADX INFO: loaded from: classes9.dex */
public final class z<T> extends lm0.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.j<? super T> f90476b;

    static final class a<T> implements io.reactivex.rxjava3.core.s<T>, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.s<? super T> f90477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final cm0.j<? super T> f90478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        am0.b f90479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f90480d;

        a(io.reactivex.rxjava3.core.s<? super T> sVar, cm0.j<? super T> jVar) {
            this.f90477a = sVar;
            this.f90478b = jVar;
        }

        @Override // am0.b
        public void dispose() {
            this.f90479c.dispose();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f90479c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            this.f90477a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            this.f90477a.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            if (this.f90480d) {
                this.f90477a.onNext(t11);
                return;
            }
            try {
                if (this.f90478b.test(t11)) {
                    return;
                }
                this.f90480d = true;
                this.f90477a.onNext(t11);
            } catch (Throwable th2) {
                bm0.a.b(th2);
                this.f90479c.dispose();
                this.f90477a.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.validate(this.f90479c, bVar)) {
                this.f90479c = bVar;
                this.f90477a.onSubscribe(this);
            }
        }
    }

    public z(io.reactivex.rxjava3.core.r<T> rVar, cm0.j<? super T> jVar) {
        super(rVar);
        this.f90476b = jVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void Q(io.reactivex.rxjava3.core.s<? super T> sVar) {
        this.f90266a.a(new a(sVar, this.f90476b));
    }
}
