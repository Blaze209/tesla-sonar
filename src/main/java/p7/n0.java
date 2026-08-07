package p7;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Surface f101439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f101440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f101441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f101442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f101443e;

    public n0(Surface surface, int i11, int i12) {
        this(surface, i11, i12, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f101440b == n0Var.f101440b && this.f101441c == n0Var.f101441c && this.f101442d == n0Var.f101442d && this.f101443e == n0Var.f101443e && this.f101439a.equals(n0Var.f101439a);
    }

    public int hashCode() {
        return (((((((this.f101439a.hashCode() * 31) + this.f101440b) * 31) + this.f101441c) * 31) + this.f101442d) * 31) + (this.f101443e ? 1 : 0);
    }

    public n0(Surface surface, int i11, int i12, int i13) {
        this(surface, i11, i12, i13, false);
    }

    public n0(Surface surface, int i11, int i12, int i13, boolean z11) {
        s7.a.b(i13 == 0 || i13 == 90 || i13 == 180 || i13 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f101439a = surface;
        this.f101440b = i11;
        this.f101441c = i12;
        this.f101442d = i13;
        this.f101443e = z11;
    }
}
