package com.facebook.hermes.intl;

import com.google.android.libraries.places.api.model.PlaceTypes;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes3.dex */
@in.a
public class NumberFormat {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static String[] f21612v = {"acre", "bit", "byte", "celsius", "centimeter", "day", "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", "hour", "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", "minute", "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", "week", "yard", "year"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c.h f21613a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c.i f21618f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c.f f21625m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f21628p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c.b f21631s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f21614b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c.EnumC0435c f21615c = c.EnumC0435c.SYMBOL;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c.d f21616d = c.d.STANDARD;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f21617e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21619g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21620h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21621i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21622j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f21623k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f21624l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c.g f21626n = c.g.AUTO;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f21629q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private c.e f21630r = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private em.b<?> f21632t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private em.b<?> f21633u = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private c f21627o = new j();

    @in.a
    public NumberFormat(List<String> list, Map<String, Object> map) throws JSRangeErrorException {
        a(list, map);
        this.f21627o.i(this.f21632t, this.f21628p ? "" : this.f21629q, this.f21613a, this.f21616d, this.f21630r, this.f21631s).d(this.f21614b, this.f21615c).f(this.f21619g).e(this.f21620h).j(this.f21625m, this.f21623k, this.f21624l).g(this.f21625m, this.f21621i, this.f21622j).h(this.f21626n).k(this.f21617e, this.f21618f);
    }

    private void a(List<String> list, Map<String, Object> map) throws JSRangeErrorException {
        Object objP;
        Object objP2;
        Object objQ = em.d.q();
        g.a aVar = g.a.STRING;
        em.d.c(objQ, "localeMatcher", g.c(map, "localeMatcher", aVar, em.a.f63061a, "best fit"));
        Object objC = g.c(map, "numberingSystem", aVar, em.d.d(), em.d.d());
        if (!em.d.n(objC) && !b(em.d.h(objC))) {
            throw new JSRangeErrorException("Invalid numbering system !");
        }
        em.d.c(objQ, "nu", objC);
        HashMap<String, Object> mapA = f.a(list, objQ, Collections.singletonList("nu"));
        em.b<?> bVar = (em.b) em.d.g(mapA).get("locale");
        this.f21632t = bVar;
        this.f21633u = bVar.f();
        Object objA = em.d.a(mapA, "nu");
        if (em.d.j(objA)) {
            this.f21628p = true;
            this.f21629q = this.f21627o.b(this.f21632t);
        } else {
            this.f21628p = false;
            this.f21629q = em.d.h(objA);
        }
        h(map);
        if (this.f21613a == c.h.CURRENCY) {
            double dN = j.n(this.f21614b);
            objP = em.d.p(dN);
            objP2 = em.d.p(dN);
        } else {
            objP = em.d.p(0.0d);
            objP2 = this.f21613a == c.h.PERCENT ? em.d.p(0.0d) : em.d.p(3.0d);
        }
        this.f21630r = (c.e) g.d(c.e.class, em.d.h(g.c(map, "notation", aVar, new String[]{"standard", "scientific", "engineering", "compact"}, "standard")));
        g(map, objP, objP2);
        Object objC2 = g.c(map, "compactDisplay", aVar, new String[]{"short", "long"}, "short");
        if (this.f21630r == c.e.COMPACT) {
            this.f21631s = (c.b) g.d(c.b.class, em.d.h(objC2));
        }
        this.f21619g = em.d.e(g.c(map, "useGrouping", g.a.BOOLEAN, em.d.d(), em.d.o(true)));
        this.f21626n = (c.g) g.d(c.g.class, em.d.h(g.c(map, "signDisplay", aVar, new String[]{DebugKt.DEBUG_PROPERTY_VALUE_AUTO, PermissionsResponse.PERMISSION_EXPIRES_NEVER, PermissionsResponse.SCOPE_ALWAYS, "exceptZero"}, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)));
    }

    private boolean b(String str) {
        return em.c.e(str, 0, str.length() - 1);
    }

    private boolean c(String str) {
        return Arrays.binarySearch(f21612v, str) >= 0;
    }

    private boolean d(String str) {
        return f(str).matches("^[A-Z][A-Z][A-Z]$");
    }

    private boolean e(String str) {
        if (c(str)) {
            return true;
        }
        int iIndexOf = str.indexOf("-per-");
        return iIndexOf >= 0 && str.indexOf("-per-", iIndexOf + 1) < 0 && c(str.substring(0, iIndexOf)) && c(str.substring(iIndexOf + 5));
    }

    private String f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 'a' || cCharAt > 'z') {
                sb2.append(cCharAt);
            } else {
                sb2.append((char) (cCharAt - ' '));
            }
        }
        return sb2.toString();
    }

    private void g(Map<String, Object> map, Object obj, Object obj2) throws JSRangeErrorException {
        Object objB = g.b(map, "minimumIntegerDigits", em.d.p(1.0d), em.d.p(21.0d), em.d.p(1.0d));
        Object objA = em.d.a(map, "minimumFractionDigits");
        Object objA2 = em.d.a(map, "maximumFractionDigits");
        Object objA3 = em.d.a(map, "minimumSignificantDigits");
        Object objA4 = em.d.a(map, "maximumSignificantDigits");
        this.f21620h = (int) Math.floor(em.d.f(objB));
        if (!em.d.n(objA3) || !em.d.n(objA4)) {
            this.f21625m = c.f.SIGNIFICANT_DIGITS;
            Object objA5 = g.a("minimumSignificantDigits", objA3, em.d.p(1.0d), em.d.p(21.0d), em.d.p(1.0d));
            Object objA6 = g.a("maximumSignificantDigits", objA4, objA5, em.d.p(21.0d), em.d.p(21.0d));
            this.f21623k = (int) Math.floor(em.d.f(objA5));
            this.f21624l = (int) Math.floor(em.d.f(objA6));
            return;
        }
        if (em.d.n(objA) && em.d.n(objA2)) {
            c.e eVar = this.f21630r;
            if (eVar == c.e.COMPACT) {
                this.f21625m = c.f.COMPACT_ROUNDING;
                return;
            }
            if (eVar == c.e.ENGINEERING) {
                this.f21625m = c.f.FRACTION_DIGITS;
                this.f21622j = 5;
                return;
            } else {
                this.f21625m = c.f.FRACTION_DIGITS;
                this.f21621i = (int) Math.floor(em.d.f(obj));
                this.f21622j = (int) Math.floor(em.d.f(obj2));
                return;
            }
        }
        this.f21625m = c.f.FRACTION_DIGITS;
        Object objA7 = g.a("minimumFractionDigits", objA, em.d.p(0.0d), em.d.p(20.0d), em.d.d());
        Object objA8 = g.a("maximumFractionDigits", objA2, em.d.p(0.0d), em.d.p(20.0d), em.d.d());
        if (em.d.n(objA7)) {
            objA7 = em.d.p(Math.min(em.d.f(obj), em.d.f(objA8)));
        } else if (em.d.n(objA8)) {
            objA8 = em.d.p(Math.max(em.d.f(obj2), em.d.f(objA7)));
        } else if (em.d.f(objA7) > em.d.f(objA8)) {
            throw new JSRangeErrorException("minimumFractionDigits is greater than maximumFractionDigits");
        }
        this.f21621i = (int) Math.floor(em.d.f(objA7));
        this.f21622j = (int) Math.floor(em.d.f(objA8));
    }

    private void h(Map<String, Object> map) throws JSRangeErrorException {
        g.a aVar = g.a.STRING;
        this.f21613a = (c.h) g.d(c.h.class, em.d.h(g.c(map, "style", aVar, new String[]{"decimal", "percent", "currency", "unit"}, "decimal")));
        Object objC = g.c(map, "currency", aVar, em.d.d(), em.d.d());
        if (em.d.n(objC)) {
            if (this.f21613a == c.h.CURRENCY) {
                throw new JSRangeErrorException("Expected currency style !");
            }
        } else if (!d(em.d.h(objC))) {
            throw new JSRangeErrorException("Malformed currency code !");
        }
        Object objC2 = g.c(map, "currencyDisplay", aVar, new String[]{"symbol", "narrowSymbol", "code", "name"}, "symbol");
        Object objC3 = g.c(map, "currencySign", aVar, new String[]{PlaceTypes.ACCOUNTING, "standard"}, "standard");
        Object objC4 = g.c(map, "unit", aVar, em.d.d(), em.d.d());
        if (em.d.n(objC4)) {
            if (this.f21613a == c.h.UNIT) {
                throw new JSRangeErrorException("Expected unit !");
            }
        } else if (!e(em.d.h(objC4))) {
            throw new JSRangeErrorException("Malformed unit identifier !");
        }
        Object objC5 = g.c(map, "unitDisplay", aVar, new String[]{"long", "short", "narrow"}, "short");
        c.h hVar = this.f21613a;
        if (hVar == c.h.CURRENCY) {
            this.f21614b = f(em.d.h(objC));
            this.f21615c = (c.EnumC0435c) g.d(c.EnumC0435c.class, em.d.h(objC2));
            this.f21616d = (c.d) g.d(c.d.class, em.d.h(objC3));
        } else if (hVar == c.h.UNIT) {
            this.f21617e = em.d.h(objC4);
            this.f21618f = (c.i) g.d(c.i.class, em.d.h(objC5));
        }
    }

    @in.a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String strH = em.d.h(g.c(map, "localeMatcher", g.a.STRING, em.a.f63061a, "best fit"));
        String[] strArr = new String[list.size()];
        return strH.equals("best fit") ? Arrays.asList(e.d((String[]) list.toArray(strArr))) : Arrays.asList(e.h((String[]) list.toArray(strArr)));
    }

    @in.a
    public String format(double d11) {
        return this.f21627o.c(d11);
    }

    @in.a
    public List<Map<String, String>> formatToParts(double d11) {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator attributedCharacterIteratorA = this.f21627o.a(d11);
        StringBuilder sb2 = new StringBuilder();
        for (char cFirst = attributedCharacterIteratorA.first(); cFirst != 65535; cFirst = attributedCharacterIteratorA.next()) {
            sb2.append(cFirst);
            if (attributedCharacterIteratorA.getIndex() + 1 == attributedCharacterIteratorA.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = attributedCharacterIteratorA.getAttributes().keySet().iterator();
                String strL = it.hasNext() ? this.f21627o.l(it.next(), d11) : "literal";
                String string = sb2.toString();
                sb2.setLength(0);
                HashMap map = new HashMap();
                map.put("type", strL);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    @in.a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f21633u.g());
        linkedHashMap.put("numberingSystem", this.f21629q);
        linkedHashMap.put("style", this.f21613a.toString());
        c.h hVar = this.f21613a;
        if (hVar == c.h.CURRENCY) {
            linkedHashMap.put("currency", this.f21614b);
            linkedHashMap.put("currencyDisplay", this.f21615c.toString());
            linkedHashMap.put("currencySign", this.f21616d.toString());
        } else if (hVar == c.h.UNIT) {
            linkedHashMap.put("unit", this.f21617e);
            linkedHashMap.put("unitDisplay", this.f21618f.toString());
        }
        int i11 = this.f21620h;
        if (i11 != -1) {
            linkedHashMap.put("minimumIntegerDigits", Integer.valueOf(i11));
        }
        c.f fVar = this.f21625m;
        if (fVar == c.f.SIGNIFICANT_DIGITS) {
            int i12 = this.f21624l;
            if (i12 != -1) {
                linkedHashMap.put("maximumSignificantDigits", Integer.valueOf(i12));
            }
            int i13 = this.f21623k;
            if (i13 != -1) {
                linkedHashMap.put("minimumSignificantDigits", Integer.valueOf(i13));
            }
        } else if (fVar == c.f.FRACTION_DIGITS) {
            int i14 = this.f21621i;
            if (i14 != -1) {
                linkedHashMap.put("minimumFractionDigits", Integer.valueOf(i14));
            }
            int i15 = this.f21622j;
            if (i15 != -1) {
                linkedHashMap.put("maximumFractionDigits", Integer.valueOf(i15));
            }
        }
        linkedHashMap.put("useGrouping", Boolean.valueOf(this.f21619g));
        linkedHashMap.put("notation", this.f21630r.toString());
        if (this.f21630r == c.e.COMPACT) {
            linkedHashMap.put("compactDisplay", this.f21631s.toString());
        }
        linkedHashMap.put("signDisplay", this.f21626n.toString());
        return linkedHashMap;
    }
}
