package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import j5.k;
import ma.c;

/* JADX INFO: loaded from: classes3.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
    }

    @Override // androidx.preference.Preference
    public boolean D() {
        return !super.p();
    }

    @Override // androidx.preference.Preference
    public boolean p() {
        return false;
    }

    public PreferenceCategory(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public PreferenceCategory(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.f91633e, R.attr.preferenceCategoryStyle));
    }
}
