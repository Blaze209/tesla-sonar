package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
class x extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EditText f42973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View.OnClickListener f42974g;

    x(@NonNull r rVar, int i11) {
        super(rVar);
        this.f42972e = zs.f.f128670a;
        this.f42974g = new View.OnClickListener() { // from class: com.google.android.material.textfield.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.v(this.f42971a, view);
            }
        };
        if (i11 != 0) {
            this.f42972e = i11;
        }
    }

    public static /* synthetic */ void v(x xVar, View view) {
        EditText editText = xVar.f42973f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (xVar.w()) {
            xVar.f42973f.setTransformationMethod(null);
        } else {
            xVar.f42973f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            xVar.f42973f.setSelection(selectionEnd);
        }
        xVar.r();
    }

    private boolean w() {
        EditText editText = this.f42973f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean x(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.s
    void b(CharSequence charSequence, int i11, int i12, int i13) {
        r();
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return zs.k.V;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return this.f42972e;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f42974g;
    }

    @Override // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean m() {
        return !w();
    }

    @Override // com.google.android.material.textfield.s
    void n(EditText editText) {
        this.f42973f = editText;
        r();
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        if (x(this.f42973f)) {
            this.f42973f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        EditText editText = this.f42973f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
