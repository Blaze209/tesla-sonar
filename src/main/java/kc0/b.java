package kc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB?\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b!\u0010 R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006%"}, d2 = {"Lkc0/b;", "Lcom/squareup/wire/f;", "", "", "", "response_subscribed", "qos", "Lokio/k;", "token", "signature", "unknownFields", "<init>", "(Ljava/util/List;ILokio/k;Lokio/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Ljava/util/List;ILokio/k;Lokio/k;Lokio/k;)Lkc0/b;", "I", "c", "b", "Lokio/k;", "f", "()Lokio/k;", "e", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<b> f85884f = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(b.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 2)
    private final int qos;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 3)
    private final k token;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 4)
    private final k signature;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "responseSubscribed", label = q.a.PACKED, tag = 1)
    private final List<Integer> response_subscribed;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"kc0/b$a", "Lcom/squareup/wire/ProtoAdapter;", "Lkc0/b;", "value", "", "c", "(Lkc0/b;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lkc0/b;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lkc0/b;", DateTokenConverter.CONVERTER_KEY, "(Lkc0/b;)Lkc0/b;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, co0.d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.FlatbuffersMessageOptions", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b decode(com.squareup.wire.k reader) throws IOException {
            s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            k kVarDecode = k.f97943e;
            long jD = reader.d();
            int iIntValue = 0;
            k kVarDecode2 = kVarDecode;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new b(arrayList, iIntValue, kVarDecode, kVarDecode2, reader.e(jD));
                }
                if (iG == 1) {
                    arrayList.add(ProtoAdapter.UINT32.decode(reader));
                } else if (iG == 2) {
                    iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (iG == 3) {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                } else if (iG != 4) {
                    reader.m(iG);
                } else {
                    kVarDecode2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, b value) {
            s.k(writer, "writer");
            s.k(value, "value");
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.asPacked().encodeWithTag(writer, 1, value.d());
            if (value.getQos() != 0) {
                protoAdapter.encodeWithTag(writer, 2, Integer.valueOf(value.getQos()));
            }
            k token = value.getToken();
            k kVar = k.f97943e;
            if (!s.f(token, kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.getToken());
            }
            if (!s.f(value.getSignature(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 4, value.getSignature());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(b value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            int iEncodedSizeWithTag = iD + protoAdapter.asPacked().encodedSizeWithTag(1, value.d());
            if (value.getQos() != 0) {
                iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(2, Integer.valueOf(value.getQos()));
            }
            k token = value.getToken();
            k kVar = k.f97943e;
            if (!s.f(token, kVar)) {
                iEncodedSizeWithTag += ProtoAdapter.BYTES.encodedSizeWithTag(3, value.getToken());
            }
            return !s.f(value.getSignature(), kVar) ? iEncodedSizeWithTag + ProtoAdapter.BYTES.encodedSizeWithTag(4, value.getSignature()) : iEncodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b redact(b value) {
            s.k(value, "value");
            return b.b(value, null, 0, null, null, k.f97943e, 15, null);
        }
    }

    public b() {
        this(null, 0, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b b(b bVar, List list, int i11, k kVar, k kVar2, k kVar3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = bVar.response_subscribed;
        }
        if ((i12 & 2) != 0) {
            i11 = bVar.qos;
        }
        if ((i12 & 4) != 0) {
            kVar = bVar.token;
        }
        if ((i12 & 8) != 0) {
            kVar2 = bVar.signature;
        }
        if ((i12 & 16) != 0) {
            kVar3 = bVar.unknownFields();
        }
        k kVar4 = kVar3;
        k kVar5 = kVar;
        return bVar.a(list, i11, kVar5, kVar2, kVar4);
    }

    public final b a(List<Integer> response_subscribed, int qos, k token, k signature, k unknownFields) {
        s.k(response_subscribed, "response_subscribed");
        s.k(token, "token");
        s.k(signature, "signature");
        s.k(unknownFields, "unknownFields");
        return new b(response_subscribed, qos, token, signature, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getQos() {
        return this.qos;
    }

    public final List<Integer> d() {
        return this.response_subscribed;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final k getSignature() {
        return this.signature;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return s.f(unknownFields(), bVar.unknownFields()) && s.f(this.response_subscribed, bVar.response_subscribed) && this.qos == bVar.qos && s.f(this.token, bVar.token) && s.f(this.signature, bVar.signature);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final k getToken() {
        return this.token;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.response_subscribed.hashCode()) * 37) + Integer.hashCode(this.qos)) * 37) + this.token.hashCode()) * 37) + this.signature.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m488newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.response_subscribed.isEmpty()) {
            arrayList.add("response_subscribed=" + this.response_subscribed);
        }
        arrayList.add("qos=" + this.qos);
        arrayList.add("token=" + this.token);
        arrayList.add("signature=" + this.signature);
        return v.y0(arrayList, ", ", "FlatbuffersMessageOptions{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ b(List list, int i11, k kVar, k kVar2, k kVar3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? v.m() : list, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? k.f97943e : kVar, (i12 & 8) != 0 ? k.f97943e : kVar2, (i12 & 16) != 0 ? k.f97943e : kVar3);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m488newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List<Integer> response_subscribed, int i11, k token, k signature, k unknownFields) {
        super(f85884f, unknownFields);
        s.k(response_subscribed, "response_subscribed");
        s.k(token, "token");
        s.k(signature, "signature");
        s.k(unknownFields, "unknownFields");
        this.qos = i11;
        this.token = token;
        this.signature = signature;
        this.response_subscribed = x20.d.g("response_subscribed", response_subscribed);
    }
}
