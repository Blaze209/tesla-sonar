package cr;

import android.util.SparseArray;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.v1;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface b {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f58910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f2 f58911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f58912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.o.b f58913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f58914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final f2 f58915f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f58916g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.o.b f58917h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f58918i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f58919j;

        public a(long j11, f2 f2Var, int i11, com.google.android.exoplayer2.source.o.b bVar, long j12, f2 f2Var2, int i12, com.google.android.exoplayer2.source.o.b bVar2, long j13, long j14) {
            this.f58910a = j11;
            this.f58911b = f2Var;
            this.f58912c = i11;
            this.f58913d = bVar;
            this.f58914e = j12;
            this.f58915f = f2Var2;
            this.f58916g = i12;
            this.f58917h = bVar2;
            this.f58918i = j13;
            this.f58919j = j14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f58910a == aVar.f58910a && this.f58912c == aVar.f58912c && this.f58914e == aVar.f58914e && this.f58916g == aVar.f58916g && this.f58918i == aVar.f58918i && this.f58919j == aVar.f58919j && ou.l.a(this.f58911b, aVar.f58911b) && ou.l.a(this.f58913d, aVar.f58913d) && ou.l.a(this.f58915f, aVar.f58915f) && ou.l.a(this.f58917h, aVar.f58917h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ou.l.b(Long.valueOf(this.f58910a), this.f58911b, Integer.valueOf(this.f58912c), this.f58913d, Long.valueOf(this.f58914e), this.f58915f, Integer.valueOf(this.f58916g), this.f58917h, Long.valueOf(this.f58918i), Long.valueOf(this.f58919j));
        }
    }

    /* JADX INFO: renamed from: cr.b$b, reason: collision with other inner class name */
    public static final class C1204b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ts.o f58920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<a> f58921b;

        public C1204b(ts.o oVar, SparseArray<a> sparseArray) {
            this.f58920a = oVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(oVar.d());
            for (int i11 = 0; i11 < oVar.d(); i11++) {
                int iC = oVar.c(i11);
                sparseArray2.append(iC, (a) ts.a.e(sparseArray.get(iC)));
            }
            this.f58921b = sparseArray2;
        }

        public boolean a(int i11) {
            return this.f58920a.a(i11);
        }

        public int b(int i11) {
            return this.f58920a.c(i11);
        }

        public a c(int i11) {
            return (a) ts.a.e(this.f58921b.get(i11));
        }

        public int d() {
            return this.f58920a.d();
        }
    }

    default void I(a aVar) {
    }

    default void O(a aVar) {
    }

    @Deprecated
    default void j(a aVar) {
    }

    default void k(a aVar) {
    }

    default void l0(a aVar) {
    }

    @Deprecated
    default void m(a aVar) {
    }

    default void t(a aVar) {
    }

    default void A(a aVar, int i11) {
    }

    @Deprecated
    default void B(a aVar, com.google.android.exoplayer2.u0 u0Var) {
    }

    default void D(v1 v1Var, C1204b c1204b) {
    }

    default void L(a aVar, boolean z11) {
    }

    @Deprecated
    default void P(a aVar, int i11) {
    }

    default void R(a aVar, g2 g2Var) {
    }

    default void S(a aVar, Exception exc) {
    }

    default void T(a aVar, Exception exc) {
    }

    default void U(a aVar, int i11) {
    }

    default void W(a aVar, u1 u1Var) {
    }

    @Deprecated
    default void X(a aVar, boolean z11) {
    }

    default void Y(a aVar, PlaybackException playbackException) {
    }

    default void a(a aVar, fr.e eVar) {
    }

    default void a0(a aVar, String str) {
    }

    @Deprecated
    default void b(a aVar, List<gs.b> list) {
    }

    default void b0(a aVar, boolean z11) {
    }

    default void c(a aVar, boolean z11) {
    }

    @Deprecated
    default void c0(a aVar, com.google.android.exoplayer2.u0 u0Var) {
    }

    default void d(a aVar, Exception exc) {
    }

    default void e(a aVar, fr.e eVar) {
    }

    default void e0(a aVar, Exception exc) {
    }

    default void f0(a aVar, us.z zVar) {
    }

    default void i(a aVar, boolean z11) {
    }

    default void i0(a aVar, fr.e eVar) {
    }

    default void n(a aVar, es.i iVar) {
    }

    default void n0(a aVar, v1.b bVar) {
    }

    default void o(a aVar, fr.e eVar) {
    }

    default void o0(a aVar, PlaybackException playbackException) {
    }

    default void p0(a aVar, ur.a aVar2) {
    }

    default void q(a aVar, com.google.android.exoplayer2.j jVar) {
    }

    default void r(a aVar, long j11) {
    }

    default void s(a aVar, int i11) {
    }

    default void s0(a aVar, com.google.android.exoplayer2.y0 y0Var) {
    }

    default void u(a aVar, qs.y yVar) {
    }

    default void v(a aVar, String str) {
    }

    default void w(a aVar, int i11) {
    }

    default void y(a aVar, int i11) {
    }

    default void z(a aVar, gs.f fVar) {
    }

    default void C(a aVar, int i11, long j11) {
    }

    default void J(a aVar, long j11, int i11) {
    }

    default void N(a aVar, boolean z11, int i11) {
    }

    default void Z(a aVar, int i11, int i12) {
    }

    default void d0(a aVar, es.h hVar, es.i iVar) {
    }

    default void f(a aVar, Object obj, long j11) {
    }

    default void g(a aVar, com.google.android.exoplayer2.x0 x0Var, int i11) {
    }

    default void g0(a aVar, com.google.android.exoplayer2.u0 u0Var, fr.g gVar) {
    }

    @Deprecated
    default void h0(a aVar, String str, long j11) {
    }

    @Deprecated
    default void j0(a aVar, boolean z11, int i11) {
    }

    default void k0(a aVar, es.h hVar, es.i iVar) {
    }

    default void l(a aVar, int i11, boolean z11) {
    }

    default void m0(a aVar, com.google.android.exoplayer2.u0 u0Var, fr.g gVar) {
    }

    default void r0(a aVar, es.h hVar, es.i iVar) {
    }

    @Deprecated
    default void x(a aVar, String str, long j11) {
    }

    default void M(a aVar, int i11, long j11, long j12) {
    }

    default void Q(a aVar, String str, long j11, long j12) {
    }

    default void h(a aVar, int i11, long j11, long j12) {
    }

    default void p(a aVar, String str, long j11, long j12) {
    }

    default void q0(a aVar, v1.e eVar, v1.e eVar2, int i11) {
    }

    @Deprecated
    default void H(a aVar, int i11, int i12, int i13, float f11) {
    }

    default void V(a aVar, es.h hVar, es.i iVar, IOException iOException, boolean z11) {
    }
}
