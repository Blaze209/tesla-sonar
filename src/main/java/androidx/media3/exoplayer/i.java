package androidx.media3.exoplayer;

import android.os.SystemClock;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public final class i implements z7.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f10252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f10253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f10254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f10255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f10256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f10257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f10258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f10259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f10260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f10261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f10262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f10263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f10264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f10265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f10266o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f10267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f10268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f10269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f10270s;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f10271a = 0.97f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f10272b = 1.03f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f10273c = 1000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f10274d = 1.0E-7f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f10275e = s7.q0.b1(20);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f10276f = s7.q0.b1(500);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f10277g = 0.999f;

        public i a() {
            return new i(this.f10271a, this.f10272b, this.f10273c, this.f10274d, this.f10275e, this.f10276f, this.f10277g);
        }
    }

    private void f(long j11) {
        long j12 = this.f10269r + (this.f10270s * 3);
        if (this.f10264m > j12) {
            float fB1 = s7.q0.b1(this.f10254c);
            this.f10264m = ru.h.d(j12, this.f10261j, this.f10264m - (((long) ((this.f10267p - 1.0f) * fB1)) + ((long) ((this.f10265n - 1.0f) * fB1))));
            return;
        }
        long jS = s7.q0.s(j11 - ((long) (Math.max(BitmapDescriptorFactory.HUE_RED, this.f10267p - 1.0f) / this.f10255d)), this.f10264m, j12);
        this.f10264m = jS;
        long j13 = this.f10263l;
        if (j13 == -9223372036854775807L || jS <= j13) {
            return;
        }
        this.f10264m = j13;
    }

    private void g() {
        long j11;
        long j12 = this.f10259h;
        if (j12 != -9223372036854775807L) {
            j11 = this.f10260i;
            if (j11 == -9223372036854775807L) {
                long j13 = this.f10262k;
                if (j13 != -9223372036854775807L && j12 < j13) {
                    j12 = j13;
                }
                j11 = this.f10263l;
                if (j11 == -9223372036854775807L || j12 <= j11) {
                    j11 = j12;
                }
            }
        } else {
            j11 = -9223372036854775807L;
        }
        if (this.f10261j == j11) {
            return;
        }
        this.f10261j = j11;
        this.f10264m = j11;
        this.f10269r = -9223372036854775807L;
        this.f10270s = -9223372036854775807L;
        this.f10268q = -9223372036854775807L;
    }

    private static long h(long j11, long j12, float f11) {
        return (long) ((j11 * f11) + ((1.0f - f11) * j12));
    }

    private void i(long j11, long j12) {
        long j13 = j11 - j12;
        long j14 = this.f10269r;
        if (j14 == -9223372036854775807L) {
            this.f10269r = j13;
            this.f10270s = 0L;
        } else {
            long jMax = Math.max(j13, h(j14, j13, this.f10258g));
            this.f10269r = jMax;
            this.f10270s = h(this.f10270s, Math.abs(j13 - jMax), this.f10258g);
        }
    }

    @Override // z7.v
    public float a(long j11, long j12) {
        if (this.f10259h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j11, j12);
        if (this.f10268q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f10268q < this.f10254c) {
            return this.f10267p;
        }
        this.f10268q = SystemClock.elapsedRealtime();
        f(j11);
        long j13 = j11 - this.f10264m;
        if (Math.abs(j13) < this.f10256e) {
            this.f10267p = 1.0f;
        } else {
            this.f10267p = s7.q0.q((this.f10255d * j13) + 1.0f, this.f10266o, this.f10265n);
        }
        return this.f10267p;
    }

    @Override // z7.v
    public long b() {
        return this.f10264m;
    }

    @Override // z7.v
    public void c() {
        long j11 = this.f10264m;
        if (j11 == -9223372036854775807L) {
            return;
        }
        long j12 = j11 + this.f10257f;
        this.f10264m = j12;
        long j13 = this.f10263l;
        if (j13 != -9223372036854775807L && j12 > j13) {
            this.f10264m = j13;
        }
        this.f10268q = -9223372036854775807L;
    }

    @Override // z7.v
    public void d(long j11) {
        this.f10260i = j11;
        g();
    }

    @Override // z7.v
    public void e(p7.y.g gVar) {
        this.f10259h = s7.q0.b1(gVar.f101765a);
        this.f10262k = s7.q0.b1(gVar.f101766b);
        this.f10263l = s7.q0.b1(gVar.f101767c);
        float f11 = gVar.f101768d;
        if (f11 == -3.4028235E38f) {
            f11 = this.f10252a;
        }
        this.f10266o = f11;
        float f12 = gVar.f101769e;
        if (f12 == -3.4028235E38f) {
            f12 = this.f10253b;
        }
        this.f10265n = f12;
        if (f11 == 1.0f && f12 == 1.0f) {
            this.f10259h = -9223372036854775807L;
        }
        g();
    }

    private i(float f11, float f12, long j11, float f13, long j12, long j13, float f14) {
        this.f10252a = f11;
        this.f10253b = f12;
        this.f10254c = j11;
        this.f10255d = f13;
        this.f10256e = j12;
        this.f10257f = j13;
        this.f10258g = f14;
        this.f10259h = -9223372036854775807L;
        this.f10260i = -9223372036854775807L;
        this.f10262k = -9223372036854775807L;
        this.f10263l = -9223372036854775807L;
        this.f10266o = f11;
        this.f10265n = f12;
        this.f10267p = 1.0f;
        this.f10268q = -9223372036854775807L;
        this.f10261j = -9223372036854775807L;
        this.f10264m = -9223372036854775807L;
        this.f10269r = -9223372036854775807L;
        this.f10270s = -9223372036854775807L;
    }
}
