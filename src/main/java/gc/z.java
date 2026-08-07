package gc;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.util.Size;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ic.SourceFetchResult;
import kotlinx.coroutines.sync.Semaphore;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.j0;
import rc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lgc/z;", "Lgc/k;", "Landroid/graphics/ImageDecoder$Source;", "source", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Lrc/n;", "options", "Lkotlinx/coroutines/sync/Semaphore;", "parallelismLock", "<init>", "(Landroid/graphics/ImageDecoder$Source;Ljava/lang/AutoCloseable;Lrc/n;Lkotlinx/coroutines/sync/Semaphore;)V", "Landroid/graphics/ImageDecoder;", "Ljn0/h0;", "e", "(Landroid/graphics/ImageDecoder;)V", "Lgc/i;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/ImageDecoder$Source;", "b", "Ljava/lang/AutoCloseable;", "c", "Lrc/n;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/sync/Semaphore;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ImageDecoder.Source source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AutoCloseable closeable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Semaphore parallelismLock;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lgc/z$a;", "Lgc/k$a;", "Lkotlinx/coroutines/sync/Semaphore;", "parallelismLock", "<init>", "(Lkotlinx/coroutines/sync/Semaphore;)V", "Lrc/n;", "options", "", "b", "(Lrc/n;)Z", "Lic/o;", "result", "Lec/r;", "imageLoader", "Lgc/k;", "a", "(Lic/o;Lrc/n;Lec/r;)Lgc/k;", "Lkotlinx/coroutines/sync/Semaphore;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Semaphore parallelismLock;

        public a(Semaphore semaphore) {
            this.parallelismLock = semaphore;
        }

        private final boolean b(Options options) {
            Bitmap.Config configH = rc.i.h(options);
            return configH == Bitmap.Config.ARGB_8888 || configH == Bitmap.Config.HARDWARE;
        }

        @Override // gc.k.a
        public k a(SourceFetchResult result, Options options, ec.r imageLoader) {
            ImageDecoder.Source sourceB;
            if (b(options) && (sourceB = b0.b(result.getSource(), options, false)) != null) {
                return new z(sourceB, result.getSource(), options, this.parallelismLock);
            }
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.decode.StaticImageDecoder", f = "StaticImageDecoder.kt", i = {0}, l = {168}, m = "decode", n = {"$this$withPermit$iv"}, s = {"L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67851n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f67852o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f67854q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67852o = obj;
            this.f67854q |= Integer.MIN_VALUE;
            return z.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/graphics/ImageDecoder;", "decoder", "Landroid/graphics/ImageDecoder$ImageInfo;", "info", "Landroid/graphics/ImageDecoder$Source;", "source", "Ljn0/h0;", "onHeaderDecoded", "(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c implements ImageDecoder$OnHeaderDecodedListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f67856b;

        public c(j0 j0Var) {
            this.f67856b = j0Var;
        }

        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            Size size = imageInfo.getSize();
            int width = size.getWidth();
            int height = size.getHeight();
            long jB = j.b(width, height, z.this.options.getSize(), z.this.options.getScale(), rc.h.f(z.this.options));
            int iC = yc.q.c(jB);
            int iD = yc.q.d(jB);
            if (width > 0 && height > 0 && (width != iC || height != iD)) {
                double d11 = j.d(width, height, iC, iD, z.this.options.getScale());
                j0 j0Var = this.f67856b;
                boolean z11 = d11 < 1.0d;
                j0Var.f86523a = z11;
                if (z11 || z.this.options.getPrecision() == sc.c.EXACT) {
                    imageDecoder.setTargetSize(yn0.a.c(((double) width) * d11), yn0.a.c(d11 * ((double) height)));
                }
            }
            z.this.e(imageDecoder);
        }
    }

    public z(ImageDecoder.Source source, AutoCloseable autoCloseable, Options options, Semaphore semaphore) {
        this.source = source;
        this.closeable = autoCloseable;
        this.options = options;
        this.parallelismLock = semaphore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(ImageDecoder imageDecoder) {
        imageDecoder.setOnPartialImageListener(new ImageDecoder$OnPartialImageListener() { // from class: gc.y
            public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return z.f(decodeException);
            }
        });
        imageDecoder.setAllocator(yc.b.d(rc.i.h(this.options)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!rc.i.f(this.options) ? 1 : 0);
        if (rc.i.j(this.options) != null) {
            imageDecoder.setTargetColorSpace(rc.i.j(this.options));
        }
        imageDecoder.setUnpremultipliedRequired(!rc.i.l(this.options));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(ImageDecoder.DecodeException decodeException) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gc.k
    public Object a(Continuation<? super DecodeResult> continuation) {
        b bVar;
        Semaphore semaphore;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f67854q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f67854q = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f67852o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f67854q;
        if (i12 == 0) {
            jn0.t.b(obj);
            Semaphore semaphore2 = this.parallelismLock;
            bVar.f67851n = semaphore2;
            bVar.f67854q = 1;
            if (semaphore2.acquire(bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            semaphore = semaphore2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            semaphore = (Semaphore) bVar.f67851n;
            jn0.t.b(obj);
        }
        try {
            AutoCloseable autoCloseable = this.closeable;
            try {
                j0 j0Var = new j0();
                DecodeResult decodeResult = new DecodeResult(ec.u.d(ImageDecoder.decodeBitmap(this.source, new c(j0Var)), false, 1, null), j0Var.f86523a);
                un0.a.a(autoCloseable, null);
                semaphore.release();
                return decodeResult;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    un0.a.a(autoCloseable, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            semaphore.release();
            throw th4;
        }
    }
}
