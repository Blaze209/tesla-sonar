package androidx.camera.core.internal.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.n;
import c0.y0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h0.i;
import h0.j;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import u5.h;

/* JADX INFO: loaded from: classes.dex */
public final class ImageUtil {

    public static final class CodecFailedException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f3411a;

        public enum a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        CodecFailedException(@NonNull String str, @NonNull a aVar) {
            super(str);
            this.f3411a = aVar;
        }
    }

    public static Rect a(@NonNull Size size, @NonNull Rational rational) {
        int i11;
        if (!i(rational)) {
            y0.l("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f11 = width;
        float f12 = height;
        float f13 = f11 / f12;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i12 = 0;
        if (rational.floatValue() > f13) {
            int iRound = Math.round((f11 / numerator) * denominator);
            i11 = (height - iRound) / 2;
            height = iRound;
        } else {
            int iRound2 = Math.round((f12 / denominator) * numerator);
            int i13 = (width - iRound2) / 2;
            width = iRound2;
            i11 = 0;
            i12 = i13;
        }
        return new Rect(i12, i11, width + i12, height + i11);
    }

    @NonNull
    public static Bitmap b(@NonNull n nVar) {
        int format = nVar.getFormat();
        if (format == 1) {
            return e(nVar);
        }
        if (format == 35) {
            return ImageProcessingUtil.f(nVar);
        }
        if (format == 256 || format == 4101) {
            return c(nVar);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + nVar.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
    }

    @NonNull
    private static Bitmap c(@NonNull n nVar) {
        byte[] bArrL = l(nVar);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrL, 0, bArrL.length, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    @NonNull
    public static Bitmap d(@NonNull n.a[] aVarArr, int i11, int i12) {
        h.b(aVarArr.length == 1, "Expect a single plane");
        h.b(aVarArr[0].n() == 4, "Expect pixelStride=4");
        h.b(aVarArr[0].m() == i11 * 4, "Expect rowStride=width*4");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        aVarArr[0].l().rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, aVarArr[0].l(), aVarArr[0].m());
        return bitmapCreateBitmap;
    }

    @NonNull
    private static Bitmap e(@NonNull n nVar) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(nVar.getWidth(), nVar.getHeight(), Bitmap.Config.ARGB_8888);
        nVar.N0()[0].l().rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, nVar.N0()[0].l(), nVar.N0()[0].m());
        return bitmapCreateBitmap;
    }

    @NonNull
    public static ByteBuffer f(@NonNull Bitmap bitmap) {
        h.b(bitmap.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.i(bitmap, byteBufferAllocateDirect, bitmap.getRowBytes());
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    @NonNull
    public static Rational g(int i11, @NonNull Rational rational) {
        return (i11 == 90 || i11 == 270) ? h(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    private static Rational h(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean i(Rational rational) {
        return (rational == null || rational.floatValue() <= BitmapDescriptorFactory.HUE_RED || rational.isNaN()) ? false : true;
    }

    public static boolean j(int i11) {
        return i11 == 256 || i11 == 4101;
    }

    public static boolean k(int i11) {
        return i11 == 32;
    }

    @NonNull
    public static byte[] l(@NonNull n nVar) {
        if (!j(nVar.getFormat())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + nVar.getFormat());
        }
        ByteBuffer byteBufferL = nVar.N0()[0].l();
        byte[] bArr = new byte[byteBufferL.capacity()];
        byteBufferL.rewind();
        byteBufferL.get(bArr);
        return bArr;
    }

    @NonNull
    public static Bitmap m(@NonNull Bitmap bitmap, int i11) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i11);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    @NonNull
    public static byte[] n(@NonNull n nVar, Rect rect, int i11, int i12) throws CodecFailedException {
        if (nVar.getFormat() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + nVar.getFormat());
        }
        YuvImage yuvImage = new YuvImage(o(nVar), 17, nVar.getWidth(), nVar.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        j jVar = new j(byteArrayOutputStream, i.c(nVar, i12));
        if (rect == null) {
            rect = new Rect(0, 0, nVar.getWidth(), nVar.getHeight());
        }
        if (yuvImage.compressToJpeg(rect, i11, jVar)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new CodecFailedException("YuvImage failed to encode jpeg.", CodecFailedException.a.ENCODE_FAILED);
    }

    @NonNull
    public static byte[] o(@NonNull n nVar) {
        n.a aVar = nVar.N0()[0];
        n.a aVar2 = nVar.N0()[1];
        n.a aVar3 = nVar.N0()[2];
        ByteBuffer byteBufferL = aVar.l();
        ByteBuffer byteBufferL2 = aVar2.l();
        ByteBuffer byteBufferL3 = aVar3.l();
        byteBufferL.rewind();
        byteBufferL2.rewind();
        byteBufferL3.rewind();
        int iRemaining = byteBufferL.remaining();
        byte[] bArr = new byte[((nVar.getWidth() * nVar.getHeight()) / 2) + iRemaining];
        int width = 0;
        for (int i11 = 0; i11 < nVar.getHeight(); i11++) {
            byteBufferL.get(bArr, width, nVar.getWidth());
            width += nVar.getWidth();
            byteBufferL.position(Math.min(iRemaining, (byteBufferL.position() - nVar.getWidth()) + aVar.m()));
        }
        int height = nVar.getHeight() / 2;
        int width2 = nVar.getWidth() / 2;
        int iM = aVar3.m();
        int iM2 = aVar2.m();
        int iN = aVar3.n();
        int iN2 = aVar2.n();
        byte[] bArr2 = new byte[iM];
        byte[] bArr3 = new byte[iM2];
        for (int i12 = 0; i12 < height; i12++) {
            byteBufferL3.get(bArr2, 0, Math.min(iM, byteBufferL3.remaining()));
            byteBufferL2.get(bArr3, 0, Math.min(iM2, byteBufferL2.remaining()));
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < width2; i15++) {
                int i16 = width + 1;
                bArr[width] = bArr2[i13];
                width += 2;
                bArr[i16] = bArr3[i14];
                i13 += iN;
                i14 += iN2;
            }
        }
        return bArr;
    }
}
