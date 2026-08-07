package z7;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f127117c = new y(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f127118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f127119b;

    public y(int i11, boolean z11) {
        this.f127118a = i11;
        this.f127119b = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f127118a == yVar.f127118a && this.f127119b == yVar.f127119b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f127118a << 1) + (this.f127119b ? 1 : 0);
    }
}
