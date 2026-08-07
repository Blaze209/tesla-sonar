package t60;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements qj0.e<d> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final e f112683a = new e();
    }

    public static e a() {
        return a.f112683a;
    }

    public static d c() {
        return new d();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c();
    }
}
