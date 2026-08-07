package sz;

import com.adyen.checkout.components.core.Address;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f111948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f111949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f111950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f111951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f111952e;

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements h {
        private b() {
        }

        @Override // sz.j.h
        public void a(String str, Appendable appendable) {
            try {
                int length = str.length();
                for (int i11 = 0; i11 < length; i11++) {
                    char cCharAt = str.charAt(i11);
                    if (cCharAt == '\f') {
                        appendable.append("\\f");
                    } else if (cCharAt == '\r') {
                        appendable.append("\\r");
                    } else if (cCharAt == '\"') {
                        appendable.append("\\\"");
                    } else if (cCharAt == '/') {
                        appendable.append("\\/");
                    } else if (cCharAt != '\\') {
                        switch (cCharAt) {
                            case '\b':
                                appendable.append("\\b");
                                break;
                            case '\t':
                                appendable.append("\\t");
                                break;
                            case '\n':
                                appendable.append("\\n");
                                break;
                            default:
                                if ((cCharAt < 0 || cCharAt > 31) && ((cCharAt < 127 || cCharAt > 159) && (cCharAt < 8192 || cCharAt > 8447))) {
                                    appendable.append(cCharAt);
                                } else {
                                    appendable.append("\\u");
                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> '\f') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> '\b') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> 4) & 15));
                                    appendable.append("0123456789ABCDEF".charAt(cCharAt & 15));
                                }
                                break;
                        }
                    } else {
                        appendable.append("\\\\");
                    }
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Error");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements h {
        private c() {
        }

        @Override // sz.j.h
        public void a(String str, Appendable appendable) {
            try {
                int length = str.length();
                for (int i11 = 0; i11 < length; i11++) {
                    char cCharAt = str.charAt(i11);
                    if (cCharAt == '\f') {
                        appendable.append("\\f");
                    } else if (cCharAt == '\r') {
                        appendable.append("\\r");
                    } else if (cCharAt == '\"') {
                        appendable.append("\\\"");
                    } else if (cCharAt != '\\') {
                        switch (cCharAt) {
                            case '\b':
                                appendable.append("\\b");
                                break;
                            case '\t':
                                appendable.append("\\t");
                                break;
                            case '\n':
                                appendable.append("\\n");
                                break;
                            default:
                                if ((cCharAt < 0 || cCharAt > 31) && ((cCharAt < 127 || cCharAt > 159) && (cCharAt < 8192 || cCharAt > 8447))) {
                                    appendable.append(cCharAt);
                                } else {
                                    appendable.append("\\u");
                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> '\f') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> '\b') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> 4) & 15));
                                    appendable.append("0123456789ABCDEF".charAt(cCharAt & 15));
                                }
                                break;
                        }
                    } else {
                        appendable.append("\\\\");
                    }
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Exception");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d implements g {
        private d() {
        }

        @Override // sz.j.g
        public boolean a(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length == 0 || str.trim() != str) {
                return true;
            }
            char cCharAt = str.charAt(0);
            if (j.c(cCharAt) || j.f(cCharAt)) {
                return true;
            }
            for (int i11 = 1; i11 < length; i11++) {
                char cCharAt2 = str.charAt(i11);
                if (j.e(cCharAt2) || j.f(cCharAt2)) {
                    return true;
                }
            }
            if (j.a(str)) {
                return true;
            }
            char cCharAt3 = str.charAt(0);
            if ((cCharAt3 >= '0' && cCharAt3 <= '9') || cCharAt3 == '-') {
                int i12 = 1;
                while (i12 < length) {
                    cCharAt3 = str.charAt(i12);
                    if (cCharAt3 < '0' || cCharAt3 > '9') {
                        break;
                    }
                    i12++;
                }
                if (i12 == length) {
                    return true;
                }
                if (cCharAt3 == '.') {
                    i12++;
                }
                while (i12 < length) {
                    cCharAt3 = str.charAt(i12);
                    if (cCharAt3 < '0' || cCharAt3 > '9') {
                        break;
                    }
                    i12++;
                }
                if (i12 == length) {
                    return true;
                }
                if (cCharAt3 == 'E' || cCharAt3 == 'e') {
                    int i13 = i12 + 1;
                    if (i13 == length) {
                        return false;
                    }
                    char cCharAt4 = str.charAt(i13);
                    if (cCharAt4 == '+' || cCharAt4 == '-') {
                        i12 += 2;
                        str.charAt(i12);
                    } else {
                        i12 = i13;
                    }
                }
                if (i12 == length) {
                    return false;
                }
                while (i12 < length) {
                    char cCharAt5 = str.charAt(i12);
                    if (cCharAt5 < '0' || cCharAt5 > '9') {
                        break;
                    }
                    i12++;
                }
                if (i12 == length) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class e implements g {
        private e() {
        }

        @Override // sz.j.g
        public boolean a(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length == 0 || str.trim() != str) {
                return true;
            }
            char cCharAt = str.charAt(0);
            if ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '-') {
                return true;
            }
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt2 = str.charAt(i11);
                if (j.b(cCharAt2) || j.c(cCharAt2) || j.d(cCharAt2) || j.f(cCharAt2)) {
                    return true;
                }
            }
            return j.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class f implements g {
        private f() {
        }

        @Override // sz.j.g
        public boolean a(String str) {
            return true;
        }
    }

    public interface g {
        boolean a(String str);
    }

    public interface h {
        void a(String str, Appendable appendable);
    }

    static {
        f111948a = new e();
        f111949b = new f();
        f111950c = new d();
        f111951d = new c();
        f111952e = new b();
    }

    public static boolean a(String str) {
        if (str.length() < 3) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'n') {
            return str.equals(Address.ADDRESS_NULL_PLACEHOLDER);
        }
        if (cCharAt == 't') {
            return str.equals("true");
        }
        if (cCharAt == 'f') {
            return str.equals("false");
        }
        if (cCharAt == 'N') {
            return str.equals("NaN");
        }
        return false;
    }

    public static boolean b(char c11) {
        return c11 == '\r' || c11 == '\n' || c11 == '\t' || c11 == ' ';
    }

    public static boolean c(char c11) {
        return c11 == '{' || c11 == '[' || c11 == ',' || c11 == '}' || c11 == ']' || c11 == ':' || c11 == '\'' || c11 == '\"';
    }

    public static boolean d(char c11) {
        return c11 == '\b' || c11 == '\f' || c11 == '\n';
    }

    public static boolean e(char c11) {
        return c11 == '}' || c11 == ']' || c11 == ',' || c11 == ':';
    }

    public static boolean f(char c11) {
        if (c11 >= 0 && c11 <= 31) {
            return true;
        }
        if (c11 < 127 || c11 > 159) {
            return c11 >= 8192 && c11 <= 8447;
        }
        return true;
    }
}
