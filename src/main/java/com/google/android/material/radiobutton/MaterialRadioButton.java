package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.p;
import com.google.android.material.internal.a0;
import ht.a;
import zs.c;
import zs.l;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialRadioButton extends p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f42577f = l.C;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[][] f42578g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f42579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f42580e;

    public MaterialRadioButton(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f42579d == null) {
            int iD = a.d(this, c.f128577l);
            int iD2 = a.d(this, c.f128587q);
            int iD3 = a.d(this, c.f128599w);
            int[][] iArr = f42578g;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = a.j(iD3, iD, 1.0f);
            iArr2[1] = a.j(iD3, iD2, 0.54f);
            iArr2[2] = a.j(iD3, iD2, 0.38f);
            iArr2[3] = a.j(iD3, iD2, 0.38f);
            this.f42579d = new ColorStateList(iArr, iArr2);
        }
        return this.f42579d;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f42580e && androidx.core.widget.c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z11) {
        this.f42580e = z11;
        if (z11) {
            androidx.core.widget.c.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.c.d(this, null);
        }
    }

    public MaterialRadioButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f128582n0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(@NonNull Context context, AttributeSet attributeSet, int i11) {
        int i12 = f42577f;
        super(wt.a.c(context, attributeSet, i11, i12), attributeSet, i11);
        Context context2 = getContext();
        TypedArray typedArrayI = a0.i(context2, attributeSet, m.f129122z5, i11, i12, new int[0]);
        if (typedArrayI.hasValue(m.A5)) {
            androidx.core.widget.c.d(this, pt.c.a(context2, typedArrayI, m.A5));
        }
        this.f42580e = typedArrayI.getBoolean(m.B5, false);
        typedArrayI.recycle();
    }
}
