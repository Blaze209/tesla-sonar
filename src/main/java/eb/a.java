package eb;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f62333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f62334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f62335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f62336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f62337e;

    public static void a(@NonNull String str, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.a(l(str), i11);
        } else {
            b(l(str), i11);
        }
    }

    private static void b(@NonNull String str, int i11) {
        try {
            if (f62335c == null) {
                f62335c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f62335c.invoke(null, Long.valueOf(f62333a), str, Integer.valueOf(i11));
        } catch (Exception e11) {
            g("asyncTraceBegin", e11);
        }
    }

    public static void c(@NonNull String str) {
        b.a(l(str));
    }

    public static void d(@NonNull String str, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.b(l(str), i11);
        } else {
            e(l(str), i11);
        }
    }

    private static void e(@NonNull String str, int i11) {
        try {
            if (f62336d == null) {
                f62336d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f62336d.invoke(null, Long.valueOf(f62333a), str, Integer.valueOf(i11));
        } catch (Exception e11) {
            g("asyncTraceEnd", e11);
        }
    }

    public static void f() {
        b.b();
    }

    private static void g(@NonNull String str, @NonNull Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 29 ? c.c() : i();
    }

    private static boolean i() {
        try {
            if (f62334b == null) {
                f62333a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f62334b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f62334b.invoke(null, Long.valueOf(f62333a))).booleanValue();
        } catch (Exception e11) {
            g("isTagEnabled", e11);
            return false;
        }
    }

    public static void j(@NonNull String str, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.d(l(str), i11);
        } else {
            k(l(str), i11);
        }
    }

    private static void k(@NonNull String str, int i11) {
        try {
            if (f62337e == null) {
                f62337e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f62337e.invoke(null, Long.valueOf(f62333a), str, Integer.valueOf(i11));
        } catch (Exception e11) {
            g("traceCounter", e11);
        }
    }

    @NonNull
    private static String l(@NonNull String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
