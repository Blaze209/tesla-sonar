package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B½\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%JÃ\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\"R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\"R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010\"R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010\"R\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b5\u0010\"R\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b6\u0010\"R\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b7\u0010\"R\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b8\u0010\"R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010,\u001a\u0004\b9\u0010\"R\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010,\u001a\u0004\b:\u0010\"R\u001a\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b0\u0010\"R\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010,\u001a\u0004\b;\u0010\"R\u001a\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b.\u0010\"R\u001a\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b<\u0010\"R\u001a\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010,\u001a\u0004\b3\u0010\"¨\u0006="}, d2 = {"Lfc0/x5;", "Lcom/squareup/wire/f;", "", "Lfc0/z2;", "piiKeyRequest", "", "subscription_duration_s", "subscription_ping_s", "ChargeState_max_update_rate_ms", "ClimateState_max_update_rate_ms", "ClosuresState_max_update_rate_ms", "DriveState_max_update_rate_ms", "GuiSettings_max_update_rate_ms", "LocationState_max_update_rate_ms", "VehicleConfig_max_update_rate_ms", "VehicleState_max_update_rate_ms", "ParkedAccessoryState_max_update_rate_ms", "ChargeScheduleState_max_update_rate_ms", "PreconditioningScheduleState_max_update_rate_ms", "AlertState_max_update_rate_ms", "SuspensionState_max_update_rate_ms", "ChildPresenceDetectionState_max_update_rate_ms", "Lokio/k;", "unknownFields", "<init>", "(Lfc0/z2;IIIIIIIIIIIIIIIILokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lfc0/z2;IIIIIIIIIIIIIIIILokio/k;)Lfc0/x5;", "Lfc0/z2;", "m", "()Lfc0/z2;", "b", "I", "o", "c", "p", DateTokenConverter.CONVERTER_KEY, "e", "g", "f", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "r", "s", "l", "n", "q", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x5 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ProtoAdapter<x5> f65592s = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(x5.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.PiiKeyRequest#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 13)
    private final z2 piiKeyRequest;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "subscriptionDurationS", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final int subscription_duration_s;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "subscriptionPingS", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 12)
    private final int subscription_ping_s;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "ChargeStateMaxUpdateRateMs", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final int ChargeState_max_update_rate_ms;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "ClimateStateMaxUpdateRateMs", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final int ClimateState_max_update_rate_ms;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "ClosuresStateMaxUpdateRateMs", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 11)
    private final int ClosuresState_max_update_rate_ms;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "DriveStateMaxUpdateRateMs", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final int DriveState_max_update_rate_ms;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "GuiSettingsMaxUpdateRateMs", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final int GuiSettings_max_update_rate_ms;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "LocationStateMaxUpdateRateMs", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 10)
    private final int LocationState_max_update_rate_ms;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "VehicleConfigMaxUpdateRateMs", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 9)
    private final int VehicleConfig_max_update_rate_ms;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "VehicleStateMaxUpdateRateMs", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final int VehicleState_max_update_rate_ms;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "ParkedAccessoryStateMaxUpdateRateMs", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 14)
    private final int ParkedAccessoryState_max_update_rate_ms;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "ChargeScheduleStateMaxUpdateRateMs", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 15)
    private final int ChargeScheduleState_max_update_rate_ms;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "PreconditioningScheduleStateMaxUpdateRateMs", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 16)
    private final int PreconditioningScheduleState_max_update_rate_ms;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "AlertStateMaxUpdateRateMs", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 17)
    private final int AlertState_max_update_rate_ms;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "SuspensionStateMaxUpdateRateMs", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 18)
    private final int SuspensionState_max_update_rate_ms;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "ChildPresenceDetectionStateMaxUpdateRateMs", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 19)
    private final int ChildPresenceDetectionState_max_update_rate_ms;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/x5$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/x5;", "value", "", "c", "(Lfc0/x5;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/x5;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/x5;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/x5;)Lfc0/x5;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<x5> {
        a(com.squareup.wire.b bVar, co0.d<x5> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleDataSubscription", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public x5 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            z2 z2VarDecode = null;
            int iIntValue = 0;
            int iIntValue2 = 0;
            int iIntValue3 = 0;
            int iIntValue4 = 0;
            int iIntValue5 = 0;
            int iIntValue6 = 0;
            int iIntValue7 = 0;
            int iIntValue8 = 0;
            int iIntValue9 = 0;
            int iIntValue10 = 0;
            int iIntValue11 = 0;
            int iIntValue12 = 0;
            int iIntValue13 = 0;
            int iIntValue14 = 0;
            int iIntValue15 = 0;
            int iIntValue16 = 0;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new x5(z2VarDecode, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, iIntValue8, iIntValue9, iIntValue10, iIntValue11, iIntValue12, iIntValue13, iIntValue14, iIntValue15, iIntValue16, reader.e(jD));
                }
                switch (iG) {
                    case 3:
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 4:
                        iIntValue7 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 5:
                        iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 6:
                        iIntValue4 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 7:
                        iIntValue6 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 8:
                        iIntValue10 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 9:
                        iIntValue9 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 10:
                        iIntValue8 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 11:
                        iIntValue5 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 12:
                        iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 13:
                        z2VarDecode = z2.f65648d.decode(reader);
                        break;
                    case 14:
                        iIntValue11 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 15:
                        iIntValue12 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 16:
                        iIntValue13 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 17:
                        iIntValue14 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 18:
                        iIntValue15 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 19:
                        iIntValue16 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, x5 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getPiiKeyRequest() != null) {
                z2.f65648d.encodeWithTag(writer, 13, value.getPiiKeyRequest());
            }
            if (value.getSubscription_duration_s() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getSubscription_duration_s()));
            }
            if (value.getSubscription_ping_s() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 12, Integer.valueOf(value.getSubscription_ping_s()));
            }
            if (value.getChargeState_max_update_rate_ms() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 5, Integer.valueOf(value.getChargeState_max_update_rate_ms()));
            }
            if (value.getClimateState_max_update_rate_ms() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 6, Integer.valueOf(value.getClimateState_max_update_rate_ms()));
            }
            if (value.getClosuresState_max_update_rate_ms() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 11, Integer.valueOf(value.getClosuresState_max_update_rate_ms()));
            }
            if (value.getDriveState_max_update_rate_ms() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 7, Integer.valueOf(value.getDriveState_max_update_rate_ms()));
            }
            if (value.getGuiSettings_max_update_rate_ms() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 4, Integer.valueOf(value.getGuiSettings_max_update_rate_ms()));
            }
            if (value.getLocationState_max_update_rate_ms() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 10, Integer.valueOf(value.getLocationState_max_update_rate_ms()));
            }
            if (value.getVehicleConfig_max_update_rate_ms() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 9, Integer.valueOf(value.getVehicleConfig_max_update_rate_ms()));
            }
            if (value.getVehicleState_max_update_rate_ms() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 8, Integer.valueOf(value.getVehicleState_max_update_rate_ms()));
            }
            if (value.getParkedAccessoryState_max_update_rate_ms() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 14, Integer.valueOf(value.getParkedAccessoryState_max_update_rate_ms()));
            }
            if (value.getChargeScheduleState_max_update_rate_ms() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 15, Integer.valueOf(value.getChargeScheduleState_max_update_rate_ms()));
            }
            if (value.getPreconditioningScheduleState_max_update_rate_ms() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 16, Integer.valueOf(value.getPreconditioningScheduleState_max_update_rate_ms()));
            }
            if (value.getAlertState_max_update_rate_ms() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 17, Integer.valueOf(value.getAlertState_max_update_rate_ms()));
            }
            if (value.getSuspensionState_max_update_rate_ms() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 18, Integer.valueOf(value.getSuspensionState_max_update_rate_ms()));
            }
            if (value.getChildPresenceDetectionState_max_update_rate_ms() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 19, Integer.valueOf(value.getChildPresenceDetectionState_max_update_rate_ms()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(x5 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getPiiKeyRequest() != null) {
                iD += z2.f65648d.encodedSizeWithTag(13, value.getPiiKeyRequest());
            }
            if (value.getSubscription_duration_s() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getSubscription_duration_s()));
            }
            if (value.getSubscription_ping_s() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(12, Integer.valueOf(value.getSubscription_ping_s()));
            }
            if (value.getChargeState_max_update_rate_ms() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getChargeState_max_update_rate_ms()));
            }
            if (value.getClimateState_max_update_rate_ms() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getClimateState_max_update_rate_ms()));
            }
            if (value.getClosuresState_max_update_rate_ms() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(11, Integer.valueOf(value.getClosuresState_max_update_rate_ms()));
            }
            if (value.getDriveState_max_update_rate_ms() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getDriveState_max_update_rate_ms()));
            }
            if (value.getGuiSettings_max_update_rate_ms() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getGuiSettings_max_update_rate_ms()));
            }
            if (value.getLocationState_max_update_rate_ms() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(10, Integer.valueOf(value.getLocationState_max_update_rate_ms()));
            }
            if (value.getVehicleConfig_max_update_rate_ms() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(9, Integer.valueOf(value.getVehicleConfig_max_update_rate_ms()));
            }
            if (value.getVehicleState_max_update_rate_ms() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(8, Integer.valueOf(value.getVehicleState_max_update_rate_ms()));
            }
            if (value.getParkedAccessoryState_max_update_rate_ms() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(14, Integer.valueOf(value.getParkedAccessoryState_max_update_rate_ms()));
            }
            if (value.getChargeScheduleState_max_update_rate_ms() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(15, Integer.valueOf(value.getChargeScheduleState_max_update_rate_ms()));
            }
            if (value.getPreconditioningScheduleState_max_update_rate_ms() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(16, Integer.valueOf(value.getPreconditioningScheduleState_max_update_rate_ms()));
            }
            if (value.getAlertState_max_update_rate_ms() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(17, Integer.valueOf(value.getAlertState_max_update_rate_ms()));
            }
            if (value.getSuspensionState_max_update_rate_ms() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(18, Integer.valueOf(value.getSuspensionState_max_update_rate_ms()));
            }
            return value.getChildPresenceDetectionState_max_update_rate_ms() != 0 ? iD + ProtoAdapter.INT32.encodedSizeWithTag(19, Integer.valueOf(value.getChildPresenceDetectionState_max_update_rate_ms())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public x5 redact(x5 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            z2 piiKeyRequest = value.getPiiKeyRequest();
            return x5.b(value, piiKeyRequest != null ? z2.f65648d.redact(piiKeyRequest) : null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, okio.k.f97943e, 131070, null);
        }
    }

    public x5() {
        this(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 262143, null);
    }

    public static /* synthetic */ x5 b(x5 x5Var, z2 z2Var, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27, okio.k kVar, int i28, Object obj) {
        return x5Var.a((i28 & 1) != 0 ? x5Var.piiKeyRequest : z2Var, (i28 & 2) != 0 ? x5Var.subscription_duration_s : i11, (i28 & 4) != 0 ? x5Var.subscription_ping_s : i12, (i28 & 8) != 0 ? x5Var.ChargeState_max_update_rate_ms : i13, (i28 & 16) != 0 ? x5Var.ClimateState_max_update_rate_ms : i14, (i28 & 32) != 0 ? x5Var.ClosuresState_max_update_rate_ms : i15, (i28 & 64) != 0 ? x5Var.DriveState_max_update_rate_ms : i16, (i28 & 128) != 0 ? x5Var.GuiSettings_max_update_rate_ms : i17, (i28 & 256) != 0 ? x5Var.LocationState_max_update_rate_ms : i18, (i28 & 512) != 0 ? x5Var.VehicleConfig_max_update_rate_ms : i19, (i28 & 1024) != 0 ? x5Var.VehicleState_max_update_rate_ms : i21, (i28 & 2048) != 0 ? x5Var.ParkedAccessoryState_max_update_rate_ms : i22, (i28 & 4096) != 0 ? x5Var.ChargeScheduleState_max_update_rate_ms : i23, (i28 & PKIFailureInfo.certRevoked) != 0 ? x5Var.PreconditioningScheduleState_max_update_rate_ms : i24, (i28 & 16384) != 0 ? x5Var.AlertState_max_update_rate_ms : i25, (i28 & 32768) != 0 ? x5Var.SuspensionState_max_update_rate_ms : i26, (i28 & 65536) != 0 ? x5Var.ChildPresenceDetectionState_max_update_rate_ms : i27, (i28 & 131072) != 0 ? x5Var.unknownFields() : kVar);
    }

    public final x5 a(z2 piiKeyRequest, int subscription_duration_s, int subscription_ping_s, int ChargeState_max_update_rate_ms, int ClimateState_max_update_rate_ms, int ClosuresState_max_update_rate_ms, int DriveState_max_update_rate_ms, int GuiSettings_max_update_rate_ms, int LocationState_max_update_rate_ms, int VehicleConfig_max_update_rate_ms, int VehicleState_max_update_rate_ms, int ParkedAccessoryState_max_update_rate_ms, int ChargeScheduleState_max_update_rate_ms, int PreconditioningScheduleState_max_update_rate_ms, int AlertState_max_update_rate_ms, int SuspensionState_max_update_rate_ms, int ChildPresenceDetectionState_max_update_rate_ms, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new x5(piiKeyRequest, subscription_duration_s, subscription_ping_s, ChargeState_max_update_rate_ms, ClimateState_max_update_rate_ms, ClosuresState_max_update_rate_ms, DriveState_max_update_rate_ms, GuiSettings_max_update_rate_ms, LocationState_max_update_rate_ms, VehicleConfig_max_update_rate_ms, VehicleState_max_update_rate_ms, ParkedAccessoryState_max_update_rate_ms, ChargeScheduleState_max_update_rate_ms, PreconditioningScheduleState_max_update_rate_ms, AlertState_max_update_rate_ms, SuspensionState_max_update_rate_ms, ChildPresenceDetectionState_max_update_rate_ms, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getAlertState_max_update_rate_ms() {
        return this.AlertState_max_update_rate_ms;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getChargeScheduleState_max_update_rate_ms() {
        return this.ChargeScheduleState_max_update_rate_ms;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getChargeState_max_update_rate_ms() {
        return this.ChargeState_max_update_rate_ms;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof x5)) {
            return false;
        }
        x5 x5Var = (x5) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), x5Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.piiKeyRequest, x5Var.piiKeyRequest) && this.subscription_duration_s == x5Var.subscription_duration_s && this.subscription_ping_s == x5Var.subscription_ping_s && this.ChargeState_max_update_rate_ms == x5Var.ChargeState_max_update_rate_ms && this.ClimateState_max_update_rate_ms == x5Var.ClimateState_max_update_rate_ms && this.ClosuresState_max_update_rate_ms == x5Var.ClosuresState_max_update_rate_ms && this.DriveState_max_update_rate_ms == x5Var.DriveState_max_update_rate_ms && this.GuiSettings_max_update_rate_ms == x5Var.GuiSettings_max_update_rate_ms && this.LocationState_max_update_rate_ms == x5Var.LocationState_max_update_rate_ms && this.VehicleConfig_max_update_rate_ms == x5Var.VehicleConfig_max_update_rate_ms && this.VehicleState_max_update_rate_ms == x5Var.VehicleState_max_update_rate_ms && this.ParkedAccessoryState_max_update_rate_ms == x5Var.ParkedAccessoryState_max_update_rate_ms && this.ChargeScheduleState_max_update_rate_ms == x5Var.ChargeScheduleState_max_update_rate_ms && this.PreconditioningScheduleState_max_update_rate_ms == x5Var.PreconditioningScheduleState_max_update_rate_ms && this.AlertState_max_update_rate_ms == x5Var.AlertState_max_update_rate_ms && this.SuspensionState_max_update_rate_ms == x5Var.SuspensionState_max_update_rate_ms && this.ChildPresenceDetectionState_max_update_rate_ms == x5Var.ChildPresenceDetectionState_max_update_rate_ms;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getChildPresenceDetectionState_max_update_rate_ms() {
        return this.ChildPresenceDetectionState_max_update_rate_ms;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getClimateState_max_update_rate_ms() {
        return this.ClimateState_max_update_rate_ms;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getClosuresState_max_update_rate_ms() {
        return this.ClosuresState_max_update_rate_ms;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        z2 z2Var = this.piiKeyRequest;
        int iHashCode2 = ((((((((((((((((((((((((((((((((iHashCode + (z2Var != null ? z2Var.hashCode() : 0)) * 37) + Integer.hashCode(this.subscription_duration_s)) * 37) + Integer.hashCode(this.subscription_ping_s)) * 37) + Integer.hashCode(this.ChargeState_max_update_rate_ms)) * 37) + Integer.hashCode(this.ClimateState_max_update_rate_ms)) * 37) + Integer.hashCode(this.ClosuresState_max_update_rate_ms)) * 37) + Integer.hashCode(this.DriveState_max_update_rate_ms)) * 37) + Integer.hashCode(this.GuiSettings_max_update_rate_ms)) * 37) + Integer.hashCode(this.LocationState_max_update_rate_ms)) * 37) + Integer.hashCode(this.VehicleConfig_max_update_rate_ms)) * 37) + Integer.hashCode(this.VehicleState_max_update_rate_ms)) * 37) + Integer.hashCode(this.ParkedAccessoryState_max_update_rate_ms)) * 37) + Integer.hashCode(this.ChargeScheduleState_max_update_rate_ms)) * 37) + Integer.hashCode(this.PreconditioningScheduleState_max_update_rate_ms)) * 37) + Integer.hashCode(this.AlertState_max_update_rate_ms)) * 37) + Integer.hashCode(this.SuspensionState_max_update_rate_ms)) * 37) + Integer.hashCode(this.ChildPresenceDetectionState_max_update_rate_ms);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getDriveState_max_update_rate_ms() {
        return this.DriveState_max_update_rate_ms;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getGuiSettings_max_update_rate_ms() {
        return this.GuiSettings_max_update_rate_ms;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getLocationState_max_update_rate_ms() {
        return this.LocationState_max_update_rate_ms;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getParkedAccessoryState_max_update_rate_ms() {
        return this.ParkedAccessoryState_max_update_rate_ms;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final z2 getPiiKeyRequest() {
        return this.piiKeyRequest;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getPreconditioningScheduleState_max_update_rate_ms() {
        return this.PreconditioningScheduleState_max_update_rate_ms;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m370newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getSubscription_duration_s() {
        return this.subscription_duration_s;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getSubscription_ping_s() {
        return this.subscription_ping_s;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getSuspensionState_max_update_rate_ms() {
        return this.SuspensionState_max_update_rate_ms;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getVehicleConfig_max_update_rate_ms() {
        return this.VehicleConfig_max_update_rate_ms;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getVehicleState_max_update_rate_ms() {
        return this.VehicleState_max_update_rate_ms;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        z2 z2Var = this.piiKeyRequest;
        if (z2Var != null) {
            arrayList.add("piiKeyRequest=" + z2Var);
        }
        arrayList.add("subscription_duration_s=" + this.subscription_duration_s);
        arrayList.add("subscription_ping_s=" + this.subscription_ping_s);
        arrayList.add("ChargeState_max_update_rate_ms=" + this.ChargeState_max_update_rate_ms);
        arrayList.add("ClimateState_max_update_rate_ms=" + this.ClimateState_max_update_rate_ms);
        arrayList.add("ClosuresState_max_update_rate_ms=" + this.ClosuresState_max_update_rate_ms);
        arrayList.add("DriveState_max_update_rate_ms=" + this.DriveState_max_update_rate_ms);
        arrayList.add("GuiSettings_max_update_rate_ms=" + this.GuiSettings_max_update_rate_ms);
        arrayList.add("LocationState_max_update_rate_ms=" + this.LocationState_max_update_rate_ms);
        arrayList.add("VehicleConfig_max_update_rate_ms=" + this.VehicleConfig_max_update_rate_ms);
        arrayList.add("VehicleState_max_update_rate_ms=" + this.VehicleState_max_update_rate_ms);
        arrayList.add("ParkedAccessoryState_max_update_rate_ms=" + this.ParkedAccessoryState_max_update_rate_ms);
        arrayList.add("ChargeScheduleState_max_update_rate_ms=" + this.ChargeScheduleState_max_update_rate_ms);
        arrayList.add("PreconditioningScheduleState_max_update_rate_ms=" + this.PreconditioningScheduleState_max_update_rate_ms);
        arrayList.add("AlertState_max_update_rate_ms=" + this.AlertState_max_update_rate_ms);
        arrayList.add("SuspensionState_max_update_rate_ms=" + this.SuspensionState_max_update_rate_ms);
        arrayList.add("ChildPresenceDetectionState_max_update_rate_ms=" + this.ChildPresenceDetectionState_max_update_rate_ms);
        return p013kotlin.collections.v.y0(arrayList, ", ", "VehicleDataSubscription{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ x5(z2 z2Var, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27, okio.k kVar, int i28, DefaultConstructorMarker defaultConstructorMarker) {
        this((i28 & 1) != 0 ? null : z2Var, (i28 & 2) != 0 ? 0 : i11, (i28 & 4) != 0 ? 0 : i12, (i28 & 8) != 0 ? 0 : i13, (i28 & 16) != 0 ? 0 : i14, (i28 & 32) != 0 ? 0 : i15, (i28 & 64) != 0 ? 0 : i16, (i28 & 128) != 0 ? 0 : i17, (i28 & 256) != 0 ? 0 : i18, (i28 & 512) != 0 ? 0 : i19, (i28 & 1024) != 0 ? 0 : i21, (i28 & 2048) != 0 ? 0 : i22, (i28 & 4096) != 0 ? 0 : i23, (i28 & PKIFailureInfo.certRevoked) != 0 ? 0 : i24, (i28 & 16384) != 0 ? 0 : i25, (i28 & 32768) != 0 ? 0 : i26, (i28 & 65536) != 0 ? 0 : i27, (i28 & 131072) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m370newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(z2 z2Var, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27, okio.k unknownFields) {
        super(f65592s, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.piiKeyRequest = z2Var;
        this.subscription_duration_s = i11;
        this.subscription_ping_s = i12;
        this.ChargeState_max_update_rate_ms = i13;
        this.ClimateState_max_update_rate_ms = i14;
        this.ClosuresState_max_update_rate_ms = i15;
        this.DriveState_max_update_rate_ms = i16;
        this.GuiSettings_max_update_rate_ms = i17;
        this.LocationState_max_update_rate_ms = i18;
        this.VehicleConfig_max_update_rate_ms = i19;
        this.VehicleState_max_update_rate_ms = i21;
        this.ParkedAccessoryState_max_update_rate_ms = i22;
        this.ChargeScheduleState_max_update_rate_ms = i23;
        this.PreconditioningScheduleState_max_update_rate_ms = i24;
        this.AlertState_max_update_rate_ms = i25;
        this.SuspensionState_max_update_rate_ms = i26;
        this.ChildPresenceDetectionState_max_update_rate_ms = i27;
    }
}
