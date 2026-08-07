package vc0;

import com.squareup.wire.ProtoAdapter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 vc0.o, still in use, count: 1, list:
  (r0v0 vc0.o) from 0x005a: CONSTRUCTOR 
  (wrap co0.d:0x0052: INVOKE (wrap java.lang.Class:0x0050: CONST_CLASS  A[WRAPPED] (LINE:81) vc0.o.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:83))
  (wrap com.squareup.wire.o:0x0056: SGET  A[WRAPPED] (LINE:87) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 vc0.o)
 A[MD:(co0.d<vc0.o>, com.squareup.wire.o, vc0.o):void (m), WRAPPED] (LINE:91) call: vc0.o.a.<init>(co0.d, com.squareup.wire.o, vc0.o):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lvc0/o;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "AUTHENTICATIONREJECTION_NONE", "AUTHENTICATIONREJECTION_DEVICE_STATIONARY", "AUTHENTICATIONREJECTION_PASSIVE_DISABLED", "AUTHENTICATIONREJECTION_NO_TOKEN", "AUTHENTICATIONREJECTION_PASSIVE_DISABLED_AUTOMATION", "AUTHENTICATIONREJECTION_DEVICE_NOT_UNLOCKED_ON_WRIST", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o implements com.squareup.wire.p {
    AUTHENTICATIONREJECTION_NONE(0),
    AUTHENTICATIONREJECTION_DEVICE_STATIONARY(1),
    AUTHENTICATIONREJECTION_PASSIVE_DISABLED(2),
    AUTHENTICATIONREJECTION_NO_TOKEN(3),
    AUTHENTICATIONREJECTION_PASSIVE_DISABLED_AUTOMATION(4),
    AUTHENTICATIONREJECTION_DEVICE_NOT_UNLOCKED_ON_WRIST(5);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<o> ADAPTER = new com.squareup.wire.a<o>(p013kotlin.jvm.internal.o0.b(o.class), com.squareup.wire.o.PROTO_3, new o(0)) { // from class: vc0.o.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public o d(int value) {
            return o.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: vc0.o$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvc0/o$b;", "", "<init>", "()V", "", "value", "Lvc0/o;", "a", "(I)Lvc0/o;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a(int value) {
            if (value == 0) {
                return o.AUTHENTICATIONREJECTION_NONE;
            }
            if (value == 1) {
                return o.AUTHENTICATIONREJECTION_DEVICE_STATIONARY;
            }
            if (value == 2) {
                return o.AUTHENTICATIONREJECTION_PASSIVE_DISABLED;
            }
            if (value == 3) {
                return o.AUTHENTICATIONREJECTION_NO_TOKEN;
            }
            if (value == 4) {
                return o.AUTHENTICATIONREJECTION_PASSIVE_DISABLED_AUTOMATION;
            }
            if (value != 5) {
                return null;
            }
            return o.AUTHENTICATIONREJECTION_DEVICE_NOT_UNLOCKED_ON_WRIST;
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
