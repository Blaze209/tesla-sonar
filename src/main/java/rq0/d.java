package rq0;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f108704a = 4;

    public static int a(int i11) {
        return 4 - (i11 % 4);
    }

    public static int b(char c11, CharSequence charSequence, int i11) {
        int length = charSequence.length();
        while (i11 < length) {
            if (charSequence.charAt(i11) == c11) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int c(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt == '\n' || cCharAt == '\r') {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    private static int d(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt != ' ') {
                switch (cCharAt) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i11;
                }
            }
            i11++;
        }
        return -1;
    }

    public static boolean e(CharSequence charSequence) {
        int length = charSequence.length();
        return k(' ', charSequence, 0, length) != length;
    }

    public static boolean f(CharSequence charSequence) {
        return d(charSequence, 0) == -1;
    }

    public static boolean g(CharSequence charSequence, int i11) {
        if (i11 >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i11);
        switch (cCharAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (cCharAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (cCharAt) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                                return true;
                            default:
                                switch (cCharAt) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static boolean h(CharSequence charSequence, int i11) {
        return Character.isLetter(Character.codePointAt(charSequence, i11));
    }

    public static boolean i(CharSequence charSequence, int i11) {
        if (i11 >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i11);
        return cCharAt == '\t' || cCharAt == ' ';
    }

    public static CharSequence j(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb2 = null;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt == 0) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append(charSequence, 0, i11);
                }
                sb2.append((char) 65533);
            } else if (sb2 != null) {
                sb2.append(cCharAt);
            }
        }
        return sb2 != null ? sb2.toString() : charSequence;
    }

    public static int k(char c11, CharSequence charSequence, int i11, int i12) {
        while (i11 < i12) {
            if (charSequence.charAt(i11) != c11) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static int l(char c11, CharSequence charSequence, int i11, int i12) {
        while (i11 >= i12) {
            if (charSequence.charAt(i11) != c11) {
                return i11;
            }
            i11--;
        }
        return i12 - 1;
    }

    public static int m(CharSequence charSequence, int i11, int i12) {
        while (i11 < i12) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static int n(CharSequence charSequence, int i11, int i12) {
        while (i11 >= i12) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i11;
            }
            i11--;
        }
        return i12 - 1;
    }
}
