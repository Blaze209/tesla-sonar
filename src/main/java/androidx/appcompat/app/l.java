package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Field f2120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f2121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class<?> f2122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f2123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Field f2124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f2125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Field f2126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f2127h;

    static void a(@NonNull Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        b(resources);
    }

    private static void b(@NonNull Resources resources) {
        Object obj;
        if (!f2127h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f2126g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e11);
            }
            f2127h = true;
        }
        Field field = f2126g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e12);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f2121b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f2120a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e13);
            }
            f2121b = true;
        }
        Field field2 = f2120a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e14) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e14);
            }
        }
        if (obj2 != null) {
            c(obj2);
        }
    }

    private static void c(@NonNull Object obj) {
        LongSparseArray longSparseArray;
        if (!f2123d) {
            try {
                f2122c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e11) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e11);
            }
            f2123d = true;
        }
        Class<?> cls = f2122c;
        if (cls == null) {
            return;
        }
        if (!f2125f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f2124e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e12);
            }
            f2125f = true;
        }
        Field field = f2124e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e13) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e13);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
