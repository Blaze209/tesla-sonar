package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3265fl implements InterfaceC4018x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gl f31786a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fl$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f31787a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f31789c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f31787a = obj;
            this.f31789c |= Integer.MIN_VALUE;
            Object objA = C3265fl.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3265fl(Gl networkService) {
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        this.f31786a = networkService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC4018x8
    public Object a(InterfaceC4018x8.a aVar, Continuation continuation) {
        a aVar2;
        Object objA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f31789c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f31789c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f31787a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f31789c;
        if (i12 == 0) {
            jn0.t.b(obj);
            Gl gl2 = this.f31786a;
            Cl.a aVar3 = new Cl.a("workflow_configuration", Cl.b.GET, "/v1/workflows/" + aVar.a() + "/configuration/document?userAgent=Mobile", AbstractC3345hf.a(), null, null, 48, null);
            aVar2.f31789c = 1;
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
                String strB = El.b(dl2);
                wo0.b bVarA = Ki.a();
                bVarA.getSerializersModule();
                return jn0.s.b(new InterfaceC4018x8.b((DocumentFlowConfig) bVarA.d(DocumentFlowConfig.INSTANCE.serializer(), strB)));
            } catch (Throwable th2) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                return jn0.s.b(jn0.t.a(AbstractC3039aE.a(th2)));
            }
        }
        if (El.d(dl2)) {
            return jn0.s.b(jn0.t.a(ZD.c.f30009a));
        }
        return jn0.s.b(jn0.t.a(new ZD.b("NetworkWorkflowConfigurationWorker." + dl2.c())));
    }
}
