package vc0;

import com.squareup.wire.ProtoAdapter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 vc0.g3, still in use, count: 1, list:
  (r0v0 vc0.g3) from 0x0046: CONSTRUCTOR 
  (wrap co0.d:0x003e: INVOKE (wrap java.lang.Class:0x003c: CONST_CLASS  A[WRAPPED] (LINE:61) vc0.g3.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:63))
  (wrap com.squareup.wire.o:0x0042: SGET  A[WRAPPED] (LINE:67) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 vc0.g3)
 A[MD:(co0.d<vc0.g3>, com.squareup.wire.o, vc0.g3):void (m), WRAPPED] (LINE:71) call: vc0.g3.a.<init>(co0.d, com.squareup.wire.o, vc0.g3):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lvc0/g3;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "VEHICLELOCKSTATE_UNLOCKED", "VEHICLELOCKSTATE_LOCKED", "VEHICLELOCKSTATE_INTERNAL_LOCKED", "VEHICLELOCKSTATE_SELECTIVE_UNLOCKED", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g3 implements com.squareup.wire.p {
    VEHICLELOCKSTATE_UNLOCKED(0),
    VEHICLELOCKSTATE_LOCKED(1),
    VEHICLELOCKSTATE_INTERNAL_LOCKED(2),
    VEHICLELOCKSTATE_SELECTIVE_UNLOCKED(3);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<g3> ADAPTER = new com.squareup.wire.a<g3>(p013kotlin.jvm.internal.o0.b(g3.class), com.squareup.wire.o.PROTO_3, new g3(0)) { // from class: vc0.g3.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public g3 d(int value) {
            return g3.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: vc0.g3$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvc0/g3$b;", "", "<init>", "()V", "", "value", "Lvc0/g3;", "a", "(I)Lvc0/g3;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g3 a(int value) {
            if (value == 0) {
                return g3.VEHICLELOCKSTATE_UNLOCKED;
            }
            if (value == 1) {
                return g3.VEHICLELOCKSTATE_LOCKED;
            }
            if (value == 2) {
                return g3.VEHICLELOCKSTATE_INTERNAL_LOCKED;
            }
            if (value != 3) {
                return null;
            }
            return g3.VEHICLELOCKSTATE_SELECTIVE_UNLOCKED;
        }

        private Companion() {
        }
    }

    static {
    }

    private g3(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final g3 fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<g3> getEntries() {
        return $ENTRIES;
    }

    public static g3 valueOf(String str) {
        return (g3) Enum.valueOf(g3.class, str);
    }

    public static g3[] values() {
        return (g3[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
