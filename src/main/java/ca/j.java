package ca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
final class j implements t9.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<d> f19015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f19016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f19017c;

    public j(List<d> list) {
        this.f19015a = Collections.unmodifiableList(new ArrayList(list));
        this.f19016b = new long[list.size() * 2];
        for (int i11 = 0; i11 < list.size(); i11++) {
            d dVar = list.get(i11);
            int i12 = i11 * 2;
            long[] jArr = this.f19016b;
            jArr[i12] = dVar.f18986b;
            jArr[i12 + 1] = dVar.f18987c;
        }
        long[] jArr2 = this.f19016b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f19017c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // t9.j
    public long a(int i11) {
        s7.a.a(i11 >= 0);
        s7.a.a(i11 < this.f19017c.length);
        return this.f19017c[i11];
    }

    @Override // t9.j
    public int b() {
        return this.f19017c.length;
    }

    @Override // t9.j
    public int c(long j11) {
        int iG = q0.g(this.f19017c, j11, false, false);
        if (iG < this.f19017c.length) {
            return iG;
        }
        return -1;
    }

    @Override // t9.j
    public List<r7.a> d(long j11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < this.f19015a.size(); i11++) {
            long[] jArr = this.f19016b;
            int i12 = i11 * 2;
            if (jArr[i12] <= j11 && j11 < jArr[i12 + 1]) {
                d dVar = this.f19015a.get(i11);
                r7.a aVar = dVar.f18985a;
                if (aVar.f107070e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: ca.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((d) obj).f18986b, ((d) obj2).f18986b);
            }
        });
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            arrayList.add(((d) arrayList2.get(i13)).f18985a.a().h((-1) - i13, 1).a());
        }
        return arrayList;
    }
}
