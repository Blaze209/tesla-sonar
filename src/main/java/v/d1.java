package v;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final v f116889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final z.c0 f116890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f116891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final androidx.camera.core.impl.r2 f116892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final Executor f116893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private final ScheduledExecutorService f116894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f116895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f116896h = 1;

    static class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v f116897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z.o f116898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f116899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f116900d = false;

        a(@NonNull v vVar, int i11, @NonNull z.o oVar) {
            this.f116897a = vVar;
            this.f116899c = i11;
            this.f116898b = oVar;
        }

        public static /* synthetic */ Object e(a aVar, androidx.concurrent.futures.c.a aVar2) {
            aVar.f116897a.H().V(aVar2);
            aVar.f116898b.b();
            return "AePreCapture";
        }

        @Override // v.d1.e
        @NonNull
        public com.google.common.util.concurrent.s<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (!d1.e(this.f116899c, totalCaptureResult)) {
                return j0.n.p(Boolean.FALSE);
            }
            c0.y0.a("Camera2CapturePipeline", "Trigger AE");
            this.f116900d = true;
            return j0.d.a(androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.b1
                @Override // androidx.concurrent.futures.c.InterfaceC0146c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return d1.a.e(this.f116826a, aVar);
                }
            })).e(new r.a() { // from class: v.c1
                @Override // r.a
                public final Object apply(Object obj) {
                    return Boolean.TRUE;
                }
            }, i0.c.b());
        }

        @Override // v.d1.e
        public boolean b() {
            return this.f116899c == 0;
        }

        @Override // v.d1.e
        public void c() {
            if (this.f116900d) {
                c0.y0.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f116897a.H().q(false, true);
                this.f116898b.a();
            }
        }
    }

    static class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v f116901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f116902b = false;

        b(@NonNull v vVar) {
            this.f116901a = vVar;
        }

        @Override // v.d1.e
        @NonNull
        public com.google.common.util.concurrent.s<Boolean> a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            int iIntValue;
            com.google.common.util.concurrent.s<Boolean> sVarP = j0.n.p(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
                c0.y0.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    c0.y0.a("Camera2CapturePipeline", "Trigger AF");
                    this.f116902b = true;
                    this.f116901a.H().W(null, false);
                }
            }
            return sVarP;
        }

        @Override // v.d1.e
        public boolean b() {
            return true;
        }

        @Override // v.d1.e
        public void c() {
            if (this.f116902b) {
                c0.y0.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f116901a.H().q(true, false);
            }
        }
    }

    static class c implements e0.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f116903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f116904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f116905c;

        c(d dVar, Executor executor, int i11) {
            this.f116904b = dVar;
            this.f116903a = executor;
            this.f116905c = i11;
        }

        public static /* synthetic */ Object c(c cVar, androidx.concurrent.futures.c.a aVar) {
            cVar.f116904b.j();
            aVar.c(null);
            return "invokePostCaptureFuture";
        }

        public static /* synthetic */ Void d(TotalCaptureResult totalCaptureResult) {
            return null;
        }

        @Override // e0.l
        @NonNull
        public com.google.common.util.concurrent.s<Void> a() {
            c0.y0.a("Camera2CapturePipeline", "invokePreCapture");
            return j0.d.a(this.f116904b.k(this.f116905c)).e(new r.a() { // from class: v.f1
                @Override // r.a
                public final Object apply(Object obj) {
                    return d1.c.d((TotalCaptureResult) obj);
                }
            }, this.f116903a);
        }

        @Override // e0.l
        @NonNull
        public com.google.common.util.concurrent.s<Void> b() {
            return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.e1
                @Override // androidx.concurrent.futures.c.InterfaceC0146c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return d1.c.c(this.f116946a, aVar);
                }
            });
        }
    }

    static class d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f116906j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f116907k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f116908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f116909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ScheduledExecutorService f116910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final v f116911d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final z.o f116912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f116913f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f116914g = f116906j;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final List<e> f116915h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final e f116916i = new a();

        class a implements e {
            a() {
            }

            @Override // v.d1.e
            @NonNull
            public com.google.common.util.concurrent.s<Boolean> a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator<e> it = d.this.f116915h.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().a(totalCaptureResult));
                }
                return j0.n.x(j0.n.k(arrayList), new r.a() { // from class: v.m1
                    @Override // r.a
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
                    }
                }, i0.c.b());
            }

            @Override // v.d1.e
            public boolean b() {
                Iterator<e> it = d.this.f116915h.iterator();
                while (it.hasNext()) {
                    if (it.next().b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // v.d1.e
            public void c() {
                Iterator<e> it = d.this.f116915h.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
            }
        }

        class b extends androidx.camera.core.impl.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.concurrent.futures.c.a f116918a;

            b(androidx.concurrent.futures.c.a aVar) {
                this.f116918a = aVar;
            }

            @Override // androidx.camera.core.impl.p
            public void a(int i11) {
                this.f116918a.f(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // androidx.camera.core.impl.p
            public void b(int i11, @NonNull androidx.camera.core.impl.z zVar) {
                this.f116918a.c(null);
            }

            @Override // androidx.camera.core.impl.p
            public void c(int i11, @NonNull androidx.camera.core.impl.r rVar) {
                this.f116918a.f(new ImageCaptureException(2, "Capture request failed with reason " + rVar.b(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f116906j = timeUnit.toNanos(1L);
            f116907k = timeUnit.toNanos(5L);
        }

        d(int i11, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull v vVar, boolean z11, @NonNull z.o oVar) {
            this.f116908a = i11;
            this.f116909b = executor;
            this.f116910c = scheduledExecutorService;
            this.f116911d = vVar;
            this.f116913f = z11;
            this.f116912e = oVar;
        }

        public static /* synthetic */ com.google.common.util.concurrent.s a(d dVar, int i11, TotalCaptureResult totalCaptureResult) {
            dVar.getClass();
            if (d1.e(i11, totalCaptureResult)) {
                dVar.l(f116907k);
            }
            return dVar.f116916i.a(totalCaptureResult);
        }

        public static /* synthetic */ com.google.common.util.concurrent.s d(d dVar, Boolean bool) {
            dVar.getClass();
            return Boolean.TRUE.equals(bool) ? d1.i(dVar.f116914g, dVar.f116910c, dVar.f116911d, new f.a() { // from class: v.l1
                @Override // v.d1.f.a
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return d1.d(totalCaptureResult, false);
                }
            }) : j0.n.p(null);
        }

        public static /* synthetic */ Object e(d dVar, androidx.camera.core.impl.v0.a aVar, androidx.concurrent.futures.c.a aVar2) {
            dVar.getClass();
            aVar.c(dVar.new b(aVar2));
            return "submitStillCapture";
        }

        private void g(@NonNull androidx.camera.core.impl.v0.a aVar) {
            u.a.C2464a c2464a = new u.a.C2464a();
            c2464a.f(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.e(c2464a.a());
        }

        private void h(@NonNull androidx.camera.core.impl.v0.a aVar, @NonNull androidx.camera.core.impl.v0 v0Var) {
            int i11;
            if (this.f116908a != 3 || this.f116913f) {
                i11 = (v0Var.k() == -1 || v0Var.k() == 5) ? 2 : -1;
            } else {
                i11 = 4;
            }
            if (i11 != -1) {
                aVar.v(i11);
            }
        }

        private void l(long j11) {
            this.f116914g = j11;
        }

        void f(@NonNull e eVar) {
            this.f116915h.add(eVar);
        }

        @NonNull
        com.google.common.util.concurrent.s<List<Void>> i(@NonNull final List<androidx.camera.core.impl.v0> list, final int i11) {
            j0.d dVarF = j0.d.a(k(i11)).f(new j0.a() { // from class: v.g1
                @Override // j0.a
                public final com.google.common.util.concurrent.s apply(Object obj) {
                    return this.f116998a.m(list, i11);
                }
            }, this.f116909b);
            dVarF.b(new Runnable() { // from class: v.h1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f117015a.j();
                }
            }, this.f116909b);
            return dVarF;
        }

        public void j() {
            this.f116916i.c();
        }

        @NonNull
        public com.google.common.util.concurrent.s<TotalCaptureResult> k(final int i11) {
            com.google.common.util.concurrent.s<TotalCaptureResult> sVarP = j0.n.p(null);
            if (this.f116915h.isEmpty()) {
                return sVarP;
            }
            return j0.d.a(this.f116916i.b() ? d1.j(this.f116911d, null) : j0.n.p(null)).f(new j0.a() { // from class: v.j1
                @Override // j0.a
                public final com.google.common.util.concurrent.s apply(Object obj) {
                    return d1.d.a(this.f117053a, i11, (TotalCaptureResult) obj);
                }
            }, this.f116909b).f(new j0.a() { // from class: v.k1
                @Override // j0.a
                public final com.google.common.util.concurrent.s apply(Object obj) {
                    return d1.d.d(this.f117066a, (Boolean) obj);
                }
            }, this.f116909b);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        public com.google.common.util.concurrent.s<List<Void>> m(@NonNull List<androidx.camera.core.impl.v0> list, int i11) {
            androidx.camera.core.n nVarE;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (androidx.camera.core.impl.v0 v0Var : list) {
                final androidx.camera.core.impl.v0.a aVarK = androidx.camera.core.impl.v0.a.k(v0Var);
                androidx.camera.core.impl.z zVarA = (v0Var.k() != 5 || this.f116911d.V().g() || this.f116911d.V().b() || (nVarE = this.f116911d.V().e()) == null || !this.f116911d.V().f(nVarE)) ? null : androidx.camera.core.impl.a0.a(nVarE.z());
                if (zVarA != null) {
                    aVarK.p(zVarA);
                } else {
                    h(aVarK, v0Var);
                }
                if (this.f116912e.c(i11)) {
                    g(aVarK);
                }
                arrayList.add(androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.i1
                    @Override // androidx.concurrent.futures.c.InterfaceC0146c
                    public final Object a(androidx.concurrent.futures.c.a aVar) {
                        return d1.d.e(this.f117028a, aVarK, aVar);
                    }
                }));
                arrayList2.add(aVarK.h());
            }
            this.f116911d.j0(arrayList2);
            return j0.n.k(arrayList);
        }
    }

    interface e {
        @NonNull
        com.google.common.util.concurrent.s<Boolean> a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    static class f implements v.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.concurrent.futures.c.a<TotalCaptureResult> f116920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.common.util.concurrent.s<TotalCaptureResult> f116921b = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.n1
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return d1.f.b(this.f117126a, aVar);
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f116922c;

        interface a {
            boolean a(@NonNull TotalCaptureResult totalCaptureResult);
        }

        f(a aVar) {
            this.f116922c = aVar;
        }

        public static /* synthetic */ Object b(f fVar, androidx.concurrent.futures.c.a aVar) {
            fVar.f116920a = aVar;
            return "waitFor3AResult";
        }

        @Override // v.v.c
        public boolean a(@NonNull TotalCaptureResult totalCaptureResult) {
            a aVar = this.f116922c;
            if (aVar != null && !aVar.a(totalCaptureResult)) {
                return false;
            }
            this.f116920a.c(totalCaptureResult);
            return true;
        }

        @NonNull
        public com.google.common.util.concurrent.s<TotalCaptureResult> c() {
            return this.f116921b;
        }
    }

    static class g implements e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f116923f = TimeUnit.SECONDS.toNanos(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v f116924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f116925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ScheduledExecutorService f116926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c0.r0.i f116927d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final z.b0 f116928e;

        g(@NonNull v vVar, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull z.b0 b0Var) {
            this.f116924a = vVar;
            this.f116925b = executor;
            this.f116926c = scheduledExecutorService;
            this.f116928e = b0Var;
            c0.r0.i iVarL = vVar.L();
            Objects.requireNonNull(iVarL);
            this.f116927d = iVarL;
        }

        public static /* synthetic */ void d(g gVar, AtomicReference atomicReference, androidx.concurrent.futures.c.a aVar) {
            gVar.getClass();
            c0.y0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            gVar.f116927d.a(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3L), (c0.r0.j) atomicReference.get());
            aVar.c(null);
        }

        public static /* synthetic */ com.google.common.util.concurrent.s h(final g gVar, Void r11) {
            gVar.getClass();
            return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.o1
                @Override // androidx.concurrent.futures.c.InterfaceC0146c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return d1.g.l(this.f117142a, aVar);
                }
            });
        }

        public static /* synthetic */ Object j(final g gVar, final AtomicReference atomicReference, final androidx.concurrent.futures.c.a aVar) {
            gVar.getClass();
            i0.c.e().execute(new Runnable() { // from class: v.t1
                @Override // java.lang.Runnable
                public final void run() {
                    d1.g.d(this.f117276a, atomicReference, aVar);
                }
            });
            return "OnScreenFlashStart";
        }

        public static /* synthetic */ void k(androidx.concurrent.futures.c.a aVar) {
            c0.y0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
            aVar.c(null);
        }

        public static /* synthetic */ Object l(g gVar, androidx.concurrent.futures.c.a aVar) {
            if (!gVar.f116928e.a()) {
                aVar.c(null);
                return "EnableTorchInternal";
            }
            c0.y0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
            gVar.f116924a.D(true);
            aVar.c(null);
            return "EnableTorchInternal";
        }

        public static /* synthetic */ Object n(AtomicReference atomicReference, final androidx.concurrent.futures.c.a aVar) {
            atomicReference.set(new c0.r0.j() { // from class: v.v1
                @Override // c0.r0.j
                public final void a() {
                    d1.g.k(aVar);
                }
            });
            return "OnScreenFlashUiApplied";
        }

        public static /* synthetic */ com.google.common.util.concurrent.s p(g gVar, com.google.common.util.concurrent.s sVar, Object obj) {
            gVar.getClass();
            return j0.n.r(TimeUnit.SECONDS.toMillis(3L), gVar.f116926c, null, true, sVar);
        }

        @Override // v.d1.e
        @NonNull
        public com.google.common.util.concurrent.s<Boolean> a(TotalCaptureResult totalCaptureResult) {
            c0.y0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
            final AtomicReference atomicReference = new AtomicReference();
            final com.google.common.util.concurrent.s sVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.y1
                @Override // androidx.concurrent.futures.c.InterfaceC0146c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return d1.g.n(atomicReference, aVar);
                }
            });
            return j0.d.a(androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.z1
                @Override // androidx.concurrent.futures.c.InterfaceC0146c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return d1.g.j(this.f117420a, atomicReference, aVar);
                }
            })).f(new j0.a() { // from class: v.a2
                @Override // j0.a
                public final com.google.common.util.concurrent.s apply(Object obj) {
                    return this.f116817a.f116924a.H().y(true);
                }
            }, this.f116925b).f(new j0.a() { // from class: v.b2
                @Override // j0.a
                public final com.google.common.util.concurrent.s apply(Object obj) {
                    return d1.g.h(this.f116827a, (Void) obj);
                }
            }, this.f116925b).f(new j0.a() { // from class: v.p1
                @Override // j0.a
                public final com.google.common.util.concurrent.s apply(Object obj) {
                    return d1.g.p(this.f117155a, sVarA, obj);
                }
            }, this.f116925b).f(new j0.a() { // from class: v.q1
                @Override // j0.a
                public final com.google.common.util.concurrent.s apply(Object obj) {
                    return this.f117219a.f116924a.H().U();
                }
            }, this.f116925b).f(new j0.a() { // from class: v.r1
                @Override // j0.a
                public final com.google.common.util.concurrent.s apply(Object obj) {
                    d1.g gVar = this.f117249a;
                    return d1.i(d1.g.f116923f, gVar.f116926c, gVar.f116924a, new d1.f.a() { // from class: v.u1
                        @Override // v.d1.f.a
                        public final boolean a(TotalCaptureResult totalCaptureResult2) {
                            return d1.d(totalCaptureResult2, false);
                        }
                    });
                }
            }, this.f116925b).e(new r.a() { // from class: v.s1
                @Override // r.a
                public final Object apply(Object obj) {
                    return Boolean.FALSE;
                }
            }, i0.c.b());
        }

        @Override // v.d1.e
        public boolean b() {
            return false;
        }

        @Override // v.d1.e
        public void c() {
            c0.y0.a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
            if (this.f116928e.a()) {
                this.f116924a.D(false);
            }
            this.f116924a.H().y(false).b(new Runnable() { // from class: v.w1
                @Override // java.lang.Runnable
                public final void run() {
                    Log.d("Camera2CapturePipeline", "enableExternalFlashAeMode disabled");
                }
            }, this.f116925b);
            this.f116924a.H().q(false, true);
            ScheduledExecutorService scheduledExecutorServiceE = i0.c.e();
            final c0.r0.i iVar = this.f116927d;
            Objects.requireNonNull(iVar);
            scheduledExecutorServiceE.execute(new Runnable() { // from class: v.x1
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.clear();
                }
            });
        }
    }

    static class h implements e {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f116929g = TimeUnit.SECONDS.toNanos(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v f116930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f116931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f116932c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Executor f116933d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ScheduledExecutorService f116934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f116935f;

        h(@NonNull v vVar, int i11, @NonNull Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z11) {
            this.f116930a = vVar;
            this.f116931b = i11;
            this.f116933d = executor;
            this.f116934e = scheduledExecutorService;
            this.f116935f = z11;
        }

        public static /* synthetic */ com.google.common.util.concurrent.s d(h hVar, Void r11) {
            return hVar.f116935f ? hVar.f116930a.H().U() : j0.n.p(null);
        }

        public static /* synthetic */ Object e(h hVar, androidx.concurrent.futures.c.a aVar) {
            hVar.f116930a.S().e(aVar, true);
            return "TorchOn";
        }

        @Override // v.d1.e
        @NonNull
        public com.google.common.util.concurrent.s<Boolean> a(TotalCaptureResult totalCaptureResult) {
            c0.y0.a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + d1.e(this.f116931b, totalCaptureResult));
            if (d1.e(this.f116931b, totalCaptureResult)) {
                if (!this.f116930a.b0()) {
                    c0.y0.a("Camera2CapturePipeline", "Turn on torch");
                    this.f116932c = true;
                    return j0.d.a(androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.d2
                        @Override // androidx.concurrent.futures.c.InterfaceC0146c
                        public final Object a(androidx.concurrent.futures.c.a aVar) {
                            return d1.h.e(this.f116936a, aVar);
                        }
                    })).f(new j0.a() { // from class: v.e2
                        @Override // j0.a
                        public final com.google.common.util.concurrent.s apply(Object obj) {
                            return d1.h.d(this.f116947a, (Void) obj);
                        }
                    }, this.f116933d).f(new j0.a() { // from class: v.f2
                        @Override // j0.a
                        public final com.google.common.util.concurrent.s apply(Object obj) {
                            d1.h hVar = this.f116983a;
                            return d1.i(d1.h.f116929g, hVar.f116934e, hVar.f116930a, new d1.f.a() { // from class: v.c2
                                @Override // v.d1.f.a
                                public final boolean a(TotalCaptureResult totalCaptureResult2) {
                                    return d1.d(totalCaptureResult2, true);
                                }
                            });
                        }
                    }, this.f116933d).e(new r.a() { // from class: v.g2
                        @Override // r.a
                        public final Object apply(Object obj) {
                            return Boolean.FALSE;
                        }
                    }, i0.c.b());
                }
                c0.y0.a("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return j0.n.p(Boolean.FALSE);
        }

        @Override // v.d1.e
        public boolean b() {
            return this.f116931b == 0;
        }

        @Override // v.d1.e
        public void c() {
            if (this.f116932c) {
                this.f116930a.S().e(null, false);
                c0.y0.a("Camera2CapturePipeline", "Turning off torch");
                if (this.f116935f) {
                    this.f116930a.H().q(false, true);
                }
            }
        }
    }

    d1(@NonNull v vVar, @NonNull w.z zVar, @NonNull androidx.camera.core.impl.r2 r2Var, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.f116889a = vVar;
        Integer num = (Integer) zVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f116895g = num != null && num.intValue() == 2;
        this.f116893e = executor;
        this.f116894f = scheduledExecutorService;
        this.f116892d = r2Var;
        this.f116890b = new z.c0(r2Var);
        this.f116891c = z.g.a(new v0(zVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(TotalCaptureResult totalCaptureResult, boolean z11) {
        if (totalCaptureResult == null) {
            return false;
        }
        return androidx.camera.core.impl.a1.a(new v.h(totalCaptureResult), z11);
    }

    static boolean e(int i11, TotalCaptureResult totalCaptureResult) {
        c0.y0.a("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i11);
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return false;
                }
                if (i11 != 3) {
                    throw new AssertionError(i11);
                }
            }
            return true;
        }
        Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
        c0.y0.a("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
        return num != null && num.intValue() == 4;
    }

    private boolean f(int i11) {
        return this.f116890b.a() || this.f116896h == 3 || i11 == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static com.google.common.util.concurrent.s<TotalCaptureResult> i(long j11, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull v vVar, f.a aVar) {
        return j0.n.r(TimeUnit.NANOSECONDS.toMillis(j11), scheduledExecutorService, null, true, j(vVar, aVar));
    }

    @NonNull
    static com.google.common.util.concurrent.s<TotalCaptureResult> j(@NonNull final v vVar, f.a aVar) {
        final f fVar = new f(aVar);
        vVar.A(fVar);
        com.google.common.util.concurrent.s<TotalCaptureResult> sVarC = fVar.c();
        sVarC.b(new Runnable() { // from class: v.a1
            @Override // java.lang.Runnable
            public final void run() {
                vVar.c0(fVar);
            }
        }, vVar.f117319c);
        return sVarC;
    }

    d b(int i11, int i12, int i13) {
        int i14;
        z.o oVar = new z.o(this.f116892d);
        d dVar = new d(this.f116896h, this.f116893e, this.f116894f, this.f116889a, this.f116895g, oVar);
        if (i11 == 0) {
            dVar.f(new b(this.f116889a));
        }
        if (i12 != 3) {
            if (this.f116891c) {
                if (f(i13)) {
                    i14 = i12;
                    dVar.f(new h(this.f116889a, i14, this.f116893e, this.f116894f, (this.f116890b.a() || this.f116889a.Y()) ? false : true));
                } else {
                    i14 = i12;
                    dVar.f(new a(this.f116889a, i14, oVar));
                }
            }
            c0.y0.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i11 + ", flashMode = " + i14 + ", flashType = " + i13 + ", pipeline tasks = " + dVar.f116915h);
            return dVar;
        }
        dVar.f(new g(this.f116889a, this.f116893e, this.f116894f, new z.b0(this.f116892d)));
        i14 = i12;
        c0.y0.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i11 + ", flashMode = " + i14 + ", flashType = " + i13 + ", pipeline tasks = " + dVar.f116915h);
        return dVar;
    }

    @NonNull
    e0.l c(int i11, int i12, int i13) {
        return new c(b(i11, i12, i13), this.f116893e, i12);
    }

    public void g(int i11) {
        this.f116896h = i11;
    }

    @NonNull
    public com.google.common.util.concurrent.s<List<Void>> h(@NonNull List<androidx.camera.core.impl.v0> list, int i11, int i12, int i13) {
        return j0.n.s(b(i11, i12, i13).i(list, i12));
    }
}
