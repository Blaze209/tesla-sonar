package lk0;

/* JADX INFO: loaded from: classes8.dex */
public class d extends hk0.i {
    static final d J = new d();
    private static final Class K;
    private static final g L;
    private boolean H;
    private boolean I;

    static {
        g gVar;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("org.python.core.PyObject");
            ik0.b bVar = ik0.b.f78222h;
            gVar = (g) ik0.b.class.getField("INSTANCE").get(null);
            cls = cls2;
        } catch (Throwable th2) {
            if (!(th2 instanceof ClassNotFoundException)) {
                try {
                    kk0.b.i("freemarker.template.DefaultObjectWrapper").f("Failed to init Jython support, so it was disabled.", th2);
                } catch (Throwable unused) {
                }
            }
            gVar = null;
        }
        K = cls;
        L = gVar;
    }

    public d() {
        this(a.H);
    }

    protected static q l(q qVar) {
        r.a(qVar);
        q qVarL = hk0.i.l(qVar);
        int iC = qVar.c();
        int i11 = r.f90080e;
        return (iC < i11 || qVarL.c() >= i11) ? qVarL : a.F;
    }

    @Override // hk0.i
    protected String o() {
        int iIndexOf;
        String strO = super.o();
        if (strO.startsWith("simpleMapWrapper") && (iIndexOf = strO.indexOf(44)) != -1) {
            strO = strO.substring(iIndexOf + 1).trim();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("useAdaptersForContainers=");
        stringBuffer.append(this.H);
        stringBuffer.append(", forceLegacyNonListCollections=");
        stringBuffer.append(this.I);
        stringBuffer.append(", ");
        stringBuffer.append(strO);
        return stringBuffer.toString();
    }

    public d(q qVar) {
        this((f) new b(qVar), false);
    }

    protected d(hk0.j jVar, boolean z11) {
        super(jVar, z11, false);
        f cVar = jVar instanceof f ? (f) jVar : new c(this, jVar.c());
        this.H = cVar.k();
        this.I = cVar.j();
        e(z11);
    }

    protected d(f fVar, boolean z11) {
        this((hk0.j) fVar, z11);
    }
}
