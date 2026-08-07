package p7;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f101444d = s7.q0.N0(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f101445e = s7.q0.N0(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f101446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f101447c;

    public o0() {
        this.f101446b = false;
        this.f101447c = false;
    }

    public static o0 d(Bundle bundle) {
        s7.a.a(bundle.getInt(k0.f101405a, -1) == 3);
        return bundle.getBoolean(f101444d, false) ? new o0(bundle.getBoolean(f101445e, false)) : new o0();
    }

    @Override // p7.k0
    public boolean b() {
        return this.f101446b;
    }

    @Override // p7.k0
    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(k0.f101405a, 3);
        bundle.putBoolean(f101444d, this.f101446b);
        bundle.putBoolean(f101445e, this.f101447c);
        return bundle;
    }

    public boolean e() {
        return this.f101447c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f101447c == o0Var.f101447c && this.f101446b == o0Var.f101446b;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f101446b), Boolean.valueOf(this.f101447c));
    }

    public o0(boolean z11) {
        this.f101446b = true;
        this.f101447c = z11;
    }
}
