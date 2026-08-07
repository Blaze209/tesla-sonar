package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import j5.k;
import ma.c;
import ma.f;
import ma.g;

/* JADX INFO: loaded from: classes3.dex */
public class ListPreference extends DialogPreference {
    private CharSequence[] J;
    private CharSequence[] K;
    private String L;
    private String M;
    private boolean N;

    public static final class a implements Preference.b<ListPreference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f13000a;

        private a() {
        }

        @NonNull
        public static a b() {
            if (f13000a == null) {
                f13000a = new a();
            }
            return f13000a;
        }

        @Override // androidx.preference.Preference.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(@NonNull ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.H()) ? listPreference.c().getString(f.f91641a) : listPreference.H();
        }
    }

    public ListPreference(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f91693x, i11, i12);
        this.J = k.q(typedArrayObtainStyledAttributes, g.A, g.f91695y);
        this.K = k.q(typedArrayObtainStyledAttributes, g.B, g.f91697z);
        int i13 = g.C;
        if (k.b(typedArrayObtainStyledAttributes, i13, i13, false)) {
            C(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g.I, i11, i12);
        this.M = k.o(typedArrayObtainStyledAttributes2, g.f91680q0, g.Q);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private int K() {
        return F(this.L);
    }

    public int F(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.K) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.K[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] G() {
        return this.J;
    }

    public CharSequence H() {
        CharSequence[] charSequenceArr;
        int iK = K();
        if (iK < 0 || (charSequenceArr = this.J) == null) {
            return null;
        }
        return charSequenceArr[iK];
    }

    public CharSequence[] I() {
        return this.K;
    }

    public String J() {
        return this.L;
    }

    public void L(String str) {
        boolean zEquals = TextUtils.equals(this.L, str);
        if (zEquals && this.N) {
            return;
        }
        this.L = str;
        this.N = true;
        B(str);
        if (zEquals) {
            return;
        }
        r();
    }

    @Override // androidx.preference.Preference
    public CharSequence l() {
        if (m() != null) {
            return m().a(this);
        }
        CharSequence charSequenceH = H();
        CharSequence charSequenceL = super.l();
        String str = this.M;
        if (str != null) {
            if (charSequenceH == null) {
                charSequenceH = "";
            }
            String str2 = String.format(str, charSequenceH);
            if (!TextUtils.equals(str2, charSequenceL)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceL;
    }

    @Override // androidx.preference.Preference
    protected Object v(@NonNull TypedArray typedArray, int i11) {
        return typedArray.getString(i11);
    }

    public ListPreference(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public ListPreference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.f91630b, R.attr.dialogPreferenceStyle));
    }
}
