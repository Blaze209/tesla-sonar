package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class UC implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f28728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f28729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TC f28730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4044xs f28731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ND f28732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3354ho f28733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final RC f28734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Vf f28735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3645og f28736i;

    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.a {
        a(Object obj) {
            super(0, obj, UC.class, "retryUploads", "retryUploads()V", 0);
        }

        public final void a() {
            ((UC) this.receiver).h();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return jn0.h0.f84049a;
        }
    }

    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28737a;

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
            return UC.this.new b(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        
            if (r1.a(r5, r4) == r0) goto L17;
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
                int r1 = r4.f28737a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r5)
                goto L5a
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                jn0.t.b(r5)
                jn0.s r5 = (jn0.s) r5
                java.lang.Object r5 = r5.getValue()
                goto L3c
            L24:
                jn0.t.b(r5)
                com.fourthline.orca.internal.og$a r5 = new com.fourthline.orca.internal.og$a
                r1 = 0
                r5.<init>(r1, r3, r1)
                com.fourthline.orca.internal.UC r1 = com.fourthline.orca.internal.UC.this
                com.fourthline.orca.internal.og r1 = com.fourthline.orca.internal.UC.b(r1)
                r4.f28737a = r3
                java.lang.Object r5 = r1.a(r5, r4)
                if (r5 != r0) goto L3c
                goto L52
            L3c:
                com.fourthline.orca.internal.UC r1 = com.fourthline.orca.internal.UC.this
                java.lang.Throwable r3 = jn0.s.e(r5)
                if (r3 != 0) goto L53
                com.fourthline.orca.internal.og$b r5 = (com.fourthline.orca.internal.InterfaceC3645og.b) r5
                com.fourthline.orca.internal.og$c r5 = r5.a()
                r4.f28737a = r2
                java.lang.Object r5 = com.fourthline.orca.internal.UC.a(r1, r5, r4)
                if (r5 != r0) goto L5a
            L52:
                return r0
            L53:
                com.fourthline.orca.internal.ZD r5 = com.fourthline.orca.internal.AbstractC3039aE.a(r3)
                com.fourthline.orca.internal.UC.a(r1, r5)
            L5a:
                jn0.h0 r5 = jn0.h0.f84049a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.UC.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28739a;

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return UC.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f28739a;
            if (i11 == 0) {
                jn0.t.b(obj);
                C3304gh c3304ghA = UC.this.f28734g.a();
                UC uc2 = UC.this;
                this.f28739a = 1;
                if (uc2.a(c3304ghA, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }
    }

    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f28742b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f28744d;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f28742b = obj;
            this.f28744d |= Integer.MIN_VALUE;
            return UC.this.a((C3304gh) null, this);
        }
    }

    public UC(Is presenter, TC stateProvider, InterfaceC4044xs popupHandler, ND viewNavigator, InterfaceC3354ho analytics, RC requestsBuilder, Vf dataWorkManager, InterfaceC3645og whatsNextWorker, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(requestsBuilder, "requestsBuilder");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f28728a = coroutineScope;
        this.f28729b = presenter;
        this.f28730c = stateProvider;
        this.f28731d = popupHandler;
        this.f28732e = viewNavigator;
        this.f28733f = analytics;
        this.f28734g = requestsBuilder;
        this.f28735h = dataWorkManager;
        this.f28736i = whatsNextWorker;
    }

    private final void d() {
        this.f28733f.track(EC.a.c.f25581a);
        g();
    }

    private final void e() {
        c();
    }

    private final void f() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(null), 3, null);
    }

    private final void g() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        g();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f28728a.getCoroutineContext();
    }

    private final void c() {
        this.f28733f.track(EC.a.b.f25580a);
        this.f28732e.a(FC.a.f25793a);
    }

    public final Is b() {
        return this.f28729b;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(GC event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof GC.b) {
            d();
        } else if (event instanceof GC.a) {
            c();
        } else {
            if (!(event instanceof GC.c)) {
                throw new NoWhenBranchMatchedException();
            }
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(C3304gh c3304gh, Continuation continuation) {
        d dVar;
        Object objA;
        UC uc2;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f28744d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f28744d = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f28742b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f28744d;
        if (i12 == 0) {
            jn0.t.b(obj);
            Vf vf2 = this.f28735h;
            dVar.f28741a = this;
            dVar.f28744d = 1;
            objA = vf2.a(c3304gh, dVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            uc2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uc2 = (UC) dVar.f28741a;
            jn0.t.b(obj);
            objA = ((jn0.s) obj).getValue();
        }
        Throwable thE = jn0.s.e(objA);
        if (thE == null) {
            uc2.f();
        } else {
            uc2.a(AbstractC3039aE.a(thE));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(InterfaceC3645og.c cVar, Continuation continuation) {
        C3304gh c3304ghA;
        if ((cVar instanceof InterfaceC3645og.c.d) && (c3304ghA = this.f28734g.a(((InterfaceC3645og.c.d) cVar).c())) != null) {
            Object objA = a(c3304ghA, continuation);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
        }
        a(cVar.a());
        return jn0.h0.f84049a;
    }

    private final void a(Rf rf2) {
        this.f28732e.a(new FC.b(new JC(rf2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Bo bo2) {
        this.f28731d.a(new Ds.c(bo2, AnalyticsAttribute.NotAvailable, new a(this)));
    }
}
