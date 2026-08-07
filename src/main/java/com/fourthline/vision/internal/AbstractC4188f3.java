package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: com.fourthline.vision.internal.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4188f3 {
    public static final Rect centerCrop(Rect rect, Rect dstRect, Matrix transformMatrix) {
        p013kotlin.jvm.internal.s.k(rect, "<this>");
        p013kotlin.jvm.internal.s.k(dstRect, "dstRect");
        p013kotlin.jvm.internal.s.k(transformMatrix, "transformMatrix");
        RectF rectF = new RectF();
        transformMatrix.mapRect(rectF, new RectF(rect));
        return AbstractC4173d4.toIntRect(rectF);
    }

    public static /* synthetic */ Rect centerCrop$default(Rect rect, Rect rect2, Matrix matrix, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            matrix = centerCropMatrix(rect, rect2);
        }
        return centerCrop(rect, rect2, matrix);
    }

    public static final Matrix centerCropMatrix(Rect rect, Rect dstRect) {
        p013kotlin.jvm.internal.s.k(rect, "<this>");
        p013kotlin.jvm.internal.s.k(dstRect, "dstRect");
        Matrix matrix = new Matrix();
        float fHeight = dstRect.height() / rect.height();
        float fWidth = dstRect.width() / rect.width();
        if (fHeight < fWidth) {
            fHeight = fWidth;
        }
        matrix.setScale(fHeight, fHeight);
        return matrix;
    }

    public static final Rect copyAndMapRect(Matrix matrix, Rect rect) {
        p013kotlin.jvm.internal.s.k(matrix, "<this>");
        p013kotlin.jvm.internal.s.k(rect, "rect");
        RectF rectF = AbstractC4173d4.toRectF(rect);
        matrix.mapRect(rectF);
        return AbstractC4173d4.toIntRect(rectF);
    }

    public static final Rect restore(Matrix matrix, Rect rectToInvert) {
        p013kotlin.jvm.internal.s.k(matrix, "<this>");
        p013kotlin.jvm.internal.s.k(rectToInvert, "rectToInvert");
        Matrix matrix2 = new Matrix();
        matrix.invert(matrix2);
        RectF rectF = new RectF(rectToInvert);
        matrix2.mapRect(rectF);
        return AbstractC4173d4.toIntRect(rectF);
    }
}
