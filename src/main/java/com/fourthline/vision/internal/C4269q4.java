package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.vision.ScannerImage;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.vision.internal.q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4269q4 implements Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q2 f38778a;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.q4$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38779a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38781c;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38779a = obj;
            this.f38781c |= Integer.MIN_VALUE;
            return C4269q4.this.process((Pair<? extends Image, C4165c4>) null, (Continuation<? super K5>) this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.q4$b */
    public static final class b implements K5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ScannerImage f38782a;

        b(ScannerImage scannerImage) {
            this.f38782a = scannerImage;
        }

        @Override // com.fourthline.vision.internal.K5
        public ScannerImage getImage() {
            return this.f38782a;
        }
    }

    public C4269q4(Q2 converter) {
        p013kotlin.jvm.internal.s.k(converter, "converter");
        this.f38778a = converter;
    }

    @Override // com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((Pair<? extends Image, C4165c4>) obj, (Continuation<? super K5>) continuation);
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
    public Object process(Pair<? extends Image, C4165c4> pair, Continuation<? super K5> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f38781c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f38781c = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objProcess = aVar.f38779a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f38781c;
        if (i12 == 0) {
            jn0.t.b(objProcess);
            Q2 q11 = this.f38778a;
            aVar.f38781c = 1;
            objProcess = q11.process(pair, aVar);
            if (objProcess == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objProcess);
        }
        return new b((ScannerImage) objProcess);
    }
}
