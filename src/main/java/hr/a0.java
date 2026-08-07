package hr;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f73300c = new a0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f73301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f73302b;

    public a0(long j11, long j12) {
        this.f73301a = j11;
        this.f73302b = j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f73301a == a0Var.f73301a && this.f73302b == a0Var.f73302b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f73301a) * 31) + ((int) this.f73302b);
    }

    public String toString() {
        return "[timeUs=" + this.f73301a + ", position=" + this.f73302b + "]";
    }
}
