package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Ll implements XC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gl f26824a;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26825a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f26827c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26825a = obj;
            this.f26827c |= Integer.MIN_VALUE;
            Object objA = Ll.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Ll(Gl networkService) {
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        this.f26824a = networkService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.XC
    public Object a(XC.a aVar, Continuation continuation) {
        a aVar2;
        Object objA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f26827c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f26827c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f26825a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f26827c;
        if (i12 == 0) {
            jn0.t.b(obj);
            Gl gl2 = this.f26824a;
            Cl.a aVar3 = new Cl.a("workflow_complete_onboarding", Cl.b.POST, "/v1/onboarding/verifications/" + aVar.a() + "/completeOnboarding", AbstractC3345hf.a(), null, null, 48, null);
            aVar2.f26827c = 1;
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
            return jn0.s.b(XC.b.a.f29714a);
        }
        if (El.d(dl2)) {
            return jn0.s.b(jn0.t.a(ZD.c.f30009a));
        }
        return jn0.s.b(jn0.t.a(new ZD.b("NetworkUploadIdvCompleteOnboardingWorker." + dl2.c())));
    }
}
