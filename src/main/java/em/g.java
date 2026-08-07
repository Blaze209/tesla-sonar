package em;

import android.icu.text.Collator;
import android.icu.text.NumberingSystem;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f63071a = "calendar";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f63072b = "ca";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f63073c = "numbers";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f63074d = "nu";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f63075e = "hours";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f63076f = "hc";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f63077g = "collation";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f63078h = "co";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f63079i = "colnumeric";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f63080j = "kn";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f63081k = "colcasefirst";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f63082l = "kf";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static HashMap<String, String> f63083m = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static HashMap<String, String> f63084n = new b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map<String, String> f63085o = new c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static Map<String, String> f63086p = new d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static Map<String, String> f63087q = new e();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static Map<String, String[]> f63088r = new f();

    class a extends HashMap<String, String> {
        a() {
            put(g.f63072b, g.f63071a);
            put(g.f63074d, g.f63073c);
            put(g.f63076f, g.f63075e);
            put(g.f63078h, g.f63077g);
            put(g.f63080j, g.f63079i);
            put(g.f63082l, g.f63081k);
        }
    }

    class b extends HashMap<String, String> {
        b() {
            put(g.f63071a, g.f63072b);
            put(g.f63073c, g.f63074d);
            put(g.f63075e, g.f63076f);
            put(g.f63077g, g.f63078h);
            put(g.f63079i, g.f63080j);
            put(g.f63081k, g.f63082l);
        }
    }

    class c extends HashMap<String, String> {
        c() {
            put("dictionary", "dict");
            put("phonebook", "phonebk");
            put("traditional", "trad");
            put("gb2312han", "gb2312");
        }
    }

    class d extends HashMap<String, String> {
        d() {
            put("gregorian", "gregory");
        }
    }

    class e extends HashMap<String, String> {
        e() {
            put("traditional", "traditio");
        }
    }

    class f extends HashMap<String, String[]> {
        f() {
            put("nu", new String[]{"adlm", "ahom", "arab", "arabext", "bali", "beng", "bhks", "brah", "cakm", "cham", "deva", "diak", "fullwide", "gong", "gonm", "gujr", "guru", "hanidec", "hmng", "hmnp", "java", "kali", "khmr", "knda", "lana", "lanatham", "laoo", "latn", "lepc", "limb", "mathbold", "mathdbl", "mathmono", "mathsanb", "mathsans", "mlym", "modi", "mong", "mroo", "mtei", "mymr", "mymrshan", "mymrtlng", "newa", "nkoo", "olck", "orya", "osma", "rohg", "saur", "segment", "shrd", "sind", "sinh", "sora", "sund", "takr", "talu", "tamldec", "telu", "thai", "tibt", "tirh", "vaii", "wara", "wcho"});
            put("co", new String[]{"big5han", "compat", "dict", DevicePublicKeyStringDef.DIRECT, "ducet", "emoji", "eor", "gb2312", "phonebk", "phonetic", "pinyin", "reformed", "searchjl", "stroke", "trad", "unihan", "zhuyin"});
            put("ca", new String[]{"buddhist", "chinese", "coptic", "dangi", "ethioaa", "ethiopic", "gregory", "hebrew", "indian", "islamic", "islamic-umalqura", "islamic-tbla", "islamic-civil", "islamic-rgsa", "iso8601", "japanese", "persian", "roc"});
        }
    }

    public static String a(String str) {
        return f63083m.containsKey(str) ? f63083m.get(str) : str;
    }

    public static String b(String str) {
        return f63084n.containsKey(str) ? f63084n.get(str) : str;
    }

    public static boolean c(String str, String str2, em.b bVar) {
        ULocale uLocale = (ULocale) bVar.getLocale();
        String[] availableNames = new String[0];
        if (str.equals("co")) {
            if (str2.equals("standard") || str2.equals("search")) {
                return false;
            }
            availableNames = Collator.getKeywordValuesForLocale("co", uLocale, false);
        } else if (str.equals("ca")) {
            availableNames = Calendar.getKeywordValuesForLocale("ca", uLocale, false);
        } else if (str.equals("nu")) {
            availableNames = NumberingSystem.getAvailableNames();
        }
        if (availableNames.length == 0) {
            return true;
        }
        return Arrays.asList(availableNames).contains(str2);
    }

    public static String d(String str) {
        return !f63086p.containsKey(str) ? str : f63086p.get(str);
    }

    public static String e(String str) {
        Map<String, String> map = f63085o;
        return !map.containsKey(str) ? str : map.get(str);
    }

    public static Object f(String str, Object obj) {
        if (str.equals("ca") && em.d.m(obj)) {
            return d((String) obj);
        }
        if (str.equals("nu") && em.d.m(obj)) {
            return g((String) obj);
        }
        if (str.equals("co") && em.d.m(obj)) {
            return e((String) obj);
        }
        if (str.equals("kn") && em.d.m(obj) && obj.equals("yes")) {
            return em.d.r("true");
        }
        return ((str.equals("kn") || str.equals("kf")) && em.d.m(obj) && obj.equals("no")) ? em.d.r("false") : obj;
    }

    public static String g(String str) {
        return !f63087q.containsKey(str) ? str : f63087q.get(str);
    }
}
