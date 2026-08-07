package fv;

/* JADX INFO: loaded from: classes5.dex */
final class b extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f66614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f66615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f66616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f66617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f66618f;

    b(String str, String str2, String str3, String str4, long j11) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f66614b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f66615c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f66616d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f66617e = str4;
        this.f66618f = j11;
    }

    @Override // fv.j
    public String c() {
        return this.f66615c;
    }

    @Override // fv.j
    public String d() {
        return this.f66616d;
    }

    @Override // fv.j
    public String e() {
        return this.f66614b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f66614b.equals(jVar.e()) && this.f66615c.equals(jVar.c()) && this.f66616d.equals(jVar.d()) && this.f66617e.equals(jVar.g()) && this.f66618f == jVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // fv.j
    public long f() {
        return this.f66618f;
    }

    @Override // fv.j
    public String g() {
        return this.f66617e;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f66614b.hashCode() ^ 1000003) * 1000003) ^ this.f66615c.hashCode()) * 1000003) ^ this.f66616d.hashCode()) * 1000003) ^ this.f66617e.hashCode()) * 1000003;
        long j11 = this.f66618f;
        return iHashCode ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f66614b + ", parameterKey=" + this.f66615c + ", parameterValue=" + this.f66616d + ", variantId=" + this.f66617e + ", templateVersion=" + this.f66618f + "}";
    }
}
