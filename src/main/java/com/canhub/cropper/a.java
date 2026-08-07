package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import jn0.h0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001)B«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\r\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020#¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020#¢\u0006\u0004\b(\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00104R\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00104R\u0014\u0010\u0015\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00104R\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00104R\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00108R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00108R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u001d\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00104R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010.R\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lcom/canhub/cropper/a;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/ref/WeakReference;", "Lcom/canhub/cropper/CropImageView;", "cropImageViewReference", "Landroid/net/Uri;", "uri", "Landroid/graphics/Bitmap;", "bitmap", "", "cropPoints", "", "degreesRotated", "orgWidth", "orgHeight", "", "fixAspectRatio", "aspectRatioX", "aspectRatioY", "reqWidth", "reqHeight", "flipHorizontally", "flipVertically", "Lcom/canhub/cropper/CropImageView$k;", "options", "Landroid/graphics/Bitmap$CompressFormat;", "saveCompressFormat", "saveCompressQuality", "customOutputUri", "<init>", "(Landroid/content/Context;Ljava/lang/ref/WeakReference;Landroid/net/Uri;Landroid/graphics/Bitmap;[FIIIZIIIIZZLcom/canhub/cropper/CropImageView$k;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V", "Lcom/canhub/cropper/a$a;", "result", "Ljn0/h0;", "v", "(Lcom/canhub/cropper/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "w", "()V", "u", "a", "Landroid/content/Context;", "b", "Ljava/lang/ref/WeakReference;", "c", "Landroid/net/Uri;", DateTokenConverter.CONVERTER_KEY, "Landroid/graphics/Bitmap;", "e", "[F", "f", "I", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "Z", "j", "k", "l", "m", "n", "o", "p", "Lcom/canhub/cropper/CropImageView$k;", "q", "Landroid/graphics/Bitmap$CompressFormat;", "r", "s", "Lkotlinx/coroutines/Job;", "t", "Lkotlinx/coroutines/Job;", "job", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<CropImageView> cropImageViewReference;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Uri uri;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Bitmap bitmap;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float[] cropPoints;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int degreesRotated;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int orgWidth;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int orgHeight;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean fixAspectRatio;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int aspectRatioX;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int aspectRatioY;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int reqWidth;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int reqHeight;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean flipHorizontally;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean flipVertically;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final CropImageView.k options;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Bitmap.CompressFormat saveCompressFormat;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int saveCompressQuality;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Uri customOutputUri;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Job job;

    /* JADX INFO: renamed from: com.canhub.cropper.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b\u001d\u0010\u0011¨\u0006!"}, d2 = {"Lcom/canhub/cropper/a$a;", "", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/net/Uri;", "uri", "Ljava/lang/Exception;", "Lkotlin/Exception;", AnalyticsAttribute.Error, "", "sampleSize", "<init>", "(Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "Landroid/net/Uri;", DateTokenConverter.CONVERTER_KEY, "()Landroid/net/Uri;", "c", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "I", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap bitmap;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Uri uri;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Exception error;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int sampleSize;

        public Result(Bitmap bitmap, Uri uri, Exception exc, int i11) {
            this.bitmap = bitmap;
            this.uri = uri;
            this.error = exc;
            this.sampleSize = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Exception getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getSampleSize() {
            return this.sampleSize;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return p013kotlin.jvm.internal.s.f(this.bitmap, result.bitmap) && p013kotlin.jvm.internal.s.f(this.uri, result.uri) && p013kotlin.jvm.internal.s.f(this.error, result.error) && this.sampleSize == result.sampleSize;
        }

        public int hashCode() {
            Bitmap bitmap = this.bitmap;
            int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            Uri uri = this.uri;
            int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
            Exception exc = this.error;
            return ((iHashCode2 + (exc != null ? exc.hashCode() : 0)) * 31) + Integer.hashCode(this.sampleSize);
        }

        public String toString() {
            return "Result(bitmap=" + this.bitmap + ", uri=" + this.uri + ", error=" + this.error + ", sampleSize=" + this.sampleSize + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.canhub.cropper.BitmapCroppingWorkerJob$onPostExecute$2", f = "BitmapCroppingWorkerJob.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f21005n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f21006o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Result f21008q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Result result, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f21008q = result;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = a.this.new b(this.f21008q, continuation);
            bVar.f21006o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CropImageView cropImageView;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f21005n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f21006o;
            j0 j0Var = new j0();
            if (CoroutineScopeKt.isActive(coroutineScope) && (cropImageView = (CropImageView) a.this.cropImageViewReference.get()) != null) {
                Result result = this.f21008q;
                j0Var.f86523a = true;
                cropImageView.k(result);
            }
            if (!j0Var.f86523a && this.f21008q.getBitmap() != null) {
                this.f21008q.getBitmap().recycle();
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.canhub.cropper.BitmapCroppingWorkerJob$start$1", f = "BitmapCroppingWorkerJob.kt", i = {}, l = {76, 115}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f21009n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f21010o;

        /* JADX INFO: renamed from: com.canhub.cropper.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.canhub.cropper.BitmapCroppingWorkerJob$start$1$1", f = "BitmapCroppingWorkerJob.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
        static final class C0421a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f21012n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ a f21013o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ Bitmap f21014p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ com.canhub.cropper.c.a f21015q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0421a(a aVar, Bitmap bitmap, com.canhub.cropper.c.a aVar2, Continuation<? super C0421a> continuation) {
                super(2, continuation);
                this.f21013o = aVar;
                this.f21014p = bitmap;
                this.f21015q = aVar2;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C0421a(this.f21013o, this.f21014p, this.f21015q, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws FileNotFoundException {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f21012n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    Uri uriJ = com.canhub.cropper.c.f21036a.J(this.f21013o.context, this.f21014p, this.f21013o.saveCompressFormat, this.f21013o.saveCompressQuality, this.f21013o.customOutputUri);
                    a aVar = this.f21013o;
                    Result result = new Result(this.f21014p, uriJ, null, this.f21015q.getSampleSize());
                    this.f21012n = 1;
                    if (aVar.v(result, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C0421a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = a.this.new c(continuation);
            cVar.f21010o = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x011e, code lost:
        
            if (r6.v(r7, r21) == r2) goto L30;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a(Context context, WeakReference<CropImageView> cropImageViewReference, Uri uri, Bitmap bitmap, float[] cropPoints, int i11, int i12, int i13, boolean z11, int i14, int i15, int i16, int i17, boolean z12, boolean z13, CropImageView.k options, Bitmap.CompressFormat saveCompressFormat, int i18, Uri uri2) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(cropImageViewReference, "cropImageViewReference");
        p013kotlin.jvm.internal.s.k(cropPoints, "cropPoints");
        p013kotlin.jvm.internal.s.k(options, "options");
        p013kotlin.jvm.internal.s.k(saveCompressFormat, "saveCompressFormat");
        this.context = context;
        this.cropImageViewReference = cropImageViewReference;
        this.uri = uri;
        this.bitmap = bitmap;
        this.cropPoints = cropPoints;
        this.degreesRotated = i11;
        this.orgWidth = i12;
        this.orgHeight = i13;
        this.fixAspectRatio = z11;
        this.aspectRatioX = i14;
        this.aspectRatioY = i15;
        this.reqWidth = i16;
        this.reqHeight = i17;
        this.flipHorizontally = z12;
        this.flipVertically = z13;
        this.options = options;
        this.saveCompressFormat = saveCompressFormat;
        this.saveCompressQuality = i18;
        this.customOutputUri = uri2;
        this.job = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(Result result, Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new b(result, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return Dispatchers.getMain().plus(this.job);
    }

    public final void u() {
        Job.DefaultImpls.cancel$default(this.job, (CancellationException) null, 1, (Object) null);
    }

    public final void w() {
        this.job = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getDefault(), null, new c(null), 2, null);
    }
}
