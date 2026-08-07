package v5;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b \u0018\u00002\u00020\u0001B\u007f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0004\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u0012\u0010\u001eR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014¨\u0006("}, d2 = {"Lv5/a;", "", "", "isDistanceSupported", "isAzimuthalAngleSupported", "isElevationAngleSupported", "", "minRangingInterval", "", "supportedChannels", "supportedNtfConfigs", "supportedConfigIds", "supportedSlotDurations", "supportedRangingUpdateRates", "isRangingIntervalReconfigureSupported", "isBackgroundRangingSupported", "<init>", "(ZZZILjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZ)V", "a", "Z", "()Z", "b", "c", DateTokenConverter.CONVERTER_KEY, "I", "getMinRangingInterval", "()I", "e", "Ljava/util/Set;", "getSupportedChannels", "()Ljava/util/Set;", "f", "getSupportedNtfConfigs", "g", "h", "getSupportedSlotDurations", IntegerTokenConverter.CONVERTER_KEY, "getSupportedRangingUpdateRates", "j", "k", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isDistanceSupported;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isAzimuthalAngleSupported;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isElevationAngleSupported;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int minRangingInterval;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Set<Integer> supportedChannels;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Set<Integer> supportedNtfConfigs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Set<Integer> supportedConfigIds;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Set<Integer> supportedSlotDurations;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Set<Integer> supportedRangingUpdateRates;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean isRangingIntervalReconfigureSupported;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean isBackgroundRangingSupported;

    public a(boolean z11, boolean z12, boolean z13, int i11, Set<Integer> supportedChannels, Set<Integer> supportedNtfConfigs, Set<Integer> supportedConfigIds, Set<Integer> supportedSlotDurations, Set<Integer> supportedRangingUpdateRates, boolean z14, boolean z15) {
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

    public final Set<Integer> a() {
        return this.supportedConfigIds;
    }
}
