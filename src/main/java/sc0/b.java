package sc0;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 sc0.b, still in use, count: 1, list:
  (r0v0 sc0.b) from 0x005d: CONSTRUCTOR 
  (wrap co0.d:0x0055: INVOKE (wrap java.lang.Class:0x0053: CONST_CLASS  A[WRAPPED] (LINE:84) sc0.b.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:86))
  (wrap com.squareup.wire.o:0x0059: SGET  A[WRAPPED] (LINE:90) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 sc0.b)
 A[MD:(co0.d<sc0.b>, com.squareup.wire.o, sc0.b):void (m), WRAPPED] (LINE:94) call: sc0.b.a.<init>(co0.d, com.squareup.wire.o, sc0.b):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lsc0/b;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "DOMAIN_BROADCAST", "DOMAIN_VEHICLE_SECURITY", "DOMAIN_INFOTAINMENT", "DOMAIN_AUTHD", "DOMAIN_ENERGY_DEVICE", "DOMAIN_ENERGY_DEVICE_AUTH", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements p {
    DOMAIN_BROADCAST(0),
    DOMAIN_VEHICLE_SECURITY(2),
    DOMAIN_INFOTAINMENT(3),
    DOMAIN_AUTHD(5),
    DOMAIN_ENERGY_DEVICE(7),
    DOMAIN_ENERGY_DEVICE_AUTH(8);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<b> ADAPTER = new com.squareup.wire.a<b>(o0.b(b.class), o.PROTO_3, new b(0)) { // from class: sc0.b.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public b d(int value) {
            return b.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: sc0.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lsc0/b$b;", "", "<init>", "()V", "", "value", "Lsc0/b;", "a", "(I)Lsc0/b;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(int value) {
            if (value == 0) {
                return b.DOMAIN_BROADCAST;
            }
            if (value == 5) {
                return b.DOMAIN_AUTHD;
            }
            if (value == 2) {
                return b.DOMAIN_VEHICLE_SECURITY;
            }
            if (value == 3) {
                return b.DOMAIN_INFOTAINMENT;
            }
            if (value == 7) {
                return b.DOMAIN_ENERGY_DEVICE;
            }
            if (value != 8) {
                return null;
            }
            return b.DOMAIN_ENERGY_DEVICE_AUTH;
        }

        private Companion() {
        }
    }

    static {
    }

    private b(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final b fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<b> getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
