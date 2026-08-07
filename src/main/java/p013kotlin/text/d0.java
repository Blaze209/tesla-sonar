package p013kotlin.text;

import java.math.BigDecimal;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"", "", "v", "(Ljava/lang/String;)Ljava/lang/Float;", "", "u", "(Ljava/lang/String;)Ljava/lang/Double;", "Ljava/math/BigDecimal;", "t", "(Ljava/lang/String;)Ljava/math/BigDecimal;", "s", "", "(Ljava/lang/String;)Z", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class d0 extends c0 {
    /* JADX WARN: Code duplicated, block: B:106:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    private static final boolean s(String str) {
        char c11;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        String str2;
        boolean z14;
        boolean z15 = true;
        int length = str.length() - 1;
        int i12 = 0;
        while (true) {
            c11 = ' ';
            if (i12 > length || str.charAt(i12) > ' ') {
                break;
            }
            i12++;
        }
        if (i12 > length) {
            return false;
        }
        while (length > i12 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i12) == '+' || str.charAt(i12) == '-') {
            i12++;
        }
        if (i12 > length) {
            return false;
        }
        if (str.charAt(i12) != '0') {
            z11 = true;
            z12 = false;
        } else {
            int i13 = i12 + 1;
            if (i13 > length) {
                return true;
            }
            if ((str.charAt(i13) | ' ') == 120) {
                int i14 = i12 + 2;
                int i15 = i14;
                while (true) {
                    if (i15 > length) {
                        z11 = z15;
                        break;
                    }
                    char cCharAt = str.charAt(i15);
                    z11 = z15;
                    if (((cCharAt - '0') & 65535) >= 10 && (((cCharAt | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i15++;
                    z15 = z11;
                }
                boolean z16 = i14 != i15 ? z11 : false;
                if (i15 <= length) {
                    if (str.charAt(i15) == '.') {
                        int i16 = i15 + 1;
                        int i17 = i16;
                        while (i17 <= length) {
                            char cCharAt2 = str.charAt(i17);
                            char c12 = c11;
                            if (((cCharAt2 - '0') & 65535) >= 10 && (((cCharAt2 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i17++;
                            c11 = c12;
                        }
                        z14 = i16 != i17 ? z11 : false;
                        i15 = i17;
                    } else {
                        z14 = false;
                    }
                    if (z16 || z14) {
                        i12 = i15;
                    }
                    if (i12 != -1 || i12 > length) {
                        return false;
                    }
                    z12 = z11;
                }
                i12 = -1;
                if (i12 != -1) {
                }
                return false;
            }
            z11 = true;
            z12 = false;
        }
        if (!z12) {
            int i18 = i12;
            while (i18 <= length && ((str.charAt(i18) - '0') & 65535) < 10) {
                i18++;
            }
            boolean z17 = i12 != i18 ? z11 : false;
            if (i18 > length) {
                i12 = i18;
            } else {
                if (str.charAt(i18) == '.') {
                    int i19 = i18 + 1;
                    i11 = i19;
                    while (i11 <= length && ((str.charAt(i11) - '0') & 65535) < 10) {
                        i11++;
                    }
                    if (i19 != i11) {
                        z13 = z11;
                    }
                    if (!z17 || z13) {
                        i12 = i11;
                    } else {
                        if (length == i11 + 2) {
                            str2 = "NaN";
                        } else {
                            str2 = length == i11 + 7 ? "Infinity" : null;
                        }
                        i12 = (str2 != null && i0.r0(str, str2, i11, false) == i11) ? length + 1 : -1;
                    }
                } else {
                    i11 = i18;
                }
                z13 = false;
                if (z17) {
                    i12 = i11;
                } else {
                    i12 = i11;
                }
            }
            if (i12 == -1) {
                return false;
            }
            if (i12 > length) {
                return z11;
            }
        }
        int i21 = i12 + 1;
        int iCharAt = str.charAt(i12) | ' ';
        if (iCharAt != (z12 ? 112 : 101)) {
            if (z12 || (!(iCharAt == 102 || iCharAt == 100) || i21 <= length)) {
                return false;
            }
            return z11;
        }
        if (i21 > length) {
            return false;
        }
        if ((str.charAt(i21) == '+' || str.charAt(i21) == '-') && (i21 = i12 + 2) > length) {
            return false;
        }
        while (i21 <= length && ((str.charAt(i21) - '0') & 65535) < 10) {
            i21++;
        }
        if (i21 > length) {
            return z11;
        }
        if (i21 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i21) | ' ';
        if (iCharAt2 == 102 || iCharAt2 == 100) {
            return z11;
        }
        return false;
    }

    public static BigDecimal t(String str) {
        s.k(str, "<this>");
        try {
            if (s(str)) {
                return new BigDecimal(str);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static Double u(String str) {
        s.k(str, "<this>");
        try {
            if (s(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static Float v(String str) {
        s.k(str, "<this>");
        try {
            if (s(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
