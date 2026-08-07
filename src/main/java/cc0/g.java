package cc0;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 cc0.g, still in use, count: 1, list:
  (r0v0 cc0.g) from 0x0163: CONSTRUCTOR 
  (wrap co0.d:0x015b: INVOKE (wrap java.lang.Class:0x0159: CONST_CLASS  A[WRAPPED] (LINE:346) cc0.g.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:348))
  (wrap com.squareup.wire.o:0x015f: SGET  A[WRAPPED] (LINE:352) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 cc0.g)
 A[MD:(co0.d<cc0.g>, com.squareup.wire.o, cc0.g):void (m), WRAPPED] (LINE:356) call: cc0.g.a.<init>(co0.d, com.squareup.wire.o, cc0.g):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b&\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(¨\u0006)"}, d2 = {"Lcc0/g;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "SUCCESS", "REPORT_TYPE", "RETRY_COUNT", "REASON", "UUID", "RESPONSE_COMMAND_ID", "RESPONSE_REQUEST_ID", "RESPONSE_STATUS_CODE", "CONNECTION_ID_UUID_STRING", "ERROR", "COMMAND_ID", "TRANSPORT", "REFRESHED_DATA", "DURATION_S", "COMMAND", "COMMAND_RESULT", "FOREGROUND_SESSION_ID", "PRESENT", "BYTES", "SOUND", "BADGE", "ALERT", "CRITICAL", "DEVICE_MOTION_AVAILABILITY", "TIME_SINCE_PROCESS_START", "LEVEL", "DEVICE_MOTION_STATIONARY_AGE", "DEVICE_MOTION_MOVING_AGE", "SCREEN_BRIGHTNESS", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements p {
    SUCCESS(0),
    REPORT_TYPE(1),
    RETRY_COUNT(2),
    REASON(3),
    UUID(4),
    RESPONSE_COMMAND_ID(5),
    RESPONSE_REQUEST_ID(6),
    RESPONSE_STATUS_CODE(7),
    CONNECTION_ID_UUID_STRING(8),
    ERROR(9),
    COMMAND_ID(10),
    TRANSPORT(11),
    REFRESHED_DATA(12),
    DURATION_S(13),
    COMMAND(14),
    COMMAND_RESULT(15),
    FOREGROUND_SESSION_ID(16),
    PRESENT(17),
    BYTES(18),
    SOUND(19),
    BADGE(20),
    ALERT(21),
    CRITICAL(22),
    DEVICE_MOTION_AVAILABILITY(23),
    TIME_SINCE_PROCESS_START(24),
    LEVEL(25),
    DEVICE_MOTION_STATIONARY_AGE(26),
    DEVICE_MOTION_MOVING_AGE(27),
    SCREEN_BRIGHTNESS(28);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<g> ADAPTER = new com.squareup.wire.a<g>(o0.b(g.class), o.PROTO_3, new g(0)) { // from class: cc0.g.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public g d(int value) {
            return g.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: cc0.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcc0/g$b;", "", "<init>", "()V", "", "value", "Lcc0/g;", "a", "(I)Lcc0/g;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(int value) {
            switch (value) {
                case 0:
                    return g.SUCCESS;
                case 1:
                    return g.REPORT_TYPE;
                case 2:
                    return g.RETRY_COUNT;
                case 3:
                    return g.REASON;
                case 4:
                    return g.UUID;
                case 5:
                    return g.RESPONSE_COMMAND_ID;
                case 6:
                    return g.RESPONSE_REQUEST_ID;
                case 7:
                    return g.RESPONSE_STATUS_CODE;
                case 8:
                    return g.CONNECTION_ID_UUID_STRING;
                case 9:
                    return g.ERROR;
                case 10:
                    return g.COMMAND_ID;
                case 11:
                    return g.TRANSPORT;
                case 12:
                    return g.REFRESHED_DATA;
                case 13:
                    return g.DURATION_S;
                case 14:
                    return g.COMMAND;
                case 15:
                    return g.COMMAND_RESULT;
                case 16:
                    return g.FOREGROUND_SESSION_ID;
                case 17:
                    return g.PRESENT;
                case 18:
                    return g.BYTES;
                case 19:
                    return g.SOUND;
                case 20:
                    return g.BADGE;
                case 21:
                    return g.ALERT;
                case 22:
                    return g.CRITICAL;
                case 23:
                    return g.DEVICE_MOTION_AVAILABILITY;
                case 24:
                    return g.TIME_SINCE_PROCESS_START;
                case 25:
                    return g.LEVEL;
                case 26:
                    return g.DEVICE_MOTION_STATIONARY_AGE;
                case 27:
                    return g.DEVICE_MOTION_MOVING_AGE;
                case 28:
                    return g.SCREEN_BRIGHTNESS;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private g(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final g fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<g> getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
