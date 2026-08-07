package kk0;

/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f86288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static /* synthetic */ Class f86289b;

    static {
        Class clsA = f86289b;
        if (clsA == null) {
            clsA = a("freemarker.log._Log4jOverSLF4JTester");
            f86289b = clsA;
        }
        f86288a = clsA.getName();
    }

    static /* synthetic */ Class a(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }
}
