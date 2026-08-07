package net.time4j.format;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import net.time4j.engine.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements net.time4j.engine.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final net.time4j.engine.c<String> f94171b = q.a("CALENDAR_TYPE", String.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final net.time4j.engine.c<Locale> f94172c = q.a("LANGUAGE", Locale.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final net.time4j.engine.c<net.time4j.tz.k> f94173d = q.a("TIMEZONE_ID", net.time4j.tz.k.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final net.time4j.engine.c<net.time4j.tz.o> f94174e = q.a("TRANSITION_STRATEGY", net.time4j.tz.o.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final net.time4j.engine.c<g> f94175f = q.a("LENIENCY", g.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final net.time4j.engine.c<v> f94176g = q.a("TEXT_WIDTH", v.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final net.time4j.engine.c<m> f94177h = q.a("OUTPUT_CONTEXT", m.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f94178i = q.a("PARSE_CASE_INSENSITIVE", Boolean.class);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f94179j = q.a("PARSE_PARTIAL_COMPARE", Boolean.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f94180k = q.a("PARSE_MULTIPLE_CONTEXT", Boolean.class);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final net.time4j.engine.c<j> f94181l = q.a("NUMBER_SYSTEM", j.class);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final net.time4j.engine.c<Character> f94182m = q.a("ZERO_DIGIT", Character.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f94183n = q.a("NO_GMT_PREFIX", Boolean.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final net.time4j.engine.c<Character> f94184o = q.a("DECIMAL_SEPARATOR", Character.class);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final net.time4j.engine.c<Character> f94185p = q.a("PAD_CHAR", Character.class);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final net.time4j.engine.c<Integer> f94186q = q.a("PIVOT_YEAR", Integer.class);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f94187r = q.a("TRAILING_CHARACTERS", Boolean.class);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final net.time4j.engine.c<Integer> f94188s = q.a("PROTECTED_CHARACTERS", Integer.class);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final net.time4j.engine.c<String> f94189t = q.a("CALENDAR_VARIANT", String.class);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final net.time4j.engine.c<d0> f94190u = q.a("START_OF_DAY", d0.class);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f94191v = q.a("FOUR_DIGIT_YEAR", Boolean.class);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final net.time4j.engine.c<fp0.f> f94192w = q.a("TIME_SCALE", fp0.f.class);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final net.time4j.engine.c<String> f94193x = q.a("FORMAT_PATTERN", String.class);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final a f94194y = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f94195a;

    /* JADX INFO: renamed from: net.time4j.format.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C2009a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94196a;

        static {
            int[] iArr = new int[g.values().length];
            f94196a = iArr;
            try {
                iArr[g.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94196a[g.SMART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94196a[g.LAX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* synthetic */ a(Map map, C2009a c2009a) {
        this(map);
    }

    public static <A> net.time4j.engine.c<A> e(String str, Class<A> cls) {
        return q.a(str, cls);
    }

    public static a f() {
        return f94194y;
    }

    @Override // net.time4j.engine.d
    public <A> A a(net.time4j.engine.c<A> cVar) {
        Object obj = this.f94195a.get(cVar.name());
        if (obj != null) {
            return cVar.type().cast(obj);
        }
        throw new NoSuchElementException(cVar.name());
    }

    @Override // net.time4j.engine.d
    public <A> A b(net.time4j.engine.c<A> cVar, A a11) {
        Object obj = this.f94195a.get(cVar.name());
        return obj == null ? a11 : cVar.type().cast(obj);
    }

    @Override // net.time4j.engine.d
    public boolean c(net.time4j.engine.c<?> cVar) {
        return this.f94195a.containsKey(cVar.name());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f94195a.equals(((a) obj).f94195a);
        }
        return false;
    }

    public int hashCode() {
        return this.f94195a.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f94195a.size() * 32);
        sb2.append(a.class.getName());
        sb2.append('[');
        sb2.append(this.f94195a);
        sb2.append(']');
        return sb2.toString();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, Object> f94197a = new HashMap();

        public b() {
        }

        private <A> void g(net.time4j.engine.c<A> cVar, A a11) {
            if (a11 != null) {
                this.f94197a.put(cVar.name(), a11);
                return;
            }
            throw new NullPointerException("Missing attribute value for key: " + cVar);
        }

        public a a() {
            return new a(this.f94197a, null);
        }

        public b b(net.time4j.engine.c<Character> cVar, char c11) {
            this.f94197a.put(cVar.name(), Character.valueOf(c11));
            return this;
        }

        public b c(net.time4j.engine.c<Integer> cVar, int i11) {
            if (cVar != a.f94186q || i11 >= 100) {
                this.f94197a.put(cVar.name(), Integer.valueOf(i11));
                return this;
            }
            throw new IllegalArgumentException("Pivot year in far past not supported: " + i11);
        }

        public <A extends Enum<A>> b d(net.time4j.engine.c<A> cVar, A a11) {
            if (a11 == null) {
                throw new NullPointerException("Missing attribute value for key: " + cVar);
            }
            this.f94197a.put(cVar.name(), a11);
            if (cVar != a.f94175f) {
                if (cVar == a.f94181l) {
                    j jVar = (j) j.class.cast(a11);
                    if (jVar.isDecimal()) {
                        b(a.f94182m, jVar.getDigits().charAt(0));
                    }
                }
                return this;
            }
            int i11 = C2009a.f94196a[((g) g.class.cast(a11)).ordinal()];
            if (i11 == 1) {
                e(a.f94178i, false);
                e(a.f94179j, false);
                e(a.f94187r, false);
                e(a.f94180k, false);
                return this;
            }
            if (i11 == 2) {
                e(a.f94178i, true);
                e(a.f94179j, false);
                e(a.f94187r, false);
                e(a.f94180k, true);
                return this;
            }
            if (i11 != 3) {
                throw new UnsupportedOperationException(a11.name());
            }
            e(a.f94178i, true);
            e(a.f94179j, true);
            e(a.f94187r, true);
            e(a.f94180k, true);
            return this;
        }

        public b e(net.time4j.engine.c<Boolean> cVar, boolean z11) {
            this.f94197a.put(cVar.name(), Boolean.valueOf(z11));
            return this;
        }

        public b f(a aVar) {
            this.f94197a.putAll(aVar.f94195a);
            return this;
        }

        public b h(Locale locale) {
            g(a.f94172c, locale);
            return this;
        }

        public b i(net.time4j.tz.k kVar) {
            g(a.f94173d, kVar);
            return this;
        }

        public b(net.time4j.engine.w<?> wVar) {
            g(a.f94171b, net.time4j.format.b.a(wVar));
        }
    }

    private a() {
        this.f94195a = Collections.EMPTY_MAP;
    }

    private a(Map<String, Object> map) {
        this.f94195a = Collections.unmodifiableMap(new HashMap(map));
    }
}
