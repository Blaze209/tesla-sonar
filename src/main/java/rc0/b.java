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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBC\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u0015R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001d¨\u0006$"}, d2 = {"Lrc0/b;", "Lcom/squareup/wire/f;", "", "Lokio/k;", "epoch", "nonce", "", "counter", "expires_at", "tag", "unknownFields", "<init>", "(Lokio/k;Lokio/k;IILokio/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;Lokio/k;IILokio/k;Lokio/k;)Lrc0/b;", "Lokio/k;", DateTokenConverter.CONVERTER_KEY, "()Lokio/k;", "b", "f", "c", "I", "e", "g", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends com.squareup.wire.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ProtoAdapter<b> f107649g = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(b.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)
    private final okio.k epoch;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)
    private final okio.k nonce;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 3)
    private final int counter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FIXED32", jsonName = "expiresAt", label = q.a.OMIT_IDENTITY, tag = 4)
    private final int expires_at;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 5)
    private final okio.k tag;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"rc0/b$a", "Lcom/squareup/wire/ProtoAdapter;", "Lrc0/b;", "value", "", "c", "(Lrc0/b;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lrc0/b;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lrc0/b;", DateTokenConverter.CONVERTER_KEY, "(Lrc0/b;)Lrc0/b;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, co0.d<b> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/Signatures.AES_GCM_Personalized_Signature_Data", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            okio.k kVarDecode = okio.k.f97943e;
            long jD = reader.d();
            okio.k kVarDecode2 = kVarDecode;
            int iIntValue = 0;
            int iIntValue2 = 0;
            okio.k kVarDecode3 = kVarDecode2;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new b(kVarDecode, kVarDecode3, iIntValue, iIntValue2, kVarDecode2, reader.e(jD));
                }
                if (iG == 1) {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                } else if (iG == 2) {
                    kVarDecode3 = ProtoAdapter.BYTES.decode(reader);
                } else if (iG == 3) {
                    iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (iG == 4) {
                    iIntValue2 = ProtoAdapter.FIXED32.decode(reader).intValue();
                } else if (iG != 5) {
                    reader.m(iG);
                } else {
                    kVarDecode2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, b value) {
            s.k(writer, "writer");
            s.k(value, "value");
            okio.k epoch = value.getEpoch();
            okio.k kVar = okio.k.f97943e;
            if (!s.f(epoch, kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getEpoch());
            }
            if (!s.f(value.getNonce(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getNonce());
            }
            if (value.getCounter() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.getCounter()));
            }
            if (value.getExpires_at() != 0) {
                ProtoAdapter.FIXED32.encodeWithTag(writer, 4, Integer.valueOf(value.getExpires_at()));
            }
            if (!s.f(value.getTag(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 5, value.getTag());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(b value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            okio.k epoch = value.getEpoch();
            okio.k kVar = okio.k.f97943e;
            if (!s.f(epoch, kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getEpoch());
            }
            if (!s.f(value.getNonce(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getNonce());
            }
            if (value.getCounter() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.getCounter()));
            }
            if (value.getExpires_at() != 0) {
                iD += ProtoAdapter.FIXED32.encodedSizeWithTag(4, Integer.valueOf(value.getExpires_at()));
            }
            return !s.f(value.getTag(), kVar) ? iD + ProtoAdapter.BYTES.encodedSizeWithTag(5, value.getTag()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b redact(b value) {
            s.k(value, "value");
            return b.b(value, null, null, 0, 0, null, okio.k.f97943e, 31, null);
        }
    }

    public b() {
        this(null, null, 0, 0, null, null, 63, null);
    }

    public static /* synthetic */ b b(b bVar, okio.k kVar, okio.k kVar2, int i11, int i12, okio.k kVar3, okio.k kVar4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            kVar = bVar.epoch;
        }
        if ((i13 & 2) != 0) {
            kVar2 = bVar.nonce;
        }
        if ((i13 & 4) != 0) {
            i11 = bVar.counter;
        }
        if ((i13 & 8) != 0) {
            i12 = bVar.expires_at;
        }
        if ((i13 & 16) != 0) {
            kVar3 = bVar.tag;
        }
        if ((i13 & 32) != 0) {
            kVar4 = bVar.unknownFields();
        }
        okio.k kVar5 = kVar3;
        okio.k kVar6 = kVar4;
        return bVar.a(kVar, kVar2, i11, i12, kVar5, kVar6);
    }

    public final b a(okio.k epoch, okio.k nonce, int counter, int expires_at, okio.k tag, okio.k unknownFields) {
        s.k(epoch, "epoch");
        s.k(nonce, "nonce");
        s.k(tag, "tag");
        s.k(unknownFields, "unknownFields");
        return new b(epoch, nonce, counter, expires_at, tag, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCounter() {
        return this.counter;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final okio.k getEpoch() {
        return this.epoch;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getExpires_at() {
        return this.expires_at;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return s.f(unknownFields(), bVar.unknownFields()) && s.f(this.epoch, bVar.epoch) && s.f(this.nonce, bVar.nonce) && this.counter == bVar.counter && this.expires_at == bVar.expires_at && s.f(this.tag, bVar.tag);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final okio.k getNonce() {
        return this.nonce;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final okio.k getTag() {
        return this.tag;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.epoch.hashCode()) * 37) + this.nonce.hashCode()) * 37) + Integer.hashCode(this.counter)) * 37) + Integer.hashCode(this.expires_at)) * 37) + this.tag.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m754newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("epoch=" + this.epoch);
        arrayList.add("nonce=" + this.nonce);
        arrayList.add("counter=" + this.counter);
        arrayList.add("expires_at=" + this.expires_at);
        arrayList.add("tag=" + this.tag);
        return v.y0(arrayList, ", ", "AES_GCM_Personalized_Signature_Data{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ b(okio.k kVar, okio.k kVar2, int i11, int i12, okio.k kVar3, okio.k kVar4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? okio.k.f97943e : kVar, (i13 & 2) != 0 ? okio.k.f97943e : kVar2, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? okio.k.f97943e : kVar3, (i13 & 32) != 0 ? okio.k.f97943e : kVar4);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m754newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(okio.k epoch, okio.k nonce, int i11, int i12, okio.k tag, okio.k unknownFields) {
        super(f107649g, unknownFields);
        s.k(epoch, "epoch");
        s.k(nonce, "nonce");
        s.k(tag, "tag");
        s.k(unknownFields, "unknownFields");
        this.epoch = epoch;
        this.nonce = nonce;
        this.counter = i11;
        this.expires_at = i12;
        this.tag = tag;
    }
}
