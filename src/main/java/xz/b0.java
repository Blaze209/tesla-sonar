package xz;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b0 f124106e = new b0(0, "VZCBSIFJD", 0, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0 f124107f = new b0(1, "VZCBSIFJD", 1, 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b0 f124108g = new b0(2, "VZCBSIFJD", 2, 3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b0 f124109h = new b0(3, "VZCBSIFJD", 3, 4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b0 f124110i = new b0(4, "VZCBSIFJD", 4, 5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b0 f124111j = new b0(5, "VZCBSIFJD", 5, 6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b0 f124112k = new b0(6, "VZCBSIFJD", 6, 7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b0 f124113l = new b0(7, "VZCBSIFJD", 7, 8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b0 f124114m = new b0(8, "VZCBSIFJD", 8, 9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f124115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f124116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f124117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f124118d;

    private b0(int i11, String str, int i12, int i13) {
        this.f124115a = i11;
        this.f124116b = str;
        this.f124117c = i12;
        this.f124118d = i13;
    }

    private static void a(Class<?> cls, StringBuilder sb2) {
        char c11;
        while (cls.isArray()) {
            sb2.append('[');
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            sb2.append('L');
            sb2.append(g(cls));
            sb2.append(';');
            return;
        }
        if (cls == Integer.TYPE) {
            c11 = 'I';
        } else if (cls == Void.TYPE) {
            c11 = 'V';
        } else if (cls == Boolean.TYPE) {
            c11 = 'Z';
        } else if (cls == Byte.TYPE) {
            c11 = 'B';
        } else if (cls == Character.TYPE) {
            c11 = 'C';
        } else if (cls == Short.TYPE) {
            c11 = 'S';
        } else if (cls == Double.TYPE) {
            c11 = 'D';
        } else if (cls == Float.TYPE) {
            c11 = 'F';
        } else {
            if (cls != Long.TYPE) {
                throw new AssertionError();
            }
            c11 = 'J';
        }
        sb2.append(c11);
    }

    public static b0[] b(String str) {
        int i11 = 0;
        int i12 = 0;
        int iMax = 1;
        while (str.charAt(iMax) != ')') {
            while (str.charAt(iMax) == '[') {
                iMax++;
            }
            int i13 = iMax + 1;
            iMax = str.charAt(iMax) == 'L' ? Math.max(i13, str.indexOf(59, i13) + 1) : i13;
            i12++;
        }
        b0[] b0VarArr = new b0[i12];
        int i14 = 1;
        while (str.charAt(i14) != ')') {
            int i15 = i14;
            while (str.charAt(i15) == '[') {
                i15++;
            }
            int iMax2 = i15 + 1;
            if (str.charAt(i15) == 'L') {
                iMax2 = Math.max(iMax2, str.indexOf(59, iMax2) + 1);
            }
            b0VarArr[i11] = o(str, i14, iMax2);
            i11++;
            i14 = iMax2;
        }
        return b0VarArr;
    }

    public static int c(String str) {
        char cCharAt = str.charAt(1);
        int i11 = 1;
        int i12 = 1;
        while (cCharAt != ')') {
            if (cCharAt == 'J' || cCharAt == 'D') {
                i11++;
                i12 += 2;
            } else {
                while (str.charAt(i11) == '[') {
                    i11++;
                }
                int iMax = i11 + 1;
                if (str.charAt(i11) == 'L') {
                    iMax = Math.max(iMax, str.indexOf(59, iMax) + 1);
                }
                i12++;
                i11 = iMax;
            }
            cCharAt = str.charAt(i11);
        }
        char cCharAt2 = str.charAt(i11 + 1);
        if (cCharAt2 == 'V') {
            return i12 << 2;
        }
        return (i12 << 2) | ((cCharAt2 == 'J' || cCharAt2 == 'D') ? 2 : 1);
    }

    public static String e(Class<?> cls) {
        StringBuilder sb2 = new StringBuilder();
        a(cls, sb2);
        return sb2.toString();
    }

    public static String g(Class<?> cls) {
        return cls.getName().replace(CoreConstants.DOT, '/');
    }

    public static String h(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        for (Class<?> cls : method.getParameterTypes()) {
            a(cls, sb2);
        }
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        a(method.getReturnType(), sb2);
        return sb2.toString();
    }

    public static b0 i(String str) {
        return new b0(11, str, 0, str.length());
    }

    public static b0 j(String str) {
        return new b0(str.charAt(0) == '[' ? 9 : 12, str, 0, str.length());
    }

    static int k(String str) {
        int iMax = 1;
        while (str.charAt(iMax) != ')') {
            while (str.charAt(iMax) == '[') {
                iMax++;
            }
            int i11 = iMax + 1;
            iMax = str.charAt(iMax) == 'L' ? Math.max(i11, str.indexOf(59, i11) + 1) : i11;
        }
        return iMax + 1;
    }

    public static b0 m(Class<?> cls) {
        if (!cls.isPrimitive()) {
            return n(e(cls));
        }
        if (cls == Integer.TYPE) {
            return f124111j;
        }
        if (cls == Void.TYPE) {
            return f124106e;
        }
        if (cls == Boolean.TYPE) {
            return f124107f;
        }
        if (cls == Byte.TYPE) {
            return f124109h;
        }
        if (cls == Character.TYPE) {
            return f124108g;
        }
        if (cls == Short.TYPE) {
            return f124110i;
        }
        if (cls == Double.TYPE) {
            return f124114m;
        }
        if (cls == Float.TYPE) {
            return f124112k;
        }
        if (cls == Long.TYPE) {
            return f124113l;
        }
        throw new AssertionError();
    }

    public static b0 n(String str) {
        return o(str, 0, str.length());
    }

    private static b0 o(String str, int i11, int i12) {
        char cCharAt = str.charAt(i11);
        if (cCharAt == '(') {
            return new b0(11, str, i11, i12);
        }
        if (cCharAt == 'F') {
            return f124112k;
        }
        if (cCharAt == 'L') {
            return new b0(10, str, i11 + 1, i12 - 1);
        }
        if (cCharAt == 'S') {
            return f124110i;
        }
        if (cCharAt == 'V') {
            return f124106e;
        }
        if (cCharAt == 'I') {
            return f124111j;
        }
        if (cCharAt == 'J') {
            return f124113l;
        }
        if (cCharAt == 'Z') {
            return f124107f;
        }
        if (cCharAt == '[') {
            return new b0(9, str, i11, i12);
        }
        switch (cCharAt) {
            case 'B':
                return f124109h;
            case 'C':
                return f124108g;
            case 'D':
                return f124114m;
            default:
                throw new IllegalArgumentException();
        }
    }

    public String d() {
        int i11 = this.f124115a;
        if (i11 == 10) {
            return this.f124116b.substring(this.f124117c - 1, this.f124118d + 1);
        }
        if (i11 != 12) {
            return this.f124116b.substring(this.f124117c, this.f124118d);
        }
        return 'L' + this.f124116b.substring(this.f124117c, this.f124118d) + ';';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        int i11 = this.f124115a;
        if (i11 == 12) {
            i11 = 10;
        }
        int i12 = b0Var.f124115a;
        if (i11 != (i12 != 12 ? i12 : 10)) {
            return false;
        }
        int i13 = this.f124117c;
        int i14 = this.f124118d;
        int i15 = b0Var.f124117c;
        if (i14 - i13 != b0Var.f124118d - i15) {
            return false;
        }
        while (i13 < i14) {
            if (this.f124116b.charAt(i13) != b0Var.f124116b.charAt(i15)) {
                return false;
            }
            i13++;
            i15++;
        }
        return true;
    }

    public String f() {
        return this.f124116b.substring(this.f124117c, this.f124118d);
    }

    public int hashCode() {
        int i11 = this.f124115a;
        int iCharAt = (i11 == 12 ? 10 : i11) * 13;
        if (i11 >= 9) {
            int i12 = this.f124118d;
            for (int i13 = this.f124117c; i13 < i12; i13++) {
                iCharAt = (iCharAt + this.f124116b.charAt(i13)) * 17;
            }
        }
        return iCharAt;
    }

    public int l() {
        int i11 = this.f124115a;
        if (i11 == 12) {
            return 10;
        }
        return i11;
    }

    public String toString() {
        return d();
    }
}
