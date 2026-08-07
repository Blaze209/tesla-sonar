package ia0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: ia0.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b8\b\u0086\b\u0018\u00002\u00020\u0001:\f18<6:>ADO-/3B§\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0018\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00182\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b/\u00105\u001a\u0004\b6\u00107R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b3\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b6\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b:\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b>\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bA\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\b1\u0010QR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bD\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bM\u0010U\u001a\u0004\b8\u0010VR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bS\u0010W\u001a\u0004\bO\u0010&R\u0017\u0010\u001e\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bJ\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bG\u0010[\u001a\u0004\b-\u0010\\R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bY\u0010]\u001a\u0004\b<\u0010^¨\u0006_"}, d2 = {"Lia0/a;", "", "Lia0/a$b;", "centroid", "Lia0/a$d;", "drivingDistanceMiles", "Lia0/a$e;", "entryPoint", "Lia0/a$g;", "haversineDistanceMiles", "Lia0/a$h;", "id", "Lia0/a$i;", "localizedSiteName", "Lia0/a$j;", "maxPowerKw", "Lia0/a$l;", "trtId", "Lia0/a$k;", "totalStalls", "Lja0/b;", "siteType", "Lja0/a;", "accessType", "", "teslaExclusive", "Lja0/c;", "chargingAccessibility", "", "locationGUID", "isMagicDockSupportedSite", "Lia0/a$a;", "accessHours", "Lia0/a$c;", "chargingQueue", "<init>", "(Lia0/a$b;Lia0/a$d;Lia0/a$e;Lia0/a$g;Lia0/a$h;Lia0/a$i;Lia0/a$j;Lia0/a$l;Lia0/a$k;Lja0/b;Lja0/a;Ljava/lang/Boolean;Lja0/c;Ljava/lang/String;ZLia0/a$a;Lia0/a$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lia0/a$b;", "c", "()Lia0/a$b;", "b", "Lia0/a$d;", "f", "()Lia0/a$d;", "Lia0/a$e;", "g", "()Lia0/a$e;", DateTokenConverter.CONVERTER_KEY, "Lia0/a$g;", "h", "()Lia0/a$g;", "e", "Lia0/a$h;", IntegerTokenConverter.CONVERTER_KEY, "()Lia0/a$h;", "Lia0/a$i;", "j", "()Lia0/a$i;", "Lia0/a$j;", "l", "()Lia0/a$j;", "Lia0/a$l;", "p", "()Lia0/a$l;", "Lia0/a$k;", "o", "()Lia0/a$k;", "Lja0/b;", "m", "()Lja0/b;", "k", "Lja0/a;", "()Lja0/a;", "Ljava/lang/Boolean;", "n", "()Ljava/lang/Boolean;", "Lja0/c;", "()Lja0/c;", "Ljava/lang/String;", "Z", "q", "()Z", "Lia0/a$a;", "()Lia0/a$a;", "Lia0/a$c;", "()Lia0/a$c;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChargingNearbySitesLiteFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Centroid centroid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DrivingDistanceMiles drivingDistanceMiles;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final EntryPoint entryPoint;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final HaversineDistanceMiles haversineDistanceMiles;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Id id;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalizedSiteName localizedSiteName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final MaxPowerKw maxPowerKw;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final TrtId trtId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final TotalStalls totalStalls;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final ja0.b siteType;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final ja0.a accessType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean teslaExclusive;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final ja0.c chargingAccessibility;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String locationGUID;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMagicDockSupportedSite;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final AccessHours accessHours;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final ChargingQueue chargingQueue;

    /* JADX INFO: renamed from: ia0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0011\u0010\n¨\u0006\u0019"}, d2 = {"Lia0/a$a;", "", "", "shouldDisplay", "openNow", "", "hour", "<init>", "(ZLjava/lang/Boolean;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccessHours {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldDisplay;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean openNow;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String hour;

        public AccessHours(boolean z11, Boolean bool, String str) {
            this.shouldDisplay = z11;
            this.openNow = bool;
            this.hour = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getHour() {
            return this.hour;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Boolean getOpenNow() {
            return this.openNow;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getShouldDisplay() {
            return this.shouldDisplay;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccessHours)) {
                return false;
            }
            AccessHours accessHours = (AccessHours) other;
            return this.shouldDisplay == accessHours.shouldDisplay && s.f(this.openNow, accessHours.openNow) && s.f(this.hour, accessHours.hour);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.shouldDisplay) * 31;
            Boolean bool = this.openNow;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.hour;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "AccessHours(shouldDisplay=" + this.shouldDisplay + ", openNow=" + this.openNow + ", hour=" + this.hour + ")";
        }
    }

    /* JADX INFO: renamed from: ia0.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lia0/a$b;", "", "", "__typename", "Lia0/o;", "energySvcCoordinateTypeFields", "<init>", "(Ljava/lang/String;Lia0/o;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lia0/o;", "()Lia0/o;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Centroid {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String __typename;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnergySvcCoordinateTypeFields energySvcCoordinateTypeFields;

        public Centroid(String __typename, EnergySvcCoordinateTypeFields energySvcCoordinateTypeFields) {
            s.k(__typename, "__typename");
            s.k(energySvcCoordinateTypeFields, "energySvcCoordinateTypeFields");
            this.__typename = __typename;
            this.energySvcCoordinateTypeFields = energySvcCoordinateTypeFields;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnergySvcCoordinateTypeFields getEnergySvcCoordinateTypeFields() {
            return this.energySvcCoordinateTypeFields;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Centroid)) {
                return false;
            }
            Centroid centroid = (Centroid) other;
            return s.f(this.__typename, centroid.__typename) && s.f(this.energySvcCoordinateTypeFields, centroid.energySvcCoordinateTypeFields);
        }

        public int hashCode() {
            return (this.__typename.hashCode() * 31) + this.energySvcCoordinateTypeFields.hashCode();
        }

        public String toString() {
            return "Centroid(__typename=" + this.__typename + ", energySvcCoordinateTypeFields=" + this.energySvcCoordinateTypeFields + ")";
        }
    }

    /* JADX INFO: renamed from: ia0.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lia0/a$c;", "", "", "activeQueue", "Lia0/a$f;", "estimatedWaitTimeMinutes", "<init>", "(Ljava/lang/Boolean;Lia0/a$f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "b", "Lia0/a$f;", "()Lia0/a$f;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChargingQueue {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean activeQueue;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final EstimatedWaitTimeMinutes estimatedWaitTimeMinutes;

        public ChargingQueue(Boolean bool, EstimatedWaitTimeMinutes estimatedWaitTimeMinutes) {
            this.activeQueue = bool;
            this.estimatedWaitTimeMinutes = estimatedWaitTimeMinutes;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Boolean getActiveQueue() {
            return this.activeQueue;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EstimatedWaitTimeMinutes getEstimatedWaitTimeMinutes() {
            return this.estimatedWaitTimeMinutes;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChargingQueue)) {
                return false;
            }
            ChargingQueue chargingQueue = (ChargingQueue) other;
            return s.f(this.activeQueue, chargingQueue.activeQueue) && s.f(this.estimatedWaitTimeMinutes, chargingQueue.estimatedWaitTimeMinutes);
        }

        public int hashCode() {
            Boolean bool = this.activeQueue;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            EstimatedWaitTimeMinutes estimatedWaitTimeMinutes = this.estimatedWaitTimeMinutes;
            return iHashCode + (estimatedWaitTimeMinutes != null ? estimatedWaitTimeMinutes.hashCode() : 0);
        }

        public String toString() {
            return "ChargingQueue(activeQueue=" + this.activeQueue + ", estimatedWaitTimeMinutes=" + this.estimatedWaitTimeMinutes + ")";
        }
    }

    /* JADX INFO: renamed from: ia0.a$d, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lia0/a$d;", "", "", "value", "<init>", "(D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DrivingDistanceMiles {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final double value;

        public DrivingDistanceMiles(double d11) {
            this.value = d11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DrivingDistanceMiles) && Double.compare(this.value, ((DrivingDistanceMiles) other).value) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.value);
        }

        public String toString() {
            return "DrivingDistanceMiles(value=" + this.value + ")";
        }
    }

    /* JADX INFO: renamed from: ia0.a$e, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lia0/a$e;", "", "", "__typename", "Lia0/o;", "energySvcCoordinateTypeFields", "<init>", "(Ljava/lang/String;Lia0/o;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lia0/o;", "()Lia0/o;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EntryPoint {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String __typename;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnergySvcCoordinateTypeFields energySvcCoordinateTypeFields;

        public EntryPoint(String __typename, EnergySvcCoordinateTypeFields energySvcCoordinateTypeFields) {
            s.k(__typename, "__typename");
            s.k(energySvcCoordinateTypeFields, "energySvcCoordinateTypeFields");
            this.__typename = __typename;
            this.energySvcCoordinateTypeFields = energySvcCoordinateTypeFields;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnergySvcCoordinateTypeFields getEnergySvcCoordinateTypeFields() {
            return this.energySvcCoordinateTypeFields;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EntryPoint)) {
                return false;
            }
            EntryPoint entryPoint = (EntryPoint) other;
            return s.f(this.__typename, entryPoint.__typename) && s.f(this.energySvcCoordinateTypeFields, entryPoint.energySvcCoordinateTypeFields);
        }

        public int hashCode() {
            return (this.__typename.hashCode() * 31) + this.energySvcCoordinateTypeFields.hashCode();
        }

        public String toString() {
            return "EntryPoint(__typename=" + this.__typename + ", energySvcCoordinateTypeFields=" + this.energySvcCoordinateTypeFields + ")";
        }
    }

    /* JADX INFO: renamed from: ia0.a$f, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\n¨\u0006\u0011"}, d2 = {"Lia0/a$f;", "", "", "value", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EstimatedWaitTimeMinutes {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int value;

        public EstimatedWaitTimeMinutes(int i11) {
            this.value = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EstimatedWaitTimeMinutes) && this.value == ((EstimatedWaitTimeMinutes) other).value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        public String toString() {
            return "EstimatedWaitTimeMinutes(value=" + this.value + ")";
        }
    }

    /* JADX INFO: renamed from: ia0.a$g, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lia0/a$g;", "", "", "value", "<init>", "(D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HaversineDistanceMiles {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final double value;

        public HaversineDistanceMiles(double d11) {
            this.value = d11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HaversineDistanceMiles) && Double.compare(this.value, ((HaversineDistanceMiles) other).value) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.value);
        }

        public String toString() {
            return "HaversineDistanceMiles(value=" + this.value + ")";
        }
    }

    /* JADX INFO: renamed from: ia0.a$h, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lia0/a$h;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Id {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String text;

        public Id(String text) {
            s.k(text, "text");
            this.text = text;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Id) && s.f(this.text, ((Id) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "Id(text=" + this.text + ")";
        }
    }

    /* JADX INFO: renamed from: ia0.a$i, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lia0/a$i;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocalizedSiteName {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        public LocalizedSiteName(String value) {
            s.k(value, "value");
            this.value = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LocalizedSiteName) && s.f(this.value, ((LocalizedSiteName) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "LocalizedSiteName(value=" + this.value + ")";
        }
    }

    /* JADX INFO: renamed from: ia0.a$j, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\n¨\u0006\u0011"}, d2 = {"Lia0/a$j;", "", "", "value", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MaxPowerKw {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int value;

        public MaxPowerKw(int i11) {
            this.value = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MaxPowerKw) && this.value == ((MaxPowerKw) other).value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        public String toString() {
            return "MaxPowerKw(value=" + this.value + ")";
        }
    }

    /* JADX INFO: renamed from: ia0.a$k, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\n¨\u0006\u0011"}, d2 = {"Lia0/a$k;", "", "", "value", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TotalStalls {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int value;

        public TotalStalls(int i11) {
            this.value = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TotalStalls) && this.value == ((TotalStalls) other).value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        public String toString() {
            return "TotalStalls(value=" + this.value + ")";
        }
    }

    /* JADX INFO: renamed from: ia0.a$l, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\n¨\u0006\u0011"}, d2 = {"Lia0/a$l;", "", "", "value", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrtId {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int value;

        public TrtId(int i11) {
            this.value = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TrtId) && this.value == ((TrtId) other).value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        public String toString() {
            return "TrtId(value=" + this.value + ")";
        }
    }

    public ChargingNearbySitesLiteFragment(Centroid centroid, DrivingDistanceMiles drivingDistanceMiles, EntryPoint entryPoint, HaversineDistanceMiles haversineDistanceMiles, Id id2, LocalizedSiteName localizedSiteName, MaxPowerKw maxPowerKw, TrtId trtId, TotalStalls totalStalls, ja0.b siteType, ja0.a accessType, Boolean bool, ja0.c cVar, String locationGUID, boolean z11, AccessHours accessHours, ChargingQueue chargingQueue) {
        s.k(id2, "id");
        s.k(siteType, "siteType");
        s.k(accessType, "accessType");
        s.k(locationGUID, "locationGUID");
        this.centroid = centroid;
        this.drivingDistanceMiles = drivingDistanceMiles;
        this.entryPoint = entryPoint;
        this.haversineDistanceMiles = haversineDistanceMiles;
        this.id = id2;
        this.localizedSiteName = localizedSiteName;
        this.maxPowerKw = maxPowerKw;
        this.trtId = trtId;
        this.totalStalls = totalStalls;
        this.siteType = siteType;
        this.accessType = accessType;
        this.teslaExclusive = bool;
        this.chargingAccessibility = cVar;
        this.locationGUID = locationGUID;
        this.isMagicDockSupportedSite = z11;
        this.accessHours = accessHours;
        this.chargingQueue = chargingQueue;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AccessHours getAccessHours() {
        return this.accessHours;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ja0.a getAccessType() {
        return this.accessType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Centroid getCentroid() {
        return this.centroid;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ja0.c getChargingAccessibility() {
        return this.chargingAccessibility;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ChargingQueue getChargingQueue() {
        return this.chargingQueue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChargingNearbySitesLiteFragment)) {
            return false;
        }
        ChargingNearbySitesLiteFragment chargingNearbySitesLiteFragment = (ChargingNearbySitesLiteFragment) other;
        return s.f(this.centroid, chargingNearbySitesLiteFragment.centroid) && s.f(this.drivingDistanceMiles, chargingNearbySitesLiteFragment.drivingDistanceMiles) && s.f(this.entryPoint, chargingNearbySitesLiteFragment.entryPoint) && s.f(this.haversineDistanceMiles, chargingNearbySitesLiteFragment.haversineDistanceMiles) && s.f(this.id, chargingNearbySitesLiteFragment.id) && s.f(this.localizedSiteName, chargingNearbySitesLiteFragment.localizedSiteName) && s.f(this.maxPowerKw, chargingNearbySitesLiteFragment.maxPowerKw) && s.f(this.trtId, chargingNearbySitesLiteFragment.trtId) && s.f(this.totalStalls, chargingNearbySitesLiteFragment.totalStalls) && this.siteType == chargingNearbySitesLiteFragment.siteType && this.accessType == chargingNearbySitesLiteFragment.accessType && s.f(this.teslaExclusive, chargingNearbySitesLiteFragment.teslaExclusive) && this.chargingAccessibility == chargingNearbySitesLiteFragment.chargingAccessibility && s.f(this.locationGUID, chargingNearbySitesLiteFragment.locationGUID) && this.isMagicDockSupportedSite == chargingNearbySitesLiteFragment.isMagicDockSupportedSite && s.f(this.accessHours, chargingNearbySitesLiteFragment.accessHours) && s.f(this.chargingQueue, chargingNearbySitesLiteFragment.chargingQueue);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final DrivingDistanceMiles getDrivingDistanceMiles() {
        return this.drivingDistanceMiles;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final HaversineDistanceMiles getHaversineDistanceMiles() {
        return this.haversineDistanceMiles;
    }

    public int hashCode() {
        Centroid centroid = this.centroid;
        int iHashCode = (centroid == null ? 0 : centroid.hashCode()) * 31;
        DrivingDistanceMiles drivingDistanceMiles = this.drivingDistanceMiles;
        int iHashCode2 = (iHashCode + (drivingDistanceMiles == null ? 0 : drivingDistanceMiles.hashCode())) * 31;
        EntryPoint entryPoint = this.entryPoint;
        int iHashCode3 = (iHashCode2 + (entryPoint == null ? 0 : entryPoint.hashCode())) * 31;
        HaversineDistanceMiles haversineDistanceMiles = this.haversineDistanceMiles;
        int iHashCode4 = (((iHashCode3 + (haversineDistanceMiles == null ? 0 : haversineDistanceMiles.hashCode())) * 31) + this.id.hashCode()) * 31;
        LocalizedSiteName localizedSiteName = this.localizedSiteName;
        int iHashCode5 = (iHashCode4 + (localizedSiteName == null ? 0 : localizedSiteName.hashCode())) * 31;
        MaxPowerKw maxPowerKw = this.maxPowerKw;
        int iHashCode6 = (iHashCode5 + (maxPowerKw == null ? 0 : maxPowerKw.hashCode())) * 31;
        TrtId trtId = this.trtId;
        int iHashCode7 = (iHashCode6 + (trtId == null ? 0 : trtId.hashCode())) * 31;
        TotalStalls totalStalls = this.totalStalls;
        int iHashCode8 = (((((iHashCode7 + (totalStalls == null ? 0 : totalStalls.hashCode())) * 31) + this.siteType.hashCode()) * 31) + this.accessType.hashCode()) * 31;
        Boolean bool = this.teslaExclusive;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        ja0.c cVar = this.chargingAccessibility;
        int iHashCode10 = (((((iHashCode9 + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.locationGUID.hashCode()) * 31) + Boolean.hashCode(this.isMagicDockSupportedSite)) * 31;
        AccessHours accessHours = this.accessHours;
        int iHashCode11 = (iHashCode10 + (accessHours == null ? 0 : accessHours.hashCode())) * 31;
        ChargingQueue chargingQueue = this.chargingQueue;
        return iHashCode11 + (chargingQueue != null ? chargingQueue.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Id getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final LocalizedSiteName getLocalizedSiteName() {
        return this.localizedSiteName;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getLocationGUID() {
        return this.locationGUID;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final MaxPowerKw getMaxPowerKw() {
        return this.maxPowerKw;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final ja0.b getSiteType() {
        return this.siteType;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Boolean getTeslaExclusive() {
        return this.teslaExclusive;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final TotalStalls getTotalStalls() {
        return this.totalStalls;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final TrtId getTrtId() {
        return this.trtId;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsMagicDockSupportedSite() {
        return this.isMagicDockSupportedSite;
    }

    public String toString() {
        return "ChargingNearbySitesLiteFragment(centroid=" + this.centroid + ", drivingDistanceMiles=" + this.drivingDistanceMiles + ", entryPoint=" + this.entryPoint + ", haversineDistanceMiles=" + this.haversineDistanceMiles + ", id=" + this.id + ", localizedSiteName=" + this.localizedSiteName + ", maxPowerKw=" + this.maxPowerKw + ", trtId=" + this.trtId + ", totalStalls=" + this.totalStalls + ", siteType=" + this.siteType + ", accessType=" + this.accessType + ", teslaExclusive=" + this.teslaExclusive + ", chargingAccessibility=" + this.chargingAccessibility + ", locationGUID=" + this.locationGUID + ", isMagicDockSupportedSite=" + this.isMagicDockSupportedSite + ", accessHours=" + this.accessHours + ", chargingQueue=" + this.chargingQueue + ")";
    }
}
