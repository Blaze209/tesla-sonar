package e40;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements qj0.e<Boolean> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final z f61781a = new z();
    }

    public static z a() {
        return a.f61781a;
    }

    public static boolean c() {
        return l.INSTANCE.p();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c());
    }
}
