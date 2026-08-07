package cw;

/* JADX INFO: loaded from: classes5.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f59198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f59199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f59200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f59201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d.b f59202e;

    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f59203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f59204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f59205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f f59206d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d.b f59207e;

        b() {
        }

        @Override // cw.d.a
        public d a() {
            return new a(this.f59203a, this.f59204b, this.f59205c, this.f59206d, this.f59207e);
        }

        @Override // cw.d.a
        public d.a b(f fVar) {
            this.f59206d = fVar;
            return this;
        }

        @Override // cw.d.a
        public d.a c(String str) {
            this.f59204b = str;
            return this;
        }

        @Override // cw.d.a
        public d.a d(String str) {
            this.f59205c = str;
            return this;
        }

        @Override // cw.d.a
        public d.a e(d.b bVar) {
            this.f59207e = bVar;
            return this;
        }

        @Override // cw.d.a
        public d.a f(String str) {
            this.f59203a = str;
            return this;
        }
    }

    @Override // cw.d
    public f b() {
        return this.f59201d;
    }

    @Override // cw.d
    public String c() {
        return this.f59199b;
    }

    @Override // cw.d
    public String d() {
        return this.f59200c;
    }

    @Override // cw.d
    public d.b e() {
        return this.f59202e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f59198a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.f59199b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f59200c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f59201d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f59202e;
                            if (bVar != null ? bVar.equals(dVar.e()) : dVar.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // cw.d
    public String f() {
        return this.f59198a;
    }

    public int hashCode() {
        String str = this.f59198a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f59199b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f59200c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f59201d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f59202e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f59198a + ", fid=" + this.f59199b + ", refreshToken=" + this.f59200c + ", authToken=" + this.f59201d + ", responseCode=" + this.f59202e + "}";
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f59198a = str;
        this.f59199b = str2;
        this.f59200c = str3;
        this.f59201d = fVar;
        this.f59202e = bVar;
    }
}
