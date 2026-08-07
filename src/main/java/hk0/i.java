package hk0;

import freemarker.template.utility.UndeclaredThrowableException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
public class i implements lk0.h, lk0.g {
    static /* synthetic */ Class B;
    static /* synthetic */ Class C;
    static /* synthetic */ Class D;
    static /* synthetic */ Class E;
    static /* synthetic */ Class F;
    static /* synthetic */ Class G;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static volatile boolean f73020y;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f73022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p f73023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b0 f73024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final n f73025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final jk0.e f73026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final l f73027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l f73028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f73029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private lk0.p f73030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f73031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private lk0.g f73032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f73033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f73034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f73035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final lk0.q f73036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final jk0.f f73037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final kk0.b f73016u = kk0.b.i("freemarker.beans");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final Object f73017v = lk0.h.f90060d;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Class f73018w = Iterable.class;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Constructor f73019x = d();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final jk0.f f73021z = new g();
    private static final jk0.f A = new h();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private PropertyDescriptor f73038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f73039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f73040c;

        public PropertyDescriptor a() {
            return this.f73038a;
        }

        public String b() {
            return this.f73039b;
        }

        public boolean c() {
            return this.f73040c;
        }

        void d(Method method) {
            this.f73038a = null;
            this.f73039b = method.getName();
            this.f73040c = true;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Method f73041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Class f73042b;

        public Class a() {
            return this.f73042b;
        }

        public Method b() {
            return this.f73041a;
        }

        void c(Class cls) {
            this.f73042b = cls;
        }

        void d(Method method) {
            this.f73041a = method;
        }
    }

    public i() {
        this(lk0.a.H);
    }

    static /* synthetic */ Class b(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    private static n c(i iVar) {
        Constructor constructor = f73019x;
        if (constructor == null) {
            return null;
        }
        try {
            return (n) constructor.newInstance(iVar);
        } catch (Exception e11) {
            throw new UndeclaredThrowableException(e11);
        }
    }

    private static Constructor d() throws Throwable {
        try {
            Class clsB = C;
            if (clsB == null) {
                clsB = b("freemarker.ext.beans.BeansWrapper");
                C = clsB;
            }
            return f0.class.getDeclaredConstructor(clsB);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final i h() {
        return k.f73050a;
    }

    static boolean j(lk0.q qVar) {
        return qVar.c() >= lk0.r.f90079d;
    }

    protected static lk0.q l(lk0.q qVar) {
        lk0.r.a(qVar);
        if (qVar.c() >= lk0.r.f90076a) {
            return j(qVar) ? lk0.a.E : lk0.a.B;
        }
        throw new IllegalArgumentException("Version must be at least 2.3.0.");
    }

    private void m() {
        b0 b0Var = this.f73024g;
        if (b0Var != null) {
            this.f73023f.u(b0Var);
        }
        n nVar = this.f73025h;
        if (nVar != null) {
            this.f73023f.u(nVar);
        }
        jk0.e eVar = this.f73026i;
        if (eVar != null) {
            this.f73023f.w(eVar);
        }
    }

    protected void a() {
        if (this.f73029l) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Can't modify the ");
            stringBuffer.append(getClass().getName());
            stringBuffer.append(" object, as it was write protected.");
            throw new IllegalStateException(stringBuffer.toString());
        }
    }

    protected void e(boolean z11) {
        if (z11) {
            p();
        }
        m();
    }

    p g() {
        return this.f73023f;
    }

    Object i() {
        return this.f73022e;
    }

    public boolean k() {
        return this.f73029l;
    }

    public void n(boolean z11) {
        a();
        this.f73026i.b(z11);
    }

    protected String o() {
        String string;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("simpleMapWrapper=");
        stringBuffer.append(this.f73034q);
        stringBuffer.append(", ");
        stringBuffer.append("exposureLevel=");
        stringBuffer.append(this.f73023f.n());
        stringBuffer.append(", ");
        stringBuffer.append("exposeFields=");
        stringBuffer.append(this.f73023f.m());
        stringBuffer.append(", ");
        stringBuffer.append("sharedClassIntrospCache=");
        if (this.f73023f.s()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("@");
            stringBuffer2.append(System.identityHashCode(this.f73023f));
            string = stringBuffer2.toString();
        } else {
            string = "none";
        }
        stringBuffer.append(string);
        return stringBuffer.toString();
    }

    public void p() {
        this.f73029l = true;
    }

    public String toString() {
        String string;
        String strO = o();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(mk0.a.e(this));
        stringBuffer.append("@");
        stringBuffer.append(System.identityHashCode(this));
        stringBuffer.append("(");
        stringBuffer.append(this.f73036s);
        stringBuffer.append(", ");
        if (strO.length() != 0) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(strO);
            stringBuffer2.append(", ...");
            string = stringBuffer2.toString();
        } else {
            string = "";
        }
        stringBuffer.append(string);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    public i(lk0.q qVar) {
        this(new d(qVar), false);
    }

    protected i(j jVar, boolean z11) {
        this(jVar, z11, true);
    }

    protected i(j jVar, boolean z11, boolean z12) throws Throwable {
        boolean z13;
        this.f73030m = null;
        this.f73032o = this;
        this.f73033p = true;
        this.f73037t = new f(this);
        if (jVar.d() == null) {
            Class<?> superclass = getClass();
            boolean z14 = false;
            while (!z14) {
                try {
                    Class<?> clsB = B;
                    if (clsB == null) {
                        clsB = b("freemarker.template.DefaultObjectWrapper");
                        B = clsB;
                    }
                    if (superclass != clsB) {
                        Class<?> clsB2 = C;
                        if (clsB2 == null) {
                            clsB2 = b("freemarker.ext.beans.BeansWrapper");
                            C = clsB2;
                        }
                        if (superclass != clsB2) {
                            Class<?> clsB3 = D;
                            if (clsB3 == null) {
                                clsB3 = b("freemarker.template.SimpleObjectWrapper");
                                D = clsB3;
                            }
                            if (superclass == clsB3) {
                                break;
                            }
                            try {
                                Class clsB4 = E;
                                if (clsB4 == null) {
                                    clsB4 = b("java.lang.Class");
                                    E = clsB4;
                                }
                                Class clsB5 = F;
                                if (clsB5 == null) {
                                    clsB5 = b("java.lang.reflect.Method");
                                    F = clsB5;
                                }
                                Class clsB6 = G;
                                if (clsB6 == null) {
                                    clsB6 = b("freemarker.ext.beans.BeansWrapper$MethodAppearanceDecision");
                                    G = clsB6;
                                }
                                superclass.getDeclaredMethod("finetuneMethodAppearance", clsB4, clsB5, clsB6);
                                z14 = true;
                            } catch (NoSuchMethodException unused) {
                                superclass = superclass.getSuperclass();
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    kk0.b bVar = f73016u;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Failed to check if finetuneMethodAppearance is overidden in ");
                    stringBuffer.append(superclass.getName());
                    stringBuffer.append("; acting like if it was, but this way it won't utilize the shared class introspection ");
                    stringBuffer.append("cache.");
                    bVar.m(stringBuffer.toString(), th2);
                    z13 = true;
                    z14 = true;
                }
            }
            z13 = false;
            if (z14) {
                if (!z13 && !f73020y) {
                    kk0.b bVar2 = f73016u;
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Overriding ");
                    Class clsB7 = C;
                    if (clsB7 == null) {
                        clsB7 = b("freemarker.ext.beans.BeansWrapper");
                        C = clsB7;
                    }
                    stringBuffer2.append(clsB7.getName());
                    stringBuffer2.append(".finetuneMethodAppearance is deprecated ");
                    stringBuffer2.append("and will be banned sometimes in the future. Use setMethodAppearanceFineTuner instead.");
                    bVar2.u(stringBuffer2.toString());
                    f73020y = true;
                }
                jVar = (j) jVar.a(false);
                jVar.i(new e(this));
            }
        }
        this.f73036s = jVar.c();
        this.f73034q = jVar.g();
        this.f73031n = jVar.b();
        this.f73032o = jVar.e() != null ? jVar.e() : this;
        this.f73035r = jVar.h();
        if (!z11) {
            Object obj = new Object();
            this.f73022e = obj;
            this.f73023f = new p(jVar.f73044b, obj);
        } else {
            p pVarA = jVar.f73044b.a();
            this.f73023f = pVarA;
            this.f73022e = pVarA.q();
        }
        this.f73027j = new l(Boolean.FALSE, this);
        this.f73028k = new l(Boolean.TRUE, this);
        this.f73024g = new b0(this);
        this.f73025h = c(this);
        this.f73026i = new c(this);
        n(jVar.f());
        e(z11);
    }

    protected void f(Class cls, Method method, a aVar) {
    }
}
