package vc0;

import com.squareup.wire.ProtoAdapter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 vc0.d1, still in use, count: 1, list:
  (r0v0 vc0.d1) from 0x0084: CONSTRUCTOR 
  (wrap co0.d:0x007c: INVOKE (wrap java.lang.Class:0x007a: CONST_CLASS  A[WRAPPED] (LINE:123) vc0.d1.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:125))
  (wrap com.squareup.wire.o:0x0080: SGET  A[WRAPPED] (LINE:129) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 vc0.d1)
 A[MD:(co0.d<vc0.d1>, com.squareup.wire.o, vc0.d1):void (m), WRAPPED] (LINE:133) call: vc0.d1.a.<init>(co0.d, com.squareup.wire.o, vc0.d1):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lvc0/d1;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "HANDLE_PULLED_FRONT_DRIVER_DOOR", "HANDLE_PULLED_FRONT_PASSENGER_DOOR", "HANDLE_PULLED_REAR_DRIVER_DOOR", "HANDLE_PULLED_REAR_PASSENGER_DOOR", "HANDLE_PULLED_TRUNK", "HANDLE_PULLED_CHARGE_PORT", "HANDLE_PULLED_FRONT_DRIVER_AUTO_PRESENT_DOOR", "HANDLE_PULLED_FRONT_PASSENGER_AUTO_PRESENT_DOOR", "HANDLE_PULLED_OTHER", "HANDLE_PULLED_FRUNK", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d1 implements com.squareup.wire.p {
    HANDLE_PULLED_FRONT_DRIVER_DOOR(0),
    HANDLE_PULLED_FRONT_PASSENGER_DOOR(1),
    HANDLE_PULLED_REAR_DRIVER_DOOR(2),
    HANDLE_PULLED_REAR_PASSENGER_DOOR(3),
    HANDLE_PULLED_TRUNK(4),
    HANDLE_PULLED_CHARGE_PORT(5),
    HANDLE_PULLED_FRONT_DRIVER_AUTO_PRESENT_DOOR(6),
    HANDLE_PULLED_FRONT_PASSENGER_AUTO_PRESENT_DOOR(7),
    HANDLE_PULLED_OTHER(8),
    HANDLE_PULLED_FRUNK(9);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<d1> ADAPTER = new com.squareup.wire.a<d1>(p013kotlin.jvm.internal.o0.b(d1.class), com.squareup.wire.o.PROTO_3, new d1(0)) { // from class: vc0.d1.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public d1 d(int value) {
            return d1.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: vc0.d1$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvc0/d1$b;", "", "<init>", "()V", "", "value", "Lvc0/d1;", "a", "(I)Lvc0/d1;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d1 a(int value) {
            switch (value) {
                case 0:
                    return d1.HANDLE_PULLED_FRONT_DRIVER_DOOR;
                case 1:
                    return d1.HANDLE_PULLED_FRONT_PASSENGER_DOOR;
                case 2:
                    return d1.HANDLE_PULLED_REAR_DRIVER_DOOR;
                case 3:
                    return d1.HANDLE_PULLED_REAR_PASSENGER_DOOR;
                case 4:
                    return d1.HANDLE_PULLED_TRUNK;
                case 5:
                    return d1.HANDLE_PULLED_CHARGE_PORT;
                case 6:
                    return d1.HANDLE_PULLED_FRONT_DRIVER_AUTO_PRESENT_DOOR;
                case 7:
                    return d1.HANDLE_PULLED_FRONT_PASSENGER_AUTO_PRESENT_DOOR;
                case 8:
                    return d1.HANDLE_PULLED_OTHER;
                case 9:
                    return d1.HANDLE_PULLED_FRUNK;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private d1(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final d1 fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<d1> getEntries() {
        return $ENTRIES;
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
