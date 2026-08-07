package xs;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f124033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f124034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C2684a f124035c;

    /* JADX INFO: renamed from: xs.a$a, reason: collision with other inner class name */
    static class C2684a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f124036b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final PackageManager f124037a;

        C2684a(PackageManager packageManager) {
            this.f124037a = packageManager;
        }

        Boolean a() {
            if (!a.b()) {
                return null;
            }
            if (f124036b == null) {
                try {
                    f124036b = PackageManager.class.getDeclaredMethod("isInstantApp", null);
                } catch (NoSuchMethodException unused) {
                    return null;
                }
            }
            try {
                return (Boolean) f124036b.invoke(this.f124037a, null);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean c(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context must be non-null");
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalStateException("Application context is null!");
        }
        if (f124033a != null && applicationContext.equals(f124034b)) {
            return f124033a.booleanValue();
        }
        Boolean boolA = null;
        f124033a = null;
        if (b()) {
            if (f124035c == null || !applicationContext.equals(f124034b)) {
                f124035c = new C2684a(applicationContext.getPackageManager());
            }
            boolA = f124035c.a();
        }
        f124034b = applicationContext;
        if (boolA != null) {
            f124033a = boolA;
        } else {
            try {
                applicationContext.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f124033a = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f124033a = Boolean.FALSE;
            }
        }
        return f124033a.booleanValue();
    }
}
