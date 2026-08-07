package dc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co0.d;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import jn0.e;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b¨\u0006\u001f"}, d2 = {"Ldc0/a;", "Lcom/squareup/wire/f;", "", "Lokio/k;", "nonce", "ciphertext", "tag", "unknownFields", "<init>", "(Lokio/k;Lokio/k;Lokio/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;Lokio/k;Lokio/k;Lokio/k;)Ldc0/a;", "Lokio/k;", DateTokenConverter.CONVERTER_KEY, "()Lokio/k;", "b", "c", "e", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<a> f60437e = new C1228a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(a.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)
    private final k nonce;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)
    private final k ciphertext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 3)
    private final k tag;

    /* JADX INFO: renamed from: dc0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"dc0/a$a", "Lcom/squareup/wire/ProtoAdapter;", "Ldc0/a;", "value", "", "c", "(Ldc0/a;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Ldc0/a;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ldc0/a;", DateTokenConverter.CONVERTER_KEY, "(Ldc0/a;)Ldc0/a;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1228a extends ProtoAdapter<a> {
        C1228a(com.squareup.wire.b bVar, d<a> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/AuthD.EncryptedData", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            k kVarDecode = k.f97943e;
            long jD = reader.d();
            k kVarDecode2 = kVarDecode;
            k kVarDecode3 = kVarDecode2;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new a(kVarDecode, kVarDecode2, kVarDecode3, reader.e(jD));
                }
                if (iG == 1) {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                } else if (iG == 2) {
                    kVarDecode2 = ProtoAdapter.BYTES.decode(reader);
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    kVarDecode3 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, a value) {
            s.k(writer, "writer");
            s.k(value, "value");
            k nonce = value.getNonce();
            k kVar = k.f97943e;
            if (!s.f(nonce, kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getNonce());
            }
            if (!s.f(value.getCiphertext(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getCiphertext());
            }
            if (!s.f(value.getTag(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.getTag());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(a value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            k nonce = value.getNonce();
            k kVar = k.f97943e;
            if (!s.f(nonce, kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getNonce());
            }
            if (!s.f(value.getCiphertext(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getCiphertext());
            }
            return !s.f(value.getTag(), kVar) ? iD + ProtoAdapter.BYTES.encodedSizeWithTag(3, value.getTag()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a redact(a value) {
            s.k(value, "value");
            return a.b(value, null, null, null, k.f97943e, 7, null);
        }
    }

    public a() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ a b(a aVar, k kVar, k kVar2, k kVar3, k kVar4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = aVar.nonce;
        }
        if ((i11 & 2) != 0) {
            kVar2 = aVar.ciphertext;
        }
        if ((i11 & 4) != 0) {
            kVar3 = aVar.tag;
        }
        if ((i11 & 8) != 0) {
            kVar4 = aVar.unknownFields();
        }
        return aVar.a(kVar, kVar2, kVar3, kVar4);
    }

    public final a a(k nonce, k ciphertext, k tag, k unknownFields) {
        s.k(nonce, "nonce");
        s.k(ciphertext, "ciphertext");
        s.k(tag, "tag");
        s.k(unknownFields, "unknownFields");
        return new a(nonce, ciphertext, tag, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k getCiphertext() {
        return this.ciphertext;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final k getNonce() {
        return this.nonce;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final k getTag() {
        return this.tag;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return s.f(unknownFields(), aVar.unknownFields()) && s.f(this.nonce, aVar.nonce) && s.f(this.ciphertext, aVar.ciphertext) && s.f(this.tag, aVar.tag);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.nonce.hashCode()) * 37) + this.ciphertext.hashCode()) * 37) + this.tag.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m134newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("nonce=" + this.nonce);
        arrayList.add("ciphertext=" + this.ciphertext);
        arrayList.add("tag=" + this.tag);
        return v.y0(arrayList, ", ", "EncryptedData{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ a(k kVar, k kVar2, k kVar3, k kVar4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? k.f97943e : kVar, (i11 & 2) != 0 ? k.f97943e : kVar2, (i11 & 4) != 0 ? k.f97943e : kVar3, (i11 & 8) != 0 ? k.f97943e : kVar4);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k nonce, k ciphertext, k tag, k unknownFields) {
        super(f60437e, unknownFields);
        s.k(nonce, "nonce");
        s.k(ciphertext, "ciphertext");
        s.k(tag, "tag");
        s.k(unknownFields, "unknownFields");
        this.nonce = nonce;
        this.ciphertext = ciphertext;
        this.tag = tag;
    }
}
