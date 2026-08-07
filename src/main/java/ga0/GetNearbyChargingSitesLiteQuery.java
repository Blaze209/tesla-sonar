package ga0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ha0.e;
import ia0.ChargingNearbySitesLiteFragment;
import ii.b;
import ii.d;
import ii.k;
import ii.v;
import ii.z;
import ja0.GetNearbyChargingSitesLiteRequestType;
import java.util.List;
import mi.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: ga0.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005 \u0011#$\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lga0/a;", "Lii/z;", "Lga0/a$c;", "Lja0/e;", "args", "<init>", "(Lja0/e;)V", "", "id", "()Ljava/lang/String;", "b", "name", "Lmi/g;", "writer", "Lii/k;", "customScalarAdapters", "Ljn0/h0;", "a", "(Lmi/g;Lii/k;)V", "Lii/b;", "adapter", "()Lii/b;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lja0/e;", "c", "()Lja0/e;", "Companion", DateTokenConverter.CONVERTER_KEY, "e", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetNearbyChargingSitesLiteQuery implements z<Data> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final GetNearbyChargingSitesLiteRequestType args;

    /* JADX INFO: renamed from: ga0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lga0/a$a;", "", "Lga0/a$d;", "nearbySitesLite", "<init>", "(Lga0/a$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lga0/a$d;", "()Lga0/a$d;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Charging {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final NearbySitesLite nearbySitesLite;

        public Charging(NearbySitesLite nearbySitesLite) {
            s.k(nearbySitesLite, "nearbySitesLite");
            this.nearbySitesLite = nearbySitesLite;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final NearbySitesLite getNearbySitesLite() {
            return this.nearbySitesLite;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Charging) && s.f(this.nearbySitesLite, ((Charging) other).nearbySitesLite);
        }

        public int hashCode() {
            return this.nearbySitesLite.hashCode();
        }

        public String toString() {
            return "Charging(nearbySitesLite=" + this.nearbySitesLite + ")";
        }
    }

    /* JADX INFO: renamed from: ga0.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lga0/a$b;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query GetNearbyChargingSitesLite($args: GetNearbyChargingSitesLiteRequestType!) { charging { nearbySitesLite(args: $args) { sitesAndDistances { __typename ...ChargingNearbySitesLiteFragment } } } }  fragment EnergySvcCoordinateTypeFields on EnergySvcCoordinateType { latitude longitude }  fragment ChargingNearbySitesLiteFragment on ChargerSiteAndDistanceLiteType { centroid { __typename ...EnergySvcCoordinateTypeFields } drivingDistanceMiles { value } entryPoint { __typename ...EnergySvcCoordinateTypeFields } haversineDistanceMiles { value } id { text } localizedSiteName { value } maxPowerKw { value } trtId { value } totalStalls { value } siteType accessType teslaExclusive chargingAccessibility locationGUID isMagicDockSupportedSite accessHours { shouldDisplay openNow hour } chargingQueue { activeQueue estimatedWaitTimeMinutes { value } } }";
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: ga0.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lga0/a$c;", "", "Lga0/a$a;", "charging", "<init>", "(Lga0/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lga0/a$a;", "()Lga0/a$a;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Data implements v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Charging charging;

        public Data(Charging charging) {
            this.charging = charging;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Charging getCharging() {
            return this.charging;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && s.f(this.charging, ((Data) other).charging);
        }

        public int hashCode() {
            Charging charging = this.charging;
            if (charging == null) {
                return 0;
            }
            return charging.hashCode();
        }

        public String toString() {
            return "Data(charging=" + this.charging + ")";
        }
    }

    /* JADX INFO: renamed from: ga0.a$d, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lga0/a$d;", "", "", "Lga0/a$e;", "sitesAndDistances", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NearbySitesLite {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<SitesAndDistance> sitesAndDistances;

        public NearbySitesLite(List<SitesAndDistance> sitesAndDistances) {
            s.k(sitesAndDistances, "sitesAndDistances");
            this.sitesAndDistances = sitesAndDistances;
        }

        public final List<SitesAndDistance> a() {
            return this.sitesAndDistances;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NearbySitesLite) && s.f(this.sitesAndDistances, ((NearbySitesLite) other).sitesAndDistances);
        }

        public int hashCode() {
            return this.sitesAndDistances.hashCode();
        }

        public String toString() {
            return "NearbySitesLite(sitesAndDistances=" + this.sitesAndDistances + ")";
        }
    }

    /* JADX INFO: renamed from: ga0.a$e, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lga0/a$e;", "", "", "__typename", "Lia0/a;", "chargingNearbySitesLiteFragment", "<init>", "(Ljava/lang/String;Lia0/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lia0/a;", "()Lia0/a;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SitesAndDistance {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String __typename;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ChargingNearbySitesLiteFragment chargingNearbySitesLiteFragment;

        public SitesAndDistance(String __typename, ChargingNearbySitesLiteFragment chargingNearbySitesLiteFragment) {
            s.k(__typename, "__typename");
            s.k(chargingNearbySitesLiteFragment, "chargingNearbySitesLiteFragment");
            this.__typename = __typename;
            this.chargingNearbySitesLiteFragment = chargingNearbySitesLiteFragment;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ChargingNearbySitesLiteFragment getChargingNearbySitesLiteFragment() {
            return this.chargingNearbySitesLiteFragment;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SitesAndDistance)) {
                return false;
            }
            SitesAndDistance sitesAndDistance = (SitesAndDistance) other;
            return s.f(this.__typename, sitesAndDistance.__typename) && s.f(this.chargingNearbySitesLiteFragment, sitesAndDistance.chargingNearbySitesLiteFragment);
        }

        public int hashCode() {
            return (this.__typename.hashCode() * 31) + this.chargingNearbySitesLiteFragment.hashCode();
        }

        public String toString() {
            return "SitesAndDistance(__typename=" + this.__typename + ", chargingNearbySitesLiteFragment=" + this.chargingNearbySitesLiteFragment + ")";
        }
    }

    public GetNearbyChargingSitesLiteQuery(GetNearbyChargingSitesLiteRequestType args) {
        s.k(args, "args");
        this.args = args;
    }

    @Override // ii.v, ii.p
    public void a(g writer, k customScalarAdapters) {
        s.k(writer, "writer");
        s.k(customScalarAdapters, "customScalarAdapters");
        e.f72470a.b(writer, customScalarAdapters, this);
    }

    @Override // ii.v
    public b<Data> adapter() {
        return d.d(ha0.b.f72464a, false, 1, null);
    }

    @Override // ii.v
    public String b() {
        return INSTANCE.a();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final GetNearbyChargingSitesLiteRequestType getArgs() {
        return this.args;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetNearbyChargingSitesLiteQuery) && s.f(this.args, ((GetNearbyChargingSitesLiteQuery) other).args);
    }

    public int hashCode() {
        return this.args.hashCode();
    }

    @Override // ii.v
    public String id() {
        return "59dd787fba50b756bbe7cec311829eeab1926b1b6aaf424140ee227933438a00";
    }

    @Override // ii.v
    public String name() {
        return "GetNearbyChargingSitesLite";
    }

    public String toString() {
        return "GetNearbyChargingSitesLiteQuery(args=" + this.args + ")";
    }
}
