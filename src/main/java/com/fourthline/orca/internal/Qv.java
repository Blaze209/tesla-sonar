package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesError;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Qv implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final a f27540o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f27541p = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f27542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f27543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2874Gc f27544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Pv f27545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ND f27546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ED f27547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Mv f27548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3233ew f27549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3703pv f27550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC2931Re f27551j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC2931Re f27552k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC4044xs f27553l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC3354ho f27554m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Job f27555n;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27556a;

        /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.a {
            a(Object obj) {
                super(0, obj, Qv.class, "confirmOtp", "confirmOtp()V", 0);
            }

            public final void a() {
                ((Qv) this.receiver).b();
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
            return Qv.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f27556a;
            if (i11 == 0) {
                jn0.t.b(obj);
                InterfaceC3233ew interfaceC3233ew = Qv.this.f27549h;
                InterfaceC3233ew.a aVar = new InterfaceC3233ew.a(Qv.this.f27548g.a(), ((Gv) Qv.this.d().a()).p().c());
                this.f27556a = 1;
                objA = interfaceC3233ew.a(aVar, this);
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
            final Qv qv2 = Qv.this;
            Throwable thE = jn0.s.e(objA);
            if (thE == null) {
                InterfaceC3233ew.b bVar = (InterfaceC3233ew.b) objA;
                if (bVar instanceof InterfaceC3233ew.b.c) {
                    qv2.q();
                    qv2.a(Fv.f25879a);
                } else if (bVar instanceof InterfaceC3233ew.b.a) {
                    qv2.f27552k.handleRecoverableError(Jv.a.f26508b, "sign", new wn0.a() { // from class: com.fourthline.orca.internal.um0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Qv.b.a(qv2);
                        }
                    });
                } else {
                    if (!(bVar instanceof InterfaceC3233ew.b.C0558b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qv2.d().a(qv2.f27545d.t());
                }
            } else {
                qv2.f27551j.handleRecoverableError(AbstractC3039aE.a(thE), "sign", new a(qv2));
            }
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(Qv qv2) {
            qv2.f27546e.a(Dv.c.a.f25511a);
            return jn0.h0.f84049a;
        }
    }

    static final class d extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27565c;

        d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Qv.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Qv qv2;
            Iterator<Integer> it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f27565c;
            if (i11 == 0) {
                jn0.t.b(obj);
                bo0.h hVarS = bo0.n.s(((Gv) Qv.this.d().a()).r().c(), 1);
                qv2 = Qv.this;
                it = hVarS.iterator();
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f27564b;
                qv2 = (Qv) this.f27563a;
                jn0.t.b(obj);
            }
            while (it.hasNext()) {
                qv2.d().a(qv2.f27545d.c(((p013kotlin.collections.s0) it).nextInt()));
                long millis = TimeUnit.SECONDS.toMillis(1L);
                this.f27563a = qv2;
                this.f27564b = it;
                this.f27565c = 1;
                if (DelayKt.delay(millis, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Qv.this.d().a(Qv.this.f27545d.j());
            Qv.this.q();
            return jn0.h0.f84049a;
        }
    }

    static final class e extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27567a;

        /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.a {
            a(Object obj) {
                super(0, obj, Qv.class, "resendOtp", "resendOtp()V", 0);
            }

            public final void a() {
                ((Qv) this.receiver).p();
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return jn0.h0.f84049a;
            }
        }

        e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Qv.this.new e(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f27567a;
            if (i11 == 0) {
                jn0.t.b(obj);
                InterfaceC3703pv interfaceC3703pv = Qv.this.f27550i;
                InterfaceC3703pv.a aVar = new InterfaceC3703pv.a(Qv.this.f27548g.a());
                this.f27567a = 1;
                objA = interfaceC3703pv.a(aVar, this);
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
            final Qv qv2 = Qv.this;
            Throwable thE = jn0.s.e(objA);
            if (thE == null) {
                InterfaceC3703pv.b bVar = (InterfaceC3703pv.b) objA;
                if (!(bVar instanceof InterfaceC3703pv.b.C0597b)) {
                    if (bVar instanceof InterfaceC3703pv.b.a) {
                        qv2.f27552k.handleRecoverableError(Jv.a.f26508b, "sign", new wn0.a() { // from class: com.fourthline.orca.internal.wm0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Qv.e.a(qv2);
                            }
                        });
                    } else {
                        if (!(bVar instanceof InterfaceC3703pv.b.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qv2.f27551j.handleError(QesError.TooManyResendOtpAttempts.INSTANCE, "sign");
                    }
                }
            } else {
                qv2.f27551j.handleRecoverableError(AbstractC3039aE.a(thE), "sign", new a(qv2));
            }
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(Qv qv2) {
            qv2.f27546e.a(Dv.c.a.f25511a);
            return jn0.h0.f84049a;
        }
    }

    public Qv(Is presenter, C2874Gc effectHandler, Pv stateProvider, ND viewNavigator, ED viewCompletionHandler, Mv qesSignRepository, InterfaceC3233ew qesUserConfirmationWorker, InterfaceC3703pv qesResendOtpWorker, InterfaceC2931Re errorHandler, InterfaceC2931Re qesSignErrorHandler, InterfaceC4044xs popupHandler, InterfaceC3354ho analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(qesSignRepository, "qesSignRepository");
        p013kotlin.jvm.internal.s.k(qesUserConfirmationWorker, "qesUserConfirmationWorker");
        p013kotlin.jvm.internal.s.k(qesResendOtpWorker, "qesResendOtpWorker");
        p013kotlin.jvm.internal.s.k(errorHandler, "errorHandler");
        p013kotlin.jvm.internal.s.k(qesSignErrorHandler, "qesSignErrorHandler");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f27542a = coroutineScope;
        this.f27543b = presenter;
        this.f27544c = effectHandler;
        this.f27545d = stateProvider;
        this.f27546e = viewNavigator;
        this.f27547f = viewCompletionHandler;
        this.f27548g = qesSignRepository;
        this.f27549h = qesUserConfirmationWorker;
        this.f27550i = qesResendOtpWorker;
        this.f27551j = errorHandler;
        this.f27552k = qesSignErrorHandler;
        this.f27553l = popupHandler;
        this.f27554m = analytics;
    }

    private final void m() {
        this.f27554m.track(Cv.a.b.f25278a);
        this.f27551j.handleRecoverableError(QesError.Canceled.INSTANCE, "sign", new wn0.a() { // from class: com.fourthline.orca.internal.tm0
            @Override // wn0.a
            public final Object invoke() {
                return Qv.n();
            }
        });
        this.f27554m.track(Cv.a.f.f25282a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 n() {
        return jn0.h0.f84049a;
    }

    private final void o() {
        this.f27554m.track(Cv.a.h.f25284a);
        this.f27543b.a(this.f27545d.v());
        e();
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        Job job = this.f27555n;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f27555n = null;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f27542a.getCoroutineContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(null), 3, null);
    }

    private final void e() {
        q();
        this.f27555n = BuildersKt__Builders_commonKt.launch$default(this, null, null, new d(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dv f() {
        return Dv.a.f25509a;
    }

    private final void g() {
        this.f27554m.track(new Cv.a.d(((Gv) this.f27543b.a()).p().c().length()));
        this.f27543b.a(this.f27545d.o());
        this.f27544c.a(new wn0.a() { // from class: com.fourthline.orca.internal.rm0
            @Override // wn0.a
            public final Object invoke() {
                return Qv.h();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dv h() {
        return Dv.d.f25514a;
    }

    private final void i() {
        if (((Gv) this.f27543b.a()).p().getState() != Gh.UNFOCUSED) {
            this.f27554m.track(new Cv.a.c(((Gv) this.f27543b.a()).p().c().length()));
            this.f27544c.a(new wn0.a() { // from class: com.fourthline.orca.internal.sm0
                @Override // wn0.a
                public final Object invoke() {
                    return Qv.j();
                }
            });
            this.f27543b.a(this.f27545d.v());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dv j() {
        return Dv.b.f25510a;
    }

    private final void k() {
        this.f27554m.track(Cv.a.g.f25283a);
        this.f27543b.a(this.f27545d.u());
        b();
    }

    private final void l() {
        this.f27554m.track(Cv.a.e.f25281a);
        e();
    }

    public final C2874Gc c() {
        return this.f27544c;
    }

    public final Is d() {
        return this.f27543b;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(Ev event) throws IOException {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof Ev.a) {
            a(((Ev.a) event).a());
            return;
        }
        if (event instanceof Ev.b) {
            g();
            return;
        }
        if (event instanceof Ev.c) {
            i();
            return;
        }
        if (event instanceof Ev.d) {
            k();
            return;
        }
        if (event instanceof Ev.e) {
            l();
        } else if (event instanceof Ev.f) {
            m();
        } else {
            if (!(event instanceof Ev.g)) {
                throw new NoWhenBranchMatchedException();
            }
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Fv fv2) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(fv2, null), 3, null);
    }

    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27558a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fv f27560c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Fv fv2, Continuation continuation) {
            super(2, continuation);
            this.f27560c = fv2;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Qv.this.new c(this.f27560c, continuation);
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
                int r1 = r5.f27558a
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
                com.fourthline.orca.internal.Qv r6 = com.fourthline.orca.internal.Qv.this
                com.fourthline.orca.internal.ED r6 = com.fourthline.orca.internal.Qv.i(r6)
                com.fourthline.orca.internal.Fv r1 = r5.f27560c
                r5.f27558a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L32
                goto L45
            L32:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.Qv$c$a r1 = new com.fourthline.orca.internal.Qv$c$a
                com.fourthline.orca.internal.Qv r3 = com.fourthline.orca.internal.Qv.this
                com.fourthline.orca.internal.Fv r4 = r5.f27560c
                r1.<init>(r3, r4)
                r5.f27558a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.Qv.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Qv f27561a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Fv f27562b;

            a(Qv qv2, Fv fv2) {
                this.f27561a = qv2;
                this.f27562b = fv2;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(FD fd2, Continuation continuation) {
                if (!(fd2 instanceof FD.d) && !(fd2 instanceof FD.c)) {
                    if (fd2 instanceof FD.a) {
                        ND nd2 = this.f27561a.f27546e;
                        Of ofA = ((FD.a) fd2).a();
                        Xt xt2 = (Xt) (!(ofA instanceof Xt) ? null : ofA);
                        if (xt2 == null) {
                            throw new IllegalStateException((ofA.getClass().getSimpleName() + " are not accepted by this Coordinator.").toString());
                        }
                        nd2.a(new Dv.c.C0482c(xt2));
                    } else {
                        if (!(fd2 instanceof FD.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Bo boA = ((FD.b) fd2).a();
                        final Qv qv2 = this.f27561a;
                        final Fv fv2 = this.f27562b;
                        this.f27561a.f27553l.a(new Ds.c(boA, null, new wn0.a() { // from class: com.fourthline.orca.internal.vm0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Qv.c.a.a(qv2, fv2);
                            }
                        }, 2, null));
                    }
                }
                return jn0.h0.f84049a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jn0.h0 a(Qv qv2, Fv fv2) {
                qv2.a(fv2);
                return jn0.h0.f84049a;
            }
        }
    }

    private final void a(String str) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        this.f27543b.a(this.f27545d.a(string));
        if (string.length() == this.f27548g.b().a()) {
            this.f27544c.a(new wn0.a() { // from class: com.fourthline.orca.internal.qm0
                @Override // wn0.a
                public final Object invoke() {
                    return Qv.f();
                }
            });
        }
    }
}
