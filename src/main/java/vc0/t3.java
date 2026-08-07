package vc0;

import com.squareup.wire.ProtoAdapter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 vc0.t3, still in use, count: 1, list:
  (r0v0 vc0.t3) from 0x00f2: CONSTRUCTOR 
  (wrap co0.d:0x00ea: INVOKE (wrap java.lang.Class:0x00e8: CONST_CLASS  A[WRAPPED] (LINE:233) vc0.t3.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:235))
  (wrap com.squareup.wire.o:0x00ee: SGET  A[WRAPPED] (LINE:239) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 vc0.t3)
 A[MD:(co0.d<vc0.t3>, com.squareup.wire.o, vc0.t3):void (m), WRAPPED] (LINE:243) call: vc0.t3.a.<init>(co0.d, com.squareup.wire.o, vc0.t3):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lvc0/t3;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "IOS_COREBTERROR_SNA", "IOS_COREBTERROR_UNKNOWN", "IOS_COREBTERROR_INVALID_PARAMETERS", "IOS_COREBTERROR_INVALID_HANDLE", "IOS_COREBTERROR_NOT_CONNECTED", "IOS_COREBTERROR_OUT_OF_SPACE", "IOS_COREBTERROR_OPERATION_CANCELLED", "IOS_COREBTERROR_CONNECTION_TIMEOUT", "IOS_COREBTERROR_PERIPHERAL_DISCONNECTED", "IOS_COREBTERROR_UUID_NOT_ALLOWED", "IOS_COREBTERROR_ALREADY_ADVERTISING", "IOS_COREBTERROR_CONNECTION_FAILED", "IOS_COREBTERROR_CONNECTION_LIMIT_REACHED", "IOS_COREBTERROR_OPERATION_NOT_SUPPORTED", "IOS_COREBTERROR_UNKNOWN_DEVICE", "IOS_COREBTERROR_ENCRYPTIONTIMEDOUT", "IOS_COREBTERROR_LEGATTEXCEEDEDBACKGROUNDNOTIFICATIONLIMIT", "IOS_COREBTERROR_LEGATTNEARBACKGROUNDNOTIFICATIONLIMIT", "IOS_COREBTERROR_PEERREMOVEDPAIRINGINFORMATION", "IOS_COREBTERROR_TOOMANYLEPAIREDDEVICES", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t3 implements com.squareup.wire.p {
    IOS_COREBTERROR_SNA(0),
    IOS_COREBTERROR_UNKNOWN(1),
    IOS_COREBTERROR_INVALID_PARAMETERS(2),
    IOS_COREBTERROR_INVALID_HANDLE(3),
    IOS_COREBTERROR_NOT_CONNECTED(4),
    IOS_COREBTERROR_OUT_OF_SPACE(5),
    IOS_COREBTERROR_OPERATION_CANCELLED(6),
    IOS_COREBTERROR_CONNECTION_TIMEOUT(7),
    IOS_COREBTERROR_PERIPHERAL_DISCONNECTED(8),
    IOS_COREBTERROR_UUID_NOT_ALLOWED(9),
    IOS_COREBTERROR_ALREADY_ADVERTISING(10),
    IOS_COREBTERROR_CONNECTION_FAILED(11),
    IOS_COREBTERROR_CONNECTION_LIMIT_REACHED(12),
    IOS_COREBTERROR_OPERATION_NOT_SUPPORTED(13),
    IOS_COREBTERROR_UNKNOWN_DEVICE(14),
    IOS_COREBTERROR_ENCRYPTIONTIMEDOUT(15),
    IOS_COREBTERROR_LEGATTEXCEEDEDBACKGROUNDNOTIFICATIONLIMIT(16),
    IOS_COREBTERROR_LEGATTNEARBACKGROUNDNOTIFICATIONLIMIT(17),
    IOS_COREBTERROR_PEERREMOVEDPAIRINGINFORMATION(18),
    IOS_COREBTERROR_TOOMANYLEPAIREDDEVICES(19);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<t3> ADAPTER = new com.squareup.wire.a<t3>(p013kotlin.jvm.internal.o0.b(t3.class), com.squareup.wire.o.PROTO_3, new t3(0)) { // from class: vc0.t3.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public t3 d(int value) {
            return t3.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: vc0.t3$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvc0/t3$b;", "", "<init>", "()V", "", "value", "Lvc0/t3;", "a", "(I)Lvc0/t3;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t3 a(int value) {
            switch (value) {
                case 0:
                    return t3.IOS_COREBTERROR_SNA;
                case 1:
                    return t3.IOS_COREBTERROR_UNKNOWN;
                case 2:
                    return t3.IOS_COREBTERROR_INVALID_PARAMETERS;
                case 3:
                    return t3.IOS_COREBTERROR_INVALID_HANDLE;
                case 4:
                    return t3.IOS_COREBTERROR_NOT_CONNECTED;
                case 5:
                    return t3.IOS_COREBTERROR_OUT_OF_SPACE;
                case 6:
                    return t3.IOS_COREBTERROR_OPERATION_CANCELLED;
                case 7:
                    return t3.IOS_COREBTERROR_CONNECTION_TIMEOUT;
                case 8:
                    return t3.IOS_COREBTERROR_PERIPHERAL_DISCONNECTED;
                case 9:
                    return t3.IOS_COREBTERROR_UUID_NOT_ALLOWED;
                case 10:
                    return t3.IOS_COREBTERROR_ALREADY_ADVERTISING;
                case 11:
                    return t3.IOS_COREBTERROR_CONNECTION_FAILED;
                case 12:
                    return t3.IOS_COREBTERROR_CONNECTION_LIMIT_REACHED;
                case 13:
                    return t3.IOS_COREBTERROR_OPERATION_NOT_SUPPORTED;
                case 14:
                    return t3.IOS_COREBTERROR_UNKNOWN_DEVICE;
                case 15:
                    return t3.IOS_COREBTERROR_ENCRYPTIONTIMEDOUT;
                case 16:
                    return t3.IOS_COREBTERROR_LEGATTEXCEEDEDBACKGROUNDNOTIFICATIONLIMIT;
                case 17:
                    return t3.IOS_COREBTERROR_LEGATTNEARBACKGROUNDNOTIFICATIONLIMIT;
                case 18:
                    return t3.IOS_COREBTERROR_PEERREMOVEDPAIRINGINFORMATION;
                case 19:
                    return t3.IOS_COREBTERROR_TOOMANYLEPAIREDDEVICES;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private t3(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final t3 fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<t3> getEntries() {
        return $ENTRIES;
    }

    public static t3 valueOf(String str) {
        return (t3) Enum.valueOf(t3.class, str);
    }

    public static t3[] values() {
        return (t3[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
