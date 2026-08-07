package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import io.sentry.ILogger;
import io.sentry.android.core.z0;
import io.sentry.b7;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
public final class t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Charset f79546g = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f79547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0 f79548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f79549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f79550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f79551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runtime f79552f;

    public t(Context context, z0 z0Var, ILogger iLogger) {
        this(context, z0Var, iLogger, new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, Runtime.getRuntime());
    }

    private boolean a() {
        String strA = this.f79548b.a();
        return strA != null && strA.contains("test-keys");
    }

    private boolean b() {
        for (String str : this.f79550d) {
            try {
                if (new File(str).exists()) {
                    return true;
                }
            } catch (RuntimeException e11) {
                this.f79549c.b(b7.ERROR, e11, "Error when trying to check if root file %s exists.", str);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047 A[PHI: r2
      0x0047: PHI (r2v3 java.lang.Process) = (r2v1 java.lang.Process), (r2v4 java.lang.Process) binds: [B:20:0x0045, B:25:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    private boolean c() {
        Process processExec = null;
        try {
            try {
                processExec = this.f79552f.exec(new String[]{"/system/xbin/which", "su"});
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), f79546g));
                try {
                    boolean z11 = bufferedReader.readLine() != null;
                    bufferedReader.close();
                    processExec.destroy();
                    return z11;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (processExec != null) {
                    processExec.destroy();
                }
                throw th4;
            }
        } catch (IOException unused) {
            this.f79549c.c(b7.DEBUG, "SU isn't found on this Device.", new Object[0]);
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        } catch (Throwable th5) {
            this.f79549c.a(b7.DEBUG, "Error when trying to check if SU exists.", th5);
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    private boolean d(ILogger iLogger) {
        z0 z0Var = new z0(iLogger);
        PackageManager packageManager = this.f79547a.getPackageManager();
        if (packageManager != null) {
            for (String str : this.f79551e) {
                try {
                    if (z0Var.d() >= 33) {
                        packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                        return true;
                    }
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    public boolean e() {
        return a() || b() || c() || d(this.f79549c);
    }

    t(Context context, z0 z0Var, ILogger iLogger, String[] strArr, String[] strArr2, Runtime runtime) {
        this.f79547a = (Context) io.sentry.util.y.c(context, "The application context is required.");
        this.f79548b = (z0) io.sentry.util.y.c(z0Var, "The BuildInfoProvider is required.");
        this.f79549c = (ILogger) io.sentry.util.y.c(iLogger, "The Logger is required.");
        this.f79550d = (String[]) io.sentry.util.y.c(strArr, "The root Files are required.");
        this.f79551e = (String[]) io.sentry.util.y.c(strArr2, "The root packages are required.");
        this.f79552f = (Runtime) io.sentry.util.y.c(runtime, "The Runtime is required.");
    }
}
