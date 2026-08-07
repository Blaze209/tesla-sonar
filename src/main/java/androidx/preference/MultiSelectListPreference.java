package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import j5.k;
import java.util.HashSet;
import java.util.Set;
import ma.c;
import ma.g;

/* JADX INFO: loaded from: classes3.dex */
public class MultiSelectListPreference extends DialogPreference {
    private CharSequence[] J;
    private CharSequence[] K;
    private Set<String> L;

    public MultiSelectListPreference(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.L = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.D, i11, i12);
        this.J = k.q(typedArrayObtainStyledAttributes, g.G, g.E);
        this.K = k.q(typedArrayObtainStyledAttributes, g.H, g.F);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected Object v(@NonNull TypedArray typedArray, int i11) {
        CharSequence[] textArray = typedArray.getTextArray(i11);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public MultiSelectListPreference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.f91630b, R.attr.dialogPreferenceStyle));
    }
}
