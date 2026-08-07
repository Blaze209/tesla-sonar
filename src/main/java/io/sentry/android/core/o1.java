package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.sentry.b7;
import io.sentry.q7;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
public final class o1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile o1 f79641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final io.sentry.util.a f79642j = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f79643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f79644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0 f79645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f79646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g1.a f79647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g1.b f79648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.protocol.n f79649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Long f79650h;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f79651a;

        static {
            int[] iArr = new int[io.sentry.m0.a.values().length];
            f79651a = iArr;
            try {
                iArr[io.sentry.m0.a.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79651a[io.sentry.m0.a.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public o1(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.f79643a = context;
        this.f79644b = sentryAndroidOptions;
        z0 z0Var = new z0(sentryAndroidOptions.getLogger());
        this.f79645c = z0Var;
        io.sentry.android.core.internal.util.m.a().c();
        this.f79649g = w();
        this.f79646d = z0Var.f();
        this.f79647e = g1.v(context, sentryAndroidOptions.getLogger(), z0Var);
        this.f79648f = g1.w(context, z0Var);
        ActivityManager.MemoryInfo memoryInfoN = g1.n(context, sentryAndroidOptions.getLogger());
        if (memoryInfoN != null) {
            this.f79650h = Long.valueOf(memoryInfoN.totalMem);
        } else {
            this.f79650h = null;
        }
    }

    public static /* synthetic */ void b(o1 o1Var, io.sentry.protocol.e eVar) {
        File externalFilesDir = o1Var.f79643a.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            StatFs statFs = new StatFs(externalFilesDir.getPath());
            eVar.o0(o1Var.r(statFs));
            eVar.X(o1Var.u(statFs));
        }
        StatFs statFsJ = o1Var.j(externalFilesDir);
        if (statFsJ != null) {
            eVar.U(o1Var.q(statFsJ));
            eVar.T(o1Var.t(statFsJ));
        }
    }

    private Intent d() {
        return g1.u(this.f79643a, this.f79645c, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null);
    }

    public static Float e(Intent intent, q7 q7Var) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th2) {
            q7Var.getLogger().a(b7.ERROR, "Error getting device battery level.", th2);
            return null;
        }
    }

    private Float f(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(intExtra / 10.0f);
            }
            return null;
        } catch (Throwable th2) {
            this.f79644b.getLogger().a(b7.ERROR, "Error getting battery temperature.", th2);
            return null;
        }
    }

    private Date g() {
        try {
            return io.sentry.l.e(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e11) {
            this.f79644b.getLogger().b(b7.ERROR, e11, "Error getting the device's boot time.", new Object[0]);
            return null;
        }
    }

    private String h() {
        try {
            return (String) this.f79644b.getRuntimeManager().a(new io.sentry.util.runtime.a.InterfaceC1708a() { // from class: io.sentry.android.core.n1
                @Override // io.sentry.util.runtime.a.InterfaceC1708a
                public final Object run() {
                    return t1.a(this.f79635a.f79643a);
                }
            });
        } catch (Throwable th2) {
            this.f79644b.getLogger().a(b7.ERROR, "Error getting installationId.", th2);
            return null;
        }
    }

    private File i(File file) {
        File[] externalFilesDirs = this.f79643a.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            String absolutePath = file != null ? file.getAbsolutePath() : null;
            for (File file2 : externalFilesDirs) {
                if (file2 != null && (absolutePath == null || absolutePath.isEmpty() || !file2.getAbsolutePath().contains(absolutePath))) {
                    return file2;
                }
            }
        } else {
            this.f79644b.getLogger().c(b7.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
        }
        return null;
    }

    private StatFs j(File file) {
        try {
            File fileI = i(file);
            if (fileI != null) {
                return new StatFs(fileI.getPath());
            }
            return null;
        } catch (Throwable unused) {
            this.f79644b.getLogger().c(b7.INFO, "Not possible to read external files directory", new Object[0]);
            return null;
        }
    }

    public static o1 k(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (f79641i == null) {
            io.sentry.d1 d1VarA = f79642j.a();
            try {
                if (f79641i == null) {
                    f79641i = new o1(g1.g(context), sentryAndroidOptions);
                }
                if (d1VarA != null) {
                    d1VarA.close();
                }
            } catch (Throwable th2) {
                if (d1VarA != null) {
                    try {
                        d1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return f79641i;
    }

    private io.sentry.protocol.e.b m() {
        io.sentry.protocol.e.b bVarA;
        Throwable th2;
        try {
            bVarA = io.sentry.android.core.internal.util.o.a(this.f79643a.getResources().getConfiguration().orientation);
            if (bVarA != null) {
                return bVarA;
            }
            try {
                this.f79644b.getLogger().c(b7.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                this.f79644b.getLogger().a(b7.ERROR, "Error getting device orientation.", th2);
                return bVarA;
            }
        } catch (Throwable th4) {
            bVarA = null;
            th2 = th4;
        }
    }

    private TimeZone p() {
        if (this.f79645c.d() >= 24) {
            LocaleList locales = this.f79643a.getResources().getConfiguration().getLocales();
            if (!locales.isEmpty()) {
                return Calendar.getInstance(locales.get(0)).getTimeZone();
            }
        }
        return Calendar.getInstance().getTimeZone();
    }

    private Long q(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f79644b.getLogger().a(b7.ERROR, "Error getting total external storage amount.", th2);
            return null;
        }
    }

    private Long r(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f79644b.getLogger().a(b7.ERROR, "Error getting total internal storage amount.", th2);
            return null;
        }
    }

    private Long t(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f79644b.getLogger().a(b7.ERROR, "Error getting unused external storage amount.", th2);
            return null;
        }
    }

    private Long u(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f79644b.getLogger().a(b7.ERROR, "Error getting unused internal storage amount.", th2);
            return null;
        }
    }

    public static Boolean v(Intent intent, q7 q7Var) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z11 = true;
            if (intExtra != 1 && intExtra != 2) {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        } catch (Throwable th2) {
            q7Var.getLogger().a(b7.ERROR, "Error getting device charging state.", th2);
            return null;
        }
    }

    private io.sentry.protocol.n w() {
        io.sentry.protocol.n nVar = new io.sentry.protocol.n();
        nVar.j("Android");
        nVar.m(Build.VERSION.RELEASE);
        nVar.h(Build.DISPLAY);
        String strM = g1.m(this.f79644b.getLogger());
        if (strM != null) {
            nVar.i(strM);
        }
        if (this.f79644b.isEnableRootCheck()) {
            nVar.k(Boolean.valueOf(new io.sentry.android.core.internal.util.t(this.f79643a, this.f79645c, this.f79644b.getLogger()).e()));
        }
        return nVar;
    }

    private void x(final io.sentry.protocol.e eVar, boolean z11) {
        Boolean bool;
        Intent intentD = d();
        if (intentD != null) {
            eVar.M(e(intentD, this.f79644b));
            eVar.Q(v(intentD, this.f79644b));
            eVar.N(f(intentD));
        }
        int i11 = a.f79651a[this.f79644b.getConnectionStatusProvider().q0().ordinal()];
        if (i11 != 1) {
            bool = i11 != 2 ? null : Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        eVar.f0(bool);
        ActivityManager.MemoryInfo memoryInfoN = g1.n(this.f79643a, this.f79644b.getLogger());
        if (memoryInfoN != null && z11) {
            eVar.W(Long.valueOf(memoryInfoN.availMem));
            eVar.a0(Boolean.valueOf(memoryInfoN.lowMemory));
        }
        this.f79644b.getRuntimeManager().b(new Runnable() { // from class: io.sentry.android.core.m1
            @Override // java.lang.Runnable
            public final void run() {
                o1.b(this.f79613a, eVar);
            }
        });
        if (eVar.I() == null) {
            eVar.S(this.f79644b.getConnectionStatusProvider().X());
        }
    }

    @SuppressLint({"NewApi"})
    public io.sentry.protocol.e c(boolean z11, boolean z12) {
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        eVar.b0(Build.MANUFACTURER);
        eVar.P(Build.BRAND);
        eVar.V(g1.l(this.f79644b.getLogger()));
        eVar.d0(Build.MODEL);
        eVar.e0(Build.ID);
        eVar.L(g1.j());
        if (this.f79645c.d() >= 31) {
            eVar.R(Build.SOC_MANUFACTURER + " " + Build.SOC_MODEL);
        }
        eVar.g0(m());
        Boolean bool = this.f79646d;
        if (bool != null) {
            eVar.n0(bool);
        }
        DisplayMetrics displayMetricsK = g1.k(this.f79643a, this.f79644b.getLogger());
        if (displayMetricsK != null) {
            eVar.m0(Integer.valueOf(displayMetricsK.widthPixels));
            eVar.l0(Integer.valueOf(displayMetricsK.heightPixels));
            eVar.j0(Float.valueOf(displayMetricsK.density));
            eVar.k0(Integer.valueOf(displayMetricsK.densityDpi));
        }
        eVar.O(g());
        eVar.p0(p());
        if (eVar.J() == null) {
            eVar.Y(h());
        }
        Locale locale = Locale.getDefault();
        if (eVar.K() == null) {
            eVar.Z(locale.toString());
        }
        List<Integer> listC = io.sentry.android.core.internal.util.m.a().c();
        if (!listC.isEmpty()) {
            eVar.i0(Double.valueOf(((Integer) Collections.max(listC)).doubleValue()));
            eVar.h0(Integer.valueOf(listC.size()));
        }
        eVar.c0(this.f79650h);
        if (z11 && this.f79644b.isCollectAdditionalContext()) {
            x(eVar, z12);
        }
        return eVar;
    }

    public io.sentry.protocol.n l() {
        return this.f79649g;
    }

    public g1.a n() {
        return this.f79647e;
    }

    public g1.b o() {
        return this.f79648f;
    }

    public Long s() {
        return this.f79650h;
    }
}
