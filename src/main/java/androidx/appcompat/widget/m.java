package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class m extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f2736c = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f2737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f2738b;

    public m(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f2737a;
        if (dVar != null) {
            dVar.b();
        }
        a0 a0Var = this.f2738b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f2737a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f2737a;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return j.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f2737a;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.f2737a;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i11) {
        setDropDownBackgroundDrawable(j.a.b(getContext(), i11));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f2737a;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f2737a;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        a0 a0Var = this.f2738b;
        if (a0Var != null) {
            a0Var.q(context, i11);
        }
    }

    public m(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f73740q);
    }

    public m(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(y0.b(context), attributeSet, i11);
        w0.a(this, getContext());
        b1 b1VarV = b1.v(getContext(), attributeSet, f2736c, i11, 0);
        if (b1VarV.s(0)) {
            setDropDownBackgroundDrawable(b1VarV.g(0));
        }
        b1VarV.w();
        d dVar = new d(this);
        this.f2737a = dVar;
        dVar.e(attributeSet, i11);
        a0 a0Var = new a0(this);
        this.f2738b = a0Var;
        a0Var.m(attributeSet, i11);
        a0Var.b();
    }
}
