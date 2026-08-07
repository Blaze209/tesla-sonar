package gv;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class o extends f0.e.d.a.b.AbstractC1428a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f69905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f69906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f69907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f69908d;

    static final class b extends f0.e.d.a.b.AbstractC1428a.AbstractC1429a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f69909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f69910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f69911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f69912d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f69913e;

        b() {
        }

        @Override // gv.f0.e.d.a.b.AbstractC1428a.AbstractC1429a
        public f0.e.d.a.b.AbstractC1428a a() {
            String str;
            if (this.f69913e == 3 && (str = this.f69911c) != null) {
                return new o(this.f69909a, this.f69910b, str, this.f69912d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f69913e & 1) == 0) {
                sb2.append(" baseAddress");
            }
            if ((this.f69913e & 2) == 0) {
                sb2.append(" size");
            }
            if (this.f69911c == null) {
                sb2.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.e.d.a.b.AbstractC1428a.AbstractC1429a
        public f0.e.d.a.b.AbstractC1428a.AbstractC1429a b(long j11) {
            this.f69909a = j11;
            this.f69913e = (byte) (this.f69913e | 1);
            return this;
        }

        @Override // gv.f0.e.d.a.b.AbstractC1428a.AbstractC1429a
        public f0.e.d.a.b.AbstractC1428a.AbstractC1429a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f69911c = str;
            return this;
        }

        @Override // gv.f0.e.d.a.b.AbstractC1428a.AbstractC1429a
        public f0.e.d.a.b.AbstractC1428a.AbstractC1429a d(long j11) {
            this.f69910b = j11;
            this.f69913e = (byte) (this.f69913e | 2);
            return this;
        }

        @Override // gv.f0.e.d.a.b.AbstractC1428a.AbstractC1429a
        public f0.e.d.a.b.AbstractC1428a.AbstractC1429a e(String str) {
            this.f69912d = str;
            return this;
        }
    }

    @Override // gv.f0.e.d.a.b.AbstractC1428a
    @NonNull
    public long b() {
        return this.f69905a;
    }

    @Override // gv.f0.e.d.a.b.AbstractC1428a
    @NonNull
    public String c() {
        return this.f69907c;
    }

    @Override // gv.f0.e.d.a.b.AbstractC1428a
    public long d() {
        return this.f69906b;
    }

    @Override // gv.f0.e.d.a.b.AbstractC1428a
    public String e() {
        return this.f69908d;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.a.b.AbstractC1428a) {
            f0.e.d.a.b.AbstractC1428a abstractC1428a = (f0.e.d.a.b.AbstractC1428a) obj;
            if (this.f69905a == abstractC1428a.b() && this.f69906b == abstractC1428a.d() && this.f69907c.equals(abstractC1428a.c()) && ((str = this.f69908d) != null ? str.equals(abstractC1428a.e()) : abstractC1428a.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f69905a;
        long j12 = this.f69906b;
        int iHashCode = (((((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f69907c.hashCode()) * 1000003;
        String str = this.f69908d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f69905a + ", size=" + this.f69906b + ", name=" + this.f69907c + ", uuid=" + this.f69908d + "}";
    }

    private o(long j11, long j12, String str, String str2) {
        this.f69905a = j11;
        this.f69906b = j12;
        this.f69907c = str;
        this.f69908d = str2;
    }
}
