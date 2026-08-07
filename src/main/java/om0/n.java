package om0;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f98138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f98139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final AtomicReference<ScheduledExecutorService> f98140c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Map<ScheduledThreadPoolExecutor, Object> f98141d = new ConcurrentHashMap();

    static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(n.f98141d.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    n.f98141d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static final class b implements cm0.h<String, String> {
        b() {
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(String str) {
            return System.getProperty(str);
        }
    }

    static {
        b bVar = new b();
        boolean zB = b(true, "rx3.purge-enabled", true, true, bVar);
        f98138a = zB;
        f98139b = c(zB, "rx3.purge-period-seconds", 1, 1, bVar);
        d();
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        e(f98138a, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    static boolean b(boolean z11, String str, boolean z12, boolean z13, cm0.h<String, String> hVar) {
        if (!z11) {
            return z13;
        }
        try {
            String strApply = hVar.apply(str);
            return strApply == null ? z12 : "true".equals(strApply);
        } catch (Throwable th2) {
            bm0.a.b(th2);
            return z12;
        }
    }

    static int c(boolean z11, String str, int i11, int i12, cm0.h<String, String> hVar) {
        if (!z11) {
            return i12;
        }
        try {
            String strApply = hVar.apply(str);
            return strApply == null ? i11 : Integer.parseInt(strApply);
        } catch (Throwable th2) {
            bm0.a.b(th2);
            return i11;
        }
    }

    public static void d() {
        f(f98138a);
    }

    static void e(boolean z11, ScheduledExecutorService scheduledExecutorService) {
        if (z11 && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f98141d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    static void f(boolean z11) {
        if (!z11) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f98140c;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new j("RxSchedulerPurge"));
            if (androidx.camera.view.i.a(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                a aVar = new a();
                int i11 = f98139b;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(aVar, i11, i11, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
