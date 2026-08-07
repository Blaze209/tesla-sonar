package hr;

import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C1541a f73277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final f f73278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected c f73279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f73280d;

    /* JADX INFO: renamed from: hr.a$a, reason: collision with other inner class name */
    public static class C1541a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f73281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f73282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f73283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f73284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f73285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f73286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f73287g;

        public C1541a(d dVar, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f73281a = dVar;
            this.f73282b = j11;
            this.f73283c = j12;
            this.f73284d = j13;
            this.f73285e = j14;
            this.f73286f = j15;
            this.f73287g = j16;
        }

        @Override // hr.z
        public z.a c(long j11) {
            return new z.a(new a0(j11, c.h(this.f73281a.a(j11), this.f73283c, this.f73284d, this.f73285e, this.f73286f, this.f73287g)));
        }

        @Override // hr.z
        public boolean d() {
            return true;
        }

        @Override // hr.z
        public long g() {
            return this.f73282b;
        }

        public long k(long j11) {
            return this.f73281a.a(j11);
        }
    }

    protected static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f73288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f73289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f73290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f73291d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f73292e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f73293f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f73294g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f73295h;

        protected c(long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
            this.f73288a = j11;
            this.f73289b = j12;
            this.f73291d = j13;
            this.f73292e = j14;
            this.f73293f = j15;
            this.f73294g = j16;
            this.f73290c = j17;
            this.f73295h = h(j12, j13, j14, j15, j16, j17);
        }

        protected static long h(long j11, long j12, long j13, long j14, long j15, long j16) {
            if (j14 + 1 >= j15 || j12 + 1 >= j13) {
                return j14;
            }
            long j17 = (long) ((j11 - j12) * ((j15 - j14) / (j13 - j12)));
            return p0.r(((j17 + j14) - j16) - (j17 / 20), j14, j15 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f73294g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f73293f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f73295h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f73288a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f73289b;
        }

        private void n() {
            this.f73295h = h(this.f73289b, this.f73291d, this.f73292e, this.f73293f, this.f73294g, this.f73290c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j11, long j12) {
            this.f73292e = j11;
            this.f73294g = j12;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j11, long j12) {
            this.f73291d = j11;
            this.f73293f = j12;
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface d {
        long a(long j11);
    }

    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f73296d = new e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f73297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f73298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f73299c;

        private e(int i11, long j11, long j12) {
            this.f73297a = i11;
            this.f73298b = j11;
            this.f73299c = j12;
        }

        public static e d(long j11, long j12) {
            return new e(-1, j11, j12);
        }

        public static e e(long j11) {
            return new e(0, -9223372036854775807L, j11);
        }

        public static e f(long j11, long j12) {
            return new e(-2, j11, j12);
        }
    }

    protected a(d dVar, f fVar, long j11, long j12, long j13, long j14, long j15, long j16, int i11) {
        this.f73278b = fVar;
        this.f73280d = i11;
        this.f73277a = new C1541a(dVar, j11, j12, j13, j14, j15, j16);
    }

    protected c a(long j11) {
        return new c(j11, this.f73277a.k(j11), this.f73277a.f73283c, this.f73277a.f73284d, this.f73277a.f73285e, this.f73277a.f73286f, this.f73277a.f73287g);
    }

    public final z b() {
        return this.f73277a;
    }

    public int c(l lVar, y yVar) {
        while (true) {
            c cVar = (c) ts.a.i(this.f73279c);
            long j11 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j11 <= this.f73280d) {
                e(false, j11);
                return g(lVar, j11, yVar);
            }
            if (!i(lVar, jK)) {
                return g(lVar, jK, yVar);
            }
            lVar.g();
            e eVarB = this.f73278b.b(lVar, cVar.m());
            int i11 = eVarB.f73297a;
            if (i11 == -3) {
                e(false, jK);
                return g(lVar, jK, yVar);
            }
            if (i11 == -2) {
                cVar.p(eVarB.f73298b, eVarB.f73299c);
            } else {
                if (i11 != -1) {
                    if (i11 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(lVar, eVarB.f73299c);
                    e(true, eVarB.f73299c);
                    return g(lVar, eVarB.f73299c, yVar);
                }
                cVar.o(eVarB.f73298b, eVarB.f73299c);
            }
        }
    }

    public final boolean d() {
        return this.f73279c != null;
    }

    protected final void e(boolean z11, long j11) {
        this.f73279c = null;
        this.f73278b.a();
        f(z11, j11);
    }

    protected final int g(l lVar, long j11, y yVar) {
        if (j11 == lVar.getPosition()) {
            return 0;
        }
        yVar.f73403a = j11;
        return 1;
    }

    public final void h(long j11) {
        c cVar = this.f73279c;
        if (cVar == null || cVar.l() != j11) {
            this.f73279c = a(j11);
        }
    }

    protected final boolean i(l lVar, long j11) {
        long position = j11 - lVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        lVar.k((int) position);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface f {
        e b(l lVar, long j11);

        default void a() {
        }
    }

    public static final class b implements d {
        @Override // hr.a.d
        public long a(long j11) {
            return j11;
        }
    }

    protected void f(boolean z11, long j11) {
    }
}
