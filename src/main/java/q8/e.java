package q8;

import com.google.common.collect.r0;
import com.google.common.collect.x;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class e implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r0<t9.d> f104892b = r0.f().j(new ou.h() { // from class: q8.c
        @Override // ou.h
        public final Object apply(Object obj) {
            return Long.valueOf(((t9.d) obj).f112956b);
        }
    }).a(r0.f().l().j(new ou.h() { // from class: q8.d
        @Override // ou.h
        public final Object apply(Object obj) {
            return Long.valueOf(((t9.d) obj).f112957c);
        }
    }));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<t9.d> f104893a = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q8.a
    public x<r7.a> a(long j11) {
        if (!this.f104893a.isEmpty()) {
            if (j11 >= this.f104893a.get(0).f112956b) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < this.f104893a.size(); i11++) {
                    t9.d dVar = this.f104893a.get(i11);
                    if (j11 >= dVar.f112956b && j11 < dVar.f112958d) {
                        arrayList.add(dVar);
                    }
                    if (j11 < dVar.f112956b) {
                        break;
                    }
                }
                x xVarY = x.y(f104892b, arrayList);
                x.a aVarK = x.k();
                for (int i12 = 0; i12 < xVarY.size(); i12++) {
                    aVarK.j(((t9.d) xVarY.get(i12)).f112955a);
                }
                return aVarK.k();
            }
        }
        return x.r();
    }

    @Override // q8.a
    public long b(long j11) {
        long jMin = -9223372036854775807L;
        for (int i11 = 0; i11 < this.f104893a.size(); i11++) {
            long j12 = this.f104893a.get(i11).f112956b;
            long j13 = this.f104893a.get(i11).f112958d;
            if (j11 < j12) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j12);
                    break;
                }
                jMin = j12;
                break;
            }
            if (j11 < j13) {
                jMin = jMin == -9223372036854775807L ? j13 : Math.min(jMin, j13);
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // q8.a
    public void c(long j11) {
        int i11 = 0;
        while (i11 < this.f104893a.size()) {
            long j12 = this.f104893a.get(i11).f112956b;
            if (j11 > j12 && j11 > this.f104893a.get(i11).f112958d) {
                this.f104893a.remove(i11);
                i11--;
            } else if (j11 < j12) {
                return;
            }
            i11++;
        }
    }

    @Override // q8.a
    public void clear() {
        this.f104893a.clear();
    }

    @Override // q8.a
    public long d(long j11) {
        if (this.f104893a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j11 < this.f104893a.get(0).f112956b) {
            return -9223372036854775807L;
        }
        long jMax = this.f104893a.get(0).f112956b;
        for (int i11 = 0; i11 < this.f104893a.size(); i11++) {
            long j12 = this.f104893a.get(i11).f112956b;
            long j13 = this.f104893a.get(i11).f112958d;
            if (j13 > j11) {
                if (j12 > j11) {
                    break;
                }
                jMax = Math.max(jMax, j12);
            } else {
                jMax = Math.max(jMax, j13);
            }
        }
        return jMax;
    }

    @Override // q8.a
    public boolean e(t9.d dVar, long j11) {
        s7.a.a(dVar.f112956b != -9223372036854775807L);
        s7.a.a(dVar.f112957c != -9223372036854775807L);
        boolean z11 = dVar.f112956b <= j11 && j11 < dVar.f112958d;
        for (int size = this.f104893a.size() - 1; size >= 0; size--) {
            if (dVar.f112956b >= this.f104893a.get(size).f112956b) {
                this.f104893a.add(size + 1, dVar);
                return z11;
            }
        }
        this.f104893a.add(0, dVar);
        return z11;
    }
}
