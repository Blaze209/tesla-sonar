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
import androidx.appcompat.widget.SwitchCompat;
import j5.k;
import ma.c;
import ma.d;
import ma.g;

/* JADX INFO: loaded from: classes3.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final a I;
    private CharSequence J;
    private CharSequence K;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            if (SwitchPreferenceCompat.this.a(Boolean.valueOf(z11))) {
                SwitchPreferenceCompat.this.G(z11);
            } else {
                compoundButton.setChecked(!z11);
            }
        }
    }

    public SwitchPreferenceCompat(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.I = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.U0, i11, i12);
        J(k.o(typedArrayObtainStyledAttributes, g.f91650c1, g.V0));
        I(k.o(typedArrayObtainStyledAttributes, g.f91647b1, g.W0));
        M(k.o(typedArrayObtainStyledAttributes, g.f91656e1, g.Y0));
        L(k.o(typedArrayObtainStyledAttributes, g.f91653d1, g.Z0));
        H(k.b(typedArrayObtainStyledAttributes, g.f91644a1, g.X0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void N(View view) {
        boolean z11 = view instanceof SwitchCompat;
        if (z11) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.D);
        }
        if (z11) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.J);
            switchCompat.setTextOff(this.K);
            switchCompat.setOnCheckedChangeListener(this.I);
        }
    }

    private void O(View view) {
        if (((AccessibilityManager) c().getSystemService("accessibility")).isEnabled()) {
            N(view.findViewById(d.f91639a));
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

    public SwitchPreferenceCompat(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public SwitchPreferenceCompat(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f91637i);
    }
}
