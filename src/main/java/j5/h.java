package j5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f82656a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<e, SparseArray<d>> f82657b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f82658c = new Object();

    static class a {
        static Drawable a(Resources resources, int i11, Resources.Theme theme) {
            return resources.getDrawable(i11, theme);
        }
    }

    static class b {
        static int a(Resources resources, int i11, Resources.Theme theme) {
            return resources.getColor(i11, theme);
        }

        static ColorStateList b(Resources resources, int i11, Resources.Theme theme) {
            return resources.getColorStateList(i11, theme);
        }
    }

    static class c {
        static float a(Resources resources, int i11) {
            return resources.getFloat(i11);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ColorStateList f82659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Configuration f82660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f82661c;

        d(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f82659a = colorStateList;
            this.f82660b = configuration;
            this.f82661c = theme == null ? 0 : theme.hashCode();
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Resources f82662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Resources.Theme f82663b;

        e(Resources resources, Resources.Theme theme) {
            this.f82662a = resources;
            this.f82663b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f82662a.equals(eVar.f82662a) && u5.c.a(this.f82663b, eVar.f82663b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return u5.c.b(this.f82662a, this.f82663b);
        }
    }

    public static abstract class f {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i11, Handler handler) {
            e(handler).post(new Runnable() { // from class: j5.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82669a.f(i11);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: j5.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82667a.g(typeface);
                }
            });
        }

        public abstract void f(int i11);

        public abstract void g(Typeface typeface);
    }

    public static final class g {

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final Object f82664a = new Object();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static Method f82665b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static boolean f82666c;

            /* JADX WARN: Code duplicated, block: B:31:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @SuppressLint({"BanUncheckedReflection"})
            static void a(Resources.Theme theme) {
                Method method;
                synchronized (f82664a) {
                    if (f82666c) {
                        method = f82665b;
                        if (method != null) {
                            method.invoke(theme, null);
                        }
                    } else {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            f82665b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e11) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e11);
                        }
                        f82666c = true;
                        method = f82665b;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException e12) {
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e12);
                                f82665b = null;
                            }
                        }
                    }
                    throw th;
                }
            }
        }

        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    private static void a(e eVar, int i11, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f82658c) {
            try {
                WeakHashMap<e, SparseArray<d>> weakHashMap = f82657b;
                SparseArray<d> sparseArray = weakHashMap.get(eVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(eVar, sparseArray);
                }
                sparseArray.append(i11, new d(colorStateList, eVar.f82662a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f82661c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList b(j5.h.e r5, int r6) {
        /*
            java.lang.Object r0 = j5.h.f82658c
            monitor-enter(r0)
            java.util.WeakHashMap<j5.h$e, android.util.SparseArray<j5.h$d>> r1 = j5.h.f82657b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            j5.h$d r2 = (j5.h.d) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f82660b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f82662a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f82663b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f82661c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f82661c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f82659a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.h.b(j5.h$e, int):android.content.res.ColorStateList");
    }

    public static Typeface c(Context context, int i11) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i11, new TypedValue(), 0, null, null, false, true);
    }

    public static int d(Resources resources, int i11, Resources.Theme theme) {
        return b.a(resources, i11, theme);
    }

    public static ColorStateList e(Resources resources, int i11, Resources.Theme theme) {
        e eVar = new e(resources, theme);
        ColorStateList colorStateListB = b(eVar, i11);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListL = l(resources, i11, theme);
        if (colorStateListL == null) {
            return b.b(resources, i11, theme);
        }
        a(eVar, i11, colorStateListL, theme);
        return colorStateListL;
    }

    public static Drawable f(Resources resources, int i11, Resources.Theme theme) {
        return a.a(resources, i11, theme);
    }

    public static float g(Resources resources, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            return c.a(resources, i11);
        }
        TypedValue typedValueK = k();
        resources.getValue(i11, typedValueK, true);
        if (typedValueK.type == 4) {
            return typedValueK.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i11) + " type #0x" + Integer.toHexString(typedValueK.type) + " is not valid");
    }

    public static Typeface h(Context context, int i11) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i11, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface i(Context context, int i11, TypedValue typedValue, int i12, f fVar) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i11, typedValue, i12, fVar, null, true, false);
    }

    public static void j(Context context, int i11, f fVar, Handler handler) {
        u5.h.g(fVar);
        if (context.isRestricted()) {
            fVar.c(-4, handler);
        } else {
            n(context, i11, new TypedValue(), 0, fVar, handler, false, false);
        }
    }

    private static TypedValue k() {
        ThreadLocal<TypedValue> threadLocal = f82656a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList l(Resources resources, int i11, Resources.Theme theme) {
        if (m(resources, i11)) {
            return null;
        }
        try {
            return j5.c.a(resources, resources.getXml(i11), theme);
        } catch (Exception e11) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e11);
            return null;
        }
    }

    private static boolean m(Resources resources, int i11) {
        TypedValue typedValueK = k();
        resources.getValue(i11, typedValueK, true);
        int i12 = typedValueK.type;
        return i12 >= 28 && i12 <= 31;
    }

    private static Typeface n(Context context, int i11, TypedValue typedValue, int i12, f fVar, Handler handler, boolean z11, boolean z12) {
        Resources resources = context.getResources();
        resources.getValue(i11, typedValue, true);
        Typeface typefaceO = o(context, resources, typedValue, i11, i12, fVar, handler, z11, z12);
        if (typefaceO != null || fVar != null || z12) {
            return typefaceO;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i11) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    private static Typeface o(Context context, Resources resources, TypedValue typedValue, int i11, int i12, f fVar, Handler handler, boolean z11, boolean z12) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i11) + "\" (" + Integer.toHexString(i11) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (fVar != null) {
                fVar.c(-3, handler);
            }
            return null;
        }
        Typeface typefaceG = k5.h.g(resources, i11, string, typedValue.assetCookie, i12);
        if (typefaceG != null) {
            if (fVar != null) {
                fVar.d(typefaceG, handler);
            }
            return typefaceG;
        }
        if (z12) {
            return null;
        }
        try {
            if (!string.toLowerCase().endsWith(".xml")) {
                Typeface typefaceE = k5.h.e(context, resources, i11, string, typedValue.assetCookie, i12);
                if (fVar != null) {
                    if (typefaceE != null) {
                        fVar.d(typefaceE, handler);
                        return typefaceE;
                    }
                    fVar.c(-3, handler);
                }
                return typefaceE;
            }
            j5.e.b bVarB = j5.e.b(resources.getXml(i11), resources);
            if (bVarB == null) {
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                if (fVar != null) {
                    fVar.c(-3, handler);
                }
                return null;
            }
            try {
                return k5.h.d(context, bVarB, resources, i11, string, typedValue.assetCookie, i12, fVar, handler, z11);
            } catch (IOException e11) {
                e = e11;
                string = string;
                Log.e("ResourcesCompat", "Failed to read xml resource " + string, e);
                if (fVar != null) {
                    fVar.c(-3, handler);
                }
                return null;
            } catch (XmlPullParserException e12) {
                e = e12;
                string = string;
                Log.e("ResourcesCompat", "Failed to parse xml resource " + string, e);
                if (fVar != null) {
                    fVar.c(-3, handler);
                }
                return null;
            }
        } catch (IOException e13) {
            e = e13;
        } catch (XmlPullParserException e14) {
            e = e14;
        }
    }
}
