package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class f extends CheckedTextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f2679b = {R.attr.checkMark};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f2680a;

    public f(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        a0 a0Var = this.f2680a;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return j.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i11) {
        setCheckMarkDrawable(j.a.b(getContext(), i11));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.m.t(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        a0 a0Var = this.f2680a;
        if (a0Var != null) {
            a0Var.q(context, i11);
        }
    }

    public f(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public f(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(y0.b(context), attributeSet, i11);
        w0.a(this, getContext());
        a0 a0Var = new a0(this);
        this.f2680a = a0Var;
        a0Var.m(attributeSet, i11);
        a0Var.b();
        b1 b1VarV = b1.v(getContext(), attributeSet, f2679b, i11, 0);
        setCheckMarkDrawable(b1VarV.g(0));
        b1VarV.w();
    }
}
