package cc0;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 cc0.d, still in use, count: 1, list:
  (r0v0 cc0.d) from 0x00dc: CONSTRUCTOR 
  (wrap co0.d:0x00d4: INVOKE (wrap java.lang.Class:0x00d2: CONST_CLASS  A[WRAPPED] (LINE:211) cc0.d.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:213))
  (wrap com.squareup.wire.o:0x00d8: SGET  A[WRAPPED] (LINE:217) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 cc0.d)
 A[MD:(co0.d<cc0.d>, com.squareup.wire.o, cc0.d):void (m), WRAPPED] (LINE:221) call: cc0.d.a.<init>(co0.d, com.squareup.wire.o, cc0.d):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lcc0/d;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "PREPARED_REPORT", "REPORT_UPLOAD_ATTEMPTED", "REPORT_EXCEEDED_MAX_RETRYS", "PROCESS_UNSUBSCRIBE_MESSAGE", "SET_CONNECTIVITY_SUBSCRIPTION", "SEND_FILLED_REQUEST", "FETCH_VEHICLE_TOKEN_ATTEMPT", "FETCH_VEHICLE_TOKEN", "SEND_COMMAND_ATTEMPT", "SEND_COMMAND", "PROCESS_SUBSCRIBE_MESSAGE", "VEHICLE_ONLINE_IN_SESSION", "COMMAND_CREATED", "APPLE_WATCH_PAIRED", "DID_RECEIVE_MEMORY_WARNING", "REALM_SIZE", "DAU_PUSH_NOTIFICATION_PERMISSIONS", "RECEIVED_AUTH_REQUEST", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements p {
    PREPARED_REPORT(0),
    REPORT_UPLOAD_ATTEMPTED(1),
    REPORT_EXCEEDED_MAX_RETRYS(2),
    PROCESS_UNSUBSCRIBE_MESSAGE(3),
    SET_CONNECTIVITY_SUBSCRIPTION(4),
    SEND_FILLED_REQUEST(5),
    FETCH_VEHICLE_TOKEN_ATTEMPT(6),
    FETCH_VEHICLE_TOKEN(7),
    SEND_COMMAND_ATTEMPT(8),
    SEND_COMMAND(9),
    PROCESS_SUBSCRIBE_MESSAGE(10),
    VEHICLE_ONLINE_IN_SESSION(11),
    COMMAND_CREATED(12),
    APPLE_WATCH_PAIRED(13),
    DID_RECEIVE_MEMORY_WARNING(14),
    REALM_SIZE(15),
    DAU_PUSH_NOTIFICATION_PERMISSIONS(16),
    RECEIVED_AUTH_REQUEST(17);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<d> ADAPTER = new com.squareup.wire.a<d>(o0.b(d.class), o.PROTO_3, new d(0)) { // from class: cc0.d.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public d d(int value) {
            return d.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: cc0.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcc0/d$b;", "", "<init>", "()V", "", "value", "Lcc0/d;", "a", "(I)Lcc0/d;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(int value) {
            switch (value) {
                case 0:
                    return d.PREPARED_REPORT;
                case 1:
                    return d.REPORT_UPLOAD_ATTEMPTED;
                case 2:
                    return d.REPORT_EXCEEDED_MAX_RETRYS;
                case 3:
                    return d.PROCESS_UNSUBSCRIBE_MESSAGE;
                case 4:
                    return d.SET_CONNECTIVITY_SUBSCRIPTION;
                case 5:
                    return d.SEND_FILLED_REQUEST;
                case 6:
                    return d.FETCH_VEHICLE_TOKEN_ATTEMPT;
                case 7:
                    return d.FETCH_VEHICLE_TOKEN;
                case 8:
                    return d.SEND_COMMAND_ATTEMPT;
                case 9:
                    return d.SEND_COMMAND;
                case 10:
                    return d.PROCESS_SUBSCRIBE_MESSAGE;
                case 11:
                    return d.VEHICLE_ONLINE_IN_SESSION;
                case 12:
                    return d.COMMAND_CREATED;
                case 13:
                    return d.APPLE_WATCH_PAIRED;
                case 14:
                    return d.DID_RECEIVE_MEMORY_WARNING;
                case 15:
                    return d.REALM_SIZE;
                case 16:
                    return d.DAU_PUSH_NOTIFICATION_PERMISSIONS;
                case 17:
                    return d.RECEIVED_AUTH_REQUEST;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private d(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final d fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<d> getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
