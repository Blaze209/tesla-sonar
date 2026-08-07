package com.fourthline.orca.internal;

import com.fourthline.orca.Orca;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Ml implements InterfaceC3508lE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gl f26951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Orca.a f26952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3438jo f26953c;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f26954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f26955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f26956c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f26958e;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26956c = obj;
            this.f26958e |= Integer.MIN_VALUE;
            Object objA = Ml.this.a((InterfaceC3508lE.a) null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Ml(Gl networkService, Orca.a integration, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        p013kotlin.jvm.internal.s.k(integration, "integration");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f26951a = networkService;
        this.f26952b = integration;
        this.f26953c = tracker;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.fourthline.orca.internal.InterfaceC3508lE
    public Object a(InterfaceC3508lE.a aVar, Continuation continuation) {
        a aVar2;
        Object objA;
        Ml ml2;
        InterfaceC3508lE.a aVar3;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f26958e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f26958e = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f26956c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f26958e;
        if (i12 == 0) {
            jn0.t.b(obj);
            Gl gl2 = this.f26951a;
            Cl.a aVar4 = new Cl.a("workflow_configuration", Cl.b.GET, "/v1/workflows/" + aVar.a() + "/configuration?userAgent=Mobile", AbstractC3345hf.a(), null, null, 48, null);
            aVar2.f26954a = this;
            aVar2.f26955b = aVar;
            aVar2.f26958e = 1;
            objA = gl2.a(aVar4, aVar2);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            ml2 = this;
            aVar3 = aVar;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar3 = (InterfaceC3508lE.a) aVar2.f26955b;
            ml2 = (Ml) aVar2.f26954a;
            jn0.t.b(obj);
            objA = ((jn0.s) obj).getValue();
        }
        Throwable thE = jn0.s.e(objA);
        if (thE != null) {
            return jn0.s.b(jn0.t.a(AbstractC3039aE.a(thE)));
        }
        Dl dl2 = (Dl) objA;
        if (!El.e(dl2)) {
            if (El.d(dl2)) {
                return jn0.s.b(jn0.t.a(ZD.c.f30009a));
            }
            return jn0.s.b(jn0.t.a(new ZD.b("NetworkWorkflowConfigurationWorker." + dl2.c())));
        }
        try {
            String strB = El.b(dl2);
            wo0.b bVarA = Ki.a();
            bVarA.getSerializersModule();
            WorkflowConfigurationResponse workflowConfigurationResponse = (WorkflowConfigurationResponse) bVarA.d(WorkflowConfigurationResponse.INSTANCE.serializer(), strB);
            ml2.a(workflowConfigurationResponse, aVar3);
            return jn0.s.b(new InterfaceC3508lE.b(workflowConfigurationResponse));
        } catch (Throwable th2) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return jn0.s.b(jn0.t.a(AbstractC3039aE.a(th2)));
        }
    }

    private final void a(WorkflowConfigurationResponse workflowConfigurationResponse, InterfaceC3508lE.a aVar) {
        this.f26953c.a(this.f26951a.a(), aVar.a(), workflowConfigurationResponse, this.f26952b);
    }
}
