package c70;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements qj0.e<Boolean> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final e f18902a = new e();
    }

    public static e a() {
        return a.f18902a;
    }

    public static boolean c() {
        return b.f18900a.c();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c());
    }
}
