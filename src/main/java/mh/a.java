package mh;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Object f92100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class<?> f92101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f92102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f92103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f92104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f92105f;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f92101b = cls;
            f92100a = cls.newInstance();
            f92102c = f92101b.getMethod("getUDID", Context.class);
            f92103d = f92101b.getMethod("getOAID", Context.class);
            f92104e = f92101b.getMethod("getVAID", Context.class);
            f92105f = f92101b.getMethod("getAAID", Context.class);
        } catch (Exception e11) {
            Log.e("IdentifierManager", "reflect exception!", e11);
        }
    }

    public static String a(Context context, Method method) {
        Object obj = f92100a;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(obj, context);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            return null;
        } catch (Exception e11) {
            Log.e("IdentifierManager", "invoke exception!", e11);
            return null;
        }
    }

    public static boolean b() {
        return (f92101b == null || f92100a == null) ? false : true;
    }

    public static String c(Context context) {
        return a(context, f92103d);
    }
}
