package androidx.media3.session;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class se {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final com.google.common.collect.x<Integer> f12342d = com.google.common.collect.x.s(40010);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final com.google.common.collect.x<Integer> f12343e = com.google.common.collect.x.w(50000, 50001, 50002, 50003, 50004, 50005, 50006);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f12344f = s7.q0.N0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f12345g = s7.q0.N0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f12346h = s7.q0.N0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f12349c;

    public se(int i11) {
        s7.a.b(i11 != 0, "commandCode shouldn't be COMMAND_CODE_CUSTOM");
        this.f12347a = i11;
        this.f12348b = "";
        this.f12349c = Bundle.EMPTY;
    }

    public static se a(Bundle bundle) {
        int i11 = bundle.getInt(f12344f, 0);
        if (i11 != 0) {
            return new se(i11);
        }
        String str = (String) s7.a.f(bundle.getString(f12345g));
        Bundle bundle2 = bundle.getBundle(f12346h);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new se(str, bundle2);
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f12344f, this.f12347a);
        bundle.putString(f12345g, this.f12348b);
        bundle.putBundle(f12346h, this.f12349c);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof se)) {
            return false;
        }
        se seVar = (se) obj;
        return this.f12347a == seVar.f12347a && TextUtils.equals(this.f12348b, seVar.f12348b);
    }

    public int hashCode() {
        return Objects.hash(this.f12348b, Integer.valueOf(this.f12347a));
    }

    public se(String str, Bundle bundle) {
        this.f12347a = 0;
        this.f12348b = (String) s7.a.f(str);
        this.f12349c = new Bundle((Bundle) s7.a.f(bundle));
    }
}
