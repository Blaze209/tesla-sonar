package vc0;

import com.squareup.wire.ProtoAdapter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 vc0.h1, still in use, count: 1, list:
  (r0v0 vc0.h1) from 0x00f2: CONSTRUCTOR 
  (wrap co0.d:0x00ea: INVOKE (wrap java.lang.Class:0x00e8: CONST_CLASS  A[WRAPPED] (LINE:233) vc0.h1.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:235))
  (wrap com.squareup.wire.o:0x00ee: SGET  A[WRAPPED] (LINE:239) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 vc0.h1)
 A[MD:(co0.d<vc0.h1>, com.squareup.wire.o, vc0.h1):void (m), WRAPPED] (LINE:243) call: vc0.h1.a.<init>(co0.d, com.squareup.wire.o, vc0.h1):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lvc0/h1;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "KEY_FORM_FACTOR_UNKNOWN", "KEY_FORM_FACTOR_NFC_CARD", "KEY_FORM_FACTOR_3_BUTTON_BLE_CAR_KEYFOB", "KEY_FORM_FACTOR_BLE_DEVICE", "KEY_FORM_FACTOR_NFC_DEVICE", "KEY_FORM_FACTOR_BLE_AND_NFC_DEVICE", "KEY_FORM_FACTOR_IOS_DEVICE", "KEY_FORM_FACTOR_ANDROID_DEVICE", "KEY_FORM_FACTOR_3_BUTTON_BLE_CAR_KEYFOB_P60", "KEY_FORM_FACTOR_CLOUD_KEY", "KEY_FORM_FACTOR_3_BUTTON_GEN2_CAR_KEYFOB_P60", "KEY_FORM_FACTOR_5_BUTTON_GEN2_CAR_KEYFOB_P60", "KEY_FORM_FACTOR_3_BUTTON_GEN2_CAR_KEYFOB_P60_V2", "KEY_FORM_FACTOR_3_BUTTON_GEN2_CAR_KEYFOB_P60_V3", "KEY_FORM_FACTOR_NFC_CARD_P71", "KEY_FORM_FACTOR_NFC_CARD_METAL_CARD", "KEY_FORM_FACTOR_NFC_CARD_PLASTIC_CARD", "KEY_FORM_FACTOR_APPLE_WATCH", "KEY_FORM_FACTOR_NFC_CARD_WD_PLASTIC_CARD", "KEY_FORM_FACTOR_HARMONY_OS_NEXT_DEVICE", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h1 implements com.squareup.wire.p {
    KEY_FORM_FACTOR_UNKNOWN(0),
    KEY_FORM_FACTOR_NFC_CARD(1),
    KEY_FORM_FACTOR_3_BUTTON_BLE_CAR_KEYFOB(2),
    KEY_FORM_FACTOR_BLE_DEVICE(3),
    KEY_FORM_FACTOR_NFC_DEVICE(4),
    KEY_FORM_FACTOR_BLE_AND_NFC_DEVICE(5),
    KEY_FORM_FACTOR_IOS_DEVICE(6),
    KEY_FORM_FACTOR_ANDROID_DEVICE(7),
    KEY_FORM_FACTOR_3_BUTTON_BLE_CAR_KEYFOB_P60(8),
    KEY_FORM_FACTOR_CLOUD_KEY(9),
    KEY_FORM_FACTOR_3_BUTTON_GEN2_CAR_KEYFOB_P60(10),
    KEY_FORM_FACTOR_5_BUTTON_GEN2_CAR_KEYFOB_P60(11),
    KEY_FORM_FACTOR_3_BUTTON_GEN2_CAR_KEYFOB_P60_V2(12),
    KEY_FORM_FACTOR_3_BUTTON_GEN2_CAR_KEYFOB_P60_V3(13),
    KEY_FORM_FACTOR_NFC_CARD_P71(14),
    KEY_FORM_FACTOR_NFC_CARD_METAL_CARD(15),
    KEY_FORM_FACTOR_NFC_CARD_PLASTIC_CARD(16),
    KEY_FORM_FACTOR_APPLE_WATCH(17),
    KEY_FORM_FACTOR_NFC_CARD_WD_PLASTIC_CARD(18),
    KEY_FORM_FACTOR_HARMONY_OS_NEXT_DEVICE(19);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<h1> ADAPTER = new com.squareup.wire.a<h1>(p013kotlin.jvm.internal.o0.b(h1.class), com.squareup.wire.o.PROTO_3, new h1(0)) { // from class: vc0.h1.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public h1 d(int value) {
            return h1.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: vc0.h1$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvc0/h1$b;", "", "<init>", "()V", "", "value", "Lvc0/h1;", "a", "(I)Lvc0/h1;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h1 a(int value) {
            switch (value) {
                case 0:
                    return h1.KEY_FORM_FACTOR_UNKNOWN;
                case 1:
                    return h1.KEY_FORM_FACTOR_NFC_CARD;
                case 2:
                    return h1.KEY_FORM_FACTOR_3_BUTTON_BLE_CAR_KEYFOB;
                case 3:
                    return h1.KEY_FORM_FACTOR_BLE_DEVICE;
                case 4:
                    return h1.KEY_FORM_FACTOR_NFC_DEVICE;
                case 5:
                    return h1.KEY_FORM_FACTOR_BLE_AND_NFC_DEVICE;
                case 6:
                    return h1.KEY_FORM_FACTOR_IOS_DEVICE;
                case 7:
                    return h1.KEY_FORM_FACTOR_ANDROID_DEVICE;
                case 8:
                    return h1.KEY_FORM_FACTOR_3_BUTTON_BLE_CAR_KEYFOB_P60;
                case 9:
                    return h1.KEY_FORM_FACTOR_CLOUD_KEY;
                case 10:
                    return h1.KEY_FORM_FACTOR_3_BUTTON_GEN2_CAR_KEYFOB_P60;
                case 11:
                    return h1.KEY_FORM_FACTOR_5_BUTTON_GEN2_CAR_KEYFOB_P60;
                case 12:
                    return h1.KEY_FORM_FACTOR_3_BUTTON_GEN2_CAR_KEYFOB_P60_V2;
                case 13:
                    return h1.KEY_FORM_FACTOR_3_BUTTON_GEN2_CAR_KEYFOB_P60_V3;
                case 14:
                    return h1.KEY_FORM_FACTOR_NFC_CARD_P71;
                case 15:
                    return h1.KEY_FORM_FACTOR_NFC_CARD_METAL_CARD;
                case 16:
                    return h1.KEY_FORM_FACTOR_NFC_CARD_PLASTIC_CARD;
                case 17:
                    return h1.KEY_FORM_FACTOR_APPLE_WATCH;
                case 18:
                    return h1.KEY_FORM_FACTOR_NFC_CARD_WD_PLASTIC_CARD;
                case 19:
                    return h1.KEY_FORM_FACTOR_HARMONY_OS_NEXT_DEVICE;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private h1(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final h1 fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<h1> getEntries() {
        return $ENTRIES;
    }

    public static h1 valueOf(String str) {
        return (h1) Enum.valueOf(h1.class, str);
    }

    public static h1[] values() {
        return (h1[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
