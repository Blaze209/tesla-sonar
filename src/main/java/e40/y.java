package e40;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements qj0.e<h80.t.a> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final y f61780a = new y();
    }

    public static y a() {
        return a.f61780a;
    }

    public static h80.t.a c() {
        return (h80.t.a) qj0.h.d(l.INSTANCE.o());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h80.t.a get() {
        return c();
    }
}
