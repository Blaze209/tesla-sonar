package lm0;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class d<T> extends io.reactivex.rxjava3.core.o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q<T> f90347a;

    static final class a<T> extends AtomicReference<am0.b> implements io.reactivex.rxjava3.core.p<T>, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.s<? super T> f90348a;

        a(io.reactivex.rxjava3.core.s<? super T> sVar) {
            this.f90348a = sVar;
        }

        @Override // io.reactivex.rxjava3.core.p
        public boolean a(Throwable th2) {
            if (th2 == null) {
                th2 = rm0.g.b("onError called with a null Throwable.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.f90348a.onError(th2);
                return true;
            } finally {
                dispose();
            }
        }

        @Override // io.reactivex.rxjava3.core.p
        public void b(cm0.e eVar) {
            e(new dm0.a(eVar));
        }

        @Override // am0.b
        public void dispose() {
            dm0.b.dispose(this);
        }

        public void e(am0.b bVar) {
            dm0.b.set(this, bVar);
        }

        @Override // io.reactivex.rxjava3.core.p, am0.b
        public boolean isDisposed() {
            return dm0.b.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.g
        public void onComplete() {
            if (isDisposed()) {
                return;
            }
            try {
                this.f90348a.onComplete();
            } finally {
                dispose();
            }
        }

        @Override // io.reactivex.rxjava3.core.g
        public void onError(Throwable th2) {
            if (a(th2)) {
                return;
            }
            tm0.a.r(th2);
        }

        @Override // io.reactivex.rxjava3.core.g
        public void onNext(T t11) {
            if (t11 == null) {
                onError(rm0.g.b("onNext called with a null value."));
            } else {
                if (isDisposed()) {
                    return;
                }
                this.f90348a.onNext(t11);
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    public d(io.reactivex.rxjava3.core.q<T> qVar) {
        this.f90347a = qVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void Q(io.reactivex.rxjava3.core.s<? super T> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        try {
            this.f90347a.a(aVar);
        } catch (Throwable th2) {
            bm0.a.b(th2);
            aVar.onError(th2);
        }
    }
}
