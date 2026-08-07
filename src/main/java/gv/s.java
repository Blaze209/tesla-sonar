package gv;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class s extends f0.e.d.a.b.AbstractC1434e.AbstractC1436b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f69939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f69941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f69942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f69943e;

    static final class b extends f0.e.d.a.b.AbstractC1434e.AbstractC1436b.AbstractC1437a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f69944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f69945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f69946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f69947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f69948e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f69949f;

        b() {
        }

        @Override // gv.f0.e.d.a.b.AbstractC1434e.AbstractC1436b.AbstractC1437a
        public f0.e.d.a.b.AbstractC1434e.AbstractC1436b a() {
            String str;
            if (this.f69949f == 7 && (str = this.f69945b) != null) {
                return new s(this.f69944a, str, this.f69946c, this.f69947d, this.f69948e);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f69949f & 1) == 0) {
                sb2.append(" pc");
            }
            if (this.f69945b == null) {
                sb2.append(" symbol");
            }
            if ((this.f69949f & 2) == 0) {
                sb2.append(" offset");
            }
            if ((this.f69949f & 4) == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.e.d.a.b.AbstractC1434e.AbstractC1436b.AbstractC1437a
        public f0.e.d.a.b.AbstractC1434e.AbstractC1436b.AbstractC1437a b(String str) {
            this.f69946c = str;
            return this;
        }

        @Override // gv.f0.e.d.a.b.AbstractC1434e.AbstractC1436b.AbstractC1437a
        public f0.e.d.a.b.AbstractC1434e.AbstractC1436b.AbstractC1437a c(int i11) {
            this.f69948e = i11;
            this.f69949f = (byte) (this.f69949f | 4);
            return this;
        }

        @Override // gv.f0.e.d.a.b.AbstractC1434e.AbstractC1436b.AbstractC1437a
        public f0.e.d.a.b.AbstractC1434e.AbstractC1436b.AbstractC1437a d(long j11) {
            this.f69947d = j11;
            this.f69949f = (byte) (this.f69949f | 2);
            return this;
        }

        @Override // gv.f0.e.d.a.b.AbstractC1434e.AbstractC1436b.AbstractC1437a
        public f0.e.d.a.b.AbstractC1434e.AbstractC1436b.AbstractC1437a e(long j11) {
            this.f69944a = j11;
            this.f69949f = (byte) (this.f69949f | 1);
            return this;
        }

        @Override // gv.f0.e.d.a.b.AbstractC1434e.AbstractC1436b.AbstractC1437a
        public f0.e.d.a.b.AbstractC1434e.AbstractC1436b.AbstractC1437a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f69945b = str;
            return this;
        }
    }

    @Override // gv.f0.e.d.a.b.AbstractC1434e.AbstractC1436b
    public String b() {
        return this.f69941c;
    }

    @Override // gv.f0.e.d.a.b.AbstractC1434e.AbstractC1436b
    public int c() {
        return this.f69943e;
    }

    @Override // gv.f0.e.d.a.b.AbstractC1434e.AbstractC1436b
    public long d() {
        return this.f69942d;
    }

    @Override // gv.f0.e.d.a.b.AbstractC1434e.AbstractC1436b
    public long e() {
        return this.f69939a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.a.b.AbstractC1434e.AbstractC1436b) {
            f0.e.d.a.b.AbstractC1434e.AbstractC1436b abstractC1436b = (f0.e.d.a.b.AbstractC1434e.AbstractC1436b) obj;
            if (this.f69939a == abstractC1436b.e() && this.f69940b.equals(abstractC1436b.f()) && ((str = this.f69941c) != null ? str.equals(abstractC1436b.b()) : abstractC1436b.b() == null) && this.f69942d == abstractC1436b.d() && this.f69943e == abstractC1436b.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // gv.f0.e.d.a.b.AbstractC1434e.AbstractC1436b
    @NonNull
    public String f() {
        return this.f69940b;
    }

    public int hashCode() {
        long j11 = this.f69939a;
        int iHashCode = (((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ this.f69940b.hashCode()) * 1000003;
        String str = this.f69941c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j12 = this.f69942d;
        return ((iHashCode2 ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f69943e;
    }

    public String toString() {
        return "Frame{pc=" + this.f69939a + ", symbol=" + this.f69940b + ", file=" + this.f69941c + ", offset=" + this.f69942d + ", importance=" + this.f69943e + "}";
    }

    private s(long j11, String str, String str2, long j12, int i11) {
        this.f69939a = j11;
        this.f69940b = str;
        this.f69941c = str2;
        this.f69942d = j12;
        this.f69943e = i11;
    }
}
