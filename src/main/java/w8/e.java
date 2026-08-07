package w8;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a f121269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final f f121270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected c f121271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f121272d;

    public static class a implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f121273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f121274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f121275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f121276d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f121277e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f121278f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f121279g;

        public a(d dVar, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f121273a = dVar;
            this.f121274b = j11;
            this.f121275c = j12;
            this.f121276d = j13;
            this.f121277e = j14;
            this.f121278f = j15;
            this.f121279g = j16;
        }

        @Override // w8.j0
        public j0.a c(long j11) {
            return new j0.a(new k0(j11, c.h(this.f121273a.a(j11), this.f121275c, this.f121276d, this.f121277e, this.f121278f, this.f121279g)));
        }

        @Override // w8.j0
        public boolean d() {
            return true;
        }

        @Override // w8.j0
        public long g() {
            return this.f121274b;
        }

        public long l(long j11) {
            return this.f121273a.a(j11);
        }
    }

    protected static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f121280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f121281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f121282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f121283d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f121284e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f121285f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f121286g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f121287h;

        protected c(long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
            this.f121280a = j11;
            this.f121281b = j12;
            this.f121283d = j13;
            this.f121284e = j14;
            this.f121285f = j15;
            this.f121286g = j16;
            this.f121282c = j17;
            this.f121287h = h(j12, j13, j14, j15, j16, j17);
        }

        protected static long h(long j11, long j12, long j13, long j14, long j15, long j16) {
            if (j14 + 1 >= j15 || j12 + 1 >= j13) {
                return j14;
            }
            long j17 = (long) ((j11 - j12) * ((j15 - j14) / (j13 - j12)));
            return s7.q0.s(((j17 + j14) - j16) - (j17 / 20), j14, j15 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f121286g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f121285f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f121287h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f121280a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f121281b;
        }

        private void n() {
            this.f121287h = h(this.f121281b, this.f121283d, this.f121284e, this.f121285f, this.f121286g, this.f121282c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j11, long j12) {
            this.f121284e = j11;
            this.f121286g = j12;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j11, long j12) {
            this.f121283d = j11;
            this.f121285f = j12;
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface d {
        long a(long j11);
    }

    /* JADX INFO: renamed from: w8.e$e, reason: collision with other inner class name */
    public static final class C2600e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C2600e f121288d = new C2600e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f121289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f121290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f121291c;

        private C2600e(int i11, long j11, long j12) {
            this.f121289a = i11;
            this.f121290b = j11;
            this.f121291c = j12;
        }

        public static C2600e d(long j11, long j12) {
            return new C2600e(-1, j11, j12);
        }

        public static C2600e e(long j11) {
            return new C2600e(0, -9223372036854775807L, j11);
        }

        public static C2600e f(long j11, long j12) {
            return new C2600e(-2, j11, j12);
        }
    }

    protected e(d dVar, f fVar, long j11, long j12, long j13, long j14, long j15, long j16, int i11) {
        this.f121270b = fVar;
        this.f121272d = i11;
        this.f121269a = new a(dVar, j11, j12, j13, j14, j15, j16);
    }

    protected c a(long j11) {
        return new c(j11, this.f121269a.l(j11), this.f121269a.f121275c, this.f121269a.f121276d, this.f121269a.f121277e, this.f121269a.f121278f, this.f121269a.f121279g);
    }

    public final j0 b() {
        return this.f121269a;
    }

    public int c(q qVar, i0 i0Var) {
        while (true) {
            c cVar = (c) s7.a.j(this.f121271c);
            long j11 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j11 <= this.f121272d) {
                e(false, j11);
                return g(qVar, j11, i0Var);
            }
            if (!i(qVar, jK)) {
                return g(qVar, jK, i0Var);
            }
            qVar.g();
            C2600e c2600eB = this.f121270b.b(qVar, cVar.m());
            int i11 = c2600eB.f121289a;
            if (i11 == -3) {
                e(false, jK);
                return g(qVar, jK, i0Var);
            }
            if (i11 == -2) {
                cVar.p(c2600eB.f121290b, c2600eB.f121291c);
            } else {
                if (i11 != -1) {
                    if (i11 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(qVar, c2600eB.f121291c);
                    e(true, c2600eB.f121291c);
                    return g(qVar, c2600eB.f121291c, i0Var);
                }
                cVar.o(c2600eB.f121290b, c2600eB.f121291c);
            }
        }
    }

    public final boolean d() {
        return this.f121271c != null;
    }

    protected final void e(boolean z11, long j11) {
        this.f121271c = null;
        this.f121270b.a();
        f(z11, j11);
    }

    protected final int g(q qVar, long j11, i0 i0Var) {
        if (j11 == qVar.getPosition()) {
            return 0;
        }
        i0Var.f121323a = j11;
        return 1;
    }

    public final void h(long j11) {
        c cVar = this.f121271c;
        if (cVar == null || cVar.l() != j11) {
            this.f121271c = a(j11);
        }
    }

    protected final boolean i(q qVar, long j11) {
        long position = j11 - qVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        qVar.k((int) position);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface f {
        C2600e b(q qVar, long j11);

        default void a() {
        }
    }

    public static final class b implements d {
        @Override // w8.e.d
        public long a(long j11) {
            return j11;
        }
    }

    protected void f(boolean z11, long j11) {
    }
}
