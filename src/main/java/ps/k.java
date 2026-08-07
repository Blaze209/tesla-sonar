package ps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class k implements gs.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e> f103982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f103983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f103984c;

    public k(List<e> list) {
        this.f103982a = Collections.unmodifiableList(new ArrayList(list));
        this.f103983b = new long[list.size() * 2];
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            int i12 = i11 * 2;
            long[] jArr = this.f103983b;
            jArr[i12] = eVar.f103953b;
            jArr[i12 + 1] = eVar.f103954c;
        }
        long[] jArr2 = this.f103983b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f103984c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // gs.i
    public long a(int i11) {
        ts.a.a(i11 >= 0);
        ts.a.a(i11 < this.f103984c.length);
        return this.f103984c[i11];
    }

    @Override // gs.i
    public int b() {
        return this.f103984c.length;
    }

    @Override // gs.i
    public int c(long j11) {
        int iE = p0.e(this.f103984c, j11, false, false);
        if (iE < this.f103984c.length) {
            return iE;
        }
        return -1;
    }

    @Override // gs.i
    public List<gs.b> d(long j11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < this.f103982a.size(); i11++) {
            long[] jArr = this.f103983b;
            int i12 = i11 * 2;
            if (jArr[i12] <= j11 && j11 < jArr[i12 + 1]) {
                e eVar = this.f103982a.get(i11);
                gs.b bVar = eVar.f103952a;
                if (bVar.f69477e == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: ps.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((e) obj).f103953b, ((e) obj2).f103953b);
            }
        });
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            arrayList.add(((e) arrayList2.get(i13)).f103952a.b().h((-1) - i13, 1).a());
        }
        return arrayList;
    }
}
