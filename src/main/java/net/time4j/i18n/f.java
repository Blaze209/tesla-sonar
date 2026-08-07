package net.time4j.i18n;

import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.format.j;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements net.time4j.format.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Locale[] f94649b = new Locale[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<String> f94650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f94651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<String, j> f94652e;

    static {
        String[] strArrSplit = e.h("i18n/numbers/symbol", Locale.ROOT).f("locales").split(" ");
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, strArrSplit);
        f94650c = Collections.unmodifiableSet(hashSet);
        f94651d = new f();
        HashMap map = new HashMap();
        for (j jVar : j.values()) {
            map.put(jVar.getCode(), jVar);
        }
        f94652e = Collections.unmodifiableMap(map);
    }

    private static e g(Locale locale) {
        if (f94650c.contains(d.getAlias(locale))) {
            return e.h("i18n/numbers/symbol", locale);
        }
        return null;
    }

    private static char h(Locale locale, String str, char c11) {
        e eVarG = g(locale);
        return (eVarG == null || !eVarG.b(str)) ? c11 : eVarG.f(str).charAt(0);
    }

    private static String i(Locale locale, String str, String str2) {
        e eVarG = g(locale);
        return (eVarG == null || !eVarG.b(str)) ? str2 : eVarG.f(str);
    }

    @Override // net.time4j.format.i
    public Locale[] a() {
        return f94649b;
    }

    @Override // net.time4j.format.i
    public j b(Locale locale) {
        String strI = i(locale, "numsys", j.ARABIC.getCode());
        j jVar = f94652e.get(strI);
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("Unrecognized number system: " + strI + " (locale=" + locale + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // net.time4j.format.i
    public String c(Locale locale) {
        return i(locale, "minus", net.time4j.format.i.f94437a.c(locale));
    }

    @Override // net.time4j.format.i
    public char d(Locale locale) {
        return h(locale, "zero", net.time4j.format.i.f94437a.d(locale));
    }

    @Override // net.time4j.format.i
    public char e(Locale locale) {
        return h(locale, "separator", net.time4j.format.i.f94437a.e(locale));
    }

    @Override // net.time4j.format.i
    public String f(Locale locale) {
        return i(locale, "plus", net.time4j.format.i.f94437a.f(locale));
    }

    public String toString() {
        return "SymbolProviderSPI";
    }
}
