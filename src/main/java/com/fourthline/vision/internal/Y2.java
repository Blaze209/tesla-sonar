package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class Y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r6 f38095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Matrix f38096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f38097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f38098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Rect f38099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f38100f;

    public Y2(r6 visionInfoProvider) {
        p013kotlin.jvm.internal.s.k(visionInfoProvider, "visionInfoProvider");
        this.f38095a = visionInfoProvider;
        this.f38096b = new Matrix();
        this.f38097c = new Rect();
        this.f38098d = new Rect();
        this.f38099e = new Rect();
        this.f38100f = new Rect();
    }

    public final Rect getCameraPreviewRect$fourthline_vision_release() {
        return this.f38098d;
    }

    public final Rect getPreviewHolderScreenRect$fourthline_vision_release() {
        return this.f38099e;
    }

    public final Matrix getRecognitionToScreenCoordsMatrixAndTranslation$fourthline_vision_release() {
        return this.f38096b;
    }

    public final Rect getScreenRect$fourthline_vision_release() {
        return this.f38097c;
    }

    public final void setPreviewHolderScreenRect$fourthline_vision_release(Rect rect) {
        p013kotlin.jvm.internal.s.k(rect, "<set-?>");
        this.f38099e = rect;
    }

    public final void setRecognitionToScreenCoordsMatrixAndTranslation$fourthline_vision_release(Matrix matrix) {
        p013kotlin.jvm.internal.s.k(matrix, "<set-?>");
        this.f38096b = matrix;
    }

    public final void setupTransformations(int i11, int i12) {
        Size imageReaderSize = this.f38095a.getImageReaderSize();
        Size previewSize = this.f38095a.getPreviewSize();
        boolean zIsPortrait = s6.isPortrait(this.f38095a);
        this.f38097c.set(0, 0, i11, i12);
        this.f38098d.set(0, 0, zIsPortrait ? previewSize.getWidth() : previewSize.getHeight(), zIsPortrait ? previewSize.getHeight() : previewSize.getWidth());
        this.f38100f.set(0, 0, zIsPortrait ? imageReaderSize.getWidth() : imageReaderSize.getHeight(), zIsPortrait ? imageReaderSize.getHeight() : imageReaderSize.getWidth());
        this.f38099e = AbstractC4188f3.centerCrop$default(this.f38100f, this.f38097c, null, 2, null);
        this.f38096b = AbstractC4188f3.centerCropMatrix(this.f38100f, this.f38097c);
        if (Y2.class.isAnonymousClass()) {
            String name = Y2.class.getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = Y2.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(this.f38097c);
        if (Y2.class.isAnonymousClass()) {
            String name2 = Y2.class.getName();
            int length3 = name2.length();
            p013kotlin.jvm.internal.s.h(name2);
            if (length3 > 23) {
                p013kotlin.jvm.internal.s.j(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
            }
        } else {
            String simpleName2 = Y2.class.getSimpleName();
            int length4 = simpleName2.length();
            p013kotlin.jvm.internal.s.h(simpleName2);
            if (length4 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName2.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(this.f38099e);
        if (Y2.class.isAnonymousClass()) {
            String name3 = Y2.class.getName();
            int length5 = name3.length();
            p013kotlin.jvm.internal.s.h(name3);
            if (length5 > 23) {
                p013kotlin.jvm.internal.s.j(name3.substring(name3.length() - 23, name3.length()), "substring(...)");
            }
        } else {
            String simpleName3 = Y2.class.getSimpleName();
            int length6 = simpleName3.length();
            p013kotlin.jvm.internal.s.h(simpleName3);
            if (length6 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName3.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(this.f38098d);
        if (Y2.class.isAnonymousClass()) {
            String name4 = Y2.class.getName();
            int length7 = name4.length();
            p013kotlin.jvm.internal.s.h(name4);
            if (length7 > 23) {
                p013kotlin.jvm.internal.s.j(name4.substring(name4.length() - 23, name4.length()), "substring(...)");
            }
        } else {
            String simpleName4 = Y2.class.getSimpleName();
            int length8 = simpleName4.length();
            p013kotlin.jvm.internal.s.h(simpleName4);
            if (length8 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName4.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(this.f38100f);
        if (Y2.class.isAnonymousClass()) {
            String name5 = Y2.class.getName();
            int length9 = name5.length();
            p013kotlin.jvm.internal.s.h(name5);
            if (length9 > 23) {
                p013kotlin.jvm.internal.s.j(name5.substring(name5.length() - 23, name5.length()), "substring(...)");
            }
        } else {
            String simpleName5 = Y2.class.getSimpleName();
            int length10 = simpleName5.length();
            p013kotlin.jvm.internal.s.h(simpleName5);
            if (length10 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName5.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(this.f38096b);
    }
}
