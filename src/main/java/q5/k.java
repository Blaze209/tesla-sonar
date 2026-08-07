package q5;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f104828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f104829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f104830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f104831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f104832e;

    static class a {
        static boolean a() {
            return Trace.isEnabled();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f104828a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f104829b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f104830c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f104831d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f104832e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e11) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e11);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.a();
        }
        try {
            return ((Boolean) f104829b.invoke(null, Long.valueOf(f104828a))).booleanValue();
        } catch (Exception unused) {
            Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }
}
