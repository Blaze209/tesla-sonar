package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lfc0/y2;", "Lcom/squareup/wire/f;", "", "Lfc0/t3$c;", "distance_unit", "Lfc0/l4$c;", "temperature_unit", "Lokio/k;", "unknownFields", "<init>", "(Lfc0/t3$c;Lfc0/l4$c;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lfc0/t3$c;Lfc0/l4$c;Lokio/k;)Lfc0/y2;", "Lfc0/t3$c;", "c", "()Lfc0/t3$c;", "b", "Lfc0/l4$c;", DateTokenConverter.CONVERTER_KEY, "()Lfc0/l4$c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<y2> f65624d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(y2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.SetDistanceUnitAction$Unit#ADAPTER", jsonName = "distanceUnit", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final t3.c distance_unit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.SetTemperatureUnitAction$Unit#ADAPTER", jsonName = "temperatureUnit", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final l4.c temperature_unit;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/y2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/y2;", "value", "", "c", "(Lfc0/y2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/y2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/y2;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/y2;)Lfc0/y2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<y2> {
        a(com.squareup.wire.b bVar, co0.d<y2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.PhoneUnitPreferences", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public y2 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            t3.c cVarDecode = t3.c.UNIT_MILES;
            l4.c cVarDecode2 = l4.c.UNIT_FAHRENHEIT;
            long jD = reader.d();
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new y2(cVarDecode, cVarDecode2, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        cVarDecode = t3.c.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    try {
                        cVarDecode2 = l4.c.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, y2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getDistance_unit() != t3.c.UNIT_MILES) {
                t3.c.ADAPTER.encodeWithTag(writer, 1, value.getDistance_unit());
            }
            if (value.getTemperature_unit() != l4.c.UNIT_FAHRENHEIT) {
                l4.c.ADAPTER.encodeWithTag(writer, 2, value.getTemperature_unit());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(y2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getDistance_unit() != t3.c.UNIT_MILES) {
                iD += t3.c.ADAPTER.encodedSizeWithTag(1, value.getDistance_unit());
            }
            return value.getTemperature_unit() != l4.c.UNIT_FAHRENHEIT ? iD + l4.c.ADAPTER.encodedSizeWithTag(2, value.getTemperature_unit()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public y2 redact(y2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return y2.b(value, null, null, okio.k.f97943e, 3, null);
        }
    }

    public y2() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ y2 b(y2 y2Var, t3.c cVar, l4.c cVar2, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar = y2Var.distance_unit;
        }
        if ((i11 & 2) != 0) {
            cVar2 = y2Var.temperature_unit;
        }
        if ((i11 & 4) != 0) {
            kVar = y2Var.unknownFields();
        }
        return y2Var.a(cVar, cVar2, kVar);
    }

    public final y2 a(t3.c distance_unit, l4.c temperature_unit, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(distance_unit, "distance_unit");
        p013kotlin.jvm.internal.s.k(temperature_unit, "temperature_unit");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new y2(distance_unit, temperature_unit, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final t3.c getDistance_unit() {
        return this.distance_unit;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final l4.c getTemperature_unit() {
        return this.temperature_unit;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), y2Var.unknownFields()) && this.distance_unit == y2Var.distance_unit && this.temperature_unit == y2Var.temperature_unit;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.distance_unit.hashCode()) * 37) + this.temperature_unit.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m374newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("distance_unit=" + this.distance_unit);
        arrayList.add("temperature_unit=" + this.temperature_unit);
        return p013kotlin.collections.v.y0(arrayList, ", ", "PhoneUnitPreferences{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ y2(t3.c cVar, l4.c cVar2, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? t3.c.UNIT_MILES : cVar, (i11 & 2) != 0 ? l4.c.UNIT_FAHRENHEIT : cVar2, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m374newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(t3.c distance_unit, l4.c temperature_unit, okio.k unknownFields) {
        super(f65624d, unknownFields);
        p013kotlin.jvm.internal.s.k(distance_unit, "distance_unit");
        p013kotlin.jvm.internal.s.k(temperature_unit, "temperature_unit");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.distance_unit = distance_unit;
        this.temperature_unit = temperature_unit;
    }
}
