package p013kotlin.text;

import bo0.j;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "", "c", "(C)Z", "Ljava/util/Locale;", "locale", "", "e", "(CLjava/util/Locale;)Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "char", "", "radix", "b", "(CI)I", "a", "(I)I", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/CharsKt")
public class b {
    public static int a(int i11) {
        if (2 <= i11 && i11 < 37) {
            return i11;
        }
        throw new IllegalArgumentException("radix " + i11 + " was not in valid range " + new j(2, 36));
    }

    public static final int b(char c11, int i11) {
        return Character.digit((int) c11, i11);
    }

    public static boolean c(char c11) {
        return Character.isWhitespace(c11) || Character.isSpaceChar(c11);
    }

    public static String d(char c11, Locale locale) {
        s.k(locale, "locale");
        String strE = e(c11, locale);
        if (strE.length() <= 1) {
            String strValueOf = String.valueOf(c11);
            s.i(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            s.j(upperCase, "toUpperCase(...)");
            if (s.f(strE, upperCase)) {
                return String.valueOf(Character.toTitleCase(c11));
            }
        } else if (c11 != 329) {
            char cCharAt = strE.charAt(0);
            s.i(strE, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strE.substring(1);
            s.j(strSubstring, "substring(...)");
            s.i(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            s.j(lowerCase, "toLowerCase(...)");
            return cCharAt + lowerCase;
        }
        return strE;
    }

    public static final String e(char c11, Locale locale) {
        s.k(locale, "locale");
        String strValueOf = String.valueOf(c11);
        s.i(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        s.j(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
