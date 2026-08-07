package com.fourthline.orca.internal;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3137cl implements InterfaceC3500l6, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f30918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Gl f30919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineDispatcher f30920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CoroutineDispatcher f30921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f30922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f30923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f30924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC3543m6 f30925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f30926i;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.cl$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f30927a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f30929c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f30927a = obj;
            this.f30929c |= Integer.MIN_VALUE;
            Object objA = C3137cl.this.a((Cl.a) null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.cl$b */
    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30930a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3543m6 f30932c;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.cl$b$a */
        static final class a extends SuspendLambda implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f30933a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f30934b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f30935c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f30936d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ C3137cl f30937e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC3543m6 f30938f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, C3137cl c3137cl, InterfaceC3543m6 interfaceC3543m6, Continuation continuation) {
                super(2, continuation);
                this.f30936d = obj;
                this.f30937e = c3137cl;
                this.f30938f = interfaceC3543m6;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f30936d, this.f30937e, this.f30938f, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
            
                if (r1.a(r6, r2, r9) == r0) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
            
                if (r3.a(r1, r9) == r0) goto L30;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r9.f30935c
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r1 == 0) goto L2d
                    if (r1 == r4) goto L28
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    goto L28
                L13:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L1b:
                    java.lang.Object r1 = r9.f30934b
                    com.fourthline.orca.internal.m6 r1 = (com.fourthline.orca.internal.InterfaceC3543m6) r1
                    java.lang.Object r3 = r9.f30933a
                    com.fourthline.orca.internal.cl r3 = (com.fourthline.orca.internal.C3137cl) r3
                    jn0.t.b(r10)
                    goto L94
                L28:
                    jn0.t.b(r10)
                    goto La1
                L2d:
                    jn0.t.b(r10)
                    java.lang.Object r10 = r9.f30936d
                    com.fourthline.orca.internal.cl r1 = r9.f30937e
                    com.fourthline.orca.internal.m6 r6 = r9.f30938f
                    java.lang.Throwable r7 = jn0.s.e(r10)
                    if (r7 != 0) goto L80
                    com.fourthline.orca.internal.Dl r10 = (com.fourthline.orca.internal.Dl) r10
                    boolean r2 = com.fourthline.orca.internal.El.e(r10)
                    if (r2 == 0) goto L4a
                    com.fourthline.orca.internal.l6$a$d r2 = new com.fourthline.orca.internal.l6$a$d
                    r2.<init>(r10)
                    goto L77
                L4a:
                    boolean r2 = com.fourthline.orca.internal.El.d(r10)
                    if (r2 == 0) goto L58
                    com.fourthline.orca.internal.l6$a$b r2 = new com.fourthline.orca.internal.l6$a$b
                    com.fourthline.orca.internal.ZD$c r10 = com.fourthline.orca.internal.ZD.c.f30009a
                    r2.<init>(r10)
                    goto L77
                L58:
                    com.fourthline.orca.internal.l6$a$b r2 = new com.fourthline.orca.internal.l6$a$b
                    com.fourthline.orca.internal.ZD$b r3 = new com.fourthline.orca.internal.ZD$b
                    int r10 = r10.c()
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r8 = "NetworkDataManager."
                    r7.append(r8)
                    r7.append(r10)
                    java.lang.String r10 = r7.toString()
                    r3.<init>(r10)
                    r2.<init>(r3)
                L77:
                    r9.f30935c = r4
                    java.lang.Object r10 = com.fourthline.orca.internal.C3137cl.a(r1, r6, r2, r9)
                    if (r10 != r0) goto La1
                    goto La0
                L80:
                    com.fourthline.orca.internal.l6$a$b r10 = new com.fourthline.orca.internal.l6$a$b
                    r10.<init>(r7)
                    r9.f30933a = r1
                    r9.f30934b = r6
                    r9.f30935c = r3
                    java.lang.Object r10 = com.fourthline.orca.internal.C3137cl.a(r1, r6, r10, r9)
                    if (r10 != r0) goto L92
                    goto La0
                L92:
                    r3 = r1
                    r1 = r6
                L94:
                    r9.f30933a = r5
                    r9.f30934b = r5
                    r9.f30935c = r2
                    java.lang.Object r10 = com.fourthline.orca.internal.C3137cl.a(r3, r1, r9)
                    if (r10 != r0) goto La1
                La0:
                    return r0
                La1:
                    com.fourthline.orca.internal.cl r10 = r9.f30937e
                    com.fourthline.orca.internal.C3137cl.a(r10, r5)
                    com.fourthline.orca.internal.cl r10 = r9.f30937e
                    com.fourthline.orca.internal.C3137cl.a(r10)
                    jn0.h0 r10 = jn0.h0.f84049a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3137cl.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3543m6 interfaceC3543m6, Continuation continuation) {
            super(2, continuation);
            this.f30932c = interfaceC3543m6;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3137cl.this.new b(this.f30932c, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0073 A[PHI: r9
          0x0073: PHI (r9v13 java.lang.Object) = (r9v10 java.lang.Object), (r9v12 java.lang.Object), (r9v18 java.lang.Object) binds: [B:28:0x0070, B:23:0x005f, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r1, r2, r8) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
        
            if (r1.a(r3, r4, r8) == r0) goto L37;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f30930a
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L33
                if (r1 == r6) goto L2f
                if (r1 == r5) goto L25
                if (r1 == r4) goto L25
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L20
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                jn0.t.b(r9)
                goto Lb2
            L25:
                jn0.t.b(r9)
                jn0.s r9 = (jn0.s) r9
                java.lang.Object r9 = r9.getValue()
                goto L73
            L2f:
                jn0.t.b(r9)
                goto L45
            L33:
                jn0.t.b(r9)
                com.fourthline.orca.internal.cl r9 = com.fourthline.orca.internal.C3137cl.this
                com.fourthline.orca.internal.m6 r1 = r8.f30932c
                com.fourthline.orca.internal.l6$a$a r7 = com.fourthline.orca.internal.InterfaceC3500l6.a.C0576a.f33229a
                r8.f30930a = r6
                java.lang.Object r9 = com.fourthline.orca.internal.C3137cl.a(r9, r1, r7, r8)
                if (r9 != r0) goto L45
                goto Lb1
            L45:
                com.fourthline.orca.internal.m6 r9 = r8.f30932c
                boolean r1 = r9 instanceof com.fourthline.orca.internal.InterfaceC3180dl
                if (r1 == 0) goto L92
                com.fourthline.orca.internal.dl r9 = (com.fourthline.orca.internal.InterfaceC3180dl) r9
                com.fourthline.orca.internal.Cl r9 = r9.a()
                boolean r1 = r9 instanceof com.fourthline.orca.internal.Cl.a
                if (r1 == 0) goto L62
                com.fourthline.orca.internal.cl r1 = com.fourthline.orca.internal.C3137cl.this
                com.fourthline.orca.internal.Cl$a r9 = (com.fourthline.orca.internal.Cl.a) r9
                r8.f30930a = r5
                java.lang.Object r9 = com.fourthline.orca.internal.C3137cl.a(r1, r9, r8)
                if (r9 != r0) goto L73
                goto Lb1
            L62:
                boolean r1 = r9 instanceof com.fourthline.orca.internal.Cl.c
                if (r1 == 0) goto L8c
                com.fourthline.orca.internal.cl r1 = com.fourthline.orca.internal.C3137cl.this
                com.fourthline.orca.internal.Cl$c r9 = (com.fourthline.orca.internal.Cl.c) r9
                r8.f30930a = r4
                java.lang.Object r9 = com.fourthline.orca.internal.C3137cl.a(r1, r9, r8)
                if (r9 != r0) goto L73
                goto Lb1
            L73:
                com.fourthline.orca.internal.cl r1 = com.fourthline.orca.internal.C3137cl.this
                kotlinx.coroutines.CoroutineDispatcher r1 = com.fourthline.orca.internal.C3137cl.b(r1)
                com.fourthline.orca.internal.cl$b$a r2 = new com.fourthline.orca.internal.cl$b$a
                com.fourthline.orca.internal.cl r4 = com.fourthline.orca.internal.C3137cl.this
                com.fourthline.orca.internal.m6 r5 = r8.f30932c
                r6 = 0
                r2.<init>(r9, r4, r5, r6)
                r8.f30930a = r3
                java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r1, r2, r8)
                if (r9 != r0) goto Lb2
                goto Lb1
            L8c:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            L92:
                r9.b()
                com.fourthline.orca.internal.n6 r9 = new com.fourthline.orca.internal.n6
                com.fourthline.orca.internal.m6 r1 = r8.f30932c
                java.lang.String r1 = r1.b()
                r9.<init>(r1)
                com.fourthline.orca.internal.cl r1 = com.fourthline.orca.internal.C3137cl.this
                com.fourthline.orca.internal.m6 r3 = r8.f30932c
                com.fourthline.orca.internal.l6$a$b r4 = new com.fourthline.orca.internal.l6$a$b
                r4.<init>(r9)
                r8.f30930a = r2
                java.lang.Object r9 = com.fourthline.orca.internal.C3137cl.a(r1, r3, r4, r8)
                if (r9 != r0) goto Lb2
            Lb1:
                return r0
            Lb2:
                com.fourthline.orca.internal.m6 r9 = r8.f30932c
                r9.b()
                jn0.h0 r9 = jn0.h0.f84049a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3137cl.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.cl$c */
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f30940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f30941c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f30943e;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f30941c = obj;
            this.f30943e |= Integer.MIN_VALUE;
            return C3137cl.this.a((InterfaceC3543m6) null, this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.cl$d */
    static final class d extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30944a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3543m6 f30946c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC3543m6 interfaceC3543m6, Continuation continuation) {
            super(2, continuation);
            this.f30946c = interfaceC3543m6;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3137cl.this.new d(this.f30946c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f30944a;
            if (i11 == 0) {
                jn0.t.b(obj);
                C3137cl c3137cl = C3137cl.this;
                InterfaceC3543m6 interfaceC3543m6 = this.f30946c;
                InterfaceC3500l6.a.c cVar = InterfaceC3500l6.a.c.f33231a;
                this.f30944a = 1;
                if (c3137cl.a(interfaceC3543m6, cVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.fourthline.orca.internal.cl$e */
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f30947a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f30949c;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f30947a = obj;
            this.f30949c |= Integer.MIN_VALUE;
            Object objA = C3137cl.this.a((Cl.c) null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3137cl(Gl networkService, CoroutineDispatcher mainDispatcher, CoroutineDispatcher ioDispatcher, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        p013kotlin.jvm.internal.s.k(mainDispatcher, "mainDispatcher");
        p013kotlin.jvm.internal.s.k(ioDispatcher, "ioDispatcher");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f30918a = coroutineScope;
        this.f30919b = networkService;
        this.f30920c = mainDispatcher;
        this.f30921d = ioDispatcher;
        this.f30922e = new LinkedHashMap();
        this.f30923f = new LinkedHashMap();
        this.f30924g = new ArrayList();
        this.f30926i = new LinkedHashMap();
    }

    private final boolean c() {
        return this.f30925h != null;
    }

    private final boolean d() {
        return !c();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f30918a.getCoroutineContext();
    }

    public InterfaceC3500l6.a b(String identifier) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        return (InterfaceC3500l6.a) this.f30922e.get(identifier);
    }

    public boolean c(String identifier) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        return this.f30922e.containsKey(identifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        InterfaceC3543m6 interfaceC3543m6;
        if (!d() || (interfaceC3543m6 = (InterfaceC3543m6) p013kotlin.collections.v.N(this.f30924g)) == null) {
            return;
        }
        interfaceC3543m6.b();
        b(interfaceC3543m6);
    }

    private final void b(InterfaceC3543m6 interfaceC3543m6) {
        interfaceC3543m6.b();
        this.f30925h = interfaceC3543m6;
        BuildersKt__Builders_commonKt.launch$default(this, this.f30921d, null, new b(interfaceC3543m6, null), 2, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3500l6
    public Flow a(String identifier) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.f30923f.get(identifier);
        return mutableSharedFlow != null ? mutableSharedFlow : FlowKt.flowOf(new C3629o6(identifier, new InterfaceC3500l6.a.b(new Resources.NotFoundException())));
    }

    public /* synthetic */ C3137cl(Gl gl2, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineScope coroutineScope, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(gl2, (i11 & 2) != 0 ? Dispatchers.getMain() : coroutineDispatcher, (i11 & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher2, coroutineScope);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3500l6
    public void a(InterfaceC3543m6 request) {
        p013kotlin.jvm.internal.s.k(request, "request");
        request.b();
        this.f30923f.put(request.b(), SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null));
        this.f30926i.remove(request.b());
        this.f30924g.add(request);
        BuildersKt__BuildersKt.runBlocking$default(null, new d(request, null), 1, null);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(InterfaceC3543m6 interfaceC3543m6, Continuation continuation) {
        c cVar;
        C3137cl c3137cl;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f30943e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f30943e = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f30941c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f30943e;
        if (i12 == 0) {
            jn0.t.b(obj);
            Integer num = (Integer) this.f30926i.get(interfaceC3543m6.b());
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue < 2) {
                this.f30926i.put(interfaceC3543m6.b(), Boxing.boxInt(iIntValue + 1));
                cVar.f30939a = this;
                cVar.f30940b = interfaceC3543m6;
                cVar.f30943e = 1;
                if (DelayKt.delay(500L, cVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c3137cl = this;
            }
            return jn0.h0.f84049a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC3543m6 = (InterfaceC3543m6) cVar.f30940b;
        c3137cl = (C3137cl) cVar.f30939a;
        jn0.t.b(obj);
        c3137cl.f30924g.add(0, interfaceC3543m6);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Cl.c cVar, Continuation continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f30949c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f30949c = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f30947a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f30949c;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        Gl gl2 = this.f30919b;
        eVar.f30949c = 1;
        Object objA = gl2.a(cVar, eVar);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Cl.a aVar, Continuation continuation) {
        a aVar2;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f30929c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f30929c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f30927a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f30929c;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        Gl gl2 = this.f30919b;
        aVar2.f30929c = 1;
        Object objA = gl2.a(aVar, aVar2);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(InterfaceC3543m6 interfaceC3543m6, InterfaceC3500l6.a aVar, Continuation continuation) {
        interfaceC3543m6.b();
        Objects.toString(aVar);
        this.f30922e.put(interfaceC3543m6.b(), aVar);
        C3629o6 c3629o6 = new C3629o6(interfaceC3543m6.b(), aVar);
        MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.f30923f.get(interfaceC3543m6.b());
        if (mutableSharedFlow == null) {
            return jn0.h0.f84049a;
        }
        Object objEmit = mutableSharedFlow.emit(c3629o6, continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : jn0.h0.f84049a;
    }
}
