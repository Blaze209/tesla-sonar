package v;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class v implements CameraControlInternal {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f117318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Executor f117319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f117320d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w.z f117321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CameraControlInternal.c f117322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.camera.core.impl.x2.b f117323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4 f117324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s5 f117325i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final l5 f117326j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final n3 f117327k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    u5 f117328l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b0.g f117329m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d1 f117330n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p5 f117331o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f117332p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private c0.r0.i f117333q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile boolean f117334r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile int f117335s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final z.a f117336t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final AtomicLong f117337u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    private volatile com.google.common.util.concurrent.s<Void> f117338v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f117339w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f117340x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final a f117341y;

    static final class a extends androidx.camera.core.impl.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Set<androidx.camera.core.impl.p> f117342a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Map<androidx.camera.core.impl.p, Executor> f117343b = new ArrayMap();

        a() {
        }

        @Override // androidx.camera.core.impl.p
        public void a(final int i11) {
            for (final androidx.camera.core.impl.p pVar : this.f117342a) {
                try {
                    this.f117343b.get(pVar).execute(new Runnable() { // from class: v.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            pVar.a(i11);
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    c0.y0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e11);
                }
            }
        }

        @Override // androidx.camera.core.impl.p
        public void b(final int i11, @NonNull final androidx.camera.core.impl.z zVar) {
            for (final androidx.camera.core.impl.p pVar : this.f117342a) {
                try {
                    this.f117343b.get(pVar).execute(new Runnable() { // from class: v.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            pVar.b(i11, zVar);
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    c0.y0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e11);
                }
            }
        }

        @Override // androidx.camera.core.impl.p
        public void c(final int i11, @NonNull final androidx.camera.core.impl.r rVar) {
            for (final androidx.camera.core.impl.p pVar : this.f117342a) {
                try {
                    this.f117343b.get(pVar).execute(new Runnable() { // from class: v.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            pVar.c(i11, rVar);
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    c0.y0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e11);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void i(@NonNull Executor executor, @NonNull androidx.camera.core.impl.p pVar) {
            this.f117342a.add(pVar);
            this.f117343b.put(pVar, executor);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void j(@NonNull androidx.camera.core.impl.p pVar) {
            this.f117342a.remove(pVar);
            this.f117343b.remove(pVar);
        }
    }

    static final class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Set<c> f117344a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f117345b;

        b(@NonNull Executor executor) {
            this.f117345b = executor;
        }

        public static /* synthetic */ void a(b bVar, TotalCaptureResult totalCaptureResult) {
            bVar.getClass();
            HashSet hashSet = new HashSet();
            for (c cVar : bVar.f117344a) {
                if (cVar.a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            bVar.f117344a.removeAll(hashSet);
        }

        void b(@NonNull c cVar) {
            this.f117344a.add(cVar);
        }

        void c(@NonNull c cVar) {
            this.f117344a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull final TotalCaptureResult totalCaptureResult) {
            this.f117345b.execute(new Runnable() { // from class: v.w
                @Override // java.lang.Runnable
                public final void run() {
                    v.b.a(this.f117358a, totalCaptureResult);
                }
            });
        }
    }

    public interface c {
        boolean a(@NonNull TotalCaptureResult totalCaptureResult);
    }

    v(@NonNull w.z zVar, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Executor executor, @NonNull CameraControlInternal.c cVar, @NonNull androidx.camera.core.impl.r2 r2Var) {
        androidx.camera.core.impl.x2.b bVar = new androidx.camera.core.impl.x2.b();
        this.f117323g = bVar;
        this.f117332p = 0;
        this.f117334r = false;
        this.f117335s = 2;
        this.f117337u = new AtomicLong(0L);
        this.f117338v = j0.n.p(null);
        this.f117339w = 1;
        this.f117340x = 0L;
        a aVar = new a();
        this.f117341y = aVar;
        this.f117321e = zVar;
        this.f117322f = cVar;
        this.f117319c = executor;
        this.f117331o = new p5(executor);
        b bVar2 = new b(executor);
        this.f117318b = bVar2;
        bVar.B(this.f117339w);
        bVar.k(w2.f(bVar2));
        bVar.k(aVar);
        this.f117327k = new n3(this, zVar, executor);
        this.f117324h = new e4(this, scheduledExecutorService, executor, r2Var);
        this.f117325i = new s5(this, zVar, executor);
        this.f117326j = new l5(this, zVar, executor);
        this.f117328l = new y5(zVar);
        this.f117336t = new z.a(r2Var);
        this.f117329m = new b0.g(this, executor);
        this.f117330n = new d1(this, zVar, r2Var, executor, scheduledExecutorService);
    }

    public static int P(@NonNull w.z zVar, int i11) {
        int[] iArr = (int[]) zVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (Z(i11, iArr)) {
            return i11;
        }
        return Z(1, iArr) ? 1 : 0;
    }

    private int R(int i11) {
        int[] iArr = (int[]) this.f117321e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (Z(i11, iArr)) {
            return i11;
        }
        return Z(1, iArr) ? 1 : 0;
    }

    private boolean X() {
        return T() > 0;
    }

    private static boolean Z(int i11, int[] iArr) {
        for (int i12 : iArr) {
            if (i11 == i12) {
                return true;
            }
        }
        return false;
    }

    static boolean a0(@NonNull TotalCaptureResult totalCaptureResult, long j11) {
        Long l11;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof androidx.camera.core.impl.g3) && (l11 = (Long) ((androidx.camera.core.impl.g3) tag).d("CameraControlSessionUpdateId")) != null && l11.longValue() >= j11;
    }

    @NonNull
    private com.google.common.util.concurrent.s<Void> m0(final long j11) {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.q
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return v.v(this.f117162a, j11, aVar);
            }
        });
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ Object v(v vVar, final long j11, final androidx.concurrent.futures.c.a aVar) {
        vVar.getClass();
        vVar.A(new c() { // from class: v.r
            @Override // v.v.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return v.z(j11, aVar, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j11;
    }

    public static /* synthetic */ Object w(final v vVar, final androidx.concurrent.futures.c.a aVar) {
        vVar.f117319c.execute(new Runnable() { // from class: v.p
            @Override // java.lang.Runnable
            public final void run() {
                v vVar2 = this.f117151a;
                j0.n.t(vVar2.m0(vVar2.l0()), aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    public static /* synthetic */ boolean z(long j11, androidx.concurrent.futures.c.a aVar, TotalCaptureResult totalCaptureResult) {
        if (!a0(totalCaptureResult, j11)) {
            return false;
        }
        aVar.c(null);
        return true;
    }

    void A(@NonNull c cVar) {
        this.f117318b.b(cVar);
    }

    void B(@NonNull final Executor executor, @NonNull final androidx.camera.core.impl.p pVar) {
        this.f117319c.execute(new Runnable() { // from class: v.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f117044a.f117341y.i(executor, pVar);
            }
        });
    }

    void C() {
        synchronized (this.f117320d) {
            try {
                int i11 = this.f117332p;
                if (i11 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f117332p = i11 - 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void D(boolean z11) {
        this.f117334r = z11;
        if (!z11) {
            androidx.camera.core.impl.v0.a aVar = new androidx.camera.core.impl.v0.a();
            aVar.v(this.f117339w);
            aVar.w(true);
            u.a.C2464a c2464a = new u.a.C2464a();
            c2464a.f(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(O(1)));
            c2464a.f(CaptureRequest.FLASH_MODE, 0);
            aVar.e(c2464a.a());
            j0(Collections.singletonList(aVar.h()));
        }
        l0();
    }

    @NonNull
    Rect E() {
        return this.f117325i.e();
    }

    @NonNull
    public n3 F() {
        return this.f117327k;
    }

    public int G() {
        return this.f117335s;
    }

    @NonNull
    public e4 H() {
        return this.f117324h;
    }

    int I() {
        Integer num = (Integer) this.f117321e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    int J() {
        Integer num = (Integer) this.f117321e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    int K() {
        Integer num = (Integer) this.f117321e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public c0.r0.i L() {
        return this.f117333q;
    }

    @NonNull
    public androidx.camera.core.impl.x2 M() {
        this.f117323g.B(this.f117339w);
        this.f117323g.w(N());
        this.f117323g.o("CameraControlSessionUpdateId", Long.valueOf(this.f117340x));
        return this.f117323g.p();
    }

    androidx.camera.core.impl.x0 N() {
        u.a.C2464a c2464a = new u.a.C2464a();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        androidx.camera.core.impl.x0.c cVar = androidx.camera.core.impl.x0.c.REQUIRED;
        c2464a.g(key, 1, cVar);
        this.f117324h.p(c2464a);
        this.f117325i.c(c2464a);
        int iA = this.f117324h.J() ? 5 : 1;
        if (this.f117334r) {
            c2464a.g(CaptureRequest.FLASH_MODE, 2, cVar);
        } else {
            int i11 = this.f117335s;
            if (i11 == 0) {
                iA = this.f117336t.a(2);
            } else if (i11 == 1) {
                iA = 3;
            } else if (i11 == 2) {
                iA = 1;
            }
        }
        c2464a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(O(iA)), cVar);
        c2464a.g(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(R(1)), cVar);
        this.f117327k.h(c2464a);
        this.f117329m.i(c2464a);
        return c2464a.a();
    }

    int O(int i11) {
        return P(this.f117321e, i11);
    }

    int Q(int i11) {
        int[] iArr = (int[]) this.f117321e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (Z(i11, iArr)) {
            return i11;
        }
        if (Z(4, iArr)) {
            return 4;
        }
        return Z(1, iArr) ? 1 : 0;
    }

    @NonNull
    public l5 S() {
        return this.f117326j;
    }

    int T() {
        int i11;
        synchronized (this.f117320d) {
            i11 = this.f117332p;
        }
        return i11;
    }

    @NonNull
    public s5 U() {
        return this.f117325i;
    }

    @NonNull
    public u5 V() {
        return this.f117328l;
    }

    void W() {
        synchronized (this.f117320d) {
            this.f117332p++;
        }
    }

    public boolean Y() {
        int iE = this.f117331o.e();
        c0.y0.a("Camera2CameraControlImp", "isInVideoUsage: mVideoUsageControl value = " + iE);
        return iE > 0;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void a(@NonNull androidx.camera.core.impl.x2.b bVar) {
        this.f117328l.a(bVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void b() {
        this.f117331o.c();
    }

    boolean b0() {
        return this.f117334r;
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.s<Void> c(boolean z11) {
        return !X() ? j0.n.n(new CameraControl.OperationCanceledException("Camera is not active.")) : j0.n.s(this.f117326j.d(z11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0(@NonNull c cVar) {
        this.f117318b.c(cVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public com.google.common.util.concurrent.s<List<Void>> d(@NonNull final List<androidx.camera.core.impl.v0> list, final int i11, final int i12) {
        if (X()) {
            final int iG = G();
            return j0.d.a(j0.n.s(this.f117338v)).f(new j0.a() { // from class: v.i
                @Override // j0.a
                public final com.google.common.util.concurrent.s apply(Object obj) {
                    return this.f117021a.f117330n.h(list, i11, iG, i12);
                }
            }, this.f117319c);
        }
        c0.y0.l("Camera2CameraControlImp", "Camera is not active.");
        return j0.n.n(new CameraControl.OperationCanceledException("Camera is not active."));
    }

    void d0(@NonNull final androidx.camera.core.impl.p pVar) {
        this.f117319c.execute(new Runnable() { // from class: v.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f117112a.f117341y.j(pVar);
            }
        });
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.s<Void> e(float f11) {
        return !X() ? j0.n.n(new CameraControl.OperationCanceledException("Camera is not active.")) : j0.n.s(this.f117325i.k(f11));
    }

    void e0() {
        h0(1);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void f(c0.r0.i iVar) {
        this.f117333q = iVar;
    }

    void f0(boolean z11) {
        c0.y0.a("Camera2CameraControlImp", "setActive: isActive = " + z11);
        this.f117324h.N(z11);
        this.f117325i.j(z11);
        this.f117326j.g(z11);
        this.f117327k.g(z11);
        this.f117329m.o(z11);
        if (z11) {
            return;
        }
        this.f117333q = null;
        this.f117331o.h();
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.s<c0.f0> g(@NonNull c0.e0 e0Var) {
        return !X() ? j0.n.n(new CameraControl.OperationCanceledException("Camera is not active.")) : j0.n.s(this.f117324h.R(e0Var));
    }

    public void g0(Rational rational) {
        this.f117324h.O(rational);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void h() {
        this.f117331o.f();
    }

    void h0(int i11) {
        this.f117339w = i11;
        this.f117324h.P(i11);
        this.f117330n.g(this.f117339w);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void i(@NonNull androidx.camera.core.impl.x0 x0Var) {
        this.f117329m.g(b0.k.a.e(x0Var).c()).b(new Runnable() { // from class: v.k
            @Override // java.lang.Runnable
            public final void run() {
                v.q();
            }
        }, i0.c.b());
    }

    public void i0(boolean z11) {
        this.f117328l.d(z11);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.s<Integer> j(int i11) {
        return !X() ? j0.n.n(new CameraControl.OperationCanceledException("Camera is not active.")) : this.f117327k.i(i11);
    }

    void j0(List<androidx.camera.core.impl.v0> list) {
        this.f117322f.a(list);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.s<Void> k() {
        return !X() ? j0.n.n(new CameraControl.OperationCanceledException("Camera is not active.")) : j0.n.s(this.f117324h.r());
    }

    @NonNull
    public com.google.common.util.concurrent.s<Void> k0() {
        return j0.n.s(androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.n
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return v.w(this.f117123a, aVar);
            }
        }));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public Rect l() {
        Rect rect = (Rect) this.f117321e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, 4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS) : (Rect) u5.h.g(rect);
    }

    long l0() {
        this.f117340x = this.f117337u.getAndIncrement();
        this.f117322f.b();
        return this.f117340x;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void m(int i11) {
        if (!X()) {
            c0.y0.l("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f117335s = i11;
        c0.y0.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f117335s);
        u5 u5Var = this.f117328l;
        boolean z11 = true;
        if (this.f117335s != 1 && this.f117335s != 0) {
            z11 = false;
        }
        u5Var.c(z11);
        this.f117338v = k0();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public androidx.camera.core.impl.x0 n() {
        return this.f117329m.n();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public com.google.common.util.concurrent.s<e0.l> o(final int i11, final int i12) {
        if (X()) {
            final int iG = G();
            return j0.d.a(j0.n.s(this.f117338v)).f(new j0.a() { // from class: v.l
                @Override // j0.a
                public final com.google.common.util.concurrent.s apply(Object obj) {
                    return j0.n.p(this.f117082a.f117330n.c(i11, iG, i12));
                }
            }, this.f117319c);
        }
        c0.y0.l("Camera2CameraControlImp", "Camera is not active.");
        return j0.n.n(new CameraControl.OperationCanceledException("Camera is not active."));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void p() {
        this.f117329m.j().b(new Runnable() { // from class: v.o
            @Override // java.lang.Runnable
            public final void run() {
                v.r();
            }
        }, i0.c.b());
    }
}
