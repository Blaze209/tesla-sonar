package e40;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements qj0.e<Boolean> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final s f61774a = new s();
    }

    public static s a() {
        return a.f61774a;
    }

    public static boolean c() {
        return l.INSTANCE.i();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c());
    }
}
