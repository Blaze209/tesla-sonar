package ts;

import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Surface f115011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f115012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f115013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f115014d;

    public i0(Surface surface, int i11, int i12) {
        this(surface, i11, i12, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f115012b == i0Var.f115012b && this.f115013c == i0Var.f115013c && this.f115014d == i0Var.f115014d && this.f115011a.equals(i0Var.f115011a);
    }

    public int hashCode() {
        return (((((this.f115011a.hashCode() * 31) + this.f115012b) * 31) + this.f115013c) * 31) + this.f115014d;
    }

    public i0(Surface surface, int i11, int i12, int i13) {
        a.b(i13 == 0 || i13 == 90 || i13 == 180 || i13 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f115011a = surface;
        this.f115012b = i11;
        this.f115013c = i12;
        this.f115014d = i13;
    }
}
