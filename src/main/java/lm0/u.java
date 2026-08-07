package lm0;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* JADX INFO: loaded from: classes9.dex */
public final class u<T> extends lm0.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.h<? super Throwable, ? extends T> f90449b;

    static final class a<T> implements io.reactivex.rxjava3.core.s<T>, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.s<? super T> f90450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final cm0.h<? super Throwable, ? extends T> f90451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        am0.b f90452c;

        a(io.reactivex.rxjava3.core.s<? super T> sVar, cm0.h<? super Throwable, ? extends T> hVar) {
            this.f90450a = sVar;
            this.f90451b = hVar;
        }

        @Override // am0.b
        public void dispose() {
            this.f90452c.dispose();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f90452c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            this.f90450a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            try {
                T tApply = this.f90451b.apply(th2);
                if (tApply != null) {
                    this.f90450a.onNext(tApply);
                    this.f90450a.onComplete();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th2);
                    this.f90450a.onError(nullPointerException);
                }
            } catch (Throwable th3) {
                bm0.a.b(th3);
                this.f90450a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            this.f90450a.onNext(t11);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.validate(this.f90452c, bVar)) {
                this.f90452c = bVar;
                this.f90450a.onSubscribe(this);
            }
        }
    }

    public u(io.reactivex.rxjava3.core.r<T> rVar, cm0.h<? super Throwable, ? extends T> hVar) {
        super(rVar);
        this.f90449b = hVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void Q(io.reactivex.rxjava3.core.s<? super T> sVar) {
        this.f90266a.a(new a(sVar, this.f90449b));
    }
}
