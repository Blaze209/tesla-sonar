package hr;

import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class x implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f73399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f73400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f73401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f73402d;

    public x(long[] jArr, long[] jArr2, long j11) {
        ts.a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z11 = length > 0;
        this.f73402d = z11;
        if (!z11 || jArr2[0] <= 0) {
            this.f73399a = jArr;
            this.f73400b = jArr2;
        } else {
            int i11 = length + 1;
            long[] jArr3 = new long[i11];
            this.f73399a = jArr3;
            long[] jArr4 = new long[i11];
            this.f73400b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f73401c = j11;
    }

    @Override // hr.z
    public z.a c(long j11) {
        if (!this.f73402d) {
            return new z.a(a0.f73300c);
        }
        int i11 = p0.i(this.f73400b, j11, true, true);
        a0 a0Var = new a0(this.f73400b[i11], this.f73399a[i11]);
        if (a0Var.f73301a == j11 || i11 == this.f73400b.length - 1) {
            return new z.a(a0Var);
        }
        int i12 = i11 + 1;
        return new z.a(a0Var, new a0(this.f73400b[i12], this.f73399a[i12]));
    }

    @Override // hr.z
    public boolean d() {
        return this.f73402d;
    }

    @Override // hr.z
    public long g() {
        return this.f73401c;
    }
}
