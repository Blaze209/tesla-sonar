package lm0;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
public final class y<T> extends io.reactivex.rxjava3.core.u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.r<? extends T> f90469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final T f90470b;

    static final class a<T> implements io.reactivex.rxjava3.core.s<T>, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.w<? super T> f90471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T f90472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        am0.b f90473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        T f90474d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f90475e;

        a(io.reactivex.rxjava3.core.w<? super T> wVar, T t11) {
            this.f90471a = wVar;
            this.f90472b = t11;
        }

        @Override // am0.b
        public void dispose() {
            this.f90473c.dispose();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f90473c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            if (this.f90475e) {
                return;
            }
            this.f90475e = true;
            T t11 = this.f90474d;
            this.f90474d = null;
            if (t11 == null) {
                t11 = this.f90472b;
            }
            if (t11 != null) {
                this.f90471a.onSuccess(t11);
            } else {
                this.f90471a.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            if (this.f90475e) {
                tm0.a.r(th2);
            } else {
                this.f90475e = true;
                this.f90471a.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            if (this.f90475e) {
                return;
            }
            if (this.f90474d == null) {
                this.f90474d = t11;
                return;
            }
            this.f90475e = true;
            this.f90473c.dispose();
            this.f90471a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.validate(this.f90473c, bVar)) {
                this.f90473c = bVar;
                this.f90471a.onSubscribe(this);
            }
        }
    }

    public y(io.reactivex.rxjava3.core.r<? extends T> rVar, T t11) {
        this.f90469a = rVar;
        this.f90470b = t11;
    }

    @Override // io.reactivex.rxjava3.core.u
    public void u(io.reactivex.rxjava3.core.w<? super T> wVar) {
        this.f90469a.a(new a(wVar, this.f90470b));
    }
}
