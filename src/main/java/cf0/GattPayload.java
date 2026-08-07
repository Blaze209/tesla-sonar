package cf0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import expo.modules.interfaces.permissions.PermissionsResponse;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: cf0.g, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u0010¨\u0006,"}, d2 = {"Lcf0/g;", "", "", "vin", PermissionsResponse.STATUS_KEY, "method", "", "status_timestamp_ms", "last_connected_timestamp_ms", "", "bluetooth_enabled", "number_of_tries", "connection_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZJLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getVin", "b", "getStatus", "c", "getMethod", DateTokenConverter.CONVERTER_KEY, "J", "getStatus_timestamp_ms", "()J", "e", "getLast_connected_timestamp_ms", "f", "Z", "getBluetooth_enabled", "()Z", "g", "getNumber_of_tries", "h", "getConnection_id", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GattPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String vin;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String method;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long status_timestamp_ms;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long last_connected_timestamp_ms;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean bluetooth_enabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long number_of_tries;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String connection_id;

    public GattPayload(String vin, String status, String method, long j11, long j12, boolean z11, long j13, String connection_id) {
        s.k(vin, "vin");
        s.k(status, "status");
        s.k(method, "method");
        s.k(connection_id, "connection_id");
        this.vin = vin;
        this.status = status;
        this.method = method;
        this.status_timestamp_ms = j11;
        this.last_connected_timestamp_ms = j12;
        this.bluetooth_enabled = z11;
        this.number_of_tries = j13;
        this.connection_id = connection_id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GattPayload)) {
            return false;
        }
        GattPayload gattPayload = (GattPayload) other;
        return s.f(this.vin, gattPayload.vin) && s.f(this.status, gattPayload.status) && s.f(this.method, gattPayload.method) && this.status_timestamp_ms == gattPayload.status_timestamp_ms && this.last_connected_timestamp_ms == gattPayload.last_connected_timestamp_ms && this.bluetooth_enabled == gattPayload.bluetooth_enabled && this.number_of_tries == gattPayload.number_of_tries && s.f(this.connection_id, gattPayload.connection_id);
    }

    public int hashCode() {
        return (((((((((((((this.vin.hashCode() * 31) + this.status.hashCode()) * 31) + this.method.hashCode()) * 31) + Long.hashCode(this.status_timestamp_ms)) * 31) + Long.hashCode(this.last_connected_timestamp_ms)) * 31) + Boolean.hashCode(this.bluetooth_enabled)) * 31) + Long.hashCode(this.number_of_tries)) * 31) + this.connection_id.hashCode();
    }

    public String toString() {
        return "GattPayload(vin=" + this.vin + ", status=" + this.status + ", method=" + this.method + ", status_timestamp_ms=" + this.status_timestamp_ms + ", last_connected_timestamp_ms=" + this.last_connected_timestamp_ms + ", bluetooth_enabled=" + this.bluetooth_enabled + ", number_of_tries=" + this.number_of_tries + ", connection_id=" + this.connection_id + ")";
    }
}
