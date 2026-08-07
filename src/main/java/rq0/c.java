package rq0;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes10.dex */
public class c {
    public static int a(CharSequence charSequence, int i11) {
        char cCharAt;
        if (i11 >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i11) != '<') {
            return b(charSequence, i11);
        }
        while (true) {
            i11++;
            if (i11 >= charSequence.length() || (cCharAt = charSequence.charAt(i11)) == '\n' || cCharAt == '<') {
                break;
            }
            if (cCharAt == '>') {
                return i11 + 1;
            }
            if (cCharAt == '\\') {
                int i12 = i11 + 1;
                if (d.g(charSequence, i12)) {
                    i11 = i12;
                }
            }
        }
        return -1;
    }

    private static int b(CharSequence charSequence, int i11) {
        int i12 = 0;
        int i13 = i11;
        while (i13 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt != 0 && cCharAt != ' ') {
                if (cCharAt == '\\') {
                    int i14 = i13 + 1;
                    if (d.g(charSequence, i14)) {
                        i13 = i14;
                    }
                } else if (cCharAt == '(') {
                    i12++;
                    if (i12 > 32) {
                        return -1;
                    }
                } else if (cCharAt != ')') {
                    if (Character.isISOControl(cCharAt)) {
                        if (i13 == i11) {
                            return -1;
                        }
                    }
                } else if (i12 != 0) {
                    i12--;
                }
                i13++;
            } else if (i13 == i11) {
                return -1;
            }
            return i13;
        }
        return charSequence.length();
    }

    public static int c(CharSequence charSequence, int i11) {
        while (i11 < charSequence.length()) {
            switch (charSequence.charAt(i11)) {
                case '[':
                    return -1;
                case '\\':
                    int i12 = i11 + 1;
                    if (d.g(charSequence, i12)) {
                        i11 = i12;
                    }
                    break;
                case ']':
                    return i11;
            }
            i11++;
        }
        return charSequence.length();
    }

    public static int d(CharSequence charSequence, int i11) {
        if (i11 >= charSequence.length()) {
            return -1;
        }
        char cCharAt = charSequence.charAt(i11);
        char c11 = CoreConstants.DOUBLE_QUOTE_CHAR;
        if (cCharAt != '\"') {
            c11 = CoreConstants.SINGLE_QUOTE_CHAR;
            if (cCharAt != '\'') {
                if (cCharAt != '(') {
                    return -1;
                }
                c11 = CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }
        int iE = e(charSequence, i11 + 1, c11);
        if (iE != -1 && iE < charSequence.length() && charSequence.charAt(iE) == c11) {
            return iE + 1;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:21:0x001a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018 A[DONT_INVERT] */
    public static int e(CharSequence charSequence, int i11, char c11) {
        while (i11 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt == '\\') {
                int i12 = i11 + 1;
                if (d.g(charSequence, i12)) {
                    i11 = i12;
                } else {
                    if (cCharAt == c11) {
                        return i11;
                    }
                    if (c11 == ')' && cCharAt == '(') {
                        return -1;
                    }
                }
            } else {
                if (cCharAt == c11) {
                    return i11;
                }
                if (c11 == ')') {
                    continue;
                }
            }
            i11++;
        }
        return charSequence.length();
    }
}
