package io.legere.pdfiumandroid.suspend;

import android.graphics.RectF;
import io.legere.pdfiumandroid.PdfPageLink;
import java.io.Closeable;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0015\u0010\u000fJ$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010\u000b\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e¨\u0006\u001f"}, d2 = {"Lio/legere/pdfiumandroid/suspend/PdfPageLinkKt;", "Ljava/io/Closeable;", "Lio/legere/pdfiumandroid/PdfPageLink;", "pageLink", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lio/legere/pdfiumandroid/PdfPageLink;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "countWebLinks", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "index", "length", "", "getURL", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countRects", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "linkIndex", "rectIndex", "Landroid/graphics/RectF;", "getRect", "Lkotlin/Pair;", "getTextRange", "Ljn0/h0;", "close", "()V", "Lio/legere/pdfiumandroid/PdfPageLink;", "getPageLink", "()Lio/legere/pdfiumandroid/PdfPageLink;", "Lkotlinx/coroutines/CoroutineDispatcher;", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PdfPageLinkKt implements Closeable {
    private final CoroutineDispatcher dispatcher;
    private final PdfPageLink pageLink;

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageLinkKt$countRects$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageLinkKt$countRects$2", f = "PdfPageLinkKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Integer>, Object> {
        final /* synthetic */ int $index;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i11, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$index = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageLinkKt.this.new AnonymousClass2(this.$index, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxInt(PdfPageLinkKt.this.getPageLink().countRects(this.$index));
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageLinkKt$countWebLinks$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageLinkKt$countWebLinks$2", f = "PdfPageLinkKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47072 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Integer>, Object> {
        int label;

        C47072(Continuation<? super C47072> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageLinkKt.this.new C47072(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxInt(PdfPageLinkKt.this.getPageLink().countWebLinks());
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((C47072) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageLinkKt$getRect$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/RectF;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageLinkKt$getRect$2", f = "PdfPageLinkKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47082 extends SuspendLambda implements p<CoroutineScope, Continuation<? super RectF>, Object> {
        final /* synthetic */ int $linkIndex;
        final /* synthetic */ int $rectIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47082(int i11, int i12, Continuation<? super C47082> continuation) {
            super(2, continuation);
            this.$linkIndex = i11;
            this.$rectIndex = i12;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageLinkKt.this.new C47082(this.$linkIndex, this.$rectIndex, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfPageLinkKt.this.getPageLink().getRect(this.$linkIndex, this.$rectIndex);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RectF> continuation) {
            return ((C47082) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageLinkKt$getTextRange$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageLinkKt$getTextRange$2", f = "PdfPageLinkKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47092 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Pair<? extends Integer, ? extends Integer>>, Object> {
        final /* synthetic */ int $index;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47092(int i11, Continuation<? super C47092> continuation) {
            super(2, continuation);
            this.$index = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageLinkKt.this.new C47092(this.$index, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends Integer, ? extends Integer>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Pair<Integer, Integer>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfPageLinkKt.this.getPageLink().getTextRange(this.$index);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<Integer, Integer>> continuation) {
            return ((C47092) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageLinkKt$getURL$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageLinkKt$getURL$2", f = "PdfPageLinkKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47102 extends SuspendLambda implements p<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ int $length;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47102(int i11, int i12, Continuation<? super C47102> continuation) {
            super(2, continuation);
            this.$index = i11;
            this.$length = i12;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageLinkKt.this.new C47102(this.$index, this.$length, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfPageLinkKt.this.getPageLink().getURL(this.$index, this.$length);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C47102) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public PdfPageLinkKt(PdfPageLink pageLink, CoroutineDispatcher dispatcher) {
        s.k(pageLink, "pageLink");
        s.k(dispatcher, "dispatcher");
        this.pageLink = pageLink;
        this.dispatcher = dispatcher;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.pageLink.close();
    }

    public final Object countRects(int i11, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(this.dispatcher, new AnonymousClass2(i11, null), continuation);
    }

    public final Object countWebLinks(Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47072(null), continuation);
    }

    public final PdfPageLink getPageLink() {
        return this.pageLink;
    }

    public final Object getRect(int i11, int i12, Continuation<? super RectF> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47082(i11, i12, null), continuation);
    }

    public final Object getTextRange(int i11, Continuation<? super Pair<Integer, Integer>> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47092(i11, null), continuation);
    }

    public final Object getURL(int i11, int i12, Continuation<? super String> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47102(i11, i12, null), continuation);
    }
}
