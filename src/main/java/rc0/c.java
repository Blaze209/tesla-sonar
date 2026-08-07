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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b¨\u0006 "}, d2 = {"Lrc0/c;", "Lcom/squareup/wire/f;", "", "Lokio/k;", "nonce", "", "counter", "tag", "unknownFields", "<init>", "(Lokio/k;ILokio/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;ILokio/k;Lokio/k;)Lrc0/c;", "Lokio/k;", DateTokenConverter.CONVERTER_KEY, "()Lokio/k;", "b", "I", "c", "e", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<c> f107656e = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(c.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)
    private final okio.k nonce;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 2)
    private final int counter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 3)
    private final okio.k tag;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"rc0/c$a", "Lcom/squareup/wire/ProtoAdapter;", "Lrc0/c;", "value", "", "c", "(Lrc0/c;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lrc0/c;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lrc0/c;", DateTokenConverter.CONVERTER_KEY, "(Lrc0/c;)Lrc0/c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<c> {
        a(com.squareup.wire.b bVar, co0.d<c> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/Signatures.AES_GCM_Response_Signature_Data", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            okio.k kVarDecode = okio.k.f97943e;
            long jD = reader.d();
            int iIntValue = 0;
            okio.k kVarDecode2 = kVarDecode;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new c(kVarDecode, iIntValue, kVarDecode2, reader.e(jD));
                }
                if (iG == 1) {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                } else if (iG == 2) {
                    iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    kVarDecode2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, c value) {
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
            if (!s.f(value.getTag(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.getTag());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(c value) {
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
            return !s.f(value.getTag(), kVar) ? iD + ProtoAdapter.BYTES.encodedSizeWithTag(3, value.getTag()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c redact(c value) {
            s.k(value, "value");
            return c.b(value, null, 0, null, okio.k.f97943e, 7, null);
        }
    }

    public c() {
        this(null, 0, null, null, 15, null);
    }

    public static /* synthetic */ c b(c cVar, okio.k kVar, int i11, okio.k kVar2, okio.k kVar3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            kVar = cVar.nonce;
        }
        if ((i12 & 2) != 0) {
            i11 = cVar.counter;
        }
        if ((i12 & 4) != 0) {
            kVar2 = cVar.tag;
        }
        if ((i12 & 8) != 0) {
            kVar3 = cVar.unknownFields();
        }
        return cVar.a(kVar, i11, kVar2, kVar3);
    }

    public final c a(okio.k nonce, int counter, okio.k tag, okio.k unknownFields) {
        s.k(nonce, "nonce");
        s.k(tag, "tag");
        s.k(unknownFields, "unknownFields");
        return new c(nonce, counter, tag, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCounter() {
        return this.counter;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final okio.k getNonce() {
        return this.nonce;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final okio.k getTag() {
        return this.tag;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return s.f(unknownFields(), cVar.unknownFields()) && s.f(this.nonce, cVar.nonce) && this.counter == cVar.counter && s.f(this.tag, cVar.tag);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.nonce.hashCode()) * 37) + Integer.hashCode(this.counter)) * 37) + this.tag.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m755newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("nonce=" + this.nonce);
        arrayList.add("counter=" + this.counter);
        arrayList.add("tag=" + this.tag);
        return v.y0(arrayList, ", ", "AES_GCM_Response_Signature_Data{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ c(okio.k kVar, int i11, okio.k kVar2, okio.k kVar3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? okio.k.f97943e : kVar, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? okio.k.f97943e : kVar2, (i12 & 8) != 0 ? okio.k.f97943e : kVar3);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m755newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(okio.k nonce, int i11, okio.k tag, okio.k unknownFields) {
        super(f107656e, unknownFields);
        s.k(nonce, "nonce");
        s.k(tag, "tag");
        s.k(unknownFields, "unknownFields");
        this.nonce = nonce;
        this.counter = i11;
        this.tag = tag;
    }
}
