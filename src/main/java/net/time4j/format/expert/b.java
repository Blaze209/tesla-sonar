package net.time4j.format.expert;

import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
final class b implements net.time4j.engine.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final net.time4j.engine.c<String> f94226g = net.time4j.format.a.e("PLUS_SIGN", String.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final net.time4j.engine.c<String> f94227h = net.time4j.format.a.e("MINUS_SIGN", String.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final net.time4j.format.i f94228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char f94229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final ConcurrentMap<String, a> f94230k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f94231l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f94232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final net.time4j.format.a f94233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Locale f94234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f94235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f94236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final net.time4j.engine.n<net.time4j.engine.o> f94237f;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final net.time4j.format.j f94238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char f94239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final char f94240c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f94241d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f94242e;

        a(net.time4j.format.j jVar, char c11, char c12, String str, String str2) {
            this.f94238a = jVar;
            this.f94239b = c11;
            this.f94240c = c12;
            this.f94241d = str;
            this.f94242e = str2;
        }
    }

    static {
        net.time4j.format.i iVar = null;
        int i11 = 0;
        for (net.time4j.format.i iVar2 : net.time4j.base.d.c().g(net.time4j.format.i.class)) {
            int length = iVar2.a().length;
            if (length > i11) {
                iVar = iVar2;
                i11 = length;
            }
        }
        if (iVar == null) {
            iVar = net.time4j.i18n.f.f94651d;
        }
        f94228i = iVar;
        char c11 = Boolean.getBoolean("net.time4j.format.iso.decimal.dot") ? CoreConstants.DOT : CoreConstants.COMMA_CHAR;
        f94229j = c11;
        f94230k = new ConcurrentHashMap();
        f94231l = new a(net.time4j.format.j.ARABIC, '0', c11, Marker.ANY_NON_NULL_MARKER, "-");
    }

    b(net.time4j.format.a aVar, Locale locale) {
        this(aVar, locale, 0, 0, null);
    }

    static b d(net.time4j.engine.w<?> wVar, net.time4j.format.a aVar, Locale locale) {
        net.time4j.format.a.b bVar = new net.time4j.format.a.b(wVar);
        bVar.d(net.time4j.format.a.f94175f, net.time4j.format.g.SMART);
        bVar.d(net.time4j.format.a.f94176g, net.time4j.format.v.WIDE);
        bVar.d(net.time4j.format.a.f94177h, net.time4j.format.m.FORMAT);
        bVar.b(net.time4j.format.a.f94185p, ' ');
        bVar.f(aVar);
        return new b(bVar.a(), locale).n(locale);
    }

    private static boolean j(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    static b k(b bVar, b bVar2) {
        HashMap map = new HashMap();
        map.putAll(bVar2.f94232a);
        map.putAll(bVar.f94232a);
        return new b(new net.time4j.format.a.b().f(bVar2.f94233b).f(bVar.f94233b).a(), Locale.ROOT, 0, 0, null, map).n(bVar.f94234c);
    }

    @Override // net.time4j.engine.d
    public <A> A a(net.time4j.engine.c<A> cVar) {
        return this.f94232a.containsKey(cVar.name()) ? cVar.type().cast(this.f94232a.get(cVar.name())) : (A) this.f94233b.a(cVar);
    }

    @Override // net.time4j.engine.d
    public <A> A b(net.time4j.engine.c<A> cVar, A a11) {
        return this.f94232a.containsKey(cVar.name()) ? cVar.type().cast(this.f94232a.get(cVar.name())) : (A) this.f94233b.b(cVar, a11);
    }

    @Override // net.time4j.engine.d
    public boolean c(net.time4j.engine.c<?> cVar) {
        if (this.f94232a.containsKey(cVar.name())) {
            return true;
        }
        return this.f94233b.c(cVar);
    }

    net.time4j.format.a e() {
        return this.f94233b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f94233b.equals(bVar.f94233b) && this.f94234c.equals(bVar.f94234c) && this.f94235d == bVar.f94235d && this.f94236e == bVar.f94236e && j(this.f94237f, bVar.f94237f) && this.f94232a.equals(bVar.f94232a)) {
                return true;
            }
        }
        return false;
    }

    net.time4j.engine.n<net.time4j.engine.o> f() {
        return this.f94237f;
    }

    int g() {
        return this.f94235d;
    }

    Locale h() {
        return this.f94234c;
    }

    public int hashCode() {
        return (this.f94233b.hashCode() * 7) + (this.f94232a.hashCode() * 37);
    }

    int i() {
        return this.f94236e;
    }

    b l(net.time4j.format.a aVar) {
        return new b(aVar, this.f94234c, this.f94235d, this.f94236e, this.f94237f, this.f94232a);
    }

    <A> b m(net.time4j.engine.c<A> cVar, A a11) {
        HashMap map = new HashMap(this.f94232a);
        if (a11 == null) {
            map.remove(cVar.name());
        } else {
            map.put(cVar.name(), a11);
        }
        return new b(this.f94233b, this.f94234c, this.f94235d, this.f94236e, this.f94237f, map);
    }

    b n(Locale locale) {
        String str;
        String str2;
        net.time4j.format.a.b bVar = new net.time4j.format.a.b();
        bVar.f(this.f94233b);
        String alias = net.time4j.i18n.d.getAlias(locale);
        String country = locale.getCountry();
        if (alias.isEmpty() && country.isEmpty()) {
            locale = Locale.ROOT;
            bVar.d(net.time4j.format.a.f94181l, net.time4j.format.j.ARABIC);
            bVar.b(net.time4j.format.a.f94184o, f94229j);
            str = Marker.ANY_NON_NULL_MARKER;
            str2 = "-";
        } else {
            if (!country.isEmpty()) {
                alias = alias + "_" + country;
            }
            a aVar = f94230k.get(alias);
            if (aVar == null) {
                try {
                    net.time4j.format.i iVar = f94228i;
                    aVar = new a(iVar.b(locale), iVar.d(locale), iVar.e(locale), iVar.f(locale), iVar.c(locale));
                } catch (RuntimeException unused) {
                    aVar = f94231l;
                }
                a aVarPutIfAbsent = f94230k.putIfAbsent(alias, aVar);
                if (aVarPutIfAbsent != null) {
                    aVar = aVarPutIfAbsent;
                }
            }
            bVar.d(net.time4j.format.a.f94181l, aVar.f94238a);
            bVar.b(net.time4j.format.a.f94182m, aVar.f94239b);
            bVar.b(net.time4j.format.a.f94184o, aVar.f94240c);
            str = aVar.f94241d;
            str2 = aVar.f94242e;
        }
        Locale locale2 = locale;
        bVar.h(locale2);
        HashMap map = new HashMap(this.f94232a);
        map.put(f94226g.name(), str);
        map.put(f94227h.name(), str2);
        return new b(bVar.a(), locale2, this.f94235d, this.f94236e, this.f94237f, map);
    }

    public String toString() {
        return b.class.getName() + "[attributes=" + this.f94233b + ",locale=" + this.f94234c + ",level=" + this.f94235d + ",section=" + this.f94236e + ",print-condition=" + this.f94237f + ",other=" + this.f94232a + ']';
    }

    b(net.time4j.format.a aVar, Locale locale, int i11, int i12, net.time4j.engine.n<net.time4j.engine.o> nVar) {
        if (aVar == null) {
            throw new NullPointerException("Missing format attributes.");
        }
        this.f94233b = aVar;
        this.f94234c = locale == null ? Locale.ROOT : locale;
        this.f94235d = i11;
        this.f94236e = i12;
        this.f94237f = nVar;
        this.f94232a = Collections.EMPTY_MAP;
    }

    private b(net.time4j.format.a aVar, Locale locale, int i11, int i12, net.time4j.engine.n<net.time4j.engine.o> nVar, Map<String, Object> map) {
        if (aVar != null) {
            this.f94233b = aVar;
            this.f94234c = locale == null ? Locale.ROOT : locale;
            this.f94235d = i11;
            this.f94236e = i12;
            this.f94237f = nVar;
            this.f94232a = Collections.unmodifiableMap(map);
            return;
        }
        throw new NullPointerException("Missing format attributes.");
    }
}
