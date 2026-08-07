package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BI\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b$\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,¨\u0006-"}, d2 = {"Lgc0/w0;", "Lcom/squareup/wire/f;", "", "Lgc0/z0;", "type", "", "is_local_image", "Lokio/k;", "image_id", "Lgc0/x0;", "asset_data", "", "total_image_size", "unknownFields", "<init>", "(Lgc0/z0;ZLokio/k;Lgc0/x0;Ljava/lang/Integer;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lgc0/z0;ZLokio/k;Lgc0/x0;Ljava/lang/Integer;Lokio/k;)Lgc0/w0;", "Lgc0/z0;", "f", "()Lgc0/z0;", "b", "Z", "g", "()Z", "c", "Lokio/k;", DateTokenConverter.CONVERTER_KEY, "()Lokio/k;", "Lgc0/x0;", "()Lgc0/x0;", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ProtoAdapter<w0> f68666g = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(w0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleImageStateType#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final z0 type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isLocalImage", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final boolean is_local_image;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "imageId", tag = 1)
    private final okio.k image_id;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleImageData#ADAPTER", jsonName = "assetData", tag = 2)
    private final x0 asset_data;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "totalImageSize", tag = 5)
    private final Integer total_image_size;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/w0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/w0;", "value", "", "c", "(Lgc0/w0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/w0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/w0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/w0;)Lgc0/w0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<w0> {
        a(com.squareup.wire.b bVar, co0.d<w0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleImage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public w0 decode(com.squareup.wire.k reader) throws IOException {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            z0 z0VarDecode = z0.APVIZ_INVALID;
            long jD = reader.d();
            okio.k kVarDecode = null;
            boolean zBooleanValue = false;
            x0 x0VarDecode = null;
            Integer numDecode = null;
            while (true) {
                z0 z0Var = z0VarDecode;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new w0(z0Var, zBooleanValue, kVarDecode, x0VarDecode, numDecode, reader.e(jD));
                    }
                    if (iG == 1) {
                        kVarDecode = ProtoAdapter.BYTES.decode(reader);
                    } else if (iG == 2) {
                        x0VarDecode = x0.f68704f.decode(reader);
                    } else if (iG == 3) {
                        try {
                            z0VarDecode = z0.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                        }
                    } else if (iG == 4) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iG != 5) {
                        reader.m(iG);
                    } else {
                        numDecode = ProtoAdapter.UINT32.decode(reader);
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, w0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getType() != z0.APVIZ_INVALID) {
                z0.ADAPTER.encodeWithTag(writer, 3, value.getType());
            }
            if (value.getIs_local_image()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.getIs_local_image()));
            }
            ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getImage_id());
            x0.f68704f.encodeWithTag(writer, 2, value.getAsset_data());
            ProtoAdapter.UINT32.encodeWithTag(writer, 5, value.getTotal_image_size());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(w0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getType() != z0.APVIZ_INVALID) {
                iD += z0.ADAPTER.encodedSizeWithTag(3, value.getType());
            }
            if (value.getIs_local_image()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_local_image()));
            }
            return iD + ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getImage_id()) + x0.f68704f.encodedSizeWithTag(2, value.getAsset_data()) + ProtoAdapter.UINT32.encodedSizeWithTag(5, value.getTotal_image_size());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public w0 redact(w0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            x0 asset_data = value.getAsset_data();
            return w0.b(value, null, false, null, asset_data != null ? x0.f68704f.redact(asset_data) : null, null, okio.k.f97943e, 23, null);
        }
    }

    public w0() {
        this(null, false, null, null, null, null, 63, null);
    }

    public static /* synthetic */ w0 b(w0 w0Var, z0 z0Var, boolean z11, okio.k kVar, x0 x0Var, Integer num, okio.k kVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z0Var = w0Var.type;
        }
        if ((i11 & 2) != 0) {
            z11 = w0Var.is_local_image;
        }
        if ((i11 & 4) != 0) {
            kVar = w0Var.image_id;
        }
        if ((i11 & 8) != 0) {
            x0Var = w0Var.asset_data;
        }
        if ((i11 & 16) != 0) {
            num = w0Var.total_image_size;
        }
        if ((i11 & 32) != 0) {
            kVar2 = w0Var.unknownFields();
        }
        Integer num2 = num;
        okio.k kVar3 = kVar2;
        return w0Var.a(z0Var, z11, kVar, x0Var, num2, kVar3);
    }

    public final w0 a(z0 type, boolean is_local_image, okio.k image_id, x0 asset_data, Integer total_image_size, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new w0(type, is_local_image, image_id, asset_data, total_image_size, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final x0 getAsset_data() {
        return this.asset_data;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final okio.k getImage_id() {
        return this.image_id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getTotal_image_size() {
        return this.total_image_size;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), w0Var.unknownFields()) && this.type == w0Var.type && this.is_local_image == w0Var.is_local_image && p013kotlin.jvm.internal.s.f(this.image_id, w0Var.image_id) && p013kotlin.jvm.internal.s.f(this.asset_data, w0Var.asset_data) && p013kotlin.jvm.internal.s.f(this.total_image_size, w0Var.total_image_size);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final z0 getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIs_local_image() {
        return this.is_local_image;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + Boolean.hashCode(this.is_local_image)) * 37;
        okio.k kVar = this.image_id;
        int iHashCode2 = (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 37;
        x0 x0Var = this.asset_data;
        int iHashCode3 = (iHashCode2 + (x0Var != null ? x0Var.hashCode() : 0)) * 37;
        Integer num = this.total_image_size;
        int iHashCode4 = iHashCode3 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m450newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.type);
        arrayList.add("is_local_image=" + this.is_local_image);
        okio.k kVar = this.image_id;
        if (kVar != null) {
            arrayList.add("image_id=" + kVar);
        }
        x0 x0Var = this.asset_data;
        if (x0Var != null) {
            arrayList.add("asset_data=" + x0Var);
        }
        Integer num = this.total_image_size;
        if (num != null) {
            arrayList.add("total_image_size=" + num);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "VehicleImage{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ w0(z0 z0Var, boolean z11, okio.k kVar, x0 x0Var, Integer num, okio.k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? z0.APVIZ_INVALID : z0Var, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : kVar, (i11 & 8) != 0 ? null : x0Var, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? okio.k.f97943e : kVar2);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m450newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(z0 type, boolean z11, okio.k kVar, x0 x0Var, Integer num, okio.k unknownFields) {
        super(f68666g, unknownFields);
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.type = type;
        this.is_local_image = z11;
        this.image_id = kVar;
        this.asset_data = x0Var;
        this.total_image_size = num;
        if (x20.d.c(kVar, x0Var) > 1) {
            throw new IllegalArgumentException("At most one of image_id, asset_data may be non-null");
        }
    }
}
