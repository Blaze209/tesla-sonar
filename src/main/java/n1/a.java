package n1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0007\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0010\u001a'\u0010\b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\b\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00118\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016\"\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001b"}, d2 = {"", "need", "e", "(I)I", "f", DateTokenConverter.CONVERTER_KEY, "", "a", "b", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "array", "size", "value", "([III)I", "", "", "([JIJ)I", "[I", "EMPTY_INTS", "[J", "EMPTY_LONGS", "", "[Ljava/lang/Object;", "EMPTY_OBJECTS", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f92645a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f92646b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f92647c = new Object[0];

    public static final int a(int[] array, int i11, int i12) {
        s.k(array, "array");
        int i13 = i11 - 1;
        int i14 = 0;
        while (i14 <= i13) {
            int i15 = (i14 + i13) >>> 1;
            int i16 = array[i15];
            if (i16 < i12) {
                i14 = i15 + 1;
            } else {
                if (i16 <= i12) {
                    return i15;
                }
                i13 = i15 - 1;
            }
        }
        return ~i14;
    }

    public static final int b(long[] array, int i11, long j11) {
        s.k(array, "array");
        int i12 = i11 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            long j12 = array[i14];
            if (j12 < j11) {
                i13 = i14 + 1;
            } else {
                if (j12 <= j11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static final boolean c(Object obj, Object obj2) {
        return s.f(obj, obj2);
    }

    public static final int d(int i11) {
        for (int i12 = 4; i12 < 32; i12++) {
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                return i13;
            }
        }
        return i11;
    }

    public static final int e(int i11) {
        return d(i11 * 4) / 4;
    }

    public static final int f(int i11) {
        return d(i11 * 8) / 8;
    }
}
