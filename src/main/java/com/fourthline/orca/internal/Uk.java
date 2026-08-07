package com.fourthline.orca.internal;

import com.fourthline.orca.bav.internal.error.BavError;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Uk implements G2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3852tF f28800a;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f28801a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f28803c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f28801a = obj;
            this.f28803c |= Integer.MIN_VALUE;
            Object objA = Uk.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Uk(InterfaceC3852tF workflowStatusWorker) {
        p013kotlin.jvm.internal.s.k(workflowStatusWorker, "workflowStatusWorker");
        this.f28800a = workflowStatusWorker;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.G2
    public Object a(G2.a aVar, Continuation continuation) {
        a aVar2;
        Object objA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f28803c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f28803c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f28801a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f28803c;
        if (i12 == 0) {
            jn0.t.b(obj);
            InterfaceC3852tF interfaceC3852tF = this.f28800a;
            InterfaceC3852tF.a aVar3 = new InterfaceC3852tF.a(aVar.a());
            aVar2.f28803c = 1;
            objA = interfaceC3852tF.a(aVar3, aVar2);
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
        BavStatus bavStatusA = ((InterfaceC3852tF.b) objA).a().a();
        return bavStatusA != null ? jn0.s.b(new G2.b(bavStatusA)) : jn0.s.b(jn0.t.a(BavError.Unexpected.Companion.create$default(BavError.Unexpected.INSTANCE, "NetworkBavStatusWorker.MissingBAVModuleStatus", null, 2, null)));
    }
}
