package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB9\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0014R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lgc0/x0;", "Lcom/squareup/wire/f;", "", "Lokio/k;", "image_id", "data_", "", "data_chunk_size", "start_offset", "unknownFields", "<init>", "(Lokio/k;Lokio/k;IILokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;Lokio/k;IILokio/k;)Lgc0/x0;", "Lokio/k;", "e", "()Lokio/k;", "b", "c", "I", DateTokenConverter.CONVERTER_KEY, "f", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<x0> f68704f = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(x0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "imageId", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final okio.k image_id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", declaredName = "data", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final okio.k data_;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "dataChunkSize", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final int data_chunk_size;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "startOffset", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final int start_offset;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/x0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/x0;", "value", "", "c", "(Lgc0/x0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/x0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/x0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/x0;)Lgc0/x0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<x0> {
        a(com.squareup.wire.b bVar, co0.d<x0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleImageData", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public x0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            okio.k kVarDecode = okio.k.f97943e;
            long jD = reader.d();
            int iIntValue = 0;
            int iIntValue2 = 0;
            okio.k kVarDecode2 = kVarDecode;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new x0(kVarDecode, kVarDecode2, iIntValue, iIntValue2, reader.e(jD));
                }
                if (iG == 1) {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                } else if (iG == 2) {
                    kVarDecode2 = ProtoAdapter.BYTES.decode(reader);
                } else if (iG == 3) {
                    iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (iG != 4) {
                    reader.m(iG);
                } else {
                    iIntValue2 = ProtoAdapter.UINT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, x0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            okio.k image_id = value.getImage_id();
            okio.k kVar = okio.k.f97943e;
            if (!p013kotlin.jvm.internal.s.f(image_id, kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getImage_id());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getData_(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getData_());
            }
            if (value.getData_chunk_size() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.getData_chunk_size()));
            }
            if (value.getStart_offset() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 4, Integer.valueOf(value.getStart_offset()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(x0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            okio.k image_id = value.getImage_id();
            okio.k kVar = okio.k.f97943e;
            if (!p013kotlin.jvm.internal.s.f(image_id, kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getImage_id());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getData_(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getData_());
            }
            if (value.getData_chunk_size() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.getData_chunk_size()));
            }
            return value.getStart_offset() != 0 ? iD + ProtoAdapter.UINT32.encodedSizeWithTag(4, Integer.valueOf(value.getStart_offset())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public x0 redact(x0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return x0.b(value, null, null, 0, 0, okio.k.f97943e, 15, null);
        }
    }

    public x0() {
        this(null, null, 0, 0, null, 31, null);
    }

    public static /* synthetic */ x0 b(x0 x0Var, okio.k kVar, okio.k kVar2, int i11, int i12, okio.k kVar3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            kVar = x0Var.image_id;
        }
        if ((i13 & 2) != 0) {
            kVar2 = x0Var.data_;
        }
        if ((i13 & 4) != 0) {
            i11 = x0Var.data_chunk_size;
        }
        if ((i13 & 8) != 0) {
            i12 = x0Var.start_offset;
        }
        if ((i13 & 16) != 0) {
            kVar3 = x0Var.unknownFields();
        }
        okio.k kVar4 = kVar3;
        int i14 = i11;
        return x0Var.a(kVar, kVar2, i14, i12, kVar4);
    }

    public final x0 a(okio.k image_id, okio.k data_, int data_chunk_size, int start_offset, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(image_id, "image_id");
        p013kotlin.jvm.internal.s.k(data_, "data_");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new x0(image_id, data_, data_chunk_size, start_offset, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final okio.k getData_() {
        return this.data_;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getData_chunk_size() {
        return this.data_chunk_size;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final okio.k getImage_id() {
        return this.image_id;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), x0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.image_id, x0Var.image_id) && p013kotlin.jvm.internal.s.f(this.data_, x0Var.data_) && this.data_chunk_size == x0Var.data_chunk_size && this.start_offset == x0Var.start_offset;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getStart_offset() {
        return this.start_offset;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.image_id.hashCode()) * 37) + this.data_.hashCode()) * 37) + Integer.hashCode(this.data_chunk_size)) * 37) + Integer.hashCode(this.start_offset);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m456newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("image_id=" + this.image_id);
        arrayList.add("data_=" + this.data_);
        arrayList.add("data_chunk_size=" + this.data_chunk_size);
        arrayList.add("start_offset=" + this.start_offset);
        return p013kotlin.collections.v.y0(arrayList, ", ", "VehicleImageData{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ x0(okio.k kVar, okio.k kVar2, int i11, int i12, okio.k kVar3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? okio.k.f97943e : kVar, (i13 & 2) != 0 ? okio.k.f97943e : kVar2, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? okio.k.f97943e : kVar3);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m456newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(okio.k image_id, okio.k data_, int i11, int i12, okio.k unknownFields) {
        super(f68704f, unknownFields);
        p013kotlin.jvm.internal.s.k(image_id, "image_id");
        p013kotlin.jvm.internal.s.k(data_, "data_");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.image_id = image_id;
        this.data_ = data_;
        this.data_chunk_size = i11;
        this.start_offset = i12;
    }
}
