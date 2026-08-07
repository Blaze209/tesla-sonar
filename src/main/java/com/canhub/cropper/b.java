package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.DisplayMetrics;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\"\u0010\"\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00040\u00040\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/canhub/cropper/b;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/canhub/cropper/CropImageView;", "cropImageView", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/content/Context;Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;)V", "Lcom/canhub/cropper/b$a;", "result", "Ljn0/h0;", "h", "(Lcom/canhub/cropper/b$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", IntegerTokenConverter.CONVERTER_KEY, "()V", "f", "a", "Landroid/content/Context;", "b", "Landroid/net/Uri;", "g", "()Landroid/net/Uri;", "", "c", "I", Snapshot.WIDTH, DateTokenConverter.CONVERTER_KEY, Snapshot.HEIGHT, "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "e", "Ljava/lang/ref/WeakReference;", "cropImageViewReference", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "job", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Uri uri;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int height;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<CropImageView> cropImageViewReference;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Job job;

    /* JADX INFO: renamed from: com.canhub.cropper.b$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b#\u0010&R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b$\u0010&R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b \u0010(¨\u0006)"}, d2 = {"Lcom/canhub/cropper/b$a;", "", "Landroid/net/Uri;", "uri", "Landroid/graphics/Bitmap;", "bitmap", "", "loadSampleSize", "degreesRotated", "", "flipHorizontally", "flipVertically", "Ljava/lang/Exception;", "Lkotlin/Exception;", AnalyticsAttribute.Error, "<init>", "(Landroid/net/Uri;Landroid/graphics/Bitmap;IIZZLjava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/net/Uri;", "g", "()Landroid/net/Uri;", "b", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "c", "I", "f", DateTokenConverter.CONVERTER_KEY, "e", "Z", "()Z", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Uri uri;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap bitmap;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int loadSampleSize;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int degreesRotated;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean flipHorizontally;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean flipVertically;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Exception error;

        public Result(Uri uri, Bitmap bitmap, int i11, int i12, boolean z11, boolean z12, Exception exc) {
            p013kotlin.jvm.internal.s.k(uri, "uri");
            this.uri = uri;
            this.bitmap = bitmap;
            this.loadSampleSize = i11;
            this.degreesRotated = i12;
            this.flipHorizontally = z11;
            this.flipVertically = z12;
            this.error = exc;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getDegreesRotated() {
            return this.degreesRotated;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Exception getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getFlipHorizontally() {
            return this.flipHorizontally;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getFlipVertically() {
            return this.flipVertically;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return p013kotlin.jvm.internal.s.f(this.uri, result.uri) && p013kotlin.jvm.internal.s.f(this.bitmap, result.bitmap) && this.loadSampleSize == result.loadSampleSize && this.degreesRotated == result.degreesRotated && this.flipHorizontally == result.flipHorizontally && this.flipVertically == result.flipVertically && p013kotlin.jvm.internal.s.f(this.error, result.error);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getLoadSampleSize() {
            return this.loadSampleSize;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            int iHashCode = this.uri.hashCode() * 31;
            Bitmap bitmap = this.bitmap;
            int iHashCode2 = (((((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Integer.hashCode(this.loadSampleSize)) * 31) + Integer.hashCode(this.degreesRotated)) * 31) + Boolean.hashCode(this.flipHorizontally)) * 31) + Boolean.hashCode(this.flipVertically)) * 31;
            Exception exc = this.error;
            return iHashCode2 + (exc != null ? exc.hashCode() : 0);
        }

        public String toString() {
            return "Result(uri=" + this.uri + ", bitmap=" + this.bitmap + ", loadSampleSize=" + this.loadSampleSize + ", degreesRotated=" + this.degreesRotated + ", flipHorizontally=" + this.flipHorizontally + ", flipVertically=" + this.flipVertically + ", error=" + this.error + ")";
        }
    }

    /* JADX INFO: renamed from: com.canhub.cropper.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.canhub.cropper.BitmapLoadingWorkerJob$onPostExecute$2", f = "BitmapLoadingWorkerJob.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C0422b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f21029n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f21030o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Result f21032q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0422b(Result result, Continuation<? super C0422b> continuation) {
            super(2, continuation);
            this.f21032q = result;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C0422b c0422b = b.this.new C0422b(this.f21032q, continuation);
            c0422b.f21030o = obj;
            return c0422b;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CropImageView cropImageView;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f21029n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f21030o;
            j0 j0Var = new j0();
            if (CoroutineScopeKt.isActive(coroutineScope) && (cropImageView = (CropImageView) b.this.cropImageViewReference.get()) != null) {
                Result result = this.f21032q;
                j0Var.f86523a = true;
                cropImageView.l(result);
            }
            if (!j0Var.f86523a && this.f21032q.getBitmap() != null) {
                this.f21032q.getBitmap().recycle();
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C0422b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.canhub.cropper.BitmapLoadingWorkerJob$start$1", f = "BitmapLoadingWorkerJob.kt", i = {}, l = {52, 66}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f21033n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f21034o;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = b.this.new c(continuation);
            cVar.f21034o = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
        
            if (r0.h(r5, r13) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
        
            if (r14.h(r3, r13) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
        
            return r1;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r13.f21033n
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L24
                if (r0 == r3) goto L1b
                if (r0 != r2) goto L13
                jn0.t.b(r14)
                goto Lab
            L13:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1b:
                jn0.t.b(r14)     // Catch: java.lang.Exception -> L20
                goto Lab
            L20:
                r0 = move-exception
                r14 = r0
                r10 = r14
                goto L92
            L24:
                jn0.t.b(r14)
                java.lang.Object r14 = r13.f21034o
                kotlinx.coroutines.CoroutineScope r14 = (kotlinx.coroutines.CoroutineScope) r14
                boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r14)     // Catch: java.lang.Exception -> L20
                if (r0 == 0) goto Lab
                com.canhub.cropper.c r0 = com.canhub.cropper.c.f21036a     // Catch: java.lang.Exception -> L20
                com.canhub.cropper.b r4 = com.canhub.cropper.b.this     // Catch: java.lang.Exception -> L20
                android.content.Context r4 = com.canhub.cropper.b.a(r4)     // Catch: java.lang.Exception -> L20
                com.canhub.cropper.b r5 = com.canhub.cropper.b.this     // Catch: java.lang.Exception -> L20
                android.net.Uri r5 = r5.getUri()     // Catch: java.lang.Exception -> L20
                com.canhub.cropper.b r6 = com.canhub.cropper.b.this     // Catch: java.lang.Exception -> L20
                int r6 = com.canhub.cropper.b.d(r6)     // Catch: java.lang.Exception -> L20
                com.canhub.cropper.b r7 = com.canhub.cropper.b.this     // Catch: java.lang.Exception -> L20
                int r7 = com.canhub.cropper.b.c(r7)     // Catch: java.lang.Exception -> L20
                com.canhub.cropper.c$a r4 = r0.l(r4, r5, r6, r7)     // Catch: java.lang.Exception -> L20
                boolean r14 = kotlinx.coroutines.CoroutineScopeKt.isActive(r14)     // Catch: java.lang.Exception -> L20
                if (r14 == 0) goto Lab
                android.graphics.Bitmap r14 = r4.getBitmap()     // Catch: java.lang.Exception -> L20
                com.canhub.cropper.b r5 = com.canhub.cropper.b.this     // Catch: java.lang.Exception -> L20
                android.content.Context r5 = com.canhub.cropper.b.a(r5)     // Catch: java.lang.Exception -> L20
                com.canhub.cropper.b r6 = com.canhub.cropper.b.this     // Catch: java.lang.Exception -> L20
                android.net.Uri r6 = r6.getUri()     // Catch: java.lang.Exception -> L20
                com.canhub.cropper.c$b r14 = r0.E(r14, r5, r6)     // Catch: java.lang.Exception -> L20
                com.canhub.cropper.b r0 = com.canhub.cropper.b.this     // Catch: java.lang.Exception -> L20
                com.canhub.cropper.b$a r5 = new com.canhub.cropper.b$a     // Catch: java.lang.Exception -> L20
                android.net.Uri r6 = r0.getUri()     // Catch: java.lang.Exception -> L20
                android.graphics.Bitmap r7 = r14.getBitmap()     // Catch: java.lang.Exception -> L20
                int r8 = r4.getSampleSize()     // Catch: java.lang.Exception -> L20
                int r9 = r14.getDegrees()     // Catch: java.lang.Exception -> L20
                boolean r10 = r14.getFlipHorizontally()     // Catch: java.lang.Exception -> L20
                boolean r11 = r14.getFlipVertically()     // Catch: java.lang.Exception -> L20
                r12 = 0
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L20
                r13.f21033n = r3     // Catch: java.lang.Exception -> L20
                java.lang.Object r14 = com.canhub.cropper.b.e(r0, r5, r13)     // Catch: java.lang.Exception -> L20
                if (r14 != r1) goto Lab
                goto Laa
            L92:
                com.canhub.cropper.b r14 = com.canhub.cropper.b.this
                com.canhub.cropper.b$a r3 = new com.canhub.cropper.b$a
                android.net.Uri r4 = r14.getUri()
                r8 = 0
                r9 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                r13.f21033n = r2
                java.lang.Object r14 = com.canhub.cropper.b.e(r14, r3, r13)
                if (r14 != r1) goto Lab
            Laa:
                return r1
            Lab:
                jn0.h0 r14 = jn0.h0.f84049a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public b(Context context, CropImageView cropImageView, Uri uri) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(cropImageView, "cropImageView");
        p013kotlin.jvm.internal.s.k(uri, "uri");
        this.context = context;
        this.uri = uri;
        this.cropImageViewReference = new WeakReference<>(cropImageView);
        this.job = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        float f11 = displayMetrics.density;
        double d11 = f11 > 1.0f ? 1.0d / ((double) f11) : 1.0d;
        this.width = (int) (((double) displayMetrics.widthPixels) * d11);
        this.height = (int) (((double) displayMetrics.heightPixels) * d11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(Result result, Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new C0422b(result, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    public final void f() {
        Job.DefaultImpls.cancel$default(this.job, (CancellationException) null, 1, (Object) null);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return Dispatchers.getMain().plus(this.job);
    }

    public final void i() {
        this.job = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getDefault(), null, new c(null), 2, null);
    }
}
