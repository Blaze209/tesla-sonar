package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.NonNull;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f20560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f20561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map<dj.e, c> f20562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReferenceQueue<o<?>> f20563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o.a f20564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f20565f;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0416a implements ThreadFactory {

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        class RunnableC0417a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f20566a;

            RunnableC0417a(Runnable runnable) {
                this.f20566a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f20566a.run();
            }
        }

        ThreadFactoryC0416a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(new RunnableC0417a(runnable), "glide-active-resources");
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    static final class c extends WeakReference<o<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.e f20569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f20570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        fj.c<?> f20571c;

        c(@NonNull dj.e eVar, @NonNull o<?> oVar, @NonNull ReferenceQueue<? super o<?>> referenceQueue, boolean z11) {
            super(oVar, referenceQueue);
            this.f20569a = (dj.e) xj.k.d(eVar);
            this.f20571c = (oVar.d() && z11) ? (fj.c) xj.k.d(oVar.c()) : null;
            this.f20570b = oVar.d();
        }

        void a() {
            this.f20571c = null;
            clear();
        }
    }

    a(boolean z11) {
        this(z11, Executors.newSingleThreadExecutor(new ThreadFactoryC0416a()));
    }

    synchronized void a(dj.e eVar, o<?> oVar) {
        c cVarPut = this.f20562c.put(eVar, new c(eVar, oVar, this.f20563d, this.f20560a));
        if (cVarPut != null) {
            cVarPut.a();
        }
    }

    void b() {
        while (!this.f20565f) {
            try {
                c((c) this.f20563d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(@NonNull c cVar) {
        fj.c<?> cVar2;
        synchronized (this) {
            this.f20562c.remove(cVar.f20569a);
            if (cVar.f20570b && (cVar2 = cVar.f20571c) != null) {
                this.f20564e.d(cVar.f20569a, new o<>(cVar2, true, false, cVar.f20569a, this.f20564e));
            }
        }
    }

    synchronized void d(dj.e eVar) {
        c cVarRemove = this.f20562c.remove(eVar);
        if (cVarRemove != null) {
            cVarRemove.a();
        }
    }

    synchronized o<?> e(dj.e eVar) {
        c cVar = this.f20562c.get(eVar);
        if (cVar == null) {
            return null;
        }
        o<?> oVar = cVar.get();
        if (oVar == null) {
            c(cVar);
        }
        return oVar;
    }

    void f(o.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f20564e = aVar;
            }
        }
    }

    void g() {
        this.f20565f = true;
        Executor executor = this.f20561b;
        if (executor instanceof ExecutorService) {
            xj.e.c((ExecutorService) executor);
        }
    }

    a(boolean z11, Executor executor) {
        this.f20562c = new HashMap();
        this.f20563d = new ReferenceQueue<>();
        this.f20560a = z11;
        this.f20561b = executor;
        executor.execute(new b());
    }
}
