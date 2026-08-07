package cr;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.v1;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class l1 implements cr.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ts.d f58990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f2.b f58991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f2.d f58992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f58993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray<b.a> f58994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ts.t<b> f58995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private v1 f58996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ts.q f58997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f58998i;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f2.b f58999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.google.common.collect.x<com.google.android.exoplayer2.source.o.b> f59000b = com.google.common.collect.x.r();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.google.common.collect.z<com.google.android.exoplayer2.source.o.b, f2> f59001c = com.google.common.collect.z.m();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.android.exoplayer2.source.o.b f59002d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.google.android.exoplayer2.source.o.b f59003e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.google.android.exoplayer2.source.o.b f59004f;

        public a(f2.b bVar) {
            this.f58999a = bVar;
        }

        private void b(com.google.common.collect.z.a<com.google.android.exoplayer2.source.o.b, f2> aVar, com.google.android.exoplayer2.source.o.b bVar, f2 f2Var) {
            if (bVar == null) {
                return;
            }
            if (f2Var.f(bVar.f63157a) != -1) {
                aVar.f(bVar, f2Var);
                return;
            }
            f2 f2Var2 = this.f59001c.get(bVar);
            if (f2Var2 != null) {
                aVar.f(bVar, f2Var2);
            }
        }

        private static com.google.android.exoplayer2.source.o.b c(v1 v1Var, com.google.common.collect.x<com.google.android.exoplayer2.source.o.b> xVar, com.google.android.exoplayer2.source.o.b bVar, f2.b bVar2) {
            f2 f2VarJ = v1Var.J();
            int iX = v1Var.x();
            Object objQ = f2VarJ.u() ? null : f2VarJ.q(iX);
            int iG = (v1Var.m() || f2VarJ.u()) ? -1 : f2VarJ.j(iX, bVar2).g(ts.p0.D0(v1Var.D()) - bVar2.q());
            for (int i11 = 0; i11 < xVar.size(); i11++) {
                com.google.android.exoplayer2.source.o.b bVar3 = xVar.get(i11);
                if (i(bVar3, objQ, v1Var.m(), v1Var.r(), v1Var.z(), iG)) {
                    return bVar3;
                }
            }
            if (xVar.isEmpty() && bVar != null && i(bVar, objQ, v1Var.m(), v1Var.r(), v1Var.z(), iG)) {
                return bVar;
            }
            return null;
        }

        private static boolean i(com.google.android.exoplayer2.source.o.b bVar, Object obj, boolean z11, int i11, int i12, int i13) {
            if (!bVar.f63157a.equals(obj)) {
                return false;
            }
            if (z11 && bVar.f63158b == i11 && bVar.f63159c == i12) {
                return true;
            }
            return !z11 && bVar.f63158b == -1 && bVar.f63161e == i13;
        }

        private void m(f2 f2Var) {
            com.google.common.collect.z.a<com.google.android.exoplayer2.source.o.b, f2> aVarB = com.google.common.collect.z.b();
            if (this.f59000b.isEmpty()) {
                b(aVarB, this.f59003e, f2Var);
                if (!ou.l.a(this.f59004f, this.f59003e)) {
                    b(aVarB, this.f59004f, f2Var);
                }
                if (!ou.l.a(this.f59002d, this.f59003e) && !ou.l.a(this.f59002d, this.f59004f)) {
                    b(aVarB, this.f59002d, f2Var);
                }
            } else {
                for (int i11 = 0; i11 < this.f59000b.size(); i11++) {
                    b(aVarB, this.f59000b.get(i11), f2Var);
                }
                if (!this.f59000b.contains(this.f59002d)) {
                    b(aVarB, this.f59002d, f2Var);
                }
            }
            this.f59001c = aVarB.c();
        }

        public com.google.android.exoplayer2.source.o.b d() {
            return this.f59002d;
        }

        public com.google.android.exoplayer2.source.o.b e() {
            if (this.f59000b.isEmpty()) {
                return null;
            }
            return (com.google.android.exoplayer2.source.o.b) com.google.common.collect.c0.d(this.f59000b);
        }

        public f2 f(com.google.android.exoplayer2.source.o.b bVar) {
            return this.f59001c.get(bVar);
        }

        public com.google.android.exoplayer2.source.o.b g() {
            return this.f59003e;
        }

        public com.google.android.exoplayer2.source.o.b h() {
            return this.f59004f;
        }

        public void j(v1 v1Var) {
            this.f59002d = c(v1Var, this.f59000b, this.f59003e, this.f58999a);
        }

        public void k(List<com.google.android.exoplayer2.source.o.b> list, com.google.android.exoplayer2.source.o.b bVar, v1 v1Var) {
            this.f59000b = com.google.common.collect.x.n(list);
            if (!list.isEmpty()) {
                this.f59003e = list.get(0);
                this.f59004f = (com.google.android.exoplayer2.source.o.b) ts.a.e(bVar);
            }
            if (this.f59002d == null) {
                this.f59002d = c(v1Var, this.f59000b, this.f59003e, this.f58999a);
            }
            m(v1Var.J());
        }

        public void l(v1 v1Var) {
            this.f59002d = c(v1Var, this.f59000b, this.f59003e, this.f58999a);
            m(v1Var.J());
        }
    }

    public l1(ts.d dVar) {
        this.f58990a = (ts.d) ts.a.e(dVar);
        this.f58995f = new ts.t<>(ts.p0.M(), dVar, new ts.t.b() { // from class: cr.z
            @Override // ts.t.b
            public final void a(Object obj, ts.o oVar) {
                l1.R((b) obj, oVar);
            }
        });
        f2.b bVar = new f2.b();
        this.f58991b = bVar;
        this.f58992c = new f2.d();
        this.f58993d = new a(bVar);
        this.f58994e = new SparseArray<>();
    }

    public static /* synthetic */ void G0(b.a aVar, com.google.android.exoplayer2.u0 u0Var, fr.g gVar, b bVar) {
        bVar.B(aVar, u0Var);
        bVar.g0(aVar, u0Var, gVar);
    }

    public static /* synthetic */ void H0(b.a aVar, com.google.android.exoplayer2.u0 u0Var, fr.g gVar, b bVar) {
        bVar.c0(aVar, u0Var);
        bVar.m0(aVar, u0Var, gVar);
    }

    public static /* synthetic */ void M0(b.a aVar, int i11, v1.e eVar, v1.e eVar2, b bVar) {
        bVar.P(aVar, i11);
        bVar.q0(aVar, eVar, eVar2, i11);
    }

    public static /* synthetic */ void O0(b.a aVar, String str, long j11, long j12, b bVar) {
        bVar.h0(aVar, str, j11);
        bVar.Q(aVar, str, j12, j11);
    }

    public static /* synthetic */ void P0(b.a aVar, String str, long j11, long j12, b bVar) {
        bVar.x(aVar, str, j11);
        bVar.p(aVar, str, j12, j11);
    }

    public static /* synthetic */ void R(b bVar, ts.o oVar) {
    }

    private b.a U0(com.google.android.exoplayer2.source.o.b bVar) {
        ts.a.e(this.f58996g);
        f2 f2VarF = bVar == null ? null : this.f58993d.f(bVar);
        if (bVar != null && f2VarF != null) {
            return T0(f2VarF, f2VarF.l(bVar.f63157a, this.f58991b).f39924c, bVar);
        }
        int iR = this.f58996g.R();
        f2 f2VarJ = this.f58996g.J();
        if (iR >= f2VarJ.t()) {
            f2VarJ = f2.f39911a;
        }
        return T0(f2VarJ, iR, null);
    }

    private b.a V0() {
        return U0(this.f58993d.e());
    }

    private b.a W0(int i11, com.google.android.exoplayer2.source.o.b bVar) {
        ts.a.e(this.f58996g);
        if (bVar != null) {
            return this.f58993d.f(bVar) != null ? U0(bVar) : T0(f2.f39911a, i11, bVar);
        }
        f2 f2VarJ = this.f58996g.J();
        if (i11 >= f2VarJ.t()) {
            f2VarJ = f2.f39911a;
        }
        return T0(f2VarJ, i11, null);
    }

    private b.a X0() {
        return U0(this.f58993d.g());
    }

    private b.a Y0() {
        return U0(this.f58993d.h());
    }

    private b.a Z0(PlaybackException playbackException) {
        es.j jVar;
        return (!(playbackException instanceof ExoPlaybackException) || (jVar = ((ExoPlaybackException) playbackException).f39386n) == null) ? S0() : U0(new com.google.android.exoplayer2.source.o.b(jVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1() {
        final b.a aVarS0 = S0();
        b1(aVarS0, 1028, new ts.t.a() { // from class: cr.c1
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).I(aVarS0);
            }
        });
        this.f58995f.i();
    }

    public static /* synthetic */ void h0(b.a aVar, int i11, b bVar) {
        bVar.m(aVar);
        bVar.U(aVar, i11);
    }

    public static /* synthetic */ void k0(b.a aVar, us.z zVar, b bVar) {
        bVar.f0(aVar, zVar);
        bVar.H(aVar, zVar.f116713a, zVar.f116714b, zVar.f116715c, zVar.f116716d);
    }

    public static /* synthetic */ void q0(b.a aVar, boolean z11, b bVar) {
        bVar.X(aVar, z11);
        bVar.i(aVar, z11);
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void A(int i11, com.google.android.exoplayer2.source.o.b bVar) {
        final b.a aVarW0 = W0(i11, bVar);
        b1(aVarW0, 1023, new ts.t.a() { // from class: cr.d1
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).t(aVarW0);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void B(int i11, com.google.android.exoplayer2.source.o.b bVar, final int i12) {
        final b.a aVarW0 = W0(i11, bVar);
        b1(aVarW0, 1022, new ts.t.a() { // from class: cr.s0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                l1.h0(aVarW0, i12, (b) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.p
    public final void C(int i11, com.google.android.exoplayer2.source.o.b bVar, final es.h hVar, final es.i iVar) {
        final b.a aVarW0 = W0(i11, bVar);
        b1(aVarW0, 1000, new ts.t.a() { // from class: cr.j0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).r0(aVarW0, hVar, iVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void D(int i11, com.google.android.exoplayer2.source.o.b bVar) {
        final b.a aVarW0 = W0(i11, bVar);
        b1(aVarW0, 1025, new ts.t.a() { // from class: cr.e1
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).O(aVarW0);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void E(int i11, com.google.android.exoplayer2.source.o.b bVar) {
        final b.a aVarW0 = W0(i11, bVar);
        b1(aVarW0, 1026, new ts.t.a() { // from class: cr.y0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).k(aVarW0);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void G(int i11, com.google.android.exoplayer2.source.o.b bVar, final Exception exc) {
        final b.a aVarW0 = W0(i11, bVar);
        b1(aVarW0, 1024, new ts.t.a() { // from class: cr.o0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).T(aVarW0, exc);
            }
        });
    }

    @Override // cr.a
    public final void H(List<com.google.android.exoplayer2.source.o.b> list, com.google.android.exoplayer2.source.o.b bVar) {
        this.f58993d.k(list, bVar, (v1) ts.a.e(this.f58996g));
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void I(int i11, com.google.android.exoplayer2.source.o.b bVar) {
        final b.a aVarW0 = W0(i11, bVar);
        b1(aVarW0, 1027, new ts.t.a() { // from class: cr.f0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).l0(aVarW0);
            }
        });
    }

    protected final b.a S0() {
        return U0(this.f58993d.d());
    }

    @RequiresNonNull({"player"})
    protected final b.a T0(f2 f2Var, int i11, com.google.android.exoplayer2.source.o.b bVar) {
        com.google.android.exoplayer2.source.o.b bVar2 = f2Var.u() ? null : bVar;
        long jElapsedRealtime = this.f58990a.elapsedRealtime();
        boolean z11 = f2Var.equals(this.f58996g.J()) && i11 == this.f58996g.R();
        long jD = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z11) {
                jD = this.f58996g.Q();
            } else if (!f2Var.u()) {
                jD = f2Var.r(i11, this.f58992c).d();
            }
        } else if (z11 && this.f58996g.r() == bVar2.f63158b && this.f58996g.z() == bVar2.f63159c) {
            jD = this.f58996g.D();
        }
        return new b.a(jElapsedRealtime, f2Var, i11, bVar2, jD, this.f58996g.J(), this.f58996g.R(), this.f58993d.d(), this.f58996g.D(), this.f58996g.n());
    }

    @Override // cr.a
    public final void a(final Exception exc) {
        final b.a aVarY0 = Y0();
        b1(aVarY0, 1014, new ts.t.a() { // from class: cr.m0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).d(aVarY0, exc);
            }
        });
    }

    @Override // cr.a
    public final void b(final fr.e eVar) {
        final b.a aVarY0 = Y0();
        b1(aVarY0, 1007, new ts.t.a() { // from class: cr.q0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).i0(aVarY0, eVar);
            }
        });
    }

    protected final void b1(b.a aVar, int i11, ts.t.a<b> aVar2) {
        this.f58994e.put(i11, aVar);
        this.f58995f.k(i11, aVar2);
    }

    @Override // cr.a
    public final void c(final String str) {
        final b.a aVarY0 = Y0();
        b1(aVarY0, 1019, new ts.t.a() { // from class: cr.x0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).a0(aVarY0, str);
            }
        });
    }

    @Override // cr.a
    public final void d(final String str) {
        final b.a aVarY0 = Y0();
        b1(aVarY0, 1012, new ts.t.a() { // from class: cr.c0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).v(aVarY0, str);
            }
        });
    }

    @Override // cr.a
    public final void e(final String str, final long j11, final long j12) {
        final b.a aVarY0 = Y0();
        b1(aVarY0, 1008, new ts.t.a() { // from class: cr.c
            @Override // ts.t.a
            public final void invoke(Object obj) {
                l1.O0(aVarY0, str, j12, j11, (b) obj);
            }
        });
    }

    @Override // cr.a
    public final void f(final int i11, final long j11) {
        final b.a aVarX0 = X0();
        b1(aVarX0, 1018, new ts.t.a() { // from class: cr.i0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).C(aVarX0, i11, j11);
            }
        });
    }

    @Override // cr.a
    public final void g(final Exception exc) {
        final b.a aVarY0 = Y0();
        b1(aVarY0, 1029, new ts.t.a() { // from class: cr.j1
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).S(aVarY0, exc);
            }
        });
    }

    @Override // cr.a
    public final void h(final long j11, final int i11) {
        final b.a aVarX0 = X0();
        b1(aVarX0, 1021, new ts.t.a() { // from class: cr.n0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).J(aVarX0, j11, i11);
            }
        });
    }

    @Override // cr.a
    public final void i(final String str, final long j11, final long j12) {
        final b.a aVarY0 = Y0();
        b1(aVarY0, 1016, new ts.t.a() { // from class: cr.x
            @Override // ts.t.a
            public final void invoke(Object obj) {
                l1.P0(aVarY0, str, j12, j11, (b) obj);
            }
        });
    }

    @Override // cr.a
    public final void j(final long j11) {
        final b.a aVarY0 = Y0();
        b1(aVarY0, 1010, new ts.t.a() { // from class: cr.e0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).r(aVarY0, j11);
            }
        });
    }

    @Override // cr.a
    public final void k(final Exception exc) {
        final b.a aVarY0 = Y0();
        b1(aVarY0, 1030, new ts.t.a() { // from class: cr.i1
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).e0(aVarY0, exc);
            }
        });
    }

    @Override // cr.a
    public final void l(final Object obj, final long j11) {
        final b.a aVarY0 = Y0();
        b1(aVarY0, 26, new ts.t.a() { // from class: cr.a1
            @Override // ts.t.a
            public final void invoke(Object obj2) {
                ((b) obj2).f(aVarY0, obj, j11);
            }
        });
    }

    @Override // cr.a
    public final void m(final int i11, final long j11, final long j12) {
        final b.a aVarY0 = Y0();
        b1(aVarY0, 1011, new ts.t.a() { // from class: cr.e
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).h(aVarY0, i11, j11, j12);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.p
    public final void n(int i11, com.google.android.exoplayer2.source.o.b bVar, final es.h hVar, final es.i iVar) {
        final b.a aVarW0 = W0(i11, bVar);
        b1(aVarW0, 1001, new ts.t.a() { // from class: cr.i
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).d0(aVarW0, hVar, iVar);
            }
        });
    }

    @Override // cr.a
    public final void o(final fr.e eVar) {
        final b.a aVarY0 = Y0();
        b1(aVarY0, 1015, new ts.t.a() { // from class: cr.v
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).o(aVarY0, eVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void onAvailableCommandsChanged(final v1.b bVar) {
        final b.a aVarS0 = S0();
        b1(aVarS0, 13, new ts.t.a() { // from class: cr.t
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).n0(aVarS0, bVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void onCues(final List<gs.b> list) {
        final b.a aVarS0 = S0();
        b1(aVarS0, 27, new ts.t.a() { // from class: cr.g0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).b(aVarS0, list);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void onDeviceInfoChanged(final com.google.android.exoplayer2.j jVar) {
        final b.a aVarS0 = S0();
        b1(aVarS0, 29, new ts.t.a() { // from class: cr.t0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).q(aVarS0, jVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void onDeviceVolumeChanged(final int i11, final boolean z11) {
        final b.a aVarS0 = S0();
        b1(aVarS0, 30, new ts.t.a() { // from class: cr.v0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).l(aVarS0, i11, z11);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void onIsLoadingChanged(final boolean z11) {
        final b.a aVarS0 = S0();
        b1(aVarS0, 3, new ts.t.a() { // from class: cr.u0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                l1.q0(aVarS0, z11, (b) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void onIsPlayingChanged(final boolean z11) {
        final b.a aVarS0 = S0();
        b1(aVarS0, 7, new ts.t.a() { // from class: cr.h1
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).L(aVarS0, z11);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void onMediaItemTransition(final com.google.android.exoplayer2.x0 x0Var, final int i11) {
        final b.a aVarS0 = S0();
        b1(aVarS0, 1, new ts.t.a() { // from class: cr.r
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).g(aVarS0, x0Var, i11);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void onMediaMetadataChanged(final com.google.android.exoplayer2.y0 y0Var) {
        final b.a aVarS0 = S0();
        b1(aVarS0, 14, new ts.t.a() { // from class: cr.f
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).s0(aVarS0, y0Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void onMetadata(final ur.a aVar) {
        final b.a aVarS0 = S0();
        b1(aVarS0, 28, new ts.t.a() { // from class: cr.w0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).p0(aVarS0, aVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void onPlayWhenReadyChanged(final boolean z11, final int i11) {
        final b.a aVarS0 = S0();
        b1(aVarS0, 5, new ts.t.a() { // from class: cr.n
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).N(aVarS0, z11, i11);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void onPlaybackParametersChanged(final u1 u1Var) {
        final b.a aVarS0 = S0();
        b1(aVarS0, 12, new ts.t.a() { // from class: cr.h
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).W(aVarS0, u1Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void onPlaybackStateChanged(final int i11) {
        final b.a aVarS0 = S0();
        b1(aVarS0, 4, new ts.t.a() { // from class: cr.w
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).w(aVarS0, i11);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void onPlaybackSuppressionReasonChanged(final int i11) {
        final b.a aVarS0 = S0();
        b1(aVarS0, 6, new ts.t.a() { // from class: cr.l0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).s(aVarS0, i11);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void onPlayerError(final PlaybackException playbackException) {
        final b.a aVarZ0 = Z0(playbackException);
        b1(aVarZ0, 10, new ts.t.a() { // from class: cr.q
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).o0(aVarZ0, playbackException);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void onPlayerErrorChanged(final PlaybackException playbackException) {
        final b.a aVarZ0 = Z0(playbackException);
        b1(aVarZ0, 10, new ts.t.a() { // from class: cr.k0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).Y(aVarZ0, playbackException);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void onPlayerStateChanged(final boolean z11, final int i11) {
        final b.a aVarS0 = S0();
        b1(aVarS0, -1, new ts.t.a() { // from class: cr.j
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).j0(aVarS0, z11, i11);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void onPositionDiscontinuity(int i11) {
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void onRepeatModeChanged(final int i11) {
        final b.a aVarS0 = S0();
        b1(aVarS0, 8, new ts.t.a() { // from class: cr.d0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).A(aVarS0, i11);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void onShuffleModeEnabledChanged(final boolean z11) {
        final b.a aVarS0 = S0();
        b1(aVarS0, 9, new ts.t.a() { // from class: cr.k1
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).b0(aVarS0, z11);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void onSkipSilenceEnabledChanged(final boolean z11) {
        final b.a aVarY0 = Y0();
        b1(aVarY0, 23, new ts.t.a() { // from class: cr.b1
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).c(aVarY0, z11);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void onSurfaceSizeChanged(final int i11, final int i12) {
        final b.a aVarY0 = Y0();
        b1(aVarY0, 24, new ts.t.a() { // from class: cr.o
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).Z(aVarY0, i11, i12);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void onTimelineChanged(f2 f2Var, final int i11) {
        this.f58993d.l((v1) ts.a.e(this.f58996g));
        final b.a aVarS0 = S0();
        b1(aVarS0, 0, new ts.t.a() { // from class: cr.r0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).y(aVarS0, i11);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void onTrackSelectionParametersChanged(final qs.y yVar) {
        final b.a aVarS0 = S0();
        b1(aVarS0, 19, new ts.t.a() { // from class: cr.a0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).u(aVarS0, yVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void onTracksChanged(final g2 g2Var) {
        final b.a aVarS0 = S0();
        b1(aVarS0, 2, new ts.t.a() { // from class: cr.h0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).R(aVarS0, g2Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void onVideoSizeChanged(final us.z zVar) {
        final b.a aVarY0 = Y0();
        b1(aVarY0, 25, new ts.t.a() { // from class: cr.z0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                l1.k0(aVarY0, zVar, (b) obj);
            }
        });
    }

    @Override // cr.a
    public final void p(final fr.e eVar) {
        final b.a aVarX0 = X0();
        b1(aVarX0, 1020, new ts.t.a() { // from class: cr.y
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarX0, eVar);
            }
        });
    }

    @Override // ss.d.a
    public final void q(final int i11, final long j11, final long j12) {
        final b.a aVarV0 = V0();
        b1(aVarV0, 1006, new ts.t.a() { // from class: cr.g1
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).M(aVarV0, i11, j11, j12);
            }
        });
    }

    @Override // cr.a
    public final void r(final fr.e eVar) {
        final b.a aVarX0 = X0();
        b1(aVarX0, 1013, new ts.t.a() { // from class: cr.b0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).e(aVarX0, eVar);
            }
        });
    }

    @Override // cr.a
    public void release() {
        ((ts.q) ts.a.i(this.f58997h)).g(new Runnable() { // from class: cr.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f58952a.a1();
            }
        });
    }

    @Override // cr.a
    public final void s(final com.google.android.exoplayer2.u0 u0Var, final fr.g gVar) {
        final b.a aVarY0 = Y0();
        b1(aVarY0, 1017, new ts.t.a() { // from class: cr.u
            @Override // ts.t.a
            public final void invoke(Object obj) {
                l1.H0(aVarY0, u0Var, gVar, (b) obj);
            }
        });
    }

    @Override // cr.a
    public void t(final v1 v1Var, Looper looper) {
        ts.a.g(this.f58996g == null || this.f58993d.f59000b.isEmpty());
        this.f58996g = (v1) ts.a.e(v1Var);
        this.f58997h = this.f58990a.c(looper, null);
        this.f58995f = this.f58995f.e(looper, new ts.t.b() { // from class: cr.l
            @Override // ts.t.b
            public final void a(Object obj, ts.o oVar) {
                b bVar = (b) obj;
                bVar.D(v1Var, new b.C1204b(oVar, this.f58986a.f58994e));
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.p
    public final void u(int i11, com.google.android.exoplayer2.source.o.b bVar, final es.h hVar, final es.i iVar) {
        final b.a aVarW0 = W0(i11, bVar);
        b1(aVarW0, 1002, new ts.t.a() { // from class: cr.f1
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).k0(aVarW0, hVar, iVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.p
    public final void v(int i11, com.google.android.exoplayer2.source.o.b bVar, final es.h hVar, final es.i iVar, final IOException iOException, final boolean z11) {
        final b.a aVarW0 = W0(i11, bVar);
        b1(aVarW0, 1003, new ts.t.a() { // from class: cr.p
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).V(aVarW0, hVar, iVar, iOException, z11);
            }
        });
    }

    @Override // cr.a
    public final void w(final com.google.android.exoplayer2.u0 u0Var, final fr.g gVar) {
        final b.a aVarY0 = Y0();
        b1(aVarY0, 1009, new ts.t.a() { // from class: cr.d
            @Override // ts.t.a
            public final void invoke(Object obj) {
                l1.G0(aVarY0, u0Var, gVar, (b) obj);
            }
        });
    }

    @Override // cr.a
    public final void x() {
        if (this.f58998i) {
            return;
        }
        final b.a aVarS0 = S0();
        this.f58998i = true;
        b1(aVarS0, -1, new ts.t.a() { // from class: cr.k
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).j(aVarS0);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.p
    public final void y(int i11, com.google.android.exoplayer2.source.o.b bVar, final es.i iVar) {
        final b.a aVarW0 = W0(i11, bVar);
        b1(aVarW0, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, new ts.t.a() { // from class: cr.m
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).n(aVarW0, iVar);
            }
        });
    }

    @Override // cr.a
    public void z(b bVar) {
        ts.a.e(bVar);
        this.f58995f.c(bVar);
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void onPositionDiscontinuity(final v1.e eVar, final v1.e eVar2, final int i11) {
        if (i11 == 1) {
            this.f58998i = false;
        }
        this.f58993d.j((v1) ts.a.e(this.f58996g));
        final b.a aVarS0 = S0();
        b1(aVarS0, 11, new ts.t.a() { // from class: cr.p0
            @Override // ts.t.a
            public final void invoke(Object obj) {
                l1.M0(aVarS0, i11, eVar, eVar2, (b) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void onCues(final gs.f fVar) {
        final b.a aVarS0 = S0();
        b1(aVarS0, 27, new ts.t.a() { // from class: cr.s
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((b) obj).z(aVarS0, fVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void onRenderedFirstFrame() {
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void onLoadingChanged(boolean z11) {
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void onEvents(v1 v1Var, v1.c cVar) {
    }
}
