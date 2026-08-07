package sk;

/* JADX INFO: loaded from: classes3.dex */
public class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e f111321a;

    public static synchronized e b() {
        try {
            if (f111321a == null) {
                f111321a = new e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f111321a;
    }

    @Override // sk.d
    public void a(c cVar) {
    }
}
