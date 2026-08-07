package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.b1;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import k5.d;
import l5.a;
import zs.c;
import zs.l;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialSwitch extends SwitchCompat {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final int f42385f0 = l.f128808q;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final int[] f42386g0 = {c.f128604y0};
    private Drawable P;
    private Drawable Q;
    private int R;
    private Drawable S;
    private Drawable T;
    private ColorStateList U;
    private ColorStateList V;

    @NonNull
    private PorterDuff.Mode W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private ColorStateList f42387a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private ColorStateList f42388b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NonNull
    private PorterDuff.Mode f42389c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int[] f42390d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int[] f42391e0;

    public MaterialSwitch(@NonNull Context context) {
        this(context, null);
    }

    private void m() {
        this.P = com.google.android.material.drawable.c.c(this.P, this.U, getThumbTintMode());
        this.Q = com.google.android.material.drawable.c.c(this.Q, this.V, this.W);
        p();
        Drawable drawable = this.P;
        Drawable drawable2 = this.Q;
        int i11 = this.R;
        super.setThumbDrawable(com.google.android.material.drawable.c.b(drawable, drawable2, i11, i11));
        refreshDrawableState();
    }

    private void n() {
        this.S = com.google.android.material.drawable.c.c(this.S, this.f42387a0, getTrackTintMode());
        this.T = com.google.android.material.drawable.c.c(this.T, this.f42388b0, this.f42389c0);
        p();
        Drawable layerDrawable = this.S;
        if (layerDrawable != null && this.T != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.S, this.T});
        } else if (layerDrawable == null) {
            layerDrawable = this.T;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    private static void o(Drawable drawable, ColorStateList colorStateList, @NonNull int[] iArr, @NonNull int[] iArr2, float f11) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        a.n(drawable, d.c(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f11));
    }

    private void p() {
        if (this.U == null && this.V == null && this.f42387a0 == null && this.f42388b0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.U;
        if (colorStateList != null) {
            o(this.P, colorStateList, this.f42390d0, this.f42391e0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.V;
        if (colorStateList2 != null) {
            o(this.Q, colorStateList2, this.f42390d0, this.f42391e0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f42387a0;
        if (colorStateList3 != null) {
            o(this.S, colorStateList3, this.f42390d0, this.f42391e0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f42388b0;
        if (colorStateList4 != null) {
            o(this.T, colorStateList4, this.f42390d0, this.f42391e0, thumbPosition);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.P;
    }

    public Drawable getThumbIconDrawable() {
        return this.Q;
    }

    public int getThumbIconSize() {
        return this.R;
    }

    public ColorStateList getThumbIconTintList() {
        return this.V;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.W;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.U;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.T;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.f42388b0;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f42389c0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.S;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.f42387a0;
    }

    @Override // android.view.View
    public void invalidate() {
        p();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        if (this.Q != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f42386g0);
        }
        this.f42390d0 = com.google.android.material.drawable.c.j(iArrOnCreateDrawableState);
        this.f42391e0 = com.google.android.material.drawable.c.f(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.P = drawable;
        m();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.Q = drawable;
        m();
    }

    public void setThumbIconResource(int i11) {
        setThumbIconDrawable(j.a.b(getContext(), i11));
    }

    public void setThumbIconSize(int i11) {
        if (this.R != i11) {
            this.R = i11;
            m();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.V = colorStateList;
        m();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.W = mode;
        m();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.U = colorStateList;
        m();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        m();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.T = drawable;
        n();
    }

    public void setTrackDecorationResource(int i11) {
        setTrackDecorationDrawable(j.a.b(getContext(), i11));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f42388b0 = colorStateList;
        n();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.f42389c0 = mode;
        n();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.S = drawable;
        n();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f42387a0 = colorStateList;
        n();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        n();
    }

    public MaterialSwitch(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.T);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialSwitch(@NonNull Context context, AttributeSet attributeSet, int i11) {
        int i12 = f42385f0;
        super(wt.a.c(context, attributeSet, i11, i12), attributeSet, i11);
        this.R = -1;
        Context context2 = getContext();
        this.P = super.getThumbDrawable();
        this.U = super.getThumbTintList();
        super.setThumbTintList(null);
        this.S = super.getTrackDrawable();
        this.f42387a0 = super.getTrackTintList();
        super.setTrackTintList(null);
        b1 b1VarJ = a0.j(context2, attributeSet, m.F5, i11, i12, new int[0]);
        this.Q = b1VarJ.g(m.G5);
        this.R = b1VarJ.f(m.H5, -1);
        this.V = b1VarJ.c(m.I5);
        int iK = b1VarJ.k(m.J5, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.W = d0.n(iK, mode);
        this.T = b1VarJ.g(m.K5);
        this.f42388b0 = b1VarJ.c(m.L5);
        this.f42389c0 = d0.n(b1VarJ.k(m.M5, -1), mode);
        b1VarJ.w();
        setEnforceSwitchWidth(false);
        m();
        n();
    }
}
