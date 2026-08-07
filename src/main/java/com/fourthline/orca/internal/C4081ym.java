package com.fourthline.orca.internal;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4081ym implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f37043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f37044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4038xm f37045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Q3 f37046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ND f37047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ED f37048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3354ho f37049g;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ym$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37050a;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ym$a$a, reason: collision with other inner class name */
        static final class C0625a extends SuspendLambda implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f37052a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f37053b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ C4081ym f37054c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0625a(C4081ym c4081ym, Continuation continuation) {
                super(2, continuation);
                this.f37054c = c4081ym;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(FD fd2, Continuation continuation) {
                return ((C0625a) create(fd2, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0625a c0625a = new C0625a(this.f37054c, continuation);
                c0625a.f37053b = obj;
                return c0625a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z11;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f37052a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                FD fd2 = (FD) this.f37053b;
                if (fd2 instanceof FD.a) {
                    ND nd2 = this.f37054c.f37047e;
                    Of ofA = ((FD.a) fd2).a();
                    Sl sl2 = (Sl) (!(ofA instanceof Sl) ? null : ofA);
                    if (sl2 == null) {
                        throw new IllegalStateException((ofA.getClass().getSimpleName() + " are not accepted by this Coordinator.").toString());
                    }
                    nd2.a(new InterfaceC3779rm.c(sl2));
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
            return C4081ym.this.new a(continuation);
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
                int r1 = r5.f37050a
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
                com.fourthline.orca.internal.ym r6 = com.fourthline.orca.internal.C4081ym.this
                com.fourthline.orca.internal.ED r6 = com.fourthline.orca.internal.C4081ym.a(r6)
                com.fourthline.orca.internal.um r1 = com.fourthline.orca.internal.C3908um.f35929a
                r5.f37050a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L32
                goto L44
            L32:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.ym$a$a r1 = new com.fourthline.orca.internal.ym$a$a
                com.fourthline.orca.internal.ym r3 = com.fourthline.orca.internal.C4081ym.this
                r4 = 0
                r1.<init>(r3, r4)
                r5.f37050a = r2
                java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.first(r6, r1, r5)
                if (r6 != r0) goto L45
            L44:
                return r0
            L45:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C4081ym.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C4081ym(Is presenter, C4038xm stateProvider, Q3 resultRepository, ND viewNavigator, ED viewCompletionHandler, InterfaceC3354ho analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f37043a = coroutineScope;
        this.f37044b = presenter;
        this.f37045c = stateProvider;
        this.f37046d = resultRepository;
        this.f37047e = viewNavigator;
        this.f37048f = viewCompletionHandler;
        this.f37049g = analytics;
    }

    private final void c() {
        this.f37049g.track(C3737qm.a.b.f34860a);
        this.f37047e.a(InterfaceC3779rm.a.f35108a);
    }

    private final void d() {
        this.f37049g.track(C3737qm.a.e.f34863a);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(null), 3, null);
    }

    private final void e() {
        this.f37049g.track(C3737qm.a.f.f34864a);
        this.f37047e.a(InterfaceC3779rm.b.f35109a);
    }

    private final void f() {
        this.f37049g.track(C3737qm.a.d.f34862a);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f37043a.getCoroutineContext();
    }

    public final Is b() {
        return this.f37044b;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(InterfaceC3822sm event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof InterfaceC3822sm.e) {
            f();
            return;
        }
        if (event instanceof InterfaceC3822sm.d) {
            e();
            return;
        }
        if (event instanceof InterfaceC3822sm.a) {
            c();
            return;
        }
        if (event instanceof InterfaceC3822sm.b) {
            a((InterfaceC3822sm.b) event);
        } else if (event instanceof InterfaceC3822sm.f) {
            a((InterfaceC3822sm.f) event);
        } else {
            if (!(event instanceof InterfaceC3822sm.c)) {
                throw new NoWhenBranchMatchedException();
            }
            d();
        }
    }

    private final void a(InterfaceC3822sm.f fVar) {
        this.f37049g.track(C3737qm.a.c.f34861a);
        this.f37046d.a(fVar.a());
        this.f37044b.a(this.f37045c.a(fVar.a()));
    }

    private final void a(InterfaceC3822sm.b bVar) {
        this.f37044b.a(this.f37045c.a(bVar.b(), bVar.a()));
    }
}
