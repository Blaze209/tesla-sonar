package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.vision.ScannerImage;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.vision.internal.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4280s2 implements Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P2 f38828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4234l4 f38829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Q2 f38830c;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.s2$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38831a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38833c;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38831a = obj;
            this.f38833c |= Integer.MIN_VALUE;
            return C4280s2.this.process((Pair<? extends Image, ? extends AbstractC4273r2>) null, (Continuation<? super K5>) this);
        }
    }

    public C4280s2(P2 intelligentCropping, InterfaceC4234l4 scannerDetectionAreaProvider, Q2 scannerImageCreator) {
        p013kotlin.jvm.internal.s.k(intelligentCropping, "intelligentCropping");
        p013kotlin.jvm.internal.s.k(scannerDetectionAreaProvider, "scannerDetectionAreaProvider");
        p013kotlin.jvm.internal.s.k(scannerImageCreator, "scannerImageCreator");
        this.f38828a = intelligentCropping;
        this.f38829b = scannerDetectionAreaProvider;
        this.f38830c = scannerImageCreator;
    }

    @Override // com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((Pair<? extends Image, ? extends AbstractC4273r2>) obj, (Continuation<? super K5>) continuation);
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
    public Object process(Pair<? extends Image, ? extends AbstractC4273r2> pair, Continuation<? super K5> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f38833c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f38833c = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objProcess = aVar.f38831a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f38833c;
        if (i12 == 0) {
            jn0.t.b(objProcess);
            C4165c4 c4165c4ContentDetectionArea = this.f38829b.contentDetectionArea();
            C4165c4 c4165c4PerformCorrection = this.f38828a.performCorrection(c4165c4ContentDetectionArea, c4165c4ContentDetectionArea, pair.f().getFaceBox());
            Q2 q11 = this.f38830c;
            Pair pairA = jn0.x.a(pair.e(), c4165c4PerformCorrection);
            aVar.f38833c = 1;
            objProcess = q11.process(pairA, aVar);
            if (objProcess == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objProcess);
        }
        return new C4256o5((ScannerImage) objProcess);
    }
}
