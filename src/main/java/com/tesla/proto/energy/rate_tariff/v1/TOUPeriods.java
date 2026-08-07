package com.tesla.proto.energy.rate_tariff.v1;

import co0.d;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.b;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BQ\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JW\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b \u0010\u001eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b!\u0010\u001e¨\u0006#"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/TOUPeriods;", "Lcom/squareup/wire/f;", "", "", "Lcom/tesla/proto/energy/rate_tariff/v1/TOUPeriod;", "on_peak", "partial_peak", "off_peak", "super_off_peak", "Lokio/k;", "unknownFields", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lokio/k;)Lcom/tesla/proto/energy/rate_tariff/v1/TOUPeriods;", "Ljava/util/List;", "getOn_peak", "()Ljava/util/List;", "getPartial_peak", "getOff_peak", "getSuper_off_peak", "Companion", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TOUPeriods extends f {
    public static final ProtoAdapter<TOUPeriods> ADAPTER;
    private static final long serialVersionUID = 0;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.TOUPeriod#ADAPTER", jsonName = "OFF_PEAK", label = q.a.REPEATED, tag = 3)
    private final List<TOUPeriod> off_peak;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.TOUPeriod#ADAPTER", jsonName = "ON_PEAK", label = q.a.REPEATED, tag = 1)
    private final List<TOUPeriod> on_peak;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.TOUPeriod#ADAPTER", jsonName = "PARTIAL_PEAK", label = q.a.REPEATED, tag = 2)
    private final List<TOUPeriod> partial_peak;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.TOUPeriod#ADAPTER", jsonName = "SUPER_OFF_PEAK", label = q.a.REPEATED, tag = 4)
    private final List<TOUPeriod> super_off_peak;

    static {
        final b bVar = b.LENGTH_DELIMITED;
        final d dVarB = o0.b(TOUPeriods.class);
        final o oVar = o.PROTO_3;
        ADAPTER = new ProtoAdapter<TOUPeriods>(bVar, dVarB, oVar) { // from class: com.tesla.proto.energy.rate_tariff.v1.TOUPeriods$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TOUPeriods decode(k reader) {
                s.k(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                long jD = reader.d();
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new TOUPeriods(arrayList, arrayList2, arrayList3, arrayList4, reader.e(jD));
                    }
                    if (iG == 1) {
                        arrayList.add(TOUPeriod.ADAPTER.decode(reader));
                    } else if (iG == 2) {
                        arrayList2.add(TOUPeriod.ADAPTER.decode(reader));
                    } else if (iG == 3) {
                        arrayList3.add(TOUPeriod.ADAPTER.decode(reader));
                    } else if (iG != 4) {
                        reader.m(iG);
                    } else {
                        arrayList4.add(TOUPeriod.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(l writer, TOUPeriods value) {
                s.k(writer, "writer");
                s.k(value, "value");
                ProtoAdapter<TOUPeriod> protoAdapter = TOUPeriod.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 1, value.getOn_peak());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, value.getPartial_peak());
                protoAdapter.asRepeated().encodeWithTag(writer, 3, value.getOff_peak());
                protoAdapter.asRepeated().encodeWithTag(writer, 4, value.getSuper_off_peak());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TOUPeriods value) {
                s.k(value, "value");
                int iD = value.unknownFields().D();
                ProtoAdapter<TOUPeriod> protoAdapter = TOUPeriod.ADAPTER;
                return iD + protoAdapter.asRepeated().encodedSizeWithTag(1, value.getOn_peak()) + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getPartial_peak()) + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getOff_peak()) + protoAdapter.asRepeated().encodedSizeWithTag(4, value.getSuper_off_peak());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TOUPeriods redact(TOUPeriods value) {
                s.k(value, "value");
                List<TOUPeriod> on_peak = value.getOn_peak();
                ProtoAdapter<TOUPeriod> protoAdapter = TOUPeriod.ADAPTER;
                return value.copy(x20.d.a(on_peak, protoAdapter), x20.d.a(value.getPartial_peak(), protoAdapter), x20.d.a(value.getOff_peak(), protoAdapter), x20.d.a(value.getSuper_off_peak(), protoAdapter), okio.k.f97943e);
            }
        };
    }

    public TOUPeriods() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TOUPeriods copy$default(TOUPeriods tOUPeriods, List list, List list2, List list3, List list4, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = tOUPeriods.on_peak;
        }
        if ((i11 & 2) != 0) {
            list2 = tOUPeriods.partial_peak;
        }
        if ((i11 & 4) != 0) {
            list3 = tOUPeriods.off_peak;
        }
        if ((i11 & 8) != 0) {
            list4 = tOUPeriods.super_off_peak;
        }
        if ((i11 & 16) != 0) {
            kVar = tOUPeriods.unknownFields();
        }
        okio.k kVar2 = kVar;
        List list5 = list3;
        return tOUPeriods.copy(list, list2, list5, list4, kVar2);
    }

    public final TOUPeriods copy(List<TOUPeriod> on_peak, List<TOUPeriod> partial_peak, List<TOUPeriod> off_peak, List<TOUPeriod> super_off_peak, okio.k unknownFields) {
        s.k(on_peak, "on_peak");
        s.k(partial_peak, "partial_peak");
        s.k(off_peak, "off_peak");
        s.k(super_off_peak, "super_off_peak");
        s.k(unknownFields, "unknownFields");
        return new TOUPeriods(on_peak, partial_peak, off_peak, super_off_peak, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TOUPeriods)) {
            return false;
        }
        TOUPeriods tOUPeriods = (TOUPeriods) other;
        return s.f(unknownFields(), tOUPeriods.unknownFields()) && s.f(this.on_peak, tOUPeriods.on_peak) && s.f(this.partial_peak, tOUPeriods.partial_peak) && s.f(this.off_peak, tOUPeriods.off_peak) && s.f(this.super_off_peak, tOUPeriods.super_off_peak);
    }

    public final List<TOUPeriod> getOff_peak() {
        return this.off_peak;
    }

    public final List<TOUPeriod> getOn_peak() {
        return this.on_peak;
    }

    public final List<TOUPeriod> getPartial_peak() {
        return this.partial_peak;
    }

    public final List<TOUPeriod> getSuper_off_peak() {
        return this.super_off_peak;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.on_peak.hashCode()) * 37) + this.partial_peak.hashCode()) * 37) + this.off_peak.hashCode()) * 37) + this.super_off_peak.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m132newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.on_peak.isEmpty()) {
            arrayList.add("on_peak=" + this.on_peak);
        }
        if (!this.partial_peak.isEmpty()) {
            arrayList.add("partial_peak=" + this.partial_peak);
        }
        if (!this.off_peak.isEmpty()) {
            arrayList.add("off_peak=" + this.off_peak);
        }
        if (!this.super_off_peak.isEmpty()) {
            arrayList.add("super_off_peak=" + this.super_off_peak);
        }
        return v.y0(arrayList, ", ", "TOUPeriods{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ TOUPeriods(List list, List list2, List list3, List list4, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? v.m() : list, (i11 & 2) != 0 ? v.m() : list2, (i11 & 4) != 0 ? v.m() : list3, (i11 & 8) != 0 ? v.m() : list4, (i11 & 16) != 0 ? okio.k.f97943e : kVar);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m132newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TOUPeriods(List<TOUPeriod> on_peak, List<TOUPeriod> partial_peak, List<TOUPeriod> off_peak, List<TOUPeriod> super_off_peak, okio.k unknownFields) {
        super(ADAPTER, unknownFields);
        s.k(on_peak, "on_peak");
        s.k(partial_peak, "partial_peak");
        s.k(off_peak, "off_peak");
        s.k(super_off_peak, "super_off_peak");
        s.k(unknownFields, "unknownFields");
        this.on_peak = x20.d.g("on_peak", on_peak);
        this.partial_peak = x20.d.g("partial_peak", partial_peak);
        this.off_peak = x20.d.g("off_peak", off_peak);
        this.super_off_peak = x20.d.g("super_off_peak", super_off_peak);
    }
}
