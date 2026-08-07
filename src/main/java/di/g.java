package di;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes3.dex */
public class g {
    public static String a(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (lh.b.E().D(null)) {
            return String.format("[%s][%s]", str, str2);
        }
        return "[" + str + "][" + str2 + "]";
    }

    public static void c(String str, String str2, Throwable th2) {
        b(a(str, str2) + " " + e(th2));
    }

    public static void d(Throwable th2) {
        if (th2 == null) {
            return;
        }
        try {
            b(e(th2));
        } catch (Throwable unused) {
        }
    }

    public static String e(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void f(String str, String str2) {
        b(a(str, str2));
    }

    public static void g(String str, String str2) {
        b(a(str, str2));
    }

    public static void h(String str, String str2) {
        b(a(str, str2));
    }

    public static void i(String str, String str2) {
        b(a(str, str2));
    }

    public static void b(String str) {
    }
}
