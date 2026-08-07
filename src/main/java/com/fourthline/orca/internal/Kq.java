package com.fourthline.orca.internal;

import com.fourthline.core.Gender;
import com.fourthline.core.internal.TimestampProvider;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Kq implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f26634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f26635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2874Gc f26636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Jq f26637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ND f26638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ED f26639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Gq f26640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3354ho f26641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TimestampProvider f26642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC4044xs f26643j;

    public Kq(Is presenter, C2874Gc effectHandler, Jq stateProvider, ND viewNavigator, ED viewCompletionHandler, Gq repository, InterfaceC3354ho analytics, TimestampProvider timestampProvider, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f26634a = coroutineScope;
        this.f26635b = presenter;
        this.f26636c = effectHandler;
        this.f26637d = stateProvider;
        this.f26638e = viewNavigator;
        this.f26639f = viewCompletionHandler;
        this.f26640g = repository;
        this.f26641h = analytics;
        this.f26642i = timestampProvider;
        this.f26643j = popupHandler;
        repository.a(repository.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cq e() {
        return Cq.b.f25265a;
    }

    private final void f() {
        this.f26641h.track(Bq.a.h.f25113a);
        a(Eq.f25640a);
    }

    private final void g() {
        this.f26641h.track(Bq.a.d.f25109a);
        this.f26640g.a(true);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f26634a.getCoroutineContext();
    }

    private final void d() {
        this.f26641h.track(Bq.a.b.f25107a);
        this.f26638e.a(Cq.a.C0479a.f25263a);
    }

    public final C2874Gc b() {
        return this.f26636c;
    }

    public final Is c() {
        return this.f26635b;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(Dq event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof Dq.j) {
            f();
            return;
        }
        if (event instanceof Dq.a) {
            d();
            return;
        }
        if (event instanceof Dq.d) {
            a((Dq.d) event);
            return;
        }
        if (event instanceof Dq.h) {
            a((Dq.h) event);
            return;
        }
        if (event instanceof Dq.b) {
            a((Dq.b) event);
            return;
        }
        if (event instanceof Dq.f) {
            a((Dq.f) event);
            return;
        }
        if (event instanceof Dq.e) {
            a((Dq.e) event);
            return;
        }
        if (event instanceof Dq.i) {
            a((Dq.i) event);
            return;
        }
        if (event instanceof Dq.c) {
            a(((Dq.c) event).a());
        } else if (event instanceof Dq.g) {
            a((Dq.g) event);
        } else {
            if (!(event instanceof Dq.k)) {
                throw new NoWhenBranchMatchedException();
            }
            g();
        }
    }

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26644a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Eq f26646c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Eq eq2, Continuation continuation) {
            super(2, continuation);
            this.f26646c = eq2;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Kq.this.new a(this.f26646c, continuation);
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
                int r1 = r5.f26644a
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
                com.fourthline.orca.internal.Kq r6 = com.fourthline.orca.internal.Kq.this
                com.fourthline.orca.internal.ED r6 = com.fourthline.orca.internal.Kq.c(r6)
                com.fourthline.orca.internal.Eq r1 = r5.f26646c
                r5.f26644a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L32
                goto L45
            L32:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.Kq$a$a r1 = new com.fourthline.orca.internal.Kq$a$a
                com.fourthline.orca.internal.Kq r3 = com.fourthline.orca.internal.Kq.this
                com.fourthline.orca.internal.Eq r4 = r5.f26646c
                r1.<init>(r3, r4)
                r5.f26644a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.Kq.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Kq$a$a, reason: collision with other inner class name */
        static final class C0499a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Kq f26647a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Eq f26648b;

            C0499a(Kq kq2, Eq eq2) {
                this.f26647a = kq2;
                this.f26648b = eq2;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(FD fd2, Continuation continuation) {
                if (!(fd2 instanceof FD.d)) {
                    if (fd2 instanceof FD.c) {
                        this.f26647a.c().a(this.f26647a.f26637d.d(true));
                    } else if (fd2 instanceof FD.a) {
                        this.f26647a.c().a(this.f26647a.f26637d.d(false));
                        ND nd2 = this.f26647a.f26638e;
                        Of ofA = ((FD.a) fd2).a();
                        Pp pp2 = (Pp) (!(ofA instanceof Pp) ? null : ofA);
                        if (pp2 == null) {
                            throw new IllegalStateException((ofA.getClass().getSimpleName() + " are not accepted by this Coordinator.").toString());
                        }
                        nd2.a(new Cq.a.b(pp2));
                    } else {
                        if (!(fd2 instanceof FD.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f26647a.c().a(this.f26647a.f26637d.d(false));
                        Bo boA = ((FD.b) fd2).a();
                        final Kq kq2 = this.f26647a;
                        final Eq eq2 = this.f26648b;
                        this.f26647a.f26643j.a(new Ds.c(boA, null, new wn0.a() { // from class: com.fourthline.orca.internal.nh0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Kq.a.C0499a.a(kq2, eq2);
                            }
                        }, 2, null));
                    }
                }
                return jn0.h0.f84049a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jn0.h0 a(Kq kq2, Eq eq2) {
                kq2.a(eq2);
                return jn0.h0.f84049a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Eq eq2) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(eq2, null), 3, null);
    }

    private final void a(Dq.d dVar) {
        if (dVar.a() && ((Fq) this.f26635b.a()).t().getState() != Gh.FOCUSED) {
            this.f26641h.track(Bq.a.e.f25110a);
            this.f26635b.a(this.f26637d.r());
        } else {
            if (dVar.a() || ((Fq) this.f26635b.a()).t().getState() != Gh.FOCUSED) {
                return;
            }
            this.f26635b.a(this.f26637d.s());
        }
    }

    private final void a(Dq.h hVar) {
        if (hVar.a() && ((Fq) this.f26635b.a()).x().getState() != Gh.FOCUSED) {
            this.f26641h.track(Bq.a.g.f25112a);
            this.f26635b.a(this.f26637d.v());
        } else {
            if (hVar.a() || ((Fq) this.f26635b.a()).x().getState() != Gh.FOCUSED) {
                return;
            }
            this.f26635b.a(this.f26637d.w());
        }
    }

    private final void a(Dq.b bVar) {
        if (bVar.a() && ((Fq) this.f26635b.a()).r().getState() != Gh.FOCUSED) {
            this.f26641h.track(Bq.a.c.f25108a);
            this.f26635b.a(this.f26637d.l());
        } else {
            if (bVar.a() || ((Fq) this.f26635b.a()).r().getState() != Gh.FOCUSED) {
                return;
            }
            this.f26635b.a(this.f26637d.p());
        }
    }

    private final void a(Dq.f fVar) {
        if (fVar.a() && ((Fq) this.f26635b.a()).u().c() != Gh.FOCUSED) {
            this.f26641h.track(Bq.a.f.f25111a);
            this.f26635b.a(this.f26637d.t());
        } else {
            if (fVar.a() || ((Fq) this.f26635b.a()).u().c() != Gh.FOCUSED) {
                return;
            }
            this.f26635b.a(this.f26637d.u());
        }
    }

    private final void a(Dq.e eVar) {
        this.f26640g.b(eVar.a());
        this.f26635b.a(this.f26637d.a(eVar.a()));
    }

    private final void a(Dq.i iVar) {
        this.f26640g.a(iVar.a());
        this.f26635b.a(this.f26637d.d(iVar.a()));
    }

    private final void a(String str) {
        this.f26640g.a(AbstractC3672p6.a(str, this.f26642i.getCurrentCalendar()));
        this.f26635b.a(this.f26637d.b(str));
    }

    private final void a(Dq.g gVar) {
        Map.Entry entryA = gVar.a();
        this.f26640g.a((Gender) entryA.getKey());
        this.f26635b.a(this.f26637d.a((QA) entryA.getValue()));
        this.f26636c.a(new wn0.a() { // from class: com.fourthline.orca.internal.mh0
            @Override // wn0.a
            public final Object invoke() {
                return Kq.e();
            }
        });
    }
}
