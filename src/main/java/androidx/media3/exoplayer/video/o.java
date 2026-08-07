package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import p7.e1;
import p7.u;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public interface o {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f11326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o f11327b;

        public a(Handler handler, o oVar) {
            this.f11326a = oVar != null ? (Handler) s7.a.f(handler) : null;
            this.f11327b = oVar;
        }

        public static /* synthetic */ void d(a aVar, z7.b bVar) {
            aVar.getClass();
            bVar.c();
            ((o) q0.l(aVar.f11327b)).A(bVar);
        }

        public void k(final String str, final long j11, final long j12) {
            Handler handler = this.f11326a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.o) q0.l(this.f115921a.f11327b)).i(str, j11, j12);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f11326a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.o) q0.l(this.f115932a.f11327b)).c(str);
                    }
                });
            }
        }

        public void m(final z7.b bVar) {
            bVar.c();
            Handler handler = this.f11326a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.video.o.a.d(this.f115945a, bVar);
                    }
                });
            }
        }

        public void n(final int i11, final long j11) {
            Handler handler = this.f11326a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.o) q0.l(this.f115934a.f11327b)).f(i11, j11);
                    }
                });
            }
        }

        public void o(final z7.b bVar) {
            Handler handler = this.f11326a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.o) q0.l(this.f115940a.f11327b)).u(bVar);
                    }
                });
            }
        }

        public void p(final u uVar, final z7.c cVar) {
            Handler handler = this.f11326a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.o) q0.l(this.f115942a.f11327b)).s(uVar, cVar);
                    }
                });
            }
        }

        public void q(final Object obj) {
            if (this.f11326a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f11326a.post(new Runnable() { // from class: u8.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.o) q0.l(this.f115927a.f11327b)).l(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void r(final long j11, final int i11) {
            Handler handler = this.f11326a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.o) q0.l(this.f115937a.f11327b)).h(j11, i11);
                    }
                });
            }
        }

        public void s(final Exception exc) {
            Handler handler = this.f11326a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.o) q0.l(this.f115930a.f11327b)).k(exc);
                    }
                });
            }
        }

        public void t(final e1 e1Var) {
            Handler handler = this.f11326a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.o) q0.l(this.f115925a.f11327b)).b(e1Var);
                    }
                });
            }
        }
    }

    default void c(String str) {
    }

    default void f(int i11, long j11) {
    }

    default void h(long j11, int i11) {
    }

    default void i(String str, long j11, long j12) {
    }

    default void k(Exception exc) {
    }

    default void l(Object obj, long j11) {
    }

    default void A(z7.b bVar) {
    }

    default void b(e1 e1Var) {
    }

    default void u(z7.b bVar) {
    }

    default void s(u uVar, z7.c cVar) {
    }
}
