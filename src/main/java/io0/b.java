package io0;

import bo0.m;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import okhttp3.internal.http2.Http2Connection;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\b\u0087@\u0018\u0000 V2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00016B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u0018\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u000fJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u000fJ\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u000fJ\r\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010\u000fJ\u0018\u0010 \u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J?\u00103\u001a\u000202*\u00060,j\u0002`-2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u0010#\u001a\u00020)2\u0006\u00101\u001a\u00020\u000bH\u0002¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020)¢\u0006\u0004\b5\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010'R\u0014\u00108\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0005R\u0014\u0010;\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010=\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b<\u0010\u0005R\u001a\u0010B\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\b@\u0010A\u001a\u0004\b>\u0010?R\u001a\u0010E\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bD\u0010A\u001a\u0004\bC\u0010?R\u001a\u0010H\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bG\u0010A\u001a\u0004\bF\u0010?R\u001a\u0010K\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bJ\u0010A\u001a\u0004\bI\u0010?R\u0011\u0010M\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bL\u0010\u0005R\u0011\u0010O\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bN\u0010\u0005R\u0011\u0010Q\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bP\u0010\u0005R\u0011\u0010S\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bR\u0010\u0005R\u0011\u0010U\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bT\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006W"}, d2 = {"Lio0/b;", "", "", "rawValue", IntegerTokenConverter.CONVERTER_KEY, "(J)J", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "A", "(J)Z", "z", "L", Gender.FEMALE, "(JJ)J", "thisMillis", "otherNanos", DateTokenConverter.CONVERTER_KEY, "(JJJ)J", "E", "scale", "G", "(JI)J", "C", "D", "B", "y", "h", "(JJ)I", "Lio0/e;", "unit", "", "H", "(JLio0/e;)D", "J", "(JLio0/e;)J", "", "K", "(J)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "Ljn0/h0;", "e", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "I", "a", "w", "value", "v", "(J)Lio0/e;", "storageUnit", "l", "absoluteValue", "m", "(J)I", "getHoursComponent$annotations", "()V", "hoursComponent", "s", "getMinutesComponent$annotations", "minutesComponent", "u", "getSecondsComponent$annotations", "secondsComponent", "t", "getNanosecondsComponent$annotations", "nanosecondsComponent", "n", "inWholeDays", "o", "inWholeHours", "q", "inWholeMinutes", "r", "inWholeSeconds", "p", "inWholeMilliseconds", "b", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@vn0.b
public final class b implements Comparable<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f81648c = i(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f81649d = d.j(4611686018427387903L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f81650e = d.j(-4611686018427387903L);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long rawValue;

    /* JADX INFO: renamed from: io0.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lio0/b$a;", "", "<init>", "()V", "", "value", "Lio0/b;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)J", "ZERO", "J", "c", "()J", "INFINITE", "a", "NEG_INFINITE", "b", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return b.f81649d;
        }

        public final long b() {
            return b.f81650e;
        }

        public final long c() {
            return b.f81648c;
        }

        public final long d(String value) {
            s.k(value, "value");
            try {
                return d.p(value, true);
            } catch (IllegalArgumentException e11) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e11);
            }
        }

        private Companion() {
        }
    }

    private /* synthetic */ b(long j11) {
        this.rawValue = j11;
    }

    private static final boolean A(long j11) {
        return (((int) j11) & 1) == 0;
    }

    public static final boolean B(long j11) {
        return j11 == f81649d || j11 == f81650e;
    }

    public static final boolean C(long j11) {
        return j11 < 0;
    }

    public static final boolean D(long j11) {
        return j11 > 0;
    }

    public static final long E(long j11, long j12) {
        return F(j11, L(j12));
    }

    public static final long F(long j11, long j12) {
        if (B(j11)) {
            if (y(j12) || (j12 ^ j11) >= 0) {
                return j11;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (B(j12)) {
            return j12;
        }
        if ((((int) j11) & 1) != (((int) j12) & 1)) {
            return z(j11) ? d(j11, w(j11), w(j12)) : d(j11, w(j12), w(j11));
        }
        long jW = w(j11) + w(j12);
        return A(j11) ? d.m(jW) : d.k(jW);
    }

    public static final long G(long j11, int i11) {
        if (B(j11)) {
            if (i11 != 0) {
                return i11 > 0 ? j11 : L(j11);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i11 == 0) {
            return f81648c;
        }
        long jW = w(j11);
        long j12 = i11;
        long j13 = jW * j12;
        if (!A(j11)) {
            if (j13 / j12 == jW) {
                return d.j(n.q(j13, new m(-4611686018427387903L, 4611686018427387903L)));
            }
            return yn0.a.b(jW) * yn0.a.a(i11) > 0 ? f81649d : f81650e;
        }
        if (-2147483647L <= jW && jW < 2147483648L) {
            return d.l(j13);
        }
        if (j13 / j12 == jW) {
            return d.m(j13);
        }
        long jO = d.o(jW);
        long j14 = jO * j12;
        long jO2 = d.o((jW - d.n(jO)) * j12) + j14;
        if (j14 / j12 != jO || (jO2 ^ j14) < 0) {
            return yn0.a.b(jW) * yn0.a.a(i11) > 0 ? f81649d : f81650e;
        }
        return d.j(n.q(jO2, new m(-4611686018427387903L, 4611686018427387903L)));
    }

    public static final double H(long j11, e unit) {
        s.k(unit, "unit");
        if (j11 == f81649d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j11 == f81650e) {
            return Double.NEGATIVE_INFINITY;
        }
        return f.a(w(j11), v(j11), unit);
    }

    public static final String I(long j11) {
        StringBuilder sb2 = new StringBuilder();
        if (C(j11)) {
            sb2.append(CoreConstants.DASH_CHAR);
        }
        sb2.append("PT");
        long jL = l(j11);
        long jO = o(jL);
        int iS = s(jL);
        int iU = u(jL);
        int iT = t(jL);
        long j12 = B(j11) ? 9999999999999L : jO;
        boolean z11 = false;
        boolean z12 = j12 != 0;
        boolean z13 = (iU == 0 && iT == 0) ? false : true;
        if (iS != 0 || (z13 && z12)) {
            z11 = true;
        }
        if (z12) {
            sb2.append(j12);
            sb2.append('H');
        }
        if (z11) {
            sb2.append(iS);
            sb2.append('M');
        }
        if (z13 || (!z12 && !z11)) {
            e(j11, sb2, iU, iT, 9, "S", true);
        }
        return sb2.toString();
    }

    public static final long J(long j11, e unit) {
        s.k(unit, "unit");
        if (j11 == f81649d) {
            return Long.MAX_VALUE;
        }
        if (j11 == f81650e) {
            return Long.MIN_VALUE;
        }
        return f.b(w(j11), v(j11), unit);
    }

    public static String K(long j11) {
        if (j11 == 0) {
            return "0s";
        }
        if (j11 == f81649d) {
            return "Infinity";
        }
        if (j11 == f81650e) {
            return "-Infinity";
        }
        boolean zC = C(j11);
        StringBuilder sb2 = new StringBuilder();
        if (zC) {
            sb2.append(CoreConstants.DASH_CHAR);
        }
        long jL = l(j11);
        long jN = n(jL);
        int iM = m(jL);
        int iS = s(jL);
        int iU = u(jL);
        int iT = t(jL);
        int i11 = 0;
        boolean z11 = jN != 0;
        boolean z12 = iM != 0;
        boolean z13 = iS != 0;
        boolean z14 = (iU == 0 && iT == 0) ? false : true;
        if (z11) {
            sb2.append(jN);
            sb2.append('d');
            i11 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i12 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(iM);
            sb2.append('h');
            i11 = i12;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i13 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(iS);
            sb2.append('m');
            i11 = i13;
        }
        if (z14) {
            int i14 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            if (iU != 0 || z11 || z12 || z13) {
                e(j11, sb2, iU, iT, 9, "s", false);
            } else if (iT >= 1000000) {
                e(j11, sb2, iT / 1000000, iT % 1000000, 6, "ms", false);
            } else if (iT >= 1000) {
                e(j11, sb2, iT / 1000, iT % 1000, 3, "us", false);
            } else {
                sb2.append(iT);
                sb2.append("ns");
            }
            i11 = i14;
        }
        if (zC && i11 > 1) {
            sb2.insert(1, CoreConstants.LEFT_PARENTHESIS_CHAR).append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        return sb2.toString();
    }

    public static final long L(long j11) {
        return d.i(-w(j11), ((int) j11) & 1);
    }

    private static final long d(long j11, long j12, long j13) {
        long jO = d.o(j13);
        long j14 = j12 + jO;
        if (-4611686018426L > j14 || j14 >= 4611686018427L) {
            return d.j(n.p(j14, -4611686018427387903L, 4611686018427387903L));
        }
        return d.l(d.n(j14) + (j13 - d.n(jO)));
    }

    private static final void e(long j11, StringBuilder sb2, int i11, int i12, int i13, String str, boolean z11) {
        sb2.append(i11);
        if (i12 != 0) {
            sb2.append(CoreConstants.DOT);
            String strK0 = t.K0(String.valueOf(i12), i13, '0');
            int i14 = -1;
            int length = strK0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i15 = length - 1;
                    if (strK0.charAt(length) != '0') {
                        i14 = length;
                        break;
                    } else if (i15 < 0) {
                        break;
                    } else {
                        length = i15;
                    }
                }
            }
            int i16 = i14 + 1;
            if (z11 || i16 >= 3) {
                sb2.append((CharSequence) strK0, 0, ((i14 + 3) / 3) * 3);
                s.j(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) strK0, 0, i16);
                s.j(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static final /* synthetic */ b f(long j11) {
        return new b(j11);
    }

    public static int h(long j11, long j12) {
        long j13 = j11 ^ j12;
        if (j13 < 0 || (((int) j13) & 1) == 0) {
            return s.n(j11, j12);
        }
        int i11 = (((int) j11) & 1) - (((int) j12) & 1);
        return C(j11) ? -i11 : i11;
    }

    public static long i(long j11) {
        if (!c.a()) {
            return j11;
        }
        if (A(j11)) {
            long jW = w(j11);
            if (-4611686018426999999L <= jW && jW < 4611686018427000000L) {
                return j11;
            }
            throw new AssertionError(w(j11) + " ns is out of nanoseconds range");
        }
        long jW2 = w(j11);
        if (-4611686018427387903L > jW2 || jW2 >= 4611686018427387904L) {
            throw new AssertionError(w(j11) + " ms is out of milliseconds range");
        }
        long jW3 = w(j11);
        if (-4611686018426L > jW3 || jW3 >= 4611686018427L) {
            return j11;
        }
        throw new AssertionError(w(j11) + " ms is denormalized");
    }

    public static boolean j(long j11, Object obj) {
        return (obj instanceof b) && j11 == ((b) obj).getRawValue();
    }

    public static final boolean k(long j11, long j12) {
        return j11 == j12;
    }

    public static final long l(long j11) {
        return C(j11) ? L(j11) : j11;
    }

    public static final int m(long j11) {
        if (B(j11)) {
            return 0;
        }
        return (int) (o(j11) % ((long) 24));
    }

    public static final long n(long j11) {
        return J(j11, e.DAYS);
    }

    public static final long o(long j11) {
        return J(j11, e.HOURS);
    }

    public static final long p(long j11) {
        return (z(j11) && y(j11)) ? w(j11) : J(j11, e.MILLISECONDS);
    }

    public static final long q(long j11) {
        return J(j11, e.MINUTES);
    }

    public static final long r(long j11) {
        return J(j11, e.SECONDS);
    }

    public static final int s(long j11) {
        if (B(j11)) {
            return 0;
        }
        return (int) (q(j11) % ((long) 60));
    }

    public static final int t(long j11) {
        if (B(j11)) {
            return 0;
        }
        return (int) (z(j11) ? d.n(w(j11) % ((long) 1000)) : w(j11) % ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
    }

    public static final int u(long j11) {
        if (B(j11)) {
            return 0;
        }
        return (int) (r(j11) % ((long) 60));
    }

    private static final e v(long j11) {
        return A(j11) ? e.NANOSECONDS : e.MILLISECONDS;
    }

    private static final long w(long j11) {
        return j11 >> 1;
    }

    public static int x(long j11) {
        return Long.hashCode(j11);
    }

    public static final boolean y(long j11) {
        return !B(j11);
    }

    private static final boolean z(long j11) {
        return (((int) j11) & 1) == 1;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(b bVar) {
        return g(bVar.getRawValue());
    }

    public boolean equals(Object other) {
        return j(this.rawValue, other);
    }

    public int g(long j11) {
        return h(this.rawValue, j11);
    }

    public int hashCode() {
        return x(this.rawValue);
    }

    public String toString() {
        return K(this.rawValue);
    }
}
