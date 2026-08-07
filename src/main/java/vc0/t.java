package vc0;

import com.squareup.wire.ProtoAdapter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 vc0.t, still in use, count: 1, list:
  (r0v0 vc0.t) from 0x009a: CONSTRUCTOR 
  (wrap co0.d:0x0092: INVOKE (wrap java.lang.Class:0x0090: CONST_CLASS  A[WRAPPED] (LINE:145) vc0.t.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:147))
  (wrap com.squareup.wire.o:0x0096: SGET  A[WRAPPED] (LINE:151) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 vc0.t)
 A[MD:(co0.d<vc0.t>, com.squareup.wire.o, vc0.t):void (m), WRAPPED] (LINE:155) call: vc0.t.a.<init>(co0.d, com.squareup.wire.o, vc0.t):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lvc0/t;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "BLE_ENDPOINT_NONE", "BLE_ENDPOINT_CENTER", "BLE_ENDPOINT_FRONT", "BLE_ENDPOINT_LEFT", "BLE_ENDPOINT_RIGHT", "BLE_ENDPOINT_REAR", "BLE_ENDPOINT_REAR_LEFT", "BLE_ENDPOINT_REAR_RIGHT", "BLE_ENDPOINT_NFC_CRADLE", "BLE_ENDPOINT_FRONT_LEFT", "BLE_ENDPOINT_FRONT_RIGHT", "BLE_ENDPOINT_SECONDARY_CENTER", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t implements com.squareup.wire.p {
    BLE_ENDPOINT_NONE(0),
    BLE_ENDPOINT_CENTER(1),
    BLE_ENDPOINT_FRONT(2),
    BLE_ENDPOINT_LEFT(3),
    BLE_ENDPOINT_RIGHT(4),
    BLE_ENDPOINT_REAR(5),
    BLE_ENDPOINT_REAR_LEFT(6),
    BLE_ENDPOINT_REAR_RIGHT(7),
    BLE_ENDPOINT_NFC_CRADLE(8),
    BLE_ENDPOINT_FRONT_LEFT(9),
    BLE_ENDPOINT_FRONT_RIGHT(10),
    BLE_ENDPOINT_SECONDARY_CENTER(11);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<t> ADAPTER = new com.squareup.wire.a<t>(p013kotlin.jvm.internal.o0.b(t.class), com.squareup.wire.o.PROTO_3, new t(0)) { // from class: vc0.t.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public t d(int value) {
            return t.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: vc0.t$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvc0/t$b;", "", "<init>", "()V", "", "value", "Lvc0/t;", "a", "(I)Lvc0/t;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a(int value) {
            switch (value) {
                case 0:
                    return t.BLE_ENDPOINT_NONE;
                case 1:
                    return t.BLE_ENDPOINT_CENTER;
                case 2:
                    return t.BLE_ENDPOINT_FRONT;
                case 3:
                    return t.BLE_ENDPOINT_LEFT;
                case 4:
                    return t.BLE_ENDPOINT_RIGHT;
                case 5:
                    return t.BLE_ENDPOINT_REAR;
                case 6:
                    return t.BLE_ENDPOINT_REAR_LEFT;
                case 7:
                    return t.BLE_ENDPOINT_REAR_RIGHT;
                case 8:
                    return t.BLE_ENDPOINT_NFC_CRADLE;
                case 9:
                    return t.BLE_ENDPOINT_FRONT_LEFT;
                case 10:
                    return t.BLE_ENDPOINT_FRONT_RIGHT;
                case 11:
                    return t.BLE_ENDPOINT_SECONDARY_CENTER;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private t(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final t fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<t> getEntries() {
        return $ENTRIES;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
