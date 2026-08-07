package io.legere.pdfiumandroid.suspend;

import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: Add missing generic type declarations: [H] */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0001*\u00060\u0002j\u0002`\u0003*\u00020\u0004H\n"}, d2 = {"<anonymous>", "H", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageSuspendCacheBase$get$deferred$1$1", f = "PdfPageSuspendCacheBase.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {}, v = 1)
final class PdfPageSuspendCacheBase$get$deferred$1$1<H> extends SuspendLambda implements p<CoroutineScope, Continuation<? super H>, Object> {
    final /* synthetic */ Integer $key;
    int label;
    final /* synthetic */ PdfPageSuspendCacheBase<H> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdfPageSuspendCacheBase$get$deferred$1$1(PdfPageSuspendCacheBase<H> pdfPageSuspendCacheBase, Integer num, Continuation<? super PdfPageSuspendCacheBase$get$deferred$1$1> continuation) {
        super(2, continuation);
        this.this$0 = pdfPageSuspendCacheBase;
        this.$key = num;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new PdfPageSuspendCacheBase$get$deferred$1$1(this.this$0, this.$key, continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return obj;
        }
        t.b(obj);
        PdfPageSuspendCacheBase<H> pdfPageSuspendCacheBase = this.this$0;
        Integer num = this.$key;
        s.h(num);
        int iIntValue = num.intValue();
        this.label = 1;
        Object objOpenPageAndText = pdfPageSuspendCacheBase.openPageAndText(iIntValue, this);
        return objOpenPageAndText == coroutine_suspended ? coroutine_suspended : objOpenPageAndText;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super H> continuation) {
        return ((PdfPageSuspendCacheBase$get$deferred$1$1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
