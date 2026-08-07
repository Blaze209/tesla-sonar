package oq;

/* JADX INFO: loaded from: classes4.dex */
final class e extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.b f98409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oq.a f98410b;

    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o.b f98411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private oq.a f98412b;

        b() {
        }

        @Override // oq.o.a
        public o a() {
            return new e(this.f98411a, this.f98412b);
        }

        @Override // oq.o.a
        public o.a b(oq.a aVar) {
            this.f98412b = aVar;
            return this;
        }

        @Override // oq.o.a
        public o.a c(o.b bVar) {
            this.f98411a = bVar;
            return this;
        }
    }

    @Override // oq.o
    public oq.a b() {
        return this.f98410b;
    }

    @Override // oq.o
    public o.b c() {
        return this.f98409a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.b bVar = this.f98409a;
            if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
                oq.a aVar = this.f98410b;
                if (aVar != null ? aVar.equals(oVar.b()) : oVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        o.b bVar = this.f98409a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        oq.a aVar = this.f98410b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f98409a + ", androidClientInfo=" + this.f98410b + "}";
    }

    private e(o.b bVar, oq.a aVar) {
        this.f98409a = bVar;
        this.f98410b = aVar;
    }
}
