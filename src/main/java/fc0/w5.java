package fc0;

import com.squareup.wire.ProtoAdapter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 fc0.w5, still in use, count: 1, list:
  (r0v0 fc0.w5) from 0x012f: CONSTRUCTOR 
  (wrap co0.d:0x0127: INVOKE (wrap java.lang.Class:0x0125: CONST_CLASS  A[WRAPPED] (LINE:294) fc0.w5.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:296))
  (wrap com.squareup.wire.o:0x012b: SGET  A[WRAPPED] (LINE:300) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 fc0.w5)
 A[MD:(co0.d<fc0.w5>, com.squareup.wire.o, fc0.w5):void (m), WRAPPED] (LINE:304) call: fc0.w5.a.<init>(co0.d, com.squareup.wire.o, fc0.w5):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\"\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006%"}, d2 = {"Lfc0/w5;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "NOTHING", "gui_settings", "charge_state", "climate_state", "drive_state", "vehicle_state", "legacy_vehicle_state_media_info", "vehicle_config", "location_state", "closures_state", "parked_accessory_state", "charge_schedule_state", "preconditioning_schedule_state", "media_state", "media_detail_state", "tire_pressure_state", "vehicle_detail_state", "software_update_state", "parental_controls_state", "alert_state", "light_show_state", "vehicle_image_state", "soh_state", "suspension_state", "child_presence_detection_state", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w5 implements com.squareup.wire.p {
    NOTHING(0),
    gui_settings(2),
    charge_state(3),
    climate_state(4),
    drive_state(5),
    vehicle_state(6),
    legacy_vehicle_state_media_info(6072),
    vehicle_config(7),
    location_state(8),
    closures_state(9),
    parked_accessory_state(10),
    charge_schedule_state(11),
    preconditioning_schedule_state(12),
    media_state(13),
    media_detail_state(14),
    tire_pressure_state(15),
    vehicle_detail_state(16),
    software_update_state(17),
    parental_controls_state(18),
    alert_state(19),
    light_show_state(20),
    vehicle_image_state(21),
    soh_state(22),
    suspension_state(23),
    child_presence_detection_state(24);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<w5> ADAPTER = new com.squareup.wire.a<w5>(p013kotlin.jvm.internal.o0.b(w5.class), com.squareup.wire.o.PROTO_3, new w5(0)) { // from class: fc0.w5.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public w5 d(int value) {
            return w5.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: fc0.w5$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfc0/w5$b;", "", "<init>", "()V", "", "value", "Lfc0/w5;", "a", "(I)Lfc0/w5;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w5 a(int value) {
            if (value == 0) {
                return w5.NOTHING;
            }
            if (value == 6072) {
                return w5.legacy_vehicle_state_media_info;
            }
            switch (value) {
                case 2:
                    return w5.gui_settings;
                case 3:
                    return w5.charge_state;
                case 4:
                    return w5.climate_state;
                case 5:
                    return w5.drive_state;
                case 6:
                    return w5.vehicle_state;
                case 7:
                    return w5.vehicle_config;
                case 8:
                    return w5.location_state;
                case 9:
                    return w5.closures_state;
                case 10:
                    return w5.parked_accessory_state;
                case 11:
                    return w5.charge_schedule_state;
                case 12:
                    return w5.preconditioning_schedule_state;
                case 13:
                    return w5.media_state;
                case 14:
                    return w5.media_detail_state;
                case 15:
                    return w5.tire_pressure_state;
                case 16:
                    return w5.vehicle_detail_state;
                case 17:
                    return w5.software_update_state;
                case 18:
                    return w5.parental_controls_state;
                case 19:
                    return w5.alert_state;
                case 20:
                    return w5.light_show_state;
                case 21:
                    return w5.vehicle_image_state;
                case 22:
                    return w5.soh_state;
                case 23:
                    return w5.suspension_state;
                case 24:
                    return w5.child_presence_detection_state;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private w5(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final w5 fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<w5> getEntries() {
        return $ENTRIES;
    }

    public static w5 valueOf(String str) {
        return (w5) Enum.valueOf(w5.class, str);
    }

    public static w5[] values() {
        return (w5[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
