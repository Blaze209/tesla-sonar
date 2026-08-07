package v;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
final class q4 implements d3 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static List<DeferrableSurface> f117223p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f117224q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.camera.core.impl.z2 f117225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x0 f117226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Executor f117227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f117228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c3 f117229e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.camera.core.impl.x2 f117231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l2 f117232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.camera.core.impl.x2 f117233i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f117239o;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<DeferrableSurface> f117230f = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile List<androidx.camera.core.impl.v0> f117235k = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b0.k f117237m = new b0.k.a().c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b0.k f117238n = new b0.k.a().c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f117234j = c.UNINITIALIZED;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d f117236l = new d();

    private static class b implements androidx.camera.core.impl.z2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<androidx.camera.core.impl.p> f117241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f117242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.camera.core.impl.z f117243c;

        /* synthetic */ b(int i11, List list, a aVar) {
            this(i11, list);
        }

        @Override // androidx.camera.core.impl.z2.a
        public void a(int i11) {
            androidx.camera.core.impl.z aVar = this.f117243c;
            if (aVar == null) {
                aVar = new androidx.camera.core.impl.z.a();
            }
            Iterator<androidx.camera.core.impl.p> it = this.f117241a.iterator();
            while (it.hasNext()) {
                it.next().b(this.f117242b, aVar);
            }
        }

        @Override // androidx.camera.core.impl.z2.a
        public void b(long j11, int i11, @NonNull androidx.camera.core.impl.z zVar) {
            this.f117243c = zVar;
        }

        @Override // androidx.camera.core.impl.z2.a
        public void c(int i11) {
            Iterator<androidx.camera.core.impl.p> it = this.f117241a.iterator();
            while (it.hasNext()) {
                it.next().c(this.f117242b, new androidx.camera.core.impl.r(androidx.camera.core.impl.r.a.ERROR));
            }
        }

        @Override // androidx.camera.core.impl.z2.a
        public void d(int i11, long j11) {
            Iterator<androidx.camera.core.impl.p> it = this.f117241a.iterator();
            while (it.hasNext()) {
                it.next().e(this.f117242b);
            }
        }

        @Override // androidx.camera.core.impl.z2.a
        public void onCaptureProcessProgressed(int i11) {
            Iterator<androidx.camera.core.impl.p> it = this.f117241a.iterator();
            while (it.hasNext()) {
                it.next().d(this.f117242b, i11);
            }
        }

        private b(int i11, List<androidx.camera.core.impl.p> list) {
            this.f117243c = null;
            this.f117242b = i11;
            this.f117241a = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    enum c {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    q4(@NonNull androidx.camera.core.impl.z2 z2Var, @NonNull x0 x0Var, @NonNull x.f fVar, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.f117239o = 0;
        this.f117229e = new c3(fVar);
        this.f117225a = z2Var;
        this.f117226b = x0Var;
        this.f117227c = executor;
        this.f117228d = scheduledExecutorService;
        int i11 = f117224q;
        f117224q = i11 + 1;
        this.f117239o = i11;
        c0.y0.a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f117239o + ")");
    }

    public static /* synthetic */ Void j(q4 q4Var, Void r11) {
        q4Var.x(q4Var.f117229e);
        return null;
    }

    public static /* synthetic */ void l(q4 q4Var, DeferrableSurface deferrableSurface) {
        androidx.camera.core.impl.g1.c(q4Var.f117230f);
        if (deferrableSurface != null) {
            deferrableSurface.e();
        }
    }

    public static /* synthetic */ com.google.common.util.concurrent.s m(final q4 q4Var, androidx.camera.core.impl.x2 x2Var, CameraDevice cameraDevice, v4.a aVar, List list) {
        androidx.camera.core.impl.j2 j2VarA;
        q4Var.getClass();
        c0.y0.a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + q4Var.f117239o + ")");
        if (q4Var.f117234j == c.DE_INITIALIZED) {
            return j0.n.n(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        final DeferrableSurface deferrableSurfaceF = null;
        if (list.contains(null)) {
            return j0.n.n(new DeferrableSurface.SurfaceClosedException("Surface closed", x2Var.o().get(list.indexOf(null))));
        }
        androidx.camera.core.impl.j2 j2VarA2 = null;
        androidx.camera.core.impl.j2 j2VarA3 = null;
        androidx.camera.core.impl.j2 j2VarA4 = null;
        for (int i11 = 0; i11 < x2Var.o().size(); i11++) {
            DeferrableSurface deferrableSurface = x2Var.o().get(i11);
            if (t(deferrableSurface) || u(deferrableSurface)) {
                j2VarA2 = androidx.camera.core.impl.j2.a(deferrableSurface.j().get(), deferrableSurface.h(), deferrableSurface.i());
            } else if (s(deferrableSurface)) {
                j2VarA3 = androidx.camera.core.impl.j2.a(deferrableSurface.j().get(), deferrableSurface.h(), deferrableSurface.i());
            } else if (r(deferrableSurface)) {
                j2VarA4 = androidx.camera.core.impl.j2.a(deferrableSurface.j().get(), deferrableSurface.h(), deferrableSurface.i());
            }
        }
        if (x2Var.i() != null) {
            deferrableSurfaceF = x2Var.i().f();
            j2VarA = androidx.camera.core.impl.j2.a(deferrableSurfaceF.j().get(), deferrableSurfaceF.h(), deferrableSurfaceF.i());
        } else {
            j2VarA = null;
        }
        q4Var.f117234j = c.SESSION_INITIALIZED;
        try {
            ArrayList arrayList = new ArrayList(q4Var.f117230f);
            if (deferrableSurfaceF != null) {
                arrayList.add(deferrableSurfaceF);
            }
            androidx.camera.core.impl.g1.d(arrayList);
            c0.y0.l("ProcessingCaptureSession", "== initSession (id=" + q4Var.f117239o + ")");
            try {
                androidx.camera.core.impl.x2 x2VarK = q4Var.f117225a.k(q4Var.f117226b, androidx.camera.core.impl.k2.a(j2VarA2, j2VarA3, j2VarA4, j2VarA));
                q4Var.f117233i = x2VarK;
                x2VarK.o().get(0).k().b(new Runnable() { // from class: v.o4
                    @Override // java.lang.Runnable
                    public final void run() {
                        q4.l(this.f117148a, deferrableSurfaceF);
                    }
                }, i0.c.b());
                for (final DeferrableSurface deferrableSurface2 : q4Var.f117233i.o()) {
                    f117223p.add(deferrableSurface2);
                    deferrableSurface2.k().b(new Runnable() { // from class: v.p4
                        @Override // java.lang.Runnable
                        public final void run() {
                            q4.f117223p.remove(deferrableSurface2);
                        }
                    }, q4Var.f117227c);
                }
                androidx.camera.core.impl.x2.h hVar = new androidx.camera.core.impl.x2.h();
                hVar.b(x2Var);
                hVar.d();
                hVar.b(q4Var.f117233i);
                u5.h.b(hVar.f(), "Cannot transform the SessionConfig");
                com.google.common.util.concurrent.s<Void> sVarC = q4Var.f117229e.c(hVar.c(), (CameraDevice) u5.h.g(cameraDevice), aVar);
                j0.n.j(sVarC, q4Var.new a(), q4Var.f117227c);
                return sVarC;
            } catch (Throwable th2) {
                c0.y0.d("ProcessingCaptureSession", "initSession failed", th2);
                androidx.camera.core.impl.g1.c(q4Var.f117230f);
                if (deferrableSurfaceF != null) {
                    deferrableSurfaceF.e();
                }
                throw th2;
            }
        } catch (DeferrableSurface.SurfaceClosedException e11) {
            return j0.n.n(e11);
        }
    }

    public static /* synthetic */ void n(q4 q4Var) {
        q4Var.getClass();
        c0.y0.a("ProcessingCaptureSession", "== deInitSession (id=" + q4Var.f117239o + ")");
        q4Var.f117225a.e();
    }

    private static void o(@NonNull List<androidx.camera.core.impl.v0> list) {
        for (androidx.camera.core.impl.v0 v0Var : list) {
            Iterator<androidx.camera.core.impl.p> it = v0Var.c().iterator();
            while (it.hasNext()) {
                it.next().a(v0Var.f());
            }
        }
    }

    private static List<androidx.camera.core.impl.a3> p(List<DeferrableSurface> list) {
        ArrayList arrayList = new ArrayList();
        for (DeferrableSurface deferrableSurface : list) {
            u5.h.b(deferrableSurface instanceof androidx.camera.core.impl.a3, "Surface must be SessionProcessorSurface");
            arrayList.add((androidx.camera.core.impl.a3) deferrableSurface);
        }
        return arrayList;
    }

    private static boolean q(@NonNull androidx.camera.core.impl.v0 v0Var) {
        for (DeferrableSurface deferrableSurface : v0Var.i()) {
            if (t(deferrableSurface) || u(deferrableSurface)) {
                return true;
            }
        }
        return false;
    }

    private static boolean r(@NonNull DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.g(), androidx.camera.core.f.class);
    }

    private static boolean s(@NonNull DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.g(), c0.r0.class);
    }

    private static boolean t(@NonNull DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.g(), c0.h1.class);
    }

    private static boolean u(@NonNull DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.g(), t0.f.class);
    }

    private void y(@NonNull b0.k kVar, @NonNull b0.k kVar2) {
        u.a.C2464a c2464a = new u.a.C2464a();
        c2464a.c(kVar);
        c2464a.c(kVar2);
        this.f117225a.g(c2464a.a());
    }

    @Override // v.d3
    @NonNull
    public com.google.common.util.concurrent.s<Void> a(boolean z11) {
        c0.y0.a("ProcessingCaptureSession", "release (id=" + this.f117239o + ") mProcessorState=" + this.f117234j);
        com.google.common.util.concurrent.s<Void> sVarA = this.f117229e.a(z11);
        int iOrdinal = this.f117234j.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            sVarA.b(new Runnable() { // from class: v.l4
                @Override // java.lang.Runnable
                public final void run() {
                    q4.n(this.f117104a);
                }
            }, i0.c.b());
        }
        this.f117234j = c.DE_INITIALIZED;
        return sVarA;
    }

    @Override // v.d3
    public androidx.camera.core.impl.x2 b() {
        return this.f117231g;
    }

    @Override // v.d3
    @NonNull
    public com.google.common.util.concurrent.s<Void> c(@NonNull final androidx.camera.core.impl.x2 x2Var, @NonNull final CameraDevice cameraDevice, @NonNull final v4.a aVar) {
        u5.h.b(this.f117234j == c.UNINITIALIZED, "Invalid state state:" + this.f117234j);
        u5.h.b(x2Var.o().isEmpty() ^ true, "SessionConfig contains no surfaces");
        c0.y0.a("ProcessingCaptureSession", "open (id=" + this.f117239o + ")");
        List<DeferrableSurface> listO = x2Var.o();
        this.f117230f = listO;
        return j0.d.a(androidx.camera.core.impl.g1.e(listO, false, DeviceOrientationRequest.OUTPUT_PERIOD_FAST, this.f117227c, this.f117228d)).f(new j0.a() { // from class: v.m4
            @Override // j0.a
            public final com.google.common.util.concurrent.s apply(Object obj) {
                return q4.m(this.f117119a, x2Var, cameraDevice, aVar, (List) obj);
            }
        }, this.f117227c).e(new r.a() { // from class: v.n4
            @Override // r.a
            public final Object apply(Object obj) {
                return q4.j(this.f117134a, (Void) obj);
            }
        }, this.f117227c);
    }

    @Override // v.d3
    public void close() {
        c0.y0.a("ProcessingCaptureSession", "close (id=" + this.f117239o + ") state=" + this.f117234j);
        if (this.f117234j == c.ON_CAPTURE_SESSION_STARTED) {
            c0.y0.a("ProcessingCaptureSession", "== onCaptureSessionEnd (id = " + this.f117239o + ")");
            this.f117225a.d();
            l2 l2Var = this.f117232h;
            if (l2Var != null) {
                l2Var.g();
            }
            this.f117234j = c.ON_CAPTURE_SESSION_ENDED;
        }
        this.f117229e.close();
    }

    @Override // v.d3
    public void d(androidx.camera.core.impl.x2 x2Var) {
        c0.y0.a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f117239o + ")");
        this.f117231g = x2Var;
        if (x2Var == null) {
            return;
        }
        l2 l2Var = this.f117232h;
        if (l2Var != null) {
            l2Var.k(x2Var);
        }
        if (this.f117234j == c.ON_CAPTURE_SESSION_STARTED) {
            b0.k kVarC = b0.k.a.e(x2Var.f()).c();
            this.f117237m = kVarC;
            y(kVarC, this.f117238n);
            if (q(x2Var.k())) {
                this.f117225a.c(x2Var.k().j(), this.f117236l);
            } else {
                this.f117225a.a();
            }
        }
    }

    @Override // v.d3
    public void e(@NonNull List<androidx.camera.core.impl.v0> list) {
        if (list.isEmpty()) {
            return;
        }
        c0.y0.a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f117239o + ") + state =" + this.f117234j);
        int iOrdinal = this.f117234j.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (this.f117235k == null) {
                this.f117235k = list;
                return;
            } else {
                o(list);
                c0.y0.a("ProcessingCaptureSession", "cancel the request because are pending un-submitted request");
                return;
            }
        }
        if (iOrdinal == 2) {
            for (androidx.camera.core.impl.v0 v0Var : list) {
                if (v0Var.k() == 2) {
                    v(v0Var);
                } else {
                    w(v0Var);
                }
            }
            return;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            c0.y0.a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f117234j);
            o(list);
        }
    }

    @Override // v.d3
    public boolean f() {
        return this.f117229e.f();
    }

    @Override // v.d3
    public void g() {
        c0.y0.a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f117239o + ")");
        if (this.f117235k != null) {
            for (androidx.camera.core.impl.v0 v0Var : this.f117235k) {
                Iterator<androidx.camera.core.impl.p> it = v0Var.c().iterator();
                while (it.hasNext()) {
                    it.next().a(v0Var.f());
                }
            }
            this.f117235k = null;
        }
    }

    @Override // v.d3
    @NonNull
    public List<androidx.camera.core.impl.v0> h() {
        return this.f117235k != null ? this.f117235k : Collections.EMPTY_LIST;
    }

    void v(@NonNull androidx.camera.core.impl.v0 v0Var) {
        b0.k.a aVarE = b0.k.a.e(v0Var.g());
        androidx.camera.core.impl.x0 x0VarG = v0Var.g();
        androidx.camera.core.impl.x0.a<Integer> aVar = androidx.camera.core.impl.v0.f3311i;
        if (x0VarG.e(aVar)) {
            aVarE.f(CaptureRequest.JPEG_ORIENTATION, (Integer) v0Var.g().a(aVar));
        }
        androidx.camera.core.impl.x0 x0VarG2 = v0Var.g();
        androidx.camera.core.impl.x0.a<Integer> aVar2 = androidx.camera.core.impl.v0.f3312j;
        if (x0VarG2.e(aVar2)) {
            aVarE.f(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) v0Var.g().a(aVar2)).byteValue()));
        }
        b0.k kVarC = aVarE.c();
        this.f117238n = kVarC;
        y(this.f117237m, kVarC);
        this.f117225a.j(v0Var.m(), v0Var.j(), new b(v0Var.f(), v0Var.c(), null));
    }

    void w(@NonNull androidx.camera.core.impl.v0 v0Var) {
        c0.y0.a("ProcessingCaptureSession", "issueTriggerRequest");
        b0.k kVarC = b0.k.a.e(v0Var.g()).c();
        Iterator<androidx.camera.core.impl.x0.a<?>> it = kVarC.g().iterator();
        while (it.hasNext()) {
            CaptureRequest.Key key = (CaptureRequest.Key) it.next().d();
            if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                this.f117225a.h(kVarC, v0Var.j(), new b(v0Var.f(), v0Var.c(), null));
                return;
            }
        }
        o(Arrays.asList(v0Var));
    }

    void x(@NonNull c3 c3Var) {
        if (this.f117234j != c.SESSION_INITIALIZED) {
            return;
        }
        this.f117232h = new l2(c3Var, p(this.f117233i.o()));
        c0.y0.a("ProcessingCaptureSession", "== onCaptureSessinStarted (id = " + this.f117239o + ")");
        this.f117225a.b(this.f117232h);
        this.f117234j = c.ON_CAPTURE_SESSION_STARTED;
        androidx.camera.core.impl.x2 x2Var = this.f117231g;
        if (x2Var != null) {
            d(x2Var);
        }
        if (this.f117235k != null) {
            e(this.f117235k);
            this.f117235k = null;
        }
    }

    class a implements j0.c<Void> {
        a() {
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            c0.y0.d("ProcessingCaptureSession", "open session failed ", th2);
            q4.this.close();
            q4.this.a(false);
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r11) {
        }
    }

    private static class d implements androidx.camera.core.impl.z2.a {
        d() {
        }

        @Override // androidx.camera.core.impl.z2.a
        public void a(int i11) {
        }

        @Override // androidx.camera.core.impl.z2.a
        public void c(int i11) {
        }

        @Override // androidx.camera.core.impl.z2.a
        public void e(int i11) {
        }

        @Override // androidx.camera.core.impl.z2.a
        public void onCaptureSequenceAborted(int i11) {
        }

        @Override // androidx.camera.core.impl.z2.a
        public void d(int i11, long j11) {
        }

        @Override // androidx.camera.core.impl.z2.a
        public void b(long j11, int i11, @NonNull androidx.camera.core.impl.z zVar) {
        }
    }

    @Override // v.d3
    public void i(@NonNull Map<DeferrableSurface, Long> map) {
    }
}
