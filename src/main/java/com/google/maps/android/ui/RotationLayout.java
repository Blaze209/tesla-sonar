package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
public class RotationLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45023a;

    public RotationLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i11 = this.f45023a;
        if (i11 == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (i11 == 1) {
            canvas.translate(getWidth(), BitmapDescriptorFactory.HUE_RED);
            canvas.rotate(90.0f, getWidth() / 2, BitmapDescriptorFactory.HUE_RED);
            canvas.translate(getHeight() / 2, getWidth() / 2);
        } else if (i11 == 2) {
            canvas.rotate(180.0f, getWidth() / 2, getHeight() / 2);
        } else {
            canvas.translate(BitmapDescriptorFactory.HUE_RED, getHeight());
            canvas.rotate(270.0f, getWidth() / 2, BitmapDescriptorFactory.HUE_RED);
            canvas.translate(getHeight() / 2, (-getWidth()) / 2);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13 = this.f45023a;
        if (i13 != 1 && i13 != 3) {
            super.onMeasure(i11, i12);
        } else {
            super.onMeasure(i11, i12);
            setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void setViewRotation(int i11) {
        this.f45023a = ((i11 + 360) % 360) / 90;
    }

    public RotationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RotationLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
