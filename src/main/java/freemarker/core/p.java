package freemarker.core;

/* JADX INFO: loaded from: classes8.dex */
public final class p {
    private static String a(String str) {
        return mk0.e.i(mk0.e.i(mk0.e.i(str, "-", "\\-"), ".", "\\."), ":", "\\:");
    }

    public static String b(String str) {
        return a(str);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    /* JADX WARN: Code duplicated, block: B:40:0x0037 A[SYNTHETIC] */
    public static String c(String str) {
        char c11 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (i11 == 0) {
                if (mk0.e.e(cCharAt)) {
                    continue;
                } else if (cCharAt == '@') {
                    if ((c11 == 0 && c11 != '\\') || (cCharAt != '-' && cCharAt != '.' && cCharAt != ':')) {
                        c11 = '\"';
                        break;
                    }
                } else {
                    continue;
                }
            } else if (!mk0.e.d(cCharAt)) {
                if (cCharAt == '@') {
                    c11 = c11 == 0 ? '\\' : '\\';
                    c11 = '\"';
                    break;
                }
                continue;
            } else {
                continue;
            }
        }
        if (c11 == 0) {
            return str;
        }
        if (c11 == '\"') {
            return mk0.e.c(str);
        }
        if (c11 == '\\') {
            return a(str);
        }
        throw new BugException();
    }
}
