package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class u {
    private ColorStateList A;
    private Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final TimeInterpolator f42942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final TimeInterpolator f42943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private final TimeInterpolator f42944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f42945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private final TextInputLayout f42946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f42947i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f42948j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private FrameLayout f42949k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animator f42950l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f42951m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42952n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f42953o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f42954p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f42955q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f42956r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f42957s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f42958t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f42959u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ColorStateList f42960v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CharSequence f42961w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f42962x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TextView f42963y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f42964z;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f42965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f42966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f42967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f42968d;

        a(int i11, TextView textView, int i12, TextView textView2) {
            this.f42965a = i11;
            this.f42966b = textView;
            this.f42967c = i12;
            this.f42968d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u.this.f42952n = this.f42965a;
            u.this.f42950l = null;
            TextView textView = this.f42966b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f42967c == 1 && u.this.f42956r != null) {
                    u.this.f42956r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f42968d;
            if (textView2 != null) {
                textView2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                this.f42968d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f42968d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f42968d.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = u.this.f42946h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public u(@NonNull TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f42945g = context;
        this.f42946h = textInputLayout;
        this.f42951m = context.getResources().getDimensionPixelSize(zs.e.f128646o);
        this.f42939a = nt.i.f(context, zs.c.f128564e0, EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE);
        this.f42940b = nt.i.f(context, zs.c.f128556a0, 167);
        this.f42941c = nt.i.f(context, zs.c.f128564e0, 167);
        this.f42942d = nt.i.g(context, zs.c.f128568g0, at.b.f14975d);
        int i11 = zs.c.f128568g0;
        TimeInterpolator timeInterpolator = at.b.f14972a;
        this.f42943e = nt.i.g(context, i11, timeInterpolator);
        this.f42944f = nt.i.g(context, zs.c.f128572i0, timeInterpolator);
    }

    private void D(int i11, int i12) {
        TextView textViewM;
        TextView textViewM2;
        if (i11 == i12) {
            return;
        }
        if (i12 != 0 && (textViewM2 = m(i12)) != null) {
            textViewM2.setVisibility(0);
            textViewM2.setAlpha(1.0f);
        }
        if (i11 != 0 && (textViewM = m(i11)) != null) {
            textViewM.setVisibility(4);
            if (i11 == 1) {
                textViewM.setText((CharSequence) null);
            }
        }
        this.f42952n = i12;
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(@NonNull ViewGroup viewGroup, int i11) {
        if (i11 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, @NonNull CharSequence charSequence) {
        if (ViewCompat.U(this.f42946h) && this.f42946h.isEnabled()) {
            return (this.f42953o == this.f42952n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    private void S(int i11, int i12, boolean z11) {
        u uVar;
        if (i11 == i12) {
            return;
        }
        if (z11) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f42950l = animatorSet;
            ArrayList arrayList = new ArrayList();
            uVar = this;
            uVar.i(arrayList, this.f42962x, this.f42963y, 2, i11, i12);
            uVar.i(arrayList, uVar.f42955q, uVar.f42956r, 1, i11, i12);
            at.c.a(animatorSet, arrayList);
            animatorSet.addListener(uVar.new a(i12, m(i11), i11, m(i12)));
            animatorSet.start();
        } else {
            uVar = this;
            D(i11, i12);
        }
        uVar.f42946h.o0();
        uVar.f42946h.t0(z11);
        uVar.f42946h.z0();
    }

    private boolean g() {
        return (this.f42947i == null || this.f42946h.getEditText() == null) ? false : true;
    }

    private void i(@NonNull List<Animator> list, boolean z11, TextView textView, int i11, int i12, int i13) {
        if (textView == null || !z11) {
            return;
        }
        if (i11 == i13 || i11 == i12) {
            ObjectAnimator objectAnimatorJ = j(textView, i13 == i11);
            if (i11 == i13 && i12 != 0) {
                objectAnimatorJ.setStartDelay(this.f42941c);
            }
            list.add(objectAnimatorJ);
            if (i13 != i11 || i12 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorK = k(textView);
            objectAnimatorK.setStartDelay(this.f42941c);
            list.add(objectAnimatorK);
        }
    }

    private ObjectAnimator j(TextView textView, boolean z11) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z11 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat.setDuration(z11 ? this.f42940b : this.f42941c);
        objectAnimatorOfFloat.setInterpolator(z11 ? this.f42943e : this.f42944f);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f42951m, BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat.setDuration(this.f42939a);
        objectAnimatorOfFloat.setInterpolator(this.f42942d);
        return objectAnimatorOfFloat;
    }

    private TextView m(int i11) {
        if (i11 == 1) {
            return this.f42956r;
        }
        if (i11 != 2) {
            return null;
        }
        return this.f42963y;
    }

    private int v(boolean z11, int i11, int i12) {
        return z11 ? this.f42945g.getResources().getDimensionPixelSize(i11) : i12;
    }

    private boolean y(int i11) {
        return (i11 != 1 || this.f42956r == null || TextUtils.isEmpty(this.f42954p)) ? false : true;
    }

    boolean A() {
        return this.f42955q;
    }

    boolean B() {
        return this.f42962x;
    }

    void C(TextView textView, int i11) {
        FrameLayout frameLayout;
        if (this.f42947i == null) {
            return;
        }
        if (!z(i11) || (frameLayout = this.f42949k) == null) {
            this.f42947i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i12 = this.f42948j - 1;
        this.f42948j = i12;
        O(this.f42947i, i12);
    }

    void E(int i11) {
        this.f42958t = i11;
        TextView textView = this.f42956r;
        if (textView != null) {
            ViewCompat.r0(textView, i11);
        }
    }

    void F(CharSequence charSequence) {
        this.f42957s = charSequence;
        TextView textView = this.f42956r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void G(boolean z11) {
        if (this.f42955q == z11) {
            return;
        }
        h();
        if (z11) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f42945g);
            this.f42956r = appCompatTextView;
            appCompatTextView.setId(zs.g.f128729w0);
            this.f42956r.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f42956r.setTypeface(typeface);
            }
            H(this.f42959u);
            I(this.f42960v);
            F(this.f42957s);
            E(this.f42958t);
            this.f42956r.setVisibility(4);
            e(this.f42956r, 0);
        } else {
            w();
            C(this.f42956r, 0);
            this.f42956r = null;
            this.f42946h.o0();
            this.f42946h.z0();
        }
        this.f42955q = z11;
    }

    void H(int i11) {
        this.f42959u = i11;
        TextView textView = this.f42956r;
        if (textView != null) {
            this.f42946h.b0(textView, i11);
        }
    }

    void I(ColorStateList colorStateList) {
        this.f42960v = colorStateList;
        TextView textView = this.f42956r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(int i11) {
        this.f42964z = i11;
        TextView textView = this.f42963y;
        if (textView != null) {
            androidx.core.widget.m.r(textView, i11);
        }
    }

    void K(boolean z11) {
        if (this.f42962x == z11) {
            return;
        }
        h();
        if (z11) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f42945g);
            this.f42963y = appCompatTextView;
            appCompatTextView.setId(zs.g.f128731x0);
            this.f42963y.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f42963y.setTypeface(typeface);
            }
            this.f42963y.setVisibility(4);
            ViewCompat.r0(this.f42963y, 1);
            J(this.f42964z);
            L(this.A);
            e(this.f42963y, 1);
            this.f42963y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.f42963y, 1);
            this.f42963y = null;
            this.f42946h.o0();
            this.f42946h.z0();
        }
        this.f42962x = z11;
    }

    void L(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f42963y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void N(Typeface typeface) {
        if (typeface != this.B) {
            this.B = typeface;
            M(this.f42956r, typeface);
            M(this.f42963y, typeface);
        }
    }

    void Q(CharSequence charSequence) {
        h();
        this.f42954p = charSequence;
        this.f42956r.setText(charSequence);
        int i11 = this.f42952n;
        if (i11 != 1) {
            this.f42953o = 1;
        }
        S(i11, this.f42953o, P(this.f42956r, charSequence));
    }

    void R(CharSequence charSequence) {
        h();
        this.f42961w = charSequence;
        this.f42963y.setText(charSequence);
        int i11 = this.f42952n;
        if (i11 != 2) {
            this.f42953o = 2;
        }
        S(i11, this.f42953o, P(this.f42963y, charSequence));
    }

    void e(TextView textView, int i11) {
        if (this.f42947i == null && this.f42949k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f42945g);
            this.f42947i = linearLayout;
            linearLayout.setOrientation(0);
            this.f42946h.addView(this.f42947i, -1, -2);
            this.f42949k = new FrameLayout(this.f42945g);
            this.f42947i.addView(this.f42949k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f42946h.getEditText() != null) {
                f();
            }
        }
        if (z(i11)) {
            this.f42949k.setVisibility(0);
            this.f42949k.addView(textView);
        } else {
            this.f42947i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f42947i.setVisibility(0);
        this.f42948j++;
    }

    void f() {
        if (g()) {
            EditText editText = this.f42946h.getEditText();
            boolean zJ = pt.c.j(this.f42945g);
            ViewCompat.F0(this.f42947i, v(zJ, zs.e.X, ViewCompat.F(editText)), v(zJ, zs.e.Y, this.f42945g.getResources().getDimensionPixelSize(zs.e.W)), v(zJ, zs.e.X, ViewCompat.E(editText)), 0);
        }
    }

    void h() {
        Animator animator = this.f42950l;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return y(this.f42953o);
    }

    int n() {
        return this.f42958t;
    }

    CharSequence o() {
        return this.f42957s;
    }

    CharSequence p() {
        return this.f42954p;
    }

    int q() {
        TextView textView = this.f42956r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList r() {
        TextView textView = this.f42956r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence s() {
        return this.f42961w;
    }

    View t() {
        return this.f42963y;
    }

    int u() {
        TextView textView = this.f42963y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void w() {
        this.f42954p = null;
        h();
        if (this.f42952n == 1) {
            if (!this.f42962x || TextUtils.isEmpty(this.f42961w)) {
                this.f42953o = 0;
            } else {
                this.f42953o = 2;
            }
        }
        S(this.f42952n, this.f42953o, P(this.f42956r, ""));
    }

    void x() {
        h();
        int i11 = this.f42952n;
        if (i11 == 2) {
            this.f42953o = 0;
        }
        S(i11, this.f42953o, P(this.f42963y, ""));
    }

    boolean z(int i11) {
        return i11 == 0 || i11 == 1;
    }
}
