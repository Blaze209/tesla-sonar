package p013kotlin.text;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "", "x", "(Ljava/lang/String;)Ljava/lang/Integer;", "radix", "y", "(Ljava/lang/String;I)Ljava/lang/Integer;", "", "z", "(Ljava/lang/String;)Ljava/lang/Long;", "A", "(Ljava/lang/String;I)Ljava/lang/Long;", "input", "", "w", "(Ljava/lang/String;)Ljava/lang/Void;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class e0 extends d0 {
    public static Long A(String str, int i11) {
        boolean z11;
        s.k(str, "<this>");
        b.a(i11);
        int length = str.length();
        Long l11 = null;
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        long j11 = -9223372036854775807L;
        if (s.m(cCharAt, 48) < 0) {
            z11 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z11 = false;
                i12 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j11 = Long.MIN_VALUE;
                i12 = 1;
            }
        } else {
            z11 = false;
        }
        long j12 = 0;
        long j13 = -256204778801521550L;
        while (i12 < length) {
            int iB = b.b(str.charAt(i12), i11);
            if (iB < 0) {
                return l11;
            }
            if (j12 < j13) {
                if (j13 != -256204778801521550L) {
                    return l11;
                }
                j13 = j11 / ((long) i11);
                if (j12 < j13) {
                    return l11;
                }
            }
            Long l12 = l11;
            int i13 = i12;
            long j14 = j12 * ((long) i11);
            long j15 = iB;
            if (j14 < j11 + j15) {
                return l12;
            }
            j12 = j14 - j15;
            i12 = i13 + 1;
            l11 = l12;
        }
        return z11 ? Long.valueOf(j12) : Long.valueOf(-j12);
    }

    public static final Void w(String input) {
        s.k(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + CoreConstants.SINGLE_QUOTE_CHAR);
    }

    public static Integer x(String str) {
        s.k(str, "<this>");
        return y(str, 10);
    }

    public static Integer y(String str, int i11) {
        boolean z11;
        int i12;
        int i13;
        s.k(str, "<this>");
        b.a(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i14 = 0;
        char cCharAt = str.charAt(0);
        int i15 = -2147483647;
        if (s.m(cCharAt, 48) < 0) {
            i12 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z11 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i15 = Integer.MIN_VALUE;
                z11 = true;
            }
        } else {
            z11 = false;
            i12 = 0;
        }
        int i16 = -59652323;
        while (i12 < length) {
            int iB = b.b(str.charAt(i12), i11);
            if (iB < 0) {
                return null;
            }
            if ((i14 < i16 && (i16 != -59652323 || i14 < (i16 = i15 / i11))) || (i13 = i14 * i11) < i15 + iB) {
                return null;
            }
            i14 = i13 - iB;
            i12++;
        }
        return z11 ? Integer.valueOf(i14) : Integer.valueOf(-i14);
    }

    public static Long z(String str) {
        s.k(str, "<this>");
        return A(str, 10);
    }
}
