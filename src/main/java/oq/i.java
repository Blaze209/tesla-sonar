package oq;

/* JADX INFO: loaded from: classes4.dex */
final class i extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f98423a;

    static final class b extends s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private r f98424a;

        b() {
        }

        @Override // oq.s.a
        public s a() {
            return new i(this.f98424a);
        }

        @Override // oq.s.a
        public s.a b(r rVar) {
            this.f98424a = rVar;
            return this;
        }
    }

    @Override // oq.s
    public r b() {
        return this.f98423a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        r rVar = this.f98423a;
        r rVarB = ((s) obj).b();
        if (rVar == null) {
            return rVarB == null;
        }
        return rVar.equals(rVarB);
    }

    public int hashCode() {
        r rVar = this.f98423a;
        return (rVar == null ? 0 : rVar.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f98423a + "}";
    }

    private i(r rVar) {
        this.f98423a = rVar;
    }
}
