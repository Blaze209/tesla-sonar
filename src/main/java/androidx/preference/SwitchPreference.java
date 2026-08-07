package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.annotation.NonNull;
import j5.k;
import ma.c;
import ma.g;

/* JADX INFO: loaded from: classes3.dex */
public class SwitchPreference extends TwoStatePreference {
    private final a I;
    private CharSequence J;
    private CharSequence K;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            if (SwitchPreference.this.a(Boolean.valueOf(z11))) {
                SwitchPreference.this.G(z11);
            } else {
                compoundButton.setChecked(!z11);
            }
        }
    }

    public SwitchPreference(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.I = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.J0, i11, i12);
        J(k.o(typedArrayObtainStyledAttributes, g.R0, g.K0));
        I(k.o(typedArrayObtainStyledAttributes, g.Q0, g.L0));
        M(k.o(typedArrayObtainStyledAttributes, g.T0, g.N0));
        L(k.o(typedArrayObtainStyledAttributes, g.S0, g.O0));
        H(k.b(typedArrayObtainStyledAttributes, g.P0, g.M0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void N(View view) {
        boolean z11 = view instanceof Switch;
        if (z11) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.D);
        }
        if (z11) {
            Switch r11 = (Switch) view;
            r11.setTextOn(this.J);
            r11.setTextOff(this.K);
            r11.setOnCheckedChangeListener(this.I);
        }
    }

    private void O(View view) {
        if (((AccessibilityManager) c().getSystemService("accessibility")).isEnabled()) {
            N(view.findViewById(R.id.switch_widget));
            K(view.findViewById(R.id.summary));
        }
    }

    public void L(CharSequence charSequence) {
        this.K = charSequence;
        r();
    }

    public void M(CharSequence charSequence) {
        this.J = charSequence;
        r();
    }

    @Override // androidx.preference.Preference
    protected void y(@NonNull View view) {
        super.y(view);
        O(view);
    }

    public SwitchPreference(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public SwitchPreference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.f91638j, R.attr.switchPreferenceStyle));
    }
}
