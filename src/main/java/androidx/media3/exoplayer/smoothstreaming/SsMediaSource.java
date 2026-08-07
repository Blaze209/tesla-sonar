package androidx.media3.exoplayer.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.drm.g;
import androidx.media3.exoplayer.drm.i;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.source.t;
import androidx.media3.exoplayer.upstream.Loader;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import n8.e;
import n8.f;
import n8.u;
import p7.d0;
import p7.m0;
import p7.y;
import s7.q0;
import s8.k;
import v7.j;
import v7.q;

/* JADX INFO: loaded from: classes3.dex */
public final class SsMediaSource extends androidx.media3.exoplayer.source.a implements Loader.b<androidx.media3.exoplayer.upstream.c<androidx.media3.exoplayer.smoothstreaming.manifest.a>> {
    private y A;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f10672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Uri f10673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media3.datasource.a.InterfaceC0192a f10674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b.a f10675k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final e f10676l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final s8.e f10677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final i f10678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f10679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f10680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final s.a f10681q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.c.a<? extends androidx.media3.exoplayer.smoothstreaming.manifest.a> f10682r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList<d> f10683s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private androidx.media3.datasource.a f10684t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Loader f10685u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private k f10686v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private q f10687w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f10688x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private androidx.media3.exoplayer.smoothstreaming.manifest.a f10689y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Handler f10690z;

    public static final class Factory implements t {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int f10691k = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b.a f10692c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.media3.datasource.a.InterfaceC0192a f10693d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e f10694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private s8.e.a f10695f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private e8.k f10696g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f10697h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f10698i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.c.a<? extends androidx.media3.exoplayer.smoothstreaming.manifest.a> f10699j;

        public Factory(androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a) {
            this(new androidx.media3.exoplayer.smoothstreaming.a.C0202a(interfaceC0192a), interfaceC0192a);
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public SsMediaSource g(y yVar) {
            s7.a.f(yVar.f101682b);
            androidx.media3.exoplayer.upstream.c.a ssManifestParser = this.f10699j;
            if (ssManifestParser == null) {
                ssManifestParser = new SsManifestParser();
            }
            List<m0> list = yVar.f101682b.f101787e;
            androidx.media3.exoplayer.upstream.c.a bVar = !list.isEmpty() ? new l8.b(ssManifestParser, list) : ssManifestParser;
            s8.e.a aVar = this.f10695f;
            return new SsMediaSource(yVar, null, this.f10693d, bVar, this.f10692c, this.f10694e, aVar == null ? null : aVar.a(yVar), this.f10696g.a(yVar), this.f10697h, this.f10698i);
        }

        @Override // androidx.media3.exoplayer.source.r.a
        @Deprecated
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory b(boolean z11) {
            this.f10692c.b(z11);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory e(s8.e.a aVar) {
            this.f10695f = (s8.e.a) s7.a.f(aVar);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Factory d(e8.k kVar) {
            this.f10696g = (e8.k) s7.a.g(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Factory f(androidx.media3.exoplayer.upstream.b bVar) {
            this.f10697h = (androidx.media3.exoplayer.upstream.b) s7.a.g(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Factory a(t9.q.a aVar) {
            this.f10692c.a((t9.q.a) s7.a.f(aVar));
            return this;
        }

        public Factory(b.a aVar, androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a) {
            this.f10692c = (b.a) s7.a.f(aVar);
            this.f10693d = interfaceC0192a;
            this.f10696g = new g();
            this.f10697h = new androidx.media3.exoplayer.upstream.a();
            this.f10698i = 30000L;
            this.f10694e = new f();
            b(true);
        }
    }

    static {
        d0.a("media3.exoplayer.smoothstreaming");
    }

    private void M() {
        u uVar;
        for (int i11 = 0; i11 < this.f10683s.size(); i11++) {
            this.f10683s.get(i11).x(this.f10689y);
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (androidx.media3.exoplayer.smoothstreaming.manifest.a.b bVar : this.f10689y.f10767f) {
            if (bVar.f10783k > 0) {
                jMax2 = Math.min(jMax2, bVar.e(0));
                jMax = Math.max(jMax, bVar.e(bVar.f10783k - 1) + bVar.c(bVar.f10783k - 1));
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j11 = this.f10689y.f10765d ? -9223372036854775807L : 0L;
            androidx.media3.exoplayer.smoothstreaming.manifest.a aVar = this.f10689y;
            boolean z11 = aVar.f10765d;
            uVar = new u(j11, 0L, 0L, 0L, true, z11, z11, aVar, a());
        } else {
            androidx.media3.exoplayer.smoothstreaming.manifest.a aVar2 = this.f10689y;
            if (aVar2.f10765d) {
                long j12 = aVar2.f10769h;
                if (j12 != -9223372036854775807L && j12 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j12);
                }
                long j13 = jMax2;
                long j14 = jMax - j13;
                long jB1 = j14 - q0.b1(this.f10680p);
                if (jB1 < 5000000) {
                    jB1 = Math.min(5000000L, j14 / 2);
                }
                uVar = new u(-9223372036854775807L, j14, j13, jB1, true, true, true, this.f10689y, a());
            } else {
                long j15 = aVar2.f10768g;
                if (j15 == -9223372036854775807L) {
                    j15 = jMax - jMax2;
                }
                long j16 = j15;
                uVar = new u(jMax2 + j16, j16, jMax2, 0L, true, false, false, this.f10689y, a());
            }
        }
        F(uVar);
    }

    private void N() {
        if (this.f10689y.f10765d) {
            this.f10690z.postDelayed(new Runnable() { // from class: m8.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f91567a.O();
                }
            }, Math.max(0L, (this.f10688x + DeviceOrientationRequest.OUTPUT_PERIOD_FAST) - SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        if (this.f10685u.i()) {
            return;
        }
        j jVarA = new j.b().i(this.f10673i).b(1).a();
        if (this.f10677m != null) {
            s8.f.C2354f c2354fL = new s8.f.C2354f(this.f10677m, "s").l("m");
            androidx.media3.exoplayer.smoothstreaming.manifest.a aVar = this.f10689y;
            if (aVar != null) {
                c2354fL.i(aVar.f10765d);
            }
            jVarA = c2354fL.a().a(jVarA);
        }
        androidx.media3.exoplayer.upstream.c cVar = new androidx.media3.exoplayer.upstream.c(this.f10684t, jVarA, 4, this.f10682r);
        this.f10685u.n(cVar, this, this.f10679o.b(cVar.f11168c));
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void E(q qVar) {
        this.f10687w = qVar;
        this.f10678n.f(Looper.myLooper(), C());
        this.f10678n.b();
        if (this.f10672h) {
            this.f10686v = new k.a();
            M();
            return;
        }
        this.f10684t = this.f10674j.a();
        Loader loader = new Loader("SsMediaSource");
        this.f10685u = loader;
        this.f10686v = loader;
        this.f10690z = q0.C();
        O();
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void G() {
        this.f10689y = this.f10672h ? this.f10689y : null;
        this.f10684t = null;
        this.f10688x = 0L;
        Loader loader = this.f10685u;
        if (loader != null) {
            loader.l();
            this.f10685u = null;
        }
        Handler handler = this.f10690z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f10690z = null;
        }
        this.f10678n.release();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(androidx.media3.exoplayer.upstream.c<androidx.media3.exoplayer.smoothstreaming.manifest.a> cVar, long j11, long j12, boolean z11) {
        n8.i iVar = new n8.i(cVar.f11166a, cVar.f11167b, cVar.f(), cVar.d(), j11, j12, cVar.c());
        this.f10679o.a(cVar.f11166a);
        this.f10681q.l(iVar, cVar.f11168c);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void v(androidx.media3.exoplayer.upstream.c<androidx.media3.exoplayer.smoothstreaming.manifest.a> cVar, long j11, long j12) {
        n8.i iVar = new n8.i(cVar.f11166a, cVar.f11167b, cVar.f(), cVar.d(), j11, j12, cVar.c());
        this.f10679o.a(cVar.f11166a);
        this.f10681q.o(iVar, cVar.f11168c);
        this.f10689y = cVar.e();
        this.f10688x = j11 - j12;
        M();
        N();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public Loader.c p(androidx.media3.exoplayer.upstream.c<androidx.media3.exoplayer.smoothstreaming.manifest.a> cVar, long j11, long j12, IOException iOException, int i11) {
        n8.i iVar = new n8.i(cVar.f11166a, cVar.f11167b, cVar.f(), cVar.d(), j11, j12, cVar.c());
        long jD = this.f10679o.d(new androidx.media3.exoplayer.upstream.b.c(iVar, new n8.j(cVar.f11168c), iOException, i11));
        Loader.c cVarH = jD == -9223372036854775807L ? Loader.f11138g : Loader.h(false, jD);
        boolean zC = cVarH.c();
        this.f10681q.s(iVar, cVar.f11168c, iOException, !zC);
        if (!zC) {
            this.f10679o.a(cVar.f11166a);
        }
        return cVarH;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void q(androidx.media3.exoplayer.upstream.c<androidx.media3.exoplayer.smoothstreaming.manifest.a> cVar, long j11, long j12, int i11) {
        this.f10681q.u(i11 == 0 ? new n8.i(cVar.f11166a, cVar.f11167b, j11) : new n8.i(cVar.f11166a, cVar.f11167b, cVar.f(), cVar.d(), j11, j12, cVar.c()), cVar.f11168c, i11);
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized y a() {
        return this.A;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void b() {
        this.f10686v.a();
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(androidx.media3.exoplayer.source.q qVar) {
        ((d) qVar).w();
        this.f10683s.remove(qVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized void i(y yVar) {
        this.A = yVar;
    }

    @Override // androidx.media3.exoplayer.source.r
    public boolean k(y yVar) {
        y.h hVar = (y.h) s7.a.f(a().f101682b);
        y.h hVar2 = yVar.f101682b;
        return hVar2 != null && hVar2.f101783a.equals(hVar.f101783a) && hVar2.f101787e.equals(hVar.f101787e) && Objects.equals(hVar2.f101785c, hVar.f101785c);
    }

    @Override // androidx.media3.exoplayer.source.r
    public androidx.media3.exoplayer.source.q r(r.b bVar, s8.b bVar2, long j11) {
        s.a aVarZ = z(bVar);
        d dVar = new d(this.f10689y, this.f10675k, this.f10687w, this.f10676l, this.f10677m, this.f10678n, x(bVar), this.f10679o, aVarZ, this.f10686v, bVar2);
        this.f10683s.add(dVar);
        return dVar;
    }

    private SsMediaSource(y yVar, androidx.media3.exoplayer.smoothstreaming.manifest.a aVar, androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a, androidx.media3.exoplayer.upstream.c.a<? extends androidx.media3.exoplayer.smoothstreaming.manifest.a> aVar2, b.a aVar3, e eVar, s8.e eVar2, i iVar, androidx.media3.exoplayer.upstream.b bVar, long j11) {
        s7.a.h(aVar == null || !aVar.f10765d);
        this.A = yVar;
        y.h hVar = (y.h) s7.a.f(yVar.f101682b);
        this.f10689y = aVar;
        this.f10673i = hVar.f101783a.equals(Uri.EMPTY) ? null : q0.I(hVar.f101783a);
        this.f10674j = interfaceC0192a;
        this.f10682r = aVar2;
        this.f10675k = aVar3;
        this.f10676l = eVar;
        this.f10677m = eVar2;
        this.f10678n = iVar;
        this.f10679o = bVar;
        this.f10680p = j11;
        this.f10681q = z(null);
        this.f10672h = aVar != null;
        this.f10683s = new ArrayList<>();
    }
}
