package com.teslamotors.plugins.ble;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.HashMap;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: com.teslamotors.plugins.ble.b0, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0003\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b\u0018\u0010 ¨\u0006&"}, d2 = {"Lcom/teslamotors/plugins/ble/b0;", "", "", "isBluetoothEnabled", "", "connectionStartedTimestamp", "connectedTimestamp", "disconnectedTimestamp", "controllerCreatedTimestamp", "bluetoothEnabledTimestamp", "<init>", "(ZJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "", "", "c", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "J", "getConnectionStartedTimestamp", "()J", "Ljava/lang/Long;", "()Ljava/lang/Long;", DateTokenConverter.CONVERTER_KEY, "getDisconnectedTimestamp", "e", "getControllerCreatedTimestamp", "f", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HandlePulledWithoutAuthDiagnosisInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBluetoothEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long connectionStartedTimestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long connectedTimestamp;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long disconnectedTimestamp;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long controllerCreatedTimestamp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long bluetoothEnabledTimestamp;

    public HandlePulledWithoutAuthDiagnosisInfo(boolean z11, long j11, Long l11, Long l12, Long l13, Long l14) {
        this.isBluetoothEnabled = z11;
        this.connectionStartedTimestamp = j11;
        this.connectedTimestamp = l11;
        this.disconnectedTimestamp = l12;
        this.controllerCreatedTimestamp = l13;
        this.bluetoothEnabledTimestamp = l14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getBluetoothEnabledTimestamp() {
        return this.bluetoothEnabledTimestamp;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getConnectedTimestamp() {
        return this.connectedTimestamp;
    }

    public final Map<String, String> c() {
        HashMap map = new HashMap();
        map.put("bluetooth_enabled", String.valueOf(this.isBluetoothEnabled));
        map.put("peripheral_connection_started_timestamp", String.valueOf(this.connectionStartedTimestamp));
        Long l11 = this.connectedTimestamp;
        if (l11 != null) {
            map.put("indications_connection_started_timestamp", l11.toString());
        }
        Long l12 = this.disconnectedTimestamp;
        if (l12 != null) {
            map.put("indications_disconnection_timestamp", l12.toString());
        }
        Long l13 = this.controllerCreatedTimestamp;
        if (l13 != null) {
            map.put("controller_created_timestamp", l13.toString());
        }
        Long l14 = this.bluetoothEnabledTimestamp;
        if (l14 != null) {
            map.put("bluetooth_enabled_timestamp", l14.toString());
        }
        return map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HandlePulledWithoutAuthDiagnosisInfo)) {
            return false;
        }
        HandlePulledWithoutAuthDiagnosisInfo handlePulledWithoutAuthDiagnosisInfo = (HandlePulledWithoutAuthDiagnosisInfo) other;
        return this.isBluetoothEnabled == handlePulledWithoutAuthDiagnosisInfo.isBluetoothEnabled && this.connectionStartedTimestamp == handlePulledWithoutAuthDiagnosisInfo.connectionStartedTimestamp && p013kotlin.jvm.internal.s.f(this.connectedTimestamp, handlePulledWithoutAuthDiagnosisInfo.connectedTimestamp) && p013kotlin.jvm.internal.s.f(this.disconnectedTimestamp, handlePulledWithoutAuthDiagnosisInfo.disconnectedTimestamp) && p013kotlin.jvm.internal.s.f(this.controllerCreatedTimestamp, handlePulledWithoutAuthDiagnosisInfo.controllerCreatedTimestamp) && p013kotlin.jvm.internal.s.f(this.bluetoothEnabledTimestamp, handlePulledWithoutAuthDiagnosisInfo.bluetoothEnabledTimestamp);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isBluetoothEnabled) * 31) + Long.hashCode(this.connectionStartedTimestamp)) * 31;
        Long l11 = this.connectedTimestamp;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.disconnectedTimestamp;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.controllerCreatedTimestamp;
        int iHashCode4 = (iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.bluetoothEnabledTimestamp;
        return iHashCode4 + (l14 != null ? l14.hashCode() : 0);
    }

    public String toString() {
        return "HandlePulledWithoutAuthDiagnosisInfo(isBluetoothEnabled=" + this.isBluetoothEnabled + ", connectionStartedTimestamp=" + this.connectionStartedTimestamp + ", connectedTimestamp=" + this.connectedTimestamp + ", disconnectedTimestamp=" + this.disconnectedTimestamp + ", controllerCreatedTimestamp=" + this.controllerCreatedTimestamp + ", bluetoothEnabledTimestamp=" + this.bluetoothEnabledTimestamp + ")";
    }
}
