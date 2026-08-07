package com.fourthline.orca.internal;

import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsInterface;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class OE implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f27144k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f27145l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f27146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f27147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NE f27148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4044xs f27149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ND f27150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final KE f27151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3552mF f27152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3955vp f27153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final QE f27154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC3354ho f27155j;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27156a;

        /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.a {
            a(Object obj) {
                super(0, obj, OE.class, "getSession", "getSession()V", 0);
            }

            public final void a() {
                ((OE) this.receiver).b();
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return jn0.h0.f84049a;
            }
        }

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return OE.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f27156a;
            if (i11 == 0) {
                jn0.t.b(obj);
                QE qe2 = OE.this.f27154i;
                KE ke2 = OE.this.f27151f;
                QE.a aVar = new QE.a(ke2.a(), ke2.b());
                this.f27156a = 1;
                objA = qe2.a(aVar, this);
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
            OE oe2 = OE.this;
            Throwable thE = jn0.s.e(objA);
            if (thE == null) {
                QE.b bVar = (QE.b) objA;
                if (bVar instanceof QE.b.C0514b) {
                    oe2.a(((QE.b.C0514b) bVar).a());
                } else {
                    if (!(bVar instanceof QE.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oe2.f27149d.a(new Ds.c(((QE.b.a) bVar).a(), "workflow_start_session", null, 4, null));
                }
            } else {
                oe2.f27149d.a(new Ds.c(AbstractC3039aE.a(thE), "workflow_start_session", new a(oe2)));
            }
            return jn0.h0.f84049a;
        }
    }

    public OE(Is presenter, NE stateProvider, InterfaceC4044xs popupHandler, ND viewNavigator, KE repository, InterfaceC3552mF sessionRepository, InterfaceC3955vp themeRepository, QE workflowMobileSessionWorker, InterfaceC3354ho analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(sessionRepository, "sessionRepository");
        p013kotlin.jvm.internal.s.k(themeRepository, "themeRepository");
        p013kotlin.jvm.internal.s.k(workflowMobileSessionWorker, "workflowMobileSessionWorker");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f27146a = coroutineScope;
        this.f27147b = presenter;
        this.f27148c = stateProvider;
        this.f27149d = popupHandler;
        this.f27150e = viewNavigator;
        this.f27151f = repository;
        this.f27152g = sessionRepository;
        this.f27153h = themeRepository;
        this.f27154i = workflowMobileSessionWorker;
        this.f27155j = analytics;
    }

    private final void e() {
        d();
    }

    private final void f() {
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.setTenant(null, null);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f27146a.getCoroutineContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        f();
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(null), 3, null);
    }

    private final void c() {
        this.f27155j.track(EE.a.c.f25584a);
        b();
    }

    private final void d() {
        this.f27155j.track(EE.a.b.f25583a);
        this.f27150e.a(new FE(AbstractC3594nE.a.f33881c));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(HE event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof HE.a) {
            c();
        } else {
            if (!(event instanceof HE.b)) {
                throw new NoWhenBranchMatchedException();
            }
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(PE pe2) {
        this.f27155j.track(new EE.a.d(pe2));
        this.f27152g.a(pe2);
        WorkflowConfigurationTenantSettings tenant = pe2.e().getTenant();
        if (tenant.getRemoteAssets().getEnabled() || tenant.getBackButtonOnTop().getEnabled()) {
            this.f27153h.a(tenant.getRemoteAssets().getEnabled(), tenant.getBackButtonOnTop().getEnabled());
        }
        this.f27150e.a(new GE(new C3637oE(pe2.a())));
    }
}
