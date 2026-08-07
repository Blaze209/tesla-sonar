package gv;

import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes5.dex */
final class u extends f0.e.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Double f69959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f69960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f69961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f69962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f69963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f69964f;

    static final class b extends f0.e.d.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Double f69965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f69966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f69967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f69968d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f69969e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f69970f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f69971g;

        b() {
        }

        @Override // gv.f0.e.d.c.a
        public f0.e.d.c a() {
            if (this.f69971g == 31) {
                return new u(this.f69965a, this.f69966b, this.f69967c, this.f69968d, this.f69969e, this.f69970f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f69971g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f69971g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f69971g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f69971g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f69971g & Tnaf.POW_2_WIDTH) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.e.d.c.a
        public f0.e.d.c.a b(Double d11) {
            this.f69965a = d11;
            return this;
        }

        @Override // gv.f0.e.d.c.a
        public f0.e.d.c.a c(int i11) {
            this.f69966b = i11;
            this.f69971g = (byte) (this.f69971g | 1);
            return this;
        }

        @Override // gv.f0.e.d.c.a
        public f0.e.d.c.a d(long j11) {
            this.f69970f = j11;
            this.f69971g = (byte) (this.f69971g | Tnaf.POW_2_WIDTH);
            return this;
        }

        @Override // gv.f0.e.d.c.a
        public f0.e.d.c.a e(int i11) {
            this.f69968d = i11;
            this.f69971g = (byte) (this.f69971g | 4);
            return this;
        }

        @Override // gv.f0.e.d.c.a
        public f0.e.d.c.a f(boolean z11) {
            this.f69967c = z11;
            this.f69971g = (byte) (this.f69971g | 2);
            return this;
        }

        @Override // gv.f0.e.d.c.a
        public f0.e.d.c.a g(long j11) {
            this.f69969e = j11;
            this.f69971g = (byte) (this.f69971g | 8);
            return this;
        }
    }

    @Override // gv.f0.e.d.c
    public Double b() {
        return this.f69959a;
    }

    @Override // gv.f0.e.d.c
    public int c() {
        return this.f69960b;
    }

    @Override // gv.f0.e.d.c
    public long d() {
        return this.f69964f;
    }

    @Override // gv.f0.e.d.c
    public int e() {
        return this.f69962d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.c) {
            f0.e.d.c cVar = (f0.e.d.c) obj;
            Double d11 = this.f69959a;
            if (d11 != null ? d11.equals(cVar.b()) : cVar.b() == null) {
                if (this.f69960b == cVar.c() && this.f69961c == cVar.g() && this.f69962d == cVar.e() && this.f69963e == cVar.f() && this.f69964f == cVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // gv.f0.e.d.c
    public long f() {
        return this.f69963e;
    }

    @Override // gv.f0.e.d.c
    public boolean g() {
        return this.f69961c;
    }

    public int hashCode() {
        Double d11 = this.f69959a;
        int iHashCode = ((((((((d11 == null ? 0 : d11.hashCode()) ^ 1000003) * 1000003) ^ this.f69960b) * 1000003) ^ (this.f69961c ? 1231 : 1237)) * 1000003) ^ this.f69962d) * 1000003;
        long j11 = this.f69963e;
        long j12 = this.f69964f;
        return ((iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f69959a + ", batteryVelocity=" + this.f69960b + ", proximityOn=" + this.f69961c + ", orientation=" + this.f69962d + ", ramUsed=" + this.f69963e + ", diskUsed=" + this.f69964f + "}";
    }

    private u(Double d11, int i11, boolean z11, int i12, long j11, long j12) {
        this.f69959a = d11;
        this.f69960b = i11;
        this.f69961c = z11;
        this.f69962d = i12;
        this.f69963e = j11;
        this.f69964f = j12;
    }
}
