package gv;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class w extends f0.e.d.AbstractC1440e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0.e.d.AbstractC1440e.b f69974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f69976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f69977d;

    static final class b extends f0.e.d.AbstractC1440e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f0.e.d.AbstractC1440e.b f69978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f69979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f69980c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f69981d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f69982e;

        b() {
        }

        @Override // gv.f0.e.d.AbstractC1440e.a
        public f0.e.d.AbstractC1440e a() {
            f0.e.d.AbstractC1440e.b bVar;
            String str;
            String str2;
            if (this.f69982e == 1 && (bVar = this.f69978a) != null && (str = this.f69979b) != null && (str2 = this.f69980c) != null) {
                return new w(bVar, str, str2, this.f69981d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f69978a == null) {
                sb2.append(" rolloutVariant");
            }
            if (this.f69979b == null) {
                sb2.append(" parameterKey");
            }
            if (this.f69980c == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f69982e) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.e.d.AbstractC1440e.a
        public f0.e.d.AbstractC1440e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f69979b = str;
            return this;
        }

        @Override // gv.f0.e.d.AbstractC1440e.a
        public f0.e.d.AbstractC1440e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f69980c = str;
            return this;
        }

        @Override // gv.f0.e.d.AbstractC1440e.a
        public f0.e.d.AbstractC1440e.a d(f0.e.d.AbstractC1440e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f69978a = bVar;
            return this;
        }

        @Override // gv.f0.e.d.AbstractC1440e.a
        public f0.e.d.AbstractC1440e.a e(long j11) {
            this.f69981d = j11;
            this.f69982e = (byte) (this.f69982e | 1);
            return this;
        }
    }

    @Override // gv.f0.e.d.AbstractC1440e
    @NonNull
    public String b() {
        return this.f69975b;
    }

    @Override // gv.f0.e.d.AbstractC1440e
    @NonNull
    public String c() {
        return this.f69976c;
    }

    @Override // gv.f0.e.d.AbstractC1440e
    @NonNull
    public f0.e.d.AbstractC1440e.b d() {
        return this.f69974a;
    }

    @Override // gv.f0.e.d.AbstractC1440e
    @NonNull
    public long e() {
        return this.f69977d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.AbstractC1440e) {
            f0.e.d.AbstractC1440e abstractC1440e = (f0.e.d.AbstractC1440e) obj;
            if (this.f69974a.equals(abstractC1440e.d()) && this.f69975b.equals(abstractC1440e.b()) && this.f69976c.equals(abstractC1440e.c()) && this.f69977d == abstractC1440e.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.f69974a.hashCode() ^ 1000003) * 1000003) ^ this.f69975b.hashCode()) * 1000003) ^ this.f69976c.hashCode()) * 1000003;
        long j11 = this.f69977d;
        return iHashCode ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f69974a + ", parameterKey=" + this.f69975b + ", parameterValue=" + this.f69976c + ", templateVersion=" + this.f69977d + "}";
    }

    private w(f0.e.d.AbstractC1440e.b bVar, String str, String str2, long j11) {
        this.f69974a = bVar;
        this.f69975b = str;
        this.f69976c = str2;
        this.f69977d = j11;
    }
}
