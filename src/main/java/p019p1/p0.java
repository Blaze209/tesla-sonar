package p019p1;

import androidx.collection.m;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001a/\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/collection/m;", "", "element", "fromIndex", "toIndex", "a", "(Landroidx/collection/m;III)I", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class p0 {
    public static final int a(m mVar, int i11, int i12, int i13) {
        if (!(i12 <= i13)) {
            x0.a("fromIndex(" + i12 + ") > toIndex(" + i13 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        if (i12 < 0) {
            throw new IndexOutOfBoundsException("Index out of range: " + i12);
        }
        if (i13 > mVar.get_size()) {
            throw new IndexOutOfBoundsException("Index out of range: " + i13);
        }
        int i14 = i13 - 1;
        while (i12 <= i14) {
            int i15 = (i12 + i14) >>> 1;
            int iA = mVar.a(i15);
            if (iA < i11) {
                i12 = i15 + 1;
            } else {
                if (iA <= i11) {
                    return i15;
                }
                i14 = i15 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static /* synthetic */ int b(m mVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = mVar.get_size();
        }
        return a(mVar, i11, i12, i13);
    }
}
