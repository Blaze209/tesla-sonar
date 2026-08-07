package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3478kl implements InterfaceC3559mg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gl f33011a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kl$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f33012a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f33014c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f33012a = obj;
            this.f33014c |= Integer.MIN_VALUE;
            Object objA = C3478kl.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3478kl(Gl networkService) {
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        this.f33011a = networkService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.fourthline.orca.internal.InterfaceC3559mg
    public Object a(InterfaceC3559mg.a aVar, Continuation continuation) {
        a aVar2;
        Object objA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f33014c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f33014c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f33012a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f33014c;
        if (i12 == 0) {
            jn0.t.b(obj);
            Gl gl2 = this.f33011a;
            Cl.a aVar3 = new Cl.a("workflow_flow_variant_url", Cl.b.POST, "/v1/workflows/" + aVar.b() + "/flowVariant?variant=" + aVar.a(), null, null, null, 56, null);
            aVar2.f33014c = 1;
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
        if (thE == null) {
            return El.e((Dl) objA) ? jn0.s.b(C3602ng.f33939a) : jn0.s.b(C3602ng.f33939a);
        }
        return jn0.s.b(jn0.t.a(AbstractC3039aE.a(thE)));
    }
}
