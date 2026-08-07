package vc0;

import com.squareup.wire.ProtoAdapter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 vc0.g1, still in use, count: 1, list:
  (r0v0 vc0.g1) from 0x0091: CONSTRUCTOR 
  (wrap co0.d:0x0089: INVOKE (wrap java.lang.Class:0x0087: CONST_CLASS  A[WRAPPED] (LINE:136) vc0.g1.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:138))
  (wrap com.squareup.wire.o:0x008d: SGET  A[WRAPPED] (LINE:142) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 vc0.g1)
 A[MD:(co0.d<vc0.g1>, com.squareup.wire.o, vc0.g1):void (m), WRAPPED] (LINE:146) call: vc0.g1.a.<init>(co0.d, com.squareup.wire.o, vc0.g1):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lvc0/g1;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "INFORMATION_REQUEST_TYPE_GET_STATUS", "INFORMATION_REQUEST_TYPE_GET_TOKEN", "INFORMATION_REQUEST_TYPE_GET_COUNTER", "INFORMATION_REQUEST_TYPE_GET_EPHEMERAL_PUBLIC_KEY", "INFORMATION_REQUEST_TYPE_GET_SESSION_DATA", "INFORMATION_REQUEST_TYPE_GET_WHITELIST_INFO", "INFORMATION_REQUEST_TYPE_GET_WHITELIST_ENTRY_INFO", "INFORMATION_REQUEST_TYPE_GET_PERSONALIZATION_INFO", "INFORMATION_REQUEST_TYPE_GET_KEYSTATUS_INFO", "INFORMATION_REQUEST_TYPE_GET_ACTIVE_KEY", "INFORMATION_REQUEST_TYPE_GET_CAPABILITIES", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g1 implements com.squareup.wire.p {
    INFORMATION_REQUEST_TYPE_GET_STATUS(0),
    INFORMATION_REQUEST_TYPE_GET_TOKEN(1),
    INFORMATION_REQUEST_TYPE_GET_COUNTER(2),
    INFORMATION_REQUEST_TYPE_GET_EPHEMERAL_PUBLIC_KEY(3),
    INFORMATION_REQUEST_TYPE_GET_SESSION_DATA(4),
    INFORMATION_REQUEST_TYPE_GET_WHITELIST_INFO(5),
    INFORMATION_REQUEST_TYPE_GET_WHITELIST_ENTRY_INFO(6),
    INFORMATION_REQUEST_TYPE_GET_PERSONALIZATION_INFO(7),
    INFORMATION_REQUEST_TYPE_GET_KEYSTATUS_INFO(8),
    INFORMATION_REQUEST_TYPE_GET_ACTIVE_KEY(9),
    INFORMATION_REQUEST_TYPE_GET_CAPABILITIES(16);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<g1> ADAPTER = new com.squareup.wire.a<g1>(p013kotlin.jvm.internal.o0.b(g1.class), com.squareup.wire.o.PROTO_3, new g1(0)) { // from class: vc0.g1.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public g1 d(int value) {
            return g1.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: vc0.g1$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvc0/g1$b;", "", "<init>", "()V", "", "value", "Lvc0/g1;", "a", "(I)Lvc0/g1;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g1 a(int value) {
            if (value == 16) {
                return g1.INFORMATION_REQUEST_TYPE_GET_CAPABILITIES;
            }
            switch (value) {
                case 0:
                    return g1.INFORMATION_REQUEST_TYPE_GET_STATUS;
                case 1:
                    return g1.INFORMATION_REQUEST_TYPE_GET_TOKEN;
                case 2:
                    return g1.INFORMATION_REQUEST_TYPE_GET_COUNTER;
                case 3:
                    return g1.INFORMATION_REQUEST_TYPE_GET_EPHEMERAL_PUBLIC_KEY;
                case 4:
                    return g1.INFORMATION_REQUEST_TYPE_GET_SESSION_DATA;
                case 5:
                    return g1.INFORMATION_REQUEST_TYPE_GET_WHITELIST_INFO;
                case 6:
                    return g1.INFORMATION_REQUEST_TYPE_GET_WHITELIST_ENTRY_INFO;
                case 7:
                    return g1.INFORMATION_REQUEST_TYPE_GET_PERSONALIZATION_INFO;
                case 8:
                    return g1.INFORMATION_REQUEST_TYPE_GET_KEYSTATUS_INFO;
                case 9:
                    return g1.INFORMATION_REQUEST_TYPE_GET_ACTIVE_KEY;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private g1(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final g1 fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<g1> getEntries() {
        return $ENTRIES;
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
