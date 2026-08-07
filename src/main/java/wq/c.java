package wq;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class c extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f122183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f122184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<f.c> f122185c;

    static final class b extends f.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f122186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f122187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set<f.c> f122188c;

        b() {
        }

        @Override // wq.f.b.a
        public f.b a() {
            String str = "";
            if (this.f122186a == null) {
                str = " delta";
            }
            if (this.f122187b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f122188c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f122186a.longValue(), this.f122187b.longValue(), this.f122188c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // wq.f.b.a
        public f.b.a b(long j11) {
            this.f122186a = Long.valueOf(j11);
            return this;
        }

        @Override // wq.f.b.a
        public f.b.a c(Set<f.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f122188c = set;
            return this;
        }

        @Override // wq.f.b.a
        public f.b.a d(long j11) {
            this.f122187b = Long.valueOf(j11);
            return this;
        }
    }

    @Override // wq.f.b
    long b() {
        return this.f122183a;
    }

    @Override // wq.f.b
    Set<f.c> c() {
        return this.f122185c;
    }

    @Override // wq.f.b
    long d() {
        return this.f122184b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f.b) {
            f.b bVar = (f.b) obj;
            if (this.f122183a == bVar.b() && this.f122184b == bVar.d() && this.f122185c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f122183a;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003;
        long j12 = this.f122184b;
        return ((i11 ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f122185c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f122183a + ", maxAllowedDelay=" + this.f122184b + ", flags=" + this.f122185c + "}";
    }

    private c(long j11, long j12, Set<f.c> set) {
        this.f122183a = j11;
        this.f122184b = j12;
        this.f122185c = set;
    }
}
