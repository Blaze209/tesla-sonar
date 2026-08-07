package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Gr implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f25991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f25992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Fr f25993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Cr f25994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Dr f25995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3354ho f25996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ND f25997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ED f25998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC4044xs f25999i;

    public Gr(Is presenter, Fr stateProvider, Cr repository, Dr resultRepository, InterfaceC3354ho analytics, ND viewNavigator, ED viewCompletionHandler, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f25991a = coroutineScope;
        this.f25992b = presenter;
        this.f25993c = stateProvider;
        this.f25994d = repository;
        this.f25995e = resultRepository;
        this.f25996f = analytics;
        this.f25997g = viewNavigator;
        this.f25998h = viewCompletionHandler;
        this.f25999i = popupHandler;
    }

    private final void d() {
        this.f25992b.a(this.f25993c.g());
    }

    private final void e() {
        this.f25996f.track(Lq.a.d.f26848a);
        this.f25995e.a(this.f25994d.a());
        a(Ar.f25024a);
    }

    private final void f() {
        this.f25992b.a(new wn0.l() { // from class: com.fourthline.orca.internal.hb0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Gr.a(this.f32269a, (Br) obj);
            }
        });
        this.f25996f.track(Lq.a.c.f26847a);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f25991a.getCoroutineContext();
    }

    private final void c() {
        this.f25996f.track(Lq.a.b.f26846a);
        if (((Br) this.f25992b.a()).t() != null) {
            d();
        } else {
            this.f25997g.a(C4043xr.f36791a);
        }
    }

    public final Is b() {
        return this.f25992b;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(InterfaceC4129zr event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (!(event instanceof InterfaceC4129zr.a) && !(event instanceof InterfaceC4129zr.b)) {
            if (event instanceof InterfaceC4129zr.d) {
                e();
                return;
            }
            if (event instanceof InterfaceC4129zr.f) {
                f();
                return;
            } else if (event instanceof InterfaceC4129zr.e) {
                a(((InterfaceC4129zr.e) event).a());
                return;
            } else {
                if (!(event instanceof InterfaceC4129zr.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                d();
                return;
            }
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Ar ar2) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(ar2, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Br a(Gr gr2, Br present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return gr2.f25993c.getInitialState();
    }

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26000a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ar f26002c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Ar ar2, Continuation continuation) {
            super(2, continuation);
            this.f26002c = ar2;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Gr.this.new a(this.f26002c, continuation);
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
                int r1 = r5.f26000a
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
                com.fourthline.orca.internal.Gr r6 = com.fourthline.orca.internal.Gr.this
                com.fourthline.orca.internal.ED r6 = com.fourthline.orca.internal.Gr.b(r6)
                com.fourthline.orca.internal.Ar r1 = r5.f26002c
                r5.f26000a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L32
                goto L45
            L32:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.Gr$a$a r1 = new com.fourthline.orca.internal.Gr$a$a
                com.fourthline.orca.internal.Gr r3 = com.fourthline.orca.internal.Gr.this
                com.fourthline.orca.internal.Ar r4 = r5.f26002c
                r1.<init>(r3, r4)
                r5.f26000a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.Gr.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Gr$a$a, reason: collision with other inner class name */
        static final class C0491a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Gr f26003a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ar f26004b;

            C0491a(Gr gr2, Ar ar2) {
                this.f26003a = gr2;
                this.f26004b = ar2;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(FD fd2, Continuation continuation) {
                if (!(fd2 instanceof FD.d) && !(fd2 instanceof FD.c)) {
                    if (fd2 instanceof FD.a) {
                        ND nd2 = this.f26003a.f25997g;
                        Of ofA = ((FD.a) fd2).a();
                        InterfaceC3442js interfaceC3442js = (InterfaceC3442js) (!(ofA instanceof InterfaceC3442js) ? null : ofA);
                        if (interfaceC3442js == null) {
                            throw new IllegalStateException((ofA.getClass().getSimpleName() + " are not accepted by this Coordinator.").toString());
                        }
                        nd2.a(new C4086yr(interfaceC3442js));
                    } else {
                        if (!(fd2 instanceof FD.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Bo boA = ((FD.b) fd2).a();
                        final Gr gr2 = this.f26003a;
                        final Ar ar2 = this.f26004b;
                        this.f26003a.f25999i.a(new Ds.c(boA, null, new wn0.a() { // from class: com.fourthline.orca.internal.ib0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Gr.a.C0491a.a(gr2, ar2);
                            }
                        }, 2, null));
                    }
                }
                return jn0.h0.f84049a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jn0.h0 a(Gr gr2, Ar ar2) {
                gr2.a(ar2);
                return jn0.h0.f84049a;
            }
        }
    }

    private final void a(Bitmap bitmap) {
        this.f25996f.track(Lq.a.e.f26849a);
        this.f25992b.a(this.f25993c.a(bitmap));
    }
}
