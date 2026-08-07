package com.google.android.renderscript;

import android.graphics.Bitmap;
import ju.a;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\t\u0010\nJR\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017J:\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0082 ¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/google/android/renderscript/Toolkit;", "", "<init>", "()V", "", "createNative", "()J", "nativeHandle", "Ljn0/h0;", "destroyNative", "(J)V", "", "inputArray", "", "vectorSize", "sizeX", "sizeY", "outputArray", "", "coefficients", "Lcom/google/android/renderscript/Range2d;", "restriction", "nativeConvolve", "(J[BIII[B[FLcom/google/android/renderscript/Range2d;)V", "Landroid/graphics/Bitmap;", "inputBitmap", "outputBitmap", "nativeConvolveBitmap", "(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;)V", "a", "(Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;)Landroid/graphics/Bitmap;", "b", "J", "renderscript-toolkit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Toolkit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Toolkit f43205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static long nativeHandle;

    static {
        Toolkit toolkit = new Toolkit();
        f43205a = toolkit;
        try {
            System.loadLibrary("renderscript-toolkit");
            nativeHandle = toolkit.createNative();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private Toolkit() {
    }

    public static /* synthetic */ Bitmap b(Toolkit toolkit, Bitmap bitmap, float[] fArr, Range2d range2d, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            range2d = null;
        }
        return toolkit.a(bitmap, fArr, range2d);
    }

    private final native long createNative();

    private final native void destroyNative(long nativeHandle2);

    private final native void nativeConvolve(long nativeHandle2, byte[] inputArray, int vectorSize, int sizeX, int sizeY, byte[] outputArray, float[] coefficients, Range2d restriction);

    private final native void nativeConvolveBitmap(long nativeHandle2, Bitmap inputBitmap, Bitmap outputBitmap, float[] coefficients, Range2d restriction);

    public final Bitmap a(Bitmap inputBitmap, float[] coefficients, Range2d restriction) {
        s.k(inputBitmap, "inputBitmap");
        s.k(coefficients, "coefficients");
        a.c("convolve", inputBitmap, false, 4, null);
        if (coefficients.length == 9 || coefficients.length == 25) {
            a.e("convolve", inputBitmap, restriction);
            Bitmap bitmapA = a.a(inputBitmap);
            nativeConvolveBitmap(nativeHandle, inputBitmap, bitmapA, coefficients, restriction);
            return bitmapA;
        }
        throw new IllegalArgumentException(("RenderScript Toolkit convolve. Only 3x3 or 5x5 convolutions are supported. " + coefficients.length + " coefficients provided.").toString());
    }
}
