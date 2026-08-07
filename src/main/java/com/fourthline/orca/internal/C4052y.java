package com.fourthline.orca.internal;

import java.util.List;
import java.util.Locale;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4052y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f36866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f36868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f36869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f36870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f36871g;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.y$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f36872a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final List f36873b = p013kotlin.collections.v.p("ABW", "AFG", "AFI", "AGO", "AIA", "ALA", "ALB", "AND", "ANT", "ARE", "ARG", "ARM", "ASC", "ASM", "ATA", "ATB", "ATF", "ATG", "ATN", "AUS", "AUT", "AZE", "BDI", "BDS", "BEL", "BEN", "BES", "BFA", "BGD", "BGR", "BHR", "BHS", "BIH", "BLM", "BLR", "BLZ", "BMU", "BOL", "BRA", "BRB", "BRN", "BRU", "BTN", "BUR", "BVT", "BWA", "BYS", "CAF", "CAN", "CCK", "CDN", "CHE", "CHL", "CHN", "CIV", "CMR", "COD", "COG", "COK", "COL", "COM", "CPT", "CPV", "CRI", "CSK", "CTE", "CUB", "CUW", "CXR", "CYM", "CYP", "CZE", "DDR", "DEU", "DGA", "DHY", "DJI", "DMA", "DNK", "DOM", "DZA", "EAK", "EAT", "EAU", "EAZ", "ECU", "EGY", "ERI", "ESH", "ESP", "EST", "ETH", "FIN", "FJI", "FLK", "FRA", "FRO", "FSM", "FXX", "FYP", "FYR", "GAB", "GBA", "GBD", "GBG", "GBJ", "GBM", "GBN", "GBO", "GBP", "GBR", "GBS", "GBZ", "GCA", "GEL", "GEO", "GGY", "GHA", "GIB", "GIN", "GLP", "GMB", "GNB", "GNQ", "GRC", "GRD", "GRL", "GTM", "GUF", "GUM", "GUY", "HKG", "HKJ", "HMD", "HND", "HRV", "HTI", "HUN", "HVO", "IDN", "IMN", "IND", "INT", "IOT", "IRL", "IRN", "IRQ", "ISL", "ISR", "ITA", "JAM", "JEY", "JOR", "JPN", "JTN", "KAZ", "KEN", "KGZ", "KHM", "KIR", "KNA", "KOR", "KWT", "LAO", "LBN", "LBR", "LBY", "LCA", "LIE", "LKA", "LSO", "LTU", "LUX", "LVA", "MAC", "MAF", "MAL", "MAR", "MCO", "MDA", "MDG", "MDV", "MEX", "MHL", "MID", "MKD", "MLI", "MLT", "MMR", "MNE", "MNG", "MNP", "MOZ", "MRT", "MSR", "MTQ", "MUS", "MWI", "MYS", "MYT", "NAM", "NCL", "NER", "NFK", "NGA", "NHB", "NIC", "NIU", "NLD", "NOR", "NPL", "NRU", "NTZ", "NZL", "OMN", "PAK", "PAN", "PCI", "PCN", "PCZ", "PER", "PHI", "PHL", "PLW", "PNG", "POL", "PRI", "PRK", "PRT", "PRY", "PSE", "PUS", "PYF", "QAT", "RCA", "RCB", "RCH", "REU", "RHO", "RKS", "RMM", "RNR", "ROK", "ROM", "ROU", "RSM", "RSR", "RUS", "RWA", "SAU", "SCG", "SDN", "SEN", "SGP", "SGS", "SHN", "SJM", "SKM", "SLB", "SLE", "SLO", "SLV", "SME", "SMR", "SOM", "SPM", "SRB", "SSD", "STP", "SUN", "SUR", "SVK", "SVN", "SWE", "SWZ", "SXM", "SYC", "SYR", "TAA", "TCA", "TCD", "TGO", "THA", "TJK", "TKL", "TKM", "TLS", "TMN", "TMP", "TON", "TTO", "TUN", "TUR", "TUV", "TWN", "TZA", "UAP", "UGA", "UKR", "UMI", "UNA", "UNK", "UNO", "URY", "USA", "UZB", "VAT", "VCT", "VDR", "VEN", "VGB", "VIR", "VNM", "VUT", "WAG", "WAK", "WAL", "WAN", "WLF", "WSM", "XEC", "XKS", "XKX", "YEM", "YMD", "YUG", "ZAF", "ZAR", "ZMB", "ZRE", "ZWE");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f36874c = 8;

        private a() {
        }

        private final String b(String str) {
            return p013kotlin.jvm.internal.s.f(str, "D") ? "DEU" : str;
        }

        public final boolean a(String country) {
            p013kotlin.jvm.internal.s.k(country, "country");
            List list = f36873b;
            String strB = b(country);
            Locale ROOT = Locale.ROOT;
            p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
            String upperCase = strB.toUpperCase(ROOT);
            p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
            return list.contains(upperCase);
        }
    }

    public C4052y(String str, Integer num, String str2, String str3, String str4, String str5, String str6) {
        this.f36865a = str;
        this.f36866b = num;
        this.f36867c = str2;
        this.f36868d = str3;
        this.f36869e = str4;
        this.f36870f = str5;
        this.f36871g = str6;
    }

    public final void a(Integer num) {
        this.f36866b = num;
    }

    public final void b(String str) {
        this.f36869e = str;
    }

    public final String c() {
        return this.f36870f;
    }

    public final void d(String str) {
        this.f36868d = str;
    }

    public final void e(String str) {
        this.f36865a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4052y)) {
            return false;
        }
        C4052y c4052y = (C4052y) obj;
        return p013kotlin.jvm.internal.s.f(this.f36865a, c4052y.f36865a) && p013kotlin.jvm.internal.s.f(this.f36866b, c4052y.f36866b) && p013kotlin.jvm.internal.s.f(this.f36867c, c4052y.f36867c) && p013kotlin.jvm.internal.s.f(this.f36868d, c4052y.f36868d) && p013kotlin.jvm.internal.s.f(this.f36869e, c4052y.f36869e) && p013kotlin.jvm.internal.s.f(this.f36870f, c4052y.f36870f) && p013kotlin.jvm.internal.s.f(this.f36871g, c4052y.f36871g);
    }

    public final void f(String str) {
        this.f36867c = str;
    }

    public final String g() {
        return this.f36871g;
    }

    public final String h() {
        return this.f36865a;
    }

    public int hashCode() {
        String str = this.f36865a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f36866b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f36867c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f36868d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f36869e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f36870f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f36871g;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final Integer i() {
        return this.f36866b;
    }

    public final String j() {
        return this.f36867c;
    }

    public final boolean k() {
        Integer num = this.f36866b;
        return num != null && num.intValue() >= 0;
    }

    public final boolean l() {
        String str = this.f36865a;
        if (str != null) {
            return !p013kotlin.text.t.y0(str);
        }
        return false;
    }

    public final boolean m() {
        return l() && k() && f() && b() && d();
    }

    public String toString() {
        return "AddressBundle(street=" + this.f36865a + ", streetNumber=" + this.f36866b + ", streetNumberSuffix=" + this.f36867c + ", postalCode=" + this.f36868d + ", city=" + this.f36869e + ", countryCode=" + this.f36870f + ", region=" + this.f36871g + ")";
    }

    public final String a() {
        return this.f36869e;
    }

    public final boolean b() {
        String str = this.f36869e;
        if (str != null) {
            return !p013kotlin.text.t.y0(str);
        }
        return false;
    }

    public final void c(String str) {
        this.f36870f = str;
    }

    public final boolean d() {
        String str = this.f36870f;
        if (str != null) {
            return a.f36872a.a(str);
        }
        return false;
    }

    public final String e() {
        return this.f36868d;
    }

    public final boolean f() {
        String str = this.f36868d;
        if (str != null) {
            return a(str);
        }
        return false;
    }

    private final boolean a(String str) {
        return new p013kotlin.text.q("^[a-zA-Z0-9-\\s]{3,}+$").i(str) && !p013kotlin.text.t.y0(str);
    }

    public /* synthetic */ C4052y(String str, Integer num, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6);
    }
}
