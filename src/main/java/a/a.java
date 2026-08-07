package a;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.p;
import com.squareup.wire.q;
import ezvcard.property.Gender;
import java.util.ArrayList;
import jn0.e;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b#\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000315)B±\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J·\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b,\u0010%R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b1\u00108R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u00108R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b9\u0010>R\u001a\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010=\u001a\u0004\b:\u0010>R\u001a\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010=\u001a\u0004\b<\u0010>R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b5\u0010AR\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bB\u0010DR\u001a\u0010\u0015\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010DR\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\b?\u0010DR\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bE\u0010DR\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010DR\u001a\u0010\u0019\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010C\u001a\u0004\bH\u0010D¨\u0006I"}, d2 = {"La/a;", "Lcom/squareup/wire/f;", "", "", "version", "La/a$d;", "gear_state", "", "frame_seq_no", "", "vehicle_speed_mps", "accelerator_pedal_position", "steering_wheel_angle", "", "blinker_on_left", "blinker_on_right", "brake_applied", "La/a$a;", "autopilot_state", "", "latitude_deg", "longitude_deg", "heading_deg", "linear_acceleration_mps2_x", "linear_acceleration_mps2_y", "linear_acceleration_mps2_z", "Lokio/k;", "unknownFields", "<init>", "(ILa/a$d;JFFFZZZLa/a$a;DDDDDDLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ILa/a$d;JFFFZZZLa/a$a;DDDDDDLokio/k;)La/a;", "I", "r", "b", "La/a$d;", IntegerTokenConverter.CONVERTER_KEY, "()La/a$d;", "c", "J", "h", "()J", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "q", "()F", "e", "f", "p", "g", "Z", "()Z", "j", "La/a$a;", "()La/a$a;", "k", "D", "()D", "l", "o", "m", "n", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ProtoAdapter<a> f8r = new b(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(a.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 1)
    private final int version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "DashcamSei.SeiMetadata$Gear#ADAPTER", jsonName = "gearState", label = q.a.OMIT_IDENTITY, tag = 2)
    private final d gear_state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "frameSeqNo", label = q.a.OMIT_IDENTITY, tag = 3)
    private final long frame_seq_no;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "vehicleSpeedMps", label = q.a.OMIT_IDENTITY, tag = 4)
    private final float vehicle_speed_mps;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "acceleratorPedalPosition", label = q.a.OMIT_IDENTITY, tag = 5)
    private final float accelerator_pedal_position;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "steeringWheelAngle", label = q.a.OMIT_IDENTITY, tag = 6)
    private final float steering_wheel_angle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "blinkerOnLeft", label = q.a.OMIT_IDENTITY, tag = 7)
    private final boolean blinker_on_left;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "blinkerOnRight", label = q.a.OMIT_IDENTITY, tag = 8)
    private final boolean blinker_on_right;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "brakeApplied", label = q.a.OMIT_IDENTITY, tag = 9)
    private final boolean brake_applied;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "DashcamSei.SeiMetadata$AutopilotState#ADAPTER", jsonName = "autopilotState", label = q.a.OMIT_IDENTITY, tag = 10)
    private final EnumC0001a autopilot_state;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "latitudeDeg", label = q.a.OMIT_IDENTITY, tag = 11)
    private final double latitude_deg;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "longitudeDeg", label = q.a.OMIT_IDENTITY, tag = 12)
    private final double longitude_deg;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "headingDeg", label = q.a.OMIT_IDENTITY, tag = 13)
    private final double heading_deg;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "linearAccelerationMps2X", label = q.a.OMIT_IDENTITY, tag = 14)
    private final double linear_acceleration_mps2_x;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "linearAccelerationMps2Y", label = q.a.OMIT_IDENTITY, tag = 15)
    private final double linear_acceleration_mps2_y;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "linearAccelerationMps2Z", label = q.a.OMIT_IDENTITY, tag = 16)
    private final double linear_acceleration_mps2_z;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 a.a$a, still in use, count: 1, list:
      (r0v0 a.a$a) from 0x0046: CONSTRUCTOR 
      (wrap co0.d:0x003e: INVOKE (wrap java.lang.Class:0x003c: CONST_CLASS  A[WRAPPED] (LINE:61) a.a$a.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:63))
      (wrap com.squareup.wire.o:0x0042: SGET  A[WRAPPED] (LINE:67) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 a.a$a)
     A[MD:(co0.d<a.a$a>, com.squareup.wire.o, a.a$a):void (m), WRAPPED] (LINE:71) call: a.a.a.a.<init>(co0.d, com.squareup.wire.o, a.a$a):void type: CONSTRUCTOR
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
    /* JADX INFO: renamed from: a.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"La/a$a;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "NONE", "SELF_DRIVING", "AUTOSTEER", "TACC", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EnumC0001a implements p {
        NONE(0),
        SELF_DRIVING(1),
        AUTOSTEER(2),
        TACC(3);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<EnumC0001a> ADAPTER = new C0002a(o0.b(EnumC0001a.class), o.PROTO_3, new EnumC0001a(0));

        /* JADX INFO: renamed from: a.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"a/a$a$a", "Lcom/squareup/wire/a;", "La/a$a;", "", "value", "f", "(I)La/a$a;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0002a extends com.squareup.wire.a<EnumC0001a> {
            C0002a(co0.d<EnumC0001a> dVar, o oVar, EnumC0001a enumC0001a) {
                super(dVar, oVar, enumC0001a);
            }

            @Override // com.squareup.wire.a
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public EnumC0001a d(int value) {
                return EnumC0001a.INSTANCE.a(value);
            }
        }

        /* JADX INFO: renamed from: a.a$a$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"La/a$a$b;", "", "<init>", "()V", "", "value", "La/a$a;", "a", "(I)La/a$a;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EnumC0001a a(int value) {
                if (value == 0) {
                    return EnumC0001a.NONE;
                }
                if (value == 1) {
                    return EnumC0001a.SELF_DRIVING;
                }
                if (value == 2) {
                    return EnumC0001a.AUTOSTEER;
                }
                if (value != 3) {
                    return null;
                }
                return EnumC0001a.TACC;
            }

            private Companion() {
            }
        }

        static {
        }

        private EnumC0001a(int i11) {
            super(str, i);
            this.value = i11;
        }

        public static final EnumC0001a fromValue(int i11) {
            return INSTANCE.a(i11);
        }

        public static EnumEntries<EnumC0001a> getEntries() {
            return $ENTRIES;
        }

        public static EnumC0001a valueOf(String str) {
            return (EnumC0001a) Enum.valueOf(EnumC0001a.class, str);
        }

        public static EnumC0001a[] values() {
            return (EnumC0001a[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"a/a$b", "Lcom/squareup/wire/ProtoAdapter;", "La/a;", "value", "", "c", "(La/a;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;La/a;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)La/a;", DateTokenConverter.CONVERTER_KEY, "(La/a;)La/a;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends ProtoAdapter<a> {
        b(com.squareup.wire.b bVar, co0.d<a> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/DashcamSei.SeiMetadata", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a decode(k reader) {
            long j11;
            s.k(reader, "reader");
            d dVar = d.GEAR_PARK;
            EnumC0001a enumC0001a = EnumC0001a.NONE;
            long jD = reader.d();
            boolean zBooleanValue = false;
            boolean zBooleanValue2 = false;
            boolean zBooleanValue3 = false;
            float fFloatValue = 0.0f;
            float fFloatValue2 = 0.0f;
            float fFloatValue3 = 0.0f;
            double dDoubleValue = 0.0d;
            double dDoubleValue2 = 0.0d;
            double dDoubleValue3 = 0.0d;
            double dDoubleValue4 = 0.0d;
            double dDoubleValue5 = 0.0d;
            double dDoubleValue6 = 0.0d;
            EnumC0001a enumC0001aDecode = enumC0001a;
            long jLongValue = 0;
            d dVarDecode = dVar;
            int iIntValue = 0;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new a(iIntValue, dVarDecode, jLongValue, fFloatValue, fFloatValue2, fFloatValue3, zBooleanValue, zBooleanValue2, zBooleanValue3, enumC0001aDecode, dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, dDoubleValue6, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                        continue;
                    case 2:
                        j11 = jLongValue;
                        try {
                            dVarDecode = d.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                        }
                        break;
                    case 3:
                        jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
                        continue;
                    case 4:
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        continue;
                    case 5:
                        fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        continue;
                    case 6:
                        fFloatValue3 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        continue;
                    case 7:
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        continue;
                    case 8:
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        continue;
                    case 9:
                        zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        continue;
                    case 10:
                        try {
                            enumC0001aDecode = EnumC0001a.ADAPTER.decode(reader);
                            continue;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            j11 = jLongValue;
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                            jLongValue = j11;
                        }
                        break;
                    case 11:
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        continue;
                    case 12:
                        dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        continue;
                    case 13:
                        dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        continue;
                    case 14:
                        dDoubleValue4 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        continue;
                    case 15:
                        dDoubleValue5 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        continue;
                    case 16:
                        dDoubleValue6 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        continue;
                    default:
                        reader.m(iG);
                        j11 = jLongValue;
                        break;
                }
                jLongValue = j11;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, a value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getVersion() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.getVersion()));
            }
            if (value.getGear_state() != d.GEAR_PARK) {
                d.ADAPTER.encodeWithTag(writer, 2, value.getGear_state());
            }
            if (value.getFrame_seq_no() != 0) {
                ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getFrame_seq_no()));
            }
            if (value.getVehicle_speed_mps() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 4, Float.valueOf(value.getVehicle_speed_mps()));
            }
            if (value.getAccelerator_pedal_position() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 5, Float.valueOf(value.getAccelerator_pedal_position()));
            }
            if (value.getSteering_wheel_angle() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 6, Float.valueOf(value.getSteering_wheel_angle()));
            }
            if (value.getBlinker_on_left()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 7, Boolean.valueOf(value.getBlinker_on_left()));
            }
            if (value.getBlinker_on_right()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, Boolean.valueOf(value.getBlinker_on_right()));
            }
            if (value.getBrake_applied()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 9, Boolean.valueOf(value.getBrake_applied()));
            }
            if (value.getAutopilot_state() != EnumC0001a.NONE) {
                EnumC0001a.ADAPTER.encodeWithTag(writer, 10, value.getAutopilot_state());
            }
            if (value.getLatitude_deg() != 0.0d) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 11, Double.valueOf(value.getLatitude_deg()));
            }
            if (value.getLongitude_deg() != 0.0d) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 12, Double.valueOf(value.getLongitude_deg()));
            }
            if (value.getHeading_deg() != 0.0d) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 13, Double.valueOf(value.getHeading_deg()));
            }
            if (value.getLinear_acceleration_mps2_x() != 0.0d) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 14, Double.valueOf(value.getLinear_acceleration_mps2_x()));
            }
            if (value.getLinear_acceleration_mps2_y() != 0.0d) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 15, Double.valueOf(value.getLinear_acceleration_mps2_y()));
            }
            if (value.getLinear_acceleration_mps2_z() != 0.0d) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 16, Double.valueOf(value.getLinear_acceleration_mps2_z()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(a value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getVersion() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.getVersion()));
            }
            if (value.getGear_state() != d.GEAR_PARK) {
                iD += d.ADAPTER.encodedSizeWithTag(2, value.getGear_state());
            }
            if (value.getFrame_seq_no() != 0) {
                iD += ProtoAdapter.UINT64.encodedSizeWithTag(3, Long.valueOf(value.getFrame_seq_no()));
            }
            if (value.getVehicle_speed_mps() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(4, Float.valueOf(value.getVehicle_speed_mps()));
            }
            if (value.getAccelerator_pedal_position() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(5, Float.valueOf(value.getAccelerator_pedal_position()));
            }
            if (value.getSteering_wheel_angle() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(6, Float.valueOf(value.getSteering_wheel_angle()));
            }
            if (value.getBlinker_on_left()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getBlinker_on_left()));
            }
            if (value.getBlinker_on_right()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getBlinker_on_right()));
            }
            if (value.getBrake_applied()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(9, Boolean.valueOf(value.getBrake_applied()));
            }
            if (value.getAutopilot_state() != EnumC0001a.NONE) {
                iD += EnumC0001a.ADAPTER.encodedSizeWithTag(10, value.getAutopilot_state());
            }
            if (value.getLatitude_deg() != 0.0d) {
                iD += ProtoAdapter.DOUBLE.encodedSizeWithTag(11, Double.valueOf(value.getLatitude_deg()));
            }
            if (value.getLongitude_deg() != 0.0d) {
                iD += ProtoAdapter.DOUBLE.encodedSizeWithTag(12, Double.valueOf(value.getLongitude_deg()));
            }
            if (value.getHeading_deg() != 0.0d) {
                iD += ProtoAdapter.DOUBLE.encodedSizeWithTag(13, Double.valueOf(value.getHeading_deg()));
            }
            if (value.getLinear_acceleration_mps2_x() != 0.0d) {
                iD += ProtoAdapter.DOUBLE.encodedSizeWithTag(14, Double.valueOf(value.getLinear_acceleration_mps2_x()));
            }
            if (value.getLinear_acceleration_mps2_y() != 0.0d) {
                iD += ProtoAdapter.DOUBLE.encodedSizeWithTag(15, Double.valueOf(value.getLinear_acceleration_mps2_y()));
            }
            return value.getLinear_acceleration_mps2_z() == 0.0d ? iD : iD + ProtoAdapter.DOUBLE.encodedSizeWithTag(16, Double.valueOf(value.getLinear_acceleration_mps2_z()));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a redact(a value) {
            s.k(value, "value");
            return a.b(value, 0, null, 0L, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, false, false, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, okio.k.f97943e, 65535, null);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 a.a$d, still in use, count: 1, list:
      (r0v0 a.a$d) from 0x0046: CONSTRUCTOR 
      (wrap co0.d:0x003e: INVOKE (wrap java.lang.Class:0x003c: CONST_CLASS  A[WRAPPED] (LINE:61) a.a$d.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:63))
      (wrap com.squareup.wire.o:0x0042: SGET  A[WRAPPED] (LINE:67) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 a.a$d)
     A[MD:(co0.d<a.a$d>, com.squareup.wire.o, a.a$d):void (m), WRAPPED] (LINE:71) call: a.a.d.a.<init>(co0.d, com.squareup.wire.o, a.a$d):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"La/a$d;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "GEAR_PARK", "GEAR_DRIVE", "GEAR_REVERSE", "GEAR_NEUTRAL", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements p {
        GEAR_PARK(0),
        GEAR_DRIVE(1),
        GEAR_REVERSE(2),
        GEAR_NEUTRAL(3);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<d> ADAPTER = new C0003a(o0.b(d.class), o.PROTO_3, new d(0));

        /* JADX INFO: renamed from: a.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"a/a$d$a", "Lcom/squareup/wire/a;", "La/a$d;", "", "value", "f", "(I)La/a$d;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0003a extends com.squareup.wire.a<d> {
            C0003a(co0.d<d> dVar, o oVar, d dVar2) {
                super(dVar, oVar, dVar2);
            }

            @Override // com.squareup.wire.a
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public d d(int value) {
                return d.INSTANCE.a(value);
            }
        }

        /* JADX INFO: renamed from: a.a$d$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"La/a$d$b;", "", "<init>", "()V", "", "value", "La/a$d;", "a", "(I)La/a$d;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(int value) {
                if (value == 0) {
                    return d.GEAR_PARK;
                }
                if (value == 1) {
                    return d.GEAR_DRIVE;
                }
                if (value == 2) {
                    return d.GEAR_REVERSE;
                }
                if (value != 3) {
                    return null;
                }
                return d.GEAR_NEUTRAL;
            }

            private Companion() {
            }
        }

        static {
        }

        private d(int i11) {
            super(str, i);
            this.value = i11;
        }

        public static final d fromValue(int i11) {
            return INSTANCE.a(i11);
        }

        public static EnumEntries<d> getEntries() {
            return $ENTRIES;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    public a() {
        this(0, null, 0L, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, false, false, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 131071, null);
    }

    public static /* synthetic */ a b(a aVar, int i11, d dVar, long j11, float f11, float f12, float f13, boolean z11, boolean z12, boolean z13, EnumC0001a enumC0001a, double d11, double d12, double d13, double d14, double d15, double d16, okio.k kVar, int i12, Object obj) {
        return aVar.a((i12 & 1) != 0 ? aVar.version : i11, (i12 & 2) != 0 ? aVar.gear_state : dVar, (i12 & 4) != 0 ? aVar.frame_seq_no : j11, (i12 & 8) != 0 ? aVar.vehicle_speed_mps : f11, (i12 & 16) != 0 ? aVar.accelerator_pedal_position : f12, (i12 & 32) != 0 ? aVar.steering_wheel_angle : f13, (i12 & 64) != 0 ? aVar.blinker_on_left : z11, (i12 & 128) != 0 ? aVar.blinker_on_right : z12, (i12 & 256) != 0 ? aVar.brake_applied : z13, (i12 & 512) != 0 ? aVar.autopilot_state : enumC0001a, (i12 & 1024) != 0 ? aVar.latitude_deg : d11, (i12 & 2048) != 0 ? aVar.longitude_deg : d12, (i12 & 4096) != 0 ? aVar.heading_deg : d13, (i12 & PKIFailureInfo.certRevoked) != 0 ? aVar.linear_acceleration_mps2_x : d14, (i12 & 16384) != 0 ? aVar.linear_acceleration_mps2_y : d15, (i12 & 32768) != 0 ? aVar.linear_acceleration_mps2_z : d16, (i12 & 65536) != 0 ? aVar.unknownFields() : kVar);
    }

    public final a a(int version, d gear_state, long frame_seq_no, float vehicle_speed_mps, float accelerator_pedal_position, float steering_wheel_angle, boolean blinker_on_left, boolean blinker_on_right, boolean brake_applied, EnumC0001a autopilot_state, double latitude_deg, double longitude_deg, double heading_deg, double linear_acceleration_mps2_x, double linear_acceleration_mps2_y, double linear_acceleration_mps2_z, okio.k unknownFields) {
        s.k(gear_state, "gear_state");
        s.k(autopilot_state, "autopilot_state");
        s.k(unknownFields, "unknownFields");
        return new a(version, gear_state, frame_seq_no, vehicle_speed_mps, accelerator_pedal_position, steering_wheel_angle, blinker_on_left, blinker_on_right, brake_applied, autopilot_state, latitude_deg, longitude_deg, heading_deg, linear_acceleration_mps2_x, linear_acceleration_mps2_y, linear_acceleration_mps2_z, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getAccelerator_pedal_position() {
        return this.accelerator_pedal_position;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC0001a getAutopilot_state() {
        return this.autopilot_state;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getBlinker_on_left() {
        return this.blinker_on_left;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return s.f(unknownFields(), aVar.unknownFields()) && this.version == aVar.version && this.gear_state == aVar.gear_state && this.frame_seq_no == aVar.frame_seq_no && this.vehicle_speed_mps == aVar.vehicle_speed_mps && this.accelerator_pedal_position == aVar.accelerator_pedal_position && this.steering_wheel_angle == aVar.steering_wheel_angle && this.blinker_on_left == aVar.blinker_on_left && this.blinker_on_right == aVar.blinker_on_right && this.brake_applied == aVar.brake_applied && this.autopilot_state == aVar.autopilot_state && this.latitude_deg == aVar.latitude_deg && this.longitude_deg == aVar.longitude_deg && this.heading_deg == aVar.heading_deg && this.linear_acceleration_mps2_x == aVar.linear_acceleration_mps2_x && this.linear_acceleration_mps2_y == aVar.linear_acceleration_mps2_y && this.linear_acceleration_mps2_z == aVar.linear_acceleration_mps2_z;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getBlinker_on_right() {
        return this.blinker_on_right;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getBrake_applied() {
        return this.brake_applied;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getFrame_seq_no() {
        return this.frame_seq_no;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.version)) * 37) + this.gear_state.hashCode()) * 37) + Long.hashCode(this.frame_seq_no)) * 37) + Float.hashCode(this.vehicle_speed_mps)) * 37) + Float.hashCode(this.accelerator_pedal_position)) * 37) + Float.hashCode(this.steering_wheel_angle)) * 37) + Boolean.hashCode(this.blinker_on_left)) * 37) + Boolean.hashCode(this.blinker_on_right)) * 37) + Boolean.hashCode(this.brake_applied)) * 37) + this.autopilot_state.hashCode()) * 37) + Double.hashCode(this.latitude_deg)) * 37) + Double.hashCode(this.longitude_deg)) * 37) + Double.hashCode(this.heading_deg)) * 37) + Double.hashCode(this.linear_acceleration_mps2_x)) * 37) + Double.hashCode(this.linear_acceleration_mps2_y)) * 37) + Double.hashCode(this.linear_acceleration_mps2_z);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final d getGear_state() {
        return this.gear_state;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final double getHeading_deg() {
        return this.heading_deg;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final double getLatitude_deg() {
        return this.latitude_deg;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final double getLinear_acceleration_mps2_x() {
        return this.linear_acceleration_mps2_x;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final double getLinear_acceleration_mps2_y() {
        return this.linear_acceleration_mps2_y;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final double getLinear_acceleration_mps2_z() {
        return this.linear_acceleration_mps2_z;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m0newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final double getLongitude_deg() {
        return this.longitude_deg;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final float getSteering_wheel_angle() {
        return this.steering_wheel_angle;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final float getVehicle_speed_mps() {
        return this.vehicle_speed_mps;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("version=" + this.version);
        arrayList.add("gear_state=" + this.gear_state);
        arrayList.add("frame_seq_no=" + this.frame_seq_no);
        arrayList.add("vehicle_speed_mps=" + this.vehicle_speed_mps);
        arrayList.add("accelerator_pedal_position=" + this.accelerator_pedal_position);
        arrayList.add("steering_wheel_angle=" + this.steering_wheel_angle);
        arrayList.add("blinker_on_left=" + this.blinker_on_left);
        arrayList.add("blinker_on_right=" + this.blinker_on_right);
        arrayList.add("brake_applied=" + this.brake_applied);
        arrayList.add("autopilot_state=" + this.autopilot_state);
        arrayList.add("latitude_deg=" + this.latitude_deg);
        arrayList.add("longitude_deg=" + this.longitude_deg);
        arrayList.add("heading_deg=" + this.heading_deg);
        arrayList.add("linear_acceleration_mps2_x=" + this.linear_acceleration_mps2_x);
        arrayList.add("linear_acceleration_mps2_y=" + this.linear_acceleration_mps2_y);
        arrayList.add("linear_acceleration_mps2_z=" + this.linear_acceleration_mps2_z);
        return v.y0(arrayList, ", ", "SeiMetadata{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ a(int i11, d dVar, long j11, float f11, float f12, float f13, boolean z11, boolean z12, boolean z13, EnumC0001a enumC0001a, double d11, double d12, double d13, double d14, double d15, double d16, okio.k kVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? d.GEAR_PARK : dVar, (i12 & 4) != 0 ? 0L : j11, (i12 & 8) != 0 ? 0.0f : f11, (i12 & 16) != 0 ? 0.0f : f12, (i12 & 32) == 0 ? f13 : BitmapDescriptorFactory.HUE_RED, (i12 & 64) != 0 ? false : z11, (i12 & 128) != 0 ? false : z12, (i12 & 256) == 0 ? z13 : false, (i12 & 512) != 0 ? EnumC0001a.NONE : enumC0001a, (i12 & 1024) != 0 ? 0.0d : d11, (i12 & 2048) != 0 ? 0.0d : d12, (i12 & 4096) != 0 ? 0.0d : d13, (i12 & PKIFailureInfo.certRevoked) != 0 ? 0.0d : d14, (i12 & 16384) != 0 ? 0.0d : d15, (32768 & i12) == 0 ? d16 : 0.0d, (i12 & 65536) != 0 ? okio.k.f97943e : kVar);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m0newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i11, d gear_state, long j11, float f11, float f12, float f13, boolean z11, boolean z12, boolean z13, EnumC0001a autopilot_state, double d11, double d12, double d13, double d14, double d15, double d16, okio.k unknownFields) {
        super(f8r, unknownFields);
        s.k(gear_state, "gear_state");
        s.k(autopilot_state, "autopilot_state");
        s.k(unknownFields, "unknownFields");
        this.version = i11;
        this.gear_state = gear_state;
        this.frame_seq_no = j11;
        this.vehicle_speed_mps = f11;
        this.accelerator_pedal_position = f12;
        this.steering_wheel_angle = f13;
        this.blinker_on_left = z11;
        this.blinker_on_right = z12;
        this.brake_applied = z13;
        this.autopilot_state = autopilot_state;
        this.latitude_deg = d11;
        this.longitude_deg = d12;
        this.heading_deg = d13;
        this.linear_acceleration_mps2_x = d14;
        this.linear_acceleration_mps2_y = d15;
        this.linear_acceleration_mps2_z = d16;
    }
}
