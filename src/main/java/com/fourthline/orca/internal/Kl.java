package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.core.DocumentFileSideKt;
import com.fourthline.core.DocumentType;
import com.fourthline.core.DocumentTypeKt;
import com.fourthline.core.location.Coordinate;
import com.fourthline.vision.document.DocumentScannerStepMetadata;
import com.fourthline.vision.document.DocumentScannerStepResult;
import java.io.ByteArrayOutputStream;
import java.util.Date;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Kl implements WC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f26600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4104z8 f26601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3500l6 f26602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f26603d;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f26604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f26605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f26606c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f26608e;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26606c = obj;
            this.f26608e |= Integer.MIN_VALUE;
            Object objA = Kl.this.a((WC.a) null, 0L, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26609a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3976w9 f26611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p013kotlin.jvm.internal.n0 f26612d;

        static final class a extends SuspendLambda implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f26613a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f26614b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p013kotlin.jvm.internal.n0 f26615c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p013kotlin.jvm.internal.n0 n0Var, Continuation continuation) {
                super(2, continuation);
                this.f26615c = n0Var;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C3629o6 c3629o6, Continuation continuation) {
                return ((a) create(c3629o6, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.f26615c, continuation);
                aVar.f26614b = obj;
                return aVar;
            }

            /* JADX WARN: Type inference failed for: r4v4, types: [T, com.fourthline.orca.internal.l6$a] */
            /* JADX WARN: Type inference failed for: r4v6, types: [T, com.fourthline.orca.internal.l6$a] */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f26613a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                C3629o6 c3629o6 = (C3629o6) this.f26614b;
                InterfaceC3500l6.a aVarB = c3629o6.b();
                boolean z11 = true;
                if (aVarB instanceof InterfaceC3500l6.a.d) {
                    this.f26615c.f86529a = c3629o6.b();
                } else if (aVarB instanceof InterfaceC3500l6.a.b) {
                    this.f26615c.f86529a = c3629o6.b();
                } else {
                    z11 = false;
                }
                return Boxing.boxBoolean(z11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3976w9 c3976w9, p013kotlin.jvm.internal.n0 n0Var, Continuation continuation) {
            super(2, continuation);
            this.f26611c = c3976w9;
            this.f26612d = n0Var;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Kl.this.new b(this.f26611c, this.f26612d, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f26609a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            Flow flowA = Kl.this.f26602c.a(this.f26611c.b());
            a aVar = new a(this.f26612d, null);
            this.f26609a = 1;
            Object objFirst = FlowKt.first(flowA, aVar, this);
            return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
        }
    }

    public Kl(wn0.a workflowIdProvider, C4104z8 documentFlowDataBundle, InterfaceC3500l6 dataWorkManager, double d11) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(documentFlowDataBundle, "documentFlowDataBundle");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        this.f26600a = workflowIdProvider;
        this.f26601b = documentFlowDataBundle;
        this.f26602c = dataWorkManager;
        this.f26603d = d11;
    }

    private final C3976w9 b(WC.a aVar) {
        return new C3976w9((String) this.f26600a.invoke(), aVar.a(), aVar.c(), a(this.f26601b, aVar.a(), aVar.c(), aVar.b(), aVar.d()));
    }

    @Override // com.fourthline.orca.internal.WC
    public void a(WC.a input) {
        p013kotlin.jvm.internal.s.k(input, "input");
        this.f26602c.a(b(input));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.WC
    public Object a(WC.a aVar, long j11, Continuation continuation) {
        a aVar2;
        Kl kl2;
        p013kotlin.jvm.internal.n0 n0Var;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f26608e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f26608e = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f26606c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f26608e;
        try {
            if (i12 == 0) {
                jn0.t.b(obj);
                C3976w9 c3976w9B = b(aVar);
                this.f26602c.a(c3976w9B);
                p013kotlin.jvm.internal.n0 n0Var2 = new p013kotlin.jvm.internal.n0();
                b bVar = new b(c3976w9B, n0Var2, null);
                aVar2.f26604a = this;
                aVar2.f26605b = n0Var2;
                aVar2.f26608e = 1;
                if (TimeoutKt.withTimeout(j11, bVar, aVar2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                kl2 = this;
                n0Var = n0Var2;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n0Var = (p013kotlin.jvm.internal.n0) aVar2.f26605b;
                kl2 = (Kl) aVar2.f26604a;
                jn0.t.b(obj);
            }
            InterfaceC3500l6.a aVar3 = (InterfaceC3500l6.a) n0Var.f86529a;
            if (aVar3 instanceof InterfaceC3500l6.a.d) {
                if (((InterfaceC3500l6.a.d) aVar3).a() instanceof Dl) {
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    return jn0.s.b(((InterfaceC3500l6.a.d) aVar3).a());
                }
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                return jn0.s.b(jn0.t.a(kl2.a()));
            }
            if (aVar3 instanceof InterfaceC3500l6.a.b) {
                jn0.s.Companion companion3 = jn0.s.INSTANCE;
                return jn0.s.b(jn0.t.a(((InterfaceC3500l6.a.b) aVar3).a()));
            }
            jn0.s.Companion companion4 = jn0.s.INSTANCE;
            return jn0.s.b(jn0.t.a(kl2.a()));
        } catch (TimeoutCancellationException e11) {
            jn0.s.Companion companion5 = jn0.s.INSTANCE;
            return jn0.s.b(jn0.t.a(e11));
        }
    }

    private final List a(C4104z8 c4104z8, String str, String str2, Bitmap bitmap, DocumentScannerStepResult documentScannerStepResult) throws JSONException {
        X7 x7O = c4104z8.o();
        DocumentType documentTypeC = x7O != null ? x7O.c() : null;
        if (documentTypeC != null) {
            String fourthlineValue = DocumentTypeKt.toFourthlineValue(documentTypeC);
            int i11 = (int) (this.f26603d * ((double) 100));
            String strA = a(documentScannerStepResult, fourthlineValue, "jpg");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, i11, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                sn0.b.a(byteArrayOutputStream, null);
                p013kotlin.jvm.internal.s.h(byteArray);
                Cl.c.a aVar = new Cl.c.a("File", new C3842t5(byteArray), AbstractC3345hf.a(AbstractC3345hf.c(), strA));
                A7 a7G = c4104z8.g();
                JSONObject jSONObjectPut = new JSONObject().put("DocumentId", str).put("ImageId", str2).put("DocumentType", fourthlineValue).put("IsPrimaryDocument", true).put("EvaluateSecondaryDocument", false).put("DocumentNumber", a7G.g());
                Date dateB = a7G.b();
                JSONObject jSONObjectPutOpt = jSONObjectPut.putOpt("ExpirationDate", dateB != null ? ZC.a().format(dateB) : null);
                Date dateD = a7G.d();
                JSONObject jSONObjectPutOpt2 = jSONObjectPutOpt.putOpt("IssueDate", dateD != null ? ZC.a().format(dateD) : null);
                G5 g5H = c4104z8.h();
                JSONObject jSONObjectPut2 = jSONObjectPutOpt2.put("IssuingCountry", g5H != null ? g5H.c() : null);
                DocumentScannerStepMetadata metadata = documentScannerStepResult.getMetadata();
                JSONObject jSONObjectPut3 = new JSONObject().put("FileName", strA).put("Side", DocumentFileSideKt.toFourthlineValue(metadata.getFileSide())).put("RotationType", ZC.a(metadata.isAngled()));
                Coordinate location = metadata.getLocation();
                JSONObject jSONObjectPutOpt3 = jSONObjectPut3.putOpt("Latitude", location != null ? Double.valueOf(location.getLatitude()).toString() : null);
                Coordinate location2 = metadata.getLocation();
                JSONObject jSONObjectPut4 = jSONObjectPut2.put("KycFile", jSONObjectPutOpt3.putOpt("Longitude", location2 != null ? Double.valueOf(location2.getLongitude()).toString() : null));
                p013kotlin.jvm.internal.s.h(jSONObjectPut4);
                return p013kotlin.collections.v.p(new Cl.c.a("UploadDocumentRequest", AbstractC3885u5.a(jSONObjectPut4), null, 4, null), aVar);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(byteArrayOutputStream, th2);
                    throw th3;
                }
            }
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + documentTypeC + " must not be null."))).toString());
    }

    private final String a(DocumentScannerStepResult documentScannerStepResult, String str, String str2) {
        return str + "_" + DocumentFileSideKt.toFourthlineValue(documentScannerStepResult.getMetadata().getFileSide()) + "_" + (documentScannerStepResult.getMetadata().isAngled() ? "angled" : "normal") + "." + str2;
    }

    private final Bo a() {
        return new Bo("Result is of unexpected type.", null, "unexpected", 2, null);
    }
}
