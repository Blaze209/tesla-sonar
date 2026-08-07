package p0;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import c0.o1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class q0 implements o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Surface f100168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f100169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f100170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final Size f100171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private final o1.a f100172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o1.a f100173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private final float[] f100174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    private final float[] f100175i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final float[] f100176j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    private final float[] f100177k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Consumer<o1.b> f100178l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Executor f100179m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    private final com.google.common.util.concurrent.s<Void> f100182p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private androidx.concurrent.futures.c.a<Void> f100183q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    private Matrix f100184r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f100167a = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f100180n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f100181o = false;

    q0(@NonNull Surface surface, int i11, int i12, @NonNull Size size, @NonNull o1.a aVar, o1.a aVar2, @NonNull Matrix matrix) {
        float[] fArr = new float[16];
        this.f100174h = fArr;
        float[] fArr2 = new float[16];
        this.f100175i = fArr2;
        float[] fArr3 = new float[16];
        this.f100176j = fArr3;
        float[] fArr4 = new float[16];
        this.f100177k = fArr4;
        this.f100168b = surface;
        this.f100169c = i11;
        this.f100170d = i12;
        this.f100171e = size;
        this.f100172f = aVar;
        this.f100173g = aVar2;
        this.f100184r = matrix;
        o(fArr, fArr3, aVar);
        o(fArr2, fArr4, aVar2);
        this.f100182p = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: p0.o0
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar3) {
                return q0.c(this.f100158a, aVar3);
            }
        });
    }

    public static /* synthetic */ Object c(q0 q0Var, androidx.concurrent.futures.c.a aVar) {
        q0Var.f100183q = aVar;
        return "SurfaceOutputImpl close future complete";
    }

    public static /* synthetic */ void n(q0 q0Var, AtomicReference atomicReference) {
        q0Var.getClass();
        ((Consumer) atomicReference.get()).accept(o1.b.c(0, q0Var));
    }

    private static void o(@NonNull float[] fArr, @NonNull float[] fArr2, o1.a aVar) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (aVar == null) {
            return;
        }
        h0.n.d(fArr, 0.5f);
        h0.n.c(fArr, aVar.e(), 0.5f, 0.5f);
        if (aVar.d()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeQ = h0.s.q(aVar.c(), aVar.e());
        Matrix matrixE = h0.s.e(h0.s.t(aVar.c()), h0.s.t(sizeQ), aVar.e(), aVar.d());
        RectF rectF = new RectF(aVar.b());
        matrixE.mapRect(rectF);
        float width = rectF.left / sizeQ.getWidth();
        float height = ((sizeQ.getHeight() - rectF.height()) - rectF.top) / sizeQ.getHeight();
        float fWidth = rectF.width() / sizeQ.getWidth();
        float fHeight = rectF.height() / sizeQ.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, BitmapDescriptorFactory.HUE_RED);
        android.opengl.Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        p(fArr2, aVar.a());
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    private static void p(@NonNull float[] fArr, androidx.camera.core.impl.j0 j0Var) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        h0.n.d(fArr, 0.5f);
        if (j0Var != null) {
            u5.h.j(j0Var.q(), "Camera has no transform.");
            h0.n.c(fArr, j0Var.c().m(), 0.5f, 0.5f);
            if (j0Var.g()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    public void B() {
        Executor executor;
        Consumer<o1.b> consumer;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f100167a) {
            try {
                if (this.f100179m == null || (consumer = this.f100178l) == null) {
                    this.f100180n = true;
                } else if (!this.f100181o) {
                    atomicReference.set(consumer);
                    executor = this.f100179m;
                    this.f100180n = false;
                }
                executor = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: p0.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        q0.n(this.f100161a, atomicReference);
                    }
                });
            } catch (RejectedExecutionException e11) {
                c0.y0.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e11);
            }
        }
    }

    @Override // c0.o1
    @NonNull
    public Surface L2(@NonNull Executor executor, @NonNull Consumer<o1.b> consumer) {
        boolean z11;
        synchronized (this.f100167a) {
            this.f100179m = executor;
            this.f100178l = consumer;
            z11 = this.f100180n;
        }
        if (z11) {
            B();
        }
        return this.f100168b;
    }

    @Override // c0.o1
    public void R1(@NonNull float[] fArr, @NonNull float[] fArr2, boolean z11) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z11 ? this.f100174h : this.f100175i, 0);
    }

    @Override // c0.o1
    public void S0(@NonNull float[] fArr, @NonNull float[] fArr2) {
        R1(fArr, fArr2, true);
    }

    @Override // c0.o1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f100167a) {
            try {
                if (!this.f100181o) {
                    this.f100181o = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f100183q.c(null);
    }

    @Override // c0.o1
    public int getFormat() {
        return this.f100170d;
    }

    @Override // c0.o1
    @NonNull
    public Size getSize() {
        return this.f100171e;
    }

    @NonNull
    public com.google.common.util.concurrent.s<Void> t() {
        return this.f100182p;
    }
}
