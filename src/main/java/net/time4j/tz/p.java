package net.time4j.tz;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.EnumC4419g;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements Comparable<p>, k, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap<Integer, p> f94815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final BigDecimal f94816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final BigDecimal f94817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final BigDecimal f94818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final BigDecimal f94819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final BigDecimal f94820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final BigDecimal f94821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p f94822k;
    private static final long serialVersionUID = -1410512619471503090L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient int f94823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f94824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient String f94825c;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f94815d = concurrentHashMap;
        f94816e = new BigDecimal(60);
        f94817f = new BigDecimal(3600);
        f94818g = new BigDecimal(-180);
        f94819h = new BigDecimal(180);
        f94820i = new BigDecimal(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        f94821j = new BigDecimal(Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
        p pVar = new p(0, 0);
        f94822k = pVar;
        concurrentHashMap.put(0, pVar);
    }

    private p(int i11, int i12) {
        if (i12 != 0) {
            if (Math.abs(i12) > 999999999) {
                throw new IllegalArgumentException("Fraction out of range: " + i12);
            }
            if (i11 < -39600 || i11 > 39600) {
                throw new IllegalArgumentException("Total seconds out of range while fraction is non-zero: " + i11);
            }
            if ((i11 < 0 && i12 > 0) || (i11 > 0 && i12 < 0)) {
                throw new IllegalArgumentException("Different signs: offset=" + i11 + ", fraction=" + i12);
            }
        } else if (i11 < -64800 || i11 > 64800) {
            throw new IllegalArgumentException("Total seconds out of range: " + i11);
        }
        boolean z11 = i11 < 0 || i12 < 0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z11 ? CoreConstants.DASH_CHAR : '+');
        int iAbs = Math.abs(i11);
        int i13 = iAbs / 3600;
        int i14 = (iAbs / 60) % 60;
        int i15 = iAbs % 60;
        if (i13 < 10) {
            sb2.append('0');
        }
        sb2.append(i13);
        sb2.append(CoreConstants.COLON_CHAR);
        if (i14 < 10) {
            sb2.append('0');
        }
        sb2.append(i14);
        if (i15 != 0 || i12 != 0) {
            sb2.append(CoreConstants.COLON_CHAR);
            if (i15 < 10) {
                sb2.append('0');
            }
            sb2.append(i15);
            if (i12 != 0) {
                sb2.append(CoreConstants.DOT);
                String strValueOf = String.valueOf(Math.abs(i12));
                int length = 9 - strValueOf.length();
                for (int i16 = 0; i16 < length; i16++) {
                    sb2.append('0');
                }
                sb2.append(strValueOf);
            }
        }
        this.f94825c = sb2.toString();
        this.f94823a = i11;
        this.f94824b = i12;
    }

    public static p b(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(f94819h) > 0 || bigDecimal.compareTo(f94818g) < 0) {
            throw new IllegalArgumentException("Out of range: " + bigDecimal);
        }
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(f94820i);
        BigDecimal scale = bigDecimalMultiply.setScale(0, RoundingMode.DOWN);
        BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.subtract(scale).setScale(9, RoundingMode.HALF_UP).multiply(f94821j);
        int iIntValueExact = scale.intValueExact();
        int iIntValueExact2 = bigDecimalMultiply2.intValueExact();
        if (iIntValueExact2 == 0) {
            return p(iIntValueExact);
        }
        if (iIntValueExact2 == 1000000000) {
            return p(iIntValueExact + 1);
        }
        return iIntValueExact2 == -1000000000 ? p(iIntValueExact - 1) : new p(iIntValueExact, iIntValueExact2);
    }

    public static p c(f fVar, int i11, int i12, double d11) {
        if (fVar == null) {
            throw new NullPointerException("Missing sign.");
        }
        if (i11 < 0 || i11 > 180) {
            throw new IllegalArgumentException("Degrees of longitude out of range (0 <= degrees <= 180).");
        }
        if (i12 < 0 || i12 > 59) {
            throw new IllegalArgumentException("Arc minute out of range (0 <= arcMinutes <= 59).");
        }
        if (Double.compare(d11, 0.0d) < 0 || Double.compare(d11, 60.0d) >= 0) {
            throw new IllegalArgumentException("Arc second out of range (0.0 <= arcSeconds < 60.0).");
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
        if (i12 != 0) {
            bigDecimalValueOf = bigDecimalValueOf.add(BigDecimal.valueOf(i12).setScale(15, RoundingMode.UNNECESSARY).divide(f94816e, RoundingMode.HALF_UP));
        }
        if (d11 != 0.0d) {
            bigDecimalValueOf = bigDecimalValueOf.add(BigDecimal.valueOf(d11).setScale(15, RoundingMode.FLOOR).divide(f94817f, RoundingMode.HALF_UP));
        }
        if (fVar == f.BEHIND_UTC) {
            bigDecimalValueOf = bigDecimalValueOf.negate();
        }
        return b(bigDecimalValueOf);
    }

    private static String e(int i11, int i12) {
        return "[hours=" + i11 + ",minutes=" + i12 + ']';
    }

    public static p n(f fVar, int i11) {
        return o(fVar, i11, 0);
    }

    public static p o(f fVar, int i11, int i12) {
        if (fVar == null) {
            throw new NullPointerException("Missing sign.");
        }
        if (i11 < 0 || i11 > 18) {
            throw new IllegalArgumentException("Hour part out of range (0 <= hours <= 18) in: " + e(i11, i12));
        }
        if (i12 < 0 || i12 > 59) {
            throw new IllegalArgumentException("Minute part out of range (0 <= minutes <= 59) in: " + e(i11, i12));
        }
        if (i11 != 18 || i12 == 0) {
            int i13 = (i11 * 3600) + (i12 * 60);
            if (fVar == f.BEHIND_UTC) {
                i13 = -i13;
            }
            return p(i13);
        }
        throw new IllegalArgumentException("Time zone offset out of range (-18:00:00 <= offset <= 18:00:00) in: " + e(i11, i12));
    }

    public static p p(int i11) {
        return q(i11, 0);
    }

    public static p q(int i11, int i12) {
        if (i12 != 0) {
            return new p(i11, i12);
        }
        if (i11 == 0) {
            return f94822k;
        }
        if (i11 % 900 != 0) {
            return new p(i11, 0);
        }
        Integer numValueOf = Integer.valueOf(i11);
        ConcurrentMap<Integer, p> concurrentMap = f94815d;
        p pVar = concurrentMap.get(numValueOf);
        if (pVar != null) {
            return pVar;
        }
        concurrentMap.putIfAbsent(numValueOf, new p(i11, 0));
        return concurrentMap.get(numValueOf);
    }

    private static int r(String str, int i11, int i12) {
        int iMin = Math.min(str.length() - i11, i12);
        int i13 = -1;
        for (int i14 = 0; i14 < iMin; i14++) {
            char cCharAt = str.charAt(i11 + i14);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            i13 = i13 == -1 ? cCharAt - '0' : (i13 * 10) + (cCharAt - '0');
        }
        return i13;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    static p s(String str, boolean z11) {
        String strSubstring;
        f fVar;
        int iR;
        int iR2;
        if (str.equals("Z")) {
            return f94822k;
        }
        int length = str.length();
        if (length < 3) {
            strSubstring = str;
        } else if (str.startsWith("UTC")) {
            strSubstring = str.substring(3);
            length -= 3;
        } else {
            if (str.startsWith("GMT")) {
                if (!z11) {
                    return null;
                }
                throw new IllegalArgumentException("Use UTC-prefix for canonical offset instead: " + str);
            }
            strSubstring = str;
        }
        if (length >= 2) {
            if (strSubstring.charAt(0) == '-') {
                fVar = f.BEHIND_UTC;
            } else {
                fVar = strSubstring.charAt(0) == '+' ? f.AHEAD_OF_UTC : null;
            }
            int iR3 = r(strSubstring, 1, 2);
            if (iR3 >= 0) {
                if (length <= 3) {
                    return n(fVar, iR3);
                }
                int i11 = strSubstring.charAt(2) != ':' ? 4 : 3;
                int iR4 = r(strSubstring, i11, 2);
                if (strSubstring.charAt(i11 - 1) == ':' && iR4 >= 0) {
                    int i12 = i11 + 2;
                    if (length == i12) {
                        return o(fVar, iR3, iR4);
                    }
                    int i13 = i11 + 5;
                    if (length >= i13 && strSubstring.charAt(i12) == ':' && (iR = r(strSubstring, i11 + 3, 2)) >= 0) {
                        int i14 = (iR3 * 3600) + (iR4 * 60) + iR;
                        f fVar2 = f.BEHIND_UTC;
                        if (fVar == fVar2) {
                            i14 = -i14;
                        }
                        if (length == i13) {
                            return p(i14);
                        }
                        if (length == i11 + 15 && strSubstring.charAt(i13) == '.' && (iR2 = r(strSubstring, i11 + 6, 9)) >= 0) {
                            if (fVar == fVar2) {
                                iR2 = -iR2;
                            }
                            return q(i14, iR2);
                        }
                    }
                }
            }
        }
        if (!z11) {
            return null;
        }
        throw new IllegalArgumentException("No canonical zonal offset: " + str);
    }

    private Object writeReplace() {
        return new SPX(this, 15);
    }

    @Override // net.time4j.tz.k
    public String a() {
        if (this.f94823a == 0 && this.f94824b == 0) {
            return "Z";
        }
        return "UTC" + this.f94825c;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(p pVar) {
        int i11 = this.f94823a;
        int i12 = pVar.f94823a;
        if (i11 < i12) {
            return -1;
        }
        if (i11 > i12) {
            return 1;
        }
        int i13 = this.f94824b - pVar.f94824b;
        if (i13 < 0) {
            return -1;
        }
        return i13 == 0 ? 0 : 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f94823a == pVar.f94823a && this.f94824b == pVar.f94824b) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return Math.abs(this.f94823a) / 3600;
    }

    public int g() {
        return (Math.abs(this.f94823a) / 60) % 60;
    }

    public int h() {
        return Math.abs(this.f94823a) % 60;
    }

    public int hashCode() {
        return (~this.f94823a) + (this.f94824b % 64000);
    }

    public int i() {
        return this.f94824b;
    }

    public int j() {
        return this.f94823a;
    }

    j k() {
        return j.R(this);
    }

    public f l() {
        return (this.f94823a < 0 || this.f94824b < 0) ? f.BEHIND_UTC : f.AHEAD_OF_UTC;
    }

    public String m(Locale locale) {
        boolean z11 = this.f94823a == 0 && this.f94824b == 0;
        try {
            return l.f94777t.c(z11, locale);
        } catch (Throwable unused) {
            return z11 ? "GMT" : "GMT±hh:mm";
        }
    }

    public String toString() {
        return this.f94825c;
    }
}
