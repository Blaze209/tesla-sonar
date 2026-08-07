package gk;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 {
    public static final String a(n0 n0Var) {
        n0Var.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            return Build.VERSION.RELEASE_OR_CODENAME;
        }
        String str = Build.VERSION.RELEASE;
        if (str == null) {
            return null;
        }
        return str;
    }

    public final ro0.d<q0> b() {
        return j0.f69073a;
    }
}
