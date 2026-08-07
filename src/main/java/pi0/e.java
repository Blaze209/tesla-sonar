package pi0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jn0.x;
import oi0.Option;
import org.slf4j.Marker;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0004*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u0006*\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0013J\u0011\u0010\u0015\u001a\u00020\u0006*\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cR!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010$\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(¨\u0006*"}, d2 = {"Lpi0/e;", "", "<init>", "()V", "Loi0/e4;", "", "", "l", "(Loi0/e4;)Ljava/util/List;", "Lpi0/c;", "m", "(Lpi0/c;)Loi0/e4;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "candidate", "c", "(Ljava/lang/String;)Ljava/util/List;", "option", IntegerTokenConverter.CONVERTER_KEY, "(Loi0/e4;)Ljava/lang/String;", "e", "h", "countryCode", "g", "(Ljava/lang/String;)Loi0/e4;", "inputNumber", "Lpi0/k;", "k", "(Ljava/lang/String;)Lpi0/k;", "b", "Lkotlin/Lazy;", "f", "countryOptions", "Lpi0/c;", "j", "()Lpi0/c;", "usCountryCodeMetadata", "", "Ljava/util/Map;", "countryCodeToCountryMetadata", "Loi0/e4;", "DEFAULT_COUNTRY_OPTION", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f103042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy countryOptions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final CountryCodeMetadata usCountryCodeMetadata;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final Map<String, CountryCodeMetadata> countryCodeToCountryMetadata;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final Option DEFAULT_COUNTRY_OPTION;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d(((Option) t11).getText(), ((Option) t12).getText());
        }
    }

    static {
        e eVar = new e();
        f103042a = eVar;
        countryOptions = jn0.m.b(new wn0.a() { // from class: pi0.d
            @Override // wn0.a
            public final Object invoke() {
                return e.b();
            }
        });
        CountryCodeMetadata countryCodeMetadata = new CountryCodeMetadata("+1", "US", "(###) ###-####", null, 8, null);
        usCountryCodeMetadata = countryCodeMetadata;
        countryCodeToCountryMetadata = v0.m(x.a("US", countryCodeMetadata), x.a("CA", new CountryCodeMetadata("+1", "CA", "(###) ###-####", null, 8, null)), x.a("AG", new CountryCodeMetadata("+1", "AG", "(###) ###-####", null, 8, null)), x.a("AS", new CountryCodeMetadata("+1", "AS", "(###) ###-####", null, 8, null)), x.a("AI", new CountryCodeMetadata("+1", "AI", "(###) ###-####", null, 8, null)), x.a("BB", new CountryCodeMetadata("+1", "BB", "(###) ###-####", null, 8, null)), x.a("BM", new CountryCodeMetadata("+1", "BM", "(###) ###-####", null, 8, null)), x.a("BS", new CountryCodeMetadata("+1", "BS", "(###) ###-####", null, 8, null)), x.a("DM", new CountryCodeMetadata("+1", "DM", "(###) ###-####", null, 8, null)), x.a("DO", new CountryCodeMetadata("+1", "DO", "(###) ###-####", null, 8, null)), x.a("GD", new CountryCodeMetadata("+1", "GD", "(###) ###-####", null, 8, null)), x.a("GU", new CountryCodeMetadata("+1", "GU", "(###) ###-####", null, 8, null)), x.a("JM", new CountryCodeMetadata("+1", "JM", "(###) ###-####", null, 8, null)), x.a("KN", new CountryCodeMetadata("+1", "KN", "(###) ###-####", null, 8, null)), x.a("KY", new CountryCodeMetadata("+1", "KY", "(###) ###-####", null, 8, null)), x.a("LC", new CountryCodeMetadata("+1", "LC", "(###) ###-####", null, 8, null)), x.a("MP", new CountryCodeMetadata("+1", "MP", "(###) ###-####", null, 8, null)), x.a("MS", new CountryCodeMetadata("+1", "MS", "(###) ###-####", null, 8, null)), x.a("PR", new CountryCodeMetadata("+1", "PR", "(###) ###-####", null, 8, null)), x.a("SX", new CountryCodeMetadata("+1", "SX", "(###) ###-####", null, 8, null)), x.a("TC", new CountryCodeMetadata("+1", "TC", "(###) ###-####", null, 8, null)), x.a("TT", new CountryCodeMetadata("+1", "TT", "(###) ###-####", null, 8, null)), x.a("VC", new CountryCodeMetadata("+1", "VC", "(###) ###-####", null, 8, null)), x.a("VG", new CountryCodeMetadata("+1", "VG", "(###) ###-####", null, 8, null)), x.a("VI", new CountryCodeMetadata("+1", "VI", "(###) ###-####", null, 8, null)), x.a("EG", new CountryCodeMetadata("+20", "EG", "### ### ####", null, 8, null)), x.a("SS", new CountryCodeMetadata("+211", "SS", "### ### ###", null, 8, null)), x.a("MA", new CountryCodeMetadata("+212", "MA", "###-######", null, 8, null)), x.a("EH", new CountryCodeMetadata("+212", "EH", "###-######", null, 8, null)), x.a("DZ", new CountryCodeMetadata("+213", "DZ", "### ## ## ##", null, 8, null)), x.a("TN", new CountryCodeMetadata("+216", "TN", "## ### ###", null, 8, null)), x.a("LY", new CountryCodeMetadata("+218", "LY", "##-#######", null, 8, null)), x.a("GM", new CountryCodeMetadata("+220", "GM", "### ####", null, 8, null)), x.a("SN", new CountryCodeMetadata("+221", "SN", "## ### ## ##", null, 8, null)), x.a("MR", new CountryCodeMetadata("+222", "MR", "## ## ## ##", null, 8, null)), x.a("ML", new CountryCodeMetadata("+223", "ML", "## ## ## ##", null, 8, null)), x.a("GN", new CountryCodeMetadata("+224", "GN", "### ## ## ##", null, 8, null)), x.a("CI", new CountryCodeMetadata("+225", "CI", "## ## ## ##", null, 8, null)), x.a("BF", new CountryCodeMetadata("+226", "BF", "## ## ## ##", null, 8, null)), x.a("NE", new CountryCodeMetadata("+227", "NE", "## ## ## ##", null, 8, null)), x.a("TG", new CountryCodeMetadata("+228", "TG", "## ## ## ##", null, 8, null)), x.a("BJ", new CountryCodeMetadata("+229", "BJ", "## ## ## ##", null, 8, null)), x.a("MU", new CountryCodeMetadata("+230", "MU", "#### ####", null, 8, null)), x.a("LR", new CountryCodeMetadata("+231", "LR", "### ### ###", null, 8, null)), x.a("SL", new CountryCodeMetadata("+232", "SL", "## ######", null, 8, null)), x.a("GH", new CountryCodeMetadata("+233", "GH", "## ### ####", null, 8, null)), x.a("NG", new CountryCodeMetadata("+234", "NG", "### ### ####", null, 8, null)), x.a("TD", new CountryCodeMetadata("+235", "TD", "## ## ## ##", null, 8, null)), x.a("CF", new CountryCodeMetadata("+236", "CF", "## ## ## ##", null, 8, null)), x.a("CM", new CountryCodeMetadata("+237", "CM", "## ## ## ##", null, 8, null)), x.a("CV", new CountryCodeMetadata("+238", "CV", "### ## ##", null, 8, null)), x.a("ST", new CountryCodeMetadata("+239", "ST", "### ####", null, 8, null)), x.a("GQ", new CountryCodeMetadata("+240", "GQ", "### ### ###", null, 8, null)), x.a("GA", new CountryCodeMetadata("+241", "GA", "## ## ## ##", null, 8, null)), x.a("CG", new CountryCodeMetadata("+242", "CG", "## ### ####", null, 8, null)), x.a("CD", new CountryCodeMetadata("+243", "CD", "### ### ###", null, 8, null)), x.a("AO", new CountryCodeMetadata("+244", "AO", "### ### ###", null, 8, null)), x.a("GW", new CountryCodeMetadata("+245", "GW", "### ####", null, 8, null)), x.a("IO", new CountryCodeMetadata("+246", "IO", "### ####", null, 8, null)), x.a("AC", new CountryCodeMetadata("+247", "AC", null, null, 12, null)), x.a(BouncyCastleProvider.PROVIDER_NAME, new CountryCodeMetadata("+248", BouncyCastleProvider.PROVIDER_NAME, "# ### ###", null, 8, null)), x.a("RW", new CountryCodeMetadata("+250", "RW", "### ### ###", null, 8, null)), x.a("ET", new CountryCodeMetadata("+251", "ET", "## ### ####", null, 8, null)), x.a("SO", new CountryCodeMetadata("+252", "SO", "## #######", null, 8, null)), x.a("DJ", new CountryCodeMetadata("+253", "DJ", "## ## ## ##", null, 8, null)), x.a("KE", new CountryCodeMetadata("+254", "KE", "## #######", null, 8, null)), x.a("TZ", new CountryCodeMetadata("+255", "TZ", "### ### ###", null, 8, null)), x.a("UG", new CountryCodeMetadata("+256", "UG", "### ######", null, 8, null)), x.a("BI", new CountryCodeMetadata("+257", "BI", "## ## ## ##", null, 8, null)), x.a("MZ", new CountryCodeMetadata("+258", "MZ", "## ### ####", null, 8, null)), x.a("ZM", new CountryCodeMetadata("+260", "ZM", "## #######", null, 8, null)), x.a("MG", new CountryCodeMetadata("+261", "MG", "## ## ### ##", null, 8, null)), x.a("RE", new CountryCodeMetadata("+262", "RE", null, null, 12, null)), x.a("TF", new CountryCodeMetadata("+262", "TF", null, null, 12, null)), x.a("YT", new CountryCodeMetadata("+262", "YT", "### ## ## ##", null, 8, null)), x.a("ZW", new CountryCodeMetadata("+263", "ZW", "## ### ####", null, 8, null)), x.a("NA", new CountryCodeMetadata("+264", "NA", "## ### ####", null, 8, null)), x.a("MW", new CountryCodeMetadata("+265", "MW", "### ## ## ##", null, 8, null)), x.a("LS", new CountryCodeMetadata("+266", "LS", "#### ####", null, 8, null)), x.a("BW", new CountryCodeMetadata("+267", "BW", "## ### ###", null, 8, null)), x.a("SZ", new CountryCodeMetadata("+268", "SZ", "#### ####", null, 8, null)), x.a("KM", new CountryCodeMetadata("+269", "KM", "### ## ##", null, 8, null)), x.a("ZA", new CountryCodeMetadata("+27", "ZA", "## ### ####", null, 8, null)), x.a("SH", new CountryCodeMetadata("+290", "SH", null, null, 12, null)), x.a("TA", new CountryCodeMetadata("+290", "TA", null, null, 12, null)), x.a("ER", new CountryCodeMetadata("+291", "ER", "# ### ###", null, 8, null)), x.a("AW", new CountryCodeMetadata("+297", "AW", "### ####", null, 8, null)), x.a("FO", new CountryCodeMetadata("+298", "FO", "######", null, 8, null)), x.a("GL", new CountryCodeMetadata("+299", "GL", "## ## ##", null, 8, null)), x.a("GR", new CountryCodeMetadata("+30", "GR", "### ### ####", null, 8, null)), x.a("NL", new CountryCodeMetadata("+31", "NL", "# ########", null, 8, null)), x.a("BE", new CountryCodeMetadata("+32", "BE", "### ## ## ##", null, 8, null)), x.a("FR", new CountryCodeMetadata("+33", "FR", "# ## ## ## ##", null, 8, null)), x.a("ES", new CountryCodeMetadata("+34", "ES", "### ## ## ##", null, 8, null)), x.a("GI", new CountryCodeMetadata("+350", "GI", "### #####", null, 8, null)), x.a("PT", new CountryCodeMetadata("+351", "PT", "### ### ###", null, 8, null)), x.a("LU", new CountryCodeMetadata("+352", "LU", "## ## ## ###", null, 8, null)), x.a("IE", new CountryCodeMetadata("+353", "IE", "## ### ####", null, 8, null)), x.a("IS", new CountryCodeMetadata("+354", "IS", "### ####", null, 8, null)), x.a("AL", new CountryCodeMetadata("+355", "AL", "## ### ####", null, 8, null)), x.a("MT", new CountryCodeMetadata("+356", "MT", "#### ####", null, 8, null)), x.a("CY", new CountryCodeMetadata("+357", "CY", "## ######", null, 8, null)), x.a("FI", new CountryCodeMetadata("+358", "FI", "## ### ## ##", null, 8, null)), x.a("AX", new CountryCodeMetadata("+358", "AX", null, null, 12, null)), x.a("BG", new CountryCodeMetadata("+359", "BG", "### ### ##", null, 8, null)), x.a("HU", new CountryCodeMetadata("+36", "HU", "## ### ####", null, 8, null)), x.a("LT", new CountryCodeMetadata("+370", "LT", "### #####", null, 8, null)), x.a("LV", new CountryCodeMetadata("+371", "LV", "## ### ###", null, 8, null)), x.a("EE", new CountryCodeMetadata("+372", "EE", "#### ####", null, 8, null)), x.a("MD", new CountryCodeMetadata("+373", "MD", "### ## ###", null, 8, null)), x.a("AM", new CountryCodeMetadata("+374", "AM", "## ######", null, 8, null)), x.a("BY", new CountryCodeMetadata("+375", "BY", "## ###-##-##", null, 8, null)), x.a("AD", new CountryCodeMetadata("+376", "AD", "### ###", null, 8, null)), x.a("MC", new CountryCodeMetadata("+377", "MC", "# ## ## ## ##", null, 8, null)), x.a("SM", new CountryCodeMetadata("+378", "SM", "## ## ## ##", null, 8, null)), x.a("VA", new CountryCodeMetadata("+379", "VA", null, null, 12, null)), x.a("UA", new CountryCodeMetadata("+380", "UA", "## ### ####", null, 8, null)), x.a("RS", new CountryCodeMetadata("+381", "RS", "## #######", null, 8, null)), x.a("ME", new CountryCodeMetadata("+382", "ME", "## ### ###", null, 8, null)), x.a("XK", new CountryCodeMetadata("+383", "XK", "## ### ###", null, 8, null)), x.a("HR", new CountryCodeMetadata("+385", "HR", "## ### ####", null, 8, null)), x.a("SI", new CountryCodeMetadata("+386", "SI", "## ### ###", null, 8, null)), x.a("BA", new CountryCodeMetadata("+387", "BA", "## ###-###", null, 8, null)), x.a("MK", new CountryCodeMetadata("+389", "MK", "## ### ###", null, 8, null)), x.a("IT", new CountryCodeMetadata("+39", "IT", "## #### ####", null, 8, null)), x.a("RO", new CountryCodeMetadata("+40", "RO", "## ### ####", null, 8, null)), x.a("CH", new CountryCodeMetadata("+41", "CH", "## ### ## ##", null, 8, null)), x.a("CZ", new CountryCodeMetadata("+420", "CZ", "### ### ###", null, 8, null)), x.a("SK", new CountryCodeMetadata("+421", "SK", "### ### ###", null, 8, null)), x.a("LI", new CountryCodeMetadata("+423", "LI", "### ### ###", null, 8, null)), x.a("AT", new CountryCodeMetadata("+43", "AT", "### ######", null, 8, null)), x.a("GB", new CountryCodeMetadata("+44", "GB", "#### ######", null, 8, null)), x.a("GG", new CountryCodeMetadata("+44", "GG", "#### ######", null, 8, null)), x.a("JE", new CountryCodeMetadata("+44", "JE", "#### ######", null, 8, null)), x.a("IM", new CountryCodeMetadata("+44", "IM", "#### ######", null, 8, null)), x.a("DK", new CountryCodeMetadata("+45", "DK", "## ## ## ##", null, 8, null)), x.a("SE", new CountryCodeMetadata("+46", "SE", "##-### ## ##", null, 8, null)), x.a("NO", new CountryCodeMetadata("+47", "NO", "### ## ###", null, 8, null)), x.a("BV", new CountryCodeMetadata("+47", "BV", null, null, 12, null)), x.a("SJ", new CountryCodeMetadata("+47", "SJ", "## ## ## ##", null, 8, null)), x.a("PL", new CountryCodeMetadata("+48", "PL", "## ### ## ##", null, 8, null)), x.a("DE", new CountryCodeMetadata("+49", "DE", "### #######", null, 8, null)), x.a("FK", new CountryCodeMetadata("+500", "FK", null, null, 12, null)), x.a("GS", new CountryCodeMetadata("+500", "GS", null, null, 12, null)), x.a("BZ", new CountryCodeMetadata("+501", "BZ", "###-####", null, 8, null)), x.a("GT", new CountryCodeMetadata("+502", "GT", "#### ####", null, 8, null)), x.a("SV", new CountryCodeMetadata("+503", "SV", "#### ####", null, 8, null)), x.a("HN", new CountryCodeMetadata("+504", "HN", "####-####", null, 8, null)), x.a("NI", new CountryCodeMetadata("+505", "NI", "#### ####", null, 8, null)), x.a("CR", new CountryCodeMetadata("+506", "CR", "#### ####", null, 8, null)), x.a("PA", new CountryCodeMetadata("+507", "PA", "####-####", null, 8, null)), x.a("PM", new CountryCodeMetadata("+508", "PM", "## ## ##", null, 8, null)), x.a("HT", new CountryCodeMetadata("+509", "HT", "## ## ####", null, 8, null)), x.a("PE", new CountryCodeMetadata("+51", "PE", "### ### ###", null, 8, null)), x.a("MX", new CountryCodeMetadata("+52", "MX", "### ### ####", null, 8, null)), x.a("AR", new CountryCodeMetadata("+54", "AR", "## ##-####-####", null, 8, null)), x.a("BR", new CountryCodeMetadata("+55", "BR", "## #####-####", null, 8, null)), x.a("CL", new CountryCodeMetadata("+56", "CL", "# #### ####", null, 8, null)), x.a("CO", new CountryCodeMetadata("+57", "CO", "### #######", null, 8, null)), x.a("VE", new CountryCodeMetadata("+58", "VE", "###-#######", null, 8, null)), x.a("BL", new CountryCodeMetadata("+590", "BL", "### ## ## ##", null, 8, null)), x.a("MF", new CountryCodeMetadata("+590", "MF", null, null, 12, null)), x.a("GP", new CountryCodeMetadata("+590", "GP", "### ## ## ##", null, 8, null)), x.a("BO", new CountryCodeMetadata("+591", "BO", "########", null, 8, null)), x.a("GY", new CountryCodeMetadata("+592", "GY", "### ####", null, 8, null)), x.a("EC", new CountryCodeMetadata("+593", "EC", "## ### ####", null, 8, null)), x.a("GF", new CountryCodeMetadata("+594", "GF", "### ## ## ##", null, 8, null)), x.a("PY", new CountryCodeMetadata("+595", "PY", "## #######", null, 8, null)), x.a("MQ", new CountryCodeMetadata("+596", "MQ", "### ## ## ##", null, 8, null)), x.a("SR", new CountryCodeMetadata("+597", "SR", "###-####", null, 8, null)), x.a("UY", new CountryCodeMetadata("+598", "UY", "#### ####", null, 8, null)), x.a("CW", new CountryCodeMetadata("+599", "CW", "# ### ####", null, 8, null)), x.a("BQ", new CountryCodeMetadata("+599", "BQ", "### ####", null, 8, null)), x.a("MY", new CountryCodeMetadata("+60", "MY", "##-### ####", null, 8, null)), x.a("AU", new CountryCodeMetadata("+61", "AU", "### ### ###", null, 8, null)), x.a("ID", new CountryCodeMetadata("+62", "ID", "###-###-###", null, 8, null)), x.a("PH", new CountryCodeMetadata("+63", "PH", "#### ######", null, 8, null)), x.a("NZ", new CountryCodeMetadata("+64", "NZ", "## ### ####", null, 8, null)), x.a("SG", new CountryCodeMetadata("+65", "SG", "#### ####", null, 8, null)), x.a("TH", new CountryCodeMetadata("+66", "TH", "## ### ####", null, 8, null)), x.a("TL", new CountryCodeMetadata("+670", "TL", "#### ####", null, 8, null)), x.a("AQ", new CountryCodeMetadata("+672", "AQ", "## ####", null, 8, null)), x.a("BN", new CountryCodeMetadata("+673", "BN", "### ####", null, 8, null)), x.a("NR", new CountryCodeMetadata("+674", "NR", "### ####", null, 8, null)), x.a("PG", new CountryCodeMetadata("+675", "PG", "### ####", null, 8, null)), x.a("TO", new CountryCodeMetadata("+676", "TO", "### ####", null, 8, null)), x.a("SB", new CountryCodeMetadata("+677", "SB", "### ####", null, 8, null)), x.a("VU", new CountryCodeMetadata("+678", "VU", "### ####", null, 8, null)), x.a("FJ", new CountryCodeMetadata("+679", "FJ", "### ####", null, 8, null)), x.a("WF", new CountryCodeMetadata("+681", "WF", "## ## ##", null, 8, null)), x.a("CK", new CountryCodeMetadata("+682", "CK", "## ###", null, 8, null)), x.a("NU", new CountryCodeMetadata("+683", "NU", null, null, 12, null)), x.a("WS", new CountryCodeMetadata("+685", "WS", null, null, 12, null)), x.a("KI", new CountryCodeMetadata("+686", "KI", null, null, 12, null)), x.a("NC", new CountryCodeMetadata("+687", "NC", "########", null, 8, null)), x.a("TV", new CountryCodeMetadata("+688", "TV", null, null, 12, null)), x.a("PF", new CountryCodeMetadata("+689", "PF", "## ## ##", null, 8, null)), x.a("TK", new CountryCodeMetadata("+690", "TK", null, null, 12, null)), x.a("RU", new CountryCodeMetadata("+7", "RU", "### ###-##-##", null, 8, null)), x.a("KZ", new CountryCodeMetadata("+7", "KZ", null, null, 12, null)), x.a("JP", new CountryCodeMetadata("+81", "JP", "##-####-####", null, 8, null)), x.a("KR", new CountryCodeMetadata("+82", "KR", "##-####-####", null, 8, null)), x.a("VN", new CountryCodeMetadata("+84", "VN", "## ### ## ##", null, 8, null)), x.a("HK", new CountryCodeMetadata("+852", "HK", "#### ####", null, 8, null)), x.a("MO", new CountryCodeMetadata("+853", "MO", "#### ####", null, 8, null)), x.a("KH", new CountryCodeMetadata("+855", "KH", "## ### ###", null, 8, null)), x.a("LA", new CountryCodeMetadata("+856", "LA", "## ## ### ###", null, 8, null)), x.a("CN", new CountryCodeMetadata("+86", "CN", "### #### ####", null, 8, null)), x.a("PN", new CountryCodeMetadata("+872", "PN", null, null, 12, null)), x.a("BD", new CountryCodeMetadata("+880", "BD", "####-######", null, 8, null)), x.a("TW", new CountryCodeMetadata("+886", "TW", "### ### ###", null, 8, null)), x.a("TR", new CountryCodeMetadata("+90", "TR", "### ### ####", null, 8, null)), x.a("IN", new CountryCodeMetadata("+91", "IN", "## ## ######", null, 8, null)), x.a("PK", new CountryCodeMetadata("+92", "PK", "### #######", null, 8, null)), x.a("AF", new CountryCodeMetadata("+93", "AF", "## ### ####", null, 8, null)), x.a("LK", new CountryCodeMetadata("+94", "LK", "## # ######", null, 8, null)), x.a("MM", new CountryCodeMetadata("+95", "MM", "# ### ####", null, 8, null)), x.a("MV", new CountryCodeMetadata("+960", "MV", "###-####", null, 8, null)), x.a("LB", new CountryCodeMetadata("+961", "LB", "## ### ###", null, 8, null)), x.a("JO", new CountryCodeMetadata("+962", "JO", "# #### ####", null, 8, null)), x.a("IQ", new CountryCodeMetadata("+964", "IQ", "### ### ####", null, 8, null)), x.a("KW", new CountryCodeMetadata("+965", "KW", "### #####", null, 8, null)), x.a("SA", new CountryCodeMetadata("+966", "SA", "## ### ####", null, 8, null)), x.a("YE", new CountryCodeMetadata("+967", "YE", "### ### ###", null, 8, null)), x.a("OM", new CountryCodeMetadata("+968", "OM", "#### ####", null, 8, null)), x.a("PS", new CountryCodeMetadata("+970", "PS", "### ### ###", null, 8, null)), x.a("AE", new CountryCodeMetadata("+971", "AE", "## ### ####", null, 8, null)), x.a("IL", new CountryCodeMetadata("+972", "IL", "##-###-####", null, 8, null)), x.a("BH", new CountryCodeMetadata("+973", "BH", "#### ####", null, 8, null)), x.a("QA", new CountryCodeMetadata("+974", "QA", "#### ####", null, 8, null)), x.a("BT", new CountryCodeMetadata("+975", "BT", "## ## ## ##", null, 8, null)), x.a("MN", new CountryCodeMetadata("+976", "MN", "#### ####", null, 8, null)), x.a("NP", new CountryCodeMetadata("+977", "NP", "###-#######", null, 8, null)), x.a("TJ", new CountryCodeMetadata("+992", "TJ", "### ## ####", null, 8, null)), x.a("TM", new CountryCodeMetadata("+993", "TM", "## ##-##-##", null, 8, null)), x.a("AZ", new CountryCodeMetadata("+994", "AZ", "## ### ## ##", null, 8, null)), x.a("GE", new CountryCodeMetadata("+995", "GE", "### ## ## ##", null, 8, null)), x.a("KG", new CountryCodeMetadata("+996", "KG", "### ### ###", null, 8, null)), x.a("UZ", new CountryCodeMetadata("+998", "UZ", "## ### ## ##", null, 8, null)));
        DEFAULT_COUNTRY_OPTION = eVar.m(countryCodeMetadata);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b() {
        return f103042a.d();
    }

    private final List<CountryCodeMetadata> c(String candidate) {
        Collection<CountryCodeMetadata> collectionValues = countryCodeToCountryMetadata.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (s.f(((CountryCodeMetadata) obj).getPrefix(), candidate)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List<Option> d() {
        Option optionM = m(usCountryCodeMetadata);
        Map<String, CountryCodeMetadata> map = countryCodeToCountryMetadata;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, CountryCodeMetadata> entry : map.entrySet()) {
            if (!s.f(entry.getKey(), optionM.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(f103042a.m((CountryCodeMetadata) ((Map.Entry) it.next()).getValue()));
        }
        return v.P0(v.e(optionM), v.a1(arrayList, new a()));
    }

    private final List<String> l(Option option) {
        return t.f1(t.F1(option.getValue()).toString(), new String[]{" "}, false, 0, 6, null);
    }

    private final Option m(CountryCodeMetadata countryCodeMetadata) {
        String strD = countryCodeMetadata.d();
        String upperCase = countryCodeMetadata.getCountryCode().toUpperCase(Locale.ROOT);
        s.j(upperCase, "toUpperCase(...)");
        return new Option(strD, upperCase + " " + countryCodeMetadata.getPrefix());
    }

    public final String e(Option option) {
        s.k(option, "<this>");
        String upperCase = t.F1((String) v.o0(l(option))).toString().toUpperCase(Locale.ROOT);
        s.j(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public final List<Option> f() {
        return (List) countryOptions.getValue();
    }

    public final Option g(String countryCode) {
        Option optionM;
        if (countryCode == null || countryCode.length() != 2) {
            return DEFAULT_COUNTRY_OPTION;
        }
        String upperCase = countryCode.toUpperCase(Locale.ROOT);
        s.j(upperCase, "toUpperCase(...)");
        CountryCodeMetadata countryCodeMetadata = countryCodeToCountryMetadata.get(upperCase);
        return (countryCodeMetadata == null || (optionM = m(countryCodeMetadata)) == null) ? DEFAULT_COUNTRY_OPTION : optionM;
    }

    public final String h(Option option) {
        s.k(option, "<this>");
        return t.F1((String) v.A0(l(option))).toString();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public final String i(Option option) {
        s.k(option, "option");
        List listF1 = t.f1(option.getText(), new String[]{" "}, false, 0, 6, null);
        String text = (String) v.r0(listF1, 0);
        if (text == null) {
            text = DEFAULT_COUNTRY_OPTION.getText();
        }
        String str = (String) v.C0(listF1);
        if (str == null) {
            str = "";
        } else {
            if (!t.b0(str, Marker.ANY_NON_NULL_MARKER, false, 2, null)) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
        }
        return t.F1(text + " " + str).toString();
    }

    public final CountryCodeMetadata j() {
        return usCountryCodeMetadata;
    }

    public final PhoneNumberInfo k(String inputNumber) {
        Object next;
        String countryCode;
        String country;
        s.k(inputNumber, "inputNumber");
        String string = t.F1(inputNumber).toString();
        if (!t.b0(string, Marker.ANY_NON_NULL_MARKER, false, 2, null)) {
            string = Marker.ANY_NON_NULL_MARKER + string;
        }
        String countryCode2 = usCountryCodeMetadata.getCountryCode();
        for (int i11 = 4; 1 < i11; i11--) {
            if (string.length() >= i11) {
                String strSubstring = string.substring(0, i11);
                s.j(strSubstring, "substring(...)");
                List<CountryCodeMetadata> listC = c(strSubstring);
                if (!listC.isEmpty()) {
                    if (listC.size() != 1) {
                        Iterator<T> it = listC.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            countryCode = ((CountryCodeMetadata) next).getCountryCode();
                            country = Locale.getDefault().getCountry();
                            s.j(country, "getCountry(...)");
                        } while (!countryCode.contentEquals(country));
                        CountryCodeMetadata countryCodeMetadata = (CountryCodeMetadata) next;
                        if (countryCodeMetadata != null && (countryCode2 = countryCodeMetadata.getCountryCode()) != null) {
                            break;
                        }
                        countryCode2 = ((CountryCodeMetadata) v.o0(listC)).getCountryCode();
                        break;
                    }
                    countryCode2 = listC.get(0).getCountryCode();
                    break;
                }
            }
        }
        CountryCodeMetadata countryCodeMetadata2 = countryCodeToCountryMetadata.get(countryCode2);
        String prefix = countryCodeMetadata2 != null ? countryCodeMetadata2.getPrefix() : null;
        return (prefix == null || prefix.length() == 0) ? new PhoneNumberInfo(countryCode2, t.F1(t.M1(string, 1)).toString()) : new PhoneNumberInfo(countryCode2, t.F1(t.M1(string, prefix.length())).toString());
    }
}
