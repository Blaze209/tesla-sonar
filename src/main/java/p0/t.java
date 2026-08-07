package p0;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageProcessingUtil;
import androidx.core.util.Consumer;
import c0.o1;
import c0.z1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class t implements r0, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f100192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final HandlerThread f100193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f100194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Handler f100195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f100196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f100197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f100198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map<o1, Surface> f100199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f100200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f100201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<b> f100202k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static r.a<c0.b0, r0> f100203a = new r.a() { // from class: p0.s
            @Override // r.a
            public final Object apply(Object obj) {
                return new t((c0.b0) obj);
            }
        };

        @NonNull
        public static r0 a(@NonNull c0.b0 b0Var) {
            return f100203a.apply(b0Var);
        }
    }

    static abstract class b {
        b() {
        }

        @NonNull
        static p0.a d(int i11, int i12, @NonNull androidx.concurrent.futures.c.a<Void> aVar) {
            return new p0.a(i11, i12, aVar);
        }

        @NonNull
        abstract androidx.concurrent.futures.c.a<Void> a();

        abstract int b();

        abstract int c();
    }

    t(@NonNull c0.b0 b0Var) {
        this(b0Var, Collections.EMPTY_MAP);
    }

    public static /* synthetic */ void e(t tVar, z1 z1Var, SurfaceTexture surfaceTexture, Surface surface, z1.g gVar) {
        tVar.getClass();
        z1Var.k();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        tVar.f100200i--;
        tVar.q();
    }

    public static /* synthetic */ void f(t tVar) {
        tVar.f100201j = true;
        tVar.q();
    }

    public static /* synthetic */ void g(t tVar, c0.b0 b0Var, Map map, androidx.concurrent.futures.c.a aVar) throws Throwable {
        tVar.getClass();
        try {
            tVar.f100192a.h(b0Var, map);
            aVar.c(null);
        } catch (RuntimeException e11) {
            aVar.f(e11);
        }
    }

    public static /* synthetic */ Object h(final t tVar, int i11, int i12, final androidx.concurrent.futures.c.a aVar) {
        tVar.getClass();
        final p0.a aVarD = b.d(i11, i12, aVar);
        tVar.s(new Runnable() { // from class: p0.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f100117a.f100202k.add(aVarD);
            }
        }, new Runnable() { // from class: p0.i
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    public static /* synthetic */ void i(t tVar, z1 z1Var, z1.h hVar) {
        tVar.getClass();
        r0.d.e eVar = r0.d.e.DEFAULT;
        if (z1Var.n().d() && hVar.e()) {
            eVar = r0.d.e.YUV;
        }
        tVar.f100192a.o(eVar);
    }

    public static /* synthetic */ void j(final t tVar, final o1 o1Var) {
        Surface surfaceL2 = o1Var.L2(tVar.f100194c, new Consumer() { // from class: p0.o
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                t.k(this.f100156a, o1Var, (o1.b) obj);
            }
        });
        tVar.f100192a.j(surfaceL2);
        tVar.f100199h.put(o1Var, surfaceL2);
    }

    public static /* synthetic */ void k(t tVar, o1 o1Var, o1.b bVar) {
        tVar.getClass();
        o1Var.close();
        Surface surfaceRemove = tVar.f100199h.remove(o1Var);
        if (surfaceRemove != null) {
            tVar.f100192a.r(surfaceRemove);
        }
    }

    public static /* synthetic */ Object l(final t tVar, final c0.b0 b0Var, final Map map, final androidx.concurrent.futures.c.a aVar) {
        tVar.getClass();
        tVar.r(new Runnable() { // from class: p0.r
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                t.g(this.f100185a, b0Var, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    public static /* synthetic */ void m() {
    }

    public static /* synthetic */ void o(final t tVar, final z1 z1Var) {
        tVar.f100200i++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(tVar.f100192a.g());
        surfaceTexture.setDefaultBufferSize(z1Var.p().getWidth(), z1Var.p().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        z1Var.v(tVar.f100194c, new z1.i() { // from class: p0.p
            @Override // c0.z1.i
            public final void a(z1.h hVar) {
                t.i(this.f100159a, z1Var, hVar);
            }
        });
        z1Var.u(surface, tVar.f100194c, new Consumer() { // from class: p0.q
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                t.e(this.f100163a, z1Var, surfaceTexture, surface, (z1.g) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(tVar, tVar.f100195d);
    }

    public static /* synthetic */ void p(t tVar, Runnable runnable, Runnable runnable2) {
        if (tVar.f100201j) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    private void q() {
        if (this.f100201j && this.f100200i == 0) {
            Iterator<o1> it = this.f100199h.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            Iterator<b> it2 = this.f100202k.iterator();
            while (it2.hasNext()) {
                it2.next().a().f(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f100199h.clear();
            this.f100192a.k();
            this.f100193b.quit();
        }
    }

    private void r(@NonNull Runnable runnable) {
        s(runnable, new Runnable() { // from class: p0.e
            @Override // java.lang.Runnable
            public final void run() {
                t.m();
            }
        });
    }

    private void s(@NonNull final Runnable runnable, @NonNull final Runnable runnable2) {
        try {
            this.f100194c.execute(new Runnable() { // from class: p0.f
                @Override // java.lang.Runnable
                public final void run() {
                    t.p(this.f100107a, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e11) {
            c0.y0.m("DefaultSurfaceProcessor", "Unable to executor runnable", e11);
            runnable2.run();
        }
    }

    private void t(@NonNull Throwable th2) {
        Iterator<b> it = this.f100202k.iterator();
        while (it.hasNext()) {
            it.next().a().f(th2);
        }
        this.f100202k.clear();
    }

    @NonNull
    private Bitmap u(@NonNull Size size, @NonNull float[] fArr, int i11) {
        float[] fArr2 = (float[]) fArr.clone();
        h0.n.c(fArr2, i11, 0.5f, 0.5f);
        h0.n.d(fArr2, 0.5f);
        return this.f100192a.p(h0.s.q(size, i11), fArr2);
    }

    private void v(@NonNull final c0.b0 b0Var, @NonNull final Map<r0.d.e, c0> map) {
        try {
            androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: p0.d
                @Override // androidx.concurrent.futures.c.InterfaceC0146c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return t.l(this.f100102a, b0Var, map, aVar);
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

    private void w(jn0.w<Surface, Size, float[]> wVar) {
        if (this.f100202k.isEmpty()) {
            return;
        }
        if (wVar == null) {
            t(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator<b> it = this.f100202k.iterator();
                int iC = -1;
                int iB = -1;
                Bitmap bitmapU = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    b next = it.next();
                    if (iC != next.c() || bitmapU == null) {
                        iC = next.c();
                        if (bitmapU != null) {
                            bitmapU.recycle();
                        }
                        bitmapU = u(wVar.e(), wVar.f(), iC);
                        iB = -1;
                    }
                    if (iB != next.b()) {
                        byteArrayOutputStream.reset();
                        iB = next.b();
                        bitmapU.compress(Bitmap.CompressFormat.JPEG, iB, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    Surface surfaceD = wVar.d();
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.o(surfaceD, byteArray);
                    next.a().c(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e11) {
            t(e11);
        }
    }

    @Override // p0.r0
    @NonNull
    public com.google.common.util.concurrent.s<Void> a(final int i11, final int i12) {
        return j0.n.s(androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: p0.g
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return t.h(this.f100111a, i11, i12, aVar);
            }
        }));
    }

    @Override // c0.p1
    public void b(@NonNull final z1 z1Var) {
        if (this.f100196e.get()) {
            z1Var.x();
            return;
        }
        Runnable runnable = new Runnable() { // from class: p0.l
            @Override // java.lang.Runnable
            public final void run() {
                t.o(this.f100131a, z1Var);
            }
        };
        Objects.requireNonNull(z1Var);
        s(runnable, new m(z1Var));
    }

    @Override // c0.p1
    public void c(@NonNull final o1 o1Var) {
        if (this.f100196e.get()) {
            o1Var.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: p0.j
            @Override // java.lang.Runnable
            public final void run() {
                t.j(this.f100126a, o1Var);
            }
        };
        Objects.requireNonNull(o1Var);
        s(runnable, new k(o1Var));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(@NonNull SurfaceTexture surfaceTexture) {
        if (this.f100196e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f100197f);
        jn0.w<Surface, Size, float[]> wVar = null;
        for (Map.Entry<o1, Surface> entry : this.f100199h.entrySet()) {
            Surface value = entry.getValue();
            o1 key = entry.getKey();
            key.S0(this.f100198g, this.f100197f);
            if (key.getFormat() == 34) {
                try {
                    this.f100192a.n(surfaceTexture.getTimestamp(), this.f100198g, value);
                } catch (RuntimeException e11) {
                    c0.y0.d("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e11);
                }
            } else {
                u5.h.j(key.getFormat() == 256, "Unsupported format: " + key.getFormat());
                u5.h.j(wVar == null, "Only one JPEG output is supported.");
                wVar = new jn0.w<>(value, key.getSize(), (float[]) this.f100198g.clone());
            }
        }
        try {
            w(wVar);
        } catch (RuntimeException e12) {
            t(e12);
        }
    }

    @Override // p0.r0
    public void release() {
        if (this.f100196e.getAndSet(true)) {
            return;
        }
        r(new Runnable() { // from class: p0.n
            @Override // java.lang.Runnable
            public final void run() {
                t.f(this.f100136a);
            }
        });
    }

    t(@NonNull c0.b0 b0Var, @NonNull Map<r0.d.e, c0> map) {
        this.f100196e = new AtomicBoolean(false);
        this.f100197f = new float[16];
        this.f100198g = new float[16];
        this.f100199h = new LinkedHashMap();
        this.f100200i = 0;
        this.f100201j = false;
        this.f100202k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f100193b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f100195d = handler;
        this.f100194c = i0.c.f(handler);
        this.f100192a = new z();
        try {
            v(b0Var, map);
        } catch (RuntimeException e11) {
            release();
            throw e11;
        }
    }
}
