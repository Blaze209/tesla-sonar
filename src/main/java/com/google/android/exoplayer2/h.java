package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class h implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f39976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f39977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f39978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f39979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f39980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f39981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f39982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f39983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f39984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f39985j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f39986k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f39987l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f39988m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f39989n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f39990o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f39991p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f39992q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f39993r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f39994s;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f39995a = 0.97f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f39996b = 1.03f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f39997c = 1000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f39998d = 1.0E-7f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f39999e = ts.p0.D0(20);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f40000f = ts.p0.D0(500);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f40001g = 0.999f;

        public h a() {
            return new h(this.f39995a, this.f39996b, this.f39997c, this.f39998d, this.f39999e, this.f40000f, this.f40001g);
        }
    }

    private void f(long j11) {
        long j12 = this.f39993r + (this.f39994s * 3);
        if (this.f39988m > j12) {
            float fD0 = ts.p0.D0(this.f39978c);
            this.f39988m = ru.h.d(j12, this.f39985j, this.f39988m - (((long) ((this.f39991p - 1.0f) * fD0)) + ((long) ((this.f39989n - 1.0f) * fD0))));
            return;
        }
        long jR = ts.p0.r(j11 - ((long) (Math.max(BitmapDescriptorFactory.HUE_RED, this.f39991p - 1.0f) / this.f39979d)), this.f39988m, j12);
        this.f39988m = jR;
        long j13 = this.f39987l;
        if (j13 == -9223372036854775807L || jR <= j13) {
            return;
        }
        this.f39988m = j13;
    }

    private void g() {
        long j11 = this.f39983h;
        if (j11 != -9223372036854775807L) {
            long j12 = this.f39984i;
            if (j12 != -9223372036854775807L) {
                j11 = j12;
            }
            long j13 = this.f39986k;
            if (j13 != -9223372036854775807L && j11 < j13) {
                j11 = j13;
            }
            long j14 = this.f39987l;
            if (j14 != -9223372036854775807L && j11 > j14) {
                j11 = j14;
            }
        } else {
            j11 = -9223372036854775807L;
        }
        if (this.f39985j == j11) {
            return;
        }
        this.f39985j = j11;
        this.f39988m = j11;
        this.f39993r = -9223372036854775807L;
        this.f39994s = -9223372036854775807L;
        this.f39992q = -9223372036854775807L;
    }

    private static long h(long j11, long j12, float f11) {
        return (long) ((j11 * f11) + ((1.0f - f11) * j12));
    }

    private void i(long j11, long j12) {
        long j13 = j11 - j12;
        long j14 = this.f39993r;
        if (j14 == -9223372036854775807L) {
            this.f39993r = j13;
            this.f39994s = 0L;
        } else {
            long jMax = Math.max(j13, h(j14, j13, this.f39982g));
            this.f39993r = jMax;
            this.f39994s = h(this.f39994s, Math.abs(j13 - jMax), this.f39982g);
        }
    }

    @Override // com.google.android.exoplayer2.w0
    public float a(long j11, long j12) {
        if (this.f39983h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j11, j12);
        if (this.f39992q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f39992q < this.f39978c) {
            return this.f39991p;
        }
        this.f39992q = SystemClock.elapsedRealtime();
        f(j11);
        long j13 = j11 - this.f39988m;
        if (Math.abs(j13) < this.f39980e) {
            this.f39991p = 1.0f;
        } else {
            this.f39991p = ts.p0.p((this.f39979d * j13) + 1.0f, this.f39990o, this.f39989n);
        }
        return this.f39991p;
    }

    @Override // com.google.android.exoplayer2.w0
    public long b() {
        return this.f39988m;
    }

    @Override // com.google.android.exoplayer2.w0
    public void c() {
        long j11 = this.f39988m;
        if (j11 == -9223372036854775807L) {
            return;
        }
        long j12 = j11 + this.f39981f;
        this.f39988m = j12;
        long j13 = this.f39987l;
        if (j13 != -9223372036854775807L && j12 > j13) {
            this.f39988m = j13;
        }
        this.f39992q = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.w0
    public void d(long j11) {
        this.f39984i = j11;
        g();
    }

    @Override // com.google.android.exoplayer2.w0
    public void e(x0.g gVar) {
        this.f39983h = ts.p0.D0(gVar.f41246a);
        this.f39986k = ts.p0.D0(gVar.f41247b);
        this.f39987l = ts.p0.D0(gVar.f41248c);
        float f11 = gVar.f41249d;
        if (f11 == -3.4028235E38f) {
            f11 = this.f39976a;
        }
        this.f39990o = f11;
        float f12 = gVar.f41250e;
        if (f12 == -3.4028235E38f) {
            f12 = this.f39977b;
        }
        this.f39989n = f12;
        if (f11 == 1.0f && f12 == 1.0f) {
            this.f39983h = -9223372036854775807L;
        }
        g();
    }

    private h(float f11, float f12, long j11, float f13, long j12, long j13, float f14) {
        this.f39976a = f11;
        this.f39977b = f12;
        this.f39978c = j11;
        this.f39979d = f13;
        this.f39980e = j12;
        this.f39981f = j13;
        this.f39982g = f14;
        this.f39983h = -9223372036854775807L;
        this.f39984i = -9223372036854775807L;
        this.f39986k = -9223372036854775807L;
        this.f39987l = -9223372036854775807L;
        this.f39990o = f11;
        this.f39989n = f12;
        this.f39991p = 1.0f;
        this.f39992q = -9223372036854775807L;
        this.f39985j = -9223372036854775807L;
        this.f39988m = -9223372036854775807L;
        this.f39993r = -9223372036854775807L;
        this.f39994s = -9223372036854775807L;
    }
}
