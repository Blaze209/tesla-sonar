package rc0;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.p;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 rc0.n, still in use, count: 1, list:
  (r0v0 rc0.n) from 0x008f: CONSTRUCTOR 
  (wrap co0.d:0x0087: INVOKE (wrap java.lang.Class:0x0085: CONST_CLASS  A[WRAPPED] (LINE:134) rc0.n.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:136))
  (wrap com.squareup.wire.o:0x008b: SGET  A[WRAPPED] (LINE:140) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 rc0.n)
 A[MD:(co0.d<rc0.n>, com.squareup.wire.o, rc0.n):void (m), WRAPPED] (LINE:144) call: rc0.n.a.<init>(co0.d, com.squareup.wire.o, rc0.n):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lrc0/n;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "SIGNATURE_TYPE_AES_GCM", "SIGNATURE_TYPE_ECDSA", "SIGNATURE_TYPE_PRESENT_KEY", "SIGNATURE_TYPE_AES_GCM_TOKEN", "SIGNATURE_TYPE_ECDSA_PERSONALIZED", "SIGNATURE_TYPE_AES_GCM_PERSONALIZED", "SIGNATURE_TYPE_HMAC", "SIGNATURE_TYPE_RSA", "SIGNATURE_TYPE_HMAC_PERSONALIZED", "SIGNATURE_TYPE_AES_GCM_RESPONSE", "SIGNATURE_TYPE_AES_GCM_DETACHED", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n implements p {
    SIGNATURE_TYPE_AES_GCM(0),
    SIGNATURE_TYPE_ECDSA(1),
    SIGNATURE_TYPE_PRESENT_KEY(2),
    SIGNATURE_TYPE_AES_GCM_TOKEN(3),
    SIGNATURE_TYPE_ECDSA_PERSONALIZED(4),
    SIGNATURE_TYPE_AES_GCM_PERSONALIZED(5),
    SIGNATURE_TYPE_HMAC(6),
    SIGNATURE_TYPE_RSA(7),
    SIGNATURE_TYPE_HMAC_PERSONALIZED(8),
    SIGNATURE_TYPE_AES_GCM_RESPONSE(9),
    SIGNATURE_TYPE_AES_GCM_DETACHED(10);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<n> ADAPTER = new com.squareup.wire.a<n>(o0.b(n.class), com.squareup.wire.o.PROTO_3, new n(0)) { // from class: rc0.n.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public n d(int value) {
            return n.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: rc0.n$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lrc0/n$b;", "", "<init>", "()V", "", "value", "Lrc0/n;", "a", "(I)Lrc0/n;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a(int value) {
            switch (value) {
                case 0:
                    return n.SIGNATURE_TYPE_AES_GCM;
                case 1:
                    return n.SIGNATURE_TYPE_ECDSA;
                case 2:
                    return n.SIGNATURE_TYPE_PRESENT_KEY;
                case 3:
                    return n.SIGNATURE_TYPE_AES_GCM_TOKEN;
                case 4:
                    return n.SIGNATURE_TYPE_ECDSA_PERSONALIZED;
                case 5:
                    return n.SIGNATURE_TYPE_AES_GCM_PERSONALIZED;
                case 6:
                    return n.SIGNATURE_TYPE_HMAC;
                case 7:
                    return n.SIGNATURE_TYPE_RSA;
                case 8:
                    return n.SIGNATURE_TYPE_HMAC_PERSONALIZED;
                case 9:
                    return n.SIGNATURE_TYPE_AES_GCM_RESPONSE;
                case 10:
                    return n.SIGNATURE_TYPE_AES_GCM_DETACHED;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private n(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final n fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<n> getEntries() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
