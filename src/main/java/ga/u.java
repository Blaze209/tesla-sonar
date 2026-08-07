package ga;

import android.os.Bundle;
import java.util.Objects;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f67774d = q0.N0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f67775e = q0.N0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f67776f = q0.N0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f67778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f67779c;

    public u(int i11, String str) {
        this(i11, str, Bundle.EMPTY);
    }

    public static u a(Bundle bundle) {
        int i11 = bundle.getInt(f67774d, 1000);
        String string = bundle.getString(f67775e, "");
        Bundle bundle2 = bundle.getBundle(f67776f);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new u(i11, string, bundle2);
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f67774d, this.f67777a);
        bundle.putString(f67775e, this.f67778b);
        if (!this.f67779c.isEmpty()) {
            bundle.putBundle(f67776f, this.f67779c);
        }
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f67777a == uVar.f67777a && Objects.equals(this.f67778b, uVar.f67778b);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f67777a), this.f67778b);
    }

    public u(int i11, String str, Bundle bundle) {
        boolean z11 = true;
        if (i11 >= 0 && i11 != 1) {
            z11 = false;
        }
        s7.a.a(z11);
        this.f67777a = i11;
        this.f67778b = str;
        this.f67779c = bundle;
    }
}
