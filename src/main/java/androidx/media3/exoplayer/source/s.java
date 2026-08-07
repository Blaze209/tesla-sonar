package androidx.media3.exoplayer.source;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public interface s {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r.b f11109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0204a> f11110c;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.source.s$a$a, reason: collision with other inner class name */
        private static final class C0204a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f11111a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public s f11112b;

            public C0204a(Handler handler, s sVar) {
                this.f11111a = handler;
                this.f11112b = sVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public a A(int i11, r.b bVar) {
            return new a(this.f11110c, i11, bVar);
        }

        public void h(Handler handler, s sVar) {
            s7.a.f(handler);
            s7.a.f(sVar);
            this.f11110c.add(new C0204a(handler, sVar));
        }

        public void i(final s7.n<s> nVar) {
            for (C0204a c0204a : this.f11110c) {
                final s sVar = c0204a.f11112b;
                q0.m1(c0204a.f11111a, new Runnable() { // from class: n8.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        nVar.accept(sVar);
                    }
                });
            }
        }

        public void j(int i11, p7.u uVar, int i12, Object obj, long j11) {
            k(new n8.j(1, i11, uVar, i12, obj, q0.O1(j11), -9223372036854775807L));
        }

        public void k(final n8.j jVar) {
            i(new s7.n() { // from class: n8.k
                @Override // s7.n
                public final void accept(Object obj) {
                    androidx.media3.exoplayer.source.s.a aVar = this.f93571a;
                    ((androidx.media3.exoplayer.source.s) obj).n(aVar.f11108a, aVar.f11109b, jVar);
                }
            });
        }

        public void l(n8.i iVar, int i11) {
            m(iVar, i11, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void m(n8.i iVar, int i11, int i12, p7.u uVar, int i13, Object obj, long j11, long j12) {
            n(iVar, new n8.j(i11, i12, uVar, i13, obj, q0.O1(j11), q0.O1(j12)));
        }

        public void n(final n8.i iVar, final n8.j jVar) {
            i(new s7.n() { // from class: n8.o
                @Override // s7.n
                public final void accept(Object obj) {
                    androidx.media3.exoplayer.source.s.a aVar = this.f93585a;
                    ((androidx.media3.exoplayer.source.s) obj).I(aVar.f11108a, aVar.f11109b, iVar, jVar);
                }
            });
        }

        public void o(n8.i iVar, int i11) {
            p(iVar, i11, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void p(n8.i iVar, int i11, int i12, p7.u uVar, int i13, Object obj, long j11, long j12) {
            q(iVar, new n8.j(i11, i12, uVar, i13, obj, q0.O1(j11), q0.O1(j12)));
        }

        public void q(final n8.i iVar, final n8.j jVar) {
            i(new s7.n() { // from class: n8.m
                @Override // s7.n
                public final void accept(Object obj) {
                    androidx.media3.exoplayer.source.s.a aVar = this.f93577a;
                    ((androidx.media3.exoplayer.source.s) obj).T(aVar.f11108a, aVar.f11109b, iVar, jVar);
                }
            });
        }

        public void r(n8.i iVar, int i11, int i12, p7.u uVar, int i13, Object obj, long j11, long j12, IOException iOException, boolean z11) {
            t(iVar, new n8.j(i11, i12, uVar, i13, obj, q0.O1(j11), q0.O1(j12)), iOException, z11);
        }

        public void s(n8.i iVar, int i11, IOException iOException, boolean z11) {
            r(iVar, i11, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z11);
        }

        public void t(final n8.i iVar, final n8.j jVar, final IOException iOException, final boolean z11) {
            i(new s7.n() { // from class: n8.n
                @Override // s7.n
                public final void accept(Object obj) {
                    androidx.media3.exoplayer.source.s.a aVar = this.f93580a;
                    ((androidx.media3.exoplayer.source.s) obj).O(aVar.f11108a, aVar.f11109b, iVar, jVar, iOException, z11);
                }
            });
        }

        public void u(n8.i iVar, int i11, int i12) {
            v(iVar, i11, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i12);
        }

        public void v(n8.i iVar, int i11, int i12, p7.u uVar, int i13, Object obj, long j11, long j12, int i14) {
            w(iVar, new n8.j(i11, i12, uVar, i13, obj, q0.O1(j11), q0.O1(j12)), i14);
        }

        public void w(final n8.i iVar, final n8.j jVar, final int i11) {
            i(new s7.n() { // from class: n8.l
                @Override // s7.n
                public final void accept(Object obj) {
                    androidx.media3.exoplayer.source.s.a aVar = this.f93573a;
                    ((androidx.media3.exoplayer.source.s) obj).M(aVar.f11108a, aVar.f11109b, iVar, jVar, i11);
                }
            });
        }

        public void x(s sVar) {
            for (C0204a c0204a : this.f11110c) {
                if (c0204a.f11112b == sVar) {
                    this.f11110c.remove(c0204a);
                }
            }
        }

        public void y(int i11, long j11, long j12) {
            z(new n8.j(1, i11, null, 3, null, q0.O1(j11), q0.O1(j12)));
        }

        public void z(final n8.j jVar) {
            final r.b bVar = (r.b) s7.a.f(this.f11109b);
            i(new s7.n() { // from class: n8.p
                @Override // s7.n
                public final void accept(Object obj) {
                    androidx.media3.exoplayer.source.s sVar = (androidx.media3.exoplayer.source.s) obj;
                    sVar.L(this.f93588a.f11108a, bVar, jVar);
                }
            });
        }

        private a(CopyOnWriteArrayList<C0204a> copyOnWriteArrayList, int i11, r.b bVar) {
            this.f11110c = copyOnWriteArrayList;
            this.f11108a = i11;
            this.f11109b = bVar;
        }
    }

    default void L(int i11, r.b bVar, n8.j jVar) {
    }

    default void n(int i11, r.b bVar, n8.j jVar) {
    }

    default void I(int i11, r.b bVar, n8.i iVar, n8.j jVar) {
    }

    default void T(int i11, r.b bVar, n8.i iVar, n8.j jVar) {
    }

    default void M(int i11, r.b bVar, n8.i iVar, n8.j jVar, int i12) {
    }

    default void O(int i11, r.b bVar, n8.i iVar, n8.j jVar, IOException iOException, boolean z11) {
    }
}
