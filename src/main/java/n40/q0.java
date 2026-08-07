package n40;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 implements qj0.e<p0> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final q0 f93238a = new q0();
    }

    public static q0 a() {
        return a.f93238a;
    }

    public static p0 c() {
        return new p0();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p0 get() {
        return c();
    }
}
