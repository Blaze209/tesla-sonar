package r7;

import android.os.Bundle;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f107113c = q0.N0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f107114d = q0.N0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f107116b;

    public i(String str, int i11) {
        this.f107115a = str;
        this.f107116b = i11;
    }

    public static i a(Bundle bundle) {
        return new i((String) s7.a.f(bundle.getString(f107113c)), bundle.getInt(f107114d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f107113c, this.f107115a);
        bundle.putInt(f107114d, this.f107116b);
        return bundle;
    }
}
