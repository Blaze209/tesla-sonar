package kc0;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import com.teslamotors.plugins.ble.Peripheral;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 kc0.g, still in use, count: 1, list:
  (r0v0 kc0.g) from 0x00be: CONSTRUCTOR 
  (wrap co0.d:0x00b6: INVOKE (wrap java.lang.Class:0x00b4: CONST_CLASS  A[WRAPPED] (LINE:181) kc0.g.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:183))
  (wrap com.squareup.wire.o:0x00ba: SGET  A[WRAPPED] (LINE:187) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 kc0.g)
 A[MD:(co0.d<kc0.g>, com.squareup.wire.o, kc0.g):void (m), WRAPPED] (LINE:191) call: kc0.g.a.<init>(co0.d, com.squareup.wire.o, kc0.g):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkc0/g;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "STATUS_CODE_OK", "STATUS_CODE_INVALID_MESSAGE", "STATUS_CODE_INVALID_TOKEN", "STATUS_CODE_PUBLISH_FAILED", "STATUS_CODE_PERMISSION_DENIED_NO_TOKEN", "STATUS_CODE_PERMISSION_DENIED_EXPIRED_TOKEN", "STATUS_CODE_PUBLISH_FAILED_NOT_CONNECTED", "STATUS_CODE_SERVER_ACK", "STATUS_CODE_TOO_MANY_REQUESTS", "STATUS_CODE_CLIENT_ACK", "STATUS_CODE_INTERNAL_ERROR", "STATUS_CODE_APPLICATION_OK", "STATUS_CODE_APPLICATION_ACK", "STATUS_CODE_APPLICATION_ERROR", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements p {
    STATUS_CODE_OK(0),
    STATUS_CODE_INVALID_MESSAGE(1),
    STATUS_CODE_INVALID_TOKEN(2),
    STATUS_CODE_PUBLISH_FAILED(3),
    STATUS_CODE_PERMISSION_DENIED_NO_TOKEN(4),
    STATUS_CODE_PERMISSION_DENIED_EXPIRED_TOKEN(5),
    STATUS_CODE_PUBLISH_FAILED_NOT_CONNECTED(6),
    STATUS_CODE_SERVER_ACK(1202),
    STATUS_CODE_TOO_MANY_REQUESTS(1429),
    STATUS_CODE_CLIENT_ACK(2202),
    STATUS_CODE_INTERNAL_ERROR(2500),
    STATUS_CODE_APPLICATION_OK(3200),
    STATUS_CODE_APPLICATION_ACK(3202),
    STATUS_CODE_APPLICATION_ERROR(Peripheral.PERIPHERAL_DISCONNECTION_TIMEOUT);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<g> ADAPTER = new com.squareup.wire.a<g>(o0.b(g.class), o.PROTO_3, new g(0)) { // from class: kc0.g.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public g d(int value) {
            return g.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: kc0.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkc0/g$b;", "", "<init>", "()V", "", "value", "Lkc0/g;", "a", "(I)Lkc0/g;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(int value) {
            if (value == 1202) {
                return g.STATUS_CODE_SERVER_ACK;
            }
            if (value == 1429) {
                return g.STATUS_CODE_TOO_MANY_REQUESTS;
            }
            if (value == 2202) {
                return g.STATUS_CODE_CLIENT_ACK;
            }
            if (value == 2500) {
                return g.STATUS_CODE_INTERNAL_ERROR;
            }
            if (value == 3200) {
                return g.STATUS_CODE_APPLICATION_OK;
            }
            if (value == 3202) {
                return g.STATUS_CODE_APPLICATION_ACK;
            }
            if (value == 3500) {
                return g.STATUS_CODE_APPLICATION_ERROR;
            }
            switch (value) {
                case 0:
                    return g.STATUS_CODE_OK;
                case 1:
                    return g.STATUS_CODE_INVALID_MESSAGE;
                case 2:
                    return g.STATUS_CODE_INVALID_TOKEN;
                case 3:
                    return g.STATUS_CODE_PUBLISH_FAILED;
                case 4:
                    return g.STATUS_CODE_PERMISSION_DENIED_NO_TOKEN;
                case 5:
                    return g.STATUS_CODE_PERMISSION_DENIED_EXPIRED_TOKEN;
                case 6:
                    return g.STATUS_CODE_PUBLISH_FAILED_NOT_CONNECTED;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private g(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final g fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<g> getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
