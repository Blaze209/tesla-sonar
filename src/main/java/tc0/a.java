package tc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b¨\u0006\u001f"}, d2 = {"Ltc0/a;", "Lcom/squareup/wire/f;", "", "Lokio/k;", "data_", "iv", "tag", "unknownFields", "<init>", "(Lokio/k;Lokio/k;Lokio/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;Lokio/k;Lokio/k;Lokio/k;)Ltc0/a;", "Lokio/k;", "c", "()Lokio/k;", "b", DateTokenConverter.CONVERTER_KEY, "e", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<a> f113132e = new C2414a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(a.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", declaredName = "data", label = q.a.OMIT_IDENTITY, tag = 1)
    private final okio.k data_;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)
    private final okio.k iv;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 3)
    private final okio.k tag;

    /* JADX INFO: renamed from: tc0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"tc0/a$a", "Lcom/squareup/wire/ProtoAdapter;", "Ltc0/a;", "value", "", "c", "(Ltc0/a;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Ltc0/a;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ltc0/a;", DateTokenConverter.CONVERTER_KEY, "(Ltc0/a;)Ltc0/a;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2414a extends ProtoAdapter<a> {
        C2414a(com.squareup.wire.b bVar, co0.d<a> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.EncryptedData", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            okio.k kVarDecode = okio.k.f97943e;
            long jD = reader.d();
            okio.k kVarDecode2 = kVarDecode;
            okio.k kVarDecode3 = kVarDecode2;
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
            okio.k data_ = value.getData_();
            okio.k kVar = okio.k.f97943e;
            if (!s.f(data_, kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getData_());
            }
            if (!s.f(value.getIv(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getIv());
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
            okio.k data_ = value.getData_();
            okio.k kVar = okio.k.f97943e;
            if (!s.f(data_, kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getData_());
            }
            if (!s.f(value.getIv(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getIv());
            }
            return !s.f(value.getTag(), kVar) ? iD + ProtoAdapter.BYTES.encodedSizeWithTag(3, value.getTag()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a redact(a value) {
            s.k(value, "value");
            return a.b(value, null, null, null, okio.k.f97943e, 7, null);
        }
    }

    public a() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ a b(a aVar, okio.k kVar, okio.k kVar2, okio.k kVar3, okio.k kVar4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = aVar.data_;
        }
        if ((i11 & 2) != 0) {
            kVar2 = aVar.iv;
        }
        if ((i11 & 4) != 0) {
            kVar3 = aVar.tag;
        }
        if ((i11 & 8) != 0) {
            kVar4 = aVar.unknownFields();
        }
        return aVar.a(kVar, kVar2, kVar3, kVar4);
    }

    public final a a(okio.k data_, okio.k iv2, okio.k tag, okio.k unknownFields) {
        s.k(data_, "data_");
        s.k(iv2, "iv");
        s.k(tag, "tag");
        s.k(unknownFields, "unknownFields");
        return new a(data_, iv2, tag, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final okio.k getData_() {
        return this.data_;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final okio.k getIv() {
        return this.iv;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final okio.k getTag() {
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
        return s.f(unknownFields(), aVar.unknownFields()) && s.f(this.data_, aVar.data_) && s.f(this.iv, aVar.iv) && s.f(this.tag, aVar.tag);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.data_.hashCode()) * 37) + this.iv.hashCode()) * 37) + this.tag.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m772newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("data_=" + this.data_);
        arrayList.add("iv=" + this.iv);
        arrayList.add("tag=" + this.tag);
        return v.y0(arrayList, ", ", "EncryptedData{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ a(okio.k kVar, okio.k kVar2, okio.k kVar3, okio.k kVar4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? okio.k.f97943e : kVar, (i11 & 2) != 0 ? okio.k.f97943e : kVar2, (i11 & 4) != 0 ? okio.k.f97943e : kVar3, (i11 & 8) != 0 ? okio.k.f97943e : kVar4);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m772newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(okio.k data_, okio.k iv2, okio.k tag, okio.k unknownFields) {
        super(f113132e, unknownFields);
        s.k(data_, "data_");
        s.k(iv2, "iv");
        s.k(tag, "tag");
        s.k(unknownFields, "unknownFields");
        this.data_ = data_;
        this.iv = iv2;
        this.tag = tag;
    }
}
