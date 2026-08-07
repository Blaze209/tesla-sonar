package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ImageView f2732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private z0 f2733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private z0 f2734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z0 f2735d;

    public l(@NonNull ImageView imageView) {
        this.f2732a = imageView;
    }

    private boolean a(@NonNull Drawable drawable) {
        if (this.f2735d == null) {
            this.f2735d = new z0();
        }
        z0 z0Var = this.f2735d;
        z0Var.a();
        ColorStateList colorStateListA = androidx.core.widget.i.a(this.f2732a);
        if (colorStateListA != null) {
            z0Var.f2910d = true;
            z0Var.f2907a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.i.b(this.f2732a);
        if (modeB != null) {
            z0Var.f2909c = true;
            z0Var.f2908b = modeB;
        }
        if (!z0Var.f2910d && !z0Var.f2909c) {
            return false;
        }
        h.i(drawable, z0Var, this.f2732a.getDrawableState());
        return true;
    }

    private boolean j() {
        return this.f2733b != null;
    }

    void b() {
        Drawable drawable = this.f2732a.getDrawable();
        if (drawable != null) {
            j0.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            z0 z0Var = this.f2734c;
            if (z0Var != null) {
                h.i(drawable, z0Var, this.f2732a.getDrawableState());
                return;
            }
            z0 z0Var2 = this.f2733b;
            if (z0Var2 != null) {
                h.i(drawable, z0Var2, this.f2732a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        z0 z0Var = this.f2734c;
        if (z0Var != null) {
            return z0Var.f2907a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        z0 z0Var = this.f2734c;
        if (z0Var != null) {
            return z0Var.f2908b;
        }
        return null;
    }

    boolean e() {
        return !(this.f2732a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i11) {
        int iN;
        b1 b1VarV = b1.v(this.f2732a.getContext(), attributeSet, i.j.R, i11, 0);
        ImageView imageView = this.f2732a;
        ViewCompat.n0(imageView, imageView.getContext(), i.j.R, attributeSet, b1VarV.r(), i11, 0);
        try {
            Drawable drawable = this.f2732a.getDrawable();
            if (drawable == null && (iN = b1VarV.n(i.j.S, -1)) != -1 && (drawable = j.a.b(this.f2732a.getContext(), iN)) != null) {
                this.f2732a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                j0.b(drawable);
            }
            if (b1VarV.s(i.j.T)) {
                androidx.core.widget.i.c(this.f2732a, b1VarV.c(i.j.T));
            }
            if (b1VarV.s(i.j.U)) {
                androidx.core.widget.i.d(this.f2732a, j0.d(b1VarV.k(i.j.U, -1), null));
            }
        } finally {
            b1VarV.w();
        }
    }

    public void g(int i11) {
        if (i11 != 0) {
            Drawable drawableB = j.a.b(this.f2732a.getContext(), i11);
            if (drawableB != null) {
                j0.b(drawableB);
            }
            this.f2732a.setImageDrawable(drawableB);
        } else {
            this.f2732a.setImageDrawable(null);
        }
        b();
    }

    void h(ColorStateList colorStateList) {
        if (this.f2734c == null) {
            this.f2734c = new z0();
        }
        z0 z0Var = this.f2734c;
        z0Var.f2907a = colorStateList;
        z0Var.f2910d = true;
        b();
    }

    void i(PorterDuff.Mode mode) {
        if (this.f2734c == null) {
            this.f2734c = new z0();
        }
        z0 z0Var = this.f2734c;
        z0Var.f2908b = mode;
        z0Var.f2909c = true;
        b();
    }
}
