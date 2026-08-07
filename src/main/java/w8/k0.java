package w8;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f121335c = new k0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f121336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f121337b;

    public k0(long j11, long j12) {
        this.f121336a = j11;
        this.f121337b = j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            if (this.f121336a == k0Var.f121336a && this.f121337b == k0Var.f121337b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f121336a) * 31) + ((int) this.f121337b);
    }

    public String toString() {
        return "[timeUs=" + this.f121336a + ", position=" + this.f121337b + "]";
    }
}
