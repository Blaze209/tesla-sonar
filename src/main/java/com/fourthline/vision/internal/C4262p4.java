package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.vision.ScannerImage;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.vision.internal.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4262p4 implements Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q2 f38750a;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.p4$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38751a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38753c;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38751a = obj;
            this.f38753c |= Integer.MIN_VALUE;
            return C4262p4.this.process((Pair<? extends Image, C4165c4>) null, (Continuation<? super K5>) this);
        }
    }

    public C4262p4(Q2 converter) {
        p013kotlin.jvm.internal.s.k(converter, "converter");
        this.f38750a = converter;
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
            int i11 = aVar.f38753c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f38753c = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objProcess = aVar.f38751a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f38753c;
        if (i12 == 0) {
            jn0.t.b(objProcess);
            Q2 q11 = this.f38750a;
            aVar.f38753c = 1;
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
        return new InterfaceC4163c2.a((ScannerImage) objProcess, null, 2, null);
    }
}
