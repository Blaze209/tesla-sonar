package af0;

import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Arrays;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Laf0/b;", "", "a", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: af0.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b0\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000bR\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000bR\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000bR\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000bR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000bR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000bR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u000bR\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u000bR\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u000bR\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u000bR\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u000bR\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u000bR\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u000bR\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u000bR\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u000bR\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u000bR\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u000bR\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u000bR\u0014\u0010,\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u000bR\u0014\u0010-\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u000bR\u0014\u0010.\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u000bR\u0014\u0010/\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u000bR\u0014\u00100\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u000bR\u0014\u00101\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u000bR\u0014\u00102\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u000bR\u0014\u00103\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u000bR\u0014\u00104\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u000bR\u0014\u00105\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u000b¨\u00066"}, d2 = {"Laf0/b$a;", "", "<init>", "()V", "", PermissionsResponse.STATUS_KEY, "", "b", "(I)Ljava/lang/String;", "a", "GATT_SUCCESS", "I", "GATT_INVALID_HANDLE", "GATT_READ_NOT_PERMIT", "GATT_WRITE_NOT_PERMIT", "GATT_INVALID_PDU", "GATT_INSUF_AUTHENTICATION", "GATT_REQ_NOT_SUPPORTED", "GATT_INVALID_OFFSET", "GATT_INSUF_AUTHORIZATION", "GATT_PREPARE_Q_FULL", "GATT_NOT_FOUND", "GATT_NOT_LONG", "GATT_INSUF_KEY_SIZE", "GATT_INVALID_ATTR_LEN", "GATT_ERR_UNLIKELY", "GATT_INSUF_ENCRYPTION", "GATT_UNSUPPORT_GRP_TYPE", "GATT_INSUF_RESOURCE", "GATT_DATABASE_OUT_OF_SYNC", "GATT_VALUE_NOT_ALLOWED", "GATT_TOO_SHORT", "GATT_NO_RESOURCES", "GATT_INTERNAL_ERROR", "GATT_WRONG_STATE", "GATT_DB_FULL", "GATT_BUSY", "GATT_ERROR", "GATT_CMD_STARTED", "GATT_ILLEGAL_PARAMETER", "GATT_PENDING", "GATT_AUTH_FAIL", "GATT_MORE", "GATT_INVALID_CFG", "GATT_SERVICE_STARTED", "GATT_ENCRYPED_NO_MITM", "GATT_NOT_ENCRYPTED", "GATT_CONGESTED", "GATT_DUP_REG", "GATT_ALREADY_OPEN", "GATT_CANCEL", "GATT_CCC_CFG_ERR", "GATT_PRC_IN_PROGRESS", "GATT_OUT_OF_RANGE", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int status) {
            switch (status) {
                case 0:
                    return "GATT SUCCESS";
                case 1:
                    return "GATT INVALID HANDLE";
                case 2:
                    return "GATT READ NOT PERMIT";
                case 3:
                    return "GATT WRITE NOT PERMIT";
                case 4:
                    return "GATT INVALID PDU";
                case 5:
                    return "GATT INSUF AUTHENTICATION";
                case 6:
                    return "GATT REQ NOT SUPPORTED";
                case 7:
                    return "GATT INVALID OFFSET";
                case 8:
                    return "GATT INSUF AUTHORIZATION";
                case 9:
                    return "GATT PREPARE Q FULL";
                case 10:
                    return "GATT NOT FOUND";
                case 11:
                    return "GATT NOT LONG";
                case 12:
                    return "GATT INSUF KEY SIZE";
                case 13:
                    return "GATT INVALID ATTR LEN";
                case 14:
                    return "GATT ERR UNLIKELY";
                case 15:
                    return "GATT INSUF ENCRYPTION";
                case 16:
                    return "GATT UNSUPPORT GRP TYPE";
                case 17:
                    return "GATT INSUF RESOURCE";
                case 18:
                    return "GATT DATABASE OUT OF SYNC";
                case 19:
                    return "GATT VALUE NOT ALLOWED";
                default:
                    switch (status) {
                        case 127:
                            return "GATT TOO SHORT";
                        case 128:
                            return "GATT NO RESOURCES";
                        case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                            return "GATT INTERNAL ERROR";
                        case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                            return "GATT WRONG STATE";
                        case 131:
                            return "GATT DB FULL";
                        case 132:
                            return "GATT BUSY";
                        case 133:
                            return "GATT ERROR";
                        case 134:
                            return "GATT CMD STARTED";
                        case 135:
                            return "GATT ILLEGAL PARAMETER";
                        case 136:
                            return "GATT PENDING";
                        case 137:
                            return "GATT AUTH FAIL";
                        case 138:
                            return "GATT MORE";
                        case 139:
                            return "GATT INVALID CFG";
                        case 140:
                            return "GATT SERVICE STARTED";
                        case 141:
                            return "GATT ENCRYPED NO MITM";
                        case 142:
                            return "GATT NOT ENCRYPTED";
                        case 143:
                            return "GATT CONGESTED";
                        case 144:
                            return "GATT DUP REG";
                        case 145:
                            return "GATT ALREADY OPEN";
                        case 146:
                            return "GATT CANCEL";
                        default:
                            switch (status) {
                                case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE:
                                    return "GATT CCC CFG ERR";
                                case SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE:
                                    return "GATT PRC IN PROGRESS";
                                case 255:
                                    return "GATT OUT OF RANGE";
                                default:
                                    return "GATT UNKNOWN";
                            }
                    }
            }
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
