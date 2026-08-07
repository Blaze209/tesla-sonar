package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
@pk.d
public class NativeBlurFilter {
    static {
        b.a();
    }

    public static void a(Bitmap bitmap, int i11, int i12) {
        k.g(bitmap);
        k.b(Boolean.valueOf(i11 > 0));
        k.b(Boolean.valueOf(i12 > 0));
        nativeIterativeBoxBlur(bitmap, i11, i12);
    }

    @pk.d
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i11, int i12);
}
