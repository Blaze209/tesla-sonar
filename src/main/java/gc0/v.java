package gc0;

import com.squareup.wire.ProtoAdapter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 gc0.v, still in use, count: 1, list:
  (r0v0 gc0.v) from 0x03b9: CONSTRUCTOR 
  (wrap co0.d:0x03b1: INVOKE (wrap java.lang.Class:0x03af: CONST_CLASS  A[WRAPPED] (LINE:944) gc0.v.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:946))
  (wrap com.squareup.wire.o:0x03b5: SGET  A[WRAPPED] (LINE:950) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 gc0.v)
 A[MD:(co0.d<gc0.v>, com.squareup.wire.o, gc0.v):void (m), WRAPPED] (LINE:954) call: gc0.v.a.<init>(co0.d, com.squareup.wire.o, gc0.v):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\bT\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bV¨\u0006W"}, d2 = {"Lgc0/v;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "MOBILE_APP_FEATURE_ACTIVE", "MOBILE_APP_FEATURE_CLIMATE_KEEPER", "MOBILE_APP_FEATURE_UNLOCK_STOP_CHARGE", "MOBILE_APP_FEATURE_SET_RATE_TARIFF", "MOBILE_APP_FEATURE_GET_RATE_TARIFF", "MOBILE_APP_FEATURE_DRIVENOTE", "MOBILE_APP_FEATURE_CLIMATE_KEEPER_OVERRIDE", "MOBILE_APP_FEATURE_SIGNED_VIDEO_REQUEST", "MOBILE_APP_FEATURE_SENTRY_CAM_FLASH_LIGHTS", "MOBILE_APP_FEATURE_BOOMBOX", "MOBILE_APP_FEATURE_DOOR_UNLATCH", "MOBILE_APP_FEATURE_SEAT_HEATERS_INSTALLED", "MOBILE_APP_FEATURE_LAST_SEEN_TPMS", "MOBILE_APP_FEATURE_UI_CHARGE_PORT", "MOBILE_APP_FEATURE_MONITOR_AND_CHARGE_ROLES", "MOBILE_APP_FEATURE_PROTO_FLOATS", "MOBILE_APP_FEATURE_BLUETOOTH_PAIRING", "MOBILE_APP_FEATURE_HMAC_AUTHENTICATION", "MOBILE_APP_COP_USER_SET_TEMP", "MOBILE_APP_FEATURE_MEDIA_DETAILS", "MOBILE_APP_FEATURE_RESPONSE_CACHE", "MOBILE_APP_FEATURE_SCC", "MOBILE_APP_FEATURE_SENTRY_CAM_WITH_DOG_MODE", "MOBILE_APP_FEATURE_AUTO_STEERING_WHEEL_HEAT", "MOBILE_APP_FEATURE_MANAGED_CHARGING", "MOBILE_APP_FEATURE_TOGGLE_REMOTE_SERVICE_ACCESS_COMMAND_DECPRECATED", "MOBILE_APP_FEATURE_TOGGLE_REMOTE_SERVICE_ACCESS_COMMAND", "MOBILE_APP_FEATURE_SEND_NAVIGATION_ROUTE", "MOBILE_APP_FEATURE_RED_BRAKE_CALIPER_FIX", "MOBILE_APP_FEATURE_PIN_TO_DRIVE", "MOBILE_APP_COP_NOT_RUNNING_REASON", "MOBILE_APP_FEATURE_SET_VEHICLE_NAME", "MOBILE_APP_FEATURE_VEHICLE_DATA_PII_V2", "MOBILE_APP_FEATURE_BOOMBOX_V2", "MOBILE_APP_FEATURE_UWB_STABLE_FOR_SUPPORTED_CARS", "MOBILE_APP_FEATURE_SPEED_LIMIT_PIN_RESET_SIGNED_COMMAND", "MOBILE_APP_FEATURE_PRECISE_LOCATION_TAG", "MOBILE_APP_FEATURE_IMU_ALERT_IS_VISIBLE", "MOBILE_APP_FEATURE_CT_SUPPORTS_COP", "MOBILE_APP_FEATURE_WAYPOINTS_SUPPORTED", "MOBILE_APP_FEATURE_OCTA_VIEW", "MOBILE_APP_FEATURE_BT_GTW_UNLOCK", "MOBILE_APP_FEATURE_UI_PHONEKEY_WHITELIST_RELIABLE_DEPRECATED", "MOBILE_APP_FEATURE_UI_PHONEKEY_WHITELIST_RELIABLE", "MOBILE_APP_FEATURE_SUMMON_PREWARMING", "MOBILE_APP_FEATURE_UWB_ENABLED_FOR_P2S_DEPRECATED", "MOBILE_APP_FEATURE_UWB_ENABLED_FOR_P2S", "MOBILE_APP_FEATURE_UI_ONE_TIME_CHARGE_SUPPORTED", "MOBILE_APP_FEATURE_SCHEDULE_V3", "MOBILE_APP_FEATURE_ECIES_VEHICLE_DATA_ENCRYPTION", "MOBILE_APP_FEATURE_TENT_MODE_SUPPORTED", "MOBILE_APP_FEATURE_SCHEDULE_V3_NAMING", "MOBILE_APP_FEATURE_COLORIZER_COLOR_REMAP_ENABLED", "MOBILE_APP_FEATURE_SEND_NAVIGATION_REQUEST_GPS_DESTINATION", "MOBILE_APP_FEATURE_SUMMON_WEBCAM", "MOBILE_APP_FEATURE_BLE_REMOTE_START", "MOBILE_APP_FEATURE_SOH_TEST_OBSOLETE", "MOBILE_APP_FEATURE_SET_ARRIVAL_PERCENTAGE_OBSOLETE", "MOBILE_APP_FEATURE_REMOTE_THEATER_CONTROL", "MOBILE_APP_FEATURE_CT_SUSPENSION", "MOBILE_APP_FEATURE_SOH_TEST_V2", "MOBILE_APP_FEATURE_ANDROID_UWB_ENABLED", "MOBILE_APP_FEATURE_LOW_POWER_MODE", "MOBILE_APP_FEATURE_ROBOTAXI_UWB", "MOBILE_APP_FEATURE_KEEP_ACCESSORY_POWER_MODE", "MOBILE_APP_FEATURE_SETUP_CLOUD_ACCOUNTS_WITH_DELETION", "MOBILE_APP_FEATURE_SETUP_CLOUD_ACCOUNTS", "MOBILE_APP_FEATURE_FETCH_KEY_METADATA_DEPRECATED", "MOBILE_APP_FEATURE_FETCH_KEY_METADATA", "MOBILE_APP_FEATURE_TRAILER_LIGHT_TEST", "MOBILE_APP_FEATURE_DELETE_DASHCAM_CLIPS_AND_FORMAT_USB", "MOBILE_APP_FEATURE_SOFTWARE_UPDATE_AUTO_SCHEDULED", "MOBILE_APP_FEATURE_BLE_MESSAGE_FRAMING", "MOBILE_APP_FEATURE_WAYPOINTS_REQUEST_ACCEPTS_COORDINATES", "MOBILE_APP_FEATURE_PHONE_SETTING_PREFERENCES_SYNC", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v implements com.squareup.wire.p {
    MOBILE_APP_FEATURE_ACTIVE(0),
    MOBILE_APP_FEATURE_CLIMATE_KEEPER(1),
    MOBILE_APP_FEATURE_UNLOCK_STOP_CHARGE(2),
    MOBILE_APP_FEATURE_SET_RATE_TARIFF(3),
    MOBILE_APP_FEATURE_GET_RATE_TARIFF(4),
    MOBILE_APP_FEATURE_DRIVENOTE(5),
    MOBILE_APP_FEATURE_CLIMATE_KEEPER_OVERRIDE(6),
    MOBILE_APP_FEATURE_SIGNED_VIDEO_REQUEST(7),
    MOBILE_APP_FEATURE_SENTRY_CAM_FLASH_LIGHTS(8),
    MOBILE_APP_FEATURE_BOOMBOX(9),
    MOBILE_APP_FEATURE_DOOR_UNLATCH(10),
    MOBILE_APP_FEATURE_SEAT_HEATERS_INSTALLED(11),
    MOBILE_APP_FEATURE_LAST_SEEN_TPMS(12),
    MOBILE_APP_FEATURE_UI_CHARGE_PORT(13),
    MOBILE_APP_FEATURE_MONITOR_AND_CHARGE_ROLES(14),
    MOBILE_APP_FEATURE_PROTO_FLOATS(15),
    MOBILE_APP_FEATURE_BLUETOOTH_PAIRING(16),
    MOBILE_APP_FEATURE_HMAC_AUTHENTICATION(17),
    MOBILE_APP_COP_USER_SET_TEMP(18),
    MOBILE_APP_FEATURE_MEDIA_DETAILS(19),
    MOBILE_APP_FEATURE_RESPONSE_CACHE(20),
    MOBILE_APP_FEATURE_SCC(22),
    MOBILE_APP_FEATURE_SENTRY_CAM_WITH_DOG_MODE(23),
    MOBILE_APP_FEATURE_AUTO_STEERING_WHEEL_HEAT(24),
    MOBILE_APP_FEATURE_MANAGED_CHARGING(25),
    MOBILE_APP_FEATURE_TOGGLE_REMOTE_SERVICE_ACCESS_COMMAND_DECPRECATED(26),
    MOBILE_APP_FEATURE_TOGGLE_REMOTE_SERVICE_ACCESS_COMMAND(27),
    MOBILE_APP_FEATURE_SEND_NAVIGATION_ROUTE(28),
    MOBILE_APP_FEATURE_RED_BRAKE_CALIPER_FIX(29),
    MOBILE_APP_FEATURE_PIN_TO_DRIVE(30),
    MOBILE_APP_COP_NOT_RUNNING_REASON(31),
    MOBILE_APP_FEATURE_SET_VEHICLE_NAME(32),
    MOBILE_APP_FEATURE_VEHICLE_DATA_PII_V2(33),
    MOBILE_APP_FEATURE_BOOMBOX_V2(34),
    MOBILE_APP_FEATURE_UWB_STABLE_FOR_SUPPORTED_CARS(35),
    MOBILE_APP_FEATURE_SPEED_LIMIT_PIN_RESET_SIGNED_COMMAND(36),
    MOBILE_APP_FEATURE_PRECISE_LOCATION_TAG(37),
    MOBILE_APP_FEATURE_IMU_ALERT_IS_VISIBLE(38),
    MOBILE_APP_FEATURE_CT_SUPPORTS_COP(42),
    MOBILE_APP_FEATURE_WAYPOINTS_SUPPORTED(43),
    MOBILE_APP_FEATURE_OCTA_VIEW(44),
    MOBILE_APP_FEATURE_BT_GTW_UNLOCK(45),
    MOBILE_APP_FEATURE_UI_PHONEKEY_WHITELIST_RELIABLE_DEPRECATED(46),
    MOBILE_APP_FEATURE_UI_PHONEKEY_WHITELIST_RELIABLE(47),
    MOBILE_APP_FEATURE_SUMMON_PREWARMING(48),
    MOBILE_APP_FEATURE_UWB_ENABLED_FOR_P2S_DEPRECATED(49),
    MOBILE_APP_FEATURE_UWB_ENABLED_FOR_P2S(50),
    MOBILE_APP_FEATURE_UI_ONE_TIME_CHARGE_SUPPORTED(51),
    MOBILE_APP_FEATURE_SCHEDULE_V3(52),
    MOBILE_APP_FEATURE_ECIES_VEHICLE_DATA_ENCRYPTION(53),
    MOBILE_APP_FEATURE_TENT_MODE_SUPPORTED(54),
    MOBILE_APP_FEATURE_SCHEDULE_V3_NAMING(55),
    MOBILE_APP_FEATURE_COLORIZER_COLOR_REMAP_ENABLED(57),
    MOBILE_APP_FEATURE_SEND_NAVIGATION_REQUEST_GPS_DESTINATION(58),
    MOBILE_APP_FEATURE_SUMMON_WEBCAM(59),
    MOBILE_APP_FEATURE_BLE_REMOTE_START(61),
    MOBILE_APP_FEATURE_SOH_TEST_OBSOLETE(62),
    MOBILE_APP_FEATURE_SET_ARRIVAL_PERCENTAGE_OBSOLETE(64),
    MOBILE_APP_FEATURE_REMOTE_THEATER_CONTROL(66),
    MOBILE_APP_FEATURE_CT_SUSPENSION(67),
    MOBILE_APP_FEATURE_SOH_TEST_V2(68),
    MOBILE_APP_FEATURE_ANDROID_UWB_ENABLED(69),
    MOBILE_APP_FEATURE_LOW_POWER_MODE(70),
    MOBILE_APP_FEATURE_ROBOTAXI_UWB(71),
    MOBILE_APP_FEATURE_KEEP_ACCESSORY_POWER_MODE(72),
    MOBILE_APP_FEATURE_SETUP_CLOUD_ACCOUNTS_WITH_DELETION(77),
    MOBILE_APP_FEATURE_SETUP_CLOUD_ACCOUNTS(73),
    MOBILE_APP_FEATURE_FETCH_KEY_METADATA_DEPRECATED(78),
    MOBILE_APP_FEATURE_FETCH_KEY_METADATA(79),
    MOBILE_APP_FEATURE_TRAILER_LIGHT_TEST(80),
    MOBILE_APP_FEATURE_DELETE_DASHCAM_CLIPS_AND_FORMAT_USB(81),
    MOBILE_APP_FEATURE_SOFTWARE_UPDATE_AUTO_SCHEDULED(82),
    MOBILE_APP_FEATURE_BLE_MESSAGE_FRAMING(83),
    MOBILE_APP_FEATURE_WAYPOINTS_REQUEST_ACCEPTS_COORDINATES(84),
    MOBILE_APP_FEATURE_PHONE_SETTING_PREFERENCES_SYNC(85);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<v> ADAPTER = new com.squareup.wire.a<v>(p013kotlin.jvm.internal.o0.b(v.class), com.squareup.wire.o.PROTO_3, new v(0)) { // from class: gc0.v.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public v d(int value) {
            return v.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: gc0.v$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgc0/v$b;", "", "<init>", "()V", "", "value", "Lgc0/v;", "a", "(I)Lgc0/v;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v a(int value) {
            switch (value) {
                case 0:
                    return v.MOBILE_APP_FEATURE_ACTIVE;
                case 1:
                    return v.MOBILE_APP_FEATURE_CLIMATE_KEEPER;
                case 2:
                    return v.MOBILE_APP_FEATURE_UNLOCK_STOP_CHARGE;
                case 3:
                    return v.MOBILE_APP_FEATURE_SET_RATE_TARIFF;
                case 4:
                    return v.MOBILE_APP_FEATURE_GET_RATE_TARIFF;
                case 5:
                    return v.MOBILE_APP_FEATURE_DRIVENOTE;
                case 6:
                    return v.MOBILE_APP_FEATURE_CLIMATE_KEEPER_OVERRIDE;
                case 7:
                    return v.MOBILE_APP_FEATURE_SIGNED_VIDEO_REQUEST;
                case 8:
                    return v.MOBILE_APP_FEATURE_SENTRY_CAM_FLASH_LIGHTS;
                case 9:
                    return v.MOBILE_APP_FEATURE_BOOMBOX;
                case 10:
                    return v.MOBILE_APP_FEATURE_DOOR_UNLATCH;
                case 11:
                    return v.MOBILE_APP_FEATURE_SEAT_HEATERS_INSTALLED;
                case 12:
                    return v.MOBILE_APP_FEATURE_LAST_SEEN_TPMS;
                case 13:
                    return v.MOBILE_APP_FEATURE_UI_CHARGE_PORT;
                case 14:
                    return v.MOBILE_APP_FEATURE_MONITOR_AND_CHARGE_ROLES;
                case 15:
                    return v.MOBILE_APP_FEATURE_PROTO_FLOATS;
                case 16:
                    return v.MOBILE_APP_FEATURE_BLUETOOTH_PAIRING;
                case 17:
                    return v.MOBILE_APP_FEATURE_HMAC_AUTHENTICATION;
                case 18:
                    return v.MOBILE_APP_COP_USER_SET_TEMP;
                case 19:
                    return v.MOBILE_APP_FEATURE_MEDIA_DETAILS;
                case 20:
                    return v.MOBILE_APP_FEATURE_RESPONSE_CACHE;
                case 21:
                case 39:
                case 40:
                case 41:
                case 56:
                case 60:
                case 63:
                case 65:
                case 74:
                case 75:
                case 76:
                default:
                    return null;
                case 22:
                    return v.MOBILE_APP_FEATURE_SCC;
                case 23:
                    return v.MOBILE_APP_FEATURE_SENTRY_CAM_WITH_DOG_MODE;
                case 24:
                    return v.MOBILE_APP_FEATURE_AUTO_STEERING_WHEEL_HEAT;
                case 25:
                    return v.MOBILE_APP_FEATURE_MANAGED_CHARGING;
                case 26:
                    return v.MOBILE_APP_FEATURE_TOGGLE_REMOTE_SERVICE_ACCESS_COMMAND_DECPRECATED;
                case 27:
                    return v.MOBILE_APP_FEATURE_TOGGLE_REMOTE_SERVICE_ACCESS_COMMAND;
                case 28:
                    return v.MOBILE_APP_FEATURE_SEND_NAVIGATION_ROUTE;
                case 29:
                    return v.MOBILE_APP_FEATURE_RED_BRAKE_CALIPER_FIX;
                case 30:
                    return v.MOBILE_APP_FEATURE_PIN_TO_DRIVE;
                case 31:
                    return v.MOBILE_APP_COP_NOT_RUNNING_REASON;
                case 32:
                    return v.MOBILE_APP_FEATURE_SET_VEHICLE_NAME;
                case 33:
                    return v.MOBILE_APP_FEATURE_VEHICLE_DATA_PII_V2;
                case 34:
                    return v.MOBILE_APP_FEATURE_BOOMBOX_V2;
                case 35:
                    return v.MOBILE_APP_FEATURE_UWB_STABLE_FOR_SUPPORTED_CARS;
                case 36:
                    return v.MOBILE_APP_FEATURE_SPEED_LIMIT_PIN_RESET_SIGNED_COMMAND;
                case 37:
                    return v.MOBILE_APP_FEATURE_PRECISE_LOCATION_TAG;
                case 38:
                    return v.MOBILE_APP_FEATURE_IMU_ALERT_IS_VISIBLE;
                case 42:
                    return v.MOBILE_APP_FEATURE_CT_SUPPORTS_COP;
                case 43:
                    return v.MOBILE_APP_FEATURE_WAYPOINTS_SUPPORTED;
                case 44:
                    return v.MOBILE_APP_FEATURE_OCTA_VIEW;
                case 45:
                    return v.MOBILE_APP_FEATURE_BT_GTW_UNLOCK;
                case 46:
                    return v.MOBILE_APP_FEATURE_UI_PHONEKEY_WHITELIST_RELIABLE_DEPRECATED;
                case 47:
                    return v.MOBILE_APP_FEATURE_UI_PHONEKEY_WHITELIST_RELIABLE;
                case 48:
                    return v.MOBILE_APP_FEATURE_SUMMON_PREWARMING;
                case 49:
                    return v.MOBILE_APP_FEATURE_UWB_ENABLED_FOR_P2S_DEPRECATED;
                case 50:
                    return v.MOBILE_APP_FEATURE_UWB_ENABLED_FOR_P2S;
                case 51:
                    return v.MOBILE_APP_FEATURE_UI_ONE_TIME_CHARGE_SUPPORTED;
                case 52:
                    return v.MOBILE_APP_FEATURE_SCHEDULE_V3;
                case 53:
                    return v.MOBILE_APP_FEATURE_ECIES_VEHICLE_DATA_ENCRYPTION;
                case 54:
                    return v.MOBILE_APP_FEATURE_TENT_MODE_SUPPORTED;
                case 55:
                    return v.MOBILE_APP_FEATURE_SCHEDULE_V3_NAMING;
                case 57:
                    return v.MOBILE_APP_FEATURE_COLORIZER_COLOR_REMAP_ENABLED;
                case 58:
                    return v.MOBILE_APP_FEATURE_SEND_NAVIGATION_REQUEST_GPS_DESTINATION;
                case 59:
                    return v.MOBILE_APP_FEATURE_SUMMON_WEBCAM;
                case 61:
                    return v.MOBILE_APP_FEATURE_BLE_REMOTE_START;
                case 62:
                    return v.MOBILE_APP_FEATURE_SOH_TEST_OBSOLETE;
                case 64:
                    return v.MOBILE_APP_FEATURE_SET_ARRIVAL_PERCENTAGE_OBSOLETE;
                case 66:
                    return v.MOBILE_APP_FEATURE_REMOTE_THEATER_CONTROL;
                case 67:
                    return v.MOBILE_APP_FEATURE_CT_SUSPENSION;
                case 68:
                    return v.MOBILE_APP_FEATURE_SOH_TEST_V2;
                case 69:
                    return v.MOBILE_APP_FEATURE_ANDROID_UWB_ENABLED;
                case 70:
                    return v.MOBILE_APP_FEATURE_LOW_POWER_MODE;
                case 71:
                    return v.MOBILE_APP_FEATURE_ROBOTAXI_UWB;
                case 72:
                    return v.MOBILE_APP_FEATURE_KEEP_ACCESSORY_POWER_MODE;
                case 73:
                    return v.MOBILE_APP_FEATURE_SETUP_CLOUD_ACCOUNTS;
                case 77:
                    return v.MOBILE_APP_FEATURE_SETUP_CLOUD_ACCOUNTS_WITH_DELETION;
                case 78:
                    return v.MOBILE_APP_FEATURE_FETCH_KEY_METADATA_DEPRECATED;
                case 79:
                    return v.MOBILE_APP_FEATURE_FETCH_KEY_METADATA;
                case 80:
                    return v.MOBILE_APP_FEATURE_TRAILER_LIGHT_TEST;
                case 81:
                    return v.MOBILE_APP_FEATURE_DELETE_DASHCAM_CLIPS_AND_FORMAT_USB;
                case 82:
                    return v.MOBILE_APP_FEATURE_SOFTWARE_UPDATE_AUTO_SCHEDULED;
                case 83:
                    return v.MOBILE_APP_FEATURE_BLE_MESSAGE_FRAMING;
                case 84:
                    return v.MOBILE_APP_FEATURE_WAYPOINTS_REQUEST_ACCEPTS_COORDINATES;
                case 85:
                    return v.MOBILE_APP_FEATURE_PHONE_SETTING_PREFERENCES_SYNC;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private v(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final v fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<v> getEntries() {
        return $ENTRIES;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
