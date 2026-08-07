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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBC\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b!\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b#\u0010\u001d¨\u0006$"}, d2 = {"Lrc0/a;", "Lcom/squareup/wire/f;", "", "Lokio/k;", "nonce", "", "counter", "expires_at", "tag", "prefix", "unknownFields", "<init>", "(Lokio/k;IILokio/k;Lokio/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;IILokio/k;Lokio/k;Lokio/k;)Lrc0/a;", "Lokio/k;", "e", "()Lokio/k;", "b", "I", "c", DateTokenConverter.CONVERTER_KEY, "g", "f", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends com.squareup.wire.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ProtoAdapter<a> f107642g = new C2289a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(a.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)
    private final okio.k nonce;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 2)
    private final int counter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FIXED32", jsonName = "expiresAt", label = q.a.OMIT_IDENTITY, tag = 3)
    private final int expires_at;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 4)
    private final okio.k tag;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 5)
    private final okio.k prefix;

    /* JADX INFO: renamed from: rc0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"rc0/a$a", "Lcom/squareup/wire/ProtoAdapter;", "Lrc0/a;", "value", "", "c", "(Lrc0/a;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lrc0/a;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lrc0/a;", DateTokenConverter.CONVERTER_KEY, "(Lrc0/a;)Lrc0/a;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2289a extends ProtoAdapter<a> {
        C2289a(com.squareup.wire.b bVar, co0.d<a> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/Signatures.AES_GCM_Detached_Signature_Data", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a decode(com.squareup.wire.k reader) {
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
                    return new a(kVarDecode, iIntValue, iIntValue2, kVarDecode3, kVarDecode2, reader.e(jD));
                }
                if (iG == 1) {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                } else if (iG == 2) {
                    iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (iG == 3) {
                    iIntValue2 = ProtoAdapter.FIXED32.decode(reader).intValue();
                } else if (iG == 4) {
                    kVarDecode3 = ProtoAdapter.BYTES.decode(reader);
                } else if (iG != 5) {
                    reader.m(iG);
                } else {
                    kVarDecode2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, a value) {
            s.k(writer, "writer");
            s.k(value, "value");
            okio.k nonce = value.getNonce();
            okio.k kVar = okio.k.f97943e;
            if (!s.f(nonce, kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getNonce());
            }
            if (value.getCounter() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getCounter()));
            }
            if (value.getExpires_at() != 0) {
                ProtoAdapter.FIXED32.encodeWithTag(writer, 3, Integer.valueOf(value.getExpires_at()));
            }
            if (!s.f(value.getTag(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 4, value.getTag());
            }
            if (!s.f(value.getPrefix(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 5, value.getPrefix());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(a value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            okio.k nonce = value.getNonce();
            okio.k kVar = okio.k.f97943e;
            if (!s.f(nonce, kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getNonce());
            }
            if (value.getCounter() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getCounter()));
            }
            if (value.getExpires_at() != 0) {
                iD += ProtoAdapter.FIXED32.encodedSizeWithTag(3, Integer.valueOf(value.getExpires_at()));
            }
            if (!s.f(value.getTag(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(4, value.getTag());
            }
            return !s.f(value.getPrefix(), kVar) ? iD + ProtoAdapter.BYTES.encodedSizeWithTag(5, value.getPrefix()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a redact(a value) {
            s.k(value, "value");
            return a.b(value, null, 0, 0, null, null, okio.k.f97943e, 31, null);
        }
    }

    public a() {
        this(null, 0, 0, null, null, null, 63, null);
    }

    public static /* synthetic */ a b(a aVar, okio.k kVar, int i11, int i12, okio.k kVar2, okio.k kVar3, okio.k kVar4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            kVar = aVar.nonce;
        }
        if ((i13 & 2) != 0) {
            i11 = aVar.counter;
        }
        if ((i13 & 4) != 0) {
            i12 = aVar.expires_at;
        }
        if ((i13 & 8) != 0) {
            kVar2 = aVar.tag;
        }
        if ((i13 & 16) != 0) {
            kVar3 = aVar.prefix;
        }
        if ((i13 & 32) != 0) {
            kVar4 = aVar.unknownFields();
        }
        okio.k kVar5 = kVar3;
        okio.k kVar6 = kVar4;
        return aVar.a(kVar, i11, i12, kVar2, kVar5, kVar6);
    }

    public final a a(okio.k nonce, int counter, int expires_at, okio.k tag, okio.k prefix, okio.k unknownFields) {
        s.k(nonce, "nonce");
        s.k(tag, "tag");
        s.k(prefix, "prefix");
        s.k(unknownFields, "unknownFields");
        return new a(nonce, counter, expires_at, tag, prefix, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCounter() {
        return this.counter;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getExpires_at() {
        return this.expires_at;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final okio.k getNonce() {
        return this.nonce;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return s.f(unknownFields(), aVar.unknownFields()) && s.f(this.nonce, aVar.nonce) && this.counter == aVar.counter && this.expires_at == aVar.expires_at && s.f(this.tag, aVar.tag) && s.f(this.prefix, aVar.prefix);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final okio.k getPrefix() {
        return this.prefix;
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
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.nonce.hashCode()) * 37) + Integer.hashCode(this.counter)) * 37) + Integer.hashCode(this.expires_at)) * 37) + this.tag.hashCode()) * 37) + this.prefix.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m753newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("nonce=" + this.nonce);
        arrayList.add("counter=" + this.counter);
        arrayList.add("expires_at=" + this.expires_at);
        arrayList.add("tag=" + this.tag);
        arrayList.add("prefix=" + this.prefix);
        return v.y0(arrayList, ", ", "AES_GCM_Detached_Signature_Data{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ a(okio.k kVar, int i11, int i12, okio.k kVar2, okio.k kVar3, okio.k kVar4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? okio.k.f97943e : kVar, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? okio.k.f97943e : kVar2, (i13 & 16) != 0 ? okio.k.f97943e : kVar3, (i13 & 32) != 0 ? okio.k.f97943e : kVar4);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m753newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(okio.k nonce, int i11, int i12, okio.k tag, okio.k prefix, okio.k unknownFields) {
        super(f107642g, unknownFields);
        s.k(nonce, "nonce");
        s.k(tag, "tag");
        s.k(prefix, "prefix");
        s.k(unknownFields, "unknownFields");
        this.nonce = nonce;
        this.counter = i11;
        this.expires_at = i12;
        this.tag = tag;
        this.prefix = prefix;
    }
}
