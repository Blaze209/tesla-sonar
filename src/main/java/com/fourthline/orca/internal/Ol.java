package com.fourthline.orca.internal;

import java.util.Map;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Ol implements InterfaceC3681pF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gl f27192a;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27194b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f27196d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27194b = obj;
            this.f27196d |= Integer.MIN_VALUE;
            Object objA = Ol.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Ol(Gl networkService) {
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        this.f27192a = networkService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.fourthline.orca.internal.InterfaceC3681pF
    public Object a(InterfaceC3681pF.a aVar, Continuation continuation) {
        a aVar2;
        Object objA;
        Ol ol2;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f27196d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f27196d = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f27194b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f27196d;
        if (i12 == 0) {
            jn0.t.b(obj);
            Gl gl2 = this.f27192a;
            String str = "/v1/workflows/" + aVar.b() + "/session";
            Cl.b bVar = Cl.b.POST;
            Map mapA = AbstractC3345hf.a();
            mapA.put("apikey", aVar.b());
            wo0.b bVarA = Ki.a();
            WorkflowStartSessionRequest c3595nF = new WorkflowStartSessionRequest("1", aVar.a(), "3.2.22", "Mobile", "android");
            bVarA.getSerializersModule();
            Cl.a aVar3 = new Cl.a("workflow_start_session", bVar, str, mapA, null, AbstractC3885u5.a(bVarA.b(WorkflowStartSessionRequest.INSTANCE.serializer(), c3595nF)), 16, null);
            aVar2.f27193a = this;
            aVar2.f27196d = 1;
            objA = gl2.a(aVar3, aVar2);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            ol2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ol2 = (Ol) aVar2.f27193a;
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
                wo0.b bVarA2 = Ki.a();
                String strB = El.b(dl2);
                bVarA2.getSerializersModule();
                return jn0.s.b(new InterfaceC3681pF.b.C0596b((WorkflowStartSessionResponse) bVarA2.d(WorkflowStartSessionResponse.INSTANCE.serializer(), strB), ol2.f27192a.a()));
            } catch (Throwable th2) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                return jn0.s.b(jn0.t.a(AbstractC3039aE.a(th2)));
            }
        }
        if (dl2.c() == 401 || dl2.c() == 404) {
            return jn0.s.b(InterfaceC3681pF.b.a.f34473a);
        }
        if (El.d(dl2)) {
            return jn0.s.b(jn0.t.a(ZD.c.f30009a));
        }
        return jn0.s.b(jn0.t.a(new ZD.b("NetworkWorkflowStartSessionWorker." + dl2.c())));
    }
}
