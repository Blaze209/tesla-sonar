package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import c0.y0;
import c0.z1;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class v extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    SurfaceView f3769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final b f3770f;

    private static class a {
        static void a(@NonNull SurfaceView surfaceView, @NonNull Bitmap bitmap, @NonNull PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, @NonNull Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    class b implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Size f3771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private z1 f3772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private z1 f3773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private m.a f3774d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Size f3775e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f3776f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f3777g = false;

        b() {
        }

        public static /* synthetic */ void a(m.a aVar, z1.g gVar) {
            y0.a("SurfaceViewImpl", "Safe to release surface.");
            if (aVar != null) {
                aVar.a();
            }
        }

        private boolean b() {
            return (this.f3776f || this.f3772b == null || !Objects.equals(this.f3771a, this.f3775e)) ? false : true;
        }

        private void c() {
            if (this.f3772b != null) {
                y0.a("SurfaceViewImpl", "Request canceled: " + this.f3772b);
                this.f3772b.x();
            }
        }

        private void d() {
            if (this.f3772b != null) {
                y0.a("SurfaceViewImpl", "Surface closed " + this.f3772b);
                this.f3772b.m().d();
            }
        }

        private boolean f() {
            Surface surface = v.this.f3769e.getHolder().getSurface();
            if (!b()) {
                return false;
            }
            y0.a("SurfaceViewImpl", "Surface set on Preview.");
            final m.a aVar = this.f3774d;
            z1 z1Var = this.f3772b;
            Objects.requireNonNull(z1Var);
            z1Var.u(surface, androidx.core.content.b.getMainExecutor(v.this.f3769e.getContext()), new Consumer() { // from class: androidx.camera.view.w
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    v.b.a(aVar, (z1.g) obj);
                }
            });
            this.f3776f = true;
            v.this.f();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void e(@NonNull z1 z1Var, m.a aVar) {
            c();
            if (this.f3777g) {
                this.f3777g = false;
                z1Var.r();
                return;
            }
            this.f3772b = z1Var;
            this.f3774d = aVar;
            Size sizeP = z1Var.p();
            this.f3771a = sizeP;
            this.f3776f = false;
            if (f()) {
                return;
            }
            y0.a("SurfaceViewImpl", "Wait for new Surface creation.");
            v.this.f3769e.getHolder().setFixedSize(sizeP.getWidth(), sizeP.getHeight());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
            y0.a("SurfaceViewImpl", "Surface changed. Size: " + i12 + "x" + i13);
            this.f3775e = new Size(i12, i13);
            f();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
            z1 z1Var;
            y0.a("SurfaceViewImpl", "Surface created.");
            if (!this.f3777g || (z1Var = this.f3773c) == null) {
                return;
            }
            z1Var.r();
            this.f3773c = null;
            this.f3777g = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            y0.a("SurfaceViewImpl", "Surface destroyed.");
            if (this.f3776f) {
                d();
            } else {
                c();
            }
            this.f3777g = true;
            z1 z1Var = this.f3772b;
            if (z1Var != null) {
                this.f3773c = z1Var;
            }
            this.f3776f = false;
            this.f3772b = null;
            this.f3774d = null;
            this.f3775e = null;
            this.f3771a = null;
        }
    }

    v(@NonNull FrameLayout frameLayout, @NonNull f fVar) {
        super(frameLayout, fVar);
        this.f3770f = new b();
    }

    public static /* synthetic */ void l(Semaphore semaphore, int i11) {
        if (i11 == 0) {
            y0.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
        } else {
            y0.c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i11);
        }
        semaphore.release();
    }

    private static boolean n(SurfaceView surfaceView, Size size, @NonNull z1 z1Var) {
        return surfaceView != null && Objects.equals(size, z1Var.p());
    }

    @Override // androidx.camera.view.m
    View b() {
        return this.f3769e;
    }

    @Override // androidx.camera.view.m
    Bitmap c() {
        SurfaceView surfaceView = this.f3769e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f3769e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f3769e.getWidth(), this.f3769e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        a.a(this.f3769e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: androidx.camera.view.u
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i11) {
                v.l(semaphore, i11);
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                y0.c("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException e11) {
            y0.d("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e11);
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // androidx.camera.view.m
    void d() {
    }

    @Override // androidx.camera.view.m
    void e() {
    }

    @Override // androidx.camera.view.m
    void g(@NonNull final z1 z1Var, final m.a aVar) {
        if (!n(this.f3769e, this.f3744a, z1Var)) {
            this.f3744a = z1Var.p();
            m();
        }
        if (aVar != null) {
            z1Var.j(androidx.core.content.b.getMainExecutor(this.f3769e.getContext()), new Runnable() { // from class: androidx.camera.view.s
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a();
                }
            });
        }
        this.f3769e.post(new Runnable() { // from class: androidx.camera.view.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f3765a.f3770f.e(z1Var, aVar);
            }
        });
    }

    @Override // androidx.camera.view.m
    void i(@NonNull Executor executor, @NonNull PreviewView.d dVar) {
        throw new IllegalArgumentException("SurfaceView doesn't support frame update listener");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.m
    @NonNull
    public com.google.common.util.concurrent.s<Void> j() {
        return j0.n.p(null);
    }

    void m() {
        u5.h.g(this.f3745b);
        u5.h.g(this.f3744a);
        SurfaceView surfaceView = new SurfaceView(this.f3745b.getContext());
        this.f3769e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f3744a.getWidth(), this.f3744a.getHeight()));
        this.f3745b.removeAllViews();
        this.f3745b.addView(this.f3769e);
        this.f3769e.getHolder().addCallback(this.f3770f);
    }
}
