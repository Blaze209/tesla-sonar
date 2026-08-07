package hr;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class d implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f73320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f73321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f73322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f73323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f73324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f73325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f73326g;

    public d(long j11, long j12, int i11, int i12, boolean z11) {
        this.f73320a = j11;
        this.f73321b = j12;
        this.f73322c = i12 == -1 ? 1 : i12;
        this.f73324e = i11;
        this.f73326g = z11;
        if (j11 == -1) {
            this.f73323d = -1L;
            this.f73325f = -9223372036854775807L;
        } else {
            this.f73323d = j11 - j12;
            this.f73325f = h(j11, j12, i11);
        }
    }

    private long a(long j11) {
        long j12 = (j11 * ((long) this.f73324e)) / 8000000;
        int i11 = this.f73322c;
        long jMin = (j12 / ((long) i11)) * ((long) i11);
        long j13 = this.f73323d;
        if (j13 != -1) {
            jMin = Math.min(jMin, j13 - ((long) i11));
        }
        return this.f73321b + Math.max(jMin, 0L);
    }

    private static long h(long j11, long j12, int i11) {
        return (Math.max(0L, j11 - j12) * 8000000) / ((long) i11);
    }

    @Override // hr.z
    public z.a c(long j11) {
        if (this.f73323d == -1 && !this.f73326g) {
            return new z.a(new a0(0L, this.f73321b));
        }
        long jA = a(j11);
        long jE = e(jA);
        a0 a0Var = new a0(jE, jA);
        if (this.f73323d != -1 && jE < j11) {
            int i11 = this.f73322c;
            if (((long) i11) + jA < this.f73320a) {
                long j12 = jA + ((long) i11);
                return new z.a(a0Var, new a0(e(j12), j12));
            }
        }
        return new z.a(a0Var);
    }

    @Override // hr.z
    public boolean d() {
        return this.f73323d != -1 || this.f73326g;
    }

    public long e(long j11) {
        return h(j11, this.f73321b, this.f73324e);
    }

    @Override // hr.z
    public long g() {
        return this.f73325f;
    }
}
