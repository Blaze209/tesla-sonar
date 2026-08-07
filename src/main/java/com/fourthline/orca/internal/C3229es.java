package com.fourthline.orca.internal;

import android.net.Uri;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.es, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3229es implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f31510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f31511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2874Gc f31512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ND f31513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3102bs f31514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3497l3 f31515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3944vf f31516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C3186ds f31517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3354ho f31518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC4044xs f31519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC3858tf f31520k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Tr f31521l;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.es$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f31523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3815sf f31524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3229es f31525d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Uri f31526e;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.es$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0556a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC3358hs.values().length];
                try {
                    iArr[EnumC3358hs.PDF.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC3358hs.IMAGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3815sf interfaceC3815sf, C3229es c3229es, Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f31524c = interfaceC3815sf;
            this.f31525d = c3229es;
            this.f31526e = uri;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f31524c, this.f31525d, this.f31526e, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
        
            if (r5 == r0) goto L22;
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
                int r1 = r4.f31523b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r4.f31522a
                com.fourthline.orca.internal.bs r0 = (com.fourthline.orca.internal.InterfaceC3102bs) r0
                jn0.t.b(r5)
                goto L54
            L16:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1e:
                jn0.t.b(r5)
                goto L71
            L22:
                jn0.t.b(r5)
                com.fourthline.orca.internal.sf r5 = r4.f31524c
                com.fourthline.orca.internal.sf$c r5 = (com.fourthline.orca.internal.InterfaceC3815sf.c) r5
                com.fourthline.orca.internal.hs r5 = r5.a()
                int[] r1 = com.fourthline.orca.internal.C3229es.a.C0556a.$EnumSwitchMapping$0
                int r5 = r5.ordinal()
                r5 = r1[r5]
                if (r5 == r3) goto L60
                if (r5 != r2) goto L5a
                com.fourthline.orca.internal.es r5 = r4.f31525d
                com.fourthline.orca.internal.bs r5 = com.fourthline.orca.internal.C3229es.c(r5)
                com.fourthline.orca.internal.es r1 = r4.f31525d
                com.fourthline.orca.internal.l3 r1 = com.fourthline.orca.internal.C3229es.a(r1)
                android.net.Uri r3 = r4.f31526e
                r4.f31522a = r5
                r4.f31523b = r2
                java.lang.Object r1 = r1.a(r3, r4)
                if (r1 != r0) goto L52
                goto L70
            L52:
                r0 = r5
                r5 = r1
            L54:
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                r0.a(r5)
                goto L7c
            L5a:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            L60:
                com.fourthline.orca.internal.es r5 = r4.f31525d
                com.fourthline.orca.internal.vf r5 = com.fourthline.orca.internal.C3229es.b(r5)
                android.net.Uri r1 = r4.f31526e
                r4.f31523b = r3
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L71
            L70:
                return r0
            L71:
                java.net.URI r5 = (java.net.URI) r5
                com.fourthline.orca.internal.es r0 = r4.f31525d
                com.fourthline.orca.internal.bs r0 = com.fourthline.orca.internal.C3229es.c(r0)
                r0.a(r5)
            L7c:
                com.fourthline.orca.internal.es r5 = r4.f31525d
                com.fourthline.orca.internal.ND r5 = r5.d()
                com.fourthline.orca.internal.Pq$a$b r0 = com.fourthline.orca.internal.Pq.a.b.f27380a
                r5.a(r0)
                jn0.h0 r5 = jn0.h0.f84049a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3229es.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C3229es(Is presenter, C2874Gc effectHandler, ND viewNavigator, InterfaceC3102bs resultRepository, C3497l3 bitmapDecoderFromUri, C3944vf fileWriterFromUri, C3186ds stateProvider, InterfaceC3354ho analytics, InterfaceC4044xs popupHandler, InterfaceC3858tf fileValidator, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(bitmapDecoderFromUri, "bitmapDecoderFromUri");
        p013kotlin.jvm.internal.s.k(fileWriterFromUri, "fileWriterFromUri");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(fileValidator, "fileValidator");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f31510a = coroutineScope;
        this.f31511b = presenter;
        this.f31512c = effectHandler;
        this.f31513d = viewNavigator;
        this.f31514e = resultRepository;
        this.f31515f = bitmapDecoderFromUri;
        this.f31516g = fileWriterFromUri;
        this.f31517h = stateProvider;
        this.f31518i = analytics;
        this.f31519j = popupHandler;
        this.f31520k = fileValidator;
    }

    private final void e() {
        this.f31518i.track(Ur.a.b.f28834a);
        this.f31513d.a(Pq.a.C0513a.f27379a);
    }

    private final void f() {
        this.f31518i.track(Ur.a.c.f28835a);
        this.f31519j.a(Rq.b.f27661a);
    }

    private final void g() {
        this.f31518i.track(Ur.a.l.f28844a);
        this.f31512c.a(new wn0.a() { // from class: com.fourthline.orca.internal.g11
            @Override // wn0.a
            public final Object invoke() {
                return C3229es.h();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pq h() {
        return Pq.b.f27383a;
    }

    private final void i() {
        this.f31518i.track(Ur.a.k.f28843a);
        this.f31512c.a(new wn0.a() { // from class: com.fourthline.orca.internal.j11
            @Override // wn0.a
            public final Object invoke() {
                return C3229es.j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pq j() {
        return Pq.c.f27384a;
    }

    private final void k() {
        Tr tr2 = this.f31521l;
        if (tr2 != null) {
            this.f31518i.track(new Ur.a.h(tr2));
        }
        this.f31511b.a(this.f31517h.r());
    }

    private final void l() {
        this.f31511b.a(this.f31517h.o());
    }

    private final void m() {
        this.f31518i.track(Ur.a.j.f28842a);
        this.f31513d.a(Pq.a.d.f27382a);
    }

    private final void n() {
        this.f31518i.track(Ur.a.f.f28838a);
        o();
    }

    private final void o() {
        this.f31511b.a(this.f31517h.a(this.f31521l));
    }

    public final ND d() {
        return this.f31513d;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f31510a.getCoroutineContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d(C3229es c3229es) {
        c3229es.i();
        return jn0.h0.f84049a;
    }

    public final C2874Gc b() {
        return this.f31512c;
    }

    public final Is c() {
        return this.f31511b;
    }

    private final void b(Uri uri) {
        if (uri != null) {
            this.f31518i.track(Ur.a.i.f28841a);
            c(uri);
        }
    }

    private final void c(Uri uri) {
        this.f31518i.track(Ur.a.i.f28841a);
        InterfaceC3815sf interfaceC3815sfA = this.f31520k.a(uri);
        if (interfaceC3815sfA instanceof InterfaceC3815sf.c) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(interfaceC3815sfA, this, uri, null), 3, null);
        } else if (interfaceC3815sfA instanceof InterfaceC3815sf.a) {
            InterfaceC4044xs.a.a(this.f31519j, Rq.c.f27664a, new wn0.a() { // from class: com.fourthline.orca.internal.h11
                @Override // wn0.a
                public final Object invoke() {
                    return C3229es.d(this.f32175a);
                }
            }, null, 4, null);
        } else {
            if (interfaceC3815sfA instanceof InterfaceC3815sf.b) {
                InterfaceC4044xs.a.a(this.f31519j, Rq.d.f27667a, new wn0.a() { // from class: com.fourthline.orca.internal.i11
                    @Override // wn0.a
                    public final Object invoke() {
                        return C3229es.e(this.f32417a);
                    }
                }, null, 4, null);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 e(C3229es c3229es) {
        c3229es.g();
        return jn0.h0.f84049a;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(Qq event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof Qq.i) {
            n();
            return;
        }
        if (event instanceof Qq.f) {
            a(((Qq.f) event).a());
            return;
        }
        if (event instanceof Qq.e) {
            k();
            return;
        }
        if (event instanceof Qq.a) {
            e();
            return;
        }
        if (event instanceof Qq.h) {
            a(((Qq.h) event).a());
            return;
        }
        if (event instanceof Qq.g) {
            l();
            return;
        }
        if (event instanceof Qq.b) {
            f();
        } else if (event instanceof Qq.c) {
            a(((Qq.c) event).a());
        } else {
            if (!(event instanceof Qq.d)) {
                throw new NoWhenBranchMatchedException();
            }
            b(((Qq.d) event).a());
        }
    }

    private final void a(Tr tr2) {
        this.f31521l = tr2;
        o();
        this.f31518i.track(new Ur.a.d(tr2));
    }

    private final void a(int i11) {
        this.f31511b.a(this.f31517h.o());
        if (i11 == 0) {
            i();
        } else {
            m();
        }
    }

    private final void a(Uri uri) {
        if (uri != null) {
            this.f31518i.track(Ur.a.e.f28837a);
            c(uri);
        }
    }
}
