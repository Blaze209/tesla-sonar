package kh;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f86083a;

    public static final boolean a() {
        Context context = null;
        try {
            if (f86083a == null) {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", null);
                f86083a = method;
                method.setAccessible(true);
            }
            context = (Context) f86083a.invoke(null, null);
        } catch (Exception e11) {
            Log.e("OpenIdHelper", "ActivityThread:currentApplication --> " + e11.toString());
        }
        if (context == null) {
            return false;
        }
        return f.d().g(context, false);
    }

    public static String b(Context context) {
        f fVarD = f.d();
        return fVarD.a(context.getApplicationContext(), fVarD.f86092b);
    }
}
