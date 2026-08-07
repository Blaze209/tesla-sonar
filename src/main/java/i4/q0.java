package i4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"", "Li4/p0;", "range", "", "e", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "", "start", "end", "b", "(II)J", "index", "a", "(I)J", "minimumValue", "maximumValue", "c", "(JII)J", "", DateTokenConverter.CONVERTER_KEY, "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q0 {
    public static final long a(int i11) {
        return b(i11, i11);
    }

    public static final long b(int i11, int i12) {
        return p0.c(d(i11, i12));
    }

    public static final long c(long j11, int i11, int i12) {
        int iN = bo0.n.n(p0.n(j11), i11, i12);
        int iN2 = bo0.n.n(p0.i(j11), i11, i12);
        return (iN == p0.n(j11) && iN2 == p0.i(j11)) ? j11 : b(iN, iN2);
    }

    private static final long d(int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i11 + ", end: " + i12 + ']').toString());
        }
        if (i12 >= 0) {
            return (((long) i12) & 4294967295L) | (((long) i11) << 32);
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i11 + ", end: " + i12 + ']').toString());
    }

    public static final String e(CharSequence charSequence, long j11) {
        return charSequence.subSequence(p0.l(j11), p0.k(j11)).toString();
    }
}
