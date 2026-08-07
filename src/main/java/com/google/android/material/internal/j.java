package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.n0;

/* JADX INFO: loaded from: classes5.dex */
public class j extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f42344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f42345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f42346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f42348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f42349f;

    public j(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f42344a;
        if (drawable != null) {
            if (this.f42349f) {
                this.f42349f = false;
                Rect rect = this.f42345b;
                Rect rect2 = this.f42346c;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f42348e) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f42347d, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f11, float f12) {
        super.drawableHotspotChanged(f11, f12);
        Drawable drawable = this.f42344a;
        if (drawable != null) {
            drawable.setHotspot(f11, f12);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f42344a;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f42344a.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f42344a;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f42347d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f42344a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.n0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f42349f = z11 | this.f42349f;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f42349f = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f42344a;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f42344a);
            }
            this.f42344a = drawable;
            this.f42349f = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f42347d == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i11) {
        if (this.f42347d != i11) {
            if ((8388615 & i11) == 0) {
                i11 |= 8388611;
            }
            if ((i11 & 112) == 0) {
                i11 |= 48;
            }
            this.f42347d = i11;
            if (i11 == 119 && this.f42344a != null) {
                this.f42344a.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f42344a;
    }

    public j(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public j(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f42345b = new Rect();
        this.f42346c = new Rect();
        this.f42347d = 119;
        this.f42348e = true;
        this.f42349f = false;
        TypedArray typedArrayI = a0.i(context, attributeSet, zs.m.f129038s3, i11, 0, new int[0]);
        this.f42347d = typedArrayI.getInt(zs.m.f129062u3, this.f42347d);
        Drawable drawable = typedArrayI.getDrawable(zs.m.f129050t3);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f42348e = typedArrayI.getBoolean(zs.m.f129074v3, true);
        typedArrayI.recycle();
    }
}
