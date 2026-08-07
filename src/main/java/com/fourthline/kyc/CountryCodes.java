package com.fourthline.kyc;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.List;
import java.util.Locale;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/fourthline/kyc/CountryCodes;", "", "<init>", "()V", "", PlaceTypes.COUNTRY, "", "isSupportedCountry", "(Ljava/lang/String;)Z", "mapToAlpha3IfNeeded$fourthline_kyc_release", "(Ljava/lang/String;)Ljava/lang/String;", "mapToAlpha3IfNeeded", "", "a", "Ljava/util/List;", "getSupported", "()Ljava/util/List;", "supported", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CountryCodes {
    public static final CountryCodes INSTANCE = new CountryCodes();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final List supported = v.p("ABW", "AFG", "AFI", "AGO", "AIA", "ALA", "ALB", "AND", "ANT", "ARE", "ARG", "ARM", "ASC", "ASM", "ATA", "ATB", "ATF", "ATG", "ATN", "AUS", "AUT", "AZE", "BDI", "BDS", "BEL", "BEN", "BES", "BFA", "BGD", "BGR", "BHR", "BHS", "BIH", "BLM", "BLR", "BLZ", "BMU", "BOL", "BRA", "BRB", "BRN", "BRU", "BTN", "BUR", "BVT", "BWA", "BYS", "CAF", "CAN", "CCK", "CDN", "CHE", "CHL", "CHN", "CIV", "CMR", "COD", "COG", "COK", "COL", "COM", "CPT", "CPV", "CRI", "CSK", "CTE", "CUB", "CUW", "CXR", "CYM", "CYP", "CZE", "DDR", "DEU", "DGA", "DHY", "DJI", "DMA", "DNK", "DOM", "DZA", "EAK", "EAT", "EAU", "EAZ", "ECU", "EGY", "ERI", "ESH", "ESP", "EST", "ETH", "FIN", "FJI", "FLK", "FRA", "FRO", "FSM", "FXX", "FYP", "FYR", "GAB", "GBA", "GBD", "GBG", "GBJ", "GBM", "GBN", "GBO", "GBP", "GBR", "GBS", "GBZ", "GCA", "GEL", "GEO", "GGY", "GHA", "GIB", "GIN", "GLP", "GMB", "GNB", "GNQ", "GRC", "GRD", "GRL", "GTM", "GUF", "GUM", "GUY", "HKG", "HKJ", "HMD", "HND", "HRV", "HTI", "HUN", "HVO", "IDN", "IMN", "IND", "INT", "IOT", "IRL", "IRN", "IRQ", "ISL", "ISR", "ITA", "JAM", "JEY", "JOR", "JPN", "JTN", "KAZ", "KEN", "KGZ", "KHM", "KIR", "KNA", "KOR", "KWT", "LAO", "LBN", "LBR", "LBY", "LCA", "LIE", "LKA", "LSO", "LTU", "LUX", "LVA", "MAC", "MAF", "MAL", "MAR", "MCO", "MDA", "MDG", "MDV", "MEX", "MHL", "MID", "MKD", "MLI", "MLT", "MMR", "MNE", "MNG", "MNP", "MOZ", "MRT", "MSR", "MTQ", "MUS", "MWI", "MYS", "MYT", "NAM", "NCL", "NER", "NFK", "NGA", "NHB", "NIC", "NIU", "NLD", "NOR", "NPL", "NRU", "NTZ", "NZL", "OMN", "PAK", "PAN", "PCI", "PCN", "PCZ", "PER", "PHI", "PHL", "PLW", "PNG", "POL", "PRI", "PRK", "PRT", "PRY", "PSE", "PUS", "PYF", "QAT", "RCA", "RCB", "RCH", "REU", "RHO", "RKS", "RMM", "RNR", "ROK", "ROM", "ROU", "RSM", "RSR", "RUS", "RWA", "SAU", "SCG", "SDN", "SEN", "SGP", "SGS", "SHN", "SJM", "SKM", "SLB", "SLE", "SLO", "SLV", "SME", "SMR", "SOM", "SPM", "SRB", "SSD", "STP", "SUN", "SUR", "SVK", "SVN", "SWE", "SWZ", "SXM", "SYC", "SYR", "TAA", "TCA", "TCD", "TGO", "THA", "TJK", "TKL", "TKM", "TLS", "TMN", "TMP", "TON", "TTO", "TUN", "TUR", "TUV", "TWN", "TZA", "UAP", "UGA", "UKR", "UMI", "UNA", "UNK", "UNO", "URY", "USA", "UZB", "VAT", "VCT", "VDR", "VEN", "VGB", "VIR", "VNM", "VUT", "WAG", "WAK", "WAL", "WAN", "WLF", "WSM", "XEC", "XKS", "XKX", "YEM", "YMD", "YUG", "ZAF", "ZAR", "ZMB", "ZRE", "ZWE");

    private CountryCodes() {
    }

    public final List<String> getSupported() {
        return supported;
    }

    public final boolean isSupportedCountry(String country) {
        s.k(country, "country");
        List list = supported;
        String strMapToAlpha3IfNeeded$fourthline_kyc_release = mapToAlpha3IfNeeded$fourthline_kyc_release(country);
        Locale ROOT = Locale.ROOT;
        s.j(ROOT, "ROOT");
        String upperCase = strMapToAlpha3IfNeeded$fourthline_kyc_release.toUpperCase(ROOT);
        s.j(upperCase, "toUpperCase(...)");
        return list.contains(upperCase);
    }

    public final String mapToAlpha3IfNeeded$fourthline_kyc_release(String country) {
        s.k(country, "country");
        return s.f(country, "D") ? "DEU" : country;
    }
}
