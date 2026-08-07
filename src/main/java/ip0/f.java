package ip0;

import okio.o0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "", "value", "fromIndex", "toIndex", "a", "([IIII)I", "Lokio/o0;", "pos", "b", "(Lokio/o0;I)I", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final int a(int[] iArr, int i11, int i12, int i13) {
        s.k(iArr, "<this>");
        int i14 = i13 - 1;
        while (i12 <= i14) {
            int i15 = (i12 + i14) >>> 1;
            int i16 = iArr[i15];
            if (i16 < i11) {
                i12 = i15 + 1;
            } else {
                if (i16 <= i11) {
                    return i15;
                }
                i14 = i15 - 1;
            }
        }
        return (-i12) - 1;
    }

    public static final int b(o0 o0Var, int i11) {
        s.k(o0Var, "<this>");
        int iA = a(o0Var.getDirectory(), i11 + 1, 0, o0Var.getSegments().length);
        return iA >= 0 ? iA : ~iA;
    }
}
