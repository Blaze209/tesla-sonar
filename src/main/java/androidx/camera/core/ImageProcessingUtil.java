package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.impl.s1;
import c0.y0;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ImageProcessingUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f3020a;

    enum a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static /* synthetic */ void a(n nVar, n nVar2, n nVar3) {
        if (nVar == null || nVar2 == null) {
            return;
        }
        nVar2.close();
    }

    public static /* synthetic */ void b(n nVar, n nVar2, n nVar3) {
        if (nVar == null || nVar2 == null) {
            return;
        }
        nVar2.close();
    }

    public static boolean c(@NonNull n nVar) {
        if (!l(nVar)) {
            y0.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return false;
        }
        if (d(nVar) != a.ERROR_CONVERSION) {
            return true;
        }
        y0.c("ImageProcessingUtil", "One pixel shift for YUV failure");
        return false;
    }

    @NonNull
    private static a d(@NonNull n nVar) {
        int width = nVar.getWidth();
        int height = nVar.getHeight();
        int iM = nVar.N0()[0].m();
        int iM2 = nVar.N0()[1].m();
        int iM3 = nVar.N0()[2].m();
        int iN = nVar.N0()[0].n();
        int iN2 = nVar.N0()[1].n();
        return nativeShiftPixel(nVar.N0()[0].l(), iM, nVar.N0()[1].l(), iM2, nVar.N0()[2].l(), iM3, iN, iN2, width, height, iN, iN2, iN2) != 0 ? a.ERROR_CONVERSION : a.SUCCESS;
    }

    public static n e(@NonNull s1 s1Var, @NonNull byte[] bArr) {
        u5.h.a(s1Var.a() == 256);
        u5.h.g(bArr);
        Surface surface = s1Var.getSurface();
        u5.h.g(surface);
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            y0.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        n nVarD = s1Var.d();
        if (nVarD == null) {
            y0.c("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return nVarD;
    }

    @NonNull
    public static Bitmap f(@NonNull n nVar) {
        if (nVar.getFormat() != 35) {
            throw new IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int width = nVar.getWidth();
        int height = nVar.getHeight();
        int iM = nVar.N0()[0].m();
        int iM2 = nVar.N0()[1].m();
        int iM3 = nVar.N0()[2].m();
        int iN = nVar.N0()[0].n();
        int iN2 = nVar.N0()[1].n();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(nVar.getWidth(), nVar.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(nVar.N0()[0].l(), iM, nVar.N0()[1].l(), iM2, nVar.N0()[2].l(), iM3, iN, iN2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
            return bitmapCreateBitmap;
        }
        throw new UnsupportedOperationException("YUV to RGB conversion failed");
    }

    public static n g(@NonNull final n nVar, @NonNull s1 s1Var, ByteBuffer byteBuffer, int i11, boolean z11) {
        if (!l(nVar)) {
            y0.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!k(i11)) {
            y0.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (h(nVar, s1Var.getSurface(), byteBuffer, i11, z11) == a.ERROR_CONVERSION) {
            y0.c("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            y0.a("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), Integer.valueOf(f3020a)));
            f3020a++;
        }
        final n nVarD = s1Var.d();
        if (nVarD == null) {
            y0.c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        s sVar = new s(nVarD);
        sVar.c(new e.a() { // from class: c0.t0
            @Override // androidx.camera.core.e.a
            public final void e(androidx.camera.core.n nVar2) {
                ImageProcessingUtil.b(nVarD, nVar, nVar2);
            }
        });
        return sVar;
    }

    @NonNull
    private static a h(@NonNull n nVar, @NonNull Surface surface, ByteBuffer byteBuffer, int i11, boolean z11) {
        int width = nVar.getWidth();
        int height = nVar.getHeight();
        int iM = nVar.N0()[0].m();
        int iM2 = nVar.N0()[1].m();
        int iM3 = nVar.N0()[2].m();
        int iN = nVar.N0()[0].n();
        int iN2 = nVar.N0()[1].n();
        return nativeConvertAndroid420ToABGR(nVar.N0()[0].l(), iM, nVar.N0()[1].l(), iM2, nVar.N0()[2].l(), iM3, iN, iN2, surface, byteBuffer, width, height, z11 ? iN : 0, z11 ? iN2 : 0, z11 ? iN2 : 0, i11) != 0 ? a.ERROR_CONVERSION : a.SUCCESS;
    }

    public static void i(@NonNull Bitmap bitmap, @NonNull ByteBuffer byteBuffer, int i11) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i11, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void j(@NonNull Bitmap bitmap, @NonNull ByteBuffer byteBuffer, int i11) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i11, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    private static boolean k(int i11) {
        return i11 == 0 || i11 == 90 || i11 == 180 || i11 == 270;
    }

    private static boolean l(@NonNull n nVar) {
        return nVar.getFormat() == 35 && nVar.N0().length == 3;
    }

    public static n m(@NonNull n nVar, @NonNull s1 s1Var, @NonNull ImageWriter imageWriter, @NonNull ByteBuffer byteBuffer, @NonNull ByteBuffer byteBuffer2, @NonNull ByteBuffer byteBuffer3, int i11) {
        final n nVar2;
        a aVarN;
        if (!l(nVar)) {
            y0.c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!k(i11)) {
            y0.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        a aVar = a.ERROR_CONVERSION;
        if (i11 > 0) {
            nVar2 = nVar;
            aVarN = n(nVar2, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i11);
        } else {
            nVar2 = nVar;
            aVarN = aVar;
        }
        if (aVarN == aVar) {
            y0.c("ImageProcessingUtil", "rotate YUV failure");
            return null;
        }
        final n nVarD = s1Var.d();
        if (nVarD == null) {
            y0.c("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
            return null;
        }
        s sVar = new s(nVarD);
        sVar.c(new e.a() { // from class: c0.u0
            @Override // androidx.camera.core.e.a
            public final void e(androidx.camera.core.n nVar3) {
                ImageProcessingUtil.a(nVarD, nVar2, nVar3);
            }
        });
        return sVar;
    }

    private static a n(@NonNull n nVar, @NonNull ImageWriter imageWriter, @NonNull ByteBuffer byteBuffer, @NonNull ByteBuffer byteBuffer2, @NonNull ByteBuffer byteBuffer3, int i11) {
        int width = nVar.getWidth();
        int height = nVar.getHeight();
        int iM = nVar.N0()[0].m();
        int iM2 = nVar.N0()[1].m();
        int iM3 = nVar.N0()[2].m();
        int iN = nVar.N0()[1].n();
        Image imageB = l0.a.b(imageWriter);
        if (imageB == null) {
            return a.ERROR_CONVERSION;
        }
        if (nativeRotateYUV(nVar.N0()[0].l(), iM, nVar.N0()[1].l(), iM2, nVar.N0()[2].l(), iM3, iN, imageB.getPlanes()[0].getBuffer(), imageB.getPlanes()[0].getRowStride(), imageB.getPlanes()[0].getPixelStride(), imageB.getPlanes()[1].getBuffer(), imageB.getPlanes()[1].getRowStride(), imageB.getPlanes()[1].getPixelStride(), imageB.getPlanes()[2].getBuffer(), imageB.getPlanes()[2].getRowStride(), imageB.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i11) != 0) {
            return a.ERROR_CONVERSION;
        }
        l0.a.d(imageWriter, imageB);
        return a.SUCCESS;
    }

    private static native int nativeConvertAndroid420ToABGR(@NonNull ByteBuffer byteBuffer, int i11, @NonNull ByteBuffer byteBuffer2, int i12, @NonNull ByteBuffer byteBuffer3, int i13, int i14, int i15, Surface surface, ByteBuffer byteBuffer4, int i16, int i17, int i18, int i19, int i21, int i22);

    private static native int nativeConvertAndroid420ToBitmap(@NonNull ByteBuffer byteBuffer, int i11, @NonNull ByteBuffer byteBuffer2, int i12, @NonNull ByteBuffer byteBuffer3, int i13, int i14, int i15, @NonNull Bitmap bitmap, int i16, int i17, int i18);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, boolean z11);

    private static native int nativeRotateYUV(@NonNull ByteBuffer byteBuffer, int i11, @NonNull ByteBuffer byteBuffer2, int i12, @NonNull ByteBuffer byteBuffer3, int i13, int i14, @NonNull ByteBuffer byteBuffer4, int i15, int i16, @NonNull ByteBuffer byteBuffer5, int i17, int i18, @NonNull ByteBuffer byteBuffer6, int i19, int i21, @NonNull ByteBuffer byteBuffer7, @NonNull ByteBuffer byteBuffer8, @NonNull ByteBuffer byteBuffer9, int i22, int i23, int i24);

    private static native int nativeShiftPixel(@NonNull ByteBuffer byteBuffer, int i11, @NonNull ByteBuffer byteBuffer2, int i12, @NonNull ByteBuffer byteBuffer3, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21);

    private static native int nativeWriteJpegToSurface(@NonNull byte[] bArr, @NonNull Surface surface);

    public static boolean o(@NonNull Surface surface, @NonNull byte[] bArr) {
        u5.h.g(bArr);
        u5.h.g(surface);
        if (nativeWriteJpegToSurface(bArr, surface) == 0) {
            return true;
        }
        y0.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        return false;
    }
}
