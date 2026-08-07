package io.legere.pdfiumandroid.suspend;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Surface;
import androidx.annotation.Keep;
import com.plaid.internal.EnumC4419g;
import io.legere.pdfiumandroid.Logger;
import io.legere.pdfiumandroid.PdfDocument;
import io.legere.pdfiumandroid.PdfPage;
import io.legere.pdfiumandroid.PdfiumCore;
import io.legere.pdfiumandroid.util.Size;
import java.io.Closeable;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.sync.Mutex;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SpillingKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.j0;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0011\u0010\nJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0016\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0017\u0010\nJ\u0010\u0010\u0018\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0018\u0010\nJ\u0010\u0010\u0019\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0019\u0010\nJ\u0010\u0010\u001a\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u001a\u0010\nJ\u0010\u0010\u001b\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u001b\u0010\nJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u001d\u0010\u000eJX\u0010(\u001a\u00020$2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b(\u0010)JR\u0010(\u001a\u00020$2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00152\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010,\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b(\u0010-J`\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010,\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b1\u00102JR\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00152\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010,\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b1\u00103J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0086@¢\u0006\u0004\b6\u0010\nJH\u0010>\u001a\u00020=2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:H\u0086@¢\u0006\u0004\b>\u0010?JH\u0010C\u001a\u00020B2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000bH\u0086@¢\u0006\u0004\bC\u0010DJ@\u0010G\u001a\u00020F2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u0015H\u0086@¢\u0006\u0004\bG\u0010HJ@\u0010I\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020FH\u0086@¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u000200H\u0016¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020$¢\u0006\u0004\bM\u0010NR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010R¨\u0006S"}, d2 = {"Lio/legere/pdfiumandroid/suspend/PdfPageKt;", "Ljava/io/Closeable;", "Lio/legere/pdfiumandroid/PdfPage;", "page", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lio/legere/pdfiumandroid/PdfPage;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lio/legere/pdfiumandroid/suspend/PdfTextPageKt;", "openTextPage", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "screenDpi", "getPageWidth", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPageHeight", "getPageWidthPoint", "getPageHeightPoint", "Landroid/graphics/Matrix;", "getPageMatrix", "getPageRotation", "Landroid/graphics/RectF;", "getPageCropBox", "getPageMediaBox", "getPageBleedBox", "getPageTrimBox", "getPageArtBox", "getPageBoundingBox", "Lio/legere/pdfiumandroid/util/Size;", "getPageSize", "Landroid/view/Surface;", "surface", "startX", "startY", "drawSizeX", "drawSizeY", "", "renderAnnot", "canvasColor", "pageBackgroundColor", "renderPage", "(Landroid/view/Surface;IIIIZIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "matrix", "clipRect", "textMask", "(Landroid/view/Surface;Landroid/graphics/Matrix;Landroid/graphics/RectF;ZZIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "bitmap", "Ljn0/h0;", "renderPageBitmap", "(Landroid/graphics/Bitmap;IIIIZZIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/RectF;ZZIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lio/legere/pdfiumandroid/PdfDocument$Link;", "getPageLinks", "sizeX", "sizeY", "rotate", "", "pageX", "pageY", "Landroid/graphics/Point;", "mapPageCoordsToDevice", "(IIIIIDDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deviceX", "deviceY", "Landroid/graphics/PointF;", "mapDeviceCoordsToPage", "(IIIIIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coords", "Landroid/graphics/Rect;", "mapRectToDevice", "(IIIIILandroid/graphics/RectF;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapRectToPage", "(IIIIILandroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "safeClose", "()Z", "Lio/legere/pdfiumandroid/PdfPage;", "getPage", "()Lio/legere/pdfiumandroid/PdfPage;", "Lkotlinx/coroutines/CoroutineDispatcher;", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PdfPageKt implements Closeable {
    private final CoroutineDispatcher dispatcher;
    private final PdfPage page;

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageArtBox$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/RectF;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageArtBox$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, Continuation<? super RectF>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new AnonymousClass2(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfPageKt.this.getPage().getPageArtBox();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RectF> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageBleedBox$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/RectF;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageBleedBox$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46882 extends SuspendLambda implements p<CoroutineScope, Continuation<? super RectF>, Object> {
        int label;

        C46882(Continuation<? super C46882> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new C46882(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfPageKt.this.getPage().getPageBleedBox();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RectF> continuation) {
            return ((C46882) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageBoundingBox$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/RectF;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageBoundingBox$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46892 extends SuspendLambda implements p<CoroutineScope, Continuation<? super RectF>, Object> {
        int label;

        C46892(Continuation<? super C46892> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new C46892(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfPageKt.this.getPage().getPageBoundingBox();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RectF> continuation) {
            return ((C46892) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageCropBox$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/RectF;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageCropBox$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46902 extends SuspendLambda implements p<CoroutineScope, Continuation<? super RectF>, Object> {
        int label;

        C46902(Continuation<? super C46902> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new C46902(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfPageKt.this.getPage().getPageCropBox();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RectF> continuation) {
            return ((C46902) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageHeight$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageHeight$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46912 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Integer>, Object> {
        final /* synthetic */ int $screenDpi;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C46912(int i11, Continuation<? super C46912> continuation) {
            super(2, continuation);
            this.$screenDpi = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new C46912(this.$screenDpi, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxInt(PdfPageKt.this.getPage().getPageHeight(this.$screenDpi));
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((C46912) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageHeightPoint$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageHeightPoint$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46922 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Integer>, Object> {
        int label;

        C46922(Continuation<? super C46922> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new C46922(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxInt(PdfPageKt.this.getPage().getPageHeightPoint());
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((C46922) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageLinks$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/legere/pdfiumandroid/PdfDocument$Link;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageLinks$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46932 extends SuspendLambda implements p<CoroutineScope, Continuation<? super List<? extends PdfDocument.Link>>, Object> {
        int label;

        C46932(Continuation<? super C46932> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new C46932(continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends PdfDocument.Link>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<PdfDocument.Link>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfPageKt.this.getPage().getPageLinks();
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<PdfDocument.Link>> continuation) {
            return ((C46932) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageMatrix$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Matrix;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageMatrix$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46942 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Matrix>, Object> {
        int label;

        C46942(Continuation<? super C46942> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new C46942(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfPageKt.this.getPage().getPageMatrix();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Matrix> continuation) {
            return ((C46942) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageMediaBox$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/RectF;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageMediaBox$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46952 extends SuspendLambda implements p<CoroutineScope, Continuation<? super RectF>, Object> {
        int label;

        C46952(Continuation<? super C46952> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new C46952(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfPageKt.this.getPage().getPageMediaBox();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RectF> continuation) {
            return ((C46952) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageRotation$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageRotation$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46962 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Integer>, Object> {
        int label;

        C46962(Continuation<? super C46962> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new C46962(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxInt(PdfPageKt.this.getPage().getPageRotation());
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((C46962) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageSize$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/legere/pdfiumandroid/util/Size;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageSize$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46972 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Size>, Object> {
        final /* synthetic */ int $screenDpi;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C46972(int i11, Continuation<? super C46972> continuation) {
            super(2, continuation);
            this.$screenDpi = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new C46972(this.$screenDpi, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfPageKt.this.getPage().getPageSize(this.$screenDpi);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Size> continuation) {
            return ((C46972) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageTrimBox$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/RectF;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageTrimBox$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46982 extends SuspendLambda implements p<CoroutineScope, Continuation<? super RectF>, Object> {
        int label;

        C46982(Continuation<? super C46982> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new C46982(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfPageKt.this.getPage().getPageTrimBox();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RectF> continuation) {
            return ((C46982) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageWidth$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageWidth$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C46992 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Integer>, Object> {
        final /* synthetic */ int $screenDpi;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C46992(int i11, Continuation<? super C46992> continuation) {
            super(2, continuation);
            this.$screenDpi = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new C46992(this.$screenDpi, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxInt(PdfPageKt.this.getPage().getPageWidth(this.$screenDpi));
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((C46992) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageWidthPoint$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageWidthPoint$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47002 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Integer>, Object> {
        int label;

        C47002(Continuation<? super C47002> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new C47002(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxInt(PdfPageKt.this.getPage().getPageWidthPoint());
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((C47002) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$mapDeviceCoordsToPage$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/PointF;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$mapDeviceCoordsToPage$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47012 extends SuspendLambda implements p<CoroutineScope, Continuation<? super PointF>, Object> {
        final /* synthetic */ int $deviceX;
        final /* synthetic */ int $deviceY;
        final /* synthetic */ int $rotate;
        final /* synthetic */ int $sizeX;
        final /* synthetic */ int $sizeY;
        final /* synthetic */ int $startX;
        final /* synthetic */ int $startY;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47012(int i11, int i12, int i13, int i14, int i15, int i16, int i17, Continuation<? super C47012> continuation) {
            super(2, continuation);
            this.$startX = i11;
            this.$startY = i12;
            this.$sizeX = i13;
            this.$sizeY = i14;
            this.$rotate = i15;
            this.$deviceX = i16;
            this.$deviceY = i17;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new C47012(this.$startX, this.$startY, this.$sizeX, this.$sizeY, this.$rotate, this.$deviceX, this.$deviceY, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfPageKt.this.getPage().mapDeviceCoordsToPage(this.$startX, this.$startY, this.$sizeX, this.$sizeY, this.$rotate, this.$deviceX, this.$deviceY);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PointF> continuation) {
            return ((C47012) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$mapPageCoordsToDevice$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Point;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$mapPageCoordsToDevice$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47022 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Point>, Object> {
        final /* synthetic */ double $pageX;
        final /* synthetic */ double $pageY;
        final /* synthetic */ int $rotate;
        final /* synthetic */ int $sizeX;
        final /* synthetic */ int $sizeY;
        final /* synthetic */ int $startX;
        final /* synthetic */ int $startY;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47022(int i11, int i12, int i13, int i14, int i15, double d11, double d12, Continuation<? super C47022> continuation) {
            super(2, continuation);
            this.$startX = i11;
            this.$startY = i12;
            this.$sizeX = i13;
            this.$sizeY = i14;
            this.$rotate = i15;
            this.$pageX = d11;
            this.$pageY = d12;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new C47022(this.$startX, this.$startY, this.$sizeX, this.$sizeY, this.$rotate, this.$pageX, this.$pageY, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfPageKt.this.getPage().mapPageCoordsToDevice(this.$startX, this.$startY, this.$sizeX, this.$sizeY, this.$rotate, this.$pageX, this.$pageY);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Point> continuation) {
            return ((C47022) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$mapRectToDevice$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Rect;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$mapRectToDevice$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47032 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Rect>, Object> {
        final /* synthetic */ RectF $coords;
        final /* synthetic */ int $rotate;
        final /* synthetic */ int $sizeX;
        final /* synthetic */ int $sizeY;
        final /* synthetic */ int $startX;
        final /* synthetic */ int $startY;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47032(int i11, int i12, int i13, int i14, int i15, RectF rectF, Continuation<? super C47032> continuation) {
            super(2, continuation);
            this.$startX = i11;
            this.$startY = i12;
            this.$sizeX = i13;
            this.$sizeY = i14;
            this.$rotate = i15;
            this.$coords = rectF;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new C47032(this.$startX, this.$startY, this.$sizeX, this.$sizeY, this.$rotate, this.$coords, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfPageKt.this.getPage().mapRectToDevice(this.$startX, this.$startY, this.$sizeX, this.$sizeY, this.$rotate, this.$coords);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Rect> continuation) {
            return ((C47032) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$mapRectToPage$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/RectF;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$mapRectToPage$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47042 extends SuspendLambda implements p<CoroutineScope, Continuation<? super RectF>, Object> {
        final /* synthetic */ Rect $coords;
        final /* synthetic */ int $rotate;
        final /* synthetic */ int $sizeX;
        final /* synthetic */ int $sizeY;
        final /* synthetic */ int $startX;
        final /* synthetic */ int $startY;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47042(int i11, int i12, int i13, int i14, int i15, Rect rect, Continuation<? super C47042> continuation) {
            super(2, continuation);
            this.$startX = i11;
            this.$startY = i12;
            this.$sizeX = i13;
            this.$sizeY = i14;
            this.$rotate = i15;
            this.$coords = rect;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new C47042(this.$startX, this.$startY, this.$sizeX, this.$sizeY, this.$rotate, this.$coords, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return PdfPageKt.this.getPage().mapRectToPage(this.$startX, this.$startY, this.$sizeX, this.$sizeY, this.$rotate, this.$coords);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RectF> continuation) {
            return ((C47042) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$openTextPage$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/legere/pdfiumandroid/suspend/PdfTextPageKt;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$openTextPage$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47052 extends SuspendLambda implements p<CoroutineScope, Continuation<? super PdfTextPageKt>, Object> {
        int label;

        C47052(Continuation<? super C47052> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new C47052(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return new PdfTextPageKt(PdfPageKt.this.getPage().openTextPage(), PdfPageKt.this.dispatcher);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PdfTextPageKt> continuation) {
            return ((C47052) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$renderPage$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt", f = "PdfPageKt.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {400, 167, 181, 194}, m = "renderPage", n = {"surface", "retValue", "$this$withLock_u24default$iv", "startX", "startY", "drawSizeX", "drawSizeY", "renderAnnot", "canvasColor", "pageBackgroundColor", "$i$f$withLock", "surface", "retValue", "$this$withLock_u24default$iv", "sizes", "pointers", "startX", "startY", "drawSizeX", "drawSizeY", "renderAnnot", "canvasColor", "pageBackgroundColor", "$i$f$withLock", "$i$a$-withLock$default-PdfPageKt$renderPage$2", "surface", "retValue", "$this$withLock_u24default$iv", "sizes", "pointers", "startX", "startY", "drawSizeX", "drawSizeY", "renderAnnot", "canvasColor", "pageBackgroundColor", "$i$f$withLock", "$i$a$-withLock$default-PdfPageKt$renderPage$2", "nativeWindow", "bufferPtr", "surface", "retValue", "$this$withLock_u24default$iv", "sizes", "pointers", "startX", "startY", "drawSizeX", "drawSizeY", "renderAnnot", "canvasColor", "pageBackgroundColor", "$i$f$withLock", "$i$a$-withLock$default-PdfPageKt$renderPage$2", "nativeWindow", "bufferPtr"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3", "Z$0", "I$4", "I$5", "I$6", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "Z$0", "I$4", "I$5", "I$6", "I$7", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "Z$0", "I$4", "I$5", "I$6", "I$7", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "Z$0", "I$4", "I$5", "I$6", "I$7", "J$0", "J$1"}, v = 1)
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
        int I$6;
        int I$7;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PdfPageKt.this.renderPage(null, 0, 0, 0, 0, false, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$renderPage$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt", f = "PdfPageKt.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {400, EnumC4419g.SDK_ASSET_ICON_QUESTION_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE}, m = "renderPage", n = {"surface", "matrix", "clipRect", "retValue", "$this$withLock_u24default$iv", "renderAnnot", "textMask", "canvasColor", "pageBackgroundColor", "$i$f$withLock", "surface", "matrix", "clipRect", "retValue", "$this$withLock_u24default$iv", "sizes", "pointers", "renderAnnot", "textMask", "canvasColor", "pageBackgroundColor", "$i$f$withLock", "$i$a$-withLock$default-PdfPageKt$renderPage$4", "surface", "matrix", "clipRect", "retValue", "$this$withLock_u24default$iv", "sizes", "pointers", "renderAnnot", "textMask", "canvasColor", "pageBackgroundColor", "$i$f$withLock", "$i$a$-withLock$default-PdfPageKt$renderPage$4", "nativeWindow", "bufferPtr", "surfaceWidth", "surfaceHeight", "surface", "matrix", "clipRect", "retValue", "$this$withLock_u24default$iv", "sizes", "pointers", "renderAnnot", "textMask", "canvasColor", "pageBackgroundColor", "$i$f$withLock", "$i$a$-withLock$default-PdfPageKt$renderPage$4", "nativeWindow", "bufferPtr", "surfaceWidth", "surfaceHeight"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "Z$1", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "Z$1", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "Z$1", "I$0", "I$1", "I$2", "I$3", "J$0", "J$1", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "Z$1", "I$0", "I$1", "I$2", "I$3", "J$0", "J$1", "I$4", "I$5"}, v = 1)
    static final class AnonymousClass3 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PdfPageKt.this.renderPage(null, null, null, false, false, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$renderPageBitmap$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$renderPageBitmap$2", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C47062 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ int $canvasColor;
        final /* synthetic */ int $drawSizeX;
        final /* synthetic */ int $drawSizeY;
        final /* synthetic */ int $pageBackgroundColor;
        final /* synthetic */ boolean $renderAnnot;
        final /* synthetic */ int $startX;
        final /* synthetic */ int $startY;
        final /* synthetic */ boolean $textMask;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47062(Bitmap bitmap, int i11, int i12, int i13, int i14, boolean z11, boolean z12, int i15, int i16, Continuation<? super C47062> continuation) {
            super(2, continuation);
            this.$bitmap = bitmap;
            this.$startX = i11;
            this.$startY = i12;
            this.$drawSizeX = i13;
            this.$drawSizeY = i14;
            this.$renderAnnot = z11;
            this.$textMask = z12;
            this.$canvasColor = i15;
            this.$pageBackgroundColor = i16;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new C47062(this.$bitmap, this.$startX, this.$startY, this.$drawSizeX, this.$drawSizeY, this.$renderAnnot, this.$textMask, this.$canvasColor, this.$pageBackgroundColor, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            PdfPageKt.this.getPage().renderPageBitmap(this.$bitmap, this.$startX, this.$startY, this.$drawSizeX, this.$drawSizeY, this.$renderAnnot, this.$textMask, this.$canvasColor, this.$pageBackgroundColor);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C47062) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$renderPageBitmap$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKt$renderPageBitmap$4", f = "PdfPageKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class AnonymousClass4 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ int $canvasColor;
        final /* synthetic */ RectF $clipRect;
        final /* synthetic */ Matrix $matrix;
        final /* synthetic */ int $pageBackgroundColor;
        final /* synthetic */ boolean $renderAnnot;
        final /* synthetic */ boolean $textMask;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Bitmap bitmap, Matrix matrix, RectF rectF, boolean z11, boolean z12, int i11, int i12, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$bitmap = bitmap;
            this.$matrix = matrix;
            this.$clipRect = rectF;
            this.$renderAnnot = z11;
            this.$textMask = z12;
            this.$canvasColor = i11;
            this.$pageBackgroundColor = i12;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfPageKt.this.new AnonymousClass4(this.$bitmap, this.$matrix, this.$clipRect, this.$renderAnnot, this.$textMask, this.$canvasColor, this.$pageBackgroundColor, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            PdfPageKt.this.getPage().renderPageBitmap(this.$bitmap, this.$matrix, this.$clipRect, this.$renderAnnot, this.$textMask, this.$canvasColor, this.$pageBackgroundColor);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public PdfPageKt(PdfPage page, CoroutineDispatcher dispatcher) {
        s.k(page, "page");
        s.k(dispatcher, "dispatcher");
        this.page = page;
        this.dispatcher = dispatcher;
    }

    public static /* synthetic */ Object renderPageBitmap$default(PdfPageKt pdfPageKt, Bitmap bitmap, int i11, int i12, int i13, int i14, boolean z11, boolean z12, int i15, int i16, Continuation continuation, int i17, Object obj) {
        if ((i17 & 32) != 0) {
            z11 = false;
        }
        if ((i17 & 64) != 0) {
            z12 = false;
        }
        if ((i17 & 128) != 0) {
            i15 = -8092540;
        }
        if ((i17 & 256) != 0) {
            i16 = -1;
        }
        return pdfPageKt.renderPageBitmap(bitmap, i11, i12, i13, i14, z11, z12, i15, i16, continuation);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.page.close();
    }

    public final PdfPage getPage() {
        return this.page;
    }

    public final Object getPageArtBox(Continuation<? super RectF> continuation) {
        return BuildersKt.withContext(this.dispatcher, new AnonymousClass2(null), continuation);
    }

    public final Object getPageBleedBox(Continuation<? super RectF> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46882(null), continuation);
    }

    public final Object getPageBoundingBox(Continuation<? super RectF> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46892(null), continuation);
    }

    public final Object getPageCropBox(Continuation<? super RectF> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46902(null), continuation);
    }

    public final Object getPageHeight(int i11, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46912(i11, null), continuation);
    }

    public final Object getPageHeightPoint(Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46922(null), continuation);
    }

    public final Object getPageLinks(Continuation<? super List<PdfDocument.Link>> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46932(null), continuation);
    }

    public final Object getPageMatrix(Continuation<? super Matrix> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46942(null), continuation);
    }

    public final Object getPageMediaBox(Continuation<? super RectF> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46952(null), continuation);
    }

    public final Object getPageRotation(Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46962(null), continuation);
    }

    public final Object getPageSize(int i11, Continuation<? super Size> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46972(i11, null), continuation);
    }

    public final Object getPageTrimBox(Continuation<? super RectF> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46982(null), continuation);
    }

    public final Object getPageWidth(int i11, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C46992(i11, null), continuation);
    }

    public final Object getPageWidthPoint(Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47002(null), continuation);
    }

    public final Object mapDeviceCoordsToPage(int i11, int i12, int i13, int i14, int i15, int i16, int i17, Continuation<? super PointF> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47012(i11, i12, i13, i14, i15, i16, i17, null), continuation);
    }

    public final Object mapPageCoordsToDevice(int i11, int i12, int i13, int i14, int i15, double d11, double d12, Continuation<? super Point> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47022(i11, i12, i13, i14, i15, d11, d12, null), continuation);
    }

    public final Object mapRectToDevice(int i11, int i12, int i13, int i14, int i15, RectF rectF, Continuation<? super Rect> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47032(i11, i12, i13, i14, i15, rectF, null), continuation);
    }

    public final Object mapRectToPage(int i11, int i12, int i13, int i14, int i15, Rect rect, Continuation<? super RectF> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47042(i11, i12, i13, i14, i15, rect, null), continuation);
    }

    public final Object openTextPage(Continuation<? super PdfTextPageKt> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C47052(null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r37v2 */
    public final Object renderPage(Surface surface, int i11, int i12, int i13, int i14, boolean z11, int i15, int i16, Continuation<? super Boolean> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object obj;
        j0 j0Var;
        int i17;
        int i18;
        int i19;
        int i21;
        boolean z12;
        int i22;
        int i23;
        Surface surface2;
        int i24;
        int[] iArr;
        long[] jArr;
        MainCoroutineDispatcher main;
        char c11;
        int i25;
        Surface surface3;
        int[] iArr2;
        long[] jArr2;
        int i26;
        int i27;
        int i28;
        j0 j0Var2;
        boolean z13;
        int i29;
        long j11;
        ?? r15;
        int i31;
        j0 j0Var3;
        long j12;
        Object obj2;
        int i32;
        int i33;
        boolean z14;
        int i34;
        long[] jArr3;
        int i35;
        Surface surface4;
        int i36;
        long j13;
        int i37;
        MainCoroutineDispatcher main2;
        PdfPageKt$renderPage$2$3 pdfPageKt$renderPage$2$3;
        Object obj3;
        j0 j0Var4;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i38 = anonymousClass1.label;
            if ((i38 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i38 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj4 = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r11 = anonymousClass2.label;
        try {
            try {
                if (r11 == 0) {
                    t.b(obj4);
                    j0Var = new j0();
                    Mutex surfaceMutex = PdfiumCore.INSTANCE.getSurfaceMutex();
                    anonymousClass2.L$0 = surface;
                    anonymousClass2.L$1 = j0Var;
                    anonymousClass2.L$2 = surfaceMutex;
                    anonymousClass2.I$0 = i11;
                    anonymousClass2.I$1 = i12;
                    i17 = i13;
                    anonymousClass2.I$2 = i17;
                    anonymousClass2.I$3 = i14;
                    anonymousClass2.Z$0 = z11;
                    i18 = i15;
                    anonymousClass2.I$4 = i18;
                    i19 = i16;
                    anonymousClass2.I$5 = i19;
                    anonymousClass2.I$6 = 0;
                    anonymousClass2.label = 1;
                    if (surfaceMutex.lock(null, anonymousClass2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i21 = i11;
                    z12 = z11;
                    i22 = i12;
                    i23 = i14;
                    surface2 = surface;
                    i24 = 0;
                    r11 = surfaceMutex;
                } else {
                    if (r11 != 1) {
                        if (r11 != 2) {
                            if (r11 == 3) {
                                long j14 = anonymousClass2.J$1;
                                long j15 = anonymousClass2.J$0;
                                int i39 = anonymousClass2.I$7;
                                i33 = anonymousClass2.I$6;
                                i34 = anonymousClass2.I$5;
                                i18 = anonymousClass2.I$4;
                                z14 = anonymousClass2.Z$0;
                                int i41 = anonymousClass2.I$3;
                                int i42 = anonymousClass2.I$2;
                                int i43 = anonymousClass2.I$1;
                                int i44 = anonymousClass2.I$0;
                                long[] jArr4 = (long[]) anonymousClass2.L$4;
                                int[] iArr3 = (int[]) anonymousClass2.L$3;
                                Mutex mutex = (Mutex) anonymousClass2.L$2;
                                j0 j0Var5 = (j0) anonymousClass2.L$1;
                                Surface surface5 = (Surface) anonymousClass2.L$0;
                                try {
                                    t.b(obj4);
                                    jArr3 = jArr4;
                                    iArr2 = iArr3;
                                    surface4 = surface5;
                                    j12 = j15;
                                    i35 = i42;
                                    r15 = mutex;
                                    i31 = i44;
                                    j0Var3 = j0Var5;
                                    i37 = i39;
                                    i36 = i43;
                                    obj2 = coroutine_suspended;
                                    j13 = j14;
                                    i32 = i41;
                                    main2 = Dispatchers.getMain();
                                    long j16 = j13;
                                    long j17 = j12;
                                    pdfPageKt$renderPage$2$3 = new PdfPageKt$renderPage$2$3(j17, j16, null);
                                    obj3 = obj2;
                                    anonymousClass2.L$0 = SpillingKt.nullOutSpilledVariable(surface4);
                                    anonymousClass2.L$1 = j0Var3;
                                    anonymousClass2.L$2 = r15;
                                    anonymousClass2.L$3 = SpillingKt.nullOutSpilledVariable(iArr2);
                                    anonymousClass2.L$4 = SpillingKt.nullOutSpilledVariable(jArr3);
                                    anonymousClass2.I$0 = i31;
                                    anonymousClass2.I$1 = i36;
                                    anonymousClass2.I$2 = i35;
                                    anonymousClass2.I$3 = i32;
                                    anonymousClass2.Z$0 = z14;
                                    anonymousClass2.I$4 = i18;
                                    anonymousClass2.I$5 = i34;
                                    anonymousClass2.I$6 = i33;
                                    anonymousClass2.I$7 = i37;
                                    anonymousClass2.J$0 = j17;
                                    anonymousClass2.J$1 = j16;
                                    anonymousClass2.label = 4;
                                    if (BuildersKt.withContext(main2, pdfPageKt$renderPage$2$3, anonymousClass2) == obj3) {
                                        return obj3;
                                    }
                                    j0Var4 = j0Var3;
                                    r11 = r15;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r11 = mutex;
                                }
                            } else {
                                if (r11 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Mutex mutex2 = (Mutex) anonymousClass2.L$2;
                                j0Var4 = (j0) anonymousClass2.L$1;
                                t.b(obj4);
                                r11 = mutex2;
                            }
                            h0 h0Var = h0.f84049a;
                            r11.unlock(null);
                            return Boxing.boxBoolean(j0Var4.f86523a);
                        }
                        int i45 = anonymousClass2.I$7;
                        int i46 = anonymousClass2.I$6;
                        int i47 = anonymousClass2.I$5;
                        int i48 = anonymousClass2.I$4;
                        boolean z15 = anonymousClass2.Z$0;
                        int i49 = anonymousClass2.I$3;
                        int i51 = anonymousClass2.I$2;
                        int i52 = anonymousClass2.I$1;
                        i28 = anonymousClass2.I$0;
                        jArr2 = (long[]) anonymousClass2.L$4;
                        int[] iArr4 = (int[]) anonymousClass2.L$3;
                        Mutex mutex3 = (Mutex) anonymousClass2.L$2;
                        j0Var2 = (j0) anonymousClass2.L$1;
                        Surface surface6 = (Surface) anonymousClass2.L$0;
                        try {
                            t.b(obj4);
                            i19 = i47;
                            i25 = i52;
                            i18 = i48;
                            i17 = i51;
                            surface3 = surface6;
                            iArr2 = iArr4;
                            i27 = i49;
                            c11 = 0;
                            i29 = i45;
                            z13 = z15;
                            i26 = i46;
                            r11 = mutex3;
                            try {
                                long j18 = jArr2[c11];
                                j11 = jArr2[1];
                                if (j11 != 0 || j11 == -1 || j18 == 0 || j18 == -1) {
                                    r15 = r11;
                                    obj = null;
                                    try {
                                        Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                                        r15.unlock(null);
                                        return boolBoxBoolean;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r11 = r15;
                                        r11.unlock(obj);
                                        throw th;
                                    }
                                }
                                ?? r37 = r11;
                                int i53 = i28;
                                try {
                                    CoroutineDispatcher coroutineDispatcher = this.dispatcher;
                                    int i54 = i29;
                                    Object obj5 = coroutine_suspended;
                                    long[] jArr5 = jArr2;
                                    r15 = r37;
                                    int i55 = i26;
                                    int i56 = i27;
                                    j0 j0Var6 = j0Var2;
                                    i31 = i53;
                                    try {
                                        PdfPageKt$renderPage$2$2 pdfPageKt$renderPage$2$2 = new PdfPageKt$renderPage$2$2(j0Var6, this, j11, i31, i25, i17, i56, z13, i18, i19, null);
                                        anonymousClass2.L$0 = SpillingKt.nullOutSpilledVariable(surface3);
                                        anonymousClass2.L$1 = j0Var6;
                                        anonymousClass2.L$2 = r15;
                                        anonymousClass2.L$3 = SpillingKt.nullOutSpilledVariable(iArr2);
                                        anonymousClass2.L$4 = SpillingKt.nullOutSpilledVariable(jArr5);
                                        anonymousClass2.I$0 = i31;
                                        anonymousClass2.I$1 = i25;
                                        anonymousClass2.I$2 = i17;
                                        anonymousClass2.I$3 = i56;
                                        anonymousClass2.Z$0 = z13;
                                        anonymousClass2.I$4 = i18;
                                        anonymousClass2.I$5 = i19;
                                        anonymousClass2.I$6 = i55;
                                        anonymousClass2.I$7 = i54;
                                        j0Var3 = j0Var6;
                                        anonymousClass2.J$0 = j18;
                                        anonymousClass2.J$1 = j11;
                                        j12 = j18;
                                        anonymousClass2.label = 3;
                                        obj2 = obj5;
                                        if (BuildersKt.withContext(coroutineDispatcher, pdfPageKt$renderPage$2$2, anonymousClass2) == obj2) {
                                            return obj2;
                                        }
                                        i32 = i56;
                                        i33 = i55;
                                        int i57 = i19;
                                        z14 = z13;
                                        i34 = i57;
                                        jArr3 = jArr5;
                                        i35 = i17;
                                        surface4 = surface3;
                                        i36 = i25;
                                        j13 = j11;
                                        i37 = i54;
                                        r15 = r15;
                                        main2 = Dispatchers.getMain();
                                        long j19 = j13;
                                        long j110 = j12;
                                        pdfPageKt$renderPage$2$3 = new PdfPageKt$renderPage$2$3(j110, j19, null);
                                        obj3 = obj2;
                                        anonymousClass2.L$0 = SpillingKt.nullOutSpilledVariable(surface4);
                                        anonymousClass2.L$1 = j0Var3;
                                        anonymousClass2.L$2 = r15;
                                        anonymousClass2.L$3 = SpillingKt.nullOutSpilledVariable(iArr2);
                                        anonymousClass2.L$4 = SpillingKt.nullOutSpilledVariable(jArr3);
                                        anonymousClass2.I$0 = i31;
                                        anonymousClass2.I$1 = i36;
                                        anonymousClass2.I$2 = i35;
                                        anonymousClass2.I$3 = i32;
                                        anonymousClass2.Z$0 = z14;
                                        anonymousClass2.I$4 = i18;
                                        anonymousClass2.I$5 = i34;
                                        anonymousClass2.I$6 = i33;
                                        anonymousClass2.I$7 = i37;
                                        anonymousClass2.J$0 = j110;
                                        anonymousClass2.J$1 = j19;
                                        anonymousClass2.label = 4;
                                        if (BuildersKt.withContext(main2, pdfPageKt$renderPage$2$3, anonymousClass2) == obj3) {
                                            return obj3;
                                        }
                                        j0Var4 = j0Var3;
                                        r11 = r15;
                                        h0 h0Var2 = h0.f84049a;
                                        r11.unlock(null);
                                        return Boxing.boxBoolean(j0Var4.f86523a);
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj = null;
                                        r11 = r15;
                                        r11.unlock(obj);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    r15 = r37;
                                    obj = null;
                                    r11 = r15;
                                    r11.unlock(obj);
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            r11 = mutex3;
                        }
                        obj = null;
                        r11.unlock(obj);
                        throw th;
                    }
                    int i58 = anonymousClass2.I$6;
                    int i59 = anonymousClass2.I$5;
                    int i61 = anonymousClass2.I$4;
                    z12 = anonymousClass2.Z$0;
                    i23 = anonymousClass2.I$3;
                    i17 = anonymousClass2.I$2;
                    i22 = anonymousClass2.I$1;
                    i21 = anonymousClass2.I$0;
                    Mutex mutex4 = (Mutex) anonymousClass2.L$2;
                    j0 j0Var7 = (j0) anonymousClass2.L$1;
                    surface2 = (Surface) anonymousClass2.L$0;
                    t.b(obj4);
                    i24 = i58;
                    j0Var = j0Var7;
                    i19 = i59;
                    r11 = mutex4;
                    i18 = i61;
                }
                PdfPageKt$renderPage$2$1 pdfPageKt$renderPage$2$1 = new PdfPageKt$renderPage$2$1(surface2, iArr, jArr, null);
                anonymousClass2.L$0 = SpillingKt.nullOutSpilledVariable(surface2);
                anonymousClass2.L$1 = j0Var;
                anonymousClass2.L$2 = r11;
                anonymousClass2.L$3 = SpillingKt.nullOutSpilledVariable(iArr);
                anonymousClass2.L$4 = jArr;
                anonymousClass2.I$0 = i21;
                anonymousClass2.I$1 = i22;
                anonymousClass2.I$2 = i17;
                anonymousClass2.I$3 = i23;
                anonymousClass2.Z$0 = z12;
                anonymousClass2.I$4 = i18;
                anonymousClass2.I$5 = i19;
                anonymousClass2.I$6 = i24;
                anonymousClass2.I$7 = 0;
                c11 = 0;
                anonymousClass2.label = 2;
                Object objWithContext = BuildersKt.withContext(main, pdfPageKt$renderPage$2$1, anonymousClass2);
                coroutine_suspended = coroutine_suspended;
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i25 = i22;
                surface3 = surface2;
                iArr2 = iArr;
                jArr2 = jArr;
                i26 = i24;
                i27 = i23;
                i28 = i21;
                j0Var2 = j0Var;
                z13 = z12;
                i29 = 0;
                r11 = r11;
                long j111 = jArr2[c11];
                j11 = jArr2[1];
                if (j11 != 0) {
                }
                r15 = r11;
                obj = null;
                Boolean boolBoxBoolean2 = Boxing.boxBoolean(false);
                r15.unlock(null);
                return boolBoxBoolean2;
            } catch (Throwable th8) {
                th = th8;
            }
            iArr = new int[2];
            jArr = new long[2];
            main = Dispatchers.getMain();
            obj = null;
        } catch (Throwable th9) {
            th = th9;
        }
    }

    public final Object renderPageBitmap(Bitmap bitmap, int i11, int i12, int i13, int i14, boolean z11, boolean z12, int i15, int i16, Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(this.dispatcher, new C47062(bitmap, i11, i12, i13, i14, z11, z12, i15, i16, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    public final boolean safeClose() {
        try {
            this.page.close();
            return true;
        } catch (IllegalStateException e11) {
            Logger.INSTANCE.e("PdfPageKt", e11, "PdfPageKt.safeClose");
            return false;
        }
    }

    public static /* synthetic */ Object renderPage$default(PdfPageKt pdfPageKt, Surface surface, Matrix matrix, RectF rectF, boolean z11, boolean z12, int i11, int i12, Continuation continuation, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z11 = false;
        }
        if ((i13 & 16) != 0) {
            z12 = false;
        }
        if ((i13 & 32) != 0) {
            i11 = -8092540;
        }
        if ((i13 & 64) != 0) {
            i12 = -1;
        }
        return pdfPageKt.renderPage(surface, matrix, rectF, z11, z12, i11, i12, continuation);
    }

    public static /* synthetic */ Object renderPageBitmap$default(PdfPageKt pdfPageKt, Bitmap bitmap, Matrix matrix, RectF rectF, boolean z11, boolean z12, int i11, int i12, Continuation continuation, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z11 = false;
        }
        if ((i13 & 16) != 0) {
            z12 = false;
        }
        if ((i13 & 32) != 0) {
            i11 = -8092540;
        }
        if ((i13 & 64) != 0) {
            i12 = -1;
        }
        return pdfPageKt.renderPageBitmap(bitmap, matrix, rectF, z11, z12, i11, i12, continuation);
    }

    public final Object renderPageBitmap(Bitmap bitmap, Matrix matrix, RectF rectF, boolean z11, boolean z12, int i11, int i12, Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(this.dispatcher, new AnonymousClass4(bitmap, matrix, rectF, z11, z12, i11, i12, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object renderPage(Surface surface, Matrix matrix, RectF rectF, boolean z11, boolean z12, int i11, int i12, Continuation<? super Boolean> continuation) throws Throwable {
        AnonymousClass3 anonymousClass3;
        boolean z13;
        boolean z14;
        Mutex mutex;
        int i13;
        Matrix matrix2;
        j0 j0Var;
        Surface surface2;
        int i14;
        int i15;
        RectF rectF2;
        Object obj;
        Mutex mutex2;
        int[] iArr;
        long[] jArr;
        MainCoroutineDispatcher main;
        char c11;
        int i16;
        Surface surface3;
        int i17;
        boolean z15;
        Matrix matrix3;
        boolean z16;
        RectF rectF3;
        int[] iArr2;
        long[] jArr2;
        int i18;
        int i19;
        long j11;
        long j12;
        Mutex mutex3;
        Mutex mutex4;
        int i21;
        int i22;
        Object obj2;
        int i23;
        int i24;
        Matrix matrix4;
        long j13;
        long j14;
        boolean z17;
        Surface surface4;
        j0 j0Var2;
        int i25;
        Mutex mutex5;
        RectF rectF4;
        Object obj3;
        j0 j0Var3;
        if (continuation instanceof AnonymousClass3) {
            anonymousClass3 = (AnonymousClass3) continuation;
            int i26 = anonymousClass3.label;
            if ((i26 & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label = i26 - Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new AnonymousClass3(continuation);
            }
        } else {
            anonymousClass3 = new AnonymousClass3(continuation);
        }
        AnonymousClass3 anonymousClass4 = anonymousClass3;
        Object objWithContext = anonymousClass4.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i27 = anonymousClass4.label;
        try {
            try {
                if (i27 == 0) {
                    t.b(objWithContext);
                    j0 j0Var4 = new j0();
                    Mutex surfaceMutex = PdfiumCore.INSTANCE.getSurfaceMutex();
                    anonymousClass4.L$0 = surface;
                    anonymousClass4.L$1 = matrix;
                    anonymousClass4.L$2 = rectF;
                    anonymousClass4.L$3 = j0Var4;
                    anonymousClass4.L$4 = surfaceMutex;
                    z13 = z11;
                    anonymousClass4.Z$0 = z13;
                    z14 = z12;
                    anonymousClass4.Z$1 = z14;
                    anonymousClass4.I$0 = i11;
                    anonymousClass4.I$1 = i12;
                    anonymousClass4.I$2 = 0;
                    anonymousClass4.label = 1;
                    if (surfaceMutex.lock(null, anonymousClass4) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex = surfaceMutex;
                    i13 = i12;
                    matrix2 = matrix;
                    j0Var = j0Var4;
                    surface2 = surface;
                    i14 = i11;
                    i15 = 0;
                    rectF2 = rectF;
                } else {
                    if (i27 != 1) {
                        if (i27 == 2) {
                            int i28 = anonymousClass4.I$3;
                            int i29 = anonymousClass4.I$2;
                            int i31 = anonymousClass4.I$1;
                            int i32 = anonymousClass4.I$0;
                            boolean z18 = anonymousClass4.Z$1;
                            z15 = anonymousClass4.Z$0;
                            long[] jArr3 = (long[]) anonymousClass4.L$6;
                            int[] iArr3 = (int[]) anonymousClass4.L$5;
                            Mutex mutex6 = (Mutex) anonymousClass4.L$4;
                            j0Var = (j0) anonymousClass4.L$3;
                            RectF rectF5 = (RectF) anonymousClass4.L$2;
                            Matrix matrix5 = (Matrix) anonymousClass4.L$1;
                            Surface surface5 = (Surface) anonymousClass4.L$0;
                            try {
                                t.b(objWithContext);
                                i16 = i29;
                                mutex2 = mutex6;
                                i19 = i31;
                                i18 = i28;
                                surface3 = surface5;
                                jArr2 = jArr3;
                                iArr2 = iArr3;
                                c11 = 0;
                                i17 = i32;
                                matrix3 = matrix5;
                                z16 = z18;
                                rectF3 = rectF5;
                                try {
                                    j11 = jArr2[c11];
                                    j12 = jArr2[1];
                                    int i33 = iArr2[c11];
                                    int i34 = iArr2[1];
                                    Surface surface6 = surface3;
                                    Logger logger = Logger.INSTANCE;
                                    mutex3 = mutex2;
                                    try {
                                        int i35 = i18;
                                        StringBuilder sb2 = new StringBuilder();
                                        int i36 = i16;
                                        sb2.append("nativeWindow: ");
                                        sb2.append(j11);
                                        logger.d("PdfPageKt", sb2.toString());
                                        if (j12 == 0 && j12 != -1 && j11 != 0 && j11 != -1) {
                                            CoroutineDispatcher coroutineDispatcher = this.dispatcher;
                                            j0 j0Var5 = j0Var;
                                            i21 = i33;
                                            Object obj4 = coroutine_suspended;
                                            i22 = i34;
                                            PdfPageKt$renderPage$4$2 pdfPageKt$renderPage$4$2 = new PdfPageKt$renderPage$4$2(j0Var5, this, j12, i21, i22, matrix3, rectF3, z15, z16, i17, i19, null);
                                            anonymousClass4.L$0 = surface6;
                                            anonymousClass4.L$1 = SpillingKt.nullOutSpilledVariable(matrix3);
                                            anonymousClass4.L$2 = SpillingKt.nullOutSpilledVariable(rectF3);
                                            anonymousClass4.L$3 = j0Var5;
                                            mutex4 = mutex3;
                                            try {
                                                anonymousClass4.L$4 = mutex4;
                                                anonymousClass4.L$5 = SpillingKt.nullOutSpilledVariable(iArr2);
                                                anonymousClass4.L$6 = SpillingKt.nullOutSpilledVariable(jArr2);
                                                anonymousClass4.Z$0 = z15;
                                                anonymousClass4.Z$1 = z16;
                                                anonymousClass4.I$0 = i17;
                                                anonymousClass4.I$1 = i19;
                                                anonymousClass4.I$2 = i36;
                                                anonymousClass4.I$3 = i35;
                                                Matrix matrix6 = matrix3;
                                                RectF rectF6 = rectF3;
                                                anonymousClass4.J$0 = j11;
                                                anonymousClass4.J$1 = j12;
                                                anonymousClass4.I$4 = i21;
                                                anonymousClass4.I$5 = i22;
                                                anonymousClass4.label = 3;
                                                obj2 = obj4;
                                                if (BuildersKt.withContext(coroutineDispatcher, pdfPageKt$renderPage$4$2, anonymousClass4) == obj2) {
                                                    return obj2;
                                                }
                                                i23 = i17;
                                                i24 = i36;
                                                matrix4 = matrix6;
                                                j13 = j12;
                                                j14 = j11;
                                                z17 = z15;
                                                surface4 = surface6;
                                                j0Var2 = j0Var5;
                                                i25 = i35;
                                                mutex5 = mutex4;
                                                rectF4 = rectF6;
                                                MainCoroutineDispatcher main2 = Dispatchers.getMain();
                                                PdfPageKt$renderPage$4$3 pdfPageKt$renderPage$4$3 = new PdfPageKt$renderPage$4$3(surface4, j14, j13, null);
                                                obj3 = obj2;
                                                anonymousClass4.L$0 = SpillingKt.nullOutSpilledVariable(surface4);
                                                anonymousClass4.L$1 = SpillingKt.nullOutSpilledVariable(matrix4);
                                                anonymousClass4.L$2 = SpillingKt.nullOutSpilledVariable(rectF4);
                                                anonymousClass4.L$3 = j0Var2;
                                                anonymousClass4.L$4 = mutex5;
                                                anonymousClass4.L$5 = SpillingKt.nullOutSpilledVariable(iArr2);
                                                anonymousClass4.L$6 = SpillingKt.nullOutSpilledVariable(jArr2);
                                                anonymousClass4.Z$0 = z17;
                                                anonymousClass4.Z$1 = z16;
                                                anonymousClass4.I$0 = i23;
                                                anonymousClass4.I$1 = i19;
                                                anonymousClass4.I$2 = i24;
                                                anonymousClass4.I$3 = i25;
                                                anonymousClass4.J$0 = j14;
                                                anonymousClass4.J$1 = j13;
                                                anonymousClass4.I$4 = i21;
                                                anonymousClass4.I$5 = i22;
                                                anonymousClass4.label = 4;
                                                objWithContext = BuildersKt.withContext(main2, pdfPageKt$renderPage$4$3, anonymousClass4);
                                                if (objWithContext == obj3) {
                                                    return obj3;
                                                }
                                                mutex2 = mutex5;
                                                j0Var3 = j0Var2;
                                                mutex2.unlock(null);
                                                return Boxing.boxBoolean(j0Var3.f86523a);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                obj = null;
                                                mutex2 = mutex4;
                                            }
                                        } else {
                                            mutex4 = mutex3;
                                            obj = null;
                                            try {
                                                Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                                                mutex4.unlock(null);
                                                return boolBoxBoolean;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                mutex2 = mutex4;
                                                mutex2.unlock(obj);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        mutex4 = mutex3;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj = null;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                mutex2 = mutex6;
                            }
                        } else if (i27 == 3) {
                            int i37 = anonymousClass4.I$5;
                            int i38 = anonymousClass4.I$4;
                            long j15 = anonymousClass4.J$1;
                            long j16 = anonymousClass4.J$0;
                            i25 = anonymousClass4.I$3;
                            i24 = anonymousClass4.I$2;
                            i19 = anonymousClass4.I$1;
                            i23 = anonymousClass4.I$0;
                            boolean z19 = anonymousClass4.Z$1;
                            z17 = anonymousClass4.Z$0;
                            long[] jArr4 = (long[]) anonymousClass4.L$6;
                            int[] iArr4 = (int[]) anonymousClass4.L$5;
                            Mutex mutex7 = (Mutex) anonymousClass4.L$4;
                            j0 j0Var6 = (j0) anonymousClass4.L$3;
                            RectF rectF7 = (RectF) anonymousClass4.L$2;
                            Matrix matrix7 = (Matrix) anonymousClass4.L$1;
                            Surface surface7 = (Surface) anonymousClass4.L$0;
                            try {
                                t.b(objWithContext);
                                jArr2 = jArr4;
                                iArr2 = iArr4;
                                rectF4 = rectF7;
                                surface4 = surface7;
                                j13 = j15;
                                j14 = j16;
                                matrix4 = matrix7;
                                i22 = i37;
                                z16 = z19;
                                i21 = i38;
                                obj2 = coroutine_suspended;
                                mutex5 = mutex7;
                                j0Var2 = j0Var6;
                                try {
                                    MainCoroutineDispatcher main3 = Dispatchers.getMain();
                                    PdfPageKt$renderPage$4$3 pdfPageKt$renderPage$4$4 = new PdfPageKt$renderPage$4$3(surface4, j14, j13, null);
                                    obj3 = obj2;
                                    anonymousClass4.L$0 = SpillingKt.nullOutSpilledVariable(surface4);
                                    anonymousClass4.L$1 = SpillingKt.nullOutSpilledVariable(matrix4);
                                    anonymousClass4.L$2 = SpillingKt.nullOutSpilledVariable(rectF4);
                                    anonymousClass4.L$3 = j0Var2;
                                    anonymousClass4.L$4 = mutex5;
                                    anonymousClass4.L$5 = SpillingKt.nullOutSpilledVariable(iArr2);
                                    anonymousClass4.L$6 = SpillingKt.nullOutSpilledVariable(jArr2);
                                    anonymousClass4.Z$0 = z17;
                                    anonymousClass4.Z$1 = z16;
                                    anonymousClass4.I$0 = i23;
                                    anonymousClass4.I$1 = i19;
                                    anonymousClass4.I$2 = i24;
                                    anonymousClass4.I$3 = i25;
                                    anonymousClass4.J$0 = j14;
                                    anonymousClass4.J$1 = j13;
                                    anonymousClass4.I$4 = i21;
                                    anonymousClass4.I$5 = i22;
                                    anonymousClass4.label = 4;
                                    objWithContext = BuildersKt.withContext(main3, pdfPageKt$renderPage$4$4, anonymousClass4);
                                    if (objWithContext == obj3) {
                                        return obj3;
                                    }
                                    mutex2 = mutex5;
                                    j0Var3 = j0Var2;
                                    mutex2.unlock(null);
                                    return Boxing.boxBoolean(j0Var3.f86523a);
                                } catch (Throwable th7) {
                                    th = th7;
                                    obj = null;
                                    mutex2 = mutex5;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                mutex2 = mutex7;
                                obj = null;
                            }
                        } else {
                            if (i27 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) anonymousClass4.L$4;
                            j0Var3 = (j0) anonymousClass4.L$3;
                            try {
                                t.b(objWithContext);
                                mutex2.unlock(null);
                                return Boxing.boxBoolean(j0Var3.f86523a);
                            } catch (Throwable th9) {
                                th = th9;
                            }
                        }
                        obj = null;
                        mutex2.unlock(obj);
                        throw th;
                    }
                    i15 = anonymousClass4.I$2;
                    i13 = anonymousClass4.I$1;
                    i14 = anonymousClass4.I$0;
                    boolean z21 = anonymousClass4.Z$1;
                    boolean z22 = anonymousClass4.Z$0;
                    Mutex mutex8 = (Mutex) anonymousClass4.L$4;
                    j0 j0Var7 = (j0) anonymousClass4.L$3;
                    rectF2 = (RectF) anonymousClass4.L$2;
                    matrix2 = (Matrix) anonymousClass4.L$1;
                    surface2 = (Surface) anonymousClass4.L$0;
                    t.b(objWithContext);
                    j0Var = j0Var7;
                    z14 = z21;
                    mutex = mutex8;
                    z13 = z22;
                }
                PdfPageKt$renderPage$4$1 pdfPageKt$renderPage$4$1 = new PdfPageKt$renderPage$4$1(surface2, iArr, jArr, null);
                anonymousClass4.L$0 = surface2;
                anonymousClass4.L$1 = matrix2;
                anonymousClass4.L$2 = rectF2;
                anonymousClass4.L$3 = j0Var;
                anonymousClass4.L$4 = mutex;
                anonymousClass4.L$5 = iArr;
                anonymousClass4.L$6 = jArr;
                anonymousClass4.Z$0 = z13;
                anonymousClass4.Z$1 = z14;
                anonymousClass4.I$0 = i14;
                anonymousClass4.I$1 = i13;
                anonymousClass4.I$2 = i15;
                anonymousClass4.I$3 = 0;
                c11 = 0;
                anonymousClass4.label = 2;
                coroutine_suspended = coroutine_suspended;
                if (BuildersKt.withContext(main, pdfPageKt$renderPage$4$1, anonymousClass4) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i39 = i14;
                i16 = i15;
                surface3 = surface2;
                i17 = i39;
                RectF rectF8 = rectF2;
                z15 = z13;
                matrix3 = matrix2;
                z16 = z14;
                rectF3 = rectF8;
                iArr2 = iArr;
                jArr2 = jArr;
                i18 = 0;
                i19 = i13;
                mutex2 = mutex;
                j11 = jArr2[c11];
                j12 = jArr2[1];
                int i310 = iArr2[c11];
                int i311 = iArr2[1];
                Surface surface8 = surface3;
                Logger logger2 = Logger.INSTANCE;
                mutex3 = mutex2;
                int i312 = i18;
                StringBuilder sb3 = new StringBuilder();
                int i313 = i16;
                sb3.append("nativeWindow: ");
                sb3.append(j11);
                logger2.d("PdfPageKt", sb3.toString());
                if (j12 == 0) {
                }
                mutex4 = mutex3;
                obj = null;
                Boolean boolBoxBoolean2 = Boxing.boxBoolean(false);
                mutex4.unlock(null);
                return boolBoxBoolean2;
            } catch (Throwable th10) {
                th = th10;
                obj = null;
                mutex2 = mutex;
            }
            iArr = new int[2];
            jArr = new long[2];
            main = Dispatchers.getMain();
        } catch (Throwable th11) {
            th = th11;
            obj = null;
        }
    }
}
