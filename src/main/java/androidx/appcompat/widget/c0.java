package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends ToggleButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f2633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f2634b;

    public c0(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f2633a;
        if (dVar != null) {
            dVar.b();
        }
        a0 a0Var = this.f2634b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f2633a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f2633a;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f2633a;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.f2633a;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f2633a;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f2633a;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public c0(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public c0(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        w0.a(this, getContext());
        d dVar = new d(this);
        this.f2633a = dVar;
        dVar.e(attributeSet, i11);
        a0 a0Var = new a0(this);
        this.f2634b = a0Var;
        a0Var.m(attributeSet, i11);
    }
}
