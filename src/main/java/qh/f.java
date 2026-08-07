package qh;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f105515a = Pattern.compile("([\t\r\n])+");

    public static int a(String str) {
        if (str.length() <= 0) {
            return 0;
        }
        int i11 = 0;
        for (char c11 : str.toCharArray()) {
            i11 = (i11 * 31) + c11;
        }
        return i11;
    }

    public static boolean b(String str) {
        return str == null || str.length() <= 0;
    }
}
