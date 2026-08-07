package sq;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f111544c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f111545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f111546b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f111547a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f111548b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f111547a, this.f111548b);
        }

        public a b(long j11) {
            this.f111547a = j11;
            return this;
        }

        public a c(b bVar) {
            this.f111548b = bVar;
            return this;
        }
    }

    public enum b implements uv.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        b(int i11) {
            this.number_ = i11;
        }

        @Override // uv.c
        public int getNumber() {
            return this.number_;
        }
    }

    c(long j11, b bVar) {
        this.f111545a = j11;
        this.f111546b = bVar;
    }

    public static a c() {
        return new a();
    }

    @uv.d(tag = 1)
    public long a() {
        return this.f111545a;
    }

    @uv.d(tag = 3)
    public b b() {
        return this.f111546b;
    }
}
