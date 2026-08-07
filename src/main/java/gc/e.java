package gc;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.reactnativecommunity.clipboard.ClipboardModule;
import ic.SourceFetchResult;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.sync.Semaphore;
import okio.c0;
import okio.r0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import rc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0003\u0013\u0019\u0016B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Lgc/e;", "Lgc/k;", "Lgc/u;", "source", "Lrc/n;", "options", "Lkotlinx/coroutines/sync/Semaphore;", "parallelismLock", "Lgc/q;", "exifOrientationStrategy", "<init>", "(Lgc/u;Lrc/n;Lkotlinx/coroutines/sync/Semaphore;Lgc/q;)V", "Landroid/graphics/BitmapFactory$Options;", "Lgc/i;", "e", "(Landroid/graphics/BitmapFactory$Options;)Lgc/i;", "Lgc/l;", "exifData", "Ljn0/h0;", "c", "(Landroid/graphics/BitmapFactory$Options;Lgc/l;)V", DateTokenConverter.CONVERTER_KEY, "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgc/u;", "b", "Lrc/n;", "Lkotlinx/coroutines/sync/Semaphore;", "Lgc/q;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Semaphore parallelismLock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q exifOrientationStrategy;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR4\u0010\u0013\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lgc/e$b;", "Lokio/r;", "Lokio/r0;", "delegate", "<init>", "(Lokio/r0;)V", "Lokio/h;", "sink", "", "byteCount", "read", "(Lokio/h;J)J", "Ljava/lang/Exception;", "Lkotlin/Exception;", "value", "a", "Ljava/lang/Exception;", "c", "()Ljava/lang/Exception;", "exception", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b extends okio.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Exception exception;

        public b(r0 r0Var) {
            super(r0Var);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        @Override // okio.r, okio.r0
        public long read(okio.h sink, long byteCount) throws Exception {
            try {
                return super.read(sink, byteCount);
            } catch (Exception e11) {
                this.exception = e11;
                throw e11;
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgc/e$c;", "Lgc/k$a;", "Lkotlinx/coroutines/sync/Semaphore;", "parallelismLock", "Lgc/q;", "exifOrientationStrategy", "<init>", "(Lkotlinx/coroutines/sync/Semaphore;Lgc/q;)V", "Lic/o;", "result", "Lrc/n;", "options", "Lec/r;", "imageLoader", "Lgc/k;", "a", "(Lic/o;Lrc/n;Lec/r;)Lgc/k;", "Lkotlinx/coroutines/sync/Semaphore;", "b", "Lgc/q;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Semaphore parallelismLock;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final q exifOrientationStrategy;

        public c(Semaphore semaphore, q qVar) {
            this.parallelismLock = semaphore;
            this.exifOrientationStrategy = qVar;
        }

        @Override // gc.k.a
        public k a(SourceFetchResult result, Options options, ec.r imageLoader) {
            return new e(result.getSource(), options, this.parallelismLock, this.exifOrientationStrategy);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", i = {0, 1}, l = {EnumC4419g.SDK_ASSET_ICON_OVERRIDE_VALUE, 40}, m = "decode", n = {"$this$withPermit$iv", "$this$withPermit$iv"}, s = {"L$0", "L$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67805n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f67806o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f67808q;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67806o = obj;
            this.f67808q |= Integer.MIN_VALUE;
            return e.this.a(this);
        }
    }

    public e(u uVar, Options options, Semaphore semaphore, q qVar) {
        this.source = uVar;
        this.options = options;
        this.parallelismLock = semaphore;
        this.exifOrientationStrategy = qVar;
    }

    private final void c(BitmapFactory.Options options, l lVar) {
        Bitmap.Config configH = rc.i.h(this.options);
        if (lVar.getIsFlipped() || s.a(lVar)) {
            configH = yc.b.e(configH);
        }
        if (rc.i.f(this.options) && configH == Bitmap.Config.ARGB_8888 && p013kotlin.jvm.internal.s.f(options.outMimeType, ClipboardModule.MIMETYPE_JPEG)) {
            configH = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config = options.outConfig;
            Bitmap.Config config2 = Bitmap.Config.RGBA_F16;
            if (config == config2 && configH != Bitmap.Config.HARDWARE) {
                configH = config2;
            }
        }
        options.inPreferredConfig = configH;
    }

    private final void d(BitmapFactory.Options options, l lVar) {
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i11 = s.b(lVar) ? options.outHeight : options.outWidth;
        int i12 = s.b(lVar) ? options.outWidth : options.outHeight;
        long jB = j.b(i11, i12, this.options.getSize(), this.options.getScale(), rc.h.f(this.options));
        int iC = yc.q.c(jB);
        int iD = yc.q.d(jB);
        int iA = j.a(i11, i12, iC, iD, this.options.getScale());
        options.inSampleSize = iA;
        double dC = j.c(((double) i11) / ((double) iA), ((double) i12) / ((double) iA), iC, iD, this.options.getScale());
        if (this.options.getPrecision() == sc.c.INEXACT) {
            dC = bo0.n.h(dC, 1.0d);
        }
        boolean z11 = dC == 1.0d;
        options.inScaled = !z11;
        if (z11) {
            return;
        }
        if (dC > 1.0d) {
            options.inDensity = yn0.a.c(((double) Integer.MAX_VALUE) / dC);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = yn0.a.c(((double) Integer.MAX_VALUE) * dC);
        }
    }

    private final DecodeResult e(BitmapFactory.Options options) throws Exception {
        b bVar = new b(this.source.source());
        okio.j jVarD = c0.d(bVar);
        boolean z11 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(jVarD.peek().K3(), null, options);
        Exception exception = bVar.getException();
        if (exception != null) {
            throw exception;
        }
        options.inJustDecodeBounds = false;
        r rVar = r.f67827a;
        l lVarA = rVar.a(options.outMimeType, jVarD, this.exifOrientationStrategy);
        Exception exception2 = bVar.getException();
        if (exception2 != null) {
            throw exception2;
        }
        options.inMutable = false;
        if (Build.VERSION.SDK_INT >= 26 && rc.i.j(this.options) != null) {
            options.inPreferredColorSpace = rc.i.j(this.options);
        }
        options.inPremultiplied = rc.i.l(this.options);
        c(options, lVarA);
        d(options, lVarA);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(jVarD.K3(), null, options);
            sn0.b.a(jVarD, null);
            Exception exception3 = bVar.getException();
            if (exception3 != null) {
                throw exception3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(this.options.getContext().getResources().getDisplayMetrics().densityDpi);
            ec.n nVarC = ec.u.c(new BitmapDrawable(this.options.getContext().getResources(), rVar.b(bitmapDecodeStream, lVarA)));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z11 = false;
            }
            return new DecodeResult(nVarC, z11);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(jVarD, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DecodeResult f(e eVar) {
        return eVar.e(new BitmapFactory.Options());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gc.k
    public Object a(Continuation<? super DecodeResult> continuation) throws Throwable {
        d dVar;
        Semaphore semaphore;
        Semaphore semaphore2;
        Throwable th2;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f67808q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f67808q = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f67806o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f67808q;
        try {
            if (i12 == 0) {
                jn0.t.b(obj);
                semaphore = this.parallelismLock;
                dVar.f67805n = semaphore;
                dVar.f67808q = 1;
                if (semaphore.acquire(dVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                semaphore2 = (Semaphore) dVar.f67805n;
                try {
                    jn0.t.b(obj);
                    DecodeResult decodeResult = (DecodeResult) obj;
                    semaphore2.release();
                    return decodeResult;
                } catch (Throwable th3) {
                    th2 = th3;
                    semaphore2.release();
                    throw th2;
                }
            }
            Semaphore semaphore3 = (Semaphore) dVar.f67805n;
            jn0.t.b(obj);
            semaphore = semaphore3;
            wn0.a aVar = new wn0.a() { // from class: gc.d
                @Override // wn0.a
                public final Object invoke() {
                    return e.f(this.f67796a);
                }
            };
            dVar.f67805n = semaphore;
            dVar.f67808q = 2;
            Object objRunInterruptible$default = InterruptibleKt.runInterruptible$default(null, aVar, dVar, 1, null);
            if (objRunInterruptible$default != coroutine_suspended) {
                semaphore2 = semaphore;
                obj = objRunInterruptible$default;
                DecodeResult decodeResult2 = (DecodeResult) obj;
                semaphore2.release();
                return decodeResult2;
            }
            return coroutine_suspended;
        } catch (Throwable th4) {
            semaphore2 = semaphore;
            th2 = th4;
            semaphore2.release();
            throw th2;
        }
    }
}
