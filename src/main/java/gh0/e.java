package gh0;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements qj0.e<d> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f68960a = new e();
    }

    public static e a() {
        return a.f68960a;
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
