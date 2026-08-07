package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CompoundButton f2688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f2689b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f2690c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2691d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2692e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2693f;

    g(@NonNull CompoundButton compoundButton) {
        this.f2688a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f2688a);
        if (drawableA != null) {
            if (this.f2691d || this.f2692e) {
                Drawable drawableMutate = l5.a.r(drawableA).mutate();
                if (this.f2691d) {
                    l5.a.o(drawableMutate, this.f2689b);
                }
                if (this.f2692e) {
                    l5.a.p(drawableMutate, this.f2690c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f2688a.getDrawableState());
                }
                this.f2688a.setButtonDrawable(drawableMutate);
            }
        }
    }

    int b(int i11) {
        return i11;
    }

    ColorStateList c() {
        return this.f2689b;
    }

    PorterDuff.Mode d() {
        return this.f2690c;
    }

    void e(AttributeSet attributeSet, int i11) {
        int iN;
        int iN2;
        b1 b1VarV = b1.v(this.f2688a.getContext(), attributeSet, i.j.R0, i11, 0);
        CompoundButton compoundButton = this.f2688a;
        ViewCompat.n0(compoundButton, compoundButton.getContext(), i.j.R0, attributeSet, b1VarV.r(), i11, 0);
        try {
            if (b1VarV.s(i.j.T0) && (iN2 = b1VarV.n(i.j.T0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f2688a;
                    compoundButton2.setButtonDrawable(j.a.b(compoundButton2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (b1VarV.s(i.j.S0)) {
                        CompoundButton compoundButton3 = this.f2688a;
                        compoundButton3.setButtonDrawable(j.a.b(compoundButton3.getContext(), iN));
                    }
                }
            } else if (b1VarV.s(i.j.S0) && (iN = b1VarV.n(i.j.S0, 0)) != 0) {
                CompoundButton compoundButton4 = this.f2688a;
                compoundButton4.setButtonDrawable(j.a.b(compoundButton4.getContext(), iN));
            }
            if (b1VarV.s(i.j.U0)) {
                androidx.core.widget.c.d(this.f2688a, b1VarV.c(i.j.U0));
            }
            if (b1VarV.s(i.j.V0)) {
                androidx.core.widget.c.e(this.f2688a, j0.d(b1VarV.k(i.j.V0, -1), null));
            }
        } finally {
            b1VarV.w();
        }
    }

    void f() {
        if (this.f2693f) {
            this.f2693f = false;
        } else {
            this.f2693f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) {
        this.f2689b = colorStateList;
        this.f2691d = true;
        a();
    }

    void h(PorterDuff.Mode mode) {
        this.f2690c = mode;
        this.f2692e = true;
        a();
    }
}
