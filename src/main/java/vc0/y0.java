package vc0;

import com.squareup.wire.ProtoAdapter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 vc0.y0, still in use, count: 1, list:
  (r0v0 vc0.y0) from 0x0050: CONSTRUCTOR 
  (wrap co0.d:0x0048: INVOKE (wrap java.lang.Class:0x0046: CONST_CLASS  A[WRAPPED] (LINE:71) vc0.y0.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:73))
  (wrap com.squareup.wire.o:0x004c: SGET  A[WRAPPED] (LINE:77) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 vc0.y0)
 A[MD:(co0.d<vc0.y0>, com.squareup.wire.o, vc0.y0):void (m), WRAPPED] (LINE:81) call: vc0.y0.a.<init>(co0.d, com.squareup.wire.o, vc0.y0):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lvc0/y0;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "GEAR_UNKNOWN", "GEAR_PARK", "GEAR_DRIVE", "GEAR_REVERSE", "GEAR_NEUTRAL", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y0 implements com.squareup.wire.p {
    GEAR_UNKNOWN(0),
    GEAR_PARK(1),
    GEAR_DRIVE(2),
    GEAR_REVERSE(3),
    GEAR_NEUTRAL(4);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<y0> ADAPTER = new com.squareup.wire.a<y0>(p013kotlin.jvm.internal.o0.b(y0.class), com.squareup.wire.o.PROTO_3, new y0(0)) { // from class: vc0.y0.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public y0 d(int value) {
            return y0.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: vc0.y0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvc0/y0$b;", "", "<init>", "()V", "", "value", "Lvc0/y0;", "a", "(I)Lvc0/y0;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y0 a(int value) {
            if (value == 0) {
                return y0.GEAR_UNKNOWN;
            }
            if (value == 1) {
                return y0.GEAR_PARK;
            }
            if (value == 2) {
                return y0.GEAR_DRIVE;
            }
            if (value == 3) {
                return y0.GEAR_REVERSE;
            }
            if (value != 4) {
                return null;
            }
            return y0.GEAR_NEUTRAL;
        }

        private Companion() {
        }
    }

    static {
    }

    private y0(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final y0 fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<y0> getEntries() {
        return $ENTRIES;
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
