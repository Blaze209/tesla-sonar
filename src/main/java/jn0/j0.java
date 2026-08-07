package jn0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", "v1", "v2", "b", "(II)I", "", DateTokenConverter.CONVERTER_KEY, "(JJ)I", "value", "", "c", "(I)D", "e", "(J)D", "Ljn0/c0;", "a", "(D)J", "base", "", "f", "(JI)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j0 {
    public static final long a(double d11) {
        if (Double.isNaN(d11) || d11 <= e(0L)) {
            return 0L;
        }
        if (d11 >= e(-1L)) {
            return -1L;
        }
        return d11 < 9.223372036854776E18d ? c0.b((long) d11) : c0.b(c0.b((long) (d11 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    public static final int b(int i11, int i12) {
        return p013kotlin.jvm.internal.s.m(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE);
    }

    public static final double c(int i11) {
        return ((double) (Integer.MAX_VALUE & i11)) + (((double) ((i11 >>> 31) << 30)) * ((double) 2));
    }

    public static final int d(long j11, long j12) {
        return p013kotlin.jvm.internal.s.n(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
    }

    public static final double e(long j11) {
        return ((j11 >>> 11) * ((double) 2048)) + (j11 & 2047);
    }

    public static final String f(long j11, int i11) {
        if (j11 >= 0) {
            String string = Long.toString(j11, p013kotlin.text.a.a(i11));
            p013kotlin.jvm.internal.s.j(string, "toString(...)");
            return string;
        }
        long j12 = i11;
        long j13 = ((j11 >>> 1) / j12) << 1;
        long j14 = j11 - (j13 * j12);
        if (j14 >= j12) {
            j14 -= j12;
            j13++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j13, p013kotlin.text.a.a(i11));
        p013kotlin.jvm.internal.s.j(string2, "toString(...)");
        sb2.append(string2);
        String string3 = Long.toString(j14, p013kotlin.text.a.a(i11));
        p013kotlin.jvm.internal.s.j(string3, "toString(...)");
        sb2.append(string3);
        return sb2.toString();
    }
}
