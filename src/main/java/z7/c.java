package z7;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p7.u f127081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p7.u f127082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f127083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f127084e;

    public c(String str, p7.u uVar, p7.u uVar2, int i11, int i12) {
        s7.a.a(i11 == 0 || i12 == 0);
        this.f127080a = s7.a.d(str);
        this.f127081b = (p7.u) s7.a.f(uVar);
        this.f127082c = (p7.u) s7.a.f(uVar2);
        this.f127083d = i11;
        this.f127084e = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f127083d == cVar.f127083d && this.f127084e == cVar.f127084e && this.f127080a.equals(cVar.f127080a) && this.f127081b.equals(cVar.f127081b) && this.f127082c.equals(cVar.f127082c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f127083d) * 31) + this.f127084e) * 31) + this.f127080a.hashCode()) * 31) + this.f127081b.hashCode()) * 31) + this.f127082c.hashCode();
    }
}
