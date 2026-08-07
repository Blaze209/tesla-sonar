package com.google.android.exoplayer2.audio;

import android.os.Handler;
import com.google.android.exoplayer2.u0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface e {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f39546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f39547b;

        public a(Handler handler, e eVar) {
            this.f39546a = eVar != null ? (Handler) ts.a.e(handler) : null;
            this.f39547b = eVar;
        }

        public static /* synthetic */ void d(a aVar, u0 u0Var, fr.g gVar) {
            ((e) p0.j(aVar.f39547b)).C(u0Var);
            ((e) p0.j(aVar.f39547b)).w(u0Var, gVar);
        }

        public static /* synthetic */ void i(a aVar, fr.e eVar) {
            aVar.getClass();
            eVar.c();
            ((e) p0.j(aVar.f39547b)).r(eVar);
        }

        public void k(final Exception exc) {
            Handler handler = this.f39546a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: dr.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.exoplayer2.audio.e) p0.j(this.f60879a.f39547b)).g(exc);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Handler handler = this.f39546a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: dr.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.exoplayer2.audio.e) p0.j(this.f60890a.f39547b)).a(exc);
                    }
                });
            }
        }

        public void m(final String str, final long j11, final long j12) {
            Handler handler = this.f39546a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: dr.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.exoplayer2.audio.e) p0.j(this.f60875a.f39547b)).e(str, j11, j12);
                    }
                });
            }
        }

        public void n(final String str) {
            Handler handler = this.f39546a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: dr.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.exoplayer2.audio.e) p0.j(this.f60867a.f39547b)).d(str);
                    }
                });
            }
        }

        public void o(final fr.e eVar) {
            eVar.c();
            Handler handler = this.f39546a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: dr.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.audio.e.a.i(this.f60885a, eVar);
                    }
                });
            }
        }

        public void p(final fr.e eVar) {
            Handler handler = this.f39546a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: dr.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.exoplayer2.audio.e) p0.j(this.f60883a.f39547b)).b(eVar);
                    }
                });
            }
        }

        public void q(final u0 u0Var, final fr.g gVar) {
            Handler handler = this.f39546a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: dr.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.audio.e.a.d(this.f60887a, u0Var, gVar);
                    }
                });
            }
        }

        public void r(final long j11) {
            Handler handler = this.f39546a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: dr.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.exoplayer2.audio.e) p0.j(this.f60881a.f39547b)).j(j11);
                    }
                });
            }
        }

        public void s(final boolean z11) {
            Handler handler = this.f39546a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: dr.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.exoplayer2.audio.e) p0.j(this.f60873a.f39547b)).onSkipSilenceEnabledChanged(z11);
                    }
                });
            }
        }

        public void t(final int i11, final long j11, final long j12) {
            Handler handler = this.f39546a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: dr.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.exoplayer2.audio.e) p0.j(this.f60869a.f39547b)).m(i11, j11, j12);
                    }
                });
            }
        }
    }

    @Deprecated
    default void C(u0 u0Var) {
    }

    default void a(Exception exc) {
    }

    default void d(String str) {
    }

    default void e(String str, long j11, long j12) {
    }

    default void g(Exception exc) {
    }

    default void j(long j11) {
    }

    default void m(int i11, long j11, long j12) {
    }

    default void onSkipSilenceEnabledChanged(boolean z11) {
    }

    default void b(fr.e eVar) {
    }

    default void r(fr.e eVar) {
    }

    default void w(u0 u0Var, fr.g gVar) {
    }
}
