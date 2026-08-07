package cf0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: cf0.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001Bù\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b4\u0010/R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b5\u0010/R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010-\u001a\u0004\b6\u0010/R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u0010/R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b,\u0010/R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b:\u0010/R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b.\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b>\u0010/R\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b8\u0010;\u001a\u0004\b?\u0010=R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b7\u0010!R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010(\u001a\u0004\b9\u0010!R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010(\u001a\u0004\b@\u0010!R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b?\u0010A\u001a\u0004\b'\u0010#R\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bB\u0010A\u001a\u0004\bB\u0010#R\u0017\u0010\u0019\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b3\u0010;\u001a\u0004\b0\u0010=R\u0017\u0010\u001a\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bC\u0010=R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010(\u001a\u0004\bD\u0010!R\u0017\u0010\u001c\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bC\u0010A\u001a\u0004\b*\u0010#R\u0017\u0010\u001d\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\b2\u0010=¨\u0006F"}, d2 = {"Lcf0/a;", "", "", "connectionId", "vin", "", "gattConnectedTs", "mtuCompletedTs", "servicesDiscoveredTs", "charReadTs", "connectionEstablishedTs", "firstAuthAttemptTs", "lastAuthAttemptTs", "authResponseSentTs", "handlePulledWithoutAuthTs", "", "mtuTimedOut", "resetPeripheralDelayMs", "resetPeripheralWakeLockHeld", "failedPhase", "failureStatus", "sessionId", "", "attemptNumber", "rssi", "autoConnect", "isOHOS", "vehicleModel", "authAttemptCount", "bluetoothEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJJJJJJJJZJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLjava/lang/String;IZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "getVin", "c", "J", "l", "()J", DateTokenConverter.CONVERTER_KEY, "o", "e", "t", "f", "g", "k", IntegerTokenConverter.CONVERTER_KEY, "n", "j", "m", "Z", "p", "()Z", "q", "r", "u", "I", "s", "w", "v", "x", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConnectionTimelinePayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String connectionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String vin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long gattConnectedTs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long mtuCompletedTs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long servicesDiscoveredTs;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long charReadTs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long connectionEstablishedTs;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long firstAuthAttemptTs;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final long lastAuthAttemptTs;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long authResponseSentTs;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final long handlePulledWithoutAuthTs;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean mtuTimedOut;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final long resetPeripheralDelayMs;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean resetPeripheralWakeLockHeld;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String failedPhase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String failureStatus;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sessionId;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final int attemptNumber;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final int rssi;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean autoConnect;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOHOS;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final String vehicleModel;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final int authAttemptCount;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean bluetoothEnabled;

    public ConnectionTimelinePayload(String connectionId, String vin, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, boolean z11, long j21, boolean z12, String str, String str2, String sessionId, int i11, int i12, boolean z13, boolean z14, String vehicleModel, int i13, boolean z15) {
        s.k(connectionId, "connectionId");
        s.k(vin, "vin");
        s.k(sessionId, "sessionId");
        s.k(vehicleModel, "vehicleModel");
        this.connectionId = connectionId;
        this.vin = vin;
        this.gattConnectedTs = j11;
        this.mtuCompletedTs = j12;
        this.servicesDiscoveredTs = j13;
        this.charReadTs = j14;
        this.connectionEstablishedTs = j15;
        this.firstAuthAttemptTs = j16;
        this.lastAuthAttemptTs = j17;
        this.authResponseSentTs = j18;
        this.handlePulledWithoutAuthTs = j19;
        this.mtuTimedOut = z11;
        this.resetPeripheralDelayMs = j21;
        this.resetPeripheralWakeLockHeld = z12;
        this.failedPhase = str;
        this.failureStatus = str2;
        this.sessionId = sessionId;
        this.attemptNumber = i11;
        this.rssi = i12;
        this.autoConnect = z13;
        this.isOHOS = z14;
        this.vehicleModel = vehicleModel;
        this.authAttemptCount = i13;
        this.bluetoothEnabled = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAttemptNumber() {
        return this.attemptNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAuthAttemptCount() {
        return this.authAttemptCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getAuthResponseSentTs() {
        return this.authResponseSentTs;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getAutoConnect() {
        return this.autoConnect;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getBluetoothEnabled() {
        return this.bluetoothEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectionTimelinePayload)) {
            return false;
        }
        ConnectionTimelinePayload connectionTimelinePayload = (ConnectionTimelinePayload) other;
        return s.f(this.connectionId, connectionTimelinePayload.connectionId) && s.f(this.vin, connectionTimelinePayload.vin) && this.gattConnectedTs == connectionTimelinePayload.gattConnectedTs && this.mtuCompletedTs == connectionTimelinePayload.mtuCompletedTs && this.servicesDiscoveredTs == connectionTimelinePayload.servicesDiscoveredTs && this.charReadTs == connectionTimelinePayload.charReadTs && this.connectionEstablishedTs == connectionTimelinePayload.connectionEstablishedTs && this.firstAuthAttemptTs == connectionTimelinePayload.firstAuthAttemptTs && this.lastAuthAttemptTs == connectionTimelinePayload.lastAuthAttemptTs && this.authResponseSentTs == connectionTimelinePayload.authResponseSentTs && this.handlePulledWithoutAuthTs == connectionTimelinePayload.handlePulledWithoutAuthTs && this.mtuTimedOut == connectionTimelinePayload.mtuTimedOut && this.resetPeripheralDelayMs == connectionTimelinePayload.resetPeripheralDelayMs && this.resetPeripheralWakeLockHeld == connectionTimelinePayload.resetPeripheralWakeLockHeld && s.f(this.failedPhase, connectionTimelinePayload.failedPhase) && s.f(this.failureStatus, connectionTimelinePayload.failureStatus) && s.f(this.sessionId, connectionTimelinePayload.sessionId) && this.attemptNumber == connectionTimelinePayload.attemptNumber && this.rssi == connectionTimelinePayload.rssi && this.autoConnect == connectionTimelinePayload.autoConnect && this.isOHOS == connectionTimelinePayload.isOHOS && s.f(this.vehicleModel, connectionTimelinePayload.vehicleModel) && this.authAttemptCount == connectionTimelinePayload.authAttemptCount && this.bluetoothEnabled == connectionTimelinePayload.bluetoothEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getCharReadTs() {
        return this.charReadTs;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getConnectionEstablishedTs() {
        return this.connectionEstablishedTs;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getConnectionId() {
        return this.connectionId;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((this.connectionId.hashCode() * 31) + this.vin.hashCode()) * 31) + Long.hashCode(this.gattConnectedTs)) * 31) + Long.hashCode(this.mtuCompletedTs)) * 31) + Long.hashCode(this.servicesDiscoveredTs)) * 31) + Long.hashCode(this.charReadTs)) * 31) + Long.hashCode(this.connectionEstablishedTs)) * 31) + Long.hashCode(this.firstAuthAttemptTs)) * 31) + Long.hashCode(this.lastAuthAttemptTs)) * 31) + Long.hashCode(this.authResponseSentTs)) * 31) + Long.hashCode(this.handlePulledWithoutAuthTs)) * 31) + Boolean.hashCode(this.mtuTimedOut)) * 31) + Long.hashCode(this.resetPeripheralDelayMs)) * 31) + Boolean.hashCode(this.resetPeripheralWakeLockHeld)) * 31;
        String str = this.failedPhase;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.failureStatus;
        return ((((((((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.sessionId.hashCode()) * 31) + Integer.hashCode(this.attemptNumber)) * 31) + Integer.hashCode(this.rssi)) * 31) + Boolean.hashCode(this.autoConnect)) * 31) + Boolean.hashCode(this.isOHOS)) * 31) + this.vehicleModel.hashCode()) * 31) + Integer.hashCode(this.authAttemptCount)) * 31) + Boolean.hashCode(this.bluetoothEnabled);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getFailedPhase() {
        return this.failedPhase;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getFailureStatus() {
        return this.failureStatus;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getFirstAuthAttemptTs() {
        return this.firstAuthAttemptTs;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getGattConnectedTs() {
        return this.gattConnectedTs;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getHandlePulledWithoutAuthTs() {
        return this.handlePulledWithoutAuthTs;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getLastAuthAttemptTs() {
        return this.lastAuthAttemptTs;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getMtuCompletedTs() {
        return this.mtuCompletedTs;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getMtuTimedOut() {
        return this.mtuTimedOut;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getResetPeripheralDelayMs() {
        return this.resetPeripheralDelayMs;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getResetPeripheralWakeLockHeld() {
        return this.resetPeripheralWakeLockHeld;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getRssi() {
        return this.rssi;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getServicesDiscoveredTs() {
        return this.servicesDiscoveredTs;
    }

    public String toString() {
        return "ConnectionTimelinePayload(connectionId=" + this.connectionId + ", vin=" + this.vin + ", gattConnectedTs=" + this.gattConnectedTs + ", mtuCompletedTs=" + this.mtuCompletedTs + ", servicesDiscoveredTs=" + this.servicesDiscoveredTs + ", charReadTs=" + this.charReadTs + ", connectionEstablishedTs=" + this.connectionEstablishedTs + ", firstAuthAttemptTs=" + this.firstAuthAttemptTs + ", lastAuthAttemptTs=" + this.lastAuthAttemptTs + ", authResponseSentTs=" + this.authResponseSentTs + ", handlePulledWithoutAuthTs=" + this.handlePulledWithoutAuthTs + ", mtuTimedOut=" + this.mtuTimedOut + ", resetPeripheralDelayMs=" + this.resetPeripheralDelayMs + ", resetPeripheralWakeLockHeld=" + this.resetPeripheralWakeLockHeld + ", failedPhase=" + this.failedPhase + ", failureStatus=" + this.failureStatus + ", sessionId=" + this.sessionId + ", attemptNumber=" + this.attemptNumber + ", rssi=" + this.rssi + ", autoConnect=" + this.autoConnect + ", isOHOS=" + this.isOHOS + ", vehicleModel=" + this.vehicleModel + ", authAttemptCount=" + this.authAttemptCount + ", bluetoothEnabled=" + this.bluetoothEnabled + ")";
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getVehicleModel() {
        return this.vehicleModel;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getIsOHOS() {
        return this.isOHOS;
    }
}
