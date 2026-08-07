package zn0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "seed", "Lzn0/c;", "a", "(J)Lzn0/c;", "", "value", "e", "(I)I", "bitCount", "f", "(II)I", "from", "until", "Ljn0/h0;", "c", "(II)V", DateTokenConverter.CONVERTER_KEY, "(JJ)V", "", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    public static final c a(long j11) {
        return new e((int) j11, (int) (j11 >> 32));
    }

    public static final String b(Object from, Object until) {
        s.k(from, "from");
        s.k(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void c(int i11, int i12) {
        if (i12 <= i11) {
            throw new IllegalArgumentException(b(Integer.valueOf(i11), Integer.valueOf(i12)).toString());
        }
    }

    public static final void d(long j11, long j12) {
        if (j12 <= j11) {
            throw new IllegalArgumentException(b(Long.valueOf(j11), Long.valueOf(j12)).toString());
        }
    }

    public static final int e(int i11) {
        return 31 - Integer.numberOfLeadingZeros(i11);
    }

    public static final int f(int i11, int i12) {
        return (i11 >>> (32 - i12)) & ((-i12) >> 31);
    }
}
