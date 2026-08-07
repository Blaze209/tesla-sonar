package gv;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class q extends f0.e.d.a.b.AbstractC1432d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f69927c;

    static final class b extends f0.e.d.a.b.AbstractC1432d.AbstractC1433a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f69928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f69929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f69930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f69931d;

        b() {
        }

        @Override // gv.f0.e.d.a.b.AbstractC1432d.AbstractC1433a
        public f0.e.d.a.b.AbstractC1432d a() {
            String str;
            String str2;
            if (this.f69931d == 1 && (str = this.f69928a) != null && (str2 = this.f69929b) != null) {
                return new q(str, str2, this.f69930c);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f69928a == null) {
                sb2.append(" name");
            }
            if (this.f69929b == null) {
                sb2.append(" code");
            }
            if ((1 & this.f69931d) == 0) {
                sb2.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.e.d.a.b.AbstractC1432d.AbstractC1433a
        public f0.e.d.a.b.AbstractC1432d.AbstractC1433a b(long j11) {
            this.f69930c = j11;
            this.f69931d = (byte) (this.f69931d | 1);
            return this;
        }

        @Override // gv.f0.e.d.a.b.AbstractC1432d.AbstractC1433a
        public f0.e.d.a.b.AbstractC1432d.AbstractC1433a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f69929b = str;
            return this;
        }

        @Override // gv.f0.e.d.a.b.AbstractC1432d.AbstractC1433a
        public f0.e.d.a.b.AbstractC1432d.AbstractC1433a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f69928a = str;
            return this;
        }
    }

    @Override // gv.f0.e.d.a.b.AbstractC1432d
    @NonNull
    public long b() {
        return this.f69927c;
    }

    @Override // gv.f0.e.d.a.b.AbstractC1432d
    @NonNull
    public String c() {
        return this.f69926b;
    }

    @Override // gv.f0.e.d.a.b.AbstractC1432d
    @NonNull
    public String d() {
        return this.f69925a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.a.b.AbstractC1432d) {
            f0.e.d.a.b.AbstractC1432d abstractC1432d = (f0.e.d.a.b.AbstractC1432d) obj;
            if (this.f69925a.equals(abstractC1432d.d()) && this.f69926b.equals(abstractC1432d.c()) && this.f69927c == abstractC1432d.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f69925a.hashCode() ^ 1000003) * 1000003) ^ this.f69926b.hashCode()) * 1000003;
        long j11 = this.f69927c;
        return iHashCode ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f69925a + ", code=" + this.f69926b + ", address=" + this.f69927c + "}";
    }

    private q(String str, String str2, long j11) {
        this.f69925a = str;
        this.f69926b = str2;
        this.f69927c = j11;
    }
}
