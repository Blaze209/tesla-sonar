package com.tesla.domain.model;

import android.content.Context;
import android.os.LocaleList;
import androidx.annotation.Keep;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.tesla.logging.g;
import ie0.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import td0.m;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b,\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-¨\u0006."}, d2 = {"Lcom/tesla/domain/model/DataRestrictedCountry;", "", "", "iso2", "iso3", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getIso2", "()Ljava/lang/String;", "getIso3", "Companion", "a", "CHINA", "AUSTRIA", "BELGIUM", "BULGARIA", "CROATIA", "CYPRUS", "CZECHIA", "DENMARK", "ESTONIA", "FINLAND", "FRANCE", "GERMANY", "GREECE", "HUNGARY", "IRELAND", "ITALY", "LATVIA", "LITHUANIA", "LUXEMBOURG", "MALTA", "NETHERLANDS", "POLAND", "PORTUGAL", "ROMANIA", "SLOVAKIA", "SLOVENIA", "SPAIN", "SWEDEN", "ICELAND", "LIECHTENSTEIN", "NORWAY", "SWITZERLAND", "UNITEDKINGDOM", "domain_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum DataRestrictedCountry {
    CHINA("cn", "CHN"),
    AUSTRIA("at", "AUT"),
    BELGIUM("be", "BEL"),
    BULGARIA("bg", "BGR"),
    CROATIA("hr", "HRV"),
    CYPRUS("cy", "CYP"),
    CZECHIA("cz", "CZE"),
    DENMARK("dk", "DNK"),
    ESTONIA("ee", "EST"),
    FINLAND("fi", "FIN"),
    FRANCE("fr", "FRA"),
    GERMANY("de", "DEU"),
    GREECE("gr", "GRC"),
    HUNGARY("hu", "HUN"),
    IRELAND("ie", "IRL"),
    ITALY("it", "ITA"),
    LATVIA("lv", "LVA"),
    LITHUANIA("lt", "LTU"),
    LUXEMBOURG("lu", "LUX"),
    MALTA("mt", "MLT"),
    NETHERLANDS("nl", "NLD"),
    POLAND("pl", "POL"),
    PORTUGAL("pt", "PRT"),
    ROMANIA("ro", "ROU"),
    SLOVAKIA("sk", "SVK"),
    SLOVENIA("si", "SVN"),
    SPAIN("es", "ESP"),
    SWEDEN("se", "SWE"),
    ICELAND("is", "ISL"),
    LIECHTENSTEIN("li", "LIE"),
    NORWAY("no", "nor"),
    SWITZERLAND("ch", "CHE"),
    UNITEDKINGDOM("gb", "GBR");

    private static final String SHARE_APP_ANALYTICS = "SHARE_APP_ANALYTICS";
    private static final HashSet<String> iso2Countries;
    private static final HashSet<String> iso3Countries;
    private final String iso2;
    private final String iso3;
    private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "DataRestrictedCountry";
    private static final g logger = g.INSTANCE.a(TAG);

    /* JADX INFO: renamed from: com.tesla.domain.model.DataRestrictedCountry$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001a\u001a\u0014\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00040\u00040\u0017j\u0002`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\u001c\u001a\u0014\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00040\u00040\u0017j\u0002`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/tesla/domain/model/DataRestrictedCountry$a;", "", "<init>", "()V", "", "countryCode", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "b", "(Landroid/content/Context;)Z", "c", "Lcom/tesla/domain/model/DataRestrictedCountry$a$a;", "a", "(Landroid/content/Context;)Lcom/tesla/domain/model/DataRestrictedCountry$a$a;", "TAG", "Ljava/lang/String;", DataRestrictedCountry.SHARE_APP_ANALYTICS, "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "Ljava/util/HashSet;", "kotlin.jvm.PlatformType", "Lkotlin/collections/HashSet;", "iso2Countries", "Ljava/util/HashSet;", "iso3Countries", "domain_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.tesla.domain.model.DataRestrictedCountry$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/tesla/domain/model/DataRestrictedCountry$a$a;", "", "", "network", "sim", "Landroid/os/LocaleList;", "locales", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/LocaleList;)V", "a", "()Ljava/lang/String;", "b", "c", "()Landroid/os/LocaleList;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNetwork", "getSim", "Landroid/os/LocaleList;", "getLocales", "domain_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CountryCodes {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String network;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String sim;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final LocaleList locales;

            public CountryCodes(String str, String str2, LocaleList locales) {
                s.k(locales, "locales");
                this.network = str;
                this.sim = str2;
                this.locales = locales;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getNetwork() {
                return this.network;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getSim() {
                return this.sim;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final LocaleList getLocales() {
                return this.locales;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CountryCodes)) {
                    return false;
                }
                CountryCodes countryCodes = (CountryCodes) other;
                return s.f(this.network, countryCodes.network) && s.f(this.sim, countryCodes.sim) && s.f(this.locales, countryCodes.locales);
            }

            public int hashCode() {
                String str = this.network;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.sim;
                return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.locales.hashCode();
            }

            public String toString() {
                return "CountryCodes(network=" + this.network + ", sim=" + this.sim + ", locales=" + this.locales + ")";
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean d(String countryCode) {
            HashSet hashSet = DataRestrictedCountry.iso2Countries;
            Locale locale = Locale.ROOT;
            String lowerCase = countryCode.toLowerCase(locale);
            s.j(lowerCase, "toLowerCase(...)");
            if (hashSet.contains(lowerCase)) {
                return true;
            }
            HashSet hashSet2 = DataRestrictedCountry.iso3Countries;
            String upperCase = countryCode.toUpperCase(locale);
            s.j(upperCase, "toUpperCase(...)");
            return hashSet2.contains(upperCase);
        }

        public final CountryCodes a(Context context) {
            s.k(context, "context");
            k kVar = k.f77594a;
            String strA = kVar.a(context);
            String strB = kVar.b(context);
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            s.j(locales, "getLocales(...)");
            return new CountryCodes(strA, strB, locales);
        }

        public final boolean b(Context context) {
            String iSO3Country;
            s.k(context, "context");
            CountryCodes countryCodesA = a(context);
            String network = countryCodesA.getNetwork();
            String sim = countryCodesA.getSim();
            LocaleList locales = countryCodesA.getLocales();
            if (network != null && !t.y0(network) && d(network)) {
                return true;
            }
            if (sim != null && !t.y0(sim) && d(sim)) {
                return true;
            }
            if (!locales.isEmpty()) {
                Locale locale = locales.get(0);
                String country = locale.getCountry();
                try {
                    iSO3Country = locale.getISO3Country();
                } catch (Exception unused) {
                    iSO3Country = "";
                }
                s.h(country);
                if (!d(country)) {
                    s.h(iSO3Country);
                    if (d(iSO3Country)) {
                    }
                }
                return true;
            }
            return false;
        }

        public final boolean c(Context context) {
            s.k(context, "context");
            if (t.M(m.j().h(DataRestrictedCountry.SHARE_APP_ANALYTICS), "true", true)) {
                return false;
            }
            return b(context);
        }

        private Companion() {
        }
    }

    static {
        DataRestrictedCountry[] dataRestrictedCountryArrValues = values();
        ArrayList arrayList = new ArrayList(dataRestrictedCountryArrValues.length);
        for (DataRestrictedCountry dataRestrictedCountry : dataRestrictedCountryArrValues) {
            arrayList.add(dataRestrictedCountry.iso2);
        }
        iso2Countries = new HashSet<>(arrayList);
        DataRestrictedCountry[] dataRestrictedCountryArrValues2 = values();
        ArrayList arrayList2 = new ArrayList(dataRestrictedCountryArrValues2.length);
        for (DataRestrictedCountry dataRestrictedCountry2 : dataRestrictedCountryArrValues2) {
            arrayList2.add(dataRestrictedCountry2.iso3);
        }
        iso3Countries = new HashSet<>(arrayList2);
    }

    DataRestrictedCountry(String str, String str2) {
        this.iso2 = str;
        this.iso3 = str2;
    }

    public static EnumEntries<DataRestrictedCountry> getEntries() {
        return $ENTRIES;
    }

    public final String getIso2() {
        return this.iso2;
    }

    public final String getIso3() {
        return this.iso3;
    }
}
