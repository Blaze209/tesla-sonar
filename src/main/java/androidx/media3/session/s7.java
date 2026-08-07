package androidx.media3.session;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public final class s7 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bb f12271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j7.a f12272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.core.app.r f12273c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Intent f12276f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j7.b f12278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f12279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private j7 f12280j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f12282l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f12274d = s7.q0.B(Looper.getMainLooper(), this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f12275e = new Executor() { // from class: androidx.media3.session.k7
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            s7.q0.m1(this.f11881a.f12274d, runnable);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<t7, c> f12277g = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f12281k = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f12283m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f12284n = 600000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f12285o = 3;

    private static class b {
        public static void a(bb bbVar, boolean z11) {
            bbVar.stopForeground(z11 ? 1 : 2);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.common.util.concurrent.s<v> f12288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f12289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f12290c;

        public c(com.google.common.util.concurrent.s<v> sVar) {
            this.f12288a = sVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d implements v.c, p7.j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final bb f12291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t7 f12292b;

        public d(bb bbVar, t7 t7Var) {
            this.f12291a = bbVar;
            this.f12292b = t7Var;
        }

        @Override // androidx.media3.session.v.c
        public void N(v vVar) {
            if (this.f12291a.p(this.f12292b)) {
                this.f12291a.w(this.f12292b);
            }
            this.f12291a.u(this.f12292b, false);
        }

        @Override // p7.j0.d
        public void V(p7.j0 j0Var, p7.j0.c cVar) {
            if (cVar.b(4, 5, 14, 0)) {
                this.f12291a.u(this.f12292b, false);
            }
        }

        public void Y(boolean z11) {
            if (z11) {
                this.f12291a.u(this.f12292b, false);
            }
        }

        @Override // androidx.media3.session.v.c
        public void n(v vVar, te teVar) {
            this.f12291a.u(this.f12292b, false);
        }

        @Override // androidx.media3.session.v.c
        public com.google.common.util.concurrent.s<ga.v> q(v vVar, se seVar, Bundle bundle) {
            int i11;
            if (seVar.f12348b.equals("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY")) {
                s7.this.p(this.f12292b);
                i11 = 0;
            } else {
                i11 = -6;
            }
            return com.google.common.util.concurrent.m.d(new ga.v(i11));
        }

        @Override // androidx.media3.session.v.c
        public void z(v vVar, List<androidx.media3.session.a> list) {
            this.f12291a.u(this.f12292b, false);
        }
    }

    public s7(bb bbVar, j7.b bVar, j7.a aVar) {
        this.f12271a = bbVar;
        this.f12278h = bVar;
        this.f12272b = aVar;
        this.f12273c = androidx.core.app.r.e(bbVar);
        this.f12276f = new Intent(bbVar, bbVar.getClass());
    }

    public static /* synthetic */ void e(final s7 s7Var, t7 t7Var, final String str, final Bundle bundle, final v vVar) {
        if (s7Var.f12278h.b(t7Var, str, bundle)) {
            return;
        }
        s7Var.f12275e.execute(new Runnable() { // from class: androidx.media3.session.p7
            @Override // java.lang.Runnable
            public final void run() {
                this.f12118a.t(vVar, str, bundle);
            }
        });
    }

    public static /* synthetic */ void f(final s7 s7Var, final t7 t7Var, com.google.common.collect.x xVar, j7.b.a aVar, final boolean z11) {
        final j7 j7VarA = s7Var.f12278h.a(t7Var, xVar, s7Var.f12272b, aVar);
        s7Var.f12275e.execute(new Runnable() { // from class: androidx.media3.session.q7
            @Override // java.lang.Runnable
            public final void run() {
                this.f12160a.z(t7Var, j7VarA, z11);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void h(s7 s7Var, com.google.common.util.concurrent.s sVar, d dVar, t7 t7Var) {
        s7Var.getClass();
        try {
            v vVar = (v) sVar.get(0L, TimeUnit.MILLISECONDS);
            dVar.Y(s7Var.v(t7Var));
            vVar.D0(dVar);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException unused) {
            s7Var.f12271a.w(t7Var);
        }
    }

    private v l(t7 t7Var) {
        c cVar = this.f12277g.get(t7Var);
        if (cVar == null || !cVar.f12288a.isDone()) {
            return null;
        }
        try {
            return (v) com.google.common.util.concurrent.m.b(cVar.f12288a);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private boolean m(boolean z11) {
        List<t7> listM = this.f12271a.m();
        for (int i11 = 0; i11 < listM.size(); i11++) {
            v vVarL = l(listM.get(i11));
            if (vVarL != null && ((vVarL.t() || z11) && (vVarL.g() == 3 || vVarL.g() == 2))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(t7 t7Var) {
        c cVar = this.f12277g.get(t7Var);
        if (cVar != null) {
            cVar.f12289b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(int i11, t7 t7Var, j7 j7Var) {
        if (i11 == this.f12279i) {
            z(t7Var, j7Var, u(false));
        }
    }

    private void r() {
        x(true);
        j7 j7Var = this.f12280j;
        if (j7Var != null) {
            this.f12273c.b(j7Var.f11807a);
            this.f12279i++;
            this.f12280j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(v vVar, String str, Bundle bundle) {
        se next;
        com.google.common.collect.d1<se> it = vVar.c1().f12416a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.f12347a == 0 && next.f12348b.equals(str)) {
                break;
            }
        }
        if (next == null || !vVar.c1().c(next)) {
            return;
        }
        com.google.common.util.concurrent.m.a(vVar.m1(new se(str, bundle), Bundle.EMPTY), new a(str), com.google.common.util.concurrent.w.b());
    }

    private boolean v(t7 t7Var) {
        v vVarL = l(t7Var);
        if (vVarL == null || vVarL.J().u()) {
            return false;
        }
        c cVar = (c) s7.a.f(this.f12277g.get(t7Var));
        if (vVarL.g() != 1) {
            cVar.f12289b = false;
            cVar.f12290c = true;
            return true;
        }
        int i11 = this.f12285o;
        if (i11 == 1) {
            return !cVar.f12289b;
        }
        if (i11 == 2) {
            return false;
        }
        if (i11 == 3) {
            return !cVar.f12289b && cVar.f12290c;
        }
        throw new IllegalStateException();
    }

    @SuppressLint({"InlinedApi"})
    private void w(j7 j7Var) {
        androidx.core.content.b.startForegroundService(this.f12271a, this.f12276f);
        s7.q0.z1(this.f12271a, j7Var.f11807a, j7Var.f11808b, 2, "mediaPlayback");
        this.f12281k = true;
    }

    private void x(boolean z11) {
        b.a(this.f12271a, z11);
        this.f12281k = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public void z(t7 t7Var, j7 j7Var, boolean z11) {
        j7Var.f11808b.extras.putParcelable("android.mediaSession", t7Var.j());
        this.f12280j = j7Var;
        if (z11) {
            w(j7Var);
        } else {
            this.f12273c.g(j7Var.f11807a, j7Var.f11808b);
            x(false);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        List<t7> listM = this.f12271a.m();
        for (int i11 = 0; i11 < listM.size(); i11++) {
            this.f12271a.u(listM.get(i11), false);
        }
        return true;
    }

    public void j(final t7 t7Var) {
        if (this.f12277g.containsKey(t7Var)) {
            return;
        }
        final d dVar = new d(this.f12271a, t7Var);
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.media3.session.MediaNotificationManager", true);
        final com.google.common.util.concurrent.s<v> sVarB = new v.a(this.f12271a, t7Var.o()).d(bundle).e(dVar).c(Looper.getMainLooper()).b();
        this.f12277g.put(t7Var, new c(sVarB));
        sVarB.b(new Runnable() { // from class: androidx.media3.session.o7
            @Override // java.lang.Runnable
            public final void run() {
                s7.h(this.f12090a, sVarB, dVar, t7Var);
            }
        }, this.f12275e);
    }

    void k() {
        this.f12283m = false;
        if (this.f12274d.hasMessages(1)) {
            this.f12274d.removeMessages(1);
            List<t7> listM = this.f12271a.m();
            for (int i11 = 0; i11 < listM.size(); i11++) {
                this.f12271a.u(listM.get(i11), false);
            }
        }
    }

    public boolean n() {
        return this.f12281k;
    }

    public void o(final t7 t7Var, final String str, final Bundle bundle) {
        final v vVarL = l(t7Var);
        if (vVarL == null) {
            return;
        }
        s7.q0.m1(new Handler(t7Var.k().F0()), new Runnable() { // from class: androidx.media3.session.l7
            @Override // java.lang.Runnable
            public final void run() {
                s7.e(this.f11913a, t7Var, str, bundle, vVarL);
            }
        });
    }

    public void s(t7 t7Var) {
        c cVarRemove = this.f12277g.remove(t7Var);
        if (cVarRemove != null) {
            v.k1(cVarRemove.f12288a);
        }
    }

    boolean u(boolean z11) {
        boolean zM = m(z11);
        boolean z12 = this.f12283m && this.f12284n > 0;
        if (this.f12282l && !zM && z12) {
            this.f12274d.sendEmptyMessageDelayed(1, this.f12284n);
        } else if (zM) {
            this.f12274d.removeMessages(1);
        }
        this.f12282l = zM;
        return zM || this.f12274d.hasMessages(1);
    }

    public void y(final t7 t7Var, final boolean z11) {
        if (!this.f12271a.p(t7Var) || !v(t7Var)) {
            r();
            return;
        }
        final int i11 = this.f12279i + 1;
        this.f12279i = i11;
        final com.google.common.collect.x<androidx.media3.session.a> xVarF1 = ((v) s7.a.f(l(t7Var))).f1();
        final j7.b.a aVar = new j7.b.a() { // from class: androidx.media3.session.m7
            @Override // androidx.media3.session.j7.b.a
            public final void a(j7 j7Var) {
                s7 s7Var = this.f11969a;
                s7Var.f12275e.execute(new Runnable() { // from class: androidx.media3.session.r7
                    @Override // java.lang.Runnable
                    public final void run() {
                        s7Var.q(i, t7Var, j7Var);
                    }
                });
            }
        };
        s7.q0.m1(new Handler(t7Var.k().F0()), new Runnable() { // from class: androidx.media3.session.n7
            @Override // java.lang.Runnable
            public final void run() {
                s7.f(this.f11994a, t7Var, xVarF1, aVar, z11);
            }
        });
    }

    class a implements com.google.common.util.concurrent.l<ga.v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12286a;

        a(String str) {
            this.f12286a = str;
        }

        @Override // com.google.common.util.concurrent.l
        public void onFailure(Throwable th2) {
            s7.t.j("MediaNtfMng", "custom command " + this.f12286a + " produced an error: " + th2.getMessage(), th2);
        }

        @Override // com.google.common.util.concurrent.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ga.v vVar) {
        }
    }
}
