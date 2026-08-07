package com.fourthline.orca.internal;

import java.util.Map;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3564ml implements Dg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gl f33609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f33610b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ml$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f33611a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f33613c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f33611a = obj;
            this.f33613c |= Integer.MIN_VALUE;
            Object objA = C3564ml.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3564ml(Gl networkService, boolean z11) {
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        this.f33609a = networkService;
        this.f33610b = z11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.Dg
    public Object a(Dg.a aVar, Continuation continuation) {
        a aVar2;
        String str;
        Object objA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f33613c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f33613c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f33611a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f33613c;
        if (i12 == 0) {
            jn0.t.b(obj);
            if (this.f33610b) {
                str = "/v1/workflows/" + aVar.b() + "/documents/" + aVar.a() + "/result";
            } else {
                str = "/v1/onboarding/document-analysis/" + aVar.b() + "/" + aVar.a() + "/result";
            }
            String str2 = str;
            Map mapD = this.f33610b ? AbstractC3345hf.d() : AbstractC3345hf.a();
            Gl gl2 = this.f33609a;
            Cl.a aVar3 = new Cl.a("workflow_document_analysis_result", Cl.b.GET, str2, mapD, p013kotlin.collections.v.p(jn0.x.a("workflowId", aVar.b()), jn0.x.a("documentId", aVar.a())), null, 32, null);
            aVar2.f33613c = 1;
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
            wo0.b bVarA = Ki.a();
            String string = dl2.a().toString();
            bVarA.getSerializersModule();
            return jn0.s.b(new Dg.b.a((GetDocumentAnalysisResultResponse) bVarA.d(GetDocumentAnalysisResultResponse.INSTANCE.serializer(), string)));
        }
        if (El.d(dl2)) {
            return jn0.s.b(jn0.t.a(ZD.c.f30009a));
        }
        return jn0.s.b(jn0.t.a(new ZD.b("GetDocumentAnalysisResultWorker." + dl2.c())));
    }
}
