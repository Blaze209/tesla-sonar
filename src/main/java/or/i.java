package or;

import dr.t;
import hr.a0;
import hr.z;
import ts.d0;
import ts.p0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f98496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f98497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f98498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f98499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f98500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long[] f98501f;

    private i(long j11, int i11, long j12) {
        this(j11, i11, j12, -1L, null);
    }

    public static i a(long j11, long j12, t.a aVar, d0 d0Var) {
        int iL;
        int i11 = aVar.f60913g;
        int i12 = aVar.f60910d;
        int iQ = d0Var.q();
        if ((iQ & 1) != 1 || (iL = d0Var.L()) == 0) {
            return null;
        }
        long jM0 = p0.M0(iL, ((long) i11) * 1000000, i12);
        if ((iQ & 6) != 6) {
            return new i(j12, aVar.f60909c, jM0);
        }
        long J = d0Var.J();
        long[] jArr = new long[100];
        for (int i13 = 0; i13 < 100; i13++) {
            jArr[i13] = d0Var.H();
        }
        if (j11 != -1) {
            long j13 = j12 + J;
            if (j11 != j13) {
                u.i("XingSeeker", "XING data size mismatch: " + j11 + ", " + j13);
            }
        }
        return new i(j12, aVar.f60909c, jM0, J, jArr);
    }

    private long e(int i11) {
        return (this.f98498c * ((long) i11)) / 100;
    }

    @Override // or.g
    public long b(long j11) {
        long j12 = j11 - this.f98496a;
        if (!d() || j12 <= this.f98497b) {
            return 0L;
        }
        long[] jArr = (long[]) ts.a.i(this.f98501f);
        double d11 = (j12 * 256.0d) / this.f98499d;
        int i11 = p0.i(jArr, (long) d11, true, true);
        long jE = e(i11);
        long j13 = jArr[i11];
        int i12 = i11 + 1;
        long jE2 = e(i12);
        long j14 = i11 == 99 ? 256L : jArr[i12];
        return jE + Math.round((j13 == j14 ? 0.0d : (d11 - j13) / (j14 - j13)) * (jE2 - jE));
    }

    @Override // hr.z
    public z.a c(long j11) {
        if (!d()) {
            return new z.a(new a0(0L, this.f98496a + ((long) this.f98497b)));
        }
        long jR = p0.r(j11, 0L, this.f98498c);
        double d11 = (jR * 100.0d) / this.f98498c;
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i11 = (int) d11;
                long[] jArr = (long[]) ts.a.i(this.f98501f);
                double d13 = jArr[i11];
                d12 = d13 + ((d11 - ((double) i11)) * ((i11 == 99 ? 256.0d : jArr[i11 + 1]) - d13));
            }
        }
        return new z.a(new a0(jR, this.f98496a + p0.r(Math.round((d12 / 256.0d) * this.f98499d), this.f98497b, this.f98499d - 1)));
    }

    @Override // hr.z
    public boolean d() {
        return this.f98501f != null;
    }

    @Override // or.g
    public long f() {
        return this.f98500e;
    }

    @Override // hr.z
    public long g() {
        return this.f98498c;
    }

    private i(long j11, int i11, long j12, long j13, long[] jArr) {
        this.f98496a = j11;
        this.f98497b = i11;
        this.f98498c = j12;
        this.f98501f = jArr;
        this.f98499d = j13;
        this.f98500e = j13 != -1 ? j11 + j13 : -1L;
    }
}
