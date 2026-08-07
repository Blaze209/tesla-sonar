package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2870Fe implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f25806h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f25807i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f25808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f25809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ND f25810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3087bd f25811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wn0.a f25812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ED f25813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC4044xs f25814g;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Fe$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Fe$b */
    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25815a;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Fe$b$a */
        /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.a {
            a(Object obj) {
                super(0, obj, C2870Fe.class, "finishEidUpload", "finishEidUpload()V", 0);
            }

            public final void a() {
                ((C2870Fe) this.receiver).b();
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
            return C2870Fe.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f25815a;
            if (i11 == 0) {
                jn0.t.b(obj);
                InterfaceC3087bd interfaceC3087bd = C2870Fe.this.f25811d;
                InterfaceC3087bd.a aVar = new InterfaceC3087bd.a((String) C2870Fe.this.f25812e.invoke());
                this.f25815a = 1;
                objA = interfaceC3087bd.a(aVar, this);
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
            C2870Fe c2870Fe = C2870Fe.this;
            Throwable thE = jn0.s.e(objA);
            if (thE == null) {
                c2870Fe.c();
            } else {
                c2870Fe.f25814g.a(new Ds.c(AbstractC3039aE.a(thE), "eid_upload", new a(c2870Fe)));
            }
            return jn0.h0.f84049a;
        }
    }

    public C2870Fe(Is presenter, ND viewNavigator, InterfaceC3087bd eidFinishWorker, wn0.a workflowIdProvider, ED viewCompletionHandler, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(eidFinishWorker, "eidFinishWorker");
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f25808a = coroutineScope;
        this.f25809b = presenter;
        this.f25810c = viewNavigator;
        this.f25811d = eidFinishWorker;
        this.f25812e = workflowIdProvider;
        this.f25813f = viewCompletionHandler;
        this.f25814g = popupHandler;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f25808a.getCoroutineContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(null), 3, null);
    }

    private final void e() {
        this.f25810c.a(new InterfaceC2864Ee.a(KycError.Canceled.INSTANCE));
    }

    private final void f() {
        b();
    }

    private final void g() {
        e();
    }

    public final Is d() {
        return this.f25809b;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(GC event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof GC.b) {
            f();
        } else if (event instanceof GC.a) {
            e();
        } else {
            if (!(event instanceof GC.c)) {
                throw new NoWhenBranchMatchedException();
            }
            g();
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Fe$c */
    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25817a;

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
            return C2870Fe.this.new c(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (((kotlinx.coroutines.flow.Flow) r5).collect(r1, r4) == r0) goto L15;
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
                int r1 = r4.f25817a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r5)
                goto L44
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                jn0.t.b(r5)
                goto L32
            L1e:
                jn0.t.b(r5)
                com.fourthline.orca.internal.Fe r5 = com.fourthline.orca.internal.C2870Fe.this
                com.fourthline.orca.internal.ED r5 = com.fourthline.orca.internal.C2870Fe.e(r5)
                com.fourthline.orca.internal.HC r1 = com.fourthline.orca.internal.HC.f26093a
                r4.f25817a = r3
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L32
                goto L43
            L32:
                kotlinx.coroutines.flow.Flow r5 = (kotlinx.coroutines.flow.Flow) r5
                com.fourthline.orca.internal.Fe$c$a r1 = new com.fourthline.orca.internal.Fe$c$a
                com.fourthline.orca.internal.Fe r3 = com.fourthline.orca.internal.C2870Fe.this
                r1.<init>(r3)
                r4.f25817a = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L44
            L43:
                return r0
            L44:
                jn0.h0 r5 = jn0.h0.f84049a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C2870Fe.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Fe$c$a */
        static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2870Fe f25819a;

            a(C2870Fe c2870Fe) {
                this.f25819a = c2870Fe;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(FD fd2, Continuation continuation) {
                if (!(fd2 instanceof FD.d) && !(fd2 instanceof FD.c)) {
                    if (fd2 instanceof FD.a) {
                        ND nd2 = this.f25819a.f25810c;
                        Of ofA = ((FD.a) fd2).a();
                        Of of2 = ofA == null ? null : ofA;
                        if (of2 == null) {
                            throw new IllegalStateException((ofA.getClass().getSimpleName() + " are not accepted by this Coordinator.").toString());
                        }
                        nd2.a(new InterfaceC2864Ee.b(of2));
                    } else {
                        if (!(fd2 instanceof FD.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        InterfaceC4044xs interfaceC4044xs = this.f25819a.f25814g;
                        Bo boA = ((FD.b) fd2).a();
                        final C2870Fe c2870Fe = this.f25819a;
                        interfaceC4044xs.a(new Ds.c(boA, null, new wn0.a() { // from class: com.fourthline.orca.internal.za0
                            @Override // wn0.a
                            public final Object invoke() {
                                return C2870Fe.c.a.a(c2870Fe);
                            }
                        }, 2, null));
                    }
                }
                return jn0.h0.f84049a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jn0.h0 a(C2870Fe c2870Fe) {
                c2870Fe.c();
                return jn0.h0.f84049a;
            }
        }
    }
}
