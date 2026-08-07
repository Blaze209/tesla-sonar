package t9;

import com.google.common.collect.c0;
import com.google.common.collect.r0;
import com.google.common.collect.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
final class f implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r0<d> f112959c = r0.f().j(new ou.h() { // from class: t9.e
        @Override // ou.h
        public final Object apply(Object obj) {
            return Long.valueOf(f.g(((d) obj).f112956b));
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x<x<r7.a>> f112960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f112961b;

    /* JADX WARN: Code duplicated, block: B:24:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    public f(List<d> list) {
        if (list.size() == 1) {
            d dVar = (d) c0.g(list);
            long jG = g(dVar.f112956b);
            if (dVar.f112957c == -9223372036854775807L) {
                this.f112960a = x.s(dVar.f112955a);
                this.f112961b = new long[]{jG};
                return;
            } else {
                this.f112960a = x.t(dVar.f112955a, x.r());
                this.f112961b = new long[]{jG, dVar.f112957c + jG};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.f112961b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        x xVarY = x.y(f112959c, list);
        int i11 = 0;
        for (int i12 = 0; i12 < xVarY.size(); i12++) {
            d dVar2 = (d) xVarY.get(i12);
            long jG2 = g(dVar2.f112956b);
            long j11 = dVar2.f112957c + jG2;
            if (i11 != 0) {
                int i13 = i11 - 1;
                long j12 = this.f112961b[i13];
                if (j12 < jG2) {
                    this.f112961b[i11] = jG2;
                    arrayList.add(dVar2.f112955a);
                    i11++;
                } else if (j12 == jG2 && ((x) arrayList.get(i13)).isEmpty()) {
                    arrayList.set(i13, dVar2.f112955a);
                } else {
                    s7.t.i("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.f112961b[i13] = jG2;
                    arrayList.set(i13, dVar2.f112955a);
                }
            } else {
                this.f112961b[i11] = jG2;
                arrayList.add(dVar2.f112955a);
                i11++;
            }
            if (dVar2.f112957c != -9223372036854775807L) {
                this.f112961b[i11] = j11;
                arrayList.add(x.r());
                i11++;
            }
        }
        this.f112960a = x.n(arrayList);
    }

    private static long g(long j11) {
        if (j11 == -9223372036854775807L) {
            return 0L;
        }
        return j11;
    }

    @Override // t9.j
    public long a(int i11) {
        s7.a.a(i11 < this.f112960a.size());
        return this.f112961b[i11];
    }

    @Override // t9.j
    public int b() {
        return this.f112960a.size();
    }

    @Override // t9.j
    public int c(long j11) {
        int iG = q0.g(this.f112961b, j11, false, false);
        if (iG < this.f112960a.size()) {
            return iG;
        }
        return -1;
    }

    @Override // t9.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public x<r7.a> d(long j11) {
        int iK = q0.k(this.f112961b, j11, true, false);
        return iK == -1 ? x.r() : this.f112960a.get(iK);
    }
}
