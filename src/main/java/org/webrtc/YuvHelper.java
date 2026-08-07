package org.webrtc;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class YuvHelper {
    public static void ABGRToI420(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15, int i16) {
        nativeABGRToI420((ByteBuffer) checkNotNull(byteBuffer, "src"), i11, (ByteBuffer) checkNotNull(byteBuffer2, "dstY"), i12, (ByteBuffer) checkNotNull(byteBuffer3, "dstU"), i13, (ByteBuffer) checkNotNull(byteBuffer4, "dstV"), i14, i15, i16);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i21 = (i15 + 1) / 2;
        int i22 = i16 * i15;
        int i23 = i16 * i17;
        int i24 = (i18 * i21) + i23;
        int i25 = (i18 * i19) + i23;
        int i26 = ((i21 - 1) * i18) + i25 + ((i14 + 1) / 2);
        if (byteBuffer4.capacity() < i26) {
            throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i26 + " was " + byteBuffer4.capacity());
        }
        ByteBuffer byteBufferSlice = byteBuffer4.slice();
        ByteBuffer byteBufferSlice2 = byteBuffer4.slice();
        I420Copy(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBufferSlice, i16, byteBufferSlice2, i18, byteBuffer4.slice(), i18, i14, i15);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15, int i16) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dst");
        int i17 = i16 % 180;
        int i18 = i17 == 0 ? i14 : i15;
        int i19 = i17 == 0 ? i15 : i14;
        int i21 = (i19 + 1) / 2;
        int i22 = (i18 + 1) / 2;
        int i23 = i19 * i18;
        int i24 = i21 * i22;
        int i25 = (i24 * 2) + i23;
        if (byteBuffer4.capacity() < i25) {
            throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i25 + " was " + byteBuffer4.capacity());
        }
        int i26 = i24 + i23;
        ByteBuffer byteBufferSlice = byteBuffer4.slice();
        ByteBuffer byteBufferSlice2 = byteBuffer4.slice();
        nativeI420Rotate(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBufferSlice, i18, byteBufferSlice2, i22, byteBuffer4.slice(), i22, i14, i15, i16);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15, int i16, int i17) {
        int i18 = (i14 + 1) / 2;
        int i19 = i16 * i15;
        int i21 = i16 * i17;
        int i22 = (((i15 + 1) / 2) * i18 * 2) + i21;
        if (byteBuffer4.capacity() >= i22) {
            ByteBuffer byteBufferSlice = byteBuffer4.slice();
            I420ToNV12(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBufferSlice, i16, byteBuffer4.slice(), i18 * 2, i14, i15);
            return;
        }
        throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i22 + " was " + byteBuffer4.capacity());
    }

    private static <T> T checkNotNull(T t11, String str) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(str + " should not be null");
    }

    public static void copyPlane(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14) {
        nativeCopyPlane((ByteBuffer) checkNotNull(byteBuffer, "src"), i11, (ByteBuffer) checkNotNull(byteBuffer2, "dst"), i12, i13, i14);
    }

    private static native void nativeABGRToI420(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15, int i16);

    private static native void nativeCopyPlane(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14);

    private static native void nativeI420Copy(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, ByteBuffer byteBuffer6, int i16, int i17, int i18);

    private static native void nativeI420Rotate(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, ByteBuffer byteBuffer6, int i16, int i17, int i18, int i19);

    private static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, int i16, int i17);

    public static void I420ToNV12(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15) {
        I420ToNV12(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBuffer4, i14, i15, i14, i15);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, int i16, int i17) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstUV");
        if (i16 > 0 && i17 > 0) {
            nativeI420ToNV12(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBuffer4, i14, byteBuffer5, i15, i16, i17);
            return;
        }
        throw new IllegalArgumentException("I420ToNV12: width and height should not be negative");
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15) {
        I420Copy(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBuffer4, i14, i15, i14, i15, (i14 + 1) / 2, (i15 + 1) / 2);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15, int i16, int i17) {
        I420Copy(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBuffer4, i14, i15, i16, i17, (i16 + 1) / 2, (i17 + 1) / 2);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, ByteBuffer byteBuffer6, int i16, int i17, int i18) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstU");
        checkNotNull(byteBuffer6, "dstV");
        if (i17 > 0 && i18 > 0) {
            nativeI420Copy(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBuffer4, i14, byteBuffer5, i15, byteBuffer6, i16, i17, i18);
            return;
        }
        throw new IllegalArgumentException("I420Copy: width and height should not be negative");
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, ByteBuffer byteBuffer6, int i16, int i17, int i18, int i19) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstU");
        checkNotNull(byteBuffer6, "dstV");
        nativeI420Rotate(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBuffer4, i14, byteBuffer5, i15, byteBuffer6, i16, i17, i18, i19);
    }
}
