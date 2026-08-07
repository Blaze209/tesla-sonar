package xq;

/* JADX INFO: loaded from: classes4.dex */
final class a extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f123942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f123943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f123944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f123945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f123946f;

    static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f123947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f123948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f123949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f123950d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f123951e;

        b() {
        }

        @Override // xq.e.a
        e a() {
            String str = "";
            if (this.f123947a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f123948b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f123949c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f123950d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f123951e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f123947a.longValue(), this.f123948b.intValue(), this.f123949c.intValue(), this.f123950d.longValue(), this.f123951e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xq.e.a
        e.a b(int i11) {
            this.f123949c = Integer.valueOf(i11);
            return this;
        }

        @Override // xq.e.a
        e.a c(long j11) {
            this.f123950d = Long.valueOf(j11);
            return this;
        }

        @Override // xq.e.a
        e.a d(int i11) {
            this.f123948b = Integer.valueOf(i11);
            return this;
        }

        @Override // xq.e.a
        e.a e(int i11) {
            this.f123951e = Integer.valueOf(i11);
            return this;
        }

        @Override // xq.e.a
        e.a f(long j11) {
            this.f123947a = Long.valueOf(j11);
            return this;
        }
    }

    @Override // xq.e
    int b() {
        return this.f123944d;
    }

    @Override // xq.e
    long c() {
        return this.f123945e;
    }

    @Override // xq.e
    int d() {
        return this.f123943c;
    }

    @Override // xq.e
    int e() {
        return this.f123946f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f123942b == eVar.f() && this.f123943c == eVar.d() && this.f123944d == eVar.b() && this.f123945e == eVar.c() && this.f123946f == eVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // xq.e
    long f() {
        return this.f123942b;
    }

    public int hashCode() {
        long j11 = this.f123942b;
        int i11 = (((((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ this.f123943c) * 1000003) ^ this.f123944d) * 1000003;
        long j12 = this.f123945e;
        return ((i11 ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f123946f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f123942b + ", loadBatchSize=" + this.f123943c + ", criticalSectionEnterTimeoutMs=" + this.f123944d + ", eventCleanUpAge=" + this.f123945e + ", maxBlobByteSizePerRow=" + this.f123946f + "}";
    }

    private a(long j11, int i11, int i12, long j12, int i13) {
        this.f123942b = j11;
        this.f123943c = i11;
        this.f123944d = i12;
        this.f123945e = j12;
        this.f123946f = i13;
    }
}
