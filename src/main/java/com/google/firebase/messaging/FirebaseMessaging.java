package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static y0 f44190n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static ScheduledExecutorService f44192p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f44193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xv.a f44194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f44195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f0 f44196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u0 f44197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f44198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f44199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Executor f44200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Task<d1> f44201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k0 f44202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f44203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f44204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f44189m = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static yv.b<nq.j> f44191o = new yv.b() { // from class: com.google.firebase.messaging.r
        @Override // yv.b
        public final Object get() {
            return FirebaseMessaging.e();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final vv.d f44205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f44206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private vv.b<com.google.firebase.b> f44207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f44208d;

        a(vv.d dVar) {
            this.f44205a = dVar;
        }

        public static /* synthetic */ void a(a aVar, vv.a aVar2) {
            if (aVar.c()) {
                FirebaseMessaging.this.E();
            }
        }

        private Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextK = FirebaseMessaging.this.f44193a.k();
            SharedPreferences sharedPreferences = contextK.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextK.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextK.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            try {
                if (this.f44206b) {
                    return;
                }
                Boolean boolD = d();
                this.f44208d = boolD;
                if (boolD == null) {
                    vv.b<com.google.firebase.b> bVar = new vv.b() { // from class: com.google.firebase.messaging.c0
                        @Override // vv.b
                        public final void a(vv.a aVar) {
                            FirebaseMessaging.a.a(this.f44248a, aVar);
                        }
                    };
                    this.f44207c = bVar;
                    this.f44205a.c(com.google.firebase.b.class, bVar);
                }
                this.f44206b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f44208d;
            } catch (Throwable th2) {
                throw th2;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f44193a.t();
        }
    }

    FirebaseMessaging(com.google.firebase.f fVar, xv.a aVar, yv.b<qw.i> bVar, yv.b<wv.j> bVar2, zv.f fVar2, yv.b<nq.j> bVar3, vv.d dVar) {
        this(fVar, aVar, bVar, bVar2, fVar2, bVar3, dVar, new k0(fVar.k()));
    }

    private boolean C() {
        o0.c(this.f44195c);
        if (!o0.d(this.f44195c)) {
            return false;
        }
        if (this.f44193a.j(wu.a.class) != null) {
            return true;
        }
        return j0.a() && f44191o != null;
    }

    private synchronized void D() {
        if (!this.f44203k) {
            F(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        xv.a aVar = this.f44194b;
        if (aVar != null) {
            aVar.getToken();
        } else if (G(u())) {
            D();
        }
    }

    public static /* synthetic */ Task a(FirebaseMessaging firebaseMessaging, String str, y0.a aVar, String str2) {
        r(firebaseMessaging.f44195c).g(firebaseMessaging.s(), str, str2, firebaseMessaging.f44202j.a());
        if (aVar == null || !str2.equals(aVar.f44374a)) {
            firebaseMessaging.y(str2);
        }
        return Tasks.forResult(str2);
    }

    public static /* synthetic */ void b(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.z()) {
            firebaseMessaging.E();
        }
    }

    public static /* synthetic */ void c(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.getClass();
        try {
            taskCompletionSource.setResult(firebaseMessaging.m());
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    public static /* synthetic */ void d(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.getClass();
        try {
            firebaseMessaging.f44194b.a(k0.c(firebaseMessaging.f44193a), "FCM");
            taskCompletionSource.setResult(null);
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    public static /* synthetic */ nq.j e() {
        return null;
    }

    public static /* synthetic */ void g(FirebaseMessaging firebaseMessaging, CloudMessage cloudMessage) {
        firebaseMessaging.getClass();
        if (cloudMessage != null) {
            j0.y(cloudMessage.getIntent());
            firebaseMessaging.w();
        }
    }

    @NonNull
    @Keep
    static synchronized FirebaseMessaging getInstance(@NonNull com.google.firebase.f fVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) fVar.j(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static /* synthetic */ void i(FirebaseMessaging firebaseMessaging, d1 d1Var) {
        if (firebaseMessaging.z()) {
            d1Var.n();
        }
    }

    public static /* synthetic */ void j(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.getClass();
        try {
            Tasks.await(firebaseMessaging.f44196d.c());
            r(firebaseMessaging.f44195c).d(firebaseMessaging.s(), k0.c(firebaseMessaging.f44193a));
            taskCompletionSource.setResult(null);
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    @NonNull
    public static synchronized FirebaseMessaging q() {
        return getInstance(com.google.firebase.f.l());
    }

    @NonNull
    private static synchronized y0 r(Context context) {
        try {
            if (f44190n == null) {
                f44190n = new y0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44190n;
    }

    private String s() {
        return "[DEFAULT]".equals(this.f44193a.m()) ? "" : this.f44193a.o();
    }

    public static nq.j v() {
        return f44191o.get();
    }

    private void w() {
        this.f44196d.f().addOnSuccessListener(this.f44199g, new OnSuccessListener() { // from class: com.google.firebase.messaging.y
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.g(this.f44371a, (CloudMessage) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        o0.c(this.f44195c);
        q0.f(this.f44195c, this.f44196d, C());
        if (C()) {
            w();
        }
    }

    private void y(String str) {
        if ("[DEFAULT]".equals(this.f44193a.m())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f44193a.m());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new n(this.f44195c).g(intent);
        }
    }

    boolean A() {
        return this.f44202j.g();
    }

    synchronized void B(boolean z11) {
        this.f44203k = z11;
    }

    synchronized void F(long j11) {
        o(new z0(this, Math.min(Math.max(30L, 2 * j11), f44189m)), j11);
        this.f44203k = true;
    }

    boolean G(y0.a aVar) {
        return aVar == null || aVar.b(this.f44202j.a());
    }

    String m() throws IOException {
        xv.a aVar = this.f44194b;
        if (aVar != null) {
            try {
                return (String) Tasks.await(aVar.c());
            } catch (InterruptedException | ExecutionException e11) {
                throw new IOException(e11);
            }
        }
        final y0.a aVarU = u();
        if (!G(aVarU)) {
            return aVarU.f44374a;
        }
        final String strC = k0.c(this.f44193a);
        try {
            return (String) Tasks.await(this.f44197e.b(strC, new u0.a() { // from class: com.google.firebase.messaging.z
                @Override // com.google.firebase.messaging.u0.a
                public final Task start() {
                    FirebaseMessaging firebaseMessaging = this.f44377a;
                    return firebaseMessaging.f44196d.g().onSuccessTask(firebaseMessaging.f44200h, new SuccessContinuation() { // from class: com.google.firebase.messaging.s
                        @Override // com.google.android.gms.tasks.SuccessContinuation
                        public final Task then(Object obj) {
                            return FirebaseMessaging.a(this.f44346a, str, aVar, (String) obj);
                        }
                    });
                }
            }));
        } catch (InterruptedException | ExecutionException e12) {
            throw new IOException(e12);
        }
    }

    @NonNull
    public Task<Void> n() {
        if (this.f44194b != null) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f44199g.execute(new Runnable() { // from class: com.google.firebase.messaging.a0
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.d(this.f44234a, taskCompletionSource);
                }
            });
            return taskCompletionSource.getTask();
        }
        if (u() == null) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        o.e().execute(new Runnable() { // from class: com.google.firebase.messaging.b0
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.j(this.f44242a, taskCompletionSource2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    @SuppressLint({"ThreadPoolCreation"})
    void o(Runnable runnable, long j11) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f44192p == null) {
                    f44192p = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                f44192p.schedule(runnable, j11, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    Context p() {
        return this.f44195c;
    }

    @NonNull
    public Task<String> t() {
        xv.a aVar = this.f44194b;
        if (aVar != null) {
            return aVar.c();
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f44199g.execute(new Runnable() { // from class: com.google.firebase.messaging.x
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.c(this.f44363a, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    y0.a u() {
        return r(this.f44195c).e(s(), k0.c(this.f44193a));
    }

    public boolean z() {
        return this.f44198f.c();
    }

    FirebaseMessaging(com.google.firebase.f fVar, xv.a aVar, yv.b<qw.i> bVar, yv.b<wv.j> bVar2, zv.f fVar2, yv.b<nq.j> bVar3, vv.d dVar, k0 k0Var) {
        this(fVar, aVar, bVar3, dVar, k0Var, new f0(fVar, k0Var, bVar, bVar2, fVar2), o.f(), o.c(), o.b());
    }

    FirebaseMessaging(com.google.firebase.f fVar, xv.a aVar, yv.b<nq.j> bVar, vv.d dVar, k0 k0Var, f0 f0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f44203k = false;
        f44191o = bVar;
        this.f44193a = fVar;
        this.f44194b = aVar;
        this.f44198f = new a(dVar);
        Context contextK = fVar.k();
        this.f44195c = contextK;
        q qVar = new q();
        this.f44204l = qVar;
        this.f44202j = k0Var;
        this.f44196d = f0Var;
        this.f44197e = new u0(executor);
        this.f44199g = executor2;
        this.f44200h = executor3;
        Context contextK2 = fVar.k();
        if (contextK2 instanceof Application) {
            ((Application) contextK2).registerActivityLifecycleCallbacks(qVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + contextK2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.b(new xv.a.InterfaceC2685a() { // from class: com.google.firebase.messaging.t
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.b(this.f44352a);
            }
        });
        Task<d1> taskE = d1.e(this, k0Var, f0Var, contextK, o.g());
        this.f44201i = taskE;
        taskE.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: com.google.firebase.messaging.v
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.i(this.f44355a, (d1) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f44361a.x();
            }
        });
    }
}
