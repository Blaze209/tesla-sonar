package gv;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class i extends f0.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f69835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f0.e.a.b f69836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f69837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f69838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f69839g;

    static final class b extends f0.e.a.AbstractC1426a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f69840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f69841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f69842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f0.e.a.b f69843d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f69844e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f69845f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f69846g;

        b() {
        }

        @Override // gv.f0.e.a.AbstractC1426a
        public f0.e.a a() {
            String str;
            String str2 = this.f69840a;
            if (str2 != null && (str = this.f69841b) != null) {
                return new i(str2, str, this.f69842c, this.f69843d, this.f69844e, this.f69845f, this.f69846g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f69840a == null) {
                sb2.append(" identifier");
            }
            if (this.f69841b == null) {
                sb2.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.e.a.AbstractC1426a
        public f0.e.a.AbstractC1426a b(String str) {
            this.f69845f = str;
            return this;
        }

        @Override // gv.f0.e.a.AbstractC1426a
        public f0.e.a.AbstractC1426a c(String str) {
            this.f69846g = str;
            return this;
        }

        @Override // gv.f0.e.a.AbstractC1426a
        public f0.e.a.AbstractC1426a d(String str) {
            this.f69842c = str;
            return this;
        }

        @Override // gv.f0.e.a.AbstractC1426a
        public f0.e.a.AbstractC1426a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f69840a = str;
            return this;
        }

        @Override // gv.f0.e.a.AbstractC1426a
        public f0.e.a.AbstractC1426a f(String str) {
            this.f69844e = str;
            return this;
        }

        @Override // gv.f0.e.a.AbstractC1426a
        public f0.e.a.AbstractC1426a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f69841b = str;
            return this;
        }
    }

    @Override // gv.f0.e.a
    public String b() {
        return this.f69838f;
    }

    @Override // gv.f0.e.a
    public String c() {
        return this.f69839g;
    }

    @Override // gv.f0.e.a
    public String d() {
        return this.f69835c;
    }

    @Override // gv.f0.e.a
    @NonNull
    public String e() {
        return this.f69833a;
    }

    public boolean equals(Object obj) {
        String str;
        f0.e.a.b bVar;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.a) {
            f0.e.a aVar = (f0.e.a) obj;
            if (this.f69833a.equals(aVar.e()) && this.f69834b.equals(aVar.h()) && ((str = this.f69835c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f69836d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f69837e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f69838f) != null ? str3.equals(aVar.b()) : aVar.b() == null) && ((str4 = this.f69839g) != null ? str4.equals(aVar.c()) : aVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // gv.f0.e.a
    public String f() {
        return this.f69837e;
    }

    @Override // gv.f0.e.a
    public f0.e.a.b g() {
        return this.f69836d;
    }

    @Override // gv.f0.e.a
    @NonNull
    public String h() {
        return this.f69834b;
    }

    public int hashCode() {
        int iHashCode = (((this.f69833a.hashCode() ^ 1000003) * 1000003) ^ this.f69834b.hashCode()) * 1000003;
        String str = this.f69835c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        f0.e.a.b bVar = this.f69836d;
        int iHashCode3 = (iHashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f69837e;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f69838f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f69839g;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f69833a + ", version=" + this.f69834b + ", displayVersion=" + this.f69835c + ", organization=" + this.f69836d + ", installationUuid=" + this.f69837e + ", developmentPlatform=" + this.f69838f + ", developmentPlatformVersion=" + this.f69839g + "}";
    }

    private i(String str, String str2, String str3, f0.e.a.b bVar, String str4, String str5, String str6) {
        this.f69833a = str;
        this.f69834b = str2;
        this.f69835c = str3;
        this.f69836d = bVar;
        this.f69837e = str4;
        this.f69838f = str5;
        this.f69839g = str6;
    }
}
