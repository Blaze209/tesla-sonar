package yh0;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements qj0.e<q> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final r f125583a = new r();
    }

    public static r a() {
        return a.f125583a;
    }

    public static q c() {
        return new q();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q get() {
        return c();
    }
}
