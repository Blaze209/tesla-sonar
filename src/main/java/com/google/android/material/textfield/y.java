package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.b1;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.d0;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"ViewConstructor"})
class y extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextInputLayout f42975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f42976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CharSequence f42977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CheckableImageButton f42978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f42979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PorterDuff.Mode f42980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f42981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private ImageView.ScaleType f42982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View.OnLongClickListener f42983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f42984j;

    y(TextInputLayout textInputLayout, b1 b1Var) {
        super(textInputLayout.getContext());
        this.f42975a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(zs.i.f128745g, (ViewGroup) this, false);
        this.f42978d = checkableImageButton;
        t.e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f42976b = appCompatTextView;
        j(b1Var);
        i(b1Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void C() {
        int i11 = (this.f42977c == null || this.f42984j) ? 8 : 0;
        setVisibility((this.f42978d.getVisibility() == 0 || i11 == 0) ? 0 : 8);
        this.f42976b.setVisibility(i11);
        this.f42975a.n0();
    }

    private void i(b1 b1Var) {
        this.f42976b.setVisibility(8);
        this.f42976b.setId(zs.g.f128735z0);
        this.f42976b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ViewCompat.r0(this.f42976b, 1);
        o(b1Var.n(zs.m.Y9, 0));
        if (b1Var.s(zs.m.Z9)) {
            p(b1Var.c(zs.m.Z9));
        }
        n(b1Var.p(zs.m.X9));
    }

    private void j(b1 b1Var) {
        if (pt.c.j(getContext())) {
            androidx.core.view.n.c((ViewGroup.MarginLayoutParams) this.f42978d.getLayoutParams(), 0);
        }
        u(null);
        v(null);
        if (b1Var.s(zs.m.f128889fa)) {
            this.f42979e = pt.c.b(getContext(), b1Var, zs.m.f128889fa);
        }
        if (b1Var.s(zs.m.f128901ga)) {
            this.f42980f = d0.n(b1Var.k(zs.m.f128901ga, -1), null);
        }
        if (b1Var.s(zs.m.f128853ca)) {
            s(b1Var.g(zs.m.f128853ca));
            if (b1Var.s(zs.m.f128841ba)) {
                r(b1Var.p(zs.m.f128841ba));
            }
            q(b1Var.a(zs.m.f128829aa, true));
        }
        t(b1Var.f(zs.m.f128865da, getResources().getDimensionPixelSize(zs.e.f128661v0)));
        if (b1Var.s(zs.m.f128877ea)) {
            w(t.b(b1Var.k(zs.m.f128877ea, -1)));
        }
    }

    void A(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.f42976b.getVisibility() != 0) {
            accessibilityNodeInfoCompat.g1(this.f42978d);
        } else {
            accessibilityNodeInfoCompat.J0(this.f42976b);
            accessibilityNodeInfoCompat.g1(this.f42976b);
        }
    }

    void B() {
        EditText editText = this.f42975a.f42810d;
        if (editText == null) {
            return;
        }
        ViewCompat.F0(this.f42976b, k() ? 0 : ViewCompat.F(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(zs.e.Z), editText.getCompoundPaddingBottom());
    }

    CharSequence a() {
        return this.f42977c;
    }

    ColorStateList b() {
        return this.f42976b.getTextColors();
    }

    int c() {
        return ViewCompat.F(this) + ViewCompat.F(this.f42976b) + (k() ? this.f42978d.getMeasuredWidth() + androidx.core.view.n.a((ViewGroup.MarginLayoutParams) this.f42978d.getLayoutParams()) : 0);
    }

    @NonNull
    TextView d() {
        return this.f42976b;
    }

    CharSequence e() {
        return this.f42978d.getContentDescription();
    }

    Drawable f() {
        return this.f42978d.getDrawable();
    }

    int g() {
        return this.f42981g;
    }

    @NonNull
    ImageView.ScaleType h() {
        return this.f42982h;
    }

    boolean k() {
        return this.f42978d.getVisibility() == 0;
    }

    void l(boolean z11) {
        this.f42984j = z11;
        C();
    }

    void m() {
        t.d(this.f42975a, this.f42978d, this.f42979e);
    }

    void n(CharSequence charSequence) {
        this.f42977c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f42976b.setText(charSequence);
        C();
    }

    void o(int i11) {
        androidx.core.widget.m.r(this.f42976b, i11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        B();
    }

    void p(@NonNull ColorStateList colorStateList) {
        this.f42976b.setTextColor(colorStateList);
    }

    void q(boolean z11) {
        this.f42978d.setCheckable(z11);
    }

    void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f42978d.setContentDescription(charSequence);
        }
    }

    void s(Drawable drawable) {
        this.f42978d.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f42975a, this.f42978d, this.f42979e, this.f42980f);
            z(true);
            m();
        } else {
            z(false);
            u(null);
            v(null);
            r(null);
        }
    }

    void t(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i11 != this.f42981g) {
            this.f42981g = i11;
            t.g(this.f42978d, i11);
        }
    }

    void u(View.OnClickListener onClickListener) {
        t.h(this.f42978d, onClickListener, this.f42983i);
    }

    void v(View.OnLongClickListener onLongClickListener) {
        this.f42983i = onLongClickListener;
        t.i(this.f42978d, onLongClickListener);
    }

    void w(@NonNull ImageView.ScaleType scaleType) {
        this.f42982h = scaleType;
        t.j(this.f42978d, scaleType);
    }

    void x(ColorStateList colorStateList) {
        if (this.f42979e != colorStateList) {
            this.f42979e = colorStateList;
            t.a(this.f42975a, this.f42978d, colorStateList, this.f42980f);
        }
    }

    void y(PorterDuff.Mode mode) {
        if (this.f42980f != mode) {
            this.f42980f = mode;
            t.a(this.f42975a, this.f42978d, this.f42979e, mode);
        }
    }

    void z(boolean z11) {
        if (k() != z11) {
            this.f42978d.setVisibility(z11 ? 0 : 8);
            B();
            C();
        }
    }
}
