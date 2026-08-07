package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import j5.k;
import ma.c;

/* JADX INFO: loaded from: classes3.dex */
public final class PreferenceScreen extends PreferenceGroup {
    private boolean L;

    public PreferenceScreen(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, k.a(context, c.f91634f, R.attr.preferenceScreenStyle));
        this.L = true;
    }

    @Override // androidx.preference.Preference
    protected void t() {
        if (f() == null && e() == null && G() != 0) {
            k();
            throw null;
        }
    }
}
