package vc0;

import com.squareup.wire.ProtoAdapter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 vc0.o0, still in use, count: 1, list:
  (r0v0 vc0.o0) from 0x018a: CONSTRUCTOR 
  (wrap co0.d:0x0182: INVOKE (wrap java.lang.Class:0x0180: CONST_CLASS  A[WRAPPED] (LINE:385) vc0.o0.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:387))
  (wrap com.squareup.wire.o:0x0186: SGET  A[WRAPPED] (LINE:391) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 vc0.o0)
 A[MD:(co0.d<vc0.o0>, com.squareup.wire.o, vc0.o0):void (m), WRAPPED] (LINE:395) call: vc0.o0.a.<init>(co0.d, com.squareup.wire.o, vc0.o0):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b)\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+¨\u0006,"}, d2 = {"Lvc0/o0;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "FIRAERROR_UNKNOWN", "FIRAERROR_UWB_HARDWARE_NOT_AVAILABLE", "FIRAERROR_ILLEGAL_ARGUMENT", "FIRAERROR_ILLEGAL_STATE", "FIRAERROR_SERVICE_VERSION_UPDATE_REQUIRED", "FIRAERROR_SERVICE_DISABLED", "FIRAERROR_SIGN_IN_REQUIRED", "FIRAERROR_INVALID_ACCOUNT", "FIRAERROR_RESOLUTION_REQUIRED", "FIRAERROR_NETWORK_ERROR", "FIRAERROR_INTERNAL_ERROR", "FIRAERROR_DEVELOPER_ERROR", "FIRAERROR_ERROR", "FIRAERROR_INTERRUPTED", "FIRAERROR_TIMEOUT", "FIRAERROR_CANCELED", "FIRAERROR_API_NOT_CONNECTED", "FIRAERROR_STATUS_ERROR", "FIRAERROR_SERVICE_NOT_AVAILABLE", "FIRAERROR_NULL_RANGING_DEVICE", "FIRAERROR_INVALID_API_CALL", "FIRAERROR_RANGING_ALREADY_STARTED", "FIRAERROR_UWB_SYSTEM_CALLBACK_FAILURE", "FIRAERROR_RANGING_UNKNOWN", "FIRAERROR_RANGING_INTERRUPTED", "FIRAERROR_RANGING_INTERNAL_ERROR", "FIRAERROR_RANGING_TIMEOUT", "FIRAERROR_RANGING_CANCELED", "FIRAERROR_RANGING_DEAD_CLIENT", "FIRAERROR_COROUTINE_TASK_EXECUTION_EXCEPTION", "FIRAERROR_COROUTINE_TASK_INTERRUPTED_EXCEPTION", "FIRAERROR_NOT_SELECTED", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o0 implements com.squareup.wire.p {
    FIRAERROR_UNKNOWN(0),
    FIRAERROR_UWB_HARDWARE_NOT_AVAILABLE(1),
    FIRAERROR_ILLEGAL_ARGUMENT(2),
    FIRAERROR_ILLEGAL_STATE(3),
    FIRAERROR_SERVICE_VERSION_UPDATE_REQUIRED(4),
    FIRAERROR_SERVICE_DISABLED(5),
    FIRAERROR_SIGN_IN_REQUIRED(6),
    FIRAERROR_INVALID_ACCOUNT(7),
    FIRAERROR_RESOLUTION_REQUIRED(8),
    FIRAERROR_NETWORK_ERROR(9),
    FIRAERROR_INTERNAL_ERROR(10),
    FIRAERROR_DEVELOPER_ERROR(11),
    FIRAERROR_ERROR(12),
    FIRAERROR_INTERRUPTED(13),
    FIRAERROR_TIMEOUT(14),
    FIRAERROR_CANCELED(15),
    FIRAERROR_API_NOT_CONNECTED(16),
    FIRAERROR_STATUS_ERROR(17),
    FIRAERROR_SERVICE_NOT_AVAILABLE(18),
    FIRAERROR_NULL_RANGING_DEVICE(19),
    FIRAERROR_INVALID_API_CALL(20),
    FIRAERROR_RANGING_ALREADY_STARTED(21),
    FIRAERROR_UWB_SYSTEM_CALLBACK_FAILURE(22),
    FIRAERROR_RANGING_UNKNOWN(23),
    FIRAERROR_RANGING_INTERRUPTED(24),
    FIRAERROR_RANGING_INTERNAL_ERROR(25),
    FIRAERROR_RANGING_TIMEOUT(26),
    FIRAERROR_RANGING_CANCELED(27),
    FIRAERROR_RANGING_DEAD_CLIENT(28),
    FIRAERROR_COROUTINE_TASK_EXECUTION_EXCEPTION(29),
    FIRAERROR_COROUTINE_TASK_INTERRUPTED_EXCEPTION(30),
    FIRAERROR_NOT_SELECTED(31);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<o0> ADAPTER = new com.squareup.wire.a<o0>(p013kotlin.jvm.internal.o0.b(o0.class), com.squareup.wire.o.PROTO_3, new o0(0)) { // from class: vc0.o0.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public o0 d(int value) {
            return o0.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: vc0.o0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvc0/o0$b;", "", "<init>", "()V", "", "value", "Lvc0/o0;", "a", "(I)Lvc0/o0;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o0 a(int value) {
            switch (value) {
                case 0:
                    return o0.FIRAERROR_UNKNOWN;
                case 1:
                    return o0.FIRAERROR_UWB_HARDWARE_NOT_AVAILABLE;
                case 2:
                    return o0.FIRAERROR_ILLEGAL_ARGUMENT;
                case 3:
                    return o0.FIRAERROR_ILLEGAL_STATE;
                case 4:
                    return o0.FIRAERROR_SERVICE_VERSION_UPDATE_REQUIRED;
                case 5:
                    return o0.FIRAERROR_SERVICE_DISABLED;
                case 6:
                    return o0.FIRAERROR_SIGN_IN_REQUIRED;
                case 7:
                    return o0.FIRAERROR_INVALID_ACCOUNT;
                case 8:
                    return o0.FIRAERROR_RESOLUTION_REQUIRED;
                case 9:
                    return o0.FIRAERROR_NETWORK_ERROR;
                case 10:
                    return o0.FIRAERROR_INTERNAL_ERROR;
                case 11:
                    return o0.FIRAERROR_DEVELOPER_ERROR;
                case 12:
                    return o0.FIRAERROR_ERROR;
                case 13:
                    return o0.FIRAERROR_INTERRUPTED;
                case 14:
                    return o0.FIRAERROR_TIMEOUT;
                case 15:
                    return o0.FIRAERROR_CANCELED;
                case 16:
                    return o0.FIRAERROR_API_NOT_CONNECTED;
                case 17:
                    return o0.FIRAERROR_STATUS_ERROR;
                case 18:
                    return o0.FIRAERROR_SERVICE_NOT_AVAILABLE;
                case 19:
                    return o0.FIRAERROR_NULL_RANGING_DEVICE;
                case 20:
                    return o0.FIRAERROR_INVALID_API_CALL;
                case 21:
                    return o0.FIRAERROR_RANGING_ALREADY_STARTED;
                case 22:
                    return o0.FIRAERROR_UWB_SYSTEM_CALLBACK_FAILURE;
                case 23:
                    return o0.FIRAERROR_RANGING_UNKNOWN;
                case 24:
                    return o0.FIRAERROR_RANGING_INTERRUPTED;
                case 25:
                    return o0.FIRAERROR_RANGING_INTERNAL_ERROR;
                case 26:
                    return o0.FIRAERROR_RANGING_TIMEOUT;
                case 27:
                    return o0.FIRAERROR_RANGING_CANCELED;
                case 28:
                    return o0.FIRAERROR_RANGING_DEAD_CLIENT;
                case 29:
                    return o0.FIRAERROR_COROUTINE_TASK_EXECUTION_EXCEPTION;
                case 30:
                    return o0.FIRAERROR_COROUTINE_TASK_INTERRUPTED_EXCEPTION;
                case 31:
                    return o0.FIRAERROR_NOT_SELECTED;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private o0(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final o0 fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<o0> getEntries() {
        return $ENTRIES;
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
