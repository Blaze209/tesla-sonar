package ic0;

import com.squareup.wire.ProtoAdapter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ic0.h, still in use, count: 1, list:
  (r0v0 ic0.h) from 0x0421: CONSTRUCTOR 
  (wrap co0.d:0x0419: INVOKE (wrap java.lang.Class:0x0417: CONST_CLASS  A[WRAPPED] (LINE:1048) ic0.h.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:1050))
  (wrap com.squareup.wire.o:0x041d: SGET  A[WRAPPED] (LINE:1054) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 ic0.h)
 A[MD:(co0.d<ic0.h>, com.squareup.wire.o, ic0.h):void (m), WRAPPED] (LINE:1058) call: ic0.h.a.<init>(co0.d, com.squareup.wire.o, ic0.h):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\\\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^¨\u0006_"}, d2 = {"Lic0/h;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "RESULT_NONE", "RESULT_SUCCESS", "RESULT_SIGNED_COMMANDS_NOT_SUPPORTED", "RESULT_TIMEOUT", "RESULT_NOT_IN_WHITELIST", "RESULT_INTERNAL_ERROR", "RESULT_UNSUPPORTED_COMMAND", "RESULT_UNKNOWN_ERROR", "RESULT_UNAUTHORIZED", "RESULT_SERVER_ERROR", "RESULT_CONNECTION_ERROR", "RESULT_BLUETOOTH_DISABLED", "RESULT_SCAN_IN_PROGRESS", "RESULT_NO_PERIPHERALS", "RESULT_NOT_CONNECTED", "RESULT_TRANSMISSION_FAILURE", "RESULT_NO_KEYS_CREATED", "RESULT_WHITELIST_FULL", "RESULT_PUBLIC_KEY_NOT_FOUND", "RESULT_INVALID_STATE", "RESULT_NOMINAL_ERROR", "RESULT_INSUFFICIENT_PRIVILEGES", "RESULT_TOO_MANY_REQUESTS", "RESULT_INVALID_COMMAND_REQUEST", "RESULT_CAR_SERVER_ERROR", "RESULT_INCORRECT_SESSION_INFO_ERROR", "RESULT_APPLICATION_ERROR", "RESULT_INVALID_MESSAGE_ERROR", "RESULT_HERMES_INTERNAL_ERROR", "RESULT_TOKEN_ERROR", "RESULT_UNRECOGNIZED_ENUM_VALUE", "RESULT_CONNECTIVITY_SUBSCRIPTION_FAILURE", "RESULT_VEHICLE_INTERNAL_ERROR", "RESULT_VEHICLE_BUSY_ERROR", "RESULT_VEHICLE_WAIT_ERROR", "RESULT_SESSION_INFO_RECOVERED", "RESULT_VEHICLE_TIMEOUT", "RESULT_MOBILE_ACCESS_DISABLED", "RESULT_VEHICLE_NOT_CONNECTED", "RESULT_CONFIG_CONNECTIVITY_DISABLED", "RESULT_BAD_PARAMETER", "RESULT_SIGNED_COMMANDS_REQUIRED", "RESULT_FORBIDDEN", "RESULT_VEHICLE_NOT_AWAKE", "RESULT_NO_NETWORK", "RESULT_BLE_SERVICE_DISCONNECTED", "RESULT_MISSING_EMAIL", "RESULT_MISSING_VIN", "RESULT_MISSING_VEHICLE_DATA", "RESULT_MISSING_VEHICLE_DATA_VIN", "RESULT_MISSING_VEHICLE_DATA_API_VERSION", "RESULT_MISSING_REQUEST_VIN", "RESULT_VEHICLE_DATA_LOOKUP_FAILURE", "RESULT_MESSAGE_BUILD_FAILURE", "RESULT_MESSAGE_EVALUATION_FAILURE", "RESULT_LEGACY_BLE_COMMAND_FAILURE", "RESULT_UNSUPPORTED_KEY_VERSION", "RESULT_REQUEST_TARGETS_NON_SELECTED_VEHICLE", "RESULT_EXCEPTION_THROWN", "RESULT_DEPENDENT_SESSION_INFO_FAILURE", "RESULT_WHITELIST_OPERATION_FAILURE", "RESULT_BLE_SERVICE_NULL", "RESULT_BLE_SERVICE_REMOTE_EXCEPTION", "RESULT_ERROR_REQUEST_MTU_EXCEEDED", "RESULT_ERROR_RESPONSE_MTU_EXCEEDED", "RESULT_REQUEST_REPLACED_BY_NEW_REQUEST", "RESULT_MISSING_SESSION_INFO_VALIDATION_DATA", "RESULT_SESSION_INFO_VALIDATION_FAILURE", "RESULT_SOCKET_EXCEPTION", "RESULT_INVALID_HANDLE", "RESULT_COMMAND_RESPONSE_REQUIRES_ENCRYPTION", "RESULT_SOURCE_PUBLIC_KEY_NOT_FOUND", "RESULT_VEHICLE_LOOKUP_FAILURE", "RESULT_EMPTY_SESSION_INFO_SIGNATURE", "RESULT_INVALID_VEHICLE_PUBLIC_KEY", "RESULT_SERVER_SYSTEM_WIDE_ERROR", "RESULT_SERVER_MAINTENANCE", "RESULT_ACCOUNT_LOCKED", "RESULT_BAD_REQUEST", "RESULT_NOT_FOUND", "RESULT_BACKEND_DEPENDENCY_FAILURE", "RESULT_UNPROCESSABLE_ENTITY", "RESULT_UPSTREAM_DEPENDENCY_ERROR", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements com.squareup.wire.p {
    RESULT_NONE(0),
    RESULT_SUCCESS(1),
    RESULT_SIGNED_COMMANDS_NOT_SUPPORTED(2),
    RESULT_TIMEOUT(3),
    RESULT_NOT_IN_WHITELIST(4),
    RESULT_INTERNAL_ERROR(5),
    RESULT_UNSUPPORTED_COMMAND(6),
    RESULT_UNKNOWN_ERROR(7),
    RESULT_UNAUTHORIZED(8),
    RESULT_SERVER_ERROR(9),
    RESULT_CONNECTION_ERROR(10),
    RESULT_BLUETOOTH_DISABLED(11),
    RESULT_SCAN_IN_PROGRESS(12),
    RESULT_NO_PERIPHERALS(13),
    RESULT_NOT_CONNECTED(14),
    RESULT_TRANSMISSION_FAILURE(15),
    RESULT_NO_KEYS_CREATED(16),
    RESULT_WHITELIST_FULL(17),
    RESULT_PUBLIC_KEY_NOT_FOUND(18),
    RESULT_INVALID_STATE(19),
    RESULT_NOMINAL_ERROR(20),
    RESULT_INSUFFICIENT_PRIVILEGES(21),
    RESULT_TOO_MANY_REQUESTS(22),
    RESULT_INVALID_COMMAND_REQUEST(23),
    RESULT_CAR_SERVER_ERROR(24),
    RESULT_INCORRECT_SESSION_INFO_ERROR(25),
    RESULT_APPLICATION_ERROR(26),
    RESULT_INVALID_MESSAGE_ERROR(27),
    RESULT_HERMES_INTERNAL_ERROR(28),
    RESULT_TOKEN_ERROR(29),
    RESULT_UNRECOGNIZED_ENUM_VALUE(30),
    RESULT_CONNECTIVITY_SUBSCRIPTION_FAILURE(31),
    RESULT_VEHICLE_INTERNAL_ERROR(32),
    RESULT_VEHICLE_BUSY_ERROR(33),
    RESULT_VEHICLE_WAIT_ERROR(34),
    RESULT_SESSION_INFO_RECOVERED(35),
    RESULT_VEHICLE_TIMEOUT(36),
    RESULT_MOBILE_ACCESS_DISABLED(37),
    RESULT_VEHICLE_NOT_CONNECTED(38),
    RESULT_CONFIG_CONNECTIVITY_DISABLED(40),
    RESULT_BAD_PARAMETER(41),
    RESULT_SIGNED_COMMANDS_REQUIRED(42),
    RESULT_FORBIDDEN(43),
    RESULT_VEHICLE_NOT_AWAKE(44),
    RESULT_NO_NETWORK(45),
    RESULT_BLE_SERVICE_DISCONNECTED(46),
    RESULT_MISSING_EMAIL(47),
    RESULT_MISSING_VIN(48),
    RESULT_MISSING_VEHICLE_DATA(49),
    RESULT_MISSING_VEHICLE_DATA_VIN(50),
    RESULT_MISSING_VEHICLE_DATA_API_VERSION(51),
    RESULT_MISSING_REQUEST_VIN(52),
    RESULT_VEHICLE_DATA_LOOKUP_FAILURE(53),
    RESULT_MESSAGE_BUILD_FAILURE(54),
    RESULT_MESSAGE_EVALUATION_FAILURE(55),
    RESULT_LEGACY_BLE_COMMAND_FAILURE(56),
    RESULT_UNSUPPORTED_KEY_VERSION(57),
    RESULT_REQUEST_TARGETS_NON_SELECTED_VEHICLE(58),
    RESULT_EXCEPTION_THROWN(59),
    RESULT_DEPENDENT_SESSION_INFO_FAILURE(60),
    RESULT_WHITELIST_OPERATION_FAILURE(61),
    RESULT_BLE_SERVICE_NULL(62),
    RESULT_BLE_SERVICE_REMOTE_EXCEPTION(63),
    RESULT_ERROR_REQUEST_MTU_EXCEEDED(64),
    RESULT_ERROR_RESPONSE_MTU_EXCEEDED(65),
    RESULT_REQUEST_REPLACED_BY_NEW_REQUEST(66),
    RESULT_MISSING_SESSION_INFO_VALIDATION_DATA(67),
    RESULT_SESSION_INFO_VALIDATION_FAILURE(68),
    RESULT_SOCKET_EXCEPTION(69),
    RESULT_INVALID_HANDLE(70),
    RESULT_COMMAND_RESPONSE_REQUIRES_ENCRYPTION(71),
    RESULT_SOURCE_PUBLIC_KEY_NOT_FOUND(72),
    RESULT_VEHICLE_LOOKUP_FAILURE(73),
    RESULT_EMPTY_SESSION_INFO_SIGNATURE(74),
    RESULT_INVALID_VEHICLE_PUBLIC_KEY(75),
    RESULT_SERVER_SYSTEM_WIDE_ERROR(76),
    RESULT_SERVER_MAINTENANCE(77),
    RESULT_ACCOUNT_LOCKED(78),
    RESULT_BAD_REQUEST(79),
    RESULT_NOT_FOUND(80),
    RESULT_BACKEND_DEPENDENCY_FAILURE(81),
    RESULT_UNPROCESSABLE_ENTITY(82),
    RESULT_UPSTREAM_DEPENDENCY_ERROR(83);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<h> ADAPTER = new com.squareup.wire.a<h>(o0.b(h.class), com.squareup.wire.o.PROTO_3, new h(0)) { // from class: ic0.h.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public h d(int value) {
            return h.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: ic0.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lic0/h$b;", "", "<init>", "()V", "", "value", "Lic0/h;", "a", "(I)Lic0/h;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(int value) {
            switch (value) {
                case 0:
                    return h.RESULT_NONE;
                case 1:
                    return h.RESULT_SUCCESS;
                case 2:
                    return h.RESULT_SIGNED_COMMANDS_NOT_SUPPORTED;
                case 3:
                    return h.RESULT_TIMEOUT;
                case 4:
                    return h.RESULT_NOT_IN_WHITELIST;
                case 5:
                    return h.RESULT_INTERNAL_ERROR;
                case 6:
                    return h.RESULT_UNSUPPORTED_COMMAND;
                case 7:
                    return h.RESULT_UNKNOWN_ERROR;
                case 8:
                    return h.RESULT_UNAUTHORIZED;
                case 9:
                    return h.RESULT_SERVER_ERROR;
                case 10:
                    return h.RESULT_CONNECTION_ERROR;
                case 11:
                    return h.RESULT_BLUETOOTH_DISABLED;
                case 12:
                    return h.RESULT_SCAN_IN_PROGRESS;
                case 13:
                    return h.RESULT_NO_PERIPHERALS;
                case 14:
                    return h.RESULT_NOT_CONNECTED;
                case 15:
                    return h.RESULT_TRANSMISSION_FAILURE;
                case 16:
                    return h.RESULT_NO_KEYS_CREATED;
                case 17:
                    return h.RESULT_WHITELIST_FULL;
                case 18:
                    return h.RESULT_PUBLIC_KEY_NOT_FOUND;
                case 19:
                    return h.RESULT_INVALID_STATE;
                case 20:
                    return h.RESULT_NOMINAL_ERROR;
                case 21:
                    return h.RESULT_INSUFFICIENT_PRIVILEGES;
                case 22:
                    return h.RESULT_TOO_MANY_REQUESTS;
                case 23:
                    return h.RESULT_INVALID_COMMAND_REQUEST;
                case 24:
                    return h.RESULT_CAR_SERVER_ERROR;
                case 25:
                    return h.RESULT_INCORRECT_SESSION_INFO_ERROR;
                case 26:
                    return h.RESULT_APPLICATION_ERROR;
                case 27:
                    return h.RESULT_INVALID_MESSAGE_ERROR;
                case 28:
                    return h.RESULT_HERMES_INTERNAL_ERROR;
                case 29:
                    return h.RESULT_TOKEN_ERROR;
                case 30:
                    return h.RESULT_UNRECOGNIZED_ENUM_VALUE;
                case 31:
                    return h.RESULT_CONNECTIVITY_SUBSCRIPTION_FAILURE;
                case 32:
                    return h.RESULT_VEHICLE_INTERNAL_ERROR;
                case 33:
                    return h.RESULT_VEHICLE_BUSY_ERROR;
                case 34:
                    return h.RESULT_VEHICLE_WAIT_ERROR;
                case 35:
                    return h.RESULT_SESSION_INFO_RECOVERED;
                case 36:
                    return h.RESULT_VEHICLE_TIMEOUT;
                case 37:
                    return h.RESULT_MOBILE_ACCESS_DISABLED;
                case 38:
                    return h.RESULT_VEHICLE_NOT_CONNECTED;
                case 39:
                default:
                    return null;
                case 40:
                    return h.RESULT_CONFIG_CONNECTIVITY_DISABLED;
                case 41:
                    return h.RESULT_BAD_PARAMETER;
                case 42:
                    return h.RESULT_SIGNED_COMMANDS_REQUIRED;
                case 43:
                    return h.RESULT_FORBIDDEN;
                case 44:
                    return h.RESULT_VEHICLE_NOT_AWAKE;
                case 45:
                    return h.RESULT_NO_NETWORK;
                case 46:
                    return h.RESULT_BLE_SERVICE_DISCONNECTED;
                case 47:
                    return h.RESULT_MISSING_EMAIL;
                case 48:
                    return h.RESULT_MISSING_VIN;
                case 49:
                    return h.RESULT_MISSING_VEHICLE_DATA;
                case 50:
                    return h.RESULT_MISSING_VEHICLE_DATA_VIN;
                case 51:
                    return h.RESULT_MISSING_VEHICLE_DATA_API_VERSION;
                case 52:
                    return h.RESULT_MISSING_REQUEST_VIN;
                case 53:
                    return h.RESULT_VEHICLE_DATA_LOOKUP_FAILURE;
                case 54:
                    return h.RESULT_MESSAGE_BUILD_FAILURE;
                case 55:
                    return h.RESULT_MESSAGE_EVALUATION_FAILURE;
                case 56:
                    return h.RESULT_LEGACY_BLE_COMMAND_FAILURE;
                case 57:
                    return h.RESULT_UNSUPPORTED_KEY_VERSION;
                case 58:
                    return h.RESULT_REQUEST_TARGETS_NON_SELECTED_VEHICLE;
                case 59:
                    return h.RESULT_EXCEPTION_THROWN;
                case 60:
                    return h.RESULT_DEPENDENT_SESSION_INFO_FAILURE;
                case 61:
                    return h.RESULT_WHITELIST_OPERATION_FAILURE;
                case 62:
                    return h.RESULT_BLE_SERVICE_NULL;
                case 63:
                    return h.RESULT_BLE_SERVICE_REMOTE_EXCEPTION;
                case 64:
                    return h.RESULT_ERROR_REQUEST_MTU_EXCEEDED;
                case 65:
                    return h.RESULT_ERROR_RESPONSE_MTU_EXCEEDED;
                case 66:
                    return h.RESULT_REQUEST_REPLACED_BY_NEW_REQUEST;
                case 67:
                    return h.RESULT_MISSING_SESSION_INFO_VALIDATION_DATA;
                case 68:
                    return h.RESULT_SESSION_INFO_VALIDATION_FAILURE;
                case 69:
                    return h.RESULT_SOCKET_EXCEPTION;
                case 70:
                    return h.RESULT_INVALID_HANDLE;
                case 71:
                    return h.RESULT_COMMAND_RESPONSE_REQUIRES_ENCRYPTION;
                case 72:
                    return h.RESULT_SOURCE_PUBLIC_KEY_NOT_FOUND;
                case 73:
                    return h.RESULT_VEHICLE_LOOKUP_FAILURE;
                case 74:
                    return h.RESULT_EMPTY_SESSION_INFO_SIGNATURE;
                case 75:
                    return h.RESULT_INVALID_VEHICLE_PUBLIC_KEY;
                case 76:
                    return h.RESULT_SERVER_SYSTEM_WIDE_ERROR;
                case 77:
                    return h.RESULT_SERVER_MAINTENANCE;
                case 78:
                    return h.RESULT_ACCOUNT_LOCKED;
                case 79:
                    return h.RESULT_BAD_REQUEST;
                case 80:
                    return h.RESULT_NOT_FOUND;
                case 81:
                    return h.RESULT_BACKEND_DEPENDENCY_FAILURE;
                case 82:
                    return h.RESULT_UNPROCESSABLE_ENTITY;
                case 83:
                    return h.RESULT_UPSTREAM_DEPENDENCY_ERROR;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private h(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final h fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<h> getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
