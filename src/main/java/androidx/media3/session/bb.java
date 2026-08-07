package androidx.media3.session;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.media3.session.bb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bb extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f11538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s7 f11539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l f11540e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f11536a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f11537b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, t7> f11541f = new androidx.collection.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f11542g = false;

    private static final class b {
        public static boolean a(IllegalStateException illegalStateException) {
            return ga.o.a(illegalStateException);
        }
    }

    public interface c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final class d implements t7.h {
        private d() {
        }

        @Override // androidx.media3.session.t7.h
        public void a(t7 t7Var) {
            bb.this.u(t7Var, false);
        }

        @Override // androidx.media3.session.t7.h
        public boolean b(t7 t7Var) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 31 || i11 >= 33 || bb.this.j().n()) {
                return true;
            }
            return bb.this.u(t7Var, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class e extends p.a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final WeakReference<bb> f11544n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final Handler f11545o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final Set<n> f11546p = Collections.synchronizedSet(new HashSet());

        public e(bb bbVar) {
            this.f11544n = new WeakReference<>(bbVar);
            this.f11545o = new Handler(bbVar.getApplicationContext().getMainLooper());
        }

        public static /* synthetic */ void S2(e eVar, n nVar, ha.n.b bVar, g gVar, boolean z11) {
            eVar.f11546p.remove(nVar);
            try {
                try {
                    bb bbVar = eVar.f11544n.get();
                    if (bbVar == null) {
                        xe.a(nVar);
                        return;
                    }
                    int i11 = gVar.f11692a;
                    int i12 = gVar.f11693b;
                    t7.g gVar2 = new t7.g(bVar, i11, i12, z11, new le.a(nVar, i12), gVar.f11696e, gVar.f11697f);
                    t7 t7VarR = bbVar.r(gVar2);
                    if (t7VarR == null) {
                        xe.a(nVar);
                        return;
                    } else {
                        bbVar.f(t7VarR);
                        t7VarR.q(nVar, gVar2);
                        return;
                    }
                } catch (Exception e11) {
                    s7.t.j("MSessionService", "Failed to add a session to session service", e11);
                    xe.a(nVar);
                    return;
                }
            } catch (Throwable th2) {
                xe.a(nVar);
                throw th2;
            }
            xe.a(nVar);
            throw th2;
        }

        public void T2() {
            this.f11544n.clear();
            this.f11545o.removeCallbacksAndMessages(null);
            Iterator<n> it = this.f11546p.iterator();
            while (it.hasNext()) {
                xe.a(it.next());
            }
            this.f11546p.clear();
        }

        @Override // androidx.media3.session.p
        public void m2(final n nVar, Bundle bundle) {
            if (nVar == null || bundle == null) {
                xe.a(nVar);
                return;
            }
            try {
                final g gVarA = g.a(bundle);
                bb bbVar = this.f11544n.get();
                if (bbVar == null) {
                    xe.a(nVar);
                    return;
                }
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                if (callingPid == 0) {
                    callingPid = gVarA.f11695d;
                }
                final ha.n.b bVar = new ha.n.b(gVarA.f11694c, callingPid, callingUid);
                final boolean zB = ha.n.a(bbVar.getApplicationContext()).b(bVar);
                this.f11546p.add(nVar);
                try {
                    this.f11545o.post(new Runnable() { // from class: androidx.media3.session.cb
                        @Override // java.lang.Runnable
                        public final void run() {
                            bb.e.S2(this.f11578a, nVar, bVar, gVarA, zB);
                        }
                    });
                } finally {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            } catch (RuntimeException e11) {
                s7.t.j("MSessionService", "Ignoring malformed Bundle for ConnectionRequest", e11);
                xe.a(nVar);
            }
        }
    }

    public static /* synthetic */ void a(s8 s8Var, Intent intent) {
        t7.g gVarG0 = s8Var.g0();
        if (gVarG0 == null) {
            gVarG0 = g(intent);
        }
        if (s8Var.C0(gVarG0, intent)) {
            return;
        }
        s7.t.b("MSessionService", "Ignored unrecognized media button intent.");
    }

    public static /* synthetic */ void c(bb bbVar, t7 t7Var) {
        bbVar.j().j(t7Var);
        t7Var.t(new d());
    }

    public static /* synthetic */ void d(bb bbVar, t7 t7Var) {
        bbVar.j().s(t7Var);
        t7Var.a();
    }

    private static t7.g g(Intent intent) {
        ComponentName component = intent.getComponent();
        return new t7.g(new ha.n.b(component != null ? component.getPackageName() : "androidx.media3.session.MediaSessionService", -1, -1), 1008000300, 7, false, null, Bundle.EMPTY, 0);
    }

    private l h() {
        if (this.f11540e == null) {
            this.f11540e = new l(this);
        }
        return this.f11540e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c i() {
        synchronized (this.f11536a) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public s7 j() {
        return k(null);
    }

    private s7 k(j7.b bVar) {
        if (this.f11539d == null) {
            if (bVar == null) {
                s7.a.k(getBaseContext(), "Accessing service context before onCreate()");
                bVar = new m.d(getApplicationContext()).f();
            }
            this.f11539d = new s7(this, bVar, h());
        }
        return this.f11539d;
    }

    private boolean n() {
        List<t7> listM = m();
        for (int i11 = 0; i11 < listM.size(); i11++) {
            if (listM.get(i11).k().isPlaying()) {
                return true;
            }
        }
        return false;
    }

    private void q() {
        this.f11537b.post(new Runnable() { // from class: ga.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f67695a.i();
            }
        });
    }

    public final void f(final t7 t7Var) {
        t7 t7Var2;
        s7.a.g(t7Var, "session must not be null");
        boolean z11 = true;
        s7.a.b(!t7Var.r(), "session is already released");
        synchronized (this.f11536a) {
            t7Var2 = this.f11541f.get(t7Var.e());
            if (t7Var2 != null && t7Var2 != t7Var) {
                z11 = false;
            }
            s7.a.b(z11, "Session ID should be unique");
            this.f11541f.put(t7Var.e(), t7Var);
        }
        if (t7Var2 == null) {
            s7.q0.m1(this.f11537b, new Runnable() { // from class: ga.l
                @Override // java.lang.Runnable
                public final void run() {
                    bb.c(this.f67693a, t7Var);
                }
            });
        }
    }

    IBinder l() {
        return ((e) s7.a.j(this.f11538c)).asBinder();
    }

    public final List<t7> m() {
        ArrayList arrayList;
        synchronized (this.f11536a) {
            arrayList = new ArrayList(this.f11541f.values());
        }
        return arrayList;
    }

    public boolean o() {
        return j().n();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String action;
        t7 t7VarR;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            return l();
        }
        if (!action.equals("android.media.browse.MediaBrowserService") || (t7VarR = r(t7.g.a())) == null) {
            return null;
        }
        f(t7VarR);
        return t7VarR.g();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f11538c = new e(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        e eVar = this.f11538c;
        if (eVar != null) {
            eVar.T2();
            this.f11538c = null;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, int i11, int i12) {
        String strF;
        if (intent == null) {
            return 1;
        }
        l lVarH = h();
        Uri data = intent.getData();
        t7 t7VarL = data != null ? t7.l(data) : null;
        if (lVarH.k(intent)) {
            if (t7VarL == null) {
                t7VarL = r(t7.g.a());
                if (t7VarL == null) {
                    return 1;
                }
                f(t7VarL);
            }
            final s8 s8VarF = t7VarL.f();
            s8VarF.X().post(new Runnable() { // from class: androidx.media3.session.ab
                @Override // java.lang.Runnable
                public final void run() {
                    bb.a(s8VarF, intent);
                }
            });
        } else {
            if (t7VarL == null || !lVarH.j(intent) || (strF = lVarH.f(intent)) == null) {
                return 1;
            }
            j().o(t7VarL, strF, lVarH.g(intent));
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        if (o() && n()) {
            return;
        }
        v();
    }

    public final boolean p(t7 t7Var) {
        boolean zContainsKey;
        synchronized (this.f11536a) {
            zContainsKey = this.f11541f.containsKey(t7Var.e());
        }
        return zContainsKey;
    }

    public abstract t7 r(t7.g gVar);

    @Deprecated
    public void s(t7 t7Var) {
        this.f11542g = true;
    }

    public void t(t7 t7Var, boolean z11) {
        s(t7Var);
        if (this.f11542g) {
            j().y(t7Var, z11);
        }
    }

    boolean u(t7 t7Var, boolean z11) {
        try {
            t(t7Var, j().u(z11));
            return true;
        } catch (IllegalStateException e11) {
            if (Build.VERSION.SDK_INT < 31 || !b.a(e11)) {
                throw e11;
            }
            s7.t.e("MSessionService", "Failed to start foreground", e11);
            q();
            return false;
        }
    }

    public void v() {
        j().k();
        List<t7> listM = m();
        for (int i11 = 0; i11 < listM.size(); i11++) {
            listM.get(i11).k().G(false);
        }
        stopSelf();
    }

    public final void w(final t7 t7Var) {
        s7.a.g(t7Var, "session must not be null");
        synchronized (this.f11536a) {
            s7.a.b(this.f11541f.containsKey(t7Var.e()), "session not found");
            this.f11541f.remove(t7Var.e());
        }
        s7.q0.m1(this.f11537b, new Runnable() { // from class: ga.n
            @Override // java.lang.Runnable
            public final void run() {
                bb.d(this.f67696a, t7Var);
            }
        });
    }
}
