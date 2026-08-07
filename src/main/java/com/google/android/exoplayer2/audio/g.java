package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class g {
    private long A;
    private long B;
    private long C;
    private long D;
    private boolean E;
    private long F;
    private long G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f39559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f39560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioTrack f39561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f f39564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f39567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f39568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f39569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f39570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f39571m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Method f39572n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f39573o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f39574p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f39575q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f39576r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f39577s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f39578t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f39579u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f39580v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f39581w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f39582x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f39583y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f39584z;

    public interface a {
        void a(long j11, long j12, long j13, long j14);

        void b(long j11);

        void c(long j11, long j12, long j13, long j14);

        void d(int i11, long j11);

        void e(long j11);
    }

    public g(a aVar) {
        this.f39559a = (a) ts.a.e(aVar);
        if (p0.f115040a >= 18) {
            try {
                this.f39572n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f39560b = new long[10];
    }

    private boolean a() {
        return this.f39566h && ((AudioTrack) ts.a.e(this.f39561c)).getPlayState() == 2 && d() == 0;
    }

    private long d() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f39583y;
        if (j11 != -9223372036854775807L) {
            return Math.min(this.B, this.A + p0.A(p0.Y((jElapsedRealtime * 1000) - j11, this.f39568j), this.f39565g));
        }
        if (jElapsedRealtime - this.f39577s >= 5) {
            u(jElapsedRealtime);
            this.f39577s = jElapsedRealtime;
        }
        return this.f39578t + (this.f39579u << 32);
    }

    private long e() {
        return p0.L0(d(), this.f39565g);
    }

    private void k(long j11) {
        f fVar = (f) ts.a.e(this.f39564f);
        if (fVar.e(j11)) {
            long jC = fVar.c();
            long jB = fVar.b();
            long jE = e();
            if (Math.abs(jC - j11) > 5000000) {
                this.f39559a.c(jB, jC, j11, jE);
                fVar.f();
            } else if (Math.abs(p0.L0(jB, this.f39565g) - jE) <= 5000000) {
                fVar.a();
            } else {
                this.f39559a.a(jB, jC, j11, jE);
                fVar.f();
            }
        }
    }

    private void l() {
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.f39571m >= 30000) {
            long jE = e();
            if (jE != 0) {
                this.f39560b[this.f39581w] = p0.d0(jE, this.f39568j) - jNanoTime;
                this.f39581w = (this.f39581w + 1) % 10;
                int i11 = this.f39582x;
                if (i11 < 10) {
                    this.f39582x = i11 + 1;
                }
                this.f39571m = jNanoTime;
                this.f39570l = 0L;
                int i12 = 0;
                while (true) {
                    int i13 = this.f39582x;
                    if (i12 >= i13) {
                        break;
                    }
                    this.f39570l += this.f39560b[i12] / ((long) i13);
                    i12++;
                }
            } else {
                return;
            }
        }
        if (this.f39566h) {
            return;
        }
        k(jNanoTime);
        m(jNanoTime);
    }

    private void m(long j11) {
        Method method;
        if (!this.f39575q || (method = this.f39572n) == null || j11 - this.f39576r < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) p0.j((Integer) method.invoke(ts.a.e(this.f39561c), null))).intValue()) * 1000) - this.f39567i;
            this.f39573o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f39573o = jMax;
            if (jMax > 5000000) {
                this.f39559a.e(jMax);
                this.f39573o = 0L;
            }
        } catch (Exception unused) {
            this.f39572n = null;
        }
        this.f39576r = j11;
    }

    private static boolean n(int i11) {
        if (p0.f115040a < 23) {
            return i11 == 5 || i11 == 6;
        }
        return false;
    }

    private void q() {
        this.f39570l = 0L;
        this.f39582x = 0;
        this.f39581w = 0;
        this.f39571m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f39569k = false;
    }

    private void u(long j11) {
        AudioTrack audioTrack = (AudioTrack) ts.a.e(this.f39561c);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f39566h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f39580v = this.f39578t;
            }
            playbackHeadPosition += this.f39580v;
        }
        if (p0.f115040a <= 29) {
            if (playbackHeadPosition == 0 && this.f39578t > 0 && playState == 3) {
                if (this.f39584z == -9223372036854775807L) {
                    this.f39584z = j11;
                    return;
                }
                return;
            }
            this.f39584z = -9223372036854775807L;
        }
        if (this.f39578t > playbackHeadPosition) {
            this.f39579u++;
        }
        this.f39578t = playbackHeadPosition;
    }

    public int b(long j11) {
        return this.f39563e - ((int) (j11 - (d() * ((long) this.f39562d))));
    }

    public long c(boolean z11) {
        long jE;
        if (((AudioTrack) ts.a.e(this.f39561c)).getPlayState() == 3) {
            l();
        }
        long jNanoTime = System.nanoTime() / 1000;
        f fVar = (f) ts.a.e(this.f39564f);
        boolean zD = fVar.d();
        if (zD) {
            jE = p0.L0(fVar.b(), this.f39565g) + p0.Y(jNanoTime - fVar.c(), this.f39568j);
        } else {
            jE = this.f39582x == 0 ? e() : p0.Y(this.f39570l + jNanoTime, this.f39568j);
            if (!z11) {
                jE = Math.max(0L, jE - this.f39573o);
            }
        }
        if (this.E != zD) {
            this.G = this.D;
            this.F = this.C;
        }
        long j11 = jNanoTime - this.G;
        if (j11 < 1000000) {
            long jY = this.F + p0.Y(j11, this.f39568j);
            long j12 = (j11 * 1000) / 1000000;
            jE = ((jE * j12) + ((1000 - j12) * jY)) / 1000;
        }
        if (!this.f39569k) {
            long j13 = this.C;
            if (jE > j13) {
                this.f39569k = true;
                this.f39559a.b(System.currentTimeMillis() - p0.Z0(p0.d0(p0.Z0(jE - j13), this.f39568j)));
            }
        }
        this.D = jNanoTime;
        this.C = jE;
        this.E = zD;
        return jE;
    }

    public void f(long j11) {
        this.A = d();
        this.f39583y = SystemClock.elapsedRealtime() * 1000;
        this.B = j11;
    }

    public boolean g(long j11) {
        return j11 > p0.A(c(false), this.f39565g) || a();
    }

    public boolean h() {
        return ((AudioTrack) ts.a.e(this.f39561c)).getPlayState() == 3;
    }

    public boolean i(long j11) {
        return this.f39584z != -9223372036854775807L && j11 > 0 && SystemClock.elapsedRealtime() - this.f39584z >= 200;
    }

    public boolean j(long j11) {
        int playState = ((AudioTrack) ts.a.e(this.f39561c)).getPlayState();
        if (this.f39566h) {
            if (playState == 2) {
                this.f39574p = false;
                return false;
            }
            if (playState == 1 && d() == 0) {
                return false;
            }
        }
        boolean z11 = this.f39574p;
        boolean zG = g(j11);
        this.f39574p = zG;
        if (z11 && !zG && playState != 1) {
            this.f39559a.d(this.f39563e, p0.Z0(this.f39567i));
        }
        return true;
    }

    public boolean o() {
        q();
        if (this.f39583y != -9223372036854775807L) {
            return false;
        }
        ((f) ts.a.e(this.f39564f)).g();
        return true;
    }

    public void p() {
        q();
        this.f39561c = null;
        this.f39564f = null;
    }

    public void r(AudioTrack audioTrack, boolean z11, int i11, int i12, int i13) {
        this.f39561c = audioTrack;
        this.f39562d = i12;
        this.f39563e = i13;
        this.f39564f = new f(audioTrack);
        this.f39565g = audioTrack.getSampleRate();
        this.f39566h = z11 && n(i11);
        boolean zW0 = p0.w0(i11);
        this.f39575q = zW0;
        this.f39567i = zW0 ? p0.L0(i13 / i12, this.f39565g) : -9223372036854775807L;
        this.f39578t = 0L;
        this.f39579u = 0L;
        this.f39580v = 0L;
        this.f39574p = false;
        this.f39583y = -9223372036854775807L;
        this.f39584z = -9223372036854775807L;
        this.f39576r = 0L;
        this.f39573o = 0L;
        this.f39568j = 1.0f;
    }

    public void s(float f11) {
        this.f39568j = f11;
        f fVar = this.f39564f;
        if (fVar != null) {
            fVar.g();
        }
        q();
    }

    public void t() {
        ((f) ts.a.e(this.f39564f)).g();
    }
}
