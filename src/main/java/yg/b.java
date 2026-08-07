package yg;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class b {
    public static String a(String str) {
        String strA;
        try {
            strA = f.a(str);
        } catch (Throwable unused) {
            strA = "";
        }
        if (!sg.a.c(strA)) {
            return strA;
        }
        return c.a(".SystemConfig" + File.separator + str);
    }

    public static void b(String str, String str2) {
        try {
            f.b(str, str2);
        } catch (Throwable unused) {
        }
        if (c.c()) {
            c.b(".SystemConfig" + File.separator + str, str2);
        }
    }
}
