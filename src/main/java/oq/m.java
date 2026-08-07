package oq;

/* JADX INFO: loaded from: classes4.dex */
final class m extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w.c f98458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w.b f98459b;

    static final class b extends w.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private w.c f98460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private w.b f98461b;

        b() {
        }

        @Override // oq.w.a
        public w a() {
            return new m(this.f98460a, this.f98461b);
        }

        @Override // oq.w.a
        public w.a b(w.b bVar) {
            this.f98461b = bVar;
            return this;
        }

        @Override // oq.w.a
        public w.a c(w.c cVar) {
            this.f98460a = cVar;
            return this;
        }
    }

    @Override // oq.w
    public w.b b() {
        return this.f98459b;
    }

    @Override // oq.w
    public w.c c() {
        return this.f98458a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            w.c cVar = this.f98458a;
            if (cVar != null ? cVar.equals(wVar.c()) : wVar.c() == null) {
                w.b bVar = this.f98459b;
                if (bVar != null ? bVar.equals(wVar.b()) : wVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        w.c cVar = this.f98458a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        w.b bVar = this.f98459b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f98458a + ", mobileSubtype=" + this.f98459b + "}";
    }

    private m(w.c cVar, w.b bVar) {
        this.f98458a = cVar;
        this.f98459b = bVar;
    }
}
