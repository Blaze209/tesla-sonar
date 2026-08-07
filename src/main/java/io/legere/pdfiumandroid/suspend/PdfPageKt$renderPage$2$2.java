package io.legere.pdfiumandroid.suspend;

import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.j0;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$renderPage$2$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
final class PdfPageKt$renderPage$2$2 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    final /* synthetic */ long $bufferPtr;
    final /* synthetic */ int $canvasColor;
    final /* synthetic */ int $drawSizeX;
    final /* synthetic */ int $drawSizeY;
    final /* synthetic */ int $pageBackgroundColor;
    final /* synthetic */ boolean $renderAnnot;
    final /* synthetic */ j0 $retValue;
    final /* synthetic */ int $startX;
    final /* synthetic */ int $startY;
    int label;
    final /* synthetic */ PdfPageKt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdfPageKt$renderPage$2$2(j0 j0Var, PdfPageKt pdfPageKt, long j11, int i11, int i12, int i13, int i14, boolean z11, int i15, int i16, Continuation<? super PdfPageKt$renderPage$2$2> continuation) {
        super(2, continuation);
        this.$retValue = j0Var;
        this.this$0 = pdfPageKt;
        this.$bufferPtr = j11;
        this.$startX = i11;
        this.$startY = i12;
        this.$drawSizeX = i13;
        this.$drawSizeY = i14;
        this.$renderAnnot = z11;
        this.$canvasColor = i15;
        this.$pageBackgroundColor = i16;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new PdfPageKt$renderPage$2$2(this.$retValue, this.this$0, this.$bufferPtr, this.$startX, this.$startY, this.$drawSizeX, this.$drawSizeY, this.$renderAnnot, this.$canvasColor, this.$pageBackgroundColor, continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        this.$retValue.f86523a = this.this$0.getPage().renderPage(this.$bufferPtr, this.$startX, this.$startY, this.$drawSizeX, this.$drawSizeY, this.$renderAnnot, this.$canvasColor, this.$pageBackgroundColor);
        return h0.f84049a;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((PdfPageKt$renderPage$2$2) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
