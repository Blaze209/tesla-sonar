package com.fourthline.vision.internal;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Y1 {
    public static final Bitmap cropBitmap(Bitmap bitmap, C4165c4 contentDetectionArea, int i11) {
        p013kotlin.jvm.internal.s.k(bitmap, "bitmap");
        p013kotlin.jvm.internal.s.k(contentDetectionArea, "contentDetectionArea");
        return new C4229l().crop(bitmap, contentDetectionArea, i11);
    }
}
