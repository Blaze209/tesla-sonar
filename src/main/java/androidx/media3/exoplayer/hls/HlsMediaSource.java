package androidx.media3.exoplayer.hls;

import android.os.Looper;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.source.t;
import java.util.List;
import java.util.Objects;
import n8.u;
import p7.d0;
import p7.m0;
import p7.y;
import s7.q0;
import v7.q;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMediaSource extends androidx.media3.exoplayer.source.a implements HlsPlaylistTracker.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f8.e f9906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f8.d f9907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n8.e f9908j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final s8.e f9909k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.i f9910l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f9911m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f9912n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f9913o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f9914p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final HlsPlaylistTracker f9915q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f9916r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f9917s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private y.g f9918t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private q f9919u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private y f9920v;

    public static final class Factory implements t {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final /* synthetic */ int f9921s = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f8.d f9922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f8.e f9923d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private t9.q.a f9924e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f9925f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f9926g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private g8.f f9927h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private HlsPlaylistTracker.a f9928i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private n8.e f9929j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private s8.e.a f9930k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private e8.k f9931l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f9932m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f9933n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f9934o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f9935p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f9936q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private long f9937r;

        public Factory(androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a) {
            this(new f8.b(interfaceC0192a));
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource g(y yVar) {
            s7.a.f(yVar.f101682b);
            if (this.f9923d == null) {
                this.f9923d = new f8.c();
            }
            t9.q.a aVar = this.f9924e;
            if (aVar != null) {
                this.f9923d.a(aVar);
            }
            this.f9923d.b(this.f9925f);
            this.f9923d.c(this.f9926g);
            f8.e eVar = this.f9923d;
            g8.f cVar = this.f9927h;
            List<m0> list = yVar.f101682b.f101787e;
            if (!list.isEmpty()) {
                cVar = new g8.c(cVar, list);
            }
            s8.e.a aVar2 = this.f9930k;
            s8.e eVarA = aVar2 == null ? null : aVar2.a(yVar);
            f8.d dVar = this.f9922c;
            n8.e eVar2 = this.f9929j;
            androidx.media3.exoplayer.drm.i iVarA = this.f9931l.a(yVar);
            androidx.media3.exoplayer.upstream.b bVar = this.f9932m;
            return new HlsMediaSource(yVar, dVar, eVar, eVar2, eVarA, iVarA, bVar, this.f9928i.a(this.f9922c, bVar, cVar, eVarA), this.f9936q, this.f9933n, this.f9934o, this.f9935p, this.f9937r);
        }

        @Override // androidx.media3.exoplayer.source.r.a
        @Deprecated
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory b(boolean z11) {
            this.f9925f = z11;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory c(int i11) {
            this.f9926g = i11;
            return this;
        }

        public Factory k(boolean z11) {
            this.f9933n = z11;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Factory e(s8.e.a aVar) {
            this.f9930k = (s8.e.a) s7.a.f(aVar);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Factory d(e8.k kVar) {
            this.f9931l = (e8.k) s7.a.g(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Factory f(androidx.media3.exoplayer.upstream.b bVar) {
            this.f9932m = (androidx.media3.exoplayer.upstream.b) s7.a.g(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Factory a(t9.q.a aVar) {
            this.f9924e = aVar;
            return this;
        }

        public Factory(f8.d dVar) {
            this.f9922c = (f8.d) s7.a.f(dVar);
            this.f9931l = new androidx.media3.exoplayer.drm.g();
            this.f9927h = new g8.a();
            this.f9928i = androidx.media3.exoplayer.hls.playlist.a.f10118q;
            this.f9932m = new androidx.media3.exoplayer.upstream.a();
            this.f9929j = new n8.f();
            this.f9934o = 1;
            this.f9936q = -9223372036854775807L;
            this.f9933n = true;
            b(true);
        }
    }

    static {
        d0.a("media3.exoplayer.hls");
    }

    private u H(androidx.media3.exoplayer.hls.playlist.c cVar, long j11, long j12, d dVar) {
        long jA = cVar.f10154h - this.f9915q.a();
        long j13 = cVar.f10161o ? jA + cVar.f10167u : -9223372036854775807L;
        long jL = L(cVar);
        long j14 = this.f9918t.f101765a;
        O(cVar, q0.s(j14 != -9223372036854775807L ? q0.b1(j14) : N(cVar, jL), jL, cVar.f10167u + jL));
        return new u(j11, j12, -9223372036854775807L, j13, cVar.f10167u, jA, M(cVar, jL), true, !cVar.f10161o, cVar.f10150d == 2 && cVar.f10152f, dVar, a(), this.f9918t);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    private u I(androidx.media3.exoplayer.hls.playlist.c cVar, long j11, long j12, d dVar) {
        long j13;
        if (cVar.f10151e == -9223372036854775807L || cVar.f10164r.isEmpty()) {
            j13 = 0;
        } else if (cVar.f10153g) {
            j13 = cVar.f10151e;
        } else {
            long j14 = cVar.f10151e;
            if (j14 == cVar.f10167u) {
                j13 = cVar.f10151e;
            } else {
                j13 = K(cVar.f10164r, j14).f10219e;
            }
        }
        long j15 = j13;
        long j16 = cVar.f10167u;
        return new u(j11, j12, -9223372036854775807L, j16, j16, 0L, j15, true, false, true, dVar, a(), null);
    }

    private static androidx.media3.exoplayer.hls.playlist.c.d J(List<androidx.media3.exoplayer.hls.playlist.c.d> list, long j11) {
        androidx.media3.exoplayer.hls.playlist.c.d dVar = null;
        for (int i11 = 0; i11 < list.size(); i11++) {
            androidx.media3.exoplayer.hls.playlist.c.d dVar2 = list.get(i11);
            long j12 = dVar2.f10219e;
            if (j12 > j11 || !dVar2.f10208l) {
                if (j12 > j11) {
                    break;
                }
            } else {
                dVar = dVar2;
            }
        }
        return dVar;
    }

    private static androidx.media3.exoplayer.hls.playlist.c.f K(List<androidx.media3.exoplayer.hls.playlist.c.f> list, long j11) {
        return list.get(q0.h(list, Long.valueOf(j11), true, true));
    }

    private long L(androidx.media3.exoplayer.hls.playlist.c cVar) {
        if (cVar.f10162p) {
            return q0.b1(q0.p0(this.f9916r)) - cVar.e();
        }
        return 0L;
    }

    private long M(androidx.media3.exoplayer.hls.playlist.c cVar, long j11) {
        long jB1 = cVar.f10151e;
        if (jB1 == -9223372036854775807L) {
            jB1 = (cVar.f10167u + j11) - q0.b1(this.f9918t.f101765a);
        }
        if (cVar.f10153g) {
            return jB1;
        }
        androidx.media3.exoplayer.hls.playlist.c.d dVarJ = J(cVar.f10165s, jB1);
        if (dVarJ != null) {
            return dVarJ.f10219e;
        }
        if (cVar.f10164r.isEmpty()) {
            return 0L;
        }
        androidx.media3.exoplayer.hls.playlist.c.f fVarK = K(cVar.f10164r, jB1);
        androidx.media3.exoplayer.hls.playlist.c.d dVarJ2 = J(fVarK.f10214m, jB1);
        return dVarJ2 != null ? dVarJ2.f10219e : fVarK.f10219e;
    }

    private static long N(androidx.media3.exoplayer.hls.playlist.c cVar, long j11) {
        long j12;
        androidx.media3.exoplayer.hls.playlist.c.h hVar = cVar.f10168v;
        long j13 = cVar.f10151e;
        if (j13 != -9223372036854775807L) {
            j12 = cVar.f10167u - j13;
        } else {
            long j14 = hVar.f10229d;
            if (j14 == -9223372036854775807L || cVar.f10160n == -9223372036854775807L) {
                long j15 = hVar.f10228c;
                j12 = j15 != -9223372036854775807L ? j15 : cVar.f10159m * 3;
            } else {
                j12 = j14;
            }
        }
        return j12 + j11;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    private void O(androidx.media3.exoplayer.hls.playlist.c cVar, long j11) {
        boolean z11;
        y.g gVar = a().f101684d;
        if (gVar.f101768d == -3.4028235E38f && gVar.f101769e == -3.4028235E38f) {
            androidx.media3.exoplayer.hls.playlist.c.h hVar = cVar.f10168v;
            if (hVar.f10228c == -9223372036854775807L && hVar.f10229d == -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        this.f9918t = new y.g.a().k(q0.O1(j11)).j(z11 ? 1.0f : this.f9918t.f101768d).h(z11 ? 1.0f : this.f9918t.f101769e).f();
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void E(q qVar) {
        this.f9919u = qVar;
        this.f9910l.f((Looper) s7.a.f(Looper.myLooper()), C());
        this.f9910l.b();
        this.f9915q.d(((y.h) s7.a.f(a().f101682b)).f101783a, z(null), this);
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void G() {
        this.f9915q.stop();
        this.f9910l.release();
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized y a() {
        return this.f9920v;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void b() {
        this.f9915q.l();
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(androidx.media3.exoplayer.source.q qVar) {
        ((g) qVar).D();
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized void i(y yVar) {
        this.f9920v = yVar;
    }

    @Override // androidx.media3.exoplayer.source.r
    public boolean k(y yVar) {
        y yVarA = a();
        y.h hVar = (y.h) s7.a.f(yVarA.f101682b);
        y.h hVar2 = yVar.f101682b;
        return hVar2 != null && hVar2.f101783a.equals(hVar.f101783a) && hVar2.f101787e.equals(hVar.f101787e) && Objects.equals(hVar2.f101785c, hVar.f101785c) && yVarA.f101684d.equals(yVar.f101684d);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.c
    public void m(androidx.media3.exoplayer.hls.playlist.c cVar) {
        long jO1 = cVar.f10162p ? q0.O1(cVar.f10154h) : -9223372036854775807L;
        int i11 = cVar.f10150d;
        long j11 = (i11 == 2 || i11 == 1) ? jO1 : -9223372036854775807L;
        d dVar = new d((androidx.media3.exoplayer.hls.playlist.d) s7.a.f(this.f9915q.g()), cVar);
        F(this.f9915q.j() ? H(cVar, j11, jO1, dVar) : I(cVar, j11, jO1, dVar));
    }

    @Override // androidx.media3.exoplayer.source.r
    public androidx.media3.exoplayer.source.q r(r.b bVar, s8.b bVar2, long j11) {
        s.a aVarZ = z(bVar);
        return new g(this.f9906h, this.f9915q, this.f9907i, this.f9919u, this.f9909k, this.f9910l, x(bVar), this.f9911m, aVarZ, bVar2, this.f9908j, this.f9912n, this.f9913o, this.f9914p, C(), this.f9917s);
    }

    private HlsMediaSource(y yVar, f8.d dVar, f8.e eVar, n8.e eVar2, s8.e eVar3, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.upstream.b bVar, HlsPlaylistTracker hlsPlaylistTracker, long j11, boolean z11, int i11, boolean z12, long j12) {
        this.f9920v = yVar;
        this.f9918t = yVar.f101684d;
        this.f9907i = dVar;
        this.f9906h = eVar;
        this.f9908j = eVar2;
        this.f9909k = eVar3;
        this.f9910l = iVar;
        this.f9911m = bVar;
        this.f9915q = hlsPlaylistTracker;
        this.f9916r = j11;
        this.f9912n = z11;
        this.f9913o = i11;
        this.f9914p = z12;
        this.f9917s = j12;
    }
}
