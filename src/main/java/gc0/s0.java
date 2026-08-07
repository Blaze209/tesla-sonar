package gc0;

import com.squareup.wire.ProtoAdapter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 gc0.s0, still in use, count: 1, list:
  (r0v0 gc0.s0) from 0x00df: CONSTRUCTOR 
  (wrap co0.d:0x00d7: INVOKE (wrap java.lang.Class:0x00d5: CONST_CLASS  A[WRAPPED] (LINE:214) gc0.s0.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:216))
  (wrap com.squareup.wire.o:0x00db: SGET  A[WRAPPED] (LINE:220) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 gc0.s0)
 A[MD:(co0.d<gc0.s0>, com.squareup.wire.o, gc0.s0):void (m), WRAPPED] (LINE:224) call: gc0.s0.a.<init>(co0.d, com.squareup.wire.o, gc0.s0):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lgc0/s0;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "TheaterSource_None", "TheaterSource_YouTube", "TheaterSource_TeslaTutorials", "TheaterSource_Netflix", "TheaterSource_Twitch", "TheaterSource_TikTok", "TheaterSource_Hulu", "TheaterSource_BiliBili", "TheaterSource_Disney", "TheaterSource_Douyin", "TheaterSource_MontyPython", "TheaterSource_Tencent", "TheaterSource_Youku", "TheaterSource_iQiyi", "TheaterSource_ThunderStone", "TheaterSource_MangoTV", "TheaterSource_Kuaishou", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s0 implements com.squareup.wire.p {
    TheaterSource_None(0),
    TheaterSource_YouTube(1),
    TheaterSource_TeslaTutorials(2),
    TheaterSource_Netflix(3),
    TheaterSource_Twitch(4),
    TheaterSource_TikTok(5),
    TheaterSource_Hulu(7),
    TheaterSource_BiliBili(10),
    TheaterSource_Disney(13),
    TheaterSource_Douyin(14),
    TheaterSource_MontyPython(19),
    TheaterSource_Tencent(28),
    TheaterSource_Youku(32),
    TheaterSource_iQiyi(33),
    TheaterSource_ThunderStone(34),
    TheaterSource_MangoTV(35),
    TheaterSource_Kuaishou(36);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<s0> ADAPTER = new com.squareup.wire.a<s0>(p013kotlin.jvm.internal.o0.b(s0.class), com.squareup.wire.o.PROTO_3, new s0(0)) { // from class: gc0.s0.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public s0 d(int value) {
            return s0.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: gc0.s0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgc0/s0$b;", "", "<init>", "()V", "", "value", "Lgc0/s0;", "a", "(I)Lgc0/s0;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s0 a(int value) {
            if (value == 0) {
                return s0.TheaterSource_None;
            }
            if (value == 1) {
                return s0.TheaterSource_YouTube;
            }
            if (value == 2) {
                return s0.TheaterSource_TeslaTutorials;
            }
            if (value == 3) {
                return s0.TheaterSource_Netflix;
            }
            if (value == 4) {
                return s0.TheaterSource_Twitch;
            }
            if (value == 5) {
                return s0.TheaterSource_TikTok;
            }
            if (value == 7) {
                return s0.TheaterSource_Hulu;
            }
            if (value == 10) {
                return s0.TheaterSource_BiliBili;
            }
            if (value == 19) {
                return s0.TheaterSource_MontyPython;
            }
            if (value == 28) {
                return s0.TheaterSource_Tencent;
            }
            if (value == 13) {
                return s0.TheaterSource_Disney;
            }
            if (value == 14) {
                return s0.TheaterSource_Douyin;
            }
            switch (value) {
                case 32:
                    return s0.TheaterSource_Youku;
                case 33:
                    return s0.TheaterSource_iQiyi;
                case 34:
                    return s0.TheaterSource_ThunderStone;
                case 35:
                    return s0.TheaterSource_MangoTV;
                case 36:
                    return s0.TheaterSource_Kuaishou;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private s0(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final s0 fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<s0> getEntries() {
        return $ENTRIES;
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
