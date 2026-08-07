package androidx.media3.session;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f11686g = s7.q0.N0(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f11687h = s7.q0.N0(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f11688i = s7.q0.N0(2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f11689j = s7.q0.N0(3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f11690k = s7.q0.N0(4);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f11691l = s7.q0.N0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f11696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11697f;

    public g(String str, int i11, Bundle bundle, int i12) {
        this(1008000300, 7, str, i11, new Bundle(bundle), i12);
    }

    public static g a(Bundle bundle) {
        int i11 = bundle.getInt(f11686g, 0);
        int i12 = bundle.getInt(f11690k, 0);
        String str = (String) s7.a.f(bundle.getString(f11687h));
        String str2 = f11688i;
        s7.a.a(bundle.containsKey(str2));
        int i13 = bundle.getInt(str2);
        Bundle bundle2 = bundle.getBundle(f11689j);
        int i14 = bundle.getInt(f11691l, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new g(i11, i12, str, i13, bundle2, i14);
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f11686g, this.f11692a);
        bundle.putString(f11687h, this.f11694c);
        bundle.putInt(f11688i, this.f11695d);
        bundle.putBundle(f11689j, this.f11696e);
        bundle.putInt(f11690k, this.f11693b);
        bundle.putInt(f11691l, this.f11697f);
        return bundle;
    }

    private g(int i11, int i12, String str, int i13, Bundle bundle, int i14) {
        this.f11692a = i11;
        this.f11693b = i12;
        this.f11694c = str;
        this.f11695d = i13;
        this.f11696e = bundle;
        this.f11697f = i14;
    }
}
