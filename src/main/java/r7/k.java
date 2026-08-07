package r7;

import android.os.Bundle;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f107117d = q0.N0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f107118e = q0.N0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f107119f = q0.N0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f107120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f107121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f107122c;

    public k(int i11, int i12, int i13) {
        this.f107120a = i11;
        this.f107121b = i12;
        this.f107122c = i13;
    }

    public static k a(Bundle bundle) {
        return new k(bundle.getInt(f107117d), bundle.getInt(f107118e), bundle.getInt(f107119f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f107117d, this.f107120a);
        bundle.putInt(f107118e, this.f107121b);
        bundle.putInt(f107119f, this.f107122c);
        return bundle;
    }
}
