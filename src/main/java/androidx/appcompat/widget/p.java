package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* JADX INFO: loaded from: classes.dex */
public class p extends RadioButton implements androidx.core.widget.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f2788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f2789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f2790c;

    public p(Context context) {
        this(context, null);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f2789b;
        if (dVar != null) {
            dVar.b();
        }
        a0 a0Var = this.f2790c;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        g gVar = this.f2788a;
        return gVar != null ? gVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f2789b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f2789b;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.o
    public ColorStateList getSupportButtonTintList() {
        g gVar = this.f2788a;
        if (gVar != null) {
            return gVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        g gVar = this.f2788a;
        if (gVar != null) {
            return gVar.d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f2789b;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.f2789b;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        g gVar = this.f2788a;
        if (gVar != null) {
            gVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f2789b;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f2789b;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // androidx.core.widget.o
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        g gVar = this.f2788a;
        if (gVar != null) {
            gVar.g(colorStateList);
        }
    }

    @Override // androidx.core.widget.o
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        g gVar = this.f2788a;
        if (gVar != null) {
            gVar.h(mode);
        }
    }

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.J);
    }

    public p(Context context, AttributeSet attributeSet, int i11) {
        super(y0.b(context), attributeSet, i11);
        w0.a(this, getContext());
        g gVar = new g(this);
        this.f2788a = gVar;
        gVar.e(attributeSet, i11);
        d dVar = new d(this);
        this.f2789b = dVar;
        dVar.e(attributeSet, i11);
        a0 a0Var = new a0(this);
        this.f2790c = a0Var;
        a0Var.m(attributeSet, i11);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i11) {
        setButtonDrawable(j.a.b(getContext(), i11));
    }
}
