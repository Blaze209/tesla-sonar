package vz;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.Address;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final vz.e<sz.f> f120117c = new j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final vz.e<sz.f> f120118d = new k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final vz.e<sz.c> f120119e = new l();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final vz.e<sz.b> f120120f = new m();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final vz.e<Iterable<? extends Object>> f120121g = new n();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final vz.e<Enum<?>> f120122h = new o();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final vz.e<Map<String, ? extends Object>> f120123i = new p();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final vz.e<Object> f120124j = new vz.c();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final vz.e<Object> f120125k = new vz.b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final vz.e<Object> f120126l = new vz.a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final vz.e<Object> f120127m = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<Class<?>, vz.e<?>> f120128a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinkedList<s> f120129b = new LinkedList<>();

    class a implements vz.e<Double> {
        a() {
        }

        @Override // vz.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Double d11, Appendable appendable, sz.g gVar) throws IOException {
            if (d11.isInfinite()) {
                appendable.append(Address.ADDRESS_NULL_PLACEHOLDER);
            } else {
                appendable.append(d11.toString());
            }
        }
    }

    class b implements vz.e<Date> {
        b() {
        }

        @Override // vz.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, Appendable appendable, sz.g gVar) throws IOException {
            appendable.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            sz.i.a(date.toString(), appendable, gVar);
            appendable.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        }
    }

    class c implements vz.e<Float> {
        c() {
        }

        @Override // vz.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Float f11, Appendable appendable, sz.g gVar) throws IOException {
            if (f11.isInfinite()) {
                appendable.append(Address.ADDRESS_NULL_PLACEHOLDER);
            } else {
                appendable.append(f11.toString());
            }
        }
    }

    /* JADX INFO: renamed from: vz.d$d, reason: collision with other inner class name */
    class C2569d implements vz.e<int[]> {
        C2569d() {
        }

        @Override // vz.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(int[] iArr, Appendable appendable, sz.g gVar) throws IOException {
            gVar.c(appendable);
            boolean z11 = false;
            for (int i11 : iArr) {
                if (z11) {
                    gVar.m(appendable);
                } else {
                    z11 = true;
                }
                appendable.append(Integer.toString(i11));
            }
            gVar.d(appendable);
        }
    }

    class e implements vz.e<short[]> {
        e() {
        }

        @Override // vz.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(short[] sArr, Appendable appendable, sz.g gVar) throws IOException {
            gVar.c(appendable);
            boolean z11 = false;
            for (short s11 : sArr) {
                if (z11) {
                    gVar.m(appendable);
                } else {
                    z11 = true;
                }
                appendable.append(Short.toString(s11));
            }
            gVar.d(appendable);
        }
    }

    class f implements vz.e<long[]> {
        f() {
        }

        @Override // vz.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(long[] jArr, Appendable appendable, sz.g gVar) throws IOException {
            gVar.c(appendable);
            boolean z11 = false;
            for (long j11 : jArr) {
                if (z11) {
                    gVar.m(appendable);
                } else {
                    z11 = true;
                }
                appendable.append(Long.toString(j11));
            }
            gVar.d(appendable);
        }
    }

    class g implements vz.e<float[]> {
        g() {
        }

        @Override // vz.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(float[] fArr, Appendable appendable, sz.g gVar) throws IOException {
            gVar.c(appendable);
            boolean z11 = false;
            for (float f11 : fArr) {
                if (z11) {
                    gVar.m(appendable);
                } else {
                    z11 = true;
                }
                appendable.append(Float.toString(f11));
            }
            gVar.d(appendable);
        }
    }

    class h implements vz.e<double[]> {
        h() {
        }

        @Override // vz.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(double[] dArr, Appendable appendable, sz.g gVar) throws IOException {
            gVar.c(appendable);
            boolean z11 = false;
            for (double d11 : dArr) {
                if (z11) {
                    gVar.m(appendable);
                } else {
                    z11 = true;
                }
                appendable.append(Double.toString(d11));
            }
            gVar.d(appendable);
        }
    }

    class i implements vz.e<boolean[]> {
        i() {
        }

        @Override // vz.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(boolean[] zArr, Appendable appendable, sz.g gVar) throws IOException {
            gVar.c(appendable);
            boolean z11 = false;
            for (boolean z12 : zArr) {
                if (z11) {
                    gVar.m(appendable);
                } else {
                    z11 = true;
                }
                appendable.append(Boolean.toString(z12));
            }
            gVar.d(appendable);
        }
    }

    class j implements vz.e<sz.f> {
        j() {
        }

        @Override // vz.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public <E extends sz.f> void a(E e11, Appendable appendable, sz.g gVar) {
            e11.b(appendable);
        }
    }

    class k implements vz.e<sz.f> {
        k() {
        }

        @Override // vz.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public <E extends sz.f> void a(E e11, Appendable appendable, sz.g gVar) {
            e11.h(appendable, gVar);
        }
    }

    class l implements vz.e<sz.c> {
        l() {
        }

        @Override // vz.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public <E extends sz.c> void a(E e11, Appendable appendable, sz.g gVar) throws IOException {
            appendable.append(e11.d(gVar));
        }
    }

    class m implements vz.e<sz.b> {
        m() {
        }

        @Override // vz.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public <E extends sz.b> void a(E e11, Appendable appendable, sz.g gVar) throws IOException {
            appendable.append(e11.e());
        }
    }

    class n implements vz.e<Iterable<? extends Object>> {
        n() {
        }

        @Override // vz.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public <E extends Iterable<? extends Object>> void a(E e11, Appendable appendable, sz.g gVar) throws IOException {
            gVar.c(appendable);
            boolean z11 = true;
            for (Object obj : e11) {
                if (z11) {
                    gVar.e(appendable);
                    z11 = false;
                } else {
                    gVar.a(appendable);
                }
                if (obj == null) {
                    appendable.append(Address.ADDRESS_NULL_PLACEHOLDER);
                } else {
                    sz.i.b(obj, appendable, gVar);
                }
                gVar.b(appendable);
            }
            gVar.d(appendable);
        }
    }

    class o implements vz.e<Enum<?>> {
        o() {
        }

        @Override // vz.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public <E extends Enum<?>> void a(E e11, Appendable appendable, sz.g gVar) throws IOException {
            gVar.p(appendable, e11.name());
        }
    }

    class p implements vz.e<Map<String, ? extends Object>> {
        p() {
        }

        @Override // vz.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public <E extends Map<String, ? extends Object>> void a(E e11, Appendable appendable, sz.g gVar) throws IOException {
            gVar.n(appendable);
            boolean z11 = true;
            for (Map.Entry entry : e11.entrySet()) {
                Object value = entry.getValue();
                if (value != null || !gVar.g()) {
                    if (z11) {
                        gVar.l(appendable);
                        z11 = false;
                    } else {
                        gVar.m(appendable);
                    }
                    d.g(entry.getKey().toString(), value, appendable, gVar);
                }
            }
            gVar.o(appendable);
        }
    }

    class q implements vz.e<Object> {
        q() {
        }

        @Override // vz.e
        public void a(Object obj, Appendable appendable, sz.g gVar) throws IOException {
            appendable.append(obj.toString());
        }
    }

    class r implements vz.e<String> {
        r() {
        }

        @Override // vz.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(String str, Appendable appendable, sz.g gVar) throws IOException {
            gVar.p(appendable, str);
        }
    }

    static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Class<?> f120140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public vz.e<?> f120141b;

        public s(Class<?> cls, vz.e<?> eVar) {
            this.f120140a = cls;
            this.f120141b = eVar;
        }
    }

    public d() {
        c();
    }

    public static void g(String str, Object obj, Appendable appendable, sz.g gVar) throws IOException {
        if (str == null) {
            appendable.append(Address.ADDRESS_NULL_PLACEHOLDER);
        } else if (gVar.h(str)) {
            appendable.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            sz.i.a(str, appendable, gVar);
            appendable.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        } else {
            appendable.append(str);
        }
        gVar.k(appendable);
        if (obj instanceof String) {
            gVar.p(appendable, (String) obj);
        } else {
            sz.i.b(obj, appendable, gVar);
        }
        gVar.j(appendable);
    }

    public vz.e a(Class cls) {
        return this.f120128a.get(cls);
    }

    public vz.e b(Class<?> cls) {
        for (s sVar : this.f120129b) {
            if (sVar.f120140a.isAssignableFrom(cls)) {
                return sVar.f120141b;
            }
        }
        return null;
    }

    public void c() {
        d(new r(), String.class);
        d(new a(), Double.class);
        d(new b(), Date.class);
        d(new c(), Float.class);
        vz.e<?> eVar = f120127m;
        d(eVar, Integer.class, Long.class, Byte.class, Short.class, BigInteger.class, BigDecimal.class);
        d(eVar, Boolean.class);
        d(new C2569d(), int[].class);
        d(new e(), short[].class);
        d(new f(), long[].class);
        d(new g(), float[].class);
        d(new h(), double[].class);
        d(new i(), boolean[].class);
        e(sz.f.class, f120118d);
        e(sz.e.class, f120117c);
        e(sz.c.class, f120119e);
        e(sz.b.class, f120120f);
        e(Map.class, f120123i);
        e(Iterable.class, f120121g);
        e(Enum.class, f120122h);
        e(Number.class, eVar);
    }

    public <T> void d(vz.e<T> eVar, Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            this.f120128a.put(cls, eVar);
        }
    }

    public void e(Class<?> cls, vz.e<?> eVar) {
        f(cls, eVar);
    }

    public void f(Class<?> cls, vz.e<?> eVar) {
        this.f120129b.addLast(new s(cls, eVar));
    }
}
