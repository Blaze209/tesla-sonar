package e80;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements qj0.e<Boolean> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final h f62259a = new h();
    }

    public static h a() {
        return a.f62259a;
    }

    public static boolean c() {
        return d.INSTANCE.d();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c());
    }
}
