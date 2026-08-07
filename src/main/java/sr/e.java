package sr;

import hr.a0;
import hr.z;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class e implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f111632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f111633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f111634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f111635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f111636e;

    public e(c cVar, int i11, long j11, long j12) {
        this.f111632a = cVar;
        this.f111633b = i11;
        this.f111634c = j11;
        long j13 = (j12 - j11) / ((long) cVar.f111627e);
        this.f111635d = j13;
        this.f111636e = a(j13);
    }

    private long a(long j11) {
        return p0.M0(j11 * ((long) this.f111633b), 1000000L, this.f111632a.f111625c);
    }

    @Override // hr.z
    public z.a c(long j11) {
        long jR = p0.r((((long) this.f111632a.f111625c) * j11) / (((long) this.f111633b) * 1000000), 0L, this.f111635d - 1);
        long j12 = this.f111634c + (((long) this.f111632a.f111627e) * jR);
        long jA = a(jR);
        a0 a0Var = new a0(jA, j12);
        if (jA >= j11 || jR == this.f111635d - 1) {
            return new z.a(a0Var);
        }
        long j13 = jR + 1;
        return new z.a(a0Var, new a0(a(j13), this.f111634c + (((long) this.f111632a.f111627e) * j13)));
    }

    @Override // hr.z
    public boolean d() {
        return true;
    }

    @Override // hr.z
    public long g() {
        return this.f111636e;
    }
}
