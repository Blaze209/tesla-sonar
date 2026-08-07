package v70;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements qj0.e<Boolean> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final x f118324a = new x();
    }

    public static x a() {
        return a.f118324a;
    }

    public static boolean c() {
        return r.INSTANCE.h();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c());
    }
}
