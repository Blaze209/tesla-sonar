package or;

import android.util.Pair;
import hr.a0;
import hr.z;
import ts.p0;
import zr.k;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f98467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f98468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f98469c;

    private c(long[] jArr, long[] jArr2, long j11) {
        this.f98467a = jArr;
        this.f98468b = jArr2;
        this.f98469c = j11 == -9223372036854775807L ? p0.D0(jArr2[jArr2.length - 1]) : j11;
    }

    public static c a(long j11, k kVar, long j12) {
        int length = kVar.f128534e.length;
        int i11 = length + 1;
        long[] jArr = new long[i11];
        long[] jArr2 = new long[i11];
        jArr[0] = j11;
        long j13 = 0;
        jArr2[0] = 0;
        for (int i12 = 1; i12 <= length; i12++) {
            int i13 = i12 - 1;
            j11 += (long) (kVar.f128532c + kVar.f128534e[i13]);
            j13 += (long) (kVar.f128533d + kVar.f128535f[i13]);
            jArr[i12] = j11;
            jArr2[i12] = j13;
        }
        return new c(jArr, jArr2, j12);
    }

    private static Pair<Long, Long> e(long j11, long[] jArr, long[] jArr2) {
        int i11 = p0.i(jArr, j11, true, true);
        long j12 = jArr[i11];
        long j13 = jArr2[i11];
        int i12 = i11 + 1;
        if (i12 == jArr.length) {
            return Pair.create(Long.valueOf(j12), Long.valueOf(j13));
        }
        long j14 = jArr[i12];
        return Pair.create(Long.valueOf(j11), Long.valueOf(((long) ((j14 == j12 ? 0.0d : (j11 - j12) / (j14 - j12)) * (jArr2[i12] - j13))) + j13));
    }

    @Override // or.g
    public long b(long j11) {
        return p0.D0(((Long) e(j11, this.f98467a, this.f98468b).second).longValue());
    }

    @Override // hr.z
    public z.a c(long j11) {
        Pair<Long, Long> pairE = e(p0.Z0(p0.r(j11, 0L, this.f98469c)), this.f98468b, this.f98467a);
        return new z.a(new a0(p0.D0(((Long) pairE.first).longValue()), ((Long) pairE.second).longValue()));
    }

    @Override // hr.z
    public boolean d() {
        return true;
    }

    @Override // or.g
    public long f() {
        return -1L;
    }

    @Override // hr.z
    public long g() {
        return this.f98469c;
    }
}
