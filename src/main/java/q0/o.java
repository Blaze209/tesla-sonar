package q0;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import c0.b0;
import c0.o1;
import c0.y0;
import c0.z;
import c0.z1;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p0.c0;
import p0.r0;

/* JADX INFO: loaded from: classes.dex */
public class o implements r0, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f104153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final HandlerThread f104154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f104155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Handler f104156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f104157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f104158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f104159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map<o1, Surface> f104160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SurfaceTexture f104161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SurfaceTexture f104162j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static wn0.q<b0, z, z, r0> f104163a = new wn0.q() { // from class: q0.n
            @Override // wn0.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return new o((b0) obj, (z) obj2, (z) obj3);
            }
        };

        @NonNull
        public static r0 a(@NonNull b0 b0Var, @NonNull z zVar, @NonNull z zVar2) {
            return f104163a.invoke(b0Var, zVar, zVar2);
        }
    }

    o(@NonNull b0 b0Var, @NonNull z zVar, @NonNull z zVar2) {
        this(b0Var, Collections.EMPTY_MAP, zVar, zVar2);
    }

    public static /* synthetic */ void d(o oVar, Runnable runnable, Runnable runnable2) {
        if (oVar.f104158f) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void f(o oVar, SurfaceTexture surfaceTexture, Surface surface, z1.g gVar) {
        oVar.getClass();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        oVar.f104157e--;
        oVar.m();
    }

    public static /* synthetic */ void g(o oVar) {
        oVar.f104158f = true;
        oVar.m();
    }

    public static /* synthetic */ void h(o oVar, o1 o1Var, o1.b bVar) {
        oVar.getClass();
        o1Var.close();
        Surface surfaceRemove = oVar.f104160h.remove(o1Var);
        if (surfaceRemove != null) {
            oVar.f104153a.r(surfaceRemove);
        }
    }

    public static /* synthetic */ void i(final o oVar, final o1 o1Var) {
        Surface surfaceL2 = o1Var.L2(oVar.f104155c, new Consumer() { // from class: q0.j
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                o.h(this.f104145a, o1Var, (o1.b) obj);
            }
        });
        oVar.f104153a.j(surfaceL2);
        oVar.f104160h.put(o1Var, surfaceL2);
    }

    public static /* synthetic */ void j(final o oVar, z1 z1Var) {
        oVar.f104157e++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(oVar.f104153a.t(z1Var.s()));
        surfaceTexture.setDefaultBufferSize(z1Var.p().getWidth(), z1Var.p().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        z1Var.u(surface, oVar.f104155c, new Consumer() { // from class: q0.m
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                o.f(this.f104150a, surfaceTexture, surface, (z1.g) obj);
            }
        });
        if (z1Var.s()) {
            oVar.f104161i = surfaceTexture;
        } else {
            oVar.f104162j = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(oVar, oVar.f104156d);
        }
    }

    public static /* synthetic */ void k(o oVar, b0 b0Var, Map map, androidx.concurrent.futures.c.a aVar) throws Throwable {
        oVar.getClass();
        try {
            oVar.f104153a.h(b0Var, map);
            aVar.c(null);
        } catch (RuntimeException e11) {
            aVar.f(e11);
        }
    }

    public static /* synthetic */ Object l(final o oVar, final b0 b0Var, final Map map, final androidx.concurrent.futures.c.a aVar) {
        oVar.getClass();
        oVar.n(new Runnable() { // from class: q0.i
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                o.k(this.f104141a, b0Var, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    private void m() {
        if (this.f104158f && this.f104157e == 0) {
            Iterator<o1> it = this.f104160h.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.f104160h.clear();
            this.f104153a.k();
            this.f104154b.quit();
        }
    }

    private void n(@NonNull Runnable runnable) {
        o(runnable, new Runnable() { // from class: q0.l
            @Override // java.lang.Runnable
            public final void run() {
                o.e();
            }
        });
    }

    private void o(@NonNull final Runnable runnable, @NonNull final Runnable runnable2) {
        try {
            this.f104155c.execute(new Runnable() { // from class: q0.k
                @Override // java.lang.Runnable
                public final void run() {
                    o.d(this.f104147a, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e11) {
            y0.m("DualSurfaceProcessor", "Unable to executor runnable", e11);
            runnable2.run();
        }
    }

    private void p(@NonNull final b0 b0Var, @NonNull final Map<r0.d.e, c0> map) {
        try {
            androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: q0.g
                @Override // androidx.concurrent.futures.c.InterfaceC0146c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return o.l(this.f104136a, b0Var, map, aVar);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e11) {
            e = e11;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    @Override // c0.p1
    public void b(@NonNull final z1 z1Var) {
        if (this.f104159g.get()) {
            z1Var.x();
            return;
        }
        Runnable runnable = new Runnable() { // from class: q0.f
            @Override // java.lang.Runnable
            public final void run() {
                o.j(this.f104134a, z1Var);
            }
        };
        Objects.requireNonNull(z1Var);
        o(runnable, new p0.m(z1Var));
    }

    @Override // c0.p1
    public void c(@NonNull final o1 o1Var) {
        if (this.f104159g.get()) {
            o1Var.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: q0.h
            @Override // java.lang.Runnable
            public final void run() {
                o.i(this.f104139a, o1Var);
            }
        };
        Objects.requireNonNull(o1Var);
        o(runnable, new p0.k(o1Var));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f104159g.get() || (surfaceTexture2 = this.f104161i) == null || this.f104162j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f104162j.updateTexImage();
        for (Map.Entry<o1, Surface> entry : this.f104160h.entrySet()) {
            Surface value = entry.getValue();
            o1 key = entry.getKey();
            if (key.getFormat() == 34) {
                try {
                    this.f104153a.v(surfaceTexture.getTimestamp(), value, key, this.f104161i, this.f104162j);
                } catch (RuntimeException e11) {
                    y0.d("DualSurfaceProcessor", "Failed to render with OpenGL.", e11);
                }
            }
        }
    }

    @Override // p0.r0
    public void release() {
        if (this.f104159g.getAndSet(true)) {
            return;
        }
        n(new Runnable() { // from class: q0.e
            @Override // java.lang.Runnable
            public final void run() {
                o.g(this.f104133a);
            }
        });
    }

    o(@NonNull b0 b0Var, @NonNull Map<r0.d.e, c0> map, @NonNull z zVar, @NonNull z zVar2) {
        this.f104157e = 0;
        this.f104158f = false;
        this.f104159g = new AtomicBoolean(false);
        this.f104160h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f104154b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f104156d = handler;
        this.f104155c = i0.c.f(handler);
        this.f104153a = new c(zVar, zVar2);
        try {
            p(b0Var, map);
        } catch (RuntimeException e11) {
            release();
            throw e11;
        }
    }
}
