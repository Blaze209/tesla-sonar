package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lfc0/p2;", "Lcom/squareup/wire/f;", "", "", "id", "Lfc0/f3;", "order", "Lokio/k;", "unknownFields", "<init>", "(JLfc0/f3;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(JLfc0/f3;Lokio/k;)Lfc0/p2;", "J", "c", "()J", "b", "Lfc0/f3;", DateTokenConverter.CONVERTER_KEY, "()Lfc0/f3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<p2> f65308d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(p2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.RemoteNavTripOrder_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final f3 order;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/p2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/p2;", "value", "", "c", "(Lfc0/p2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/p2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/p2;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/p2;)Lfc0/p2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<p2> {
        a(com.squareup.wire.b bVar, co0.d<p2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.NavigationSuperchargerRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p2 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            f3 f3VarDecode = f3.RemoteNavTripOrderReplace;
            long jD = reader.d();
            long jLongValue = 0;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new p2(jLongValue, f3VarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                } else if (iG != 2) {
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
        public void encode(com.squareup.wire.l writer, p2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getId() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(value.getId()));
            }
            if (value.getOrder() != f3.RemoteNavTripOrderReplace) {
                f3.ADAPTER.encodeWithTag(writer, 2, value.getOrder());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(p2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getId() != 0) {
                iD += ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.getId()));
            }
            return value.getOrder() != f3.RemoteNavTripOrderReplace ? iD + f3.ADAPTER.encodedSizeWithTag(2, value.getOrder()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public p2 redact(p2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return p2.b(value, 0L, null, okio.k.f97943e, 3, null);
        }
    }

    public p2() {
        this(0L, null, null, 7, null);
    }

    public static /* synthetic */ p2 b(p2 p2Var, long j11, f3 f3Var, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = p2Var.id;
        }
        if ((i11 & 2) != 0) {
            f3Var = p2Var.order;
        }
        if ((i11 & 4) != 0) {
            kVar = p2Var.unknownFields();
        }
        return p2Var.a(j11, f3Var, kVar);
    }

    public final p2 a(long id2, f3 order, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(order, "order");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new p2(id2, order, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f3 getOrder() {
        return this.order;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), p2Var.unknownFields()) && this.id == p2Var.id && this.order == p2Var.order;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + Long.hashCode(this.id)) * 37) + this.order.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m308newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.id);
        arrayList.add("order=" + this.order);
        return p013kotlin.collections.v.y0(arrayList, ", ", "NavigationSuperchargerRequest{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ p2(long j11, f3 f3Var, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? f3.RemoteNavTripOrderReplace : f3Var, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m308newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(long j11, f3 order, okio.k unknownFields) {
        super(f65308d, unknownFields);
        p013kotlin.jvm.internal.s.k(order, "order");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.id = j11;
        this.order = order;
    }
}
