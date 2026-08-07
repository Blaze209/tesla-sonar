package uw;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class b extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f116751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f116752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f116753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f116754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f116755f;

    /* JADX INFO: renamed from: uw.b$b, reason: collision with other inner class name */
    static final class C2517b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f116756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f116757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f116758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f116759d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f116760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f116761f;

        C2517b() {
        }

        @Override // uw.d.a
        public d a() {
            if (this.f116761f == 1 && this.f116756a != null && this.f116757b != null && this.f116758c != null && this.f116759d != null) {
                return new b(this.f116756a, this.f116757b, this.f116758c, this.f116759d, this.f116760e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f116756a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f116757b == null) {
                sb2.append(" variantId");
            }
            if (this.f116758c == null) {
                sb2.append(" parameterKey");
            }
            if (this.f116759d == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f116761f) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // uw.d.a
        public d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f116758c = str;
            return this;
        }

        @Override // uw.d.a
        public d.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f116759d = str;
            return this;
        }

        @Override // uw.d.a
        public d.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f116756a = str;
            return this;
        }

        @Override // uw.d.a
        public d.a e(long j11) {
            this.f116760e = j11;
            this.f116761f = (byte) (this.f116761f | 1);
            return this;
        }

        @Override // uw.d.a
        public d.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f116757b = str;
            return this;
        }
    }

    @Override // uw.d
    @NonNull
    public String b() {
        return this.f116753d;
    }

    @Override // uw.d
    @NonNull
    public String c() {
        return this.f116754e;
    }

    @Override // uw.d
    @NonNull
    public String d() {
        return this.f116751b;
    }

    @Override // uw.d
    public long e() {
        return this.f116755f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f116751b.equals(dVar.d()) && this.f116752c.equals(dVar.f()) && this.f116753d.equals(dVar.b()) && this.f116754e.equals(dVar.c()) && this.f116755f == dVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // uw.d
    @NonNull
    public String f() {
        return this.f116752c;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f116751b.hashCode() ^ 1000003) * 1000003) ^ this.f116752c.hashCode()) * 1000003) ^ this.f116753d.hashCode()) * 1000003) ^ this.f116754e.hashCode()) * 1000003;
        long j11 = this.f116755f;
        return iHashCode ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f116751b + ", variantId=" + this.f116752c + ", parameterKey=" + this.f116753d + ", parameterValue=" + this.f116754e + ", templateVersion=" + this.f116755f + "}";
    }

    private b(String str, String str2, String str3, String str4, long j11) {
        this.f116751b = str;
        this.f116752c = str2;
        this.f116753d = str3;
        this.f116754e = str4;
        this.f116755f = j11;
    }
}
