package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3512lc implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f33273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f33274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ND f33275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ED f33276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3299gc f33277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3469kc f33278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3354ho f33279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC4044xs f33280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final G5 f33281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private X7 f33282j;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.lc$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33283a;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.lc$a$a, reason: collision with other inner class name */
        static final class C0577a extends SuspendLambda implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f33285a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f33286b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3512lc f33287c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0577a(C3512lc c3512lc, Continuation continuation) {
                super(2, continuation);
                this.f33287c = c3512lc;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(FD fd2, Continuation continuation) {
                return ((C0577a) create(fd2, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0577a c0577a = new C0577a(this.f33287c, continuation);
                c0577a.f33286b = obj;
                return c0577a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z11;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f33285a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                FD fd2 = (FD) this.f33286b;
                if (fd2 instanceof FD.a) {
                    ND nd2 = this.f33287c.f33275c;
                    Of ofA = ((FD.a) fd2).a();
                    InterfaceC3726qb interfaceC3726qb = (InterfaceC3726qb) (!(ofA instanceof InterfaceC3726qb) ? null : ofA);
                    if (interfaceC3726qb == null) {
                        throw new IllegalStateException((ofA.getClass().getSimpleName() + " are not accepted by this Coordinator.").toString());
                    }
                    nd2.a(new InterfaceC3020Zb.c(interfaceC3726qb));
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boxing.boxBoolean(z11);
            }
        }

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3512lc.this.new a(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.first((kotlinx.coroutines.flow.Flow) r6, r1, r5) == r0) goto L15;
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
                int r1 = r5.f33283a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r6)
                goto L45
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
                com.fourthline.orca.internal.lc r6 = com.fourthline.orca.internal.C3512lc.this
                com.fourthline.orca.internal.ED r6 = com.fourthline.orca.internal.C3512lc.a(r6)
                com.fourthline.orca.internal.cc r1 = com.fourthline.orca.internal.C3128cc.f30852a
                r5.f33283a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L32
                goto L44
            L32:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.lc$a$a r1 = new com.fourthline.orca.internal.lc$a$a
                com.fourthline.orca.internal.lc r3 = com.fourthline.orca.internal.C3512lc.this
                r4 = 0
                r1.<init>(r3, r4)
                r5.f33283a = r2
                java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.first(r6, r1, r5)
                if (r6 != r0) goto L45
            L44:
                return r0
            L45:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3512lc.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C3512lc(Is presenter, ND viewNavigator, ED viewCompletionHandler, InterfaceC3299gc repository, C3469kc stateProvider, InterfaceC3354ho analytics, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f33273a = coroutineScope;
        this.f33274b = presenter;
        this.f33275c = viewNavigator;
        this.f33276d = viewCompletionHandler;
        this.f33277e = repository;
        this.f33278f = stateProvider;
        this.f33279g = analytics;
        this.f33280h = popupHandler;
        this.f33281i = repository.a();
    }

    private final void c() {
        this.f33279g.track(C3010Xb.a.b.f29729a);
        this.f33275c.a(InterfaceC3020Zb.a.f30012a);
    }

    private final void d() {
        this.f33280h.a(C3086bc.f30614a);
    }

    private final void e() {
        X7 x11 = this.f33282j;
        if (x11 != null) {
            this.f33279g.track(new C3010Xb.a.f(x11.c()));
            this.f33277e.a(x11);
        }
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(null), 3, null);
    }

    private final void f() {
        this.f33279g.track(new C3010Xb.a.e(this.f33281i));
        this.f33274b.a(this.f33278f.b(this.f33277e.b(), this.f33281i.c()));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f33273a.getCoroutineContext();
    }

    public final Is b() {
        return this.f33274b;
    }

    private final void b(DocumentType documentType) {
        for (Object obj : this.f33277e.b()) {
            if (((X7) obj).c() == documentType) {
                this.f33282j = (X7) obj;
                this.f33274b.a(this.f33278f.a(documentType));
                this.f33279g.track(new C3010Xb.a.d(documentType));
            }
        }
        obj = null;
        this.f33282j = (X7) obj;
        this.f33274b.a(this.f33278f.a(documentType));
        this.f33279g.track(new C3010Xb.a.d(documentType));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(InterfaceC3043ac event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof InterfaceC3043ac.e) {
            f();
            return;
        }
        if (event instanceof InterfaceC3043ac.d) {
            a(((InterfaceC3043ac.d) event).a());
            return;
        }
        if (event instanceof InterfaceC3043ac.c) {
            e();
        } else if (event instanceof InterfaceC3043ac.a) {
            c();
        } else {
            if (!(event instanceof InterfaceC3043ac.b)) {
                throw new NoWhenBranchMatchedException();
            }
            d();
        }
    }

    private final void a(DocumentType documentType) {
        b(documentType);
    }
}
