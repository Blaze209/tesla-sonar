package rh0;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements qj0.e<c> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f108264a = new d();
    }

    public static d a() {
        return a.f108264a;
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
