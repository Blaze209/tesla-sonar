package lm0;

import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class w<T, R> extends lm0.a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.c<R, ? super T, R> f90457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final cm0.k<R> f90458c;

    static final class a<T, R> implements io.reactivex.rxjava3.core.s<T>, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.s<? super R> f90459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final cm0.c<R, ? super T, R> f90460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        R f90461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        am0.b f90462d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f90463e;

        a(io.reactivex.rxjava3.core.s<? super R> sVar, cm0.c<R, ? super T, R> cVar, R r11) {
            this.f90459a = sVar;
            this.f90460b = cVar;
            this.f90461c = r11;
        }

        @Override // am0.b
        public void dispose() {
            this.f90462d.dispose();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f90462d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            if (this.f90463e) {
                return;
            }
            this.f90463e = true;
            this.f90459a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            if (this.f90463e) {
                tm0.a.r(th2);
            } else {
                this.f90463e = true;
                this.f90459a.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            if (this.f90463e) {
                return;
            }
            try {
                R rApply = this.f90460b.apply(this.f90461c, t11);
                Objects.requireNonNull(rApply, "The accumulator returned a null value");
                this.f90461c = rApply;
                this.f90459a.onNext(rApply);
            } catch (Throwable th2) {
                bm0.a.b(th2);
                this.f90462d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.validate(this.f90462d, bVar)) {
                this.f90462d = bVar;
                this.f90459a.onSubscribe(this);
                this.f90459a.onNext(this.f90461c);
            }
        }
    }

    public w(io.reactivex.rxjava3.core.r<T> rVar, cm0.k<R> kVar, cm0.c<R, ? super T, R> cVar) {
        super(rVar);
        this.f90457b = cVar;
        this.f90458c = kVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void Q(io.reactivex.rxjava3.core.s<? super R> sVar) {
        try {
            R r11 = this.f90458c.get();
            Objects.requireNonNull(r11, "The seed supplied is null");
            this.f90266a.a(new a(sVar, this.f90457b, r11));
        } catch (Throwable th2) {
            bm0.a.b(th2);
            dm0.c.error(th2, sVar);
        }
    }
}
