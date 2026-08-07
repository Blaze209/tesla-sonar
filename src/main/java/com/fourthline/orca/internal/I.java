package com.fourthline.orca.internal;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class I implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f26159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f26160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2874Gc f26161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G f26162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Gi f26163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final F f26164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ND f26165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ED f26166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3354ho f26167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC4044xs f26168j;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[A.values().length];
            try {
                iArr[A.POSTAL_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[A.HOUSE_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[A.HOUSE_NUMBER_SUFFIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[A.STREET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[A.CITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public I(Is presenter, C2874Gc effectHandler, G repository, Gi residencyViewStateManager, F stateProvider, ND viewNavigator, ED viewCompletionHandler, InterfaceC3354ho analytics, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(residencyViewStateManager, "residencyViewStateManager");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f26159a = coroutineScope;
        this.f26160b = presenter;
        this.f26161c = effectHandler;
        this.f26162d = repository;
        this.f26163e = residencyViewStateManager;
        this.f26164f = stateProvider;
        this.f26165g = viewNavigator;
        this.f26166h = viewCompletionHandler;
        this.f26167i = analytics;
        this.f26168j = popupHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B e() {
        return B.b.f25038a;
    }

    private final void f() {
        this.f26167i.track(C4095z.a.b.f37162a);
        this.f26165g.a(B.c.a.f25039a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B g() {
        return B.b.f25038a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B h() {
        return B.a.f25037a;
    }

    private final void i() {
        this.f26167i.track(C4095z.a.d.f37164a);
        a(D.f25299a);
    }

    private final void j() {
        this.f26167i.track(C4095z.a.c.f37163a);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f26159a.getCoroutineContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B d() {
        return B.d.f25041a;
    }

    public final C2874Gc b() {
        return this.f26161c;
    }

    public final Is c() {
        return this.f26160b;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(C event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof C.i) {
            j();
            return;
        }
        if (event instanceof C.h) {
            i();
            return;
        }
        if (event instanceof C.a) {
            f();
            return;
        }
        if (event instanceof C.c) {
            a((C.c) event);
            return;
        }
        if (event instanceof C.j) {
            a((C.j) event);
            return;
        }
        if (event instanceof C.d) {
            C.d dVar = (C.d) event;
            InterfaceC3447jx interfaceC3447jxA = this.f26163e.a(dVar.a());
            if (interfaceC3447jxA != null) {
                a(interfaceC3447jxA);
                return;
            } else {
                this.f26163e.b(dVar.a());
                this.f26160b.a(this.f26164f.s());
                return;
            }
        }
        if (event instanceof C.e) {
            this.f26163e.a(true);
            this.f26160b.a(this.f26164f.s());
            this.f26161c.a(new wn0.a() { // from class: com.fourthline.orca.internal.yd0
                @Override // wn0.a
                public final Object invoke() {
                    return I.d();
                }
            });
        } else if (!(event instanceof C.f) && !p013kotlin.jvm.internal.s.f(event, C.b.f25159a)) {
            if (!(event instanceof C.g)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((C.g) event).a());
        } else {
            this.f26163e.a(false);
            this.f26160b.a(this.f26164f.s());
            this.f26161c.a(new wn0.a() { // from class: com.fourthline.orca.internal.zd0
                @Override // wn0.a
                public final Object invoke() {
                    return I.e();
                }
            });
        }
    }

    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26169a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ D f26171c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(D d11, Continuation continuation) {
            super(2, continuation);
            this.f26171c = d11;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return I.this.new b(this.f26171c, continuation);
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
                int r1 = r5.f26169a
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
                com.fourthline.orca.internal.I r6 = com.fourthline.orca.internal.I.this
                com.fourthline.orca.internal.ED r6 = com.fourthline.orca.internal.I.c(r6)
                com.fourthline.orca.internal.D r1 = r5.f26171c
                r5.f26169a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L32
                goto L45
            L32:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.I$b$a r1 = new com.fourthline.orca.internal.I$b$a
                com.fourthline.orca.internal.I r3 = com.fourthline.orca.internal.I.this
                com.fourthline.orca.internal.D r4 = r5.f26171c
                r1.<init>(r3, r4)
                r5.f26169a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.I.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ I f26172a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ D f26173b;

            a(I i11, D d11) {
                this.f26172a = i11;
                this.f26173b = d11;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(FD fd2, Continuation continuation) {
                if (!(fd2 instanceof FD.d)) {
                    if (fd2 instanceof FD.c) {
                        this.f26172a.c().a(this.f26172a.f26164f.d(true));
                    } else if (fd2 instanceof FD.a) {
                        this.f26172a.c().a(this.f26172a.f26164f.d(false));
                        ND nd2 = this.f26172a.f26165g;
                        Of ofA = ((FD.a) fd2).a();
                        K k11 = (K) (!(ofA instanceof K) ? null : ofA);
                        if (k11 == null) {
                            throw new IllegalStateException((ofA.getClass().getSimpleName() + " are not accepted by this Coordinator.").toString());
                        }
                        nd2.a(new B.c.b(k11));
                    } else {
                        if (!(fd2 instanceof FD.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f26172a.c().a(this.f26172a.f26164f.d(false));
                        Bo boA = ((FD.b) fd2).a();
                        final I i11 = this.f26172a;
                        final D d11 = this.f26173b;
                        this.f26172a.f26168j.a(new Ds.c(boA, null, new wn0.a() { // from class: com.fourthline.orca.internal.ce0
                            @Override // wn0.a
                            public final Object invoke() {
                                return I.b.a.a(i11, d11);
                            }
                        }, 2, null));
                    }
                }
                return jn0.h0.f84049a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jn0.h0 a(I i11, D d11) {
                i11.a(d11);
                return jn0.h0.f84049a;
            }
        }
    }

    private final void a(InterfaceC3447jx interfaceC3447jx) {
        this.f26163e.a(interfaceC3447jx);
        this.f26160b.a(this.f26164f.s());
        this.f26161c.a(new wn0.a() { // from class: com.fourthline.orca.internal.ae0
            @Override // wn0.a
            public final Object invoke() {
                return I.g();
            }
        });
        this.f26161c.a(new wn0.a() { // from class: com.fourthline.orca.internal.be0
            @Override // wn0.a
            public final Object invoke() {
                return I.h();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(D d11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(d11, null), 3, null);
    }

    private final void a(C.j jVar) {
        String strB = jVar.b();
        int i11 = a.$EnumSwitchMapping$0[jVar.a().ordinal()];
        if (i11 == 1) {
            this.f26162d.d(jVar.b());
        } else if (i11 == 2) {
            try {
                this.f26162d.a(Integer.valueOf(Integer.parseInt(jVar.b())));
            } catch (NumberFormatException unused) {
                if (jVar.b().length() == 0) {
                    this.f26162d.a((Integer) null);
                } else {
                    strB = ((E) this.f26160b.a()).v().c();
                }
            }
        } else if (i11 == 3) {
            this.f26162d.a(jVar.b());
        } else if (i11 == 4) {
            this.f26162d.c(jVar.b());
        } else if (i11 == 5) {
            this.f26162d.e(jVar.b());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f26160b.a(this.f26164f.a(jVar.a(), strB));
    }

    private final void a(C.c cVar) {
        this.f26160b.a(this.f26164f.a(cVar.a(), cVar.b()));
    }
}
