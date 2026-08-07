package mc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lmc0/g;", "Lcom/squareup/wire/f;", "", "Lmc0/i;", "configs", "Lmc0/d;", "charge_on_solar", "Lokio/k;", "unknownFields", "<init>", "(Lmc0/i;Lmc0/d;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lmc0/i;Lmc0/d;Lokio/k;)Lmc0/g;", "Lmc0/i;", "c", "()Lmc0/i;", "b", "Lmc0/d;", "()Lmc0/d;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<g> f91778d = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(g.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.managedcharging.SessionConfigs#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)
    private final i configs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.managedcharging.ChargeOnSolarResponse#ADAPTER", jsonName = "chargeOnSolar", label = q.a.OMIT_IDENTITY, tag = 2)
    private final d charge_on_solar;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"mc0/g$a", "Lcom/squareup/wire/ProtoAdapter;", "Lmc0/g;", "value", "", "c", "(Lmc0/g;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lmc0/g;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lmc0/g;", DateTokenConverter.CONVERTER_KEY, "(Lmc0/g;)Lmc0/g;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<g> {
        a(com.squareup.wire.b bVar, co0.d<g> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/ManagedCharging.ManageVehicleChargingResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g decode(k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            i iVarDecode = null;
            d dVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new g(iVarDecode, dVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    iVarDecode = i.f91786c.decode(reader);
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    dVarDecode = d.f91771d.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, g value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getConfigs() != null) {
                i.f91786c.encodeWithTag(writer, 1, value.getConfigs());
            }
            if (value.getCharge_on_solar() != null) {
                d.f91771d.encodeWithTag(writer, 2, value.getCharge_on_solar());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(g value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getConfigs() != null) {
                iD += i.f91786c.encodedSizeWithTag(1, value.getConfigs());
            }
            return value.getCharge_on_solar() != null ? iD + d.f91771d.encodedSizeWithTag(2, value.getCharge_on_solar()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public g redact(g value) {
            s.k(value, "value");
            i configs = value.getConfigs();
            i iVarRedact = configs != null ? i.f91786c.redact(configs) : null;
            d charge_on_solar = value.getCharge_on_solar();
            return value.a(iVarRedact, charge_on_solar != null ? d.f91771d.redact(charge_on_solar) : null, okio.k.f97943e);
        }
    }

    public g() {
        this(null, null, null, 7, null);
    }

    public final g a(i configs, d charge_on_solar, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new g(configs, charge_on_solar, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getCharge_on_solar() {
        return this.charge_on_solar;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i getConfigs() {
        return this.configs;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return s.f(unknownFields(), gVar.unknownFields()) && s.f(this.configs, gVar.configs) && s.f(this.charge_on_solar, gVar.charge_on_solar);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        i iVar = this.configs;
        int iHashCode2 = (iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 37;
        d dVar = this.charge_on_solar;
        int iHashCode3 = iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m596newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        i iVar = this.configs;
        if (iVar != null) {
            arrayList.add("configs=" + iVar);
        }
        d dVar = this.charge_on_solar;
        if (dVar != null) {
            arrayList.add("charge_on_solar=" + dVar);
        }
        return v.y0(arrayList, ", ", "ManageVehicleChargingResponse{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ g(i iVar, d dVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : iVar, (i11 & 2) != 0 ? null : dVar, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m596newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, d dVar, okio.k unknownFields) {
        super(f91778d, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.configs = iVar;
        this.charge_on_solar = dVar;
    }
}
