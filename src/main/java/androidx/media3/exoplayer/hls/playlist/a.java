package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.upstream.Loader;
import com.google.common.collect.c0;
import g8.e;
import g8.f;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n8.i;
import s7.q0;
import v7.j;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements HlsPlaylistTracker, Loader.b<androidx.media3.exoplayer.upstream.c<e>> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final HlsPlaylistTracker.a f10118q = new HlsPlaylistTracker.a() { // from class: g8.b
        @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.a
        public final HlsPlaylistTracker a(f8.d dVar, androidx.media3.exoplayer.upstream.b bVar, f fVar, s8.e eVar) {
            return new androidx.media3.exoplayer.hls.playlist.a(dVar, bVar, fVar, eVar);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f8.d f10119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f10120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f10121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<Uri, c> f10122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList<HlsPlaylistTracker.b> f10123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f10124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s8.e f10125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s.a f10126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Loader f10127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f10128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private HlsPlaylistTracker.c f10129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d f10130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Uri f10131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private androidx.media3.exoplayer.hls.playlist.c f10132n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f10133o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f10134p;

    private class b implements HlsPlaylistTracker.b {
        private b() {
        }

        @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.b
        public void a() {
            a.this.f10123e.remove(this);
        }

        @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.b
        public boolean b(Uri uri, androidx.media3.exoplayer.upstream.b.c cVar, boolean z11) {
            c cVar2;
            if (a.this.f10132n == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                List<d.b> list = ((d) q0.l(a.this.f10130l)).f10233e;
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    c cVar3 = (c) a.this.f10122d.get(list.get(i12).f10246a);
                    if (cVar3 != null && jElapsedRealtime < cVar3.f10143h) {
                        i11++;
                    }
                }
                androidx.media3.exoplayer.upstream.b.C0205b c0205bC = a.this.f10121c.c(new androidx.media3.exoplayer.upstream.b.a(1, 0, a.this.f10130l.f10233e.size(), i11), cVar);
                if (c0205bC != null && c0205bC.f11160a == 2 && (cVar2 = (c) a.this.f10122d.get(uri)) != null) {
                    cVar2.h(c0205bC.f11161b);
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements Loader.b<androidx.media3.exoplayer.upstream.c<e>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f10136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Loader f10137b = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.media3.datasource.a f10138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.media3.exoplayer.hls.playlist.c f10139d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f10140e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f10141f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f10142g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f10143h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f10144i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private IOException f10145j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f10146k;

        public c(Uri uri) {
            this.f10136a = uri;
            this.f10138c = a.this.f10119a.a(4);
        }

        public static /* synthetic */ void a(c cVar, Uri uri) {
            cVar.f10144i = false;
            cVar.n(uri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h(long j11) {
            this.f10143h = SystemClock.elapsedRealtime() + j11;
            return this.f10136a.equals(a.this.f10131m) && !a.this.P();
        }

        private Uri i() {
            androidx.media3.exoplayer.hls.playlist.c cVar = this.f10139d;
            if (cVar != null) {
                androidx.media3.exoplayer.hls.playlist.c.h hVar = cVar.f10168v;
                if (hVar.f10226a != -9223372036854775807L || hVar.f10230e) {
                    Uri.Builder builderBuildUpon = this.f10136a.buildUpon();
                    androidx.media3.exoplayer.hls.playlist.c cVar2 = this.f10139d;
                    if (cVar2.f10168v.f10230e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar2.f10157k + ((long) cVar2.f10164r.size())));
                        androidx.media3.exoplayer.hls.playlist.c cVar3 = this.f10139d;
                        if (cVar3.f10160n != -9223372036854775807L) {
                            List<androidx.media3.exoplayer.hls.playlist.c.d> list = cVar3.f10165s;
                            int size = list.size();
                            if (!list.isEmpty() && ((androidx.media3.exoplayer.hls.playlist.c.d) c0.d(list)).f10209m) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    androidx.media3.exoplayer.hls.playlist.c.h hVar2 = this.f10139d.f10168v;
                    if (hVar2.f10226a != -9223372036854775807L) {
                        builderBuildUpon.appendQueryParameter("_HLS_skip", hVar2.f10227b ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return this.f10136a;
        }

        private void n(Uri uri) {
            androidx.media3.exoplayer.upstream.c.a<e> aVarB = a.this.f10120b.b(a.this.f10130l, this.f10139d);
            j jVarA = new j.b().i(uri).b(1).a();
            if (a.this.f10125g != null) {
                s8.f.C2354f c2354fL = new s8.f.C2354f(a.this.f10125g, "h").l("m");
                if (a.this.f10132n != null) {
                    c2354fL.i(true ^ a.this.f10132n.f10161o);
                }
                jVarA = c2354fL.a().a(jVarA);
            }
            androidx.media3.exoplayer.upstream.c cVar = new androidx.media3.exoplayer.upstream.c(this.f10138c, jVarA, 4, aVarB);
            this.f10137b.n(cVar, this, a.this.f10121c.b(cVar.f11168c));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(final Uri uri) {
            this.f10143h = 0L;
            if (this.f10144i || this.f10137b.j() || this.f10137b.i()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= this.f10142g) {
                n(uri);
            } else {
                this.f10144i = true;
                a.this.f10128j.postDelayed(new Runnable() { // from class: androidx.media3.exoplayer.hls.playlist.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.c.a(this.f10148a, uri);
                    }
                }, this.f10142g - jElapsedRealtime);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y(androidx.media3.exoplayer.hls.playlist.c cVar, i iVar) {
            boolean z11;
            long j11;
            androidx.media3.exoplayer.hls.playlist.c cVar2 = this.f10139d;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f10140e = jElapsedRealtime;
            androidx.media3.exoplayer.hls.playlist.c cVarJ = a.this.J(cVar2, cVar);
            this.f10139d = cVarJ;
            IOException playlistStuckException = null;
            if (cVarJ != cVar2) {
                this.f10145j = null;
                this.f10141f = jElapsedRealtime;
                a.this.W(this.f10136a, cVarJ);
            } else if (!cVarJ.f10161o) {
                long size = cVar.f10157k + ((long) cVar.f10164r.size());
                androidx.media3.exoplayer.hls.playlist.c cVar3 = this.f10139d;
                if (size < cVar3.f10157k) {
                    playlistStuckException = new HlsPlaylistTracker.PlaylistResetException(this.f10136a);
                    z11 = true;
                } else {
                    z11 = false;
                    if (jElapsedRealtime - this.f10141f > q0.O1(cVar3.f10159m) * a.this.f10124f) {
                        playlistStuckException = new HlsPlaylistTracker.PlaylistStuckException(this.f10136a);
                    }
                }
                if (playlistStuckException != null) {
                    this.f10145j = playlistStuckException;
                    a.this.R(this.f10136a, new androidx.media3.exoplayer.upstream.b.c(iVar, new n8.j(4), playlistStuckException, 1), z11);
                }
            }
            androidx.media3.exoplayer.hls.playlist.c cVar4 = this.f10139d;
            if (!cVar4.f10168v.f10230e) {
                j11 = cVar4 != cVar2 ? cVar4.f10159m : cVar4.f10159m / 2;
            } else if (cVar4 == cVar2) {
                long j12 = cVar4.f10160n;
                j11 = j12 != -9223372036854775807L ? j12 / 2 : cVar4.f10159m / 2;
            } else {
                j11 = 0;
            }
            this.f10142g = (jElapsedRealtime + q0.O1(j11)) - iVar.f93562f;
            if (this.f10139d.f10161o) {
                return;
            }
            if (this.f10136a.equals(a.this.f10131m) || this.f10146k) {
                o(i());
            }
        }

        public void A(boolean z11) {
            this.f10146k = z11;
        }

        public androidx.media3.exoplayer.hls.playlist.c j() {
            return this.f10139d;
        }

        public boolean k() {
            return this.f10146k;
        }

        public boolean l() {
            int i11;
            if (this.f10139d == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(30000L, q0.O1(this.f10139d.f10167u));
            androidx.media3.exoplayer.hls.playlist.c cVar = this.f10139d;
            return cVar.f10161o || (i11 = cVar.f10150d) == 2 || i11 == 1 || this.f10140e + jMax > jElapsedRealtime;
        }

        public void m(boolean z11) {
            o(z11 ? i() : this.f10136a);
        }

        public void r() throws IOException {
            this.f10137b.a();
            IOException iOException = this.f10145j;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void s(androidx.media3.exoplayer.upstream.c<e> cVar, long j11, long j12, boolean z11) {
            i iVar = new i(cVar.f11166a, cVar.f11167b, cVar.f(), cVar.d(), j11, j12, cVar.c());
            a.this.f10121c.a(cVar.f11166a);
            a.this.f10126h.l(iVar, 4);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public void v(androidx.media3.exoplayer.upstream.c<e> cVar, long j11, long j12) {
            e eVarE = cVar.e();
            i iVar = new i(cVar.f11166a, cVar.f11167b, cVar.f(), cVar.d(), j11, j12, cVar.c());
            if (eVarE instanceof androidx.media3.exoplayer.hls.playlist.c) {
                y((androidx.media3.exoplayer.hls.playlist.c) eVarE, iVar);
                a.this.f10126h.o(iVar, 4);
            } else {
                this.f10145j = ParserException.c("Loaded playlist has unexpected type.", null);
                a.this.f10126h.s(iVar, 4, this.f10145j, true);
            }
            a.this.f10121c.a(cVar.f11166a);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public Loader.c p(androidx.media3.exoplayer.upstream.c<e> cVar, long j11, long j12, IOException iOException, int i11) {
            Loader.c cVarH;
            i iVar = new i(cVar.f11166a, cVar.f11167b, cVar.f(), cVar.d(), j11, j12, cVar.c());
            boolean z11 = iOException instanceof HlsPlaylistParser.DeltaUpdateException;
            if ((cVar.f().getQueryParameter("_HLS_msn") != null) || z11) {
                int i12 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).f9128d : Integer.MAX_VALUE;
                if (z11 || i12 == 400 || i12 == 503) {
                    this.f10142g = SystemClock.elapsedRealtime();
                    m(false);
                    ((s.a) q0.l(a.this.f10126h)).s(iVar, cVar.f11168c, iOException, true);
                    return Loader.f11137f;
                }
            }
            androidx.media3.exoplayer.upstream.b.c cVar2 = new androidx.media3.exoplayer.upstream.b.c(iVar, new n8.j(cVar.f11168c), iOException, i11);
            if (a.this.R(this.f10136a, cVar2, false)) {
                long jD = a.this.f10121c.d(cVar2);
                cVarH = jD != -9223372036854775807L ? Loader.h(false, jD) : Loader.f11138g;
            } else {
                cVarH = Loader.f11137f;
            }
            boolean zC = cVarH.c();
            a.this.f10126h.s(iVar, cVar.f11168c, iOException, !zC);
            if (!zC) {
                a.this.f10121c.a(cVar.f11166a);
            }
            return cVarH;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(androidx.media3.exoplayer.upstream.c<e> cVar, long j11, long j12, int i11) {
            a.this.f10126h.u(i11 == 0 ? new i(cVar.f11166a, cVar.f11167b, j11) : new i(cVar.f11166a, cVar.f11167b, cVar.f(), cVar.d(), j11, j12, cVar.c()), cVar.f11168c, i11);
        }

        public void z() {
            this.f10137b.l();
        }
    }

    public a(f8.d dVar, androidx.media3.exoplayer.upstream.b bVar, f fVar, s8.e eVar) {
        this(dVar, bVar, fVar, eVar, 3.5d);
    }

    private void H(List<Uri> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Uri uri = list.get(i11);
            this.f10122d.put(uri, new c(uri));
        }
    }

    private static androidx.media3.exoplayer.hls.playlist.c.f I(androidx.media3.exoplayer.hls.playlist.c cVar, androidx.media3.exoplayer.hls.playlist.c cVar2) {
        int i11 = (int) (cVar2.f10157k - cVar.f10157k);
        List<androidx.media3.exoplayer.hls.playlist.c.f> list = cVar.f10164r;
        if (i11 < list.size()) {
            return list.get(i11);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.media3.exoplayer.hls.playlist.c J(androidx.media3.exoplayer.hls.playlist.c cVar, androidx.media3.exoplayer.hls.playlist.c cVar2) {
        if (cVar2.f(cVar)) {
            return cVar2.c(L(cVar, cVar2), K(cVar, cVar2));
        }
        return cVar2.f10161o ? cVar.d() : cVar;
    }

    private int K(androidx.media3.exoplayer.hls.playlist.c cVar, androidx.media3.exoplayer.hls.playlist.c cVar2) {
        androidx.media3.exoplayer.hls.playlist.c.f fVarI;
        if (cVar2.f10155i) {
            return cVar2.f10156j;
        }
        androidx.media3.exoplayer.hls.playlist.c cVar3 = this.f10132n;
        return (cVar == null || (fVarI = I(cVar, cVar2)) == null) ? cVar3 != null ? cVar3.f10156j : 0 : (cVar.f10156j + fVarI.f10218d) - cVar2.f10164r.get(0).f10218d;
    }

    private long L(androidx.media3.exoplayer.hls.playlist.c cVar, androidx.media3.exoplayer.hls.playlist.c cVar2) {
        if (cVar2.f10162p) {
            return cVar2.f10154h;
        }
        androidx.media3.exoplayer.hls.playlist.c cVar3 = this.f10132n;
        long j11 = cVar3 != null ? cVar3.f10154h : 0L;
        if (cVar != null) {
            int size = cVar.f10164r.size();
            androidx.media3.exoplayer.hls.playlist.c.f fVarI = I(cVar, cVar2);
            if (fVarI != null) {
                return cVar.f10154h + fVarI.f10219e;
            }
            if (size == cVar2.f10157k - cVar.f10157k) {
                return cVar.e();
            }
        }
        return j11;
    }

    private Uri M(Uri uri) {
        androidx.media3.exoplayer.hls.playlist.c.e eVar;
        androidx.media3.exoplayer.hls.playlist.c cVar = this.f10132n;
        if (cVar == null || !cVar.f10168v.f10230e || (eVar = cVar.f10166t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.f10211b));
        int i11 = eVar.f10212c;
        if (i11 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i11));
        }
        return builderBuildUpon.build();
    }

    private boolean N(Uri uri) {
        List<d.b> list = this.f10130l.f10233e;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (uri.equals(list.get(i11).f10246a)) {
                return true;
            }
        }
        return false;
    }

    private void O(Uri uri) {
        c cVar = this.f10122d.get(uri);
        androidx.media3.exoplayer.hls.playlist.c cVarJ = cVar.j();
        if (cVar.k()) {
            return;
        }
        cVar.A(true);
        if (cVarJ == null || cVarJ.f10161o) {
            return;
        }
        cVar.m(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean P() {
        List<d.b> list = this.f10130l.f10233e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = (c) s7.a.f(this.f10122d.get(list.get(i11).f10246a));
            if (jElapsedRealtime > cVar.f10143h) {
                Uri uri = cVar.f10136a;
                this.f10131m = uri;
                cVar.o(M(uri));
                return true;
            }
        }
        return false;
    }

    private void Q(Uri uri) {
        if (uri.equals(this.f10131m) || !N(uri)) {
            return;
        }
        androidx.media3.exoplayer.hls.playlist.c cVar = this.f10132n;
        if (cVar == null || !cVar.f10161o) {
            this.f10131m = uri;
            c cVar2 = this.f10122d.get(uri);
            androidx.media3.exoplayer.hls.playlist.c cVar3 = cVar2.f10139d;
            if (cVar3 == null || !cVar3.f10161o) {
                cVar2.o(M(uri));
            } else {
                this.f10132n = cVar3;
                this.f10129k.m(cVar3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean R(Uri uri, androidx.media3.exoplayer.upstream.b.c cVar, boolean z11) {
        Iterator<HlsPlaylistTracker.b> it = this.f10123e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !it.next().b(uri, cVar, z11);
        }
        return z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(Uri uri, androidx.media3.exoplayer.hls.playlist.c cVar) {
        if (uri.equals(this.f10131m)) {
            if (this.f10132n == null) {
                this.f10133o = !cVar.f10161o;
                this.f10134p = cVar.f10154h;
            }
            this.f10132n = cVar;
            this.f10129k.m(cVar);
        }
        Iterator<HlsPlaylistTracker.b> it = this.f10123e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void s(androidx.media3.exoplayer.upstream.c<e> cVar, long j11, long j12, boolean z11) {
        i iVar = new i(cVar.f11166a, cVar.f11167b, cVar.f(), cVar.d(), j11, j12, cVar.c());
        this.f10121c.a(cVar.f11166a);
        this.f10126h.l(iVar, 4);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void v(androidx.media3.exoplayer.upstream.c<e> cVar, long j11, long j12) {
        e eVarE = cVar.e();
        boolean z11 = eVarE instanceof androidx.media3.exoplayer.hls.playlist.c;
        d dVarE = z11 ? d.e(eVarE.f67468a) : (d) eVarE;
        this.f10130l = dVarE;
        this.f10131m = dVarE.f10233e.get(0).f10246a;
        this.f10123e.add(new b());
        H(dVarE.f10232d);
        i iVar = new i(cVar.f11166a, cVar.f11167b, cVar.f(), cVar.d(), j11, j12, cVar.c());
        c cVar2 = this.f10122d.get(this.f10131m);
        if (z11) {
            cVar2.y((androidx.media3.exoplayer.hls.playlist.c) eVarE, iVar);
        } else {
            cVar2.m(false);
        }
        this.f10121c.a(cVar.f11166a);
        this.f10126h.o(iVar, 4);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public Loader.c p(androidx.media3.exoplayer.upstream.c<e> cVar, long j11, long j12, IOException iOException, int i11) {
        i iVar = new i(cVar.f11166a, cVar.f11167b, cVar.f(), cVar.d(), j11, j12, cVar.c());
        long jD = this.f10121c.d(new androidx.media3.exoplayer.upstream.b.c(iVar, new n8.j(cVar.f11168c), iOException, i11));
        boolean z11 = jD == -9223372036854775807L;
        this.f10126h.s(iVar, cVar.f11168c, iOException, z11);
        if (z11) {
            this.f10121c.a(cVar.f11166a);
        }
        return z11 ? Loader.f11138g : Loader.h(false, jD);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void q(androidx.media3.exoplayer.upstream.c<e> cVar, long j11, long j12, int i11) {
        this.f10126h.u(i11 == 0 ? new i(cVar.f11166a, cVar.f11167b, j11) : new i(cVar.f11166a, cVar.f11167b, cVar.f(), cVar.d(), j11, j12, cVar.c()), cVar.f11168c, i11);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public long a() {
        return this.f10134p;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void b(HlsPlaylistTracker.b bVar) {
        this.f10123e.remove(bVar);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void c(HlsPlaylistTracker.b bVar) {
        s7.a.f(bVar);
        this.f10123e.add(bVar);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void d(Uri uri, s.a aVar, HlsPlaylistTracker.c cVar) {
        this.f10128j = q0.C();
        this.f10126h = aVar;
        this.f10129k = cVar;
        j jVarA = new j.b().i(uri).b(1).a();
        if (this.f10125g != null) {
            jVarA = new s8.f.C2354f(this.f10125g, "h").l("m").a().a(jVarA);
        }
        androidx.media3.exoplayer.upstream.c cVar2 = new androidx.media3.exoplayer.upstream.c(this.f10119a.a(4), jVarA, 4, this.f10120b.a());
        s7.a.h(this.f10127i == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f10127i = loader;
        loader.n(cVar2, this, this.f10121c.b(cVar2.f11168c));
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void e(Uri uri) {
        c cVar = this.f10122d.get(uri);
        if (cVar != null) {
            cVar.A(false);
        }
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void f(Uri uri) throws IOException {
        this.f10122d.get(uri).r();
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public d g() {
        return this.f10130l;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void h(Uri uri) {
        this.f10122d.get(uri).m(true);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public boolean i(Uri uri) {
        return this.f10122d.get(uri).l();
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public boolean j() {
        return this.f10133o;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public boolean k(Uri uri, long j11) {
        c cVar = this.f10122d.get(uri);
        if (cVar != null) {
            return !cVar.h(j11);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void l() throws IOException {
        Loader loader = this.f10127i;
        if (loader != null) {
            loader.a();
        }
        Uri uri = this.f10131m;
        if (uri != null) {
            f(uri);
        }
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public androidx.media3.exoplayer.hls.playlist.c m(Uri uri, boolean z11) {
        androidx.media3.exoplayer.hls.playlist.c cVarJ = this.f10122d.get(uri).j();
        if (cVarJ != null && z11) {
            Q(uri);
            O(uri);
        }
        return cVarJ;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void stop() {
        this.f10131m = null;
        this.f10132n = null;
        this.f10130l = null;
        this.f10134p = -9223372036854775807L;
        this.f10127i.l();
        this.f10127i = null;
        Iterator<c> it = this.f10122d.values().iterator();
        while (it.hasNext()) {
            it.next().z();
        }
        this.f10128j.removeCallbacksAndMessages(null);
        this.f10128j = null;
        this.f10122d.clear();
    }

    public a(f8.d dVar, androidx.media3.exoplayer.upstream.b bVar, f fVar, s8.e eVar, double d11) {
        this.f10119a = dVar;
        this.f10120b = fVar;
        this.f10121c = bVar;
        this.f10125g = eVar;
        this.f10124f = d11;
        this.f10123e = new CopyOnWriteArrayList<>();
        this.f10122d = new HashMap<>();
        this.f10134p = -9223372036854775807L;
    }
}
