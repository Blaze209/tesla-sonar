package androidx.media3.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media3.common.PlaybackException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
class s8 {
    private static final ga.v G = new ga.v(1);
    private long A;
    private boolean B;
    private com.google.common.collect.x<androidx.media3.session.a> C;
    private com.google.common.collect.x<androidx.media3.session.a> D;
    private Bundle E;
    private PlaybackException F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f12294a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f12295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f12296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f12297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t7.d f12298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f12299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final le f12300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final va f12301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f12302i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ve f12303j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final t7 f12304k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Handler f12305l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final s7.h f12306m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f12307n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Handler f12308o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f12309p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f12310q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.google.common.collect.x<androidx.media3.session.a> f12311r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ne f12312s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private oe f12313t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PendingIntent f12314u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private d f12315v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private t7.h f12316w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private t7.g f12317x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private eb f12318y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f12319z;

    class a implements com.google.common.util.concurrent.l<t7.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t7.g f12320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f12321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p7.j0.b f12322c;

        a(t7.g gVar, boolean z11, p7.j0.b bVar) {
            this.f12320a = gVar;
            this.f12321b = z11;
            this.f12322c = bVar;
        }

        public static /* synthetic */ void a(a aVar, t7.i iVar, boolean z11, t7.g gVar, p7.j0.b bVar) {
            me.i(s8.this.f12313t, iVar);
            s7.q0.G0(s8.this.f12313t);
            if (z11) {
                s8.this.G0(gVar, bVar);
            }
        }

        @Override // com.google.common.util.concurrent.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final t7.i iVar) {
            s8 s8Var = s8.this;
            final t7.g gVar = this.f12320a;
            final boolean z11 = this.f12321b;
            final p7.j0.b bVar = this.f12322c;
            s8Var.K(gVar, new Runnable() { // from class: androidx.media3.session.r8
                @Override // java.lang.Runnable
                public final void run() {
                    s8.a.a(this.f12196a, iVar, z11, gVar, bVar);
                }
            }).run();
        }

        @Override // com.google.common.util.concurrent.l
        public void onFailure(Throwable th2) {
            if (th2 instanceof UnsupportedOperationException) {
                s7.t.j("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th2);
            } else {
                s7.t.e("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th2.getMessage(), th2);
            }
            s7.q0.G0(s8.this.f12313t);
            if (this.f12321b) {
                s8.this.G0(this.f12320a, this.f12322c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Runnable f12324a;

        public b(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ void a(b bVar, t7.g gVar, KeyEvent keyEvent) {
            if (s8.this.s0(gVar)) {
                s8.this.J(keyEvent, false, false);
            } else {
                s8.this.f12301h.I0((ha.n.b) s7.a.f(gVar.g()));
            }
            bVar.f12324a = null;
        }

        public Runnable b() {
            Runnable runnable = this.f12324a;
            if (runnable == null) {
                return null;
            }
            removeCallbacks(runnable);
            Runnable runnable2 = this.f12324a;
            this.f12324a = null;
            return runnable2;
        }

        public void c() {
            Runnable runnableB = b();
            if (runnableB != null) {
                s7.q0.m1(this, runnableB);
            }
        }

        public boolean d() {
            return this.f12324a != null;
        }

        public void e(final t7.g gVar, final KeyEvent keyEvent) {
            Runnable runnable = new Runnable() { // from class: androidx.media3.session.t8
                @Override // java.lang.Runnable
                public final void run() {
                    s8.b.a(this.f12403a, gVar, keyEvent);
                }
            };
            this.f12324a = runnable;
            postDelayed(runnable, ViewConfiguration.getDoubleTapTimeout());
        }
    }

    private class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f12326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f12327b;

        public c(Looper looper) {
            super(looper);
            this.f12326a = true;
            this.f12327b = true;
        }

        public boolean a() {
            return hasMessages(1);
        }

        public void b(boolean z11, boolean z12) {
            boolean z13 = false;
            this.f12326a = this.f12326a && z11;
            if (this.f12327b && z12) {
                z13 = true;
            }
            this.f12327b = z13;
            if (hasMessages(1)) {
                return;
            }
            sendEmptyMessage(1);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                throw new IllegalStateException("Invalid message what=" + message.what);
            }
            s8 s8Var = s8.this;
            s8Var.f12312s = s8Var.f12312s.w(s8.this.k0().g1(), s8.this.k0().c1(), s8.this.f12312s.f12030k);
            s8 s8Var2 = s8.this;
            s8Var2.S(s8Var2.f12312s, this.f12326a, this.f12327b);
            this.f12326a = true;
            this.f12327b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d implements p7.j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<s8> f12329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<oe> f12330b;

        public d(s8 s8Var, oe oeVar) {
            this.f12329a = new WeakReference<>(s8Var);
            this.f12330b = new WeakReference<>(oeVar);
        }

        private s8 o0() {
            return this.f12329a.get();
        }

        @Override // p7.j0.d
        public void B(r7.e eVar) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = new ne.b(s8VarO0.f12312s).c(eVar).a();
            s8VarO0.f12296c.b(true, true);
        }

        @Override // p7.j0.d
        public void D(final p7.m mVar) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.c(mVar);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.y8
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i11) {
                    fVar.f(i11, mVar);
                }
            });
        }

        @Override // p7.j0.d
        public void E(final p7.d dVar) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.a(dVar);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.c9
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i11) {
                    fVar.D(i11, dVar);
                }
            });
        }

        @Override // p7.j0.d
        public void F(final PlaybackException playbackException) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.m(playbackException);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.o9
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i11) {
                    fVar.d(i11, playbackException);
                }
            });
        }

        @Override // p7.j0.d
        public void H(final p7.j0.e eVar, final p7.j0.e eVar2, final int i11) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.o(eVar, eVar2, i11);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.n9
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i12) {
                    fVar.q(i12, eVar, eVar2, i11);
                }
            });
        }

        @Override // p7.j0.d
        public void K(final p7.w0 w0Var) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.x(w0Var);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.W(new e() { // from class: androidx.media3.session.v8
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i11) {
                    fVar.k(i11, w0Var);
                }
            });
        }

        @Override // p7.j0.d
        public void Q(final p7.e0 e0Var) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            s8VarO0.f12312s = s8VarO0.f12312s.n(e0Var);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.u8
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i11) {
                    fVar.t(i11, e0Var);
                }
            });
        }

        @Override // p7.j0.d
        public void R(p7.j0.b bVar) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.p0(bVar);
        }

        @Override // p7.j0.d
        public void S(final p7.a1 a1Var) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.b(a1Var);
            s8VarO0.f12296c.b(true, false);
            s8VarO0.W(new e() { // from class: androidx.media3.session.z8
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i11) {
                    fVar.u(i11, a1Var);
                }
            });
        }

        @Override // p7.j0.d
        public void U(final p7.y yVar, final int i11) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.h(i11);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.k9
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i12) {
                    fVar.b(i12, yVar, i11);
                }
            });
        }

        @Override // p7.j0.d
        public void Z(final p7.e0 e0Var) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.i(e0Var);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.h9
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i11) {
                    fVar.y(i11, e0Var);
                }
            });
        }

        @Override // p7.j0.d
        public void a0(final p7.r0 r0Var, final int i11) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            oe oeVar = this.f12330b.get();
            if (oeVar == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.w(r0Var, oeVar.c1(), i11);
            s8VarO0.f12296c.b(false, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.b9
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i12) {
                    fVar.v(i12, r0Var, i11);
                }
            });
        }

        @Override // p7.j0.d
        public void b(final p7.e1 e1Var) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            s8VarO0.f12312s = s8VarO0.f12312s.y(e1Var);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.q9
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i11) {
                    fVar.h(i11, e1Var);
                }
            });
        }

        @Override // p7.j0.d
        public void onDeviceVolumeChanged(final int i11, final boolean z11) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.d(i11, z11);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.l9
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i12) {
                    fVar.z(i12, i11, z11);
                }
            });
        }

        @Override // p7.j0.d
        public void onIsLoadingChanged(final boolean z11) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.e(z11);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.w8
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i11) {
                    fVar.F(i11, z11);
                }
            });
            s8VarO0.O0();
        }

        @Override // p7.j0.d
        public void onIsPlayingChanged(final boolean z11) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.f(z11);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.f9
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i11) {
                    fVar.j(i11, z11);
                }
            });
            s8VarO0.O0();
        }

        @Override // p7.j0.d
        public void onMaxSeekToPreviousPositionChanged(long j11) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.g(j11);
            s8VarO0.f12296c.b(true, true);
        }

        @Override // p7.j0.d
        public void onPlayWhenReadyChanged(final boolean z11, final int i11) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.j(z11, i11, s8VarO0.f12312s.f12043x);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.p9
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i12) {
                    fVar.x(i12, z11, i11);
                }
            });
        }

        @Override // p7.j0.d
        public void onPlaybackStateChanged(final int i11) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            final oe oeVar = this.f12330b.get();
            if (oeVar == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.l(i11, oeVar.a());
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.a9
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i12) {
                    fVar.n(i12, i11, oeVar.a());
                }
            });
        }

        @Override // p7.j0.d
        public void onPlaybackSuppressionReasonChanged(final int i11) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.j(s8VarO0.f12312s.f12039t, s8VarO0.f12312s.f12040u, i11);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.r9
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i12) {
                    fVar.p(i12, i11);
                }
            });
        }

        @Override // p7.j0.d
        public void onRenderedFirstFrame() {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            f<IBinder> fVarT4 = s8VarO0.f12300g.t4();
            com.google.common.collect.x<t7.g> xVarJ = fVarT4.j();
            for (int i11 = 0; i11 < xVarJ.size(); i11++) {
                t7.g gVar = xVarJ.get(i11);
                if (fVarT4.l(gVar) == null) {
                    s8VarO0.V(gVar, new e() { // from class: androidx.media3.session.j9
                        @Override // androidx.media3.session.s8.e
                        public final void a(t7.f fVar, int i12) {
                            fVar.w(i12);
                        }
                    });
                }
            }
        }

        @Override // p7.j0.d
        public void onRepeatModeChanged(final int i11) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.p(i11);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.g9
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i12) {
                    fVar.a(i12, i11);
                }
            });
        }

        @Override // p7.j0.d
        public void onSeekBackIncrementChanged(final long j11) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.q(j11);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.m9
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i11) {
                    fVar.A(i11, j11);
                }
            });
        }

        @Override // p7.j0.d
        public void onSeekForwardIncrementChanged(final long j11) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.r(j11);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.i9
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i11) {
                    fVar.s(i11, j11);
                }
            });
        }

        @Override // p7.j0.d
        public void onShuffleModeEnabledChanged(final boolean z11) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.t(z11);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.x8
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i11) {
                    fVar.i(i11, z11);
                }
            });
        }

        @Override // p7.j0.d
        public void onVolumeChanged(final float f11) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            s8VarO0.f12312s = s8VarO0.f12312s.z(f11);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.d9
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i11) {
                    fVar.E(i11, f11);
                }
            });
        }

        @Override // p7.j0.d
        public void v(final p7.i0 i0Var) {
            s8 s8VarO0 = o0();
            if (s8VarO0 == null) {
                return;
            }
            s8VarO0.U0();
            if (this.f12330b.get() == null) {
                return;
            }
            s8VarO0.f12312s = s8VarO0.f12312s.k(i0Var);
            s8VarO0.f12296c.b(true, true);
            s8VarO0.U(new e() { // from class: androidx.media3.session.e9
                @Override // androidx.media3.session.s8.e
                public final void a(t7.f fVar, int i11) {
                    fVar.e(i11, i0Var);
                }
            });
        }
    }

    interface e {
        void a(t7.f fVar, int i11);
    }

    public s8(t7 t7Var, Context context, String str, p7.j0 j0Var, PendingIntent pendingIntent, com.google.common.collect.x<androidx.media3.session.a> xVar, com.google.common.collect.x<androidx.media3.session.a> xVar2, com.google.common.collect.x<androidx.media3.session.a> xVar3, t7.d dVar, Bundle bundle, Bundle bundle2, s7.h hVar, boolean z11, boolean z12) {
        s7.t.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + s7.q0.f110458e + "]");
        this.f12304k = t7Var;
        this.f12299f = context;
        this.f12302i = str;
        this.f12314u = pendingIntent;
        this.C = xVar;
        this.D = xVar2;
        this.f12311r = xVar3;
        this.f12298e = dVar;
        this.E = bundle2;
        this.f12306m = hVar;
        this.f12309p = z11;
        this.f12310q = z12;
        le leVar = new le(this);
        this.f12300g = leVar;
        this.f12308o = new Handler(Looper.getMainLooper());
        Looper looperF0 = j0Var.F0();
        Handler handler = new Handler(looperF0);
        this.f12305l = handler;
        this.f12312s = ne.F;
        this.f12296c = new c(looperF0);
        this.f12297d = new b(looperF0);
        Uri uriBuild = new Uri.Builder().scheme(s8.class.getName()).appendPath(str).appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.f12295b = uriBuild;
        t7.e eVarA = new t7.e.a(t7Var).a();
        va vaVar = new va(this, uriBuild, handler, bundle, z11, xVar, xVar2, eVarA.f12381b, eVarA.f12382c, bundle2);
        this.f12301h = vaVar;
        this.f12303j = new ve(Process.myUid(), 0, 1008000300, 5, context.getPackageName(), leVar, bundle, vaVar.H0().e().e());
        final oe oeVar = new oe(j0Var);
        this.f12313t = oeVar;
        s7.q0.m1(handler, new Runnable() { // from class: androidx.media3.session.f8
            @Override // java.lang.Runnable
            public final void run() {
                this.f11674a.R0(null, oeVar);
            }
        });
        this.A = 3000L;
        this.f12307n = new Runnable() { // from class: androidx.media3.session.j8
            @Override // java.lang.Runnable
            public final void run() {
                this.f11809a.w0();
            }
        };
        s7.q0.m1(handler, new Runnable() { // from class: androidx.media3.session.k8
            @Override // java.lang.Runnable
            public final void run() {
                this.f11882a.O0();
            }
        });
    }

    private void A0(t7.g gVar) {
        this.f12300g.t4().t(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    public boolean J(KeyEvent keyEvent, boolean z11, final boolean z12) {
        final Runnable runnable;
        final t7.g gVar = (t7.g) s7.a.f(this.f12304k.i());
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z11) {
            keyCode = 87;
        }
        if (keyCode == 126) {
            runnable = new Runnable() { // from class: androidx.media3.session.n8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11999a.f12300g.z4(gVar, Integer.MIN_VALUE);
                }
            };
        } else if (keyCode == 127) {
            runnable = new Runnable() { // from class: androidx.media3.session.o8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12094a.f12300g.y4(gVar, Integer.MIN_VALUE);
                }
            };
        } else if (keyCode == 272) {
            runnable = new Runnable() { // from class: androidx.media3.session.p8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12122a.f12300g.F4(gVar, Integer.MIN_VALUE);
                }
            };
        } else if (keyCode != 273) {
            switch (keyCode) {
                case 85:
                    runnable = !k0().t() ? new Runnable() { // from class: androidx.media3.session.m8
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f11972a.f12300g.z4(gVar, Integer.MIN_VALUE);
                        }
                    } : new Runnable() { // from class: androidx.media3.session.l8
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f11918a.f12300g.y4(gVar, Integer.MIN_VALUE);
                        }
                    };
                    break;
                case 86:
                    runnable = new Runnable() { // from class: androidx.media3.session.x7
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f12616a.f12300g.N4(gVar, Integer.MIN_VALUE);
                        }
                    };
                    break;
                case 87:
                    runnable = new Runnable() { // from class: androidx.media3.session.p8
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f12122a.f12300g.F4(gVar, Integer.MIN_VALUE);
                        }
                    };
                    break;
                case 88:
                    runnable = new Runnable() { // from class: androidx.media3.session.q8
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f12164a.f12300g.G4(gVar, Integer.MIN_VALUE);
                        }
                    };
                    break;
                case 89:
                    runnable = new Runnable() { // from class: androidx.media3.session.w7
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f12567a.f12300g.D4(gVar, Integer.MIN_VALUE);
                        }
                    };
                    break;
                case 90:
                    runnable = new Runnable() { // from class: androidx.media3.session.v7
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f12498a.f12300g.E4(gVar, Integer.MIN_VALUE);
                        }
                    };
                    break;
                default:
                    return false;
            }
        } else {
            runnable = new Runnable() { // from class: androidx.media3.session.q8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12164a.f12300g.G4(gVar, Integer.MIN_VALUE);
                }
            };
        }
        s7.q0.m1(X(), new Runnable() { // from class: androidx.media3.session.y7
            @Override // java.lang.Runnable
            public final void run() {
                s8.e(this.f12639a, z12, gVar, runnable);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(Runnable runnable) {
        s7.q0.m1(X(), runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0() {
        this.f12305l.removeCallbacks(this.f12307n);
        if (!this.f12310q || this.A <= 0) {
            return;
        }
        if (this.f12313t.isPlaying() || this.f12313t.c()) {
            this.f12305l.postDelayed(this.f12307n, this.A);
        }
    }

    static p7.j0.b P(p7.j0.b bVar) {
        if (bVar == null) {
            return null;
        }
        p7.j0.b.a aVarB = p7.j0.b.f101382b.b();
        if (bVar.c(16)) {
            aVarB.a(16);
        }
        if (bVar.c(17)) {
            aVarB.a(17);
        }
        if (bVar.c(18)) {
            aVarB.a(18);
        }
        if (bVar.c(21)) {
            aVarB.a(21);
        }
        if (bVar.c(22)) {
            aVarB.a(22);
        }
        if (bVar.c(23)) {
            aVarB.a(23);
        }
        if (bVar.c(30)) {
            aVarB.a(30);
        }
        if (bVar.c(32)) {
            aVarB.a(32);
        }
        return aVarB.f();
    }

    static ne Q(ne neVar, PlaybackException playbackException) {
        ne neVarL = neVar.l(1, playbackException);
        ue ueVar = neVar.f12022c;
        return neVarL.s(new ue(ueVar.f12456a, ueVar.f12457b, ueVar.f12458c, ueVar.f12459d, 0L, 0, 0L, ueVar.f12463h, ueVar.f12464i, 0L));
    }

    private void R(final ue ueVar) {
        f<IBinder> fVarT4 = this.f12300g.t4();
        com.google.common.collect.x<t7.g> xVarJ = fVarT4.j();
        for (int i11 = 0; i11 < xVarJ.size(); i11++) {
            final t7.g gVar = xVarJ.get(i11);
            if (fVarT4.l(gVar) == null) {
                final boolean zQ = fVarT4.q(gVar, 16);
                final boolean zQ2 = fVarT4.q(gVar, 17);
                V(gVar, new e() { // from class: androidx.media3.session.b8
                    @Override // androidx.media3.session.s8.e
                    public final void a(t7.f fVar, int i12) {
                        fVar.g(i12, ueVar, zQ, zQ2, gVar.e());
                    }
                });
            }
        }
        try {
            this.f12301h.E0().g(0, ueVar, true, true, 0);
        } catch (RemoteException e11) {
            s7.t.e("MediaSessionImpl", "Exception in using media1 API", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0(final oe oeVar, final oe oeVar2) {
        this.f12313t = oeVar2;
        if (oeVar != null) {
            oeVar.e0((p7.j0.d) s7.a.j(this.f12315v));
        }
        d dVar = new d(this, oeVar2);
        oeVar2.D0(dVar);
        this.f12315v = dVar;
        U(new e() { // from class: androidx.media3.session.a8
            @Override // androidx.media3.session.s8.e
            public final void a(t7.f fVar, int i11) {
                fVar.r(i11, oeVar, oeVar2);
            }
        });
        if (oeVar == null) {
            this.f12301h.Y0();
        }
        this.f12312s = oeVar2.a1();
        p0(oeVar2.N());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(ne neVar, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        int iC;
        ne neVarR4 = this.f12300g.r4(neVar);
        com.google.common.collect.x<t7.g> xVarJ = this.f12300g.t4().j();
        int i11 = 0;
        while (i11 < xVarJ.size()) {
            t7.g gVar = xVarJ.get(i11);
            try {
                f<IBinder> fVarT4 = this.f12300g.t4();
                re reVarN = fVarT4.n(gVar);
                if (reVarN != null) {
                    iC = reVarN.c();
                } else if (!r0(gVar)) {
                    return;
                } else {
                    iC = 0;
                }
                ne neVarM = fVarT4.m(gVar);
                if (neVarM != null) {
                    z13 = z11;
                    z14 = z12;
                } else {
                    PlaybackException playbackExceptionL = fVarT4.l(gVar);
                    if (playbackExceptionL != null) {
                        neVarM = Q(neVarR4, playbackExceptionL);
                        fVarT4.w(gVar, neVarM);
                    }
                    z13 = z11;
                    z14 = z12;
                    try {
                        ((t7.f) s7.a.j(gVar.c())).m(iC, neVarM == null ? neVarR4 : neVarM, me.f(fVarT4.i(gVar), k0().N()), z13, z14);
                    } catch (DeadObjectException unused) {
                        A0(gVar);
                    } catch (RemoteException e11) {
                        e = e11;
                        s7.t.j("MediaSessionImpl", "Exception in " + gVar, e);
                    }
                }
            } catch (DeadObjectException unused2) {
                z13 = z11;
                z14 = z12;
            } catch (RemoteException e12) {
                e = e12;
                z13 = z11;
                z14 = z12;
            }
            i11++;
            z11 = z13;
            z12 = z14;
        }
    }

    private com.google.common.util.concurrent.s<ga.v> T(t7.g gVar, e eVar) {
        int iS;
        com.google.common.util.concurrent.s<ga.v> sVarD;
        try {
            re reVarN = this.f12300g.t4().n(gVar);
            if (reVarN != null) {
                re.a aVarA = reVarN.a(G);
                iS = aVarA.S();
                sVarD = aVarA;
            } else {
                if (!r0(gVar)) {
                    return com.google.common.util.concurrent.m.d(new ga.v(-100));
                }
                iS = 0;
                sVarD = com.google.common.util.concurrent.m.d(new ga.v(0));
            }
            t7.f fVarC = gVar.c();
            if (fVarC != null) {
                eVar.a(fVarC, iS);
            }
            return sVarD;
        } catch (DeadObjectException unused) {
            A0(gVar);
            return com.google.common.util.concurrent.m.d(new ga.v(-100));
        } catch (RemoteException e11) {
            s7.t.j("MediaSessionImpl", "Exception in " + gVar, e11);
            return com.google.common.util.concurrent.m.d(new ga.v(-1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(e eVar) {
        try {
            eVar.a(this.f12301h.E0(), 0);
        } catch (RemoteException e11) {
            s7.t.e("MediaSessionImpl", "Exception in using media1 API", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0() {
        if (Looper.myLooper() != this.f12305l.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }

    public static /* synthetic */ void e(s8 s8Var, boolean z11, t7.g gVar, Runnable runnable) {
        s8Var.getClass();
        if (z11) {
            Bundle bundle = Bundle.EMPTY;
            s8Var.P0(gVar, new se("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", bundle), bundle);
        }
        runnable.run();
        s8Var.f12300g.t4().h(gVar);
    }

    public static /* synthetic */ void h(s8 s8Var) {
        d dVar = s8Var.f12315v;
        if (dVar != null) {
            s8Var.f12313t.e0(dVar);
        }
    }

    public static /* synthetic */ void k(s8 s8Var) {
        t7.h hVar = s8Var.f12316w;
        if (hVar != null) {
            hVar.a(s8Var.f12304k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(final p7.j0.b bVar) {
        this.f12296c.b(false, false);
        W(new e() { // from class: androidx.media3.session.c8
            @Override // androidx.media3.session.s8.e
            public final void a(t7.f fVar, int i11) {
                fVar.C(i11, bVar);
            }
        });
        U(new e() { // from class: androidx.media3.session.d8
            @Override // androidx.media3.session.s8.e
            public final void a(t7.f fVar, int i11) {
                fVar.f(i11, this.f11607a.f12312s.f12036q);
            }
        });
    }

    public static /* synthetic */ void r(s8 s8Var, t7.g gVar, Runnable runnable) {
        s8Var.f12317x = gVar;
        runnable.run();
        s8Var.f12317x = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        synchronized (this.f12294a) {
            try {
                if (this.f12319z) {
                    return;
                }
                ue ueVarC1 = this.f12313t.c1();
                if (!this.f12296c.a() && me.b(ueVarC1, this.f12312s.f12022c)) {
                    R(ueVarC1);
                }
                O0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void B0(t7.g gVar) {
        if (this.B) {
            if (v0(gVar)) {
                return;
            }
            if (s0(gVar)) {
                this.B = false;
            }
        }
        this.f12298e.j(this.f12304k, gVar);
    }

    boolean C0(t7.g gVar, Intent intent) {
        boolean z11;
        KeyEvent keyEventH = l.h(intent);
        ComponentName component = intent.getComponent();
        if (!Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") || ((component != null && !Objects.equals(component.getPackageName(), this.f12299f.getPackageName())) || keyEventH == null || keyEventH.getAction() != 0)) {
            return false;
        }
        U0();
        if (this.f12298e.k(this.f12304k, gVar, intent)) {
            return true;
        }
        int keyCode = keyEventH.getKeyCode();
        boolean zHasSystemFeature = this.f12299f.getPackageManager().hasSystemFeature("android.software.leanback");
        if ((keyCode != 79 && keyCode != 85) || zHasSystemFeature || gVar.d() != 0 || keyEventH.getRepeatCount() != 0) {
            this.f12297d.c();
            z11 = false;
        } else {
            if (!this.f12297d.d()) {
                this.f12297d.e(gVar, keyEventH);
                return true;
            }
            this.f12297d.b();
            z11 = true;
        }
        if (t0()) {
            return J(keyEventH, z11, intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false));
        }
        if ((keyCode == 85 || keyCode == 79) && z11) {
            this.f12301h.z();
            return true;
        }
        if (gVar.d() == 0) {
            return false;
        }
        this.f12301h.H0().b().c(keyEventH);
        return true;
    }

    void D0() {
        s7.q0.m1(this.f12308o, new Runnable() { // from class: androidx.media3.session.g8
            @Override // java.lang.Runnable
            public final void run() {
                s8.k(this.f11713a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean E0() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            t7.h hVar = this.f12316w;
            if (hVar != null) {
                return hVar.b(this.f12304k);
            }
            return true;
        }
        final com.google.common.util.concurrent.a0 a0VarQ = com.google.common.util.concurrent.a0.Q();
        this.f12308o.post(new Runnable() { // from class: androidx.media3.session.i8
            @Override // java.lang.Runnable
            public final void run() {
                a0VarQ.M(Boolean.valueOf(this.f11781a.E0()));
            }
        });
        try {
            return ((Boolean) a0VarQ.get()).booleanValue();
        } catch (InterruptedException | ExecutionException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public int F0(t7.g gVar, int i11) {
        return this.f12298e.m(this.f12304k, N0(gVar), i11);
    }

    protected void G0(t7.g gVar, p7.j0.b bVar) {
        this.f12298e.h(this.f12304k, N0(gVar), bVar);
    }

    public void H0(t7.g gVar) {
        if (this.B && v0(gVar)) {
            return;
        }
        this.f12298e.i(this.f12304k, gVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.google.common.util.concurrent.s<t7.i> I0(t7.g gVar, List<p7.y> list, int i11, long j11) {
        return (com.google.common.util.concurrent.s) s7.a.g(this.f12298e.e(this.f12304k, N0(gVar), list, i11, j11), "Callback.onSetMediaItems must return a non-null future");
    }

    public com.google.common.util.concurrent.s<ga.v> J0(t7.g gVar, String str, p7.k0 k0Var) {
        return (com.google.common.util.concurrent.s) s7.a.g(this.f12298e.g(this.f12304k, N0(gVar), str, k0Var), "Callback.onSetRating must return non-null future");
    }

    public Runnable K(final t7.g gVar, final Runnable runnable) {
        return new Runnable() { // from class: androidx.media3.session.h8
            @Override // java.lang.Runnable
            public final void run() {
                s8.r(this.f11750a, gVar, runnable);
            }
        };
    }

    public com.google.common.util.concurrent.s<ga.v> K0(t7.g gVar, p7.k0 k0Var) {
        return (com.google.common.util.concurrent.s) s7.a.g(this.f12298e.a(this.f12304k, N0(gVar), k0Var), "Callback.onSetRating must return non-null future");
    }

    boolean L() {
        return this.f12301h.t0();
    }

    void M() {
        this.f12316w = null;
    }

    public void M0() {
        s7.t.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + s7.q0.f110458e + "] [" + p7.d0.b() + "]");
        synchronized (this.f12294a) {
            try {
                if (this.f12319z) {
                    return;
                }
                this.f12319z = true;
                this.f12297d.b();
                this.f12305l.removeCallbacksAndMessages(null);
                try {
                    s7.q0.m1(this.f12305l, new Runnable() { // from class: androidx.media3.session.u7
                        @Override // java.lang.Runnable
                        public final void run() {
                            s8.h(this.f12432a);
                        }
                    });
                } catch (Exception e11) {
                    s7.t.j("MediaSessionImpl", "Exception thrown while closing", e11);
                }
                this.f12301h.P0();
                this.f12300g.C4();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void N(n nVar, t7.g gVar) {
        this.f12300g.n4(nVar, gVar);
    }

    protected t7.g N0(t7.g gVar) {
        return (this.B && v0(gVar)) ? (t7.g) s7.a.f(g0()) : gVar;
    }

    protected eb O(ha.l.j jVar) {
        eb ebVar = new eb(this);
        ebVar.x(jVar);
        return ebVar;
    }

    public com.google.common.util.concurrent.s<ga.v> P0(t7.g gVar, final se seVar, final Bundle bundle) {
        return T(gVar, new e() { // from class: androidx.media3.session.z7
            @Override // androidx.media3.session.s8.e
            public final void a(t7.f fVar, int i11) {
                fVar.l(i11, seVar, bundle);
            }
        });
    }

    void Q0(t7.h hVar) {
        this.f12316w = hVar;
    }

    public boolean S0() {
        return this.f12309p;
    }

    void T0() {
        this.f12296c.b(true, true);
    }

    protected void V(t7.g gVar, e eVar) {
        int iC;
        try {
            re reVarN = this.f12300g.t4().n(gVar);
            if (reVarN != null) {
                iC = reVarN.c();
            } else if (!r0(gVar)) {
                return;
            } else {
                iC = 0;
            }
            t7.f fVarC = gVar.c();
            if (fVarC != null) {
                eVar.a(fVarC, iC);
            }
        } catch (DeadObjectException unused) {
            A0(gVar);
        } catch (RemoteException e11) {
            s7.t.j("MediaSessionImpl", "Exception in " + gVar, e11);
        }
    }

    protected void W(e eVar) {
        com.google.common.collect.x<t7.g> xVarJ = this.f12300g.t4().j();
        for (int i11 = 0; i11 < xVarJ.size(); i11++) {
            V(xVarJ.get(i11), eVar);
        }
        try {
            eVar.a(this.f12301h.E0(), 0);
        } catch (RemoteException e11) {
            s7.t.e("MediaSessionImpl", "Exception in using media1 API", e11);
        }
    }

    protected Handler X() {
        return this.f12305l;
    }

    public s7.h Y() {
        return this.f12306m;
    }

    public com.google.common.collect.x<androidx.media3.session.a> Z() {
        return this.f12311r;
    }

    protected Context a0() {
        return this.f12299f;
    }

    public com.google.common.collect.x<androidx.media3.session.a> b0() {
        return this.C;
    }

    public String c0() {
        return this.f12302i;
    }

    protected eb d0() {
        eb ebVar;
        synchronized (this.f12294a) {
            ebVar = this.f12318y;
        }
        return ebVar;
    }

    protected IBinder e0() {
        eb ebVar;
        synchronized (this.f12294a) {
            try {
                if (this.f12318y == null) {
                    this.f12318y = O(this.f12301h.H0().e());
                }
                ebVar = this.f12318y;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ebVar.onBind(new Intent("android.media.browse.MediaBrowserService"));
    }

    public com.google.common.collect.x<androidx.media3.session.a> f0() {
        return this.D;
    }

    public t7.g g0() {
        com.google.common.collect.x<t7.g> xVarJ = this.f12300g.t4().j();
        for (int i11 = 0; i11 < xVarJ.size(); i11++) {
            t7.g gVar = xVarJ.get(i11);
            if (s0(gVar)) {
                return gVar;
            }
        }
        return null;
    }

    public MediaSession.Token h0() {
        return this.f12301h.H0().e().e();
    }

    public PlaybackException i0() {
        return this.F;
    }

    public ne j0() {
        return this.f12312s;
    }

    public oe k0() {
        return this.f12313t;
    }

    protected PendingIntent l0() {
        return this.f12314u;
    }

    public Bundle m0() {
        return this.E;
    }

    public ve n0() {
        return this.f12303j;
    }

    public Uri o0() {
        return this.f12295b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q0(t7.g gVar, boolean z11) {
        if (E0()) {
            boolean z12 = this.f12313t.c0(16) && this.f12313t.U0() != null;
            boolean z13 = this.f12313t.c0(31) || this.f12313t.c0(20);
            t7.g gVarN0 = N0(gVar);
            p7.j0.b bVarF = new p7.j0.b.a().a(1).f();
            if (!z12 && z13) {
                com.google.common.util.concurrent.m.a((com.google.common.util.concurrent.s) s7.a.g(this.f12298e.f(this.f12304k, gVarN0), "Callback.onPlaybackResumption must return a non-null future"), new a(gVarN0, z11, bVarF), new Executor() { // from class: androidx.media3.session.e8
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        this.f11635a.L0(runnable);
                    }
                });
                return;
            }
            if (!z12) {
                s7.t.i("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            s7.q0.G0(this.f12313t);
            if (z11) {
                G0(gVarN0, bVarF);
            }
        }
    }

    public boolean r0(t7.g gVar) {
        return this.f12300g.t4().p(gVar) || this.f12301h.D0().p(gVar);
    }

    public boolean s0(t7.g gVar) {
        return Objects.equals(gVar.f(), this.f12299f.getPackageName()) && gVar.d() != 0 && gVar.b().getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    protected boolean t0() {
        return this.B;
    }

    protected boolean u0() {
        boolean z11;
        synchronized (this.f12294a) {
            z11 = this.f12319z;
        }
        return z11;
    }

    protected boolean v0(t7.g gVar) {
        return gVar != null && Objects.equals(gVar.f(), "com.android.systemui");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.google.common.util.concurrent.s<List<p7.y>> x0(t7.g gVar, List<p7.y> list) {
        return (com.google.common.util.concurrent.s) s7.a.g(this.f12298e.c(this.f12304k, N0(gVar), list), "Callback.onAddMediaItems must return a non-null future");
    }

    public t7.e y0(t7.g gVar) {
        if (this.B && v0(gVar)) {
            return this.f12301h.F0(this.f12304k);
        }
        t7.e eVar = (t7.e) s7.a.g(this.f12298e.d(this.f12304k, gVar), "Callback.onConnect must return non-null future");
        if (s0(gVar) && eVar.f12380a) {
            this.B = true;
            com.google.common.collect.x<androidx.media3.session.a> xVarH = eVar.f12384e;
            if (xVarH == null) {
                xVarH = this.f12304k.h();
            }
            if (xVarH.isEmpty()) {
                va vaVar = this.f12301h;
                com.google.common.collect.x<androidx.media3.session.a> xVarD = eVar.f12383d;
                if (xVarD == null) {
                    xVarD = this.f12304k.d();
                }
                vaVar.U0(xVarD);
            } else {
                this.f12301h.V0(xVarH);
            }
            this.f12301h.R0(eVar.f12381b, eVar.f12382c);
        }
        return eVar;
    }

    public com.google.common.util.concurrent.s<ga.v> z0(t7.g gVar, se seVar, Bundle bundle) {
        return (com.google.common.util.concurrent.s) s7.a.g(this.f12298e.b(this.f12304k, N0(gVar), seVar, bundle), "Callback.onCustomCommandOnHandler must return non-null future");
    }
}
