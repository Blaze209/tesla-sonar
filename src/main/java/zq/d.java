package zq;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements rq.b<zq.a> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f128492a = new d();
    }

    public static d a() {
        return a.f128492a;
    }

    public static zq.a c() {
        return (zq.a) rq.d.d(b.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public zq.a get() {
        return c();
    }
}
