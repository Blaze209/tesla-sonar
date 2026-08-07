package jf0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: jf0.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001a\u0010\u0016R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001e\u0010&R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b \u0010&R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b$\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b\"\u0010&R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001b\u001a\u0004\b)\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b'\u0010\u001d¨\u0006+"}, d2 = {"Ljf0/a;", "", "", "isDistanceSupported", "isAzimuthalAngleSupported", "isElevationAngleSupported", "", "minRangingInterval", "", "supportedChannels", "supportedNtfConfigs", "supportedConfigIds", "supportedSlotDurations", "supportedRangingUpdateRates", "isRangingIntervalReconfigureSupported", "isBackgroundRangingSupported", "<init>", "(ZZZILjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "h", "()Z", "b", "f", "c", IntegerTokenConverter.CONVERTER_KEY, DateTokenConverter.CONVERTER_KEY, "I", "e", "Ljava/util/Set;", "()Ljava/util/Set;", "g", "getSupportedConfigIds", "j", "k", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RangingCapabilities {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDistanceSupported;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAzimuthalAngleSupported;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isElevationAngleSupported;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minRangingInterval;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<Integer> supportedChannels;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<Integer> supportedNtfConfigs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<Integer> supportedConfigIds;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<Integer> supportedSlotDurations;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<Integer> supportedRangingUpdateRates;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRangingIntervalReconfigureSupported;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBackgroundRangingSupported;

    public RangingCapabilities(boolean z11, boolean z12, boolean z13, int i11, Set<Integer> supportedChannels, Set<Integer> supportedNtfConfigs, Set<Integer> supportedConfigIds, Set<Integer> supportedSlotDurations, Set<Integer> supportedRangingUpdateRates, boolean z14, boolean z15) {
        s.k(supportedChannels, "supportedChannels");
        s.k(supportedNtfConfigs, "supportedNtfConfigs");
        s.k(supportedConfigIds, "supportedConfigIds");
        s.k(supportedSlotDurations, "supportedSlotDurations");
        s.k(supportedRangingUpdateRates, "supportedRangingUpdateRates");
        this.isDistanceSupported = z11;
        this.isAzimuthalAngleSupported = z12;
        this.isElevationAngleSupported = z13;
        this.minRangingInterval = i11;
        this.supportedChannels = supportedChannels;
        this.supportedNtfConfigs = supportedNtfConfigs;
        this.supportedConfigIds = supportedConfigIds;
        this.supportedSlotDurations = supportedSlotDurations;
        this.supportedRangingUpdateRates = supportedRangingUpdateRates;
        this.isRangingIntervalReconfigureSupported = z14;
        this.isBackgroundRangingSupported = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getMinRangingInterval() {
        return this.minRangingInterval;
    }

    public final Set<Integer> b() {
        return this.supportedChannels;
    }

    public final Set<Integer> c() {
        return this.supportedNtfConfigs;
    }

    public final Set<Integer> d() {
        return this.supportedRangingUpdateRates;
    }

    public final Set<Integer> e() {
        return this.supportedSlotDurations;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RangingCapabilities)) {
            return false;
        }
        RangingCapabilities rangingCapabilities = (RangingCapabilities) other;
        return this.isDistanceSupported == rangingCapabilities.isDistanceSupported && this.isAzimuthalAngleSupported == rangingCapabilities.isAzimuthalAngleSupported && this.isElevationAngleSupported == rangingCapabilities.isElevationAngleSupported && this.minRangingInterval == rangingCapabilities.minRangingInterval && s.f(this.supportedChannels, rangingCapabilities.supportedChannels) && s.f(this.supportedNtfConfigs, rangingCapabilities.supportedNtfConfigs) && s.f(this.supportedConfigIds, rangingCapabilities.supportedConfigIds) && s.f(this.supportedSlotDurations, rangingCapabilities.supportedSlotDurations) && s.f(this.supportedRangingUpdateRates, rangingCapabilities.supportedRangingUpdateRates) && this.isRangingIntervalReconfigureSupported == rangingCapabilities.isRangingIntervalReconfigureSupported && this.isBackgroundRangingSupported == rangingCapabilities.isBackgroundRangingSupported;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsAzimuthalAngleSupported() {
        return this.isAzimuthalAngleSupported;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsBackgroundRangingSupported() {
        return this.isBackgroundRangingSupported;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsDistanceSupported() {
        return this.isDistanceSupported;
    }

    public int hashCode() {
        return (((((((((((((((((((Boolean.hashCode(this.isDistanceSupported) * 31) + Boolean.hashCode(this.isAzimuthalAngleSupported)) * 31) + Boolean.hashCode(this.isElevationAngleSupported)) * 31) + Integer.hashCode(this.minRangingInterval)) * 31) + this.supportedChannels.hashCode()) * 31) + this.supportedNtfConfigs.hashCode()) * 31) + this.supportedConfigIds.hashCode()) * 31) + this.supportedSlotDurations.hashCode()) * 31) + this.supportedRangingUpdateRates.hashCode()) * 31) + Boolean.hashCode(this.isRangingIntervalReconfigureSupported)) * 31) + Boolean.hashCode(this.isBackgroundRangingSupported);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsElevationAngleSupported() {
        return this.isElevationAngleSupported;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsRangingIntervalReconfigureSupported() {
        return this.isRangingIntervalReconfigureSupported;
    }

    public String toString() {
        return "RangingCapabilities(isDistanceSupported=" + this.isDistanceSupported + ", isAzimuthalAngleSupported=" + this.isAzimuthalAngleSupported + ", isElevationAngleSupported=" + this.isElevationAngleSupported + ", minRangingInterval=" + this.minRangingInterval + ", supportedChannels=" + this.supportedChannels + ", supportedNtfConfigs=" + this.supportedNtfConfigs + ", supportedConfigIds=" + this.supportedConfigIds + ", supportedSlotDurations=" + this.supportedSlotDurations + ", supportedRangingUpdateRates=" + this.supportedRangingUpdateRates + ", isRangingIntervalReconfigureSupported=" + this.isRangingIntervalReconfigureSupported + ", isBackgroundRangingSupported=" + this.isBackgroundRangingSupported + ")";
    }
}
