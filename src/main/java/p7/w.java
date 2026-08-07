package p7;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w extends k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f101589d = s7.q0.N0(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f101590e = s7.q0.N0(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f101591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f101592c;

    public w() {
        this.f101591b = false;
        this.f101592c = false;
    }

    public static w d(Bundle bundle) {
        s7.a.a(bundle.getInt(k0.f101405a, -1) == 0);
        return bundle.getBoolean(f101589d, false) ? new w(bundle.getBoolean(f101590e, false)) : new w();
    }

    @Override // p7.k0
    public boolean b() {
        return this.f101591b;
    }

    @Override // p7.k0
    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(k0.f101405a, 0);
        bundle.putBoolean(f101589d, this.f101591b);
        bundle.putBoolean(f101590e, this.f101592c);
        return bundle;
    }

    public boolean e() {
        return this.f101592c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f101592c == wVar.f101592c && this.f101591b == wVar.f101591b;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f101591b), Boolean.valueOf(this.f101592c));
    }

    public w(boolean z11) {
        this.f101591b = true;
        this.f101592c = z11;
    }
}
