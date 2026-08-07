package k70;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements qj0.e<f30.l> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final t f85311a = new t();
    }

    public static t a() {
        return a.f85311a;
    }

    public static f30.l c() {
        return (f30.l) qj0.h.d(s.INSTANCE.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f30.l get() {
        return c();
    }
}
