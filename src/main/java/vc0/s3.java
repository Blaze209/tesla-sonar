package vc0;

import com.squareup.wire.ProtoAdapter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 vc0.s3, still in use, count: 1, list:
  (r0v0 vc0.s3) from 0x00dc: CONSTRUCTOR 
  (wrap co0.d:0x00d4: INVOKE (wrap java.lang.Class:0x00d2: CONST_CLASS  A[WRAPPED] (LINE:211) vc0.s3.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:213))
  (wrap com.squareup.wire.o:0x00d8: SGET  A[WRAPPED] (LINE:217) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 vc0.s3)
 A[MD:(co0.d<vc0.s3>, com.squareup.wire.o, vc0.s3):void (m), WRAPPED] (LINE:221) call: vc0.s3.a.<init>(co0.d, com.squareup.wire.o, vc0.s3):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lvc0/s3;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "IOS_COREBTATTERRORCODE_SNA", "IOS_COREBTATTERRORCODE_SUCCESS", "IOS_COREBTATTERRORCODE_READ_NOT_PERMITTED", "IOS_COREBTATTERRORCODE_WRITE_NOT_PERMITTED", "IOS_COREBTATTERRORCODE_INVALID_PDU", "IOS_COREBTATTERRORCODE_INSUFFICIENT_AUTHENTICATION", "IOS_COREBTATTERRORCODE_REQUEST_NOT_SUPPORTED", "IOS_COREBTATTERRORCODE_INVALID_OFFSET", "IOS_COREBTATTERRORCODE_INSUFFICIENT_AUTHORIZATION", "IOS_COREBTATTERRORCODE_PREPARE_QUEUE_FULL", "IOS_COREBTATTERRORCODE_ATT_NOT_FOUND", "IOS_COREBTATTERRORCODE_ATT_NOT_LONG", "IOS_COREBTATTERRORCODE_INSUFFICIENT_ENCRYPTION_KEY_SIZE", "IOS_COREBTATTERRORCODE_INVALID_ATT_VALUE_LENGTH", "IOS_COREBTATTERRORCODE_UNLIKELY_ERROR", "IOS_COREBTATTERRORCODE_INSUFFICIENT_ENCRYPTION", "IOS_COREBTATTERRORCODE_UNSUPPORTED_GROUP_TYPE", "IOS_COREBTATTERRORCODE_INSUFFICIENT_RESOURCES", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s3 implements com.squareup.wire.p {
    IOS_COREBTATTERRORCODE_SNA(0),
    IOS_COREBTATTERRORCODE_SUCCESS(1),
    IOS_COREBTATTERRORCODE_READ_NOT_PERMITTED(2),
    IOS_COREBTATTERRORCODE_WRITE_NOT_PERMITTED(3),
    IOS_COREBTATTERRORCODE_INVALID_PDU(4),
    IOS_COREBTATTERRORCODE_INSUFFICIENT_AUTHENTICATION(5),
    IOS_COREBTATTERRORCODE_REQUEST_NOT_SUPPORTED(6),
    IOS_COREBTATTERRORCODE_INVALID_OFFSET(7),
    IOS_COREBTATTERRORCODE_INSUFFICIENT_AUTHORIZATION(8),
    IOS_COREBTATTERRORCODE_PREPARE_QUEUE_FULL(9),
    IOS_COREBTATTERRORCODE_ATT_NOT_FOUND(10),
    IOS_COREBTATTERRORCODE_ATT_NOT_LONG(11),
    IOS_COREBTATTERRORCODE_INSUFFICIENT_ENCRYPTION_KEY_SIZE(12),
    IOS_COREBTATTERRORCODE_INVALID_ATT_VALUE_LENGTH(13),
    IOS_COREBTATTERRORCODE_UNLIKELY_ERROR(14),
    IOS_COREBTATTERRORCODE_INSUFFICIENT_ENCRYPTION(15),
    IOS_COREBTATTERRORCODE_UNSUPPORTED_GROUP_TYPE(16),
    IOS_COREBTATTERRORCODE_INSUFFICIENT_RESOURCES(17);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<s3> ADAPTER = new com.squareup.wire.a<s3>(p013kotlin.jvm.internal.o0.b(s3.class), com.squareup.wire.o.PROTO_3, new s3(0)) { // from class: vc0.s3.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public s3 d(int value) {
            return s3.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: vc0.s3$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvc0/s3$b;", "", "<init>", "()V", "", "value", "Lvc0/s3;", "a", "(I)Lvc0/s3;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s3 a(int value) {
            switch (value) {
                case 0:
                    return s3.IOS_COREBTATTERRORCODE_SNA;
                case 1:
                    return s3.IOS_COREBTATTERRORCODE_SUCCESS;
                case 2:
                    return s3.IOS_COREBTATTERRORCODE_READ_NOT_PERMITTED;
                case 3:
                    return s3.IOS_COREBTATTERRORCODE_WRITE_NOT_PERMITTED;
                case 4:
                    return s3.IOS_COREBTATTERRORCODE_INVALID_PDU;
                case 5:
                    return s3.IOS_COREBTATTERRORCODE_INSUFFICIENT_AUTHENTICATION;
                case 6:
                    return s3.IOS_COREBTATTERRORCODE_REQUEST_NOT_SUPPORTED;
                case 7:
                    return s3.IOS_COREBTATTERRORCODE_INVALID_OFFSET;
                case 8:
                    return s3.IOS_COREBTATTERRORCODE_INSUFFICIENT_AUTHORIZATION;
                case 9:
                    return s3.IOS_COREBTATTERRORCODE_PREPARE_QUEUE_FULL;
                case 10:
                    return s3.IOS_COREBTATTERRORCODE_ATT_NOT_FOUND;
                case 11:
                    return s3.IOS_COREBTATTERRORCODE_ATT_NOT_LONG;
                case 12:
                    return s3.IOS_COREBTATTERRORCODE_INSUFFICIENT_ENCRYPTION_KEY_SIZE;
                case 13:
                    return s3.IOS_COREBTATTERRORCODE_INVALID_ATT_VALUE_LENGTH;
                case 14:
                    return s3.IOS_COREBTATTERRORCODE_UNLIKELY_ERROR;
                case 15:
                    return s3.IOS_COREBTATTERRORCODE_INSUFFICIENT_ENCRYPTION;
                case 16:
                    return s3.IOS_COREBTATTERRORCODE_UNSUPPORTED_GROUP_TYPE;
                case 17:
                    return s3.IOS_COREBTATTERRORCODE_INSUFFICIENT_RESOURCES;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private s3(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final s3 fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<s3> getEntries() {
        return $ENTRIES;
    }

    public static s3 valueOf(String str) {
        return (s3) Enum.valueOf(s3.class, str);
    }

    public static s3[] values() {
        return (s3[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
