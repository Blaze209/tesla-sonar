package sc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lsc0/a;", "Lcom/squareup/wire/f;", "", "Lsc0/b;", "domain", "Lokio/k;", "routing_address", "unknownFields", "<init>", "(Lsc0/b;Lokio/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lsc0/b;Lokio/k;Lokio/k;)Lsc0/a;", "Lsc0/b;", "c", "()Lsc0/b;", "b", "Lokio/k;", DateTokenConverter.CONVERTER_KEY, "()Lokio/k;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<a> f111076d = new C2365a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(a.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.universalmessage.Domain#ADAPTER", tag = 1)
    private final b domain;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "routingAddress", tag = 2)
    private final k routing_address;

    /* JADX INFO: renamed from: sc0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"sc0/a$a", "Lcom/squareup/wire/ProtoAdapter;", "Lsc0/a;", "value", "", "c", "(Lsc0/a;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lsc0/a;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lsc0/a;", DateTokenConverter.CONVERTER_KEY, "(Lsc0/a;)Lsc0/a;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2365a extends ProtoAdapter<a> {
        C2365a(com.squareup.wire.b bVar, co0.d<a> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/UniversalMessage.Destination", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            b bVarDecode = null;
            k kVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new a(bVarDecode, kVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        bVarDecode = b.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, a value) {
            s.k(writer, "writer");
            s.k(value, "value");
            b.ADAPTER.encodeWithTag(writer, 1, value.getDomain());
            ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getRouting_address());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(a value) {
            s.k(value, "value");
            return value.unknownFields().D() + b.ADAPTER.encodedSizeWithTag(1, value.getDomain()) + ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getRouting_address());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a redact(a value) {
            s.k(value, "value");
            return a.b(value, null, null, k.f97943e, 3, null);
        }
    }

    public a() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ a b(a aVar, b bVar, k kVar, k kVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = aVar.domain;
        }
        if ((i11 & 2) != 0) {
            kVar = aVar.routing_address;
        }
        if ((i11 & 4) != 0) {
            kVar2 = aVar.unknownFields();
        }
        return aVar.a(bVar, kVar, kVar2);
    }

    public final a a(b domain, k routing_address, k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new a(domain, routing_address, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getDomain() {
        return this.domain;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final k getRouting_address() {
        return this.routing_address;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return s.f(unknownFields(), aVar.unknownFields()) && this.domain == aVar.domain && s.f(this.routing_address, aVar.routing_address);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        b bVar = this.domain;
        int iHashCode2 = (iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 37;
        k kVar = this.routing_address;
        int iHashCode3 = iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m767newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        b bVar = this.domain;
        if (bVar != null) {
            arrayList.add("domain=" + bVar);
        }
        k kVar = this.routing_address;
        if (kVar != null) {
            arrayList.add("routing_address=" + kVar);
        }
        return v.y0(arrayList, ", ", "Destination{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ a(b bVar, k kVar, k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bVar, (i11 & 2) != 0 ? null : kVar, (i11 & 4) != 0 ? k.f97943e : kVar2);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m767newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, k kVar, k unknownFields) {
        super(f111076d, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.domain = bVar;
        this.routing_address = kVar;
        if (x20.d.c(bVar, kVar) > 1) {
            throw new IllegalArgumentException("At most one of domain, routing_address may be non-null");
        }
    }
}
