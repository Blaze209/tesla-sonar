package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
public class SoLoader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static w f23903b;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f23914m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ReentrantReadWriteLock f23904c = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static Context f23905d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile d0[] f23906e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicInteger f23907f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static dp.i f23908g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Set<String> f23909h = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<String, Object> f23910i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Set<String> f23911j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map<String, Object> f23912k = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f23913l = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f23915n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static l f23916o = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final boolean f23902a = true;

    public static final class a extends UnsatisfiedLinkError {
        a(Throwable th2, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.j()) + " error: " + str);
            initCause(th2);
        }
    }

    private static int A() {
        f23904c.writeLock().lock();
        try {
            int i11 = f23914m;
            int i12 = (i11 & 2) != 0 ? 1 : 0;
            if ((i11 & 256) != 0) {
                i12 |= 4;
            }
            if ((i11 & 128) == 0) {
                i12 |= 8;
            }
            return i12;
        } finally {
            f23904c.writeLock().unlock();
        }
    }

    private static int B(int i11) {
        return (i11 & 2048) != 0 ? 1 : 0;
    }

    @SuppressLint({"CatchGeneralException"})
    private static dp.h C(String str, UnsatisfiedLinkError unsatisfiedLinkError, dp.h hVar) {
        p.g("SoLoader", "Running a recovery step for " + str + " due to " + unsatisfiedLinkError.toString());
        ReentrantReadWriteLock reentrantReadWriteLock = f23904c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (hVar == null) {
                try {
                    hVar = j();
                    if (hVar == null) {
                        p.g("SoLoader", "No recovery strategy");
                        throw unsatisfiedLinkError;
                    }
                } catch (NoBaseApkException e11) {
                    p.c("SoLoader", "Base APK not found during recovery", e11);
                    throw e11;
                } catch (Exception e12) {
                    p.c("SoLoader", "Got an exception during recovery, will throw the initial error instead", e12);
                    throw unsatisfiedLinkError;
                }
            }
            if (D(unsatisfiedLinkError, hVar)) {
                f23907f.getAndIncrement();
                reentrantReadWriteLock.writeLock().unlock();
                return hVar;
            }
            reentrantReadWriteLock.writeLock().unlock();
            p.g("SoLoader", "Failed to recover");
            throw unsatisfiedLinkError;
        } catch (Throwable th2) {
            f23904c.writeLock().unlock();
            throw th2;
        }
    }

    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock"})
    private static boolean D(UnsatisfiedLinkError unsatisfiedLinkError, dp.h hVar) {
        cp.b.h(hVar);
        try {
            boolean zA = hVar.a(unsatisfiedLinkError, f23906e);
            cp.b.g(null);
            return zA;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                cp.b.g(th2);
                throw th3;
            }
        }
    }

    private static void a(ArrayList<d0> arrayList, int i11) {
        com.facebook.soloader.a aVar = new com.facebook.soloader.a(f23905d, i11);
        p.a("SoLoader", "Adding application source: " + aVar.toString());
        arrayList.add(0, aVar);
    }

    @SuppressLint({"CatchGeneralException"})
    private static void b(Context context, ArrayList<d0> arrayList, boolean z11) {
        if ((f23914m & 8) != 0) {
            return;
        }
        arrayList.add(0, new c(context, "lib-main", !z11));
    }

    private static void c(Context context, ArrayList<d0> arrayList) {
        d dVar = new d(context);
        p.a("SoLoader", "validating/adding directApk source: " + dVar.toString());
        if (dVar.o()) {
            arrayList.add(0, dVar);
        }
    }

    private static void d(ArrayList<d0> arrayList) {
        String str = SysUtil.k() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals("")) {
            str = str2 + ":" + str;
        }
        for (String str3 : new HashSet(Arrays.asList(str.split(":")))) {
            p.a("SoLoader", "adding system library source: " + str3);
            arrayList.add(new f(new File(str3), 2));
        }
    }

    private static void e(Context context, ArrayList<d0> arrayList) {
        e0 e0Var = new e0();
        p.a("SoLoader", "adding systemLoadWrapper source: " + e0Var);
        arrayList.add(0, e0Var);
    }

    private static void f() {
        if (!r()) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    private static void g(String str, String str2, int i11, StrictMode.ThreadPolicy threadPolicy) {
        boolean z11;
        ReentrantReadWriteLock reentrantReadWriteLock = f23904c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f23906e == null) {
                p.b("SoLoader", "Could not load: " + str + " because SoLoader is not initialized");
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z11 = true;
            } else {
                z11 = false;
            }
            if (f23902a) {
                if (str2 != null) {
                    Api18TraceUtils.a("SoLoader.loadLibrary[", str2, "]");
                }
                Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock.readLock().lock();
                try {
                    try {
                        for (d0 d0Var : f23906e) {
                            if (x(d0Var, str, i11, threadPolicy)) {
                                f23904c.readLock().unlock();
                                if (f23902a) {
                                    if (str2 != null) {
                                        Api18TraceUtils.b();
                                    }
                                    Api18TraceUtils.b();
                                }
                                if (z11) {
                                    StrictMode.setThreadPolicy(threadPolicy);
                                    return;
                                }
                                return;
                            }
                        }
                        throw a0.b(str, f23905d, f23906e);
                    } catch (IOException e11) {
                        b0 b0Var = new b0(str, e11.toString());
                        b0Var.initCause(e11);
                        throw b0Var;
                    }
                } catch (Throwable th2) {
                    f23904c.readLock().unlock();
                    throw th2;
                }
            } catch (Throwable th3) {
                if (f23902a) {
                    if (str2 != null) {
                        Api18TraceUtils.b();
                    }
                    Api18TraceUtils.b();
                }
                if (z11) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                throw th3;
            }
        } catch (Throwable th4) {
            f23904c.readLock().unlock();
            throw th4;
        }
    }

    private static int h(Context context) {
        int i11 = f23915n;
        if (i11 != 0) {
            return i11;
        }
        int i12 = 1;
        if (context == null) {
            p.a("SoLoader", "context is null, fallback to THIRD_PARTY_APP appType");
            return 1;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i13 = applicationInfo.flags;
        if ((i13 & 1) != 0) {
            i12 = (i13 & 128) != 0 ? 3 : 2;
        }
        p.a("SoLoader", "ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + i12);
        return i12;
    }

    private static int i() {
        int i11 = f23915n;
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2 || i11 == 3) {
            return 1;
        }
        throw new RuntimeException("Unsupported app type, we should not reach here");
    }

    public static void init(Context context, int i11) {
        k(context, i11, null);
    }

    private static synchronized dp.h j() {
        dp.i iVar;
        iVar = f23908g;
        return iVar == null ? null : iVar.get();
    }

    public static void k(Context context, int i11, w wVar) {
        if (r()) {
            p.g("SoLoader", "SoLoader already initialized");
            return;
        }
        p.g("SoLoader", "Initializing SoLoader: " + i11);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            boolean zO = o(context);
            f23913l = zO;
            if (zO) {
                int iH = h(context);
                f23915n = iH;
                if ((i11 & 128) == 0 && SysUtil.l(context, iH)) {
                    i11 |= 8;
                }
                p(context, wVar, i11);
                q(context, i11);
                p.f("SoLoader", "Init SoLoader delegate");
                bp.a.b(new u());
            } else {
                n();
                p.f("SoLoader", "Init System Loader delegate");
                bp.a.b(new bp.c());
            }
            p.g("SoLoader", "SoLoader initialized: " + i11);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        }
    }

    public static void l(Context context, l lVar) {
        synchronized (SoLoader.class) {
            f23916o = lVar;
        }
        init(context, 0);
    }

    public static void m(Context context, boolean z11) {
        try {
            k(context, z11 ? 1 : 0, null);
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    private static void n() {
        if (f23906e != null) {
            return;
        }
        f23904c.writeLock().lock();
        try {
            if (f23906e == null) {
                f23906e = new d0[0];
            }
        } finally {
            f23904c.writeLock().unlock();
        }
    }

    private static boolean o(Context context) {
        String packageName;
        if (f23916o != null) {
            return true;
        }
        Bundle bundle = null;
        try {
            packageName = context.getPackageName();
            try {
                bundle = context.getPackageManager().getApplicationInfo(packageName, 128).metaData;
            } catch (Exception e11) {
                e = e11;
                p.h("SoLoader", "Unexpected issue with package manager (" + packageName + ")", e);
            }
        } catch (Exception e12) {
            e = e12;
            packageName = null;
        }
        return bundle == null || bundle.getBoolean("com.facebook.soloader.enabled", true);
    }

    private static synchronized void p(Context context, w wVar, int i11) {
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    p.g("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
                } else {
                    context = applicationContext;
                }
                f23905d = context;
                f23908g = new dp.f(context, B(i11));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (wVar != null || f23903b == null) {
            if (wVar != null) {
                f23903b = wVar;
            } else {
                f23903b = new o(new x());
            }
        }
    }

    private static void q(Context context, int i11) {
        ReentrantReadWriteLock.WriteLock writeLock;
        if (f23906e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f23904c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f23906e != null) {
                writeLock = reentrantReadWriteLock.writeLock();
            } else {
                f23914m = i11;
                ArrayList arrayList = new ArrayList();
                boolean z11 = true;
                boolean z12 = (i11 & 512) != 0;
                boolean z13 = (i11 & 1024) != 0;
                if (z12) {
                    e(context, arrayList);
                } else if (z13) {
                    d(arrayList);
                    arrayList.add(0, new e("base"));
                } else {
                    d(arrayList);
                    if (context != null) {
                        if ((i11 & 1) != 0) {
                            a(arrayList, i());
                            p.a("SoLoader", "Adding exo package source: lib-main");
                            arrayList.add(0, new k(context, "lib-main"));
                        } else {
                            if (SysUtil.l(context, f23915n)) {
                                c(context, arrayList);
                            }
                            a(arrayList, i());
                            if ((i11 & 4096) == 0) {
                                z11 = false;
                            }
                            b(context, arrayList, z11);
                        }
                    }
                }
                d0[] d0VarArr = (d0[]) arrayList.toArray(new d0[arrayList.size()]);
                int iA = A();
                int length = d0VarArr.length;
                while (true) {
                    int i12 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    p.d("SoLoader", "Preparing SO source: " + d0VarArr[i12]);
                    boolean z14 = f23902a;
                    if (z14) {
                        Api18TraceUtils.a("SoLoader", "_", d0VarArr[i12].getClass().getSimpleName());
                    }
                    d0VarArr[i12].e(iA);
                    if (z14) {
                        Api18TraceUtils.b();
                    }
                    length = i12;
                }
                f23906e = d0VarArr;
                f23907f.getAndIncrement();
                p.d("SoLoader", "init finish: " + f23906e.length + " SO sources prepared");
                writeLock = f23904c.writeLock();
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            f23904c.writeLock().unlock();
            throw th2;
        }
    }

    public static boolean r() {
        if (f23906e != null) {
            return true;
        }
        f23904c.readLock().lock();
        try {
            return f23906e != null;
        } finally {
            f23904c.readLock().unlock();
        }
    }

    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock"})
    static void s(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        cp.b.d(str, i11);
        try {
            cp.b.c(null, w(str, null, null, i11 | 1, threadPolicy));
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                cp.b.c(th2, false);
                throw th3;
            }
        }
    }

    public static boolean t(String str) {
        return f23913l ? u(str, 0) : bp.a.d(str);
    }

    public static boolean u(String str, int i11) {
        Boolean boolZ = z(str);
        if (boolZ != null) {
            return boolZ.booleanValue();
        }
        if (!f23913l) {
            return bp.a.d(str);
        }
        if (f23915n != 2) {
        }
        return y(str, i11);
    }

    private static boolean v(String str, String str2, String str3, int i11, StrictMode.ThreadPolicy threadPolicy) {
        dp.h hVarC = null;
        while (true) {
            try {
                return w(str, str2, str3, i11, threadPolicy);
            } catch (UnsatisfiedLinkError e11) {
                hVarC = C(str, e11, hVarC);
            }
        }
    }

    private static boolean w(String str, String str2, String str3, int i11, StrictMode.ThreadPolicy threadPolicy) {
        boolean z11;
        Object obj;
        Object obj2;
        if (!TextUtils.isEmpty(str2) && f23911j.contains(str2)) {
            return false;
        }
        Set<String> set = f23909h;
        if (set.contains(str) && str3 == null) {
            return false;
        }
        synchronized (SoLoader.class) {
            try {
                if (!set.contains(str)) {
                    z11 = false;
                } else {
                    if (str3 == null) {
                        return false;
                    }
                    z11 = true;
                }
                Map<String, Object> map = f23910i;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj3 = new Object();
                    map.put(str, obj3);
                    obj = obj3;
                }
                Map<String, Object> map2 = f23912k;
                if (map2.containsKey(str2)) {
                    obj2 = map2.get(str2);
                } else {
                    Object obj4 = new Object();
                    map2.put(str2, obj4);
                    obj2 = obj4;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = f23904c;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        if (!z11) {
                            if (set.contains(str)) {
                                if (str3 == null) {
                                    reentrantReadWriteLock.readLock().unlock();
                                    return false;
                                }
                                z11 = true;
                            }
                            if (!z11) {
                                try {
                                    p.a("SoLoader", "About to load: " + str);
                                    g(str, str2, i11, threadPolicy);
                                    p.a("SoLoader", "Loaded: " + str);
                                    set.add(str);
                                } catch (UnsatisfiedLinkError e11) {
                                    String message = e11.getMessage();
                                    if (message == null || !message.contains("unexpected e_machine:")) {
                                        throw e11;
                                    }
                                    throw new a(e11, message.substring(message.lastIndexOf("unexpected e_machine:")));
                                }
                            }
                        }
                        synchronized (obj2) {
                            if ((i11 & 16) == 0 && str3 != null) {
                                try {
                                    if (TextUtils.isEmpty(str2) || !f23911j.contains(str2)) {
                                        boolean z12 = f23902a;
                                        if (z12 && f23916o == null) {
                                            Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                                        }
                                        try {
                                            try {
                                                p.a("SoLoader", "About to invoke JNI_OnLoad for merged library " + str2 + ", which was merged into " + str);
                                                l lVar = f23916o;
                                                if (lVar != null) {
                                                    lVar.a(str2);
                                                } else {
                                                    r.a(str2);
                                                }
                                                f23911j.add(str2);
                                                if (z12 && f23916o == null) {
                                                    Api18TraceUtils.b();
                                                }
                                            } catch (UnsatisfiedLinkError e12) {
                                                throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e12);
                                            }
                                        } catch (Throwable th2) {
                                            if (f23902a && f23916o == null) {
                                                Api18TraceUtils.b();
                                            }
                                            throw th2;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        return !z11;
                    }
                } catch (Throwable th4) {
                    f23904c.readLock().unlock();
                    throw th4;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock", "MissingSoLoaderLibrary"})
    private static boolean x(d0 d0Var, String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        cp.b.l(d0Var);
        try {
            boolean z11 = d0Var.d(str, i11, threadPolicy) != 0;
            cp.b.k(null);
            return z11;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                cp.b.k(th2);
                throw th3;
            }
        }
    }

    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock"})
    private static boolean y(String str, int i11) {
        l lVar = f23916o;
        String strB = lVar != null ? lVar.b(str) : r.b(str);
        String str2 = strB != null ? strB : str;
        cp.b.f(str, strB, i11);
        try {
            boolean zV = v(System.mapLibraryName(str2), str, strB, i11, null);
            cp.b.e(null, zV);
            return zV;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                cp.b.e(th2, false);
                throw th3;
            }
        }
    }

    private static Boolean z(String str) {
        Boolean boolValueOf;
        if (f23906e != null) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f23904c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f23906e == null) {
                if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    synchronized (SoLoader.class) {
                        try {
                            boolean zContains = f23909h.contains(str);
                            boolean z11 = !zContains;
                            if (!zContains) {
                                System.loadLibrary(str);
                            }
                            boolValueOf = Boolean.valueOf(z11);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return boolValueOf;
                }
                f();
            }
            reentrantReadWriteLock.readLock().unlock();
            return null;
        } catch (Throwable th3) {
            f23904c.readLock().unlock();
            throw th3;
        }
    }
}
