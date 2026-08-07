package io.legere.pdfiumandroid.suspend;

import android.graphics.Matrix;
import android.graphics.RectF;
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
@DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$renderPage$4$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
final class PdfPageKt$renderPage$4$2 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    final /* synthetic */ long $bufferPtr;
    final /* synthetic */ int $canvasColor;
    final /* synthetic */ RectF $clipRect;
    final /* synthetic */ Matrix $matrix;
    final /* synthetic */ int $pageBackgroundColor;
    final /* synthetic */ boolean $renderAnnot;
    final /* synthetic */ j0 $retValue;
    final /* synthetic */ int $surfaceHeight;
    final /* synthetic */ int $surfaceWidth;
    final /* synthetic */ boolean $textMask;
    int label;
    final /* synthetic */ PdfPageKt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdfPageKt$renderPage$4$2(j0 j0Var, PdfPageKt pdfPageKt, long j11, int i11, int i12, Matrix matrix, RectF rectF, boolean z11, boolean z12, int i13, int i14, Continuation<? super PdfPageKt$renderPage$4$2> continuation) {
        super(2, continuation);
        this.$retValue = j0Var;
        this.this$0 = pdfPageKt;
        this.$bufferPtr = j11;
        this.$surfaceWidth = i11;
        this.$surfaceHeight = i12;
        this.$matrix = matrix;
        this.$clipRect = rectF;
        this.$renderAnnot = z11;
        this.$textMask = z12;
        this.$canvasColor = i13;
        this.$pageBackgroundColor = i14;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new PdfPageKt$renderPage$4$2(this.$retValue, this.this$0, this.$bufferPtr, this.$surfaceWidth, this.$surfaceHeight, this.$matrix, this.$clipRect, this.$renderAnnot, this.$textMask, this.$canvasColor, this.$pageBackgroundColor, continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        this.$retValue.f86523a = this.this$0.getPage().renderPage(this.$bufferPtr, this.$surfaceWidth, this.$surfaceHeight, this.$matrix, this.$clipRect, this.$renderAnnot, this.$textMask, this.$canvasColor, this.$pageBackgroundColor);
        return h0.f84049a;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((PdfPageKt$renderPage$4$2) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
