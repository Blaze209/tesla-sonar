package t70;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements qj0.e<c> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f112853a = new d();
    }

    public static d a() {
        return a.f112853a;
    }

    public static c c() {
        return new c();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c();
    }
}
