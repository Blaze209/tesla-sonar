package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
@pk.d
public class Bitmaps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f21718a = 0;

    static {
        a.a();
    }

    @pk.d
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        k.b(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        k.b(Boolean.valueOf(bitmap.isMutable()));
        k.b(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        k.b(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @pk.d
    private static native void nativeCopyBitmap(Bitmap bitmap, int i11, Bitmap bitmap2, int i12, int i13);
}
