package sq;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f111541b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f111542a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f111543a = null;

        a() {
        }

        public b a() {
            return new b(this.f111543a);
        }

        public a b(e eVar) {
            this.f111543a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f111542a = eVar;
    }

    public static a b() {
        return new a();
    }

    @uv.d(tag = 1)
    public e a() {
        return this.f111542a;
    }
}
