package vc0;

import com.squareup.wire.ProtoAdapter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 vc0.l0, still in use, count: 1, list:
  (r0v0 vc0.l0) from 0x0046: CONSTRUCTOR 
  (wrap co0.d:0x003e: INVOKE (wrap java.lang.Class:0x003c: CONST_CLASS  A[WRAPPED] (LINE:61) vc0.l0.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:63))
  (wrap com.squareup.wire.o:0x0042: SGET  A[WRAPPED] (LINE:67) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 vc0.l0)
 A[MD:(co0.d<vc0.l0>, com.squareup.wire.o, vc0.l0):void (m), WRAPPED] (LINE:71) call: vc0.l0.a.<init>(co0.d, com.squareup.wire.o, vc0.l0):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lvc0/l0;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "DEVICE_MOTION_CONFIDENCE_UNKNOWN", "DEVICE_MOTION_CONFIDENCE_LOW", "DEVICE_MOTION_CONFIDENCE_MEDIUM", "DEVICE_MOTION_CONFIDENCE_HIGH", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l0 implements com.squareup.wire.p {
    DEVICE_MOTION_CONFIDENCE_UNKNOWN(0),
    DEVICE_MOTION_CONFIDENCE_LOW(1),
    DEVICE_MOTION_CONFIDENCE_MEDIUM(2),
    DEVICE_MOTION_CONFIDENCE_HIGH(3);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<l0> ADAPTER = new com.squareup.wire.a<l0>(p013kotlin.jvm.internal.o0.b(l0.class), com.squareup.wire.o.PROTO_3, new l0(0)) { // from class: vc0.l0.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public l0 d(int value) {
            return l0.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: vc0.l0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvc0/l0$b;", "", "<init>", "()V", "", "value", "Lvc0/l0;", "a", "(I)Lvc0/l0;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l0 a(int value) {
            if (value == 0) {
                return l0.DEVICE_MOTION_CONFIDENCE_UNKNOWN;
            }
            if (value == 1) {
                return l0.DEVICE_MOTION_CONFIDENCE_LOW;
            }
            if (value == 2) {
                return l0.DEVICE_MOTION_CONFIDENCE_MEDIUM;
            }
            if (value != 3) {
                return null;
            }
            return l0.DEVICE_MOTION_CONFIDENCE_HIGH;
        }

        private Companion() {
        }
    }

    static {
    }

    private l0(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final l0 fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<l0> getEntries() {
        return $ENTRIES;
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
