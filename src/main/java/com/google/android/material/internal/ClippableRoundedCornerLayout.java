package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Path f42245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f42246b;

    public ClippableRoundedCornerLayout(@NonNull Context context) {
        super(context);
    }

    public void a() {
        this.f42245a = null;
        this.f42246b = BitmapDescriptorFactory.HUE_RED;
        invalidate();
    }

    public void b(float f11, float f12, float f13, float f14, float f15) {
        d(new RectF(f11, f12, f13, f14), f15);
    }

    public void c(@NonNull Rect rect, float f11) {
        b(rect.left, rect.top, rect.right, rect.bottom, f11);
    }

    public void d(@NonNull RectF rectF, float f11) {
        if (this.f42245a == null) {
            this.f42245a = new Path();
        }
        this.f42246b = f11;
        this.f42245a.reset();
        this.f42245a.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        this.f42245a.close();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f42245a == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f42245a);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public void e(float f11) {
        b(getLeft(), getTop(), getRight(), getBottom(), f11);
    }

    public float getCornerRadius() {
        return this.f42246b;
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
