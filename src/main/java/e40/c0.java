package e40;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 implements qj0.e<l70.d> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c0 f61696a = new c0();
    }

    public static c0 a() {
        return a.f61696a;
    }

    public static l70.d c() {
        return (l70.d) qj0.h.d(l.INSTANCE.s());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l70.d get() {
        return c();
    }
}
