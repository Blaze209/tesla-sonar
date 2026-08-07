package om0;

import io.reactivex.rxjava3.core.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public class o extends t implements am0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final am0.b f98142d = new g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final am0.b f98143e = am0.b.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f98144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final um0.a<io.reactivex.rxjava3.core.h<io.reactivex.rxjava3.core.b>> f98145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private am0.b f98146c;

    static final class a implements cm0.h<f, io.reactivex.rxjava3.core.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final t.c f98147a;

        /* JADX INFO: renamed from: om0.o$a$a, reason: collision with other inner class name */
        final class C2109a extends io.reactivex.rxjava3.core.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final f f98148a;

            C2109a(f fVar) {
                this.f98148a = fVar;
            }

            @Override // io.reactivex.rxjava3.core.b
            protected void j(io.reactivex.rxjava3.core.d dVar) {
                dVar.onSubscribe(this.f98148a);
                this.f98148a.a(a.this.f98147a, dVar);
            }
        }

        a(t.c cVar) {
            this.f98147a = cVar;
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.rxjava3.core.b apply(f fVar) {
            return new C2109a(fVar);
        }
    }

    static class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f98150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f98151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final TimeUnit f98152c;

        b(Runnable runnable, long j11, TimeUnit timeUnit) {
            this.f98150a = runnable;
            this.f98151b = j11;
            this.f98152c = timeUnit;
        }

        @Override // om0.o.f
        protected am0.b b(t.c cVar, io.reactivex.rxjava3.core.d dVar) {
            return cVar.schedule(new d(this.f98150a, dVar), this.f98151b, this.f98152c);
        }
    }

    static class c extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f98153a;

        c(Runnable runnable) {
            this.f98153a = runnable;
        }

        @Override // om0.o.f
        protected am0.b b(t.c cVar, io.reactivex.rxjava3.core.d dVar) {
            return cVar.schedule(new d(this.f98153a, dVar));
        }
    }

    static class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.d f98154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Runnable f98155b;

        d(Runnable runnable, io.reactivex.rxjava3.core.d dVar) {
            this.f98155b = runnable;
            this.f98154a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f98155b.run();
            } finally {
                this.f98154a.onComplete();
            }
        }
    }

    static abstract class f extends AtomicReference<am0.b> implements am0.b {
        f() {
            super(o.f98142d);
        }

        void a(t.c cVar, io.reactivex.rxjava3.core.d dVar) {
            am0.b bVar;
            am0.b bVar2 = get();
            if (bVar2 != o.f98143e && bVar2 == (bVar = o.f98142d)) {
                am0.b bVarB = b(cVar, dVar);
                if (compareAndSet(bVar, bVarB)) {
                    return;
                }
                bVarB.dispose();
            }
        }

        protected abstract am0.b b(t.c cVar, io.reactivex.rxjava3.core.d dVar);

        @Override // am0.b
        public void dispose() {
            getAndSet(o.f98143e).dispose();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return get().isDisposed();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(cm0.h<io.reactivex.rxjava3.core.h<io.reactivex.rxjava3.core.h<io.reactivex.rxjava3.core.b>>, io.reactivex.rxjava3.core.b> hVar, t tVar) {
        this.f98144a = tVar;
        um0.a aVarZ = um0.c.B().z();
        this.f98145b = aVarZ;
        try {
            this.f98146c = ((io.reactivex.rxjava3.core.b) hVar.apply(aVarZ)).g();
        } catch (Throwable th2) {
            throw rm0.g.h(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.t
    public t.c createWorker() {
        t.c cVarCreateWorker = this.f98144a.createWorker();
        um0.a<T> aVarZ = um0.c.B().z();
        io.reactivex.rxjava3.core.h<io.reactivex.rxjava3.core.b> hVarP = aVarZ.p(new a(cVarCreateWorker));
        e eVar = new e(aVarZ, cVarCreateWorker);
        this.f98145b.onNext(hVarP);
        return eVar;
    }

    @Override // am0.b
    public void dispose() {
        this.f98146c.dispose();
    }

    @Override // am0.b
    public boolean isDisposed() {
        return this.f98146c.isDisposed();
    }

    static final class e extends t.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f98156a = new AtomicBoolean();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final um0.a<f> f98157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t.c f98158c;

        e(um0.a<f> aVar, t.c cVar) {
            this.f98157b = aVar;
            this.f98158c = cVar;
        }

        @Override // am0.b
        public void dispose() {
            if (this.f98156a.compareAndSet(false, true)) {
                this.f98157b.onComplete();
                this.f98158c.dispose();
            }
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f98156a.get();
        }

        @Override // io.reactivex.rxjava3.core.t.c
        public am0.b schedule(Runnable runnable, long j11, TimeUnit timeUnit) {
            b bVar = new b(runnable, j11, timeUnit);
            this.f98157b.onNext(bVar);
            return bVar;
        }

        @Override // io.reactivex.rxjava3.core.t.c
        public am0.b schedule(Runnable runnable) {
            c cVar = new c(runnable);
            this.f98157b.onNext(cVar);
            return cVar;
        }
    }

    static final class g implements am0.b {
        g() {
        }

        @Override // am0.b
        public boolean isDisposed() {
            return false;
        }

        @Override // am0.b
        public void dispose() {
        }
    }
}
