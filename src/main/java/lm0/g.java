package lm0;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* JADX INFO: loaded from: classes9.dex */
public final class g<T> extends lm0.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.f<? super T> f90370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final cm0.f<? super Throwable> f90371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final cm0.a f90372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final cm0.a f90373e;

    static final class a<T> implements io.reactivex.rxjava3.core.s<T>, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.s<? super T> f90374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final cm0.f<? super T> f90375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final cm0.f<? super Throwable> f90376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final cm0.a f90377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final cm0.a f90378e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        am0.b f90379f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f90380g;

        a(io.reactivex.rxjava3.core.s<? super T> sVar, cm0.f<? super T> fVar, cm0.f<? super Throwable> fVar2, cm0.a aVar, cm0.a aVar2) {
            this.f90374a = sVar;
            this.f90375b = fVar;
            this.f90376c = fVar2;
            this.f90377d = aVar;
            this.f90378e = aVar2;
        }

        @Override // am0.b
        public void dispose() {
            this.f90379f.dispose();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f90379f.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            if (this.f90380g) {
                return;
            }
            try {
                this.f90377d.run();
                this.f90380g = true;
                this.f90374a.onComplete();
                try {
                    this.f90378e.run();
                } catch (Throwable th2) {
                    bm0.a.b(th2);
                    tm0.a.r(th2);
                }
            } catch (Throwable th3) {
                bm0.a.b(th3);
                onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            if (this.f90380g) {
                tm0.a.r(th2);
                return;
            }
            this.f90380g = true;
            try {
                this.f90376c.accept(th2);
            } catch (Throwable th3) {
                bm0.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f90374a.onError(th2);
            try {
                this.f90378e.run();
            } catch (Throwable th4) {
                bm0.a.b(th4);
                tm0.a.r(th4);
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            if (this.f90380g) {
                return;
            }
            try {
                this.f90375b.accept(t11);
                this.f90374a.onNext(t11);
            } catch (Throwable th2) {
                bm0.a.b(th2);
                this.f90379f.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.validate(this.f90379f, bVar)) {
                this.f90379f = bVar;
                this.f90374a.onSubscribe(this);
            }
        }
    }

    public g(io.reactivex.rxjava3.core.r<T> rVar, cm0.f<? super T> fVar, cm0.f<? super Throwable> fVar2, cm0.a aVar, cm0.a aVar2) {
        super(rVar);
        this.f90370b = fVar;
        this.f90371c = fVar2;
        this.f90372d = aVar;
        this.f90373e = aVar2;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void Q(io.reactivex.rxjava3.core.s<? super T> sVar) {
        this.f90266a.a(new a(sVar, this.f90370b, this.f90371c, this.f90372d, this.f90373e));
    }
}
