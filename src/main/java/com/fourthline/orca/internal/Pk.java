package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Pk implements InterfaceC3624o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gl f27342a;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27343a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27345c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27343a = obj;
            this.f27345c |= Integer.MIN_VALUE;
            Object objA = Pk.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Pk(Gl networkService) {
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        this.f27342a = networkService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3624o1
    public Object a(InterfaceC3624o1.b bVar, Continuation continuation) {
        a aVar;
        Object objA;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f27345c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f27345c = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f27343a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f27345c;
        if (i12 == 0) {
            jn0.t.b(obj);
            Gl gl2 = this.f27342a;
            Cl.a aVar2 = new Cl.a("confirm_iban", Cl.b.POST, "/v1/onboarding/referencePayments/" + bVar.a() + "/iban/confirm", AbstractC3345hf.a(), null, null, 48, null);
            aVar.f27345c = 1;
            objA = gl2.a(aVar2, aVar);
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
                wo0.b bVarA = Ki.a();
                String string = dl2.a().toString();
                bVarA.getSerializersModule();
                return jn0.s.b(new InterfaceC3624o1.c((InterfaceC3624o1.BavConfirmIbanResult) bVarA.d(InterfaceC3624o1.BavConfirmIbanResult.INSTANCE.serializer(), string)));
            } catch (Throwable th2) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                return jn0.s.b(jn0.t.a(AbstractC3039aE.a(th2)));
            }
        }
        if (El.d(dl2)) {
            return jn0.s.b(jn0.t.a(ZD.c.f30009a));
        }
        return jn0.s.b(jn0.t.a(new ZD.b("NetworkBavConfirmIbanWorker." + dl2.c())));
    }
}
