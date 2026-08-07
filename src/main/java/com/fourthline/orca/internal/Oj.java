package com.fourthline.orca.internal;

import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.core.location.LocationProviderError;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public class Oj implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f27166l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f27167m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f27168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f27169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2874Gc f27170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ND f27171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ED f27172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Nj f27173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC4044xs f27174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final LocationProvider f27175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Lj f27176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC3354ho f27177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Job f27178k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocationProvider.AuthorizationStatus.values().length];
            try {
                iArr[LocationProvider.AuthorizationStatus.NOT_DETERMINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocationProvider.AuthorizationStatus.AUTHORIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocationProvider.AuthorizationStatus.DENIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* synthetic */ class d extends p013kotlin.jvm.internal.p implements wn0.a {
        d(Object obj) {
            super(0, obj, Oj.class, "onTryAgainClicked", "onTryAgainClicked()V", 0);
        }

        public final void a() {
            ((Oj) this.receiver).n();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return jn0.h0.f84049a;
        }
    }

    /* synthetic */ class e extends p013kotlin.jvm.internal.p implements wn0.a {
        e(Object obj) {
            super(0, obj, Oj.class, "requestFullAccuracy", "requestFullAccuracy()V", 0);
        }

        public final void a() {
            ((Oj) this.receiver).o();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return jn0.h0.f84049a;
        }
    }

    /* synthetic */ class f extends p013kotlin.jvm.internal.p implements wn0.a {
        f(Object obj) {
            super(0, obj, Oj.class, "requestFullAccuracy", "requestFullAccuracy()V", 0);
        }

        public final void a() {
            ((Oj) this.receiver).o();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return jn0.h0.f84049a;
        }
    }

    /* synthetic */ class g extends p013kotlin.jvm.internal.p implements wn0.a {
        g(Object obj) {
            super(0, obj, Oj.class, "startTheLocationFlow", "startTheLocationFlow()V", 0);
        }

        public final void a() {
            ((Oj) this.receiver).u();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return jn0.h0.f84049a;
        }
    }

    /* synthetic */ class h extends p013kotlin.jvm.internal.p implements wn0.l {
        h(Object obj) {
            super(1, obj, Oj.class, "onRequestAuthorizationSuccess", "onRequestAuthorizationSuccess(Lcom/fourthline/core/location/LocationProvider$AuthorizationStatus;)V", 0);
        }

        public final void a(LocationProvider.AuthorizationStatus p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((Oj) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((LocationProvider.AuthorizationStatus) obj);
            return jn0.h0.f84049a;
        }
    }

    /* synthetic */ class i extends p013kotlin.jvm.internal.p implements wn0.l {
        i(Object obj) {
            super(1, obj, Oj.class, "onRequestAuthorizationFail", "onRequestAuthorizationFail(Lcom/fourthline/core/location/LocationProviderError;)V", 0);
        }

        public final void a(LocationProviderError p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((Oj) this.receiver).b(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((LocationProviderError) obj);
            return jn0.h0.f84049a;
        }
    }

    static final class j extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27184a;

        /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l {
            a(Object obj) {
                super(1, obj, Oj.class, "finishLocationFlow", "finishLocationFlow(Lcom/fourthline/core/location/Coordinate;)V", 0);
            }

            public final void a(Coordinate p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                ((Oj) this.receiver).a(p11);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Coordinate) obj);
                return jn0.h0.f84049a;
            }
        }

        /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l {
            b(Object obj) {
                super(1, obj, Oj.class, "onLocationRequestFail", "onLocationRequestFail(Lcom/fourthline/core/location/LocationProviderError;)V", 0);
            }

            public final void a(LocationProviderError p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                ((Oj) this.receiver).a(p11);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((LocationProviderError) obj);
                return jn0.h0.f84049a;
            }
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Oj.this.new j(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f27184a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            Oj.this.f27175h.requestLocation(new a(Oj.this), new b(Oj.this));
            return jn0.h0.f84049a;
        }
    }

    public Oj(Is presenter, C2874Gc effectHandler, ND viewNavigator, ED viewCompletionHandler, Nj stateProvider, InterfaceC4044xs popupHandler, LocationProvider locationProvider, Lj repository, InterfaceC3354ho analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(locationProvider, "locationProvider");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f27168a = coroutineScope;
        this.f27169b = presenter;
        this.f27170c = effectHandler;
        this.f27171d = viewNavigator;
        this.f27172e = viewCompletionHandler;
        this.f27173f = stateProvider;
        this.f27174g = popupHandler;
        this.f27175h = locationProvider;
        this.f27176i = repository;
        this.f27177j = analytics;
    }

    private final void h() {
        this.f27177j.track(Gj.a.b.f25979a);
        this.f27171d.a(Hj.a.C0493a.f26115a);
    }

    private final void i() {
        if (this.f27175h.getLocationServicesEnabled()) {
            t();
        }
    }

    private final void j() {
        if (this.f27175h.getAuthorizationStatus() == LocationProvider.AuthorizationStatus.AUTHORIZED) {
            if (this.f27175h.getAccuracyAuthorization() == LocationProvider.AccuracyAuthorization.FULL) {
                u();
            } else {
                r();
            }
        }
    }

    private final void k() {
        if (this.f27176i.getLocation() != null) {
            Coordinate location = this.f27176i.getLocation();
            p013kotlin.jvm.internal.s.h(location);
            a(location);
        } else if (this.f27175h.getAuthorizationStatus() == LocationProvider.AuthorizationStatus.NOT_DETERMINED) {
            InterfaceC4044xs.a.a(this.f27174g, Fj.c.f25830a, new e(this), null, 4, null);
        } else {
            s();
        }
    }

    private final void l() {
        c();
    }

    private final void m() {
        this.f27177j.track(Gj.a.c.f25980a);
        this.f27169b.a(new wn0.l() { // from class: com.fourthline.orca.internal.kk0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Oj.a(this.f33010a, (Kj) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        this.f27169b.a(new wn0.l() { // from class: com.fourthline.orca.internal.jk0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Oj.b(this.f32796a, (Kj) obj);
            }
        });
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f27175h.requestFullAccuracy(new wn0.l() { // from class: com.fourthline.orca.internal.lk0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Oj.a(this.f33340a, (LocationProvider.AccuracyAuthorization) obj);
            }
        }, new wn0.l() { // from class: com.fourthline.orca.internal.mk0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Oj.c(this.f33608a, (LocationProviderError) obj);
            }
        });
    }

    private final void p() {
        this.f27174g.a(Fj.e.f25834a);
    }

    private final void q() {
        this.f27174g.a(Fj.d.f25832a);
    }

    private final void r() {
        this.f27174g.a(Fj.f.f25836a, new f(this), new g(this));
    }

    private final void s() {
        if (this.f27175h.getLocationServicesEnabled()) {
            t();
        } else {
            p();
        }
    }

    private final void t() {
        LocationProvider locationProvider = this.f27175h;
        int i11 = b.$EnumSwitchMapping$0[locationProvider.getAuthorizationStatus().ordinal()];
        if (i11 == 1) {
            locationProvider.requestAuthorization(new h(this), new i(this));
        } else if (i11 == 2) {
            b();
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        this.f27169b.a(this.f27173f.o());
        c();
        this.f27178k = BuildersKt__Builders_commonKt.launch$default(this, null, null, new j(null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f27168a.getCoroutineContext();
    }

    public final ED f() {
        return this.f27172e;
    }

    public final ND g() {
        return this.f27171d;
    }

    private final void c() {
        this.f27175h.cancelLocationRequest();
        Job job = this.f27178k;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    public final C2874Gc d() {
        return this.f27170c;
    }

    public final Is e() {
        return this.f27169b;
    }

    private final void b() {
        if (this.f27175h.getAccuracyAuthorization() == LocationProvider.AccuracyAuthorization.FULL) {
            u();
        } else {
            r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(Oj oj2, LocationProviderError it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        oj2.s();
        return jn0.h0.f84049a;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(Ij event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof Ij.f) {
            m();
            return;
        }
        if (event instanceof Ij.e) {
            l();
            return;
        }
        if (event instanceof Ij.c) {
            j();
            return;
        }
        if (event instanceof Ij.b) {
            i();
        } else if (event instanceof Ij.d) {
            k();
        } else {
            if (!(event instanceof Ij.a)) {
                throw new NoWhenBranchMatchedException();
            }
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(LocationProviderError locationProviderError) {
        if (locationProviderError instanceof LocationProviderError.LocationPermissionsNotGranted) {
            q();
        } else if (locationProviderError instanceof LocationProviderError.LocationServicesNotEnabled) {
            p();
        } else if (!(locationProviderError instanceof LocationProviderError.AnotherRequestInProgress) && !(locationProviderError instanceof LocationProviderError.Unknown)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Kj b(Oj oj2, Kj present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return oj2.f27173f.getInitialState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Kj a(Oj oj2, Kj present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return oj2.f27173f.getInitialState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LocationProvider.AuthorizationStatus authorizationStatus) {
        int i11 = b.$EnumSwitchMapping$0[authorizationStatus.ordinal()];
        if (i11 == 1) {
            this.f27177j.track(Gj.a.d.f25981a);
            return;
        }
        if (i11 == 2) {
            this.f27177j.track(Gj.a.f.f25983a);
            b();
        } else {
            if (i11 == 3) {
                this.f27177j.track(Gj.a.e.f25982a);
                q();
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27179a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Coordinate f27181c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Coordinate coordinate, Continuation continuation) {
            super(2, continuation);
            this.f27181c = coordinate;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Oj.this.new c(this.f27181c, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        
            if (((kotlinx.coroutines.flow.Flow) r7).collect(r1, r6) == r0) goto L22;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f27179a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                jn0.t.b(r7)
                goto L67
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                jn0.t.b(r7)
                goto L53
            L21:
                jn0.t.b(r7)
                goto L33
            L25:
                jn0.t.b(r7)
                r6.f27179a = r4
                r4 = 2000(0x7d0, double:9.88E-321)
                java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r6)
                if (r7 != r0) goto L33
                goto L66
            L33:
                com.fourthline.orca.internal.Jj r7 = new com.fourthline.orca.internal.Jj
                com.fourthline.orca.internal.Oj r1 = com.fourthline.orca.internal.Oj.this
                com.fourthline.orca.internal.Lj r1 = com.fourthline.orca.internal.Oj.c(r1)
                com.fourthline.core.location.Coordinate r1 = r1.getLocation()
                if (r1 == 0) goto L6a
                r7.<init>(r1)
                com.fourthline.orca.internal.Oj r1 = com.fourthline.orca.internal.Oj.this
                com.fourthline.orca.internal.ED r1 = r1.f()
                r6.f27179a = r3
                java.lang.Object r7 = r1.a(r7, r6)
                if (r7 != r0) goto L53
                goto L66
            L53:
                kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
                com.fourthline.orca.internal.Oj$c$a r1 = new com.fourthline.orca.internal.Oj$c$a
                com.fourthline.orca.internal.Oj r3 = com.fourthline.orca.internal.Oj.this
                com.fourthline.core.location.Coordinate r4 = r6.f27181c
                r1.<init>(r3, r4)
                r6.f27179a = r2
                java.lang.Object r7 = r7.collect(r1, r6)
                if (r7 != r0) goto L67
            L66:
                return r0
            L67:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            L6a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "Location must be present at this moment"
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.Oj.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Oj f27182a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Coordinate f27183b;

            a(Oj oj2, Coordinate coordinate) {
                this.f27182a = oj2;
                this.f27183b = coordinate;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(FD fd2, Continuation continuation) {
                wn0.a aVar;
                if (!(fd2 instanceof FD.d)) {
                    if (fd2 instanceof FD.c) {
                        this.f27182a.e().a(this.f27182a.f27173f.d(true));
                    } else {
                        if (fd2 instanceof FD.a) {
                            this.f27182a.e().a(this.f27182a.f27173f.d(false));
                            ND ndG = this.f27182a.g();
                            Of ofA = ((FD.a) fd2).a();
                            InterfaceC3519lj interfaceC3519lj = (InterfaceC3519lj) (ofA instanceof InterfaceC3519lj ? ofA : null);
                            if (interfaceC3519lj == null) {
                                throw new IllegalStateException((ofA.getClass().getSimpleName() + " are not accepted by this Coordinator.").toString());
                            }
                            ndG.a(new Hj.a.b(interfaceC3519lj));
                        } else {
                            if (!(fd2 instanceof FD.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f27182a.e().a(this.f27182a.f27173f.d(false));
                            FD.b bVar = (FD.b) fd2;
                            Ds.c cVar = new Ds.c(bVar.a(), "location_scanner", null, 4, null);
                            InterfaceC4044xs interfaceC4044xs = this.f27182a.f27174g;
                            Bo boA = bVar.a();
                            if ((boA instanceof ZD.a) || (boA instanceof ZD.c)) {
                                final Oj oj2 = this.f27182a;
                                final Coordinate coordinate = this.f27183b;
                                aVar = new wn0.a() { // from class: com.fourthline.orca.internal.nk0
                                    @Override // wn0.a
                                    public final Object invoke() {
                                        return Oj.c.a.a(oj2, coordinate);
                                    }
                                };
                            } else {
                                aVar = null;
                            }
                            InterfaceC4044xs.a.a(interfaceC4044xs, cVar, aVar, null, 4, null);
                        }
                    }
                }
                return jn0.h0.f84049a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jn0.h0 a(Oj oj2, Coordinate coordinate) {
                oj2.a(coordinate);
                return jn0.h0.f84049a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LocationProviderError locationProviderError) {
        Objects.toString(locationProviderError);
        InterfaceC4044xs.a.a(this.f27174g, Fj.b.f25828a, new d(this), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Coordinate coordinate) {
        this.f27177j.track(Gj.a.g.f25984a);
        this.f27176i.a(coordinate);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(coordinate, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Oj oj2, LocationProvider.AccuracyAuthorization it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        oj2.s();
        return jn0.h0.f84049a;
    }
}
