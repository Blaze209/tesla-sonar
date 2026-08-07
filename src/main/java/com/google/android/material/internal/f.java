package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class f extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f42333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Drawable f42334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f42335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f42336d;

    public f(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        this.f42333a = drawable.getConstantState().newDrawable().mutate();
        Drawable drawableMutate = drawable2.getConstantState().newDrawable().mutate();
        this.f42334b = drawableMutate;
        drawableMutate.setAlpha(0);
        this.f42335c = new float[2];
    }

    public void a(float f11) {
        if (this.f42336d != f11) {
            this.f42336d = f11;
            h.a(f11, this.f42335c);
            this.f42333a.setAlpha((int) (this.f42335c[0] * 255.0f));
            this.f42334b.setAlpha((int) (this.f42335c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f42333a.draw(canvas);
        this.f42334b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f42333a.getIntrinsicHeight(), this.f42334b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f42333a.getIntrinsicWidth(), this.f42334b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f42333a.getMinimumHeight(), this.f42334b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f42333a.getMinimumWidth(), this.f42334b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f42333a.isStateful() || this.f42334b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (this.f42336d <= 0.5f) {
            this.f42333a.setAlpha(i11);
            this.f42334b.setAlpha(0);
        } else {
            this.f42333a.setAlpha(0);
            this.f42334b.setAlpha(i11);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i11, int i12, int i13, int i14) {
        super.setBounds(i11, i12, i13, i14);
        this.f42333a.setBounds(i11, i12, i13, i14);
        this.f42334b.setBounds(i11, i12, i13, i14);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f42333a.setColorFilter(colorFilter);
        this.f42334b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f42333a.setState(iArr) || this.f42334b.setState(iArr);
    }
}
