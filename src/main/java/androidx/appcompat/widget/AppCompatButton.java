package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements androidx.core.widget.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f2470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f2471b;

    public AppCompatButton(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f2470a;
        if (dVar != null) {
            dVar.b();
        }
        a0 a0Var = this.f2471b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f7931k1) {
            return super.getAutoSizeMaxTextSize();
        }
        a0 a0Var = this.f2471b;
        if (a0Var != null) {
            return a0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.f7931k1) {
            return super.getAutoSizeMinTextSize();
        }
        a0 a0Var = this.f2471b;
        if (a0Var != null) {
            return a0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.f7931k1) {
            return super.getAutoSizeStepGranularity();
        }
        a0 a0Var = this.f2471b;
        if (a0Var != null) {
            return a0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.f7931k1) {
            return super.getAutoSizeTextAvailableSizes();
        }
        a0 a0Var = this.f2471b;
        return a0Var != null ? a0Var.h() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f7931k1) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        a0 a0Var = this.f2471b;
        if (a0Var != null) {
            return a0Var.i();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f2470a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f2470a;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2471b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2471b.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        a0 a0Var = this.f2471b;
        if (a0Var != null) {
            a0Var.o(z11, i11, i12, i13, i14);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        a0 a0Var = this.f2471b;
        if (a0Var == null || androidx.core.widget.b.f7931k1 || !a0Var.l()) {
            return;
        }
        this.f2471b.c();
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public void setAutoSizeTextTypeUniformWithConfiguration(int i11, int i12, int i13, int i14) {
        if (androidx.core.widget.b.f7931k1) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i11, i12, i13, i14);
            return;
        }
        a0 a0Var = this.f2471b;
        if (a0Var != null) {
            a0Var.t(i11, i12, i13, i14);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i11) {
        if (androidx.core.widget.b.f7931k1) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i11);
            return;
        }
        a0 a0Var = this.f2471b;
        if (a0Var != null) {
            a0Var.u(iArr, i11);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i11) {
        if (androidx.core.widget.b.f7931k1) {
            super.setAutoSizeTextTypeWithDefaults(i11);
            return;
        }
        a0 a0Var = this.f2471b;
        if (a0Var != null) {
            a0Var.v(i11);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f2470a;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.f2470a;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.m.t(this, callback));
    }

    public void setSupportAllCaps(boolean z11) {
        a0 a0Var = this.f2471b;
        if (a0Var != null) {
            a0Var.s(z11);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f2470a;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f2470a;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f2471b.w(colorStateList);
        this.f2471b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f2471b.x(mode);
        this.f2471b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        a0 a0Var = this.f2471b;
        if (a0Var != null) {
            a0Var.q(context, i11);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i11, float f11) {
        if (androidx.core.widget.b.f7931k1) {
            super.setTextSize(i11, f11);
            return;
        }
        a0 a0Var = this.f2471b;
        if (a0Var != null) {
            a0Var.A(i11, f11);
        }
    }

    public AppCompatButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f73741r);
    }

    public AppCompatButton(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(y0.b(context), attributeSet, i11);
        w0.a(this, getContext());
        d dVar = new d(this);
        this.f2470a = dVar;
        dVar.e(attributeSet, i11);
        a0 a0Var = new a0(this);
        this.f2471b = a0Var;
        a0Var.m(attributeSet, i11);
        a0Var.b();
    }
}
