package ga;

import android.os.Bundle;
import android.os.SystemClock;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f67780e = q0.N0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f67781f = q0.N0(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f67782g = q0.N0(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f67783h = q0.N0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f67785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f67786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f67787d;

    public v(int i11) {
        this(i11, Bundle.EMPTY);
    }

    public static v a(Bundle bundle) {
        u uVar;
        int i11 = bundle.getInt(f67780e, -1);
        Bundle bundle2 = bundle.getBundle(f67781f);
        long j11 = bundle.getLong(f67782g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(f67783h);
        if (bundle3 != null) {
            uVar = u.a(bundle3);
        } else {
            uVar = i11 != 0 ? new u(i11, "no error message provided") : null;
        }
        u uVar2 = uVar;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new v(i11, bundle2, j11, uVar2);
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f67780e, this.f67784a);
        bundle.putBundle(f67781f, this.f67785b);
        bundle.putLong(f67782g, this.f67786c);
        u uVar = this.f67787d;
        if (uVar != null) {
            bundle.putBundle(f67783h, uVar.b());
        }
        return bundle;
    }

    public v(int i11, Bundle bundle) {
        this(i11, bundle, SystemClock.elapsedRealtime(), null);
    }

    private v(int i11, Bundle bundle, long j11, u uVar) {
        s7.a.a(uVar == null || i11 < 0);
        this.f67784a = i11;
        this.f67785b = new Bundle(bundle);
        this.f67786c = j11;
        if (uVar == null && i11 < 0) {
            uVar = new u(i11, "no error message provided");
        }
        this.f67787d = uVar;
    }
}
