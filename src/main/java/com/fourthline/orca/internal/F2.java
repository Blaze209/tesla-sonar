package com.fourthline.orca.internal;

import android.net.Uri;
import com.fourthline.orca.bav.internal.error.BavError;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class F2 implements InterfaceC3302gf, InterfaceC3800s6, CoroutineScope {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f25696m = new c(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f25697n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f25698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f25699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E2 f25700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final YD f25701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4044xs f25702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3700ps f25703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3625o2 f25704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ND f25705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ED f25706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final B2 f25707j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C2 f25708k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC3354ho f25709l;

    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.a {
        a(Object obj) {
            super(0, obj, F2.class, "checkStatus", "checkStatus()V", 0);
        }

        public final void a() {
            ((F2) this.receiver).b();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return jn0.h0.f84049a;
        }
    }

    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.a {
        b(Object obj) {
            super(0, obj, F2.class, "checkStatus", "checkStatus()V", 0);
        }

        public final void a() {
            ((F2) this.receiver).b();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return jn0.h0.f84049a;
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[O2.values().length];
            try {
                iArr[O2.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O2.PENDING_VERIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O2.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[O2.KYC_REQUIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[O2.NEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[O2.PENDING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[O2.COMPILING_MANDATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class e extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25710a;

        /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.a {
            a(Object obj) {
                super(0, obj, F2.class, "checkStatus", "checkStatus()V", 0);
            }

            public final void a() {
                ((F2) this.receiver).b();
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return jn0.h0.f84049a;
            }
        }

        e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return F2.this.new e(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f25710a;
            if (i11 == 0) {
                jn0.t.b(obj);
                InterfaceC3700ps.a aVar = new InterfaceC3700ps.a(F2.this.f25707j.a(), p013kotlin.collections.d1.i(O2.FAILED, O2.COMPLETED, O2.PENDING_VERIFICATION, O2.KYC_REQUIRED, O2.NEW, O2.PENDING));
                InterfaceC3700ps interfaceC3700ps = F2.this.f25703f;
                this.f25710a = 1;
                objA = interfaceC3700ps.a(aVar, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objA = ((jn0.s) obj).getValue();
            }
            F2 f11 = F2.this;
            Throwable thE = jn0.s.e(objA);
            if (thE == null) {
                f11.a((G2.b) objA);
            } else {
                f11.f25702e.a(new Ds.c(AbstractC3039aE.a(thE), "bav_status", new a(f11)));
            }
            return jn0.h0.f84049a;
        }
    }

    /* synthetic */ class g extends p013kotlin.jvm.internal.p implements wn0.a {
        g(Object obj) {
            super(0, obj, F2.class, "checkStatus", "checkStatus()V", 0);
        }

        public final void a() {
            ((F2) this.receiver).b();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return jn0.h0.f84049a;
        }
    }

    static final class h extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25717a;

        /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.a {
            a(Object obj) {
                super(0, obj, F2.class, "checkStatus", "checkStatus()V", 0);
            }

            public final void a() {
                ((F2) this.receiver).b();
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return jn0.h0.f84049a;
            }
        }

        h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return F2.this.new h(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f25717a;
            if (i11 == 0) {
                jn0.t.b(obj);
                InterfaceC3625o2 interfaceC3625o2 = F2.this.f25704g;
                InterfaceC3625o2.a aVar = new InterfaceC3625o2.a(F2.this.f25707j.a());
                this.f25717a = 1;
                objA = interfaceC3625o2.a(aVar, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objA = ((jn0.s) obj).getValue();
            }
            F2 f11 = F2.this;
            Throwable thE = jn0.s.e(objA);
            if (thE == null) {
                f11.a(((InterfaceC3625o2.b) objA).a());
            } else {
                f11.f25702e.a(new Ds.c(AbstractC3039aE.a(thE), "bav_status", new a(f11)));
            }
            return jn0.h0.f84049a;
        }
    }

    public F2(Is presenter, E2 stateProvider, YD webSdkLauncher, InterfaceC4044xs popupHandler, InterfaceC3700ps statusWorker, InterfaceC3625o2 redirectUrlWorker, ND viewNavigator, ED viewCompletionHandler, B2 repository, C2 resultRepository, InterfaceC3354ho analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(webSdkLauncher, "webSdkLauncher");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(statusWorker, "statusWorker");
        p013kotlin.jvm.internal.s.k(redirectUrlWorker, "redirectUrlWorker");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f25698a = coroutineScope;
        this.f25699b = presenter;
        this.f25700c = stateProvider;
        this.f25701d = webSdkLauncher;
        this.f25702e = popupHandler;
        this.f25703f = statusWorker;
        this.f25704g = redirectUrlWorker;
        this.f25705h = viewNavigator;
        this.f25706i = viewCompletionHandler;
        this.f25707j = repository;
        this.f25708k = resultRepository;
        this.f25709l = analytics;
        if (!Co.f25256a.a()) {
            webSdkLauncher.a(repository.getUrl(), new a(this));
        } else if (repository.b().getName() == H2.Online) {
            webSdkLauncher.a(repository.getUrl(), new b(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 h(F2 f11) {
        f11.h();
        return jn0.h0.f84049a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f25698a.getCoroutineContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new e(null), 3, null);
    }

    private final void e() {
        this.f25709l.track(C3925v2.a.c.f35991a);
        if (Co.f25256a.a() && this.f25707j.b().getName() == H2.Sepa) {
            b();
        }
    }

    private final void f() {
        this.f25709l.track(C3925v2.a.b.f35990a);
        this.f25705h.a(new C3969w2(BavError.Canceled.INSTANCE));
    }

    private final void g() {
        f();
    }

    private final void h() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new h(null), 3, null);
    }

    public final Is c() {
        return this.f25699b;
    }

    public final E2 d() {
        return this.f25700c;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(InterfaceC4055y2 event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof InterfaceC4055y2.a) {
            e();
        } else if (event instanceof InterfaceC4055y2.b) {
            f();
        } else {
            if (!(event instanceof InterfaceC4055y2.c)) {
                throw new NoWhenBranchMatchedException();
            }
            g();
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC3800s6
    public void a(Uri deepLink) {
        p013kotlin.jvm.internal.s.k(deepLink, "deepLink");
        String strA = AbstractC3843t6.a(deepLink, "bav_status");
        if (p013kotlin.text.t.h0(strA, "success", false, 2, null)) {
            a(C4098z2.f37188a);
        } else {
            if (!p013kotlin.text.t.h0(strA, "failure", false, 2, null)) {
                throw new IllegalStateException("FL Developer error. The Deep Link doesn't have the right keys!");
            }
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(G2.b bVar) {
        switch (d.$EnumSwitchMapping$0[bVar.a().getStatus().ordinal()]) {
            case 1:
            case 2:
                a(C4098z2.f37188a);
                return;
            case 3:
                this.f25705h.a(new C3969w2(BavError.Generic.INSTANCE));
                return;
            case 4:
                this.f25702e.a(new Ds.c(BavError.KycRequired.INSTANCE, "bav_status", null, 4, null));
                return;
            case 5:
                this.f25702e.a(new Ds.c(BavError.InvalidStatus.INSTANCE, "bav_status", null, 4, null));
                return;
            case 6:
                this.f25702e.a(new Ds.c(BavError.Generic.INSTANCE, "bav_status", new wn0.a() { // from class: com.fourthline.orca.internal.u20
                    @Override // wn0.a
                    public final Object invoke() {
                        return F2.h(this.f35796a);
                    }
                }));
                return;
            case 7:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    static final class f extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25712a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4098z2 f25714c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C4098z2 c4098z2, Continuation continuation) {
            super(2, continuation);
            this.f25714c = c4098z2;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return F2.this.new f(this.f25714c, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (((kotlinx.coroutines.flow.Flow) r6).collect(r1, r5) == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f25712a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r6)
                goto L46
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                jn0.t.b(r6)
                goto L32
            L1e:
                jn0.t.b(r6)
                com.fourthline.orca.internal.F2 r6 = com.fourthline.orca.internal.F2.this
                com.fourthline.orca.internal.ED r6 = com.fourthline.orca.internal.F2.f(r6)
                com.fourthline.orca.internal.z2 r1 = r5.f25714c
                r5.f25712a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L32
                goto L45
            L32:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.F2$f$a r1 = new com.fourthline.orca.internal.F2$f$a
                com.fourthline.orca.internal.F2 r3 = com.fourthline.orca.internal.F2.this
                com.fourthline.orca.internal.z2 r4 = r5.f25714c
                r1.<init>(r3, r4)
                r5.f25712a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.F2.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ F2 f25715a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4098z2 f25716b;

            a(F2 f11, C4098z2 c4098z2) {
                this.f25715a = f11;
                this.f25716b = c4098z2;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(FD fd2, Continuation continuation) {
                if (!(fd2 instanceof FD.d)) {
                    if (fd2 instanceof FD.c) {
                        this.f25715a.c().a(this.f25715a.d().d(true));
                    } else if (fd2 instanceof FD.a) {
                        this.f25715a.c().a(this.f25715a.d().d(false));
                        ND nd2 = this.f25715a.f25705h;
                        Of ofA = ((FD.a) fd2).a();
                        InterfaceC3924v1 interfaceC3924v1 = (InterfaceC3924v1) (!(ofA instanceof InterfaceC3924v1) ? null : ofA);
                        if (interfaceC3924v1 == null) {
                            throw new IllegalStateException((ofA.getClass().getSimpleName() + " are not accepted by this Coordinator.").toString());
                        }
                        nd2.a(new C4012x2(interfaceC3924v1));
                    } else {
                        if (!(fd2 instanceof FD.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f25715a.c().a(this.f25715a.d().d(false));
                        Bo boA = ((FD.b) fd2).a();
                        final F2 f11 = this.f25715a;
                        final C4098z2 c4098z2 = this.f25716b;
                        this.f25715a.f25702e.a(new Ds.c(boA, null, new wn0.a() { // from class: com.fourthline.orca.internal.v20
                            @Override // wn0.a
                            public final Object invoke() {
                                return F2.f.a.a(f11, c4098z2);
                            }
                        }, 2, null));
                    }
                }
                return jn0.h0.f84049a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jn0.h0 a(F2 f11, C4098z2 c4098z2) {
                f11.a(c4098z2);
                return jn0.h0.f84049a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C4098z2 c4098z2) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new f(c4098z2, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.f25708k.a(str);
        this.f25701d.a(this.f25707j.getUrl(), new g(this));
    }
}
