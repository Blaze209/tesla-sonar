package t30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\tJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\tJ\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0018\u0010#\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010$¨\u0006&"}, d2 = {"Lt30/d;", "", "<init>", "()V", "Ljava/util/Locale;", "currentLocale", "", "Lt30/a;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/util/Locale;)Ljava/util/List;", "g", "", "countryName", "Lt30/b;", "e", "(Ljava/lang/String;Ljava/util/Locale;)Lt30/b;", "countryCode", DateTokenConverter.CONVERTER_KEY, "(Lt30/b;Ljava/util/Locale;)Lt30/a;", "f", "name", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "a", "(Ljava/lang/String;)Z", "b", "(Lt30/b;)Z", "", "Ljava/util/Set;", "h", "()Ljava/util/Set;", "supportedBillingCountries", "CARD_POSTAL_CODE_COUNTRIES", "Ljava/util/Locale;", "cachedCountriesLocale", "Ljava/util/List;", "cachedOrderedLocalizedCountries", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static volatile Locale cachedCountriesLocale;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f112276a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Set<String> supportedBillingCountries = d1.i("AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CV", "CW", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MK", "ML", "MM", "MN", "MO", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", BouncyCastleProvider.PROVIDER_NAME, "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SZ", "TA", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VN", "VU", "WF", "WS", "XK", "YE", "YT", "ZA", "ZM", "ZW");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Set<String> CARD_POSTAL_CODE_COUNTRIES = d1.i("US", "GB", "CA");

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static volatile List<t30.a> cachedOrderedLocalizedCountries = v.m();

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            d dVar = d.f112276a;
            return mn0.a.d(dVar.c(((t30.a) t11).getName()), dVar.c(((t30.a) t12).getName()));
        }
    }

    private d() {
    }

    private final List<t30.a> g(Locale currentLocale) {
        Object next;
        if (s.f(currentLocale, cachedCountriesLocale)) {
            return cachedOrderedLocalizedCountries;
        }
        cachedCountriesLocale = currentLocale;
        List<t30.a> listI = i(currentLocale);
        Iterator<T> it = listI.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.f(((t30.a) next).b(), c.a(currentLocale)));
        List listQ = v.q(next);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI) {
            if (!s.f(((t30.a) obj).b(), c.a(currentLocale))) {
                arrayList.add(obj);
            }
        }
        cachedOrderedLocalizedCountries = v.P0(listQ, v.a1(arrayList, new a()));
        return cachedOrderedLocalizedCountries;
    }

    private final List<t30.a> i(Locale currentLocale) {
        Set<String> set = supportedBillingCountries;
        ArrayList arrayList = new ArrayList(v.y(set, 10));
        for (String str : set) {
            CountryCode countryCodeA = CountryCode.INSTANCE.a(str);
            String displayCountry = new Locale("", str).getDisplayCountry(currentLocale);
            s.j(displayCountry, "getDisplayCountry(...)");
            arrayList.add(new t30.a(countryCodeA, displayCountry));
        }
        return arrayList;
    }

    @jn0.e
    public final /* synthetic */ boolean a(String countryCode) {
        s.k(countryCode, "countryCode");
        Set<String> set = CARD_POSTAL_CODE_COUNTRIES;
        String upperCase = countryCode.toUpperCase(Locale.ROOT);
        s.j(upperCase, "toUpperCase(...)");
        return set.contains(upperCase);
    }

    public final /* synthetic */ boolean b(CountryCode countryCode) {
        s.k(countryCode, "countryCode");
        return CARD_POSTAL_CODE_COUNTRIES.contains(countryCode.getValue());
    }

    public final String c(String name) {
        s.k(name, "name");
        String lowerCase = name.toLowerCase(Locale.ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        String strNormalize = Normalizer.normalize(lowerCase, Normalizer.Form.NFD);
        s.j(strNormalize, "normalize(...)");
        return new q("[^\\p{ASCII}]").j(new q("[^A-Za-z ]").j(new q("\\p{Mn}+").j(strNormalize, ""), ""), "");
    }

    public final /* synthetic */ t30.a d(CountryCode countryCode, Locale currentLocale) {
        Object next;
        s.k(currentLocale, "currentLocale");
        Iterator<T> it = g(currentLocale).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (s.f(((t30.a) next).b(), countryCode)) {
                return (t30.a) next;
            }
        }
        next = null;
        return (t30.a) next;
    }

    public final /* synthetic */ CountryCode e(String countryName, Locale currentLocale) {
        Object next;
        s.k(countryName, "countryName");
        s.k(currentLocale, "currentLocale");
        Iterator<T> it = g(currentLocale).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.f(((t30.a) next).getName(), countryName));
        t30.a aVar = (t30.a) next;
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public final /* synthetic */ List f(Locale currentLocale) {
        s.k(currentLocale, "currentLocale");
        return g(currentLocale);
    }

    public final Set<String> h() {
        return supportedBillingCountries;
    }
}
