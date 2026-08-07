package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class i extends EditText implements androidx.core.view.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f2706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f2707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z f2708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.core.widget.n f2709d;

    public i(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.core.view.c0
    public androidx.core.view.d a(@NonNull androidx.core.view.d dVar) {
        return this.f2709d.a(this, dVar);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f2706a;
        if (dVar != null) {
            dVar.b();
        }
        a0 a0Var = this.f2707b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f2706a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f2706a;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        z zVar;
        return (Build.VERSION.SDK_INT >= 28 || (zVar = this.f2708c) == null) ? super.getTextClassifier() : zVar.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2707b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = j.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        String[] strArrD = ViewCompat.D(this);
        if (inputConnectionA == null || strArrD == null) {
            return inputConnectionA;
        }
        b6.c.d(editorInfo, strArrD);
        return b6.d.a(inputConnectionA, editorInfo, s.a(this));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (s.b(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i11) {
        if (s.c(this, i11)) {
            return true;
        }
        return super.onTextContextMenuItem(i11);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f2706a;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.f2706a;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.m.t(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f2706a;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f2706a;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        a0 a0Var = this.f2707b;
        if (a0Var != null) {
            a0Var.q(context, i11);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.f2708c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            zVar.b(textClassifier);
        }
    }

    public i(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.E);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public i(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(y0.b(context), attributeSet, i11);
        w0.a(this, getContext());
        d dVar = new d(this);
        this.f2706a = dVar;
        dVar.e(attributeSet, i11);
        a0 a0Var = new a0(this);
        this.f2707b = a0Var;
        a0Var.m(attributeSet, i11);
        a0Var.b();
        this.f2708c = new z(this);
        this.f2709d = new androidx.core.widget.n();
    }
}
