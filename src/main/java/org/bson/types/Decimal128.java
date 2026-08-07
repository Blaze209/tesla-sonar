package org.bson.types;

import ch.qos.logback.core.CoreConstants;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes10.dex */
public final class Decimal128 extends Number implements Comparable<Decimal128> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BigInteger f99275c = new BigInteger("10");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final BigInteger f99276d = new BigInteger("1");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final BigInteger f99277e = new BigInteger(WebrtcBuildVersion.maint_version);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set<String> f99278f = new HashSet(Collections.singletonList("nan"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set<String> f99279g = new HashSet(Collections.singletonList("-nan"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Set<String> f99280h = new HashSet(Arrays.asList("inf", "+inf", "infinity", "+infinity"));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Set<String> f99281i = new HashSet(Arrays.asList("-inf", "-infinity"));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Decimal128 f99282j = fromIEEE754BIDEncoding(8646911284551352320L, 0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Decimal128 f99283k = fromIEEE754BIDEncoding(-576460752303423488L, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Decimal128 f99284l = fromIEEE754BIDEncoding(-288230376151711744L, 0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Decimal128 f99285m = fromIEEE754BIDEncoding(8935141660703064064L, 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Decimal128 f99286n = fromIEEE754BIDEncoding(3476778912330022912L, 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Decimal128 f99287o = fromIEEE754BIDEncoding(-5746593124524752896L, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f99288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f99289b;

    private Decimal128(long j11, long j12) {
        this.f99288a = j11;
        this.f99289b = j12;
    }

    private BigDecimal a() {
        int i11 = -d();
        if (m()) {
            return BigDecimal.valueOf(0L, i11);
        }
        return new BigDecimal(new BigInteger(j() ? -1 : 1, c()), i11);
    }

    private byte[] c() {
        byte[] bArr = new byte[15];
        long j11 = 255;
        long j12 = 255;
        for (int i11 = 14; i11 >= 7; i11--) {
            bArr[i11] = (byte) ((this.f99289b & j12) >>> ((14 - i11) << 3));
            j12 <<= 8;
        }
        for (int i12 = 6; i12 >= 1; i12--) {
            bArr[i12] = (byte) ((this.f99288a & j11) >>> ((6 - i12) << 3));
            j11 <<= 8;
        }
        bArr[0] = (byte) ((this.f99288a & 281474976710656L) >>> 48);
        return bArr;
    }

    private int d() {
        long j11;
        char c11;
        if (m()) {
            j11 = this.f99288a & 2305807824841605120L;
            c11 = '/';
        } else {
            j11 = this.f99288a & 9223231299366420480L;
            c11 = '1';
        }
        return ((int) (j11 >>> c11)) - 6176;
    }

    public static Decimal128 fromIEEE754BIDEncoding(long j11, long j12) {
        return new Decimal128(j11, j12);
    }

    private boolean g(BigDecimal bigDecimal) {
        return j() && bigDecimal.signum() == 0;
    }

    private boolean k(BigDecimal bigDecimal) {
        return (i() || h() || bigDecimal.compareTo(BigDecimal.ZERO) != 0) ? false : true;
    }

    private String l() {
        StringBuilder sb2 = new StringBuilder();
        BigDecimal bigDecimalA = a();
        String string = bigDecimalA.unscaledValue().abs().toString();
        if (j()) {
            sb2.append(CoreConstants.DASH_CHAR);
        }
        int i11 = -bigDecimalA.scale();
        int length = (string.length() - 1) + i11;
        if (i11 > 0 || length < -6) {
            sb2.append(string.charAt(0));
            if (string.length() > 1) {
                sb2.append(CoreConstants.DOT);
                sb2.append((CharSequence) string, 1, string.length());
            }
            sb2.append('E');
            if (length > 0) {
                sb2.append('+');
            }
            sb2.append(length);
        } else if (i11 == 0) {
            sb2.append(string);
        } else {
            int length2 = (-i11) - string.length();
            if (length2 >= 0) {
                sb2.append('0');
                sb2.append(CoreConstants.DOT);
                for (int i12 = 0; i12 < length2; i12++) {
                    sb2.append('0');
                }
                sb2.append((CharSequence) string, 0, string.length());
            } else {
                int i13 = -length2;
                sb2.append((CharSequence) string, 0, i13);
                sb2.append(CoreConstants.DOT);
                sb2.append((CharSequence) string, i13, i13 - i11);
            }
        }
        return sb2.toString();
    }

    private boolean m() {
        return (this.f99288a & 6917529027641081856L) == 6917529027641081856L;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Decimal128 decimal128) {
        if (i()) {
            return !decimal128.i() ? 1 : 0;
        }
        if (h()) {
            if (j()) {
                return (decimal128.h() && decimal128.j()) ? 0 : -1;
            }
            if (decimal128.i()) {
                return -1;
            }
            return (!decimal128.h() || decimal128.j()) ? 1 : 0;
        }
        BigDecimal bigDecimalA = a();
        BigDecimal bigDecimalA2 = decimal128.a();
        if (k(bigDecimalA) && decimal128.k(bigDecimalA2)) {
            if (g(bigDecimalA)) {
                return decimal128.g(bigDecimalA2) ? 0 : -1;
            }
            if (decimal128.g(bigDecimalA2)) {
                return 1;
            }
        }
        if (decimal128.i()) {
            return -1;
        }
        if (decimal128.h()) {
            return decimal128.j() ? 1 : -1;
        }
        return bigDecimalA.compareTo(bigDecimalA2);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        if (i()) {
            return Double.NaN;
        }
        if (h()) {
            return j() ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
        }
        BigDecimal bigDecimalA = a();
        if (g(bigDecimalA)) {
            return -0.0d;
        }
        return bigDecimalA.doubleValue();
    }

    public long e() {
        return this.f99288a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Decimal128.class != obj.getClass()) {
            return false;
        }
        Decimal128 decimal128 = (Decimal128) obj;
        return this.f99288a == decimal128.f99288a && this.f99289b == decimal128.f99289b;
    }

    public long f() {
        return this.f99289b;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) doubleValue();
    }

    public boolean h() {
        return (this.f99288a & 8646911284551352320L) == 8646911284551352320L;
    }

    public int hashCode() {
        long j11 = this.f99289b;
        int i11 = ((int) (j11 ^ (j11 >>> 32))) * 31;
        long j12 = this.f99288a;
        return i11 + ((int) ((j12 >>> 32) ^ j12));
    }

    public boolean i() {
        return (this.f99288a & 8935141660703064064L) == 8935141660703064064L;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) doubleValue();
    }

    public boolean j() {
        return (this.f99288a & Long.MIN_VALUE) == Long.MIN_VALUE;
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) doubleValue();
    }

    public String toString() {
        if (i()) {
            return "NaN";
        }
        if (h()) {
            return j() ? "-Infinity" : "Infinity";
        }
        return l();
    }
}
