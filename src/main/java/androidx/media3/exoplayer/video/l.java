package androidx.media3.exoplayer.video;

import android.content.Context;
import android.view.Surface;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f11294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u8.l f11295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f11296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11297d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f11300g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f11303j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f11306m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f11307n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f11308o;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11298e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f11299f = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f11301h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f11302i = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f11304k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private s7.j f11305l = s7.j.f110429a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f11309a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f11310b = -9223372036854775807L;

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.f11309a = -9223372036854775807L;
            this.f11310b = -9223372036854775807L;
        }

        public long f() {
            return this.f11309a;
        }

        public long g() {
            return this.f11310b;
        }
    }

    public interface b {
        boolean E(long j11, long j12);

        boolean H(long j11, long j12, boolean z11);

        boolean L(long j11, long j12, long j13, boolean z11, boolean z12);
    }

    public l(Context context, b bVar, long j11) {
        this.f11294a = bVar;
        this.f11296c = j11;
        this.f11295b = new u8.l(context);
    }

    private long b(long j11, long j12, long j13) {
        long j14 = (long) ((j13 - j11) / ((double) this.f11304k));
        return this.f11297d ? j14 - (q0.b1(this.f11305l.elapsedRealtime()) - j12) : j14;
    }

    private void f(int i11) {
        this.f11298e = Math.min(this.f11298e, i11);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045 A[RETURN] */
    private boolean q(long j11, long j12, long j13) {
        if (this.f11302i != -9223372036854775807L && !this.f11303j) {
            return false;
        }
        int i11 = this.f11298e;
        if (i11 == 0) {
            return this.f11297d;
        }
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return j11 >= j13;
        }
        if (i11 != 3) {
            throw new IllegalStateException();
        }
        long jB1 = q0.b1(this.f11305l.elapsedRealtime()) - this.f11300g;
        if (this.f11297d) {
            if (!this.f11308o) {
                long j14 = this.f11299f;
                if (j14 != -9223372036854775807L && j14 != j11) {
                    if (this.f11294a.E(j12, jB1)) {
                        return true;
                    }
                }
            } else if (this.f11294a.E(j12, jB1)) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (this.f11298e == 0) {
            this.f11298e = 1;
        }
    }

    public int c(long j11, long j12, long j13, long j14, boolean z11, boolean z12, a aVar) {
        aVar.h();
        if (this.f11297d && this.f11299f == -9223372036854775807L) {
            this.f11299f = j12;
        }
        if (this.f11301h != j11) {
            this.f11295b.h(j11);
            this.f11301h = j11;
        }
        aVar.f11309a = b(j12, j13, j11);
        if (z11 && !z12) {
            return 3;
        }
        if (!this.f11306m) {
            this.f11307n = true;
            if (this.f11294a.L(aVar.f11309a, j12, j13, z12, true)) {
                return 4;
            }
            return (!this.f11297d || aVar.f11309a >= 30000) ? 5 : 3;
        }
        if (q(j12, aVar.f11309a, j14)) {
            return 0;
        }
        if (!this.f11297d || j12 == this.f11299f) {
            return 5;
        }
        long jNanoTime = this.f11305l.nanoTime();
        aVar.f11310b = this.f11295b.b((aVar.f11309a * 1000) + jNanoTime);
        aVar.f11309a = (aVar.f11310b - jNanoTime) / 1000;
        boolean z13 = (this.f11302i == -9223372036854775807L || this.f11303j) ? false : true;
        if (this.f11294a.L(aVar.f11309a, j12, j13, z12, z13)) {
            return 4;
        }
        if (this.f11294a.H(aVar.f11309a, j13, z12)) {
            return z13 ? 3 : 2;
        }
        return aVar.f11309a > 50000 ? 5 : 1;
    }

    public boolean d(boolean z11) {
        if (z11 && (this.f11298e == 3 || (!this.f11306m && this.f11307n))) {
            this.f11302i = -9223372036854775807L;
            return true;
        }
        if (this.f11302i == -9223372036854775807L) {
            return false;
        }
        if (this.f11305l.elapsedRealtime() < this.f11302i) {
            return true;
        }
        this.f11302i = -9223372036854775807L;
        return false;
    }

    public void e(boolean z11) {
        this.f11303j = z11;
        this.f11302i = this.f11296c > 0 ? this.f11305l.elapsedRealtime() + this.f11296c : -9223372036854775807L;
    }

    public boolean g() {
        boolean z11 = this.f11298e != 3;
        this.f11298e = 3;
        this.f11300g = q0.b1(this.f11305l.elapsedRealtime());
        return z11;
    }

    public void h() {
        this.f11297d = true;
        this.f11300g = q0.b1(this.f11305l.elapsedRealtime());
        this.f11295b.k();
    }

    public void i() {
        this.f11297d = false;
        this.f11302i = -9223372036854775807L;
        this.f11295b.l();
    }

    public void j(int i11) {
        if (i11 == 0) {
            this.f11298e = 1;
        } else if (i11 == 1) {
            this.f11298e = 0;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException();
            }
            f(2);
        }
    }

    public void k() {
        this.f11295b.j();
        this.f11301h = -9223372036854775807L;
        this.f11299f = -9223372036854775807L;
        f(1);
        this.f11302i = -9223372036854775807L;
    }

    public void l(int i11) {
        this.f11295b.o(i11);
    }

    public void m(s7.j jVar) {
        this.f11305l = jVar;
    }

    public void n(float f11) {
        this.f11295b.g(f11);
    }

    public void o(Surface surface) {
        this.f11306m = surface != null;
        this.f11307n = false;
        this.f11295b.m(surface);
        f(1);
    }

    public void p(float f11) {
        s7.a.a(f11 > BitmapDescriptorFactory.HUE_RED);
        if (f11 == this.f11304k) {
            return;
        }
        this.f11304k = f11;
        this.f11295b.i(f11);
    }
}
