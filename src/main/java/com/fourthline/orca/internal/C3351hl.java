package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3351hl implements InterfaceC2891Je {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gl f32326a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.hl$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f32327a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f32329c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32327a = obj;
            this.f32329c |= Integer.MIN_VALUE;
            Object objA = C3351hl.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3351hl(Gl networkService) {
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        this.f32326a = networkService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC2891Je
    public Object a(InterfaceC2891Je.a aVar, Continuation continuation) {
        a aVar2;
        Object objA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f32329c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f32329c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f32327a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f32329c;
        if (i12 == 0) {
            jn0.t.b(obj);
            Gl gl2 = this.f32326a;
            Cl.a aVar3 = new Cl.a("workflow_eid_token_url", Cl.b.POST, "/v1/workflows/" + aVar.a() + "/eid/tc-token-url", null, null, null, 56, null);
            aVar2.f32329c = 1;
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
            wo0.b bVarA = Ki.a();
            String string = dl2.a().toString();
            bVarA.getSerializersModule();
            return jn0.s.b(new InterfaceC2891Je.b.a(((TcTokenUrlResponse) bVarA.d(TcTokenUrlResponse.INSTANCE.serializer(), string)).getTcTokenUrl()));
        }
        if (El.d(dl2)) {
            return jn0.s.b(jn0.t.a(ZD.c.f30009a));
        }
        return jn0.s.b(jn0.t.a(new ZD.b("NetworkEidWorkflowTokenUrlWorker." + dl2.c())));
    }
}
