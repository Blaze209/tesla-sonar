package p9;

import s7.q0;
import w8.f0;
import w8.j0;
import w8.k0;

/* JADX INFO: loaded from: classes3.dex */
final class j implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f102020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f102021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f102022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f102023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f102024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f102025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long[] f102026g;

    private j(long j11, int i11, long j12, int i12, long j13, long[] jArr) {
        this.f102020a = j11;
        this.f102021b = i11;
        this.f102022c = j12;
        this.f102023d = i12;
        this.f102024e = j13;
        this.f102026g = jArr;
        this.f102025f = j13 != -1 ? j11 + j13 : -1L;
    }

    public static j a(i iVar, long j11) {
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        f0.a aVar = iVar.f102014a;
        return new j(j11, aVar.f121304c, jA, aVar.f121307f, iVar.f102016c, iVar.f102019f);
    }

    private long e(int i11) {
        return (this.f102022c * ((long) i11)) / 100;
    }

    @Override // p9.g
    public long b(long j11) {
        long j12 = j11 - this.f102020a;
        if (!d() || j12 <= this.f102021b) {
            return 0L;
        }
        long[] jArr = (long[]) s7.a.j(this.f102026g);
        double d11 = (j12 * 256.0d) / this.f102024e;
        int iK = q0.k(jArr, (long) d11, true, true);
        long jE = e(iK);
        long j13 = jArr[iK];
        int i11 = iK + 1;
        long jE2 = e(i11);
        long j14 = iK == 99 ? 256L : jArr[i11];
        return jE + Math.round((j13 == j14 ? 0.0d : (d11 - j13) / (j14 - j13)) * (jE2 - jE));
    }

    @Override // w8.j0
    public j0.a c(long j11) {
        if (!d()) {
            return new j0.a(new k0(0L, this.f102020a + ((long) this.f102021b)));
        }
        long jS = q0.s(j11, 0L, this.f102022c);
        double d11 = (jS * 100.0d) / this.f102022c;
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i11 = (int) d11;
                long[] jArr = (long[]) s7.a.j(this.f102026g);
                double d13 = jArr[i11];
                d12 = d13 + ((d11 - ((double) i11)) * ((i11 == 99 ? 256.0d : jArr[i11 + 1]) - d13));
            }
        }
        return new j0.a(new k0(jS, this.f102020a + q0.s(Math.round((d12 / 256.0d) * this.f102024e), this.f102021b, this.f102024e - 1)));
    }

    @Override // w8.j0
    public boolean d() {
        return this.f102026g != null;
    }

    @Override // p9.g
    public long f() {
        return this.f102025f;
    }

    @Override // w8.j0
    public long g() {
        return this.f102022c;
    }

    @Override // p9.g
    public long k() {
        return this.f102020a + ((long) this.f102021b);
    }

    @Override // p9.g
    public int m() {
        return this.f102023d;
    }
}
