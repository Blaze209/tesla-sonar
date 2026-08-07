package v;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.DeferrableSurface;
import expo.modules.kotlin.activityresult.DataPersistorKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
final class q0 implements androidx.camera.core.impl.j0 {
    private boolean A;
    private k4 B;

    @NonNull
    private final g3 C;

    @NonNull
    private final v4.b D;
    private final Set<String> E;

    @NonNull
    private androidx.camera.core.impl.b0 F;
    final Object G;
    private androidx.camera.core.impl.z2 H;
    boolean I;

    @NonNull
    private final i3 J;

    @NonNull
    private final w.z K;

    @NonNull
    private final x.f L;

    @NonNull
    private final u4 M;
    private final h N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.camera.core.impl.n3 f117164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w.m0 f117165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f117166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f117167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile i f117168e = i.INITIALIZED;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.camera.core.impl.a2<androidx.camera.core.impl.j0.a> f117169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t2 f117170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final v f117171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final j f117172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    final x0 f117173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    CameraDevice f117174k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f117175l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    d3 f117176m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final AtomicInteger f117177n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    com.google.common.util.concurrent.s<Void> f117178o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    androidx.concurrent.futures.c.a<Void> f117179p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final Map<d3, com.google.common.util.concurrent.s<Void>> f117180q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f117181r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    final e f117182s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    final f f117183t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    final d0.a f117184u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    final androidx.camera.core.impl.s0 f117185v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f117186w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f117187x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f117188y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f117189z;

    class a implements v.f {
        a() {
        }

        @Override // v.f
        public CamcorderProfile a(int i11, int i12) {
            return CamcorderProfile.get(i11, i12);
        }

        @Override // v.f
        public boolean b(int i11, int i12) {
            return CamcorderProfile.hasProfile(i11, i12);
        }
    }

    class b extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a f117191a;

        b(androidx.concurrent.futures.c.a aVar) {
            this.f117191a = aVar;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@NonNull CameraDevice cameraDevice) {
            q0.this.X("openCameraConfigAndClose camera closed");
            this.f117191a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@NonNull CameraDevice cameraDevice) {
            q0.this.X("openCameraConfigAndClose camera disconnected");
            this.f117191a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@NonNull CameraDevice cameraDevice, int i11) {
            q0.this.X("openCameraConfigAndClose camera error " + i11);
            this.f117191a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@NonNull final CameraDevice cameraDevice) {
            q0.this.X("openCameraConfigAndClose camera opened");
            com.google.common.util.concurrent.s sVarU = q0.this.U(cameraDevice);
            Objects.requireNonNull(cameraDevice);
            sVarU.b(new Runnable() { // from class: v.r0
                @Override // java.lang.Runnable
                public final void run() {
                    cameraDevice.close();
                }
            }, q0.this.f117166c);
        }
    }

    class d implements j0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d3 f117195a;

        d(d3 d3Var) {
            this.f117195a = d3Var;
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r11) {
            if (q0.this.f117184u.b() == 2 && q0.this.f117168e == i.OPENED) {
                q0.this.x0(i.CONFIGURED);
            }
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            if (th2 instanceof DeferrableSurface.SurfaceClosedException) {
                androidx.camera.core.impl.x2 x2VarZ = q0.this.Z(((DeferrableSurface.SurfaceClosedException) th2).a());
                if (x2VarZ != null) {
                    q0.this.r0(x2VarZ);
                    return;
                }
                return;
            }
            if (th2 instanceof CancellationException) {
                q0.this.X("Unable to configure camera cancelled");
                return;
            }
            i iVar = q0.this.f117168e;
            i iVar2 = i.OPENED;
            if (iVar == iVar2) {
                q0.this.y0(iVar2, c0.q.a.b(4, th2));
            }
            c0.y0.d("Camera2CameraImpl", "Unable to configure camera " + q0.this, th2);
            q0 q0Var = q0.this;
            if (q0Var.f117176m == this.f117195a) {
                q0Var.v0(false);
            }
        }
    }

    final class e extends CameraManager.AvailabilityCallback implements androidx.camera.core.impl.s0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f117197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f117198b = true;

        e(String str) {
            this.f117197a = str;
        }

        @Override // androidx.camera.core.impl.s0.c
        public void a() {
            if (q0.this.f117168e == i.PENDING_OPEN) {
                q0.this.G0(false);
            }
        }

        boolean b() {
            return this.f117198b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(@NonNull String str) {
            if (this.f117197a.equals(str)) {
                this.f117198b = true;
                if (q0.this.f117168e == i.PENDING_OPEN) {
                    q0.this.G0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(@NonNull String str) {
            if (this.f117197a.equals(str)) {
                this.f117198b = false;
            }
        }
    }

    final class f implements androidx.camera.core.impl.s0.b {
        f() {
        }

        @Override // androidx.camera.core.impl.s0.b
        public void a() {
            if (q0.this.f117168e == i.OPENED) {
                q0.this.p0();
            }
        }
    }

    final class g implements CameraControlInternal.c {
        g() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.c
        public void a(@NonNull List<androidx.camera.core.impl.v0> list) {
            q0.this.A0((List) u5.h.g(list));
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.c
        public void b() {
            q0.this.H0();
        }
    }

    enum i {
        RELEASED,
        RELEASING,
        INITIALIZED,
        PENDING_OPEN,
        CLOSING,
        REOPENING_QUIRK,
        REOPENING,
        OPENING,
        OPENED,
        CONFIGURED
    }

    final class j extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f117207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ScheduledExecutorService f117208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f117209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ScheduledFuture<?> f117210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        private final a f117211e;

        class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f117213a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f117214b = -1;

            a(long j11) {
                this.f117213a = j11;
            }

            boolean a() {
                if (b() < d()) {
                    return true;
                }
                e();
                return false;
            }

            long b() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.f117214b == -1) {
                    this.f117214b = jUptimeMillis;
                }
                return jUptimeMillis - this.f117214b;
            }

            int c() {
                if (!j.this.f()) {
                    return 700;
                }
                long jB = b();
                if (jB <= 120000) {
                    return 1000;
                }
                return jB <= DataPersistorKt.EXPIRATION_TIME ? 2000 : 4000;
            }

            int d() {
                if (j.this.f()) {
                    long j11 = this.f117213a;
                    if (j11 > 0) {
                        return Math.min((int) j11, 1800000);
                    }
                    return 1800000;
                }
                long j12 = this.f117213a;
                if (j12 > 0) {
                    return Math.min((int) j12, 10000);
                }
                return 10000;
            }

            void e() {
                this.f117214b = -1L;
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Executor f117216a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f117217b = false;

            b(Executor executor) {
                this.f117216a = executor;
            }

            public static /* synthetic */ void a(b bVar) {
                if (bVar.f117217b) {
                    return;
                }
                u5.h.i(q0.this.f117168e == i.REOPENING || q0.this.f117168e == i.REOPENING_QUIRK);
                if (j.this.f()) {
                    q0.this.F0(true);
                } else {
                    q0.this.G0(true);
                }
            }

            void b() {
                this.f117217b = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f117216a.execute(new Runnable() { // from class: v.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        q0.j.b.a(this.f117290a);
                    }
                });
            }
        }

        j(@NonNull Executor executor, ScheduledExecutorService scheduledExecutorService, long j11) {
            this.f117207a = executor;
            this.f117208b = scheduledExecutorService;
            this.f117211e = new a(j11);
        }

        private void b(@NonNull CameraDevice cameraDevice, int i11) {
            u5.h.j(q0.this.f117168e == i.OPENING || q0.this.f117168e == i.OPENED || q0.this.f117168e == i.CONFIGURED || q0.this.f117168e == i.REOPENING || q0.this.f117168e == i.REOPENING_QUIRK, "Attempt to handle open error from non open state: " + q0.this.f117168e);
            if (i11 == 1 || i11 == 2 || i11 == 4) {
                c0.y0.a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), q0.d0(i11)));
                c(i11);
                return;
            }
            c0.y0.c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + q0.d0(i11) + " closing camera.");
            q0.this.y0(i.CLOSING, c0.q.a.a(i11 == 3 ? 5 : 6));
            q0.this.S(false);
        }

        private void c(int i11) {
            int i12 = 1;
            u5.h.j(q0.this.f117175l != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i11 == 1) {
                i12 = 2;
            } else if (i11 != 2) {
                i12 = 3;
            }
            q0.this.y0(i.REOPENING, c0.q.a.a(i12));
            q0.this.S(false);
        }

        boolean a() {
            if (this.f117210d == null) {
                return false;
            }
            q0.this.X("Cancelling scheduled re-open: " + this.f117209c);
            this.f117209c.b();
            this.f117209c = null;
            this.f117210d.cancel(false);
            this.f117210d = null;
            return true;
        }

        void d() {
            this.f117211e.e();
        }

        void e() {
            u5.h.i(this.f117209c == null);
            u5.h.i(this.f117210d == null);
            if (!this.f117211e.a()) {
                c0.y0.c("Camera2CameraImpl", "Camera reopening attempted for " + this.f117211e.d() + "ms without success.");
                q0.this.z0(i.PENDING_OPEN, null, false);
                return;
            }
            this.f117209c = new b(this.f117207a);
            q0.this.X("Attempting camera re-open in " + this.f117211e.c() + "ms: " + this.f117209c + " activeResuming = " + q0.this.I);
            this.f117210d = this.f117208b.schedule(this.f117209c, (long) this.f117211e.c(), TimeUnit.MILLISECONDS);
        }

        boolean f() {
            q0 q0Var = q0.this;
            if (!q0Var.I) {
                return false;
            }
            int i11 = q0Var.f117175l;
            return i11 == 1 || i11 == 2;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@NonNull CameraDevice cameraDevice) {
            q0.this.X("CameraDevice.onClosed()");
            u5.h.j(q0.this.f117174k == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int iOrdinal = q0.this.f117168e.ordinal();
            if (iOrdinal == 1 || iOrdinal == 4) {
                u5.h.i(q0.this.i0());
                q0.this.V();
                return;
            }
            if (iOrdinal != 5 && iOrdinal != 6) {
                throw new IllegalStateException("Camera closed while in state: " + q0.this.f117168e);
            }
            q0 q0Var = q0.this;
            if (q0Var.f117175l == 0) {
                q0Var.G0(false);
                return;
            }
            q0Var.X("Camera closed due to error: " + q0.d0(q0.this.f117175l));
            e();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@NonNull CameraDevice cameraDevice) {
            q0.this.X("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@NonNull CameraDevice cameraDevice, int i11) {
            q0 q0Var = q0.this;
            q0Var.f117174k = cameraDevice;
            q0Var.f117175l = i11;
            q0Var.N.b();
            int iOrdinal = q0.this.f117168e.ordinal();
            if (iOrdinal != 1) {
                switch (iOrdinal) {
                    case 4:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        c0.y0.a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), q0.d0(i11), q0.this.f117168e.name()));
                        b(cameraDevice, i11);
                        return;
                    default:
                        throw new IllegalStateException("onError() should not be possible from state: " + q0.this.f117168e);
                }
            }
            c0.y0.c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), q0.d0(i11), q0.this.f117168e.name()));
            q0.this.S(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@NonNull CameraDevice cameraDevice) {
            q0.this.X("CameraDevice.onOpened()");
            q0 q0Var = q0.this;
            q0Var.f117174k = cameraDevice;
            q0Var.f117175l = 0;
            d();
            int iOrdinal = q0.this.f117168e.ordinal();
            if (iOrdinal == 1 || iOrdinal == 4) {
                u5.h.i(q0.this.i0());
                q0.this.f117174k.close();
                q0.this.f117174k = null;
            } else {
                if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + q0.this.f117168e);
                }
                q0.this.x0(i.OPENED);
                androidx.camera.core.impl.s0 s0Var = q0.this.f117185v;
                String id2 = cameraDevice.getId();
                q0 q0Var2 = q0.this;
                if (s0Var.j(id2, q0Var2.f117184u.a(q0Var2.f117174k.getId()))) {
                    q0.this.p0();
                }
            }
        }
    }

    static abstract class k {
        k() {
        }

        @NonNull
        static k a(@NonNull String str, @NonNull Class<?> cls, @NonNull androidx.camera.core.impl.x2 x2Var, @NonNull androidx.camera.core.impl.o3<?> o3Var, Size size, androidx.camera.core.impl.c3 c3Var, List<androidx.camera.core.impl.p3.b> list) {
            return new v.d(str, cls, x2Var, o3Var, size, c3Var, list);
        }

        @NonNull
        static k b(@NonNull c0.a2 a2Var, boolean z11) {
            return a(q0.g0(a2Var), a2Var.getClass(), z11 ? a2Var.x() : a2Var.v(), a2Var.k(), a2Var.g(), a2Var.f(), q0.c0(a2Var));
        }

        abstract List<androidx.camera.core.impl.p3.b> c();

        @NonNull
        abstract androidx.camera.core.impl.x2 d();

        abstract androidx.camera.core.impl.c3 e();

        abstract Size f();

        @NonNull
        abstract androidx.camera.core.impl.o3<?> g();

        @NonNull
        abstract String h();

        @NonNull
        abstract Class<?> i();
    }

    q0(@NonNull Context context, @NonNull w.m0 m0Var, @NonNull String str, @NonNull x0 x0Var, @NonNull d0.a aVar, @NonNull androidx.camera.core.impl.s0 s0Var, @NonNull Executor executor, @NonNull Handler handler, @NonNull i3 i3Var, long j11) throws CameraUnavailableException {
        androidx.camera.core.impl.a2<androidx.camera.core.impl.j0.a> a2Var = new androidx.camera.core.impl.a2<>();
        this.f117169f = a2Var;
        this.f117175l = 0;
        this.f117177n = new AtomicInteger(0);
        this.f117180q = new LinkedHashMap();
        this.f117181r = 0;
        this.f117188y = false;
        this.f117189z = false;
        this.A = true;
        this.E = new HashSet();
        this.F = androidx.camera.core.impl.e0.a();
        this.G = new Object();
        this.I = false;
        this.N = new h(this, null);
        this.f117165b = m0Var;
        this.f117184u = aVar;
        this.f117185v = s0Var;
        ScheduledExecutorService scheduledExecutorServiceF = i0.c.f(handler);
        this.f117167d = scheduledExecutorServiceF;
        Executor executorG = i0.c.g(executor);
        this.f117166c = executorG;
        this.f117172i = new j(executorG, scheduledExecutorServiceF, j11);
        this.f117164a = new androidx.camera.core.impl.n3(str);
        a2Var.i(androidx.camera.core.impl.j0.a.CLOSED);
        t2 t2Var = new t2(s0Var);
        this.f117170g = t2Var;
        g3 g3Var = new g3(executorG);
        this.C = g3Var;
        this.J = i3Var;
        try {
            w.z zVarC = m0Var.c(str);
            this.K = zVarC;
            v vVar = new v(zVarC, scheduledExecutorServiceF, executorG, new g(), x0Var.r());
            this.f117171h = vVar;
            this.f117173j = x0Var;
            x0Var.F(vVar);
            x0Var.I(t2Var.a());
            this.L = x.f.a(zVarC);
            this.f117176m = k0();
            this.D = new v4.b(executorG, scheduledExecutorServiceF, handler, g3Var, x0Var.r(), androidx.camera.camera2.internal.compat.quirk.b.c());
            this.f117186w = z.c.a(x0Var.r());
            this.f117187x = x0Var.r().a(LegacyCameraSurfaceCleanupQuirk.class);
            e eVar = new e(str);
            this.f117182s = eVar;
            f fVar = new f();
            this.f117183t = fVar;
            s0Var.g(this, executorG, fVar, eVar);
            m0Var.g(executorG, eVar);
            this.M = new u4(context, str, m0Var, new a());
        } catch (CameraAccessExceptionCompat e11) {
            throw u2.a(e11);
        }
    }

    public static /* synthetic */ void B(q0 q0Var) {
        if (q0Var.h0()) {
            q0Var.w0(e0(q0Var.B), q0Var.B.h(), q0Var.B.i(), null, Collections.singletonList(androidx.camera.core.impl.p3.b.METERING_REPEATING));
        }
    }

    @NonNull
    private Collection<k> B0(@NonNull Collection<c0.a2> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<c0.a2> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(k.b(it.next(), this.A));
        }
        return arrayList;
    }

    public static /* synthetic */ void C(q0 q0Var, androidx.concurrent.futures.c.a aVar) {
        k4 k4Var = q0Var.B;
        if (k4Var == null) {
            aVar.c(Boolean.FALSE);
        } else {
            aVar.c(Boolean.valueOf(q0Var.f117164a.o(e0(k4Var))));
        }
    }

    public static /* synthetic */ void D(q0 q0Var, String str, androidx.camera.core.impl.x2 x2Var, androidx.camera.core.impl.o3 o3Var, androidx.camera.core.impl.c3 c3Var, List list) {
        q0Var.getClass();
        q0Var.X("Use case " + str + " ACTIVE");
        q0Var.f117164a.q(str, x2Var, o3Var, c3Var, list);
        q0Var.f117164a.u(str, x2Var, o3Var, c3Var, list);
        q0Var.H0();
    }

    private void D0(@NonNull Collection<k> collection) {
        Size sizeF;
        boolean zIsEmpty = this.f117164a.h().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (k kVar : collection) {
            if (!this.f117164a.o(kVar.h())) {
                this.f117164a.r(kVar.h(), kVar.d(), kVar.g(), kVar.e(), kVar.c());
                arrayList.add(kVar.h());
                if (kVar.i() == c0.h1.class && (sizeF = kVar.f()) != null) {
                    rational = new Rational(sizeF.getWidth(), sizeF.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        X("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (zIsEmpty) {
            this.f117171h.f0(true);
            this.f117171h.W();
        }
        Q();
        I0();
        H0();
        v0(false);
        if (this.f117168e == i.OPENED) {
            p0();
        } else {
            q0();
        }
        if (rational != null) {
            this.f117171h.g0(rational);
        }
    }

    public static /* synthetic */ void E(q0 q0Var, String str, androidx.camera.core.impl.x2 x2Var, androidx.camera.core.impl.o3 o3Var, androidx.camera.core.impl.c3 c3Var, List list) {
        q0Var.getClass();
        q0Var.X("Use case " + str + " RESET");
        q0Var.f117164a.u(str, x2Var, o3Var, c3Var, list);
        q0Var.Q();
        q0Var.v0(false);
        q0Var.H0();
        if (q0Var.f117168e == i.OPENED) {
            q0Var.p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(@NonNull Collection<k> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (k kVar : collection) {
            if (this.f117164a.o(kVar.h())) {
                this.f117164a.p(kVar.h());
                arrayList.add(kVar.h());
                if (kVar.i() == c0.h1.class) {
                    z11 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        X("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z11) {
            this.f117171h.g0(null);
        }
        Q();
        if (this.f117164a.i().isEmpty()) {
            this.f117171h.i0(false);
        } else {
            I0();
        }
        if (this.f117164a.h().isEmpty()) {
            this.f117171h.C();
            v0(false);
            this.f117171h.f0(false);
            this.f117176m = k0();
            T();
            return;
        }
        H0();
        v0(false);
        if (this.f117168e == i.OPENED) {
            p0();
        }
    }

    public static /* synthetic */ Object F(final q0 q0Var, final androidx.concurrent.futures.c.a aVar) {
        q0Var.f117166c.execute(new Runnable() { // from class: v.c0
            @Override // java.lang.Runnable
            public final void run() {
                j0.n.t(this.f116855a.s0(), aVar);
            }
        });
        return "Release[request=" + q0Var.f117177n.getAndIncrement() + "]";
    }

    public static /* synthetic */ void H(q0 q0Var, List list) {
        q0Var.getClass();
        try {
            q0Var.D0(list);
        } finally {
            q0Var.f117171h.C();
        }
    }

    public static /* synthetic */ Object I(q0 q0Var, androidx.concurrent.futures.c.a aVar) {
        u5.h.j(q0Var.f117179p == null, "Camera can only be released once, so release completer should be null on creation.");
        q0Var.f117179p = aVar;
        return "Release[camera=" + q0Var + "]";
    }

    private void I0() {
        Iterator<androidx.camera.core.impl.o3<?>> it = this.f117164a.i().iterator();
        boolean zT = false;
        while (it.hasNext()) {
            zT |= it.next().T(false);
        }
        this.f117171h.i0(zT);
    }

    private void P() {
        k4 k4Var = this.B;
        if (k4Var != null) {
            String strE0 = e0(k4Var);
            androidx.camera.core.impl.n3 n3Var = this.f117164a;
            androidx.camera.core.impl.x2 x2VarH = this.B.h();
            androidx.camera.core.impl.o3<?> o3VarI = this.B.i();
            androidx.camera.core.impl.p3.b bVar = androidx.camera.core.impl.p3.b.METERING_REPEATING;
            n3Var.r(strE0, x2VarH, o3VarI, null, Collections.singletonList(bVar));
            this.f117164a.q(strE0, this.B.h(), this.B.i(), null, Collections.singletonList(bVar));
        }
    }

    private void Q() {
        androidx.camera.core.impl.x2 x2VarC = this.f117164a.g().c();
        androidx.camera.core.impl.v0 v0VarK = x2VarC.k();
        int size = v0VarK.i().size();
        int size2 = x2VarC.o().size();
        if (x2VarC.o().isEmpty()) {
            return;
        }
        if (v0VarK.i().isEmpty()) {
            if (this.B == null) {
                this.B = new k4(this.f117173j.B(), this.J, new k4.c() { // from class: v.b0
                    @Override // v.k4.c
                    public final void a() {
                        q0.B(this.f116825a);
                    }
                });
            }
            if (j0()) {
                P();
                return;
            } else {
                c0.y0.c("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
                return;
            }
        }
        if (size2 == 1 && size == 1) {
            u0();
            return;
        }
        if (size >= 2) {
            u0();
            return;
        }
        if (this.B != null && !j0()) {
            u0();
            return;
        }
        c0.y0.a("Camera2CameraImpl", "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
    }

    private boolean R(androidx.camera.core.impl.v0.a aVar) {
        if (!aVar.m().isEmpty()) {
            c0.y0.l("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        Iterator<androidx.camera.core.impl.x2> it = this.f117164a.f().iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.v0 v0VarK = it.next().k();
            List<DeferrableSurface> listI = v0VarK.i();
            if (!listI.isEmpty()) {
                if (v0VarK.h() != 0) {
                    aVar.u(v0VarK.h());
                }
                if (v0VarK.l() != 0) {
                    aVar.x(v0VarK.l());
                }
                Iterator<DeferrableSurface> it2 = listI.iterator();
                while (it2.hasNext()) {
                    aVar.f(it2.next());
                }
            }
        }
        if (!aVar.m().isEmpty()) {
            return true;
        }
        c0.y0.l("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    private void T() {
        X("Closing camera.");
        boolean z11 = true;
        switch (this.f117168e.ordinal()) {
            case 3:
                u5.h.i(this.f117174k == null);
                x0(i.INITIALIZED);
                break;
            case 4:
            default:
                X("close() ignored due to being in state: " + this.f117168e);
                break;
            case 5:
            case 6:
            case 7:
                if (!this.f117172i.a() && !this.N.c()) {
                    z11 = false;
                }
                this.N.a();
                x0(i.CLOSING);
                if (z11) {
                    u5.h.i(i0());
                    V();
                }
                break;
            case 8:
            case 9:
                x0(i.CLOSING);
                S(false);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public com.google.common.util.concurrent.s<Void> U(@NonNull CameraDevice cameraDevice) {
        final c3 c3Var = new c3(this.L);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final androidx.camera.core.impl.t1 t1Var = new androidx.camera.core.impl.t1(surface);
        t1Var.k().b(new Runnable() { // from class: v.f0
            @Override // java.lang.Runnable
            public final void run() {
                q0.u(surface, surfaceTexture);
            }
        }, i0.c.b());
        androidx.camera.core.impl.x2.b bVar = new androidx.camera.core.impl.x2.b();
        bVar.h(t1Var);
        bVar.B(1);
        X("Start configAndClose.");
        return j0.d.a(j0.n.z(c3Var.c(bVar.p(), cameraDevice, this.D.a()))).f(new j0.a() { // from class: v.g0
            @Override // j0.a
            public final com.google.common.util.concurrent.s apply(Object obj) {
                return q0.z(c3Var, t1Var, (Void) obj);
            }
        }, this.f117166c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        u5.h.i(this.f117168e == i.RELEASING || this.f117168e == i.CLOSING);
        u5.h.i(this.f117180q.isEmpty());
        if (!this.f117188y) {
            a0();
            return;
        }
        if (this.f117189z) {
            X("Ignored since configAndClose is processing");
            return;
        }
        if (!this.f117182s.b()) {
            this.f117188y = false;
            a0();
            X("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            X("Open camera to configAndClose");
            com.google.common.util.concurrent.s<Void> sVarN0 = n0();
            this.f117189z = true;
            sVarN0.b(new Runnable() { // from class: v.h0
                @Override // java.lang.Runnable
                public final void run() {
                    q0.t(this.f117014a);
                }
            }, this.f117166c);
        }
    }

    private CameraDevice.StateCallback W() {
        ArrayList arrayList = new ArrayList(this.f117164a.g().c().c());
        arrayList.add(this.C.c());
        arrayList.add(this.f117172i);
        return q2.a(arrayList);
    }

    private void Y(@NonNull String str, Throwable th2) {
        c0.y0.b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th2);
    }

    private int b0() {
        synchronized (this.G) {
            try {
                return this.f117184u.b() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static List<androidx.camera.core.impl.p3.b> c0(@NonNull c0.a2 a2Var) {
        if (a2Var.h() == null) {
            return null;
        }
        return t0.f.j0(a2Var);
    }

    static String d0(int i11) {
        if (i11 == 0) {
            return "ERROR_NONE";
        }
        if (i11 == 1) {
            return "ERROR_CAMERA_IN_USE";
        }
        if (i11 == 2) {
            return "ERROR_MAX_CAMERAS_IN_USE";
        }
        if (i11 == 3) {
            return "ERROR_CAMERA_DISABLED";
        }
        if (i11 != 4) {
            return i11 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE";
        }
        return "ERROR_CAMERA_DEVICE";
    }

    @NonNull
    static String e0(@NonNull k4 k4Var) {
        return k4Var.f() + k4Var.hashCode();
    }

    private com.google.common.util.concurrent.s<Void> f0() {
        if (this.f117178o == null) {
            if (this.f117168e != i.RELEASED) {
                this.f117178o = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.e0
                    @Override // androidx.concurrent.futures.c.InterfaceC0146c
                    public final Object a(androidx.concurrent.futures.c.a aVar) {
                        return q0.I(this.f116945a, aVar);
                    }
                });
            } else {
                this.f117178o = j0.n.p(null);
            }
        }
        return this.f117178o;
    }

    @NonNull
    static String g0(@NonNull c0.a2 a2Var) {
        return a2Var.p() + a2Var.hashCode();
    }

    private boolean j0() {
        ArrayList arrayList = new ArrayList();
        int iB0 = b0();
        for (androidx.camera.core.impl.n3.b bVar : this.f117164a.j()) {
            if (bVar.c() == null || bVar.c().get(0) != androidx.camera.core.impl.p3.b.METERING_REPEATING) {
                if (bVar.e() == null || bVar.c() == null) {
                    c0.y0.l("Camera2CameraImpl", "Invalid stream spec or capture types in " + bVar);
                    return false;
                }
                androidx.camera.core.impl.x2 x2VarD = bVar.d();
                androidx.camera.core.impl.o3<?> o3VarF = bVar.f();
                for (DeferrableSurface deferrableSurface : x2VarD.o()) {
                    arrayList.add(androidx.camera.core.impl.a.a(this.M.M(iB0, o3VarF.getInputFormat(), deferrableSurface.h()), o3VarF.getInputFormat(), deferrableSurface.h(), bVar.e().b(), bVar.c(), bVar.e().d(), o3VarF.O(null)));
                }
            }
        }
        u5.h.g(this.B);
        HashMap map = new HashMap();
        map.put(this.B.i(), Collections.singletonList(this.B.e()));
        try {
            this.M.A(iB0, arrayList, map, false, false);
            X("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException e11) {
            Y("Surface combination with metering repeating  not supported!", e11);
            return false;
        }
    }

    @NonNull
    private d3 k0() {
        synchronized (this.G) {
            try {
                if (this.H == null) {
                    return new c3(this.L, this.f117173j.r());
                }
                return new q4(this.H, this.f117173j, this.L, this.f117166c, this.f117167d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void l0(List<c0.a2> list) {
        for (c0.a2 a2Var : list) {
            String strG0 = g0(a2Var);
            if (!this.E.contains(strG0)) {
                this.E.add(strG0);
                a2Var.N();
                a2Var.L();
            }
        }
    }

    private void m0(List<c0.a2> list) {
        for (c0.a2 a2Var : list) {
            String strG0 = g0(a2Var);
            if (this.E.contains(strG0)) {
                a2Var.O();
                this.E.remove(strG0);
            }
        }
    }

    @NonNull
    @SuppressLint({"MissingPermission"})
    private com.google.common.util.concurrent.s<Void> n0() {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.z
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return q0.r(this.f117418a, aVar);
            }
        });
    }

    @SuppressLint({"MissingPermission"})
    private void o0(boolean z11) {
        if (!z11) {
            this.f117172i.d();
        }
        this.f117172i.a();
        this.N.a();
        X("Opening camera.");
        x0(i.OPENING);
        try {
            this.f117165b.f(this.f117173j.d(), this.f117166c, W());
        } catch (CameraAccessExceptionCompat e11) {
            X("Unable to open camera due to " + e11.getMessage());
            if (e11.d() != 10001) {
                this.N.d();
            } else {
                y0(i.INITIALIZED, c0.q.a.b(7, e11));
            }
        } catch (SecurityException e12) {
            X("Unable to open camera due to " + e12.getMessage());
            x0(i.REOPENING);
            this.f117172i.e();
        }
    }

    private void q0() {
        int iOrdinal = this.f117168e.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3) {
            F0(false);
            return;
        }
        if (iOrdinal != 4) {
            X("open() ignored due to being in state: " + this.f117168e);
            return;
        }
        x0(i.REOPENING);
        if (i0() || this.f117189z || this.f117175l != 0) {
            return;
        }
        u5.h.j(this.f117174k != null, "Camera Device should be open if session close is not complete");
        x0(i.OPENED);
        p0();
    }

    public static /* synthetic */ Object r(q0 q0Var, androidx.concurrent.futures.c.a aVar) {
        q0Var.getClass();
        try {
            ArrayList arrayList = new ArrayList(q0Var.f117164a.g().c().c());
            arrayList.add(q0Var.C.c());
            arrayList.add(q0Var.new b(aVar));
            q0Var.f117165b.f(q0Var.f117173j.d(), q0Var.f117166c, q2.a(arrayList));
            return "configAndCloseTask";
        } catch (CameraAccessExceptionCompat | SecurityException e11) {
            q0Var.Y("Unable to open camera for configAndClose: " + e11.getMessage(), e11);
            aVar.f(e11);
            return "configAndCloseTask";
        }
    }

    public static /* synthetic */ Object s(final q0 q0Var, final androidx.concurrent.futures.c.a aVar) {
        q0Var.getClass();
        try {
            q0Var.f117166c.execute(new Runnable() { // from class: v.y
                @Override // java.lang.Runnable
                public final void run() {
                    q0.C(this.f117397a, aVar);
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            aVar.f(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    private com.google.common.util.concurrent.s<Void> s0() {
        com.google.common.util.concurrent.s<Void> sVarF0 = f0();
        boolean z11 = true;
        switch (this.f117168e.ordinal()) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
                if (!this.f117172i.a() && !this.N.c()) {
                    z11 = false;
                }
                this.N.a();
                x0(i.RELEASING);
                if (z11) {
                    u5.h.i(i0());
                    V();
                }
                break;
            case 2:
            case 3:
                u5.h.i(this.f117174k == null);
                x0(i.RELEASING);
                u5.h.i(i0());
                V();
                break;
            case 8:
            case 9:
                x0(i.RELEASING);
                S(false);
                break;
            default:
                X("release() ignored due to being in state: " + this.f117168e);
                break;
        }
        return sVarF0;
    }

    public static /* synthetic */ void t(q0 q0Var) {
        q0Var.f117189z = false;
        q0Var.f117188y = false;
        q0Var.X("OpenCameraConfigAndClose is done, state: " + q0Var.f117168e);
        int iOrdinal = q0Var.f117168e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 4) {
            u5.h.i(q0Var.i0());
            q0Var.a0();
            return;
        }
        if (iOrdinal != 6) {
            q0Var.X("OpenCameraConfigAndClose finished while in state: " + q0Var.f117168e);
            return;
        }
        if (q0Var.f117175l == 0) {
            q0Var.G0(false);
            return;
        }
        q0Var.X("OpenCameraConfigAndClose in error: " + d0(q0Var.f117175l));
        q0Var.f117172i.e();
    }

    public static /* synthetic */ void u(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    private void u0() {
        if (this.B != null) {
            this.f117164a.s(this.B.f() + this.B.hashCode());
            this.f117164a.t(this.B.f() + this.B.hashCode());
            this.B.c();
            this.B = null;
        }
    }

    public static /* synthetic */ void v(q0 q0Var, String str) {
        q0Var.getClass();
        q0Var.X("Use case " + str + " INACTIVE");
        q0Var.f117164a.t(str);
        q0Var.H0();
    }

    public static /* synthetic */ void w(q0 q0Var, boolean z11) {
        q0Var.I = z11;
        if (z11 && q0Var.f117168e == i.PENDING_OPEN) {
            q0Var.F0(false);
        }
    }

    private void w0(@NonNull final String str, @NonNull final androidx.camera.core.impl.x2 x2Var, @NonNull final androidx.camera.core.impl.o3<?> o3Var, final androidx.camera.core.impl.c3 c3Var, final List<androidx.camera.core.impl.p3.b> list) {
        this.f117166c.execute(new Runnable() { // from class: v.o0
            @Override // java.lang.Runnable
            public final void run() {
                q0.E(this.f117136a, str, x2Var, o3Var, c3Var, list);
            }
        });
    }

    public static /* synthetic */ void x(q0 q0Var, String str, androidx.camera.core.impl.x2 x2Var, androidx.camera.core.impl.o3 o3Var, androidx.camera.core.impl.c3 c3Var, List list) {
        q0Var.getClass();
        q0Var.X("Use case " + str + " UPDATED");
        q0Var.f117164a.u(str, x2Var, o3Var, c3Var, list);
        q0Var.H0();
    }

    public static /* synthetic */ com.google.common.util.concurrent.s z(c3 c3Var, DeferrableSurface deferrableSurface, Void r11) {
        c3Var.close();
        deferrableSurface.d();
        return c3Var.a(false);
    }

    void A0(@NonNull List<androidx.camera.core.impl.v0> list) {
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.impl.v0 v0Var : list) {
            androidx.camera.core.impl.v0.a aVarK = androidx.camera.core.impl.v0.a.k(v0Var);
            if (v0Var.k() == 5 && v0Var.d() != null) {
                aVarK.p(v0Var.d());
            }
            if (!v0Var.i().isEmpty() || !v0Var.n() || R(aVarK)) {
                arrayList.add(aVarK.h());
            }
        }
        X("Issue capture request");
        this.f117176m.e(arrayList);
    }

    void C0(@NonNull i iVar, c0.q.a aVar) {
        if (eb.a.h()) {
            eb.a.j("CX:C2State[" + this + "]", iVar.ordinal());
            if (aVar != null) {
                this.f117181r++;
            }
            if (this.f117181r > 0) {
                eb.a.j("CX:C2StateErrorCode[" + this + "]", aVar != null ? aVar.d() : 0);
            }
        }
    }

    void F0(boolean z11) {
        X("Attempting to force open the camera.");
        if (this.f117185v.i(this)) {
            o0(z11);
        } else {
            X("No cameras available. Waiting for available camera before opening camera.");
            x0(i.PENDING_OPEN);
        }
    }

    void G0(boolean z11) {
        X("Attempting to open the camera.");
        if (this.f117182s.b() && this.f117185v.i(this)) {
            o0(z11);
        } else {
            X("No cameras available. Waiting for available camera before opening camera.");
            x0(i.PENDING_OPEN);
        }
    }

    void H0() {
        androidx.camera.core.impl.x2.h hVarE = this.f117164a.e();
        if (!hVarE.f()) {
            this.f117171h.e0();
            this.f117176m.d(this.f117171h.M());
            return;
        }
        this.f117171h.h0(hVarE.c().p());
        hVarE.b(this.f117171h.M());
        this.f117176m.d(hVarE.c());
    }

    void S(boolean z11) {
        u5.h.j(this.f117168e == i.CLOSING || this.f117168e == i.RELEASING || (this.f117168e == i.REOPENING && this.f117175l != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f117168e + " (error: " + d0(this.f117175l) + ")");
        v0(z11);
        this.f117176m.g();
    }

    void X(@NonNull String str) {
        Y(str, null);
    }

    androidx.camera.core.impl.x2 Z(@NonNull DeferrableSurface deferrableSurface) {
        for (androidx.camera.core.impl.x2 x2Var : this.f117164a.h()) {
            if (x2Var.o().contains(deferrableSurface)) {
                return x2Var;
            }
        }
        return null;
    }

    @Override // androidx.camera.core.impl.j0
    @NonNull
    public androidx.camera.core.impl.g2<androidx.camera.core.impl.j0.a> a() {
        return this.f117169f;
    }

    void a0() {
        u5.h.i(this.f117168e == i.RELEASING || this.f117168e == i.CLOSING);
        u5.h.i(this.f117180q.isEmpty());
        this.f117174k = null;
        if (this.f117168e == i.CLOSING) {
            x0(i.INITIALIZED);
            return;
        }
        this.f117165b.h(this.f117182s);
        x0(i.RELEASED);
        androidx.concurrent.futures.c.a<Void> aVar = this.f117179p;
        if (aVar != null) {
            aVar.c(null);
            this.f117179p = null;
        }
    }

    @Override // c0.a2.b
    public void d(@NonNull c0.a2 a2Var) {
        u5.h.g(a2Var);
        final String strG0 = g0(a2Var);
        final androidx.camera.core.impl.x2 x2VarX = this.A ? a2Var.x() : a2Var.v();
        final androidx.camera.core.impl.o3<?> o3VarK = a2Var.k();
        final androidx.camera.core.impl.c3 c3VarF = a2Var.f();
        final List<androidx.camera.core.impl.p3.b> listC0 = c0(a2Var);
        this.f117166c.execute(new Runnable() { // from class: v.l0
            @Override // java.lang.Runnable
            public final void run() {
                q0.D(this.f117086a, strG0, x2VarX, o3VarK, c3VarF, listC0);
            }
        });
    }

    @Override // androidx.camera.core.impl.j0
    @NonNull
    public androidx.camera.core.impl.i0 e() {
        return this.f117173j;
    }

    @Override // c0.a2.b
    public void f(@NonNull c0.a2 a2Var) {
        u5.h.g(a2Var);
        w0(g0(a2Var), this.A ? a2Var.x() : a2Var.v(), a2Var.k(), a2Var.f(), c0(a2Var));
    }

    @Override // androidx.camera.core.impl.j0
    public void h(androidx.camera.core.impl.b0 b0Var) {
        if (b0Var == null) {
            b0Var = androidx.camera.core.impl.e0.a();
        }
        androidx.camera.core.impl.z2 z2VarI = b0Var.I(null);
        this.F = b0Var;
        synchronized (this.G) {
            this.H = z2VarI;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean h0() {
        try {
            return ((Boolean) androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.d0
                @Override // androidx.concurrent.futures.c.InterfaceC0146c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return q0.s(this.f116888a, aVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e11) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e11);
        }
    }

    @Override // androidx.camera.core.impl.j0
    public void i(boolean z11) {
        this.A = z11;
    }

    boolean i0() {
        return this.f117180q.isEmpty();
    }

    @Override // c0.a2.b
    public void j(@NonNull c0.a2 a2Var) {
        u5.h.g(a2Var);
        final String strG0 = g0(a2Var);
        this.f117166c.execute(new Runnable() { // from class: v.k0
            @Override // java.lang.Runnable
            public final void run() {
                q0.v(this.f117064a, strG0);
            }
        });
    }

    @Override // c0.a2.b
    public void k(@NonNull c0.a2 a2Var) {
        u5.h.g(a2Var);
        final String strG0 = g0(a2Var);
        final androidx.camera.core.impl.x2 x2VarX = this.A ? a2Var.x() : a2Var.v();
        final androidx.camera.core.impl.o3<?> o3VarK = a2Var.k();
        final androidx.camera.core.impl.c3 c3VarF = a2Var.f();
        final List<androidx.camera.core.impl.p3.b> listC0 = c0(a2Var);
        this.f117166c.execute(new Runnable() { // from class: v.j0
            @Override // java.lang.Runnable
            public final void run() {
                q0.x(this.f117047a, strG0, x2VarX, o3VarK, c3VarF, listC0);
            }
        });
    }

    @Override // androidx.camera.core.impl.j0
    @NonNull
    public CameraControlInternal l() {
        return this.f117171h;
    }

    @Override // androidx.camera.core.impl.j0
    @NonNull
    public androidx.camera.core.impl.b0 m() {
        return this.F;
    }

    @Override // androidx.camera.core.impl.j0
    public void n(final boolean z11) {
        this.f117166c.execute(new Runnable() { // from class: v.p0
            @Override // java.lang.Runnable
            public final void run() {
                q0.w(this.f117153a, z11);
            }
        });
    }

    @Override // androidx.camera.core.impl.j0
    public void o(@NonNull Collection<c0.a2> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f117171h.W();
        l0(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(B0(arrayList));
        try {
            this.f117166c.execute(new Runnable() { // from class: v.i0
                @Override // java.lang.Runnable
                public final void run() {
                    q0.H(this.f117026a, arrayList2);
                }
            });
        } catch (RejectedExecutionException e11) {
            Y("Unable to attach use cases.", e11);
            this.f117171h.C();
        }
    }

    @Override // androidx.camera.core.impl.j0
    public void p(@NonNull Collection<c0.a2> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(B0(arrayList));
        m0(new ArrayList(arrayList));
        this.f117166c.execute(new Runnable() { // from class: v.n0
            @Override // java.lang.Runnable
            public final void run() {
                this.f117124a.E0(arrayList2);
            }
        });
    }

    void p0() {
        u5.h.i(this.f117168e == i.OPENED);
        androidx.camera.core.impl.x2.h hVarG = this.f117164a.g();
        if (!hVarG.f()) {
            X("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.f117185v.j(this.f117174k.getId(), this.f117184u.a(this.f117174k.getId()))) {
            X("Unable to create capture session in camera operating mode = " + this.f117184u.b());
            return;
        }
        HashMap map = new HashMap();
        s4.m(this.f117164a.h(), this.f117164a.i(), map);
        this.f117176m.i(map);
        d3 d3Var = this.f117176m;
        j0.n.j(d3Var.c(hVarG.c(), (CameraDevice) u5.h.g(this.f117174k), this.D.a()), new d(d3Var), this.f117166c);
    }

    void r0(@NonNull final androidx.camera.core.impl.x2 x2Var) {
        ScheduledExecutorService scheduledExecutorServiceE = i0.c.e();
        final androidx.camera.core.impl.x2.d dVarD = x2Var.d();
        if (dVarD != null) {
            Y("Posting surface closed", new Throwable());
            scheduledExecutorServiceE.execute(new Runnable() { // from class: v.m0
                @Override // java.lang.Runnable
                public final void run() {
                    dVarD.a(x2Var, androidx.camera.core.impl.x2.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
                }
            });
        }
    }

    @Override // androidx.camera.core.impl.j0
    @NonNull
    public com.google.common.util.concurrent.s<Void> release() {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.a0
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return q0.F(this.f116814a, aVar);
            }
        });
    }

    com.google.common.util.concurrent.s<Void> t0(@NonNull d3 d3Var, boolean z11) {
        d3Var.close();
        com.google.common.util.concurrent.s<Void> sVarA = d3Var.a(z11);
        X("Releasing session in state " + this.f117168e.name());
        this.f117180q.put(d3Var, sVarA);
        j0.n.j(sVarA, new c(d3Var), i0.c.b());
        return sVarA;
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f117173j.d());
    }

    void v0(boolean z11) {
        u5.h.i(this.f117176m != null);
        X("Resetting Capture Session");
        d3 d3Var = this.f117176m;
        androidx.camera.core.impl.x2 x2VarB = d3Var.b();
        List<androidx.camera.core.impl.v0> listH = d3Var.h();
        d3 d3VarK0 = k0();
        this.f117176m = d3VarK0;
        d3VarK0.d(x2VarB);
        this.f117176m.e(listH);
        if (this.f117168e.ordinal() != 8) {
            X("Skipping Capture Session state check due to current camera state: " + this.f117168e + " and previous session status: " + d3Var.f());
        } else if (this.f117186w && d3Var.f()) {
            X("Close camera before creating new session");
            x0(i.REOPENING_QUIRK);
        }
        if (this.f117187x && d3Var.f()) {
            X("ConfigAndClose is required when close the camera.");
            this.f117188y = true;
        }
        t0(d3Var, z11);
    }

    void x0(@NonNull i iVar) {
        y0(iVar, null);
    }

    void y0(@NonNull i iVar, c0.q.a aVar) {
        z0(iVar, aVar, true);
    }

    void z0(@NonNull i iVar, c0.q.a aVar, boolean z11) {
        androidx.camera.core.impl.j0.a aVar2;
        X("Transitioning camera internal state: " + this.f117168e + " --> " + iVar);
        C0(iVar, aVar);
        this.f117168e = iVar;
        switch (iVar) {
            case RELEASED:
                aVar2 = androidx.camera.core.impl.j0.a.RELEASED;
                break;
            case RELEASING:
                aVar2 = androidx.camera.core.impl.j0.a.RELEASING;
                break;
            case INITIALIZED:
                aVar2 = androidx.camera.core.impl.j0.a.CLOSED;
                break;
            case PENDING_OPEN:
                aVar2 = androidx.camera.core.impl.j0.a.PENDING_OPEN;
                break;
            case CLOSING:
            case REOPENING_QUIRK:
                aVar2 = androidx.camera.core.impl.j0.a.CLOSING;
                break;
            case REOPENING:
            case OPENING:
                aVar2 = androidx.camera.core.impl.j0.a.OPENING;
                break;
            case OPENED:
                aVar2 = androidx.camera.core.impl.j0.a.OPEN;
                break;
            case CONFIGURED:
                aVar2 = androidx.camera.core.impl.j0.a.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + iVar);
        }
        this.f117185v.e(this, aVar2, z11);
        this.f117169f.i(aVar2);
        this.f117170g.c(aVar2, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f117202a;

        /* JADX INFO: Access modifiers changed from: private */
        class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ScheduledFuture<?> f117204a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final AtomicBoolean f117205b = new AtomicBoolean(false);

            a() {
                this.f117204a = q0.this.f117167d.schedule(new Runnable() { // from class: v.s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f117258a.d();
                    }
                }, 2000L, TimeUnit.MILLISECONDS);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void d() {
                if (this.f117205b.getAndSet(true)) {
                    return;
                }
                q0.this.f117166c.execute(new Runnable() { // from class: v.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f117275a.e();
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void e() {
                if (q0.this.f117168e == i.OPENING) {
                    q0.this.X("Camera onError timeout, reopen it.");
                    q0.this.x0(i.REOPENING);
                    q0.this.f117172i.e();
                } else {
                    q0.this.X("Camera skip reopen at state: " + q0.this.f117168e);
                }
            }

            public void c() {
                this.f117205b.set(true);
                this.f117204a.cancel(true);
            }

            public boolean f() {
                return this.f117205b.get();
            }
        }

        private h() {
            this.f117202a = null;
        }

        public void a() {
            a aVar = this.f117202a;
            if (aVar != null) {
                aVar.c();
            }
            this.f117202a = null;
        }

        public void b() {
            q0.this.X("Camera receive onErrorCallback");
            a();
        }

        public boolean c() {
            a aVar = this.f117202a;
            return (aVar == null || aVar.f()) ? false : true;
        }

        public void d() {
            if (q0.this.f117168e != i.OPENING) {
                q0.this.X("Don't need the onError timeout handler.");
                return;
            }
            q0.this.X("Camera waiting for onError.");
            a();
            this.f117202a = new a();
        }

        /* synthetic */ h(q0 q0Var, a aVar) {
            this();
        }
    }

    class c implements j0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d3 f117193a;

        c(d3 d3Var) {
            this.f117193a = d3Var;
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r11) {
            q0.this.f117180q.remove(this.f117193a);
            int iOrdinal = q0.this.f117168e.ordinal();
            if (iOrdinal != 1 && iOrdinal != 4) {
                if (iOrdinal != 5 && (iOrdinal != 6 || q0.this.f117175l == 0)) {
                    return;
                } else {
                    q0.this.X("Camera reopen required. Checking if the current camera can be closed safely.");
                }
            }
            if (q0.this.i0()) {
                q0 q0Var = q0.this;
                if (q0Var.f117174k != null) {
                    q0Var.X("closing camera");
                    w.a.a(q0.this.f117174k);
                    q0.this.f117174k = null;
                }
            }
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
        }
    }
}
