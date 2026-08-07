package dw;

/* JADX INFO: loaded from: classes5.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f61049a;

    private b() {
    }

    public static b a() {
        if (f61049a == null) {
            f61049a = new b();
        }
        return f61049a;
    }

    @Override // dw.a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
