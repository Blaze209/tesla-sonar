package gv;

/* JADX INFO: loaded from: classes5.dex */
final class d0 extends g0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f69783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f69785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f69786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f69787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f69788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f69789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f69790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f69791i;

    d0(int i11, String str, int i12, long j11, long j12, boolean z11, int i13, String str2, String str3) {
        this.f69783a = i11;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f69784b = str;
        this.f69785c = i12;
        this.f69786d = j11;
        this.f69787e = j12;
        this.f69788f = z11;
        this.f69789g = i13;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f69790h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f69791i = str3;
    }

    @Override // gv.g0.b
    public int a() {
        return this.f69783a;
    }

    @Override // gv.g0.b
    public int b() {
        return this.f69785c;
    }

    @Override // gv.g0.b
    public long d() {
        return this.f69787e;
    }

    @Override // gv.g0.b
    public boolean e() {
        return this.f69788f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0.b) {
            g0.b bVar = (g0.b) obj;
            if (this.f69783a == bVar.a() && this.f69784b.equals(bVar.g()) && this.f69785c == bVar.b() && this.f69786d == bVar.j() && this.f69787e == bVar.d() && this.f69788f == bVar.e() && this.f69789g == bVar.i() && this.f69790h.equals(bVar.f()) && this.f69791i.equals(bVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // gv.g0.b
    public String f() {
        return this.f69790h;
    }

    @Override // gv.g0.b
    public String g() {
        return this.f69784b;
    }

    @Override // gv.g0.b
    public String h() {
        return this.f69791i;
    }

    public int hashCode() {
        int iHashCode = (((((this.f69783a ^ 1000003) * 1000003) ^ this.f69784b.hashCode()) * 1000003) ^ this.f69785c) * 1000003;
        long j11 = this.f69786d;
        int i11 = (iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f69787e;
        return ((((((((i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ (this.f69788f ? 1231 : 1237)) * 1000003) ^ this.f69789g) * 1000003) ^ this.f69790h.hashCode()) * 1000003) ^ this.f69791i.hashCode();
    }

    @Override // gv.g0.b
    public int i() {
        return this.f69789g;
    }

    @Override // gv.g0.b
    public long j() {
        return this.f69786d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f69783a + ", model=" + this.f69784b + ", availableProcessors=" + this.f69785c + ", totalRam=" + this.f69786d + ", diskSpace=" + this.f69787e + ", isEmulator=" + this.f69788f + ", state=" + this.f69789g + ", manufacturer=" + this.f69790h + ", modelClass=" + this.f69791i + "}";
    }
}
