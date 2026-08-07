package yg;

/* JADX INFO: loaded from: classes3.dex */
public class f {
    public static String a(String str) {
        try {
            System.clearProperty(str);
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void b(String str, String str2) {
        try {
            System.clearProperty(str);
        } catch (Throwable unused) {
        }
    }
}
