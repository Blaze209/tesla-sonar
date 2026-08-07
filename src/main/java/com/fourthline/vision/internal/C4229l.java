package com.fourthline.vision.internal;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsInterface;

/* JADX INFO: renamed from: com.fourthline.vision.internal.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4229l implements J2 {
    private final int area(Bitmap bitmap) {
        return bitmap.getWidth() * bitmap.getHeight();
    }

    private final boolean isOutsideOfBitmap(C4165c4 c4165c4) {
        return c4165c4.getLeft() < 0 || c4165c4.getTop() < 0;
    }

    public final int calculateAdjustmentX(C4165c4 cropRectangle, int i11) {
        p013kotlin.jvm.internal.s.k(cropRectangle, "cropRectangle");
        if (cropRectangle.getLeft() < 0) {
            return -cropRectangle.getLeft();
        }
        if (cropRectangle.getRight() > i11) {
            return i11 - cropRectangle.getRight();
        }
        return 0;
    }

    public final int calculateAdjustmentY(C4165c4 cropRectangle, int i11) {
        p013kotlin.jvm.internal.s.k(cropRectangle, "cropRectangle");
        if (cropRectangle.getTop() < 0) {
            return -cropRectangle.getTop();
        }
        if (cropRectangle.getBottom() > i11) {
            return i11 - cropRectangle.getBottom();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0043  */
    @Override // com.fourthline.vision.internal.J2
    public Bitmap crop(Bitmap bitmap, C4165c4 cropRectangle, int i11) {
        Bitmap bitmap2;
        p013kotlin.jvm.internal.s.k(bitmap, "bitmap");
        p013kotlin.jvm.internal.s.k(cropRectangle, "cropRectangle");
        C4165c4 c4165c4 = new C4165c4(0, 0, bitmap.getWidth(), bitmap.getHeight());
        C4165c4 c4165c4Translate = cropRectangle.translate(calculateAdjustmentX(cropRectangle, bitmap.getWidth()), calculateAdjustmentY(cropRectangle, bitmap.getHeight()));
        if (cropRectangle.area() >= area(bitmap)) {
            cropRectangle = c4165c4;
        } else if (!isOutsideOfBitmap(c4165c4Translate)) {
            cropRectangle = c4165c4Translate;
        } else if (isOutsideOfBitmap(cropRectangle)) {
            cropRectangle = c4165c4;
        }
        try {
            int left = cropRectangle.getLeft();
            int top = cropRectangle.getTop();
            int iWidth = cropRectangle.width();
            int iHeight = cropRectangle.height();
            Matrix matrix = new Matrix();
            matrix.postRotate(i11);
            jn0.h0 h0Var = jn0.h0.f84049a;
            bitmap2 = bitmap;
            try {
                return Bitmap.createBitmap(bitmap2, left, top, iWidth, iHeight, matrix, false);
            } catch (Throwable th2) {
                th = th2;
                C4183e6 c4183e6 = new C4183e6(th, cropRectangle, bitmap2.getWidth(), bitmap2.getHeight());
                AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
                if (analytics != null) {
                    analytics.trackNew(c4183e6);
                }
                Bitmap bitmap3 = bitmap2;
                int left2 = c4165c4.getLeft();
                int top2 = c4165c4.getTop();
                int iWidth2 = c4165c4.width();
                int iHeight2 = c4165c4.height();
                Matrix matrix2 = new Matrix();
                matrix2.postRotate(i11);
                jn0.h0 h0Var2 = jn0.h0.f84049a;
                return Bitmap.createBitmap(bitmap3, left2, top2, iWidth2, iHeight2, matrix2, false);
            }
        } catch (Throwable th3) {
            th = th3;
            bitmap2 = bitmap;
        }
    }
}
