package lm0;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class e<T> extends lm0.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f90349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f90350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.core.t f90351d;

    static final class a<T> extends AtomicReference<am0.b> implements Runnable, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T f90352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f90353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final b<T> f90354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicBoolean f90355d = new AtomicBoolean();

        a(T t11, long j11, b<T> bVar) {
            this.f90352a = t11;
            this.f90353b = j11;
            this.f90354c = bVar;
        }

        public void a(am0.b bVar) {
            dm0.b.replace(this, bVar);
        }

        @Override // am0.b
        public void dispose() {
            dm0.b.dispose(this);
        }

        @Override // am0.b
        public boolean isDisposed() {
            return get() == dm0.b.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f90355d.compareAndSet(false, true)) {
                this.f90354c.a(this.f90353b, this.f90352a, this);
            }
        }
    }

    static final class b<T> implements io.reactivex.rxjava3.core.s<T>, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.s<? super T> f90356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f90357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f90358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.rxjava3.core.t.c f90359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        am0.b f90360e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        am0.b f90361f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile long f90362g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f90363h;

        b(io.reactivex.rxjava3.core.s<? super T> sVar, long j11, TimeUnit timeUnit, io.reactivex.rxjava3.core.t.c cVar) {
            this.f90356a = sVar;
            this.f90357b = j11;
            this.f90358c = timeUnit;
            this.f90359d = cVar;
        }

        void a(long j11, T t11, a<T> aVar) {
            if (j11 == this.f90362g) {
                this.f90356a.onNext(t11);
                aVar.dispose();
            }
        }

        @Override // am0.b
        public void dispose() {
            this.f90360e.dispose();
            this.f90359d.dispose();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f90359d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            if (this.f90363h) {
                return;
            }
            this.f90363h = true;
            am0.b bVar = this.f90361f;
            if (bVar != null) {
                bVar.dispose();
            }
            a aVar = (a) bVar;
            if (aVar != null) {
                aVar.run();
            }
            this.f90356a.onComplete();
            this.f90359d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            if (this.f90363h) {
                tm0.a.r(th2);
                return;
            }
            am0.b bVar = this.f90361f;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f90363h = true;
            this.f90356a.onError(th2);
            this.f90359d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            if (this.f90363h) {
                return;
            }
            long j11 = this.f90362g + 1;
            this.f90362g = j11;
            am0.b bVar = this.f90361f;
            if (bVar != null) {
                bVar.dispose();
            }
            a aVar = new a(t11, j11, this);
            this.f90361f = aVar;
            aVar.a(this.f90359d.schedule(aVar, this.f90357b, this.f90358c));
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.validate(this.f90360e, bVar)) {
                this.f90360e = bVar;
                this.f90356a.onSubscribe(this);
            }
        }
    }

    public e(io.reactivex.rxjava3.core.r<T> rVar, long j11, TimeUnit timeUnit, io.reactivex.rxjava3.core.t tVar) {
        super(rVar);
        this.f90349b = j11;
        this.f90350c = timeUnit;
        this.f90351d = tVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void Q(io.reactivex.rxjava3.core.s<? super T> sVar) {
        this.f90266a.a(new b(new sm0.a(sVar), this.f90349b, this.f90350c, this.f90351d.createWorker()));
    }
}
