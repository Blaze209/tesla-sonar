package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f39548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f39550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f39551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f39552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f39553f;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f39554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f39555b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f39556c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f39557d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f39558e;

        public a(AudioTrack audioTrack) {
            this.f39554a = audioTrack;
        }

        public long a() {
            return this.f39558e;
        }

        public long b() {
            return this.f39555b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f39554a.getTimestamp(this.f39555b);
            if (timestamp) {
                long j11 = this.f39555b.framePosition;
                if (this.f39557d > j11) {
                    this.f39556c++;
                }
                this.f39557d = j11;
                this.f39558e = j11 + (this.f39556c << 32);
            }
            return timestamp;
        }
    }

    public f(AudioTrack audioTrack) {
        if (p0.f115040a >= 19) {
            this.f39548a = new a(audioTrack);
            g();
        } else {
            this.f39548a = null;
            h(3);
        }
    }

    private void h(int i11) {
        this.f39549b = i11;
        if (i11 == 0) {
            this.f39552e = 0L;
            this.f39553f = -1L;
            this.f39550c = System.nanoTime() / 1000;
            this.f39551d = 10000L;
            return;
        }
        if (i11 == 1) {
            this.f39551d = 10000L;
            return;
        }
        if (i11 == 2 || i11 == 3) {
            this.f39551d = 10000000L;
        } else {
            if (i11 != 4) {
                throw new IllegalStateException();
            }
            this.f39551d = 500000L;
        }
    }

    public void a() {
        if (this.f39549b == 4) {
            g();
        }
    }

    @TargetApi(19)
    public long b() {
        a aVar = this.f39548a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    @TargetApi(19)
    public long c() {
        a aVar = this.f39548a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        return this.f39549b == 2;
    }

    @TargetApi(19)
    public boolean e(long j11) {
        a aVar = this.f39548a;
        if (aVar == null || j11 - this.f39552e < this.f39551d) {
            return false;
        }
        this.f39552e = j11;
        boolean zC = aVar.c();
        int i11 = this.f39549b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zC) {
                        g();
                        return zC;
                    }
                } else if (!zC) {
                    g();
                    return zC;
                }
            } else {
                if (!zC) {
                    g();
                    return zC;
                }
                if (this.f39548a.a() > this.f39553f) {
                    h(2);
                    return zC;
                }
            }
        } else {
            if (zC) {
                if (this.f39548a.b() < this.f39550c) {
                    return false;
                }
                this.f39553f = this.f39548a.a();
                h(1);
                return zC;
            }
            if (j11 - this.f39550c > 500000) {
                h(3);
            }
        }
        return zC;
    }

    public void f() {
        h(4);
    }

    public void g() {
        if (this.f39548a != null) {
            h(0);
        }
    }
}
