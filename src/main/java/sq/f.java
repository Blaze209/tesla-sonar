package sq;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f111559c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f111560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f111561b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f111562a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f111563b = 0;

        a() {
        }

        public f a() {
            return new f(this.f111562a, this.f111563b);
        }

        public a b(long j11) {
            this.f111563b = j11;
            return this;
        }

        public a c(long j11) {
            this.f111562a = j11;
            return this;
        }
    }

    f(long j11, long j12) {
        this.f111560a = j11;
        this.f111561b = j12;
    }

    public static a c() {
        return new a();
    }

    @uv.d(tag = 2)
    public long a() {
        return this.f111561b;
    }

    @uv.d(tag = 1)
    public long b() {
        return this.f111560a;
    }
}
