package net.time4j;

import com.google.android.gms.nearby.messages.Strategy;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import net.time4j.engine.ChronoException;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes9.dex */
@net.time4j.format.c("iso8601")
public final class i0 extends net.time4j.engine.i0<x, i0> implements net.time4j.base.a, net.time4j.base.g, net.time4j.engine.c0<x>, net.time4j.format.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i0 f94616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final i0 f94617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<Object, net.time4j.engine.p<?>> f94618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final net.time4j.engine.f0<x, i0> f94619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final net.time4j.engine.h0<x, o<x>> f94620g;
    private static final long serialVersionUID = 7458380065762437714L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient g0 f94621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient h0 f94622b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94623a;

        static {
            int[] iArr = new int[h.values().length];
            f94623a = iArr;
            try {
                iArr[h.HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94623a[h.MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94623a[h.SECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94623a[h.MILLIS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94623a[h.MICROS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f94623a[h.NANOS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static class c extends d<BigDecimal> {
        c(net.time4j.engine.p<BigDecimal> pVar) {
            super(pVar, null);
        }

        @Override // net.time4j.i0.d, net.time4j.engine.y
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public boolean isValid(i0 i0Var, BigDecimal bigDecimal) {
            if (bigDecimal == null) {
                return false;
            }
            return ((BigDecimal) ((d) this).f94626a.t()).compareTo(bigDecimal) <= 0 && bigDecimal.compareTo((BigDecimal) ((d) this).f94626a.s()) <= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.i0.d, net.time4j.engine.y
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public i0 withValue(i0 i0Var, BigDecimal bigDecimal, boolean z11) {
            if (i(i0Var, bigDecimal)) {
                return i0.Y(i0Var.f94621a, (h0) i0Var.f94622b.B(((d) this).f94626a, bigDecimal));
            }
            throw new IllegalArgumentException("Out of range: " + bigDecimal);
        }
    }

    private static class d<V> implements net.time4j.engine.y<i0, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final net.time4j.engine.p<V> f94626a;

        /* synthetic */ d(net.time4j.engine.p pVar, a aVar) {
            this(pVar);
        }

        static <V> d<V> j(net.time4j.engine.p<V> pVar) {
            return new d<>(pVar);
        }

        private long k(V v11) {
            return ((Number) Number.class.cast(v11)).longValue();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(i0 i0Var) {
            return (net.time4j.engine.p) i0.f94618e.get(this.f94626a);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(i0 i0Var) {
            return (net.time4j.engine.p) i0.f94618e.get(this.f94626a);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public V getMaximum(i0 i0Var) {
            if (this.f94626a.isDateElement()) {
                return (V) i0Var.f94621a.o(this.f94626a);
            }
            if (this.f94626a.isTimeElement()) {
                return this.f94626a.s();
            }
            throw new ChronoException("Missing rule for: " + this.f94626a.name());
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public V getMinimum(i0 i0Var) {
            if (this.f94626a.isDateElement()) {
                return (V) i0Var.f94621a.k(this.f94626a);
            }
            if (this.f94626a.isTimeElement()) {
                return this.f94626a.t();
            }
            throw new ChronoException("Missing rule for: " + this.f94626a.name());
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public V getValue(i0 i0Var) {
            if (this.f94626a.isDateElement()) {
                return (V) i0Var.f94621a.s(this.f94626a);
            }
            if (this.f94626a.isTimeElement()) {
                return (V) i0Var.f94622b.s(this.f94626a);
            }
            throw new ChronoException("Missing rule for: " + this.f94626a.name());
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i */
        public boolean isValid(i0 i0Var, V v11) {
            if (v11 == null) {
                return false;
            }
            if (this.f94626a.isDateElement()) {
                return i0Var.f94621a.y(this.f94626a, v11);
            }
            if (!this.f94626a.isTimeElement()) {
                throw new ChronoException("Missing rule for: " + this.f94626a.name());
            }
            if (Number.class.isAssignableFrom(this.f94626a.getType())) {
                long jK = k(this.f94626a.t());
                long jK2 = k(this.f94626a.s());
                long jK3 = k(v11);
                return jK <= jK3 && jK2 >= jK3;
            }
            if (this.f94626a.equals(h0.f94524o) && h0.f94523n.equals(v11)) {
                return false;
            }
            return i0Var.f94622b.y(this.f94626a, v11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: l */
        public i0 withValue(i0 i0Var, V v11, boolean z11) {
            if (v11 == null) {
                throw new IllegalArgumentException("Missing element value.");
            }
            if (v11.equals(getValue(i0Var))) {
                return i0Var;
            }
            if (z11) {
                return i0Var.H(net.time4j.base.c.m(k(v11), k(getValue(i0Var))), (x) i0.f94619f.E(this.f94626a));
            }
            if (this.f94626a.isDateElement()) {
                return i0.Y((g0) i0Var.f94621a.B(this.f94626a, v11), i0Var.f94622b);
            }
            if (!this.f94626a.isTimeElement()) {
                throw new ChronoException("Missing rule for: " + this.f94626a.name());
            }
            if (Number.class.isAssignableFrom(this.f94626a.getType())) {
                long jK = k(this.f94626a.t());
                long jK2 = k(this.f94626a.s());
                long jK3 = k(v11);
                if (jK > jK3 || jK2 < jK3) {
                    throw new IllegalArgumentException("Out of range: " + v11);
                }
            } else if (this.f94626a.equals(h0.f94524o) && v11.equals(h0.f94523n)) {
                throw new IllegalArgumentException("Out of range: " + v11);
            }
            return i0.Y(i0Var.f94621a, (h0) i0Var.f94622b.B(this.f94626a, v11));
        }

        private d(net.time4j.engine.p<V> pVar) {
            this.f94626a = pVar;
        }
    }

    private static class e implements net.time4j.engine.t<i0> {
        private e() {
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.w<?> a() {
            return null;
        }

        @Override // net.time4j.engine.t
        public int c() {
            return g0.q0().c();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.t
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public i0 b(net.time4j.engine.q<?> qVar, net.time4j.engine.d dVar, boolean z11, boolean z12) {
            h0 h0Var;
            net.time4j.tz.k kVar;
            if (qVar instanceof net.time4j.base.f) {
                net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f94173d;
                if (dVar.c(cVar)) {
                    kVar = (net.time4j.tz.k) dVar.a(cVar);
                } else {
                    if (!z11) {
                        throw new IllegalArgumentException("Missing timezone attribute for type conversion.");
                    }
                    kVar = net.time4j.tz.p.f94822k;
                }
                return b0.X((net.time4j.base.f) net.time4j.base.f.class.cast(qVar)).t0(kVar);
            }
            boolean z13 = z12 && qVar.p(h0.f94534y) == 60;
            if (z13) {
                qVar.z(h0.f94534y, 59);
            }
            net.time4j.engine.p<?> pVar = g0.f94487n;
            g0 g0Var = qVar.n(pVar) ? (g0) qVar.s(pVar) : (g0) g0.q0().b(qVar, dVar, z11, false);
            if (g0Var == null) {
                return null;
            }
            net.time4j.engine.p<?> pVar2 = h0.f94524o;
            if (qVar.n(pVar2)) {
                h0Var = (h0) qVar.s(pVar2);
            } else {
                h0Var = (h0) h0.g0().b(qVar, dVar, z11, false);
                if (h0Var == null && z11) {
                    h0Var = h0.f94522m;
                }
            }
            if (h0Var == null) {
                return null;
            }
            net.time4j.engine.p<?> pVar3 = y.f94832g;
            if (qVar.n(pVar3)) {
                g0Var = (g0) g0Var.H(((Long) qVar.s(pVar3)).longValue(), f.DAYS);
            }
            if (z13) {
                net.time4j.engine.a0 a0Var = net.time4j.engine.a0.LEAP_SECOND;
                Boolean bool = Boolean.TRUE;
                if (qVar.y(a0Var, bool)) {
                    qVar.B(a0Var, bool);
                }
            }
            return i0.Y(g0Var, h0Var);
        }

        @Override // net.time4j.engine.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.o f(i0 i0Var, net.time4j.engine.d dVar) {
            return i0Var;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.d0 h() {
            return net.time4j.engine.d0.f94117a;
        }

        @Override // net.time4j.engine.t
        public String j(net.time4j.engine.x xVar, Locale locale) {
            net.time4j.format.e eVarOfStyle = net.time4j.format.e.ofStyle(xVar.getStyleValue());
            return net.time4j.format.b.u(eVarOfStyle, eVarOfStyle, locale);
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    static {
        i0 i0Var = new i0(g0.f94477d, h0.f94522m);
        f94616c = i0Var;
        g0 g0Var = g0.f94478e;
        net.time4j.engine.p<h0> pVar = h0.f94524o;
        i0 i0Var2 = new i0(g0Var, pVar.s());
        f94617d = i0Var2;
        HashMap map = new HashMap();
        net.time4j.engine.p<g0> pVar2 = g0.f94487n;
        map.put(pVar2, pVar);
        net.time4j.c<Integer, g0> cVar = g0.f94489p;
        k0<Integer, g0> k0Var = g0.f94493t;
        map.put(cVar, k0Var);
        net.time4j.c<Integer, g0> cVar2 = g0.f94490q;
        map.put(cVar2, z0.f94846m.n());
        d0<m0> d0Var = g0.f94491r;
        k0<Integer, g0> k0Var2 = g0.f94497x;
        map.put(d0Var, k0Var2);
        d0<c0> d0Var2 = g0.f94492s;
        k0<Integer, g0> k0Var3 = g0.f94494u;
        map.put(d0Var2, k0Var3);
        map.put(k0Var, k0Var3);
        map.put(k0Var3, pVar);
        d0<x0> d0Var3 = g0.f94495v;
        map.put(d0Var3, pVar);
        k0<Integer, g0> k0Var4 = g0.f94496w;
        map.put(k0Var4, pVar);
        map.put(k0Var2, pVar);
        e0 e0Var = g0.f94498y;
        map.put(e0Var, pVar);
        c1<a0> c1Var = h0.f94526q;
        k0<Integer, h0> k0Var5 = h0.f94529t;
        map.put(c1Var, k0Var5);
        net.time4j.c<Integer, h0> cVar3 = h0.f94527r;
        k0<Integer, h0> k0Var6 = h0.f94532w;
        map.put(cVar3, k0Var6);
        net.time4j.c<Integer, h0> cVar4 = h0.f94528s;
        map.put(cVar4, k0Var6);
        map.put(k0Var5, k0Var6);
        k0<Integer, h0> k0Var7 = h0.f94530u;
        map.put(k0Var7, k0Var6);
        k0<Integer, h0> k0Var8 = h0.f94531v;
        map.put(k0Var8, k0Var6);
        k0<Integer, h0> k0Var9 = h0.f94534y;
        map.put(k0Var6, k0Var9);
        k0<Integer, h0> k0Var10 = h0.f94533x;
        map.put(k0Var10, k0Var9);
        k0<Integer, h0> k0Var11 = h0.C;
        map.put(k0Var9, k0Var11);
        k0<Integer, h0> k0Var12 = h0.f94535z;
        map.put(k0Var12, k0Var11);
        f94618e = Collections.unmodifiableMap(map);
        net.time4j.engine.f0.b bVarK = net.time4j.engine.f0.b.k(x.class, i0.class, new e(null), i0Var, i0Var2);
        d dVarJ = d.j(pVar2);
        f fVar = f.DAYS;
        net.time4j.engine.f0.b bVarE = bVarK.e(pVar2, dVarJ, fVar);
        d dVarJ2 = d.j(cVar);
        f fVar2 = f.YEARS;
        net.time4j.engine.f0.b bVarE2 = bVarE.e(cVar, dVarJ2, fVar2).e(cVar2, d.j(cVar2), w0.f94831a).e(d0Var, d.j(d0Var), f.QUARTERS);
        d dVarJ3 = d.j(d0Var2);
        f fVar3 = f.MONTHS;
        net.time4j.engine.f0.b bVarD = bVarE2.e(d0Var2, dVarJ3, fVar3).e(k0Var, d.j(k0Var), fVar3).e(k0Var3, d.j(k0Var3), fVar).e(d0Var3, d.j(d0Var3), fVar).e(k0Var4, d.j(k0Var4), fVar).e(k0Var2, d.j(k0Var2), fVar).e(e0Var, d.j(e0Var), f.WEEKS).d(pVar, d.j(pVar)).d(c1Var, d.j(c1Var));
        d dVarJ4 = d.j(cVar3);
        h hVar = h.HOURS;
        net.time4j.engine.f0.b bVarE3 = bVarD.e(cVar3, dVarJ4, hVar).e(cVar4, d.j(cVar4), hVar).e(k0Var5, d.j(k0Var5), hVar).e(k0Var7, d.j(k0Var7), hVar).e(k0Var8, d.j(k0Var8), hVar);
        d dVarJ5 = d.j(k0Var6);
        h hVar2 = h.MINUTES;
        net.time4j.engine.f0.b bVarE4 = bVarE3.e(k0Var6, dVarJ5, hVar2).e(k0Var10, d.j(k0Var10), hVar2);
        d dVarJ6 = d.j(k0Var9);
        h hVar3 = h.SECONDS;
        net.time4j.engine.f0.b bVarE5 = bVarE4.e(k0Var9, dVarJ6, hVar3).e(k0Var12, d.j(k0Var12), hVar3);
        k0<Integer, h0> k0Var13 = h0.A;
        d dVarJ7 = d.j(k0Var13);
        h hVar4 = h.MILLIS;
        net.time4j.engine.f0.b bVarE6 = bVarE5.e(k0Var13, dVarJ7, hVar4);
        k0<Integer, h0> k0Var14 = h0.B;
        d dVarJ8 = d.j(k0Var14);
        h hVar5 = h.MICROS;
        net.time4j.engine.f0.b bVarE7 = bVarE6.e(k0Var14, dVarJ8, hVar5);
        d dVarJ9 = d.j(k0Var11);
        h hVar6 = h.NANOS;
        net.time4j.engine.f0.b bVarE8 = bVarE7.e(k0Var11, dVarJ9, hVar6);
        k0<Integer, h0> k0Var15 = h0.D;
        net.time4j.engine.f0.b bVarE9 = bVarE8.e(k0Var15, d.j(k0Var15), hVar4);
        k0<Long, h0> k0Var16 = h0.E;
        net.time4j.engine.f0.b bVarE10 = bVarE9.e(k0Var16, d.j(k0Var16), hVar5);
        k0<Long, h0> k0Var17 = h0.F;
        net.time4j.engine.f0.b bVarE11 = bVarE10.e(k0Var17, d.j(k0Var17), hVar6);
        c1<BigDecimal> c1Var2 = h0.G;
        net.time4j.engine.f0.b bVarD2 = bVarE11.d(c1Var2, new c(c1Var2));
        c1<BigDecimal> c1Var3 = h0.H;
        net.time4j.engine.f0.b bVarD3 = bVarD2.d(c1Var3, new c(c1Var3));
        c1<BigDecimal> c1Var4 = h0.I;
        net.time4j.engine.f0.b bVarD4 = bVarD3.d(c1Var4, new c(c1Var4));
        net.time4j.engine.p<h> pVar3 = h0.J;
        net.time4j.engine.f0.b bVarD5 = bVarD4.d(pVar3, d.j(pVar3));
        Z(bVarD5);
        a0(bVarD5);
        b0(bVarD5);
        f94619f = bVarD5.h();
        f94620g = o.f(fVar2, fVar3, fVar, hVar, hVar2, hVar3, hVar6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private i0(g0 g0Var, h0 h0Var) {
        if (h0Var.c() == 24) {
            this.f94621a = (g0) g0Var.H(1L, f.DAYS);
            this.f94622b = h0.f94522m;
        } else {
            if (g0Var == null) {
                throw new NullPointerException("Missing date.");
            }
            this.f94621a = g0Var;
            this.f94622b = h0Var;
        }
    }

    public static net.time4j.engine.f0<x, i0> P() {
        return f94619f;
    }

    static i0 R(net.time4j.base.f fVar, net.time4j.tz.p pVar) {
        long jL = fVar.l() + ((long) pVar.j());
        int iA = fVar.a() + pVar.i();
        if (iA < 0) {
            iA += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            jL--;
        } else if (iA >= 1000000000) {
            iA -= Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            jL++;
        }
        g0 g0VarO0 = g0.O0(net.time4j.base.c.b(jL, Strategy.TTL_SECONDS_MAX), net.time4j.engine.z.UNIX);
        int iD = net.time4j.base.c.d(jL, Strategy.TTL_SECONDS_MAX);
        int i11 = iD % 60;
        int i12 = iD / 60;
        return Y(g0VarO0, h0.J0(i12 / 60, i12 % 60, i11, iA));
    }

    public static i0 X(int i11, int i12, int i13, int i14, int i15, int i16) {
        return Y(g0.I0(i11, i12, i13), h0.I0(i14, i15, i16));
    }

    public static i0 Y(g0 g0Var, h0 h0Var) {
        return new i0(g0Var, h0Var);
    }

    private static void Z(net.time4j.engine.f0.b<x, i0> bVar) {
        EnumSet enumSetRange = EnumSet.range(f.MILLENNIA, f.MONTHS);
        EnumSet enumSetRange2 = EnumSet.range(f.WEEKS, f.DAYS);
        f[] fVarArrValues = f.values();
        int length = fVarArrValues.length;
        int i11 = 0;
        while (i11 < length) {
            f fVar = fVarArrValues[i11];
            net.time4j.engine.f0.b<x, i0> bVar2 = bVar;
            bVar2.g(fVar, new b(fVar), fVar.getLength(), fVar.compareTo(f.WEEKS) < 0 ? enumSetRange : enumSetRange2);
            i11++;
            bVar = bVar2;
        }
    }

    private static void a0(net.time4j.engine.f0.b<x, i0> bVar) {
        for (h hVar : h.values()) {
            bVar.g(hVar, new b(hVar), hVar.getLength(), EnumSet.allOf(h.class));
        }
    }

    private static void b0(net.time4j.engine.f0.b<x, i0> bVar) {
        Iterator<net.time4j.engine.r> it = g0.q0().r().iterator();
        while (it.hasNext()) {
            bVar.f(it.next());
        }
        Iterator<net.time4j.engine.r> it2 = h0.g0().r().iterator();
        while (it2.hasNext()) {
            bVar.f(it2.next());
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.i0, net.time4j.engine.q
    /* JADX INFO: renamed from: E */
    public net.time4j.engine.f0<x, i0> t() {
        return f94619f;
    }

    public b0 N(net.time4j.tz.p pVar) {
        long jI = net.time4j.base.c.i(this.f94621a.C0() + 730, 86400L) + ((long) (this.f94622b.c() * 3600)) + ((long) (this.f94622b.e() * 60)) + ((long) this.f94622b.d());
        int iA = this.f94622b.a();
        long j11 = jI - ((long) pVar.j());
        int i11 = iA - pVar.i();
        if (i11 < 0) {
            i11 += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            j11--;
        } else if (i11 >= 1000000000) {
            i11 -= Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            j11++;
        }
        return b0.k0(j11, i11, fp0.f.POSIX);
    }

    public b0 O() {
        return N(net.time4j.tz.p.f94822k);
    }

    @Override // net.time4j.engine.i0, java.lang.Comparable
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public int compareTo(i0 i0Var) {
        if (this.f94621a.M(i0Var.f94621a)) {
            return 1;
        }
        if (this.f94621a.N(i0Var.f94621a)) {
            return -1;
        }
        return this.f94622b.compareTo(i0Var.f94622b);
    }

    public g0 S() {
        return this.f94621a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.q
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public i0 u() {
        return this;
    }

    public h0 U() {
        return this.f94622b;
    }

    public b0 V(net.time4j.tz.l lVar) {
        if (lVar.J()) {
            return N(lVar.A(this.f94621a, this.f94622b));
        }
        net.time4j.tz.o oVarE = lVar.E();
        long jA = oVarE.a(this.f94621a, this.f94622b, lVar);
        b0 b0VarK0 = b0.k0(jA, this.f94622b.a(), fp0.f.POSIX);
        if (oVarE == net.time4j.tz.l.f94762e) {
            b0.T(jA, this);
        }
        return b0VarK0;
    }

    public b0 W(net.time4j.tz.k kVar) {
        return V(net.time4j.tz.l.N(kVar));
    }

    @Override // net.time4j.base.g
    public int a() {
        return this.f94622b.a();
    }

    @Override // net.time4j.base.a
    public int b() {
        return this.f94621a.b();
    }

    @Override // net.time4j.base.g
    public int c() {
        return this.f94622b.c();
    }

    @Override // net.time4j.base.g
    public int d() {
        return this.f94622b.d();
    }

    public g0 d0() {
        return this.f94621a;
    }

    @Override // net.time4j.base.g
    public int e() {
        return this.f94622b.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            if (this.f94621a.equals(i0Var.f94621a) && this.f94622b.equals(i0Var.f94622b)) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.base.a
    public int f() {
        return this.f94621a.f();
    }

    public int hashCode() {
        return (this.f94621a.hashCode() * 13) + (this.f94622b.hashCode() * 37);
    }

    @Override // net.time4j.base.a
    public int r() {
        return this.f94621a.r();
    }

    @Override // net.time4j.base.a
    public String toString() {
        return this.f94621a.toString() + this.f94622b.toString();
    }

    private static class b implements net.time4j.engine.k0<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f94624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h f94625b;

        b(f fVar) {
            this.f94624a = fVar;
            this.f94625b = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.k0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public i0 b(i0 i0Var, long j11) {
            g0 g0Var;
            h0 h0Var;
            if (this.f94624a != null) {
                g0Var = (g0) i0Var.f94621a.H(j11, this.f94624a);
                h0Var = i0Var.f94622b;
            } else {
                k kVarQ0 = i0Var.f94622b.Q0(j11, this.f94625b);
                g0 g0Var2 = (g0) i0Var.f94621a.H(kVarQ0.a(), f.DAYS);
                h0 h0VarB = kVarQ0.b();
                g0Var = g0Var2;
                h0Var = h0VarB;
            }
            return i0.Y(g0Var, h0Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.k0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(i0 i0Var, i0 i0Var2) {
            long jF;
            f fVar = this.f94624a;
            if (fVar != null) {
                long jBetween = fVar.between(i0Var.f94621a, i0Var2.f94621a);
                if (jBetween == 0) {
                    return jBetween;
                }
                if (this.f94624a != f.DAYS && ((g0) i0Var.f94621a.H(jBetween, this.f94624a)).J(i0Var2.f94621a) != 0) {
                    return jBetween;
                }
                h0 h0Var = i0Var.f94622b;
                h0 h0Var2 = i0Var2.f94622b;
                if (jBetween <= 0 || !h0Var.w0(h0Var2)) {
                    return (jBetween >= 0 || !h0Var.x0(h0Var2)) ? jBetween : jBetween + 1;
                }
                return jBetween - 1;
            }
            if (i0Var.f94621a.M(i0Var2.f94621a)) {
                return -a(i0Var2, i0Var);
            }
            long jI = i0Var.f94621a.I(i0Var2.f94621a, f.DAYS);
            if (jI == 0) {
                return this.f94625b.between(i0Var.f94622b, i0Var2.f94622b);
            }
            if (this.f94625b.compareTo(h.SECONDS) <= 0) {
                long jI2 = net.time4j.base.c.i(jI, 86400L);
                h0 h0Var3 = i0Var2.f94622b;
                k0<Integer, h0> k0Var = h0.f94535z;
                jF = net.time4j.base.c.f(jI2, net.time4j.base.c.m(((Integer) h0Var3.s(k0Var)).longValue(), ((Integer) i0Var.f94622b.s(k0Var)).longValue()));
                if (i0Var.f94622b.a() > i0Var2.f94622b.a()) {
                    jF--;
                }
            } else {
                long jI3 = net.time4j.base.c.i(jI, 86400000000000L);
                h0 h0Var4 = i0Var2.f94622b;
                k0<Long, h0> k0Var2 = h0.F;
                jF = net.time4j.base.c.f(jI3, net.time4j.base.c.m(((Long) h0Var4.s(k0Var2)).longValue(), ((Long) i0Var.f94622b.s(k0Var2)).longValue()));
            }
            switch (a.f94623a[this.f94625b.ordinal()]) {
                case 1:
                    return jF / 3600;
                case 2:
                    return jF / 60;
                case 3:
                case 6:
                    return jF;
                case 4:
                    return jF / 1000000;
                case 5:
                    return jF / 1000;
                default:
                    throw new UnsupportedOperationException(this.f94625b.name());
            }
        }

        b(h hVar) {
            this.f94624a = null;
            this.f94625b = hVar;
        }
    }
}
