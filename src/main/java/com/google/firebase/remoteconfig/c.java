package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.camera.view.i;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.f;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.internal.t;
import com.google.firebase.remoteconfig.internal.u;
import com.google.firebase.remoteconfig.internal.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import sw.e;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class c implements tw.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Clock f44609j = DefaultClock.getInstance();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Random f44610k = new Random();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Map<String, com.google.firebase.remoteconfig.a> f44611l = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, com.google.firebase.remoteconfig.a> f44612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f44613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f44614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f44615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zv.f f44616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final tu.b f44617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final yv.b<wu.a> f44618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f44619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, String> f44620i;

    private static class a implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final AtomicReference<a> f44621a = new AtomicReference<>();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<a> atomicReference = f44621a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (i.a(atomicReference, null, aVar)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(aVar);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z11) {
            c.q(z11);
        }
    }

    c(Context context, @xu.b ScheduledExecutorService scheduledExecutorService, f fVar, zv.f fVar2, tu.b bVar, yv.b<wu.a> bVar2) {
        this(context, scheduledExecutorService, fVar, fVar2, bVar, bVar2, true);
    }

    public static /* synthetic */ wu.a b() {
        return null;
    }

    private com.google.firebase.remoteconfig.internal.f f(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.f.h(this.f44614c, u.c(this.f44613b, String.format("%s_%s_%s_%s.json", "frc", this.f44619h, str, str2)));
    }

    private o j(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return new o(this.f44614c, fVar, fVar2);
    }

    private static x k(f fVar, String str, yv.b<wu.a> bVar) {
        if (p(fVar) && str.equals("firebase")) {
            return new x(bVar);
        }
        return null;
    }

    private e m(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return new e(fVar, sw.a.a(fVar, fVar2), this.f44614c);
    }

    static t n(Context context, String str, String str2) {
        return new t(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private static boolean o(f fVar, String str) {
        return str.equals("firebase") && p(fVar);
    }

    private static boolean p(f fVar) {
        return fVar.m().equals("[DEFAULT]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void q(boolean z11) {
        Iterator<com.google.firebase.remoteconfig.a> it = f44611l.values().iterator();
        while (it.hasNext()) {
            it.next().m(z11);
        }
    }

    @Override // tw.a
    public void a(@NonNull String str, @NonNull uw.f fVar) {
        e(str).j().e(fVar);
    }

    synchronized com.google.firebase.remoteconfig.a d(f fVar, String str, zv.f fVar2, tu.b bVar, Executor executor, com.google.firebase.remoteconfig.internal.f fVar3, com.google.firebase.remoteconfig.internal.f fVar4, com.google.firebase.remoteconfig.internal.f fVar5, m mVar, o oVar, t tVar, e eVar) throws Throwable {
        c cVar;
        String str2;
        try {
            try {
                if (this.f44612a.containsKey(str)) {
                    cVar = this;
                    str2 = str;
                } else {
                    cVar = this;
                    str2 = str;
                    com.google.firebase.remoteconfig.a aVar = new com.google.firebase.remoteconfig.a(this.f44613b, fVar, fVar2, o(fVar, str) ? bVar : null, executor, fVar3, fVar4, fVar5, mVar, oVar, tVar, l(fVar, fVar2, mVar, fVar4, this.f44613b, str, tVar), eVar);
                    aVar.n();
                    cVar.f44612a.put(str2, aVar);
                    f44611l.put(str2, aVar);
                }
                return cVar.f44612a.get(str2);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @KeepForSdk
    public synchronized com.google.firebase.remoteconfig.a e(String str) throws Throwable {
        Throwable th2;
        try {
            try {
                com.google.firebase.remoteconfig.internal.f fVarF = f(str, "fetch");
                com.google.firebase.remoteconfig.internal.f fVarF2 = f(str, "activate");
                com.google.firebase.remoteconfig.internal.f fVarF3 = f(str, "defaults");
                t tVarN = n(this.f44613b, this.f44619h, str);
                o oVarJ = j(fVarF2, fVarF3);
                final x xVarK = k(this.f44615d, str, this.f44618g);
                if (xVarK != null) {
                    try {
                        oVarJ.b(new BiConsumer() { // from class: rw.k
                            @Override // com.google.android.gms.common.util.BiConsumer
                            public final void accept(Object obj, Object obj2) {
                                xVarK.a((String) obj, (com.google.firebase.remoteconfig.internal.g) obj2);
                            }
                        });
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                return d(this.f44615d, str, this.f44616e, this.f44617f, this.f44614c, fVarF, fVarF2, fVarF3, h(str, fVarF, tVarN), oVarJ, tVarN, m(fVarF2, fVarF3));
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    com.google.firebase.remoteconfig.a g() {
        return e("firebase");
    }

    synchronized m h(String str, com.google.firebase.remoteconfig.internal.f fVar, t tVar) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return new m(this.f44616e, p(this.f44615d) ? this.f44618g : new yv.b() { // from class: rw.l
            @Override // yv.b
            public final Object get() {
                return com.google.firebase.remoteconfig.c.b();
            }
        }, this.f44614c, f44609j, f44610k, fVar, i(this.f44615d.n().b(), str, tVar), tVar, this.f44620i);
    }

    ConfigFetchHttpClient i(String str, String str2, t tVar) {
        return new ConfigFetchHttpClient(this.f44613b, this.f44615d.n().c(), str, str2, tVar.c(), tVar.c());
    }

    synchronized p l(f fVar, zv.f fVar2, m mVar, com.google.firebase.remoteconfig.internal.f fVar3, Context context, String str, t tVar) {
        return new p(fVar, fVar2, mVar, fVar3, context, str, tVar, this.f44614c);
    }

    protected c(Context context, ScheduledExecutorService scheduledExecutorService, f fVar, zv.f fVar2, tu.b bVar, yv.b<wu.a> bVar2, boolean z11) {
        this.f44612a = new HashMap();
        this.f44620i = new HashMap();
        this.f44613b = context;
        this.f44614c = scheduledExecutorService;
        this.f44615d = fVar;
        this.f44616e = fVar2;
        this.f44617f = bVar;
        this.f44618g = bVar2;
        this.f44619h = fVar.n().c();
        a.b(context);
        if (z11) {
            Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.remoteconfig.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f44608a.g();
                }
            });
        }
    }
}
