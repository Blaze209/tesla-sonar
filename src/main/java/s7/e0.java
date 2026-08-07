package s7;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f110405c = new e0(-1, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f110406d = new e0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f110407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f110408b;

    public e0(int i11, int i12) {
        a.a((i11 == -1 || i11 >= 0) && (i12 == -1 || i12 >= 0));
        this.f110407a = i11;
        this.f110408b = i12;
    }

    public int a() {
        return this.f110408b;
    }

    public int b() {
        return this.f110407a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (this.f110407a == e0Var.f110407a && this.f110408b == e0Var.f110408b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.f110408b;
        int i12 = this.f110407a;
        return i11 ^ ((i12 >>> 16) | (i12 << 16));
    }

    public String toString() {
        return this.f110407a + "x" + this.f110408b;
    }
}
