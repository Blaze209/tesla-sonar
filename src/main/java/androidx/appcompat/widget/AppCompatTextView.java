package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements androidx.core.widget.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f2474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f2475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z f2476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Future<s5.f> f2478e;

    public AppCompatTextView(@NonNull Context context) {
        this(context, null);
    }

    private void e() {
        Future<s5.f> future = this.f2478e;
        if (future != null) {
            try {
                this.f2478e = null;
                androidx.core.widget.m.q(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f2474a;
        if (dVar != null) {
            dVar.b();
        }
        a0 a0Var = this.f2475b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f7931k1) {
            return super.getAutoSizeMaxTextSize();
        }
        a0 a0Var = this.f2475b;
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
        a0 a0Var = this.f2475b;
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
        a0 a0Var = this.f2475b;
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
        a0 a0Var = this.f2475b;
        return a0Var != null ? a0Var.h() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f7931k1) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        a0 a0Var = this.f2475b;
        if (a0Var != null) {
            return a0Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.m.e(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.m.f(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f2474a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f2474a;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2475b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2475b.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        e();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        z zVar;
        return (Build.VERSION.SDK_INT >= 28 || (zVar = this.f2476c) == null) ? super.getTextClassifier() : zVar.a();
    }

    @NonNull
    public s5.f.a getTextMetricsParamsCompat() {
        return androidx.core.widget.m.i(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2475b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return j.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        a0 a0Var = this.f2475b;
        if (a0Var != null) {
            a0Var.o(z11, i11, i12, i13, i14);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i11, int i12) {
        e();
        super.onMeasure(i11, i12);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        a0 a0Var = this.f2475b;
        if (a0Var == null || androidx.core.widget.b.f7931k1 || !a0Var.l()) {
            return;
        }
        this.f2475b.c();
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public void setAutoSizeTextTypeUniformWithConfiguration(int i11, int i12, int i13, int i14) {
        if (androidx.core.widget.b.f7931k1) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i11, i12, i13, i14);
            return;
        }
        a0 a0Var = this.f2475b;
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
        a0 a0Var = this.f2475b;
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
        a0 a0Var = this.f2475b;
        if (a0Var != null) {
            a0Var.v(i11);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f2474a;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.f2474a;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f2475b;
        if (a0Var != null) {
            a0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f2475b;
        if (a0Var != null) {
            a0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f2475b;
        if (a0Var != null) {
            a0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f2475b;
        if (a0Var != null) {
            a0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.m.t(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i11);
        } else {
            androidx.core.widget.m.n(this, i11);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i11);
        } else {
            androidx.core.widget.m.o(this, i11);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i11) {
        androidx.core.widget.m.p(this, i11);
    }

    public void setPrecomputedText(@NonNull s5.f fVar) {
        androidx.core.widget.m.q(this, fVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f2474a;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f2474a;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f2475b.w(colorStateList);
        this.f2475b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f2475b.x(mode);
        this.f2475b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        a0 a0Var = this.f2475b;
        if (a0Var != null) {
            a0Var.q(context, i11);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.f2476c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            zVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<s5.f> future) {
        this.f2478e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull s5.f.a aVar) {
        androidx.core.widget.m.s(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i11, float f11) {
        if (androidx.core.widget.b.f7931k1) {
            super.setTextSize(i11, f11);
            return;
        }
        a0 a0Var = this.f2475b;
        if (a0Var != null) {
            a0Var.A(i11, f11);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i11) {
        if (this.f2477d) {
            return;
        }
        Typeface typefaceA = (typeface == null || i11 <= 0) ? null : k5.h.a(getContext(), typeface, i11);
        this.f2477d = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i11);
        } finally {
            this.f2477d = false;
        }
    }

    public AppCompatTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(y0.b(context), attributeSet, i11);
        this.f2477d = false;
        w0.a(this, getContext());
        d dVar = new d(this);
        this.f2474a = dVar;
        dVar.e(attributeSet, i11);
        a0 a0Var = new a0(this);
        this.f2475b = a0Var;
        a0Var.m(attributeSet, i11);
        a0Var.b();
        this.f2476c = new z(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i11 != 0 ? j.a.b(context, i11) : null, i12 != 0 ? j.a.b(context, i12) : null, i13 != 0 ? j.a.b(context, i13) : null, i14 != 0 ? j.a.b(context, i14) : null);
        a0 a0Var = this.f2475b;
        if (a0Var != null) {
            a0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i11 != 0 ? j.a.b(context, i11) : null, i12 != 0 ? j.a.b(context, i12) : null, i13 != 0 ? j.a.b(context, i13) : null, i14 != 0 ? j.a.b(context, i14) : null);
        a0 a0Var = this.f2475b;
        if (a0Var != null) {
            a0Var.p();
        }
    }
}
