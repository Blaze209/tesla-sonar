package om0;

import io.reactivex.rxjava3.core.t;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C2107b f98063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final j f98064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f98065e = a(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx3.computation-threads", 0).intValue());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final c f98066f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ThreadFactory f98067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<C2107b> f98068b;

    /* JADX INFO: renamed from: om0.b$b, reason: collision with other inner class name */
    static final class C2107b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f98074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c[] f98075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f98076c;

        C2107b(int i11, ThreadFactory threadFactory) {
            this.f98074a = i11;
            this.f98075b = new c[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f98075b[i12] = new c(threadFactory);
            }
        }

        public c a() {
            int i11 = this.f98074a;
            if (i11 == 0) {
                return b.f98066f;
            }
            c[] cVarArr = this.f98075b;
            long j11 = this.f98076c;
            this.f98076c = 1 + j11;
            return cVarArr[(int) (j11 % ((long) i11))];
        }

        public void b() {
            for (c cVar : this.f98075b) {
                cVar.dispose();
            }
        }
    }

    static final class c extends h {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new j("RxComputationShutdown"));
        f98066f = cVar;
        cVar.dispose();
        j jVar = new j("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        f98064d = jVar;
        C2107b c2107b = new C2107b(0, jVar);
        f98063c = c2107b;
        c2107b.b();
    }

    public b() {
        this(f98064d);
    }

    static int a(int i11, int i12) {
        return (i12 <= 0 || i12 > i11) ? i11 : i12;
    }

    @Override // io.reactivex.rxjava3.core.t
    public t.c createWorker() {
        return new a(this.f98068b.get().a());
    }

    @Override // io.reactivex.rxjava3.core.t
    public am0.b scheduleDirect(Runnable runnable, long j11, TimeUnit timeUnit) {
        return this.f98068b.get().a().b(runnable, j11, timeUnit);
    }

    @Override // io.reactivex.rxjava3.core.t
    public am0.b schedulePeriodicallyDirect(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        return this.f98068b.get().a().e(runnable, j11, j12, timeUnit);
    }

    @Override // io.reactivex.rxjava3.core.t
    public void shutdown() {
        AtomicReference<C2107b> atomicReference = this.f98068b;
        C2107b c2107b = f98063c;
        C2107b andSet = atomicReference.getAndSet(c2107b);
        if (andSet != c2107b) {
            andSet.b();
        }
    }

    @Override // io.reactivex.rxjava3.core.t
    public void start() {
        C2107b c2107b = new C2107b(f98065e, this.f98067a);
        if (androidx.camera.view.i.a(this.f98068b, f98063c, c2107b)) {
            return;
        }
        c2107b.b();
    }

    public b(ThreadFactory threadFactory) {
        this.f98067a = threadFactory;
        this.f98068b = new AtomicReference<>(f98063c);
        start();
    }

    static final class a extends t.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dm0.d f98069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final am0.a f98070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final dm0.d f98071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f98072d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f98073e;

        a(c cVar) {
            this.f98072d = cVar;
            dm0.d dVar = new dm0.d();
            this.f98069a = dVar;
            am0.a aVar = new am0.a();
            this.f98070b = aVar;
            dm0.d dVar2 = new dm0.d();
            this.f98071c = dVar2;
            dVar2.b(dVar);
            dVar2.b(aVar);
        }

        @Override // am0.b
        public void dispose() {
            if (this.f98073e) {
                return;
            }
            this.f98073e = true;
            this.f98071c.dispose();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f98073e;
        }

        @Override // io.reactivex.rxjava3.core.t.c
        public am0.b schedule(Runnable runnable) {
            return this.f98073e ? dm0.c.INSTANCE : this.f98072d.a(runnable, 0L, TimeUnit.MILLISECONDS, this.f98069a);
        }

        @Override // io.reactivex.rxjava3.core.t.c
        public am0.b schedule(Runnable runnable, long j11, TimeUnit timeUnit) {
            if (this.f98073e) {
                return dm0.c.INSTANCE;
            }
            return this.f98072d.a(runnable, j11, timeUnit, this.f98070b);
        }
    }
}
