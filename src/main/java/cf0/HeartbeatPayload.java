package cf0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: cf0.i, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001a¨\u0006!"}, d2 = {"Lcf0/i;", "", "", "vin", "", "service_created_timestamp_ms", "last_heartbeat_timestamp_ms", "first_heartbeat_system_elapsed_time", "last_heartbeat_system_elapsed_time", "<init>", "(Ljava/lang/String;JJJJ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getVin", "b", "J", "getService_created_timestamp_ms", "()J", "c", "getLast_heartbeat_timestamp_ms", DateTokenConverter.CONVERTER_KEY, "getFirst_heartbeat_system_elapsed_time", "e", "getLast_heartbeat_system_elapsed_time", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HeartbeatPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String vin;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long service_created_timestamp_ms;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long last_heartbeat_timestamp_ms;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long first_heartbeat_system_elapsed_time;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long last_heartbeat_system_elapsed_time;

    public HeartbeatPayload(String vin, long j11, long j12, long j13, long j14) {
        s.k(vin, "vin");
        this.vin = vin;
        this.service_created_timestamp_ms = j11;
        this.last_heartbeat_timestamp_ms = j12;
        this.first_heartbeat_system_elapsed_time = j13;
        this.last_heartbeat_system_elapsed_time = j14;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartbeatPayload)) {
            return false;
        }
        HeartbeatPayload heartbeatPayload = (HeartbeatPayload) other;
        return s.f(this.vin, heartbeatPayload.vin) && this.service_created_timestamp_ms == heartbeatPayload.service_created_timestamp_ms && this.last_heartbeat_timestamp_ms == heartbeatPayload.last_heartbeat_timestamp_ms && this.first_heartbeat_system_elapsed_time == heartbeatPayload.first_heartbeat_system_elapsed_time && this.last_heartbeat_system_elapsed_time == heartbeatPayload.last_heartbeat_system_elapsed_time;
    }

    public int hashCode() {
        return (((((((this.vin.hashCode() * 31) + Long.hashCode(this.service_created_timestamp_ms)) * 31) + Long.hashCode(this.last_heartbeat_timestamp_ms)) * 31) + Long.hashCode(this.first_heartbeat_system_elapsed_time)) * 31) + Long.hashCode(this.last_heartbeat_system_elapsed_time);
    }

    public String toString() {
        return "HeartbeatPayload(vin=" + this.vin + ", service_created_timestamp_ms=" + this.service_created_timestamp_ms + ", last_heartbeat_timestamp_ms=" + this.last_heartbeat_timestamp_ms + ", first_heartbeat_system_elapsed_time=" + this.first_heartbeat_system_elapsed_time + ", last_heartbeat_system_elapsed_time=" + this.last_heartbeat_system_elapsed_time + ")";
    }
}
