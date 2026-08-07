package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4045xt implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f36800p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f36801q = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f36802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f36803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4002wt f36804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ND f36805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3786rt f36806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3872tt f36807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3230et f36808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3788rv f36809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3106bw f36810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC2931Re f36811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC3354ho f36812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC3788rv.b.a f36813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f36814m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f36815n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f36816o;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.xt$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.xt$b */
    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36817a;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.xt$b$a */
        /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.a {
            a(Object obj) {
                super(0, obj, C4045xt.class, "authorizeUser", "authorizeUser()V", 0);
            }

            public final void a() {
                ((C4045xt) this.receiver).b();
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
            return C4045xt.this.new b(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:27:0x00cd A[LOOP:3: B:25:0x00c7->B:27:0x00cd, LOOP_END] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C4045xt c4045xt;
            ArrayList arrayList;
            Iterator it;
            List listP0;
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f36817a;
            if (i11 == 0) {
                jn0.t.b(obj);
                InterfaceC3106bw interfaceC3106bw = C4045xt.this.f36810i;
                String strA = C4045xt.this.f36806e.a();
                List list = C4045xt.this.f36814m;
                C4045xt c4045xt2 = C4045xt.this;
                ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(c4045xt2.a((InterfaceC3788rv.b.a.C0611b) it2.next()));
                }
                List list2 = C4045xt.this.f36816o;
                if (list2 != null) {
                    C4045xt c4045xt3 = C4045xt.this;
                    List list3 = c4045xt3.f36815n;
                    ArrayList arrayList3 = new ArrayList(p013kotlin.collections.v.y(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(c4045xt3.a((InterfaceC3788rv.b.a.C0610a) it3.next()));
                    }
                    ArrayList arrayList4 = new ArrayList(p013kotlin.collections.v.y(list2, 10));
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(c4045xt3.a((InterfaceC3746qv.a.C0603a.C0604a) it4.next()));
                    }
                    listP0 = p013kotlin.collections.v.P0(arrayList3, arrayList4);
                    if (listP0 == null) {
                        List list4 = C4045xt.this.f36815n;
                        c4045xt = C4045xt.this;
                        arrayList = new ArrayList(p013kotlin.collections.v.y(list4, 10));
                        it = list4.iterator();
                        while (it.hasNext()) {
                            arrayList.add(c4045xt.a((InterfaceC3788rv.b.a.C0610a) it.next()));
                        }
                        listP0 = arrayList;
                    }
                } else {
                    List list5 = C4045xt.this.f36815n;
                    c4045xt = C4045xt.this;
                    arrayList = new ArrayList(p013kotlin.collections.v.y(list5, 10));
                    it = list5.iterator();
                    while (it.hasNext()) {
                        arrayList.add(c4045xt.a((InterfaceC3788rv.b.a.C0610a) it.next()));
                    }
                    listP0 = arrayList;
                }
                InterfaceC3106bw.a aVar = new InterfaceC3106bw.a(strA, arrayList2, listP0);
                this.f36817a = 1;
                objA = interfaceC3106bw.a(aVar, this);
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
            C4045xt c4045xt4 = C4045xt.this;
            Throwable thE = jn0.s.e(objA);
            if (thE == null) {
                InterfaceC3106bw.b bVar = (InterfaceC3106bw.b) objA;
                if (bVar instanceof InterfaceC3106bw.b.a) {
                    c4045xt4.j();
                } else {
                    if (!(bVar instanceof InterfaceC3106bw.b.C0547b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c4045xt4.k();
                }
            } else {
                c4045xt4.f36811j.handleRecoverableError(AbstractC3039aE.a(thE), "agreements", new a(c4045xt4));
            }
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.xt$c */
    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36819a;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.xt$c$a */
        /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.a {
            a(Object obj) {
                super(0, obj, C4045xt.class, "retrieveSigningDetails", "retrieveSigningDetails()V", 0);
            }

            public final void a() {
                ((C4045xt) this.receiver).l();
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return jn0.h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.xt$c$b */
        /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.a {
            b(Object obj) {
                super(0, obj, C4045xt.class, "retrieveSigningDetails", "retrieveSigningDetails()V", 0);
            }

            public final void a() {
                ((C4045xt) this.receiver).l();
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return jn0.h0.f84049a;
            }
        }

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
            return C4045xt.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f36819a;
            if (i11 == 0) {
                jn0.t.b(obj);
                InterfaceC3788rv interfaceC3788rv = C4045xt.this.f36809h;
                InterfaceC3788rv.a aVar = new InterfaceC3788rv.a(C4045xt.this.f36806e.a());
                this.f36819a = 1;
                objA = interfaceC3788rv.a(aVar, this);
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
            C4045xt c4045xt = C4045xt.this;
            Throwable thE = jn0.s.e(objA);
            if (thE == null) {
                c4045xt.a(((InterfaceC3788rv.b) objA).a());
            } else {
                ZD zdA = AbstractC3039aE.a(thE);
                if (zdA instanceof ZD.c) {
                    c4045xt.f36811j.handleRecoverableError(AbstractC3658ot.a.f34379a, "agreements", new a(c4045xt));
                } else {
                    c4045xt.f36811j.handleRecoverableError(zdA, "agreements", new b(c4045xt));
                }
            }
            return jn0.h0.f84049a;
        }
    }

    public C4045xt(Is presenter, C4002wt stateProvider, ND viewNavigator, InterfaceC3786rt repository, InterfaceC3872tt resultRepository, InterfaceC3230et activePdfRepository, InterfaceC3788rv qesRetrieveSigningDetailsWorker, InterfaceC3106bw qesUserAuthorizationWorker, InterfaceC2931Re errorHandler, InterfaceC3354ho analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(activePdfRepository, "activePdfRepository");
        p013kotlin.jvm.internal.s.k(qesRetrieveSigningDetailsWorker, "qesRetrieveSigningDetailsWorker");
        p013kotlin.jvm.internal.s.k(qesUserAuthorizationWorker, "qesUserAuthorizationWorker");
        p013kotlin.jvm.internal.s.k(errorHandler, "errorHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f36802a = coroutineScope;
        this.f36803b = presenter;
        this.f36804c = stateProvider;
        this.f36805d = viewNavigator;
        this.f36806e = repository;
        this.f36807f = resultRepository;
        this.f36808g = activePdfRepository;
        this.f36809h = qesRetrieveSigningDetailsWorker;
        this.f36810i = qesUserAuthorizationWorker;
        this.f36811j = errorHandler;
        this.f36812k = analytics;
        this.f36814m = p013kotlin.collections.v.m();
        this.f36815n = p013kotlin.collections.v.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(null), 3, null);
    }

    private final void m() {
        this.f36803b.a(this.f36804c.a(this.f36814m, this.f36815n, this.f36816o));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f36802a.getCoroutineContext();
    }

    private final void b(boolean z11) {
        this.f36812k.track(new C3316gt.a.j(z11));
        this.f36803b.a(this.f36804c.e(z11));
    }

    private final void d() {
        this.f36803b.a(this.f36804c.o());
        this.f36812k.track(C3316gt.a.f.f32086a);
        b();
    }

    private final void e() {
        this.f36812k.track(C3316gt.a.d.f32084a);
        if (this.f36813l == null) {
            l();
        } else {
            m();
        }
    }

    private final void f() {
        this.f36811j.handleRecoverableError(QesError.Canceled.INSTANCE, "agreements", new wn0.a() { // from class: com.fourthline.orca.internal.fi1
            @Override // wn0.a
            public final Object invoke() {
                return C4045xt.g();
            }
        });
        this.f36812k.track(C3316gt.a.b.f32082a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 g() {
        return jn0.h0.f84049a;
    }

    private final void h() {
        this.f36812k.track(C3316gt.a.g.f32087a);
    }

    private final void i() {
        this.f36812k.track(C3316gt.a.h.f32088a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        this.f36805d.a(InterfaceC3443jt.b.f32839a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        this.f36811j.handleError(QesError.TooManyAuthorizationAttempts.INSTANCE, "agreements");
    }

    public final Is c() {
        return this.f36803b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(null), 3, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(InterfaceC3486kt event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof InterfaceC3486kt.d) {
            e();
            return;
        }
        if (event instanceof InterfaceC3486kt.b) {
            a(((InterfaceC3486kt.b) event).a());
            return;
        }
        if (event instanceof InterfaceC3486kt.c) {
            d();
            return;
        }
        if (event instanceof InterfaceC3486kt.e) {
            f();
            return;
        }
        if (event instanceof InterfaceC3486kt.f) {
            h();
            return;
        }
        if (event instanceof InterfaceC3486kt.g) {
            i();
        } else if (event instanceof InterfaceC3486kt.h) {
            b(((InterfaceC3486kt.h) event).a());
        } else {
            if (!(event instanceof InterfaceC3486kt.a)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((InterfaceC3486kt.a) event).a());
        }
    }

    private final void a(boolean z11) {
        this.f36812k.track(new C3316gt.a.c(z11));
        this.f36803b.a(this.f36804c.d(z11));
    }

    private final void a(C3529lt.a.InterfaceC0579a interfaceC0579a) {
        if (interfaceC0579a instanceof C3529lt.a.InterfaceC0579a.b) {
            a((C3529lt.a.InterfaceC0579a.b) interfaceC0579a);
        } else {
            if (!(interfaceC0579a instanceof C3529lt.a.InterfaceC0579a.C0580a)) {
                throw new NoWhenBranchMatchedException();
            }
            a((C3529lt.a.InterfaceC0579a.C0580a) interfaceC0579a);
        }
    }

    private final void a(C3529lt.a.InterfaceC0579a.C0580a c0580a) {
        Object next;
        Iterator it = this.f36815n.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p013kotlin.jvm.internal.s.f(((InterfaceC3788rv.b.a.C0610a) next).c(), c0580a.a()));
        InterfaceC3788rv.b.a.C0610a c0610a = (InterfaceC3788rv.b.a.C0610a) next;
        if (c0610a != null) {
            this.f36808g.a(c0610a.c(), c0610a.a());
            this.f36812k.track(new C3316gt.a.e(this.f36815n.indexOf(c0610a)));
            this.f36805d.a(InterfaceC3443jt.c.f32840a);
            return;
        }
        throw new IllegalStateException("Developer error. Document should exist at this point!");
    }

    private final void a(C3529lt.a.InterfaceC0579a.b bVar) {
        Object next;
        Iterator it = this.f36814m.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p013kotlin.jvm.internal.s.f(((InterfaceC3788rv.b.a.C0611b) next).c(), bVar.b()));
        InterfaceC3788rv.b.a.C0611b c0611b = (InterfaceC3788rv.b.a.C0611b) next;
        if (c0611b != null) {
            this.f36808g.a(c0611b.c(), c0611b.a());
            this.f36812k.track(new C3316gt.a.i(this.f36814m.indexOf(c0611b)));
            this.f36805d.a(InterfaceC3443jt.c.f32840a);
            return;
        }
        throw new IllegalStateException("Developer error. Document should exist at this point!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InterfaceC3788rv.b.a aVar) {
        this.f36813l = aVar;
        this.f36807f.a(aVar.c());
        this.f36807f.a(aVar.d());
        InterfaceC3872tt interfaceC3872tt = this.f36807f;
        List listE = aVar.e();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listE, 10));
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC3788rv.b.a.C0611b) it.next()).c());
        }
        interfaceC3872tt.a(arrayList);
        this.f36814m = aVar.e();
        this.f36815n = aVar.b();
        this.f36816o = aVar.a();
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3106bw.a.C0545a a(InterfaceC3788rv.b.a.C0610a c0610a) {
        return new InterfaceC3106bw.a.C0545a(c0610a.b(), c0610a.d(), c0610a.e(), c0610a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3106bw.a.C0545a a(InterfaceC3746qv.a.C0603a.C0604a c0604a) {
        return new InterfaceC3106bw.a.C0545a(c0604a.a(), null, c0604a.c(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3106bw.a.b a(InterfaceC3788rv.b.a.C0611b c0611b) {
        return InterfaceC3106bw.a.b.f30725c.a(c0611b.b(), c0611b.a());
    }
}
