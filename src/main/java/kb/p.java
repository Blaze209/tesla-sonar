package kb;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public class p {

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final t f85850a = new t(p.d().getWebkitToCompatConverter());
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final r f85851a = p.a();
    }

    static r a() {
        try {
            return new s((WebViewProviderFactoryBoundaryInterface) oq0.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new f();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    private static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static t c() {
        return a.f85850a;
    }

    public static r d() {
        return b.f85851a;
    }

    public static ClassLoader e() {
        return Build.VERSION.SDK_INT >= 28 ? c.a() : f().getClass().getClassLoader();
    }

    private static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
