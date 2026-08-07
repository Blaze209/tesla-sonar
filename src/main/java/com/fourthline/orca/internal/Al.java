package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Al implements InterfaceC3233ew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.l f24967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Gl f24968b;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24969a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f24971c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f24969a = obj;
            this.f24971c |= Integer.MIN_VALUE;
            Object objA = Al.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Al(wn0.l endpoint, Gl networkService) {
        p013kotlin.jvm.internal.s.k(endpoint, "endpoint");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        this.f24967a = endpoint;
        this.f24968b = networkService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3233ew
    public Object a(InterfaceC3233ew.a aVar, Continuation continuation) {
        a aVar2;
        Object objA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f24971c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f24971c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f24969a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f24971c;
        if (i12 == 0) {
            jn0.t.b(obj);
            Gl gl2 = this.f24968b;
            Cl.a aVar3 = new Cl.a("qes_user_confirm", Cl.b.POST, ((C2911Ne) this.f24967a.invoke(aVar.b())).a(), null, null, AbstractC3885u5.a(Bl.b(new C3148cw(aVar.a()))), 24, null);
            aVar2.f24971c = 1;
            objA = gl2.a(aVar3, aVar2);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            objA = ((jn0.s) obj).getValue();
        }
        Throwable thE = jn0.s.e(objA);
        if (thE != null) {
            return jn0.s.b(jn0.t.a(AbstractC3039aE.a(thE)));
        }
        Dl dl2 = (Dl) objA;
        if (El.e(dl2)) {
            return jn0.s.b(InterfaceC3233ew.b.c.f31550a);
        }
        if (dl2.c() == 409) {
            return jn0.s.b(InterfaceC3233ew.b.C0558b.f31549a);
        }
        if (dl2.c() == 429) {
            return jn0.s.b(InterfaceC3233ew.b.a.f31548a);
        }
        if (El.d(dl2)) {
            return jn0.s.b(jn0.t.a(ZD.c.f30009a));
        }
        return jn0.s.b(jn0.t.a(new ZD.b("NetworkQesUserConfirmationWorker." + dl2.c())));
    }
}
