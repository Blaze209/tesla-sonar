package v;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Log;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class e4 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final MeteringRectangle[] f116949x = new MeteringRectangle[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f116950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Executor f116951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f116952c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private final z.m f116955f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ScheduledFuture<?> f116958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ScheduledFuture<?> f116959j;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MeteringRectangle[] f116966q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private MeteringRectangle[] f116967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private MeteringRectangle[] f116968s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    androidx.concurrent.futures.c.a<c0.f0> f116969t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    androidx.concurrent.futures.c.a<Void> f116970u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f116971v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private v.c f116972w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f116953d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Rational f116954e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f116956g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    Integer f116957h = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f116960k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f116961l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f116962m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f116963n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private v.c f116964o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private v.c f116965p = null;

    class a extends androidx.camera.core.impl.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a f116973a;

        a(androidx.concurrent.futures.c.a aVar) {
            this.f116973a = aVar;
        }

        @Override // androidx.camera.core.impl.p
        public void a(int i11) {
            androidx.concurrent.futures.c.a aVar = this.f116973a;
            if (aVar != null) {
                aVar.f(new CameraControl.OperationCanceledException("Camera is closed"));
            }
        }

        @Override // androidx.camera.core.impl.p
        public void b(int i11, @NonNull androidx.camera.core.impl.z zVar) {
            androidx.concurrent.futures.c.a aVar = this.f116973a;
            if (aVar != null) {
                aVar.c(zVar);
            }
        }

        @Override // androidx.camera.core.impl.p
        public void c(int i11, @NonNull androidx.camera.core.impl.r rVar) {
            androidx.concurrent.futures.c.a aVar = this.f116973a;
            if (aVar != null) {
                aVar.f(new CameraControlInternal.CameraControlException(rVar));
            }
        }
    }

    class b extends androidx.camera.core.impl.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a f116975a;

        b(androidx.concurrent.futures.c.a aVar) {
            this.f116975a = aVar;
        }

        @Override // androidx.camera.core.impl.p
        public void a(int i11) {
            androidx.concurrent.futures.c.a aVar = this.f116975a;
            if (aVar != null) {
                aVar.f(new CameraControl.OperationCanceledException("Camera is closed"));
            }
        }

        @Override // androidx.camera.core.impl.p
        public void b(int i11, @NonNull androidx.camera.core.impl.z zVar) {
            if (this.f116975a != null) {
                c0.y0.a("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                this.f116975a.c(null);
            }
        }

        @Override // androidx.camera.core.impl.p
        public void c(int i11, @NonNull androidx.camera.core.impl.r rVar) {
            androidx.concurrent.futures.c.a aVar = this.f116975a;
            if (aVar != null) {
                aVar.f(new CameraControlInternal.CameraControlException(rVar));
            }
        }
    }

    e4(@NonNull v vVar, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Executor executor, @NonNull androidx.camera.core.impl.r2 r2Var) {
        MeteringRectangle[] meteringRectangleArr = f116949x;
        this.f116966q = meteringRectangleArr;
        this.f116967r = meteringRectangleArr;
        this.f116968s = meteringRectangleArr;
        this.f116969t = null;
        this.f116970u = null;
        this.f116971v = false;
        this.f116972w = null;
        this.f116950a = vVar;
        this.f116951b = executor;
        this.f116952c = scheduledExecutorService;
        this.f116955f = new z.m(r2Var);
    }

    private void A(@NonNull MeteringRectangle[] meteringRectangleArr, @NonNull MeteringRectangle[] meteringRectangleArr2, @NonNull MeteringRectangle[] meteringRectangleArr3, c0.e0 e0Var, long j11) {
        final long jL0;
        this.f116950a.c0(this.f116964o);
        x();
        u();
        this.f116966q = meteringRectangleArr;
        this.f116967r = meteringRectangleArr2;
        this.f116968s = meteringRectangleArr3;
        if (Q()) {
            this.f116956g = true;
            this.f116961l = false;
            this.f116962m = false;
            jL0 = this.f116950a.l0();
            W(null, true);
        } else {
            this.f116956g = false;
            this.f116961l = true;
            this.f116962m = false;
            jL0 = this.f116950a.l0();
        }
        this.f116957h = 0;
        final boolean zI = I();
        v.c cVar = new v.c() { // from class: v.d4
            @Override // v.v.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return e4.l(this.f116937a, zI, jL0, totalCaptureResult);
            }
        };
        this.f116964o = cVar;
        this.f116950a.A(cVar);
        final long j12 = this.f116960k + 1;
        this.f116960k = j12;
        Runnable runnable = new Runnable() { // from class: v.q3
            @Override // java.lang.Runnable
            public final void run() {
                e4 e4Var = this.f117221a;
                e4Var.f116951b.execute(new Runnable() { // from class: v.u3
                    @Override // java.lang.Runnable
                    public final void run() {
                        e4.k(e4Var, j);
                    }
                });
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.f116952c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f116959j = scheduledExecutorService.schedule(runnable, j11, timeUnit);
        if (e0Var.e()) {
            this.f116958i = this.f116952c.schedule(new Runnable() { // from class: v.r3
                @Override // java.lang.Runnable
                public final void run() {
                    e4 e4Var = this.f117250a;
                    e4Var.f116951b.execute(new Runnable() { // from class: v.s3
                        @Override // java.lang.Runnable
                        public final void run() {
                            e4.m(e4Var, j);
                        }
                    });
                }
            }, e0Var.a(), timeUnit);
        }
    }

    private void B(String str) {
        this.f116950a.c0(this.f116964o);
        androidx.concurrent.futures.c.a<c0.f0> aVar = this.f116969t;
        if (aVar != null) {
            aVar.f(new CameraControl.OperationCanceledException(str));
            this.f116969t = null;
        }
    }

    private void C(String str) {
        this.f116950a.c0(this.f116965p);
        androidx.concurrent.futures.c.a<Void> aVar = this.f116970u;
        if (aVar != null) {
            aVar.f(new CameraControl.OperationCanceledException(str));
            this.f116970u = null;
        }
    }

    private Rational E() {
        if (this.f116954e != null) {
            return this.f116954e;
        }
        Rect rectE = this.f116950a.E();
        return new Rational(rectE.width(), rectE.height());
    }

    private static PointF F(@NonNull c0.b1 b1Var, @NonNull Rational rational, @NonNull Rational rational2, int i11, z.m mVar) {
        if (b1Var.b() != null) {
            rational2 = b1Var.b();
        }
        PointF pointFA = mVar.a(b1Var, i11);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float fDoubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                pointFA.y = (((float) ((((double) fDoubleValue) - 1.0d) / 2.0d)) + pointFA.y) * (1.0f / fDoubleValue);
                return pointFA;
            }
            float fDoubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
            pointFA.x = (((float) ((((double) fDoubleValue2) - 1.0d) / 2.0d)) + pointFA.x) * (1.0f / fDoubleValue2);
        }
        return pointFA;
    }

    private static MeteringRectangle G(c0.b1 b1Var, PointF pointF, Rect rect) {
        int iWidth = (int) (rect.left + (pointF.x * rect.width()));
        int iHeight = (int) (rect.top + (pointF.y * rect.height()));
        int iA = ((int) (b1Var.a() * rect.width())) / 2;
        int iA2 = ((int) (b1Var.a() * rect.height())) / 2;
        Rect rect2 = new Rect(iWidth - iA, iHeight - iA2, iWidth + iA, iHeight + iA2);
        rect2.left = M(rect2.left, rect.right, rect.left);
        rect2.right = M(rect2.right, rect.right, rect.left);
        rect2.top = M(rect2.top, rect.bottom, rect.top);
        rect2.bottom = M(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, 1000);
    }

    @NonNull
    private List<MeteringRectangle> H(@NonNull List<c0.b1> list, int i11, @NonNull Rational rational, @NonNull Rect rect, int i12) {
        if (list.isEmpty() || i11 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        for (c0.b1 b1Var : list) {
            if (arrayList.size() == i11) {
                break;
            }
            if (L(b1Var)) {
                MeteringRectangle meteringRectangleG = G(b1Var, F(b1Var, rational2, rational, i12, this.f116955f), rect);
                if (meteringRectangleG.getWidth() != 0 && meteringRectangleG.getHeight() != 0) {
                    arrayList.add(meteringRectangleG);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private boolean I() {
        return this.f116950a.Q(1) == 1;
    }

    private static boolean L(@NonNull c0.b1 b1Var) {
        return b1Var.c() >= BitmapDescriptorFactory.HUE_RED && b1Var.c() <= 1.0f && b1Var.d() >= BitmapDescriptorFactory.HUE_RED && b1Var.d() <= 1.0f;
    }

    private static int M(int i11, int i12, int i13) {
        return Math.min(Math.max(i11, i13), i12);
    }

    private boolean Q() {
        return this.f116966q.length > 0;
    }

    public static /* synthetic */ boolean a(e4 e4Var, int i11, long j11, TotalCaptureResult totalCaptureResult) {
        e4Var.getClass();
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i11 || !v.a0(totalCaptureResult, j11)) {
            return false;
        }
        e4Var.w();
        return true;
    }

    public static /* synthetic */ void b(e4 e4Var, boolean z11, androidx.concurrent.futures.c.a aVar) {
        e4Var.f116950a.c0(e4Var.f116972w);
        e4Var.f116971v = z11;
        e4Var.z(aVar);
    }

    public static /* synthetic */ Object c(final e4 e4Var, final c0.e0 e0Var, final long j11, final androidx.concurrent.futures.c.a aVar) {
        e4Var.f116951b.execute(new Runnable() { // from class: v.b4
            @Override // java.lang.Runnable
            public final void run() {
                this.f116829a.T(aVar, e0Var, j11);
            }
        });
        return "startFocusAndMetering";
    }

    public static /* synthetic */ Object f(final e4 e4Var, final boolean z11, final androidx.concurrent.futures.c.a aVar) {
        e4Var.f116951b.execute(new Runnable() { // from class: v.v3
            @Override // java.lang.Runnable
            public final void run() {
                e4.b(this.f117349a, z11, aVar);
            }
        });
        return "enableExternalFlashAeMode";
    }

    public static /* synthetic */ boolean i(e4 e4Var, long j11, androidx.concurrent.futures.c.a aVar, TotalCaptureResult totalCaptureResult) {
        e4Var.getClass();
        boolean z11 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
        c0.y0.a("FocusMeteringControl", "enableExternalFlashAeMode: isAeModeExternalFlash = " + z11);
        if (z11 != e4Var.f116971v || !v.a0(totalCaptureResult, j11)) {
            return false;
        }
        c0.y0.a("FocusMeteringControl", "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z11);
        if (aVar != null) {
            aVar.c(null);
        }
        return true;
    }

    public static /* synthetic */ Object j(final e4 e4Var, final androidx.concurrent.futures.c.a aVar) {
        e4Var.f116951b.execute(new Runnable() { // from class: v.w3
            @Override // java.lang.Runnable
            public final void run() {
                this.f117362a.V(aVar);
            }
        });
        return "triggerAePrecapture";
    }

    public static /* synthetic */ void k(e4 e4Var, long j11) {
        if (j11 == e4Var.f116960k) {
            e4Var.f116962m = false;
            e4Var.v(false);
        }
    }

    public static /* synthetic */ boolean l(e4 e4Var, boolean z11, long j11, TotalCaptureResult totalCaptureResult) {
        e4Var.getClass();
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (e4Var.Q()) {
            if (!z11 || num == null) {
                e4Var.f116962m = true;
                e4Var.f116961l = true;
            } else if (e4Var.f116957h.intValue() == 3) {
                if (num.intValue() == 4) {
                    e4Var.f116962m = true;
                    e4Var.f116961l = true;
                } else if (num.intValue() == 5) {
                    e4Var.f116962m = false;
                    e4Var.f116961l = true;
                }
            }
        }
        if (e4Var.f116961l && v.a0(totalCaptureResult, j11)) {
            e4Var.v(e4Var.f116962m);
            return true;
        }
        if (!e4Var.f116957h.equals(num) && num != null) {
            e4Var.f116957h = num;
        }
        return false;
    }

    public static /* synthetic */ void m(e4 e4Var, long j11) {
        if (j11 == e4Var.f116960k) {
            e4Var.t();
        }
    }

    public static /* synthetic */ Object n(final e4 e4Var, final androidx.concurrent.futures.c.a aVar) {
        e4Var.f116951b.execute(new Runnable() { // from class: v.a4
            @Override // java.lang.Runnable
            public final void run() {
                this.f116819a.s(aVar);
            }
        });
        return "cancelFocusAndMetering";
    }

    private void u() {
        ScheduledFuture<?> scheduledFuture = this.f116959j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f116959j = null;
        }
    }

    private void w() {
        androidx.concurrent.futures.c.a<Void> aVar = this.f116970u;
        if (aVar != null) {
            aVar.c(null);
            this.f116970u = null;
        }
    }

    private void x() {
        ScheduledFuture<?> scheduledFuture = this.f116958i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f116958i = null;
        }
    }

    private void z(final androidx.concurrent.futures.c.a<Void> aVar) {
        if (!this.f116953d) {
            if (aVar != null) {
                aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
            }
        } else {
            final long jL0 = this.f116950a.l0();
            v.c cVar = new v.c() { // from class: v.x3
                @Override // v.v.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return e4.i(this.f117391a, jL0, aVar, totalCaptureResult);
                }
            };
            this.f116972w = cVar;
            this.f116950a.A(cVar);
        }
    }

    int D() {
        return this.f116963n != 3 ? 4 : 3;
    }

    boolean J() {
        return this.f116971v;
    }

    boolean K(@NonNull c0.e0 e0Var) {
        Rect rectE = this.f116950a.E();
        Rational rationalE = E();
        return (H(e0Var.c(), this.f116950a.J(), rationalE, rectE, 1).isEmpty() && H(e0Var.b(), this.f116950a.I(), rationalE, rectE, 2).isEmpty() && H(e0Var.d(), this.f116950a.K(), rationalE, rectE, 4).isEmpty()) ? false : true;
    }

    void N(boolean z11) {
        if (z11 == this.f116953d) {
            return;
        }
        this.f116953d = z11;
        if (this.f116953d) {
            return;
        }
        t();
    }

    public void O(Rational rational) {
        this.f116954e = rational;
    }

    void P(int i11) {
        this.f116963n = i11;
    }

    @NonNull
    com.google.common.util.concurrent.s<c0.f0> R(@NonNull c0.e0 e0Var) {
        return S(e0Var, DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
    }

    @NonNull
    com.google.common.util.concurrent.s<c0.f0> S(@NonNull final c0.e0 e0Var, final long j11) {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.y3
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return e4.c(this.f117402a, e0Var, j11, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(@NonNull androidx.concurrent.futures.c.a<c0.f0> aVar, @NonNull c0.e0 e0Var, long j11) {
        if (!this.f116953d) {
            aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        Rect rectE = this.f116950a.E();
        Rational rationalE = E();
        List<MeteringRectangle> listH = H(e0Var.c(), this.f116950a.J(), rationalE, rectE, 1);
        List<MeteringRectangle> listH2 = H(e0Var.b(), this.f116950a.I(), rationalE, rectE, 2);
        List<MeteringRectangle> listH3 = H(e0Var.d(), this.f116950a.K(), rationalE, rectE, 4);
        if (listH.isEmpty() && listH2.isEmpty() && listH3.isEmpty()) {
            aVar.f(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
            return;
        }
        B("Cancelled by another startFocusAndMetering()");
        C("Cancelled by another startFocusAndMetering()");
        x();
        this.f116969t = aVar;
        MeteringRectangle[] meteringRectangleArr = f116949x;
        A((MeteringRectangle[]) listH.toArray(meteringRectangleArr), (MeteringRectangle[]) listH2.toArray(meteringRectangleArr), (MeteringRectangle[]) listH3.toArray(meteringRectangleArr), e0Var, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.common.util.concurrent.s<Void> U() {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.p3
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return e4.j(this.f117158a, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(androidx.concurrent.futures.c.a<Void> aVar) {
        c0.y0.a("FocusMeteringControl", "triggerAePrecapture");
        if (!this.f116953d) {
            if (aVar != null) {
                aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        androidx.camera.core.impl.v0.a aVar2 = new androidx.camera.core.impl.v0.a();
        aVar2.v(this.f116963n);
        aVar2.w(true);
        u.a.C2464a c2464a = new u.a.C2464a();
        c2464a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.e(c2464a.a());
        aVar2.c(new b(aVar));
        this.f116950a.j0(Collections.singletonList(aVar2.h()));
    }

    void W(androidx.concurrent.futures.c.a<androidx.camera.core.impl.z> aVar, boolean z11) {
        if (!this.f116953d) {
            if (aVar != null) {
                aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        androidx.camera.core.impl.v0.a aVar2 = new androidx.camera.core.impl.v0.a();
        aVar2.v(this.f116963n);
        aVar2.w(true);
        u.a.C2464a c2464a = new u.a.C2464a();
        c2464a.f(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z11) {
            c2464a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f116950a.O(1)), androidx.camera.core.impl.x0.c.HIGH_PRIORITY_REQUIRED);
        }
        aVar2.e(c2464a.a());
        aVar2.c(new a(aVar));
        this.f116950a.j0(Collections.singletonList(aVar2.h()));
    }

    void p(@NonNull u.a.C2464a c2464a) {
        int iD = this.f116956g ? 1 : D();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Integer numValueOf = Integer.valueOf(this.f116950a.Q(iD));
        androidx.camera.core.impl.x0.c cVar = androidx.camera.core.impl.x0.c.REQUIRED;
        c2464a.g(key, numValueOf, cVar);
        MeteringRectangle[] meteringRectangleArr = this.f116966q;
        if (meteringRectangleArr.length != 0) {
            c2464a.g(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, cVar);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f116967r;
        if (meteringRectangleArr2.length != 0) {
            c2464a.g(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, cVar);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f116968s;
        if (meteringRectangleArr3.length != 0) {
            c2464a.g(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, cVar);
        }
    }

    void q(boolean z11, boolean z12) {
        if (this.f116953d) {
            androidx.camera.core.impl.v0.a aVar = new androidx.camera.core.impl.v0.a();
            aVar.w(true);
            aVar.v(this.f116963n);
            u.a.C2464a c2464a = new u.a.C2464a();
            if (z11) {
                c2464a.f(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z12) {
                c2464a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.e(c2464a.a());
            this.f116950a.j0(Collections.singletonList(aVar.h()));
        }
    }

    com.google.common.util.concurrent.s<Void> r() {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.z3
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return e4.n(this.f117425a, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(androidx.concurrent.futures.c.a<Void> aVar) {
        C("Cancelled by another cancelFocusAndMetering()");
        B("Cancelled by cancelFocusAndMetering()");
        this.f116970u = aVar;
        x();
        u();
        if (Q()) {
            q(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f116949x;
        this.f116966q = meteringRectangleArr;
        this.f116967r = meteringRectangleArr;
        this.f116968s = meteringRectangleArr;
        this.f116956g = false;
        final long jL0 = this.f116950a.l0();
        if (this.f116970u != null) {
            final int iQ = this.f116950a.Q(D());
            v.c cVar = new v.c() { // from class: v.c4
                @Override // v.v.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return e4.a(this.f116877a, iQ, jL0, totalCaptureResult);
                }
            };
            this.f116965p = cVar;
            this.f116950a.A(cVar);
        }
    }

    void t() {
        s(null);
    }

    void v(boolean z11) {
        u();
        androidx.concurrent.futures.c.a<c0.f0> aVar = this.f116969t;
        if (aVar != null) {
            aVar.c(c0.f0.a(z11));
            this.f116969t = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.common.util.concurrent.s<Void> y(final boolean z11) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API " + i11);
            return j0.n.p(null);
        }
        if (this.f116950a.O(5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return j0.n.p(null);
        }
        Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.t3
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return e4.f(this.f117282a, z11, aVar);
            }
        });
    }
}
