package com.fourthline.orca.internal;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class W9 implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f29463l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f29464m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f29465n = "personal_details_nationality";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f29466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f29467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2874Gc f29468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V9 f29469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Gi f29470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ND f29471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ED f29472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3869tq f29473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3956vq f29474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC3354ho f29475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC4044xs f29476k;

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
            int[] iArr = new int[Q9.values().length];
            try {
                iArr[Q9.Birthplace.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public W9(Is presenter, C2874Gc effectHandler, V9 stateProvider, Gi nationalityViewStateManager, ND viewNavigator, ED viewCompletionHandler, InterfaceC3869tq repository, InterfaceC3956vq resultRepository, InterfaceC3354ho analytics, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(nationalityViewStateManager, "nationalityViewStateManager");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f29466a = coroutineScope;
        this.f29467b = presenter;
        this.f29468c = effectHandler;
        this.f29469d = stateProvider;
        this.f29470e = nationalityViewStateManager;
        this.f29471f = viewNavigator;
        this.f29472g = viewCompletionHandler;
        this.f29473h = repository;
        this.f29474i = resultRepository;
        this.f29475j = analytics;
        this.f29476k = popupHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O9 e() {
        return O9.b.f27129a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O9 f() {
        return O9.d.f27133a;
    }

    private final void g() {
        this.f29475j.track(M9.a.b.f26902a);
        this.f29471f.a(O9.c.a.f27130a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O9 h() {
        return O9.b.f27129a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O9 i() {
        return O9.a.f27128a;
    }

    private final void j() {
        G5 g5D = this.f29473h.d();
        if (g5D != null) {
            this.f29475j.track(new M9.a.e(g5D));
        }
        a(R9.f27608a);
    }

    private final void k() {
        this.f29475j.track(M9.a.d.f26904a);
        Uh uhB = this.f29470e.b();
        Uh.a aVar = uhB instanceof Uh.a ? (Uh.a) uhB : null;
        if (aVar != null) {
            a(aVar.a());
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f29466a.getCoroutineContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O9 d() {
        return O9.d.f27133a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 e(W9 w11) {
        w11.f29470e.a(true);
        w11.f29467b.a(w11.f29469d.s());
        w11.f29468c.a(new wn0.a() { // from class: com.fourthline.orca.internal.rt0
            @Override // wn0.a
            public final Object invoke() {
                return W9.f();
            }
        });
        return jn0.h0.f84049a;
    }

    public final C2874Gc b() {
        return this.f29468c;
    }

    public final Is c() {
        return this.f29467b;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(P9 event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof P9.i) {
            k();
            return;
        }
        if (event instanceof P9.d) {
            P9.d dVar = (P9.d) event;
            InterfaceC3447jx interfaceC3447jxA = this.f29470e.a(dVar.a());
            if (interfaceC3447jxA != null) {
                a(interfaceC3447jxA);
            } else {
                this.f29470e.b(dVar.a());
                this.f29467b.a(this.f29469d.s());
            }
            this.f29467b.a(this.f29469d.s());
            return;
        }
        if (event instanceof P9.e) {
            this.f29470e.a(true);
            this.f29467b.a(this.f29469d.s());
            this.f29468c.a(new wn0.a() { // from class: com.fourthline.orca.internal.st0
                @Override // wn0.a
                public final Object invoke() {
                    return W9.d();
                }
            });
            return;
        }
        if (!(event instanceof P9.f) && !p013kotlin.jvm.internal.s.f(event, P9.b.f27291a)) {
            if (event instanceof P9.g) {
                a(((P9.g) event).a());
                return;
            }
            if (event instanceof P9.c) {
                a((P9.c) event);
                return;
            }
            if (event instanceof P9.j) {
                a((P9.j) event);
                return;
            } else if (event instanceof P9.h) {
                j();
                return;
            } else {
                if (!(event instanceof P9.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                g();
                return;
            }
        }
        this.f29470e.a(false);
        this.f29467b.a(this.f29469d.s());
        this.f29468c.a(new wn0.a() { // from class: com.fourthline.orca.internal.tt0
            @Override // wn0.a
            public final Object invoke() {
                return W9.e();
            }
        });
    }

    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29477a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ R9 f29479c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(R9 r11, Continuation continuation) {
            super(2, continuation);
            this.f29479c = r11;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return W9.this.new c(this.f29479c, continuation);
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
                int r1 = r5.f29477a
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
                com.fourthline.orca.internal.W9 r6 = com.fourthline.orca.internal.W9.this
                com.fourthline.orca.internal.ED r6 = com.fourthline.orca.internal.W9.c(r6)
                com.fourthline.orca.internal.R9 r1 = r5.f29479c
                r5.f29477a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L32
                goto L45
            L32:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.W9$c$a r1 = new com.fourthline.orca.internal.W9$c$a
                com.fourthline.orca.internal.W9 r3 = com.fourthline.orca.internal.W9.this
                com.fourthline.orca.internal.R9 r4 = r5.f29479c
                r1.<init>(r3, r4)
                r5.f29477a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.W9.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ W9 f29480a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ R9 f29481b;

            a(W9 w11, R9 r11) {
                this.f29480a = w11;
                this.f29481b = r11;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(FD fd2, Continuation continuation) {
                if (!(fd2 instanceof FD.d)) {
                    if (fd2 instanceof FD.c) {
                        this.f29480a.c().a(this.f29480a.f29469d.d(true));
                    } else if (fd2 instanceof FD.a) {
                        this.f29480a.c().a(this.f29480a.f29469d.d(false));
                        ND nd2 = this.f29480a.f29471f;
                        Of ofA = ((FD.a) fd2).a();
                        Pp pp2 = (Pp) (!(ofA instanceof Pp) ? null : ofA);
                        if (pp2 == null) {
                            throw new IllegalStateException((ofA.getClass().getSimpleName() + " are not accepted by this Coordinator.").toString());
                        }
                        nd2.a(new O9.c.C0508c(pp2));
                    } else {
                        if (!(fd2 instanceof FD.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f29480a.c().a(this.f29480a.f29469d.d(false));
                        Bo boA = ((FD.b) fd2).a();
                        final W9 w11 = this.f29480a;
                        final R9 r11 = this.f29481b;
                        this.f29480a.f29476k.a(new Ds.c(boA, null, new wn0.a() { // from class: com.fourthline.orca.internal.xt0
                            @Override // wn0.a
                            public final Object invoke() {
                                return W9.c.a.a(w11, r11);
                            }
                        }, 2, null));
                    }
                }
                return jn0.h0.f84049a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jn0.h0 a(W9 w11, R9 r11) {
                w11.a(r11);
                return jn0.h0.f84049a;
            }
        }
    }

    private final void a(InterfaceC3447jx interfaceC3447jx) {
        this.f29470e.a(interfaceC3447jx);
        this.f29467b.a(this.f29469d.s());
        this.f29468c.a(new wn0.a() { // from class: com.fourthline.orca.internal.ut0
            @Override // wn0.a
            public final Object invoke() {
                return W9.h();
            }
        });
        this.f29468c.a(new wn0.a() { // from class: com.fourthline.orca.internal.vt0
            @Override // wn0.a
            public final Object invoke() {
                return W9.i();
            }
        });
        Uh uhB = this.f29470e.b();
        Uh.a aVar = uhB instanceof Uh.a ? (Uh.a) uhB : null;
        if (aVar != null) {
            a(aVar.a());
        } else if (interfaceC3447jx instanceof C4042xq) {
            this.f29475j.track(new M9.a.c(((C4042xq) interfaceC3447jx).b()));
        }
    }

    private final void a(Th th2) {
        Ds.c cVar;
        if (th2 instanceof Th.b.C0521b) {
            Th.b.C0521b c0521b = (Th.b.C0521b) th2;
            this.f29475j.track(new M9.a.f(c0521b.a()));
            cVar = new Ds.c(c0521b.b(), null, null, 6, null);
        } else if (th2 instanceof Th.b.a) {
            Th.b.a aVar = (Th.b.a) th2;
            this.f29475j.track(new M9.a.f(aVar.a()));
            cVar = new Ds.c(aVar.b(), null, null, 6, null);
        } else {
            cVar = null;
        }
        Ds.c cVar2 = cVar;
        if (cVar2 != null) {
            InterfaceC4044xs.a.a(this.f29476k, cVar2, new wn0.a() { // from class: com.fourthline.orca.internal.wt0
                @Override // wn0.a
                public final Object invoke() {
                    return W9.e(this.f36597a);
                }
            }, null, 4, null);
        }
    }

    private final void a(P9.j jVar) {
        if (b.$EnumSwitchMapping$0[jVar.a().ordinal()] == 1) {
            this.f29474i.b(jVar.b());
            this.f29467b.a(this.f29469d.a(jVar.b()));
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void a(P9.c cVar) {
        this.f29467b.a(this.f29469d.a(cVar.b(), cVar.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(R9 r11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(r11, null), 3, null);
    }
}
