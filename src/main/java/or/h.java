package or;

import dr.t;
import hr.a0;
import hr.z;
import ts.d0;
import ts.p0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f98492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f98493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f98494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f98495d;

    private h(long[] jArr, long[] jArr2, long j11, long j12) {
        this.f98492a = jArr;
        this.f98493b = jArr2;
        this.f98494c = j11;
        this.f98495d = j12;
    }

    public static h a(long j11, long j12, t.a aVar, d0 d0Var) {
        int iH;
        d0Var.V(10);
        int iQ = d0Var.q();
        h hVar = null;
        if (iQ <= 0) {
            return null;
        }
        int i11 = aVar.f60910d;
        long jM0 = p0.M0(iQ, ((long) (i11 >= 32000 ? 1152 : 576)) * 1000000, i11);
        int iN = d0Var.N();
        int iN2 = d0Var.N();
        int iN3 = d0Var.N();
        int i12 = 2;
        d0Var.V(2);
        long j13 = j12 + ((long) aVar.f60909c);
        long[] jArr = new long[iN];
        long[] jArr2 = new long[iN];
        int i13 = 0;
        long j14 = j12;
        while (i13 < iN) {
            h hVar2 = hVar;
            int i14 = iN2;
            long[] jArr3 = jArr;
            jArr3[i13] = (((long) i13) * jM0) / ((long) iN);
            jArr2[i13] = Math.max(j14, j13);
            if (iN3 == 1) {
                iH = d0Var.H();
            } else if (iN3 == i12) {
                iH = d0Var.N();
            } else if (iN3 == 3) {
                iH = d0Var.K();
            } else {
                if (iN3 != 4) {
                    return hVar2;
                }
                iH = d0Var.L();
            }
            j14 += ((long) iH) * ((long) i14);
            i13++;
            hVar = hVar2;
            iN2 = i14;
            jArr = jArr3;
            j13 = j13;
            i12 = 2;
        }
        long[] jArr4 = jArr;
        if (j11 != -1 && j11 != j14) {
            u.i("VbriSeeker", "VBRI data size mismatch: " + j11 + ", " + j14);
        }
        return new h(jArr4, jArr2, jM0, j14);
    }

    @Override // or.g
    public long b(long j11) {
        return this.f98492a[p0.i(this.f98493b, j11, true, true)];
    }

    @Override // hr.z
    public z.a c(long j11) {
        int i11 = p0.i(this.f98492a, j11, true, true);
        a0 a0Var = new a0(this.f98492a[i11], this.f98493b[i11]);
        if (a0Var.f73301a >= j11 || i11 == this.f98492a.length - 1) {
            return new z.a(a0Var);
        }
        int i12 = i11 + 1;
        return new z.a(a0Var, new a0(this.f98492a[i12], this.f98493b[i12]));
    }

    @Override // hr.z
    public boolean d() {
        return true;
    }

    @Override // or.g
    public long f() {
        return this.f98495d;
    }

    @Override // hr.z
    public long g() {
        return this.f98494c;
    }
}
