package sc0;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 sc0.d, still in use, count: 1, list:
  (r0v0 sc0.d) from 0x0170: CONSTRUCTOR 
  (wrap co0.d:0x0168: INVOKE (wrap java.lang.Class:0x0166: CONST_CLASS  A[WRAPPED] (LINE:359) sc0.d.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:361))
  (wrap com.squareup.wire.o:0x016c: SGET  A[WRAPPED] (LINE:365) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 sc0.d)
 A[MD:(co0.d<sc0.d>, com.squareup.wire.o, sc0.d):void (m), WRAPPED] (LINE:369) call: sc0.d.a.<init>(co0.d, com.squareup.wire.o, sc0.d):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b'\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006*"}, d2 = {"Lsc0/d;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "MESSAGEFAULT_ERROR_NONE", "MESSAGEFAULT_ERROR_BUSY", "MESSAGEFAULT_ERROR_TIMEOUT", "MESSAGEFAULT_ERROR_UNKNOWN_KEY_ID", "MESSAGEFAULT_ERROR_INACTIVE_KEY", "MESSAGEFAULT_ERROR_INVALID_SIGNATURE", "MESSAGEFAULT_ERROR_INVALID_TOKEN_OR_COUNTER", "MESSAGEFAULT_ERROR_INSUFFICIENT_PRIVILEGES", "MESSAGEFAULT_ERROR_INVALID_DOMAINS", "MESSAGEFAULT_ERROR_INVALID_COMMAND", "MESSAGEFAULT_ERROR_DECODING", "MESSAGEFAULT_ERROR_INTERNAL", "MESSAGEFAULT_ERROR_WRONG_PERSONALIZATION", "MESSAGEFAULT_ERROR_BAD_PARAMETER", "MESSAGEFAULT_ERROR_KEYCHAIN_IS_FULL", "MESSAGEFAULT_ERROR_INCORRECT_EPOCH", "MESSAGEFAULT_ERROR_IV_INCORRECT_LENGTH", "MESSAGEFAULT_ERROR_TIME_EXPIRED", "MESSAGEFAULT_ERROR_NOT_PROVISIONED_WITH_IDENTITY", "MESSAGEFAULT_ERROR_COULD_NOT_HASH_METADATA", "MESSAGEFAULT_ERROR_TIME_TO_LIVE_TOO_LONG", "MESSAGEFAULT_ERROR_REMOTE_ACCESS_DISABLED", "MESSAGEFAULT_ERROR_REMOTE_SERVICE_ACCESS_DISABLED", "MESSAGEFAULT_ERROR_COMMAND_REQUIRES_ACCOUNT_CREDENTIALS", "MESSAGEFAULT_ERROR_REQUEST_MTU_EXCEEDED", "MESSAGEFAULT_ERROR_RESPONSE_MTU_EXCEEDED", "MESSAGEFAULT_ERROR_REPEATED_COUNTER", "MESSAGEFAULT_ERROR_INVALID_KEY_HANDLE", "MESSAGEFAULT_ERROR_REQUIRES_RESPONSE_ENCRYPTION", "MESSAGEFAULT_ERROR_COMMAND_REQUIRES_PHYSICAL_PROXIMITY", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements p {
    MESSAGEFAULT_ERROR_NONE(0),
    MESSAGEFAULT_ERROR_BUSY(1),
    MESSAGEFAULT_ERROR_TIMEOUT(2),
    MESSAGEFAULT_ERROR_UNKNOWN_KEY_ID(3),
    MESSAGEFAULT_ERROR_INACTIVE_KEY(4),
    MESSAGEFAULT_ERROR_INVALID_SIGNATURE(5),
    MESSAGEFAULT_ERROR_INVALID_TOKEN_OR_COUNTER(6),
    MESSAGEFAULT_ERROR_INSUFFICIENT_PRIVILEGES(7),
    MESSAGEFAULT_ERROR_INVALID_DOMAINS(8),
    MESSAGEFAULT_ERROR_INVALID_COMMAND(9),
    MESSAGEFAULT_ERROR_DECODING(10),
    MESSAGEFAULT_ERROR_INTERNAL(11),
    MESSAGEFAULT_ERROR_WRONG_PERSONALIZATION(12),
    MESSAGEFAULT_ERROR_BAD_PARAMETER(13),
    MESSAGEFAULT_ERROR_KEYCHAIN_IS_FULL(14),
    MESSAGEFAULT_ERROR_INCORRECT_EPOCH(15),
    MESSAGEFAULT_ERROR_IV_INCORRECT_LENGTH(16),
    MESSAGEFAULT_ERROR_TIME_EXPIRED(17),
    MESSAGEFAULT_ERROR_NOT_PROVISIONED_WITH_IDENTITY(18),
    MESSAGEFAULT_ERROR_COULD_NOT_HASH_METADATA(19),
    MESSAGEFAULT_ERROR_TIME_TO_LIVE_TOO_LONG(20),
    MESSAGEFAULT_ERROR_REMOTE_ACCESS_DISABLED(21),
    MESSAGEFAULT_ERROR_REMOTE_SERVICE_ACCESS_DISABLED(22),
    MESSAGEFAULT_ERROR_COMMAND_REQUIRES_ACCOUNT_CREDENTIALS(23),
    MESSAGEFAULT_ERROR_REQUEST_MTU_EXCEEDED(24),
    MESSAGEFAULT_ERROR_RESPONSE_MTU_EXCEEDED(25),
    MESSAGEFAULT_ERROR_REPEATED_COUNTER(26),
    MESSAGEFAULT_ERROR_INVALID_KEY_HANDLE(27),
    MESSAGEFAULT_ERROR_REQUIRES_RESPONSE_ENCRYPTION(28),
    MESSAGEFAULT_ERROR_COMMAND_REQUIRES_PHYSICAL_PROXIMITY(29);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<d> ADAPTER = new com.squareup.wire.a<d>(o0.b(d.class), o.PROTO_3, new d(0)) { // from class: sc0.d.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public d d(int value) {
            return d.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: sc0.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lsc0/d$b;", "", "<init>", "()V", "", "value", "Lsc0/d;", "a", "(I)Lsc0/d;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(int value) {
            switch (value) {
                case 0:
                    return d.MESSAGEFAULT_ERROR_NONE;
                case 1:
                    return d.MESSAGEFAULT_ERROR_BUSY;
                case 2:
                    return d.MESSAGEFAULT_ERROR_TIMEOUT;
                case 3:
                    return d.MESSAGEFAULT_ERROR_UNKNOWN_KEY_ID;
                case 4:
                    return d.MESSAGEFAULT_ERROR_INACTIVE_KEY;
                case 5:
                    return d.MESSAGEFAULT_ERROR_INVALID_SIGNATURE;
                case 6:
                    return d.MESSAGEFAULT_ERROR_INVALID_TOKEN_OR_COUNTER;
                case 7:
                    return d.MESSAGEFAULT_ERROR_INSUFFICIENT_PRIVILEGES;
                case 8:
                    return d.MESSAGEFAULT_ERROR_INVALID_DOMAINS;
                case 9:
                    return d.MESSAGEFAULT_ERROR_INVALID_COMMAND;
                case 10:
                    return d.MESSAGEFAULT_ERROR_DECODING;
                case 11:
                    return d.MESSAGEFAULT_ERROR_INTERNAL;
                case 12:
                    return d.MESSAGEFAULT_ERROR_WRONG_PERSONALIZATION;
                case 13:
                    return d.MESSAGEFAULT_ERROR_BAD_PARAMETER;
                case 14:
                    return d.MESSAGEFAULT_ERROR_KEYCHAIN_IS_FULL;
                case 15:
                    return d.MESSAGEFAULT_ERROR_INCORRECT_EPOCH;
                case 16:
                    return d.MESSAGEFAULT_ERROR_IV_INCORRECT_LENGTH;
                case 17:
                    return d.MESSAGEFAULT_ERROR_TIME_EXPIRED;
                case 18:
                    return d.MESSAGEFAULT_ERROR_NOT_PROVISIONED_WITH_IDENTITY;
                case 19:
                    return d.MESSAGEFAULT_ERROR_COULD_NOT_HASH_METADATA;
                case 20:
                    return d.MESSAGEFAULT_ERROR_TIME_TO_LIVE_TOO_LONG;
                case 21:
                    return d.MESSAGEFAULT_ERROR_REMOTE_ACCESS_DISABLED;
                case 22:
                    return d.MESSAGEFAULT_ERROR_REMOTE_SERVICE_ACCESS_DISABLED;
                case 23:
                    return d.MESSAGEFAULT_ERROR_COMMAND_REQUIRES_ACCOUNT_CREDENTIALS;
                case 24:
                    return d.MESSAGEFAULT_ERROR_REQUEST_MTU_EXCEEDED;
                case 25:
                    return d.MESSAGEFAULT_ERROR_RESPONSE_MTU_EXCEEDED;
                case 26:
                    return d.MESSAGEFAULT_ERROR_REPEATED_COUNTER;
                case 27:
                    return d.MESSAGEFAULT_ERROR_INVALID_KEY_HANDLE;
                case 28:
                    return d.MESSAGEFAULT_ERROR_REQUIRES_RESPONSE_ENCRYPTION;
                case 29:
                    return d.MESSAGEFAULT_ERROR_COMMAND_REQUIRES_PHYSICAL_PROXIMITY;
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
