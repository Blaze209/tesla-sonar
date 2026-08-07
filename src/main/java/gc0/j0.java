package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B¡\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J§\u0001\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b.\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b/\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u00103\u001a\u0004\b1\u00104R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b,\u0010%R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b5\u0010%R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b*\u0010%¨\u00066"}, d2 = {"Lgc0/j0;", "Lcom/squareup/wire/f;", "", "", "speed_limit_enabled", "", "max_limit_mph", "min_limit_mph", "current_limit_mph", "chill_acceleration_enabled", "require_safety_settings_enabled", "curfew_enabled", "", "curfew_start_time", "curfew_end_time", "browser_blocked", "theater_blocked", "arcade_blocked", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/k;)Lgc0/j0;", "Ljava/lang/Boolean;", "m", "()Ljava/lang/Boolean;", "b", "Ljava/lang/Float;", "j", "()Ljava/lang/Float;", "c", "k", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "e", "f", "l", "g", "h", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "n", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ProtoAdapter<j0> f68082n = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(j0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "speedLimitEnabled", tag = 1)
    private final Boolean speed_limit_enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "maxLimitMph", tag = 2)
    private final Float max_limit_mph;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "minLimitMph", tag = 3)
    private final Float min_limit_mph;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "currentLimitMph", tag = 4)
    private final Float current_limit_mph;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "chillAccelerationEnabled", tag = 5)
    private final Boolean chill_acceleration_enabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "requireSafetySettingsEnabled", tag = 6)
    private final Boolean require_safety_settings_enabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "curfewEnabled", tag = 7)
    private final Boolean curfew_enabled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "curfewStartTime", tag = 8)
    private final Integer curfew_start_time;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "curfewEndTime", tag = 9)
    private final Integer curfew_end_time;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "browserBlocked", tag = 10)
    private final Boolean browser_blocked;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "theaterBlocked", tag = 11)
    private final Boolean theater_blocked;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "arcadeBlocked", tag = 12)
    private final Boolean arcade_blocked;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/j0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/j0;", "value", "", "c", "(Lgc0/j0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/j0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/j0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/j0;)Lgc0/j0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<j0> {
        a(com.squareup.wire.b bVar, co0.d<j0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ParentalControlsSettings", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            Boolean boolDecode = null;
            Float fDecode = null;
            Float fDecode2 = null;
            Float fDecode3 = null;
            Boolean boolDecode2 = null;
            Boolean boolDecode3 = null;
            Boolean boolDecode4 = null;
            Integer numDecode = null;
            Integer numDecode2 = null;
            Boolean boolDecode5 = null;
            Boolean boolDecode6 = null;
            Boolean boolDecode7 = null;
            while (true) {
                int iG = reader.g();
                Boolean bool = boolDecode;
                if (iG == -1) {
                    return new j0(bool, fDecode, fDecode2, fDecode3, boolDecode2, boolDecode3, boolDecode4, numDecode, numDecode2, boolDecode5, boolDecode6, boolDecode7, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        boolDecode = ProtoAdapter.BOOL.decode(reader);
                        continue;
                    case 2:
                        fDecode = ProtoAdapter.FLOAT.decode(reader);
                        break;
                    case 3:
                        fDecode2 = ProtoAdapter.FLOAT.decode(reader);
                        break;
                    case 4:
                        fDecode3 = ProtoAdapter.FLOAT.decode(reader);
                        break;
                    case 5:
                        boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                        break;
                    case 6:
                        boolDecode3 = ProtoAdapter.BOOL.decode(reader);
                        break;
                    case 7:
                        boolDecode4 = ProtoAdapter.BOOL.decode(reader);
                        break;
                    case 8:
                        numDecode = ProtoAdapter.INT32.decode(reader);
                        break;
                    case 9:
                        numDecode2 = ProtoAdapter.INT32.decode(reader);
                        break;
                    case 10:
                        boolDecode5 = ProtoAdapter.BOOL.decode(reader);
                        break;
                    case 11:
                        boolDecode6 = ProtoAdapter.BOOL.decode(reader);
                        break;
                    case 12:
                        boolDecode7 = ProtoAdapter.BOOL.decode(reader);
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
                boolDecode = bool;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, j0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(writer, 1, value.getSpeed_limit_enabled());
            ProtoAdapter<Float> protoAdapter2 = ProtoAdapter.FLOAT;
            protoAdapter2.encodeWithTag(writer, 2, value.getMax_limit_mph());
            protoAdapter2.encodeWithTag(writer, 3, value.getMin_limit_mph());
            protoAdapter2.encodeWithTag(writer, 4, value.getCurrent_limit_mph());
            protoAdapter.encodeWithTag(writer, 5, value.getChill_acceleration_enabled());
            protoAdapter.encodeWithTag(writer, 6, value.getRequire_safety_settings_enabled());
            protoAdapter.encodeWithTag(writer, 7, value.getCurfew_enabled());
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(writer, 8, value.getCurfew_start_time());
            protoAdapter3.encodeWithTag(writer, 9, value.getCurfew_end_time());
            protoAdapter.encodeWithTag(writer, 10, value.getBrowser_blocked());
            protoAdapter.encodeWithTag(writer, 11, value.getTheater_blocked());
            protoAdapter.encodeWithTag(writer, 12, value.getArcade_blocked());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(j0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = iD + protoAdapter.encodedSizeWithTag(1, value.getSpeed_limit_enabled());
            ProtoAdapter<Float> protoAdapter2 = ProtoAdapter.FLOAT;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, value.getMax_limit_mph()) + protoAdapter2.encodedSizeWithTag(3, value.getMin_limit_mph()) + protoAdapter2.encodedSizeWithTag(4, value.getCurrent_limit_mph()) + protoAdapter.encodedSizeWithTag(5, value.getChill_acceleration_enabled()) + protoAdapter.encodedSizeWithTag(6, value.getRequire_safety_settings_enabled()) + protoAdapter.encodedSizeWithTag(7, value.getCurfew_enabled());
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(8, value.getCurfew_start_time()) + protoAdapter3.encodedSizeWithTag(9, value.getCurfew_end_time()) + protoAdapter.encodedSizeWithTag(10, value.getBrowser_blocked()) + protoAdapter.encodedSizeWithTag(11, value.getTheater_blocked()) + protoAdapter.encodedSizeWithTag(12, value.getArcade_blocked());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public j0 redact(j0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return j0.b(value, null, null, null, null, null, null, null, null, null, null, null, null, okio.k.f97943e, 4095, null);
        }
    }

    public j0() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public static /* synthetic */ j0 b(j0 j0Var, Boolean bool, Float f11, Float f12, Float f13, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, Boolean bool5, Boolean bool6, Boolean bool7, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = j0Var.speed_limit_enabled;
        }
        return j0Var.a(bool, (i11 & 2) != 0 ? j0Var.max_limit_mph : f11, (i11 & 4) != 0 ? j0Var.min_limit_mph : f12, (i11 & 8) != 0 ? j0Var.current_limit_mph : f13, (i11 & 16) != 0 ? j0Var.chill_acceleration_enabled : bool2, (i11 & 32) != 0 ? j0Var.require_safety_settings_enabled : bool3, (i11 & 64) != 0 ? j0Var.curfew_enabled : bool4, (i11 & 128) != 0 ? j0Var.curfew_start_time : num, (i11 & 256) != 0 ? j0Var.curfew_end_time : num2, (i11 & 512) != 0 ? j0Var.browser_blocked : bool5, (i11 & 1024) != 0 ? j0Var.theater_blocked : bool6, (i11 & 2048) != 0 ? j0Var.arcade_blocked : bool7, (i11 & 4096) != 0 ? j0Var.unknownFields() : kVar);
    }

    public final j0 a(Boolean speed_limit_enabled, Float max_limit_mph, Float min_limit_mph, Float current_limit_mph, Boolean chill_acceleration_enabled, Boolean require_safety_settings_enabled, Boolean curfew_enabled, Integer curfew_start_time, Integer curfew_end_time, Boolean browser_blocked, Boolean theater_blocked, Boolean arcade_blocked, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new j0(speed_limit_enabled, max_limit_mph, min_limit_mph, current_limit_mph, chill_acceleration_enabled, require_safety_settings_enabled, curfew_enabled, curfew_start_time, curfew_end_time, browser_blocked, theater_blocked, arcade_blocked, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getArcade_blocked() {
        return this.arcade_blocked;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getBrowser_blocked() {
        return this.browser_blocked;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getChill_acceleration_enabled() {
        return this.chill_acceleration_enabled;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), j0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.speed_limit_enabled, j0Var.speed_limit_enabled) && p013kotlin.jvm.internal.s.e(this.max_limit_mph, j0Var.max_limit_mph) && p013kotlin.jvm.internal.s.e(this.min_limit_mph, j0Var.min_limit_mph) && p013kotlin.jvm.internal.s.e(this.current_limit_mph, j0Var.current_limit_mph) && p013kotlin.jvm.internal.s.f(this.chill_acceleration_enabled, j0Var.chill_acceleration_enabled) && p013kotlin.jvm.internal.s.f(this.require_safety_settings_enabled, j0Var.require_safety_settings_enabled) && p013kotlin.jvm.internal.s.f(this.curfew_enabled, j0Var.curfew_enabled) && p013kotlin.jvm.internal.s.f(this.curfew_start_time, j0Var.curfew_start_time) && p013kotlin.jvm.internal.s.f(this.curfew_end_time, j0Var.curfew_end_time) && p013kotlin.jvm.internal.s.f(this.browser_blocked, j0Var.browser_blocked) && p013kotlin.jvm.internal.s.f(this.theater_blocked, j0Var.theater_blocked) && p013kotlin.jvm.internal.s.f(this.arcade_blocked, j0Var.arcade_blocked);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getCurfew_enabled() {
        return this.curfew_enabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getCurfew_end_time() {
        return this.curfew_end_time;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getCurfew_start_time() {
        return this.curfew_start_time;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.speed_limit_enabled;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        Float f11 = this.max_limit_mph;
        int iHashCode3 = (iHashCode2 + (f11 != null ? f11.hashCode() : 0)) * 37;
        Float f12 = this.min_limit_mph;
        int iHashCode4 = (iHashCode3 + (f12 != null ? f12.hashCode() : 0)) * 37;
        Float f13 = this.current_limit_mph;
        int iHashCode5 = (iHashCode4 + (f13 != null ? f13.hashCode() : 0)) * 37;
        Boolean bool2 = this.chill_acceleration_enabled;
        int iHashCode6 = (iHashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.require_safety_settings_enabled;
        int iHashCode7 = (iHashCode6 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        Boolean bool4 = this.curfew_enabled;
        int iHashCode8 = (iHashCode7 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
        Integer num = this.curfew_start_time;
        int iHashCode9 = (iHashCode8 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.curfew_end_time;
        int iHashCode10 = (iHashCode9 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Boolean bool5 = this.browser_blocked;
        int iHashCode11 = (iHashCode10 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
        Boolean bool6 = this.theater_blocked;
        int iHashCode12 = (iHashCode11 + (bool6 != null ? bool6.hashCode() : 0)) * 37;
        Boolean bool7 = this.arcade_blocked;
        int iHashCode13 = iHashCode12 + (bool7 != null ? bool7.hashCode() : 0);
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Float getCurrent_limit_mph() {
        return this.current_limit_mph;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Float getMax_limit_mph() {
        return this.max_limit_mph;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Float getMin_limit_mph() {
        return this.min_limit_mph;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Boolean getRequire_safety_settings_enabled() {
        return this.require_safety_settings_enabled;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getSpeed_limit_enabled() {
        return this.speed_limit_enabled;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Boolean getTheater_blocked() {
        return this.theater_blocked;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m406newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.speed_limit_enabled;
        if (bool != null) {
            arrayList.add("speed_limit_enabled=" + bool);
        }
        Float f11 = this.max_limit_mph;
        if (f11 != null) {
            arrayList.add("max_limit_mph=" + f11);
        }
        Float f12 = this.min_limit_mph;
        if (f12 != null) {
            arrayList.add("min_limit_mph=" + f12);
        }
        Float f13 = this.current_limit_mph;
        if (f13 != null) {
            arrayList.add("current_limit_mph=" + f13);
        }
        Boolean bool2 = this.chill_acceleration_enabled;
        if (bool2 != null) {
            arrayList.add("chill_acceleration_enabled=" + bool2);
        }
        Boolean bool3 = this.require_safety_settings_enabled;
        if (bool3 != null) {
            arrayList.add("require_safety_settings_enabled=" + bool3);
        }
        Boolean bool4 = this.curfew_enabled;
        if (bool4 != null) {
            arrayList.add("curfew_enabled=" + bool4);
        }
        Integer num = this.curfew_start_time;
        if (num != null) {
            arrayList.add("curfew_start_time=" + num);
        }
        Integer num2 = this.curfew_end_time;
        if (num2 != null) {
            arrayList.add("curfew_end_time=" + num2);
        }
        Boolean bool5 = this.browser_blocked;
        if (bool5 != null) {
            arrayList.add("browser_blocked=" + bool5);
        }
        Boolean bool6 = this.theater_blocked;
        if (bool6 != null) {
            arrayList.add("theater_blocked=" + bool6);
        }
        Boolean bool7 = this.arcade_blocked;
        if (bool7 != null) {
            arrayList.add("arcade_blocked=" + bool7);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "ParentalControlsSettings{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ j0(Boolean bool, Float f11, Float f12, Float f13, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, Boolean bool5, Boolean bool6, Boolean bool7, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : f11, (i11 & 4) != 0 ? null : f12, (i11 & 8) != 0 ? null : f13, (i11 & 16) != 0 ? null : bool2, (i11 & 32) != 0 ? null : bool3, (i11 & 64) != 0 ? null : bool4, (i11 & 128) != 0 ? null : num, (i11 & 256) != 0 ? null : num2, (i11 & 512) != 0 ? null : bool5, (i11 & 1024) != 0 ? null : bool6, (i11 & 2048) == 0 ? bool7 : null, (i11 & 4096) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m406newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Boolean bool, Float f11, Float f12, Float f13, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, Boolean bool5, Boolean bool6, Boolean bool7, okio.k unknownFields) {
        super(f68082n, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.speed_limit_enabled = bool;
        this.max_limit_mph = f11;
        this.min_limit_mph = f12;
        this.current_limit_mph = f13;
        this.chill_acceleration_enabled = bool2;
        this.require_safety_settings_enabled = bool3;
        this.curfew_enabled = bool4;
        this.curfew_start_time = num;
        this.curfew_end_time = num2;
        this.browser_blocked = bool5;
        this.theater_blocked = bool6;
        this.arcade_blocked = bool7;
    }
}
