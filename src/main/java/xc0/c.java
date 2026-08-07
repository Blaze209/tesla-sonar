package xc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import j$.time.Instant;
import java.util.ArrayList;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBE\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001aR\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lxc0/c;", "Lcom/squareup/wire/f;", "", "", "location_name", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "estimated_to_raw_distance", "", "supercharger_trt_id", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/Float;Ljava/lang/Integer;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/Float;Ljava/lang/Integer;Lokio/k;)Lxc0/c;", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "b", "Lj$/time/Instant;", "f", "()Lj$/time/Instant;", "c", "Ljava/lang/Float;", "()Ljava/lang/Float;", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<c> f123243f = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(c.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "locationName", label = q.a.OMIT_IDENTITY, tag = 1)
    private final String location_name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = q.a.OMIT_IDENTITY, tag = 2)
    private final Instant timestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "estimatedToRawDistance", tag = 20)
    private final Float estimated_to_raw_distance;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "superchargerTrtId", tag = 121)
    private final Integer supercharger_trt_id;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"xc0/c$a", "Lcom/squareup/wire/ProtoAdapter;", "Lxc0/c;", "value", "", "c", "(Lxc0/c;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lxc0/c;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lxc0/c;", DateTokenConverter.CONVERTER_KEY, "(Lxc0/c;)Lxc0/c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<c> {
        a(com.squareup.wire.b bVar, co0.d<c> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.ImpreciseLocation", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c decode(k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            String strDecode = "";
            Instant instantDecode = null;
            Float fDecode = null;
            Integer numDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new c(strDecode, instantDecode, fDecode, numDecode, reader.e(jD));
                }
                if (iG == 1) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iG == 2) {
                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                } else if (iG == 20) {
                    fDecode = ProtoAdapter.FLOAT.decode(reader);
                } else if (iG != 121) {
                    reader.m(iG);
                } else {
                    numDecode = ProtoAdapter.INT32.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, c value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (!s.f(value.getLocation_name(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getLocation_name());
            }
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 2, value.getTimestamp());
            }
            ProtoAdapter.FLOAT.encodeWithTag(writer, 20, value.getEstimated_to_raw_distance());
            ProtoAdapter.INT32.encodeWithTag(writer, 121, value.getSupercharger_trt_id());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(c value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!s.f(value.getLocation_name(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLocation_name());
            }
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
            }
            return iD + ProtoAdapter.FLOAT.encodedSizeWithTag(20, value.getEstimated_to_raw_distance()) + ProtoAdapter.INT32.encodedSizeWithTag(121, value.getSupercharger_trt_id());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c redact(c value) {
            s.k(value, "value");
            Instant timestamp = value.getTimestamp();
            return c.b(value, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, okio.k.f97943e, 13, null);
        }
    }

    public c() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ c b(c cVar, String str, Instant instant, Float f11, Integer num, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cVar.location_name;
        }
        if ((i11 & 2) != 0) {
            instant = cVar.timestamp;
        }
        if ((i11 & 4) != 0) {
            f11 = cVar.estimated_to_raw_distance;
        }
        if ((i11 & 8) != 0) {
            num = cVar.supercharger_trt_id;
        }
        if ((i11 & 16) != 0) {
            kVar = cVar.unknownFields();
        }
        okio.k kVar2 = kVar;
        Float f12 = f11;
        return cVar.a(str, instant, f12, num, kVar2);
    }

    public final c a(String location_name, Instant timestamp, Float estimated_to_raw_distance, Integer supercharger_trt_id, okio.k unknownFields) {
        s.k(location_name, "location_name");
        s.k(unknownFields, "unknownFields");
        return new c(location_name, timestamp, estimated_to_raw_distance, supercharger_trt_id, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Float getEstimated_to_raw_distance() {
        return this.estimated_to_raw_distance;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLocation_name() {
        return this.location_name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getSupercharger_trt_id() {
        return this.supercharger_trt_id;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return s.f(unknownFields(), cVar.unknownFields()) && s.f(this.location_name, cVar.location_name) && s.f(this.timestamp, cVar.timestamp) && s.e(this.estimated_to_raw_distance, cVar.estimated_to_raw_distance) && s.f(this.supercharger_trt_id, cVar.supercharger_trt_id);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.location_name.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Float f11 = this.estimated_to_raw_distance;
        int iHashCode3 = (iHashCode2 + (f11 != null ? f11.hashCode() : 0)) * 37;
        Integer num = this.supercharger_trt_id;
        int iHashCode4 = iHashCode3 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m858newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("location_name=" + x20.d.i(this.location_name));
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        Float f11 = this.estimated_to_raw_distance;
        if (f11 != null) {
            arrayList.add("estimated_to_raw_distance=" + f11);
        }
        Integer num = this.supercharger_trt_id;
        if (num != null) {
            arrayList.add("supercharger_trt_id=" + num);
        }
        return v.y0(arrayList, ", ", "ImpreciseLocation{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ c(String str, Instant instant, Float f11, Integer num, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : instant, (i11 & 4) != 0 ? null : f11, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? okio.k.f97943e : kVar);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m858newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String location_name, Instant instant, Float f11, Integer num, okio.k unknownFields) {
        super(f123243f, unknownFields);
        s.k(location_name, "location_name");
        s.k(unknownFields, "unknownFields");
        this.location_name = location_name;
        this.timestamp = instant;
        this.estimated_to_raw_distance = f11;
        this.supercharger_trt_id = num;
    }
}
