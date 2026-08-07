package w8;

/* JADX INFO: loaded from: classes3.dex */
public class i implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f121316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f121317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f121318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f121319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f121320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f121321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f121322g;

    public i(long j11, long j12, int i11, int i12, boolean z11) {
        this.f121316a = j11;
        this.f121317b = j12;
        this.f121318c = i12 == -1 ? 1 : i12;
        this.f121320e = i11;
        this.f121322g = z11;
        if (j11 == -1) {
            this.f121319d = -1L;
            this.f121321f = -9223372036854775807L;
        } else {
            this.f121319d = j11 - j12;
            this.f121321f = h(j11, j12, i11);
        }
    }

    private long a(long j11) {
        long j12 = (j11 * ((long) this.f121320e)) / 8000000;
        int i11 = this.f121318c;
        long jMin = (j12 / ((long) i11)) * ((long) i11);
        long j13 = this.f121319d;
        if (j13 != -1) {
            jMin = Math.min(jMin, j13 - ((long) i11));
        }
        return this.f121317b + Math.max(jMin, 0L);
    }

    private static long h(long j11, long j12, int i11) {
        return (Math.max(0L, j11 - j12) * 8000000) / ((long) i11);
    }

    @Override // w8.j0
    public j0.a c(long j11) {
        if (this.f121319d == -1 && !this.f121322g) {
            return new j0.a(new k0(0L, this.f121317b));
        }
        long jA = a(j11);
        long jE = e(jA);
        k0 k0Var = new k0(jE, jA);
        if (this.f121319d != -1 && jE < j11) {
            int i11 = this.f121318c;
            if (((long) i11) + jA < this.f121316a) {
                long j12 = jA + ((long) i11);
                return new j0.a(k0Var, new k0(e(j12), j12));
            }
        }
        return new j0.a(k0Var);
    }

    @Override // w8.j0
    public boolean d() {
        return this.f121319d != -1 || this.f121322g;
    }

    public long e(long j11) {
        return h(j11, this.f121317b, this.f121320e);
    }

    @Override // w8.j0
    public long g() {
        return this.f121321f;
    }
}
