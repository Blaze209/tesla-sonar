package zq;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements rq.b<zq.a> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f128491a = new c();
    }

    public static c a() {
        return a.f128491a;
    }

    public static zq.a b() {
        return (zq.a) rq.d.d(b.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public zq.a get() {
        return b();
    }
}
