package um;

/* JADX INFO: loaded from: classes3.dex */
public class o implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f116468d = d(Integer.MAX_VALUE, true, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f116469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f116470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f116471c;

    private o(int i11, boolean z11, boolean z12) {
        this.f116469a = i11;
        this.f116470b = z11;
        this.f116471c = z12;
    }

    public static p d(int i11, boolean z11, boolean z12) {
        return new o(i11, z11, z12);
    }

    @Override // um.p
    public boolean a() {
        return this.f116471c;
    }

    @Override // um.p
    public boolean b() {
        return this.f116470b;
    }

    @Override // um.p
    public int c() {
        return this.f116469a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f116469a == oVar.f116469a && this.f116470b == oVar.f116470b && this.f116471c == oVar.f116471c;
    }

    public int hashCode() {
        return (this.f116469a ^ (this.f116470b ? 4194304 : 0)) ^ (this.f116471c ? 8388608 : 0);
    }
}
