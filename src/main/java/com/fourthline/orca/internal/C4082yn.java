package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4082yn implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f37056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f37057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2874Gc f37058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4039xn f37059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4044xs f37060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3909un f37061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ED f37062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3354ho f37063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ND f37064i;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.yn$b */
    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.a {
        b(Object obj) {
            super(0, obj, C4082yn.class, "onNextButtonClicked", "onNextButtonClicked()V", 0);
        }

        public final void a() {
            ((C4082yn) this.receiver).j();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return jn0.h0.f84049a;
        }
    }

    public C4082yn(Is presenter, C2874Gc effectHandler, C4039xn stateProvider, InterfaceC4044xs popupHandler, InterfaceC3909un repository, ED viewCompletionHandler, InterfaceC3354ho analytics, ND viewNavigator, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f37056a = coroutineScope;
        this.f37057b = presenter;
        this.f37058c = effectHandler;
        this.f37059d = stateProvider;
        this.f37060e = popupHandler;
        this.f37061f = repository;
        this.f37062g = viewCompletionHandler;
        this.f37063h = analytics;
        this.f37064i = viewNavigator;
    }

    private final void f() {
        m();
        this.f37064i.a(InterfaceC3566mn.a.b.f33620a);
    }

    private final void g() {
        G5 g5D = d();
        if (g5D != null) {
            this.f37063h.track(new C3523ln.a.b(b(), g5D));
        }
        this.f37064i.a(InterfaceC3566mn.a.C0583a.f33619a);
    }

    private final void h() {
        if (this.f37061f.b()) {
            this.f37064i.a(InterfaceC3566mn.a.b.f33620a);
        }
    }

    private final void i() {
        G5 g5D = d();
        if (g5D != null) {
            this.f37063h.track(new C3523ln.a.e(b(), g5D));
        }
        InterfaceC4044xs.a.a(this.f37060e, C3652on.f34330a, new b(this), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        G5 g5D = d();
        if (g5D != null) {
            this.f37063h.track(new C3523ln.a.f(b(), g5D));
        }
        if (this.f37061f.b()) {
            f();
        } else {
            this.f37060e.a(C3695pn.f34611a);
        }
    }

    private final void k() {
        G5 g5D = d();
        if (g5D != null) {
            this.f37063h.track(new C3523ln.a.c(b(), g5D));
        }
        n();
    }

    private final void l() {
        G5 g5D = d();
        if (g5D != null) {
            this.f37063h.track(new C3523ln.a.g(b(), g5D));
        }
        m();
        a(C3738qn.f34865a);
    }

    private final void m() {
        this.f37061f.c();
    }

    private final void n() {
        this.f37057b.a(new wn0.l() { // from class: com.fourthline.orca.internal.zi1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4082yn.a(this.f37292a, (C3780rn) obj);
            }
        });
    }

    public final Is e() {
        return this.f37057b;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f37056a.getCoroutineContext();
    }

    private final G5 d() {
        return this.f37061f.a();
    }

    public final C2874Gc c() {
        return this.f37058c;
    }

    private final DocumentType b() {
        return this.f37061f.d();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(InterfaceC3609nn event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof InterfaceC3609nn.a) {
            g();
            return;
        }
        if (event instanceof InterfaceC3609nn.e) {
            j();
            return;
        }
        if (event instanceof InterfaceC3609nn.g) {
            l();
            return;
        }
        if (event instanceof InterfaceC3609nn.b) {
            h();
            return;
        }
        if (event instanceof InterfaceC3609nn.f) {
            k();
        } else if (event instanceof InterfaceC3609nn.c) {
            n();
        } else {
            if (!(event instanceof InterfaceC3609nn.d)) {
                throw new NoWhenBranchMatchedException();
            }
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C3738qn c3738qn) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(c3738qn, null), 3, null);
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.yn$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37065a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3738qn f37067c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3738qn c3738qn, Continuation continuation) {
            super(2, continuation);
            this.f37067c = c3738qn;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C4082yn.this.new a(this.f37067c, continuation);
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
                int r1 = r5.f37065a
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
                com.fourthline.orca.internal.yn r6 = com.fourthline.orca.internal.C4082yn.this
                com.fourthline.orca.internal.ED r6 = com.fourthline.orca.internal.C4082yn.b(r6)
                com.fourthline.orca.internal.qn r1 = r5.f37067c
                r5.f37065a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L32
                goto L45
            L32:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.yn$a$a r1 = new com.fourthline.orca.internal.yn$a$a
                com.fourthline.orca.internal.yn r3 = com.fourthline.orca.internal.C4082yn.this
                com.fourthline.orca.internal.qn r4 = r5.f37067c
                r1.<init>(r3, r4)
                r5.f37065a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C4082yn.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.yn$a$a, reason: collision with other inner class name */
        static final class C0626a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4082yn f37068a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3738qn f37069b;

            C0626a(C4082yn c4082yn, C3738qn c3738qn) {
                this.f37068a = c4082yn;
                this.f37069b = c3738qn;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(FD fd2, Continuation continuation) {
                if (!(fd2 instanceof FD.d) && !(fd2 instanceof FD.c)) {
                    if (fd2 instanceof FD.a) {
                        ND nd2 = this.f37068a.f37064i;
                        Of ofA = ((FD.a) fd2).a();
                        Im im2 = (Im) (!(ofA instanceof Im) ? null : ofA);
                        if (im2 == null) {
                            throw new IllegalStateException((ofA.getClass().getSimpleName() + " are not accepted by this Coordinator.").toString());
                        }
                        nd2.a(new InterfaceC3566mn.a.c(im2));
                    } else {
                        if (!(fd2 instanceof FD.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Bo boA = ((FD.b) fd2).a();
                        final C4082yn c4082yn = this.f37068a;
                        final C3738qn c3738qn = this.f37069b;
                        this.f37068a.f37060e.a(new Ds.c(boA, null, new wn0.a() { // from class: com.fourthline.orca.internal.aj1
                            @Override // wn0.a
                            public final Object invoke() {
                                return C4082yn.a.C0626a.a(c4082yn, c3738qn);
                            }
                        }, 2, null));
                    }
                }
                return jn0.h0.f84049a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jn0.h0 a(C4082yn c4082yn, C3738qn c3738qn) {
                c4082yn.a(c3738qn);
                return jn0.h0.f84049a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3780rn a(C4082yn c4082yn, C3780rn present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return c4082yn.f37059d.getInitialState();
    }
}
