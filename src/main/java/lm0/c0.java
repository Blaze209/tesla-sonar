package lm0;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class c0<T> extends lm0.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f90338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f90339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.core.t f90340d;

    static final class a<T> extends AtomicReference<am0.b> implements io.reactivex.rxjava3.core.s<T>, am0.b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.s<? super T> f90341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f90342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f90343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.rxjava3.core.t.c f90344d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        am0.b f90345e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f90346f;

        a(io.reactivex.rxjava3.core.s<? super T> sVar, long j11, TimeUnit timeUnit, io.reactivex.rxjava3.core.t.c cVar) {
            this.f90341a = sVar;
            this.f90342b = j11;
            this.f90343c = timeUnit;
            this.f90344d = cVar;
        }

        @Override // am0.b
        public void dispose() {
            this.f90345e.dispose();
            this.f90344d.dispose();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f90344d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            this.f90341a.onComplete();
            this.f90344d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            this.f90341a.onError(th2);
            this.f90344d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            if (this.f90346f) {
                return;
            }
            this.f90346f = true;
            this.f90341a.onNext(t11);
            am0.b bVar = get();
            if (bVar != null) {
                bVar.dispose();
            }
            dm0.b.replace(this, this.f90344d.schedule(this, this.f90342b, this.f90343c));
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.validate(this.f90345e, bVar)) {
                this.f90345e = bVar;
                this.f90341a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f90346f = false;
        }
    }

    public c0(io.reactivex.rxjava3.core.r<T> rVar, long j11, TimeUnit timeUnit, io.reactivex.rxjava3.core.t tVar) {
        super(rVar);
        this.f90338b = j11;
        this.f90339c = timeUnit;
        this.f90340d = tVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void Q(io.reactivex.rxjava3.core.s<? super T> sVar) {
        this.f90266a.a(new a(new sm0.a(sVar), this.f90338b, this.f90339c, this.f90340d.createWorker()));
    }
}
