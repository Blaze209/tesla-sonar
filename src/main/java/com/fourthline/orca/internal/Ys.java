package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Ys implements InterfaceC2879Hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2899Lc f29938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EidServiceProvider f29939b;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f29940a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29942c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f29940a = obj;
            this.f29942c |= Integer.MIN_VALUE;
            Object objA = Ys.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Ys(C2899Lc bundle, EidServiceProvider provider) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(provider, "provider");
        this.f29938a = bundle;
        this.f29939b = provider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC2879Hc
    public Object a(InterfaceC2879Hc.a aVar, Continuation continuation) {
        a aVar2;
        Object objMo82acceptAccessRightsIoAF18A;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f29942c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f29942c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f29940a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f29942c;
        if (i12 == 0) {
            jn0.t.b(obj);
            EidServiceProvider eidServiceProvider = this.f29939b;
            aVar2.f29942c = 1;
            objMo82acceptAccessRightsIoAF18A = eidServiceProvider.mo82acceptAccessRightsIoAF18A(aVar2);
            if (objMo82acceptAccessRightsIoAF18A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            objMo82acceptAccessRightsIoAF18A = ((jn0.s) obj).getValue();
        }
        jn0.t.b(objMo82acceptAccessRightsIoAF18A);
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return jn0.s.b(C2884Ic.f26288a);
    }
}
