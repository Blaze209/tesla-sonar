package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e3> f3155a = new ArrayList();

    private static void b(List<int[]> list, int i11, int[] iArr, int i12) {
        if (i12 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = 0;
            while (true) {
                if (i14 >= i12) {
                    iArr[i12] = i13;
                    b(list, i11, iArr, i12 + 1);
                    break;
                } else if (i13 == iArr[i14]) {
                    break;
                } else {
                    i14++;
                }
            }
        }
    }

    private List<int[]> c(int i11) {
        ArrayList arrayList = new ArrayList();
        b(arrayList, i11, new int[i11], 0);
        return arrayList;
    }

    public boolean a(@NonNull e3 e3Var) {
        return this.f3155a.add(e3Var);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[RETURN] */
    public List<e3> d(@NonNull List<e3> list) {
        int i11;
        boolean zG;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.f3155a.size()) {
            return null;
        }
        List<int[]> listC = c(this.f3155a.size());
        e3[] e3VarArr = new e3[list.size()];
        Iterator<int[]> it = listC.iterator();
        do {
            i11 = 0;
            if (it.hasNext()) {
                int[] next = it.next();
                zG = true;
                while (i11 < this.f3155a.size()) {
                    if (next[i11] < list.size()) {
                        zG &= this.f3155a.get(i11).g(list.get(next[i11]));
                        if (!zG) {
                            break;
                        }
                        e3VarArr[next[i11]] = this.f3155a.get(i11);
                    }
                    i11++;
                }
            }
            if (i11 != 0) {
                return Arrays.asList(e3VarArr);
            }
            return null;
        } while (!zG);
        i11 = 1;
        if (i11 != 0) {
            return Arrays.asList(e3VarArr);
        }
        return null;
    }
}
