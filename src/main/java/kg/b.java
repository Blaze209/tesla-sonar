package kg;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f86047a = a.ONLINE;

    public enum a {
        ONLINE,
        PRE_SANDBOX,
        SANDBOX
    }

    public static boolean a() {
        return f86047a == a.SANDBOX;
    }

    public static boolean b() {
        return f86047a == a.PRE_SANDBOX;
    }

    public static boolean c() {
        return b() || a();
    }
}
