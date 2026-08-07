package net.time4j.i18n;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentMap<b, a> f94640e = new ConcurrentHashMap(32);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ReferenceQueue<Object> f94641f = new ReferenceQueue<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f94642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, String> f94643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f94644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Locale f94645d;

    private static class a extends SoftReference<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f94646a;

        a(e eVar, b bVar) {
            super(eVar, e.f94641f);
            this.f94646a = bVar;
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f94647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Locale f94648b;

        b(String str, Locale locale) {
            this.f94647a = str;
            this.f94648b = locale;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f94647a.equals(bVar.f94647a) && this.f94648b.equals(bVar.f94648b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f94647a.hashCode() << 3) ^ this.f94648b.hashCode();
        }

        public String toString() {
            return this.f94647a + "/" + this.f94648b;
        }
    }

    private e(g gVar, String str, Locale locale) throws IOException {
        int i11;
        this.f94642a = null;
        this.f94644c = str;
        this.f94645d = locale;
        HashMap map = new HashMap();
        while (true) {
            String strN = gVar.n();
            if (strN == null) {
                this.f94643b = Collections.unmodifiableMap(map);
                return;
            }
            String strTrim = strN.trim();
            if (!strTrim.isEmpty() && strTrim.charAt(0) != '#') {
                int length = strTrim.length();
                for (int i12 = 0; i12 < length; i12++) {
                    if (strTrim.charAt(i12) == '=' && (i11 = i12 + 1) < length) {
                        map.put(strTrim.substring(0, i12), strTrim.substring(i11));
                        break;
                    }
                }
            }
        }
    }

    public static List<Locale> c(Locale locale) {
        String alias = d.getAlias(locale);
        String country = locale.getCountry();
        String variant = locale.getVariant();
        LinkedList linkedList = new LinkedList();
        if (!variant.isEmpty()) {
            linkedList.add(new Locale(alias, country, variant));
        }
        if (!country.isEmpty()) {
            linkedList.add(new Locale(alias, country, ""));
        }
        if (!alias.isEmpty()) {
            linkedList.add(new Locale(alias, "", ""));
            if (alias.equals("nn")) {
                linkedList.add(new Locale("nb", "", ""));
            }
        }
        linkedList.add(Locale.ROOT);
        return linkedList;
    }

    public static e h(String str, Locale locale) throws Throwable {
        e eVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Base name must not be empty.");
        }
        if (locale == null) {
            throw new NullPointerException("Missing locale.");
        }
        b bVar = new b(str, locale);
        a aVar = f94640e.get(bVar);
        if (aVar != null && (eVar = aVar.get()) != null) {
            return eVar;
        }
        while (true) {
            Reference<? extends Object> referencePoll = f94641f.poll();
            if (referencePoll == null) {
                break;
            }
            f94640e.remove(((a) referencePoll).f94646a);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Locale> it = c(locale).iterator();
        while (it.hasNext()) {
            try {
                e eVarI = i(str, it.next());
                if (eVarI != null) {
                    arrayList.add(eVarI);
                }
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }
        if (arrayList.isEmpty()) {
            throw new MissingResourceException("Cannot find resource bundle for: " + j(str, locale), e.class.getName(), "");
        }
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            int i11 = size - 1;
            arrayList.set(i11, ((e) arrayList.get(i11)).k((e) arrayList.get(size)));
        }
        e eVar2 = (e) arrayList.get(0);
        f94640e.putIfAbsent(bVar, new a(eVar2, bVar));
        return eVar2;
    }

    private static e i(String str, Locale locale) throws Throwable {
        int iIndexOf = str.indexOf(47);
        String strSubstring = str.substring(0, iIndexOf);
        String strJ = j(str.substring(iIndexOf + 1), locale);
        InputStream inputStreamE = net.time4j.base.d.c().e(net.time4j.base.d.c().f(strSubstring, e.class, strJ), true);
        g gVar = null;
        if (inputStreamE == null) {
            try {
                inputStreamE = net.time4j.base.d.c().d(e.class, strJ, true);
            } catch (IOException unused) {
                return null;
            }
        }
        if (inputStreamE == null) {
            return null;
        }
        try {
            g gVar2 = new g(inputStreamE);
            try {
                e eVar = new e(gVar2, str, locale);
                gVar2.close();
                return eVar;
            } catch (Throwable th2) {
                th = th2;
                gVar = gVar2;
                if (gVar != null) {
                    gVar.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static String j(String str, Locale locale) {
        String alias = d.getAlias(locale);
        String country = locale.getCountry();
        String variant = locale.getVariant();
        StringBuilder sb2 = new StringBuilder(str.length() + 20);
        sb2.append(str.replace(CoreConstants.DOT, '/'));
        if (!alias.isEmpty()) {
            sb2.append('_');
            sb2.append(alias);
            if (!variant.isEmpty()) {
                sb2.append('_');
                sb2.append(country);
                sb2.append('_');
                sb2.append(variant);
            } else if (!country.isEmpty()) {
                sb2.append('_');
                sb2.append(country);
            }
        }
        sb2.append(".properties");
        return sb2.toString();
    }

    private e k(e eVar) {
        return eVar == null ? this : new e(this, eVar);
    }

    public boolean b(String str) {
        if (str == null) {
            throw new NullPointerException("Missing resource key.");
        }
        e eVar = this;
        while (eVar.f94643b.get(str) == null) {
            eVar = eVar.f94642a;
            if (eVar == null) {
                return false;
            }
        }
        return true;
    }

    public Set<String> d() {
        return this.f94643b.keySet();
    }

    public Locale e() {
        return this.f94645d;
    }

    public String f(String str) {
        if (str == null) {
            throw new NullPointerException("Missing resource key.");
        }
        e eVar = this;
        do {
            String str2 = eVar.f94643b.get(str);
            if (str2 != null) {
                return str2;
            }
            eVar = eVar.f94642a;
        } while (eVar != null);
        throw new MissingResourceException("Cannot find property resource for: " + j(this.f94644c, this.f94645d) + "=>" + str, e.class.getName(), str);
    }

    public Set<String> g() {
        HashSet hashSet = new HashSet(this.f94643b.keySet());
        e eVar = this;
        while (true) {
            eVar = eVar.f94642a;
            if (eVar == null) {
                return Collections.unmodifiableSet(hashSet);
            }
            hashSet.addAll(eVar.f94643b.keySet());
        }
    }

    private e(e eVar, e eVar2) {
        this.f94642a = eVar2;
        this.f94644c = eVar.f94644c;
        this.f94645d = eVar.f94645d;
        this.f94643b = eVar.f94643b;
    }
}
