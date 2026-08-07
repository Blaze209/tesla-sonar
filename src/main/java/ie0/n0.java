package ie0;

import java.util.Locale;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "(Ljava/lang/String;)Ljava/lang/String;", "utils_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class n0 {
    public static final String a(String str) {
        String lowerCase;
        p013kotlin.jvm.internal.s.k(str, "<this>");
        int length = str.length();
        String str2 = "";
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (!Character.isUpperCase(cCharAt) || i11 <= 0) {
                String strValueOf = String.valueOf(cCharAt);
                p013kotlin.jvm.internal.s.i(strValueOf, "null cannot be cast to non-null type java.lang.String");
                lowerCase = strValueOf.toLowerCase(Locale.ROOT);
                p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = "_" + cCharAt;
            }
            str2 = str2 + lowerCase;
        }
        String upperCase = str2.toUpperCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
