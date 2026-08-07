package net.time4j.engine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.time4j.engine.i0;

/* JADX INFO: loaded from: classes9.dex */
public final class f0<U, T extends i0<U, T>> extends w<T> implements g0<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class<U> f94124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<U, k0<T>> f94125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<U, Double> f94126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<U, Set<U>> f94127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<p<?>, U> f94128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final T f94129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final T f94130n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final k<T> f94131o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p<T> f94132p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final g0<T> f94133q;

    class a implements Comparator<U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f94134a;

        a(Map map) {
            this.f94134a = map;
        }

        @Override // java.util.Comparator
        public int compare(U u11, U u12) {
            return Double.compare(f0.F(this.f94134a, u11), f0.F(this.f94134a, u12));
        }
    }

    public static final class b<U, T extends i0<U, T>> extends w.a<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Class<U> f94136f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Map<U, k0<T>> f94137g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Map<U, Double> f94138h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Map<U, Set<U>> f94139i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Map<p<?>, U> f94140j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final T f94141k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final T f94142l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final k<T> f94143m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private g0<T> f94144n;

        private b(Class<U> cls, Class<T> cls2, t<T> tVar, T t11, T t12, k<T> kVar, g0<T> g0Var) {
            super(cls2, tVar);
            this.f94144n = null;
            if (cls == null) {
                throw new NullPointerException("Missing unit type.");
            }
            if (t11 == null) {
                throw new NullPointerException("Missing minimum of range.");
            }
            if (t12 == null) {
                throw new NullPointerException("Missing maximum of range.");
            }
            if (m.class.isAssignableFrom(cls2) && kVar == null) {
                throw new NullPointerException("Missing calendar system.");
            }
            this.f94136f = cls;
            this.f94137g = new HashMap();
            this.f94138h = new HashMap();
            this.f94139i = new HashMap();
            this.f94140j = new HashMap();
            this.f94141k = t11;
            this.f94142l = t12;
            this.f94143m = kVar;
            this.f94144n = g0Var;
        }

        private void i(U u11) {
            if (this.f94159b) {
                return;
            }
            Iterator<U> it = this.f94137g.keySet().iterator();
            while (it.hasNext()) {
                if (it.next().equals(u11)) {
                    throw new IllegalArgumentException("Unit duplicate found: " + u11.toString());
                }
            }
            if (u11 instanceof Enum) {
                String strName = ((Enum) Enum.class.cast(u11)).name();
                for (U u12 : this.f94137g.keySet()) {
                    if ((u12 instanceof Enum) && ((Enum) Enum.class.cast(u12)).name().equals(strName)) {
                        throw new IllegalArgumentException("Unit duplicate found: " + strName);
                    }
                }
            }
        }

        public static <U, D extends m<U, D>> b<U, D> j(Class<U> cls, Class<D> cls2, t<D> tVar, k<D> kVar) {
            b<U, D> bVar = new b<>(cls, cls2, tVar, kVar.b(kVar.c()), kVar.b(kVar.a()), kVar, null);
            for (z zVar : z.values()) {
                bVar.d(zVar, zVar.derive(kVar));
            }
            return bVar;
        }

        public static <U, T extends i0<U, T>> b<U, T> k(Class<U> cls, Class<T> cls2, t<T> tVar, T t11, T t12) {
            return new b<>(cls, cls2, tVar, t11, t12, null, null);
        }

        public <V> b<U, T> d(p<V> pVar, y<T, V> yVar) {
            super.a(pVar, yVar);
            return this;
        }

        public <V> b<U, T> e(p<V> pVar, y<T, V> yVar, U u11) {
            if (u11 == null) {
                throw new NullPointerException("Missing base unit.");
            }
            super.a(pVar, yVar);
            this.f94140j.put(pVar, u11);
            return this;
        }

        public b<U, T> f(r rVar) {
            super.b(rVar);
            return this;
        }

        public b<U, T> g(U u11, k0<T> k0Var, double d11, Set<? extends U> set) {
            if (u11 == null) {
                throw new NullPointerException("Missing time unit.");
            }
            if (k0Var == null) {
                throw new NullPointerException("Missing unit rule.");
            }
            i(u11);
            Iterator<? extends U> it = set.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    throw new NullPointerException("Found convertible unit which is null.");
                }
            }
            if (Double.isNaN(d11)) {
                throw new IllegalArgumentException("Not a number: " + d11);
            }
            if (Double.isInfinite(d11)) {
                throw new IllegalArgumentException("Infinite: " + d11);
            }
            this.f94137g.put(u11, k0Var);
            this.f94138h.put(u11, Double.valueOf(d11));
            HashSet hashSet = new HashSet(set);
            hashSet.remove(u11);
            this.f94139i.put(u11, hashSet);
            return this;
        }

        public f0<U, T> h() {
            if (this.f94137g.isEmpty()) {
                throw new IllegalStateException("No time unit was registered.");
            }
            f0<U, T> f0Var = new f0<>(this.f94158a, this.f94136f, this.f94160c, this.f94161d, this.f94137g, this.f94138h, this.f94139i, this.f94162e, this.f94140j, this.f94141k, this.f94142l, this.f94143m, this.f94144n, null);
            w.z(f0Var);
            return f0Var;
        }

        public b<U, T> l(g0<T> g0Var) {
            if (g0Var == null) {
                throw new NullPointerException("Missing time line.");
            }
            this.f94144n = g0Var;
            return this;
        }
    }

    private static class c<U, T extends i0<U, T>> implements g0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final U f94145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f94146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final T f94147c;

        c(U u11, T t11, T t12) {
            this.f94145a = u11;
            this.f94146b = t11;
            this.f94147c = t12;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(T t11, T t12) {
            return t11.compareTo(t12);
        }
    }

    private static class d<T extends i0<?, T>> extends e<T> implements y<T, T> {
        private static final long serialVersionUID = 4777240530511579802L;
        private final T max;
        private final T min;
        private final Class<T> type;

        /* synthetic */ d(Class cls, i0 i0Var, i0 i0Var2, a aVar) {
            this(cls, i0Var, i0Var2);
        }

        @Override // net.time4j.engine.e
        protected <X extends q<X>> y<X, T> f(w<X> wVar) {
            if (wVar.p().equals(this.type)) {
                return this;
            }
            return null;
        }

        @Override // net.time4j.engine.p
        public Class<T> getType() {
            return this.type;
        }

        @Override // net.time4j.engine.p
        public boolean isDateElement() {
            return false;
        }

        @Override // net.time4j.engine.p
        public boolean isTimeElement() {
            return false;
        }

        @Override // net.time4j.engine.e
        protected String l(w<?> wVar) {
            return null;
        }

        @Override // net.time4j.engine.e
        protected boolean n() {
            return true;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public p<?> getChildAtCeiling(T t11) {
            throw new UnsupportedOperationException();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public p<?> getChildAtFloor(T t11) {
            throw new UnsupportedOperationException();
        }

        @Override // net.time4j.engine.p
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public T getDefaultMaximum() {
            return this.max;
        }

        @Override // net.time4j.engine.p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public T getDefaultMinimum() {
            return this.min;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public T getMaximum(T t11) {
            return (T) getDefaultMaximum();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public T getMinimum(T t11) {
            return (T) getDefaultMinimum();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public T getValue(T t11) {
            return t11;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean isValid(T t11, T t12) {
            return t12 != null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public T withValue(T t11, T t12, boolean z11) {
            if (t12 != null) {
                return t12;
            }
            throw new IllegalArgumentException("Missing value.");
        }

        private d(Class<T> cls, T t11, T t12) {
            super(cls.getName() + "-AXIS");
            this.type = cls;
            this.min = t11;
            this.max = t12;
        }
    }

    /* synthetic */ f0(Class cls, Class cls2, t tVar, Map map, Map map2, Map map3, Map map4, List list, Map map5, i0 i0Var, i0 i0Var2, k kVar, g0 g0Var, a aVar) {
        this(cls, cls2, tVar, map, map2, map3, map4, list, map5, i0Var, i0Var2, kVar, g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <U> double F(Map<U, Double> map, U u11) {
        Double d11 = map.get(u11);
        if (d11 != null) {
            return d11.doubleValue();
        }
        if (u11 instanceof v) {
            return ((v) v.class.cast(u11)).getLength();
        }
        return Double.NaN;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int compare(T t11, T t12) {
        return t11.compareTo(t12);
    }

    @Override // net.time4j.engine.w, net.time4j.engine.t
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public T b(q<?> qVar, net.time4j.engine.d dVar, boolean z11, boolean z12) {
        return qVar.n(this.f94132p) ? (T) qVar.s(this.f94132p) : (T) super.b(qVar, dVar, z11, z12);
    }

    public p<T> D() {
        return this.f94132p;
    }

    public U E(p<?> pVar) {
        if (pVar == null) {
            throw new NullPointerException("Missing element.");
        }
        U u11 = this.f94128l.get(pVar);
        if (u11 == null && (pVar instanceof e)) {
            u11 = this.f94128l.get(((e) pVar).j());
        }
        if (u11 != null) {
            return u11;
        }
        throw new ChronoException("Base unit not found for: " + pVar.name());
    }

    public T G() {
        return this.f94130n;
    }

    public T H() {
        return this.f94129m;
    }

    k0<T> I(U u11) {
        k0<T> k0VarA;
        if (u11 == null) {
            throw new NullPointerException("Missing chronological unit.");
        }
        if (J(u11)) {
            return this.f94125i.get(u11);
        }
        if (!(u11 instanceof f) || (k0VarA = ((f) f.class.cast(u11)).a(this)) == null) {
            throw new RuleNotFoundException(this, u11);
        }
        return k0VarA;
    }

    public boolean J(U u11) {
        return this.f94125i.containsKey(u11);
    }

    @Override // net.time4j.engine.w
    public k<T> n() {
        k<T> kVar = this.f94131o;
        return kVar == null ? super.n() : kVar;
    }

    @Override // net.time4j.engine.w
    public k<T> o(String str) {
        return str.isEmpty() ? n() : super.o(str);
    }

    private f0(Class<T> cls, Class<U> cls2, t<T> tVar, Map<p<?>, y<T, ?>> map, Map<U, k0<T>> map2, Map<U, Double> map3, Map<U, Set<U>> map4, List<r> list, Map<p<?>, U> map5, T t11, T t12, k<T> kVar, g0<T> g0Var) {
        super(cls, tVar, map, list);
        this.f94124h = cls2;
        this.f94125i = Collections.unmodifiableMap(map2);
        this.f94126j = Collections.unmodifiableMap(map3);
        this.f94127k = Collections.unmodifiableMap(map4);
        this.f94128l = Collections.unmodifiableMap(map5);
        this.f94129m = t11;
        this.f94130n = t12;
        this.f94131o = kVar;
        this.f94132p = new d(cls, t11, t12, null);
        if (g0Var != null) {
            this.f94133q = g0Var;
            return;
        }
        ArrayList arrayList = new ArrayList(map2.keySet());
        Collections.sort(arrayList, new a(map3));
        this.f94133q = new c(arrayList.get(0), t11, t12);
    }
}
