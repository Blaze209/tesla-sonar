package nc0;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 nc0.l, still in use, count: 1, list:
  (r0v0 nc0.l) from 0x024d: CONSTRUCTOR 
  (wrap co0.d:0x0245: INVOKE (wrap java.lang.Class:0x0243: CONST_CLASS  A[WRAPPED] (LINE:580) nc0.l.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:582))
  (wrap com.squareup.wire.o:0x0249: SGET  A[WRAPPED] (LINE:586) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 nc0.l)
 A[MD:(co0.d<nc0.l>, com.squareup.wire.o, nc0.l):void (m), WRAPPED] (LINE:590) call: nc0.l.a.<init>(co0.d, com.squareup.wire.o, nc0.l):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b8\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:¨\u0006;"}, d2 = {"Lnc0/l;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "IOS_DID_FINISH_LAUNCHING", "ANDROID_APPLICATION_ON_CREATE", "JS_STARTUP", "APP_LAUNCH_GATE", "IOS_TIME_TO_INTERACTIVE", "APP_IN_FOREGROUND", "ANDROID_INITIALIZER", "ANDROID_TIME_TO_INTERACTIVE", "GODOT_INITIALIZATION", "COMMAND", "BLUETOOTH_COMMAND", "HERMES_COMMAND", "OAPI_COMMAND", "WEBCAM_CONNECT", "WEBCAM_TIME_TO_FIRST_FRAME", "DISK_USAGE", "WEBCAM_SESSION", "WEBCAM_CREATE_SESSION", "COMMANDS_IN_SESSION", "SUMMON_CONNECTION", "VEHICLEDATA_SUBSCRIPTION_SESSION", "SUMMON_WEBRTC_CONNECT", "CACHED_DATA_SESSION", "REALM_WRITE", "FIRST_PRODUCT_ON_SCREEN", "WAKE_TO_FRESH_DATA", "ENERGY_GRAPH_SCREEN_FETCH_DATA", "ENERGY_GRAPH_SCREEN_RENDER", "ANDROID_BLESERVICE_LAUNCH_TIME", "AUTH_ENGINE", "IOS_AUTH_ENGINE_MOTION_ACTIVITY_QUERY", "HERMES_SOCKET_TIME_TO_START_CONNECTING", "HERMES_SOCKET_CONNECTED", "HERMES_SOCKET_TOKEN_FETCHED", "HERMES_SOCKET_VEHICLE_TOKEN_FETCHED", "TIME_TO_CREATE_WEBRTC_PEER_CONNECTION", "WEBRTC_SUMMON_FIRST_STATUS_MESSAGE", "WEBRTC_SUMMON_CONFIG_RECEIVED", "WEBRTC_SUMMON_GATHERING_CANDIDATES", "WEBRTC_SUMMON_PEER_CREATION", "WEBRTC_SUMMON_PEER_CONNECTION", "WEBRTC_SUMMON_FIRST_CANDIDATE", "SUMMON_TIME_TO_ACCURATE_GPS", "BLE_WRITE_CHARACTERISTIC", "ANDROID_PRIMARY_STORAGE_VOLUME_DISK_STATS", "ANDROID_PRIMARY_STORAGE_VOLUME_DISK_STATS_WITH_COMPACTION", "SIGNED_OAPI_COMMAND", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l implements p {
    IOS_DID_FINISH_LAUNCHING(0),
    ANDROID_APPLICATION_ON_CREATE(1),
    JS_STARTUP(2),
    APP_LAUNCH_GATE(3),
    IOS_TIME_TO_INTERACTIVE(4),
    APP_IN_FOREGROUND(5),
    ANDROID_INITIALIZER(6),
    ANDROID_TIME_TO_INTERACTIVE(7),
    GODOT_INITIALIZATION(10),
    COMMAND(11),
    BLUETOOTH_COMMAND(12),
    HERMES_COMMAND(13),
    OAPI_COMMAND(14),
    WEBCAM_CONNECT(15),
    WEBCAM_TIME_TO_FIRST_FRAME(16),
    DISK_USAGE(17),
    WEBCAM_SESSION(18),
    WEBCAM_CREATE_SESSION(19),
    COMMANDS_IN_SESSION(20),
    SUMMON_CONNECTION(21),
    VEHICLEDATA_SUBSCRIPTION_SESSION(22),
    SUMMON_WEBRTC_CONNECT(23),
    CACHED_DATA_SESSION(24),
    REALM_WRITE(25),
    FIRST_PRODUCT_ON_SCREEN(26),
    WAKE_TO_FRESH_DATA(27),
    ENERGY_GRAPH_SCREEN_FETCH_DATA(28),
    ENERGY_GRAPH_SCREEN_RENDER(29),
    ANDROID_BLESERVICE_LAUNCH_TIME(30),
    AUTH_ENGINE(31),
    IOS_AUTH_ENGINE_MOTION_ACTIVITY_QUERY(32),
    HERMES_SOCKET_TIME_TO_START_CONNECTING(33),
    HERMES_SOCKET_CONNECTED(34),
    HERMES_SOCKET_TOKEN_FETCHED(35),
    HERMES_SOCKET_VEHICLE_TOKEN_FETCHED(36),
    TIME_TO_CREATE_WEBRTC_PEER_CONNECTION(37),
    WEBRTC_SUMMON_FIRST_STATUS_MESSAGE(38),
    WEBRTC_SUMMON_CONFIG_RECEIVED(39),
    WEBRTC_SUMMON_GATHERING_CANDIDATES(40),
    WEBRTC_SUMMON_PEER_CREATION(41),
    WEBRTC_SUMMON_PEER_CONNECTION(42),
    WEBRTC_SUMMON_FIRST_CANDIDATE(43),
    SUMMON_TIME_TO_ACCURATE_GPS(44),
    BLE_WRITE_CHARACTERISTIC(45),
    ANDROID_PRIMARY_STORAGE_VOLUME_DISK_STATS(52),
    ANDROID_PRIMARY_STORAGE_VOLUME_DISK_STATS_WITH_COMPACTION(53),
    SIGNED_OAPI_COMMAND(61);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<l> ADAPTER = new com.squareup.wire.a<l>(o0.b(l.class), o.PROTO_3, new l(0)) { // from class: nc0.l.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public l d(int value) {
            return l.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: nc0.l$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lnc0/l$b;", "", "<init>", "()V", "", "value", "Lnc0/l;", "a", "(I)Lnc0/l;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(int value) {
            if (value == 52) {
                return l.ANDROID_PRIMARY_STORAGE_VOLUME_DISK_STATS;
            }
            if (value == 53) {
                return l.ANDROID_PRIMARY_STORAGE_VOLUME_DISK_STATS_WITH_COMPACTION;
            }
            if (value == 61) {
                return l.SIGNED_OAPI_COMMAND;
            }
            switch (value) {
                case 0:
                    return l.IOS_DID_FINISH_LAUNCHING;
                case 1:
                    return l.ANDROID_APPLICATION_ON_CREATE;
                case 2:
                    return l.JS_STARTUP;
                case 3:
                    return l.APP_LAUNCH_GATE;
                case 4:
                    return l.IOS_TIME_TO_INTERACTIVE;
                case 5:
                    return l.APP_IN_FOREGROUND;
                case 6:
                    return l.ANDROID_INITIALIZER;
                case 7:
                    return l.ANDROID_TIME_TO_INTERACTIVE;
                default:
                    switch (value) {
                        case 10:
                            return l.GODOT_INITIALIZATION;
                        case 11:
                            return l.COMMAND;
                        case 12:
                            return l.BLUETOOTH_COMMAND;
                        case 13:
                            return l.HERMES_COMMAND;
                        case 14:
                            return l.OAPI_COMMAND;
                        case 15:
                            return l.WEBCAM_CONNECT;
                        case 16:
                            return l.WEBCAM_TIME_TO_FIRST_FRAME;
                        case 17:
                            return l.DISK_USAGE;
                        case 18:
                            return l.WEBCAM_SESSION;
                        case 19:
                            return l.WEBCAM_CREATE_SESSION;
                        case 20:
                            return l.COMMANDS_IN_SESSION;
                        case 21:
                            return l.SUMMON_CONNECTION;
                        case 22:
                            return l.VEHICLEDATA_SUBSCRIPTION_SESSION;
                        case 23:
                            return l.SUMMON_WEBRTC_CONNECT;
                        case 24:
                            return l.CACHED_DATA_SESSION;
                        case 25:
                            return l.REALM_WRITE;
                        case 26:
                            return l.FIRST_PRODUCT_ON_SCREEN;
                        case 27:
                            return l.WAKE_TO_FRESH_DATA;
                        case 28:
                            return l.ENERGY_GRAPH_SCREEN_FETCH_DATA;
                        case 29:
                            return l.ENERGY_GRAPH_SCREEN_RENDER;
                        case 30:
                            return l.ANDROID_BLESERVICE_LAUNCH_TIME;
                        case 31:
                            return l.AUTH_ENGINE;
                        case 32:
                            return l.IOS_AUTH_ENGINE_MOTION_ACTIVITY_QUERY;
                        case 33:
                            return l.HERMES_SOCKET_TIME_TO_START_CONNECTING;
                        case 34:
                            return l.HERMES_SOCKET_CONNECTED;
                        case 35:
                            return l.HERMES_SOCKET_TOKEN_FETCHED;
                        case 36:
                            return l.HERMES_SOCKET_VEHICLE_TOKEN_FETCHED;
                        case 37:
                            return l.TIME_TO_CREATE_WEBRTC_PEER_CONNECTION;
                        case 38:
                            return l.WEBRTC_SUMMON_FIRST_STATUS_MESSAGE;
                        case 39:
                            return l.WEBRTC_SUMMON_CONFIG_RECEIVED;
                        case 40:
                            return l.WEBRTC_SUMMON_GATHERING_CANDIDATES;
                        case 41:
                            return l.WEBRTC_SUMMON_PEER_CREATION;
                        case 42:
                            return l.WEBRTC_SUMMON_PEER_CONNECTION;
                        case 43:
                            return l.WEBRTC_SUMMON_FIRST_CANDIDATE;
                        case 44:
                            return l.SUMMON_TIME_TO_ACCURATE_GPS;
                        case 45:
                            return l.BLE_WRITE_CHARACTERISTIC;
                        default:
                            return null;
                    }
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private l(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final l fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<l> getEntries() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
