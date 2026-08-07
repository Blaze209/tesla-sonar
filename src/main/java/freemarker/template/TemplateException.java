package freemarker.template;

import freemarker.core.d;
import freemarker.core.k;
import freemarker.core.o;
import freemarker.core.q;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes8.dex */
public class TemplateException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient freemarker.core.c f66512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient d f66513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient k[] f66514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f66515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f66516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f66517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient String f66518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient String f66519h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f66520i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient Object f66521j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private transient ThreadLocal f66522k;

    private static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final PrintStream f66523a;

        a(PrintStream printStream) {
            this.f66523a = printStream;
        }

        @Override // freemarker.template.TemplateException.c
        public void a(Throwable th2) {
            if (th2 instanceof TemplateException) {
                ((TemplateException) th2).i(this.f66523a);
            } else {
                th2.printStackTrace(this.f66523a);
            }
        }

        @Override // freemarker.template.TemplateException.c
        public void b(Object obj) {
            this.f66523a.print(obj);
        }

        @Override // freemarker.template.TemplateException.c
        public void c(Object obj) {
            this.f66523a.println(obj);
        }

        @Override // freemarker.template.TemplateException.c
        public void d() {
            this.f66523a.println();
        }
    }

    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final PrintWriter f66524a;

        b(PrintWriter printWriter) {
            this.f66524a = printWriter;
        }

        @Override // freemarker.template.TemplateException.c
        public void a(Throwable th2) {
            if (th2 instanceof TemplateException) {
                ((TemplateException) th2).j(this.f66524a);
            } else {
                th2.printStackTrace(this.f66524a);
            }
        }

        @Override // freemarker.template.TemplateException.c
        public void b(Object obj) {
            this.f66524a.print(obj);
        }

        @Override // freemarker.template.TemplateException.c
        public void c(Object obj) {
            this.f66524a.println(obj);
        }

        @Override // freemarker.template.TemplateException.c
        public void d() {
            this.f66524a.println();
        }
    }

    private interface c {
        void a(Throwable th2);

        void b(Object obj);

        void c(Object obj);

        void d();
    }

    public TemplateException(String str, freemarker.core.c cVar) {
        this(str, null, cVar);
    }

    private void a() {
        if (this.f66515d == null || this.f66516e == null) {
            return;
        }
        if (this.f66520i || this.f66513b != null) {
            this.f66514c = null;
        }
    }

    private String b() {
        String str;
        synchronized (this.f66521j) {
            str = this.f66517f;
        }
        return str;
    }

    private String d() {
        String string;
        synchronized (this.f66521j) {
            try {
                k[] kVarArr = this.f66514c;
                if (kVarArr == null && this.f66516e == null) {
                    return null;
                }
                if (this.f66516e == null) {
                    if (kVarArr.length == 0) {
                        string = "";
                    } else {
                        StringWriter stringWriter = new StringWriter();
                        o.b(this.f66514c, true, stringWriter);
                        string = stringWriter.toString();
                    }
                    if (this.f66516e == null) {
                        this.f66516e = string;
                        a();
                    }
                }
                return this.f66516e.length() != 0 ? this.f66516e : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void f(c cVar, boolean z11, boolean z12, boolean z13) {
        synchronized (cVar) {
            if (z11) {
                try {
                    cVar.c("FreeMarker template error:");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z12) {
                String strC = c();
                if (strC != null) {
                    cVar.c(e());
                    cVar.d();
                    cVar.c("----");
                    cVar.c("FTL stack trace (\"~\" means nesting-related):");
                    cVar.b(strC);
                    cVar.c("----");
                } else {
                    z12 = false;
                    z13 = true;
                }
            }
            if (z13) {
                if (z12) {
                    cVar.d();
                    cVar.c("Java stack trace (for programmers):");
                    cVar.c("----");
                    synchronized (this.f66521j) {
                        try {
                            if (this.f66522k == null) {
                                this.f66522k = new ThreadLocal();
                            }
                            this.f66522k.set(Boolean.TRUE);
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    try {
                        cVar.a(this);
                        this.f66522k.set(Boolean.FALSE);
                    } catch (Throwable th4) {
                        this.f66522k.set(Boolean.FALSE);
                        throw th4;
                    }
                } else {
                    cVar.a(this);
                }
                if (getCause() != null && getCause().getCause() == null) {
                    try {
                        Throwable th5 = (Throwable) getCause().getClass().getMethod("getRootCause", mk0.b.f92282b).invoke(getCause(), mk0.b.f92281a);
                        if (th5 != null) {
                            cVar.c("ServletException root cause: ");
                            cVar.a(th5);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    private void k() {
        String strB = b();
        if (strB != null && strB.length() != 0) {
            this.f66518g = strB;
        } else if (getCause() != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No error description was specified for this error; low-level message: ");
            stringBuffer.append(getCause().getClass().getName());
            stringBuffer.append(": ");
            stringBuffer.append(getCause().getMessage());
            this.f66518g = stringBuffer.toString();
        } else {
            this.f66518g = "[No error description was available.]";
        }
        String strD = d();
        if (strD == null) {
            this.f66519h = this.f66518g;
            return;
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(this.f66518g);
        stringBuffer2.append("\n\n");
        stringBuffer2.append("----");
        stringBuffer2.append("\n");
        stringBuffer2.append("FTL stack trace (\"~\" means nesting-related):");
        stringBuffer2.append("\n");
        stringBuffer2.append(strD);
        stringBuffer2.append("----");
        String string = stringBuffer2.toString();
        this.f66519h = string;
        this.f66518g = string.substring(0, this.f66518g.length());
    }

    public String c() {
        synchronized (this.f66521j) {
            try {
                if (this.f66514c == null && this.f66515d == null) {
                    return null;
                }
                if (this.f66515d == null) {
                    StringWriter stringWriter = new StringWriter();
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    o.b(this.f66514c, false, printWriter);
                    printWriter.close();
                    if (this.f66515d == null) {
                        this.f66515d = stringWriter.toString();
                        a();
                    }
                }
                return this.f66515d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String e() {
        String str;
        synchronized (this.f66521j) {
            try {
                if (this.f66518g == null) {
                    k();
                }
                str = this.f66518g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public void g(PrintStream printStream, boolean z11, boolean z12, boolean z13) {
        synchronized (printStream) {
            f(new a(printStream), z11, z12, z13);
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        ThreadLocal threadLocal = this.f66522k;
        if (threadLocal != null && threadLocal.get() == Boolean.TRUE) {
            return "[... Exception message was already printed; see it above ...]";
        }
        synchronized (this.f66521j) {
            try {
                if (this.f66519h == null) {
                    k();
                }
                str = this.f66519h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public void h(PrintWriter printWriter, boolean z11, boolean z12, boolean z13) {
        synchronized (printWriter) {
            f(new b(printWriter), z11, z12, z13);
        }
    }

    public void i(PrintStream printStream) {
        super.printStackTrace(printStream);
    }

    public void j(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        g(printStream, true, true, true);
    }

    public TemplateException(String str, Exception exc, freemarker.core.c cVar) {
        this(str, exc, cVar, null, null);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter, true, true, true);
    }

    private TemplateException(String str, Throwable th2, freemarker.core.c cVar, d dVar, q qVar) {
        super(th2);
        this.f66521j = new Object();
        cVar = cVar == null ? freemarker.core.c.c() : cVar;
        this.f66512a = cVar;
        this.f66513b = dVar;
        this.f66517f = str;
        if (cVar != null) {
            this.f66514c = o.a(cVar);
        }
    }
}
