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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lmc0/h;", "Lcom/squareup/wire/f;", "", "Lmc0/f;", "error_response", "Lmc0/g;", "manage_vehicle_charging_response", "Lokio/k;", "unknownFields", "<init>", "(Lmc0/f;Lmc0/g;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lmc0/f;Lmc0/g;Lokio/k;)Lmc0/h;", "Lmc0/f;", "b", "()Lmc0/f;", "Lmc0/g;", "c", "()Lmc0/g;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<h> f91782d = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(h.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.managedcharging.ErrorResponse#ADAPTER", jsonName = "errorResponse", tag = 1)
    private final f error_response;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.managedcharging.ManageVehicleChargingResponse#ADAPTER", jsonName = "manageVehicleChargingResponse", tag = 2)
    private final g manage_vehicle_charging_response;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"mc0/h$a", "Lcom/squareup/wire/ProtoAdapter;", "Lmc0/h;", "value", "", "c", "(Lmc0/h;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lmc0/h;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lmc0/h;", DateTokenConverter.CONVERTER_KEY, "(Lmc0/h;)Lmc0/h;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<h> {
        a(com.squareup.wire.b bVar, co0.d<h> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/ManagedCharging.ManagedChargingAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h decode(k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            f fVarDecode = null;
            g gVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new h(fVarDecode, gVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    fVarDecode = f.f91775c.decode(reader);
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    gVarDecode = g.f91778d.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, h value) {
            s.k(writer, "writer");
            s.k(value, "value");
            f.f91775c.encodeWithTag(writer, 1, value.getError_response());
            g.f91778d.encodeWithTag(writer, 2, value.getManage_vehicle_charging_response());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(h value) {
            s.k(value, "value");
            return value.unknownFields().D() + f.f91775c.encodedSizeWithTag(1, value.getError_response()) + g.f91778d.encodedSizeWithTag(2, value.getManage_vehicle_charging_response());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public h redact(h value) {
            s.k(value, "value");
            f error_response = value.getError_response();
            f fVarRedact = error_response != null ? f.f91775c.redact(error_response) : null;
            g manage_vehicle_charging_response = value.getManage_vehicle_charging_response();
            return value.a(fVarRedact, manage_vehicle_charging_response != null ? g.f91778d.redact(manage_vehicle_charging_response) : null, okio.k.f97943e);
        }
    }

    public h() {
        this(null, null, null, 7, null);
    }

    public final h a(f error_response, g manage_vehicle_charging_response, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new h(error_response, manage_vehicle_charging_response, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getError_response() {
        return this.error_response;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getManage_vehicle_charging_response() {
        return this.manage_vehicle_charging_response;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return s.f(unknownFields(), hVar.unknownFields()) && s.f(this.error_response, hVar.error_response) && s.f(this.manage_vehicle_charging_response, hVar.manage_vehicle_charging_response);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        f fVar = this.error_response;
        int iHashCode2 = (iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 37;
        g gVar = this.manage_vehicle_charging_response;
        int iHashCode3 = iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m597newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        f fVar = this.error_response;
        if (fVar != null) {
            arrayList.add("error_response=" + fVar);
        }
        g gVar = this.manage_vehicle_charging_response;
        if (gVar != null) {
            arrayList.add("manage_vehicle_charging_response=" + gVar);
        }
        return v.y0(arrayList, ", ", "ManagedChargingAction{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ h(f fVar, g gVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : fVar, (i11 & 2) != 0 ? null : gVar, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m597newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, g gVar, okio.k unknownFields) {
        super(f91782d, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.error_response = fVar;
        this.manage_vehicle_charging_response = gVar;
        if (x20.d.c(fVar, gVar) > 1) {
            throw new IllegalArgumentException("At most one of error_response, manage_vehicle_charging_response may be non-null");
        }
    }
}
