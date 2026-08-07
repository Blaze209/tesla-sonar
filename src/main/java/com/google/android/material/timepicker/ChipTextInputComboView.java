package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.z;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Chip f42986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextInputLayout f42987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EditText f42988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextWatcher f42989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f42990e;

    private class b extends z {
        private b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f42986a.setText(ChipTextInputComboView.this.d("00"));
                return;
            }
            String strD = ChipTextInputComboView.this.d(editable);
            Chip chip = ChipTextInputComboView.this.f42986a;
            if (TextUtils.isEmpty(strD)) {
                strD = ChipTextInputComboView.this.d("00");
            }
            chip.setText(strD);
        }
    }

    public ChipTextInputComboView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(CharSequence charSequence) {
        return h.a(getResources(), charSequence);
    }

    private void f() {
        this.f42988c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public void c(InputFilter inputFilter) {
        InputFilter[] filters = this.f42988c.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f42988c.setFilters(inputFilterArr);
    }

    public TextInputLayout e() {
        return this.f42987b;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f42986a.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        this.f42986a.setChecked(z11);
        this.f42988c.setVisibility(z11 ? 0 : 4);
        this.f42986a.setVisibility(z11 ? 8 : 0);
        if (isChecked()) {
            d0.r(this.f42988c, false);
        }
    }

    public void setChipDelegate(androidx.core.view.a aVar) {
        ViewCompat.p0(this.f42986a, aVar);
    }

    public void setCursorVisible(boolean z11) {
        this.f42988c.setCursorVisible(z11);
    }

    public void setHelperText(CharSequence charSequence) {
        this.f42990e.setText(charSequence);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f42986a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i11, Object obj) {
        this.f42986a.setTag(i11, obj);
    }

    public void setText(CharSequence charSequence) {
        String strD = d(charSequence);
        this.f42986a.setText(strD);
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        this.f42988c.removeTextChangedListener(this.f42989d);
        this.f42988c.setText(strD);
        this.f42988c.addTextChangedListener(this.f42989d);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f42986a.toggle();
    }

    public ChipTextInputComboView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(zs.i.f128749k, (ViewGroup) this, false);
        this.f42986a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(zs.i.f128750l, (ViewGroup) this, false);
        this.f42987b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f42988c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f42989d = bVar;
        editText.addTextChangedListener(bVar);
        f();
        addView(chip);
        addView(textInputLayout);
        this.f42990e = (TextView) findViewById(zs.g.f128722t);
        editText.setId(ViewCompat.l());
        ViewCompat.C0(this.f42990e, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
