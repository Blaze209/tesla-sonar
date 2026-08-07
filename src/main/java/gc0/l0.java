package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import j$.time.Instant;
import java.util.ArrayList;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001e\u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B×\u0001\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&JÝ\u0001\u0010'\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b'\u0010(R\"\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b?\u0010/R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b@\u0010/R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\b>\u0010/R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00109\u001a\u0004\b0\u0010;R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u00109\u001a\u0004\b8\u0010;R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u00109\u001a\u0004\b<\u0010;R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b6\u0010;R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\bA\u0010/¨\u0006B"}, d2 = {"Lgc0/l0;", "Lcom/squareup/wire/f;", "", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "tent_mode_request", "horizon_leveling_state", "Lec0/j0;", "front_zone_light_request", "rear_zone_light_request", "", "truck_bed_lights_brightness", "truck_bed_lights_auto_brightness", "truck_bed_lights_auto_state", "truck_bed_lights_controls_disabled", "accessory_lightbar_middle_on", "accessory_lightbar_ditch_on", "accessory_lightbar_brightness", "accessory_lightbar_low", "accessory_lightbar_med", "accessory_lightbar_high", "has_tent_mode", "Lokio/k;", "unknownFields", "<init>", "(Lj$/time/Instant;Ljava/lang/Boolean;Ljava/lang/Boolean;Lec0/j0;Lec0/j0;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lj$/time/Instant;Ljava/lang/Boolean;Ljava/lang/Boolean;Lec0/j0;Lec0/j0;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lokio/k;)Lgc0/l0;", "Lj$/time/Instant;", "n", "()Lj$/time/Instant;", "b", "Ljava/lang/Boolean;", "m", "()Ljava/lang/Boolean;", "c", "k", DateTokenConverter.CONVERTER_KEY, "Lec0/j0;", IntegerTokenConverter.CONVERTER_KEY, "()Lec0/j0;", "e", "l", "f", "Ljava/lang/Integer;", "q", "()Ljava/lang/Integer;", "g", "o", "h", "p", "r", "j", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ProtoAdapter<l0> f68106r = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(l0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2000)
    private final Instant timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tentModeRequest", tag = 1)
    private final Boolean tent_mode_request;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "horizonLevelingState", tag = 2)
    private final Boolean horizon_leveling_state;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.ZoneLightRequest#ADAPTER", jsonName = "frontZoneLightRequest", tag = 3)
    private final ec0.j0 front_zone_light_request;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.ZoneLightRequest#ADAPTER", jsonName = "rearZoneLightRequest", tag = 4)
    private final ec0.j0 rear_zone_light_request;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "truckBedLightsBrightness", tag = 5)
    private final Integer truck_bed_lights_brightness;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "truckBedLightsAutoBrightness", tag = 6)
    private final Integer truck_bed_lights_auto_brightness;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "truckBedLightsAutoState", tag = 7)
    private final Boolean truck_bed_lights_auto_state;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "truckBedLightsControlsDisabled", tag = 8)
    private final Boolean truck_bed_lights_controls_disabled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "accessoryLightbarMiddleOn", tag = 9)
    private final Boolean accessory_lightbar_middle_on;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "accessoryLightbarDitchOn", tag = 10)
    private final Boolean accessory_lightbar_ditch_on;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "accessoryLightbarBrightness", tag = 11)
    private final Integer accessory_lightbar_brightness;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "accessoryLightbarLow", tag = 12)
    private final Integer accessory_lightbar_low;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "accessoryLightbarMed", tag = 13)
    private final Integer accessory_lightbar_med;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "accessoryLightbarHigh", tag = 14)
    private final Integer accessory_lightbar_high;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasTentMode", tag = 15)
    private final Boolean has_tent_mode;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/l0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/l0;", "value", "", "c", "(Lgc0/l0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/l0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/l0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/l0;)Lgc0/l0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<l0> {
        a(com.squareup.wire.b bVar, co0.d<l0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ParkedAccessoryState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l0 decode(com.squareup.wire.k reader) {
            Boolean bool;
            Boolean bool2;
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            Boolean boolDecode = null;
            Boolean boolDecode2 = null;
            ec0.j0 j0VarDecode = null;
            ec0.j0 j0VarDecode2 = null;
            Integer numDecode = null;
            Integer numDecode2 = null;
            Boolean boolDecode3 = null;
            Boolean boolDecode4 = null;
            Boolean boolDecode5 = null;
            Boolean boolDecode6 = null;
            Integer numDecode3 = null;
            Integer numDecode4 = null;
            Integer numDecode5 = null;
            Integer numDecode6 = null;
            Boolean boolDecode7 = null;
            Instant instantDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new l0(instantDecode, boolDecode, boolDecode2, j0VarDecode, j0VarDecode2, numDecode, numDecode2, boolDecode3, boolDecode4, boolDecode5, boolDecode6, numDecode3, numDecode4, numDecode5, numDecode6, boolDecode7, reader.e(jD));
                }
                if (iG != 2000) {
                    switch (iG) {
                        case 1:
                            boolDecode = ProtoAdapter.BOOL.decode(reader);
                            continue;
                        case 2:
                            boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                            continue;
                        case 3:
                            bool = boolDecode;
                            bool2 = boolDecode2;
                            try {
                                j0VarDecode = ec0.j0.ADAPTER.decode(reader);
                                boolDecode = bool;
                                boolDecode2 = bool2;
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                                boolDecode = bool;
                                boolDecode2 = bool2;
                                j0VarDecode = j0VarDecode;
                            }
                            break;
                        case 4:
                            try {
                                j0VarDecode2 = ec0.j0.ADAPTER.decode(reader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                bool = boolDecode;
                                bool2 = boolDecode2;
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                                boolDecode = bool;
                                boolDecode2 = bool2;
                                j0VarDecode = j0VarDecode;
                            }
                            break;
                        case 5:
                            numDecode = ProtoAdapter.UINT32.decode(reader);
                            continue;
                        case 6:
                            numDecode2 = ProtoAdapter.UINT32.decode(reader);
                            continue;
                        case 7:
                            boolDecode3 = ProtoAdapter.BOOL.decode(reader);
                            continue;
                        case 8:
                            boolDecode4 = ProtoAdapter.BOOL.decode(reader);
                            continue;
                        case 9:
                            boolDecode5 = ProtoAdapter.BOOL.decode(reader);
                            continue;
                        case 10:
                            boolDecode6 = ProtoAdapter.BOOL.decode(reader);
                            continue;
                        case 11:
                            numDecode3 = ProtoAdapter.UINT32.decode(reader);
                            continue;
                        case 12:
                            numDecode4 = ProtoAdapter.UINT32.decode(reader);
                            continue;
                        case 13:
                            numDecode5 = ProtoAdapter.UINT32.decode(reader);
                            continue;
                        case 14:
                            numDecode6 = ProtoAdapter.UINT32.decode(reader);
                            continue;
                        case 15:
                            boolDecode7 = ProtoAdapter.BOOL.decode(reader);
                            continue;
                        default:
                            reader.m(iG);
                            bool = boolDecode;
                            bool2 = boolDecode2;
                            break;
                    }
                    boolDecode = bool;
                    boolDecode2 = bool2;
                    j0VarDecode = j0VarDecode;
                } else {
                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, l0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 2000, value.getTimestamp());
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(writer, 1, value.getTent_mode_request());
            protoAdapter.encodeWithTag(writer, 2, value.getHorizon_leveling_state());
            ProtoAdapter<ec0.j0> protoAdapter2 = ec0.j0.ADAPTER;
            protoAdapter2.encodeWithTag(writer, 3, value.getFront_zone_light_request());
            protoAdapter2.encodeWithTag(writer, 4, value.getRear_zone_light_request());
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.UINT32;
            protoAdapter3.encodeWithTag(writer, 5, value.getTruck_bed_lights_brightness());
            protoAdapter3.encodeWithTag(writer, 6, value.getTruck_bed_lights_auto_brightness());
            protoAdapter.encodeWithTag(writer, 7, value.getTruck_bed_lights_auto_state());
            protoAdapter.encodeWithTag(writer, 8, value.getTruck_bed_lights_controls_disabled());
            protoAdapter.encodeWithTag(writer, 9, value.getAccessory_lightbar_middle_on());
            protoAdapter.encodeWithTag(writer, 10, value.getAccessory_lightbar_ditch_on());
            protoAdapter3.encodeWithTag(writer, 11, value.getAccessory_lightbar_brightness());
            protoAdapter3.encodeWithTag(writer, 12, value.getAccessory_lightbar_low());
            protoAdapter3.encodeWithTag(writer, 13, value.getAccessory_lightbar_med());
            protoAdapter3.encodeWithTag(writer, 14, value.getAccessory_lightbar_high());
            protoAdapter.encodeWithTag(writer, 15, value.getHas_tent_mode());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(l0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(2000, value.getTimestamp());
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = iD + protoAdapter.encodedSizeWithTag(1, value.getTent_mode_request()) + protoAdapter.encodedSizeWithTag(2, value.getHorizon_leveling_state());
            ProtoAdapter<ec0.j0> protoAdapter2 = ec0.j0.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, value.getFront_zone_light_request()) + protoAdapter2.encodedSizeWithTag(4, value.getRear_zone_light_request());
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.UINT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(5, value.getTruck_bed_lights_brightness()) + protoAdapter3.encodedSizeWithTag(6, value.getTruck_bed_lights_auto_brightness()) + protoAdapter.encodedSizeWithTag(7, value.getTruck_bed_lights_auto_state()) + protoAdapter.encodedSizeWithTag(8, value.getTruck_bed_lights_controls_disabled()) + protoAdapter.encodedSizeWithTag(9, value.getAccessory_lightbar_middle_on()) + protoAdapter.encodedSizeWithTag(10, value.getAccessory_lightbar_ditch_on()) + protoAdapter3.encodedSizeWithTag(11, value.getAccessory_lightbar_brightness()) + protoAdapter3.encodedSizeWithTag(12, value.getAccessory_lightbar_low()) + protoAdapter3.encodedSizeWithTag(13, value.getAccessory_lightbar_med()) + protoAdapter3.encodedSizeWithTag(14, value.getAccessory_lightbar_high()) + protoAdapter.encodedSizeWithTag(15, value.getHas_tent_mode());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public l0 redact(l0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            Instant timestamp = value.getTimestamp();
            return l0.b(value, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, okio.k.f97943e, 65534, null);
        }
    }

    public l0() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public static /* synthetic */ l0 b(l0 l0Var, Instant instant, Boolean bool, Boolean bool2, ec0.j0 j0Var, ec0.j0 j0Var2, Integer num, Integer num2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num3, Integer num4, Integer num5, Integer num6, Boolean bool7, okio.k kVar, int i11, Object obj) {
        return l0Var.a((i11 & 1) != 0 ? l0Var.timestamp : instant, (i11 & 2) != 0 ? l0Var.tent_mode_request : bool, (i11 & 4) != 0 ? l0Var.horizon_leveling_state : bool2, (i11 & 8) != 0 ? l0Var.front_zone_light_request : j0Var, (i11 & 16) != 0 ? l0Var.rear_zone_light_request : j0Var2, (i11 & 32) != 0 ? l0Var.truck_bed_lights_brightness : num, (i11 & 64) != 0 ? l0Var.truck_bed_lights_auto_brightness : num2, (i11 & 128) != 0 ? l0Var.truck_bed_lights_auto_state : bool3, (i11 & 256) != 0 ? l0Var.truck_bed_lights_controls_disabled : bool4, (i11 & 512) != 0 ? l0Var.accessory_lightbar_middle_on : bool5, (i11 & 1024) != 0 ? l0Var.accessory_lightbar_ditch_on : bool6, (i11 & 2048) != 0 ? l0Var.accessory_lightbar_brightness : num3, (i11 & 4096) != 0 ? l0Var.accessory_lightbar_low : num4, (i11 & PKIFailureInfo.certRevoked) != 0 ? l0Var.accessory_lightbar_med : num5, (i11 & 16384) != 0 ? l0Var.accessory_lightbar_high : num6, (i11 & 32768) != 0 ? l0Var.has_tent_mode : bool7, (i11 & 65536) != 0 ? l0Var.unknownFields() : kVar);
    }

    public final l0 a(Instant timestamp, Boolean tent_mode_request, Boolean horizon_leveling_state, ec0.j0 front_zone_light_request, ec0.j0 rear_zone_light_request, Integer truck_bed_lights_brightness, Integer truck_bed_lights_auto_brightness, Boolean truck_bed_lights_auto_state, Boolean truck_bed_lights_controls_disabled, Boolean accessory_lightbar_middle_on, Boolean accessory_lightbar_ditch_on, Integer accessory_lightbar_brightness, Integer accessory_lightbar_low, Integer accessory_lightbar_med, Integer accessory_lightbar_high, Boolean has_tent_mode, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new l0(timestamp, tent_mode_request, horizon_leveling_state, front_zone_light_request, rear_zone_light_request, truck_bed_lights_brightness, truck_bed_lights_auto_brightness, truck_bed_lights_auto_state, truck_bed_lights_controls_disabled, accessory_lightbar_middle_on, accessory_lightbar_ditch_on, accessory_lightbar_brightness, accessory_lightbar_low, accessory_lightbar_med, accessory_lightbar_high, has_tent_mode, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getAccessory_lightbar_brightness() {
        return this.accessory_lightbar_brightness;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getAccessory_lightbar_ditch_on() {
        return this.accessory_lightbar_ditch_on;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getAccessory_lightbar_high() {
        return this.accessory_lightbar_high;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), l0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.timestamp, l0Var.timestamp) && p013kotlin.jvm.internal.s.f(this.tent_mode_request, l0Var.tent_mode_request) && p013kotlin.jvm.internal.s.f(this.horizon_leveling_state, l0Var.horizon_leveling_state) && this.front_zone_light_request == l0Var.front_zone_light_request && this.rear_zone_light_request == l0Var.rear_zone_light_request && p013kotlin.jvm.internal.s.f(this.truck_bed_lights_brightness, l0Var.truck_bed_lights_brightness) && p013kotlin.jvm.internal.s.f(this.truck_bed_lights_auto_brightness, l0Var.truck_bed_lights_auto_brightness) && p013kotlin.jvm.internal.s.f(this.truck_bed_lights_auto_state, l0Var.truck_bed_lights_auto_state) && p013kotlin.jvm.internal.s.f(this.truck_bed_lights_controls_disabled, l0Var.truck_bed_lights_controls_disabled) && p013kotlin.jvm.internal.s.f(this.accessory_lightbar_middle_on, l0Var.accessory_lightbar_middle_on) && p013kotlin.jvm.internal.s.f(this.accessory_lightbar_ditch_on, l0Var.accessory_lightbar_ditch_on) && p013kotlin.jvm.internal.s.f(this.accessory_lightbar_brightness, l0Var.accessory_lightbar_brightness) && p013kotlin.jvm.internal.s.f(this.accessory_lightbar_low, l0Var.accessory_lightbar_low) && p013kotlin.jvm.internal.s.f(this.accessory_lightbar_med, l0Var.accessory_lightbar_med) && p013kotlin.jvm.internal.s.f(this.accessory_lightbar_high, l0Var.accessory_lightbar_high) && p013kotlin.jvm.internal.s.f(this.has_tent_mode, l0Var.has_tent_mode);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getAccessory_lightbar_low() {
        return this.accessory_lightbar_low;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getAccessory_lightbar_med() {
        return this.accessory_lightbar_med;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getAccessory_lightbar_middle_on() {
        return this.accessory_lightbar_middle_on;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Boolean bool = this.tent_mode_request;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.horizon_leveling_state;
        int iHashCode4 = (iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        ec0.j0 j0Var = this.front_zone_light_request;
        int iHashCode5 = (iHashCode4 + (j0Var != null ? j0Var.hashCode() : 0)) * 37;
        ec0.j0 j0Var2 = this.rear_zone_light_request;
        int iHashCode6 = (iHashCode5 + (j0Var2 != null ? j0Var2.hashCode() : 0)) * 37;
        Integer num = this.truck_bed_lights_brightness;
        int iHashCode7 = (iHashCode6 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.truck_bed_lights_auto_brightness;
        int iHashCode8 = (iHashCode7 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Boolean bool3 = this.truck_bed_lights_auto_state;
        int iHashCode9 = (iHashCode8 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        Boolean bool4 = this.truck_bed_lights_controls_disabled;
        int iHashCode10 = (iHashCode9 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
        Boolean bool5 = this.accessory_lightbar_middle_on;
        int iHashCode11 = (iHashCode10 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
        Boolean bool6 = this.accessory_lightbar_ditch_on;
        int iHashCode12 = (iHashCode11 + (bool6 != null ? bool6.hashCode() : 0)) * 37;
        Integer num3 = this.accessory_lightbar_brightness;
        int iHashCode13 = (iHashCode12 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Integer num4 = this.accessory_lightbar_low;
        int iHashCode14 = (iHashCode13 + (num4 != null ? num4.hashCode() : 0)) * 37;
        Integer num5 = this.accessory_lightbar_med;
        int iHashCode15 = (iHashCode14 + (num5 != null ? num5.hashCode() : 0)) * 37;
        Integer num6 = this.accessory_lightbar_high;
        int iHashCode16 = (iHashCode15 + (num6 != null ? num6.hashCode() : 0)) * 37;
        Boolean bool7 = this.has_tent_mode;
        int iHashCode17 = iHashCode16 + (bool7 != null ? bool7.hashCode() : 0);
        this.hashCode = iHashCode17;
        return iHashCode17;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final ec0.j0 getFront_zone_light_request() {
        return this.front_zone_light_request;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getHas_tent_mode() {
        return this.has_tent_mode;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getHorizon_leveling_state() {
        return this.horizon_leveling_state;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final ec0.j0 getRear_zone_light_request() {
        return this.rear_zone_light_request;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getTent_mode_request() {
        return this.tent_mode_request;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m410newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Integer getTruck_bed_lights_auto_brightness() {
        return this.truck_bed_lights_auto_brightness;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Boolean getTruck_bed_lights_auto_state() {
        return this.truck_bed_lights_auto_state;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Integer getTruck_bed_lights_brightness() {
        return this.truck_bed_lights_brightness;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Boolean getTruck_bed_lights_controls_disabled() {
        return this.truck_bed_lights_controls_disabled;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        Boolean bool = this.tent_mode_request;
        if (bool != null) {
            arrayList.add("tent_mode_request=" + bool);
        }
        Boolean bool2 = this.horizon_leveling_state;
        if (bool2 != null) {
            arrayList.add("horizon_leveling_state=" + bool2);
        }
        ec0.j0 j0Var = this.front_zone_light_request;
        if (j0Var != null) {
            arrayList.add("front_zone_light_request=" + j0Var);
        }
        ec0.j0 j0Var2 = this.rear_zone_light_request;
        if (j0Var2 != null) {
            arrayList.add("rear_zone_light_request=" + j0Var2);
        }
        Integer num = this.truck_bed_lights_brightness;
        if (num != null) {
            arrayList.add("truck_bed_lights_brightness=" + num);
        }
        Integer num2 = this.truck_bed_lights_auto_brightness;
        if (num2 != null) {
            arrayList.add("truck_bed_lights_auto_brightness=" + num2);
        }
        Boolean bool3 = this.truck_bed_lights_auto_state;
        if (bool3 != null) {
            arrayList.add("truck_bed_lights_auto_state=" + bool3);
        }
        Boolean bool4 = this.truck_bed_lights_controls_disabled;
        if (bool4 != null) {
            arrayList.add("truck_bed_lights_controls_disabled=" + bool4);
        }
        Boolean bool5 = this.accessory_lightbar_middle_on;
        if (bool5 != null) {
            arrayList.add("accessory_lightbar_middle_on=" + bool5);
        }
        Boolean bool6 = this.accessory_lightbar_ditch_on;
        if (bool6 != null) {
            arrayList.add("accessory_lightbar_ditch_on=" + bool6);
        }
        Integer num3 = this.accessory_lightbar_brightness;
        if (num3 != null) {
            arrayList.add("accessory_lightbar_brightness=" + num3);
        }
        Integer num4 = this.accessory_lightbar_low;
        if (num4 != null) {
            arrayList.add("accessory_lightbar_low=" + num4);
        }
        Integer num5 = this.accessory_lightbar_med;
        if (num5 != null) {
            arrayList.add("accessory_lightbar_med=" + num5);
        }
        Integer num6 = this.accessory_lightbar_high;
        if (num6 != null) {
            arrayList.add("accessory_lightbar_high=" + num6);
        }
        Boolean bool7 = this.has_tent_mode;
        if (bool7 != null) {
            arrayList.add("has_tent_mode=" + bool7);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "ParkedAccessoryState{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ l0(Instant instant, Boolean bool, Boolean bool2, ec0.j0 j0Var, ec0.j0 j0Var2, Integer num, Integer num2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num3, Integer num4, Integer num5, Integer num6, Boolean bool7, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : instant, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : bool2, (i11 & 8) != 0 ? null : j0Var, (i11 & 16) != 0 ? null : j0Var2, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? null : num2, (i11 & 128) != 0 ? null : bool3, (i11 & 256) != 0 ? null : bool4, (i11 & 512) != 0 ? null : bool5, (i11 & 1024) != 0 ? null : bool6, (i11 & 2048) != 0 ? null : num3, (i11 & 4096) != 0 ? null : num4, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : num5, (i11 & 16384) != 0 ? null : num6, (i11 & 32768) != 0 ? null : bool7, (i11 & 65536) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m410newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Instant instant, Boolean bool, Boolean bool2, ec0.j0 j0Var, ec0.j0 j0Var2, Integer num, Integer num2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num3, Integer num4, Integer num5, Integer num6, Boolean bool7, okio.k unknownFields) {
        super(f68106r, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.timestamp = instant;
        this.tent_mode_request = bool;
        this.horizon_leveling_state = bool2;
        this.front_zone_light_request = j0Var;
        this.rear_zone_light_request = j0Var2;
        this.truck_bed_lights_brightness = num;
        this.truck_bed_lights_auto_brightness = num2;
        this.truck_bed_lights_auto_state = bool3;
        this.truck_bed_lights_controls_disabled = bool4;
        this.accessory_lightbar_middle_on = bool5;
        this.accessory_lightbar_ditch_on = bool6;
        this.accessory_lightbar_brightness = num3;
        this.accessory_lightbar_low = num4;
        this.accessory_lightbar_med = num5;
        this.accessory_lightbar_high = num6;
        this.has_tent_mode = bool7;
    }
}
