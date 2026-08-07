package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes5.dex */
public class i extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42343d;

    public i(@NonNull Context context) {
        this(context, null);
    }

    private static int a(int i11, int i12, int i13) {
        if (i12 != Integer.MIN_VALUE) {
            return i12 != 1073741824 ? i13 : i11;
        }
        return Math.min(i13, i11);
    }

    private void d(@NonNull Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, zs.m.f128978n3, 0, 0);
        this.f42340a = typedArrayObtainStyledAttributes.getDimensionPixelSize(zs.m.f129002p3, 0);
        this.f42341b = typedArrayObtainStyledAttributes.getDimensionPixelSize(zs.m.f128990o3, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int b(@NonNull View view) {
        Object tag = view.getTag(zs.g.f128715p0);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean c() {
        return this.f42342c;
    }

    protected int getItemSpacing() {
        return this.f42341b;
    }

    protected int getLineSpacing() {
        return this.f42340a;
    }

    protected int getRowCount() {
        return this.f42343d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int iA;
        int iB;
        if (getChildCount() == 0) {
            this.f42343d = 0;
            return;
        }
        this.f42343d = 1;
        boolean z12 = ViewCompat.A(this) == 1;
        int paddingRight = z12 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z12 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i15 = (i13 - i11) - paddingLeft;
        int measuredWidth = paddingRight;
        int i16 = paddingTop;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(zs.g.f128715p0, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iB = androidx.core.view.n.b(marginLayoutParams);
                    iA = androidx.core.view.n.a(marginLayoutParams);
                } else {
                    iA = 0;
                    iB = 0;
                }
                int measuredWidth2 = measuredWidth + iB + childAt.getMeasuredWidth();
                if (!this.f42342c && measuredWidth2 > i15) {
                    i16 = this.f42340a + paddingTop;
                    this.f42343d++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(zs.g.f128715p0, Integer.valueOf(this.f42343d - 1));
                int i18 = measuredWidth + iB;
                int measuredWidth3 = childAt.getMeasuredWidth() + i18;
                int measuredHeight = childAt.getMeasuredHeight() + i16;
                if (z12) {
                    childAt.layout(i15 - measuredWidth3, i16, (i15 - measuredWidth) - iB, measuredHeight);
                } else {
                    childAt.layout(i18, i16, measuredWidth3, measuredHeight);
                }
                measuredWidth += iB + iA + childAt.getMeasuredWidth() + this.f42341b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i12);
        int i15 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i15 - getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i11, i12);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = marginLayoutParams.leftMargin;
                    i14 = marginLayoutParams.rightMargin;
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                int i19 = paddingLeft2;
                if (paddingLeft2 + i13 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    paddingLeft = i19;
                } else {
                    paddingLeft = getPaddingLeft();
                    i16 = this.f42340a + paddingTop;
                }
                int measuredWidth = paddingLeft + i13 + childAt.getMeasuredWidth();
                int measuredHeight = i16 + childAt.getMeasuredHeight();
                if (measuredWidth > i17) {
                    i17 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i13 + i14 + childAt.getMeasuredWidth() + this.f42341b;
                if (i18 == getChildCount() - 1) {
                    i17 += i14;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i17 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    protected void setItemSpacing(int i11) {
        this.f42341b = i11;
    }

    protected void setLineSpacing(int i11) {
        this.f42340a = i11;
    }

    public void setSingleLine(boolean z11) {
        this.f42342c = z11;
    }

    public i(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f42342c = false;
        d(context, attributeSet);
    }
}
