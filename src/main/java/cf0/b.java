package cf0;

import java.util.HashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcf0/a;", "", "", "", "b", "(Lcf0/a;)Ljava/util/Map;", "", "start", "end", "a", "(JJ)J", "tesla-ble_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    private static final long a(long j11, long j12) {
        if (j11 == 0 || j12 == 0) {
            return 0L;
        }
        return j12 - j11;
    }

    public static final Map<String, Object> b(ConnectionTimelinePayload connectionTimelinePayload) {
        long mtuCompletedTs;
        String str;
        s.k(connectionTimelinePayload, "<this>");
        HashMap map = new HashMap();
        map.put("activity", "mobile-app-ble-connection-timeline");
        map.put("v", 2);
        map.put("connection_id", connectionTimelinePayload.getConnectionId());
        map.put("phase_mtu_ms", Long.valueOf(a(connectionTimelinePayload.getGattConnectedTs(), connectionTimelinePayload.getMtuCompletedTs())));
        map.put("phase_discover_ms", Long.valueOf(a(connectionTimelinePayload.getMtuCompletedTs(), connectionTimelinePayload.getServicesDiscoveredTs())));
        map.put("phase_read_version_ms", Long.valueOf(connectionTimelinePayload.getCharReadTs() == 0 ? 0L : a(connectionTimelinePayload.getServicesDiscoveredTs(), connectionTimelinePayload.getCharReadTs())));
        map.put("phase_indication_ms", Long.valueOf(a(connectionTimelinePayload.getCharReadTs() != 0 ? connectionTimelinePayload.getCharReadTs() : connectionTimelinePayload.getServicesDiscoveredTs(), connectionTimelinePayload.getConnectionEstablishedTs())));
        map.put("phase_auth_ms", Long.valueOf(a(connectionTimelinePayload.getConnectionEstablishedTs(), connectionTimelinePayload.getAuthResponseSentTs())));
        map.put("phase_auth_first_attempt_ms", Long.valueOf(a(connectionTimelinePayload.getConnectionEstablishedTs(), connectionTimelinePayload.getFirstAuthAttemptTs())));
        map.put("phase_auth_recovery_ms", Long.valueOf(a(connectionTimelinePayload.getFirstAuthAttemptTs(), connectionTimelinePayload.getLastAuthAttemptTs())));
        map.put("phase_auth_success_ms", Long.valueOf(a(connectionTimelinePayload.getLastAuthAttemptTs(), connectionTimelinePayload.getAuthResponseSentTs())));
        map.put("auth_attempt_count", Integer.valueOf(connectionTimelinePayload.getAuthAttemptCount()));
        boolean z11 = false;
        map.put("auth_session_recovery", Boolean.valueOf(connectionTimelinePayload.getAuthAttemptCount() > 1));
        map.put("handle_pull_delta_ms", Long.valueOf(a(connectionTimelinePayload.getGattConnectedTs(), connectionTimelinePayload.getHandlePulledWithoutAuthTs())));
        if (connectionTimelinePayload.getAuthResponseSentTs() > 0) {
            mtuCompletedTs = connectionTimelinePayload.getAuthResponseSentTs();
        } else if (connectionTimelinePayload.getConnectionEstablishedTs() > 0) {
            mtuCompletedTs = connectionTimelinePayload.getConnectionEstablishedTs();
        } else if (connectionTimelinePayload.getCharReadTs() > 0) {
            mtuCompletedTs = connectionTimelinePayload.getCharReadTs();
        } else if (connectionTimelinePayload.getServicesDiscoveredTs() > 0) {
            mtuCompletedTs = connectionTimelinePayload.getServicesDiscoveredTs();
        } else {
            mtuCompletedTs = connectionTimelinePayload.getMtuCompletedTs() > 0 ? connectionTimelinePayload.getMtuCompletedTs() : connectionTimelinePayload.getGattConnectedTs();
        }
        map.put("phase_total_ms", Long.valueOf(a(connectionTimelinePayload.getGattConnectedTs(), mtuCompletedTs)));
        if (connectionTimelinePayload.getAuthResponseSentTs() > 0) {
            str = "success";
        } else if (s.f(connectionTimelinePayload.getFailedPhase(), "disconnected") || s.f(connectionTimelinePayload.getFailedPhase(), "intentional_disconnect")) {
            str = "disconnected";
        } else {
            str = connectionTimelinePayload.getFailedPhase() != null ? "failure" : "incomplete";
        }
        map.put("outcome", str);
        String failedPhase = connectionTimelinePayload.getFailedPhase();
        if (failedPhase == null) {
            failedPhase = "";
        }
        map.put("failed_phase", failedPhase);
        String failureStatus = connectionTimelinePayload.getFailureStatus();
        map.put("failure_status", failureStatus != null ? failureStatus : "");
        map.put("mtu_timed_out", Boolean.valueOf(connectionTimelinePayload.getMtuTimedOut()));
        map.put("mtu_timeout_then_established", Boolean.valueOf(connectionTimelinePayload.getMtuTimedOut() && connectionTimelinePayload.getConnectionEstablishedTs() > 0));
        if (connectionTimelinePayload.getMtuTimedOut() && connectionTimelinePayload.getAuthResponseSentTs() > 0) {
            z11 = true;
        }
        map.put("mtu_timeout_then_auth_sent", Boolean.valueOf(z11));
        map.put("reset_peripheral_delay_ms", Long.valueOf(connectionTimelinePayload.getResetPeripheralDelayMs()));
        map.put("reset_peripheral_wake_lock_held", Boolean.valueOf(connectionTimelinePayload.getResetPeripheralWakeLockHeld()));
        map.put("bluetooth_enabled", Boolean.valueOf(connectionTimelinePayload.getBluetoothEnabled()));
        map.put("session_id", connectionTimelinePayload.getSessionId());
        map.put("attempt_number", Integer.valueOf(connectionTimelinePayload.getAttemptNumber()));
        map.put("rssi", Integer.valueOf(connectionTimelinePayload.getRssi()));
        map.put("auto_connect", Boolean.valueOf(connectionTimelinePayload.getAutoConnect()));
        map.put("is_ohos", Boolean.valueOf(connectionTimelinePayload.getIsOHOS()));
        map.put("vehicle_model", connectionTimelinePayload.getVehicleModel());
        return map;
    }
}
