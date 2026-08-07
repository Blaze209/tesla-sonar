package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4080yl implements InterfaceC3106bw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.l f37037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Gl f37038b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.yl$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f37039a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f37041c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37039a = obj;
            this.f37041c |= Integer.MIN_VALUE;
            Object objA = C4080yl.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C4080yl(wn0.l endpoint, Gl networkService) {
        p013kotlin.jvm.internal.s.k(endpoint, "endpoint");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        this.f37037a = endpoint;
        this.f37038b = networkService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3106bw
    public Object a(InterfaceC3106bw.a aVar, Continuation continuation) {
        a aVar2;
        Object objA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f37041c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f37041c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f37039a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f37041c;
        if (i12 == 0) {
            jn0.t.b(obj);
            Gl gl2 = this.f37038b;
            Cl.a aVar3 = new Cl.a("qes_user_authorize", Cl.b.POST, ((C2911Ne) this.f37037a.invoke(aVar.c())).a(), AbstractC3345hf.a(), null, AbstractC3885u5.a(AbstractC4123zl.b(aVar)), 16, null);
            aVar2.f37041c = 1;
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
            return jn0.s.b(InterfaceC3106bw.b.a.f30728a);
        }
        if (dl2.c() == 429) {
            return jn0.s.b(InterfaceC3106bw.b.C0547b.f30729a);
        }
        if (El.d(dl2)) {
            return jn0.s.b(jn0.t.a(ZD.c.f30009a));
        }
        return jn0.s.b(jn0.t.a(new ZD.b("NetworkQesUserAuthorizationWorker." + dl2.c())));
    }
}
