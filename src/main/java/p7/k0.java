package p7;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f101405a = s7.q0.N0(0);

    k0() {
    }

    public static k0 a(Bundle bundle) {
        int i11 = bundle.getInt(f101405a, -1);
        if (i11 == 0) {
            return w.d(bundle);
        }
        if (i11 == 1) {
            return h0.d(bundle);
        }
        if (i11 == 2) {
            return l0.d(bundle);
        }
        if (i11 == 3) {
            return o0.d(bundle);
        }
        throw new IllegalArgumentException("Unknown RatingType: " + i11);
    }

    public abstract boolean b();

    public abstract Bundle c();
}
