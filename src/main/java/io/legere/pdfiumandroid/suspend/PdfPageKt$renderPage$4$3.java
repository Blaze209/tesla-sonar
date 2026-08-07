package io.legere.pdfiumandroid.suspend;

import android.view.Surface;
import io.legere.pdfiumandroid.PdfPage;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$renderPage$4$3", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
final class PdfPageKt$renderPage$4$3 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    final /* synthetic */ long $bufferPtr;
    final /* synthetic */ long $nativeWindow;
    final /* synthetic */ Surface $surface;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdfPageKt$renderPage$4$3(Surface surface, long j11, long j12, Continuation<? super PdfPageKt$renderPage$4$3> continuation) {
        super(2, continuation);
        this.$surface = surface;
        this.$nativeWindow = j11;
        this.$bufferPtr = j12;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new PdfPageKt$renderPage$4$3(this.$surface, this.$nativeWindow, this.$bufferPtr, continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        if (this.$surface == null) {
            return null;
        }
        PdfPage.INSTANCE.unlockSurface(new long[]{this.$nativeWindow, this.$bufferPtr});
        return h0.f84049a;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((PdfPageKt$renderPage$4$3) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
