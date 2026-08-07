package kk0;

import java.io.PrintStream;
import java.security.AccessControlException;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f86279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f86280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f86281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f86282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f86283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f86284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static /* synthetic */ Class f86285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static /* synthetic */ Class f86286h;

    static {
        String[] strArr = {null, "JUL", "org.apache.log.Logger", "Avalon", "org.apache.log4j.Logger", "Log4j", "org.apache.commons.logging.Log", "CommonsLogging", "org.slf4j.Logger", "SLF4J"};
        f86279a = strArr;
        if (strArr.length / 2 != 5) {
            throw new AssertionError();
        }
        f86283e = "";
        f86284f = new HashMap();
    }

    static /* synthetic */ Class a(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    private static c b(int i11) throws Throwable {
        if (i11 != -1) {
            return c(i11);
        }
        int i12 = 5;
        int i13 = 5;
        while (i13 >= -1) {
            if (n(i13)) {
                if (i13 == 3 && k()) {
                    i13 = i12;
                }
                try {
                    return c(i13);
                } catch (ClassNotFoundException unused) {
                    continue;
                } catch (Throwable th2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Unexpected error when initializing logging for \"");
                    stringBuffer.append(h(i13));
                    stringBuffer.append("\".");
                    p(stringBuffer.toString(), th2);
                }
            }
            i13--;
        }
        r("Auto detecton couldn't set up any logger libraries; FreeMarker logging suppressed.");
        return new g();
    }

    private static c c(int i11) throws ClassNotFoundException {
        String strG = g(i11);
        if (strG == null) {
            if (i11 == 1) {
                return new d();
            }
            if (i11 == 0) {
                return new g();
            }
            throw new RuntimeException("Bug");
        }
        Class.forName(strG);
        String strH = h(i11);
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("freemarker.log._");
            stringBuffer.append(strH);
            stringBuffer.append("LoggerFactory");
            return (c) Class.forName(stringBuffer.toString()).newInstance();
        } catch (Exception e11) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Unexpected error when creating logger factory for \"");
            stringBuffer2.append(strH);
            stringBuffer2.append("\".");
            throw new RuntimeException(stringBuffer2.toString(), e11);
        }
    }

    private static void d(boolean z11) throws Throwable {
        if (f86281c != null) {
            return;
        }
        Class clsA = f86285g;
        if (clsA == null) {
            clsA = a("freemarker.log.Logger");
            f86285g = clsA;
        }
        synchronized (clsA) {
            try {
                if (f86281c != null) {
                    return;
                }
                String strJ = j("org.freemarker.loggerLibrary");
                int i11 = -1;
                boolean z12 = true;
                if (strJ != null) {
                    strJ = strJ.trim();
                    int i12 = -1;
                    boolean z13 = false;
                    do {
                        if (strJ.equalsIgnoreCase(h(i12))) {
                            z13 = true;
                        } else {
                            i12++;
                        }
                        if (i12 > 5) {
                            break;
                        }
                    } while (!z13);
                    if (!z13) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Ignored invalid \"org.freemarker.loggerLibrary\" system property value: \"");
                        stringBuffer.append(strJ);
                        stringBuffer.append("\"");
                        r(stringBuffer.toString());
                        if (z11) {
                            return;
                        }
                    }
                    if (z13) {
                        i11 = i12;
                    }
                } else if (z11) {
                    return;
                }
                try {
                    s(i11);
                    if (strJ != null) {
                        f86282d = true;
                    }
                } catch (Throwable th2) {
                    if (z11 && strJ != null) {
                        z12 = false;
                    }
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Couldn't set up logger for \"");
                    stringBuffer2.append(h(i11));
                    stringBuffer2.append("\"");
                    stringBuffer2.append(z12 ? "; logging disabled" : ".");
                    p(stringBuffer2.toString(), th2);
                    if (z12) {
                        try {
                            s(0);
                        } catch (ClassNotFoundException e11) {
                            throw new RuntimeException("Bug", e11);
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private static String g(int i11) {
        if (i11 == -1 || i11 == 0) {
            return null;
        }
        return f86279a[(i11 - 1) * 2];
    }

    private static String h(int i11) {
        if (i11 == -1) {
            return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        }
        return i11 == 0 ? "none" : f86279a[((i11 - 1) * 2) + 1];
    }

    public static b i(String str) {
        b logger;
        if (f86283e.length() != 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(f86283e);
            stringBuffer.append(str);
            str = stringBuffer.toString();
        }
        Map map = f86284f;
        synchronized (map) {
            try {
                logger = (b) map.get(str);
                if (logger == null) {
                    d(false);
                    logger = f86281c.getLogger(str);
                    map.put(str, logger);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return logger;
    }

    private static String j(String str) throws Throwable {
        try {
            return (String) AccessController.doPrivileged(new a(str));
        } catch (AccessControlException unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Insufficient permissions to read system property \"");
            stringBuffer.append(str);
            stringBuffer.append("\".");
            r(stringBuffer.toString());
            return null;
        } catch (Throwable th2) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Failed to read system property \"");
            stringBuffer2.append(str);
            stringBuffer2.append("\".");
            p(stringBuffer2.toString(), th2);
            return null;
        }
    }

    private static boolean k() {
        try {
            Class.forName(g(3));
            Class.forName(g(5));
            try {
                Class.forName("org.apache.log4j.FileAppender");
                return false;
            } catch (ClassNotFoundException unused) {
                Class cls = e.f86289b;
                return ((Boolean) e.class.getMethod("test", null).invoke(null, null)).booleanValue();
            }
        } catch (Throwable unused2) {
            return false;
        }
    }

    private static boolean n(int i11) {
        return (i11 == -1 || i11 == 0 || i11 == 5 || i11 == 4) ? false : true;
    }

    private static void p(String str, Throwable th2) throws Throwable {
        q(true, str, th2);
    }

    private static void q(boolean z11, String str, Throwable th2) throws Throwable {
        boolean z12;
        boolean z13;
        Class clsA = f86285g;
        if (clsA == null) {
            clsA = a("freemarker.log.Logger");
            f86285g = clsA;
        }
        synchronized (clsA) {
            try {
                c cVar = f86281c;
                z12 = false;
                z13 = (cVar == null || (cVar instanceof g)) ? false : true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z13) {
            try {
                b bVarI = i("freemarker.logger");
                if (z11) {
                    bVarI.e(str);
                } else {
                    bVarI.u(str);
                }
            } catch (Throwable unused) {
            }
        }
        z12 = z13;
        if (z12) {
            return;
        }
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(z11 ? "ERROR" : "WARN");
        stringBuffer.append(" ");
        Class clsA2 = f86286h;
        if (clsA2 == null) {
            clsA2 = a("freemarker.log.LoggerFactory");
            f86286h = clsA2;
        }
        stringBuffer.append(clsA2.getName());
        stringBuffer.append(": ");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
        if (th2 != null) {
            PrintStream printStream2 = System.err;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("\tException: ");
            stringBuffer2.append(t(th2));
            printStream2.println(stringBuffer2.toString());
            while (th2.getCause() != null) {
                th2 = th2.getCause();
                PrintStream printStream3 = System.err;
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("\tCaused by: ");
                stringBuffer3.append(t(th2));
                printStream3.println(stringBuffer3.toString());
            }
        }
    }

    private static void r(String str) throws Throwable {
        q(false, str, null);
    }

    private static synchronized void s(int i11) {
        f86281c = b(i11);
        f86280b = i11;
    }

    private static String t(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return obj.toString();
        } catch (Throwable unused) {
            return obj.getClass().getName();
        }
    }

    public abstract void e(String str);

    public abstract void f(String str, Throwable th2);

    public abstract void l(String str);

    public abstract void m(String str, Throwable th2);

    public abstract boolean o();

    public abstract void u(String str);

    public abstract void v(String str, Throwable th2);
}
