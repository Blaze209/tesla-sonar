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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lsc0/e;", "Lcom/squareup/wire/f;", "", "", "chunk_index", "total_chunks", "Lokio/k;", "data_", "unknownFields", "<init>", "(IILokio/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(IILokio/k;Lokio/k;)Lsc0/e;", "I", "c", "b", "e", "Lokio/k;", DateTokenConverter.CONVERTER_KEY, "()Lokio/k;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<e> f111080e = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(e.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "chunkIndex", label = q.a.OMIT_IDENTITY, tag = 1)
    private final int chunk_index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "totalChunks", label = q.a.OMIT_IDENTITY, tag = 2)
    private final int total_chunks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", declaredName = "data", label = q.a.OMIT_IDENTITY, tag = 3)
    private final k data_;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"sc0/e$a", "Lcom/squareup/wire/ProtoAdapter;", "Lsc0/e;", "value", "", "c", "(Lsc0/e;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lsc0/e;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lsc0/e;", DateTokenConverter.CONVERTER_KEY, "(Lsc0/e;)Lsc0/e;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<e> {
        a(com.squareup.wire.b bVar, co0.d<e> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/UniversalMessage.MessageFrame", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            k kVarDecode = k.f97943e;
            long jD = reader.d();
            int iIntValue = 0;
            int iIntValue2 = 0;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new e(iIntValue, iIntValue2, kVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (iG == 2) {
                    iIntValue2 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, e value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getChunk_index() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.getChunk_index()));
            }
            if (value.getTotal_chunks() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getTotal_chunks()));
            }
            if (!s.f(value.getData_(), k.f97943e)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.getData_());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(e value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getChunk_index() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.getChunk_index()));
            }
            if (value.getTotal_chunks() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getTotal_chunks()));
            }
            return !s.f(value.getData_(), k.f97943e) ? iD + ProtoAdapter.BYTES.encodedSizeWithTag(3, value.getData_()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e redact(e value) {
            s.k(value, "value");
            return e.b(value, 0, 0, null, k.f97943e, 7, null);
        }
    }

    public e() {
        this(0, 0, null, null, 15, null);
    }

    public static /* synthetic */ e b(e eVar, int i11, int i12, k kVar, k kVar2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = eVar.chunk_index;
        }
        if ((i13 & 2) != 0) {
            i12 = eVar.total_chunks;
        }
        if ((i13 & 4) != 0) {
            kVar = eVar.data_;
        }
        if ((i13 & 8) != 0) {
            kVar2 = eVar.unknownFields();
        }
        return eVar.a(i11, i12, kVar, kVar2);
    }

    public final e a(int chunk_index, int total_chunks, k data_, k unknownFields) {
        s.k(data_, "data_");
        s.k(unknownFields, "unknownFields");
        return new e(chunk_index, total_chunks, data_, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getChunk_index() {
        return this.chunk_index;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final k getData_() {
        return this.data_;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getTotal_chunks() {
        return this.total_chunks;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return s.f(unknownFields(), eVar.unknownFields()) && this.chunk_index == eVar.chunk_index && this.total_chunks == eVar.total_chunks && s.f(this.data_, eVar.data_);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + Integer.hashCode(this.chunk_index)) * 37) + Integer.hashCode(this.total_chunks)) * 37) + this.data_.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m768newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("chunk_index=" + this.chunk_index);
        arrayList.add("total_chunks=" + this.total_chunks);
        arrayList.add("data_=" + this.data_);
        return v.y0(arrayList, ", ", "MessageFrame{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ e(int i11, int i12, k kVar, k kVar2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? k.f97943e : kVar, (i13 & 8) != 0 ? k.f97943e : kVar2);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m768newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i11, int i12, k data_, k unknownFields) {
        super(f111080e, unknownFields);
        s.k(data_, "data_");
        s.k(unknownFields, "unknownFields");
        this.chunk_index = i11;
        this.total_chunks = i12;
        this.data_ = data_;
    }
}
