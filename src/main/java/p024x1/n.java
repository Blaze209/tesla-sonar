package p024x1;

import bo0.j;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx1/t;", "Lx1/e0;", "pinnedItemList", "Lx1/j;", "beyondBoundsInfo", "", "", "a", "(Lx1/t;Lx1/e0;Lx1/j;)Ljava/util/List;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class n {
    public static final List<Integer> a(t tVar, e0 e0Var, j jVar) {
        if (!jVar.d() && e0Var.isEmpty()) {
            return v.m();
        }
        ArrayList arrayList = new ArrayList();
        j jVar2 = jVar.d() ? new j(jVar.c(), Math.min(jVar.b(), tVar.a() - 1)) : j.INSTANCE.a();
        int size = e0Var.size();
        for (int i11 = 0; i11 < size; i11++) {
            e0.a aVar = e0Var.get(i11);
            int iA = u.a(tVar, aVar.getKey(), aVar.getIndex());
            int first = jVar2.getFirst();
            if ((iA > jVar2.getLast() || first > iA) && iA >= 0 && iA < tVar.a()) {
                arrayList.add(Integer.valueOf(iA));
            }
        }
        int first2 = jVar2.getFirst();
        int last = jVar2.getLast();
        if (first2 <= last) {
            while (true) {
                arrayList.add(Integer.valueOf(first2));
                if (first2 == last) {
                    break;
                }
                first2++;
            }
        }
        return arrayList;
    }
}
