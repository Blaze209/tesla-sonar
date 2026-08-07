package com.fourthline.orca.internal;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Tk implements InterfaceC3839t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gl f27940a;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27941a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27943c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            this.f27941a = obj;
            this.f27943c |= Integer.MIN_VALUE;
            Object objA = Tk.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Tk(Gl networkService) {
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        this.f27940a = networkService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.fourthline.orca.internal.InterfaceC3839t2
    public Object a(InterfaceC3839t2.b bVar, Continuation continuation) throws JSONException {
        a aVar;
        Object objA;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f27943c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f27943c = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f27941a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f27943c;
        if (i12 == 0) {
            jn0.t.b(obj);
            Gl gl2 = this.f27940a;
            String str = "/v2/onboarding/referencePayments/" + bVar.a() + "/start";
            Cl.b bVar2 = Cl.b.POST;
            Map mapA = AbstractC3345hf.a();
            JSONObject jSONObject = new JSONObject();
            if (bVar instanceof InterfaceC3839t2.b.a) {
                jSONObject.put("paymentMethod", H2.Online);
                jSONObject.put("redirectUrl", ((InterfaceC3839t2.b.a) bVar).b());
            } else {
                if (!(bVar instanceof InterfaceC3839t2.b.C0616b)) {
                    throw new NoWhenBranchMatchedException();
                }
                jSONObject.put("paymentMethod", H2.Sepa);
            }
            Cl.a aVar2 = new Cl.a("bav_start", bVar2, str, mapA, null, AbstractC3885u5.a(jSONObject), 16, null);
            aVar.f27943c = 1;
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
                return jn0.s.b(new InterfaceC3839t2.c((InterfaceC3839t2.BavStartPaymentResult) bVarA.d(InterfaceC3839t2.BavStartPaymentResult.INSTANCE.serializer(), string)));
            } catch (Throwable th2) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                return jn0.s.b(jn0.t.a(AbstractC3039aE.a(th2)));
            }
        }
        if (El.d(dl2)) {
            return jn0.s.b(jn0.t.a(ZD.c.f30009a));
        }
        return jn0.s.b(jn0.t.a(new ZD.b("NetworkBavStartPaymentWorker." + dl2.c())));
    }
}
