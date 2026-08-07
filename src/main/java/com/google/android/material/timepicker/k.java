package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes5.dex */
class k implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ChipTextInputComboView f43070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ChipTextInputComboView f43071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f43072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f43073d = false;

    k(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, h hVar) {
        this.f43070a = chipTextInputComboView;
        this.f43071b = chipTextInputComboView2;
        this.f43072c = hVar;
    }

    private void b(EditText editText) {
        if (editText.getSelectionStart() == 0 && editText.length() == 2) {
            editText.getText().clear();
        }
    }

    private void c(int i11) {
        this.f43071b.setChecked(i11 == 12);
        this.f43070a.setChecked(i11 == 10);
        this.f43072c.f43058f = i11;
    }

    private boolean d(int i11, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (i11 >= 7 && i11 <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
            c(12);
            return true;
        }
        b(editText);
        return false;
    }

    private boolean e(int i11, KeyEvent keyEvent, EditText editText) {
        if (i11 == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            c(10);
            return true;
        }
        b(editText);
        return false;
    }

    public void a() {
        TextInputLayout textInputLayoutE = this.f43070a.e();
        TextInputLayout textInputLayoutE2 = this.f43071b.e();
        EditText editText = textInputLayoutE.getEditText();
        EditText editText2 = textInputLayoutE2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
        boolean z11 = i11 == 5;
        if (z11) {
            c(12);
        }
        return z11;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i11, KeyEvent keyEvent) {
        if (this.f43073d) {
            return false;
        }
        this.f43073d = true;
        EditText editText = (EditText) view;
        boolean zE = this.f43072c.f43058f == 12 ? e(i11, keyEvent, editText) : d(i11, keyEvent, editText);
        this.f43073d = false;
        return zE;
    }
}
