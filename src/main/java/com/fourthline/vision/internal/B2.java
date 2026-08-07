package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CameraCharacteristics f37634a;

    public B2(CameraCharacteristics cameraCharacteristics) {
        p013kotlin.jvm.internal.s.k(cameraCharacteristics, "cameraCharacteristics");
        this.f37634a = cameraCharacteristics;
    }

    public final MeteringRectangle calculateFocusArea(Rect focusArea, Rect cameraPreviewRect, int i11) {
        float fHeight;
        int iHeight;
        MeteringRectangle meteringRectangle;
        p013kotlin.jvm.internal.s.k(focusArea, "focusArea");
        p013kotlin.jvm.internal.s.k(cameraPreviewRect, "cameraPreviewRect");
        Rect rect = (Rect) this.f37634a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect == null) {
            if (B2.class.isAnonymousClass()) {
                String name = B2.class.getName();
                int length = name.length();
                p013kotlin.jvm.internal.s.h(name);
                if (length > 23) {
                    p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
                }
            } else {
                String simpleName = B2.class.getSimpleName();
                int length2 = simpleName.length();
                p013kotlin.jvm.internal.s.h(simpleName);
                if (length2 > 23) {
                    p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
                }
            }
            return null;
        }
        Rect rect2 = (i11 == 90 || i11 == 270) ? new Rect(cameraPreviewRect.top, cameraPreviewRect.left, cameraPreviewRect.bottom, cameraPreviewRect.right) : cameraPreviewRect;
        if (rect.height() / rect.width() > rect2.height() / rect2.width()) {
            fHeight = rect.width();
            iHeight = rect2.width();
        } else {
            fHeight = rect.height();
            iHeight = rect2.height();
        }
        float f11 = fHeight / iHeight;
        Matrix matrix = new Matrix();
        matrix.setTranslate(-cameraPreviewRect.exactCenterX(), -cameraPreviewRect.exactCenterY());
        Rect rectCopyAndMapRect = AbstractC4188f3.copyAndMapRect(matrix, focusArea);
        Matrix matrix2 = new Matrix();
        matrix2.setRotate(-i11);
        Rect rectCopyAndMapRect2 = AbstractC4188f3.copyAndMapRect(matrix2, rectCopyAndMapRect);
        Matrix matrix3 = new Matrix();
        matrix3.setScale(f11, f11);
        Rect rectCopyAndMapRect3 = AbstractC4188f3.copyAndMapRect(matrix3, rectCopyAndMapRect2);
        Matrix matrix4 = new Matrix();
        matrix4.setTranslate(rect.exactCenterX(), rect.exactCenterY());
        Rect rectCopyAndMapRect4 = AbstractC4188f3.copyAndMapRect(matrix4, rectCopyAndMapRect3);
        int[] iArr = (int[]) this.f37634a.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (B2.class.isAnonymousClass()) {
            String name2 = B2.class.getName();
            meteringRectangle = null;
            int length3 = name2.length();
            p013kotlin.jvm.internal.s.h(name2);
            if (length3 > 23) {
                p013kotlin.jvm.internal.s.j(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
            }
        } else {
            meteringRectangle = null;
            String simpleName2 = B2.class.getSimpleName();
            int length4 = simpleName2.length();
            p013kotlin.jvm.internal.s.h(simpleName2);
            if (length4 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName2.substring(0, 23), "substring(...)");
            }
        }
        p013kotlin.jvm.internal.s.j(Arrays.toString(iArr), "toString(...)");
        if (B2.class.isAnonymousClass()) {
            String name3 = B2.class.getName();
            int length5 = name3.length();
            p013kotlin.jvm.internal.s.h(name3);
            if (length5 > 23) {
                p013kotlin.jvm.internal.s.j(name3.substring(name3.length() - 23, name3.length()), "substring(...)");
            }
        } else {
            String simpleName3 = B2.class.getSimpleName();
            int length6 = simpleName3.length();
            p013kotlin.jvm.internal.s.h(simpleName3);
            if (length6 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName3.substring(0, 23), "substring(...)");
            }
        }
        if (iArr != null) {
            p013kotlin.collections.n.c0(iArr, 4);
        }
        if (B2.class.isAnonymousClass()) {
            String name4 = B2.class.getName();
            int length7 = name4.length();
            p013kotlin.jvm.internal.s.h(name4);
            if (length7 > 23) {
                p013kotlin.jvm.internal.s.j(name4.substring(name4.length() - 23, name4.length()), "substring(...)");
            }
        } else {
            String simpleName4 = B2.class.getSimpleName();
            int length8 = simpleName4.length();
            p013kotlin.jvm.internal.s.h(simpleName4);
            if (length8 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName4.substring(0, 23), "substring(...)");
            }
        }
        if (B2.class.isAnonymousClass()) {
            String name5 = B2.class.getName();
            int length9 = name5.length();
            p013kotlin.jvm.internal.s.h(name5);
            if (length9 > 23) {
                p013kotlin.jvm.internal.s.j(name5.substring(name5.length() - 23, name5.length()), "substring(...)");
            }
        } else {
            String simpleName5 = B2.class.getSimpleName();
            int length10 = simpleName5.length();
            p013kotlin.jvm.internal.s.h(simpleName5);
            if (length10 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName5.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(this.f37634a.get(CameraCharacteristics.SENSOR_ORIENTATION));
        if (B2.class.isAnonymousClass()) {
            String name6 = B2.class.getName();
            int length11 = name6.length();
            p013kotlin.jvm.internal.s.h(name6);
            if (length11 > 23) {
                p013kotlin.jvm.internal.s.j(name6.substring(name6.length() - 23, name6.length()), "substring(...)");
            }
        } else {
            String simpleName6 = B2.class.getSimpleName();
            int length12 = simpleName6.length();
            p013kotlin.jvm.internal.s.h(simpleName6);
            if (length12 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName6.substring(0, 23), "substring(...)");
            }
        }
        if (B2.class.isAnonymousClass()) {
            String name7 = B2.class.getName();
            int length13 = name7.length();
            p013kotlin.jvm.internal.s.h(name7);
            if (length13 > 23) {
                p013kotlin.jvm.internal.s.j(name7.substring(name7.length() - 23, name7.length()), "substring(...)");
            }
        } else {
            String simpleName7 = B2.class.getSimpleName();
            int length14 = simpleName7.length();
            p013kotlin.jvm.internal.s.h(simpleName7);
            if (length14 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName7.substring(0, 23), "substring(...)");
            }
        }
        if (B2.class.isAnonymousClass()) {
            String name8 = B2.class.getName();
            int length15 = name8.length();
            p013kotlin.jvm.internal.s.h(name8);
            if (length15 > 23) {
                p013kotlin.jvm.internal.s.j(name8.substring(name8.length() - 23, name8.length()), "substring(...)");
            }
        } else {
            String simpleName8 = B2.class.getSimpleName();
            int length16 = simpleName8.length();
            p013kotlin.jvm.internal.s.h(simpleName8);
            if (length16 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName8.substring(0, 23), "substring(...)");
            }
        }
        if (B2.class.isAnonymousClass()) {
            String name9 = B2.class.getName();
            int length17 = name9.length();
            p013kotlin.jvm.internal.s.h(name9);
            if (length17 > 23) {
                p013kotlin.jvm.internal.s.j(name9.substring(name9.length() - 23, name9.length()), "substring(...)");
            }
        } else {
            String simpleName9 = B2.class.getSimpleName();
            int length18 = simpleName9.length();
            p013kotlin.jvm.internal.s.h(simpleName9);
            if (length18 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName9.substring(0, 23), "substring(...)");
            }
        }
        if (B2.class.isAnonymousClass()) {
            String name10 = B2.class.getName();
            int length19 = name10.length();
            p013kotlin.jvm.internal.s.h(name10);
            if (length19 > 23) {
                p013kotlin.jvm.internal.s.j(name10.substring(name10.length() - 23, name10.length()), "substring(...)");
            }
        } else {
            String simpleName10 = B2.class.getSimpleName();
            int length20 = simpleName10.length();
            p013kotlin.jvm.internal.s.h(simpleName10);
            if (length20 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName10.substring(0, 23), "substring(...)");
            }
        }
        cameraPreviewRect.toString();
        if (B2.class.isAnonymousClass()) {
            String name11 = B2.class.getName();
            int length21 = name11.length();
            p013kotlin.jvm.internal.s.h(name11);
            if (length21 > 23) {
                p013kotlin.jvm.internal.s.j(name11.substring(name11.length() - 23, name11.length()), "substring(...)");
            }
        } else {
            String simpleName11 = B2.class.getSimpleName();
            int length22 = simpleName11.length();
            p013kotlin.jvm.internal.s.h(simpleName11);
            if (length22 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName11.substring(0, 23), "substring(...)");
            }
        }
        rect2.toString();
        if (B2.class.isAnonymousClass()) {
            String name12 = B2.class.getName();
            int length23 = name12.length();
            p013kotlin.jvm.internal.s.h(name12);
            if (length23 > 23) {
                p013kotlin.jvm.internal.s.j(name12.substring(name12.length() - 23, name12.length()), "substring(...)");
            }
        } else {
            String simpleName12 = B2.class.getSimpleName();
            int length24 = simpleName12.length();
            p013kotlin.jvm.internal.s.h(simpleName12);
            if (length24 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName12.substring(0, 23), "substring(...)");
            }
        }
        rect.toString();
        if (B2.class.isAnonymousClass()) {
            String name13 = B2.class.getName();
            int length25 = name13.length();
            p013kotlin.jvm.internal.s.h(name13);
            if (length25 > 23) {
                p013kotlin.jvm.internal.s.j(name13.substring(name13.length() - 23, name13.length()), "substring(...)");
            }
        } else {
            String simpleName13 = B2.class.getSimpleName();
            int length26 = simpleName13.length();
            p013kotlin.jvm.internal.s.h(simpleName13);
            if (length26 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName13.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(focusArea);
        if (B2.class.isAnonymousClass()) {
            String name14 = B2.class.getName();
            int length27 = name14.length();
            p013kotlin.jvm.internal.s.h(name14);
            if (length27 > 23) {
                p013kotlin.jvm.internal.s.j(name14.substring(name14.length() - 23, name14.length()), "substring(...)");
            }
        } else {
            String simpleName14 = B2.class.getSimpleName();
            int length28 = simpleName14.length();
            p013kotlin.jvm.internal.s.h(simpleName14);
            if (length28 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName14.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(rectCopyAndMapRect);
        if (B2.class.isAnonymousClass()) {
            String name15 = B2.class.getName();
            int length29 = name15.length();
            p013kotlin.jvm.internal.s.h(name15);
            if (length29 > 23) {
                p013kotlin.jvm.internal.s.j(name15.substring(name15.length() - 23, name15.length()), "substring(...)");
            }
        } else {
            String simpleName15 = B2.class.getSimpleName();
            int length30 = simpleName15.length();
            p013kotlin.jvm.internal.s.h(simpleName15);
            if (length30 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName15.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(rectCopyAndMapRect2);
        if (B2.class.isAnonymousClass()) {
            String name16 = B2.class.getName();
            int length31 = name16.length();
            p013kotlin.jvm.internal.s.h(name16);
            if (length31 > 23) {
                p013kotlin.jvm.internal.s.j(name16.substring(name16.length() - 23, name16.length()), "substring(...)");
            }
        } else {
            String simpleName16 = B2.class.getSimpleName();
            int length32 = simpleName16.length();
            p013kotlin.jvm.internal.s.h(simpleName16);
            if (length32 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName16.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(rectCopyAndMapRect3);
        if (B2.class.isAnonymousClass()) {
            String name17 = B2.class.getName();
            int length33 = name17.length();
            p013kotlin.jvm.internal.s.h(name17);
            if (length33 > 23) {
                p013kotlin.jvm.internal.s.j(name17.substring(name17.length() - 23, name17.length()), "substring(...)");
            }
        } else {
            String simpleName17 = B2.class.getSimpleName();
            int length34 = simpleName17.length();
            p013kotlin.jvm.internal.s.h(simpleName17);
            if (length34 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName17.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(rectCopyAndMapRect4);
        return (rectCopyAndMapRect4.left < 0 || rectCopyAndMapRect4.top < 0 || rectCopyAndMapRect4.width() <= 0 || rectCopyAndMapRect4.height() <= 0) ? meteringRectangle : new MeteringRectangle(rectCopyAndMapRect4.left, rectCopyAndMapRect4.top, rectCopyAndMapRect4.width(), rectCopyAndMapRect4.height(), 999);
    }
}
