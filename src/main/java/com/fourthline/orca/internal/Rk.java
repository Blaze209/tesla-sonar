package com.fourthline.orca.internal;

import org.json.JSONException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Rk implements InterfaceC3625o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gl f27624a;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27625a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27627c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27625a = obj;
            this.f27627c |= Integer.MIN_VALUE;
            Object objA = Rk.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Rk(Gl networkService) {
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        this.f27624a = networkService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3625o2
    public Object a(InterfaceC3625o2.a aVar, Continuation continuation) {
        a aVar2;
        Object objA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f27627c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f27627c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f27625a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f27627c;
        if (i12 == 0) {
            jn0.t.b(obj);
            Gl gl2 = this.f27624a;
            Cl.a aVar3 = new Cl.a("workflow_mobile_configuration", Cl.b.GET, "/v1/workflows/" + aVar.a() + "/mobilesdkconfiguration", AbstractC3345hf.a(), null, null, 48, null);
            aVar2.f27627c = 1;
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
                String strB = Sk.b(El.b(dl2));
                p013kotlin.jvm.internal.s.h(strB);
                return jn0.s.b(new InterfaceC3625o2.b(strB));
            } catch (JSONException unused) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                return jn0.s.b(jn0.t.a(new ZD.b("NetworkWorkflowMobileConfigWorker.cannotDecodeResponse")));
            }
        }
        if (El.d(dl2)) {
            return jn0.s.b(jn0.t.a(ZD.c.f30009a));
        }
        return jn0.s.b(jn0.t.a(new ZD.b("NetworkWorkflowMobileConfigWorker." + dl2.c())));
    }
}
