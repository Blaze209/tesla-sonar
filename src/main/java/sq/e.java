package sq;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e f111554c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f111555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f111556b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f111557a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f111558b = 0;

        a() {
        }

        public e a() {
            return new e(this.f111557a, this.f111558b);
        }

        public a b(long j11) {
            this.f111557a = j11;
            return this;
        }

        public a c(long j11) {
            this.f111558b = j11;
            return this;
        }
    }

    e(long j11, long j12) {
        this.f111555a = j11;
        this.f111556b = j12;
    }

    public static a c() {
        return new a();
    }

    @uv.d(tag = 1)
    public long a() {
        return this.f111555a;
    }

    @uv.d(tag = 2)
    public long b() {
        return this.f111556b;
    }
}
