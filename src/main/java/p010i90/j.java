package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o30.e;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0011\u0010\"R \u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u000f\u001a\u0004\b\u001d\u0010\"¨\u0006&"}, d2 = {"Li90/j;", "Li90/x;", "Li90/j$a;", PlaceTypes.COUNTRY, "<init>", "(Li90/j$a;)V", "", "index", "", "f", "(I)Ljava/lang/String;", "rawValue", "a", "(Ljava/lang/String;)Ljava/lang/String;", "", "Ljava/util/List;", "shortAdministrativeAreaNames", "b", "fullAdministrativeAreaNames", "", "c", "Z", "()Z", "tinyMode", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getDebugLabel", "()Ljava/lang/String;", "debugLabel", "e", "I", "getLabel", "()I", AnnotatedPrivateKey.LABEL, "()Ljava/util/List;", "rawItems", "g", "displayItems", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<String> shortAdministrativeAreaNames;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<String> fullAdministrativeAreaNames;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean tinyMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String debugLabel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int label;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<String> rawItems;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<String> displayItems;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\fB+\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR,\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\n\u0010\u000f\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Li90/j$a;", "", "", AnnotatedPrivateKey.LABEL, "", "Lkotlin/Pair;", "", "administrativeAreas", "<init>", "(ILjava/util/List;)V", "a", "I", "b", "()I", "Ljava/util/List;", "()Ljava/util/List;", "Li90/j$a$a;", "Li90/j$a$b;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int label;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<Pair<String, String>> administrativeAreas;

        public /* synthetic */ a(int i11, List list, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, list);
        }

        public abstract List<Pair<String, String>> a();

        /* JADX INFO: renamed from: b */
        public abstract int getLabel();

        private a(int i11, List<Pair<String, String>> list) {
            this.label = i11;
            this.administrativeAreas = list;
        }

        /* JADX INFO: renamed from: i90.j$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR,\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Li90/j$a$a;", "Li90/j$a;", "", AnnotatedPrivateKey.LABEL, "", "Lkotlin/Pair;", "", "administrativeAreas", "<init>", "(ILjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "I", "b", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "a", "()Ljava/util/List;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Canada extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int label;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<Pair<String, String>> administrativeAreas;

            public /* synthetic */ Canada(int i11, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this((i12 & 1) != 0 ? e.f96370h : i11, (i12 & 2) != 0 ? v.p(new Pair("AB", "Alberta"), new Pair(BouncyCastleProvider.PROVIDER_NAME, "British Columbia"), new Pair("MB", "Manitoba"), new Pair("NB", "New Brunswick"), new Pair("NL", "Newfoundland and Labrador"), new Pair("NT", "Northwest Territories"), new Pair("NS", "Nova Scotia"), new Pair("NU", "Nunavut"), new Pair("ON", "Ontario"), new Pair("PE", "Prince Edward Island"), new Pair("QC", "Quebec"), new Pair("SK", "Saskatchewan"), new Pair("YT", "Yukon")) : list);
            }

            @Override // i90.j.a
            public List<Pair<String, String>> a() {
                return this.administrativeAreas;
            }

            @Override // i90.j.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public int getLabel() {
                return this.label;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Canada)) {
                    return false;
                }
                Canada canada = (Canada) other;
                return this.label == canada.label && s.f(this.administrativeAreas, canada.administrativeAreas);
            }

            public int hashCode() {
                return (Integer.hashCode(this.label) * 31) + this.administrativeAreas.hashCode();
            }

            public String toString() {
                return "Canada(label=" + this.label + ", administrativeAreas=" + this.administrativeAreas + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Canada(int i11, List<Pair<String, String>> administrativeAreas) {
                super(i11, administrativeAreas, null);
                s.k(administrativeAreas, "administrativeAreas");
                this.label = i11;
                this.administrativeAreas = administrativeAreas;
            }
        }

        /* JADX INFO: renamed from: i90.j$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR,\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Li90/j$a$b;", "Li90/j$a;", "", AnnotatedPrivateKey.LABEL, "", "Lkotlin/Pair;", "", "administrativeAreas", "<init>", "(ILjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "I", "b", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "a", "()Ljava/util/List;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class US extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int label;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<Pair<String, String>> administrativeAreas;

            public /* synthetic */ US(int i11, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this((i12 & 1) != 0 ? e.f96371i : i11, (i12 & 2) != 0 ? v.p(new Pair("AL", "Alabama"), new Pair("AK", "Alaska"), new Pair("AS", "American Samoa"), new Pair("AZ", "Arizona"), new Pair("AR", "Arkansas"), new Pair("AA", "Armed Forces (AA)"), new Pair("AE", "Armed Forces (AE)"), new Pair("AP", "Armed Forces (AP)"), new Pair("CA", "California"), new Pair("CO", "Colorado"), new Pair("CT", "Connecticut"), new Pair("DE", "Delaware"), new Pair("DC", "District of Columbia"), new Pair("FL", "Florida"), new Pair("GA", "Georgia"), new Pair("GU", "Guam"), new Pair("HI", "Hawaii"), new Pair("ID", "Idaho"), new Pair("IL", "Illinois"), new Pair("IN", "Indiana"), new Pair("IA", "Iowa"), new Pair("KS", "Kansas"), new Pair("KY", "Kentucky"), new Pair("LA", "Louisiana"), new Pair("ME", "Maine"), new Pair("MH", "Marshal Islands"), new Pair("MD", "Maryland"), new Pair("MA", "Massachusetts"), new Pair("MI", "Michigan"), new Pair("FM", "Micronesia"), new Pair("MN", "Minnesota"), new Pair("MS", "Mississippi"), new Pair("MO", "Missouri"), new Pair("MT", "Montana"), new Pair("NE", "Nebraska"), new Pair("NV", "Nevada"), new Pair("NH", "New Hampshire"), new Pair("NJ", "New Jersey"), new Pair("NM", "New Mexico"), new Pair("NY", "New York"), new Pair("NC", "North Carolina"), new Pair("ND", "North Dakota"), new Pair("MP", "Northern Mariana Islands"), new Pair("OH", "Ohio"), new Pair("OK", "Oklahoma"), new Pair("OR", "Oregon"), new Pair("PW", "Palau"), new Pair("PA", "Pennsylvania"), new Pair("PR", "Puerto Rico"), new Pair("RI", "Rhode Island"), new Pair(org.spongycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME, "South Carolina"), new Pair("SD", "South Dakota"), new Pair("TN", "Tennessee"), new Pair("TX", "Texas"), new Pair("UT", "Utah"), new Pair("VT", "Vermont"), new Pair("VI", "Virgin Islands"), new Pair("VA", "Virginia"), new Pair("WA", "Washington"), new Pair("WV", "West Virginia"), new Pair("WI", "Wisconsin"), new Pair("WY", "Wyoming")) : list);
            }

            @Override // i90.j.a
            public List<Pair<String, String>> a() {
                return this.administrativeAreas;
            }

            @Override // i90.j.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public int getLabel() {
                return this.label;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof US)) {
                    return false;
                }
                US us2 = (US) other;
                return this.label == us2.label && s.f(this.administrativeAreas, us2.administrativeAreas);
            }

            public int hashCode() {
                return (Integer.hashCode(this.label) * 31) + this.administrativeAreas.hashCode();
            }

            public String toString() {
                return "US(label=" + this.label + ", administrativeAreas=" + this.administrativeAreas + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public US(int i11, List<Pair<String, String>> administrativeAreas) {
                super(i11, administrativeAreas, null);
                s.k(administrativeAreas, "administrativeAreas");
                this.label = i11;
                this.administrativeAreas = administrativeAreas;
            }
        }
    }

    public j(a country) {
        s.k(country, "country");
        List<Pair<String, String>> listA = country.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Pair) it.next()).e());
        }
        this.shortAdministrativeAreaNames = arrayList;
        List<Pair<String, String>> listA2 = country.a();
        ArrayList arrayList2 = new ArrayList(v.y(listA2, 10));
        Iterator<T> it2 = listA2.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) ((Pair) it2.next()).f());
        }
        this.fullAdministrativeAreaNames = arrayList2;
        this.debugLabel = "administrativeArea";
        this.label = country.getLabel();
        this.rawItems = this.shortAdministrativeAreaNames;
        this.displayItems = arrayList2;
    }

    @Override // p010i90.x
    public String a(String rawValue) {
        s.k(rawValue, "rawValue");
        return this.shortAdministrativeAreaNames.contains(rawValue) ? this.fullAdministrativeAreaNames.get(this.shortAdministrativeAreaNames.indexOf(rawValue)) : this.fullAdministrativeAreaNames.get(0);
    }

    @Override // p010i90.x
    public List<String> b() {
        return this.rawItems;
    }

    @Override // p010i90.x
    /* JADX INFO: renamed from: c, reason: from getter */
    public boolean getTinyMode() {
        return this.tinyMode;
    }

    @Override // p010i90.x
    public boolean d() {
        return x.a.a(this);
    }

    @Override // p010i90.x
    public List<String> e() {
        return this.displayItems;
    }

    @Override // p010i90.x
    public String f(int index) {
        return this.fullAdministrativeAreaNames.get(index);
    }

    @Override // p010i90.x
    public int getLabel() {
        return this.label;
    }
}
