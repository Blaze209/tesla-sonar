package u8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f115853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f115854d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f115856f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f115851a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f115852b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f115855e = -9223372036854775807L;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f115857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f115858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f115859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f115860d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f115861e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f115862f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean[] f115863g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f115864h;

        private static int c(long j11) {
            return (int) (j11 % 15);
        }

        public long a() {
            long j11 = this.f115861e;
            if (j11 == 0) {
                return 0L;
            }
            return this.f115862f / j11;
        }

        public long b() {
            return this.f115862f;
        }

        public boolean d() {
            long j11 = this.f115860d;
            if (j11 == 0) {
                return false;
            }
            return this.f115863g[c(j11 - 1)];
        }

        public boolean e() {
            return this.f115860d > 15 && this.f115864h == 0;
        }

        public void f(long j11) {
            long j12 = this.f115860d;
            if (j12 == 0) {
                this.f115857a = j11;
            } else if (j12 == 1) {
                long j13 = j11 - this.f115857a;
                this.f115858b = j13;
                this.f115862f = j13;
                this.f115861e = 1L;
            } else {
                long j14 = j11 - this.f115859c;
                int iC = c(j12);
                if (Math.abs(j14 - this.f115858b) <= 1000000) {
                    this.f115861e++;
                    this.f115862f += j14;
                    boolean[] zArr = this.f115863g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f115864h--;
                    }
                } else {
                    boolean[] zArr2 = this.f115863g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f115864h++;
                    }
                }
            }
            this.f115860d++;
            this.f115859c = j11;
        }

        public void g() {
            this.f115860d = 0L;
            this.f115861e = 0L;
            this.f115862f = 0L;
            this.f115864h = 0;
            Arrays.fill(this.f115863g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f115851a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f115851a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f115856f;
    }

    public long d() {
        if (e()) {
            return this.f115851a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f115851a.e();
    }

    public void f(long j11) {
        this.f115851a.f(j11);
        if (this.f115851a.e() && !this.f115854d) {
            this.f115853c = false;
        } else if (this.f115855e != -9223372036854775807L) {
            if (!this.f115853c || this.f115852b.d()) {
                this.f115852b.g();
                this.f115852b.f(this.f115855e);
            }
            this.f115853c = true;
            this.f115852b.f(j11);
        }
        if (this.f115853c && this.f115852b.e()) {
            a aVar = this.f115851a;
            this.f115851a = this.f115852b;
            this.f115852b = aVar;
            this.f115853c = false;
            this.f115854d = false;
        }
        this.f115855e = j11;
        this.f115856f = this.f115851a.e() ? 0 : this.f115856f + 1;
    }

    public void g() {
        this.f115851a.g();
        this.f115852b.g();
        this.f115853c = false;
        this.f115855e = -9223372036854775807L;
        this.f115856f = 0;
    }
}
