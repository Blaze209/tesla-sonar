package af0;

import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Arrays;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Laf0/a;", "", "a", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: af0.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000b¨\u0006\u0015"}, d2 = {"Laf0/a$a;", "", "<init>", "()V", "", PermissionsResponse.STATUS_KEY, "", "b", "(I)Ljava/lang/String;", "a", "GATT_CONN_OK", "I", "GATT_CONN_L2C_FAILURE", "GATT_CONN_TIMEOUT", "GATT_CONN_TERMINATE_PEER_USER", "GATT_CONN_TERMINATED_POWER_OFF", "GATT_CONN_TERMINATE_LOCAL_HOST", "GATT_CONN_FAIL_ESTABLISH", "GATT_CONN_LMP_TIMEOUT", "GATT_CONN_CANCEL", "BTA_GATT_CONN_NONE", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int status) {
            if (status == 0) {
                return "GATT CONN OK";
            }
            if (status == 1) {
                return "GATT CONN L2C FAILURE";
            }
            if (status == 8) {
                return "GATT CONN TIMEOUT";
            }
            if (status == 19) {
                return "GATT CONN TERMINATE PEER USER";
            }
            if (status == 34) {
                return "GATT CONN LMP TIMEOUT";
            }
            if (status == 62) {
                return "GATT CONN FAIL ESTABLISH";
            }
            if (status == 21) {
                return "GATT CONN TERMINATED POWER OFF";
            }
            if (status == 22) {
                return "GATT CONN TERMINATE LOCAL HOST";
            }
            if (status != 256) {
                return status != 257 ? "GATT CONN UNKNOWN" : "NO GATT CONN TO CANCEL";
            }
            return "GATT CONN CANCEL";
        }

        public final String b(int status) {
            t0 t0Var = t0.f86535a;
            String str = String.format(Locale.US, "0x%04X", Arrays.copyOf(new Object[]{Integer.valueOf(status)}, 1));
            s.j(str, "format(...)");
            return str;
        }

        private Companion() {
        }
    }

    public static final String a(int i11) {
        return INSTANCE.a(i11);
    }

    public static final String b(int i11) {
        return INSTANCE.b(i11);
    }
}
