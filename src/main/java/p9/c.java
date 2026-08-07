package p9;

import android.util.Pair;
import k9.l;
import s7.q0;
import w8.j0;
import w8.k0;

/* JADX INFO: loaded from: classes3.dex */
final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f101982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f101983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f101984c;

    private c(long[] jArr, long[] jArr2, long j11) {
        this.f101982a = jArr;
        this.f101983b = jArr2;
        this.f101984c = j11 == -9223372036854775807L ? q0.b1(jArr2[jArr2.length - 1]) : j11;
    }

    public static c a(long j11, l lVar, long j12) {
        int length = lVar.f85434e.length;
        int i11 = length + 1;
        long[] jArr = new long[i11];
        long[] jArr2 = new long[i11];
        jArr[0] = j11;
        long j13 = 0;
        jArr2[0] = 0;
        for (int i12 = 1; i12 <= length; i12++) {
            int i13 = i12 - 1;
            j11 += (long) (lVar.f85432c + lVar.f85434e[i13]);
            j13 += (long) (lVar.f85433d + lVar.f85435f[i13]);
            jArr[i12] = j11;
            jArr2[i12] = j13;
        }
        return new c(jArr, jArr2, j12);
    }

    private static Pair<Long, Long> e(long j11, long[] jArr, long[] jArr2) {
        int iK = q0.k(jArr, j11, true, true);
        long j12 = jArr[iK];
        long j13 = jArr2[iK];
        int i11 = iK + 1;
        if (i11 == jArr.length) {
            return Pair.create(Long.valueOf(j12), Long.valueOf(j13));
        }
        long j14 = jArr[i11];
        return Pair.create(Long.valueOf(j11), Long.valueOf(((long) ((j14 == j12 ? 0.0d : (j11 - j12) / (j14 - j12)) * (jArr2[i11] - j13))) + j13));
    }

    @Override // p9.g
    public long b(long j11) {
        return q0.b1(((Long) e(j11, this.f101982a, this.f101983b).second).longValue());
    }

    @Override // w8.j0
    public j0.a c(long j11) {
        Pair<Long, Long> pairE = e(q0.O1(q0.s(j11, 0L, this.f101984c)), this.f101983b, this.f101982a);
        return new j0.a(new k0(q0.b1(((Long) pairE.first).longValue()), ((Long) pairE.second).longValue()));
    }

    @Override // w8.j0
    public boolean d() {
        return true;
    }

    @Override // p9.g
    public long f() {
        return -1L;
    }

    @Override // w8.j0
    public long g() {
        return this.f101984c;
    }

    @Override // p9.g
    public long k() {
        return 0L;
    }

    @Override // p9.g
    public int m() {
        return -2147483647;
    }
}
