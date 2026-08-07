package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB9\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lfc0/k2;", "Lcom/squareup/wire/f;", "", "", "lat", "lon", "", "destination", "Lfc0/f3;", "order", "Lokio/k;", "unknownFields", "<init>", "(DDLjava/lang/String;Lfc0/f3;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(DDLjava/lang/String;Lfc0/f3;Lokio/k;)Lfc0/k2;", "D", DateTokenConverter.CONVERTER_KEY, "()D", "b", "e", "c", "Ljava/lang/String;", "Lfc0/f3;", "f", "()Lfc0/f3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<k2> f65152f = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(k2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final double lat;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final double lon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final String destination;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.RemoteNavTripOrder_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final f3 order;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/k2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/k2;", "value", "", "c", "(Lfc0/k2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/k2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/k2;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/k2;)Lfc0/k2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<k2> {
        a(com.squareup.wire.b bVar, co0.d<k2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.NavigationGpsDestinationRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k2 decode(com.squareup.wire.k reader) throws IOException {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            f3 f3Var = f3.RemoteNavTripOrderReplace;
            long jD = reader.d();
            double dDoubleValue = 0.0d;
            f3 f3VarDecode = f3Var;
            String strDecode = "";
            double dDoubleValue2 = 0.0d;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new k2(dDoubleValue2, dDoubleValue, strDecode, f3VarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                } else if (iG == 2) {
                    dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                } else if (iG == 3) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iG != 4) {
                    reader.m(iG);
                } else {
                    try {
                        f3VarDecode = f3.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, k2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getLat() != 0.0d) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, Double.valueOf(value.getLat()));
            }
            if (value.getLon() != 0.0d) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, Double.valueOf(value.getLon()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getDestination(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getDestination());
            }
            if (value.getOrder() != f3.RemoteNavTripOrderReplace) {
                f3.ADAPTER.encodeWithTag(writer, 4, value.getOrder());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(k2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getLat() != 0.0d) {
                iD += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getLat()));
            }
            if (value.getLon() != 0.0d) {
                iD += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getLon()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getDestination(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDestination());
            }
            return value.getOrder() != f3.RemoteNavTripOrderReplace ? iD + f3.ADAPTER.encodedSizeWithTag(4, value.getOrder()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public k2 redact(k2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return k2.b(value, 0.0d, 0.0d, null, null, okio.k.f97943e, 15, null);
        }
    }

    public k2() {
        this(0.0d, 0.0d, null, null, null, 31, null);
    }

    public static /* synthetic */ k2 b(k2 k2Var, double d11, double d12, String str, f3 f3Var, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = k2Var.lat;
        }
        double d13 = d11;
        if ((i11 & 2) != 0) {
            d12 = k2Var.lon;
        }
        double d14 = d12;
        if ((i11 & 4) != 0) {
            str = k2Var.destination;
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            f3Var = k2Var.order;
        }
        f3 f3Var2 = f3Var;
        if ((i11 & 16) != 0) {
            kVar = k2Var.unknownFields();
        }
        return k2Var.a(d13, d14, str2, f3Var2, kVar);
    }

    public final k2 a(double lat, double lon, String destination, f3 order, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(destination, "destination");
        p013kotlin.jvm.internal.s.k(order, "order");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new k2(lat, lon, destination, order, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), k2Var.unknownFields()) && this.lat == k2Var.lat && this.lon == k2Var.lon && p013kotlin.jvm.internal.s.f(this.destination, k2Var.destination) && this.order == k2Var.order;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final f3 getOrder() {
        return this.order;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + Double.hashCode(this.lat)) * 37) + Double.hashCode(this.lon)) * 37) + this.destination.hashCode()) * 37) + this.order.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m272newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("lat=" + this.lat);
        arrayList.add("lon=" + this.lon);
        arrayList.add("destination=" + x20.d.i(this.destination));
        arrayList.add("order=" + this.order);
        return p013kotlin.collections.v.y0(arrayList, ", ", "NavigationGpsDestinationRequest{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ k2(double d11, double d12, String str, f3 f3Var, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0d : d11, (i11 & 2) != 0 ? 0.0d : d12, (i11 & 4) != 0 ? "" : str, (i11 & 8) != 0 ? f3.RemoteNavTripOrderReplace : f3Var, (i11 & 16) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m272newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(double d11, double d12, String destination, f3 order, okio.k unknownFields) {
        super(f65152f, unknownFields);
        p013kotlin.jvm.internal.s.k(destination, "destination");
        p013kotlin.jvm.internal.s.k(order, "order");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.lat = d11;
        this.lon = d12;
        this.destination = destination;
        this.order = order;
    }
}
