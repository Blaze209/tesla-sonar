package xx;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import com.plaid.internal.EnumC4419g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f124046a = new c();

    private c() {
    }

    @NonNull
    @KeepForSdk
    public static ByteBuffer a(@NonNull ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    @NonNull
    @KeepForSdk
    public static c f() {
        return f124046a;
    }

    @NonNull
    @KeepForSdk
    public static Bitmap i(@NonNull ByteBuffer byteBuffer, int i11, int i12, int i13) throws MlKitException {
        byte[] bArrL = l(j(byteBuffer, true).array(), i11, i12);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrL, 0, bArrL.length);
        return k(bitmapDecodeByteArray, i13, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    @NonNull
    @KeepForSdk
    public static ByteBuffer j(@NonNull ByteBuffer byteBuffer, boolean z11) {
        int i11;
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        int i12 = iLimit / 6;
        ByteBuffer byteBufferAllocate = z11 ? ByteBuffer.allocate(iLimit) : ByteBuffer.allocateDirect(iLimit);
        int i13 = 0;
        while (true) {
            i11 = i12 * 4;
            if (i13 >= i11) {
                break;
            }
            byteBufferAllocate.put(i13, byteBuffer.get(i13));
            i13++;
        }
        for (int i14 = 0; i14 < i12 + i12; i14++) {
            byteBufferAllocate.put(i11 + i14, byteBuffer.get(((i14 % 2) * i12) + i11 + (i14 / 2)));
        }
        return byteBufferAllocate;
    }

    @NonNull
    public static Bitmap k(@NonNull Bitmap bitmap, int i11, int i12, int i13) {
        if (i11 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i12, i13);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i11);
        return Bitmap.createBitmap(bitmap, 0, 0, i12, i13, matrix, true);
    }

    private static byte[] l(@NonNull byte[] bArr, int i11, int i12) throws MlKitException {
        YuvImage yuvImage = new YuvImage(bArr, 17, i11, i12, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, i11, i12), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                        throw th2;
                    } catch (Exception unused) {
                        throw th2;
                    }
                }
            }
        } catch (IOException e11) {
            Log.w("ImageConvertUtils", "Error closing ByteArrayOutputStream");
            throw new MlKitException("Image conversion error from NV21 format", 13, e11);
        }
    }

    private static final void m(Image.Plane plane, int i11, int i12, byte[] bArr, int i13, int i14) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int iLimit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (iLimit == 0) {
            return;
        }
        int i15 = i11 / (i12 / iLimit);
        int rowStride = 0;
        for (int i16 = 0; i16 < iLimit; i16++) {
            int pixelStride = rowStride;
            for (int i17 = 0; i17 < i15; i17++) {
                bArr[i13] = buffer.get(pixelStride);
                i13 += i14;
                pixelStride += plane.getPixelStride();
            }
            rowStride += plane.getRowStride();
        }
    }

    @NonNull
    @KeepForSdk
    public byte[] b(@NonNull ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        byte[] bArr = new byte[iLimit];
        byteBuffer.get(bArr, 0, iLimit);
        return bArr;
    }

    @NonNull
    @KeepForSdk
    public Bitmap c(@NonNull Image image, int i11) {
        Preconditions.checkArgument(image.getFormat() == 256, "Only JPEG is supported now");
        Image.Plane[] planes = image.getPlanes();
        if (planes == null || planes.length != 1) {
            throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
        }
        ByteBuffer buffer = planes[0].getBuffer();
        buffer.rewind();
        int iRemaining = buffer.remaining();
        byte[] bArr = new byte[iRemaining];
        buffer.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
        return k(bitmapDecodeByteArray, i11, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    @NonNull
    @KeepForSdk
    public ByteBuffer d(@NonNull wx.a aVar, boolean z11) throws MlKitException {
        int iH = aVar.h();
        if (iH != -1) {
            if (iH == 17) {
                return z11 ? a((ByteBuffer) Preconditions.checkNotNull(aVar.f())) : (ByteBuffer) Preconditions.checkNotNull(aVar.f());
            }
            if (iH == 35) {
                return h((Image.Plane[]) Preconditions.checkNotNull(aVar.k()), aVar.m(), aVar.i());
            }
            if (iH == 842094169) {
                return j((ByteBuffer) Preconditions.checkNotNull(aVar.f()), z11);
            }
            throw new MlKitException("Unsupported image format", 13);
        }
        Bitmap bitmapCopy = (Bitmap) Preconditions.checkNotNull(aVar.e());
        if (Build.VERSION.SDK_INT >= 26 && bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
        }
        Bitmap bitmap = bitmapCopy;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i11 = width * height;
        int[] iArr = new int[i11];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(((double) height) / 2.0d);
        int iCeil2 = ((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i11;
        ByteBuffer byteBufferAllocate = z11 ? ByteBuffer.allocate(iCeil2) : ByteBuffer.allocateDirect(iCeil2);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < height; i14++) {
            int i15 = 0;
            while (i15 < width) {
                int i16 = iArr[i13];
                int i17 = i16 >> 16;
                int i18 = i16 >> 8;
                int i19 = i16 & 255;
                int i21 = i12 + 1;
                int i22 = i17 & 255;
                int i23 = i18 & 255;
                byteBufferAllocate.put(i12, (byte) Math.min(255, (((((i22 * 66) + (i23 * EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE)) + (i19 * 25)) + 128) >> 8) + 16));
                if (i14 % 2 == 0 && i13 % 2 == 0) {
                    int i24 = ((((i22 * 112) - (i23 * 94)) - (i19 * 18)) + 128) >> 8;
                    int i25 = (((((i22 * (-38)) - (i23 * 74)) + (i19 * 112)) + 128) >> 8) + 128;
                    int i26 = i11 + 1;
                    byteBufferAllocate.put(i11, (byte) Math.min(255, i24 + 128));
                    i11 += 2;
                    byteBufferAllocate.put(i26, (byte) Math.min(255, i25));
                }
                i13++;
                i15++;
                i12 = i21;
            }
        }
        return byteBufferAllocate;
    }

    @NonNull
    @KeepForSdk
    public Bitmap e(@NonNull wx.a aVar) throws MlKitException {
        int iH = aVar.h();
        if (iH == -1) {
            return k((Bitmap) Preconditions.checkNotNull(aVar.e()), aVar.l(), aVar.m(), aVar.i());
        }
        if (iH == 17) {
            return g((ByteBuffer) Preconditions.checkNotNull(aVar.f()), aVar.m(), aVar.i(), aVar.l());
        }
        if (iH == 35) {
            return g(h((Image.Plane[]) Preconditions.checkNotNull(aVar.k()), aVar.m(), aVar.i()), aVar.m(), aVar.i(), aVar.l());
        }
        if (iH == 842094169) {
            return i((ByteBuffer) Preconditions.checkNotNull(aVar.f()), aVar.m(), aVar.i(), aVar.l());
        }
        throw new MlKitException("Unsupported image format", 13);
    }

    @NonNull
    @KeepForSdk
    public Bitmap g(@NonNull ByteBuffer byteBuffer, int i11, int i12, int i13) throws MlKitException {
        byte[] bArrL = l(b(byteBuffer), i11, i12);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrL, 0, bArrL.length);
        return k(bitmapDecodeByteArray, i13, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    @NonNull
    @KeepForSdk
    public ByteBuffer h(@NonNull Image.Plane[] planeArr, int i11, int i12) {
        int i13 = i11 * i12;
        int i14 = i13 / 4;
        byte[] bArr = new byte[i14 + i14 + i13];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i15 = (i13 + i13) / 4;
        boolean z11 = buffer2.remaining() == i15 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z11) {
            planeArr[0].getBuffer().get(bArr, 0, i13);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i13, 1);
            buffer3.get(bArr, i13 + 1, i15 - 1);
        } else {
            m(planeArr[0], i11, i12, bArr, 0, 1);
            m(planeArr[1], i11, i12, bArr, i13 + 1, 2);
            m(planeArr[2], i11, i12, bArr, i13, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
