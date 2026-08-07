package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import j5.k;
import ma.c;
import ma.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DialogPreference extends Preference {
    private CharSequence D;
    private CharSequence E;
    private Drawable F;
    private CharSequence G;
    private CharSequence H;
    private int I;

    public DialogPreference(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f91663i, i11, i12);
        String strO = k.o(typedArrayObtainStyledAttributes, g.f91683s, g.f91665j);
        this.D = strO;
        if (strO == null) {
            this.D = n();
        }
        this.E = k.o(typedArrayObtainStyledAttributes, g.f91681r, g.f91667k);
        this.F = k.c(typedArrayObtainStyledAttributes, g.f91677p, g.f91669l);
        this.G = k.o(typedArrayObtainStyledAttributes, g.f91687u, g.f91671m);
        this.H = k.o(typedArrayObtainStyledAttributes, g.f91685t, g.f91673n);
        this.I = k.n(typedArrayObtainStyledAttributes, g.f91679q, g.f91675o, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected void t() {
        k();
        throw null;
    }

    public DialogPreference(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public DialogPreference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.f91630b, R.attr.dialogPreferenceStyle));
    }
}
