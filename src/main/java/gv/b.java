package gv;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class b extends f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f69725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f69726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f69727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f69728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f69729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f69730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f69731i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f69732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f0.e f69733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final f0.d f69734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f0.a f69735m;

    /* JADX INFO: renamed from: gv.b$b, reason: collision with other inner class name */
    static final class C1423b extends f0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f69736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f69737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f69738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f69739d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f69740e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f69741f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f69742g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f69743h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f69744i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private f0.e f69745j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private f0.d f69746k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private f0.a f69747l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f69748m;

        @Override // gv.f0.b
        public f0 a() {
            if (this.f69748m == 1 && this.f69736a != null && this.f69737b != null && this.f69739d != null && this.f69743h != null && this.f69744i != null) {
                return new b(this.f69736a, this.f69737b, this.f69738c, this.f69739d, this.f69740e, this.f69741f, this.f69742g, this.f69743h, this.f69744i, this.f69745j, this.f69746k, this.f69747l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f69736a == null) {
                sb2.append(" sdkVersion");
            }
            if (this.f69737b == null) {
                sb2.append(" gmpAppId");
            }
            if ((1 & this.f69748m) == 0) {
                sb2.append(" platform");
            }
            if (this.f69739d == null) {
                sb2.append(" installationUuid");
            }
            if (this.f69743h == null) {
                sb2.append(" buildVersion");
            }
            if (this.f69744i == null) {
                sb2.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.b
        public f0.b b(f0.a aVar) {
            this.f69747l = aVar;
            return this;
        }

        @Override // gv.f0.b
        public f0.b c(String str) {
            this.f69742g = str;
            return this;
        }

        @Override // gv.f0.b
        public f0.b d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f69743h = str;
            return this;
        }

        @Override // gv.f0.b
        public f0.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f69744i = str;
            return this;
        }

        @Override // gv.f0.b
        public f0.b f(String str) {
            this.f69741f = str;
            return this;
        }

        @Override // gv.f0.b
        public f0.b g(String str) {
            this.f69740e = str;
            return this;
        }

        @Override // gv.f0.b
        public f0.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f69737b = str;
            return this;
        }

        @Override // gv.f0.b
        public f0.b i(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f69739d = str;
            return this;
        }

        @Override // gv.f0.b
        public f0.b j(f0.d dVar) {
            this.f69746k = dVar;
            return this;
        }

        @Override // gv.f0.b
        public f0.b k(int i11) {
            this.f69738c = i11;
            this.f69748m = (byte) (this.f69748m | 1);
            return this;
        }

        @Override // gv.f0.b
        public f0.b l(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f69736a = str;
            return this;
        }

        @Override // gv.f0.b
        public f0.b m(f0.e eVar) {
            this.f69745j = eVar;
            return this;
        }

        C1423b() {
        }

        private C1423b(f0 f0Var) {
            this.f69736a = f0Var.m();
            this.f69737b = f0Var.i();
            this.f69738c = f0Var.l();
            this.f69739d = f0Var.j();
            this.f69740e = f0Var.h();
            this.f69741f = f0Var.g();
            this.f69742g = f0Var.d();
            this.f69743h = f0Var.e();
            this.f69744i = f0Var.f();
            this.f69745j = f0Var.n();
            this.f69746k = f0Var.k();
            this.f69747l = f0Var.c();
            this.f69748m = (byte) 1;
        }
    }

    @Override // gv.f0
    public f0.a c() {
        return this.f69735m;
    }

    @Override // gv.f0
    public String d() {
        return this.f69730h;
    }

    @Override // gv.f0
    @NonNull
    public String e() {
        return this.f69731i;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        f0.e eVar;
        f0.d dVar;
        f0.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (this.f69724b.equals(f0Var.m()) && this.f69725c.equals(f0Var.i()) && this.f69726d == f0Var.l() && this.f69727e.equals(f0Var.j()) && ((str = this.f69728f) != null ? str.equals(f0Var.h()) : f0Var.h() == null) && ((str2 = this.f69729g) != null ? str2.equals(f0Var.g()) : f0Var.g() == null) && ((str3 = this.f69730h) != null ? str3.equals(f0Var.d()) : f0Var.d() == null) && this.f69731i.equals(f0Var.e()) && this.f69732j.equals(f0Var.f()) && ((eVar = this.f69733k) != null ? eVar.equals(f0Var.n()) : f0Var.n() == null) && ((dVar = this.f69734l) != null ? dVar.equals(f0Var.k()) : f0Var.k() == null) && ((aVar = this.f69735m) != null ? aVar.equals(f0Var.c()) : f0Var.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // gv.f0
    @NonNull
    public String f() {
        return this.f69732j;
    }

    @Override // gv.f0
    public String g() {
        return this.f69729g;
    }

    @Override // gv.f0
    public String h() {
        return this.f69728f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f69724b.hashCode() ^ 1000003) * 1000003) ^ this.f69725c.hashCode()) * 1000003) ^ this.f69726d) * 1000003) ^ this.f69727e.hashCode()) * 1000003;
        String str = this.f69728f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f69729g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f69730h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f69731i.hashCode()) * 1000003) ^ this.f69732j.hashCode()) * 1000003;
        f0.e eVar = this.f69733k;
        int iHashCode5 = (iHashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        f0.d dVar = this.f69734l;
        int iHashCode6 = (iHashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        f0.a aVar = this.f69735m;
        return iHashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // gv.f0
    @NonNull
    public String i() {
        return this.f69725c;
    }

    @Override // gv.f0
    @NonNull
    public String j() {
        return this.f69727e;
    }

    @Override // gv.f0
    public f0.d k() {
        return this.f69734l;
    }

    @Override // gv.f0
    public int l() {
        return this.f69726d;
    }

    @Override // gv.f0
    @NonNull
    public String m() {
        return this.f69724b;
    }

    @Override // gv.f0
    public f0.e n() {
        return this.f69733k;
    }

    @Override // gv.f0
    protected f0.b o() {
        return new C1423b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f69724b + ", gmpAppId=" + this.f69725c + ", platform=" + this.f69726d + ", installationUuid=" + this.f69727e + ", firebaseInstallationId=" + this.f69728f + ", firebaseAuthenticationToken=" + this.f69729g + ", appQualitySessionId=" + this.f69730h + ", buildVersion=" + this.f69731i + ", displayVersion=" + this.f69732j + ", session=" + this.f69733k + ", ndkPayload=" + this.f69734l + ", appExitInfo=" + this.f69735m + "}";
    }

    private b(String str, String str2, int i11, String str3, String str4, String str5, String str6, String str7, String str8, f0.e eVar, f0.d dVar, f0.a aVar) {
        this.f69724b = str;
        this.f69725c = str2;
        this.f69726d = i11;
        this.f69727e = str3;
        this.f69728f = str4;
        this.f69729g = str5;
        this.f69730h = str6;
        this.f69731i = str7;
        this.f69732j = str8;
        this.f69733k = eVar;
        this.f69734l = dVar;
        this.f69735m = aVar;
    }
}
