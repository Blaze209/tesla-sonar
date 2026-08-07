package oc0;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 oc0.a, still in use, count: 1, list:
  (r0v0 oc0.a) from 0x0156: CONSTRUCTOR 
  (wrap co0.d:0x014e: INVOKE (wrap java.lang.Class:0x014c: CONST_CLASS  A[WRAPPED] (LINE:333) oc0.a.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:335))
  (wrap com.squareup.wire.o:0x0152: SGET  A[WRAPPED] (LINE:339) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 oc0.a)
 A[MD:(co0.d<oc0.a>, com.squareup.wire.o, oc0.a):void (m), WRAPPED] (LINE:343) call: oc0.a.a.<init>(co0.d, com.squareup.wire.o, oc0.a):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b%\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006("}, d2 = {"Loc0/a;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "NOTIFICATION_ACTION_CLOSE_REAR_TRUNK", "NOTIFICATION_ACTION_CLIMATE_KEEPER_CAMP_MODE", "NOTIFICATION_ACTION_CLIMATE_KEEPER_CAMP_MODE_OVERRIDE", "NOTIFICATION_ACTION_CLIMATE_KEEPER_DOG_MODE", "NOTIFICATION_ACTION_CLIMATE_KEEPER_DOG_MODE_OVERRIDE", "NOTIFICATION_ACTION_CLIMATE_ON", "NOTIFICATION_ACTION_CLIMATE_ON_OVERRIDE", "NOTIFICATION_ACTION_CLIMATE_OFF", "NOTIFICATION_ACTION_ENABLE_SENTRY", "NOTIFICATION_ACTION_DISABLE_SENTRY", "NOTIFICATION_ACTION_STOP_CHARGING", "NOTIFICATION_ACTION_START_CHARGING", "NOTIFICATION_ACTION_CLOSE_SUNROOF", "NOTIFICATION_ACTION_CLOSE_FRONT_DRIVER_DOOR", "NOTIFICATION_ACTION_CLOSE_FRONT_PASSENGER_DOOR", "NOTIFICATION_ACTION_CLOSE_REAR_DRIVER_DOOR", "NOTIFICATION_ACTION_CLOSE_REAR_PASSENGER_DOOR", "NOTIFICATION_ACTION_CLOSE_ALL_DOORS", "NOTIFICATION_ACTION_CLOSE_FRONT_DRIVER_WINDOW", "NOTIFICATION_ACTION_CLOSE_FRONT_PASSENGER_WINDOW", "NOTIFICATION_ACTION_CLOSE_REAR_DRIVER_WINDOW", "NOTIFICATION_ACTION_CLOSE_REAR_PASSENGER_WINDOW", "NOTIFICATION_ACTION_CLOSE_ALL_WINDOWS", "NOTIFICATION_ACTION_UPDATE_SOFTWARE", "NOTIFICATION_ACTION_CANCEL_SOFTWARE", "NOTIFICATION_ACTION_DOOR_LOCK", "NOTIFICATION_ACTION_CLOSE_TONNEAU", "NOTIFICATION_ACTION_CLOSE_FRONT_TRUNK", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements p {
    NOTIFICATION_ACTION_CLOSE_REAR_TRUNK(0),
    NOTIFICATION_ACTION_CLIMATE_KEEPER_CAMP_MODE(1),
    NOTIFICATION_ACTION_CLIMATE_KEEPER_CAMP_MODE_OVERRIDE(2),
    NOTIFICATION_ACTION_CLIMATE_KEEPER_DOG_MODE(3),
    NOTIFICATION_ACTION_CLIMATE_KEEPER_DOG_MODE_OVERRIDE(4),
    NOTIFICATION_ACTION_CLIMATE_ON(5),
    NOTIFICATION_ACTION_CLIMATE_ON_OVERRIDE(6),
    NOTIFICATION_ACTION_CLIMATE_OFF(7),
    NOTIFICATION_ACTION_ENABLE_SENTRY(8),
    NOTIFICATION_ACTION_DISABLE_SENTRY(9),
    NOTIFICATION_ACTION_STOP_CHARGING(10),
    NOTIFICATION_ACTION_START_CHARGING(11),
    NOTIFICATION_ACTION_CLOSE_SUNROOF(12),
    NOTIFICATION_ACTION_CLOSE_FRONT_DRIVER_DOOR(13),
    NOTIFICATION_ACTION_CLOSE_FRONT_PASSENGER_DOOR(14),
    NOTIFICATION_ACTION_CLOSE_REAR_DRIVER_DOOR(15),
    NOTIFICATION_ACTION_CLOSE_REAR_PASSENGER_DOOR(16),
    NOTIFICATION_ACTION_CLOSE_ALL_DOORS(17),
    NOTIFICATION_ACTION_CLOSE_FRONT_DRIVER_WINDOW(18),
    NOTIFICATION_ACTION_CLOSE_FRONT_PASSENGER_WINDOW(19),
    NOTIFICATION_ACTION_CLOSE_REAR_DRIVER_WINDOW(20),
    NOTIFICATION_ACTION_CLOSE_REAR_PASSENGER_WINDOW(21),
    NOTIFICATION_ACTION_CLOSE_ALL_WINDOWS(22),
    NOTIFICATION_ACTION_UPDATE_SOFTWARE(23),
    NOTIFICATION_ACTION_CANCEL_SOFTWARE(24),
    NOTIFICATION_ACTION_DOOR_LOCK(25),
    NOTIFICATION_ACTION_CLOSE_TONNEAU(26),
    NOTIFICATION_ACTION_CLOSE_FRONT_TRUNK(27);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<a> ADAPTER = new com.squareup.wire.a<a>(o0.b(a.class), o.PROTO_3, new a(0)) { // from class: oc0.a.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a d(int value) {
            return a.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: oc0.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Loc0/a$b;", "", "<init>", "()V", "", "value", "Loc0/a;", "a", "(I)Loc0/a;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(int value) {
            switch (value) {
                case 0:
                    return a.NOTIFICATION_ACTION_CLOSE_REAR_TRUNK;
                case 1:
                    return a.NOTIFICATION_ACTION_CLIMATE_KEEPER_CAMP_MODE;
                case 2:
                    return a.NOTIFICATION_ACTION_CLIMATE_KEEPER_CAMP_MODE_OVERRIDE;
                case 3:
                    return a.NOTIFICATION_ACTION_CLIMATE_KEEPER_DOG_MODE;
                case 4:
                    return a.NOTIFICATION_ACTION_CLIMATE_KEEPER_DOG_MODE_OVERRIDE;
                case 5:
                    return a.NOTIFICATION_ACTION_CLIMATE_ON;
                case 6:
                    return a.NOTIFICATION_ACTION_CLIMATE_ON_OVERRIDE;
                case 7:
                    return a.NOTIFICATION_ACTION_CLIMATE_OFF;
                case 8:
                    return a.NOTIFICATION_ACTION_ENABLE_SENTRY;
                case 9:
                    return a.NOTIFICATION_ACTION_DISABLE_SENTRY;
                case 10:
                    return a.NOTIFICATION_ACTION_STOP_CHARGING;
                case 11:
                    return a.NOTIFICATION_ACTION_START_CHARGING;
                case 12:
                    return a.NOTIFICATION_ACTION_CLOSE_SUNROOF;
                case 13:
                    return a.NOTIFICATION_ACTION_CLOSE_FRONT_DRIVER_DOOR;
                case 14:
                    return a.NOTIFICATION_ACTION_CLOSE_FRONT_PASSENGER_DOOR;
                case 15:
                    return a.NOTIFICATION_ACTION_CLOSE_REAR_DRIVER_DOOR;
                case 16:
                    return a.NOTIFICATION_ACTION_CLOSE_REAR_PASSENGER_DOOR;
                case 17:
                    return a.NOTIFICATION_ACTION_CLOSE_ALL_DOORS;
                case 18:
                    return a.NOTIFICATION_ACTION_CLOSE_FRONT_DRIVER_WINDOW;
                case 19:
                    return a.NOTIFICATION_ACTION_CLOSE_FRONT_PASSENGER_WINDOW;
                case 20:
                    return a.NOTIFICATION_ACTION_CLOSE_REAR_DRIVER_WINDOW;
                case 21:
                    return a.NOTIFICATION_ACTION_CLOSE_REAR_PASSENGER_WINDOW;
                case 22:
                    return a.NOTIFICATION_ACTION_CLOSE_ALL_WINDOWS;
                case 23:
                    return a.NOTIFICATION_ACTION_UPDATE_SOFTWARE;
                case 24:
                    return a.NOTIFICATION_ACTION_CANCEL_SOFTWARE;
                case 25:
                    return a.NOTIFICATION_ACTION_DOOR_LOCK;
                case 26:
                    return a.NOTIFICATION_ACTION_CLOSE_TONNEAU;
                case 27:
                    return a.NOTIFICATION_ACTION_CLOSE_FRONT_TRUNK;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private a(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final a fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<a> getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
