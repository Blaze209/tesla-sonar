package net.time4j.format;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p f94438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p f94439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p f94440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p f94441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<String, p> f94442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map<String, p> f94443f;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94444a;

        static {
            int[] iArr = new int[k.values().length];
            f94444a = iArr;
            try {
                iArr[k.CARDINALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94444a[k.ORDINALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class b implements o {
        private b() {
        }

        @Override // net.time4j.format.o
        public p a(Locale locale, k kVar) {
            boolean zEquals = locale.getLanguage().equals("en");
            int i11 = a.f94444a[kVar.ordinal()];
            if (i11 == 1) {
                return zEquals ? p.f94438a : p.f94439b;
            }
            if (i11 == 2) {
                return zEquals ? p.f94440c : p.f94441d;
            }
            throw new UnsupportedOperationException(kVar.name());
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private static class c extends p {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final k f94445g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f94446h;

        /* synthetic */ c(k kVar, boolean z11, a aVar) {
            this(kVar, z11);
        }

        private c(k kVar, boolean z11) {
            this.f94445g = kVar;
            this.f94446h = z11;
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final o f94447a;

        static {
            Iterator it = net.time4j.base.d.c().g(o.class).iterator();
            a aVar = null;
            o bVar = it.hasNext() ? (o) it.next() : null;
            if (bVar == null) {
                bVar = new b(aVar);
            }
            f94447a = bVar;
        }
    }

    static {
        k kVar = k.CARDINALS;
        boolean z11 = true;
        a aVar = null;
        f94438a = new c(kVar, z11, aVar);
        boolean z12 = false;
        f94439b = new c(kVar, z12, aVar);
        k kVar2 = k.ORDINALS;
        f94440c = new c(kVar2, z11, aVar);
        f94441d = new c(kVar2, z12, aVar);
        f94442e = new ConcurrentHashMap();
        f94443f = new ConcurrentHashMap();
    }

    private static Map<String, p> e(k kVar) {
        int i11 = a.f94444a[kVar.ordinal()];
        if (i11 == 1) {
            return f94442e;
        }
        if (i11 == 2) {
            return f94443f;
        }
        throw new UnsupportedOperationException(kVar.name());
    }

    public static p f(Locale locale, k kVar) {
        Map<String, p> mapE = e(kVar);
        p pVar = null;
        if (!mapE.isEmpty()) {
            pVar = locale.getCountry().equals("") ? null : mapE.get(g(locale));
            if (pVar == null) {
                pVar = mapE.get(locale.getLanguage());
            }
        }
        return pVar == null ? d.f94447a.a(locale, kVar) : pVar;
    }

    private static String g(Locale locale) {
        return locale.getLanguage() + '_' + locale.getCountry();
    }
}
