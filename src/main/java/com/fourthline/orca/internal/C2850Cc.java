package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import java.util.Iterator;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Cc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2850Cc implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f25201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f25202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ND f25203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ED f25204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2844Bc f25205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC4071yc f25206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3354ho f25207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C3684pc f25208h;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Cc$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25209a;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Cc$a$a, reason: collision with other inner class name */
        static final class C0477a extends SuspendLambda implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f25211a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f25212b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ C2850Cc f25213c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0477a(C2850Cc c2850Cc, Continuation continuation) {
                super(2, continuation);
                this.f25213c = c2850Cc;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(FD fd2, Continuation continuation) {
                return ((C0477a) create(fd2, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0477a c0477a = new C0477a(this.f25213c, continuation);
                c0477a.f25212b = obj;
                return c0477a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z11;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f25211a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                FD fd2 = (FD) this.f25212b;
                if (fd2 instanceof FD.a) {
                    ND nd2 = this.f25213c.f25203c;
                    Of ofA = ((FD.a) fd2).a();
                    InterfaceC3726qb interfaceC3726qb = (InterfaceC3726qb) (!(ofA instanceof InterfaceC3726qb) ? null : ofA);
                    if (interfaceC3726qb == null) {
                        throw new IllegalStateException((ofA.getClass().getSimpleName() + " are not accepted by this Coordinator.").toString());
                    }
                    nd2.a(new InterfaceC3769rc.b(interfaceC3726qb));
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
            return C2850Cc.this.new a(continuation);
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
                int r1 = r5.f25209a
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
                com.fourthline.orca.internal.Cc r6 = com.fourthline.orca.internal.C2850Cc.this
                com.fourthline.orca.internal.ED r6 = com.fourthline.orca.internal.C2850Cc.a(r6)
                com.fourthline.orca.internal.tc r1 = com.fourthline.orca.internal.C3855tc.f35640a
                r5.f25209a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L32
                goto L44
            L32:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.Cc$a$a r1 = new com.fourthline.orca.internal.Cc$a$a
                com.fourthline.orca.internal.Cc r3 = com.fourthline.orca.internal.C2850Cc.this
                r4 = 0
                r1.<init>(r3, r4)
                r5.f25209a = r2
                java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.first(r6, r1, r5)
                if (r6 != r0) goto L45
            L44:
                return r0
            L45:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C2850Cc.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C2850Cc(Is presenter, ND viewNavigator, ED viewCompletionHandler, C2844Bc stateProvider, InterfaceC4071yc repository, InterfaceC3354ho analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f25201a = coroutineScope;
        this.f25202b = presenter;
        this.f25203c = viewNavigator;
        this.f25204d = viewCompletionHandler;
        this.f25205e = stateProvider;
        this.f25206f = repository;
        this.f25207g = analytics;
    }

    private final void c() {
        this.f25207g.track(C3727qc.a.b.f34799a);
        this.f25203c.a(InterfaceC3769rc.a.f35041a);
    }

    private final void d() {
        this.f25207g.track(C3727qc.a.d.f34801a);
        InterfaceC4071yc interfaceC4071yc = this.f25206f;
        C3684pc c3684pc = this.f25208h;
        if (c3684pc != null) {
            interfaceC4071yc.a(c3684pc.b());
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(null), 3, null);
            return;
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + c3684pc + " must not be null."))).toString());
    }

    private final void e() {
        this.f25207g.track(C3727qc.a.c.f34800a);
        this.f25208h = null;
        this.f25202b.a(this.f25205e.b(null));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f25201a.getCoroutineContext();
    }

    public final Is b() {
        return this.f25202b;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(InterfaceC3812sc event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof InterfaceC3812sc.d) {
            e();
            return;
        }
        if (event instanceof InterfaceC3812sc.a) {
            c();
        } else if (event instanceof InterfaceC3812sc.b) {
            d();
        } else {
            if (!(event instanceof InterfaceC3812sc.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((InterfaceC3812sc.c) event).a());
        }
    }

    private final void a(DocumentType documentType) {
        Object next;
        Iterator it = this.f25206f.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C3684pc) next).b().c() != documentType);
        C3684pc c3684pc = (C3684pc) next;
        if (c3684pc != null) {
            this.f25207g.track(new C3727qc.a.e(c3684pc.c(), c3684pc.a()));
            a(c3684pc);
        }
    }

    private final void a(C3684pc c3684pc) {
        this.f25208h = c3684pc;
        this.f25202b.a(this.f25205e.b(c3684pc));
    }
}
