package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.u0;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface p {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o.b f40505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0652a> f40506c;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.source.p$a$a, reason: collision with other inner class name */
        private static final class C0652a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f40507a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public p f40508b;

            public C0652a(Handler handler, p pVar) {
                this.f40507a = handler;
                this.f40508b = pVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void f(Handler handler, p pVar) {
            ts.a.e(handler);
            ts.a.e(pVar);
            this.f40506c.add(new C0652a(handler, pVar));
        }

        public void g(int i11, u0 u0Var, int i12, Object obj, long j11) {
            h(new es.i(1, i11, u0Var, i12, obj, p0.Z0(j11), -9223372036854775807L));
        }

        public void h(final es.i iVar) {
            for (C0652a c0652a : this.f40506c) {
                final p pVar = c0652a.f40508b;
                p0.J0(c0652a.f40507a, new Runnable() { // from class: es.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.source.p.a aVar = this.f63180a;
                        pVar.y(aVar.f40504a, aVar.f40505b, iVar);
                    }
                });
            }
        }

        public void i(es.h hVar, int i11, int i12, u0 u0Var, int i13, Object obj, long j11, long j12) {
            j(hVar, new es.i(i11, i12, u0Var, i13, obj, p0.Z0(j11), p0.Z0(j12)));
        }

        public void j(final es.h hVar, final es.i iVar) {
            for (C0652a c0652a : this.f40506c) {
                final p pVar = c0652a.f40508b;
                p0.J0(c0652a.f40507a, new Runnable() { // from class: es.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.source.p.a aVar = this.f63172a;
                        pVar.u(aVar.f40504a, aVar.f40505b, hVar, iVar);
                    }
                });
            }
        }

        public void k(es.h hVar, int i11, int i12, u0 u0Var, int i13, Object obj, long j11, long j12) {
            l(hVar, new es.i(i11, i12, u0Var, i13, obj, p0.Z0(j11), p0.Z0(j12)));
        }

        public void l(final es.h hVar, final es.i iVar) {
            for (C0652a c0652a : this.f40506c) {
                final p pVar = c0652a.f40508b;
                p0.J0(c0652a.f40507a, new Runnable() { // from class: es.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.source.p.a aVar = this.f63162a;
                        pVar.n(aVar.f40504a, aVar.f40505b, hVar, iVar);
                    }
                });
            }
        }

        public void m(es.h hVar, int i11, int i12, u0 u0Var, int i13, Object obj, long j11, long j12, IOException iOException, boolean z11) {
            n(hVar, new es.i(i11, i12, u0Var, i13, obj, p0.Z0(j11), p0.Z0(j12)), iOException, z11);
        }

        public void n(final es.h hVar, final es.i iVar, final IOException iOException, final boolean z11) {
            for (C0652a c0652a : this.f40506c) {
                final p pVar = c0652a.f40508b;
                p0.J0(c0652a.f40507a, new Runnable() { // from class: es.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.source.p.a aVar = this.f63166a;
                        pVar.v(aVar.f40504a, aVar.f40505b, hVar, iVar, iOException, z11);
                    }
                });
            }
        }

        public void o(es.h hVar, int i11, int i12, u0 u0Var, int i13, Object obj, long j11, long j12) {
            p(hVar, new es.i(i11, i12, u0Var, i13, obj, p0.Z0(j11), p0.Z0(j12)));
        }

        public void p(final es.h hVar, final es.i iVar) {
            for (C0652a c0652a : this.f40506c) {
                final p pVar = c0652a.f40508b;
                p0.J0(c0652a.f40507a, new Runnable() { // from class: es.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.source.p.a aVar = this.f63176a;
                        pVar.C(aVar.f40504a, aVar.f40505b, hVar, iVar);
                    }
                });
            }
        }

        public void q(p pVar) {
            for (C0652a c0652a : this.f40506c) {
                if (c0652a.f40508b == pVar) {
                    this.f40506c.remove(c0652a);
                }
            }
        }

        public a r(int i11, o.b bVar) {
            return new a(this.f40506c, i11, bVar);
        }

        private a(CopyOnWriteArrayList<C0652a> copyOnWriteArrayList, int i11, o.b bVar) {
            this.f40506c = copyOnWriteArrayList;
            this.f40504a = i11;
            this.f40505b = bVar;
        }
    }

    default void y(int i11, o.b bVar, es.i iVar) {
    }

    default void C(int i11, o.b bVar, es.h hVar, es.i iVar) {
    }

    default void n(int i11, o.b bVar, es.h hVar, es.i iVar) {
    }

    default void u(int i11, o.b bVar, es.h hVar, es.i iVar) {
    }

    default void v(int i11, o.b bVar, es.h hVar, es.i iVar, IOException iOException, boolean z11) {
    }
}
