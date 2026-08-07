package io.legere.pdfiumandroid.suspend;

import android.view.Surface;
import io.legere.pdfiumandroid.PdfPage;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$renderPage$2$1", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
final class PdfPageKt$renderPage$2$1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ long[] $pointers;
    final /* synthetic */ int[] $sizes;
    final /* synthetic */ Surface $surface;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdfPageKt$renderPage$2$1(Surface surface, int[] iArr, long[] jArr, Continuation<? super PdfPageKt$renderPage$2$1> continuation) {
        super(2, continuation);
        this.$surface = surface;
        this.$sizes = iArr;
        this.$pointers = jArr;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new PdfPageKt$renderPage$2$1(this.$surface, this.$sizes, this.$pointers, continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        Surface surface = this.$surface;
        if (surface == null) {
            return null;
        }
        return Boxing.boxBoolean(PdfPage.INSTANCE.lockSurface(surface, this.$sizes, this.$pointers));
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((PdfPageKt$renderPage$2$1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
