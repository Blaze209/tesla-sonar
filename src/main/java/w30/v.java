package w30;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements qj0.e<u> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final v f120695a = new v();
    }

    public static v a() {
        return a.f120695a;
    }

    public static u c() {
        return new u();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c();
    }
}
