package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import java.util.List;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Zs implements InterfaceC2889Jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2899Lc f30115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EidServiceProvider f30116b;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f30118b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f30120d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f30118b = obj;
            this.f30120d |= Integer.MIN_VALUE;
            Object objA = Zs.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Zs(C2899Lc bundle, EidServiceProvider provider) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(provider, "provider");
        this.f30115a = bundle;
        this.f30116b = provider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC2889Jc
    public Object a(InterfaceC2889Jc.a aVar, Continuation continuation) {
        a aVar2;
        Object objMo83fetchAccessRightsgIAlus;
        Zs zs2;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f30120d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f30120d = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f30118b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f30120d;
        if (i12 == 0) {
            jn0.t.b(obj);
            EidServiceProvider eidServiceProvider = this.f30116b;
            String strA = aVar.a();
            aVar2.f30117a = this;
            aVar2.f30120d = 1;
            objMo83fetchAccessRightsgIAlus = eidServiceProvider.mo83fetchAccessRightsgIAlus(strA, aVar2);
            if (objMo83fetchAccessRightsgIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
            zs2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zs2 = (Zs) aVar2.f30117a;
            jn0.t.b(obj);
            objMo83fetchAccessRightsgIAlus = ((jn0.s) obj).getValue();
        }
        jn0.t.b(objMo83fetchAccessRightsgIAlus);
        List list = (List) objMo83fetchAccessRightsgIAlus;
        zs2.f30115a.a(list);
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return jn0.s.b(new InterfaceC2889Jc.b.a(list));
    }
}
