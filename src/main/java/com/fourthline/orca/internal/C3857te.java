package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidAuthError;
import com.fourthline.core.eid.EidAuthEvent;
import com.fourthline.core.eid.EidAuthResult;
import java.util.Objects;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3857te implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f35649i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f35650j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f35651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f35652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2874Gc f35653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Kn f35654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ND f35655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3643oe f35656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3814se f35657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC4044xs f35658h;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.te$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.te$b */
    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35659a;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.te$b$a */
        /* synthetic */ class a implements FlowCollector, p013kotlin.jvm.internal.m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3857te f35661a;

            a(C3857te c3857te) {
                this.f35661a = c3857te;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC3814se.a aVar, Continuation continuation) {
                Object objB = b.b(this.f35661a, aVar, continuation);
                return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : jn0.h0.f84049a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof p013kotlin.jvm.internal.m)) {
                    return p013kotlin.jvm.internal.s.f(getFunctionDelegate(), ((p013kotlin.jvm.internal.m) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // p013kotlin.jvm.internal.m
            public final jn0.i getFunctionDelegate() {
                return new p013kotlin.jvm.internal.a(2, this.f35661a, C3857te.class, "onUseCaseEvent", "onUseCaseEvent(Lcom/fourthline/orca/kyc/internal/flow/eid/scanner/EidScannerUseCase$UseCaseEvent;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        b(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object b(C3857te c3857te, InterfaceC3814se.a aVar, Continuation continuation) {
            c3857te.a(aVar);
            return jn0.h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3857te.this.new b(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (((kotlinx.coroutines.flow.Flow) r5).collect(r3, r4) == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f35659a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r5)
                goto L42
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                jn0.t.b(r5)
                goto L30
            L1e:
                jn0.t.b(r5)
                com.fourthline.orca.internal.te r5 = com.fourthline.orca.internal.C3857te.this
                com.fourthline.orca.internal.se r5 = com.fourthline.orca.internal.C3857te.a(r5)
                r4.f35659a = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L30
                goto L41
            L30:
                kotlinx.coroutines.flow.Flow r5 = (kotlinx.coroutines.flow.Flow) r5
                com.fourthline.orca.internal.te r1 = com.fourthline.orca.internal.C3857te.this
                com.fourthline.orca.internal.te$b$a r3 = new com.fourthline.orca.internal.te$b$a
                r3.<init>(r1)
                r4.f35659a = r2
                java.lang.Object r5 = r5.collect(r3, r4)
                if (r5 != r0) goto L42
            L41:
                return r0
            L42:
                jn0.h0 r5 = jn0.h0.f84049a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3857te.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public C3857te(Is presenter, C2874Gc effectHandler, Kn stateProvider, ND viewNavigator, InterfaceC3643oe repository, InterfaceC3814se eidScannerUseCase, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(eidScannerUseCase, "eidScannerUseCase");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f35651a = coroutineScope;
        this.f35652b = presenter;
        this.f35653c = effectHandler;
        this.f35654d = stateProvider;
        this.f35655e = viewNavigator;
        this.f35656f = repository;
        this.f35657g = eidScannerUseCase;
        this.f35658h = popupHandler;
    }

    private final void b() {
        if (this.f35656f.b()) {
            k();
        } else {
            this.f35658h.a(C3600ne.a.C0588a.f33921a);
        }
    }

    private final void e() {
        j();
        b();
    }

    private final void f() {
        this.f35655e.a(InterfaceC3557me.a.f33557a);
    }

    private final void g() {
        j();
    }

    private final void h() {
        j();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final An i() {
        return An.e.f24980a;
    }

    private final void j() {
        this.f35652b.a(new wn0.l() { // from class: com.fourthline.orca.internal.ld1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3857te.c(this.f33295a, (En) obj);
            }
        });
    }

    private final void k() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f35651a.getCoroutineContext();
    }

    public final C2874Gc c() {
        return this.f35653c;
    }

    public final Is d() {
        return this.f35652b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final En c(C3857te c3857te, En present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return c3857te.f35654d.getInitialState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(C3857te c3857te) {
        c3857te.k();
        return jn0.h0.f84049a;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(Bn event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof Bn.a) {
            e();
            return;
        }
        if (event instanceof Bn.d) {
            h();
            return;
        }
        if (event instanceof Bn.c) {
            g();
        } else if (event instanceof Bn.b) {
            f();
        } else {
            if (event instanceof Bn.e) {
                this.f35655e.a(InterfaceC3557me.d.f33560a);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final En b(C3857te c3857te, En present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return c3857te.f35654d.s();
    }

    private final void a(EidAuthError eidAuthError) {
        Ds ds2;
        Objects.toString(eidAuthError);
        boolean z11 = eidAuthError instanceof EidAuthError.IncorrectPin;
        if (z11) {
            this.f35656f.a(EnumC2894Kc.RetryPin);
            InterfaceC3643oe interfaceC3643oe = this.f35656f;
            interfaceC3643oe.a(interfaceC3643oe.c());
        } else if (!(eidAuthError instanceof EidAuthError.CardBlockedCanNeeded) && !(eidAuthError instanceof EidAuthError.IncorrectCan)) {
            if (eidAuthError instanceof EidAuthError.CardBlockedPukNeeded) {
                this.f35656f.a(EnumC2894Kc.Pin);
            } else if (!(eidAuthError instanceof EidAuthError.CardConnectionLost) && !(eidAuthError instanceof EidAuthError.ResultError) && !(eidAuthError instanceof EidAuthError.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            this.f35656f.a(EnumC2894Kc.Can);
        }
        InterfaceC4044xs interfaceC4044xs = this.f35658h;
        if (eidAuthError instanceof EidAuthError.IncorrectCan) {
            ds2 = C3258fe.a.C0560a.f31734a;
        } else if (eidAuthError instanceof EidAuthError.CardBlockedCanNeeded) {
            ds2 = C3173de.a.C0551a.f31157a;
        } else if (z11) {
            ds2 = C3301ge.a.C0563a.f32006a;
        } else if (eidAuthError instanceof EidAuthError.CardBlockedPukNeeded) {
            ds2 = C3088be.a.C0543a.f30632a;
        } else if (eidAuthError instanceof EidAuthError.CardConnectionLost) {
            ds2 = C3130ce.a.C0548a.f30873a;
        } else {
            if (!(eidAuthError instanceof EidAuthError.ResultError) && !(eidAuthError instanceof EidAuthError.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            ds2 = C3215ee.a.C0552a.f31390a;
        }
        InterfaceC4044xs.a.a(interfaceC4044xs, ds2, eidAuthError instanceof EidAuthError.CardConnectionLost ? new wn0.a() { // from class: com.fourthline.orca.internal.qd1
            @Override // wn0.a
            public final Object invoke() {
                return C3857te.b(this.f34811a);
            }
        } : null, null, 4, null);
    }

    private final void a(EidAuthResult eidAuthResult) {
        Objects.toString(eidAuthResult);
        this.f35656f.a(EnumC2894Kc.Pin);
        this.f35653c.a(new wn0.a() { // from class: com.fourthline.orca.internal.od1
            @Override // wn0.a
            public final Object invoke() {
                return C3857te.i();
            }
        });
        this.f35656f.b(eidAuthResult.getUrl());
        this.f35652b.a(new wn0.l() { // from class: com.fourthline.orca.internal.pd1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3857te.b(this.f34509a, (En) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InterfaceC3814se.a aVar) {
        Objects.toString(aVar);
        if (aVar instanceof InterfaceC3814se.a.C0612a) {
            a(((InterfaceC3814se.a.C0612a) aVar).a());
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void a(final EidAuthEvent eidAuthEvent) {
        Objects.toString(eidAuthEvent);
        if (eidAuthEvent instanceof EidAuthEvent.CanGotReset) {
            this.f35656f.a(EnumC2894Kc.RetryPin);
            this.f35655e.a(InterfaceC3557me.e.f33561a);
            return;
        }
        if (eidAuthEvent instanceof EidAuthEvent.CardRequested) {
            this.f35652b.a(new wn0.l() { // from class: com.fourthline.orca.internal.md1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return C3857te.a(this.f33556a, (En) obj);
                }
            });
            return;
        }
        if (eidAuthEvent instanceof EidAuthEvent.Completed) {
            a(((EidAuthEvent.Completed) eidAuthEvent).getResult());
            return;
        }
        if (!(eidAuthEvent instanceof EidAuthEvent.CompletedWithoutResult)) {
            if (eidAuthEvent instanceof EidAuthEvent.Error) {
                a(((EidAuthEvent.Error) eidAuthEvent).getError());
                return;
            } else {
                if (!(eidAuthEvent instanceof EidAuthEvent.Progress)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f35652b.a(new wn0.l() { // from class: com.fourthline.orca.internal.nd1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return C3857te.a(eidAuthEvent, this, (En) obj);
                    }
                });
                return;
            }
        }
        throw new jn0.q(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final En a(C3857te c3857te, En present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return c3857te.f35654d.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final En a(EidAuthEvent eidAuthEvent, C3857te c3857te, En present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return c3857te.f35654d.d(bo0.n.n((int) (((EidAuthEvent.Progress) eidAuthEvent).getProgressPercent() / 10.0f), 0, 10));
    }
}
