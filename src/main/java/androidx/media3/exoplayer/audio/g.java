package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
final class g {
    private long A;
    private long B;
    private long C;
    boolean D;
    private long E;
    private long F;
    private boolean G;
    private long H;
    private s7.j I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f9493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f9494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioTrack f9495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f9497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f9498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f9499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f9501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f9502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f9503k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f9504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f9505m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f9506n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Method f9507o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f9508p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f9509q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f9510r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f9511s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f9512t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f9513u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f9514v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f9515w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f9516x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f9517y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f9518z;

    public interface a {
        void a(long j11, long j12, long j13, long j14);

        void b(long j11);

        void c(long j11, long j12, long j13, long j14);

        void d(int i11, long j11);

        void e(long j11);
    }

    public g(a aVar) {
        this.f9493a = (a) s7.a.f(aVar);
        try {
            this.f9507o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f9494b = new long[10];
        this.F = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.I = s7.j.f110429a;
    }

    private boolean b() {
        return this.f9499g && ((AudioTrack) s7.a.f(this.f9495c)).getPlayState() == 2 && d() == 0;
    }

    private long d() {
        if (this.f9518z != -9223372036854775807L) {
            return Math.min(this.C, g());
        }
        long jElapsedRealtime = this.I.elapsedRealtime();
        if (jElapsedRealtime - this.f9512t >= 5) {
            y(jElapsedRealtime);
            this.f9512t = jElapsedRealtime;
        }
        return this.f9513u + this.H + (this.f9514v << 32);
    }

    private long e(long j11) {
        long jO0;
        if (this.f9517y == 0) {
            jO0 = this.f9518z != -9223372036854775807L ? q0.r1(g(), this.f9498f) : f();
        } else {
            jO0 = q0.o0(j11 + this.f9505m, this.f9501i);
        }
        long jMax = Math.max(0L, jO0 - this.f9508p);
        return this.f9518z != -9223372036854775807L ? Math.min(q0.r1(this.C, this.f9498f), jMax) : jMax;
    }

    private long f() {
        return q0.r1(d(), this.f9498f);
    }

    private long g() {
        if (((AudioTrack) s7.a.f(this.f9495c)).getPlayState() == 2) {
            return this.B;
        }
        return this.B + q0.H(q0.o0(q0.b1(this.I.elapsedRealtime()) - this.f9518z, this.f9501i), this.f9498f);
    }

    private boolean i() {
        int underrunCount = ((AudioTrack) s7.a.f(this.f9495c)).getUnderrunCount();
        boolean z11 = underrunCount > this.f9504l;
        this.f9504l = underrunCount;
        return z11;
    }

    private void n() {
        long jNanoTime = this.I.nanoTime() / 1000;
        if (jNanoTime - this.f9506n >= 30000) {
            long jF = f();
            if (jF != 0) {
                this.f9494b[this.f9516x] = q0.u0(jF, this.f9501i) - jNanoTime;
                this.f9516x = (this.f9516x + 1) % 10;
                int i11 = this.f9517y;
                if (i11 < 10) {
                    this.f9517y = i11 + 1;
                }
                this.f9506n = jNanoTime;
                this.f9505m = 0L;
                int i12 = 0;
                while (true) {
                    int i13 = this.f9517y;
                    if (i12 >= i13) {
                        break;
                    }
                    this.f9505m += this.f9494b[i12] / ((long) i13);
                    i12++;
                }
            } else {
                return;
            }
        }
        if (this.f9499g) {
            return;
        }
        p(jNanoTime);
        ((f) s7.a.f(this.f9497e)).i(jNanoTime, this.f9501i, e(jNanoTime));
    }

    private void o(long j11) {
        if (this.D) {
            long j12 = this.f9503k;
            if (j12 == -9223372036854775807L || j11 < j12) {
                return;
            }
            long jCurrentTimeMillis = this.I.currentTimeMillis() - q0.O1(q0.u0(j11 - j12, this.f9501i));
            this.f9503k = -9223372036854775807L;
            this.f9493a.b(jCurrentTimeMillis);
        }
    }

    private void p(long j11) {
        Method method;
        if (!this.f9510r || (method = this.f9507o) == null || j11 - this.f9511s < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) q0.l((Integer) method.invoke(s7.a.f(this.f9495c), null))).intValue()) * 1000) - this.f9500h;
            this.f9508p = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f9508p = jMax;
            if (jMax > 5000000) {
                this.f9493a.e(jMax);
                this.f9508p = 0L;
            }
        } catch (Exception unused) {
            this.f9507o = null;
        }
        this.f9511s = j11;
    }

    private static boolean q(int i11) {
        return false;
    }

    private void t() {
        this.f9505m = 0L;
        this.f9517y = 0;
        this.f9516x = 0;
        this.f9506n = 0L;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.f9502j = false;
    }

    private void y(long j11) {
        AudioTrack audioTrack = (AudioTrack) s7.a.f(this.f9495c);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f9499g) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f9515w = this.f9513u;
            }
            playbackHeadPosition += this.f9515w;
        }
        if (Build.VERSION.SDK_INT <= 29) {
            if (playbackHeadPosition == 0 && this.f9513u > 0 && playState == 3) {
                if (this.A == -9223372036854775807L) {
                    this.A = j11;
                    return;
                }
                return;
            }
            this.A = -9223372036854775807L;
        }
        long j12 = this.f9513u;
        if (j12 > playbackHeadPosition) {
            if (this.G) {
                this.H += j12;
                this.G = false;
            } else {
                this.f9514v++;
            }
        }
        this.f9513u = playbackHeadPosition;
    }

    public void a() {
        this.G = true;
        f fVar = this.f9497e;
        if (fVar != null) {
            fVar.d();
        }
    }

    public long c() {
        AudioTrack audioTrack = (AudioTrack) s7.a.f(this.f9495c);
        if (audioTrack.getPlayState() == 3) {
            n();
        }
        long jNanoTime = this.I.nanoTime() / 1000;
        f fVar = (f) s7.a.f(this.f9497e);
        boolean zF = fVar.f();
        long jE = zF ? fVar.e(jNanoTime, this.f9501i) : e(jNanoTime);
        int playState = audioTrack.getPlayState();
        if (playState != 3) {
            if (playState == 1) {
                o(jE);
            }
            return jE;
        }
        if (zF || !fVar.h()) {
            o(jE);
        }
        long j11 = this.F;
        if (j11 != -9223372036854775807L) {
            long j12 = jE - this.E;
            long jO0 = q0.o0(jNanoTime - j11, this.f9501i);
            long j13 = this.E + jO0;
            long jAbs = Math.abs(j13 - jE);
            if (j12 != 0 && jAbs < 1000000) {
                long j14 = (jO0 * 10) / 100;
                jE = q0.s(jE, j13 - j14, j13 + j14);
            }
        }
        if (!this.D && !this.f9502j) {
            long j15 = this.E;
            if (j15 != -9223372036854775807L && jE > j15) {
                this.f9502j = true;
                this.f9493a.b(this.I.currentTimeMillis() - q0.O1(q0.u0(q0.O1(jE - j15), this.f9501i)));
            }
        }
        this.F = jNanoTime;
        this.E = jE;
        return jE;
    }

    public void h(long j11) {
        this.B = d();
        this.f9518z = q0.b1(this.I.elapsedRealtime());
        this.C = j11;
    }

    public boolean j(long j11) {
        return j11 > q0.H(c(), this.f9498f) || b();
    }

    public boolean k() {
        return ((AudioTrack) s7.a.f(this.f9495c)).getPlayState() == 3;
    }

    public boolean l(long j11) {
        return this.A != -9223372036854775807L && j11 > 0 && this.I.elapsedRealtime() - this.A >= 200;
    }

    public boolean m(long j11) {
        int playState = ((AudioTrack) s7.a.f(this.f9495c)).getPlayState();
        if (this.f9499g) {
            if (playState == 2) {
                this.f9509q = false;
                return false;
            }
            if (playState == 1 && d() == 0) {
                return false;
            }
        }
        if (i()) {
            this.f9493a.d(this.f9496d, q0.O1(this.f9500h));
        }
        return true;
    }

    public void r() {
        t();
        if (this.f9518z == -9223372036854775807L) {
            ((f) s7.a.f(this.f9497e)).j();
        }
        this.B = d();
    }

    public void s() {
        t();
        this.f9495c = null;
        this.f9497e = null;
    }

    public void u(AudioTrack audioTrack, boolean z11, int i11, int i12, int i13, boolean z12) {
        this.f9495c = audioTrack;
        this.f9496d = i13;
        this.f9497e = new f(audioTrack, this.f9493a);
        this.f9498f = audioTrack.getSampleRate();
        this.f9499g = z11 && q(i11);
        boolean zR0 = q0.R0(i11);
        this.f9510r = zR0;
        this.f9500h = zR0 ? q0.r1(i13 / i12, this.f9498f) : -9223372036854775807L;
        this.f9513u = 0L;
        this.f9514v = 0L;
        this.G = false;
        this.H = 0L;
        this.f9515w = 0L;
        this.f9509q = false;
        this.f9518z = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.f9511s = 0L;
        this.f9508p = 0L;
        this.f9501i = 1.0f;
        this.f9504l = 0;
        this.f9503k = -9223372036854775807L;
        this.D = z12;
    }

    public void v(float f11) {
        this.f9501i = f11;
        f fVar = this.f9497e;
        if (fVar != null) {
            fVar.j();
        }
        t();
    }

    public void w(s7.j jVar) {
        this.I = jVar;
    }

    public void x() {
        if (this.f9518z != -9223372036854775807L) {
            this.f9518z = q0.b1(this.I.elapsedRealtime());
        }
        this.f9503k = f();
        ((f) s7.a.f(this.f9497e)).j();
    }
}
