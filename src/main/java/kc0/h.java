package kc0;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 kc0.h, still in use, count: 1, list:
  (r0v0 kc0.h) from 0x0050: CONSTRUCTOR 
  (wrap co0.d:0x0048: INVOKE (wrap java.lang.Class:0x0046: CONST_CLASS  A[WRAPPED] (LINE:71) kc0.h.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:73))
  (wrap com.squareup.wire.o:0x004c: SGET  A[WRAPPED] (LINE:77) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 kc0.h)
 A[MD:(co0.d<kc0.h>, com.squareup.wire.o, kc0.h):void (m), WRAPPED] (LINE:81) call: kc0.h.a.<init>(co0.d, com.squareup.wire.o, kc0.h):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lkc0/h;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "TopicTypeNormal", "TopicTypePubSub", "TopicTypeEphemeral", "TopicTypeConsumerGroup", "TopicTypeStream", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements p {
    TopicTypeNormal(0),
    TopicTypePubSub(1),
    TopicTypeEphemeral(2),
    TopicTypeConsumerGroup(3),
    TopicTypeStream(4);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<h> ADAPTER = new com.squareup.wire.a<h>(o0.b(h.class), o.PROTO_3, new h(0)) { // from class: kc0.h.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public h d(int value) {
            return h.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: kc0.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkc0/h$b;", "", "<init>", "()V", "", "value", "Lkc0/h;", "a", "(I)Lkc0/h;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(int value) {
            if (value == 0) {
                return h.TopicTypeNormal;
            }
            if (value == 1) {
                return h.TopicTypePubSub;
            }
            if (value == 2) {
                return h.TopicTypeEphemeral;
            }
            if (value == 3) {
                return h.TopicTypeConsumerGroup;
            }
            if (value != 4) {
                return null;
            }
            return h.TopicTypeStream;
        }

        private Companion() {
        }
    }

    static {
    }

    private h(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final h fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<h> getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
