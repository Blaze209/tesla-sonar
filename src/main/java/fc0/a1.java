package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u0013¨\u0006 "}, d2 = {"Lfc0/a1;", "Lcom/squareup/wire/f;", "", "", "include_meta_data", "", "radius", "count", "Lokio/k;", "unknownFields", "<init>", "(ZIILokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ZIILokio/k;)Lfc0/a1;", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "b", "I", "e", "c", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a1 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<a1> f64854e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(a1.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "includeMetaData", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final boolean include_meta_data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final int radius;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final int count;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/a1$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/a1;", "value", "", "c", "(Lfc0/a1;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/a1;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/a1;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/a1;)Lfc0/a1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<a1> {
        a(com.squareup.wire.b bVar, co0.d<a1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.GetNearbyChargingSites", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a1 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            boolean zBooleanValue = false;
            int iIntValue = 0;
            int iIntValue2 = 0;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new a1(zBooleanValue, iIntValue, iIntValue2, reader.e(jD));
                }
                if (iG == 1) {
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (iG == 2) {
                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, a1 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getInclude_meta_data()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.getInclude_meta_data()));
            }
            if (value.getRadius() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(value.getRadius()));
            }
            if (value.getCount() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getCount()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(a1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getInclude_meta_data()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getInclude_meta_data()));
            }
            if (value.getRadius() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getRadius()));
            }
            return value.getCount() != 0 ? iD + ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getCount())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a1 redact(a1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return a1.b(value, false, 0, 0, okio.k.f97943e, 7, null);
        }
    }

    public a1() {
        this(false, 0, 0, null, 15, null);
    }

    public static /* synthetic */ a1 b(a1 a1Var, boolean z11, int i11, int i12, okio.k kVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z11 = a1Var.include_meta_data;
        }
        if ((i13 & 2) != 0) {
            i11 = a1Var.radius;
        }
        if ((i13 & 4) != 0) {
            i12 = a1Var.count;
        }
        if ((i13 & 8) != 0) {
            kVar = a1Var.unknownFields();
        }
        return a1Var.a(z11, i11, i12, kVar);
    }

    public final a1 a(boolean include_meta_data, int radius, int count, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new a1(include_meta_data, radius, count, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getInclude_meta_data() {
        return this.include_meta_data;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getRadius() {
        return this.radius;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), a1Var.unknownFields()) && this.include_meta_data == a1Var.include_meta_data && this.radius == a1Var.radius && this.count == a1Var.count;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.include_meta_data)) * 37) + Integer.hashCode(this.radius)) * 37) + Integer.hashCode(this.count);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m196newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("include_meta_data=" + this.include_meta_data);
        arrayList.add("radius=" + this.radius);
        arrayList.add("count=" + this.count);
        return p013kotlin.collections.v.y0(arrayList, ", ", "GetNearbyChargingSites{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ a1(boolean z11, int i11, int i12, okio.k kVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z11, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m196newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(boolean z11, int i11, int i12, okio.k unknownFields) {
        super(f64854e, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.include_meta_data = z11;
        this.radius = i11;
        this.count = i12;
    }
}
