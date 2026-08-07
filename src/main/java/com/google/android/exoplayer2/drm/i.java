package com.google.android.exoplayer2.drm;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface i {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.o.b f39830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0650a> f39831c;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.i$a$a, reason: collision with other inner class name */
        private static final class C0650a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f39832a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public i f39833b;

            public C0650a(Handler handler, i iVar) {
                this.f39832a = handler;
                this.f39833b = iVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public static /* synthetic */ void d(a aVar, i iVar, int i11) {
            iVar.F(aVar.f39829a, aVar.f39830b);
            iVar.B(aVar.f39829a, aVar.f39830b, i11);
        }

        public void g(Handler handler, i iVar) {
            ts.a.e(handler);
            ts.a.e(iVar);
            this.f39831c.add(new C0650a(handler, iVar));
        }

        public void h() {
            for (C0650a c0650a : this.f39831c) {
                final i iVar = c0650a.f39833b;
                p0.J0(c0650a.f39832a, new Runnable() { // from class: gr.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.i.a aVar = this.f69365a;
                        iVar.A(aVar.f39829a, aVar.f39830b);
                    }
                });
            }
        }

        public void i() {
            for (C0650a c0650a : this.f39831c) {
                final i iVar = c0650a.f39833b;
                p0.J0(c0650a.f39832a, new Runnable() { // from class: gr.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.i.a aVar = this.f69361a;
                        iVar.E(aVar.f39829a, aVar.f39830b);
                    }
                });
            }
        }

        public void j() {
            for (C0650a c0650a : this.f39831c) {
                final i iVar = c0650a.f39833b;
                p0.J0(c0650a.f39832a, new Runnable() { // from class: gr.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.i.a aVar = this.f69363a;
                        iVar.D(aVar.f39829a, aVar.f39830b);
                    }
                });
            }
        }

        public void k(final int i11) {
            for (C0650a c0650a : this.f39831c) {
                final i iVar = c0650a.f39833b;
                p0.J0(c0650a.f39832a, new Runnable() { // from class: gr.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.i.a.d(this.f69358a, iVar, i11);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            for (C0650a c0650a : this.f39831c) {
                final i iVar = c0650a.f39833b;
                p0.J0(c0650a.f39832a, new Runnable() { // from class: gr.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.i.a aVar = this.f69353a;
                        iVar.G(aVar.f39829a, aVar.f39830b, exc);
                    }
                });
            }
        }

        public void m() {
            for (C0650a c0650a : this.f39831c) {
                final i iVar = c0650a.f39833b;
                p0.J0(c0650a.f39832a, new Runnable() { // from class: gr.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.i.a aVar = this.f69356a;
                        iVar.I(aVar.f39829a, aVar.f39830b);
                    }
                });
            }
        }

        public void n(i iVar) {
            for (C0650a c0650a : this.f39831c) {
                if (c0650a.f39833b == iVar) {
                    this.f39831c.remove(c0650a);
                }
            }
        }

        public a o(int i11, com.google.android.exoplayer2.source.o.b bVar) {
            return new a(this.f39831c, i11, bVar);
        }

        private a(CopyOnWriteArrayList<C0650a> copyOnWriteArrayList, int i11, com.google.android.exoplayer2.source.o.b bVar) {
            this.f39831c = copyOnWriteArrayList;
            this.f39829a = i11;
            this.f39830b = bVar;
        }
    }

    default void A(int i11, com.google.android.exoplayer2.source.o.b bVar) {
    }

    default void B(int i11, com.google.android.exoplayer2.source.o.b bVar, int i12) {
    }

    default void D(int i11, com.google.android.exoplayer2.source.o.b bVar) {
    }

    default void E(int i11, com.google.android.exoplayer2.source.o.b bVar) {
    }

    @Deprecated
    default void F(int i11, com.google.android.exoplayer2.source.o.b bVar) {
    }

    default void G(int i11, com.google.android.exoplayer2.source.o.b bVar, Exception exc) {
    }

    default void I(int i11, com.google.android.exoplayer2.source.o.b bVar) {
    }
}
