package vc0;

import com.squareup.wire.ProtoAdapter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 vc0.o2, still in use, count: 1, list:
  (r0v0 vc0.o2) from 0x00a4: CONSTRUCTOR 
  (wrap co0.d:0x009c: INVOKE (wrap java.lang.Class:0x009a: CONST_CLASS  A[WRAPPED] (LINE:155) vc0.o2.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:157))
  (wrap com.squareup.wire.o:0x00a0: SGET  A[WRAPPED] (LINE:161) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 vc0.o2)
 A[MD:(co0.d<vc0.o2>, com.squareup.wire.o, vc0.o2):void (m), WRAPPED] (LINE:165) call: vc0.o2.a.<init>(co0.d, com.squareup.wire.o, vc0.o2):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lvc0/o2;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "RKE_ACTION_UNLOCK", "RKE_ACTION_LOCK", "RKE_ACTION_OPEN_TRUNK", "RKE_ACTION_OPEN_FRUNK", "RKE_ACTION_OPEN_CHARGE_PORT", "RKE_ACTION_CLOSE_CHARGE_PORT", "RKE_ACTION_CANCEL_EXTERNAL_AUTHENTICATE", "RKE_ACTION_UNKNOWN", "RKE_ACTION_REMOTE_DRIVE", "RKE_ACTION_AUTO_SECURE_VEHICLE", "RKE_ACTION_WAKE_VEHICLE", "RKE_ACTION_UNLOCK_AND_REMOTE_DRIVE", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o2 implements com.squareup.wire.p {
    RKE_ACTION_UNLOCK(0),
    RKE_ACTION_LOCK(1),
    RKE_ACTION_OPEN_TRUNK(2),
    RKE_ACTION_OPEN_FRUNK(3),
    RKE_ACTION_OPEN_CHARGE_PORT(4),
    RKE_ACTION_CLOSE_CHARGE_PORT(5),
    RKE_ACTION_CANCEL_EXTERNAL_AUTHENTICATE(6),
    RKE_ACTION_UNKNOWN(19),
    RKE_ACTION_REMOTE_DRIVE(20),
    RKE_ACTION_AUTO_SECURE_VEHICLE(29),
    RKE_ACTION_WAKE_VEHICLE(30),
    RKE_ACTION_UNLOCK_AND_REMOTE_DRIVE(31);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<o2> ADAPTER = new com.squareup.wire.a<o2>(p013kotlin.jvm.internal.o0.b(o2.class), com.squareup.wire.o.PROTO_3, new o2(0)) { // from class: vc0.o2.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public o2 d(int value) {
            return o2.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: vc0.o2$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvc0/o2$b;", "", "<init>", "()V", "", "value", "Lvc0/o2;", "a", "(I)Lvc0/o2;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o2 a(int value) {
            if (value == 19) {
                return o2.RKE_ACTION_UNKNOWN;
            }
            if (value == 20) {
                return o2.RKE_ACTION_REMOTE_DRIVE;
            }
            switch (value) {
                case 0:
                    return o2.RKE_ACTION_UNLOCK;
                case 1:
                    return o2.RKE_ACTION_LOCK;
                case 2:
                    return o2.RKE_ACTION_OPEN_TRUNK;
                case 3:
                    return o2.RKE_ACTION_OPEN_FRUNK;
                case 4:
                    return o2.RKE_ACTION_OPEN_CHARGE_PORT;
                case 5:
                    return o2.RKE_ACTION_CLOSE_CHARGE_PORT;
                case 6:
                    return o2.RKE_ACTION_CANCEL_EXTERNAL_AUTHENTICATE;
                default:
                    switch (value) {
                        case 29:
                            return o2.RKE_ACTION_AUTO_SECURE_VEHICLE;
                        case 30:
                            return o2.RKE_ACTION_WAKE_VEHICLE;
                        case 31:
                            return o2.RKE_ACTION_UNLOCK_AND_REMOTE_DRIVE;
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

    private o2(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final o2 fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<o2> getEntries() {
        return $ENTRIES;
    }

    public static o2 valueOf(String str) {
        return (o2) Enum.valueOf(o2.class, str);
    }

    public static o2[] values() {
        return (o2[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
