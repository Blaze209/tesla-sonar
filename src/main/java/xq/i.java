package xq;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements rq.b<Integer> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final i f123964a = new i();
    }

    public static i a() {
        return a.f123964a;
    }

    public static int c() {
        return f.c();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer get() {
        return Integer.valueOf(c());
    }
}
