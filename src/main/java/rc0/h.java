package rc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.q;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JG\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, d2 = {"Lrc0/h;", "Lcom/squareup/wire/f;", "", "Lokio/k;", "public_key", "key_id", "", "handle", "Lrc0/g;", "identified_key", "unknownFields", "<init>", "(Lokio/k;Lokio/k;Ljava/lang/Integer;Lrc0/g;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;Lokio/k;Ljava/lang/Integer;Lrc0/g;Lokio/k;)Lrc0/h;", "Lokio/k;", "f", "()Lokio/k;", "b", "e", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "Lrc0/g;", "()Lrc0/g;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<h> f107673f = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(h.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "publicKey", tag = 1)
    private final okio.k public_key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "keyId", tag = 2)
    private final okio.k key_id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 3)
    private final Integer handle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.signatures.IdentifiedKey#ADAPTER", jsonName = "identifiedKey", tag = 4)
    private final g identified_key;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"rc0/h$a", "Lcom/squareup/wire/ProtoAdapter;", "Lrc0/h;", "value", "", "c", "(Lrc0/h;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lrc0/h;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lrc0/h;", DateTokenConverter.CONVERTER_KEY, "(Lrc0/h;)Lrc0/h;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<h> {
        a(com.squareup.wire.b bVar, co0.d<h> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/Signatures.KeyIdentity", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            okio.k kVarDecode = null;
            okio.k kVarDecode2 = null;
            Integer numDecode = null;
            g gVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new h(kVarDecode, kVarDecode2, numDecode, gVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                } else if (iG == 2) {
                    kVarDecode2 = ProtoAdapter.BYTES.decode(reader);
                } else if (iG == 3) {
                    numDecode = ProtoAdapter.UINT32.decode(reader);
                } else if (iG != 4) {
                    reader.m(iG);
                } else {
                    try {
                        gVarDecode = g.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, h value) {
            s.k(writer, "writer");
            s.k(value, "value");
            ProtoAdapter<okio.k> protoAdapter = ProtoAdapter.BYTES;
            protoAdapter.encodeWithTag(writer, 1, value.getPublic_key());
            protoAdapter.encodeWithTag(writer, 2, value.getKey_id());
            ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.getHandle());
            g.ADAPTER.encodeWithTag(writer, 4, value.getIdentified_key());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(h value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<okio.k> protoAdapter = ProtoAdapter.BYTES;
            return iD + protoAdapter.encodedSizeWithTag(1, value.getPublic_key()) + protoAdapter.encodedSizeWithTag(2, value.getKey_id()) + ProtoAdapter.UINT32.encodedSizeWithTag(3, value.getHandle()) + g.ADAPTER.encodedSizeWithTag(4, value.getIdentified_key());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public h redact(h value) {
            s.k(value, "value");
            return h.b(value, null, null, null, null, okio.k.f97943e, 15, null);
        }
    }

    public h() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ h b(h hVar, okio.k kVar, okio.k kVar2, Integer num, g gVar, okio.k kVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = hVar.public_key;
        }
        if ((i11 & 2) != 0) {
            kVar2 = hVar.key_id;
        }
        if ((i11 & 4) != 0) {
            num = hVar.handle;
        }
        if ((i11 & 8) != 0) {
            gVar = hVar.identified_key;
        }
        if ((i11 & 16) != 0) {
            kVar3 = hVar.unknownFields();
        }
        okio.k kVar4 = kVar3;
        Integer num2 = num;
        return hVar.a(kVar, kVar2, num2, gVar, kVar4);
    }

    public final h a(okio.k public_key, okio.k key_id, Integer handle, g identified_key, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new h(public_key, key_id, handle, identified_key, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getHandle() {
        return this.handle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final g getIdentified_key() {
        return this.identified_key;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final okio.k getKey_id() {
        return this.key_id;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return s.f(unknownFields(), hVar.unknownFields()) && s.f(this.public_key, hVar.public_key) && s.f(this.key_id, hVar.key_id) && s.f(this.handle, hVar.handle) && this.identified_key == hVar.identified_key;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final okio.k getPublic_key() {
        return this.public_key;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        okio.k kVar = this.public_key;
        int iHashCode2 = (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 37;
        okio.k kVar2 = this.key_id;
        int iHashCode3 = (iHashCode2 + (kVar2 != null ? kVar2.hashCode() : 0)) * 37;
        Integer num = this.handle;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        g gVar = this.identified_key;
        int iHashCode5 = iHashCode4 + (gVar != null ? gVar.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m759newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        okio.k kVar = this.public_key;
        if (kVar != null) {
            arrayList.add("public_key=" + kVar);
        }
        okio.k kVar2 = this.key_id;
        if (kVar2 != null) {
            arrayList.add("key_id=" + kVar2);
        }
        Integer num = this.handle;
        if (num != null) {
            arrayList.add("handle=" + num);
        }
        g gVar = this.identified_key;
        if (gVar != null) {
            arrayList.add("identified_key=" + gVar);
        }
        return v.y0(arrayList, ", ", "KeyIdentity{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ h(okio.k kVar, okio.k kVar2, Integer num, g gVar, okio.k kVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : kVar, (i11 & 2) != 0 ? null : kVar2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : gVar, (i11 & 16) != 0 ? okio.k.f97943e : kVar3);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m759newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(okio.k kVar, okio.k kVar2, Integer num, g gVar, okio.k unknownFields) {
        super(f107673f, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.public_key = kVar;
        this.key_id = kVar2;
        this.handle = num;
        this.identified_key = gVar;
        if (x20.d.e(kVar, kVar2, num, gVar, new Object[0]) > 1) {
            throw new IllegalArgumentException("At most one of public_key, key_id, handle, identified_key may be non-null");
        }
    }
}
