package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final Class<?> f7450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final Field f7451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final Field f7452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final Method f7453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Method f7454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final Method f7455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Handler f7456g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f7457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f7458b;

        a(d dVar, Object obj) {
            this.f7457a = dVar;
            this.f7458b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7457a.f7463a = this.f7458b;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f7459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f7460b;

        b(Application application, d dVar) {
            this.f7459a = application;
            this.f7460b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7459a.unregisterActivityLifecycleCallbacks(this.f7460b);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f7461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f7462b;

        c(Object obj, Object obj2) {
            this.f7461a = obj;
            this.f7462b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = e.f7453d;
                if (method != null) {
                    method.invoke(this.f7461a, this.f7462b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    e.f7454e.invoke(this.f7461a, this.f7462b, Boolean.FALSE);
                }
            } catch (RuntimeException e11) {
                if (e11.getClass() == RuntimeException.class && e11.getMessage() != null && e11.getMessage().startsWith("Unable to stop")) {
                    throw e11;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f7463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Activity f7464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f7466d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f7467e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f7468f = false;

        d(Activity activity) {
            this.f7464b = activity;
            this.f7465c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f7464b == activity) {
                this.f7464b = null;
                this.f7467e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f7467e || this.f7468f || this.f7466d || !e.h(this.f7463a, this.f7465c, activity)) {
                return;
            }
            this.f7468f = true;
            this.f7463a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f7464b == activity) {
                this.f7466d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsA = a();
        f7450a = clsA;
        f7451b = b();
        f7452c = f();
        f7453d = d(clsA);
        f7454e = c(clsA);
        f7455f = e(clsA);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i11 = Build.VERSION.SDK_INT;
        return i11 == 26 || i11 == 27;
    }

    protected static boolean h(Object obj, int i11, Activity activity) {
        try {
            Object obj2 = f7452c.get(activity);
            if (obj2 == obj && activity.hashCode() == i11) {
                f7456g.postAtFrontOfQueue(new c(f7451b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f7455f == null) {
            return false;
        }
        if (f7454e == null && f7453d == null) {
            return false;
        }
        try {
            Object obj2 = f7452c.get(activity);
            if (obj2 == null || (obj = f7451b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            f7456g.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f7455f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                f7456g.post(new b(application, dVar));
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
