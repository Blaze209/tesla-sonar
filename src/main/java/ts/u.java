package ts;

import android.text.TextUtils;
import android.util.Log;
import ch.qos.logback.classic.net.SyslogAppender;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f115073b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f115074c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f115072a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f115075d = a.f115076a;

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f115076a = new C2461a();

        /* JADX INFO: renamed from: ts.u$a$a, reason: collision with other inner class name */
        class C2461a implements a {
            C2461a() {
            }

            @Override // ts.u.a
            public void d(String str, String str2) {
                Log.d(str, str2);
            }

            @Override // ts.u.a
            public void e(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // ts.u.a
            public void i(String str, String str2) {
                Log.i(str, str2);
            }

            @Override // ts.u.a
            public void w(String str, String str2) {
                Log.w(str, str2);
            }
        }

        void d(String str, String str2);

        void e(String str, String str2);

        void i(String str, String str2);

        void w(String str, String str2);
    }

    @Pure
    private static String a(String str, Throwable th2) {
        String strE = e(th2);
        if (TextUtils.isEmpty(strE)) {
            return str;
        }
        return str + "\n  " + strE.replace("\n", "\n  ") + '\n';
    }

    @Pure
    public static void b(String str, String str2) {
        synchronized (f115072a) {
            try {
                if (f115073b == 0) {
                    f115075d.d(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void c(String str, String str2) {
        synchronized (f115072a) {
            try {
                if (f115073b <= 3) {
                    f115075d.e(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void d(String str, String str2, Throwable th2) {
        c(str, a(str2, th2));
    }

    @Pure
    public static String e(Throwable th2) {
        synchronized (f115072a) {
            try {
                if (th2 == null) {
                    return null;
                }
                if (h(th2)) {
                    return "UnknownHostException (no network)";
                }
                if (f115074c) {
                    return Log.getStackTraceString(th2).trim().replace(SyslogAppender.DEFAULT_STACKTRACE_PATTERN, "    ");
                }
                return th2.getMessage();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Pure
    public static void f(String str, String str2) {
        synchronized (f115072a) {
            try {
                if (f115073b <= 1) {
                    f115075d.i(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void g(String str, String str2, Throwable th2) {
        f(str, a(str2, th2));
    }

    @Pure
    private static boolean h(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    @Pure
    public static void i(String str, String str2) {
        synchronized (f115072a) {
            try {
                if (f115073b <= 2) {
                    f115075d.w(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void j(String str, String str2, Throwable th2) {
        i(str, a(str2, th2));
    }
}
