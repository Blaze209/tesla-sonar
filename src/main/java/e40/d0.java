package e40;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements qj0.e<w70.j> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d0 f61699a = new d0();
    }

    public static d0 a() {
        return a.f61699a;
    }

    public static w70.j c() {
        return l.INSTANCE.t();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w70.j get() {
        return c();
    }
}
