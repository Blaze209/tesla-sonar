package io.legere.pdfiumandroid.suspend;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.Surface;
import androidx.annotation.Keep;
import io.legere.pdfiumandroid.Logger;
import io.legere.pdfiumandroid.PdfDocument;
import io.legere.pdfiumandroid.PdfPage;
import io.legere.pdfiumandroid.PdfTextPage;
import io.legere.pdfiumandroid.PdfWriteCallback;
import io.legere.pdfiumandroid.PdfiumCore;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.e;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SpillingKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0010J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017Jr\u0010%\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00152\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'H\u0086@¢\u0006\u0004\b(\u0010\nJ\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0015H\u0086@¢\u0006\u0004\b*\u0010\nJ\u0018\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020\u000eH\u0087@¢\u0006\u0004\b-\u0010.J&\u0010/\u001a\b\u0012\u0004\u0012\u00020,0\u00152\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0086@¢\u0006\u0004\b/\u0010\u0017J\u0018\u00102\u001a\u00020\u001f2\u0006\u00101\u001a\u000200H\u0086@¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0011H\u0016¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u001f¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;¨\u0006<"}, d2 = {"Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;", "Ljava/io/Closeable;", "Lio/legere/pdfiumandroid/PdfDocument;", "document", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lio/legere/pdfiumandroid/PdfDocument;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "getPageCount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getPageCharCounts", "pageIndex", "Lio/legere/pdfiumandroid/suspend/PdfPageKt;", "openPage", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljn0/h0;", "deletePage", "fromIndex", "toIndex", "", "openPages", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/Surface;", "surface", "pages", "Landroid/graphics/Matrix;", "matrices", "Landroid/graphics/RectF;", "clipRects", "", "renderAnnot", "textMask", "canvasColor", "pageBackgroundColor", "renderCoroutinesDispatcher", "renderPages", "(Landroid/view/Surface;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZIILkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/legere/pdfiumandroid/PdfDocument$Meta;", "getDocumentMeta", "Lio/legere/pdfiumandroid/PdfDocument$Bookmark;", "getTableOfContents", "page", "Lio/legere/pdfiumandroid/suspend/PdfTextPageKt;", "openTextPage", "(Lio/legere/pdfiumandroid/suspend/PdfPageKt;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openTextPages", "Lio/legere/pdfiumandroid/PdfWriteCallback;", "callback", "saveAsCopy", "(Lio/legere/pdfiumandroid/PdfWriteCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "safeClose", "()Z", "Lio/legere/pdfiumandroid/PdfDocument;", "getDocument", "()Lio/legere/pdfiumandroid/PdfDocument;", "Lkotlinx/coroutines/CoroutineDispatcher;", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PdfDocumentKt implements Closeable {
    private final CoroutineDispatcher dispatcher;
    private final PdfDocument document;

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$deletePage$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$deletePage$2", f = "PdfDocumentKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ int $pageIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i11, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$pageIndex = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfDocumentKt.this.new AnonymousClass2(this.$pageIndex, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            PdfDocumentKt.this.getDocument().deletePage(this.$pageIndex);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$getDocumentMeta$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/legere/pdfiumandroid/PdfDocument$Meta;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$getDocumentMeta$2", f = "PdfDocumentKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46792 extends SuspendLambda implements p<CoroutineScope, Continuation<? super PdfDocument.Meta>, Object> {
        int label;

        C46792(Continuation<? super C46792> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfDocumentKt.this.new C46792(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfDocumentKt.this.getDocument().getDocumentMeta();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PdfDocument.Meta> continuation) {
            return ((C46792) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$getPageCharCounts$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0015\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$getPageCharCounts$2", f = "PdfDocumentKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46802 extends SuspendLambda implements p<CoroutineScope, Continuation<? super int[]>, Object> {
        int label;

        C46802(Continuation<? super C46802> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfDocumentKt.this.new C46802(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfDocumentKt.this.getDocument().getPageCharCounts();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super int[]> continuation) {
            return ((C46802) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$getPageCount$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$getPageCount$2", f = "PdfDocumentKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46812 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Integer>, Object> {
        int label;

        C46812(Continuation<? super C46812> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfDocumentKt.this.new C46812(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxInt(PdfDocumentKt.this.getDocument().getPageCount());
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((C46812) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$getTableOfContents$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/legere/pdfiumandroid/PdfDocument$Bookmark;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$getTableOfContents$2", f = "PdfDocumentKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46822 extends SuspendLambda implements p<CoroutineScope, Continuation<? super List<? extends PdfDocument.Bookmark>>, Object> {
        int label;

        C46822(Continuation<? super C46822> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfDocumentKt.this.new C46822(continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends PdfDocument.Bookmark>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<PdfDocument.Bookmark>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfDocumentKt.this.getDocument().getTableOfContents();
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<PdfDocument.Bookmark>> continuation) {
            return ((C46822) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$openPage$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/legere/pdfiumandroid/suspend/PdfPageKt;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$openPage$2", f = "PdfDocumentKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46832 extends SuspendLambda implements p<CoroutineScope, Continuation<? super PdfPageKt>, Object> {
        final /* synthetic */ int $pageIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C46832(int i11, Continuation<? super C46832> continuation) {
            super(2, continuation);
            this.$pageIndex = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfDocumentKt.this.new C46832(this.$pageIndex, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return new PdfPageKt(PdfDocumentKt.this.getDocument().openPage(this.$pageIndex), PdfDocumentKt.this.dispatcher);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PdfPageKt> continuation) {
            return ((C46832) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$openPages$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/legere/pdfiumandroid/suspend/PdfPageKt;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$openPages$2", f = "PdfDocumentKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46842 extends SuspendLambda implements p<CoroutineScope, Continuation<? super List<? extends PdfPageKt>>, Object> {
        final /* synthetic */ int $fromIndex;
        final /* synthetic */ int $toIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C46842(int i11, int i12, Continuation<? super C46842> continuation) {
            super(2, continuation);
            this.$fromIndex = i11;
            this.$toIndex = i12;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfDocumentKt.this.new C46842(this.$fromIndex, this.$toIndex, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends PdfPageKt>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<PdfPageKt>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            List<PdfPage> listOpenPages = PdfDocumentKt.this.getDocument().openPages(this.$fromIndex, this.$toIndex);
            PdfDocumentKt pdfDocumentKt = PdfDocumentKt.this;
            ArrayList arrayList = new ArrayList(v.y(listOpenPages, 10));
            Iterator<T> it = listOpenPages.iterator();
            while (it.hasNext()) {
                arrayList.add(new PdfPageKt((PdfPage) it.next(), pdfDocumentKt.dispatcher));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<PdfPageKt>> continuation) {
            return ((C46842) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$openTextPage$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/legere/pdfiumandroid/suspend/PdfTextPageKt;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$openTextPage$2", f = "PdfDocumentKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46852 extends SuspendLambda implements p<CoroutineScope, Continuation<? super PdfTextPageKt>, Object> {
        final /* synthetic */ PdfPageKt $page;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C46852(PdfPageKt pdfPageKt, Continuation<? super C46852> continuation) {
            super(2, continuation);
            this.$page = pdfPageKt;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfDocumentKt.this.new C46852(this.$page, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return new PdfTextPageKt(PdfDocumentKt.this.getDocument().openTextPage(this.$page.getPage()), PdfDocumentKt.this.dispatcher);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PdfTextPageKt> continuation) {
            return ((C46852) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$openTextPages$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/legere/pdfiumandroid/suspend/PdfTextPageKt;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$openTextPages$2", f = "PdfDocumentKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46862 extends SuspendLambda implements p<CoroutineScope, Continuation<? super List<? extends PdfTextPageKt>>, Object> {
        final /* synthetic */ int $fromIndex;
        final /* synthetic */ int $toIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C46862(int i11, int i12, Continuation<? super C46862> continuation) {
            super(2, continuation);
            this.$fromIndex = i11;
            this.$toIndex = i12;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfDocumentKt.this.new C46862(this.$fromIndex, this.$toIndex, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends PdfTextPageKt>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<PdfTextPageKt>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            List<PdfTextPage> listOpenTextPages = PdfDocumentKt.this.getDocument().openTextPages(this.$fromIndex, this.$toIndex);
            PdfDocumentKt pdfDocumentKt = PdfDocumentKt.this;
            ArrayList arrayList = new ArrayList(v.y(listOpenTextPages, 10));
            Iterator<T> it = listOpenTextPages.iterator();
            while (it.hasNext()) {
                arrayList.add(new PdfTextPageKt((PdfTextPage) it.next(), pdfDocumentKt.dispatcher));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<PdfTextPageKt>> continuation) {
            return ((C46862) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$renderPages$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt", f = "PdfDocumentKt.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {172, 89}, m = "renderPages", n = {"surface", "pages", "matrices", "clipRects", "renderCoroutinesDispatcher", "$this$withLock_u24default$iv", "renderAnnot", "textMask", "canvasColor", "pageBackgroundColor", "$i$f$withLock", "surface", "pages", "matrices", "clipRects", "renderCoroutinesDispatcher", "$this$withLock_u24default$iv", "renderAnnot", "textMask", "canvasColor", "pageBackgroundColor", "$i$f$withLock", "$i$a$-withLock$default-PdfDocumentKt$renderPages$2"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "Z$1", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "Z$1", "I$0", "I$1", "I$2", "I$3"}, v = 1)
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PdfDocumentKt.this.renderPages(null, null, null, null, false, false, 0, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$saveAsCopy$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$saveAsCopy$2", f = "PdfDocumentKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46872 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ PdfWriteCallback $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C46872(PdfWriteCallback pdfWriteCallback, Continuation<? super C46872> continuation) {
            super(2, continuation);
            this.$callback = pdfWriteCallback;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfDocumentKt.this.new C46872(this.$callback, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxBoolean(PdfDocument.saveAsCopy$default(PdfDocumentKt.this.getDocument(), this.$callback, 0, 2, null));
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C46872) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public PdfDocumentKt(PdfDocument document, CoroutineDispatcher dispatcher) {
        s.k(document, "document");
        s.k(dispatcher, "dispatcher");
        this.document = document;
        this.dispatcher = dispatcher;
    }

    public static /* synthetic */ Object renderPages$default(PdfDocumentKt pdfDocumentKt, Surface surface, List list, List list2, List list3, boolean z11, boolean z12, int i11, int i12, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z11 = false;
        }
        if ((i13 & 32) != 0) {
            z12 = false;
        }
        if ((i13 & 64) != 0) {
            i11 = -8092540;
        }
        if ((i13 & 128) != 0) {
            i12 = -1;
        }
        return pdfDocumentKt.renderPages(surface, list, list2, list3, z11, z12, i11, i12, coroutineDispatcher, continuation);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.document.close();
    }

    public final Object deletePage(int i11, Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(this.dispatcher, new AnonymousClass2(i11, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    public final PdfDocument getDocument() {
        return this.document;
    }

    public final Object getDocumentMeta(Continuation<? super PdfDocument.Meta> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46792(null), continuation);
    }

    public final Object getPageCharCounts(Continuation<? super int[]> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46802(null), continuation);
    }

    public final Object getPageCount(Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46812(null), continuation);
    }

    public final Object getTableOfContents(Continuation<? super List<PdfDocument.Bookmark>> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46822(null), continuation);
    }

    public final Object openPage(int i11, Continuation<? super PdfPageKt> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46832(i11, null), continuation);
    }

    public final Object openPages(int i11, int i12, Continuation<? super List<PdfPageKt>> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46842(i11, i12, null), continuation);
    }

    @e
    public final Object openTextPage(PdfPageKt pdfPageKt, Continuation<? super PdfTextPageKt> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46852(pdfPageKt, null), continuation);
    }

    public final Object openTextPages(int i11, int i12, Continuation<? super List<PdfTextPageKt>> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46862(i11, i12, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object renderPages(Surface surface, List<PdfPageKt> list, List<? extends Matrix> list2, List<? extends RectF> list3, boolean z11, boolean z12, int i11, int i12, CoroutineDispatcher coroutineDispatcher, Continuation<? super Boolean> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        PdfDocumentKt pdfDocumentKt;
        List<? extends Matrix> list4;
        List<? extends RectF> list5;
        Object obj;
        List<PdfPageKt> list6;
        Surface surface2;
        Mutex mutex;
        CoroutineDispatcher coroutineDispatcher2;
        boolean z13;
        boolean z14;
        int i13;
        int i14;
        int i15;
        int i16;
        Surface surface3;
        List<PdfPageKt> list7;
        Mutex mutex2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i17 = anonymousClass1.label;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i17 - Integer.MIN_VALUE;
                pdfDocumentKt = this;
            } else {
                pdfDocumentKt = this;
                anonymousClass1 = pdfDocumentKt.new AnonymousClass1(continuation);
            }
        } else {
            pdfDocumentKt = this;
            anonymousClass1 = pdfDocumentKt.new AnonymousClass1(continuation);
        }
        Object objWithContext = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i18 = anonymousClass1.label;
        try {
            try {
                if (i18 == 0) {
                    t.b(objWithContext);
                    Mutex surfaceMutex = PdfiumCore.INSTANCE.getSurfaceMutex();
                    anonymousClass1.L$0 = surface;
                    anonymousClass1.L$1 = list;
                    list4 = list2;
                    anonymousClass1.L$2 = list4;
                    list5 = list3;
                    anonymousClass1.L$3 = list5;
                    anonymousClass1.L$4 = coroutineDispatcher;
                    anonymousClass1.L$5 = surfaceMutex;
                    anonymousClass1.Z$0 = z11;
                    anonymousClass1.Z$1 = z12;
                    anonymousClass1.I$0 = i11;
                    anonymousClass1.I$1 = i12;
                    anonymousClass1.I$2 = 0;
                    anonymousClass1.label = 1;
                    obj = null;
                    if (surfaceMutex.lock(null, anonymousClass1) != coroutine_suspended) {
                        list6 = list;
                        surface2 = surface;
                        mutex = surfaceMutex;
                        coroutineDispatcher2 = coroutineDispatcher;
                        z13 = z11;
                        z14 = z12;
                        i13 = i11;
                        i14 = i12;
                        i15 = 0;
                    }
                    return coroutine_suspended;
                }
                if (i18 != 1) {
                    if (i18 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex = (Mutex) anonymousClass1.L$5;
                    try {
                        t.b(objWithContext);
                        mutex.unlock(null);
                        return objWithContext;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = null;
                        mutex.unlock(obj);
                        throw th;
                    }
                }
                int i19 = anonymousClass1.I$2;
                int i21 = anonymousClass1.I$1;
                int i22 = anonymousClass1.I$0;
                boolean z15 = anonymousClass1.Z$1;
                z13 = anonymousClass1.Z$0;
                Mutex mutex3 = (Mutex) anonymousClass1.L$5;
                CoroutineDispatcher coroutineDispatcher3 = (CoroutineDispatcher) anonymousClass1.L$4;
                List<? extends RectF> list8 = (List) anonymousClass1.L$3;
                List<? extends Matrix> list9 = (List) anonymousClass1.L$2;
                list6 = (List) anonymousClass1.L$1;
                surface2 = (Surface) anonymousClass1.L$0;
                t.b(objWithContext);
                coroutineDispatcher2 = coroutineDispatcher3;
                i13 = i22;
                list4 = list9;
                i15 = i19;
                mutex = mutex3;
                z14 = z15;
                list5 = list8;
                i14 = i21;
                obj = null;
                PdfDocumentKt$renderPages$2$1 pdfDocumentKt$renderPages$2$1 = new PdfDocumentKt$renderPages$2$1(pdfDocumentKt, surface3, list7, list4, list5, z13, z14, i13, i14, null);
                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(surface3);
                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(list7);
                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(list4);
                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(list5);
                anonymousClass1.L$4 = SpillingKt.nullOutSpilledVariable(coroutineDispatcher2);
                anonymousClass1.L$5 = mutex2;
                anonymousClass1.Z$0 = z13;
                anonymousClass1.Z$1 = z14;
                anonymousClass1.I$0 = i13;
                anonymousClass1.I$1 = i14;
                anonymousClass1.I$2 = i16;
                anonymousClass1.I$3 = 0;
                anonymousClass1.label = 2;
                objWithContext = BuildersKt.withContext(coroutineDispatcher2, pdfDocumentKt$renderPages$2$1, anonymousClass1);
                if (objWithContext != coroutine_suspended) {
                    mutex = mutex2;
                    mutex.unlock(null);
                    return objWithContext;
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
                obj = null;
                mutex = mutex2;
                mutex.unlock(obj);
                throw th;
            }
            i16 = i15;
            surface3 = surface2;
            list7 = list6;
            mutex2 = mutex;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final boolean safeClose() {
        try {
            this.document.close();
            return true;
        } catch (IllegalStateException e11) {
            Logger.INSTANCE.e("PdfDocumentKt", e11, "PdfDocumentKt.safeClose");
            return false;
        }
    }

    public final Object saveAsCopy(PdfWriteCallback pdfWriteCallback, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46872(pdfWriteCallback, null), continuation);
    }
}
