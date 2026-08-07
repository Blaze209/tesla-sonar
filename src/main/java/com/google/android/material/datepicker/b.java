package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes5.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Rect f41932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f41933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ColorStateList f41934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ColorStateList f41935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f41936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final st.k f41937f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i11, st.k kVar, @NonNull Rect rect) {
        u5.h.d(rect.left);
        u5.h.d(rect.top);
        u5.h.d(rect.right);
        u5.h.d(rect.bottom);
        this.f41932a = rect;
        this.f41933b = colorStateList2;
        this.f41934c = colorStateList;
        this.f41935d = colorStateList3;
        this.f41936e = i11;
        this.f41937f = kVar;
    }

    @NonNull
    static b a(@NonNull Context context, int i11) {
        u5.h.b(i11 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, zs.m.M4);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(zs.m.N4, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(zs.m.P4, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(zs.m.O4, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(zs.m.Q4, 0));
        ColorStateList colorStateListA = pt.c.a(context, typedArrayObtainStyledAttributes, zs.m.R4);
        ColorStateList colorStateListA2 = pt.c.a(context, typedArrayObtainStyledAttributes, zs.m.W4);
        ColorStateList colorStateListA3 = pt.c.a(context, typedArrayObtainStyledAttributes, zs.m.U4);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(zs.m.V4, 0);
        st.k kVarM = st.k.b(context, typedArrayObtainStyledAttributes.getResourceId(zs.m.S4, 0), typedArrayObtainStyledAttributes.getResourceId(zs.m.T4, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, kVarM, rect);
    }

    int b() {
        return this.f41932a.bottom;
    }

    int c() {
        return this.f41932a.top;
    }

    void d(@NonNull TextView textView) {
        e(textView, null, null);
    }

    void e(@NonNull TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        st.g gVar = new st.g();
        st.g gVar2 = new st.g();
        gVar.setShapeAppearanceModel(this.f41937f);
        gVar2.setShapeAppearanceModel(this.f41937f);
        if (colorStateList == null) {
            colorStateList = this.f41934c;
        }
        gVar.b0(colorStateList);
        gVar.k0(this.f41936e, this.f41935d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f41933b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f41933b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f41932a;
        ViewCompat.t0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
