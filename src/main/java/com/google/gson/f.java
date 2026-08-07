package com.google.gson;

import bx.a0;
import bx.f0;
import bx.h0;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes5.dex */
public final class f {
    static final com.google.gson.e A = com.google.gson.e.f44817d;
    static final String B = null;
    static final com.google.gson.d C = com.google.gson.c.IDENTITY;
    static final w D = v.DOUBLE;
    static final w E = v.LAZILY_PARSED_NUMBER;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final u f44822z = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadLocal<Map<com.google.gson.reflect.a<?>, x<?>>> f44823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<com.google.gson.reflect.a<?>, x<?>> f44824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bx.v f44825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.gson.internal.bind.e f44826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List<y> f44827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final bx.w f44828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final com.google.gson.d f44829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map<Type, h<?>> f44830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f44831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f44832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f44833k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f44834l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final com.google.gson.e f44835m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final u f44836n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f44837o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final boolean f44838p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final String f44839q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final int f44840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final int f44841s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final s f44842t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final List<y> f44843u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final List<y> f44844v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final w f44845w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final w f44846x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final List<t> f44847y;

    class a extends x<Number> {
        a() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double b(ex.a aVar) throws IOException {
            if (aVar.n0() != ex.b.NULL) {
                return Double.valueOf(aVar.nextDouble());
            }
            aVar.c0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.k0();
                return;
            }
            double dDoubleValue = number.doubleValue();
            f.d(dDoubleValue);
            cVar.G0(dDoubleValue);
        }
    }

    class b extends x<Number> {
        b() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float b(ex.a aVar) throws IOException {
            if (aVar.n0() != ex.b.NULL) {
                return Float.valueOf((float) aVar.nextDouble());
            }
            aVar.c0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.k0();
                return;
            }
            float fFloatValue = number.floatValue();
            f.d(fFloatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(fFloatValue);
            }
            cVar.K0(number);
        }
    }

    class c extends x<Number> {
        c() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ex.a aVar) throws IOException {
            if (aVar.n0() != ex.b.NULL) {
                return Long.valueOf(aVar.nextLong());
            }
            aVar.c0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.k0();
            } else {
                cVar.O0(number.toString());
            }
        }
    }

    class d extends x<AtomicLong> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f44850a;

        d(x xVar) {
            this.f44850a = xVar;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLong b(ex.a aVar) {
            return new AtomicLong(((Number) this.f44850a.b(aVar)).longValue());
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, AtomicLong atomicLong) {
            this.f44850a.d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    class e extends x<AtomicLongArray> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f44851a;

        e(x xVar) {
            this.f44851a = xVar;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray b(ex.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.f();
            while (aVar.hasNext()) {
                arrayList.add(Long.valueOf(((Number) this.f44851a.b(aVar)).longValue()));
            }
            aVar.e();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i11 = 0; i11 < size; i11++) {
                atomicLongArray.set(i11, ((Long) arrayList.get(i11)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.p();
            int length = atomicLongArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                this.f44851a.d(cVar, Long.valueOf(atomicLongArray.get(i11)));
            }
            cVar.C();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.f$f, reason: collision with other inner class name */
    static class C0701f<T> extends com.google.gson.internal.bind.m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private x<T> f44852a = null;

        C0701f() {
        }

        private x<T> f() {
            x<T> xVar = this.f44852a;
            if (xVar != null) {
                return xVar;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.x
        public T b(ex.a aVar) {
            return f().b(aVar);
        }

        @Override // com.google.gson.x
        public void d(ex.c cVar, T t11) {
            f().d(cVar, t11);
        }

        @Override // com.google.gson.internal.bind.m
        public x<T> e() {
            return f();
        }

        public void g(x<T> xVar) {
            if (this.f44852a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f44852a = xVar;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f() {
        bx.w wVar = bx.w.f18205g;
        com.google.gson.d dVar = C;
        Map map = Collections.EMPTY_MAP;
        com.google.gson.e eVar = A;
        u uVar = f44822z;
        s sVar = s.DEFAULT;
        String str = B;
        List list = Collections.EMPTY_LIST;
        this(wVar, dVar, map, false, false, false, true, eVar, uVar, false, true, sVar, str, 2, 2, list, list, list, D, E, list);
    }

    private static void a(Object obj, ex.a aVar) {
        if (obj != null) {
            try {
                if (aVar.n0() == ex.b.END_DOCUMENT) {
                } else {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e11) {
                throw new JsonSyntaxException(e11);
            } catch (IOException e12) {
                throw new JsonIOException(e12);
            }
        }
    }

    private static x<AtomicLong> b(x<Number> xVar) {
        return new d(xVar).a();
    }

    private static x<AtomicLongArray> c(x<Number> xVar) {
        return new e(xVar).a();
    }

    static void d(double d11) {
        if (Double.isNaN(d11) || Double.isInfinite(d11)) {
            throw new IllegalArgumentException(d11 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private x<Number> e(boolean z11) {
        return z11 ? com.google.gson.internal.bind.p.f44978v : new a();
    }

    private x<Number> f(boolean z11) {
        return z11 ? com.google.gson.internal.bind.p.f44977u : new b();
    }

    private static x<Number> o(s sVar) {
        return sVar == s.DEFAULT ? com.google.gson.internal.bind.p.f44976t : new c();
    }

    public <T> T g(ex.a aVar, com.google.gson.reflect.a<T> aVar2) {
        boolean z11;
        u uVarH = aVar.H();
        u uVar = this.f44836n;
        if (uVar != null) {
            aVar.w0(uVar);
        } else if (aVar.H() == u.LEGACY_STRICT) {
            aVar.w0(u.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        aVar.n0();
                        z11 = false;
                        try {
                            x<T> xVarL = l(aVar2);
                            T tB = xVarL.b(aVar);
                            Class clsB = f0.b(aVar2.getRawType());
                            if (tB != null && !clsB.isInstance(tB)) {
                                throw new ClassCastException("Type adapter '" + xVarL + "' returned wrong type; requested " + aVar2.getRawType() + " but got instance of " + tB.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            aVar.w0(uVarH);
                            return tB;
                        } catch (EOFException e11) {
                            e = e11;
                            if (!z11) {
                                throw new JsonSyntaxException(e);
                            }
                            aVar.w0(uVarH);
                            return null;
                        }
                    } catch (EOFException e12) {
                        e = e12;
                        z11 = true;
                    }
                } catch (IOException e13) {
                    throw new JsonSyntaxException(e13);
                }
            } catch (AssertionError e14) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e14.getMessage(), e14);
            } catch (IllegalStateException e15) {
                throw new JsonSyntaxException(e15);
            }
        } catch (Throwable th2) {
            aVar.w0(uVarH);
            throw th2;
        }
    }

    public <T> T h(Reader reader, com.google.gson.reflect.a<T> aVar) {
        ex.a aVarP = p(reader);
        T t11 = (T) g(aVarP, aVar);
        a(t11, aVarP);
        return t11;
    }

    public <T> T i(String str, com.google.gson.reflect.a<T> aVar) {
        if (str == null) {
            return null;
        }
        return (T) h(new StringReader(str), aVar);
    }

    public <T> T j(String str, Class<T> cls) {
        return (T) i(str, com.google.gson.reflect.a.get((Class) cls));
    }

    public <T> T k(String str, Type type) {
        return (T) i(str, com.google.gson.reflect.a.get(type));
    }

    public <T> x<T> l(com.google.gson.reflect.a<T> aVar) {
        boolean z11;
        Objects.requireNonNull(aVar, "type must not be null");
        x<T> xVar = (x) this.f44824b.get(aVar);
        if (xVar != null) {
            return xVar;
        }
        Map<? extends com.google.gson.reflect.a<?>, ? extends x<?>> map = this.f44823a.get();
        if (map == null) {
            map = new HashMap<>();
            this.f44823a.set((Map<com.google.gson.reflect.a<?>, x<?>>) map);
            z11 = true;
        } else {
            x<T> xVar2 = (x) map.get(aVar);
            if (xVar2 != null) {
                return xVar2;
            }
            z11 = false;
        }
        try {
            C0701f c0701f = new C0701f();
            map.put(aVar, c0701f);
            Iterator<y> it = this.f44827e.iterator();
            x<T> xVarA = null;
            while (it.hasNext()) {
                xVarA = it.next().a(this, aVar);
                if (xVarA != null) {
                    c0701f.g(xVarA);
                    map.put(aVar, xVarA);
                    break;
                }
            }
            if (z11) {
                this.f44823a.remove();
            }
            if (xVarA != null) {
                if (z11) {
                    this.f44824b.putAll(map);
                }
                return xVarA;
            }
            throw new IllegalArgumentException("GSON (2.13.2) cannot handle " + aVar);
        } catch (Throwable th2) {
            if (z11) {
                this.f44823a.remove();
            }
            throw th2;
        }
    }

    public <T> x<T> m(Class<T> cls) {
        return l(com.google.gson.reflect.a.get((Class) cls));
    }

    public <T> x<T> n(y yVar, com.google.gson.reflect.a<T> aVar) {
        Objects.requireNonNull(yVar, "skipPast must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        if (this.f44826d.e(aVar, yVar)) {
            yVar = this.f44826d;
        }
        boolean z11 = false;
        for (y yVar2 : this.f44827e) {
            if (z11) {
                x<T> xVarA = yVar2.a(this, aVar);
                if (xVarA != null) {
                    return xVarA;
                }
            } else if (yVar2 == yVar) {
                z11 = true;
            }
        }
        if (!z11) {
            return l(aVar);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar);
    }

    public ex.a p(Reader reader) {
        ex.a aVar = new ex.a(reader);
        u uVar = this.f44836n;
        if (uVar == null) {
            uVar = u.LEGACY_STRICT;
        }
        aVar.w0(uVar);
        return aVar;
    }

    public ex.c q(Writer writer) throws IOException {
        if (this.f44833k) {
            writer.write(")]}'\n");
        }
        ex.c cVar = new ex.c(writer);
        cVar.u0(this.f44835m);
        cVar.w0(this.f44834l);
        u uVar = this.f44836n;
        if (uVar == null) {
            uVar = u.LEGACY_STRICT;
        }
        cVar.z0(uVar);
        cVar.y0(this.f44831i);
        return cVar;
    }

    public String r(l lVar) {
        StringBuilder sb2 = new StringBuilder();
        v(lVar, sb2);
        return sb2.toString();
    }

    public String s(Object obj) {
        return obj == null ? r(m.f45010a) : t(obj, obj.getClass());
    }

    public String t(Object obj, Type type) {
        StringBuilder sb2 = new StringBuilder();
        x(obj, type, sb2);
        return sb2.toString();
    }

    public String toString() {
        return "{serializeNulls:" + this.f44831i + ",factories:" + this.f44827e + ",instanceCreators:" + this.f44825c + "}";
    }

    public void u(l lVar, ex.c cVar) {
        u uVarJ = cVar.J();
        boolean zT = cVar.T();
        boolean zI = cVar.I();
        cVar.w0(this.f44834l);
        cVar.y0(this.f44831i);
        u uVar = this.f44836n;
        if (uVar != null) {
            cVar.z0(uVar);
        } else if (cVar.J() == u.LEGACY_STRICT) {
            cVar.z0(u.LENIENT);
        }
        try {
            try {
                h0.b(lVar, cVar);
                cVar.z0(uVarJ);
                cVar.w0(zT);
                cVar.y0(zI);
            } catch (IOException e11) {
                throw new JsonIOException(e11);
            } catch (AssertionError e12) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e12.getMessage(), e12);
            }
        } catch (Throwable th2) {
            cVar.z0(uVarJ);
            cVar.w0(zT);
            cVar.y0(zI);
            throw th2;
        }
    }

    public void v(l lVar, Appendable appendable) {
        try {
            u(lVar, q(h0.c(appendable)));
        } catch (IOException e11) {
            throw new JsonIOException(e11);
        }
    }

    public void w(Object obj, Type type, ex.c cVar) {
        x xVarL = l(com.google.gson.reflect.a.get(type));
        u uVarJ = cVar.J();
        u uVar = this.f44836n;
        if (uVar != null) {
            cVar.z0(uVar);
        } else if (cVar.J() == u.LEGACY_STRICT) {
            cVar.z0(u.LENIENT);
        }
        boolean zT = cVar.T();
        boolean zI = cVar.I();
        cVar.w0(this.f44834l);
        cVar.y0(this.f44831i);
        try {
            try {
                try {
                    xVarL.d(cVar, obj);
                    cVar.z0(uVarJ);
                    cVar.w0(zT);
                    cVar.y0(zI);
                } catch (AssertionError e11) {
                    throw new AssertionError("AssertionError (GSON 2.13.2): " + e11.getMessage(), e11);
                }
            } catch (IOException e12) {
                throw new JsonIOException(e12);
            }
        } catch (Throwable th2) {
            cVar.z0(uVarJ);
            cVar.w0(zT);
            cVar.y0(zI);
            throw th2;
        }
    }

    public void x(Object obj, Type type, Appendable appendable) {
        try {
            w(obj, type, q(h0.c(appendable)));
        } catch (IOException e11) {
            throw new JsonIOException(e11);
        }
    }

    public l y(Object obj) {
        return obj == null ? m.f45010a : z(obj, obj.getClass());
    }

    public l z(Object obj, Type type) {
        com.google.gson.internal.bind.h hVar = new com.google.gson.internal.bind.h();
        w(obj, type, hVar);
        return hVar.U0();
    }

    f(bx.w wVar, com.google.gson.d dVar, Map<Type, h<?>> map, boolean z11, boolean z12, boolean z13, boolean z14, com.google.gson.e eVar, u uVar, boolean z15, boolean z16, s sVar, String str, int i11, int i12, List<y> list, List<y> list2, List<y> list3, w wVar2, w wVar3, List<t> list4) {
        this.f44823a = new ThreadLocal<>();
        this.f44824b = new ConcurrentHashMap();
        this.f44828f = wVar;
        this.f44829g = dVar;
        this.f44830h = map;
        bx.v vVar = new bx.v(map, z16, list4);
        this.f44825c = vVar;
        this.f44831i = z11;
        this.f44832j = z12;
        this.f44833k = z13;
        this.f44834l = z14;
        this.f44835m = eVar;
        this.f44836n = uVar;
        this.f44837o = z15;
        this.f44838p = z16;
        this.f44842t = sVar;
        this.f44839q = str;
        this.f44840r = i11;
        this.f44841s = i12;
        this.f44843u = list;
        this.f44844v = list2;
        this.f44845w = wVar2;
        this.f44846x = wVar3;
        this.f44847y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.internal.bind.p.W);
        arrayList.add(com.google.gson.internal.bind.k.e(wVar2));
        arrayList.add(wVar);
        arrayList.addAll(list3);
        arrayList.add(com.google.gson.internal.bind.p.C);
        arrayList.add(com.google.gson.internal.bind.p.f44969m);
        arrayList.add(com.google.gson.internal.bind.p.f44963g);
        arrayList.add(com.google.gson.internal.bind.p.f44965i);
        arrayList.add(com.google.gson.internal.bind.p.f44967k);
        x<Number> xVarO = o(sVar);
        arrayList.add(com.google.gson.internal.bind.p.c(Long.TYPE, Long.class, xVarO));
        arrayList.add(com.google.gson.internal.bind.p.c(Double.TYPE, Double.class, e(z15)));
        arrayList.add(com.google.gson.internal.bind.p.c(Float.TYPE, Float.class, f(z15)));
        arrayList.add(com.google.gson.internal.bind.j.e(wVar3));
        arrayList.add(com.google.gson.internal.bind.p.f44971o);
        arrayList.add(com.google.gson.internal.bind.p.f44973q);
        arrayList.add(com.google.gson.internal.bind.p.b(AtomicLong.class, b(xVarO)));
        arrayList.add(com.google.gson.internal.bind.p.b(AtomicLongArray.class, c(xVarO)));
        arrayList.add(com.google.gson.internal.bind.p.f44975s);
        arrayList.add(com.google.gson.internal.bind.p.f44980x);
        arrayList.add(com.google.gson.internal.bind.p.E);
        arrayList.add(com.google.gson.internal.bind.p.G);
        arrayList.add(com.google.gson.internal.bind.p.b(BigDecimal.class, com.google.gson.internal.bind.p.f44982z));
        arrayList.add(com.google.gson.internal.bind.p.b(BigInteger.class, com.google.gson.internal.bind.p.A));
        arrayList.add(com.google.gson.internal.bind.p.b(a0.class, com.google.gson.internal.bind.p.B));
        arrayList.add(com.google.gson.internal.bind.p.I);
        arrayList.add(com.google.gson.internal.bind.p.K);
        arrayList.add(com.google.gson.internal.bind.p.O);
        arrayList.add(com.google.gson.internal.bind.p.Q);
        arrayList.add(com.google.gson.internal.bind.p.U);
        arrayList.add(com.google.gson.internal.bind.p.M);
        arrayList.add(com.google.gson.internal.bind.p.f44960d);
        arrayList.add(com.google.gson.internal.bind.c.f44880c);
        arrayList.add(com.google.gson.internal.bind.p.S);
        if (com.google.gson.internal.sql.d.f45004a) {
            arrayList.add(com.google.gson.internal.sql.d.f45008e);
            arrayList.add(com.google.gson.internal.sql.d.f45007d);
            arrayList.add(com.google.gson.internal.sql.d.f45009f);
        }
        arrayList.add(com.google.gson.internal.bind.a.f44874c);
        arrayList.add(com.google.gson.internal.bind.p.f44958b);
        arrayList.add(new com.google.gson.internal.bind.b(vVar));
        arrayList.add(new com.google.gson.internal.bind.i(vVar, z12));
        com.google.gson.internal.bind.e eVar2 = new com.google.gson.internal.bind.e(vVar);
        this.f44826d = eVar2;
        arrayList.add(eVar2);
        arrayList.add(com.google.gson.internal.bind.p.X);
        arrayList.add(new com.google.gson.internal.bind.l(vVar, dVar, wVar, eVar2, list4));
        this.f44827e = Collections.unmodifiableList(arrayList);
    }
}
