package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.ILogger;
import io.sentry.android.core.g1;
import io.sentry.android.core.z0;
import io.sentry.b7;
import io.sentry.d8;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f79488n = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f79489o = TimeUnit.MILLISECONDS.toNanos(700);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0 f79490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Window> f79491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f79492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f79493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<Window> f79494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, b> f79495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f79496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f79497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Window.OnFrameMetricsAvailableListener f79498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Choreographer f79499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Field f79500k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f79501l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f79502m;

    class a implements c {
        a() {
        }
    }

    public interface b {
        void e(long j11, long j12, long j13, long j14, boolean z11, boolean z12, float f11);
    }

    public interface c {
        default void a(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler) {
            if (onFrameMetricsAvailableListener == null) {
                return;
            }
            window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, handler);
        }

        default void b(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
            if (onFrameMetricsAvailableListener == null) {
                return;
            }
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    @SuppressLint({"NewApi"})
    public c0(Context context, ILogger iLogger, z0 z0Var) {
        this(context, iLogger, z0Var, new a());
    }

    public static /* synthetic */ void a(c0 c0Var, ILogger iLogger) {
        c0Var.getClass();
        try {
            c0Var.f79499j = Choreographer.getInstance();
        } catch (Throwable th2) {
            iLogger.a(b7.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th2);
        }
    }

    public static /* synthetic */ void b(c0 c0Var, Window window) {
        if (c0Var.f79491b.add(window)) {
            try {
                c0Var.f79497h.a(window, c0Var.f79498i, c0Var.f79493d);
            } catch (Throwable th2) {
                c0Var.f79492c.a(b7.ERROR, "Failed to add frameMetricsAvailableListener", th2);
            }
        }
    }

    public static /* synthetic */ void c(c0 c0Var, Window window) {
        c0Var.getClass();
        try {
            if (c0Var.f79491b.remove(window)) {
                c0Var.f79497h.b(window, c0Var.f79498i);
            }
        } catch (Throwable th2) {
            c0Var.f79492c.a(b7.ERROR, "Failed to remove frameMetricsAvailableListener", th2);
        }
    }

    public static /* synthetic */ void e(c0 c0Var, z0 z0Var, Window window, FrameMetrics frameMetrics, int i11) {
        c0Var.getClass();
        long jNanoTime = System.nanoTime();
        float refreshRate = z0Var.d() >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        float f11 = f79488n;
        long jF = c0Var.f(frameMetrics);
        long jMax = Math.max(0L, jF - ((long) (f11 / refreshRate)));
        long jG = c0Var.g(frameMetrics);
        if (jG < 0) {
            jG = jNanoTime - jF;
        }
        long jMax2 = Math.max(jG, c0Var.f79502m);
        if (jMax2 == c0Var.f79501l) {
            return;
        }
        c0Var.f79501l = jMax2;
        c0Var.f79502m = jMax2 + jF;
        boolean zJ = j(jF, (long) (f11 / (refreshRate - 1.0f)));
        boolean z11 = zJ && i(jF);
        Iterator<b> it = c0Var.f79495f.values().iterator();
        while (it.hasNext()) {
            it.next().e(jMax2, c0Var.f79502m, jF, jMax, zJ, z11, refreshRate);
        }
    }

    private long f(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
    }

    @SuppressLint({"NewApi"})
    private long g(FrameMetrics frameMetrics) {
        return this.f79490a.d() >= 26 ? frameMetrics.getMetric(10) : h();
    }

    public static boolean i(long j11) {
        return j11 > f79489o;
    }

    public static boolean j(long j11, long j12) {
        return j11 > j12;
    }

    private void k(Window window) {
        WeakReference<Window> weakReference = this.f79494e;
        if (weakReference == null || weakReference.get() != window) {
            this.f79494e = new WeakReference<>(window);
            o();
        }
    }

    @SuppressLint({"NewApi"})
    private void n(final Window window) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.y
            @Override // java.lang.Runnable
            public final void run() {
                c0.c(this.f79561a, window);
            }
        });
    }

    @SuppressLint({"NewApi"})
    private void o() {
        WeakReference<Window> weakReference = this.f79494e;
        final Window window = weakReference != null ? weakReference.get() : null;
        if (window == null || !this.f79496g || this.f79495f.isEmpty() || this.f79493d == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.x
            @Override // java.lang.Runnable
            public final void run() {
                c0.b(this.f79559a, window);
            }
        });
    }

    public long h() {
        Field field;
        Choreographer choreographer = this.f79499j;
        if (choreographer == null || (field = this.f79500k) == null) {
            return -1L;
        }
        try {
            Long l11 = (Long) field.get(choreographer);
            if (l11 != null) {
                return l11.longValue();
            }
            return -1L;
        } catch (IllegalAccessException unused) {
            return -1L;
        }
    }

    public String l(b bVar) {
        if (!this.f79496g) {
            return null;
        }
        String strA = d8.a();
        this.f79495f.put(strA, bVar);
        o();
        return strA;
    }

    public void m(String str) {
        if (this.f79496g) {
            if (str != null) {
                this.f79495f.remove(str);
            }
            WeakReference<Window> weakReference = this.f79494e;
            Window window = weakReference != null ? weakReference.get() : null;
            if (window == null || !this.f79495f.isEmpty()) {
                return;
            }
            n(window);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        k(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        n(activity.getWindow());
        WeakReference<Window> weakReference = this.f79494e;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f79494e = null;
    }

    @SuppressLint({"NewApi", "PrivateApi"})
    public c0(Context context, final ILogger iLogger, final z0 z0Var, c cVar) {
        this.f79491b = new CopyOnWriteArraySet();
        this.f79495f = new ConcurrentHashMap();
        this.f79496g = false;
        this.f79501l = 0L;
        this.f79502m = 0L;
        Context context2 = (Context) io.sentry.util.y.c(g1.g(context), "The context is required");
        this.f79492c = (ILogger) io.sentry.util.y.c(iLogger, "Logger is required");
        this.f79490a = (z0) io.sentry.util.y.c(z0Var, "BuildInfoProvider is required");
        this.f79497h = (c) io.sentry.util.y.c(cVar, "WindowFrameMetricsManager is required");
        if ((context2 instanceof Application) && z0Var.d() >= 24) {
            this.f79496g = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.z
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    iLogger.a(b7.ERROR, "Error during frames measurements.", th2);
                }
            });
            handlerThread.start();
            this.f79493d = new Handler(handlerThread.getLooper());
            ((Application) context2).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.a0
                @Override // java.lang.Runnable
                public final void run() {
                    c0.a(this.f79482a, iLogger);
                }
            });
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.f79500k = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                iLogger.a(b7.ERROR, "Unable to get the frame timestamp from the choreographer: ", e11);
            }
            this.f79498i = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.b0
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i11) {
                    c0.e(this.f79485a, z0Var, window, frameMetrics, i11);
                }
            };
        }
    }
}
