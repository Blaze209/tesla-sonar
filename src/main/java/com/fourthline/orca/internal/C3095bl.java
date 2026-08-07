package com.fourthline.orca.internal;

import java.util.List;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.bl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3095bl implements InterfaceC3457k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gl f30669a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.bl$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f30670a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f30672c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f30670a = obj;
            this.f30672c |= Integer.MIN_VALUE;
            Object objA = C3095bl.this.a((InterfaceC3457k6.a) null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3095bl(Gl networkService) {
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        this.f30669a = networkService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3457k6
    public Object a(InterfaceC3457k6.a aVar, Continuation continuation) {
        a aVar2;
        Object objA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f30672c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f30672c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f30670a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f30672c;
        if (i12 == 0) {
            jn0.t.b(obj);
            List listA = a(aVar.a(), aVar.b());
            Gl gl2 = this.f30669a;
            Cl.c cVar = new Cl.c("workflow_device_data_collection", "/v1/data/" + aVar.c(), AbstractC3345hf.f(), null, listA, 8, null);
            aVar2.f30672c = 1;
            objA = gl2.a(cVar, aVar2);
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
        return jn0.s.b(InterfaceC3457k6.b.f32903a);
    }

    private final List a(InterfaceC3457k6.a.InterfaceC0569a interfaceC0569a, String str) {
        if (!(interfaceC0569a instanceof InterfaceC3457k6.a.InterfaceC0569a.C0570a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC3457k6.a.InterfaceC0569a.C0570a c0570a = (InterfaceC3457k6.a.InterfaceC0569a.C0570a) interfaceC0569a;
        return a(c0570a, str, c0570a.b());
    }

    private final List a(InterfaceC3457k6.a.InterfaceC0569a.C0570a c0570a, String str, String str2) {
        C3842t5 c3842t5A = AbstractC3885u5.a(c0570a.a().toString());
        Map mapA = AbstractC3345hf.a(AbstractC3345hf.d(), str);
        if (str2 != null) {
            AbstractC3345hf.b(mapA, str2);
        }
        jn0.h0 h0Var = jn0.h0.f84049a;
        return p013kotlin.collections.v.e(new Cl.c.a(str, c3842t5A, mapA));
    }
}
