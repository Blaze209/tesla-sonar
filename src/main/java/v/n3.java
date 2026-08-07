package v;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.core.CameraControl;
import ch.qos.logback.classic.pattern.CallerDataConverter;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final v f117128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final o3 f117129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final Executor f117130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f117131d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.concurrent.futures.c.a<Integer> f117132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private v.c f117133f;

    n3(@NonNull v vVar, @NonNull w.z zVar, @NonNull Executor executor) {
        this.f117128a = vVar;
        this.f117129b = new o3(zVar, 0);
        this.f117130c = executor;
    }

    public static /* synthetic */ void a(n3 n3Var, final androidx.concurrent.futures.c.a aVar, final int i11) {
        if (!n3Var.f117131d) {
            n3Var.f117129b.d(0);
            aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        n3Var.d();
        u5.h.j(n3Var.f117132e == null, "mRunningCompleter should be null when starting set a new exposure compensation value");
        u5.h.j(n3Var.f117133f == null, "mRunningCaptureResultListener should be null when starting set a new exposure compensation value");
        v.c cVar = new v.c() { // from class: v.m3
            @Override // v.v.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return n3.c(i11, aVar, totalCaptureResult);
            }
        };
        n3Var.f117133f = cVar;
        n3Var.f117132e = aVar;
        n3Var.f117128a.A(cVar);
        n3Var.f117128a.l0();
    }

    public static /* synthetic */ Object b(final n3 n3Var, final int i11, final androidx.concurrent.futures.c.a aVar) {
        n3Var.f117130c.execute(new Runnable() { // from class: v.l3
            @Override // java.lang.Runnable
            public final void run() {
                n3.a(this.f117101a, aVar, i11);
            }
        });
        return "setExposureCompensationIndex[" + i11 + "]";
    }

    public static /* synthetic */ boolean c(int i11, androidx.concurrent.futures.c.a aVar, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        if (num == null || num2 == null) {
            if (num2 == null || num2.intValue() != i11) {
                return false;
            }
            aVar.c(Integer.valueOf(i11));
            return true;
        }
        int iIntValue = num.intValue();
        if ((iIntValue != 2 && iIntValue != 3 && iIntValue != 4) || num2.intValue() != i11) {
            return false;
        }
        aVar.c(Integer.valueOf(i11));
        return true;
    }

    private void d() {
        androidx.concurrent.futures.c.a<Integer> aVar = this.f117132e;
        if (aVar != null) {
            aVar.f(new CameraControl.OperationCanceledException("Cancelled by another setExposureCompensationIndex()"));
            this.f117132e = null;
        }
        v.c cVar = this.f117133f;
        if (cVar != null) {
            this.f117128a.c0(cVar);
            this.f117133f = null;
        }
    }

    static c0.c0 e(w.z zVar) {
        return new o3(zVar, 0);
    }

    @NonNull
    c0.c0 f() {
        return this.f117129b;
    }

    void g(boolean z11) {
        if (z11 == this.f117131d) {
            return;
        }
        this.f117131d = z11;
        if (z11) {
            return;
        }
        this.f117129b.d(0);
        d();
    }

    void h(@NonNull u.a.C2464a c2464a) {
        c2464a.g(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f117129b.a()), androidx.camera.core.impl.x0.c.REQUIRED);
    }

    @NonNull
    com.google.common.util.concurrent.s<Integer> i(final int i11) {
        if (!this.f117129b.c()) {
            return j0.n.n(new IllegalArgumentException("ExposureCompensation is not supported"));
        }
        Range<Integer> rangeB = this.f117129b.b();
        if (rangeB.contains(Integer.valueOf(i11))) {
            this.f117129b.d(i11);
            return j0.n.s(androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.k3
                @Override // androidx.concurrent.futures.c.InterfaceC0146c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return n3.b(this.f117067a, i11, aVar);
                }
            }));
        }
        return j0.n.n(new IllegalArgumentException("Requested ExposureCompensation " + i11 + " is not within valid range [" + rangeB.getUpper() + CallerDataConverter.DEFAULT_RANGE_DELIMITER + rangeB.getLower() + "]"));
    }
}
