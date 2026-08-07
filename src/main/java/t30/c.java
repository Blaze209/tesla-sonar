package t30;

import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljava/util/Locale;", "Lt30/b;", "a", "(Ljava/util/Locale;)Lt30/b;", "stripe-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {
    public static final CountryCode a(Locale locale) {
        s.k(locale, "<this>");
        CountryCode.Companion companion = CountryCode.INSTANCE;
        String country = locale.getCountry();
        s.j(country, "getCountry(...)");
        return companion.a(country);
    }
}
