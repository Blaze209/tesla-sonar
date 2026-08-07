package com.fourthline.orca.internal;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Vk implements N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gl f29130a;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f29131a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29133c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            this.f29131a = obj;
            this.f29133c |= Integer.MIN_VALUE;
            Object objA = Vk.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Vk(Gl networkService) {
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        this.f29130a = networkService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.fourthline.orca.internal.N2
    public Object a(N2.c cVar, Continuation continuation) throws JSONException {
        a aVar;
        Object objA;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f29133c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f29133c = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f29131a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f29133c;
        if (i12 == 0) {
            jn0.t.b(obj);
            Gl gl2 = this.f29130a;
            String str = "/v1/onboarding/referencePayments/" + cVar.b() + "/iban/validate";
            Cl.b bVar = Cl.b.POST;
            Map mapA = AbstractC3345hf.a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("iban", cVar.a());
            Cl.a aVar2 = new Cl.a("validate_iban", bVar, str, mapA, null, AbstractC3885u5.a(jSONObject), 16, null);
            aVar.f29133c = 1;
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
                return jn0.s.b(new N2.d((N2.BavValidateIbanResult) bVarA.d(N2.BavValidateIbanResult.INSTANCE.serializer(), string)));
            } catch (Throwable th2) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                return jn0.s.b(jn0.t.a(AbstractC3039aE.a(th2)));
            }
        }
        if (El.d(dl2)) {
            return jn0.s.b(jn0.t.a(ZD.c.f30009a));
        }
        return jn0.s.b(jn0.t.a(new ZD.b("NetworkBavValidateIbanWorker." + dl2.c())));
    }
}
