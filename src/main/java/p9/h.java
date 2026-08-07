package p9;

import s7.c0;
import s7.q0;
import s7.t;
import w8.f0;
import w8.j0;
import w8.k0;

/* JADX INFO: loaded from: classes3.dex */
final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f102008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f102009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f102010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f102011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f102012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f102013f;

    private h(long[] jArr, long[] jArr2, long j11, long j12, long j13, int i11) {
        this.f102008a = jArr;
        this.f102009b = jArr2;
        this.f102010c = j11;
        this.f102011d = j12;
        this.f102012e = j13;
        this.f102013f = i11;
    }

    public static h a(long j11, long j12, f0.a aVar, c0 c0Var) {
        int iM;
        c0Var.c0(6);
        int iV = c0Var.v();
        long j13 = j12 + ((long) aVar.f121304c);
        long jMax = ((long) iV) + j13;
        int iV2 = c0Var.v();
        if (iV2 <= 0) {
            return null;
        }
        long jR1 = q0.r1((((long) iV2) * ((long) aVar.f121308g)) - 1, aVar.f121305d);
        int iU = c0Var.U();
        int iU2 = c0Var.U();
        int iU3 = c0Var.U();
        c0Var.c0(2);
        int i11 = iU2;
        long[] jArr = new long[iU];
        long[] jArr2 = new long[iU];
        int i12 = 0;
        long j14 = j12 + ((long) aVar.f121304c);
        while (i12 < iU) {
            long[] jArr3 = jArr2;
            long[] jArr4 = jArr;
            jArr4[i12] = (((long) i12) * jR1) / ((long) iU);
            jArr3[i12] = j14;
            if (iU3 == 1) {
                iM = c0Var.M();
            } else if (iU3 == 2) {
                iM = c0Var.U();
            } else if (iU3 == 3) {
                iM = c0Var.P();
            } else {
                if (iU3 != 4) {
                    return null;
                }
                iM = c0Var.Q();
            }
            int i13 = i12;
            int i14 = i11;
            j14 += ((long) iM) * ((long) i14);
            i11 = i14;
            i12 = i13 + 1;
            iU = iU;
            jArr = jArr4;
            jArr2 = jArr3;
        }
        long[] jArr5 = jArr2;
        long[] jArr6 = jArr;
        if (j11 != -1 && j11 != jMax) {
            t.i("VbriSeeker", "VBRI data size mismatch: " + j11 + ", " + jMax);
        }
        if (jMax != j14) {
            t.i("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + jMax + ", " + j14 + "\nSeeking will be inaccurate.");
            jMax = Math.max(jMax, j14);
        }
        return new h(jArr6, jArr5, jR1, j13, jMax, aVar.f121307f);
    }

    @Override // p9.g
    public long b(long j11) {
        return this.f102008a[q0.k(this.f102009b, j11, true, true)];
    }

    @Override // w8.j0
    public j0.a c(long j11) {
        int iK = q0.k(this.f102008a, j11, true, true);
        k0 k0Var = new k0(this.f102008a[iK], this.f102009b[iK]);
        if (k0Var.f121336a >= j11 || iK == this.f102008a.length - 1) {
            return new j0.a(k0Var);
        }
        int i11 = iK + 1;
        return new j0.a(k0Var, new k0(this.f102008a[i11], this.f102009b[i11]));
    }

    @Override // w8.j0
    public boolean d() {
        return true;
    }

    @Override // p9.g
    public long f() {
        return this.f102012e;
    }

    @Override // w8.j0
    public long g() {
        return this.f102010c;
    }

    @Override // p9.g
    public long k() {
        return this.f102011d;
    }

    @Override // p9.g
    public int m() {
        return this.f102013f;
    }
}
