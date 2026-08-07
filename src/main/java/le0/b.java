package le0;

import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lle0/b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getValue", "Companion", "a", "PULL_TO_REFRESH", "TAP_STATUS_TEXT", "TAP_VEHICLE", "APP_FOREGROUND", "SCREEN_REQUIRES_WAKE", "USER_SENT_COMMAND", "BLE_SEND_COMMAND", "HERMES_SEND_COMMAND", "SIGNED_OAPI_SEND_COMMAND", "OAPI_SEND_COMMAND", "OAPI_COMMAND_OFFLINE", "SIGNED_OAPI_COMMAND_OFFLINE", "VEHICLE_DATA_POLLING", "VEHICLE_OFFLINE_NO_DATA", "UNKNOWN", "wake_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum b {
    PULL_TO_REFRESH("pull_down_refresh"),
    TAP_STATUS_TEXT("tap_status_text"),
    TAP_VEHICLE("tap_vehicle"),
    APP_FOREGROUND("app_foreground"),
    SCREEN_REQUIRES_WAKE("screen_requires_wake"),
    USER_SENT_COMMAND("user_initiated_command"),
    BLE_SEND_COMMAND("ble_send_command"),
    HERMES_SEND_COMMAND("hermes_send_command"),
    SIGNED_OAPI_SEND_COMMAND("signed_oapi_send_command"),
    OAPI_SEND_COMMAND("oapi_send_command"),
    OAPI_COMMAND_OFFLINE("oapi_command_offline"),
    SIGNED_OAPI_COMMAND_OFFLINE("signed_oapi_command_offline"),
    VEHICLE_DATA_POLLING("vehicle_data_polling"),
    VEHICLE_OFFLINE_NO_DATA("vehicle_offline_no_data"),
    UNKNOWN("unknown");

    private final String value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: le0.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lle0/b$a;", "", "<init>", "()V", "", "value", "Lle0/b;", "a", "(Ljava/lang/String;)Lle0/b;", "wake_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(String value) {
            b next;
            s.k(value, "value");
            Iterator<b> it = b.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.f(next.getValue(), value));
            b bVar = next;
            return bVar == null ? b.UNKNOWN : bVar;
        }

        private Companion() {
        }
    }

    b(String str) {
        this.value = str;
    }

    public static final b from(String str) {
        return INSTANCE.a(str);
    }

    public static EnumEntries<b> getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
