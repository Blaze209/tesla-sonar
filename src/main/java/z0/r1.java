package z0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.g2;
import androidx.camera.core.impl.h3;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.o3;
import androidx.camera.core.impl.p3;
import androidx.camera.core.impl.x2;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import z0.c2;

/* JADX INFO: loaded from: classes.dex */
public final class r1<T extends c2> extends c0.a2 {
    private static final e E = new e();
    private boolean A;
    private f B;
    private x2.c C;
    private final g2.a<i1> D;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    DeferrableSurface f126217q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private p0.n0 f126218r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    i1 f126219s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    x2.b f126220t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    com.google.common.util.concurrent.s<Void> f126221u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private c0.z1 f126222v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    c2.a f126223w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private p0.v0 f126224x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Rect f126225y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f126226z;

    class a implements g2.a<i1> {
        a() {
        }

        @Override // androidx.camera.core.impl.g2.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(i1 i1Var) {
            if (i1Var == null) {
                throw new IllegalArgumentException("StreamInfo can't be null");
            }
            if (r1.this.f126223w == c2.a.INACTIVE) {
                return;
            }
            c0.y0.a("VideoCapture", "Stream info update: old: " + r1.this.f126219s + " new: " + i1Var);
            r1 r1Var = r1.this;
            i1 i1Var2 = r1Var.f126219s;
            r1Var.f126219s = i1Var;
            c3 c3Var = (c3) u5.h.g(r1Var.f());
            if (r1.this.I0(i1Var2.a(), i1Var.a()) || r1.this.X0(i1Var2, i1Var)) {
                r1.this.K0();
                return;
            }
            if ((i1Var2.a() != -1 && i1Var.a() == -1) || (i1Var2.a() == -1 && i1Var.a() != -1)) {
                r1 r1Var2 = r1.this;
                r1Var2.u0(r1Var2.f126220t, i1Var, c3Var);
                r1 r1Var3 = r1.this;
                r1Var3.Y(c0.h0.a(new Object[]{r1Var3.f126220t.p()}));
                r1.this.H();
                return;
            }
            if (i1Var2.c() != i1Var.c()) {
                r1 r1Var4 = r1.this;
                r1Var4.u0(r1Var4.f126220t, i1Var, c3Var);
                r1 r1Var5 = r1.this;
                r1Var5.Y(c0.h0.a(new Object[]{r1Var5.f126220t.p()}));
                r1.this.J();
            }
        }

        @Override // androidx.camera.core.impl.g2.a
        public void onError(@NonNull Throwable th2) {
            c0.y0.m("VideoCapture", "Receive onError from StreamState observer", th2);
        }
    }

    class b extends androidx.camera.core.impl.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f126228a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f126229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a f126230c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ x2.b f126231d;

        b(AtomicBoolean atomicBoolean, androidx.concurrent.futures.c.a aVar, x2.b bVar) {
            this.f126229b = atomicBoolean;
            this.f126230c = aVar;
            this.f126231d = bVar;
        }

        public static /* synthetic */ void f(b bVar, x2.b bVar2) {
            bVar.getClass();
            bVar2.t(bVar);
        }

        @Override // androidx.camera.core.impl.p
        public void b(int i11, @NonNull androidx.camera.core.impl.z zVar) {
            Object objD;
            super.b(i11, zVar);
            if (this.f126228a) {
                this.f126228a = false;
                c0.y0.a("VideoCapture", "cameraCaptureResult timestampNs = " + zVar.a() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
            }
            if (this.f126229b.get() || (objD = zVar.c().d("androidx.camera.video.VideoCapture.streamUpdate")) == null || ((Integer) objD).intValue() != this.f126230c.hashCode() || !this.f126230c.c(null) || this.f126229b.getAndSet(true)) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceE = i0.c.e();
            final x2.b bVar = this.f126231d;
            scheduledExecutorServiceE.execute(new Runnable() { // from class: z0.s1
                @Override // java.lang.Runnable
                public final void run() {
                    r1.b.f(this.f126246a, bVar);
                }
            });
        }
    }

    class c implements j0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.s f126233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f126234b;

        c(com.google.common.util.concurrent.s sVar, boolean z11) {
            this.f126233a = sVar;
            this.f126234b = z11;
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r11) {
            com.google.common.util.concurrent.s<Void> sVar = this.f126233a;
            r1 r1Var = r1.this;
            if (sVar != r1Var.f126221u || r1Var.f126223w == c2.a.INACTIVE) {
                return;
            }
            r1Var.P0(this.f126234b ? c2.a.ACTIVE_STREAMING : c2.a.ACTIVE_NON_STREAMING);
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            if (th2 instanceof CancellationException) {
                return;
            }
            c0.y0.d("VideoCapture", "Surface update completed with unexpected exception", th2);
        }
    }

    public static final class d<T extends c2> implements o3.b<r1<T>, a1.a<T>, d<T>>, androidx.camera.core.impl.r1.a<d<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.camera.core.impl.d2 f126236a;

        public d(@NonNull T t11) {
            this(f(t11));
        }

        @NonNull
        private static <T extends c2> androidx.camera.core.impl.d2 f(@NonNull T t11) {
            androidx.camera.core.impl.d2 d2VarC0 = androidx.camera.core.impl.d2.c0();
            d2VarC0.K(a1.a.L, t11);
            return d2VarC0;
        }

        @NonNull
        static d<? extends c2> g(@NonNull androidx.camera.core.impl.x0 x0Var) {
            return new d<>(androidx.camera.core.impl.d2.d0(x0Var));
        }

        @Override // c0.d0
        @NonNull
        public androidx.camera.core.impl.c2 b() {
            return this.f126236a;
        }

        @NonNull
        public r1<T> e() {
            return new r1<>(d());
        }

        @Override // androidx.camera.core.impl.o3.b
        @NonNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a1.a<T> d() {
            return new a1.a<>(i2.b0(this.f126236a));
        }

        @NonNull
        public d<T> i(@NonNull p3.b bVar) {
            b().K(o3.C, bVar);
            return this;
        }

        @NonNull
        public d<T> j(@NonNull c0.b0 b0Var) {
            b().K(androidx.camera.core.impl.q1.f3283j, b0Var);
            return this;
        }

        @NonNull
        public d<T> k(int i11) {
            b().K(androidx.camera.core.impl.r1.f3289n, Integer.valueOf(i11));
            return this;
        }

        @NonNull
        public d<T> l(@NonNull s0.c cVar) {
            b().K(androidx.camera.core.impl.r1.f3294s, cVar);
            return this;
        }

        @NonNull
        public d<T> m(int i11) {
            b().K(o3.f3270y, Integer.valueOf(i11));
            return this;
        }

        @NonNull
        public d<T> n(@NonNull Class<r1<T>> cls) {
            b().K(k0.k.I, cls);
            if (b().d(k0.k.H, null) == null) {
                p(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @NonNull
        public d<T> o(@NonNull Range<Integer> range) {
            b().K(o3.f3271z, range);
            return this;
        }

        @NonNull
        public d<T> p(@NonNull String str) {
            b().K(k0.k.H, str);
            return this;
        }

        @Override // androidx.camera.core.impl.r1.a
        @NonNull
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public d<T> c(@NonNull Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        @Override // androidx.camera.core.impl.r1.a
        @NonNull
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public d<T> a(int i11) {
            b().K(androidx.camera.core.impl.r1.f3287l, Integer.valueOf(i11));
            return this;
        }

        @NonNull
        d<T> s(@NonNull r.a<g1.m1, g1.o1> aVar) {
            b().K(a1.a.M, aVar);
            return this;
        }

        @NonNull
        public d<T> t(boolean z11) {
            b().K(o3.E, Integer.valueOf(z11 ? 2 : 1));
            return this;
        }

        private d(@NonNull androidx.camera.core.impl.d2 d2Var) {
            this.f126236a = d2Var;
            if (!d2Var.e(a1.a.L)) {
                throw new IllegalArgumentException("VideoOutput is required");
            }
            Class cls = (Class) d2Var.d(k0.k.I, null);
            if (cls == null || cls.equals(r1.class)) {
                i(p3.b.VIDEO_CAPTURE);
                n(r1.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c2 f126237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a1.a<?> f126238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final r.a<g1.m1, g1.o1> f126239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final Range<Integer> f126240d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final c0.b0 f126241e;

        static {
            c2 c2Var = new c2() { // from class: z0.t1
                @Override // z0.c2
                public final void a(c0.z1 z1Var) {
                    z1Var.x();
                }
            };
            f126237a = c2Var;
            r.a<g1.m1, g1.o1> aVar = g1.q1.f66990d;
            f126239c = aVar;
            f126240d = new Range<>(30, 30);
            c0.b0 b0Var = c0.b0.f18255d;
            f126241e = b0Var;
            f126238b = new d(c2Var).m(5).s(aVar).j(b0Var).d();
        }

        @NonNull
        public a1.a<?> a() {
            return f126238b;
        }
    }

    static class f implements g2.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CameraControlInternal f126242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f126243b = false;

        f(@NonNull CameraControlInternal cameraControlInternal) {
            this.f126242a = cameraControlInternal;
        }

        private void d(boolean z11) {
            if (this.f126243b == z11) {
                return;
            }
            this.f126243b = z11;
            CameraControlInternal cameraControlInternal = this.f126242a;
            if (cameraControlInternal == null) {
                c0.y0.a("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            } else if (z11) {
                cameraControlInternal.h();
            } else {
                cameraControlInternal.b();
            }
        }

        public void b() {
            u5.h.j(h0.r.d(), "SourceStreamRequirementObserver can be closed from main thread only");
            c0.y0.a("VideoCapture", "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.f126243b);
            if (this.f126242a == null) {
                c0.y0.a("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
            } else {
                d(false);
                this.f126242a = null;
            }
        }

        @Override // androidx.camera.core.impl.g2.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            u5.h.j(h0.r.d(), "SourceStreamRequirementObserver can be updated from main thread only");
            d(Boolean.TRUE.equals(bool));
        }

        @Override // androidx.camera.core.impl.g2.a
        public void onError(@NonNull Throwable th2) {
            c0.y0.m("VideoCapture", "SourceStreamRequirementObserver#onError", th2);
        }
    }

    r1(@NonNull a1.a<T> aVar) {
        super(aVar);
        this.f126219s = i1.f126155a;
        this.f126220t = new x2.b();
        this.f126221u = null;
        this.f126223w = c2.a.INACTIVE;
        this.A = false;
        this.D = new a();
    }

    @NonNull
    private static List<Size> A0(@NonNull a1.a<?> aVar, @NonNull s sVar, @NonNull c0.b0 b0Var, @NonNull j1 j1Var, @NonNull List<Size> list, @NonNull Map<x, Size> map) {
        b1.i iVarD;
        if (!list.isEmpty()) {
            Iterator<Size> it = list.iterator();
            while (it.hasNext()) {
                Size next = it.next();
                if (!map.containsValue(next) && (iVarD = j1Var.d(next, b0Var)) != null) {
                    r.a<g1.m1, g1.o1> aVarZ = aVar.Z();
                    Range<Integer> rangeO = aVar.O(e.f126240d);
                    Objects.requireNonNull(rangeO);
                    s sVar2 = sVar;
                    c0.b0 b0Var2 = b0Var;
                    g1.o1 o1VarB0 = B0(aVarZ, iVarD, b0Var2, sVar2, next, rangeO);
                    if (o1VarB0 != null && !o1VarB0.b(next.getWidth(), next.getHeight())) {
                        it.remove();
                    }
                    b0Var = b0Var2;
                    sVar = sVar2;
                }
            }
        }
        return list;
    }

    private static g1.o1 B0(@NonNull r.a<g1.m1, g1.o1> aVar, @NonNull b1.i iVar, @NonNull c0.b0 b0Var, @NonNull s sVar, @NonNull Size size, @NonNull Range<Integer> range) {
        g1.o1 o1VarN0;
        int iB;
        if (b0Var.e()) {
            return N0(aVar, iVar, sVar, size, b0Var, range);
        }
        int i11 = Integer.MIN_VALUE;
        g1.o1 o1Var = null;
        for (androidx.camera.core.impl.j1.c cVar : iVar.e()) {
            if (h1.b.f(cVar, b0Var) && (o1VarN0 = N0(aVar, iVar, sVar, size, new c0.b0(h1.b.h(cVar.g()), h1.b.g(cVar.b())), range)) != null && (iB = o0.c.b(((Integer) o1VarN0.e().getUpper()).intValue(), ((Integer) o1VarN0.f().getUpper()).intValue())) > i11) {
                o1Var = o1VarN0;
                i11 = iB;
            }
        }
        return o1Var;
    }

    private int C0(@NonNull androidx.camera.core.impl.j0 j0Var) {
        boolean zD = D(j0Var);
        int iS = s(j0Var, zD);
        if (!S0()) {
            return iS;
        }
        c0.z1.h hVarB = this.f126219s.b();
        Objects.requireNonNull(hVarB);
        int iB = hVarB.b();
        if (zD != hVarB.f()) {
            iB = -iB;
        }
        return h0.s.w(iS - iB);
    }

    private s E0() {
        return (s) z0(F0().c(), null);
    }

    @NonNull
    private j1 G0(@NonNull c0.n nVar) {
        return F0().d(nVar);
    }

    private boolean H0(@NonNull androidx.camera.core.impl.j0 j0Var, @NonNull a1.a<?> aVar, @NonNull Rect rect, @NonNull Size size) {
        return m() != null || U0(j0Var, aVar) || V0(j0Var) || T0(rect, size) || W0(j0Var) || S0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0(@NonNull p0.n0 n0Var, @NonNull androidx.camera.core.impl.j0 j0Var, @NonNull a1.a<T> aVar, @NonNull h3 h3Var) {
        if (j0Var == h()) {
            this.f126222v = n0Var.k(j0Var);
            aVar.a0().b(this.f126222v, h3Var);
            O0();
        }
    }

    @NonNull
    private static Range<Integer> L0(@NonNull c3 c3Var) {
        Range<Integer> rangeC = c3Var.c();
        return Objects.equals(rangeC, c3.f3148a) ? e.f126240d : rangeC;
    }

    @NonNull
    private static h3 M0(@NonNull androidx.camera.core.impl.j0 j0Var, p0.v0 v0Var) {
        return (v0Var == null && j0Var.q()) ? h3.UPTIME : j0Var.e().w();
    }

    private static g1.o1 N0(@NonNull r.a<g1.m1, g1.o1> aVar, b1.i iVar, @NonNull s sVar, @NonNull Size size, @NonNull c0.b0 b0Var, @NonNull Range<Integer> range) {
        g1.o1 o1VarApply = aVar.apply(f1.k.c(f1.k.d(sVar, b0Var, iVar), h3.UPTIME, sVar.d(), size, b0Var, range));
        if (o1VarApply != null) {
            return i1.e.l(o1VarApply, iVar != null ? new Size(iVar.k().k(), iVar.k().h()) : null);
        }
        c0.y0.l("VideoCapture", "Can't find videoEncoderInfo");
        return null;
    }

    private void O0() {
        androidx.camera.core.impl.j0 j0VarH = h();
        p0.n0 n0Var = this.f126218r;
        if (j0VarH == null || n0Var == null) {
            return;
        }
        int iC0 = C0(j0VarH);
        this.f126226z = iC0;
        n0Var.z(iC0, e());
    }

    private void R0(@NonNull final x2.b bVar, boolean z11) {
        com.google.common.util.concurrent.s<Void> sVar = this.f126221u;
        if (sVar != null && sVar.cancel(false)) {
            c0.y0.a("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        com.google.common.util.concurrent.s<Void> sVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: z0.k1
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return r1.g0(this.f126170a, bVar, aVar);
            }
        });
        this.f126221u = sVarA;
        j0.n.j(sVarA, new c(sVarA, z11), i0.c.e());
    }

    private boolean S0() {
        return this.f126219s.b() != null;
    }

    private static boolean T0(@NonNull Rect rect, @NonNull Size size) {
        return (size.getWidth() == rect.width() && size.getHeight() == rect.height()) ? false : true;
    }

    private static <T extends c2> boolean U0(@NonNull androidx.camera.core.impl.j0 j0Var, @NonNull a1.a<T> aVar) {
        return j0Var.q() && aVar.b0();
    }

    private static boolean V0(@NonNull androidx.camera.core.impl.j0 j0Var) {
        if (j0Var.q()) {
            return SurfaceProcessingQuirk.c(androidx.camera.video.internal.compat.quirk.a.c()) || SurfaceProcessingQuirk.c(j0Var.e().r());
        }
        return false;
    }

    private boolean W0(@NonNull androidx.camera.core.impl.j0 j0Var) {
        return j0Var.q() && D(j0Var);
    }

    private void Y0(@NonNull androidx.camera.core.impl.i0 i0Var, @NonNull o3.b<?, ?, ?> bVar) {
        s sVarE0 = E0();
        u5.h.b(sVarE0 != null, "Unable to update target resolution by null MediaSpec.");
        c0.b0 b0VarD0 = D0();
        j1 j1VarG0 = G0(i0Var);
        List<x> listF = j1VarG0.f(b0VarD0);
        if (listF.isEmpty()) {
            c0.y0.l("VideoCapture", "Can't find any supported quality on the device.");
            return;
        }
        e2 e2VarD = sVarE0.d();
        a0 a0VarE = e2VarD.e();
        List<x> listF2 = a0VarE.f(listF);
        c0.y0.a("VideoCapture", "Found selectedQualities " + listF2 + " by " + a0VarE);
        if (listF2.isEmpty()) {
            throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
        }
        int iB = e2VarD.b();
        Map<x, Size> mapH = a0.h(j1VarG0, b0VarD0);
        z zVar = new z(i0Var.s(n()), mapH);
        ArrayList arrayList = new ArrayList();
        Iterator<x> it = listF2.iterator();
        while (it.hasNext()) {
            arrayList.addAll(zVar.g(it.next(), iB));
        }
        List<Size> listA0 = A0((a1.a) bVar.d(), sVarE0, b0VarD0, j1VarG0, arrayList, mapH);
        c0.y0.a("VideoCapture", "Set custom ordered resolutions = " + listA0);
        bVar.b().K(androidx.camera.core.impl.r1.f3295t, listA0);
    }

    @NonNull
    public static <T extends c2> r1<T> Z0(@NonNull T t11) {
        return new d((c2) u5.h.g(t11)).e();
    }

    public static /* synthetic */ int c0(Rect rect, Size size, Size size2) {
        return (Math.abs(size.getWidth() - rect.width()) + Math.abs(size.getHeight() - rect.height())) - (Math.abs(size2.getWidth() - rect.width()) + Math.abs(size2.getHeight() - rect.height()));
    }

    public static /* synthetic */ void d0(r1 r1Var, DeferrableSurface deferrableSurface) {
        if (deferrableSurface == r1Var.f126217q) {
            r1Var.w0();
        }
    }

    public static /* synthetic */ void f0(AtomicBoolean atomicBoolean, x2.b bVar, androidx.camera.core.impl.p pVar) {
        u5.h.j(h0.r.d(), "Surface update cancellation should only occur on main thread.");
        atomicBoolean.set(true);
        bVar.t(pVar);
    }

    public static /* synthetic */ Object g0(r1 r1Var, final x2.b bVar, androidx.concurrent.futures.c.a aVar) {
        r1Var.getClass();
        bVar.o("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final b bVar2 = new b(atomicBoolean, aVar, bVar);
        aVar.a(new Runnable() { // from class: z0.p1
            @Override // java.lang.Runnable
            public final void run() {
                r1.f0(atomicBoolean, bVar, bVar2);
            }
        }, i0.c.b());
        bVar.k(bVar2);
        return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
    }

    private static void m0(@NonNull Set<Size> set, int i11, int i12, @NonNull Size size, @NonNull g1.o1 o1Var) {
        if (i11 > size.getWidth() || i12 > size.getHeight()) {
            return;
        }
        try {
            set.add(new Size(i11, ((Integer) o1Var.d(i11).clamp(Integer.valueOf(i12))).intValue()));
        } catch (IllegalArgumentException e11) {
            c0.y0.m("VideoCapture", "No supportedHeights for width: " + i11, e11);
        }
        try {
            set.add(new Size(((Integer) o1Var.a(i12).clamp(Integer.valueOf(i11))).intValue(), i12));
        } catch (IllegalArgumentException e12) {
            c0.y0.m("VideoCapture", "No supportedWidths for height: " + i12, e12);
        }
    }

    @NonNull
    private static Rect n0(@NonNull Rect rect, int i11, boolean z11, g1.o1 o1Var) {
        SizeCannotEncodeVideoQuirk sizeCannotEncodeVideoQuirk = (SizeCannotEncodeVideoQuirk) androidx.camera.video.internal.compat.quirk.a.b(SizeCannotEncodeVideoQuirk.class);
        if (sizeCannotEncodeVideoQuirk == null) {
            return rect;
        }
        if (!z11) {
            i11 = 0;
        }
        return sizeCannotEncodeVideoQuirk.g(rect, i11, o1Var);
    }

    @NonNull
    private static Rect o0(@NonNull final Rect rect, @NonNull Size size, @NonNull g1.o1 o1Var) {
        c0.y0.a("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", h0.s.n(rect), Integer.valueOf(o1Var.j()), Integer.valueOf(o1Var.h()), o1Var.e(), o1Var.f()));
        if ((!o1Var.e().contains(Integer.valueOf(rect.width())) || !o1Var.f().contains(Integer.valueOf(rect.height()))) && o1Var.g() && o1Var.f().contains(Integer.valueOf(rect.width())) && o1Var.e().contains(Integer.valueOf(rect.height()))) {
            o1Var = new g1.j1(o1Var);
        }
        int iJ = o1Var.j();
        int iH = o1Var.h();
        Range<Integer> rangeE = o1Var.e();
        Range<Integer> rangeF = o1Var.f();
        int iS0 = s0(rect.width(), iJ, rangeE);
        int iT0 = t0(rect.width(), iJ, rangeE);
        int iS1 = s0(rect.height(), iH, rangeF);
        int iT1 = t0(rect.height(), iH, rangeF);
        HashSet hashSet = new HashSet();
        m0(hashSet, iS0, iS1, size, o1Var);
        m0(hashSet, iS0, iT1, size, o1Var);
        m0(hashSet, iT0, iS1, size, o1Var);
        m0(hashSet, iT0, iT1, size, o1Var);
        if (hashSet.isEmpty()) {
            c0.y0.l("VideoCapture", "Can't find valid cropped size");
            return rect;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        c0.y0.a("VideoCapture", "candidatesList = " + arrayList);
        Collections.sort(arrayList, new Comparator() { // from class: z0.q1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return r1.c0(rect, (Size) obj, (Size) obj2);
            }
        });
        c0.y0.a("VideoCapture", "sorted candidatesList = " + arrayList);
        Size size2 = (Size) arrayList.get(0);
        int width = size2.getWidth();
        int height = size2.getHeight();
        if (width == rect.width() && height == rect.height()) {
            c0.y0.a("VideoCapture", "No need to adjust cropRect because crop size is valid.");
            return rect;
        }
        u5.h.i(width % 2 == 0 && height % 2 == 0 && width <= size.getWidth() && height <= size.getHeight());
        Rect rect2 = new Rect(rect);
        if (width != rect.width()) {
            int iMax = Math.max(0, rect.centerX() - (width / 2));
            rect2.left = iMax;
            int i11 = iMax + width;
            rect2.right = i11;
            if (i11 > size.getWidth()) {
                int width2 = size.getWidth();
                rect2.right = width2;
                rect2.left = width2 - width;
            }
        }
        if (height != rect.height()) {
            int iMax2 = Math.max(0, rect.centerY() - (height / 2));
            rect2.top = iMax2;
            int i12 = iMax2 + height;
            rect2.bottom = i12;
            if (i12 > size.getHeight()) {
                int height2 = size.getHeight();
                rect2.bottom = height2;
                rect2.top = height2 - height;
            }
        }
        c0.y0.a("VideoCapture", String.format("Adjust cropRect from %s to %s", h0.s.n(rect), h0.s.n(rect2)));
        return rect2;
    }

    @NonNull
    private Rect p0(@NonNull Rect rect, int i11) {
        return S0() ? h0.s.r(h0.s.f(((c0.z1.h) u5.h.g(this.f126219s.b())).a(), i11)) : rect;
    }

    @NonNull
    private Size q0(@NonNull Size size, @NonNull Rect rect, @NonNull Rect rect2) {
        if (!S0() || rect2.equals(rect)) {
            return size;
        }
        float fHeight = rect2.height() / rect.height();
        return new Size((int) Math.ceil(size.getWidth() * fHeight), (int) Math.ceil(size.getHeight() * fHeight));
    }

    private static int r0(boolean z11, int i11, int i12, @NonNull Range<Integer> range) {
        int i13 = i11 % i12;
        if (i13 != 0) {
            i11 = z11 ? i11 - i13 : i11 + (i12 - i13);
        }
        return ((Integer) range.clamp(Integer.valueOf(i11))).intValue();
    }

    private static int s0(int i11, int i12, @NonNull Range<Integer> range) {
        return r0(true, i11, i12, range);
    }

    private static int t0(int i11, int i12, @NonNull Range<Integer> range) {
        return r0(false, i11, i12, range);
    }

    @NonNull
    private Rect v0(@NonNull Size size, g1.o1 o1Var) {
        Rect rectB = B() != null ? B() : new Rect(0, 0, size.getWidth(), size.getHeight());
        return (o1Var == null || o1Var.b(rectB.width(), rectB.height())) ? rectB : o0(rectB, size, o1Var);
    }

    private void w0() {
        h0.r.b();
        x2.c cVar = this.C;
        if (cVar != null) {
            cVar.b();
            this.C = null;
        }
        DeferrableSurface deferrableSurface = this.f126217q;
        if (deferrableSurface != null) {
            deferrableSurface.d();
            this.f126217q = null;
        }
        p0.v0 v0Var = this.f126224x;
        if (v0Var != null) {
            v0Var.f();
            this.f126224x = null;
        }
        p0.n0 n0Var = this.f126218r;
        if (n0Var != null) {
            n0Var.i();
            this.f126218r = null;
        }
        this.f126225y = null;
        this.f126222v = null;
        this.f126219s = i1.f126155a;
        this.f126226z = 0;
        this.A = false;
    }

    private p0.v0 x0(@NonNull androidx.camera.core.impl.j0 j0Var, @NonNull a1.a<T> aVar, @NonNull Rect rect, @NonNull Size size, @NonNull c0.b0 b0Var) {
        if (!H0(j0Var, aVar, rect, size)) {
            return null;
        }
        c0.y0.a("VideoCapture", "Surface processing is enabled.");
        androidx.camera.core.impl.j0 j0VarH = h();
        Objects.requireNonNull(j0VarH);
        return new p0.v0(j0VarH, m() != null ? m().a() : p0.t.a.a(b0Var));
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    private x2.b y0(@NonNull final a1.a<T> aVar, @NonNull c3 c3Var) {
        a1.a<T> aVar2;
        final r1<T> r1Var = this;
        h0.r.b();
        final androidx.camera.core.impl.j0 j0Var = (androidx.camera.core.impl.j0) u5.h.g(r1Var.h());
        Size sizeE = c3Var.e();
        Runnable runnable = new Runnable() { // from class: z0.l1
            @Override // java.lang.Runnable
            public final void run() {
                this.f126176a.H();
            }
        };
        Range<Integer> rangeL0 = L0(c3Var);
        s sVarE0 = r1Var.E0();
        Objects.requireNonNull(sVarE0);
        j1 j1VarG0 = r1Var.G0(j0Var.c());
        c0.b0 b0VarB = c3Var.b();
        g1.o1 o1VarN0 = N0(aVar.Z(), j1VarG0.d(sizeE, b0VarB), sVarE0, sizeE, b0VarB, rangeL0);
        r1Var.f126226z = r1Var.C0(j0Var);
        Rect rectV0 = r1Var.v0(sizeE, o1VarN0);
        Rect rectP0 = r1Var.p0(rectV0, r1Var.f126226z);
        r1Var.f126225y = rectP0;
        Size sizeQ0 = r1Var.q0(sizeE, rectV0, rectP0);
        if (r1Var.S0()) {
            r1Var.A = true;
        }
        Rect rect = r1Var.f126225y;
        Rect rectN0 = n0(rect, r1Var.f126226z, r1Var.H0(j0Var, aVar, rect, sizeE), o1VarN0);
        r1Var.f126225y = rectN0;
        p0.v0 v0VarX0 = r1Var.x0(j0Var, aVar, rectN0, sizeE, b0VarB);
        r1Var.f126224x = v0VarX0;
        final h3 h3VarM0 = M0(j0Var, v0VarX0);
        c0.y0.a("VideoCapture", "camera timebase = " + j0Var.e().w() + ", processing timebase = " + h3VarM0);
        c3 c3VarA = c3Var.g().e(sizeQ0).c(rangeL0).a();
        u5.h.i(r1Var.f126218r == null);
        p0.n0 n0Var = new p0.n0(2, 34, c3VarA, r1Var.w(), j0Var.q(), r1Var.f126225y, r1Var.f126226z, r1Var.e(), r1Var.W0(j0Var));
        r1Var.f126218r = n0Var;
        n0Var.e(runnable);
        if (r1Var.f126224x != null) {
            r0.f fVarJ = r0.f.j(r1Var.f126218r);
            final p0.n0 n0Var2 = r1Var.f126224x.j(p0.v0.b.c(r1Var.f126218r, Collections.singletonList(fVarJ))).get(fVarJ);
            Objects.requireNonNull(n0Var2);
            Runnable runnable2 = new Runnable() { // from class: z0.m1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f126180a.J0(n0Var2, j0Var, aVar, h3VarM0);
                }
            };
            r1Var = this;
            aVar2 = aVar;
            n0Var2.e(runnable2);
            r1Var.f126222v = n0Var2.k(j0Var);
            final DeferrableSurface deferrableSurfaceO = r1Var.f126218r.o();
            r1Var.f126217q = deferrableSurfaceO;
            deferrableSurfaceO.k().b(new Runnable() { // from class: z0.n1
                @Override // java.lang.Runnable
                public final void run() {
                    r1.d0(this.f126193a, deferrableSurfaceO);
                }
            }, i0.c.e());
        } else {
            aVar2 = aVar;
            c0.z1 z1VarK = r1Var.f126218r.k(j0Var);
            r1Var.f126222v = z1VarK;
            r1Var.f126217q = z1VarK.m();
        }
        aVar2.a0().b(r1Var.f126222v, h3VarM0);
        r1Var.O0();
        r1Var.f126217q.p(MediaCodec.class);
        x2.b bVarR = x2.b.r(aVar2, c3Var.e());
        r1Var.b(bVarR, c3Var);
        bVarR.C(aVar2.r());
        x2.c cVar = r1Var.C;
        if (cVar != null) {
            cVar.b();
        }
        x2.c cVar2 = new x2.c(new x2.d() { // from class: z0.o1
            @Override // androidx.camera.core.impl.x2.d
            public final void a(x2 x2Var, x2.g gVar) {
                this.f126200a.K0();
            }
        });
        r1Var.C = cVar2;
        bVarR.u(cVar2);
        if (c3Var.d() != null) {
            bVarR.g(c3Var.d());
        }
        return bVarR;
    }

    private static <T> T z0(@NonNull g2<T> g2Var, T t11) {
        com.google.common.util.concurrent.s<T> sVarB = g2Var.b();
        if (!sVarB.isDone()) {
            return t11;
        }
        try {
            return sVarB.get();
        } catch (InterruptedException | ExecutionException e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Override // c0.a2
    @NonNull
    public o3.b<?, ?, ?> A(@NonNull androidx.camera.core.impl.x0 x0Var) {
        return d.g(x0Var);
    }

    @NonNull
    public c0.b0 D0() {
        return k().z() ? k().w() : e.f126241e;
    }

    @NonNull
    public T F0() {
        return (T) ((a1.a) k()).a0();
    }

    boolean I0(int i11, int i12) {
        Set<Integer> set = i1.f126156b;
        return (set.contains(Integer.valueOf(i11)) || set.contains(Integer.valueOf(i12)) || i11 == i12) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K0() {
        if (h() == null) {
            return;
        }
        w0();
        x2.b bVarY0 = y0((a1.a) k(), (c3) u5.h.g(f()));
        this.f126220t = bVarY0;
        u0(bVarY0, this.f126219s, f());
        Y(c0.h0.a(new Object[]{this.f126220t.p()}));
        H();
    }

    @Override // c0.a2
    @NonNull
    protected o3<?> M(@NonNull androidx.camera.core.impl.i0 i0Var, @NonNull o3.b<?, ?, ?> bVar) {
        Y0(i0Var, bVar);
        return bVar.d();
    }

    @Override // c0.a2
    public void N() {
        super.N();
        c0.y0.a("VideoCapture", "VideoCapture#onStateAttached: cameraID = " + j());
        if (f() == null || this.f126222v != null) {
            return;
        }
        c3 c3Var = (c3) u5.h.g(f());
        this.f126219s = (i1) z0(F0().e(), i1.f126155a);
        x2.b bVarY0 = y0((a1.a) k(), c3Var);
        this.f126220t = bVarY0;
        u0(bVarY0, this.f126219s, c3Var);
        Y(c0.h0.a(new Object[]{this.f126220t.p()}));
        F();
        F0().e().c(i0.c.e(), this.D);
        f fVar = this.B;
        if (fVar != null) {
            fVar.b();
        }
        this.B = new f(i());
        F0().g().c(i0.c.e(), this.B);
        P0(c2.a.ACTIVE_NON_STREAMING);
    }

    @Override // c0.a2
    public void O() {
        c0.y0.a("VideoCapture", "VideoCapture#onStateDetached");
        u5.h.j(h0.r.d(), "VideoCapture can only be detached on the main thread.");
        if (this.B != null) {
            F0().g().d(this.B);
            this.B.b();
            this.B = null;
        }
        P0(c2.a.INACTIVE);
        F0().e().d(this.D);
        com.google.common.util.concurrent.s<Void> sVar = this.f126221u;
        if (sVar != null && sVar.cancel(false)) {
            c0.y0.a("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        w0();
    }

    @Override // c0.a2
    @NonNull
    protected c3 P(@NonNull androidx.camera.core.impl.x0 x0Var) {
        this.f126220t.g(x0Var);
        Y(c0.h0.a(new Object[]{this.f126220t.p()}));
        c3 c3VarF = f();
        Objects.requireNonNull(c3VarF);
        return c3VarF.g().d(x0Var).a();
    }

    void P0(@NonNull c2.a aVar) {
        if (aVar != this.f126223w) {
            this.f126223w = aVar;
            F0().f(aVar);
        }
    }

    @Override // c0.a2
    @NonNull
    protected c3 Q(@NonNull c3 c3Var, c3 c3Var2) {
        c0.y0.a("VideoCapture", "onSuggestedStreamSpecUpdated: " + c3Var);
        List<Size> listY = ((a1.a) k()).y(null);
        if (listY != null && !listY.contains(c3Var.e())) {
            c0.y0.l("VideoCapture", "suggested resolution " + c3Var.e() + " is not in custom ordered resolutions " + listY);
        }
        return c3Var;
    }

    public void Q0(int i11) {
        if (V(i11)) {
            O0();
        }
    }

    @Override // c0.a2
    public void W(@NonNull Rect rect) {
        super.W(rect);
        O0();
    }

    boolean X0(@NonNull i1 i1Var, @NonNull i1 i1Var2) {
        return this.A && i1Var.b() != null && i1Var2.b() == null;
    }

    @Override // c0.a2
    public o3<?> l(boolean z11, @NonNull p3 p3Var) {
        e eVar = E;
        androidx.camera.core.impl.x0 x0VarA = p3Var.a(eVar.a().U(), 1);
        if (z11) {
            x0VarA = androidx.camera.core.impl.x0.V(x0VarA, eVar.a());
        }
        if (x0VarA == null) {
            return null;
        }
        return A(x0VarA).d();
    }

    @NonNull
    public String toString() {
        return "VideoCapture:" + p();
    }

    void u0(@NonNull x2.b bVar, @NonNull i1 i1Var, @NonNull c3 c3Var) {
        DeferrableSurface deferrableSurface;
        boolean z11 = i1Var.a() == -1;
        boolean z12 = i1Var.c() == i1.a.ACTIVE;
        if (z11 && z12) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        bVar.q();
        c0.b0 b0VarB = c3Var.b();
        if (!z11 && (deferrableSurface = this.f126217q) != null) {
            if (z12) {
                bVar.n(deferrableSurface, b0VarB, null, -1);
            } else {
                bVar.i(deferrableSurface, b0VarB);
            }
        }
        R0(bVar, z12);
    }

    @Override // c0.a2
    @NonNull
    public Set<Integer> y() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }
}
