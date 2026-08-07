package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: renamed from: com.fourthline.vision.internal.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4292u0 {
    private static final void applyMatrixRotation(Matrix matrix, E5 e11, int i11) {
        if (i11 == 90) {
            matrix.postRotate(270.0f);
            matrix.postTranslate(BitmapDescriptorFactory.HUE_RED, e11.getWidth());
        } else if (i11 == 180) {
            matrix.postRotate(180.0f, e11.getWidth() / 2.0f, e11.getHeight() / 2.0f);
        } else {
            if (i11 != 270) {
                return;
            }
            matrix.postRotate(90.0f);
            matrix.postTranslate(e11.getHeight(), BitmapDescriptorFactory.HUE_RED);
        }
    }

    private static final void configureTransformationMatrix(Matrix matrix, E5 e11, E5 e12, int i11) {
        float height;
        float height2;
        if (i11 != 0 && i11 != 180) {
            e12 = new E5(e12.getHeight(), e12.getWidth());
        }
        float width = e11.getWidth() / e11.getHeight();
        float width2 = e12.getWidth() / e12.getHeight();
        float width3 = BitmapDescriptorFactory.HUE_RED;
        if (width2 < width) {
            height = e11.getWidth() / e12.getWidth();
            height2 = (e11.getHeight() - (e12.getHeight() * height)) / 2;
        } else {
            height = e11.getHeight() / e12.getHeight();
            width3 = (e11.getWidth() - (e12.getWidth() * height)) / 2;
            height2 = 0.0f;
        }
        float f11 = 1 / height;
        matrix.setScale(f11, f11);
        matrix.postTranslate((-width3) / height, (-height2) / height);
        applyMatrixRotation(matrix, e12, i11);
    }

    public static final Matrix createTargetToScreenMatrix(E5 screenSize, E5 cameraResolution, int i11, boolean z11) {
        p013kotlin.jvm.internal.s.k(screenSize, "screenSize");
        p013kotlin.jvm.internal.s.k(cameraResolution, "cameraResolution");
        Matrix matrix = new Matrix();
        configureTransformationMatrix(matrix, screenSize, cameraResolution, i11);
        matrix.invert(matrix);
        if (z11) {
            matrix.postScale(-1.0f, 1.0f, screenSize.getWidth() / 2.0f, screenSize.getHeight() / 2.0f);
        }
        return matrix;
    }

    private static final E5 rotateAroundCamera(E5 e11, int i11) {
        return new E5((i11 == 0 || i11 == 180) ? e11.getWidth() : e11.getHeight(), (i11 == 0 || i11 == 180) ? e11.getHeight() : e11.getWidth());
    }

    public static final C4165c4 translateScreenToTarget(C4165c4 rect, E5 screenSize, E5 cameraResolution, int i11, boolean z11) {
        p013kotlin.jvm.internal.s.k(rect, "rect");
        p013kotlin.jvm.internal.s.k(screenSize, "screenSize");
        p013kotlin.jvm.internal.s.k(cameraResolution, "cameraResolution");
        if (z11) {
            return translateScreenToTargetWithMatrix(rect, screenSize, cameraResolution, i11);
        }
        C4285t0 c4285t0TranslateScreenToTarget = translateScreenToTarget(new C4285t0(rect.getLeft(), rect.getTop()), screenSize, cameraResolution, i11, false);
        C4285t0 c4285t0TranslateScreenToTarget2 = translateScreenToTarget(new C4285t0(rect.getRight(), rect.getBottom()), screenSize, cameraResolution, i11, false);
        return new C4165c4(Math.min(c4285t0TranslateScreenToTarget.getX(), c4285t0TranslateScreenToTarget2.getX()), Math.min(c4285t0TranslateScreenToTarget.getY(), c4285t0TranslateScreenToTarget2.getY()), Math.max(c4285t0TranslateScreenToTarget.getX(), c4285t0TranslateScreenToTarget2.getX()), Math.max(c4285t0TranslateScreenToTarget.getY(), c4285t0TranslateScreenToTarget2.getY()));
    }

    public static /* synthetic */ C4165c4 translateScreenToTarget$default(C4165c4 c4165c4, E5 e11, E5 e12, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return translateScreenToTarget(c4165c4, e11, e12, i11, z11);
    }

    private static final C4285t0 translateScreenToTargetManually(C4285t0 c4285t0, E5 e11, E5 e12) {
        jn0.w wVar;
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        if (e12.getWidth() / e12.getHeight() < e11.getWidth() / e11.getHeight()) {
            float width = e11.getWidth() / e12.getWidth();
            wVar = new jn0.w(fValueOf, Float.valueOf((e11.getHeight() - (e12.getHeight() * width)) / 2), Float.valueOf(width));
        } else {
            float height = e11.getHeight() / e12.getHeight();
            wVar = new jn0.w(Float.valueOf((e11.getWidth() - (e12.getWidth() * height)) / 2), fValueOf, Float.valueOf(height));
        }
        float fFloatValue = ((Number) wVar.a()).floatValue();
        float fFloatValue2 = ((Number) wVar.b()).floatValue();
        float fFloatValue3 = ((Number) wVar.c()).floatValue();
        return new C4285t0((int) ((c4285t0.getX() - fFloatValue) / fFloatValue3), (int) ((c4285t0.getY() - fFloatValue2) / fFloatValue3));
    }

    public static final C4165c4 translateScreenToTargetWithMatrix(C4165c4 rect, E5 screenSize, E5 cameraResolution, int i11) {
        p013kotlin.jvm.internal.s.k(rect, "rect");
        p013kotlin.jvm.internal.s.k(screenSize, "screenSize");
        p013kotlin.jvm.internal.s.k(cameraResolution, "cameraResolution");
        Matrix matrix = new Matrix();
        configureTransformationMatrix(matrix, screenSize, cameraResolution, i11);
        RectF rectF = new RectF(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        matrix.mapRect(rectF);
        return AbstractC4173d4.toRectangle(rectF);
    }

    public static /* synthetic */ C4285t0 translateScreenToTargetWithMatrix$default(C4285t0 c4285t0, E5 e11, E5 e12, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return translateScreenToTargetWithMatrix(c4285t0, e11, e12, i11);
    }

    public static final C4165c4 translateTargetToScreen(C4165c4 rect, E5 screenSize, E5 cameraResolution, int i11, boolean z11) {
        p013kotlin.jvm.internal.s.k(rect, "rect");
        p013kotlin.jvm.internal.s.k(screenSize, "screenSize");
        p013kotlin.jvm.internal.s.k(cameraResolution, "cameraResolution");
        Matrix matrixCreateTargetToScreenMatrix = createTargetToScreenMatrix(screenSize, cameraResolution, i11, z11);
        RectF rectF = new RectF(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        matrixCreateTargetToScreenMatrix.mapRect(rectF);
        return AbstractC4173d4.toRectangle(rectF);
    }

    public static /* synthetic */ C4285t0 translateScreenToTarget$default(C4285t0 c4285t0, E5 e11, E5 e12, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return translateScreenToTarget(c4285t0, e11, e12, i11, z11);
    }

    private static final C4285t0 rotateAroundCamera(C4285t0 c4285t0, E5 e11, int i11) {
        if (i11 == 90) {
            return new C4285t0(c4285t0.getY(), e11.getWidth() - c4285t0.getX());
        }
        if (i11 != 180) {
            return i11 != 270 ? c4285t0 : new C4285t0(e11.getHeight() - c4285t0.getY(), c4285t0.getX());
        }
        return new C4285t0(e11.getWidth() - c4285t0.getX(), e11.getHeight() - c4285t0.getY());
    }

    public static final C4285t0 translateScreenToTargetWithMatrix(C4285t0 coordinate, E5 screenSize, E5 cameraResolution, int i11) {
        p013kotlin.jvm.internal.s.k(coordinate, "coordinate");
        p013kotlin.jvm.internal.s.k(screenSize, "screenSize");
        p013kotlin.jvm.internal.s.k(cameraResolution, "cameraResolution");
        Matrix matrix = new Matrix();
        configureTransformationMatrix(matrix, screenSize, cameraResolution, i11);
        float[] fArr = {coordinate.getX(), coordinate.getY()};
        matrix.mapPoints(fArr);
        return new C4285t0((int) fArr[0], (int) fArr[1]);
    }

    public static final C4285t0 translateScreenToTarget(C4285t0 coordinate, E5 screenSize, E5 cameraResolution, int i11, boolean z11) {
        p013kotlin.jvm.internal.s.k(coordinate, "coordinate");
        p013kotlin.jvm.internal.s.k(screenSize, "screenSize");
        p013kotlin.jvm.internal.s.k(cameraResolution, "cameraResolution");
        if (z11) {
            return translateScreenToTargetWithMatrix(coordinate, screenSize, cameraResolution, i11);
        }
        return translateScreenToTargetManually(rotateAroundCamera(coordinate, screenSize, i11), rotateAroundCamera(screenSize, i11), cameraResolution);
    }
}
