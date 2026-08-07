package androidx.media3.exoplayer;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class i2 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final androidx.media3.exoplayer.source.r.b f10282u = new androidx.media3.exoplayer.source.r.b(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7.r0 f10283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.r.b f10284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExoPlaybackException f10288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n8.y f10290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r8.b0 f10291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<p7.f0> f10292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.r.b f10293k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10296n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p7.i0 f10297o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f10298p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f10299q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f10300r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f10301s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile long f10302t;

    public i2(p7.r0 r0Var, androidx.media3.exoplayer.source.r.b bVar, long j11, long j12, int i11, ExoPlaybackException exoPlaybackException, boolean z11, n8.y yVar, r8.b0 b0Var, List<p7.f0> list, androidx.media3.exoplayer.source.r.b bVar2, boolean z12, int i12, int i13, p7.i0 i0Var, long j13, long j14, long j15, long j16, boolean z13) {
        this.f10283a = r0Var;
        this.f10284b = bVar;
        this.f10285c = j11;
        this.f10286d = j12;
        this.f10287e = i11;
        this.f10288f = exoPlaybackException;
        this.f10289g = z11;
        this.f10290h = yVar;
        this.f10291i = b0Var;
        this.f10292j = list;
        this.f10293k = bVar2;
        this.f10294l = z12;
        this.f10295m = i12;
        this.f10296n = i13;
        this.f10297o = i0Var;
        this.f10299q = j13;
        this.f10300r = j14;
        this.f10301s = j15;
        this.f10302t = j16;
        this.f10298p = z13;
    }

    public static i2 k(r8.b0 b0Var) {
        p7.r0 r0Var = p7.r0.f101451a;
        androidx.media3.exoplayer.source.r.b bVar = f10282u;
        return new i2(r0Var, bVar, -9223372036854775807L, 0L, 1, null, false, n8.y.f93613d, b0Var, com.google.common.collect.x.r(), bVar, false, 1, 0, p7.i0.f101376d, 0L, 0L, 0L, 0L, false);
    }

    public static androidx.media3.exoplayer.source.r.b l() {
        return f10282u;
    }

    public i2 a() {
        return new i2(this.f10283a, this.f10284b, this.f10285c, this.f10286d, this.f10287e, this.f10288f, this.f10289g, this.f10290h, this.f10291i, this.f10292j, this.f10293k, this.f10294l, this.f10295m, this.f10296n, this.f10297o, this.f10299q, this.f10300r, m(), SystemClock.elapsedRealtime(), this.f10298p);
    }

    public i2 b(boolean z11) {
        return new i2(this.f10283a, this.f10284b, this.f10285c, this.f10286d, this.f10287e, this.f10288f, z11, this.f10290h, this.f10291i, this.f10292j, this.f10293k, this.f10294l, this.f10295m, this.f10296n, this.f10297o, this.f10299q, this.f10300r, this.f10301s, this.f10302t, this.f10298p);
    }

    public i2 c(androidx.media3.exoplayer.source.r.b bVar) {
        return new i2(this.f10283a, this.f10284b, this.f10285c, this.f10286d, this.f10287e, this.f10288f, this.f10289g, this.f10290h, this.f10291i, this.f10292j, bVar, this.f10294l, this.f10295m, this.f10296n, this.f10297o, this.f10299q, this.f10300r, this.f10301s, this.f10302t, this.f10298p);
    }

    public i2 d(androidx.media3.exoplayer.source.r.b bVar, long j11, long j12, long j13, long j14, n8.y yVar, r8.b0 b0Var, List<p7.f0> list) {
        return new i2(this.f10283a, bVar, j12, j13, this.f10287e, this.f10288f, this.f10289g, yVar, b0Var, list, this.f10293k, this.f10294l, this.f10295m, this.f10296n, this.f10297o, this.f10299q, j14, j11, SystemClock.elapsedRealtime(), this.f10298p);
    }

    public i2 e(boolean z11, int i11, int i12) {
        return new i2(this.f10283a, this.f10284b, this.f10285c, this.f10286d, this.f10287e, this.f10288f, this.f10289g, this.f10290h, this.f10291i, this.f10292j, this.f10293k, z11, i11, i12, this.f10297o, this.f10299q, this.f10300r, this.f10301s, this.f10302t, this.f10298p);
    }

    public i2 f(ExoPlaybackException exoPlaybackException) {
        return new i2(this.f10283a, this.f10284b, this.f10285c, this.f10286d, this.f10287e, exoPlaybackException, this.f10289g, this.f10290h, this.f10291i, this.f10292j, this.f10293k, this.f10294l, this.f10295m, this.f10296n, this.f10297o, this.f10299q, this.f10300r, this.f10301s, this.f10302t, this.f10298p);
    }

    public i2 g(p7.i0 i0Var) {
        return new i2(this.f10283a, this.f10284b, this.f10285c, this.f10286d, this.f10287e, this.f10288f, this.f10289g, this.f10290h, this.f10291i, this.f10292j, this.f10293k, this.f10294l, this.f10295m, this.f10296n, i0Var, this.f10299q, this.f10300r, this.f10301s, this.f10302t, this.f10298p);
    }

    public i2 h(int i11) {
        return new i2(this.f10283a, this.f10284b, this.f10285c, this.f10286d, i11, this.f10288f, this.f10289g, this.f10290h, this.f10291i, this.f10292j, this.f10293k, this.f10294l, this.f10295m, this.f10296n, this.f10297o, this.f10299q, this.f10300r, this.f10301s, this.f10302t, this.f10298p);
    }

    public i2 i(boolean z11) {
        return new i2(this.f10283a, this.f10284b, this.f10285c, this.f10286d, this.f10287e, this.f10288f, this.f10289g, this.f10290h, this.f10291i, this.f10292j, this.f10293k, this.f10294l, this.f10295m, this.f10296n, this.f10297o, this.f10299q, this.f10300r, this.f10301s, this.f10302t, z11);
    }

    public i2 j(p7.r0 r0Var) {
        return new i2(r0Var, this.f10284b, this.f10285c, this.f10286d, this.f10287e, this.f10288f, this.f10289g, this.f10290h, this.f10291i, this.f10292j, this.f10293k, this.f10294l, this.f10295m, this.f10296n, this.f10297o, this.f10299q, this.f10300r, this.f10301s, this.f10302t, this.f10298p);
    }

    public long m() {
        long j11;
        long j12;
        if (!n()) {
            return this.f10301s;
        }
        do {
            j11 = this.f10302t;
            j12 = this.f10301s;
        } while (j11 != this.f10302t);
        return s7.q0.b1(s7.q0.O1(j12) + ((long) ((SystemClock.elapsedRealtime() - j11) * this.f10297o.f101379a)));
    }

    public boolean n() {
        return this.f10287e == 3 && this.f10294l && this.f10296n == 0;
    }

    public void o(long j11) {
        this.f10301s = j11;
        this.f10302t = SystemClock.elapsedRealtime();
    }
}
