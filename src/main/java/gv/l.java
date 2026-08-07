package gv;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class l extends f0.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f69867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0.e.d.a f69869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f0.e.d.c f69870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f0.e.d.AbstractC1439d f69871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f0.e.d.f f69872f;

    static final class b extends f0.e.d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f69873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f69874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f0.e.d.a f69875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f0.e.d.c f69876d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f0.e.d.AbstractC1439d f69877e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private f0.e.d.f f69878f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f69879g;

        @Override // gv.f0.e.d.b
        public f0.e.d a() {
            String str;
            f0.e.d.a aVar;
            f0.e.d.c cVar;
            if (this.f69879g == 1 && (str = this.f69874b) != null && (aVar = this.f69875c) != null && (cVar = this.f69876d) != null) {
                return new l(this.f69873a, str, aVar, cVar, this.f69877e, this.f69878f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((1 & this.f69879g) == 0) {
                sb2.append(" timestamp");
            }
            if (this.f69874b == null) {
                sb2.append(" type");
            }
            if (this.f69875c == null) {
                sb2.append(" app");
            }
            if (this.f69876d == null) {
                sb2.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.e.d.b
        public f0.e.d.b b(f0.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f69875c = aVar;
            return this;
        }

        @Override // gv.f0.e.d.b
        public f0.e.d.b c(f0.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f69876d = cVar;
            return this;
        }

        @Override // gv.f0.e.d.b
        public f0.e.d.b d(f0.e.d.AbstractC1439d abstractC1439d) {
            this.f69877e = abstractC1439d;
            return this;
        }

        @Override // gv.f0.e.d.b
        public f0.e.d.b e(f0.e.d.f fVar) {
            this.f69878f = fVar;
            return this;
        }

        @Override // gv.f0.e.d.b
        public f0.e.d.b f(long j11) {
            this.f69873a = j11;
            this.f69879g = (byte) (this.f69879g | 1);
            return this;
        }

        @Override // gv.f0.e.d.b
        public f0.e.d.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f69874b = str;
            return this;
        }

        b() {
        }

        private b(f0.e.d dVar) {
            this.f69873a = dVar.f();
            this.f69874b = dVar.g();
            this.f69875c = dVar.b();
            this.f69876d = dVar.c();
            this.f69877e = dVar.d();
            this.f69878f = dVar.e();
            this.f69879g = (byte) 1;
        }
    }

    @Override // gv.f0.e.d
    @NonNull
    public f0.e.d.a b() {
        return this.f69869c;
    }

    @Override // gv.f0.e.d
    @NonNull
    public f0.e.d.c c() {
        return this.f69870d;
    }

    @Override // gv.f0.e.d
    public f0.e.d.AbstractC1439d d() {
        return this.f69871e;
    }

    @Override // gv.f0.e.d
    public f0.e.d.f e() {
        return this.f69872f;
    }

    public boolean equals(Object obj) {
        f0.e.d.AbstractC1439d abstractC1439d;
        f0.e.d.f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d) {
            f0.e.d dVar = (f0.e.d) obj;
            if (this.f69867a == dVar.f() && this.f69868b.equals(dVar.g()) && this.f69869c.equals(dVar.b()) && this.f69870d.equals(dVar.c()) && ((abstractC1439d = this.f69871e) != null ? abstractC1439d.equals(dVar.d()) : dVar.d() == null) && ((fVar = this.f69872f) != null ? fVar.equals(dVar.e()) : dVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // gv.f0.e.d
    public long f() {
        return this.f69867a;
    }

    @Override // gv.f0.e.d
    @NonNull
    public String g() {
        return this.f69868b;
    }

    @Override // gv.f0.e.d
    public f0.e.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long j11 = this.f69867a;
        int iHashCode = (((((((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ this.f69868b.hashCode()) * 1000003) ^ this.f69869c.hashCode()) * 1000003) ^ this.f69870d.hashCode()) * 1000003;
        f0.e.d.AbstractC1439d abstractC1439d = this.f69871e;
        int iHashCode2 = (iHashCode ^ (abstractC1439d == null ? 0 : abstractC1439d.hashCode())) * 1000003;
        f0.e.d.f fVar = this.f69872f;
        return iHashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{timestamp=" + this.f69867a + ", type=" + this.f69868b + ", app=" + this.f69869c + ", device=" + this.f69870d + ", log=" + this.f69871e + ", rollouts=" + this.f69872f + "}";
    }

    private l(long j11, String str, f0.e.d.a aVar, f0.e.d.c cVar, f0.e.d.AbstractC1439d abstractC1439d, f0.e.d.f fVar) {
        this.f69867a = j11;
        this.f69868b = str;
        this.f69869c = aVar;
        this.f69870d = cVar;
        this.f69871e = abstractC1439d;
        this.f69872f = fVar;
    }
}
