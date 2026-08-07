package p013kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import java.util.Iterator;
import java.util.Locale;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public final class CapitalizeDecapitalizeKt {
    private static final boolean a(String str, int i11, boolean z11) {
        char cCharAt = str.charAt(i11);
        if (z11) {
            return 'A' <= cCharAt && cCharAt < '[';
        }
        return Character.isUpperCase(cCharAt);
    }

    private static final String b(String str, boolean z11) {
        if (z11) {
            return toLowerCaseAsciiOnly(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final String capitalizeAsciiOnly(String str) {
        char cCharAt;
        s.k(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append(Character.toUpperCase(cCharAt));
        sb2.append((CharSequence) str, 1, str.length());
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    public static final String decapitalizeAsciiOnly(String str) {
        char cCharAt;
        s.k(str, "<this>");
        if (str.length() == 0 || 'A' > (cCharAt = str.charAt(0)) || cCharAt >= '[') {
            return str;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        String strSubstring = str.substring(1);
        s.j(strSubstring, "substring(...)");
        return lowerCase + strSubstring;
    }

    public static final String decapitalizeSmartForCompiler(String str, boolean z11) {
        Integer next;
        s.k(str, "<this>");
        if (str.length() == 0 || !a(str, 0, z11)) {
            return str;
        }
        if (str.length() == 1 || !a(str, 1, z11)) {
            if (z11) {
                return decapitalizeAsciiOnly(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String strSubstring = str.substring(1);
            s.j(strSubstring, "substring(...)");
            return lowerCase + strSubstring;
        }
        Iterator<Integer> it = t.o0(str).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (a(str, next.intValue(), z11));
        Integer num = next;
        if (num == null) {
            return b(str, z11);
        }
        int iIntValue = num.intValue() - 1;
        StringBuilder sb2 = new StringBuilder();
        String strSubstring2 = str.substring(0, iIntValue);
        s.j(strSubstring2, "substring(...)");
        sb2.append(b(strSubstring2, z11));
        String strSubstring3 = str.substring(iIntValue);
        s.j(strSubstring3, "substring(...)");
        sb2.append(strSubstring3);
        return sb2.toString();
    }

    public static final String toLowerCaseAsciiOnly(String str) {
        s.k(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }
}
