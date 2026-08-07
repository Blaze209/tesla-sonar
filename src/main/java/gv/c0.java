package gv;

/* JADX INFO: loaded from: classes5.dex */
final class c0 extends g0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f69773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f69774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f69775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bv.f f69776f;

    c0(String str, String str2, String str3, String str4, int i11, bv.f fVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f69771a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f69772b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f69773c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f69774d = str4;
        this.f69775e = i11;
        if (fVar == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f69776f = fVar;
    }

    @Override // gv.g0.a
    public String a() {
        return this.f69771a;
    }

    @Override // gv.g0.a
    public int c() {
        return this.f69775e;
    }

    @Override // gv.g0.a
    public bv.f d() {
        return this.f69776f;
    }

    @Override // gv.g0.a
    public String e() {
        return this.f69774d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0.a) {
            g0.a aVar = (g0.a) obj;
            if (this.f69771a.equals(aVar.a()) && this.f69772b.equals(aVar.f()) && this.f69773c.equals(aVar.g()) && this.f69774d.equals(aVar.e()) && this.f69775e == aVar.c() && this.f69776f.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // gv.g0.a
    public String f() {
        return this.f69772b;
    }

    @Override // gv.g0.a
    public String g() {
        return this.f69773c;
    }

    public int hashCode() {
        return ((((((((((this.f69771a.hashCode() ^ 1000003) * 1000003) ^ this.f69772b.hashCode()) * 1000003) ^ this.f69773c.hashCode()) * 1000003) ^ this.f69774d.hashCode()) * 1000003) ^ this.f69775e) * 1000003) ^ this.f69776f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f69771a + ", versionCode=" + this.f69772b + ", versionName=" + this.f69773c + ", installUuid=" + this.f69774d + ", deliveryMechanism=" + this.f69775e + ", developmentPlatformProvider=" + this.f69776f + "}";
    }
}
