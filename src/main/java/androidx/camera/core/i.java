package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.s1;
import androidx.core.os.OperationCanceledException;
import c0.x0;
import c0.y0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class i implements s1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f.a f3063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f3064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f3065c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f3067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f3068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Executor f3069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q f3070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageWriter f3071i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ByteBuffer f3076n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ByteBuffer f3077o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ByteBuffer f3078p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ByteBuffer f3079q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f3066d = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Rect f3072j = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Rect f3073k = new Rect();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Matrix f3074l = new Matrix();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Matrix f3075m = new Matrix();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f3080r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f3081s = true;

    i() {
    }

    public static /* synthetic */ void b(i iVar, n nVar, Matrix matrix, n nVar2, Rect rect, f.a aVar, androidx.concurrent.futures.c.a aVar2) {
        if (!iVar.f3081s) {
            aVar2.f(new OperationCanceledException("ImageAnalysis is detached"));
            return;
        }
        r rVar = new r(nVar2, x0.f(nVar.z().c(), nVar.z().a(), iVar.f3067e ? 0 : iVar.f3064b, matrix));
        if (!rect.isEmpty()) {
            rVar.r2(rect);
        }
        aVar.analyze(rVar);
        aVar2.c(null);
    }

    public static /* synthetic */ Object c(final i iVar, Executor executor, final n nVar, final Matrix matrix, final n nVar2, final Rect rect, final f.a aVar, final androidx.concurrent.futures.c.a aVar2) {
        iVar.getClass();
        executor.execute(new Runnable() { // from class: androidx.camera.core.h
            @Override // java.lang.Runnable
            public final void run() {
                i.b(this.f3056a, nVar, matrix, nVar2, rect, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    private void h(@NonNull n nVar) {
        if (this.f3066d != 1) {
            if (this.f3066d == 2 && this.f3076n == null) {
                this.f3076n = ByteBuffer.allocateDirect(nVar.getWidth() * nVar.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.f3077o == null) {
            this.f3077o = ByteBuffer.allocateDirect(nVar.getWidth() * nVar.getHeight());
        }
        this.f3077o.position(0);
        if (this.f3078p == null) {
            this.f3078p = ByteBuffer.allocateDirect((nVar.getWidth() * nVar.getHeight()) / 4);
        }
        this.f3078p.position(0);
        if (this.f3079q == null) {
            this.f3079q = ByteBuffer.allocateDirect((nVar.getWidth() * nVar.getHeight()) / 4);
        }
        this.f3079q.position(0);
    }

    @NonNull
    private static q i(int i11, int i12, int i13, int i14, int i15) {
        boolean z11 = i13 == 90 || i13 == 270;
        int i16 = z11 ? i12 : i11;
        if (!z11) {
            i11 = i12;
        }
        return new q(o.a(i16, i11, i14, i15));
    }

    @NonNull
    static Matrix k(int i11, int i12, int i13, int i14, int i15) {
        Matrix matrix = new Matrix();
        if (i15 > 0) {
            matrix.setRectToRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i11, i12), h0.s.f70143a, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i15);
            matrix.postConcat(h0.s.c(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i13, i14)));
        }
        return matrix;
    }

    @NonNull
    static Rect l(@NonNull Rect rect, @NonNull Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    private void n(int i11, int i12, int i13, int i14) {
        Matrix matrixK = k(i11, i12, i13, i14, this.f3064b);
        this.f3073k = l(this.f3072j, matrixK);
        this.f3075m.setConcat(this.f3074l, matrixK);
    }

    private void o(@NonNull n nVar, int i11) {
        q qVar = this.f3070h;
        if (qVar == null) {
            return;
        }
        qVar.j();
        this.f3070h = i(nVar.getWidth(), nVar.getHeight(), i11, this.f3070h.a(), this.f3070h.b());
        if (this.f3066d == 1) {
            ImageWriter imageWriter = this.f3071i;
            if (imageWriter != null) {
                l0.a.a(imageWriter);
            }
            this.f3071i = l0.a.c(this.f3070h.getSurface(), this.f3070h.b());
        }
    }

    @Override // androidx.camera.core.impl.s1.a
    public void a(@NonNull s1 s1Var) {
        try {
            n nVarD = d(s1Var);
            if (nVarD != null) {
                m(nVarD);
            }
        } catch (IllegalStateException e11) {
            y0.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e11);
        }
    }

    abstract n d(@NonNull s1 s1Var);

    com.google.common.util.concurrent.s<Void> e(@NonNull final n nVar) throws Throwable {
        Object obj;
        final Executor executor;
        final f.a aVar;
        boolean z11;
        q qVar;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        n nVar2;
        n nVarM;
        int i11 = this.f3067e ? this.f3064b : 0;
        Object obj2 = this.f3080r;
        synchronized (obj2) {
            try {
                try {
                    executor = this.f3069g;
                    aVar = this.f3063a;
                    z11 = this.f3067e && i11 != this.f3065c;
                    if (z11) {
                        o(nVar, i11);
                    }
                    if (this.f3067e) {
                        h(nVar);
                    }
                    try {
                        qVar = this.f3070h;
                        try {
                            imageWriter = this.f3071i;
                            byteBuffer = this.f3076n;
                            try {
                                byteBuffer2 = this.f3077o;
                                byteBuffer3 = this.f3078p;
                                byteBuffer4 = this.f3079q;
                            } catch (Throwable th2) {
                                th = th2;
                                obj = obj2;
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj = obj2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    obj = obj2;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
        if (aVar == null || executor == null || !this.f3081s) {
            return j0.n.n(new OperationCanceledException("No analyzer or executor currently set."));
        }
        if (qVar == null) {
            nVar2 = null;
        } else {
            if (this.f3066d == 2) {
                nVarM = ImageProcessingUtil.g(nVar, qVar, byteBuffer, i11, this.f3068f);
            } else {
                if (this.f3066d == 1) {
                    if (this.f3068f) {
                        ImageProcessingUtil.c(nVar);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        nVarM = ImageProcessingUtil.m(nVar, qVar, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i11);
                    }
                }
                nVar2 = null;
            }
            nVar2 = nVarM;
        }
        boolean z12 = nVar2 == null;
        final n nVar3 = z12 ? nVar : nVar2;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.f3080r) {
            if (z11 && !z12) {
                try {
                    n(nVar.getWidth(), nVar.getHeight(), nVar3.getWidth(), nVar3.getHeight());
                } catch (Throwable th7) {
                    throw th7;
                }
            }
            this.f3065c = i11;
            rect.set(this.f3073k);
            matrix.set(this.f3075m);
        }
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: androidx.camera.core.g
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar2) {
                return i.c(this.f3049a, executor, nVar, matrix, nVar3, rect, aVar, aVar2);
            }
        });
    }

    void f() {
        this.f3081s = true;
    }

    abstract void g();

    void j() {
        this.f3081s = false;
        g();
    }

    abstract void m(@NonNull n nVar);

    void p(Executor executor, f.a aVar) {
        if (aVar == null) {
            g();
        }
        synchronized (this.f3080r) {
            this.f3063a = aVar;
            this.f3069g = executor;
        }
    }

    void q(boolean z11) {
        this.f3068f = z11;
    }

    void r(int i11) {
        this.f3066d = i11;
    }

    void s(boolean z11) {
        this.f3067e = z11;
    }

    void t(@NonNull q qVar) {
        synchronized (this.f3080r) {
            this.f3070h = qVar;
        }
    }

    void u(int i11) {
        this.f3064b = i11;
    }

    void v(@NonNull Matrix matrix) {
        synchronized (this.f3080r) {
            this.f3074l = matrix;
            this.f3075m = new Matrix(this.f3074l);
        }
    }

    void w(@NonNull Rect rect) {
        synchronized (this.f3080r) {
            this.f3072j = rect;
            this.f3073k = new Rect(this.f3072j);
        }
    }
}
