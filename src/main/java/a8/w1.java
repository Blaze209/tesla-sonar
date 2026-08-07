package a8;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public class w1 implements a8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s7.j f788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p7.r0.b f789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p7.r0.d f790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray<b.a> f792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s7.s<b> f793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p7.j0 f794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s7.p f795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f796i;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p7.r0.b f797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.google.common.collect.x<androidx.media3.exoplayer.source.r.b> f798b = com.google.common.collect.x.r();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.google.common.collect.z<androidx.media3.exoplayer.source.r.b, p7.r0> f799c = com.google.common.collect.z.m();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.media3.exoplayer.source.r.b f800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.media3.exoplayer.source.r.b f801e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.media3.exoplayer.source.r.b f802f;

        public a(p7.r0.b bVar) {
            this.f797a = bVar;
        }

        private void b(com.google.common.collect.z.a<androidx.media3.exoplayer.source.r.b, p7.r0> aVar, androidx.media3.exoplayer.source.r.b bVar, p7.r0 r0Var) {
            if (bVar == null) {
                return;
            }
            if (r0Var.f(bVar.f11103a) != -1) {
                aVar.f(bVar, r0Var);
                return;
            }
            p7.r0 r0Var2 = this.f799c.get(bVar);
            if (r0Var2 != null) {
                aVar.f(bVar, r0Var2);
            }
        }

        private static androidx.media3.exoplayer.source.r.b c(p7.j0 j0Var, com.google.common.collect.x<androidx.media3.exoplayer.source.r.b> xVar, androidx.media3.exoplayer.source.r.b bVar, p7.r0.b bVar2) {
            p7.r0 r0VarJ = j0Var.J();
            int iX = j0Var.x();
            Object objQ = r0VarJ.u() ? null : r0VarJ.q(iX);
            int iE = (j0Var.m() || r0VarJ.u()) ? -1 : r0VarJ.j(iX, bVar2).e(s7.q0.b1(j0Var.D()) - bVar2.p());
            for (int i11 = 0; i11 < xVar.size(); i11++) {
                androidx.media3.exoplayer.source.r.b bVar3 = xVar.get(i11);
                if (i(bVar3, objQ, j0Var.m(), j0Var.r(), j0Var.z(), iE)) {
                    return bVar3;
                }
            }
            if (xVar.isEmpty() && bVar != null && i(bVar, objQ, j0Var.m(), j0Var.r(), j0Var.z(), iE)) {
                return bVar;
            }
            return null;
        }

        private static boolean i(androidx.media3.exoplayer.source.r.b bVar, Object obj, boolean z11, int i11, int i12, int i13) {
            if (!bVar.f11103a.equals(obj)) {
                return false;
            }
            if (z11 && bVar.f11104b == i11 && bVar.f11105c == i12) {
                return true;
            }
            return !z11 && bVar.f11104b == -1 && bVar.f11107e == i13;
        }

        private void m(p7.r0 r0Var) {
            com.google.common.collect.z.a<androidx.media3.exoplayer.source.r.b, p7.r0> aVarB = com.google.common.collect.z.b();
            if (this.f798b.isEmpty()) {
                b(aVarB, this.f801e, r0Var);
                if (!Objects.equals(this.f802f, this.f801e)) {
                    b(aVarB, this.f802f, r0Var);
                }
                if (!Objects.equals(this.f800d, this.f801e) && !Objects.equals(this.f800d, this.f802f)) {
                    b(aVarB, this.f800d, r0Var);
                }
            } else {
                for (int i11 = 0; i11 < this.f798b.size(); i11++) {
                    b(aVarB, this.f798b.get(i11), r0Var);
                }
                if (!this.f798b.contains(this.f800d)) {
                    b(aVarB, this.f800d, r0Var);
                }
            }
            this.f799c = aVarB.c();
        }

        public androidx.media3.exoplayer.source.r.b d() {
            return this.f800d;
        }

        public androidx.media3.exoplayer.source.r.b e() {
            if (this.f798b.isEmpty()) {
                return null;
            }
            return (androidx.media3.exoplayer.source.r.b) com.google.common.collect.c0.d(this.f798b);
        }

        public p7.r0 f(androidx.media3.exoplayer.source.r.b bVar) {
            return this.f799c.get(bVar);
        }

        public androidx.media3.exoplayer.source.r.b g() {
            return this.f801e;
        }

        public androidx.media3.exoplayer.source.r.b h() {
            return this.f802f;
        }

        public void j(p7.j0 j0Var) {
            this.f800d = c(j0Var, this.f798b, this.f801e, this.f797a);
        }

        public void k(List<androidx.media3.exoplayer.source.r.b> list, androidx.media3.exoplayer.source.r.b bVar, p7.j0 j0Var) {
            this.f798b = com.google.common.collect.x.n(list);
            if (!list.isEmpty()) {
                this.f801e = list.get(0);
                this.f802f = (androidx.media3.exoplayer.source.r.b) s7.a.f(bVar);
            }
            if (this.f800d == null) {
                this.f800d = c(j0Var, this.f798b, this.f801e, this.f797a);
            }
            m(j0Var.J());
        }

        public void l(p7.j0 j0Var) {
            this.f800d = c(j0Var, this.f798b, this.f801e, this.f797a);
            m(j0Var.J());
        }
    }

    public w1(s7.j jVar) {
        this.f788a = (s7.j) s7.a.f(jVar);
        this.f793f = new s7.s<>(s7.q0.d0(), jVar, new s7.s.b() { // from class: a8.x
            @Override // s7.s.b
            public final void a(Object obj, p7.q qVar) {
                w1.t1((b) obj, qVar);
            }
        });
        p7.r0.b bVar = new p7.r0.b();
        this.f789b = bVar;
        this.f790c = new p7.r0.d();
        this.f791d = new a(bVar);
        this.f792e = new SparseArray<>();
    }

    private b.a B1() {
        return z1(this.f791d.e());
    }

    private b.a C1(int i11, androidx.media3.exoplayer.source.r.b bVar) {
        s7.a.f(this.f794g);
        if (bVar != null) {
            return this.f791d.f(bVar) != null ? z1(bVar) : A1(p7.r0.f101451a, i11, bVar);
        }
        p7.r0 r0VarJ = this.f794g.J();
        if (i11 >= r0VarJ.t()) {
            r0VarJ = p7.r0.f101451a;
        }
        return A1(r0VarJ, i11, null);
    }

    public static /* synthetic */ void D0(b.a aVar, String str, long j11, long j12, b bVar) {
        bVar.d(aVar, str, j11);
        bVar.i0(aVar, str, j12, j11);
    }

    private b.a D1() {
        return z1(this.f791d.g());
    }

    private b.a E1() {
        return z1(this.f791d.h());
    }

    private b.a F1(PlaybackException playbackException) {
        androidx.media3.exoplayer.source.r.b bVar;
        return (!(playbackException instanceof ExoPlaybackException) || (bVar = ((ExoPlaybackException) playbackException).f9299o) == null) ? y1() : z1(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G1() {
        final b.a aVarY1 = y1();
        H1(aVarY1, 1028, new s7.s.a() { // from class: a8.q0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).V(aVarY1);
            }
        });
        this.f793f.i();
    }

    public static /* synthetic */ void K0(b.a aVar, boolean z11, b bVar) {
        bVar.o(aVar, z11);
        bVar.x(aVar, z11);
    }

    public static /* synthetic */ void T0(b.a aVar, int i11, p7.j0.e eVar, p7.j0.e eVar2, b bVar) {
        bVar.v0(aVar, i11);
        bVar.y(aVar, eVar, eVar2, i11);
    }

    public static /* synthetic */ void h0(b.a aVar, int i11, b bVar) {
        bVar.u(aVar);
        bVar.v(aVar, i11);
    }

    public static /* synthetic */ void j0(b.a aVar, String str, long j11, long j12, b bVar) {
        bVar.b0(aVar, str, j11);
        bVar.h(aVar, str, j12, j11);
    }

    public static /* synthetic */ void s0(b.a aVar, p7.e1 e1Var, b bVar) {
        bVar.m0(aVar, e1Var);
        bVar.f(aVar, e1Var.f101332a, e1Var.f101333b, 0, e1Var.f101335d);
    }

    public static /* synthetic */ void t0(b.a aVar, n8.i iVar, n8.j jVar, int i11, b bVar) {
        bVar.N(aVar, iVar, jVar);
        bVar.L(aVar, iVar, jVar, i11);
    }

    public static /* synthetic */ void t1(b bVar, p7.q qVar) {
    }

    private b.a z1(androidx.media3.exoplayer.source.r.b bVar) {
        s7.a.f(this.f794g);
        p7.r0 r0VarF = bVar == null ? null : this.f791d.f(bVar);
        if (bVar != null && r0VarF != null) {
            return A1(r0VarF, r0VarF.l(bVar.f11103a, this.f789b).f101462c, bVar);
        }
        int iR = this.f794g.R();
        p7.r0 r0VarJ = this.f794g.J();
        if (iR >= r0VarJ.t()) {
            r0VarJ = p7.r0.f101451a;
        }
        return A1(r0VarJ, iR, null);
    }

    @Override // a8.a
    public final void A(final z7.b bVar) {
        final b.a aVarD1 = D1();
        H1(aVarD1, 1020, new s7.s.a() { // from class: a8.o0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).u0(aVarD1, bVar);
            }
        });
    }

    @RequiresNonNull({"player"})
    protected final b.a A1(p7.r0 r0Var, int i11, androidx.media3.exoplayer.source.r.b bVar) {
        androidx.media3.exoplayer.source.r.b bVar2 = r0Var.u() ? null : bVar;
        long jElapsedRealtime = this.f788a.elapsedRealtime();
        boolean z11 = r0Var.equals(this.f794g.J()) && i11 == this.f794g.R();
        long jC = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z11) {
                jC = this.f794g.Q();
            } else if (!r0Var.u()) {
                jC = r0Var.r(i11, this.f790c).c();
            }
        } else if (z11 && this.f794g.r() == bVar2.f11104b && this.f794g.z() == bVar2.f11105c) {
            jC = this.f794g.D();
        }
        return new b.a(jElapsedRealtime, r0Var, i11, bVar2, jC, this.f794g.J(), this.f794g.R(), this.f791d.d(), this.f794g.D(), this.f794g.n());
    }

    @Override // p7.j0.d
    public void B(final r7.e eVar) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 27, new s7.s.a() { // from class: a8.j0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).q0(aVarY1, eVar);
            }
        });
    }

    @Override // a8.a
    public final void C(List<androidx.media3.exoplayer.source.r.b> list, androidx.media3.exoplayer.source.r.b bVar) {
        this.f791d.k(list, bVar, (p7.j0) s7.a.f(this.f794g));
    }

    @Override // p7.j0.d
    public void D(final p7.m mVar) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 29, new s7.s.a() { // from class: a8.b0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).z0(aVarY1, mVar);
            }
        });
    }

    @Override // p7.j0.d
    public final void E(final p7.d dVar) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 20, new s7.s.a() { // from class: a8.l
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).F(aVarE1, dVar);
            }
        });
    }

    @Override // p7.j0.d
    public final void F(final PlaybackException playbackException) {
        final b.a aVarF1 = F1(playbackException);
        H1(aVarF1, 10, new s7.s.a() { // from class: a8.z
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).x0(aVarF1, playbackException);
            }
        });
    }

    @Override // a8.a
    public void G(b bVar) {
        s7.a.f(bVar);
        this.f793f.c(bVar);
    }

    @Override // p7.j0.d
    public final void H(final p7.j0.e eVar, final p7.j0.e eVar2, final int i11) {
        if (i11 == 1) {
            this.f796i = false;
        }
        this.f791d.j((p7.j0) s7.a.f(this.f794g));
        final b.a aVarY1 = y1();
        H1(aVarY1, 11, new s7.s.a() { // from class: a8.f0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                w1.T0(aVarY1, i11, eVar, eVar2, (b) obj);
            }
        });
    }

    protected final void H1(b.a aVar, int i11, s7.s.a<b> aVar2) {
        this.f792e.put(i11, aVar);
        this.f793f.k(i11, aVar2);
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void I(int i11, androidx.media3.exoplayer.source.r.b bVar, final n8.i iVar, final n8.j jVar) {
        final b.a aVarC1 = C1(i11, bVar);
        H1(aVarC1, 1002, new s7.s.a() { // from class: a8.y0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).r(aVarC1, iVar, jVar);
            }
        });
    }

    @Override // a8.a
    public void J(final p7.j0 j0Var, Looper looper) {
        s7.a.h(this.f794g == null || this.f791d.f798b.isEmpty());
        this.f794g = (p7.j0) s7.a.f(j0Var);
        this.f795h = this.f788a.c(looper, null);
        this.f793f = this.f793f.e(looper, new s7.s.b() { // from class: a8.j
            @Override // s7.s.b
            public final void a(Object obj, p7.q qVar) {
                b bVar = (b) obj;
                bVar.f0(j0Var, new b.C0024b(qVar, this.f650a.f792e));
            }
        });
    }

    @Override // p7.j0.d
    public void K(final p7.w0 w0Var) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 19, new s7.s.a() { // from class: a8.t1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).A(aVarY1, w0Var);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void L(int i11, androidx.media3.exoplayer.source.r.b bVar, final n8.j jVar) {
        final b.a aVarC1 = C1(i11, bVar);
        H1(aVarC1, 1005, new s7.s.a() { // from class: a8.k1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).X(aVarC1, jVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void M(int i11, androidx.media3.exoplayer.source.r.b bVar, final n8.i iVar, final n8.j jVar, final int i12) {
        final b.a aVarC1 = C1(i11, bVar);
        H1(aVarC1, 1000, new s7.s.a() { // from class: a8.p0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                w1.t0(aVarC1, iVar, jVar, i12, (b) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void N(int i11, androidx.media3.exoplayer.source.r.b bVar) {
        final b.a aVarC1 = C1(i11, bVar);
        H1(aVarC1, 1027, new s7.s.a() { // from class: a8.l1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).U(aVarC1);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void O(int i11, androidx.media3.exoplayer.source.r.b bVar, final n8.i iVar, final n8.j jVar, final IOException iOException, final boolean z11) {
        final b.a aVarC1 = C1(i11, bVar);
        H1(aVarC1, 1003, new s7.s.a() { // from class: a8.t0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).q(aVarC1, iVar, jVar, iOException, z11);
            }
        });
    }

    @Override // a8.a
    public void P(b bVar) {
        this.f793f.j(bVar);
    }

    @Override // p7.j0.d
    public void Q(final p7.e0 e0Var) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 15, new s7.s.a() { // from class: a8.c0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).R(aVarY1, e0Var);
            }
        });
    }

    @Override // p7.j0.d
    public void R(final p7.j0.b bVar) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 13, new s7.s.a() { // from class: a8.e
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).A0(aVarY1, bVar);
            }
        });
    }

    @Override // p7.j0.d
    public void S(final p7.a1 a1Var) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 2, new s7.s.a() { // from class: a8.y
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).d0(aVarY1, a1Var);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void T(int i11, androidx.media3.exoplayer.source.r.b bVar, final n8.i iVar, final n8.j jVar) {
        final b.a aVarC1 = C1(i11, bVar);
        H1(aVarC1, 1001, new s7.s.a() { // from class: a8.c1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).K(aVarC1, iVar, jVar);
            }
        });
    }

    @Override // p7.j0.d
    public final void U(final p7.y yVar, final int i11) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 1, new s7.s.a() { // from class: a8.g
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).c(aVarY1, yVar, i11);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void W(int i11, androidx.media3.exoplayer.source.r.b bVar, final int i12) {
        final b.a aVarC1 = C1(i11, bVar);
        H1(aVarC1, 1022, new s7.s.a() { // from class: a8.a1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                w1.h0(aVarC1, i12, (b) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void X(int i11, androidx.media3.exoplayer.source.r.b bVar) {
        final b.a aVarC1 = C1(i11, bVar);
        H1(aVarC1, 1026, new s7.s.a() { // from class: a8.o1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).H(aVarC1);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void Y(int i11, androidx.media3.exoplayer.source.r.b bVar, final Exception exc) {
        final b.a aVarC1 = C1(i11, bVar);
        H1(aVarC1, 1024, new s7.s.a() { // from class: a8.b1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).t(aVarC1, exc);
            }
        });
    }

    @Override // p7.j0.d
    public void Z(final p7.e0 e0Var) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 14, new s7.s.a() { // from class: a8.u0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).w0(aVarY1, e0Var);
            }
        });
    }

    @Override // a8.a
    public final void a(final Exception exc) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 1014, new s7.s.a() { // from class: a8.m1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).p0(aVarE1, exc);
            }
        });
    }

    @Override // p7.j0.d
    public final void a0(p7.r0 r0Var, final int i11) {
        this.f791d.l((p7.j0) s7.a.f(this.f794g));
        final b.a aVarY1 = y1();
        H1(aVarY1, 0, new s7.s.a() { // from class: a8.f
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).b(aVarY1, i11);
            }
        });
    }

    @Override // p7.j0.d
    public final void b(final p7.e1 e1Var) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 25, new s7.s.a() { // from class: a8.d0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                w1.s0(aVarE1, e1Var, (b) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void b0(int i11, androidx.media3.exoplayer.source.r.b bVar) {
        final b.a aVarC1 = C1(i11, bVar);
        H1(aVarC1, 1025, new s7.s.a() { // from class: a8.p1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).B0(aVarC1);
            }
        });
    }

    @Override // a8.a
    public final void c(final String str) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 1019, new s7.s.a() { // from class: a8.r
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).m(aVarE1, str);
            }
        });
    }

    @Override // a8.a
    public void c0(final int i11, final int i12, final boolean z11) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 1033, new s7.s.a() { // from class: a8.v
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).l0(aVarE1, i11, i12, z11);
            }
        });
    }

    @Override // a8.a
    public final void d(final String str) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 1012, new s7.s.a() { // from class: a8.d
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).w(aVarE1, str);
            }
        });
    }

    @Override // p7.j0.d
    public void d0(final PlaybackException playbackException) {
        final b.a aVarF1 = F1(playbackException);
        H1(aVarF1, 10, new s7.s.a() { // from class: a8.s
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).r0(aVarF1, playbackException);
            }
        });
    }

    @Override // a8.a
    public final void e(final String str, final long j11, final long j12) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 1008, new s7.s.a() { // from class: a8.p
            @Override // s7.s.a
            public final void invoke(Object obj) {
                w1.j0(aVarE1, str, j12, j11, (b) obj);
            }
        });
    }

    @Override // a8.a
    public final void f(final int i11, final long j11) {
        final b.a aVarD1 = D1();
        H1(aVarD1, 1018, new s7.s.a() { // from class: a8.w0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).g(aVarD1, i11, j11);
            }
        });
    }

    @Override // a8.a
    public final void g(final Exception exc) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 1029, new s7.s.a() { // from class: a8.i0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).B(aVarE1, exc);
            }
        });
    }

    @Override // a8.a
    public final void h(final long j11, final int i11) {
        final b.a aVarD1 = D1();
        H1(aVarD1, 1021, new s7.s.a() { // from class: a8.x0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).n(aVarD1, j11, i11);
            }
        });
    }

    @Override // a8.a
    public final void i(final String str, final long j11, final long j12) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 1016, new s7.s.a() { // from class: a8.k0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                w1.D0(aVarE1, str, j12, j11, (b) obj);
            }
        });
    }

    @Override // a8.a
    public final void j(final long j11) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 1010, new s7.s.a() { // from class: a8.v0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).I(aVarE1, j11);
            }
        });
    }

    @Override // a8.a
    public final void k(final Exception exc) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 1030, new s7.s.a() { // from class: a8.i
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).c0(aVarE1, exc);
            }
        });
    }

    @Override // a8.a
    public final void l(final Object obj, final long j11) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 26, new s7.s.a() { // from class: a8.j1
            @Override // s7.s.a
            public final void invoke(Object obj2) {
                ((b) obj2).j0(aVarE1, obj, j11);
            }
        });
    }

    @Override // a8.a
    public final void m(final int i11, final long j11, final long j12) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 1011, new s7.s.a() { // from class: a8.s0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).C0(aVarE1, i11, j11, j12);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void n(int i11, androidx.media3.exoplayer.source.r.b bVar, final n8.j jVar) {
        final b.a aVarC1 = C1(i11, bVar);
        H1(aVarC1, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, new s7.s.a() { // from class: a8.n0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).E(aVarC1, jVar);
            }
        });
    }

    @Override // a8.a
    public void o(final AudioSink.a aVar) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 1031, new s7.s.a() { // from class: a8.e1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).h0(aVarE1, aVar);
            }
        });
    }

    @Override // p7.j0.d
    public final void onAudioSessionIdChanged(final int i11) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 21, new s7.s.a() { // from class: a8.g1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).s(aVarE1, i11);
            }
        });
    }

    @Override // p7.j0.d
    public void onCues(final List<r7.a> list) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 27, new s7.s.a() { // from class: a8.w
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).D(aVarY1, list);
            }
        });
    }

    @Override // p7.j0.d
    public void onDeviceVolumeChanged(final int i11, final boolean z11) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 30, new s7.s.a() { // from class: a8.t
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).P(aVarY1, i11, z11);
            }
        });
    }

    @Override // p7.j0.d
    public final void onIsLoadingChanged(final boolean z11) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 3, new s7.s.a() { // from class: a8.v1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                w1.K0(aVarY1, z11, (b) obj);
            }
        });
    }

    @Override // p7.j0.d
    public void onIsPlayingChanged(final boolean z11) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 7, new s7.s.a() { // from class: a8.o
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).M(aVarY1, z11);
            }
        });
    }

    @Override // p7.j0.d
    public void onMaxSeekToPreviousPositionChanged(final long j11) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 18, new s7.s.a() { // from class: a8.q1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).t0(aVarY1, j11);
            }
        });
    }

    @Override // p7.j0.d
    public final void onPlayWhenReadyChanged(final boolean z11, final int i11) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 5, new s7.s.a() { // from class: a8.u
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).G(aVarY1, z11, i11);
            }
        });
    }

    @Override // p7.j0.d
    public final void onPlaybackStateChanged(final int i11) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 4, new s7.s.a() { // from class: a8.a0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).a0(aVarY1, i11);
            }
        });
    }

    @Override // p7.j0.d
    public final void onPlaybackSuppressionReasonChanged(final int i11) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 6, new s7.s.a() { // from class: a8.q
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).g0(aVarY1, i11);
            }
        });
    }

    @Override // p7.j0.d
    public final void onPlayerStateChanged(final boolean z11, final int i11) {
        final b.a aVarY1 = y1();
        H1(aVarY1, -1, new s7.s.a() { // from class: a8.k
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).i(aVarY1, z11, i11);
            }
        });
    }

    @Override // p7.j0.d
    public final void onRepeatModeChanged(final int i11) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 8, new s7.s.a() { // from class: a8.h0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).j(aVarY1, i11);
            }
        });
    }

    @Override // p7.j0.d
    public void onSeekBackIncrementChanged(final long j11) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 16, new s7.s.a() { // from class: a8.f1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).C(aVarY1, j11);
            }
        });
    }

    @Override // p7.j0.d
    public void onSeekForwardIncrementChanged(final long j11) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 17, new s7.s.a() { // from class: a8.u1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).W(aVarY1, j11);
            }
        });
    }

    @Override // p7.j0.d
    public final void onShuffleModeEnabledChanged(final boolean z11) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 9, new s7.s.a() { // from class: a8.l0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).Y(aVarY1, z11);
            }
        });
    }

    @Override // p7.j0.d
    public final void onSkipSilenceEnabledChanged(final boolean z11) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 23, new s7.s.a() { // from class: a8.n1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).o0(aVarE1, z11);
            }
        });
    }

    @Override // p7.j0.d
    public final void onSurfaceSizeChanged(final int i11, final int i12) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 24, new s7.s.a() { // from class: a8.m0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).T(aVarE1, i11, i12);
            }
        });
    }

    @Override // p7.j0.d
    public final void onVolumeChanged(final float f11) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 22, new s7.s.a() { // from class: a8.h
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).p(aVarE1, f11);
            }
        });
    }

    @Override // a8.a
    public void p(final AudioSink.a aVar) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 1032, new s7.s.a() { // from class: a8.s1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).k0(aVarE1, aVar);
            }
        });
    }

    @Override // s8.d.a
    public final void q(final int i11, final long j11, final long j12) {
        final b.a aVarB1 = B1();
        H1(aVarB1, 1006, new s7.s.a() { // from class: a8.n
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).k(aVarB1, i11, j11, j12);
            }
        });
    }

    @Override // a8.a
    public final void r(final z7.b bVar) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 1007, new s7.s.a() { // from class: a8.r0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).S(aVarE1, bVar);
            }
        });
    }

    @Override // a8.a
    public void release() {
        ((s7.p) s7.a.j(this.f795h)).g(new Runnable() { // from class: a8.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f628a.G1();
            }
        });
    }

    @Override // a8.a
    public final void s(final p7.u uVar, final z7.c cVar) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 1017, new s7.s.a() { // from class: a8.d1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).e0(aVarE1, uVar, cVar);
            }
        });
    }

    @Override // p7.j0.d
    public final void t(final p7.f0 f0Var) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 28, new s7.s.a() { // from class: a8.m
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).s0(aVarY1, f0Var);
            }
        });
    }

    @Override // a8.a
    public final void u(final z7.b bVar) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 1015, new s7.s.a() { // from class: a8.i1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).O(aVarE1, bVar);
            }
        });
    }

    @Override // p7.j0.d
    public final void v(final p7.i0 i0Var) {
        final b.a aVarY1 = y1();
        H1(aVarY1, 12, new s7.s.a() { // from class: a8.c
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).Q(aVarY1, i0Var);
            }
        });
    }

    @Override // a8.a
    public final void w(final z7.b bVar) {
        final b.a aVarD1 = D1();
        H1(aVarD1, 1013, new s7.s.a() { // from class: a8.z0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).J(aVarD1, bVar);
            }
        });
    }

    @Override // a8.a
    public final void x() {
        if (this.f796i) {
            return;
        }
        final b.a aVarY1 = y1();
        this.f796i = true;
        H1(aVarY1, -1, new s7.s.a() { // from class: a8.e0
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).z(aVarY1);
            }
        });
    }

    @Override // a8.a
    public final void y(final p7.u uVar, final z7.c cVar) {
        final b.a aVarE1 = E1();
        H1(aVarE1, 1009, new s7.s.a() { // from class: a8.h1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).l(aVarE1, uVar, cVar);
            }
        });
    }

    protected final b.a y1() {
        return z1(this.f791d.d());
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void z(int i11, androidx.media3.exoplayer.source.r.b bVar) {
        final b.a aVarC1 = C1(i11, bVar);
        H1(aVarC1, 1023, new s7.s.a() { // from class: a8.r1
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarC1);
            }
        });
    }

    @Override // p7.j0.d
    public void onRenderedFirstFrame() {
    }

    @Override // p7.j0.d
    public void onLoadingChanged(boolean z11) {
    }

    @Override // p7.j0.d
    public void onPositionDiscontinuity(int i11) {
    }

    @Override // p7.j0.d
    public void V(p7.j0 j0Var, p7.j0.c cVar) {
    }
}
