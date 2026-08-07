package io0;

import bo0.n;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import org.slf4j.Marker;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0016\u001a\u0017\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0016\u001a\u001f\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0016\u001a\u0017\u0010\"\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u0016¨\u0006#"}, d2 = {"", "Lio0/e;", "unit", "Lio0/b;", "s", "(ILio0/e;)J", "", "t", "(JLio0/e;)J", "", "r", "(DLio0/e;)J", "", "value", "", "strictIso", "p", "(Ljava/lang/String;Z)J", "q", "(Ljava/lang/String;)J", "nanos", "o", "(J)J", "millis", "n", "normalNanos", "l", "normalMillis", "j", "normalValue", "unitDiscriminator", IntegerTokenConverter.CONVERTER_KEY, "(JI)J", "m", "k", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j11, int i11) {
        return b.i((j11 << 1) + ((long) i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j11) {
        return b.i((j11 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j11) {
        return (-4611686018426L > j11 || j11 >= 4611686018427L) ? j(n.p(j11, -4611686018427387903L, 4611686018427387903L)) : l(n(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j11) {
        return b.i(j11 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j11) {
        return (-4611686018426999999L > j11 || j11 >= 4611686018427000000L) ? j(o(j11)) : l(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j11) {
        return j11 * ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long o(long j11) {
        return j11 / ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long p(String str, boolean z11) {
        int i11;
        char cCharAt;
        char cCharAt2;
        int i12;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        b.Companion companion = b.INSTANCE;
        long jC = companion.c();
        char cCharAt3 = str.charAt(0);
        int length2 = (cCharAt3 == '+' || cCharAt3 == '-') ? 1 : 0;
        boolean z12 = length2 > 0;
        boolean z13 = z12 && t.j1(str, CoreConstants.DASH_CHAR, false, 2, null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char cCharAt4 = str.charAt(length2);
        char c11 = CoreConstants.COLON_CHAR;
        char c12 = '0';
        if (cCharAt4 == 'P') {
            int i13 = length2 + 1;
            if (i13 == length) {
                throw new IllegalArgumentException();
            }
            boolean z14 = false;
            e eVar = null;
            while (i13 < length) {
                if (str.charAt(i13) != 'T') {
                    int i14 = i13;
                    while (true) {
                        if (i14 >= str.length()) {
                            i12 = length;
                            break;
                        }
                        char cCharAt5 = str.charAt(i14);
                        if (c12 > cCharAt5 || cCharAt5 >= c11) {
                            i12 = length;
                            if (!t.g0("+-.", cCharAt5, false, 2, null)) {
                                break;
                            }
                        } else {
                            i12 = length;
                        }
                        i14++;
                        length = i12;
                        c12 = '0';
                        c11 = CoreConstants.COLON_CHAR;
                    }
                    s.i(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i13, i14);
                    s.j(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i13 + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt6 = str.charAt(length3);
                    i13 = length3 + 1;
                    e eVarD = g.d(cCharAt6, z14);
                    if (eVar != null && eVar.compareTo(eVarD) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iU0 = t.u0(strSubstring, CoreConstants.DOT, 0, false, 6, null);
                    if (eVarD != e.SECONDS || iU0 <= 0) {
                        jC = b.F(jC, t(q(strSubstring), eVarD));
                    } else {
                        s.i(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iU0);
                        s.j(strSubstring2, "substring(...)");
                        long jF = b.F(jC, t(q(strSubstring2), eVarD));
                        s.i(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iU0);
                        s.j(strSubstring3, "substring(...)");
                        jC = b.F(jF, r(Double.parseDouble(strSubstring3), eVarD));
                    }
                    z14 = z14;
                    eVar = eVarD;
                    length = i12;
                    c12 = '0';
                    c11 = CoreConstants.COLON_CHAR;
                } else {
                    if (z14 || (i13 = i13 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z14 = true;
                }
            }
        } else {
            if (z11) {
                throw new IllegalArgumentException();
            }
            char c13 = '0';
            if (t.P(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jC = companion.a();
            } else {
                boolean z15 = !z12;
                if (z12 && str.charAt(length2) == '(' && t.Q1(str) == ')') {
                    length2++;
                    int i15 = length - 1;
                    if (length2 == i15) {
                        throw new IllegalArgumentException("No components");
                    }
                    i11 = i15;
                    z15 = true;
                } else {
                    i11 = length;
                }
                boolean z16 = false;
                e eVar2 = null;
                while (length2 < i11) {
                    if (z16 && z15) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i16 = length2;
                    while (i16 < str.length() && ((c13 <= (cCharAt2 = str.charAt(i16)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i16++;
                    }
                    s.i(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i16);
                    s.j(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i17 = length4;
                    while (i17 < str.length() && 'a' <= (cCharAt = str.charAt(i17)) && cCharAt < '{') {
                        i17++;
                    }
                    s.i(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i17);
                    s.j(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    e eVarE = g.e(strSubstring5);
                    if (eVar2 != null && eVar2.compareTo(eVarE) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iU1 = t.u0(strSubstring4, CoreConstants.DOT, 0, false, 6, null);
                    if (iU1 > 0) {
                        s.i(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iU1);
                        s.j(strSubstring6, "substring(...)");
                        long jF2 = b.F(jC, t(Long.parseLong(strSubstring6), eVarE));
                        s.i(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iU1);
                        s.j(strSubstring7, "substring(...)");
                        jC = b.F(jF2, r(Double.parseDouble(strSubstring7), eVarE));
                        if (length2 < i11) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jC = b.F(jC, t(Long.parseLong(strSubstring4), eVarE));
                    }
                    eVar2 = eVarE;
                    z16 = true;
                    c13 = '0';
                }
            }
        }
        return z13 ? b.L(jC) : jC;
    }

    private static final long q(String str) {
        char cCharAt;
        int length = str.length();
        int i11 = (length <= 0 || !t.g0("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i11 > 16) {
            int i12 = i11;
            while (true) {
                if (i11 >= length) {
                    if (length - i12 <= 16) {
                        break;
                    }
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                char cCharAt2 = str.charAt(i11);
                if (cCharAt2 == '0') {
                    if (i12 == i11) {
                        i12++;
                    }
                } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                    break;
                }
                i11++;
            }
        }
        return (!t.b0(str, Marker.ANY_NON_NULL_MARKER, false, 2, null) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(t.M1(str, 1));
    }

    public static final long r(double d11, e unit) {
        s.k(unit, "unit");
        double dA = f.a(d11, unit, e.NANOSECONDS);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jE = yn0.a.e(dA);
        return (-4611686018426999999L > jE || jE >= 4611686018427000000L) ? k(yn0.a.e(f.a(d11, unit, e.MILLISECONDS))) : l(jE);
    }

    public static final long s(int i11, e unit) {
        s.k(unit, "unit");
        return unit.compareTo(e.SECONDS) <= 0 ? l(f.c(i11, unit, e.NANOSECONDS)) : t(i11, unit);
    }

    public static final long t(long j11, e unit) {
        s.k(unit, "unit");
        e eVar = e.NANOSECONDS;
        long jC = f.c(4611686018426999999L, eVar, unit);
        return ((-jC) > j11 || j11 > jC) ? j(n.p(f.b(j11, unit, e.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : l(f.c(j11, unit, eVar));
    }
}
