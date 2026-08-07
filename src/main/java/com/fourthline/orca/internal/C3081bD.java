package com.fourthline.orca.internal;

import com.fourthline.orca.workflow.WorkflowResults;
import com.fourthline.vision.MotionData;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.bD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3081bD implements InterfaceC3414j6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3457k6 f30588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E6 f30589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.a f30590c;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.bD$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f30591a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f30593c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f30591a = obj;
            this.f30593c |= Integer.MIN_VALUE;
            return C3081bD.this.a(null, this);
        }
    }

    public C3081bD(InterfaceC3457k6 dataUploaderWorker, E6 deviceDataBundle, wn0.a workflowId) {
        p013kotlin.jvm.internal.s.k(dataUploaderWorker, "dataUploaderWorker");
        p013kotlin.jvm.internal.s.k(deviceDataBundle, "deviceDataBundle");
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        this.f30588a = dataUploaderWorker;
        this.f30589b = deviceDataBundle;
        this.f30590c = workflowId;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3414j6
    public Object a(WorkflowResults.IDV idv, Continuation continuation) {
        a aVar;
        MotionData motionDataM;
        InterfaceC3457k6.a aVar2;
        Object objA;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f30593c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f30593c = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f30591a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f30593c;
        if (i12 == 0) {
            jn0.t.b(obj);
            if (idv instanceof WorkflowResults.IDV.Document) {
                MotionData motionDataC = this.f30589b.c();
                if (motionDataC != null) {
                    String str = (String) this.f30590c.invoke();
                    wo0.b bVarA = Ki.a();
                    bVarA.getSerializersModule();
                    aVar2 = new InterfaceC3457k6.a(str, "document_motion_data.json", new InterfaceC3457k6.a.InterfaceC0569a.C0570a(bVarA.e(MotionData.INSTANCE.serializer(), motionDataC), "DocumentMotionData"));
                } else {
                    aVar2 = null;
                }
            } else if (!(idv instanceof WorkflowResults.IDV.Selfie) || (motionDataM = this.f30589b.m()) == null) {
                aVar2 = null;
            } else {
                String str2 = (String) this.f30590c.invoke();
                wo0.b bVarA2 = Ki.a();
                bVarA2.getSerializersModule();
                aVar2 = new InterfaceC3457k6.a(str2, "selfie_motion_data.json", new InterfaceC3457k6.a.InterfaceC0569a.C0570a(bVarA2.e(MotionData.INSTANCE.serializer(), motionDataM), "SelfieMotionData"));
            }
            if (aVar2 != null) {
                InterfaceC3457k6 interfaceC3457k6 = this.f30588a;
                aVar.f30593c = 1;
                objA = interfaceC3457k6.a(aVar2, aVar);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return jn0.h0.f84049a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jn0.t.b(obj);
        objA = ((jn0.s) obj).getValue();
        jn0.s.a(objA);
        return jn0.h0.f84049a;
    }
}
