package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BG\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJM\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b)\u0010\u0017¨\u0006*"}, d2 = {"Lfc0/o3;", "Lcom/squareup/wire/f;", "", "", "enabled", "", "departure_time", "Lec0/r;", "preconditioning_times", "Lec0/p;", "off_peak_charging_times", "off_peak_hours_end_time", "Lokio/k;", "unknownFields", "<init>", "(ZILec0/r;Lec0/p;ILokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ZILec0/r;Lec0/p;ILokio/k;)Lfc0/o3;", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "b", "I", "c", "Lec0/r;", "g", "()Lec0/r;", "Lec0/p;", "e", "()Lec0/p;", "f", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o3 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ProtoAdapter<o3> f65286g = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(o3.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "departureTime", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final int departure_time;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.PreconditioningTimes#ADAPTER", jsonName = "preconditioningTimes", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final ec0.r preconditioning_times;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.OffPeakChargingTimes#ADAPTER", jsonName = "offPeakChargingTimes", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final ec0.p off_peak_charging_times;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "offPeakHoursEndTime", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final int off_peak_hours_end_time;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/o3$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/o3;", "value", "", "c", "(Lfc0/o3;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/o3;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/o3;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/o3;)Lfc0/o3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<o3> {
        a(com.squareup.wire.b bVar, co0.d<o3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ScheduledDepartureAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o3 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            ec0.r rVarDecode = null;
            boolean zBooleanValue = false;
            int iIntValue = 0;
            int iIntValue2 = 0;
            ec0.p pVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new o3(zBooleanValue, iIntValue, rVarDecode, pVarDecode, iIntValue2, reader.e(jD));
                }
                if (iG == 1) {
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (iG == 2) {
                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (iG == 3) {
                    rVarDecode = ec0.r.f62739d.decode(reader);
                } else if (iG == 4) {
                    pVarDecode = ec0.p.f62725d.decode(reader);
                } else if (iG != 5) {
                    reader.m(iG);
                } else {
                    iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, o3 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getEnabled()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.getEnabled()));
            }
            if (value.getDeparture_time() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(value.getDeparture_time()));
            }
            if (value.getPreconditioning_times() != null) {
                ec0.r.f62739d.encodeWithTag(writer, 3, value.getPreconditioning_times());
            }
            if (value.getOff_peak_charging_times() != null) {
                ec0.p.f62725d.encodeWithTag(writer, 4, value.getOff_peak_charging_times());
            }
            if (value.getOff_peak_hours_end_time() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 5, Integer.valueOf(value.getOff_peak_hours_end_time()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(o3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getEnabled()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getEnabled()));
            }
            if (value.getDeparture_time() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getDeparture_time()));
            }
            if (value.getPreconditioning_times() != null) {
                iD += ec0.r.f62739d.encodedSizeWithTag(3, value.getPreconditioning_times());
            }
            if (value.getOff_peak_charging_times() != null) {
                iD += ec0.p.f62725d.encodedSizeWithTag(4, value.getOff_peak_charging_times());
            }
            return value.getOff_peak_hours_end_time() != 0 ? iD + ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getOff_peak_hours_end_time())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public o3 redact(o3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            ec0.r preconditioning_times = value.getPreconditioning_times();
            ec0.r rVarRedact = preconditioning_times != null ? ec0.r.f62739d.redact(preconditioning_times) : null;
            ec0.p off_peak_charging_times = value.getOff_peak_charging_times();
            return o3.b(value, false, 0, rVarRedact, off_peak_charging_times != null ? ec0.p.f62725d.redact(off_peak_charging_times) : null, 0, okio.k.f97943e, 19, null);
        }
    }

    public o3() {
        this(false, 0, null, null, 0, null, 63, null);
    }

    public static /* synthetic */ o3 b(o3 o3Var, boolean z11, int i11, ec0.r rVar, ec0.p pVar, int i12, okio.k kVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z11 = o3Var.enabled;
        }
        if ((i13 & 2) != 0) {
            i11 = o3Var.departure_time;
        }
        if ((i13 & 4) != 0) {
            rVar = o3Var.preconditioning_times;
        }
        if ((i13 & 8) != 0) {
            pVar = o3Var.off_peak_charging_times;
        }
        if ((i13 & 16) != 0) {
            i12 = o3Var.off_peak_hours_end_time;
        }
        if ((i13 & 32) != 0) {
            kVar = o3Var.unknownFields();
        }
        int i14 = i12;
        okio.k kVar2 = kVar;
        return o3Var.a(z11, i11, rVar, pVar, i14, kVar2);
    }

    public final o3 a(boolean enabled, int departure_time, ec0.r preconditioning_times, ec0.p off_peak_charging_times, int off_peak_hours_end_time, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new o3(enabled, departure_time, preconditioning_times, off_peak_charging_times, off_peak_hours_end_time, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDeparture_time() {
        return this.departure_time;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ec0.p getOff_peak_charging_times() {
        return this.off_peak_charging_times;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), o3Var.unknownFields()) && this.enabled == o3Var.enabled && this.departure_time == o3Var.departure_time && p013kotlin.jvm.internal.s.f(this.preconditioning_times, o3Var.preconditioning_times) && p013kotlin.jvm.internal.s.f(this.off_peak_charging_times, o3Var.off_peak_charging_times) && this.off_peak_hours_end_time == o3Var.off_peak_hours_end_time;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getOff_peak_hours_end_time() {
        return this.off_peak_hours_end_time;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ec0.r getPreconditioning_times() {
        return this.preconditioning_times;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.enabled)) * 37) + Integer.hashCode(this.departure_time)) * 37;
        ec0.r rVar = this.preconditioning_times;
        int iHashCode2 = (iHashCode + (rVar != null ? rVar.hashCode() : 0)) * 37;
        ec0.p pVar = this.off_peak_charging_times;
        int iHashCode3 = ((iHashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 37) + Integer.hashCode(this.off_peak_hours_end_time);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m302newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("enabled=" + this.enabled);
        arrayList.add("departure_time=" + this.departure_time);
        ec0.r rVar = this.preconditioning_times;
        if (rVar != null) {
            arrayList.add("preconditioning_times=" + rVar);
        }
        ec0.p pVar = this.off_peak_charging_times;
        if (pVar != null) {
            arrayList.add("off_peak_charging_times=" + pVar);
        }
        arrayList.add("off_peak_hours_end_time=" + this.off_peak_hours_end_time);
        return p013kotlin.collections.v.y0(arrayList, ", ", "ScheduledDepartureAction{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ o3(boolean z11, int i11, ec0.r rVar, ec0.p pVar, int i12, okio.k kVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z11, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? null : rVar, (i13 & 8) != 0 ? null : pVar, (i13 & 16) != 0 ? 0 : i12, (i13 & 32) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m302newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(boolean z11, int i11, ec0.r rVar, ec0.p pVar, int i12, okio.k unknownFields) {
        super(f65286g, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.enabled = z11;
        this.departure_time = i11;
        this.preconditioning_times = rVar;
        this.off_peak_charging_times = pVar;
        this.off_peak_hours_end_time = i12;
    }
}
