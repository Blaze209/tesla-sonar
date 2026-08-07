package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f44080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.f f44081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0 f44082c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a0 f44085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a0 f44086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f44087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p f44088i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k0 f44089j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final jv.g f44090k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dv.b f44091l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final cv.a f44092m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final m f44093n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final bv.a f44094o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final bv.k f44095p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ev.i f44096q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f44084e = System.currentTimeMillis();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p0 f44083d = new p0();

    public z(com.google.firebase.f fVar, k0 k0Var, bv.a aVar, f0 f0Var, dv.b bVar, cv.a aVar2, jv.g gVar, m mVar, bv.k kVar, ev.i iVar) {
        this.f44081b = fVar;
        this.f44082c = f0Var;
        this.f44080a = fVar.k();
        this.f44089j = k0Var;
        this.f44094o = aVar;
        this.f44091l = bVar;
        this.f44092m = aVar2;
        this.f44090k = gVar;
        this.f44093n = mVar;
        this.f44095p = kVar;
        this.f44096q = iVar;
    }

    private void i() {
        try {
            this.f44087h = Boolean.TRUE.equals((Boolean) this.f44096q.common.d().submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.common.u
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f44068a.f44088i.t());
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f44087h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(lv.j jVar) {
        ev.i.c();
        w();
        try {
            try {
                this.f44091l.a(new dv.a() { // from class: com.google.firebase.crashlytics.internal.common.x
                    @Override // dv.a
                    public final void a(String str) {
                        this.f44076a.t(str);
                    }
                });
                this.f44088i.S();
                if (!jVar.a().f90794b.f90801a) {
                    bv.g.f().b("Collection of crash reports disabled in Crashlytics settings.");
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f44088i.A(jVar)) {
                    bv.g.f().k("Previous sessions could not be finalized.");
                }
                this.f44088i.X(jVar.b());
                v();
            } catch (Exception e11) {
                bv.g.f().e("Crashlytics encountered a problem during asynchronous initialization.", e11);
                v();
            }
        } catch (Throwable th2) {
            v();
            throw th2;
        }
    }

    private void p(final lv.j jVar) {
        Future<?> futureSubmit = this.f44096q.common.d().submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f44073a.n(jVar);
            }
        });
        bv.g.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e11) {
            bv.g.f().e("Crashlytics was interrupted during initialization.", e11);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e12) {
            bv.g.f().e("Crashlytics encountered a problem during initialization.", e12);
        } catch (TimeoutException e13) {
            bv.g.f().e("Crashlytics timed out during initialization.", e13);
        }
    }

    public static String q() {
        return "20.0.3";
    }

    static boolean r(String str, boolean z11) {
        if (!z11) {
            bv.g.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    public void A(final String str, final String str2) {
        this.f44096q.common.e(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f44055a.f44088i.U(str, str2);
            }
        });
    }

    public void B(final String str) {
        this.f44096q.common.e(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f44052a.f44088i.W(str);
            }
        });
    }

    @NonNull
    public Task<Boolean> j() {
        return this.f44088i.n();
    }

    public Task<Void> k() {
        return this.f44088i.s();
    }

    public boolean l() {
        return this.f44087h;
    }

    boolean m() {
        return this.f44085f.c();
    }

    public Task<Void> o(final lv.j jVar) {
        return this.f44096q.common.e(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f44046a.n(jVar);
            }
        });
    }

    public boolean s() {
        return this.f44082c.d();
    }

    public void t(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.f44084e;
        this.f44096q.common.e(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.v
            @Override // java.lang.Runnable
            public final void run() {
                z zVar = this.f44069a;
                zVar.f44096q.diskWrite.e(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        zVar.f44088i.b0(j, str);
                    }
                });
            }
        });
    }

    public void u(@NonNull final Throwable th2, @NonNull final Map<String, String> map) {
        this.f44096q.common.e(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f44058a.f44088i.a0(Thread.currentThread(), th2, map);
            }
        });
    }

    void v() {
        ev.i.c();
        try {
            if (this.f44085f.d()) {
                return;
            }
            bv.g.f().k("Initialization marker file was not properly removed.");
        } catch (Exception e11) {
            bv.g.f().e("Problem encountered deleting Crashlytics initialization marker.", e11);
        }
    }

    void w() {
        ev.i.c();
        this.f44085f.a();
        bv.g.f().i("Initialization marker file was created.");
    }

    public boolean x(a aVar, lv.j jVar) {
        if (!r(aVar.f43928b, i.i(this.f44080a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String strC = new h().c();
        try {
            this.f44086g = new a0("crash_marker", this.f44090k);
            this.f44085f = new a0("initialization_marker", this.f44090k);
            fv.p pVar = new fv.p(strC, this.f44090k, this.f44096q);
            fv.f fVar = new fv.f(this.f44090k);
            mv.a aVar2 = new mv.a(1024, new mv.c(10));
            this.f44095p.b(pVar);
            this.f44088i = new p(this.f44080a, this.f44089j, this.f44082c, this.f44090k, this.f44086g, aVar, pVar, fVar, t0.j(this.f44080a, this.f44089j, this.f44090k, aVar, fVar, pVar, aVar2, jVar, this.f44083d, this.f44093n, this.f44096q), this.f44094o, this.f44092m, this.f44093n, this.f44096q);
            boolean zM = m();
            i();
            this.f44088i.y(strC, Thread.getDefaultUncaughtExceptionHandler(), jVar);
            if (!zM || !i.d(this.f44080a)) {
                bv.g.f().b("Successfully configured exception handler.");
                return true;
            }
            bv.g.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            p(jVar);
            return false;
        } catch (Exception e11) {
            bv.g.f().e("Crashlytics was not started due to an exception during initialization", e11);
            this.f44088i = null;
            return false;
        }
    }

    public Task<Void> y() {
        return this.f44088i.T();
    }

    public void z(Boolean bool) {
        this.f44082c.h(bool);
    }
}
