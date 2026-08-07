package xq;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements rq.b<e> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final j f123968a = new j();
    }

    public static j a() {
        return a.f123968a;
    }

    public static e c() {
        return (e) rq.d.d(f.d());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c();
    }
}
