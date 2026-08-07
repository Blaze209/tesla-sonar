package o50;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements qj0.e<g> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final h f96775a = new h();
    }

    public static h a() {
        return a.f96775a;
    }

    public static g c() {
        return new g();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c();
    }
}
