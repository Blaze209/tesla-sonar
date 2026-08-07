package i70;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements qj0.e<i> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final j f76108a = new j();
    }

    public static j a() {
        return a.f76108a;
    }

    public static i c() {
        return new i();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c();
    }
}
