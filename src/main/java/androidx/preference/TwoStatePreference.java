package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TwoStatePreference extends Preference {
    protected boolean D;
    private CharSequence E;
    private CharSequence F;
    private boolean G;
    private boolean H;

    public TwoStatePreference(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
    }

    @Override // androidx.preference.Preference
    public boolean D() {
        boolean z11;
        if (this.H) {
            z11 = this.D;
        } else {
            z11 = !this.D;
        }
        return z11 || super.D();
    }

    public boolean F() {
        return this.D;
    }

    public void G(boolean z11) {
        boolean z12 = this.D != z11;
        if (z12 || !this.G) {
            this.D = z11;
            this.G = true;
            z(z11);
            if (z12) {
                s(D());
                r();
            }
        }
    }

    public void H(boolean z11) {
        this.H = z11;
    }

    public void I(CharSequence charSequence) {
        this.F = charSequence;
        if (F()) {
            return;
        }
        r();
    }

    public void J(CharSequence charSequence) {
        this.E = charSequence;
        if (F()) {
            r();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    protected void K(View view) {
        boolean z11;
        int i11;
        CharSequence charSequenceL;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!this.D || TextUtils.isEmpty(this.E)) {
                if (this.D || TextUtils.isEmpty(this.F)) {
                    z11 = true;
                } else {
                    textView.setText(this.F);
                }
                if (z11) {
                    charSequenceL = l();
                    if (!TextUtils.isEmpty(charSequenceL)) {
                        textView.setText(charSequenceL);
                        z11 = false;
                    }
                }
                i11 = z11 ? 8 : 0;
                if (i11 != textView.getVisibility()) {
                    textView.setVisibility(i11);
                }
            }
            textView.setText(this.E);
            z11 = false;
            if (z11) {
                charSequenceL = l();
                if (!TextUtils.isEmpty(charSequenceL)) {
                    textView.setText(charSequenceL);
                    z11 = false;
                }
            }
            if (z11) {
            }
            if (i11 != textView.getVisibility()) {
                textView.setVisibility(i11);
            }
        }
    }

    @Override // androidx.preference.Preference
    protected void t() {
        super.t();
        boolean z11 = !F();
        if (a(Boolean.valueOf(z11))) {
            G(z11);
        }
    }

    @Override // androidx.preference.Preference
    protected Object v(@NonNull TypedArray typedArray, int i11) {
        return Boolean.valueOf(typedArray.getBoolean(i11, false));
    }

    public TwoStatePreference(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public TwoStatePreference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
