package com.henninghall.date_picker;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.EnumMap;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static EnumMap<c, String> f45189a = c("EEE, MMM d", DateTokenConverter.CONVERTER_KEY, "y");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap<String, EnumMap<c, String>> f45190b = new a();

    class a extends HashMap<String, EnumMap<c, String>> {
        a() {
            put("af", f.c("EEE d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("am", f.c("EEE፣ MMM d", DateTokenConverter.CONVERTER_KEY, "y"));
            put("ar", f.c("EEE، d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("ar_DZ", f.c("EEE، d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("ar_EG", f.c("EEE، d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("az", f.c("d MMM, EEE", DateTokenConverter.CONVERTER_KEY, "y"));
            put("be", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("bg", f.c("EEE, d.MM", DateTokenConverter.CONVERTER_KEY, "y 'г'."));
            put("bn", f.c("EEE d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("br", f.c("EEE d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("bs", f.c("EEE, d. MMM", "d.", "y."));
            put("ca", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("chr", f.c("EEE, MMM d", DateTokenConverter.CONVERTER_KEY, "y"));
            put("cs", f.c("EEE d. M.", "d.", "y"));
            put("cy", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("da", f.c("EEE d. MMM", "d.", "y"));
            put("de", f.c("EEE, d. MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("de_AT", f.c("EEE, d. MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("de_CH", f.c("EEE, d. MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("el", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("en", f.c("EEE, MMM d", DateTokenConverter.CONVERTER_KEY, "y"));
            put("en_AU", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("en_CA", f.c("EEE, MMM d", DateTokenConverter.CONVERTER_KEY, "y"));
            put("en_GB", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("en_IE", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("en_IN", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("en_SG", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("en_US", f.c("EEE, MMM d", DateTokenConverter.CONVERTER_KEY, "y"));
            put("en_ZA", f.c("EEE, dd MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("es", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("es_419", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("es_ES", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("es_MX", f.c("EEE d 'de' MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("es_US", f.c("EEE, d 'de' MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("et", f.c("EEE, d. MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("eu", f.c("MMM d, EEE", DateTokenConverter.CONVERTER_KEY, "y"));
            put("fa", f.c("EEE d LLL", DateTokenConverter.CONVERTER_KEY, "y"));
            put("fi", f.c("EEE d. MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("fil", f.c("EEE, MMM d", DateTokenConverter.CONVERTER_KEY, "y"));
            put("fr", f.c("EEE d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("fr_CA", f.c("EEE d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("ga", f.c("EEE d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("gl", f.c("EEE, d 'de' MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("gsw", f.c("EEE d. MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("gu", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("haw", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("he", f.c("EEE, d בMMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("hi", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("hr", f.c("EEE, d. MMM", "d.", "y."));
            put("hu", f.c("MMM d., EEE", DateTokenConverter.CONVERTER_KEY, "y."));
            put("hy", f.c("d MMM, EEE", DateTokenConverter.CONVERTER_KEY, "y"));
            put("id", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("in", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("is", f.c("EEE, d. MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("it", f.c("EEE d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("iw", f.c("EEE, d בMMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("ja", f.c("M月d日 EEE", "d日", "y年"));
            put("ka", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("kk", f.c("d MMM, EEE", DateTokenConverter.CONVERTER_KEY, "y"));
            put("km", f.c("EEE d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("kn", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("ko", f.c("MMM d일 EEE", "d일", "y년"));
            put("ky", f.c("d-MMM, EEE", DateTokenConverter.CONVERTER_KEY, "y"));
            put("lb", f.c("EEE d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("ln", f.c("EEE d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("lo", f.c("EEE d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("lt", f.c("MM-dd, EEE", "dd", "y"));
            put("lv", f.c("EEE, d. MMM", DateTokenConverter.CONVERTER_KEY, "y. 'g'."));
            put("mk", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("ml", f.c("MMM d, EEE", DateTokenConverter.CONVERTER_KEY, "y"));
            put("mn", f.c("MMM'ын' d. EEE", DateTokenConverter.CONVERTER_KEY, "y"));
            put("mo", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("mr", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("ms", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("mt", f.c("EEE, d 'ta'’ MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("my", f.c("MMM d၊ EEE", DateTokenConverter.CONVERTER_KEY, "y"));
            put("nb", f.c("EEE d. MMM", "d.", "y"));
            put("ne", f.c("MMM d, EEE", DateTokenConverter.CONVERTER_KEY, "y"));
            put("nl", f.c("EEE d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("nn", f.c("EEE d. MMM", "d.", "y"));
            put("no", f.c("EEE d. MMM", "d.", "y"));
            put("no_NO", f.c("EEE d. MMM", "d.", "y"));
            put("or", f.c("EEE, MMM d", DateTokenConverter.CONVERTER_KEY, "y"));
            put("pa", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("pl", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("pt", f.c("EEE, d 'de' MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("pt_BR", f.c("EEE, d 'de' MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("pt_PT", f.c("EEE, d/MM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("ro", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("ru", f.c("ccc, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("sh", f.c("EEE d. MMM", DateTokenConverter.CONVERTER_KEY, "y."));
            put("si", f.c("MMM d EEE", DateTokenConverter.CONVERTER_KEY, "y"));
            put("sk", f.c("EEE d. M.", "d.", "y"));
            put("sl", f.c("EEE, d. MMM", "d.", "y"));
            put("sq", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("sr", f.c("EEE d. MMM", DateTokenConverter.CONVERTER_KEY, "y."));
            put("sr_Latn", f.c("EEE d. MMM", DateTokenConverter.CONVERTER_KEY, "y."));
            put("sv", f.c("EEE d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("sw", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("ta", f.c("MMM d, EEE", DateTokenConverter.CONVERTER_KEY, "y"));
            put("te", f.c("d MMM, EEE", DateTokenConverter.CONVERTER_KEY, "y"));
            put("th", f.c("EEE d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("tl", f.c("EEE, MMM d", DateTokenConverter.CONVERTER_KEY, "y"));
            put("tr", f.c("d MMMM EEE", DateTokenConverter.CONVERTER_KEY, "y"));
            put("uk", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("ur", f.c("EEE، d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("uz", f.c("EEE, d-MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("vi", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("zh", f.c("M月d日EEE", "d日", "y年"));
            put("zh_CN", f.c("M月d日EEE", "d日", "y年"));
            put("zh_HK", f.c("M月d日EEE", "d日", "y年"));
            put("zh_TW", f.c("M月d日 EEE", "d日", "y年"));
            put("zu", f.c("EEE, MMM d", DateTokenConverter.CONVERTER_KEY, "y"));
            put("en_ISO", f.c("EEE, MMM d", DateTokenConverter.CONVERTER_KEY, "y"));
            put("en_MY", f.c("EEE, d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("fr_CH", f.c("EEE d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("it_CH", f.c("EEE d MMM", DateTokenConverter.CONVERTER_KEY, "y"));
            put("ps", f.c("MMM d, EEE", DateTokenConverter.CONVERTER_KEY, "y"));
        }
    }

    class b extends EnumMap<c, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f45191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f45193c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Class cls, String str, String str2, String str3) {
            super(cls);
            this.f45191a = str;
            this.f45192b = str2;
            this.f45193c = str3;
            put(c.MMMEd, str);
            put(c.d, str2);
            put(c.y, str3);
        }
    }

    public enum c {
        MMMEd,
        d,
        y
    }

    static class d extends Exception {
        d() {
        }
    }

    public static String b(String str, c cVar) throws d {
        try {
            return f45190b.get(str).get(cVar).replaceAll(",", "");
        } catch (NullPointerException unused) {
            throw new d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EnumMap<c, String> c(String str, String str2, String str3) {
        return new b(c.class, str, str2, str3);
    }
}
