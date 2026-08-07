package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lfc0/l2;", "Lcom/squareup/wire/f;", "", "", "lat", "lon", "Lfc0/f3;", "order", "Lokio/k;", "unknownFields", "<init>", "(DDLfc0/f3;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(DDLfc0/f3;Lokio/k;)Lfc0/l2;", "D", "c", "()D", "b", DateTokenConverter.CONVERTER_KEY, "Lfc0/f3;", "e", "()Lfc0/f3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<l2> f65199e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(l2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final double lat;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final double lon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.RemoteNavTripOrder_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final f3 order;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/l2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/l2;", "value", "", "c", "(Lfc0/l2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/l2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/l2;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/l2;)Lfc0/l2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<l2> {
        a(com.squareup.wire.b bVar, co0.d<l2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.NavigationGpsRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l2 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            f3 f3VarDecode = f3.RemoteNavTripOrderReplace;
            long jD = reader.d();
            double dDoubleValue = 0.0d;
            double dDoubleValue2 = 0.0d;
            while (true) {
                f3 f3Var = f3VarDecode;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new l2(dDoubleValue, dDoubleValue2, f3Var, reader.e(jD));
                    }
                    if (iG == 1) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iG == 2) {
                        dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iG != 3) {
                        reader.m(iG);
                    } else {
                        try {
                            f3VarDecode = f3.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                        }
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, l2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getLat() != 0.0d) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, Double.valueOf(value.getLat()));
            }
            if (value.getLon() != 0.0d) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, Double.valueOf(value.getLon()));
            }
            if (value.getOrder() != f3.RemoteNavTripOrderReplace) {
                f3.ADAPTER.encodeWithTag(writer, 3, value.getOrder());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(l2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getLat() != 0.0d) {
                iD += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getLat()));
            }
            if (value.getLon() != 0.0d) {
                iD += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getLon()));
            }
            return value.getOrder() != f3.RemoteNavTripOrderReplace ? iD + f3.ADAPTER.encodedSizeWithTag(3, value.getOrder()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public l2 redact(l2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return l2.b(value, 0.0d, 0.0d, null, okio.k.f97943e, 7, null);
        }
    }

    public l2() {
        this(0.0d, 0.0d, null, null, 15, null);
    }

    public static /* synthetic */ l2 b(l2 l2Var, double d11, double d12, f3 f3Var, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = l2Var.lat;
        }
        double d13 = d11;
        if ((i11 & 2) != 0) {
            d12 = l2Var.lon;
        }
        double d14 = d12;
        if ((i11 & 4) != 0) {
            f3Var = l2Var.order;
        }
        f3 f3Var2 = f3Var;
        if ((i11 & 8) != 0) {
            kVar = l2Var.unknownFields();
        }
        return l2Var.a(d13, d14, f3Var2, kVar);
    }

    public final l2 a(double lat, double lon, f3 order, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(order, "order");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new l2(lat, lon, order, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final f3 getOrder() {
        return this.order;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), l2Var.unknownFields()) && this.lat == l2Var.lat && this.lon == l2Var.lon && this.order == l2Var.order;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + Double.hashCode(this.lat)) * 37) + Double.hashCode(this.lon)) * 37) + this.order.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m279newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("lat=" + this.lat);
        arrayList.add("lon=" + this.lon);
        arrayList.add("order=" + this.order);
        return p013kotlin.collections.v.y0(arrayList, ", ", "NavigationGpsRequest{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ l2(double d11, double d12, f3 f3Var, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0d : d11, (i11 & 2) != 0 ? 0.0d : d12, (i11 & 4) != 0 ? f3.RemoteNavTripOrderReplace : f3Var, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m279newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(double d11, double d12, f3 order, okio.k unknownFields) {
        super(f65199e, unknownFields);
        p013kotlin.jvm.internal.s.k(order, "order");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.lat = d11;
        this.lon = d12;
        this.order = order;
    }
}
