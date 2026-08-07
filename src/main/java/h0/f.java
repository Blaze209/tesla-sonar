package h0;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    private static class a {
        @NonNull
        static Context a(@NonNull Context context, String str) {
            return context.createAttributionContext(str);
        }

        static String b(@NonNull Context context) {
            return context.getAttributionTag();
        }
    }

    private static class b {
        @NonNull
        static Context a(@NonNull Context context, int i11) {
            return context.createDeviceContext(i11);
        }

        static int b(@NonNull Context context) {
            return context.getDeviceId();
        }
    }

    @NonNull
    public static Context a(@NonNull Context context) {
        int iB;
        Context applicationContext = context.getApplicationContext();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34 && (iB = b.b(context)) != b.b(applicationContext)) {
            applicationContext = b.a(applicationContext, iB);
        }
        if (i11 >= 30) {
            String strB = a.b(context);
            if (!Objects.equals(strB, a.b(applicationContext))) {
                return a.a(applicationContext, strB);
            }
        }
        return applicationContext;
    }

    public static Application b(@NonNull Context context) {
        for (Context contextA = a(context); contextA instanceof ContextWrapper; contextA = ((ContextWrapper) contextA).getBaseContext()) {
            if (contextA instanceof Application) {
                return (Application) contextA;
            }
        }
        return null;
    }
}
