package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f9477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g.a f9479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f9481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f9482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f9483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f9485i;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f9486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f9487b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f9488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f9489d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f9490e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f9491f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f9492g;

        public a(AudioTrack audioTrack) {
            this.f9486a = audioTrack;
        }

        public void a() {
            this.f9491f = true;
        }

        public long b() {
            return this.f9490e;
        }

        public long c() {
            return this.f9487b.nanoTime / 1000;
        }

        public boolean d() {
            boolean timestamp = this.f9486a.getTimestamp(this.f9487b);
            if (timestamp) {
                long j11 = this.f9487b.framePosition;
                long j12 = this.f9489d;
                if (j12 > j11) {
                    if (this.f9491f) {
                        this.f9492g += j12;
                        this.f9491f = false;
                    } else {
                        this.f9488c++;
                    }
                }
                this.f9489d = j11;
                this.f9490e = j11 + this.f9492g + (this.f9488c << 32);
            }
            return timestamp;
        }
    }

    public f(AudioTrack audioTrack, g.a aVar) {
        this.f9477a = new a(audioTrack);
        this.f9478b = audioTrack.getSampleRate();
        this.f9479c = aVar;
        j();
    }

    private void a(long j11, float f11, long j12) {
        long jC = this.f9477a.c();
        long jB = b(j11, f11);
        if (Math.abs(jC - j11) > 5000000) {
            this.f9479c.c(this.f9477a.b(), jC, j11, j12);
            k(4);
        } else if (Math.abs(jB - j12) > 5000000) {
            this.f9479c.a(this.f9477a.b(), jC, j11, j12);
            k(4);
        } else if (this.f9480d == 4) {
            j();
        }
    }

    private long b(long j11, float f11) {
        return c(this.f9477a.b(), this.f9477a.c(), j11, f11);
    }

    private long c(long j11, long j12, long j13, float f11) {
        return q0.r1(j11, this.f9478b) + q0.o0(j13 - j12, f11);
    }

    private boolean g(long j11, float f11) {
        long jB = this.f9477a.b();
        long j12 = this.f9484h;
        if (jB <= j12) {
            return false;
        }
        return Math.abs(b(j11, f11) - c(j12, this.f9485i, j11, f11)) < 1000;
    }

    private void k(int i11) {
        this.f9480d = i11;
        if (i11 == 0) {
            this.f9483g = 0L;
            this.f9484h = -1L;
            this.f9485i = -9223372036854775807L;
            this.f9481e = System.nanoTime() / 1000;
            this.f9482f = 10000L;
            return;
        }
        if (i11 == 1) {
            this.f9482f = 10000L;
            return;
        }
        if (i11 == 2 || i11 == 3) {
            this.f9482f = 10000000L;
        } else {
            if (i11 != 4) {
                throw new IllegalStateException();
            }
            this.f9482f = 500000L;
        }
    }

    public void d() {
        this.f9477a.a();
    }

    public long e(long j11, float f11) {
        return b(j11, f11);
    }

    public boolean f() {
        return this.f9480d == 2;
    }

    public boolean h() {
        int i11 = this.f9480d;
        return i11 == 0 || i11 == 1;
    }

    public void i(long j11, float f11, long j12) {
        if (j11 - this.f9483g < this.f9482f) {
            return;
        }
        this.f9483g = j11;
        boolean zD = this.f9477a.d();
        if (zD) {
            a(j11, f11, j12);
        }
        int i11 = this.f9480d;
        if (i11 == 0) {
            if (!zD) {
                if (j11 - this.f9481e > 500000) {
                    k(3);
                    return;
                }
                return;
            } else {
                if (this.f9477a.c() >= this.f9481e) {
                    this.f9484h = this.f9477a.b();
                    this.f9485i = this.f9477a.c();
                    k(1);
                    return;
                }
                return;
            }
        }
        if (i11 == 1) {
            if (!zD) {
                j();
                return;
            }
            if (g(j11, f11)) {
                k(2);
                return;
            } else if (j11 - this.f9481e > 2000000) {
                k(3);
                return;
            } else {
                this.f9484h = this.f9477a.b();
                this.f9485i = this.f9477a.c();
                return;
            }
        }
        if (i11 == 2) {
            if (zD) {
                return;
            }
            j();
        } else if (i11 != 3) {
            if (i11 != 4) {
                throw new IllegalStateException();
            }
        } else if (zD) {
            j();
        }
    }

    public void j() {
        k(0);
    }
}
