package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.app.j;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.p;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import vt.a;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialComponentsViewInflater extends j {
    @Override // androidx.appcompat.app.j
    @NonNull
    protected AppCompatAutoCompleteTextView b(@NonNull Context context, AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    @Override // androidx.appcompat.app.j
    @NonNull
    protected AppCompatButton c(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.j
    @NonNull
    protected e d(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.j
    @NonNull
    protected p j(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.j
    @NonNull
    protected AppCompatTextView n(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }
}
