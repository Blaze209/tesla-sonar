package dc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co0.d;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import jn0.e;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Ldc0/b;", "Lcom/squareup/wire/f;", "", "Lokio/k;", "sender_public_key", "", "Ldc0/a;", "wrapped_keys", StatusResponse.PAYLOAD, "unknownFields", "<init>", "(Lokio/k;Ljava/util/List;Ldc0/a;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;Ljava/util/List;Ldc0/a;Lokio/k;)Ldc0/b;", "Lokio/k;", DateTokenConverter.CONVERTER_KEY, "()Lokio/k;", "b", "Ldc0/a;", "c", "()Ldc0/a;", "Ljava/util/List;", "e", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<b> f60442e = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(b.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "senderPublicKey", label = q.a.OMIT_IDENTITY, tag = 1)
    private final k sender_public_key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.authd.EncryptedData#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)
    private final dc0.a payload;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.authd.EncryptedData#ADAPTER", jsonName = "wrappedKeys", label = q.a.REPEATED, tag = 2)
    private final List<dc0.a> wrapped_keys;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"dc0/b$a", "Lcom/squareup/wire/ProtoAdapter;", "Ldc0/b;", "value", "", "c", "(Ldc0/b;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Ldc0/b;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ldc0/b;", DateTokenConverter.CONVERTER_KEY, "(Ldc0/b;)Ldc0/b;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/AuthD.EncryptedMessage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            k kVarDecode = k.f97943e;
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            dc0.a aVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new b(kVarDecode, arrayList, aVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                } else if (iG == 2) {
                    arrayList.add(dc0.a.f60437e.decode(reader));
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    aVarDecode = dc0.a.f60437e.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, b value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (!s.f(value.getSender_public_key(), k.f97943e)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getSender_public_key());
            }
            ProtoAdapter<dc0.a> protoAdapter = dc0.a.f60437e;
            protoAdapter.asRepeated().encodeWithTag(writer, 2, value.e());
            if (value.getPayload() != null) {
                protoAdapter.encodeWithTag(writer, 3, value.getPayload());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(b value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!s.f(value.getSender_public_key(), k.f97943e)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getSender_public_key());
            }
            ProtoAdapter<dc0.a> protoAdapter = dc0.a.f60437e;
            int iEncodedSizeWithTag = iD + protoAdapter.asRepeated().encodedSizeWithTag(2, value.e());
            return value.getPayload() != null ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, value.getPayload()) : iEncodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b redact(b value) {
            s.k(value, "value");
            List<dc0.a> listE = value.e();
            ProtoAdapter<dc0.a> protoAdapter = dc0.a.f60437e;
            List listA = x20.d.a(listE, protoAdapter);
            dc0.a payload = value.getPayload();
            return b.b(value, null, listA, payload != null ? protoAdapter.redact(payload) : null, k.f97943e, 1, null);
        }
    }

    public b() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b b(b bVar, k kVar, List list, dc0.a aVar, k kVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = bVar.sender_public_key;
        }
        if ((i11 & 2) != 0) {
            list = bVar.wrapped_keys;
        }
        if ((i11 & 4) != 0) {
            aVar = bVar.payload;
        }
        if ((i11 & 8) != 0) {
            kVar2 = bVar.unknownFields();
        }
        return bVar.a(kVar, list, aVar, kVar2);
    }

    public final b a(k sender_public_key, List<dc0.a> wrapped_keys, dc0.a payload, k unknownFields) {
        s.k(sender_public_key, "sender_public_key");
        s.k(wrapped_keys, "wrapped_keys");
        s.k(unknownFields, "unknownFields");
        return new b(sender_public_key, wrapped_keys, payload, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final dc0.a getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final k getSender_public_key() {
        return this.sender_public_key;
    }

    public final List<dc0.a> e() {
        return this.wrapped_keys;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return s.f(unknownFields(), bVar.unknownFields()) && s.f(this.sender_public_key, bVar.sender_public_key) && s.f(this.wrapped_keys, bVar.wrapped_keys) && s.f(this.payload, bVar.payload);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.sender_public_key.hashCode()) * 37) + this.wrapped_keys.hashCode()) * 37;
        dc0.a aVar = this.payload;
        int iHashCode2 = iHashCode + (aVar != null ? aVar.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m135newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sender_public_key=" + this.sender_public_key);
        if (!this.wrapped_keys.isEmpty()) {
            arrayList.add("wrapped_keys=" + this.wrapped_keys);
        }
        dc0.a aVar = this.payload;
        if (aVar != null) {
            arrayList.add("payload=" + aVar);
        }
        return v.y0(arrayList, ", ", "EncryptedMessage{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ b(k kVar, List list, dc0.a aVar, k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? k.f97943e : kVar, (i11 & 2) != 0 ? v.m() : list, (i11 & 4) != 0 ? null : aVar, (i11 & 8) != 0 ? k.f97943e : kVar2);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m135newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k sender_public_key, List<dc0.a> wrapped_keys, dc0.a aVar, k unknownFields) {
        super(f60442e, unknownFields);
        s.k(sender_public_key, "sender_public_key");
        s.k(wrapped_keys, "wrapped_keys");
        s.k(unknownFields, "unknownFields");
        this.sender_public_key = sender_public_key;
        this.payload = aVar;
        this.wrapped_keys = x20.d.g("wrapped_keys", wrapped_keys);
    }
}
