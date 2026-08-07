package com.fourthline.vision.internal;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public interface J2 {

    public static final class a {
        public static /* synthetic */ Bitmap crop$default(J2 j11, Bitmap bitmap, C4165c4 c4165c4, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: crop");
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            return j11.crop(bitmap, c4165c4, i11);
        }
    }

    Bitmap crop(Bitmap bitmap, C4165c4 c4165c4, int i11);
}
