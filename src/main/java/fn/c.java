package fn;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.Pair;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010\u001bJ-\u0010%\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&R!\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00190'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010.R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010.¨\u00061"}, d2 = {"Lfn/c;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "", "j", "(Landroid/graphics/Bitmap;)I", "Ljava/io/InputStream;", "inputStream", "Landroid/util/Pair;", DateTokenConverter.CONVERTER_KEY, "(Ljava/io/InputStream;)Landroid/util/Pair;", "Lfn/e;", "e", "(Ljava/io/InputStream;)Lfn/e;", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "h", "(Landroid/graphics/Bitmap$Config;)I", Snapshot.WIDTH, Snapshot.HEIGHT, IntegerTokenConverter.CONVERTER_KEY, "(IILandroid/graphics/Bitmap$Config;)I", "Ljava/nio/ByteBuffer;", "c", "()Ljava/nio/ByteBuffer;", "byteBuffer", "Ljn0/h0;", "l", "(Ljava/nio/ByteBuffer;)V", "k", "Landroid/graphics/Rect;", "outPadding", "Landroid/graphics/BitmapFactory$Options;", "options", "f", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "Lu5/g;", "b", "Lkotlin/Lazy;", "g", "()Lu5/g;", "DECODE_BUFFERS", "", "Z", "useDecodeBufferHelper", "fixDecodeDrmImageCrash", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f66052a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy DECODE_BUFFERS = m.b(new wn0.a() { // from class: fn.a
        @Override // wn0.a
        public final Object invoke() {
            return c.b();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static boolean useDecodeBufferHelper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static boolean fixDecodeDrmImageCrash;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66056a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Bitmap.Config.RGBA_1010102.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Bitmap.Config.HARDWARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f66056a = iArr;
        }
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u5.g b() {
        return new u5.g(12);
    }

    private final ByteBuffer c() {
        return useDecodeBufferHelper ? sk.b.f111318a.b() : g().b();
    }

    public static final Pair<Integer, Integer> d(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        c cVar = f66052a;
        ByteBuffer byteBufferK = cVar.k();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferK.array();
            Pair<Integer, Integer> pair = null;
            cVar.f(inputStream, null, options);
            if (options.outWidth != -1 && options.outHeight != -1) {
                pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            }
            return pair;
        } finally {
            f66052a.l(byteBufferK);
        }
    }

    public static final e e(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        c cVar = f66052a;
        ByteBuffer byteBufferK = cVar.k();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferK.array();
            cVar.f(inputStream, null, options);
            return new e(options.outWidth, options.outHeight, Build.VERSION.SDK_INT >= 26 ? options.outColorSpace : null);
        } finally {
            f66052a.l(byteBufferK);
        }
    }

    private final u5.g<ByteBuffer> g() {
        return (u5.g) DECODE_BUFFERS.getValue();
    }

    @SuppressLint({"NewApi"})
    public static final int h(Bitmap.Config bitmapConfig) {
        switch (bitmapConfig == null ? -1 : a.f66056a[bitmapConfig.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            case 6:
            case 7:
                return 4;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    public static final int i(int width, int height, Bitmap.Config bitmapConfig) {
        if (width <= 0) {
            throw new IllegalArgumentException(("width must be > 0, width is: " + width).toString());
        }
        if (height <= 0) {
            throw new IllegalArgumentException(("height must be > 0, height is: " + height).toString());
        }
        int iH = h(bitmapConfig);
        int i11 = width * height * iH;
        if (i11 > 0) {
            return i11;
        }
        throw new IllegalStateException(("size must be > 0: size: " + i11 + ", width: " + width + ", height: " + height + ", pixelSize: " + iH).toString());
    }

    @SuppressLint({"NewApi"})
    public static final int j(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }

    private final ByteBuffer k() {
        ByteBuffer byteBufferC = c();
        if (byteBufferC != null) {
            return byteBufferC;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(sk.b.e());
        s.j(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    private final void l(ByteBuffer byteBuffer) {
        if (useDecodeBufferHelper) {
            return;
        }
        g().a(byteBuffer);
    }

    public final Bitmap f(InputStream inputStream, Rect outPadding, BitmapFactory.Options options) {
        if (!fixDecodeDrmImageCrash) {
            return BitmapFactory.decodeStream(inputStream, outPadding, options);
        }
        try {
            return BitmapFactory.decodeStream(inputStream, outPadding, options);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
