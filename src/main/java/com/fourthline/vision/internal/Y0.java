package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.vision.ScannerImage;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Y0 implements Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P2 f38087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4234l4 f38088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4234l4 f38089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Q2 f38090d;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f38092b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f38094d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38092b = obj;
            this.f38094d |= Integer.MIN_VALUE;
            return Y0.this.process((Pair<? extends Image, T0.b>) null, (Continuation<? super K5>) this);
        }
    }

    public Y0(P2 intelligentCropping, InterfaceC4234l4 mrzDetectionAreaProvider, InterfaceC4234l4 maskDetectionAreaProvider, Q2 scannerImageCreator) {
        p013kotlin.jvm.internal.s.k(intelligentCropping, "intelligentCropping");
        p013kotlin.jvm.internal.s.k(mrzDetectionAreaProvider, "mrzDetectionAreaProvider");
        p013kotlin.jvm.internal.s.k(maskDetectionAreaProvider, "maskDetectionAreaProvider");
        p013kotlin.jvm.internal.s.k(scannerImageCreator, "scannerImageCreator");
        this.f38087a = intelligentCropping;
        this.f38088b = mrzDetectionAreaProvider;
        this.f38089c = maskDetectionAreaProvider;
        this.f38090d = scannerImageCreator;
    }

    @Override // com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((Pair<? extends Image, T0.b>) obj, (Continuation<? super K5>) continuation);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void start() {
        Q2.a.start(this);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void stop() {
        Q2.a.stop(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object process(Pair<? extends Image, T0.b> pair, Continuation<? super K5> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f38094d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f38094d = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objProcess = aVar.f38092b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f38094d;
        if (i12 == 0) {
            jn0.t.b(objProcess);
            C4165c4 c4165c4ContentDetectionArea = this.f38088b.contentDetectionArea();
            C4165c4 c4165c4PerformCorrection = this.f38087a.performCorrection(this.f38089c.contentDetectionArea(), c4165c4ContentDetectionArea, pair.f().getBox().translate(c4165c4ContentDetectionArea.getLeft(), c4165c4ContentDetectionArea.getTop()));
            Q2 q11 = this.f38090d;
            Pair pairA = jn0.x.a(pair.e(), c4165c4PerformCorrection);
            aVar.f38091a = pair;
            aVar.f38094d = 1;
            objProcess = q11.process(pairA, aVar);
            if (objProcess == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pair = (Pair) aVar.f38091a;
            jn0.t.b(objProcess);
        }
        return new InterfaceC4163c2.b((ScannerImage) objProcess, pair.f().getMrz(), null, 4, null);
    }
}
