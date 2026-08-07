package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Marker;
import yu.t;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f44134k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final Map<String, f> f44135l = new androidx.collection.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f44136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f44137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f44138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yu.n f44139d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t<ew.a> f44142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final yv.b<wv.f> f44143h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f44140e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f44141f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<a> f44144i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<g> f44145j = new CopyOnWriteArrayList();

    @KeepForSdk
    public interface a {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z11);
    }

    @TargetApi(14)
    private static class b implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static AtomicReference<b> f44146a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f44146a.get() == null) {
                    b bVar = new b();
                    if (androidx.camera.view.i.a(f44146a, null, bVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z11) {
            synchronized (f.f44134k) {
                try {
                    for (f fVar : new ArrayList(f.f44135l.values())) {
                        if (fVar.f44140e.get()) {
                            fVar.w(z11);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @TargetApi(24)
    private static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static AtomicReference<c> f44147b = new AtomicReference<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f44148a;

        public c(Context context) {
            this.f44148a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f44147b.get() == null) {
                c cVar = new c(context);
                if (androidx.camera.view.i.a(f44147b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f44148a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (f.f44134k) {
                try {
                    Iterator<f> it = f.f44135l.values().iterator();
                    while (it.hasNext()) {
                        it.next().p();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c();
        }
    }

    protected f(final Context context, String str, m mVar) {
        this.f44136a = (Context) Preconditions.checkNotNull(context);
        this.f44137b = Preconditions.checkNotEmpty(str);
        this.f44138c = (m) Preconditions.checkNotNull(mVar);
        n nVarB = FirebaseInitProvider.b();
        zw.c.b("Firebase");
        zw.c.b("ComponentDiscovery");
        List<yv.b<ComponentRegistrar>> listB = yu.f.c(context, ComponentDiscoveryService.class).b();
        zw.c.a();
        zw.c.b("Runtime");
        yu.n.b bVarF = yu.n.m(zu.k.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(yu.c.q(context, Context.class, new Class[0])).b(yu.c.q(this, f.class, new Class[0])).b(yu.c.q(mVar, m.class, new Class[0])).f(new zw.b());
        if (q5.l.a(context) && FirebaseInitProvider.c()) {
            bVarF.b(yu.c.q(nVarB, n.class, new Class[0]));
        }
        yu.n nVarE = bVarF.e();
        this.f44139d = nVarE;
        zw.c.a();
        this.f44142g = new t<>(new yv.b() { // from class: com.google.firebase.d
            @Override // yv.b
            public final Object get() {
                return f.b(this.f44131a, context);
            }
        });
        this.f44143h = nVarE.h(wv.f.class);
        g(new a() { // from class: com.google.firebase.e
            @Override // com.google.firebase.f.a
            public final void onBackgroundStateChanged(boolean z11) {
                f.a(this.f44133a, z11);
            }
        });
        zw.c.a();
    }

    public static /* synthetic */ void a(f fVar, boolean z11) {
        if (z11) {
            fVar.getClass();
        } else {
            fVar.f44143h.get().h();
        }
    }

    public static /* synthetic */ ew.a b(f fVar, Context context) {
        return new ew.a(context, fVar.o(), (vv.c) fVar.f44139d.a(vv.c.class));
    }

    private void i() {
        Preconditions.checkState(!this.f44141f.get(), "FirebaseApp was deleted");
    }

    @NonNull
    public static f l() {
        f fVar;
        synchronized (f44134k) {
            try {
                fVar = f44135l.get("[DEFAULT]");
                if (fVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                fVar.f44143h.get().h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (!q5.l.a(this.f44136a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m());
            c.b(this.f44136a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m());
        this.f44139d.p(u());
        this.f44143h.get().h();
    }

    public static f q(@NonNull Context context) {
        synchronized (f44134k) {
            try {
                if (f44135l.containsKey("[DEFAULT]")) {
                    return l();
                }
                m mVarA = m.a(context);
                if (mVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return r(context, mVarA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public static f r(@NonNull Context context, @NonNull m mVar) {
        return s(context, mVar, "[DEFAULT]");
    }

    @NonNull
    public static f s(@NonNull Context context, @NonNull m mVar, @NonNull String str) {
        f fVar;
        b.b(context);
        String strV = v(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f44134k) {
            Map<String, f> map = f44135l;
            Preconditions.checkState(!map.containsKey(strV), "FirebaseApp name " + strV + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            fVar = new f(context, strV, mVar);
            map.put(strV, fVar);
        }
        fVar.p();
        return fVar;
    }

    private static String v(@NonNull String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(boolean z11) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<a> it = this.f44144i.iterator();
        while (it.hasNext()) {
            it.next().onBackgroundStateChanged(z11);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f44137b.equals(((f) obj).m());
        }
        return false;
    }

    @KeepForSdk
    public void g(a aVar) {
        i();
        if (this.f44140e.get() && BackgroundDetector.getInstance().isInBackground()) {
            aVar.onBackgroundStateChanged(true);
        }
        this.f44144i.add(aVar);
    }

    @KeepForSdk
    public void h(@NonNull g gVar) {
        i();
        Preconditions.checkNotNull(gVar);
        this.f44145j.add(gVar);
    }

    public int hashCode() {
        return this.f44137b.hashCode();
    }

    @KeepForSdk
    public <T> T j(Class<T> cls) {
        i();
        return (T) this.f44139d.a(cls);
    }

    @NonNull
    public Context k() {
        i();
        return this.f44136a;
    }

    @NonNull
    public String m() {
        i();
        return this.f44137b;
    }

    @NonNull
    public m n() {
        i();
        return this.f44138c;
    }

    @KeepForSdk
    public String o() {
        return Base64Utils.encodeUrlSafeNoPadding(m().getBytes(Charset.defaultCharset())) + Marker.ANY_NON_NULL_MARKER + Base64Utils.encodeUrlSafeNoPadding(n().c().getBytes(Charset.defaultCharset()));
    }

    @KeepForSdk
    public boolean t() {
        i();
        return this.f44142g.get().b();
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.f44137b).add("options", this.f44138c).toString();
    }

    @KeepForSdk
    public boolean u() {
        return "[DEFAULT]".equals(m());
    }

    @KeepForSdk
    public void x(Boolean bool) {
        i();
        this.f44142g.get().e(bool);
    }

    @KeepForSdk
    @Deprecated
    public void y(boolean z11) {
        x(Boolean.valueOf(z11));
    }
}
