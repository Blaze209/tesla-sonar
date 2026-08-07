package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import j5.k;
import ma.c;
import ma.g;

/* JADX INFO: loaded from: classes3.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final a I;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            if (CheckBoxPreference.this.a(Boolean.valueOf(z11))) {
                CheckBoxPreference.this.G(z11);
            } else {
                compoundButton.setChecked(!z11);
            }
        }
    }

    public CheckBoxPreference(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void L(View view) {
        boolean z11 = view instanceof CompoundButton;
        if (z11) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.D);
        }
        if (z11) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.I);
        }
    }

    private void M(@NonNull View view) {
        if (((AccessibilityManager) c().getSystemService("accessibility")).isEnabled()) {
            L(view.findViewById(R.id.checkbox));
            K(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    protected void y(@NonNull View view) {
        super.y(view);
        M(view);
    }

    public CheckBoxPreference(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.I = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f91645b, i11, i12);
        J(k.o(typedArrayObtainStyledAttributes, g.f91661h, g.f91648c));
        I(k.o(typedArrayObtainStyledAttributes, g.f91659g, g.f91651d));
        H(k.b(typedArrayObtainStyledAttributes, g.f91657f, g.f91654e, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.f91629a, R.attr.checkBoxPreferenceStyle));
    }
}
