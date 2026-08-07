package hr;

import java.util.Arrays;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f73308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f73309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f73310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f73311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f73312f;

    public c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f73308b = iArr;
        this.f73309c = jArr;
        this.f73310d = jArr2;
        this.f73311e = jArr3;
        int length = iArr.length;
        this.f73307a = length;
        if (length > 0) {
            this.f73312f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f73312f = 0L;
        }
    }

    public int a(long j11) {
        return p0.i(this.f73311e, j11, true, true);
    }

    @Override // hr.z
    public z.a c(long j11) {
        int iA = a(j11);
        a0 a0Var = new a0(this.f73311e[iA], this.f73309c[iA]);
        if (a0Var.f73301a >= j11 || iA == this.f73307a - 1) {
            return new z.a(a0Var);
        }
        int i11 = iA + 1;
        return new z.a(a0Var, new a0(this.f73311e[i11], this.f73309c[i11]));
    }

    @Override // hr.z
    public boolean d() {
        return true;
    }

    @Override // hr.z
    public long g() {
        return this.f73312f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f73307a + ", sizes=" + Arrays.toString(this.f73308b) + ", offsets=" + Arrays.toString(this.f73309c) + ", timeUs=" + Arrays.toString(this.f73311e) + ", durationsUs=" + Arrays.toString(this.f73310d) + ")";
    }
}
