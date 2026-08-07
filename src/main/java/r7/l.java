package r7;

import android.os.Bundle;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f107123b = q0.N0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107124a;

    public l(String str) {
        this.f107124a = str;
    }

    public static l a(Bundle bundle) {
        return new l((String) s7.a.f(bundle.getString(f107123b)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f107123b, this.f107124a);
        return bundle;
    }
}
