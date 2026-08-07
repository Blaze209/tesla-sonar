package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f2657a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z0 f2660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private z0 f2661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private z0 f2662f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2659c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f2658b = h.b();

    d(@NonNull View view) {
        this.f2657a = view;
    }

    private boolean a(@NonNull Drawable drawable) {
        if (this.f2662f == null) {
            this.f2662f = new z0();
        }
        z0 z0Var = this.f2662f;
        z0Var.a();
        ColorStateList colorStateListS = ViewCompat.s(this.f2657a);
        if (colorStateListS != null) {
            z0Var.f2910d = true;
            z0Var.f2907a = colorStateListS;
        }
        PorterDuff.Mode modeT = ViewCompat.t(this.f2657a);
        if (modeT != null) {
            z0Var.f2909c = true;
            z0Var.f2908b = modeT;
        }
        if (!z0Var.f2910d && !z0Var.f2909c) {
            return false;
        }
        h.i(drawable, z0Var, this.f2657a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f2660d != null;
    }

    void b() {
        Drawable background = this.f2657a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            z0 z0Var = this.f2661e;
            if (z0Var != null) {
                h.i(background, z0Var, this.f2657a.getDrawableState());
                return;
            }
            z0 z0Var2 = this.f2660d;
            if (z0Var2 != null) {
                h.i(background, z0Var2, this.f2657a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        z0 z0Var = this.f2661e;
        if (z0Var != null) {
            return z0Var.f2907a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        z0 z0Var = this.f2661e;
        if (z0Var != null) {
            return z0Var.f2908b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i11) {
        b1 b1VarV = b1.v(this.f2657a.getContext(), attributeSet, i.j.X3, i11, 0);
        View view = this.f2657a;
        ViewCompat.n0(view, view.getContext(), i.j.X3, attributeSet, b1VarV.r(), i11, 0);
        try {
            if (b1VarV.s(i.j.Y3)) {
                this.f2659c = b1VarV.n(i.j.Y3, -1);
                ColorStateList colorStateListF = this.f2658b.f(this.f2657a.getContext(), this.f2659c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (b1VarV.s(i.j.Z3)) {
                ViewCompat.u0(this.f2657a, b1VarV.c(i.j.Z3));
            }
            if (b1VarV.s(i.j.f73870a4)) {
                ViewCompat.v0(this.f2657a, j0.d(b1VarV.k(i.j.f73870a4, -1), null));
            }
        } finally {
            b1VarV.w();
        }
    }

    void f(Drawable drawable) {
        this.f2659c = -1;
        h(null);
        b();
    }

    void g(int i11) {
        this.f2659c = i11;
        h hVar = this.f2658b;
        h(hVar != null ? hVar.f(this.f2657a.getContext(), i11) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2660d == null) {
                this.f2660d = new z0();
            }
            z0 z0Var = this.f2660d;
            z0Var.f2907a = colorStateList;
            z0Var.f2910d = true;
        } else {
            this.f2660d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f2661e == null) {
            this.f2661e = new z0();
        }
        z0 z0Var = this.f2661e;
        z0Var.f2907a = colorStateList;
        z0Var.f2910d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f2661e == null) {
            this.f2661e = new z0();
        }
        z0 z0Var = this.f2661e;
        z0Var.f2908b = mode;
        z0Var.f2909c = true;
        b();
    }
}
