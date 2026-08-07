package v;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.camera.core.CameraControl;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f117105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.p003lifecycle.i0<Integer> f117106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f117107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f117108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f117109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.concurrent.futures.c.a<Void> f117110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f117111g;

    l5(@NonNull v vVar, @NonNull w.z zVar, @NonNull Executor executor) {
        this.f117105a = vVar;
        this.f117108d = executor;
        Objects.requireNonNull(zVar);
        this.f117107c = z.g.a(new v0(zVar));
        this.f117106b = new androidx.p003lifecycle.i0<>(0);
        vVar.A(new v.c() { // from class: v.j5
            @Override // v.v.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return l5.b(this.f117063a, totalCaptureResult);
            }
        });
    }

    public static /* synthetic */ Object a(final l5 l5Var, final boolean z11, final androidx.concurrent.futures.c.a aVar) {
        l5Var.f117108d.execute(new Runnable() { // from class: v.k5
            @Override // java.lang.Runnable
            public final void run() {
                this.f117079a.e(aVar, z11);
            }
        });
        return "enableTorch: " + z11;
    }

    public static /* synthetic */ boolean b(l5 l5Var, TotalCaptureResult totalCaptureResult) {
        if (l5Var.f117110f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == l5Var.f117111g) {
                l5Var.f117110f.c(null);
                l5Var.f117110f = null;
            }
        }
        return false;
    }

    private <T> void h(@NonNull androidx.p003lifecycle.i0<T> i0Var, T t11) {
        if (h0.r.d()) {
            i0Var.setValue(t11);
        } else {
            i0Var.postValue(t11);
        }
    }

    com.google.common.util.concurrent.s<Void> d(final boolean z11) {
        if (this.f117107c) {
            h(this.f117106b, Integer.valueOf(z11 ? 1 : 0));
            return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.i5
                @Override // androidx.concurrent.futures.c.InterfaceC0146c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return l5.a(this.f117042a, z11, aVar);
                }
            });
        }
        c0.y0.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
        return j0.n.n(new IllegalStateException("No flash unit"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(androidx.concurrent.futures.c.a<Void> aVar, boolean z11) {
        if (!this.f117107c) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("No flash unit"));
            }
        } else {
            if (!this.f117109e) {
                h(this.f117106b, 0);
                if (aVar != null) {
                    aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
                    return;
                }
                return;
            }
            this.f117111g = z11;
            this.f117105a.D(z11);
            h(this.f117106b, Integer.valueOf(z11 ? 1 : 0));
            androidx.concurrent.futures.c.a<Void> aVar2 = this.f117110f;
            if (aVar2 != null) {
                aVar2.f(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
            }
            this.f117110f = aVar;
        }
    }

    @NonNull
    androidx.p003lifecycle.d0<Integer> f() {
        return this.f117106b;
    }

    void g(boolean z11) {
        if (this.f117109e == z11) {
            return;
        }
        this.f117109e = z11;
        if (z11) {
            return;
        }
        if (this.f117111g) {
            this.f117111g = false;
            this.f117105a.D(false);
            h(this.f117106b, 0);
        }
        androidx.concurrent.futures.c.a<Void> aVar = this.f117110f;
        if (aVar != null) {
            aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f117110f = null;
        }
    }
}
