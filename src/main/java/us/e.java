package us;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f116557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f116558d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f116560f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f116555a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f116556b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f116559e = -9223372036854775807L;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f116561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f116562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f116563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f116564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f116565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f116566f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean[] f116567g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f116568h;

        private static int c(long j11) {
            return (int) (j11 % 15);
        }

        public long a() {
            long j11 = this.f116565e;
            if (j11 == 0) {
                return 0L;
            }
            return this.f116566f / j11;
        }

        public long b() {
            return this.f116566f;
        }

        public boolean d() {
            long j11 = this.f116564d;
            if (j11 == 0) {
                return false;
            }
            return this.f116567g[c(j11 - 1)];
        }

        public boolean e() {
            return this.f116564d > 15 && this.f116568h == 0;
        }

        public void f(long j11) {
            long j12 = this.f116564d;
            if (j12 == 0) {
                this.f116561a = j11;
            } else if (j12 == 1) {
                long j13 = j11 - this.f116561a;
                this.f116562b = j13;
                this.f116566f = j13;
                this.f116565e = 1L;
            } else {
                long j14 = j11 - this.f116563c;
                int iC = c(j12);
                if (Math.abs(j14 - this.f116562b) <= 1000000) {
                    this.f116565e++;
                    this.f116566f += j14;
                    boolean[] zArr = this.f116567g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f116568h--;
                    }
                } else {
                    boolean[] zArr2 = this.f116567g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f116568h++;
                    }
                }
            }
            this.f116564d++;
            this.f116563c = j11;
        }

        public void g() {
            this.f116564d = 0L;
            this.f116565e = 0L;
            this.f116566f = 0L;
            this.f116568h = 0;
            Arrays.fill(this.f116567g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f116555a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f116555a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f116560f;
    }

    public long d() {
        if (e()) {
            return this.f116555a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f116555a.e();
    }

    public void f(long j11) {
        this.f116555a.f(j11);
        if (this.f116555a.e() && !this.f116558d) {
            this.f116557c = false;
        } else if (this.f116559e != -9223372036854775807L) {
            if (!this.f116557c || this.f116556b.d()) {
                this.f116556b.g();
                this.f116556b.f(this.f116559e);
            }
            this.f116557c = true;
            this.f116556b.f(j11);
        }
        if (this.f116557c && this.f116556b.e()) {
            a aVar = this.f116555a;
            this.f116555a = this.f116556b;
            this.f116556b = aVar;
            this.f116557c = false;
            this.f116558d = false;
        }
        this.f116559e = j11;
        this.f116560f = this.f116555a.e() ? 0 : this.f116560f + 1;
    }

    public void g() {
        this.f116555a.g();
        this.f116556b.g();
        this.f116557c = false;
        this.f116559e = -9223372036854775807L;
        this.f116560f = 0;
    }
}
