package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JG\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b!\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lgc0/f0;", "Lcom/squareup/wire/f;", "", "Lgc0/e;", "charge_on_solar_state", "", "charge_on_solar_gateway_din", "tesla_electric_asset_id", "", "minutes_to_lower_limit", "Lokio/k;", "unknownFields", "<init>", "(Lgc0/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Lgc0/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lokio/k;)Lgc0/f0;", "Lgc0/e;", DateTokenConverter.CONVERTER_KEY, "()Lgc0/e;", "b", "Ljava/lang/String;", "c", "f", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<f0> f68044f = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(f0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeOnSolarState#ADAPTER", jsonName = "chargeOnSolarState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final e charge_on_solar_state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "chargeOnSolarGatewayDin", tag = 2)
    private final String charge_on_solar_gateway_din;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "teslaElectricAssetId", tag = 3)
    private final String tesla_electric_asset_id;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "minutesToLowerLimit", tag = 4)
    private final Integer minutes_to_lower_limit;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/f0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/f0;", "value", "", "c", "(Lgc0/f0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/f0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/f0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/f0;)Lgc0/f0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<f0> {
        a(com.squareup.wire.b bVar, co0.d<f0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ManagedChargingState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            e eVarDecode = null;
            String strDecode = null;
            String strDecode2 = null;
            Integer numDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new f0(eVarDecode, strDecode, strDecode2, numDecode, reader.e(jD));
                }
                if (iG == 1) {
                    eVarDecode = e.f68002j.decode(reader);
                } else if (iG == 2) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iG == 3) {
                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                } else if (iG != 4) {
                    reader.m(iG);
                } else {
                    numDecode = ProtoAdapter.INT32.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, f0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getCharge_on_solar_state() != null) {
                e.f68002j.encodeWithTag(writer, 1, value.getCharge_on_solar_state());
            }
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(writer, 2, value.getCharge_on_solar_gateway_din());
            protoAdapter.encodeWithTag(writer, 3, value.getTesla_electric_asset_id());
            ProtoAdapter.INT32.encodeWithTag(writer, 4, value.getMinutes_to_lower_limit());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(f0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getCharge_on_solar_state() != null) {
                iD += e.f68002j.encodedSizeWithTag(1, value.getCharge_on_solar_state());
            }
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iD + protoAdapter.encodedSizeWithTag(2, value.getCharge_on_solar_gateway_din()) + protoAdapter.encodedSizeWithTag(3, value.getTesla_electric_asset_id()) + ProtoAdapter.INT32.encodedSizeWithTag(4, value.getMinutes_to_lower_limit());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public f0 redact(f0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            e charge_on_solar_state = value.getCharge_on_solar_state();
            return f0.b(value, charge_on_solar_state != null ? e.f68002j.redact(charge_on_solar_state) : null, null, null, null, okio.k.f97943e, 14, null);
        }
    }

    public f0() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ f0 b(f0 f0Var, e eVar, String str, String str2, Integer num, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eVar = f0Var.charge_on_solar_state;
        }
        if ((i11 & 2) != 0) {
            str = f0Var.charge_on_solar_gateway_din;
        }
        if ((i11 & 4) != 0) {
            str2 = f0Var.tesla_electric_asset_id;
        }
        if ((i11 & 8) != 0) {
            num = f0Var.minutes_to_lower_limit;
        }
        if ((i11 & 16) != 0) {
            kVar = f0Var.unknownFields();
        }
        okio.k kVar2 = kVar;
        String str3 = str2;
        return f0Var.a(eVar, str, str3, num, kVar2);
    }

    public final f0 a(e charge_on_solar_state, String charge_on_solar_gateway_din, String tesla_electric_asset_id, Integer minutes_to_lower_limit, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new f0(charge_on_solar_state, charge_on_solar_gateway_din, tesla_electric_asset_id, minutes_to_lower_limit, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCharge_on_solar_gateway_din() {
        return this.charge_on_solar_gateway_din;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getCharge_on_solar_state() {
        return this.charge_on_solar_state;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getMinutes_to_lower_limit() {
        return this.minutes_to_lower_limit;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), f0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.charge_on_solar_state, f0Var.charge_on_solar_state) && p013kotlin.jvm.internal.s.f(this.charge_on_solar_gateway_din, f0Var.charge_on_solar_gateway_din) && p013kotlin.jvm.internal.s.f(this.tesla_electric_asset_id, f0Var.tesla_electric_asset_id) && p013kotlin.jvm.internal.s.f(this.minutes_to_lower_limit, f0Var.minutes_to_lower_limit);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTesla_electric_asset_id() {
        return this.tesla_electric_asset_id;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        e eVar = this.charge_on_solar_state;
        int iHashCode2 = (iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 37;
        String str = this.charge_on_solar_gateway_din;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.tesla_electric_asset_id;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.minutes_to_lower_limit;
        int iHashCode5 = iHashCode4 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m399newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        e eVar = this.charge_on_solar_state;
        if (eVar != null) {
            arrayList.add("charge_on_solar_state=" + eVar);
        }
        String str = this.charge_on_solar_gateway_din;
        if (str != null) {
            arrayList.add("charge_on_solar_gateway_din=" + x20.d.i(str));
        }
        String str2 = this.tesla_electric_asset_id;
        if (str2 != null) {
            arrayList.add("tesla_electric_asset_id=" + x20.d.i(str2));
        }
        Integer num = this.minutes_to_lower_limit;
        if (num != null) {
            arrayList.add("minutes_to_lower_limit=" + num);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "ManagedChargingState{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ f0(e eVar, String str, String str2, Integer num, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : eVar, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m399newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e eVar, String str, String str2, Integer num, okio.k unknownFields) {
        super(f68044f, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.charge_on_solar_state = eVar;
        this.charge_on_solar_gateway_din = str;
        this.tesla_electric_asset_id = str2;
        this.minutes_to_lower_limit = num;
    }
}
