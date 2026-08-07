package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import expo.modules.interfaces.permissions.PermissionsResponse;
import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.q7;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"NewApi"})
    private static final io.sentry.android.core.util.a<PackageInfo> f79393a = new io.sentry.android.core.util.a<>(new io.sentry.android.core.util.a.InterfaceC1682a() { // from class: io.sentry.android.core.b1
        @Override // io.sentry.android.core.util.a.InterfaceC1682a
        public final Object a(Context context) {
            return g1.d(context);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final io.sentry.android.core.util.a<PackageInfo> f79394b = new io.sentry.android.core.util.a<>(new io.sentry.android.core.util.a.InterfaceC1682a() { // from class: io.sentry.android.core.c1
        @Override // io.sentry.android.core.util.a.InterfaceC1682a
        public final Object a(Context context) {
            return g1.b(context);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final io.sentry.android.core.util.a<String> f79395c = new io.sentry.android.core.util.a<>(new io.sentry.android.core.util.a.InterfaceC1682a() { // from class: io.sentry.android.core.d1
        @Override // io.sentry.android.core.util.a.InterfaceC1682a
        public final Object a(Context context) {
            return g1.a(context);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"NewApi"})
    private static final io.sentry.android.core.util.a<ApplicationInfo> f79396d = new io.sentry.android.core.util.a<>(new io.sentry.android.core.util.a.InterfaceC1682a() { // from class: io.sentry.android.core.e1
        @Override // io.sentry.android.core.util.a.InterfaceC1682a
        public final Object a(Context context) {
            return g1.c(context);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final io.sentry.android.core.util.a<ApplicationInfo> f79397e = new io.sentry.android.core.util.a<>(new io.sentry.android.core.util.a.InterfaceC1682a() { // from class: io.sentry.android.core.f1
        @Override // io.sentry.android.core.util.a.InterfaceC1682a
        public final Object a(Context context) {
            return g1.e(context);
        }
    });

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f79398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f79399b;

        public a(boolean z11, String str) {
            this.f79398a = z11;
            this.f79399b = str;
        }

        public Map<String, String> a() {
            HashMap map = new HashMap();
            map.put("isSideLoaded", String.valueOf(this.f79398a));
            String str = this.f79399b;
            if (str != null) {
                map.put("installerStore", str);
            }
            return map;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f79400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f79401b;

        public b(boolean z11, String[] strArr) {
            this.f79400a = z11;
            this.f79401b = strArr;
        }

        public String[] a() {
            return this.f79401b;
        }

        public boolean b() {
            return this.f79400a;
        }
    }

    public static /* synthetic */ String a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i11 = applicationInfo.labelRes;
            if (i11 != 0) {
                return context.getString(i11);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ PackageInfo b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ ApplicationInfo c(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ PackageInfo d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ ApplicationInfo e(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean f(Context context) {
        if (!context.getPackageName().endsWith(".test")) {
            return false;
        }
        try {
            Iterator<ActivityManager.AppTask> it = ((ActivityManager) context.getSystemService("activity")).getAppTasks().iterator();
            while (it.hasNext()) {
                ComponentName component = it.next().getTaskInfo().baseIntent.getComponent();
                if (component != null && component.getClassName().equals("androidx.compose.ui.tooling.PreviewActivity")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Context g(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @SuppressLint({"NewApi"})
    static ApplicationInfo h(Context context, z0 z0Var) {
        return z0Var.d() >= 33 ? f79396d.a(context) : f79397e.a(context);
    }

    static String i(Context context) {
        return f79395c.a(context);
    }

    static String[] j() {
        return Build.SUPPORTED_ABIS;
    }

    static DisplayMetrics k(Context context, ILogger iLogger) {
        try {
            return context.getResources().getDisplayMetrics();
        } catch (Throwable th2) {
            iLogger.a(b7.ERROR, "Error getting DisplayMetrics.", th2);
            return null;
        }
    }

    static String l(ILogger iLogger) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th2) {
            iLogger.a(b7.ERROR, "Error getting device family.", th2);
            return null;
        }
    }

    static String m(ILogger iLogger) {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                return line;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e11) {
            iLogger.a(b7.ERROR, "Exception while attempting to read kernel information", e11);
            return property;
        }
    }

    static ActivityManager.MemoryInfo n(Context context, ILogger iLogger) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.c(b7.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th2) {
            iLogger.a(b7.ERROR, "Error getting MemoryInfo.", th2);
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    static PackageInfo o(Context context, int i11, ILogger iLogger, z0 z0Var) {
        try {
            return z0Var.d() >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(i11)) : context.getPackageManager().getPackageInfo(context.getPackageName(), i11);
        } catch (Throwable th2) {
            iLogger.a(b7.ERROR, "Error getting package info.", th2);
            return null;
        }
    }

    static PackageInfo p(Context context, z0 z0Var) {
        return z0Var.d() >= 33 ? f79393a.a(context) : f79394b.a(context);
    }

    @SuppressLint({"NewApi"})
    static String q(PackageInfo packageInfo, z0 z0Var) {
        return z0Var.d() >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : r(packageInfo);
    }

    private static String r(PackageInfo packageInfo) {
        return Integer.toString(packageInfo.versionCode);
    }

    public static boolean s() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }

    static Intent t(Context context, q7 q7Var, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        return u(context, new z0(q7Var.getLogger()), broadcastReceiver, intentFilter, handler);
    }

    @SuppressLint({"NewApi", "UnspecifiedRegisterReceiverFlag"})
    static Intent u(Context context, z0 z0Var, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        return z0Var.d() >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, null, handler, 4) : context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
    }

    static a v(Context context, ILogger iLogger, z0 z0Var) {
        String str;
        try {
            PackageInfo packageInfoP = p(context, z0Var);
            PackageManager packageManager = context.getPackageManager();
            if (packageInfoP != null && packageManager != null) {
                str = packageInfoP.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    return new a(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    iLogger.c(b7.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    static b w(Context context, z0 z0Var) {
        Bundle bundle;
        ApplicationInfo applicationInfoH = h(context, z0Var);
        PackageInfo packageInfoP = p(context, z0Var);
        if (packageInfoP == null) {
            return null;
        }
        return new b((applicationInfoH == null || (bundle = applicationInfoH.metaData) == null) ? false : bundle.getBoolean("com.android.vending.splits.required"), packageInfoP.splitNames);
    }

    static void x(PackageInfo packageInfo, z0 z0Var, o1 o1Var, io.sentry.protocol.a aVar) {
        aVar.n(packageInfo.packageName);
        aVar.q(packageInfo.versionName);
        aVar.m(q(packageInfo, z0Var));
        HashMap map = new HashMap();
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                String str = strArr[i11];
                map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i11] & 2) == 2 ? PermissionsResponse.GRANTED_KEY : "not_granted");
            }
        }
        aVar.s(map);
        if (o1Var != null) {
            try {
                b bVarO = o1Var.o();
                if (bVarO != null) {
                    aVar.t(Boolean.valueOf(bVarO.b()));
                    if (bVarO.a() != null) {
                        aVar.u(Arrays.asList(bVarO.a()));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
