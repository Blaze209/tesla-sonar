package b3;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "", "value", "a", "([II)I", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    public static final int a(int[] iArr, int i11) {
        int length = iArr.length - 1;
        int i12 = 0;
        while (i12 <= length) {
            int i13 = (i12 + length) >>> 1;
            int i14 = iArr[i13];
            if (i11 > i14) {
                i12 = i13 + 1;
            } else {
                if (i11 >= i14) {
                    return i13;
                }
                length = i13 - 1;
            }
        }
        return -(i12 + 1);
    }
}
