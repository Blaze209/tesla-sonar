package com.fourthline.orca.internal;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3581n1 implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f33759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3538m1 f33760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3069b1 f33761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3452k1 f33762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Y0 f33763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ND f33764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wn0.a f33765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final N2 f33766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3624o1 f33767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC3155d2 f33768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C2874Gc f33769k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Is f33770l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC4044xs f33771m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f33772n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Job f33773o;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.n1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[N2.a.values().length];
            try {
                iArr[N2.a.UnsupportedSepa.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N2.a.UnsupportedCountry.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N2.a.NoMatch.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.n1$b */
    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33774a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f33776c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Continuation continuation) {
            super(2, continuation);
            this.f33776c = str;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3581n1.this.new b(this.f33776c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f33774a;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    InterfaceC3624o1.b bVar = new InterfaceC3624o1.b((String) C3581n1.this.f33765g.invoke(), this.f33776c);
                    InterfaceC3624o1 interfaceC3624o1 = C3581n1.this.f33767i;
                    this.f33774a = 1;
                    objA = interfaceC3624o1.a(bVar, this);
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
                C3581n1 c3581n1 = C3581n1.this;
                Throwable thE = jn0.s.e(objA);
                if (thE == null) {
                    c3581n1.d().a(c3581n1.f33760b.d(false));
                    c3581n1.f33764f.a(new C3282g1(InterfaceC3924v1.c.f35985a));
                } else {
                    AbstractC3039aE.a(thE);
                    c3581n1.d().a(c3581n1.f33760b.d(false));
                }
                return jn0.h0.f84049a;
            } catch (CancellationException e11) {
                C3581n1.this.d().a(C3581n1.this.f33760b.d(false));
                throw e11;
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.n1$c */
    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33777a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f33779c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Continuation continuation) {
            super(2, continuation);
            this.f33779c = str;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3581n1.this.new c(this.f33779c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f33777a;
            if (i11 == 0) {
                jn0.t.b(obj);
                N2.c cVar = new N2.c((String) C3581n1.this.f33765g.invoke(), this.f33779c);
                N2 n11 = C3581n1.this.f33766h;
                this.f33777a = 1;
                objA = n11.a(cVar, this);
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
            C3581n1 c3581n1 = C3581n1.this;
            Throwable thE = jn0.s.e(objA);
            if (thE == null) {
                c3581n1.a(((N2.d) objA).a());
            } else {
                c3581n1.d().a(c3581n1.f33760b.a(new InterfaceC3409j1.b(AbstractC3039aE.a(thE))));
            }
            return jn0.h0.f84049a;
        }
    }

    public C3581n1(C3538m1 stateProvider, InterfaceC3069b1 resultRepository, InterfaceC3452k1 repository, Y0 analytics, ND viewNavigator, wn0.a workflowIdProvider, N2 validateIbanWorker, InterfaceC3624o1 confirmIbanWorker, InterfaceC3155d2 localValidator, C2874Gc effectHandler, Is presenter, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(validateIbanWorker, "validateIbanWorker");
        p013kotlin.jvm.internal.s.k(confirmIbanWorker, "confirmIbanWorker");
        p013kotlin.jvm.internal.s.k(localValidator, "localValidator");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f33759a = coroutineScope;
        this.f33760b = stateProvider;
        this.f33761c = resultRepository;
        this.f33762d = repository;
        this.f33763e = analytics;
        this.f33764f = viewNavigator;
        this.f33765g = workflowIdProvider;
        this.f33766h = validateIbanWorker;
        this.f33767i = confirmIbanWorker;
        this.f33768j = localValidator;
        this.f33769k = effectHandler;
        this.f33770l = presenter;
        this.f33771m = popupHandler;
        this.f33772n = ((C3368i1) presenter.a()).q().c();
    }

    private final void f() {
        this.f33763e.track(Y0.a.b.f29792a);
        if (this.f33772n == null) {
            this.f33772n = "";
        }
        this.f33770l.a(C3538m1.a(this.f33760b, false, 1, null));
        this.f33769k.a(new wn0.a() { // from class: com.fourthline.orca.internal.u71
            @Override // wn0.a
            public final Object invoke() {
                return C3581n1.g();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3154d1 g() {
        return InterfaceC3154d1.b.f31050a;
    }

    private final void h() {
        this.f33769k.a(new wn0.a() { // from class: com.fourthline.orca.internal.v71
            @Override // wn0.a
            public final Object invoke() {
                return C3581n1.i();
            }
        });
        this.f33770l.a(this.f33760b.s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3154d1 i() {
        return InterfaceC3154d1.a.f31049a;
    }

    private final void j() {
        this.f33771m.a(C3668p2.f34427a);
    }

    private final void k() {
        String str = this.f33772n;
        if (str != null) {
            this.f33763e.track(Y0.a.e.f29795a);
            InterfaceC3069b1 interfaceC3069b1 = this.f33761c;
            String str2 = this.f33772n;
            if (str2 == null) {
                throw new IllegalStateException("FL developer error! The account number must be filled in by user by this moment.");
            }
            interfaceC3069b1.a(new C3026a1(str2));
            a(str);
        }
    }

    private final void l() {
        String str = this.f33772n;
        if (str == null || str.length() == 0) {
            this.f33770l.a(new wn0.l() { // from class: com.fourthline.orca.internal.s71
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return C3581n1.a(this.f35214a, (C3368i1) obj);
                }
            });
        }
        this.f33763e.track(Y0.a.d.f29794a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3154d1 m() {
        return InterfaceC3154d1.a.f31049a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f33759a.getCoroutineContext();
    }

    private final void b() {
        Job job = this.f33773o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f33773o = null;
    }

    private final void e() {
        this.f33763e.track(Y0.a.c.f29793a);
        this.f33764f.a(C3196e1.f31284a);
        jn0.h0 h0Var = jn0.h0.f84049a;
        b();
    }

    public final C2874Gc c() {
        return this.f33769k;
    }

    public final Is d() {
        return this.f33770l;
    }

    private final void c(String str) {
        b();
        this.f33772n = str;
        InterfaceC3112c2 interfaceC3112c2A = this.f33768j.a(str);
        this.f33770l.a(this.f33760b.a(str, interfaceC3112c2A));
        if (interfaceC3112c2A instanceof InterfaceC3112c2.h) {
            this.f33769k.a(new wn0.a() { // from class: com.fourthline.orca.internal.w71
                @Override // wn0.a
                public final Object invoke() {
                    return C3581n1.m();
                }
            });
            b(str);
        }
    }

    private final void b(String str) {
        this.f33770l.a(this.f33760b.a(InterfaceC3409j1.c.f32647a));
        this.f33773o = BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(str, null), 3, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(InterfaceC3325h1 event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof InterfaceC3325h1.a) {
            e();
            return;
        }
        if (event instanceof InterfaceC3325h1.d) {
            k();
            return;
        }
        if (event instanceof InterfaceC3325h1.c) {
            j();
            return;
        }
        if (event instanceof InterfaceC3325h1.e) {
            l();
            return;
        }
        if (!(event instanceof InterfaceC3325h1.b)) {
            if (!(event instanceof InterfaceC3325h1.f)) {
                throw new NoWhenBranchMatchedException();
            }
            c(((InterfaceC3325h1.f) event).a());
        } else if (((InterfaceC3325h1.b) event).a()) {
            f();
        } else {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 f(C3581n1 c3581n1) {
        c3581n1.f33770l.a(c3581n1.f33760b.e(true));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(N2.BavValidateIbanResult bVar) {
        Bo bo2;
        this.f33770l.a(this.f33760b.a(new InterfaceC3409j1.a(bVar.getMatch())));
        N2.a aVarB = bVar.getError();
        int i11 = aVarB == null ? -1 : a.$EnumSwitchMapping$0[aVarB.ordinal()];
        if (i11 == 1) {
            bo2 = Z0.c.f29960a;
        } else if (i11 != 2) {
            bo2 = i11 != 3 ? null : Z0.a.f29958a;
        } else {
            bo2 = Z0.b.f29959a;
        }
        Bo bo3 = bo2;
        if (bo3 != null) {
            InterfaceC4044xs.a.a(this.f33771m, new Ds.c(bo3, null, null, 6, null), new wn0.a() { // from class: com.fourthline.orca.internal.t71
                @Override // wn0.a
                public final Object invoke() {
                    return C3581n1.f(this.f35580a);
                }
            }, null, 4, null);
        }
    }

    private final void a(String str) {
        this.f33770l.a(this.f33760b.d(true));
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3368i1 a(C3581n1 c3581n1, C3368i1 present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return c3581n1.f33760b.getInitialState();
    }
}
