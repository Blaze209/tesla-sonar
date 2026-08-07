package freemarker.core;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1352a f66469d = new C1352a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f66470e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static /* synthetic */ Class f66471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static /* synthetic */ Class f66472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static /* synthetic */ Class f66473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static /* synthetic */ Class f66474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static /* synthetic */ Class f66475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static /* synthetic */ Class f66476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static /* synthetic */ Class f66477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static /* synthetic */ Class f66478m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f66479a = 12;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f66480b = 12;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f66481c = 4;

    /* JADX INFO: renamed from: freemarker.core.a$a, reason: collision with other inner class name */
    public static class C1352a extends a {
    }

    public static class b extends a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final Map f66482n = b();

        private static Map b() throws Throwable {
            HashMap map = new HashMap(17);
            Integer num = new Integer(0);
            Class clsA = a.f66471f;
            if (clsA == null) {
                clsA = a.a("java.lang.Byte");
                a.f66471f = clsA;
            }
            map.put(clsA, num);
            Class clsA2 = a.f66472g;
            if (clsA2 == null) {
                clsA2 = a.a("java.lang.Short");
                a.f66472g = clsA2;
            }
            map.put(clsA2, num);
            Class clsA3 = a.f66473h;
            if (clsA3 == null) {
                clsA3 = a.a("java.lang.Integer");
                a.f66473h = clsA3;
            }
            map.put(clsA3, num);
            Class clsA4 = a.f66474i;
            if (clsA4 == null) {
                clsA4 = a.a("java.lang.Long");
                a.f66474i = clsA4;
            }
            map.put(clsA4, new Integer(1));
            Class clsA5 = a.f66475j;
            if (clsA5 == null) {
                clsA5 = a.a("java.lang.Float");
                a.f66475j = clsA5;
            }
            map.put(clsA5, new Integer(2));
            Class clsA6 = a.f66476k;
            if (clsA6 == null) {
                clsA6 = a.a("java.lang.Double");
                a.f66476k = clsA6;
            }
            map.put(clsA6, new Integer(3));
            Class clsA7 = a.f66477l;
            if (clsA7 == null) {
                clsA7 = a.a("java.math.BigInteger");
                a.f66477l = clsA7;
            }
            map.put(clsA7, new Integer(4));
            Class clsA8 = a.f66478m;
            if (clsA8 == null) {
                clsA8 = a.a("java.math.BigDecimal");
                a.f66478m = clsA8;
            }
            map.put(clsA8, new Integer(5));
            return map;
        }
    }

    static /* synthetic */ Class a(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }
}
