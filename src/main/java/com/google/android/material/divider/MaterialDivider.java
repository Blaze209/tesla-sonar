package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.content.b;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.a0;
import st.g;
import wt.a;
import zs.c;
import zs.e;
import zs.l;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f42081f = l.H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final g f42082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42086e;

    public MaterialDivider(@NonNull Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.f42084c;
    }

    public int getDividerInsetEnd() {
        return this.f42086e;
    }

    public int getDividerInsetStart() {
        return this.f42085d;
    }

    public int getDividerThickness() {
        return this.f42083b;
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        int width;
        int i11;
        super.onDraw(canvas);
        boolean z11 = ViewCompat.A(this) == 1;
        int i12 = z11 ? this.f42086e : this.f42085d;
        if (z11) {
            width = getWidth();
            i11 = this.f42085d;
        } else {
            width = getWidth();
            i11 = this.f42086e;
        }
        this.f42082a.setBounds(i12, 0, width - i11, getBottom() - getTop());
        this.f42082a.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i12);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i13 = this.f42083b;
            if (i13 > 0 && measuredHeight != i13) {
                measuredHeight = i13;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i11) {
        if (this.f42084c != i11) {
            this.f42084c = i11;
            this.f42082a.b0(ColorStateList.valueOf(i11));
            invalidate();
        }
    }

    public void setDividerColorResource(int i11) {
        setDividerColor(b.getColor(getContext(), i11));
    }

    public void setDividerInsetEnd(int i11) {
        this.f42086e = i11;
    }

    public void setDividerInsetEndResource(int i11) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i11));
    }

    public void setDividerInsetStart(int i11) {
        this.f42085d = i11;
    }

    public void setDividerInsetStartResource(int i11) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i11));
    }

    public void setDividerThickness(int i11) {
        if (this.f42083b != i11) {
            this.f42083b = i11;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i11) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i11));
    }

    public MaterialDivider(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.Q);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(@NonNull Context context, AttributeSet attributeSet, int i11) {
        int i12 = f42081f;
        super(a.c(context, attributeSet, i11, i12), attributeSet, i11);
        Context context2 = getContext();
        this.f42082a = new g();
        TypedArray typedArrayI = a0.i(context2, attributeSet, m.f129064u5, i11, i12, new int[0]);
        this.f42083b = typedArrayI.getDimensionPixelSize(m.f129111y5, getResources().getDimensionPixelSize(e.O));
        this.f42085d = typedArrayI.getDimensionPixelOffset(m.f129100x5, 0);
        this.f42086e = typedArrayI.getDimensionPixelOffset(m.f129088w5, 0);
        setDividerColor(pt.c.a(context2, typedArrayI, m.f129076v5).getDefaultColor());
        typedArrayI.recycle();
    }
}
