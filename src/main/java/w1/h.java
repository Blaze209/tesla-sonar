package w1;

import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\u001aM\u0010\u000b\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "Lw1/s;", "composedVisibleItems", "Lw1/t;", "itemProvider", "", "", "headerIndexes", "beforeContentPadding", "layoutWidth", "layoutHeight", "a", "(Ljava/util/List;Lw1/t;Ljava/util/List;III)Lw1/s;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {
    public static final s a(List<s> list, t tVar, List<Integer> list2, int i11, int i12, int i13) {
        int index = ((s) p013kotlin.collections.v.o0(list)).getIndex();
        int size = list2.size();
        int iIntValue = -1;
        int iIntValue2 = -1;
        int i14 = 0;
        while (i14 < size && list2.get(i14).intValue() <= index) {
            iIntValue2 = list2.get(i14).intValue();
            i14++;
            iIntValue = ((i14 < 0 || i14 > p013kotlin.collections.v.o(list2)) ? -1 : list2.get(i14)).intValue();
        }
        int size2 = list.size();
        int offset = Integer.MIN_VALUE;
        int offset2 = Integer.MIN_VALUE;
        int i15 = -1;
        for (int i16 = 0; i16 < size2; i16++) {
            s sVar = list.get(i16);
            if (sVar.getIndex() == iIntValue2) {
                offset = sVar.getOffset();
                i15 = i16;
            } else if (sVar.getIndex() == iIntValue) {
                offset2 = sVar.getOffset();
            }
        }
        if (iIntValue2 == -1) {
            return null;
        }
        s sVarE = t.e(tVar, iIntValue2, 0L, 2, null);
        sVarE.c(true);
        int iMax = offset != Integer.MIN_VALUE ? Math.max(-i11, offset) : -i11;
        if (offset2 != Integer.MIN_VALUE) {
            iMax = Math.min(iMax, offset2 - sVarE.getSize());
        }
        sVarE.q(iMax, i12, i13);
        if (i15 != -1) {
            list.set(i15, sVarE);
            return sVarE;
        }
        list.add(0, sVarE);
        return sVarE;
    }
}
