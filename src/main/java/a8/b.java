package a8;

import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p7.r0 f583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f584c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.r.b f585d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f586e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final p7.r0 f587f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f588g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.r.b f589h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f590i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f591j;

        public a(long j11, p7.r0 r0Var, int i11, androidx.media3.exoplayer.source.r.b bVar, long j12, p7.r0 r0Var2, int i12, androidx.media3.exoplayer.source.r.b bVar2, long j13, long j14) {
            this.f582a = j11;
            this.f583b = r0Var;
            this.f584c = i11;
            this.f585d = bVar;
            this.f586e = j12;
            this.f587f = r0Var2;
            this.f588g = i12;
            this.f589h = bVar2;
            this.f590i = j13;
            this.f591j = j14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f582a == aVar.f582a && this.f584c == aVar.f584c && this.f586e == aVar.f586e && this.f588g == aVar.f588g && this.f590i == aVar.f590i && this.f591j == aVar.f591j && Objects.equals(this.f583b, aVar.f583b) && Objects.equals(this.f585d, aVar.f585d) && Objects.equals(this.f587f, aVar.f587f) && Objects.equals(this.f589h, aVar.f589h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f582a), this.f583b, Integer.valueOf(this.f584c), this.f585d, Long.valueOf(this.f586e), this.f587f, Integer.valueOf(this.f588g), this.f589h, Long.valueOf(this.f590i), Long.valueOf(this.f591j));
        }
    }

    /* JADX INFO: renamed from: a8.b$b, reason: collision with other inner class name */
    public static final class C0024b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p7.q f592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<a> f593b;

        public C0024b(p7.q qVar, SparseArray<a> sparseArray) {
            this.f592a = qVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(qVar.d());
            for (int i11 = 0; i11 < qVar.d(); i11++) {
                int iC = qVar.c(i11);
                sparseArray2.append(iC, (a) s7.a.f(sparseArray.get(iC)));
            }
            this.f593b = sparseArray2;
        }

        public boolean a(int i11) {
            return this.f592a.a(i11);
        }

        public int b(int i11) {
            return this.f592a.c(i11);
        }

        public a c(int i11) {
            return (a) s7.a.f(this.f593b.get(i11));
        }

        public int d() {
            return this.f592a.d();
        }
    }

    default void B0(a aVar) {
    }

    default void H(a aVar) {
    }

    default void U(a aVar) {
    }

    default void V(a aVar) {
    }

    default void a(a aVar) {
    }

    @Deprecated
    default void u(a aVar) {
    }

    @Deprecated
    default void z(a aVar) {
    }

    default void A(a aVar, p7.w0 w0Var) {
    }

    default void A0(a aVar, p7.j0.b bVar) {
    }

    default void B(a aVar, Exception exc) {
    }

    default void C(a aVar, long j11) {
    }

    @Deprecated
    default void D(a aVar, List<r7.a> list) {
    }

    default void E(a aVar, n8.j jVar) {
    }

    default void F(a aVar, p7.d dVar) {
    }

    default void I(a aVar, long j11) {
    }

    default void J(a aVar, z7.b bVar) {
    }

    default void M(a aVar, boolean z11) {
    }

    default void O(a aVar, z7.b bVar) {
    }

    default void Q(a aVar, p7.i0 i0Var) {
    }

    default void R(a aVar, p7.e0 e0Var) {
    }

    default void S(a aVar, z7.b bVar) {
    }

    default void W(a aVar, long j11) {
    }

    default void X(a aVar, n8.j jVar) {
    }

    default void Y(a aVar, boolean z11) {
    }

    default void a0(a aVar, int i11) {
    }

    default void b(a aVar, int i11) {
    }

    default void c0(a aVar, Exception exc) {
    }

    default void d0(a aVar, p7.a1 a1Var) {
    }

    default void f0(p7.j0 j0Var, C0024b c0024b) {
    }

    default void g0(a aVar, int i11) {
    }

    default void h0(a aVar, AudioSink.a aVar2) {
    }

    default void j(a aVar, int i11) {
    }

    default void k0(a aVar, AudioSink.a aVar2) {
    }

    default void m(a aVar, String str) {
    }

    default void m0(a aVar, p7.e1 e1Var) {
    }

    @Deprecated
    default void o(a aVar, boolean z11) {
    }

    default void o0(a aVar, boolean z11) {
    }

    default void p(a aVar, float f11) {
    }

    default void p0(a aVar, Exception exc) {
    }

    default void q0(a aVar, r7.e eVar) {
    }

    default void r0(a aVar, PlaybackException playbackException) {
    }

    default void s(a aVar, int i11) {
    }

    default void s0(a aVar, p7.f0 f0Var) {
    }

    default void t(a aVar, Exception exc) {
    }

    default void t0(a aVar, long j11) {
    }

    default void u0(a aVar, z7.b bVar) {
    }

    default void v(a aVar, int i11) {
    }

    @Deprecated
    default void v0(a aVar, int i11) {
    }

    default void w(a aVar, String str) {
    }

    default void w0(a aVar, p7.e0 e0Var) {
    }

    default void x(a aVar, boolean z11) {
    }

    default void x0(a aVar, PlaybackException playbackException) {
    }

    default void z0(a aVar, p7.m mVar) {
    }

    default void G(a aVar, boolean z11, int i11) {
    }

    default void K(a aVar, n8.i iVar, n8.j jVar) {
    }

    @Deprecated
    default void N(a aVar, n8.i iVar, n8.j jVar) {
    }

    default void P(a aVar, int i11, boolean z11) {
    }

    default void T(a aVar, int i11, int i12) {
    }

    @Deprecated
    default void b0(a aVar, String str, long j11) {
    }

    default void c(a aVar, p7.y yVar, int i11) {
    }

    @Deprecated
    default void d(a aVar, String str, long j11) {
    }

    default void e0(a aVar, p7.u uVar, z7.c cVar) {
    }

    default void g(a aVar, int i11, long j11) {
    }

    @Deprecated
    default void i(a aVar, boolean z11, int i11) {
    }

    default void j0(a aVar, Object obj, long j11) {
    }

    default void l(a aVar, p7.u uVar, z7.c cVar) {
    }

    default void n(a aVar, long j11, int i11) {
    }

    default void r(a aVar, n8.i iVar, n8.j jVar) {
    }

    default void C0(a aVar, int i11, long j11, long j12) {
    }

    default void L(a aVar, n8.i iVar, n8.j jVar, int i11) {
    }

    default void h(a aVar, String str, long j11, long j12) {
    }

    default void i0(a aVar, String str, long j11, long j12) {
    }

    default void k(a aVar, int i11, long j11, long j12) {
    }

    default void l0(a aVar, int i11, int i12, boolean z11) {
    }

    default void y(a aVar, p7.j0.e eVar, p7.j0.e eVar2, int i11) {
    }

    @Deprecated
    default void f(a aVar, int i11, int i12, int i13, float f11) {
    }

    default void q(a aVar, n8.i iVar, n8.j jVar, IOException iOException, boolean z11) {
    }
}
