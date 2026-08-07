package us;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.u0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface x {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f116705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x f116706b;

        public a(Handler handler, x xVar) {
            this.f116705a = xVar != null ? (Handler) ts.a.e(handler) : null;
            this.f116706b = xVar;
        }

        public static /* synthetic */ void c(a aVar, fr.e eVar) {
            aVar.getClass();
            eVar.c();
            ((x) p0.j(aVar.f116706b)).p(eVar);
        }

        public static /* synthetic */ void i(a aVar, u0 u0Var, fr.g gVar) {
            ((x) p0.j(aVar.f116706b)).A(u0Var);
            ((x) p0.j(aVar.f116706b)).s(u0Var, gVar);
        }

        public void k(final String str, final long j11, final long j12) {
            Handler handler = this.f116705a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: us.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((x) p0.j(this.f116693a.f116706b)).i(str, j11, j12);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f116705a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: us.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((x) p0.j(this.f116687a.f116706b)).c(str);
                    }
                });
            }
        }

        public void m(final fr.e eVar) {
            eVar.c();
            Handler handler = this.f116705a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: us.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.c(this.f116689a, eVar);
                    }
                });
            }
        }

        public void n(final int i11, final long j11) {
            Handler handler = this.f116705a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: us.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((x) p0.j(this.f116681a.f116706b)).f(i11, j11);
                    }
                });
            }
        }

        public void o(final fr.e eVar) {
            Handler handler = this.f116705a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: us.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((x) p0.j(this.f116697a.f116706b)).o(eVar);
                    }
                });
            }
        }

        public void p(final u0 u0Var, final fr.g gVar) {
            Handler handler = this.f116705a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: us.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.i(this.f116699a, u0Var, gVar);
                    }
                });
            }
        }

        public void q(final Object obj) {
            if (this.f116705a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f116705a.post(new Runnable() { // from class: us.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((x) p0.j(this.f116684a.f116706b)).l(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void r(final long j11, final int i11) {
            Handler handler = this.f116705a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: us.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((x) p0.j(this.f116702a.f116706b)).h(j11, i11);
                    }
                });
            }
        }

        public void s(final Exception exc) {
            Handler handler = this.f116705a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: us.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((x) p0.j(this.f116691a.f116706b)).k(exc);
                    }
                });
            }
        }

        public void t(final z zVar) {
            Handler handler = this.f116705a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: us.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((x) p0.j(this.f116679a.f116706b)).onVideoSizeChanged(zVar);
                    }
                });
            }
        }
    }

    @Deprecated
    default void A(u0 u0Var) {
    }

    default void c(String str) {
    }

    default void k(Exception exc) {
    }

    default void o(fr.e eVar) {
    }

    default void onVideoSizeChanged(z zVar) {
    }

    default void p(fr.e eVar) {
    }

    default void f(int i11, long j11) {
    }

    default void h(long j11, int i11) {
    }

    default void l(Object obj, long j11) {
    }

    default void s(u0 u0Var, fr.g gVar) {
    }

    default void i(String str, long j11, long j12) {
    }
}
