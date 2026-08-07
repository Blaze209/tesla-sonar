package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lfc0/d3;", "Lcom/squareup/wire/f;", "", "Lokio/k;", "last_known_pseudonym_hashed", "unknownFields", "<init>", "(Lokio/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;Lokio/k;)Lfc0/d3;", "Lokio/k;", "c", "()Lokio/k;", "b", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d3 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ProtoAdapter<d3> f64944c = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(d3.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "lastKnownPseudonymHashed", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final okio.k last_known_pseudonym_hashed;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/d3$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/d3;", "value", "", "c", "(Lfc0/d3;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/d3;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/d3;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/d3;)Lfc0/d3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<d3> {
        a(com.squareup.wire.b bVar, co0.d<d3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.PseudonymSyncRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d3 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            okio.k kVarDecode = okio.k.f97943e;
            long jD = reader.d();
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new d3(kVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                } else {
                    reader.m(iG);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, d3 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (!p013kotlin.jvm.internal.s.f(value.getLast_known_pseudonym_hashed(), okio.k.f97943e)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getLast_known_pseudonym_hashed());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(d3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            return !p013kotlin.jvm.internal.s.f(value.getLast_known_pseudonym_hashed(), okio.k.f97943e) ? iD + ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getLast_known_pseudonym_hashed()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public d3 redact(d3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return d3.b(value, null, okio.k.f97943e, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d3() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ d3 b(d3 d3Var, okio.k kVar, okio.k kVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = d3Var.last_known_pseudonym_hashed;
        }
        if ((i11 & 2) != 0) {
            kVar2 = d3Var.unknownFields();
        }
        return d3Var.a(kVar, kVar2);
    }

    public final d3 a(okio.k last_known_pseudonym_hashed, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(last_known_pseudonym_hashed, "last_known_pseudonym_hashed");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new d3(last_known_pseudonym_hashed, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final okio.k getLast_known_pseudonym_hashed() {
        return this.last_known_pseudonym_hashed;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), d3Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.last_known_pseudonym_hashed, d3Var.last_known_pseudonym_hashed);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.last_known_pseudonym_hashed.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m222newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("last_known_pseudonym_hashed=" + this.last_known_pseudonym_hashed);
        return p013kotlin.collections.v.y0(arrayList, ", ", "PseudonymSyncRequest{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ d3(okio.k kVar, okio.k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? okio.k.f97943e : kVar, (i11 & 2) != 0 ? okio.k.f97943e : kVar2);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m222newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(okio.k last_known_pseudonym_hashed, okio.k unknownFields) {
        super(f64944c, unknownFields);
        p013kotlin.jvm.internal.s.k(last_known_pseudonym_hashed, "last_known_pseudonym_hashed");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.last_known_pseudonym_hashed = last_known_pseudonym_hashed;
    }
}
