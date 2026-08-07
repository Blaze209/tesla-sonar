package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import j5.k;
import ma.c;
import ma.f;
import ma.g;

/* JADX INFO: loaded from: classes3.dex */
public class EditTextPreference extends DialogPreference {
    private String J;

    public static final class a implements Preference.b<EditTextPreference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f12999a;

        private a() {
        }

        @NonNull
        public static a b() {
            if (f12999a == null) {
                f12999a = new a();
            }
            return f12999a;
        }

        @Override // androidx.preference.Preference.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(@NonNull EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.F()) ? editTextPreference.c().getString(f.f91641a) : editTextPreference.F();
        }
    }

    public EditTextPreference(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f91689v, i11, i12);
        int i13 = g.f91691w;
        if (k.b(typedArrayObtainStyledAttributes, i13, i13, false)) {
            C(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public boolean D() {
        return TextUtils.isEmpty(this.J) || super.D();
    }

    public String F() {
        return this.J;
    }

    @Override // androidx.preference.Preference
    protected Object v(@NonNull TypedArray typedArray, int i11) {
        return typedArray.getString(i11);
    }

    public EditTextPreference(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public EditTextPreference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.f91632d, R.attr.editTextPreferenceStyle));
    }
}
