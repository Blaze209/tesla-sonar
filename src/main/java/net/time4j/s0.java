package net.time4j;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
final class s0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ConcurrentMap<Locale, s0> f94722n = new ConcurrentHashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final x[] f94723o = {f.YEARS, f.MONTHS, f.WEEKS, f.DAYS, h.HOURS, h.MINUTES, h.SECONDS, h.MILLIS, h.MICROS, h.NANOS};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final net.time4j.format.x f94724p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final net.time4j.format.x f94725q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Locale f94726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<x, Map<net.time4j.format.v, Map<net.time4j.format.n, String>>> f94727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<x, Map<net.time4j.format.n, String>> f94728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<x, Map<net.time4j.format.n, String>> f94729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<x, Map<net.time4j.format.n, String>> f94730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<x, Map<net.time4j.format.n, String>> f94731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<Integer, Map<net.time4j.format.v, String>> f94732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f94733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f94734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f94735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f94736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<x0, String> f94737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map<x0, String> f94738m;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94739a;

        static {
            int[] iArr = new int[net.time4j.format.v.values().length];
            f94739a = iArr;
            try {
                iArr[net.time4j.format.v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94739a[net.time4j.format.v.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94739a[net.time4j.format.v.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94739a[net.time4j.format.v.NARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static class b implements net.time4j.format.x {
        private b() {
        }

        private static String F(String str, String str2, String str3, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            int i11 = a.f94739a[vVar.ordinal()];
            if (i11 == 1) {
                return G(str, nVar);
            }
            if (i11 == 2 || i11 == 3) {
                return G(str2, nVar);
            }
            if (i11 != 4) {
                throw new UnsupportedOperationException(vVar.name());
            }
            return "{0}" + str3;
        }

        private static String G(String str, net.time4j.format.n nVar) {
            return "{0} " + str + (nVar == net.time4j.format.n.ONE ? "" : "s");
        }

        private static String H(String str, boolean z11, net.time4j.format.n nVar) {
            String str2 = nVar == net.time4j.format.n.ONE ? "" : "s";
            if (z11) {
                return "in {0} " + str + str2;
            }
            return "{0} " + str + str2 + " ago";
        }

        private static String I(String str, boolean z11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z11 ? Marker.ANY_NON_NULL_MARKER : "-");
            sb2.append("{0} ");
            sb2.append(str);
            return sb2.toString();
        }

        private static String J(String str) {
            return "{0} " + str;
        }

        @Override // net.time4j.format.x
        public String A(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("week", "wk", "w", vVar, nVar) : J("w");
        }

        @Override // net.time4j.format.x
        public String C(Locale locale, boolean z11, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? H("year", z11, nVar) : I("y", z11);
        }

        @Override // net.time4j.format.x
        public String D(Locale locale, boolean z11, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? H("minute", z11, nVar) : I("min", z11);
        }

        @Override // net.time4j.format.x
        public String b(Locale locale) {
            return "now";
        }

        @Override // net.time4j.format.x
        public String c(Locale locale, boolean z11, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? H("second", z11, nVar) : I("s", z11);
        }

        @Override // net.time4j.format.x
        public String d(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("minute", "min", "m", vVar, nVar) : J("min");
        }

        @Override // net.time4j.format.x
        public String e(Locale locale, boolean z11, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? H("month", z11, nVar) : I("m", z11);
        }

        @Override // net.time4j.format.x
        public String h(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("month", "mth", "m", vVar, nVar) : J("m");
        }

        @Override // net.time4j.format.x
        public String i(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("nanosecond", "nsec", "ns", vVar, nVar) : J("ns");
        }

        @Override // net.time4j.format.x
        public String k(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("millisecond", "msec", "ms", vVar, nVar) : J("ms");
        }

        @Override // net.time4j.format.x
        public String m(Locale locale, net.time4j.format.v vVar, int i11) {
            if (i11 < 2) {
                throw new IllegalArgumentException("Size must be greater than 1.");
            }
            StringBuilder sb2 = new StringBuilder(i11 * 5);
            for (int i12 = 0; i12 < i11; i12++) {
                sb2.append(CoreConstants.CURLY_LEFT);
                sb2.append(i12);
                sb2.append(CoreConstants.CURLY_RIGHT);
                if (i12 < i11 - 1) {
                    sb2.append(", ");
                }
            }
            return sb2.toString();
        }

        @Override // net.time4j.format.x
        public String n(Locale locale, boolean z11, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? H("day", z11, nVar) : I(DateTokenConverter.CONVERTER_KEY, z11);
        }

        @Override // net.time4j.format.x
        public String r(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("microsecond", "µsec", "µs", vVar, nVar) : J("µs");
        }

        @Override // net.time4j.format.x
        public String u(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("hour", "hr", "h", vVar, nVar) : J("h");
        }

        @Override // net.time4j.format.x
        public String v(Locale locale, boolean z11, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? H("week", z11, nVar) : I("w", z11);
        }

        @Override // net.time4j.format.x
        public String w(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("year", "yr", "y", vVar, nVar) : J("y");
        }

        @Override // net.time4j.format.x
        public String x(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("second", "sec", "s", vVar, nVar) : J("s");
        }

        @Override // net.time4j.format.x
        public String y(Locale locale, boolean z11, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? H("hour", z11, nVar) : I("h", z11);
        }

        @Override // net.time4j.format.x
        public String z(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("day", "day", DateTokenConverter.CONVERTER_KEY, vVar, nVar) : J(DateTokenConverter.CONVERTER_KEY);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        net.time4j.format.x bVar = new b(0 == true ? 1 : 0);
        f94725q = bVar;
        Iterator it = net.time4j.base.d.c().g(net.time4j.format.x.class).iterator();
        net.time4j.format.x xVar = it.hasNext() ? (net.time4j.format.x) it.next() : null;
        if (xVar != null) {
            bVar = xVar;
        }
        f94724p = bVar;
    }

    private s0(Locale locale) {
        String strF;
        String str;
        String strJ;
        String str2;
        HashMap map;
        HashMap map2;
        this.f94726a = locale;
        HashMap map3 = new HashMap(10);
        HashMap map4 = new HashMap(10);
        HashMap map5 = new HashMap(10);
        HashMap map6 = new HashMap(10);
        HashMap map7 = new HashMap(10);
        HashMap map8 = new HashMap(10);
        x[] xVarArr = f94723o;
        int length = xVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            x xVar = xVarArr[i11];
            EnumMap enumMap = new EnumMap(net.time4j.format.v.class);
            net.time4j.format.v[] vVarArrValues = net.time4j.format.v.values();
            int length2 = vVarArrValues.length;
            x[] xVarArr2 = xVarArr;
            int i12 = 0;
            while (i12 < length2) {
                int i13 = length;
                net.time4j.format.v vVar = vVarArrValues[i12];
                int i14 = i12;
                EnumMap enumMap2 = new EnumMap(net.time4j.format.n.class);
                net.time4j.format.n[] nVarArrValues = net.time4j.format.n.values();
                int i15 = i11;
                int i16 = 0;
                for (int length3 = nVarArrValues.length; i16 < length3; length3 = length3) {
                    int i17 = i16;
                    net.time4j.format.n nVar = nVarArrValues[i17];
                    enumMap2.put(nVar, c(locale, xVar, vVar, nVar));
                    i16 = i17 + 1;
                }
                enumMap.put(vVar, Collections.unmodifiableMap(enumMap2));
                i12 = i14 + 1;
                length = i13;
                i11 = i15;
            }
            int i18 = length;
            int i19 = i11;
            map3.put(xVar, Collections.unmodifiableMap(enumMap));
            if (Character.isDigit(xVar.getSymbol())) {
                map = map3;
                map2 = map4;
            } else {
                EnumMap enumMap3 = new EnumMap(net.time4j.format.n.class);
                net.time4j.format.n[] nVarArrValues2 = net.time4j.format.n.values();
                int length4 = nVarArrValues2.length;
                int i21 = 0;
                while (i21 < length4) {
                    net.time4j.format.n nVar2 = nVarArrValues2[i21];
                    enumMap3.put(nVar2, d(locale, xVar, false, false, nVar2));
                    i21++;
                    map3 = map3;
                }
                map = map3;
                map4.put(xVar, Collections.unmodifiableMap(enumMap3));
                EnumMap enumMap4 = new EnumMap(net.time4j.format.n.class);
                for (net.time4j.format.n nVar3 : net.time4j.format.n.values()) {
                    enumMap4.put(nVar3, d(locale, xVar, false, true, nVar3));
                }
                map6.put(xVar, Collections.unmodifiableMap(enumMap4));
                EnumMap enumMap5 = new EnumMap(net.time4j.format.n.class);
                net.time4j.format.n[] nVarArrValues3 = net.time4j.format.n.values();
                int length5 = nVarArrValues3.length;
                int i22 = 0;
                while (i22 < length5) {
                    net.time4j.format.n nVar4 = nVarArrValues3[i22];
                    enumMap5.put(nVar4, d(locale, xVar, true, false, nVar4));
                    i22++;
                    map4 = map4;
                }
                map2 = map4;
                map5.put(xVar, Collections.unmodifiableMap(enumMap5));
                EnumMap enumMap6 = new EnumMap(net.time4j.format.n.class);
                for (net.time4j.format.n nVar5 : net.time4j.format.n.values()) {
                    enumMap6.put(nVar5, d(locale, xVar, true, true, nVar5));
                }
                map7.put(xVar, Collections.unmodifiableMap(enumMap6));
            }
            i11 = i19 + 1;
            map4 = map2;
            xVarArr = xVarArr2;
            length = i18;
            map3 = map;
        }
        HashMap map9 = map3;
        HashMap map10 = map4;
        for (int i23 = 2; i23 <= 7; i23++) {
            Integer numValueOf = Integer.valueOf(i23);
            EnumMap enumMap7 = new EnumMap(net.time4j.format.v.class);
            for (net.time4j.format.v vVar2 : net.time4j.format.v.values()) {
                enumMap7.put(vVar2, e(locale, vVar2, i23));
            }
            map8.put(numValueOf, Collections.unmodifiableMap(enumMap7));
        }
        this.f94727b = Collections.unmodifiableMap(map9);
        this.f94728c = Collections.unmodifiableMap(map10);
        this.f94729d = Collections.unmodifiableMap(map5);
        this.f94730e = Collections.unmodifiableMap(map6);
        this.f94731f = Collections.unmodifiableMap(map7);
        this.f94732g = Collections.unmodifiableMap(map8);
        EnumMap enumMap8 = new EnumMap(x0.class);
        EnumMap enumMap9 = new EnumMap(x0.class);
        x0[] x0VarArrValues = x0.values();
        int length6 = x0VarArrValues.length;
        int i24 = 0;
        while (true) {
            strF = "";
            if (i24 < length6) {
                x0 x0Var = x0VarArrValues[i24];
                enumMap8.put(x0Var, "");
                enumMap9.put(x0Var, "");
                i24++;
            } else {
                try {
                    break;
                } catch (MissingResourceException unused) {
                    str = "";
                    strJ = str;
                }
            }
        }
        net.time4j.format.x xVar2 = f94724p;
        String strB = xVar2.b(locale);
        if (xVar2 instanceof net.time4j.format.r) {
            net.time4j.format.r rVar = (net.time4j.format.r) net.time4j.format.r.class.cast(xVar2);
            String strA = rVar.a(locale);
            try {
                strJ = rVar.j(locale);
                try {
                    strF = rVar.f(locale);
                    for (x0 x0Var2 : x0.values()) {
                        enumMap8.put(x0Var2, rVar.g(x0Var2, locale));
                        enumMap9.put(x0Var2, rVar.q(x0Var2, locale));
                    }
                    str2 = strF;
                    strF = strA;
                } catch (MissingResourceException unused2) {
                    str = strF;
                    strF = strA;
                    strB = f94725q.b(locale);
                    str2 = str;
                }
            } catch (MissingResourceException unused3) {
                str = "";
                strJ = str;
            }
        } else {
            str2 = "";
            strJ = str2;
        }
        this.f94733h = strB;
        this.f94734i = strF;
        this.f94735j = strJ;
        this.f94736k = str2;
        this.f94737l = Collections.unmodifiableMap(enumMap8);
        this.f94738m = Collections.unmodifiableMap(enumMap9);
    }

    private static char a(x xVar) {
        char symbol = xVar.getSymbol();
        if (xVar == h.MINUTES) {
            return 'N';
        }
        return symbol;
    }

    private static String c(Locale locale, x xVar, net.time4j.format.v vVar, net.time4j.format.n nVar) {
        try {
            return f(f94724p, locale, a(xVar), vVar, nVar);
        } catch (MissingResourceException unused) {
            return f(f94725q, locale, a(xVar), vVar, nVar);
        }
    }

    private static String d(Locale locale, x xVar, boolean z11, boolean z12, net.time4j.format.n nVar) {
        Locale locale2;
        boolean z13;
        boolean z14;
        net.time4j.format.n nVar2;
        try {
            locale2 = locale;
            z13 = z11;
            z14 = z12;
            nVar2 = nVar;
            try {
                return g(f94724p, locale2, a(xVar), z13, z14, nVar2);
            } catch (MissingResourceException unused) {
                return g(f94725q, locale2, a(xVar), z13, z14, nVar2);
            }
        } catch (MissingResourceException unused2) {
            locale2 = locale;
            z13 = z11;
            z14 = z12;
            nVar2 = nVar;
        }
    }

    private static String e(Locale locale, net.time4j.format.v vVar, int i11) {
        try {
            return f94724p.m(locale, vVar, i11);
        } catch (MissingResourceException unused) {
            return f94725q.m(locale, vVar, i11);
        }
    }

    private static String f(net.time4j.format.x xVar, Locale locale, char c11, net.time4j.format.v vVar, net.time4j.format.n nVar) {
        if (c11 == '3') {
            return xVar.k(locale, vVar, nVar);
        }
        if (c11 == '6') {
            return xVar.r(locale, vVar, nVar);
        }
        if (c11 == '9') {
            return xVar.i(locale, vVar, nVar);
        }
        if (c11 == 'D') {
            return xVar.z(locale, vVar, nVar);
        }
        if (c11 == 'H') {
            return xVar.u(locale, vVar, nVar);
        }
        if (c11 == 'S') {
            return xVar.x(locale, vVar, nVar);
        }
        if (c11 == 'W') {
            return xVar.A(locale, vVar, nVar);
        }
        if (c11 == 'Y') {
            return xVar.w(locale, vVar, nVar);
        }
        if (c11 == 'M') {
            return xVar.h(locale, vVar, nVar);
        }
        if (c11 == 'N') {
            return xVar.d(locale, vVar, nVar);
        }
        throw new UnsupportedOperationException("Unit-ID: " + c11);
    }

    private static String g(net.time4j.format.x xVar, Locale locale, char c11, boolean z11, boolean z12, net.time4j.format.n nVar) {
        if (!z12 || !(xVar instanceof net.time4j.format.r)) {
            if (c11 == 'D') {
                return xVar.n(locale, z11, nVar);
            }
            if (c11 == 'H') {
                return xVar.y(locale, z11, nVar);
            }
            if (c11 == 'S') {
                return xVar.c(locale, z11, nVar);
            }
            if (c11 == 'W') {
                return xVar.v(locale, z11, nVar);
            }
            if (c11 == 'Y') {
                return xVar.C(locale, z11, nVar);
            }
            if (c11 == 'M') {
                return xVar.e(locale, z11, nVar);
            }
            if (c11 == 'N') {
                return xVar.D(locale, z11, nVar);
            }
            throw new UnsupportedOperationException("Unit-ID: " + c11);
        }
        net.time4j.format.r rVar = (net.time4j.format.r) net.time4j.format.r.class.cast(xVar);
        if (c11 == 'D') {
            return rVar.B(locale, z11, nVar);
        }
        if (c11 == 'H') {
            return rVar.t(locale, z11, nVar);
        }
        if (c11 == 'S') {
            return rVar.p(locale, z11, nVar);
        }
        if (c11 == 'W') {
            return rVar.o(locale, z11, nVar);
        }
        if (c11 == 'Y') {
            return rVar.l(locale, z11, nVar);
        }
        if (c11 == 'M') {
            return rVar.s(locale, z11, nVar);
        }
        if (c11 == 'N') {
            return rVar.E(locale, z11, nVar);
        }
        throw new UnsupportedOperationException("Unit-ID: " + c11);
    }

    static s0 h(Locale locale) {
        s0 s0VarPutIfAbsent;
        if (locale == null) {
            throw new NullPointerException("Missing language.");
        }
        ConcurrentMap<Locale, s0> concurrentMap = f94722n;
        s0 s0Var = concurrentMap.get(locale);
        return (s0Var != null || (s0VarPutIfAbsent = concurrentMap.putIfAbsent(locale, (s0Var = new s0(locale)))) == null) ? s0Var : s0VarPutIfAbsent;
    }

    String b() {
        return this.f94735j;
    }
}
