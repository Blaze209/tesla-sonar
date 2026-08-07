package v70;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements qj0.e<z30.d> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final w f118323a = new w();
    }

    public static w a() {
        return a.f118323a;
    }

    public static z30.d c() {
        return (z30.d) qj0.h.d(r.INSTANCE.g());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z30.d get() {
        return c();
    }
}
