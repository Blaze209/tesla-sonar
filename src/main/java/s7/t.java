package s7;

import android.text.TextUtils;
import android.util.Log;
import ch.qos.logback.classic.net.SyslogAppender;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f110488b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f110489c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f110487a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f110490d = a.f110491a;

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f110491a = new C2351a();

        /* JADX INFO: renamed from: s7.t$a$a, reason: collision with other inner class name */
        class C2351a implements a {
            C2351a() {
            }

            @Override // s7.t.a
            public void a(String str, String str2, Throwable th2) {
                Log.w(str, t.a(str2, th2));
            }

            @Override // s7.t.a
            public void b(String str, String str2, Throwable th2) {
                Log.d(str, t.a(str2, th2));
            }

            @Override // s7.t.a
            public void c(String str, String str2, Throwable th2) {
                Log.e(str, t.a(str2, th2));
            }

            @Override // s7.t.a
            public void d(String str, String str2, Throwable th2) {
                Log.i(str, t.a(str2, th2));
            }
        }

        void a(String str, String str2, Throwable th2);

        void b(String str, String str2, Throwable th2);

        void c(String str, String str2, Throwable th2);

        void d(String str, String str2, Throwable th2);
    }

    @Pure
    public static String a(String str, Throwable th2) {
        String strF = f(th2);
        if (TextUtils.isEmpty(strF)) {
            return str;
        }
        return str + "\n  " + strF.replace("\n", "\n  ") + '\n';
    }

    @Pure
    public static void b(String str, String str2) {
        synchronized (f110487a) {
            try {
                if (f110488b == 0) {
                    f110490d.b(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void c(String str, String str2, Throwable th2) {
        synchronized (f110487a) {
            try {
                if (f110488b == 0) {
                    f110490d.b(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Pure
    public static void d(String str, String str2) {
        synchronized (f110487a) {
            try {
                if (f110488b <= 3) {
                    f110490d.c(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void e(String str, String str2, Throwable th2) {
        synchronized (f110487a) {
            try {
                if (f110488b <= 3) {
                    f110490d.c(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Pure
    public static String f(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        synchronized (f110487a) {
            try {
                if (h(th2)) {
                    return "UnknownHostException (no network)";
                }
                if (f110489c) {
                    return Log.getStackTraceString(th2).trim().replace(SyslogAppender.DEFAULT_STACKTRACE_PATTERN, "    ");
                }
                return th2.getMessage();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Pure
    public static void g(String str, String str2) {
        synchronized (f110487a) {
            try {
                if (f110488b <= 1) {
                    f110490d.d(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
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
        synchronized (f110487a) {
            try {
                if (f110488b <= 2) {
                    f110490d.a(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void j(String str, String str2, Throwable th2) {
        synchronized (f110487a) {
            try {
                if (f110488b <= 2) {
                    f110490d.a(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
