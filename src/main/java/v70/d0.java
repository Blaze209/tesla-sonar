package v70;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements qj0.e<h80.t.a> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d0 f118144a = new d0();
    }

    public static d0 a() {
        return a.f118144a;
    }

    public static h80.t.a c() {
        return (h80.t.a) qj0.h.d(r.INSTANCE.n());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h80.t.a get() {
        return c();
    }
}
