package gv;

/* JADX INFO: loaded from: classes5.dex */
final class b0 extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0.a f69749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0.c f69750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0.b f69751c;

    b0(g0.a aVar, g0.c cVar, g0.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f69749a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f69750b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f69751c = bVar;
    }

    @Override // gv.g0
    public g0.a a() {
        return this.f69749a;
    }

    @Override // gv.g0
    public g0.b c() {
        return this.f69751c;
    }

    @Override // gv.g0
    public g0.c d() {
        return this.f69750b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (this.f69749a.equals(g0Var.a()) && this.f69750b.equals(g0Var.d()) && this.f69751c.equals(g0Var.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f69749a.hashCode() ^ 1000003) * 1000003) ^ this.f69750b.hashCode()) * 1000003) ^ this.f69751c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f69749a + ", osData=" + this.f69750b + ", deviceData=" + this.f69751c + "}";
    }
}
