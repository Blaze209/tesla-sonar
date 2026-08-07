package ezvcard.util;

import ch.qos.logback.core.CoreConstants;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes8.dex */
public final class UtcOffset {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f63659a;

    public UtcOffset(boolean z11, int i11, int i12) {
        this.f63659a = ((long) (z11 ? 1 : -1)) * (b(Math.abs(i11)) + e(Math.abs(i12)));
    }

    private static long b(long j11) {
        return j11 * CoreConstants.MILLIS_IN_ONE_HOUR;
    }

    private static long c(long j11) {
        return ((j11 / 1000) / 60) / 60;
    }

    private static long d(long j11) {
        return ((j11 / 1000) / 60) % 60;
    }

    private static long e(long j11) {
        return j11 * 60000;
    }

    public static UtcOffset f(String str) {
        int i11;
        boolean z11;
        String strSubstring;
        int i12 = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt == '-') {
            z11 = false;
            i11 = 1;
        } else if (cCharAt == '+') {
            i11 = 1;
            z11 = true;
        } else {
            i11 = 0;
            z11 = true;
        }
        int i13 = i11 + 4;
        int iIndexOf = str.indexOf(58, i11);
        if (iIndexOf >= 0) {
            i13 = i11 + 5;
        }
        if (str.length() > i13) {
            throw xj0.b.INSTANCE.getIllegalArgumentException(40, str);
        }
        String strSubstring2 = null;
        if (iIndexOf < 0) {
            strSubstring = str.substring(i11);
            int length = strSubstring.length() - 2;
            if (length > 0) {
                strSubstring2 = strSubstring.substring(length);
                strSubstring = strSubstring.substring(0, length);
            }
        } else {
            strSubstring = str.substring(i11, iIndexOf);
            if (iIndexOf < str.length() - 1) {
                strSubstring2 = str.substring(iIndexOf + 1);
            }
        }
        try {
            int i14 = Integer.parseInt(strSubstring);
            if (strSubstring2 != null) {
                i12 = Integer.parseInt(strSubstring2);
            }
            return new UtcOffset(z11, i14, i12);
        } catch (NumberFormatException unused) {
            throw xj0.b.INSTANCE.getIllegalArgumentException(40, str);
        }
    }

    public static UtcOffset g(TimeZone timeZone) {
        return new UtcOffset(timeZone.getOffset(System.currentTimeMillis()));
    }

    public long a() {
        return this.f63659a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && UtcOffset.class == obj.getClass() && this.f63659a == ((UtcOffset) obj).f63659a;
    }

    public String h(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        long j11 = this.f63659a;
        boolean z12 = j11 >= 0;
        long jAbs = Math.abs(c(j11));
        long jAbs2 = Math.abs(d(this.f63659a));
        sb2.append(z12 ? '+' : CoreConstants.DASH_CHAR);
        if (jAbs < 10) {
            sb2.append('0');
        }
        sb2.append(jAbs);
        if (z11) {
            sb2.append(CoreConstants.COLON_CHAR);
        }
        if (jAbs2 < 10) {
            sb2.append('0');
        }
        sb2.append(jAbs2);
        return sb2.toString();
    }

    public int hashCode() {
        long j11 = this.f63659a;
        return 31 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return h(false);
    }

    public UtcOffset(long j11) {
        this.f63659a = j11;
    }
}
