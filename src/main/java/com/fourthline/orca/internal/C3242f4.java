package com.fourthline.orca.internal;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3242f4 implements InterfaceC4044xs, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f31603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bs f31604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3354ho f31605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CoroutineScope f31606d;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.f4$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31607a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Cs f31609c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ds f31610d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a f31611e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.a f31612f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Cs cs2, Ds ds2, wn0.a aVar, wn0.a aVar2, Continuation continuation) {
            super(2, continuation);
            this.f31609c = cs2;
            this.f31610d = ds2;
            this.f31611e = aVar;
            this.f31612f = aVar2;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3242f4.this.new a(this.f31609c, this.f31610d, this.f31611e, this.f31612f, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f31607a;
            if (i11 == 0) {
                jn0.t.b(obj);
                Bs bs2 = C3242f4.this.f31604b;
                InterfaceC4001ws state = this.f31609c.getState();
                this.f31607a = 1;
                obj = bs2.a(state, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            InterfaceC3958vs interfaceC3958vs = (InterfaceC3958vs) obj;
            if (interfaceC3958vs instanceof InterfaceC3958vs.a) {
                C3242f4.this.a(this.f31609c, this.f31610d, ((InterfaceC3958vs.a) interfaceC3958vs).a(), this.f31611e);
            } else if (interfaceC3958vs instanceof InterfaceC3958vs.b) {
                C3242f4.this.b(this.f31609c, this.f31610d, ((InterfaceC3958vs.b) interfaceC3958vs).a(), this.f31612f);
            } else if (!(interfaceC3958vs instanceof InterfaceC3958vs.c)) {
                throw new NoWhenBranchMatchedException();
            }
            return jn0.h0.f84049a;
        }
    }

    public C3242f4(List providers, Bs presenter, InterfaceC3354ho analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(providers, "providers");
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f31603a = providers;
        this.f31604b = presenter;
        this.f31605c = analytics;
        this.f31606d = coroutineScope;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f31606d.getCoroutineContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Cs cs2, Ds ds2, InterfaceC3807sD interfaceC3807sD, wn0.a aVar) {
        this.f31605c.track(new C3785rs.a.d(ds2, interfaceC3807sD));
        if (aVar != null) {
            aVar.invoke();
            return;
        }
        if ((cs2 instanceof Cs.a) && (ds2 instanceof Ds.c)) {
            ((Cs.a) cs2).b((Ds.c) ds2);
        } else if (cs2 instanceof Cs.b) {
            ((Cs.b) cs2).d();
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC4044xs
    public void a(Ds popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        a(popupType, null, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC4044xs
    public void a(Ds popupType, wn0.a aVar, wn0.a aVar2) {
        Object next;
        C3242f4 c3242f4 = this;
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        Iterator it = c3242f4.f31603a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!c3242f4.a((Cs) next, popupType));
        Cs cs2 = (Cs) next;
        if (cs2 != null) {
            c3242f4.f31605c.track(new C3785rs.a.b(popupType));
            c3242f4 = this;
            if (BuildersKt__Builders_commonKt.launch$default(c3242f4, null, null, new a(cs2, popupType, aVar, aVar2, null), 3, null) != null) {
                return;
            }
        }
        AbstractC3989wg.a("No provider was found for the popup type " + popupType + ". Registered providers are: " + p013kotlin.collections.v.y0(c3242f4.f31603a, null, null, null, 0, null, new wn0.l() { // from class: com.fourthline.orca.internal.p11
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3242f4.a((Cs) obj);
            }
        }, 31, null));
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence a(Cs it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        String simpleName = it.getClass().getSimpleName();
        p013kotlin.jvm.internal.s.j(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Cs cs2, Ds ds2, InterfaceC3807sD interfaceC3807sD, wn0.a aVar) {
        this.f31605c.track(new C3785rs.a.c(ds2, interfaceC3807sD));
        if (aVar != null) {
            aVar.invoke();
            return;
        }
        if ((cs2 instanceof Cs.a) && (ds2 instanceof Ds.c)) {
            ((Cs.a) cs2).a((Ds.c) ds2);
        } else if (cs2 instanceof Cs.b) {
            ((Cs.b) cs2).c();
        }
    }

    private final boolean a(Cs cs2, Ds ds2) {
        if (cs2 instanceof Cs.a) {
            if (ds2 instanceof Ds.c) {
                return p013kotlin.jvm.internal.s.f(((Ds.c) ds2).c().getClass(), ((Cs.a) cs2).e().getClass());
            }
            return false;
        }
        if (cs2 instanceof Cs.b) {
            return p013kotlin.jvm.internal.s.f(ds2, ((Cs.b) cs2).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
