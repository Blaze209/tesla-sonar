package bp;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f17879a;

    private a() {
    }

    public static void a(b bVar) {
        synchronized (a.class) {
            try {
                if (f17879a != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                f17879a = bVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(b bVar) {
        if (c()) {
            return;
        }
        a(bVar);
    }

    public static boolean c() {
        boolean z11;
        synchronized (a.class) {
            z11 = f17879a != null;
        }
        return z11;
    }

    public static boolean d(String str) {
        return e(str, 0);
    }

    public static boolean e(String str, int i11) {
        b bVar;
        synchronized (a.class) {
            bVar = f17879a;
            if (bVar == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return bVar.a(str, i11);
    }
}
