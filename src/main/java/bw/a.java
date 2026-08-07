package bw;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a f18129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f18130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f18131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f18132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f18133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f18134h;

    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f18135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c.a f18136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f18137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f18138d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f18139e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f18140f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f18141g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte f18142h;

        @Override // bw.d.a
        public d a() {
            if (this.f18142h == 3 && this.f18136b != null) {
                return new a(this.f18135a, this.f18136b, this.f18137c, this.f18138d, this.f18139e, this.f18140f, this.f18141g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f18136b == null) {
                sb2.append(" registrationStatus");
            }
            if ((this.f18142h & 1) == 0) {
                sb2.append(" expiresInSecs");
            }
            if ((this.f18142h & 2) == 0) {
                sb2.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // bw.d.a
        public d.a b(String str) {
            this.f18137c = str;
            return this;
        }

        @Override // bw.d.a
        public d.a c(long j11) {
            this.f18139e = j11;
            this.f18142h = (byte) (this.f18142h | 1);
            return this;
        }

        @Override // bw.d.a
        public d.a d(String str) {
            this.f18135a = str;
            return this;
        }

        @Override // bw.d.a
        public d.a e(String str) {
            this.f18141g = str;
            return this;
        }

        @Override // bw.d.a
        public d.a f(String str) {
            this.f18138d = str;
            return this;
        }

        @Override // bw.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f18136b = aVar;
            return this;
        }

        @Override // bw.d.a
        public d.a h(long j11) {
            this.f18140f = j11;
            this.f18142h = (byte) (this.f18142h | 2);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f18135a = dVar.d();
            this.f18136b = dVar.g();
            this.f18137c = dVar.b();
            this.f18138d = dVar.f();
            this.f18139e = dVar.c();
            this.f18140f = dVar.h();
            this.f18141g = dVar.e();
            this.f18142h = (byte) 3;
        }
    }

    @Override // bw.d
    public String b() {
        return this.f18130d;
    }

    @Override // bw.d
    public long c() {
        return this.f18132f;
    }

    @Override // bw.d
    public String d() {
        return this.f18128b;
    }

    @Override // bw.d
    public String e() {
        return this.f18134h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str4 = this.f18128b;
            if (str4 != null ? str4.equals(dVar.d()) : dVar.d() == null) {
                if (this.f18129c.equals(dVar.g()) && ((str = this.f18130d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f18131e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f18132f == dVar.c() && this.f18133g == dVar.h() && ((str3 = this.f18134h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // bw.d
    public String f() {
        return this.f18131e;
    }

    @Override // bw.d
    @NonNull
    public c.a g() {
        return this.f18129c;
    }

    @Override // bw.d
    public long h() {
        return this.f18133g;
    }

    public int hashCode() {
        String str = this.f18128b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f18129c.hashCode()) * 1000003;
        String str2 = this.f18130d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f18131e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j11 = this.f18132f;
        int i11 = (iHashCode3 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f18133g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str4 = this.f18134h;
        return i12 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // bw.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f18128b + ", registrationStatus=" + this.f18129c + ", authToken=" + this.f18130d + ", refreshToken=" + this.f18131e + ", expiresInSecs=" + this.f18132f + ", tokenCreationEpochInSecs=" + this.f18133g + ", fisError=" + this.f18134h + "}";
    }

    private a(String str, c.a aVar, String str2, String str3, long j11, long j12, String str4) {
        this.f18128b = str;
        this.f18129c = aVar;
        this.f18130d = str2;
        this.f18131e = str3;
        this.f18132f = j11;
        this.f18133g = j12;
        this.f18134h = str4;
    }
}
