package c0;

import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.n2;
import androidx.camera.core.impl.o2;
import androidx.camera.core.impl.p2;
import androidx.camera.core.impl.p3;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f18448o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final SparseArray<Integer> f18449p = new SparseArray<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.camera.core.impl.p0 f18450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f18451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f18452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f18453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f18454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HandlerThread f18455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.camera.core.impl.g0 f18456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private androidx.camera.core.impl.f0 f18457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p3 f18458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k1 f18459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.common.util.concurrent.s<Void> f18460k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f18461l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.common.util.concurrent.s<Void> f18462m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f18463n;

    /* JADX INFO: Access modifiers changed from: private */
    enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public w(@NonNull Context context, x.b bVar) {
        this(context, bVar, new p2());
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:35:0x0103 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:3:0x0015, B:5:0x001d, B:7:0x003f, B:9:0x0059, B:11:0x0063, B:18:0x0072, B:20:0x0081, B:21:0x0084, B:24:0x008e, B:25:0x009a, B:26:0x009b, B:27:0x00a7, B:28:0x00a8, B:29:0x00b4, B:30:0x00b5, B:34:0x00ce, B:35:0x0103, B:36:0x0105, B:39:0x010b, B:41:0x0111, B:42:0x0118, B:44:0x011c, B:45:0x0148, B:47:0x014c, B:48:0x0150, B:54:0x015f, B:37:0x0106, B:38:0x010a), top: B:58:0x0015, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0111 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:3:0x0015, B:5:0x001d, B:7:0x003f, B:9:0x0059, B:11:0x0063, B:18:0x0072, B:20:0x0081, B:21:0x0084, B:24:0x008e, B:25:0x009a, B:26:0x009b, B:27:0x00a7, B:28:0x00a8, B:29:0x00b4, B:30:0x00b5, B:34:0x00ce, B:35:0x0103, B:36:0x0105, B:39:0x010b, B:41:0x0111, B:42:0x0118, B:44:0x011c, B:45:0x0148, B:47:0x014c, B:48:0x0150, B:54:0x015f, B:37:0x0106, B:38:0x010a), top: B:58:0x0015, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0118 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:3:0x0015, B:5:0x001d, B:7:0x003f, B:9:0x0059, B:11:0x0063, B:18:0x0072, B:20:0x0081, B:21:0x0084, B:24:0x008e, B:25:0x009a, B:26:0x009b, B:27:0x00a7, B:28:0x00a8, B:29:0x00b4, B:30:0x00b5, B:34:0x00ce, B:35:0x0103, B:36:0x0105, B:39:0x010b, B:41:0x0111, B:42:0x0118, B:44:0x011c, B:45:0x0148, B:47:0x014c, B:48:0x0150, B:54:0x015f, B:37:0x0106, B:38:0x010a), top: B:58:0x0015, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x011c A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:3:0x0015, B:5:0x001d, B:7:0x003f, B:9:0x0059, B:11:0x0063, B:18:0x0072, B:20:0x0081, B:21:0x0084, B:24:0x008e, B:25:0x009a, B:26:0x009b, B:27:0x00a7, B:28:0x00a8, B:29:0x00b4, B:30:0x00b5, B:34:0x00ce, B:35:0x0103, B:36:0x0105, B:39:0x010b, B:41:0x0111, B:42:0x0118, B:44:0x011c, B:45:0x0148, B:47:0x014c, B:48:0x0150, B:54:0x015f, B:37:0x0106, B:38:0x010a), top: B:58:0x0015, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0148 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:3:0x0015, B:5:0x001d, B:7:0x003f, B:9:0x0059, B:11:0x0063, B:18:0x0072, B:20:0x0081, B:21:0x0084, B:24:0x008e, B:25:0x009a, B:26:0x009b, B:27:0x00a7, B:28:0x00a8, B:29:0x00b4, B:30:0x00b5, B:34:0x00ce, B:35:0x0103, B:36:0x0105, B:39:0x010b, B:41:0x0111, B:42:0x0118, B:44:0x011c, B:45:0x0148, B:47:0x014c, B:48:0x0150, B:54:0x015f, B:37:0x0106, B:38:0x010a), top: B:58:0x0015, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x014c A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:3:0x0015, B:5:0x001d, B:7:0x003f, B:9:0x0059, B:11:0x0063, B:18:0x0072, B:20:0x0081, B:21:0x0084, B:24:0x008e, B:25:0x009a, B:26:0x009b, B:27:0x00a7, B:28:0x00a8, B:29:0x00b4, B:30:0x00b5, B:34:0x00ce, B:35:0x0103, B:36:0x0105, B:39:0x010b, B:41:0x0111, B:42:0x0118, B:44:0x011c, B:45:0x0148, B:47:0x014c, B:48:0x0150, B:54:0x015f, B:37:0x0106, B:38:0x010a), top: B:58:0x0015, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0150 A[Catch: all -> 0x0160, TRY_LEAVE, TryCatch #0 {all -> 0x0160, blocks: (B:3:0x0015, B:5:0x001d, B:7:0x003f, B:9:0x0059, B:11:0x0063, B:18:0x0072, B:20:0x0081, B:21:0x0084, B:24:0x008e, B:25:0x009a, B:26:0x009b, B:27:0x00a7, B:28:0x00a8, B:29:0x00b4, B:30:0x00b5, B:34:0x00ce, B:35:0x0103, B:36:0x0105, B:39:0x010b, B:41:0x0111, B:42:0x0118, B:44:0x011c, B:45:0x0148, B:47:0x014c, B:48:0x0150, B:54:0x015f, B:37:0x0106, B:38:0x010a), top: B:58:0x0015, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x011c, please report this as an issue */
    public static /* synthetic */ void a(final w wVar, Context context, final Executor executor, final int i11, final androidx.concurrent.futures.c.a aVar, final long j11) {
        k1.c cVarE;
        wVar.getClass();
        eb.a.c("CX:initAndRetryRecursively");
        final Context contextA = h0.f.a(context);
        try {
            try {
                androidx.camera.core.impl.g0.a aVarB0 = wVar.f18452c.b0(null);
                if (aVarB0 == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                }
                androidx.camera.core.impl.t0 t0VarA = androidx.camera.core.impl.t0.a(wVar.f18453d, wVar.f18454e);
                p pVarZ = wVar.f18452c.Z(null);
                wVar.f18456g = aVarB0.a(contextA, t0VarA, pVarZ, wVar.f18452c.c0());
                androidx.camera.core.impl.f0.a aVarE0 = wVar.f18452c.e0(null);
                if (aVarE0 == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                }
                wVar.f18457h = aVarE0.a(contextA, wVar.f18456g.d(), wVar.f18456g.b());
                p3.c cVarH0 = wVar.f18452c.h0(null);
                if (cVarH0 == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                wVar.f18458i = cVarH0.newInstance(contextA);
                if (executor instanceof l) {
                    ((l) executor).e(wVar.f18456g);
                }
                wVar.f18450a.e(wVar.f18456g);
                CameraValidator.a(contextA, wVar.f18450a, pVarZ);
                if (i11 > 1) {
                    wVar.s(null);
                }
                wVar.p();
                aVar.c(null);
                eb.a.f();
            } catch (Throwable th2) {
                eb.a.f();
                throw th2;
            }
        } catch (InitializationException e11) {
            e = e11;
            androidx.camera.core.impl.l0 l0Var = new androidx.camera.core.impl.l0(j11, i11, e);
            cVarE = wVar.f18459j.e(l0Var);
            wVar.s(l0Var);
            if (cVarE.d() || i11 >= Integer.MAX_VALUE) {
                synchronized (wVar.f18451b) {
                    wVar.f18461l = a.INITIALIZING_ERROR;
                }
                if (cVarE.c()) {
                    wVar.p();
                    aVar.c(null);
                } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                    String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).a();
                    y0.d("CameraX", str, e);
                    aVar.f(new InitializationException(new CameraUnavailableException(3, str)));
                } else if (e instanceof InitializationException) {
                    aVar.f(e);
                } else {
                    aVar.f(new InitializationException(e));
                }
            } else {
                y0.m("CameraX", "Retry init. Start time " + j11 + " current time " + SystemClock.elapsedRealtime(), e);
                q5.i.b(wVar.f18454e, new Runnable() { // from class: c0.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18440a.n(executor, j11, i11 + 1, contextA, aVar);
                    }
                }, "retry_token", cVarE.b());
            }
            eb.a.f();
        } catch (CameraValidator.CameraIdListIncorrectException e12) {
            e = e12;
            androidx.camera.core.impl.l0 l0Var2 = new androidx.camera.core.impl.l0(j11, i11, e);
            cVarE = wVar.f18459j.e(l0Var2);
            wVar.s(l0Var2);
            if (cVarE.d()) {
                synchronized (wVar.f18451b) {
                    wVar.f18461l = a.INITIALIZING_ERROR;
                    if (cVarE.c()) {
                        wVar.p();
                        aVar.c(null);
                    } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                        String str2 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).a();
                        y0.d("CameraX", str2, e);
                        aVar.f(new InitializationException(new CameraUnavailableException(3, str2)));
                    } else if (e instanceof InitializationException) {
                        aVar.f(e);
                    } else {
                        aVar.f(new InitializationException(e));
                    }
                }
            } else {
                synchronized (wVar.f18451b) {
                    wVar.f18461l = a.INITIALIZING_ERROR;
                    if (cVarE.c()) {
                        wVar.p();
                        aVar.c(null);
                    } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                        String str3 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).a();
                        y0.d("CameraX", str3, e);
                        aVar.f(new InitializationException(new CameraUnavailableException(3, str3)));
                    } else if (e instanceof InitializationException) {
                        aVar.f(e);
                    } else {
                        aVar.f(new InitializationException(e));
                    }
                }
            }
            eb.a.f();
        } catch (RuntimeException e13) {
            e = e13;
            androidx.camera.core.impl.l0 l0Var3 = new androidx.camera.core.impl.l0(j11, i11, e);
            cVarE = wVar.f18459j.e(l0Var3);
            wVar.s(l0Var3);
            if (cVarE.d()) {
                synchronized (wVar.f18451b) {
                    wVar.f18461l = a.INITIALIZING_ERROR;
                    if (cVarE.c()) {
                        wVar.p();
                        aVar.c(null);
                    } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                        String str4 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).a();
                        y0.d("CameraX", str4, e);
                        aVar.f(new InitializationException(new CameraUnavailableException(3, str4)));
                    } else if (e instanceof InitializationException) {
                        aVar.f(e);
                    } else {
                        aVar.f(new InitializationException(e));
                    }
                }
            } else {
                synchronized (wVar.f18451b) {
                    wVar.f18461l = a.INITIALIZING_ERROR;
                    if (cVarE.c()) {
                        wVar.p();
                        aVar.c(null);
                    } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                        String str5 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).a();
                        y0.d("CameraX", str5, e);
                        aVar.f(new InitializationException(new CameraUnavailableException(3, str5)));
                    } else if (e instanceof InitializationException) {
                        aVar.f(e);
                    } else {
                        aVar.f(new InitializationException(e));
                    }
                }
            }
            eb.a.f();
        }
    }

    public static /* synthetic */ void b(w wVar, androidx.concurrent.futures.c.a aVar) {
        if (wVar.f18455f != null) {
            Executor executor = wVar.f18453d;
            if (executor instanceof l) {
                ((l) executor).d();
            }
            wVar.f18455f.quit();
        }
        aVar.c(null);
    }

    public static /* synthetic */ Object c(w wVar, Context context, androidx.concurrent.futures.c.a aVar) {
        wVar.n(wVar.f18453d, SystemClock.elapsedRealtime(), 1, context, aVar);
        return "CameraX initInternal";
    }

    public static /* synthetic */ Object d(final w wVar, final androidx.concurrent.futures.c.a aVar) {
        wVar.f18450a.c().b(new Runnable() { // from class: c0.u
            @Override // java.lang.Runnable
            public final void run() {
                w.b(this.f18435a, aVar);
            }
        }, wVar.f18453d);
        return "CameraX shutdownInternal";
    }

    private static void f(Integer num) {
        synchronized (f18448o) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray<Integer> sparseArray = f18449p;
                int iIntValue = sparseArray.get(num.intValue()).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static x.b j(@NonNull Context context) {
        ComponentCallbacks2 componentCallbacks2B = h0.f.b(context);
        if (componentCallbacks2B instanceof x.b) {
            return (x.b) componentCallbacks2B;
        }
        try {
            Context contextA = h0.f.a(context);
            Bundle bundle = contextA.getPackageManager().getServiceInfo(new ComponentName(contextA, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (x.b) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
            y0.c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException e11) {
            e = e11;
            y0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e12) {
            e = e12;
            y0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e13) {
            e = e13;
            y0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e14) {
            e = e14;
            y0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e15) {
            e = e15;
            y0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e16) {
            e = e16;
            y0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e17) {
            e = e17;
            y0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    private static void m(Integer num) {
        synchronized (f18448o) {
            try {
                if (num == null) {
                    return;
                }
                u5.h.c(num.intValue(), 3, 6, "minLogLevel");
                SparseArray<Integer> sparseArray = f18449p;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
                t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(@NonNull final Executor executor, final long j11, final int i11, @NonNull final Context context, @NonNull final androidx.concurrent.futures.c.a<Void> aVar) {
        executor.execute(new Runnable() { // from class: c0.s
            @Override // java.lang.Runnable
            public final void run() {
                w.a(this.f18422a, context, executor, i11, aVar, j11);
            }
        });
    }

    private com.google.common.util.concurrent.s<Void> o(@NonNull final Context context) {
        com.google.common.util.concurrent.s<Void> sVarA;
        synchronized (this.f18451b) {
            u5.h.j(this.f18461l == a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f18461l = a.INITIALIZING;
            sVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: c0.r
                @Override // androidx.concurrent.futures.c.InterfaceC0146c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return w.c(this.f18385a, context, aVar);
                }
            });
        }
        return sVarA;
    }

    private void p() {
        synchronized (this.f18451b) {
            this.f18461l = a.INITIALIZED;
        }
    }

    @NonNull
    private com.google.common.util.concurrent.s<Void> r() {
        synchronized (this.f18451b) {
            try {
                this.f18454e.removeCallbacksAndMessages("retry_token");
                int iOrdinal = this.f18461l.ordinal();
                if (iOrdinal == 0) {
                    this.f18461l = a.SHUTDOWN;
                    return j0.n.p(null);
                }
                if (iOrdinal == 1) {
                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                }
                if (iOrdinal == 2 || iOrdinal == 3) {
                    this.f18461l = a.SHUTDOWN;
                    f(this.f18463n);
                    this.f18462m = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: c0.t
                        @Override // androidx.concurrent.futures.c.InterfaceC0146c
                        public final Object a(androidx.concurrent.futures.c.a aVar) {
                            return w.d(this.f18430a, aVar);
                        }
                    });
                }
                return this.f18462m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void s(k1.b bVar) {
        if (eb.a.h()) {
            eb.a.j("CX:CameraProvider-RetryStatus", bVar != null ? bVar.getStatus() : -1);
        }
    }

    private static void t() {
        SparseArray<Integer> sparseArray = f18449p;
        if (sparseArray.size() == 0) {
            y0.i();
            return;
        }
        if (sparseArray.get(3) != null) {
            y0.j(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            y0.j(4);
        } else if (sparseArray.get(5) != null) {
            y0.j(5);
        } else if (sparseArray.get(6) != null) {
            y0.j(6);
        }
    }

    private static void u(@NonNull Context context, n2 n2Var, @NonNull r.a<Context, n2> aVar) {
        if (n2Var != null) {
            y0.a("CameraX", "QuirkSettings from CameraXConfig: " + n2Var);
        } else {
            n2Var = aVar.apply(context);
            y0.a("CameraX", "QuirkSettings from app metadata: " + n2Var);
        }
        if (n2Var == null) {
            n2Var = o2.f3262b;
            y0.a("CameraX", "QuirkSettings by default: " + n2Var);
        }
        o2.b().d(n2Var);
    }

    @NonNull
    public androidx.camera.core.impl.f0 g() {
        androidx.camera.core.impl.f0 f0Var = this.f18457h;
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @NonNull
    public androidx.camera.core.impl.g0 h() {
        androidx.camera.core.impl.g0 g0Var = this.f18456g;
        if (g0Var != null) {
            return g0Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @NonNull
    public androidx.camera.core.impl.p0 i() {
        return this.f18450a;
    }

    @NonNull
    public p3 k() {
        p3 p3Var = this.f18458i;
        if (p3Var != null) {
            return p3Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @NonNull
    public com.google.common.util.concurrent.s<Void> l() {
        return this.f18460k;
    }

    @NonNull
    public com.google.common.util.concurrent.s<Void> q() {
        return r();
    }

    w(@NonNull Context context, x.b bVar, @NonNull r.a<Context, n2> aVar) {
        this.f18450a = new androidx.camera.core.impl.p0();
        this.f18451b = new Object();
        this.f18461l = a.UNINITIALIZED;
        this.f18462m = j0.n.p(null);
        if (bVar != null) {
            this.f18452c = bVar.getCameraXConfig();
        } else {
            x.b bVarJ = j(context);
            if (bVarJ == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.f18452c = bVarJ.getCameraXConfig();
        }
        u(context, this.f18452c.f0(), aVar);
        Executor executorA0 = this.f18452c.a0(null);
        Handler handlerG0 = this.f18452c.g0(null);
        this.f18453d = executorA0 == null ? new l() : executorA0;
        if (handlerG0 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f18455f = handlerThread;
            handlerThread.start();
            this.f18454e = q5.i.a(handlerThread.getLooper());
        } else {
            this.f18455f = null;
            this.f18454e = handlerG0;
        }
        Integer num = (Integer) this.f18452c.d(x.Q, null);
        this.f18463n = num;
        m(num);
        this.f18459j = new k1.a(this.f18452c.d0()).a();
        this.f18460k = o(context);
    }
}
