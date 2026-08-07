package androidx.media3.exoplayer.audio;

import android.os.Handler;
import p7.u;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public interface e {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f9475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f9476b;

        public a(Handler handler, e eVar) {
            this.f9475a = eVar != null ? (Handler) s7.a.f(handler) : null;
            this.f9476b = eVar;
        }

        public static /* synthetic */ void d(a aVar, z7.b bVar) {
            aVar.getClass();
            bVar.c();
            ((e) q0.l(aVar.f9476b)).w(bVar);
        }

        public void n(final Exception exc) {
            Handler handler = this.f9475a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b8.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) q0.l(this.f16792a.f9476b)).g(exc);
                    }
                });
            }
        }

        public void o(final int i11) {
            Handler handler = this.f9475a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b8.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) q0.l(this.f16821a.f9476b)).onAudioSessionIdChanged(i11);
                    }
                });
            }
        }

        public void p(final Exception exc) {
            Handler handler = this.f9475a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b8.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) q0.l(this.f16814a.f9476b)).a(exc);
                    }
                });
            }
        }

        public void q(final AudioSink.a aVar) {
            Handler handler = this.f9475a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b8.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) q0.l(this.f16812a.f9476b)).o(aVar);
                    }
                });
            }
        }

        public void r(final AudioSink.a aVar) {
            Handler handler = this.f9475a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b8.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) q0.l(this.f16798a.f9476b)).p(aVar);
                    }
                });
            }
        }

        public void s(final String str, final long j11, final long j12) {
            Handler handler = this.f9475a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b8.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) q0.l(this.f16800a.f9476b)).e(str, j11, j12);
                    }
                });
            }
        }

        public void t(final String str) {
            Handler handler = this.f9475a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b8.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) q0.l(this.f16804a.f9476b)).d(str);
                    }
                });
            }
        }

        public void u(final z7.b bVar) {
            bVar.c();
            Handler handler = this.f9475a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b8.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.audio.e.a.d(this.f16794a, bVar);
                    }
                });
            }
        }

        public void v(final z7.b bVar) {
            Handler handler = this.f9475a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b8.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) q0.l(this.f16806a.f9476b)).r(bVar);
                    }
                });
            }
        }

        public void w(final u uVar, final z7.c cVar) {
            Handler handler = this.f9475a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b8.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) q0.l(this.f16816a.f9476b)).y(uVar, cVar);
                    }
                });
            }
        }

        public void x(final long j11) {
            Handler handler = this.f9475a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b8.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) q0.l(this.f16796a.f9476b)).j(j11);
                    }
                });
            }
        }

        public void y(final boolean z11) {
            Handler handler = this.f9475a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b8.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) q0.l(this.f16819a.f9476b)).onSkipSilenceEnabledChanged(z11);
                    }
                });
            }
        }

        public void z(final int i11, final long j11, final long j12) {
            Handler handler = this.f9475a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b8.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) q0.l(this.f16808a.f9476b)).m(i11, j11, j12);
                    }
                });
            }
        }
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

    default void o(AudioSink.a aVar) {
    }

    default void onAudioSessionIdChanged(int i11) {
    }

    default void onSkipSilenceEnabledChanged(boolean z11) {
    }

    default void p(AudioSink.a aVar) {
    }

    default void r(z7.b bVar) {
    }

    default void w(z7.b bVar) {
    }

    default void y(u uVar, z7.c cVar) {
    }
}
