package e40;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements qj0.e<Boolean> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final h f61753a = new h();
    }

    public static h a() {
        return a.f61753a;
    }

    public static boolean c() {
        return c.INSTANCE.g();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c());
    }
}
