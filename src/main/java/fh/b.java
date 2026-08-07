package fh;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f65950a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile String f65951b;

    public static String a() {
        c cVarA = c.a(c.CANCELED.c());
        return b(cVarA.c(), cVarA.b(), "");
    }

    public static String b(int i11, String str, String str2) {
        return "resultStatus={" + i11 + "};memo={" + str + "};result={" + str2 + "}";
    }

    public static void c(String str) {
        f65951b = str;
    }

    public static void d(boolean z11) {
        f65950a = z11;
    }

    public static String e() {
        c cVarA = c.a(c.DOUBLE_REQUEST.c());
        return b(cVarA.c(), cVarA.b(), "");
    }

    public static boolean f() {
        return f65950a;
    }

    public static String g() {
        return f65951b;
    }

    public static String h() {
        c cVarA = c.a(c.PARAMS_ERROR.c());
        return b(cVarA.c(), cVarA.b(), "");
    }
}
