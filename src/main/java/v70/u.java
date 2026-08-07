package v70;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements qj0.e<r70.a> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final u f118321a = new u();
    }

    public static u a() {
        return a.f118321a;
    }

    public static r70.a c() {
        return (r70.a) qj0.h.d(r.INSTANCE.e());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r70.a get() {
        return c();
    }
}
