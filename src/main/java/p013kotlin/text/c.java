package p013kotlin.text;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\n*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "", "f", "(C)I", "radix", "g", "(CI)I", "h", "(CI)Ljava/lang/Integer;", "other", "", "ignoreCase", IntegerTokenConverter.CONVERTER_KEY, "(CCZ)Z", "j", "(C)Z", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/CharsKt")
public class c extends b {
    public static int f(char c11) {
        int iB = b.b(c11, 10);
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalArgumentException("Char " + c11 + " is not a decimal digit");
    }

    public static int g(char c11, int i11) {
        Integer numH = h(c11, i11);
        if (numH != null) {
            return numH.intValue();
        }
        throw new IllegalArgumentException("Char " + c11 + " is not a digit in the given radix=" + i11);
    }

    public static final Integer h(char c11, int i11) {
        b.a(i11);
        Integer numValueOf = Integer.valueOf(b.b(c11, i11));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static final boolean i(char c11, char c12, boolean z11) {
        if (c11 == c12) {
            return true;
        }
        if (!z11) {
            return false;
        }
        char upperCase = Character.toUpperCase(c11);
        char upperCase2 = Character.toUpperCase(c12);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static boolean j(char c11) {
        return 55296 <= c11 && c11 < 57344;
    }
}
