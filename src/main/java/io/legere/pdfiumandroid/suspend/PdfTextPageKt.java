package io.legere.pdfiumandroid.suspend;

import android.graphics.RectF;
import androidx.annotation.Keep;
import io.legere.pdfiumandroid.FindFlags;
import io.legere.pdfiumandroid.FindResult;
import io.legere.pdfiumandroid.Logger;
import io.legere.pdfiumandroid.PdfTextPage;
import io.legere.pdfiumandroid.WordRangeRect;
import java.io.Closeable;
import java.util.List;
import java.util.Set;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0015\u0010\u0013J0\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u001e\u0010\u000fJ\u001a\u0010 \u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001f\u001a\u00020\bH\u0086@¢\u0006\u0004\b \u0010\u0013J \u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2\u0006\u0010\"\u001a\u00020!H\u0086@¢\u0006\u0004\b%\u0010&J\"\u0010(\u001a\u0004\u0018\u00010\r2\u0006\u0010'\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\bH\u0086@¢\u0006\u0004\b(\u0010)J\u0018\u0010+\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\bH\u0086@¢\u0006\u0004\b+\u0010\u0013J0\u00101\u001a\u0004\u0018\u0001002\u0006\u0010,\u001a\u00020\r2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010\u000b\u001a\u00020\bH\u0086@¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203H\u0086@¢\u0006\u0004\b4\u0010\nJ\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\r\u00109\u001a\u000208¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>¨\u0006?"}, d2 = {"Lio/legere/pdfiumandroid/suspend/PdfTextPageKt;", "Ljava/io/Closeable;", "Lio/legere/pdfiumandroid/PdfTextPage;", "page", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lio/legere/pdfiumandroid/PdfTextPage;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "textPageCountChars", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startIndex", "length", "", "textPageGetText", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "index", "", "textPageGetUnicode", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/RectF;", "textPageGetCharBox", "", "x", "y", "xTolerance", "yTolerance", "textPageGetCharIndexAtPos", "(DDDDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "count", "textPageCountRects", "rectIndex", "textPageGetRect", "", "wordRanges", "", "Lio/legere/pdfiumandroid/WordRangeRect;", "textPageGetRectsForRanges", "([ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rect", "textPageGetBoundedText", "(Landroid/graphics/RectF;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "charIndex", "getFontSize", "findWhat", "", "Lio/legere/pdfiumandroid/FindFlags;", "flags", "Lio/legere/pdfiumandroid/suspend/FindResultKt;", "findStart", "(Ljava/lang/String;Ljava/util/Set;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/legere/pdfiumandroid/suspend/PdfPageLinkKt;", "loadWebLink", "Ljn0/h0;", "close", "()V", "", "safeClose", "()Z", "Lio/legere/pdfiumandroid/PdfTextPage;", "getPage", "()Lio/legere/pdfiumandroid/PdfTextPage;", "Lkotlinx/coroutines/CoroutineDispatcher;", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PdfTextPageKt implements Closeable {
    private final CoroutineDispatcher dispatcher;
    private final PdfTextPage page;

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$findStart$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/legere/pdfiumandroid/suspend/FindResultKt;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$findStart$2", f = "PdfTextPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, Continuation<? super FindResultKt>, Object> {
        final /* synthetic */ String $findWhat;
        final /* synthetic */ Set<FindFlags> $flags;
        final /* synthetic */ int $startIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(String str, Set<? extends FindFlags> set, int i11, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$findWhat = str;
            this.$flags = set;
            this.$startIndex = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfTextPageKt.this.new AnonymousClass2(this.$findWhat, this.$flags, this.$startIndex, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            FindResult findResultFindStart = PdfTextPageKt.this.getPage().findStart(this.$findWhat, this.$flags, this.$startIndex);
            if (findResultFindStart == null) {
                return null;
            }
            return new FindResultKt(findResultFindStart, PdfTextPageKt.this.dispatcher);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FindResultKt> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$getFontSize$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$getFontSize$2", f = "PdfTextPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47112 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Double>, Object> {
        final /* synthetic */ int $charIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47112(int i11, Continuation<? super C47112> continuation) {
            super(2, continuation);
            this.$charIndex = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfTextPageKt.this.new C47112(this.$charIndex, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxDouble(PdfTextPageKt.this.getPage().getFontSize(this.$charIndex));
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Double> continuation) {
            return ((C47112) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$loadWebLink$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/legere/pdfiumandroid/suspend/PdfPageLinkKt;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$loadWebLink$2", f = "PdfTextPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47122 extends SuspendLambda implements p<CoroutineScope, Continuation<? super PdfPageLinkKt>, Object> {
        int label;

        C47122(Continuation<? super C47122> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfTextPageKt.this.new C47122(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return new PdfPageLinkKt(PdfTextPageKt.this.getPage().loadWebLink(), PdfTextPageKt.this.dispatcher);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PdfPageLinkKt> continuation) {
            return ((C47122) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageCountChars$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageCountChars$2", f = "PdfTextPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47132 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Integer>, Object> {
        int label;

        C47132(Continuation<? super C47132> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfTextPageKt.this.new C47132(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxInt(PdfTextPageKt.this.getPage().textPageCountChars());
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((C47132) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageCountRects$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageCountRects$2", f = "PdfTextPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47142 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Integer>, Object> {
        final /* synthetic */ int $count;
        final /* synthetic */ int $startIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47142(int i11, int i12, Continuation<? super C47142> continuation) {
            super(2, continuation);
            this.$startIndex = i11;
            this.$count = i12;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfTextPageKt.this.new C47142(this.$startIndex, this.$count, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxInt(PdfTextPageKt.this.getPage().textPageCountRects(this.$startIndex, this.$count));
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((C47142) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetBoundedText$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetBoundedText$2", f = "PdfTextPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47152 extends SuspendLambda implements p<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ int $length;
        final /* synthetic */ RectF $rect;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47152(RectF rectF, int i11, Continuation<? super C47152> continuation) {
            super(2, continuation);
            this.$rect = rectF;
            this.$length = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfTextPageKt.this.new C47152(this.$rect, this.$length, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfTextPageKt.this.getPage().textPageGetBoundedText(this.$rect, this.$length);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C47152) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetCharBox$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/RectF;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetCharBox$2", f = "PdfTextPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47162 extends SuspendLambda implements p<CoroutineScope, Continuation<? super RectF>, Object> {
        final /* synthetic */ int $index;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47162(int i11, Continuation<? super C47162> continuation) {
            super(2, continuation);
            this.$index = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfTextPageKt.this.new C47162(this.$index, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfTextPageKt.this.getPage().textPageGetCharBox(this.$index);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RectF> continuation) {
            return ((C47162) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetCharIndexAtPos$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetCharIndexAtPos$2", f = "PdfTextPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47172 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Integer>, Object> {
        final /* synthetic */ double $x;
        final /* synthetic */ double $xTolerance;
        final /* synthetic */ double $y;
        final /* synthetic */ double $yTolerance;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47172(double d11, double d12, double d13, double d14, Continuation<? super C47172> continuation) {
            super(2, continuation);
            this.$x = d11;
            this.$y = d12;
            this.$xTolerance = d13;
            this.$yTolerance = d14;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfTextPageKt.this.new C47172(this.$x, this.$y, this.$xTolerance, this.$yTolerance, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxInt(PdfTextPageKt.this.getPage().textPageGetCharIndexAtPos(this.$x, this.$y, this.$xTolerance, this.$yTolerance));
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((C47172) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetRect$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/RectF;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetRect$2", f = "PdfTextPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47182 extends SuspendLambda implements p<CoroutineScope, Continuation<? super RectF>, Object> {
        final /* synthetic */ int $rectIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47182(int i11, Continuation<? super C47182> continuation) {
            super(2, continuation);
            this.$rectIndex = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfTextPageKt.this.new C47182(this.$rectIndex, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfTextPageKt.this.getPage().textPageGetRect(this.$rectIndex);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RectF> continuation) {
            return ((C47182) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetRectsForRanges$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/legere/pdfiumandroid/WordRangeRect;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetRectsForRanges$2", f = "PdfTextPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47192 extends SuspendLambda implements p<CoroutineScope, Continuation<? super List<? extends WordRangeRect>>, Object> {
        final /* synthetic */ int[] $wordRanges;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47192(int[] iArr, Continuation<? super C47192> continuation) {
            super(2, continuation);
            this.$wordRanges = iArr;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfTextPageKt.this.new C47192(this.$wordRanges, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends WordRangeRect>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<WordRangeRect>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfTextPageKt.this.getPage().textPageGetRectsForRanges(this.$wordRanges);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<WordRangeRect>> continuation) {
            return ((C47192) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetText$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetText$2", f = "PdfTextPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47202 extends SuspendLambda implements p<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ int $length;
        final /* synthetic */ int $startIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47202(int i11, int i12, Continuation<? super C47202> continuation) {
            super(2, continuation);
            this.$startIndex = i11;
            this.$length = i12;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfTextPageKt.this.new C47202(this.$startIndex, this.$length, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfTextPageKt.this.getPage().textPageGetText(this.$startIndex, this.$length);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C47202) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetUnicode$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\f\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetUnicode$2", f = "PdfTextPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47212 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Character>, Object> {
        final /* synthetic */ int $index;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47212(int i11, Continuation<? super C47212> continuation) {
            super(2, continuation);
            this.$index = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfTextPageKt.this.new C47212(this.$index, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxChar(PdfTextPageKt.this.getPage().textPageGetUnicode(this.$index));
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Character> continuation) {
            return ((C47212) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public PdfTextPageKt(PdfTextPage page, CoroutineDispatcher dispatcher) {
        s.k(page, "page");
        s.k(dispatcher, "dispatcher");
        this.page = page;
        this.dispatcher = dispatcher;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.page.close();
    }

    public final Object findStart(String str, Set<? extends FindFlags> set, int i11, Continuation<? super FindResultKt> continuation) {
        return BuildersKt.withContext(this.dispatcher, new AnonymousClass2(str, set, i11, null), continuation);
    }

    public final Object getFontSize(int i11, Continuation<? super Double> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47112(i11, null), continuation);
    }

    public final PdfTextPage getPage() {
        return this.page;
    }

    public final Object loadWebLink(Continuation<? super PdfPageLinkKt> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47122(null), continuation);
    }

    public final boolean safeClose() {
        try {
            this.page.close();
            return true;
        } catch (IllegalStateException e11) {
            Logger.INSTANCE.e("PdfTextPageKt", e11, "PdfTextPageKt.safeClose");
            return false;
        }
    }

    public final Object textPageCountChars(Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47132(null), continuation);
    }

    public final Object textPageCountRects(int i11, int i12, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47142(i11, i12, null), continuation);
    }

    public final Object textPageGetBoundedText(RectF rectF, int i11, Continuation<? super String> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47152(rectF, i11, null), continuation);
    }

    public final Object textPageGetCharBox(int i11, Continuation<? super RectF> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47162(i11, null), continuation);
    }

    public final Object textPageGetCharIndexAtPos(double d11, double d12, double d13, double d14, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47172(d11, d12, d13, d14, null), continuation);
    }

    public final Object textPageGetRect(int i11, Continuation<? super RectF> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47182(i11, null), continuation);
    }

    public final Object textPageGetRectsForRanges(int[] iArr, Continuation<? super List<WordRangeRect>> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47192(iArr, null), continuation);
    }

    public final Object textPageGetText(int i11, int i12, Continuation<? super String> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47202(i11, i12, null), continuation);
    }

    public final Object textPageGetUnicode(int i11, Continuation<? super Character> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47212(i11, null), continuation);
    }
}
