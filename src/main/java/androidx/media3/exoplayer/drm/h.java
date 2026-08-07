package androidx.media3.exoplayer.drm;

import android.os.Handler;
import androidx.media3.exoplayer.source.r;
import java.util.concurrent.CopyOnWriteArrayList;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public interface h {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r.b f9802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0197a> f9803c;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.drm.h$a$a, reason: collision with other inner class name */
        private static final class C0197a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f9804a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public h f9805b;

            public C0197a(Handler handler, h hVar) {
                this.f9804a = handler;
                this.f9805b = hVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void g(Handler handler, h hVar) {
            s7.a.f(handler);
            s7.a.f(hVar);
            this.f9803c.add(new C0197a(handler, hVar));
        }

        public void h() {
            for (C0197a c0197a : this.f9803c) {
                final h hVar = c0197a.f9805b;
                q0.m1(c0197a.f9804a, new Runnable() { // from class: e8.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.h.a aVar = this.f62227a;
                        hVar.z(aVar.f9801a, aVar.f9802b);
                    }
                });
            }
        }

        public void i() {
            for (C0197a c0197a : this.f9803c) {
                final h hVar = c0197a.f9805b;
                q0.m1(c0197a.f9804a, new Runnable() { // from class: e8.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.h.a aVar = this.f62223a;
                        hVar.X(aVar.f9801a, aVar.f9802b);
                    }
                });
            }
        }

        public void j() {
            for (C0197a c0197a : this.f9803c) {
                final h hVar = c0197a.f9805b;
                q0.m1(c0197a.f9804a, new Runnable() { // from class: e8.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.h.a aVar = this.f62225a;
                        hVar.b0(aVar.f9801a, aVar.f9802b);
                    }
                });
            }
        }

        public void k(final int i11) {
            for (C0197a c0197a : this.f9803c) {
                final h hVar = c0197a.f9805b;
                q0.m1(c0197a.f9804a, new Runnable() { // from class: e8.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.h.a aVar = this.f62218a;
                        hVar.W(aVar.f9801a, aVar.f9802b, i11);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            for (C0197a c0197a : this.f9803c) {
                final h hVar = c0197a.f9805b;
                q0.m1(c0197a.f9804a, new Runnable() { // from class: e8.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.h.a aVar = this.f62215a;
                        hVar.Y(aVar.f9801a, aVar.f9802b, exc);
                    }
                });
            }
        }

        public void m() {
            for (C0197a c0197a : this.f9803c) {
                final h hVar = c0197a.f9805b;
                q0.m1(c0197a.f9804a, new Runnable() { // from class: e8.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.h.a aVar = this.f62221a;
                        hVar.N(aVar.f9801a, aVar.f9802b);
                    }
                });
            }
        }

        public void n(h hVar) {
            for (C0197a c0197a : this.f9803c) {
                if (c0197a.f9805b == hVar) {
                    this.f9803c.remove(c0197a);
                }
            }
        }

        public a o(int i11, r.b bVar) {
            return new a(this.f9803c, i11, bVar);
        }

        private a(CopyOnWriteArrayList<C0197a> copyOnWriteArrayList, int i11, r.b bVar) {
            this.f9803c = copyOnWriteArrayList;
            this.f9801a = i11;
            this.f9802b = bVar;
        }
    }

    default void N(int i11, r.b bVar) {
    }

    default void W(int i11, r.b bVar, int i12) {
    }

    default void X(int i11, r.b bVar) {
    }

    default void Y(int i11, r.b bVar, Exception exc) {
    }

    default void b0(int i11, r.b bVar) {
    }

    default void z(int i11, r.b bVar) {
    }
}
