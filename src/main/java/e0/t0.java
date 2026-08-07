package e0;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.r2;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.core.util.Consumer;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final Executor f61367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final p0.y f61368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CameraCharacteristics f61369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    y f61370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f61371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p0.a0<b, p0.b0<androidx.camera.core.n>> f61372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p0.a0<b0.a, p0.b0<byte[]>> f61373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p0.a0<j.b, p0.b0<byte[]>> f61374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p0.a0<f0.a, c0.r0.h> f61375i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p0.a0<p0.b0<byte[]>, p0.b0<Bitmap>> f61376j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p0.a0<p0.b0<androidx.camera.core.n>, androidx.camera.core.n> f61377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p0.a0<p0.b0<byte[]>, p0.b0<androidx.camera.core.n>> f61378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private p0.a0<p0.b0<androidx.camera.core.n>, Bitmap> f61379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p0.a0<p0.b0<Bitmap>, p0.b0<Bitmap>> f61380n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final r2 f61381o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f61382p;

    static abstract class a {
        a() {
        }

        static a e(int i11, @NonNull List<Integer> list) {
            return new f(new p0.u(), new p0.u(), i11, list);
        }

        @NonNull
        abstract p0.u<b> a();

        abstract int b();

        @NonNull
        abstract List<Integer> c();

        @NonNull
        abstract p0.u<b> d();
    }

    static abstract class b {
        b() {
        }

        static b c(@NonNull u0 u0Var, @NonNull androidx.camera.core.n nVar) {
            return new g(u0Var, nVar);
        }

        @NonNull
        abstract androidx.camera.core.n a();

        @NonNull
        abstract u0 b();
    }

    t0(@NonNull Executor executor, CameraCharacteristics cameraCharacteristics, p0.y yVar) {
        this(executor, cameraCharacteristics, yVar, androidx.camera.core.internal.compat.quirk.a.c());
    }

    public static /* synthetic */ void b(final t0 t0Var, final b bVar) {
        t0Var.getClass();
        if (bVar.b().l()) {
            bVar.a().close();
        } else {
            t0Var.f61367a.execute(new Runnable() { // from class: e0.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61352a.k(bVar);
                }
            });
        }
    }

    public static /* synthetic */ void d(final t0 t0Var, final b bVar) {
        t0Var.getClass();
        if (!bVar.b().l()) {
            t0Var.f61367a.execute(new Runnable() { // from class: e0.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61349a.m(bVar);
                }
            });
        } else {
            c0.y0.l("ProcessingNode", "The postview image is closed due to request aborted");
            bVar.a().close();
        }
    }

    private p0.b0<byte[]> i(p0.b0<byte[]> b0Var, int i11) {
        u5.h.i(ImageUtil.j(b0Var.e()));
        p0.b0<Bitmap> b0VarApply = this.f61376j.apply(b0Var);
        p0.a0<p0.b0<Bitmap>, p0.b0<Bitmap>> a0Var = this.f61380n;
        if (a0Var != null) {
            b0VarApply = a0Var.apply(b0VarApply);
        }
        return this.f61374h.apply(j.b.c(b0VarApply, i11));
    }

    @NonNull
    private c0.r0.h o(@NonNull p0.b0<androidx.camera.core.n> b0Var, @NonNull c0.r0.g gVar, int i11) {
        p0.b0<byte[]> b0VarApply = this.f61373g.apply(b0.a.c(b0Var, i11));
        if (b0VarApply.i() || this.f61380n != null) {
            b0VarApply = i(b0VarApply, i11);
        }
        p0.a0<f0.a, c0.r0.h> a0Var = this.f61375i;
        Objects.requireNonNull(gVar);
        return a0Var.apply(f0.a.c(b0VarApply, gVar));
    }

    @NonNull
    private c0.r0.h p(@NonNull p0.b0<androidx.camera.core.n> b0Var, @NonNull c0.r0.g gVar) throws ImageCaptureException {
        if (this.f61370d == null) {
            if (this.f61369c == null) {
                throw new ImageCaptureException(0, "CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            if (b0Var.a().j() == null) {
                throw new ImageCaptureException(0, "CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            CameraCharacteristics cameraCharacteristics = this.f61369c;
            Objects.requireNonNull(cameraCharacteristics);
            CaptureResult captureResultJ = b0Var.a().j();
            Objects.requireNonNull(captureResultJ);
            this.f61370d = new y(cameraCharacteristics, captureResultJ);
        }
        y yVar = this.f61370d;
        androidx.camera.core.n nVarC = b0Var.c();
        int iF = b0Var.f();
        Objects.requireNonNull(gVar);
        return yVar.apply(y.a.d(nVarC, iF, gVar));
    }

    private void q(@NonNull final u0 u0Var, @NonNull final ImageCaptureException imageCaptureException) {
        i0.c.e().execute(new Runnable() { // from class: e0.s0
            @Override // java.lang.Runnable
            public final void run() {
                u0Var.u(imageCaptureException);
            }
        });
    }

    @NonNull
    androidx.camera.core.n j(@NonNull b bVar) {
        u0 u0VarB = bVar.b();
        p0.b0<androidx.camera.core.n> b0VarApply = this.f61372f.apply(bVar);
        List<Integer> listC = this.f61371e.c();
        u5.h.a(!listC.isEmpty());
        int iIntValue = listC.get(0).intValue();
        if ((b0VarApply.e() == 35 || this.f61380n != null || this.f61382p) && iIntValue == 256) {
            p0.b0<byte[]> b0VarApply2 = this.f61373g.apply(b0.a.c(b0VarApply, u0VarB.c()));
            if (this.f61380n != null) {
                b0VarApply2 = i(b0VarApply2, u0VarB.c());
            }
            b0VarApply = this.f61378l.apply(b0VarApply2);
        }
        androidx.camera.core.n nVarApply = this.f61377k.apply(b0VarApply);
        if (listC.size() > 1) {
            u0VarB.k().u(nVarApply.getFormat(), true);
        }
        return nVarApply;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(@NonNull b bVar) {
        final u0 u0VarB = bVar.b();
        try {
            boolean z11 = true;
            if (this.f61371e.c().size() <= 1) {
                z11 = false;
            }
            if (bVar.b().m()) {
                final androidx.camera.core.n nVarJ = j(bVar);
                i0.c.e().execute(new Runnable() { // from class: e0.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        u0VarB.q(nVarJ);
                    }
                });
                return;
            }
            final c0.r0.h hVarL = l(bVar);
            if (z11 && !u0VarB.k().s()) {
                return;
            }
            i0.c.e().execute(new Runnable() { // from class: e0.q0
                @Override // java.lang.Runnable
                public final void run() {
                    u0VarB.r(hVarL);
                }
            });
        } catch (ImageCaptureException e11) {
            q(u0VarB, e11);
        } catch (OutOfMemoryError e12) {
            q(u0VarB, new ImageCaptureException(0, "Processing failed due to low memory.", e12));
        } catch (RuntimeException e13) {
            q(u0VarB, new ImageCaptureException(0, "Processing failed.", e13));
        }
    }

    @NonNull
    c0.r0.h l(@NonNull b bVar) throws ImageCaptureException {
        List<Integer> listC = this.f61371e.c();
        u5.h.a(!listC.isEmpty());
        boolean z11 = false;
        Integer num = listC.get(0);
        int iIntValue = num.intValue();
        u5.h.b(ImageUtil.j(iIntValue) || ImageUtil.k(iIntValue), String.format("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: %s", num));
        u0 u0VarB = bVar.b();
        u5.h.b(u0VarB.d() != null, "OutputFileOptions cannot be empty");
        p0.b0<androidx.camera.core.n> b0VarApply = this.f61372f.apply(bVar);
        if (listC.size() <= 1) {
            if (iIntValue != 32) {
                c0.r0.g gVarD = u0VarB.d();
                Objects.requireNonNull(gVarD);
                return o(b0VarApply, gVarD, u0VarB.c());
            }
            c0.r0.g gVarD2 = u0VarB.d();
            Objects.requireNonNull(gVarD2);
            return p(b0VarApply, gVarD2);
        }
        if (u0VarB.d() != null && u0VarB.g() != null) {
            z11 = true;
        }
        u5.h.b(z11, "The number of OutputFileOptions for simultaneous capture should be at least two");
        if (b0VarApply.e() != 32) {
            c0.r0.g gVarG = u0VarB.g();
            Objects.requireNonNull(gVarG);
            c0.r0.h hVarO = o(b0VarApply, gVarG, u0VarB.c());
            u0VarB.k().u(256, true);
            return hVarO;
        }
        c0.r0.g gVarD3 = u0VarB.d();
        Objects.requireNonNull(gVarD3);
        c0.r0.h hVarP = p(b0VarApply, gVarD3);
        u0VarB.k().u(32, true);
        return hVarP;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(@NonNull b bVar) {
        List<Integer> listC = this.f61371e.c();
        boolean z11 = true;
        u5.h.a(!listC.isEmpty());
        Integer num = listC.get(0);
        int iIntValue = num.intValue();
        if (iIntValue != 35 && iIntValue != 256) {
            z11 = false;
        }
        u5.h.b(z11, String.format("Postview only support YUV and JPEG output formats. Output format: %s", num));
        final u0 u0VarB = bVar.b();
        try {
            final Bitmap bitmapApply = this.f61379m.apply(this.f61372f.apply(bVar));
            i0.c.e().execute(new Runnable() { // from class: e0.r0
                @Override // java.lang.Runnable
                public final void run() {
                    u0VarB.t(bitmapApply);
                }
            });
        } catch (Exception e11) {
            bVar.a().close();
            c0.y0.d("ProcessingNode", "process postview input packet failed.", e11);
        }
    }

    @NonNull
    public Void r(@NonNull a aVar) {
        this.f61371e = aVar;
        aVar.a().a(new Consumer() { // from class: e0.l0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                t0.b(this.f61344a, (t0.b) obj);
            }
        });
        aVar.d().a(new Consumer() { // from class: e0.m0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                t0.d(this.f61347a, (t0.b) obj);
            }
        });
        this.f61372f = new k0();
        this.f61373g = new b0(this.f61381o);
        this.f61376j = new e0();
        this.f61374h = new j();
        this.f61375i = new f0();
        this.f61377k = new h0();
        this.f61379m = new a0();
        if (aVar.b() == 35 || this.f61368b != null || this.f61382p) {
            this.f61378l = new g0();
        }
        p0.y yVar = this.f61368b;
        if (yVar == null) {
            return null;
        }
        this.f61380n = new k(yVar);
        return null;
    }

    t0(@NonNull Executor executor, CameraCharacteristics cameraCharacteristics, p0.y yVar, @NonNull r2 r2Var) {
        if (androidx.camera.core.internal.compat.quirk.a.b(LowMemoryQuirk.class) != null) {
            this.f61367a = i0.c.g(executor);
        } else {
            this.f61367a = executor;
        }
        this.f61368b = yVar;
        this.f61369c = cameraCharacteristics;
        this.f61381o = r2Var;
        this.f61382p = r2Var.a(IncorrectJpegMetadataQuirk.class);
    }

    public void n() {
    }
}
