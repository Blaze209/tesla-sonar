package io.legere.pdfiumandroid.suspend;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.Surface;
import io.legere.pdfiumandroid.PdfDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$renderPages$2$1", f = "PdfDocumentKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
final class PdfDocumentKt$renderPages$2$1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ int $canvasColor;
    final /* synthetic */ List<RectF> $clipRects;
    final /* synthetic */ List<Matrix> $matrices;
    final /* synthetic */ int $pageBackgroundColor;
    final /* synthetic */ List<PdfPageKt> $pages;
    final /* synthetic */ boolean $renderAnnot;
    final /* synthetic */ Surface $surface;
    final /* synthetic */ boolean $textMask;
    int label;
    final /* synthetic */ PdfDocumentKt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PdfDocumentKt$renderPages$2$1(PdfDocumentKt pdfDocumentKt, Surface surface, List<PdfPageKt> list, List<? extends Matrix> list2, List<? extends RectF> list3, boolean z11, boolean z12, int i11, int i12, Continuation<? super PdfDocumentKt$renderPages$2$1> continuation) {
        super(2, continuation);
        this.this$0 = pdfDocumentKt;
        this.$surface = surface;
        this.$pages = list;
        this.$matrices = list2;
        this.$clipRects = list3;
        this.$renderAnnot = z11;
        this.$textMask = z12;
        this.$canvasColor = i11;
        this.$pageBackgroundColor = i12;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new PdfDocumentKt$renderPages$2$1(this.this$0, this.$surface, this.$pages, this.$matrices, this.$clipRects, this.$renderAnnot, this.$textMask, this.$canvasColor, this.$pageBackgroundColor, continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        PdfDocument document = this.this$0.getDocument();
        Surface surface = this.$surface;
        List<PdfPageKt> list = this.$pages;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PdfPageKt) it.next()).getPage());
        }
        return Boxing.boxBoolean(document.renderPages(surface, arrayList, this.$matrices, this.$clipRects, this.$renderAnnot, this.$textMask, this.$canvasColor, this.$pageBackgroundColor));
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((PdfDocumentKt$renderPages$2$1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
