package mk;

/* JADX INFO: loaded from: classes3.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f92271a;

    private c() {
    }

    public static synchronized c b() {
        try {
            if (f92271a == null) {
                f92271a = new c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f92271a;
    }

    @Override // mk.b
    public void a(a aVar) {
    }
}
