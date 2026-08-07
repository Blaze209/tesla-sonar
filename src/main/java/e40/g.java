package e40;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements qj0.e<wn0.a<Long>> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g f61732a = new g();
    }

    public static g a() {
        return a.f61732a;
    }

    public static wn0.a<Long> c() {
        return (wn0.a) qj0.h.d(c.INSTANCE.f());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public wn0.a<Long> get() {
        return c();
    }
}
