package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import c0.y0;
import c0.z1;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class c0 extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    TextureView f3696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    SurfaceTexture f3697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    com.google.common.util.concurrent.s<z1.g> f3698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    z1 f3699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f3700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    SurfaceTexture f3701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    AtomicReference<androidx.concurrent.futures.c.a<Void>> f3702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    m.a f3703l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Executor f3704m;

    class a implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: androidx.camera.view.c0$a$a, reason: collision with other inner class name */
        class C0071a implements j0.c<z1.g> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SurfaceTexture f3706a;

            C0071a(SurfaceTexture surfaceTexture) {
                this.f3706a = surfaceTexture;
            }

            @Override // j0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(z1.g gVar) {
                u5.h.j(gVar.a() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                y0.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f3706a.release();
                c0 c0Var = c0.this;
                if (c0Var.f3701j != null) {
                    c0Var.f3701j = null;
                }
            }

            @Override // j0.c
            public void onFailure(@NonNull Throwable th2) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th2);
            }
        }

        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(@NonNull SurfaceTexture surfaceTexture, int i11, int i12) {
            y0.a("TextureViewImpl", "SurfaceTexture available. Size: " + i11 + "x" + i12);
            c0 c0Var = c0.this;
            c0Var.f3697f = surfaceTexture;
            if (c0Var.f3698g == null) {
                c0Var.r();
                return;
            }
            u5.h.g(c0Var.f3699h);
            y0.a("TextureViewImpl", "Surface invalidated " + c0.this.f3699h);
            c0.this.f3699h.m().d();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(@NonNull SurfaceTexture surfaceTexture) {
            c0 c0Var = c0.this;
            c0Var.f3697f = null;
            com.google.common.util.concurrent.s<z1.g> sVar = c0Var.f3698g;
            if (sVar == null) {
                y0.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
                return true;
            }
            j0.n.j(sVar, new C0071a(surfaceTexture), androidx.core.content.b.getMainExecutor(c0.this.f3696e.getContext()));
            c0.this.f3701j = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surfaceTexture, int i11, int i12) {
            y0.a("TextureViewImpl", "SurfaceTexture size changed: " + i11 + "x" + i12);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(@NonNull SurfaceTexture surfaceTexture) {
            androidx.concurrent.futures.c.a<Void> andSet = c0.this.f3702k.getAndSet(null);
            if (andSet != null) {
                andSet.c(null);
            }
            c0.this.getClass();
            Executor executor = c0.this.f3704m;
        }
    }

    c0(@NonNull FrameLayout frameLayout, @NonNull f fVar) {
        super(frameLayout, fVar);
        this.f3700i = false;
        this.f3702k = new AtomicReference<>();
    }

    public static /* synthetic */ Object k(c0 c0Var, Surface surface, final androidx.concurrent.futures.c.a aVar) {
        c0Var.getClass();
        y0.a("TextureViewImpl", "Surface set on Preview.");
        z1 z1Var = c0Var.f3699h;
        Executor executorB = i0.c.b();
        Objects.requireNonNull(aVar);
        z1Var.u(surface, executorB, new Consumer() { // from class: androidx.camera.view.b0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                aVar.c((z1.g) obj);
            }
        });
        return "provideSurface[request=" + c0Var.f3699h + " surface=" + surface + "]";
    }

    public static /* synthetic */ void l(c0 c0Var, Surface surface, com.google.common.util.concurrent.s sVar, z1 z1Var) {
        c0Var.getClass();
        y0.a("TextureViewImpl", "Safe to release surface.");
        c0Var.p();
        surface.release();
        if (c0Var.f3698g == sVar) {
            c0Var.f3698g = null;
        }
        if (c0Var.f3699h == z1Var) {
            c0Var.f3699h = null;
        }
    }

    public static /* synthetic */ void m(c0 c0Var, z1 z1Var) {
        z1 z1Var2 = c0Var.f3699h;
        if (z1Var2 != null && z1Var2 == z1Var) {
            c0Var.f3699h = null;
            c0Var.f3698g = null;
        }
        c0Var.p();
    }

    public static /* synthetic */ Object n(c0 c0Var, androidx.concurrent.futures.c.a aVar) {
        c0Var.f3702k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    private void p() {
        m.a aVar = this.f3703l;
        if (aVar != null) {
            aVar.a();
            this.f3703l = null;
        }
    }

    private void q() {
        if (!this.f3700i || this.f3701j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f3696e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f3701j;
        if (surfaceTexture != surfaceTexture2) {
            this.f3696e.setSurfaceTexture(surfaceTexture2);
            this.f3701j = null;
            this.f3700i = false;
        }
    }

    @Override // androidx.camera.view.m
    View b() {
        return this.f3696e;
    }

    @Override // androidx.camera.view.m
    Bitmap c() {
        TextureView textureView = this.f3696e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f3696e.getBitmap();
    }

    @Override // androidx.camera.view.m
    void d() {
        q();
    }

    @Override // androidx.camera.view.m
    void e() {
        this.f3700i = true;
    }

    @Override // androidx.camera.view.m
    void g(@NonNull final z1 z1Var, m.a aVar) {
        this.f3744a = z1Var.p();
        this.f3703l = aVar;
        o();
        z1 z1Var2 = this.f3699h;
        if (z1Var2 != null) {
            z1Var2.x();
        }
        this.f3699h = z1Var;
        z1Var.j(androidx.core.content.b.getMainExecutor(this.f3696e.getContext()), new Runnable() { // from class: androidx.camera.view.x
            @Override // java.lang.Runnable
            public final void run() {
                c0.m(this.f3780a, z1Var);
            }
        });
        r();
    }

    @Override // androidx.camera.view.m
    void i(@NonNull Executor executor, @NonNull PreviewView.d dVar) {
        this.f3704m = executor;
    }

    @Override // androidx.camera.view.m
    @NonNull
    com.google.common.util.concurrent.s<Void> j() {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: androidx.camera.view.y
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return c0.n(this.f3782a, aVar);
            }
        });
    }

    public void o() {
        u5.h.g(this.f3745b);
        u5.h.g(this.f3744a);
        TextureView textureView = new TextureView(this.f3745b.getContext());
        this.f3696e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f3744a.getWidth(), this.f3744a.getHeight()));
        this.f3696e.setSurfaceTextureListener(new a());
        this.f3745b.removeAllViews();
        this.f3745b.addView(this.f3696e);
    }

    void r() {
        SurfaceTexture surfaceTexture;
        Size size = this.f3744a;
        if (size == null || (surfaceTexture = this.f3697f) == null || this.f3699h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f3744a.getHeight());
        final Surface surface = new Surface(this.f3697f);
        final z1 z1Var = this.f3699h;
        final com.google.common.util.concurrent.s<z1.g> sVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: androidx.camera.view.z
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return c0.k(this.f3783a, surface, aVar);
            }
        });
        this.f3698g = sVarA;
        sVarA.b(new Runnable() { // from class: androidx.camera.view.a0
            @Override // java.lang.Runnable
            public final void run() {
                c0.l(this.f3689a, surface, sVarA, z1Var);
            }
        }, androidx.core.content.b.getMainExecutor(this.f3696e.getContext()));
        f();
    }
}
