package ts;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f114966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f114967b;

    public static IBinder a(Bundle bundle, String str) {
        return p0.f115040a >= 18 ? bundle.getBinder(str) : b(bundle, str);
    }

    private static IBinder b(Bundle bundle, String str) {
        Method method = f114966a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f114966a = method2;
                method2.setAccessible(true);
                method = f114966a;
            } catch (NoSuchMethodException e11) {
                u.g("BundleUtil", "Failed to retrieve getIBinder method", e11);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e12) {
            u.g("BundleUtil", "Failed to invoke getIBinder via reflection", e12);
            return null;
        }
    }

    public static void c(Bundle bundle, String str, IBinder iBinder) {
        if (p0.f115040a >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            d(bundle, str, iBinder);
        }
    }

    private static void d(Bundle bundle, String str, IBinder iBinder) {
        Method method = f114967b;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                f114967b = method2;
                method2.setAccessible(true);
                method = f114967b;
            } catch (NoSuchMethodException e11) {
                u.g("BundleUtil", "Failed to retrieve putIBinder method", e11);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e12) {
            u.g("BundleUtil", "Failed to invoke putIBinder via reflection", e12);
        }
    }
}
