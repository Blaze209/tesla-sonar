package im0;

import io.reactivex.rxjava3.core.t;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class c<T> extends b<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f78304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f78305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final t f78306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f78307f;

    static final class a<T> implements io.reactivex.rxjava3.core.i<T>, nr0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final nr0.b<? super T> f78308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f78309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f78310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final t.c f78311d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f78312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        nr0.c f78313f;

        /* JADX INFO: renamed from: im0.c$a$a, reason: collision with other inner class name */
        final class RunnableC1662a implements Runnable {
            RunnableC1662a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f78308a.onComplete();
                } finally {
                    a.this.f78311d.dispose();
                }
            }
        }

        final class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f78315a;

            b(Throwable th2) {
                this.f78315a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f78308a.onError(this.f78315a);
                } finally {
                    a.this.f78311d.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: im0.c$a$c, reason: collision with other inner class name */
        final class RunnableC1663c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final T f78317a;

            RunnableC1663c(T t11) {
                this.f78317a = t11;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f78308a.onNext(this.f78317a);
            }
        }

        a(nr0.b<? super T> bVar, long j11, TimeUnit timeUnit, t.c cVar, boolean z11) {
            this.f78308a = bVar;
            this.f78309b = j11;
            this.f78310c = timeUnit;
            this.f78311d = cVar;
            this.f78312e = z11;
        }

        @Override // nr0.c
        public void cancel() {
            this.f78313f.cancel();
            this.f78311d.dispose();
        }

        @Override // nr0.b
        public void onComplete() {
            this.f78311d.schedule(new RunnableC1662a(), this.f78309b, this.f78310c);
        }

        @Override // nr0.b
        public void onError(Throwable th2) {
            this.f78311d.schedule(new b(th2), this.f78312e ? this.f78309b : 0L, this.f78310c);
        }

        @Override // nr0.b
        public void onNext(T t11) {
            this.f78311d.schedule(new RunnableC1663c(t11), this.f78309b, this.f78310c);
        }

        @Override // io.reactivex.rxjava3.core.i, nr0.b
        public void onSubscribe(nr0.c cVar) {
            if (qm0.d.validate(this.f78313f, cVar)) {
                this.f78313f = cVar;
                this.f78308a.onSubscribe(this);
            }
        }

        @Override // nr0.c
        public void request(long j11) {
            this.f78313f.request(j11);
        }
    }

    public c(io.reactivex.rxjava3.core.h<T> hVar, long j11, TimeUnit timeUnit, t tVar, boolean z11) {
        super(hVar);
        this.f78304c = j11;
        this.f78305d = timeUnit;
        this.f78306e = tVar;
        this.f78307f = z11;
    }

    @Override // io.reactivex.rxjava3.core.h
    protected void y(nr0.b<? super T> bVar) {
        this.f78303b.x(new a(this.f78307f ? bVar : new xm0.b(bVar), this.f78304c, this.f78305d, this.f78306e.createWorker(), this.f78307f));
    }
}
