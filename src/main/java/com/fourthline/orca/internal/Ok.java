package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Ok implements InterfaceC3837t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WC f27186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f27187b;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27189b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f27191d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27189b = obj;
            this.f27191d |= Integer.MIN_VALUE;
            Object objA = Ok.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Ok(WC uploadDocumentImageWorker, boolean z11) {
        p013kotlin.jvm.internal.s.k(uploadDocumentImageWorker, "uploadDocumentImageWorker");
        this.f27186a = uploadDocumentImageWorker;
        this.f27187b = z11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3837t0
    public Object a(InterfaceC3837t0.a aVar, Continuation continuation) {
        a aVar2;
        Object objA;
        Ok ok2;
        Object aVar3;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f27191d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f27191d = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f27189b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f27191d;
        if (i12 == 0) {
            jn0.t.b(obj);
            WC.a aVar4 = new WC.a(aVar.a(), aVar.c(), aVar.b(), aVar.d());
            WC wc2 = this.f27186a;
            long jE = aVar.e();
            aVar2.f27188a = this;
            aVar2.f27191d = 1;
            objA = wc2.a(aVar4, jE, aVar2);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            ok2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ok2 = (Ok) aVar2.f27188a;
            jn0.t.b(obj);
            objA = ((jn0.s) obj).getValue();
        }
        Throwable thE = jn0.s.e(objA);
        if (thE != null) {
            return jn0.s.b(jn0.t.a(AbstractC3039aE.a(thE)));
        }
        Dl dl2 = (Dl) objA;
        if (!El.e(dl2)) {
            if (El.d(dl2)) {
                return jn0.s.b(jn0.t.a(ZD.c.f30009a));
            }
            return jn0.s.b(jn0.t.a(new ZD.b("NetworkAnalyzeDocumentImageWorker." + dl2.c())));
        }
        try {
            if (ok2.f27187b) {
                wo0.b bVarA = Ki.a();
                String strB = El.b(dl2);
                bVarA.getSerializersModule();
                aVar3 = new InterfaceC3837t0.b.C0614b((ImageAnalysisResponse) bVarA.d(ImageAnalysisResponse.INSTANCE.serializer(), strB));
            } else {
                wo0.b bVarA2 = Ki.a();
                String strB2 = El.b(dl2);
                bVarA2.getSerializersModule();
                aVar3 = new InterfaceC3837t0.b.a((LegacyImageAnalysisResponse) bVarA2.d(LegacyImageAnalysisResponse.INSTANCE.serializer(), strB2));
            }
            return jn0.s.b(aVar3);
        } catch (Throwable th2) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return jn0.s.b(jn0.t.a(AbstractC3039aE.a(th2)));
        }
    }
}
