package com.fourthline.orca.internal;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3473kg implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f32970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f32971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ND f32972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3430jg f32973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3346hg f32974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3022Zd f32975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3559mg f32976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3354ho f32977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC4044xs f32978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private EnumC3718q9 f32979j;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kg$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f32981b;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.kg$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0571a extends p013kotlin.jvm.internal.p implements wn0.a {
            C0571a(Object obj) {
                super(0, obj, C3473kg.class, "makeReadyAndGetConsent", "makeReadyAndGetConsent()V", 0);
            }

            public final void a() {
                ((C3473kg) this.receiver).c();
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return jn0.h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.kg$a$b */
        public /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC3718q9.values().length];
                try {
                    iArr[EnumC3718q9.Traditional.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC3718q9.Eid.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
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
            return C3473kg.this.new a(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:28:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:29:0x0107  */
        /* JADX WARN: Code duplicated, block: B:31:0x010d  */
        /* JADX WARN: Code duplicated, block: B:33:0x0124  */
        /* JADX WARN: Code duplicated, block: B:34:0x013e  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            EnumC3718q9 enumC3718q9;
            EnumC3718q9 enumC3718q10;
            Object value;
            C3473kg c3473kg;
            Throwable thE;
            ZD zdA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f32981b;
            if (i11 == 0) {
                jn0.t.b(obj);
                enumC3718q9 = C3473kg.this.f32979j;
                if (enumC3718q9 != null) {
                    if (C3473kg.this.f32974e.d().getMakeFlowVariantRequest()) {
                        C3473kg.this.b().a(C3473kg.this.f32973d.a(enumC3718q9, true));
                        InterfaceC3559mg interfaceC3559mg = C3473kg.this.f32976g;
                        InterfaceC3559mg.a aVar = new InterfaceC3559mg.a(C3473kg.this.f32974e.a(), AbstractC3760r9.a(enumC3718q9, C3473kg.this.f32974e.d()));
                        this.f32980a = enumC3718q9;
                        this.f32981b = 1;
                        if (interfaceC3559mg.a(aVar, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    return jn0.h0.f84049a;
                }
                throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + enumC3718q9 + " must not be null."))).toString());
            }
            if (i11 == 1) {
                enumC3718q9 = (EnumC3718q9) this.f32980a;
                jn0.t.b(obj);
                ((jn0.s) obj).getValue();
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                enumC3718q10 = (EnumC3718q9) this.f32980a;
                jn0.t.b(obj);
                value = ((jn0.s) obj).getValue();
            }
            c3473kg = C3473kg.this;
            thE = jn0.s.e(value);
            if (thE == null) {
                zdA = AbstractC3039aE.a(thE);
                c3473kg.b().a(c3473kg.f32973d.a(enumC3718q10, false));
                if (zdA instanceof ZD.c) {
                    InterfaceC4044xs.a.a(c3473kg.f32978i, new Ds.c(zdA, null, null, 6, null), new C0571a(c3473kg), null, 4, null);
                } else {
                    c3473kg.f32978i.a(new Ds.c(zdA, null, null, 6, null));
                }
            } else {
                if (((InterfaceC3022Zd.b) value) instanceof InterfaceC3022Zd.b.a) {
                    throw new NoWhenBranchMatchedException();
                }
                c3473kg.b().a(c3473kg.f32973d.a(enumC3718q10, false));
                c3473kg.f32978i.a(C3047ag.f30407a);
            }
            return jn0.h0.f84049a;
            int i12 = b.$EnumSwitchMapping$0[enumC3718q9.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                C3473kg.this.f32974e.c();
                C3473kg.this.b().a(C3473kg.this.f32973d.a(enumC3718q9, true));
                InterfaceC3022Zd interfaceC3022Zd = C3473kg.this.f32975f;
                InterfaceC3022Zd.a aVar2 = new InterfaceC3022Zd.a(C3473kg.this.f32974e.a());
                this.f32980a = enumC3718q9;
                this.f32981b = 2;
                Object objA = interfaceC3022Zd.a(aVar2, this);
                if (objA != coroutine_suspended) {
                    enumC3718q10 = enumC3718q9;
                    value = objA;
                    c3473kg = C3473kg.this;
                    thE = jn0.s.e(value);
                    if (thE == null) {
                        zdA = AbstractC3039aE.a(thE);
                        c3473kg.b().a(c3473kg.f32973d.a(enumC3718q10, false));
                        if (zdA instanceof ZD.c) {
                            InterfaceC4044xs.a.a(c3473kg.f32978i, new Ds.c(zdA, null, null, 6, null), new C0571a(c3473kg), null, 4, null);
                        } else {
                            c3473kg.f32978i.a(new Ds.c(zdA, null, null, 6, null));
                        }
                    } else {
                        if (((InterfaceC3022Zd.b) value) instanceof InterfaceC3022Zd.b.a) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c3473kg.b().a(c3473kg.f32973d.a(enumC3718q10, false));
                        c3473kg.f32978i.a(C3047ag.f30407a);
                    }
                }
                return coroutine_suspended;
            }
            C3473kg.this.b().a(C3473kg.this.f32973d.a(enumC3718q9, false));
            C3473kg.this.f32972c.a(new Zf.c(new InterfaceC3172dd.a(DocumentFlowConfig.a(C3473kg.this.f32974e.d().getFallbackDocumentConfig(), null, null, false, null, null, null, null, null, null, true, 511, null))));
            return jn0.h0.f84049a;
        }
    }

    public C3473kg(Is presenter, ND viewNavigator, C3430jg stateProvider, InterfaceC3346hg repository, InterfaceC3022Zd eidReadyWorker, InterfaceC3559mg flowVariantWorker, InterfaceC3354ho analytics, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(eidReadyWorker, "eidReadyWorker");
        p013kotlin.jvm.internal.s.k(flowVariantWorker, "flowVariantWorker");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f32970a = coroutineScope;
        this.f32971b = presenter;
        this.f32972c = viewNavigator;
        this.f32973d = stateProvider;
        this.f32974e = repository;
        this.f32975f = eidReadyWorker;
        this.f32976g = flowVariantWorker;
        this.f32977h = analytics;
        this.f32978i = popupHandler;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f32970a.getCoroutineContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(null), 3, null);
    }

    private final void d() {
        this.f32977h.track(Yf.a.b.f29873a);
        this.f32972c.a(Zf.a.f30023a);
    }

    private final void e() {
        this.f32977h.track(Yf.a.e.f29876a);
        c();
    }

    private final void f() {
        this.f32977h.track(Yf.a.d.f29875a);
        this.f32979j = null;
        this.f32971b.a(C3430jg.a(this.f32973d, null, false, 2, null));
    }

    public final Is b() {
        return this.f32971b;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(InterfaceC3090bg event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof InterfaceC3090bg.d) {
            f();
            return;
        }
        if (event instanceof InterfaceC3090bg.a) {
            d();
        } else if (event instanceof InterfaceC3090bg.b) {
            e();
        } else {
            if (!(event instanceof InterfaceC3090bg.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((InterfaceC3090bg.c) event).a());
        }
    }

    private final void a(EnumC3718q9 enumC3718q9) {
        this.f32977h.track(new Yf.a.f(enumC3718q9));
        this.f32979j = enumC3718q9;
        this.f32971b.a(C3430jg.a(this.f32973d, enumC3718q9, false, 2, null));
    }
}
