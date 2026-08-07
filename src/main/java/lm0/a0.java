package lm0;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class a0<T> extends lm0.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.t f90267b;

    static final class a<T> extends AtomicReference<am0.b> implements io.reactivex.rxjava3.core.s<T>, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.s<? super T> f90268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<am0.b> f90269b = new AtomicReference<>();

        a(io.reactivex.rxjava3.core.s<? super T> sVar) {
            this.f90268a = sVar;
        }

        void a(am0.b bVar) {
            dm0.b.setOnce(this, bVar);
        }

        @Override // am0.b
        public void dispose() {
            dm0.b.dispose(this.f90269b);
            dm0.b.dispose(this);
        }

        @Override // am0.b
        public boolean isDisposed() {
            return dm0.b.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            this.f90268a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            this.f90268a.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            this.f90268a.onNext(t11);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            dm0.b.setOnce(this.f90269b, bVar);
        }
    }

    final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a<T> f90270a;

        b(a<T> aVar) {
            this.f90270a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.this.f90266a.a(this.f90270a);
        }
    }

    public a0(io.reactivex.rxjava3.core.r<T> rVar, io.reactivex.rxjava3.core.t tVar) {
        super(rVar);
        this.f90267b = tVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void Q(io.reactivex.rxjava3.core.s<? super T> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        aVar.a(this.f90267b.scheduleDirect(new b(aVar)));
    }
}
