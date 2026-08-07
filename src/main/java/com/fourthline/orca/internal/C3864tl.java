package com.fourthline.orca.internal;

import org.json.JSONException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.tl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3864tl implements InterfaceC3746qv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.l f35682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Gl f35683b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.tl$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f35684a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f35686c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f35684a = obj;
            this.f35686c |= Integer.MIN_VALUE;
            Object objA = C3864tl.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3864tl(wn0.l endpoint, Gl networkService) {
        p013kotlin.jvm.internal.s.k(endpoint, "endpoint");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        this.f35682a = endpoint;
        this.f35683b = networkService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3746qv
    public Object a(InterfaceC3788rv.a aVar, Continuation continuation) {
        a aVar2;
        Object objA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f35686c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f35686c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f35684a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f35686c;
        if (i12 == 0) {
            jn0.t.b(obj);
            Gl gl2 = this.f35683b;
            Cl.a aVar3 = new Cl.a("qes_signature_details", Cl.b.GET, ((C2911Ne) this.f35682a.invoke(aVar.a())).a(), AbstractC3345hf.a(), null, null, 48, null);
            aVar2.f35686c = 1;
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
                return jn0.s.b(new InterfaceC3746qv.a(AbstractC3907ul.b(El.b(dl2))));
            } catch (JSONException unused) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                return jn0.s.b(jn0.t.a(new ZD.b("NetworkQesRetrieveSigningDetailsRequestWorker.cannotDecodeResponse")));
            }
        }
        if (El.d(dl2)) {
            return jn0.s.b(jn0.t.a(ZD.c.f30009a));
        }
        return jn0.s.b(jn0.t.a(new ZD.b("NetworkQesRetrieveSigningDetailsRequestWorker." + dl2.c())));
    }
}
