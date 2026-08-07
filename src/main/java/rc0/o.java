package rc0;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.p;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 rc0.o, still in use, count: 1, list:
  (r0v0 rc0.o) from 0x009c: CONSTRUCTOR 
  (wrap co0.d:0x0094: INVOKE (wrap java.lang.Class:0x0092: CONST_CLASS  A[WRAPPED] (LINE:147) rc0.o.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:149))
  (wrap com.squareup.wire.o:0x0098: SGET  A[WRAPPED] (LINE:153) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 rc0.o)
 A[MD:(co0.d<rc0.o>, com.squareup.wire.o, rc0.o):void (m), WRAPPED] (LINE:157) call: rc0.o.a.<init>(co0.d, com.squareup.wire.o, rc0.o):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lrc0/o;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "TAG_SIGNATURE_TYPE", "TAG_DOMAIN", "TAG_PERSONALIZATION", "TAG_EPOCH", "TAG_EXPIRES_AT", "TAG_COUNTER", "TAG_CHALLENGE", "TAG_FLAGS", "TAG_REQUEST_HASH", "TAG_FAULT", "TAG_COMMAND_PREFIX", "TAG_END", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o implements p {
    TAG_SIGNATURE_TYPE(0),
    TAG_DOMAIN(1),
    TAG_PERSONALIZATION(2),
    TAG_EPOCH(3),
    TAG_EXPIRES_AT(4),
    TAG_COUNTER(5),
    TAG_CHALLENGE(6),
    TAG_FLAGS(7),
    TAG_REQUEST_HASH(8),
    TAG_FAULT(9),
    TAG_COMMAND_PREFIX(10),
    TAG_END(255);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<o> ADAPTER = new com.squareup.wire.a<o>(o0.b(o.class), com.squareup.wire.o.PROTO_3, new o(0)) { // from class: rc0.o.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public o d(int value) {
            return o.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: rc0.o$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lrc0/o$b;", "", "<init>", "()V", "", "value", "Lrc0/o;", "a", "(I)Lrc0/o;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a(int value) {
            if (value == 255) {
                return o.TAG_END;
            }
            switch (value) {
                case 0:
                    return o.TAG_SIGNATURE_TYPE;
                case 1:
                    return o.TAG_DOMAIN;
                case 2:
                    return o.TAG_PERSONALIZATION;
                case 3:
                    return o.TAG_EPOCH;
                case 4:
                    return o.TAG_EXPIRES_AT;
                case 5:
                    return o.TAG_COUNTER;
                case 6:
                    return o.TAG_CHALLENGE;
                case 7:
                    return o.TAG_FLAGS;
                case 8:
                    return o.TAG_REQUEST_HASH;
                case 9:
                    return o.TAG_FAULT;
                case 10:
                    return o.TAG_COMMAND_PREFIX;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private o(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final o fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<o> getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
