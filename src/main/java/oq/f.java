package oq;

/* JADX INFO: loaded from: classes4.dex */
final class f extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f98413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p.b f98414b;

    static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private s f98415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p.b f98416b;

        b() {
        }

        @Override // oq.p.a
        public p a() {
            return new f(this.f98415a, this.f98416b);
        }

        @Override // oq.p.a
        public p.a b(s sVar) {
            this.f98415a = sVar;
            return this;
        }

        @Override // oq.p.a
        public p.a c(p.b bVar) {
            this.f98416b = bVar;
            return this;
        }
    }

    @Override // oq.p
    public s b() {
        return this.f98413a;
    }

    @Override // oq.p
    public p.b c() {
        return this.f98414b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            s sVar = this.f98413a;
            if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
                p.b bVar = this.f98414b;
                if (bVar != null ? bVar.equals(pVar.c()) : pVar.c() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        s sVar = this.f98413a;
        int iHashCode = ((sVar == null ? 0 : sVar.hashCode()) ^ 1000003) * 1000003;
        p.b bVar = this.f98414b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f98413a + ", productIdOrigin=" + this.f98414b + "}";
    }

    private f(s sVar, p.b bVar) {
        this.f98413a = sVar;
        this.f98414b = bVar;
    }
}
