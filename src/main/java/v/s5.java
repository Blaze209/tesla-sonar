package v;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.core.CameraControl;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f117264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f117265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t5 f117266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.p003lifecycle.i0<c0.d2> f117267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    final b f117268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f117269f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private v.c f117270g = new a();

    class a implements v.c {
        a() {
        }

        @Override // v.v.c
        public boolean a(@NonNull TotalCaptureResult totalCaptureResult) {
            s5.this.f117268e.a(totalCaptureResult);
            return false;
        }
    }

    interface b {
        void a(@NonNull TotalCaptureResult totalCaptureResult);

        float b();

        float c();

        void d(float f11, @NonNull androidx.concurrent.futures.c.a<Void> aVar);

        void e();

        void f(@NonNull u.a.C2464a c2464a);

        @NonNull
        Rect g();
    }

    s5(@NonNull v vVar, @NonNull w.z zVar, @NonNull Executor executor) {
        this.f117264a = vVar;
        this.f117265b = executor;
        b bVarD = d(zVar);
        this.f117268e = bVarD;
        t5 t5Var = new t5(bVarD.c(), bVarD.b());
        this.f117266c = t5Var;
        t5Var.f(1.0f);
        this.f117267d = new androidx.p003lifecycle.i0<>(k0.e.f(t5Var));
        vVar.A(this.f117270g);
    }

    public static /* synthetic */ Object b(final s5 s5Var, final c0.d2 d2Var, final androidx.concurrent.futures.c.a aVar) {
        s5Var.f117265b.execute(new Runnable() { // from class: v.r5
            @Override // java.lang.Runnable
            public final void run() {
                this.f117252a.l(aVar, d2Var);
            }
        });
        return "setZoomRatio";
    }

    private static b d(@NonNull w.z zVar) {
        return i(zVar) ? new c(zVar) : new h3(zVar);
    }

    static c0.d2 f(w.z zVar) {
        b bVarD = d(zVar);
        t5 t5Var = new t5(bVarD.c(), bVarD.b());
        t5Var.f(1.0f);
        return k0.e.f(t5Var);
    }

    private static Range<Float> g(w.z zVar) {
        try {
            return (Range) zVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (AssertionError e11) {
            c0.y0.m("ZoomControl", "AssertionError, fail to get camera characteristic.", e11);
            return null;
        }
    }

    static boolean i(w.z zVar) {
        return Build.VERSION.SDK_INT >= 30 && g(zVar) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(@NonNull androidx.concurrent.futures.c.a<Void> aVar, @NonNull c0.d2 d2Var) {
        c0.d2 d2VarF;
        if (this.f117269f) {
            this.f117268e.d(d2Var.d(), aVar);
            this.f117264a.l0();
            return;
        }
        synchronized (this.f117266c) {
            this.f117266c.f(1.0f);
            d2VarF = k0.e.f(this.f117266c);
        }
        m(d2VarF);
        aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
    }

    private void m(c0.d2 d2Var) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f117267d.setValue(d2Var);
        } else {
            this.f117267d.postValue(d2Var);
        }
    }

    void c(@NonNull u.a.C2464a c2464a) {
        this.f117268e.f(c2464a);
    }

    @NonNull
    Rect e() {
        return this.f117268e.g();
    }

    androidx.p003lifecycle.d0<c0.d2> h() {
        return this.f117267d;
    }

    void j(boolean z11) {
        c0.d2 d2VarF;
        if (this.f117269f == z11) {
            return;
        }
        this.f117269f = z11;
        if (z11) {
            return;
        }
        synchronized (this.f117266c) {
            this.f117266c.f(1.0f);
            d2VarF = k0.e.f(this.f117266c);
        }
        m(d2VarF);
        this.f117268e.e();
        this.f117264a.l0();
    }

    @NonNull
    com.google.common.util.concurrent.s<Void> k(float f11) {
        final c0.d2 d2VarF;
        synchronized (this.f117266c) {
            try {
                this.f117266c.f(f11);
                d2VarF = k0.e.f(this.f117266c);
            } catch (IllegalArgumentException e11) {
                return j0.n.n(e11);
            }
        }
        m(d2VarF);
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.q5
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return s5.b(this.f117244a, d2VarF, aVar);
            }
        });
    }
}
