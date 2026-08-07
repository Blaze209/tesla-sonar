package net.time4j.i18n;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import net.time4j.format.k;
import net.time4j.format.o;
import net.time4j.format.p;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, p> f94627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p f94628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, p> f94629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p f94630d;

    /* JADX INFO: renamed from: net.time4j.i18n.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C2015a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94631a;

        static {
            int[] iArr = new int[k.values().length];
            f94631a = iArr;
            try {
                iArr[k.CARDINALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94631a[k.ORDINALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class b extends p {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f94632g;

        /* synthetic */ b(int i11, C2015a c2015a) {
            this(i11);
        }

        private b(int i11) {
            this.f94632g = i11;
        }
    }

    private static class c extends p {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f94633g;

        /* synthetic */ c(int i11, C2015a c2015a) {
            this(i11);
        }

        private c(int i11) {
            this.f94633g = i11;
        }
    }

    static {
        HashMap map = new HashMap(140);
        f94627a = map;
        int i11 = 0;
        C2015a c2015a = null;
        f94628b = new b(i11, c2015a);
        HashMap map2 = new HashMap();
        b(map2, "bm bo dz id ig ii in ja jbo jv jw kde kea km ko lkt", -1);
        b(map2, "lo ms my nqo root sah ses sg th to vi wo yo zh", -1);
        b(map2, "pt_PT", 0);
        b(map2, "am as bn fa gu hi kn zu", 1);
        b(map2, "ff fr hy kab pt", 1);
        b(map2, "si", 1);
        b(map2, "ak bh guw ln mg nso pa ti wa", 1);
        b(map2, "tzm", 2);
        b(map2, "is", 3);
        b(map2, "mk", 4);
        b(map2, "ceb fil tl", 5);
        b(map2, "lv prg", 6);
        b(map2, "lag ksh", 7);
        b(map2, "iu naq se sma smi smj smn sms", 8);
        b(map2, "shi", 9);
        b(map2, "mo ro", 10);
        b(map2, "bs hr sh sr", 11);
        b(map2, "gd", 12);
        b(map2, "sl", 13);
        b(map2, "he iw", 14);
        b(map2, "cs sk", 15);
        b(map2, "pl", 16);
        b(map2, "be", 17);
        b(map2, "lt", 18);
        b(map2, "mt", 19);
        b(map2, "ru uk", 17);
        b(map2, "br", 20);
        b(map2, "ga", 21);
        b(map2, "gv", 22);
        b(map2, "ar", 23);
        b(map2, "cy", 24);
        b(map2, "dsb hsb", 25);
        b(map2, "kw", 26);
        map.putAll(map2);
        HashMap map3 = new HashMap(140);
        f94629c = map3;
        f94630d = new c(i11, c2015a);
        HashMap map4 = new HashMap();
        c(map4, "sv", 1);
        c(map4, "fil fr ga hy lo mo ms ro tl vi", 2);
        c(map4, "hu", 3);
        c(map4, "ne", 4);
        c(map4, "kk", 5);
        c(map4, "it sc scn", 6);
        c(map4, "ka", 7);
        c(map4, "sq", 8);
        c(map4, "en", 9);
        c(map4, "mr", 10);
        c(map4, "ca", 11);
        c(map4, "mk", 12);
        c(map4, "az", 13);
        c(map4, "gu hi", 14);
        c(map4, "as bn", 15);
        c(map4, "cy", 16);
        c(map4, "be", 17);
        c(map4, "uk", 18);
        c(map4, "tk", 19);
        c(map4, "or", 20);
        c(map4, "gd", 21);
        c(map4, "kw", 22);
        map3.putAll(map4);
    }

    private static void b(Map<String, p> map, String str, int i11) {
        for (String str2 : str.split(" ")) {
            map.put(str2, new b(i11, null));
        }
    }

    private static void c(Map<String, p> map, String str, int i11) {
        for (String str2 : str.split(" ")) {
            map.put(str2, new c(i11, null));
        }
    }

    @Override // net.time4j.format.o
    public p a(Locale locale, k kVar) {
        Map<String, p> map;
        p pVar;
        p pVar2;
        int i11 = C2015a.f94631a[kVar.ordinal()];
        if (i11 == 1) {
            map = f94627a;
            pVar = f94628b;
        } else {
            if (i11 != 2) {
                throw new UnsupportedOperationException(kVar.name());
            }
            map = f94629c;
            pVar = f94630d;
        }
        String country = locale.getCountry();
        if (country.isEmpty()) {
            pVar2 = null;
        } else {
            pVar2 = map.get(locale.getLanguage() + '_' + country);
        }
        if (pVar2 == null) {
            pVar2 = map.get(locale.getLanguage());
        }
        return pVar2 == null ? pVar : pVar2;
    }
}
