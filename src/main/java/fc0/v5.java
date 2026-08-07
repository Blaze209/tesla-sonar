package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u008b\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0091\u0002\u0010%\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b%\u0010&R\"\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\"\u0010\u0006\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\"\u0010\u0007\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\"\u0010\b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)R\"\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b0\u0010)R\"\u0010\n\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b1\u0010)R\"\u0010\u000b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b2\u0010)R\"\u0010\f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b4\u0010)R\"\u0010\u0010\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b5\u0010)R\"\u0010\u0011\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b.\u0010)R\"\u0010\u0012\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b6\u0010)R\"\u0010\u0013\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b,\u0010)R\"\u0010\u0014\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b7\u0010)R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b3\u00109¨\u0006:"}, d2 = {"Lfc0/v5;", "Lcom/squareup/wire/f;", "", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "ChargeState_timestamp", "ClimateState_timestamp", "ClosuresState_timestamp", "DriveState_timestamp", "GuiSettings_timestamp", "LocationState_timestamp", "VehicleConfig_timestamp", "VehicleState_timestamp", "", "", "decryption_error_field", "ParkedAccessoryState_timestamp", "ChargeScheduleState_timestamp", "PreconditioningScheduleState_timestamp", "AlertState_timestamp", "SuspensionState_timestamp", "Lokio/k;", "unknownFields", "<init>", "(Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lokio/k;)Lfc0/v5;", "Lj$/time/Instant;", "e", "()Lj$/time/Instant;", "b", "f", "c", "g", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "j", "k", "o", "h", "p", "l", "m", "n", "Ljava/util/List;", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v5 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ProtoAdapter<v5> f65525p = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(v5.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "ChargeStateTimestamp", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final Instant ChargeState_timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "ClimateStateTimestamp", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final Instant ClimateState_timestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "ClosuresStateTimestamp", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final Instant ClosuresState_timestamp;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "DriveStateTimestamp", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final Instant DriveState_timestamp;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "GuiSettingsTimestamp", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final Instant GuiSettings_timestamp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "LocationStateTimestamp", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final Instant LocationState_timestamp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "VehicleConfigTimestamp", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final Instant VehicleConfig_timestamp;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "VehicleStateTimestamp", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 9)
    private final Instant VehicleState_timestamp;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "ParkedAccessoryStateTimestamp", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 11)
    private final Instant ParkedAccessoryState_timestamp;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "ChargeScheduleStateTimestamp", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 12)
    private final Instant ChargeScheduleState_timestamp;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "PreconditioningScheduleStateTimestamp", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 13)
    private final Instant PreconditioningScheduleState_timestamp;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "AlertStateTimestamp", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 14)
    private final Instant AlertState_timestamp;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "SuspensionStateTimestamp", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 15)
    private final Instant SuspensionState_timestamp;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "decryptionErrorField", label = com.squareup.wire.q.a.PACKED, tag = 10)
    private final List<Integer> decryption_error_field;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/v5$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/v5;", "value", "", "c", "(Lfc0/v5;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/v5;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/v5;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/v5;)Lfc0/v5;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<v5> {
        a(com.squareup.wire.b bVar, co0.d<v5> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleDataAck", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public v5 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            Instant instantDecode = null;
            Instant instantDecode2 = null;
            Instant instantDecode3 = null;
            Instant instantDecode4 = null;
            Instant instantDecode5 = null;
            Instant instantDecode6 = null;
            Instant instantDecode7 = null;
            Instant instantDecode8 = null;
            Instant instantDecode9 = null;
            Instant instantDecode10 = null;
            Instant instantDecode11 = null;
            Instant instantDecode12 = null;
            Instant instantDecode13 = null;
            while (true) {
                int iG = reader.g();
                Instant instant = instantDecode;
                if (iG == -1) {
                    return new v5(instantDecode13, instant, instantDecode2, instantDecode3, instantDecode4, instantDecode5, instantDecode6, instantDecode7, arrayList, instantDecode8, instantDecode9, instantDecode10, instantDecode11, instantDecode12, reader.e(jD));
                }
                switch (iG) {
                    case 2:
                        instantDecode13 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 3:
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                        continue;
                    case 4:
                        instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 5:
                        instantDecode3 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 6:
                        instantDecode4 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 7:
                        instantDecode5 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 8:
                        instantDecode6 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 9:
                        instantDecode7 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 10:
                        arrayList.add(ProtoAdapter.INT32.decode(reader));
                        break;
                    case 11:
                        instantDecode8 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 12:
                        instantDecode9 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 13:
                        instantDecode10 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 14:
                        instantDecode11 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 15:
                        instantDecode12 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
                instantDecode = instant;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, v5 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getChargeState_timestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 2, value.getChargeState_timestamp());
            }
            if (value.getClimateState_timestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 3, value.getClimateState_timestamp());
            }
            if (value.getClosuresState_timestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 4, value.getClosuresState_timestamp());
            }
            if (value.getDriveState_timestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 5, value.getDriveState_timestamp());
            }
            if (value.getGuiSettings_timestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 6, value.getGuiSettings_timestamp());
            }
            if (value.getLocationState_timestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 7, value.getLocationState_timestamp());
            }
            if (value.getVehicleConfig_timestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 8, value.getVehicleConfig_timestamp());
            }
            if (value.getVehicleState_timestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 9, value.getVehicleState_timestamp());
            }
            ProtoAdapter.INT32.asPacked().encodeWithTag(writer, 10, value.h());
            if (value.getParkedAccessoryState_timestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 11, value.getParkedAccessoryState_timestamp());
            }
            if (value.getChargeScheduleState_timestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 12, value.getChargeScheduleState_timestamp());
            }
            if (value.getPreconditioningScheduleState_timestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 13, value.getPreconditioningScheduleState_timestamp());
            }
            if (value.getAlertState_timestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 14, value.getAlertState_timestamp());
            }
            if (value.getSuspensionState_timestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 15, value.getSuspensionState_timestamp());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(v5 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getChargeState_timestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getChargeState_timestamp());
            }
            if (value.getClimateState_timestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getClimateState_timestamp());
            }
            if (value.getClosuresState_timestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getClosuresState_timestamp());
            }
            if (value.getDriveState_timestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.getDriveState_timestamp());
            }
            if (value.getGuiSettings_timestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(6, value.getGuiSettings_timestamp());
            }
            if (value.getLocationState_timestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(7, value.getLocationState_timestamp());
            }
            if (value.getVehicleConfig_timestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(8, value.getVehicleConfig_timestamp());
            }
            if (value.getVehicleState_timestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(9, value.getVehicleState_timestamp());
            }
            int iEncodedSizeWithTag = iD + ProtoAdapter.INT32.asPacked().encodedSizeWithTag(10, value.h());
            if (value.getParkedAccessoryState_timestamp() != null) {
                iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(11, value.getParkedAccessoryState_timestamp());
            }
            if (value.getChargeScheduleState_timestamp() != null) {
                iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(12, value.getChargeScheduleState_timestamp());
            }
            if (value.getPreconditioningScheduleState_timestamp() != null) {
                iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(13, value.getPreconditioningScheduleState_timestamp());
            }
            if (value.getAlertState_timestamp() != null) {
                iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(14, value.getAlertState_timestamp());
            }
            return value.getSuspensionState_timestamp() != null ? iEncodedSizeWithTag + ProtoAdapter.INSTANT.encodedSizeWithTag(15, value.getSuspensionState_timestamp()) : iEncodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public v5 redact(v5 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            Instant chargeState_timestamp = value.getChargeState_timestamp();
            Instant instantRedact = chargeState_timestamp != null ? ProtoAdapter.INSTANT.redact(chargeState_timestamp) : null;
            Instant climateState_timestamp = value.getClimateState_timestamp();
            Instant instantRedact2 = climateState_timestamp != null ? ProtoAdapter.INSTANT.redact(climateState_timestamp) : null;
            Instant closuresState_timestamp = value.getClosuresState_timestamp();
            Instant instantRedact3 = closuresState_timestamp != null ? ProtoAdapter.INSTANT.redact(closuresState_timestamp) : null;
            Instant driveState_timestamp = value.getDriveState_timestamp();
            Instant instantRedact4 = driveState_timestamp != null ? ProtoAdapter.INSTANT.redact(driveState_timestamp) : null;
            Instant guiSettings_timestamp = value.getGuiSettings_timestamp();
            Instant instantRedact5 = guiSettings_timestamp != null ? ProtoAdapter.INSTANT.redact(guiSettings_timestamp) : null;
            Instant locationState_timestamp = value.getLocationState_timestamp();
            Instant instantRedact6 = locationState_timestamp != null ? ProtoAdapter.INSTANT.redact(locationState_timestamp) : null;
            Instant vehicleConfig_timestamp = value.getVehicleConfig_timestamp();
            Instant instantRedact7 = vehicleConfig_timestamp != null ? ProtoAdapter.INSTANT.redact(vehicleConfig_timestamp) : null;
            Instant vehicleState_timestamp = value.getVehicleState_timestamp();
            Instant instantRedact8 = vehicleState_timestamp != null ? ProtoAdapter.INSTANT.redact(vehicleState_timestamp) : null;
            Instant parkedAccessoryState_timestamp = value.getParkedAccessoryState_timestamp();
            Instant instantRedact9 = parkedAccessoryState_timestamp != null ? ProtoAdapter.INSTANT.redact(parkedAccessoryState_timestamp) : null;
            Instant chargeScheduleState_timestamp = value.getChargeScheduleState_timestamp();
            Instant instantRedact10 = chargeScheduleState_timestamp != null ? ProtoAdapter.INSTANT.redact(chargeScheduleState_timestamp) : null;
            Instant preconditioningScheduleState_timestamp = value.getPreconditioningScheduleState_timestamp();
            Instant instantRedact11 = preconditioningScheduleState_timestamp != null ? ProtoAdapter.INSTANT.redact(preconditioningScheduleState_timestamp) : null;
            Instant alertState_timestamp = value.getAlertState_timestamp();
            Instant instantRedact12 = alertState_timestamp != null ? ProtoAdapter.INSTANT.redact(alertState_timestamp) : null;
            Instant suspensionState_timestamp = value.getSuspensionState_timestamp();
            return v5.b(value, instantRedact, instantRedact2, instantRedact3, instantRedact4, instantRedact5, instantRedact6, instantRedact7, instantRedact8, null, instantRedact9, instantRedact10, instantRedact11, instantRedact12, suspensionState_timestamp != null ? ProtoAdapter.INSTANT.redact(suspensionState_timestamp) : null, okio.k.f97943e, 256, null);
        }
    }

    public v5() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ v5 b(v5 v5Var, Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, Instant instant6, Instant instant7, Instant instant8, List list, Instant instant9, Instant instant10, Instant instant11, Instant instant12, Instant instant13, okio.k kVar, int i11, Object obj) {
        return v5Var.a((i11 & 1) != 0 ? v5Var.ChargeState_timestamp : instant, (i11 & 2) != 0 ? v5Var.ClimateState_timestamp : instant2, (i11 & 4) != 0 ? v5Var.ClosuresState_timestamp : instant3, (i11 & 8) != 0 ? v5Var.DriveState_timestamp : instant4, (i11 & 16) != 0 ? v5Var.GuiSettings_timestamp : instant5, (i11 & 32) != 0 ? v5Var.LocationState_timestamp : instant6, (i11 & 64) != 0 ? v5Var.VehicleConfig_timestamp : instant7, (i11 & 128) != 0 ? v5Var.VehicleState_timestamp : instant8, (i11 & 256) != 0 ? v5Var.decryption_error_field : list, (i11 & 512) != 0 ? v5Var.ParkedAccessoryState_timestamp : instant9, (i11 & 1024) != 0 ? v5Var.ChargeScheduleState_timestamp : instant10, (i11 & 2048) != 0 ? v5Var.PreconditioningScheduleState_timestamp : instant11, (i11 & 4096) != 0 ? v5Var.AlertState_timestamp : instant12, (i11 & PKIFailureInfo.certRevoked) != 0 ? v5Var.SuspensionState_timestamp : instant13, (i11 & 16384) != 0 ? v5Var.unknownFields() : kVar);
    }

    public final v5 a(Instant ChargeState_timestamp, Instant ClimateState_timestamp, Instant ClosuresState_timestamp, Instant DriveState_timestamp, Instant GuiSettings_timestamp, Instant LocationState_timestamp, Instant VehicleConfig_timestamp, Instant VehicleState_timestamp, List<Integer> decryption_error_field, Instant ParkedAccessoryState_timestamp, Instant ChargeScheduleState_timestamp, Instant PreconditioningScheduleState_timestamp, Instant AlertState_timestamp, Instant SuspensionState_timestamp, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(decryption_error_field, "decryption_error_field");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new v5(ChargeState_timestamp, ClimateState_timestamp, ClosuresState_timestamp, DriveState_timestamp, GuiSettings_timestamp, LocationState_timestamp, VehicleConfig_timestamp, VehicleState_timestamp, decryption_error_field, ParkedAccessoryState_timestamp, ChargeScheduleState_timestamp, PreconditioningScheduleState_timestamp, AlertState_timestamp, SuspensionState_timestamp, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Instant getAlertState_timestamp() {
        return this.AlertState_timestamp;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Instant getChargeScheduleState_timestamp() {
        return this.ChargeScheduleState_timestamp;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Instant getChargeState_timestamp() {
        return this.ChargeState_timestamp;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof v5)) {
            return false;
        }
        v5 v5Var = (v5) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), v5Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.ChargeState_timestamp, v5Var.ChargeState_timestamp) && p013kotlin.jvm.internal.s.f(this.ClimateState_timestamp, v5Var.ClimateState_timestamp) && p013kotlin.jvm.internal.s.f(this.ClosuresState_timestamp, v5Var.ClosuresState_timestamp) && p013kotlin.jvm.internal.s.f(this.DriveState_timestamp, v5Var.DriveState_timestamp) && p013kotlin.jvm.internal.s.f(this.GuiSettings_timestamp, v5Var.GuiSettings_timestamp) && p013kotlin.jvm.internal.s.f(this.LocationState_timestamp, v5Var.LocationState_timestamp) && p013kotlin.jvm.internal.s.f(this.VehicleConfig_timestamp, v5Var.VehicleConfig_timestamp) && p013kotlin.jvm.internal.s.f(this.VehicleState_timestamp, v5Var.VehicleState_timestamp) && p013kotlin.jvm.internal.s.f(this.decryption_error_field, v5Var.decryption_error_field) && p013kotlin.jvm.internal.s.f(this.ParkedAccessoryState_timestamp, v5Var.ParkedAccessoryState_timestamp) && p013kotlin.jvm.internal.s.f(this.ChargeScheduleState_timestamp, v5Var.ChargeScheduleState_timestamp) && p013kotlin.jvm.internal.s.f(this.PreconditioningScheduleState_timestamp, v5Var.PreconditioningScheduleState_timestamp) && p013kotlin.jvm.internal.s.f(this.AlertState_timestamp, v5Var.AlertState_timestamp) && p013kotlin.jvm.internal.s.f(this.SuspensionState_timestamp, v5Var.SuspensionState_timestamp);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Instant getClimateState_timestamp() {
        return this.ClimateState_timestamp;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Instant getClosuresState_timestamp() {
        return this.ClosuresState_timestamp;
    }

    public final List<Integer> h() {
        return this.decryption_error_field;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Instant instant = this.ChargeState_timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.ClimateState_timestamp;
        int iHashCode3 = (iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Instant instant3 = this.ClosuresState_timestamp;
        int iHashCode4 = (iHashCode3 + (instant3 != null ? instant3.hashCode() : 0)) * 37;
        Instant instant4 = this.DriveState_timestamp;
        int iHashCode5 = (iHashCode4 + (instant4 != null ? instant4.hashCode() : 0)) * 37;
        Instant instant5 = this.GuiSettings_timestamp;
        int iHashCode6 = (iHashCode5 + (instant5 != null ? instant5.hashCode() : 0)) * 37;
        Instant instant6 = this.LocationState_timestamp;
        int iHashCode7 = (iHashCode6 + (instant6 != null ? instant6.hashCode() : 0)) * 37;
        Instant instant7 = this.VehicleConfig_timestamp;
        int iHashCode8 = (iHashCode7 + (instant7 != null ? instant7.hashCode() : 0)) * 37;
        Instant instant8 = this.VehicleState_timestamp;
        int iHashCode9 = (((iHashCode8 + (instant8 != null ? instant8.hashCode() : 0)) * 37) + this.decryption_error_field.hashCode()) * 37;
        Instant instant9 = this.ParkedAccessoryState_timestamp;
        int iHashCode10 = (iHashCode9 + (instant9 != null ? instant9.hashCode() : 0)) * 37;
        Instant instant10 = this.ChargeScheduleState_timestamp;
        int iHashCode11 = (iHashCode10 + (instant10 != null ? instant10.hashCode() : 0)) * 37;
        Instant instant11 = this.PreconditioningScheduleState_timestamp;
        int iHashCode12 = (iHashCode11 + (instant11 != null ? instant11.hashCode() : 0)) * 37;
        Instant instant12 = this.AlertState_timestamp;
        int iHashCode13 = (iHashCode12 + (instant12 != null ? instant12.hashCode() : 0)) * 37;
        Instant instant13 = this.SuspensionState_timestamp;
        int iHashCode14 = iHashCode13 + (instant13 != null ? instant13.hashCode() : 0);
        this.hashCode = iHashCode14;
        return iHashCode14;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Instant getDriveState_timestamp() {
        return this.DriveState_timestamp;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Instant getGuiSettings_timestamp() {
        return this.GuiSettings_timestamp;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Instant getLocationState_timestamp() {
        return this.LocationState_timestamp;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Instant getParkedAccessoryState_timestamp() {
        return this.ParkedAccessoryState_timestamp;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Instant getPreconditioningScheduleState_timestamp() {
        return this.PreconditioningScheduleState_timestamp;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Instant getSuspensionState_timestamp() {
        return this.SuspensionState_timestamp;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m355newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Instant getVehicleConfig_timestamp() {
        return this.VehicleConfig_timestamp;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Instant getVehicleState_timestamp() {
        return this.VehicleState_timestamp;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Instant instant = this.ChargeState_timestamp;
        if (instant != null) {
            arrayList.add("ChargeState_timestamp=" + instant);
        }
        Instant instant2 = this.ClimateState_timestamp;
        if (instant2 != null) {
            arrayList.add("ClimateState_timestamp=" + instant2);
        }
        Instant instant3 = this.ClosuresState_timestamp;
        if (instant3 != null) {
            arrayList.add("ClosuresState_timestamp=" + instant3);
        }
        Instant instant4 = this.DriveState_timestamp;
        if (instant4 != null) {
            arrayList.add("DriveState_timestamp=" + instant4);
        }
        Instant instant5 = this.GuiSettings_timestamp;
        if (instant5 != null) {
            arrayList.add("GuiSettings_timestamp=" + instant5);
        }
        Instant instant6 = this.LocationState_timestamp;
        if (instant6 != null) {
            arrayList.add("LocationState_timestamp=" + instant6);
        }
        Instant instant7 = this.VehicleConfig_timestamp;
        if (instant7 != null) {
            arrayList.add("VehicleConfig_timestamp=" + instant7);
        }
        Instant instant8 = this.VehicleState_timestamp;
        if (instant8 != null) {
            arrayList.add("VehicleState_timestamp=" + instant8);
        }
        if (!this.decryption_error_field.isEmpty()) {
            arrayList.add("decryption_error_field=" + this.decryption_error_field);
        }
        Instant instant9 = this.ParkedAccessoryState_timestamp;
        if (instant9 != null) {
            arrayList.add("ParkedAccessoryState_timestamp=" + instant9);
        }
        Instant instant10 = this.ChargeScheduleState_timestamp;
        if (instant10 != null) {
            arrayList.add("ChargeScheduleState_timestamp=" + instant10);
        }
        Instant instant11 = this.PreconditioningScheduleState_timestamp;
        if (instant11 != null) {
            arrayList.add("PreconditioningScheduleState_timestamp=" + instant11);
        }
        Instant instant12 = this.AlertState_timestamp;
        if (instant12 != null) {
            arrayList.add("AlertState_timestamp=" + instant12);
        }
        Instant instant13 = this.SuspensionState_timestamp;
        if (instant13 != null) {
            arrayList.add("SuspensionState_timestamp=" + instant13);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "VehicleDataAck{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ v5(Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, Instant instant6, Instant instant7, Instant instant8, List list, Instant instant9, Instant instant10, Instant instant11, Instant instant12, Instant instant13, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : instant, (i11 & 2) != 0 ? null : instant2, (i11 & 4) != 0 ? null : instant3, (i11 & 8) != 0 ? null : instant4, (i11 & 16) != 0 ? null : instant5, (i11 & 32) != 0 ? null : instant6, (i11 & 64) != 0 ? null : instant7, (i11 & 128) != 0 ? null : instant8, (i11 & 256) != 0 ? p013kotlin.collections.v.m() : list, (i11 & 512) != 0 ? null : instant9, (i11 & 1024) != 0 ? null : instant10, (i11 & 2048) != 0 ? null : instant11, (i11 & 4096) != 0 ? null : instant12, (i11 & PKIFailureInfo.certRevoked) == 0 ? instant13 : null, (i11 & 16384) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m355newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, Instant instant6, Instant instant7, Instant instant8, List<Integer> decryption_error_field, Instant instant9, Instant instant10, Instant instant11, Instant instant12, Instant instant13, okio.k unknownFields) {
        super(f65525p, unknownFields);
        p013kotlin.jvm.internal.s.k(decryption_error_field, "decryption_error_field");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.ChargeState_timestamp = instant;
        this.ClimateState_timestamp = instant2;
        this.ClosuresState_timestamp = instant3;
        this.DriveState_timestamp = instant4;
        this.GuiSettings_timestamp = instant5;
        this.LocationState_timestamp = instant6;
        this.VehicleConfig_timestamp = instant7;
        this.VehicleState_timestamp = instant8;
        this.ParkedAccessoryState_timestamp = instant9;
        this.ChargeScheduleState_timestamp = instant10;
        this.PreconditioningScheduleState_timestamp = instant11;
        this.AlertState_timestamp = instant12;
        this.SuspensionState_timestamp = instant13;
        this.decryption_error_field = x20.d.g("decryption_error_field", decryption_error_field);
    }
}
