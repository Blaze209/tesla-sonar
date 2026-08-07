package freemarker.core;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class ParseException extends IOException {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Boolean f66459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static /* synthetic */ Class f66460i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f66461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f66462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f66463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f66464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f66465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f66466f = mk0.d.a("line.separator", "\n");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f66467g;

    protected ParseException() {
    }

    static /* synthetic */ Class a(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    private String b() {
        synchronized (this) {
            try {
                String str = this.f66463c;
                if (str != null) {
                    return str;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean c() {
        if (f66459h == null) {
            try {
                Class clsA = f66460i;
                if (clsA == null) {
                    clsA = a("freemarker.core.ParseException");
                    f66460i = clsA;
                }
                f66459h = Boolean.valueOf(clsA.getClassLoader().toString().indexOf("[org.jboss.ide.eclipse.freemarker:") != -1);
            } catch (Throwable unused) {
                f66459h = Boolean.FALSE;
            }
        }
        return f66459h.booleanValue();
    }

    private void d() {
        String string;
        String strB = b();
        if (c()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[col. ");
            stringBuffer.append(this.f66464d);
            stringBuffer.append("] ");
            string = stringBuffer.toString();
        } else {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Syntax error ");
            stringBuffer2.append(f.g(this.f66467g, this.f66465e, this.f66464d));
            stringBuffer2.append(":\n");
            string = stringBuffer2.toString();
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(string);
        stringBuffer3.append(strB);
        String string2 = stringBuffer3.toString();
        String strSubstring = string2.substring(string.length());
        synchronized (this) {
            this.f66462b = string2;
            this.f66463c = strSubstring;
            this.f66461a = true;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        synchronized (this) {
            try {
                if (this.f66461a) {
                    return this.f66462b;
                }
                d();
                synchronized (this) {
                    str = this.f66462b;
                }
                return str;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
