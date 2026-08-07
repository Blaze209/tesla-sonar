package xq;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements rq.b<String> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g f123962a = new g();
    }

    public static g a() {
        return a.f123962a;
    }

    public static String b() {
        return (String) rq.d.d(f.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
