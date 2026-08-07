package w8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f121309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f121310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f121311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f121312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f121313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f121314f;

    public g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f121310b = iArr;
        this.f121311c = jArr;
        this.f121312d = jArr2;
        this.f121313e = jArr3;
        int length = iArr.length;
        this.f121309a = length;
        if (length > 0) {
            this.f121314f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f121314f = 0L;
        }
    }

    public int a(long j11) {
        return s7.q0.k(this.f121313e, j11, true, true);
    }

    @Override // w8.j0
    public j0.a c(long j11) {
        int iA = a(j11);
        k0 k0Var = new k0(this.f121313e[iA], this.f121311c[iA]);
        if (k0Var.f121336a >= j11 || iA == this.f121309a - 1) {
            return new j0.a(k0Var);
        }
        int i11 = iA + 1;
        return new j0.a(k0Var, new k0(this.f121313e[i11], this.f121311c[i11]));
    }

    @Override // w8.j0
    public boolean d() {
        return true;
    }

    @Override // w8.j0
    public long g() {
        return this.f121314f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f121309a + ", sizes=" + Arrays.toString(this.f121310b) + ", offsets=" + Arrays.toString(this.f121311c) + ", timeUs=" + Arrays.toString(this.f121313e) + ", durationsUs=" + Arrays.toString(this.f121312d) + ")";
    }
}
