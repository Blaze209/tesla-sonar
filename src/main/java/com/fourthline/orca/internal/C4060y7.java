package com.fourthline.orca.internal;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.AbstractCoroutineContextElement;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.y7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4060y7 implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f36907n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f36908o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Is f36909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3801s7 f36910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2874Gc f36911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4044xs f36912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3354ho f36913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ND f36914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CoroutineScope f36915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Y6 f36916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3544m7 f36917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Job f36918j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Job f36919k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f36920l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final CoroutineExceptionHandler f36921m;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.y7$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.y7$b */
    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36922a;

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
            return C4060y7.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f36922a;
            if (i11 == 0) {
                jn0.t.b(obj);
                C4060y7.this.c().a(C4060y7.this.d().r());
                io0.b.Companion companion = io0.b.INSTANCE;
                long jS = io0.d.s(2, io0.e.SECONDS);
                this.f36922a = 1;
                if (DelayKt.m506delayVtjQ1oo(jS, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            C4060y7.this.f36913e.track(P6.a.d.f27280a);
            C4060y7.this.e();
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.y7$c */
    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36924a;

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
            return C4060y7.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f36924a;
            if (i11 == 0) {
                jn0.t.b(obj);
                io0.b.Companion companion = io0.b.INSTANCE;
                long jS = io0.d.s(5, io0.e.SECONDS);
                this.f36924a = 1;
                if (DelayKt.m506delayVtjQ1oo(jS, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            C4060y7.this.c().a(C4060y7.this.d().o());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.y7$d */
    static final class d extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36926a;

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
            return C4060y7.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f36926a;
            if (i11 == 0) {
                jn0.t.b(obj);
                io0.b.Companion companion = io0.b.INSTANCE;
                long jT = io0.d.t(C4060y7.this.f36917i.c(), io0.e.MILLISECONDS);
                this.f36926a = 1;
                if (DelayKt.m506delayVtjQ1oo(jT, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            C4060y7.this.f36913e.track(P6.a.e.f27281a);
            C4060y7.this.e();
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.y7$e */
    public static final class e extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4060y7 f36928a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CoroutineExceptionHandler.Companion companion, C4060y7 c4060y7) {
            super(companion);
            this.f36928a = c4060y7;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f36928a.f36913e.track(new P6.a.c(th2));
            this.f36928a.e();
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.y7$f */
    static final class f extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36929a;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.y7$f$a */
        /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l {
            a(Object obj) {
                super(1, obj, C4060y7.class, "handleAnalysisResult", "handleAnalysisResult(Lcom/fourthline/orca/core/internal/capabilities/documentrecognition/network/analysis/DocumentAnalysisResult;)V", 0);
            }

            public final void a(InterfaceC3630o7 p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                ((C4060y7) this.receiver).b(p11);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC3630o7) obj);
                return jn0.h0.f84049a;
            }
        }

        f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C4060y7.this.new f(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f36929a;
            if (i11 == 0) {
                jn0.t.b(obj);
                C4060y7.this.f36916h.a(C4060y7.this.f36920l, new a(C4060y7.this));
                Y6 y11 = C4060y7.this.f36916h;
                String str = C4060y7.this.f36920l;
                this.f36929a = 1;
                if (y11.a(str, this) == coroutine_suspended) {
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

    public C4060y7(Is presenter, C3801s7 stateProvider, C2874Gc effectHandler, InterfaceC4044xs popupHandler, InterfaceC3354ho analytics, ND viewNavigator, CoroutineScope coroutineScope, Y6 documentAnalysisManager, InterfaceC3544m7 repository) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(documentAnalysisManager, "documentAnalysisManager");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        this.f36909a = presenter;
        this.f36910b = stateProvider;
        this.f36911c = effectHandler;
        this.f36912d = popupHandler;
        this.f36913e = analytics;
        this.f36914f = viewNavigator;
        this.f36915g = coroutineScope;
        this.f36916h = documentAnalysisManager;
        this.f36917i = repository;
        this.f36920l = repository.b();
        this.f36921m = new e(CoroutineExceptionHandler.INSTANCE, this);
    }

    private final void f() {
        b();
        this.f36914f.a(T6.a.f27836a);
    }

    private final void g() {
        this.f36913e.track(new P6.a.b(this.f36917i.a()));
        h();
        i();
    }

    private final void h() {
        this.f36918j = BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(null), 3, null);
        this.f36919k = BuildersKt__Builders_commonKt.launch$default(this, null, null, new d(null), 3, null);
    }

    private final void i() {
        BuildersKt__Builders_commonKt.launch$default(this.f36915g, this.f36921m, null, new f(null), 2, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f36915g.getCoroutineContext();
    }

    private final void b() {
        this.f36916h.a(this.f36920l, new wn0.l() { // from class: com.fourthline.orca.internal.wi1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4060y7.a((InterfaceC3630o7) obj);
            }
        });
        Job job = this.f36918j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f36918j = null;
        Job job2 = this.f36919k;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.f36919k = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        b();
        this.f36914f.a(T6.d.f27839a);
    }

    public final Is c() {
        return this.f36909a;
    }

    public final C3801s7 d() {
        return this.f36910b;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(U6 event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof U6.b) {
            g();
        } else {
            if (!(event instanceof U6.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(InterfaceC3630o7 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(InterfaceC3630o7 interfaceC3630o7) {
        b();
        if (interfaceC3630o7 instanceof InterfaceC3630o7.a) {
            b((InterfaceC3630o7.a) interfaceC3630o7);
        } else {
            if (interfaceC3630o7 instanceof InterfaceC3630o7.b) {
                this.f36913e.track(P6.a.d.f27280a);
                e();
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C4060y7 c4060y7, InterfaceC3630o7.a aVar) {
        c4060y7.a(aVar);
        return jn0.h0.f84049a;
    }

    private final void a(InterfaceC3630o7.a aVar) {
        this.f36917i.a(aVar);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(null), 3, null);
    }

    private final void b(final InterfaceC3630o7.a aVar) {
        this.f36913e.track(new P6.a.f(aVar.a(), aVar.b(), aVar.c()));
        if (!aVar.c().isEmpty()) {
            AbstractC3641oc abstractC3641oc = (AbstractC3641oc) p013kotlin.collections.v.o0(aVar.c());
            Ds.c cVar = new Ds.c(abstractC3641oc, "", null, 4, null);
            if (!(abstractC3641oc instanceof AbstractC3641oc.f) && !(abstractC3641oc instanceof AbstractC3641oc.g) && !(abstractC3641oc instanceof AbstractC3641oc.d) && !(abstractC3641oc instanceof AbstractC3641oc.e)) {
                this.f36912d.a(cVar);
                return;
            } else {
                InterfaceC4044xs.a.a(this.f36912d, cVar, null, new wn0.a() { // from class: com.fourthline.orca.internal.vi1
                    @Override // wn0.a
                    public final Object invoke() {
                        return C4060y7.a(this.f36121a, aVar);
                    }
                }, 2, null);
                return;
            }
        }
        a(aVar);
    }
}
