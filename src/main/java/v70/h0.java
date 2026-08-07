package v70;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 implements qj0.e<Boolean> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final h0 f118249a = new h0();
    }

    public static h0 a() {
        return a.f118249a;
    }

    public static boolean c() {
        return f0.INSTANCE.b();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c());
    }
}
