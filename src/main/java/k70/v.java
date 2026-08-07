package k70;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements qj0.e<t80.p> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final v f85313a = new v();
    }

    public static v a() {
        return a.f85313a;
    }

    public static t80.p c() {
        return (t80.p) qj0.h.d(u.INSTANCE.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t80.p get() {
        return c();
    }
}
