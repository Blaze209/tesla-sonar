package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.u;
import com.bumptech.glide.load.resource.bitmap.v;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rj.o;

/* JADX INFO: loaded from: classes3.dex */
public class c implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile c f20453k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile boolean f20454l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.j f20455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gj.d f20456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hj.h f20457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f20458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final gj.b f20459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f20460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final rj.c f20461g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f20463i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<l> f20462h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f20464j = g.NORMAL;

    public interface a {
        @NonNull
        com.bumptech.glide.request.i build();
    }

    c(@NonNull Context context, @NonNull com.bumptech.glide.load.engine.j jVar, @NonNull hj.h hVar, @NonNull gj.d dVar, @NonNull gj.b bVar, @NonNull o oVar, @NonNull rj.c cVar, int i11, @NonNull a aVar, @NonNull Map<Class<?>, m<?, ?>> map, @NonNull List<com.bumptech.glide.request.h<Object>> list, @NonNull List<sj.b> list2, sj.a aVar2, @NonNull f fVar) {
        this.f20455a = jVar;
        this.f20456b = dVar;
        this.f20459e = bVar;
        this.f20457c = hVar;
        this.f20460f = oVar;
        this.f20461g = cVar;
        this.f20463i = aVar;
        this.f20458d = new e(context, bVar, j.d(this, list2, aVar2), new uj.g(), aVar, map, list, jVar, fVar, i11);
    }

    @NonNull
    @Deprecated
    public static l A(@NonNull Activity activity) {
        return C(activity.getApplicationContext());
    }

    @NonNull
    @Deprecated
    public static l B(@NonNull Fragment fragment) {
        Activity activity = fragment.getActivity();
        xj.k.e(activity, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return C(activity.getApplicationContext());
    }

    @NonNull
    public static l C(@NonNull Context context) {
        return p(context).f(context);
    }

    @NonNull
    public static l D(@NonNull View view) {
        return p(view.getContext()).g(view);
    }

    @NonNull
    public static l E(@NonNull androidx.fragment.app.Fragment fragment) {
        return p(fragment.getContext()).h(fragment);
    }

    @NonNull
    public static l F(@NonNull u uVar) {
        return p(uVar).i(uVar);
    }

    static void a(@NonNull Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f20454l) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f20454l = true;
        try {
            s(context, generatedAppGlideModule);
        } finally {
            f20454l = false;
        }
    }

    public static void d() {
        v.b().h();
    }

    @NonNull
    public static c e(@NonNull Context context) {
        if (f20453k == null) {
            GeneratedAppGlideModule generatedAppGlideModuleF = f(context.getApplicationContext());
            synchronized (c.class) {
                try {
                    if (f20453k == null) {
                        a(context, generatedAppGlideModuleF);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f20453k;
    }

    private static GeneratedAppGlideModule f(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e11) {
            x(e11);
            return null;
        } catch (InstantiationException e12) {
            x(e12);
            return null;
        } catch (NoSuchMethodException e13) {
            x(e13);
            return null;
        } catch (InvocationTargetException e14) {
            x(e14);
            return null;
        }
    }

    public static File l(@NonNull Context context) {
        return m(context, "image_manager_disk_cache");
    }

    public static File m(@NonNull Context context, @NonNull String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            if (Log.isLoggable("Glide", 6)) {
                Log.e("Glide", "default disk cache dir is null");
            }
            return null;
        }
        File file = new File(cacheDir, str);
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @NonNull
    private static o p(Context context) {
        xj.k.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return e(context).o();
    }

    public static void q(@NonNull Context context, @NonNull d dVar) {
        GeneratedAppGlideModule generatedAppGlideModuleF = f(context);
        synchronized (c.class) {
            try {
                if (f20453k != null) {
                    w();
                }
                t(context, dVar, generatedAppGlideModuleF);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    public static synchronized void r(c cVar) {
        try {
            if (f20453k != null) {
                w();
            }
            f20453k = cVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void s(@NonNull Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        t(context, new d(), generatedAppGlideModule);
    }

    private static void t(@NonNull Context context, @NonNull d dVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<sj.b> listB = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.isManifestParsingEnabled()) {
            listB = new sj.d(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.a().isEmpty()) {
            Set<Class<?>> setA = generatedAppGlideModule.a();
            Iterator<sj.b> it = listB.iterator();
            while (it.hasNext()) {
                sj.b next = it.next();
                if (setA.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<sj.b> it2 = listB.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        dVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.b() : null);
        Iterator<sj.b> it3 = listB.iterator();
        while (it3.hasNext()) {
            it3.next().a(applicationContext, dVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.applyOptions(applicationContext, dVar);
        }
        c cVarA = dVar.a(applicationContext, listB, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(cVarA);
        f20453k = cVarA;
    }

    public static void w() {
        synchronized (c.class) {
            try {
                if (f20453k != null) {
                    f20453k.j().getApplicationContext().unregisterComponentCallbacks(f20453k);
                    f20453k.f20455a.m();
                }
                f20453k = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void x(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public void b() {
        xj.l.a();
        this.f20455a.e();
    }

    public void c() {
        xj.l.b();
        this.f20457c.b();
        this.f20456b.b();
        this.f20459e.b();
    }

    @NonNull
    public gj.b g() {
        return this.f20459e;
    }

    @NonNull
    public gj.d h() {
        return this.f20456b;
    }

    rj.c i() {
        return this.f20461g;
    }

    @NonNull
    public Context j() {
        return this.f20458d.getBaseContext();
    }

    @NonNull
    e k() {
        return this.f20458d;
    }

    @NonNull
    public Registry n() {
        return this.f20458d.i();
    }

    @NonNull
    public o o() {
        return this.f20460f;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        y(i11);
    }

    void u(l lVar) {
        synchronized (this.f20462h) {
            try {
                if (this.f20462h.contains(lVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f20462h.add(lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean v(@NonNull uj.j<?> jVar) {
        synchronized (this.f20462h) {
            try {
                Iterator<l> it = this.f20462h.iterator();
                while (it.hasNext()) {
                    if (it.next().untrack(jVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void y(int i11) {
        xj.l.b();
        synchronized (this.f20462h) {
            try {
                Iterator<l> it = this.f20462h.iterator();
                while (it.hasNext()) {
                    it.next().onTrimMemory(i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f20457c.a(i11);
        this.f20456b.a(i11);
        this.f20459e.a(i11);
    }

    void z(l lVar) {
        synchronized (this.f20462h) {
            try {
                if (!this.f20462h.contains(lVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f20462h.remove(lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
