package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Pl implements InterfaceC3852tF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gl f27346a;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27347a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27349c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27347a = obj;
            this.f27349c |= Integer.MIN_VALUE;
            Object objA = Pl.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Pl(Gl networkService) {
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        this.f27346a = networkService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3852tF
    public Object a(InterfaceC3852tF.a aVar, Continuation continuation) {
        a aVar2;
        Object objA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f27349c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f27349c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f27347a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f27349c;
        if (i12 == 0) {
            jn0.t.b(obj);
            Gl gl2 = this.f27346a;
            Cl.a aVar3 = new Cl.a("workflow_status", Cl.b.GET, "/v1/workflows/" + aVar.a() + "/status", AbstractC3345hf.a(), null, null, 48, null);
            aVar2.f27349c = 1;
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
            try {
                return jn0.s.b(new InterfaceC3852tF.b(AbstractC3766rF.a(Ki.a(), El.b(dl2))));
            } catch (Throwable th2) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                return jn0.s.b(jn0.t.a(AbstractC3039aE.a(th2)));
            }
        }
        if (El.d(dl2)) {
            return jn0.s.b(jn0.t.a(ZD.c.f30009a));
        }
        return jn0.s.b(jn0.t.a(new ZD.b("NetworkWorkflowStatusWorker." + dl2.c())));
    }
}
