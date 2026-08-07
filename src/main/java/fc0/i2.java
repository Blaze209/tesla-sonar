package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lfc0/i2;", "Lcom/squareup/wire/f;", "", "", "volume_delta", "", "volume_absolute_float", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/Integer;Ljava/lang/Float;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/Integer;Ljava/lang/Float;Lokio/k;)Lfc0/i2;", "Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Integer;", "b", "Ljava/lang/Float;", "c", "()Ljava/lang/Float;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<i2> f65112d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(i2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "volumeDelta", tag = 1)
    private final Integer volume_delta;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "volumeAbsoluteFloat", tag = 3)
    private final Float volume_absolute_float;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/i2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/i2;", "value", "", "c", "(Lfc0/i2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/i2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/i2;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/i2;)Lfc0/i2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<i2> {
        a(com.squareup.wire.b bVar, co0.d<i2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.MediaUpdateVolume", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i2 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            Integer numDecode = null;
            Float fDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new i2(numDecode, fDecode, reader.e(jD));
                }
                if (iG == 1) {
                    numDecode = ProtoAdapter.SINT32.decode(reader);
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    fDecode = ProtoAdapter.FLOAT.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, i2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter.SINT32.encodeWithTag(writer, 1, value.getVolume_delta());
            ProtoAdapter.FLOAT.encodeWithTag(writer, 3, value.getVolume_absolute_float());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(i2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return value.unknownFields().D() + ProtoAdapter.SINT32.encodedSizeWithTag(1, value.getVolume_delta()) + ProtoAdapter.FLOAT.encodedSizeWithTag(3, value.getVolume_absolute_float());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public i2 redact(i2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return i2.b(value, null, null, okio.k.f97943e, 3, null);
        }
    }

    public i2() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ i2 b(i2 i2Var, Integer num, Float f11, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = i2Var.volume_delta;
        }
        if ((i11 & 2) != 0) {
            f11 = i2Var.volume_absolute_float;
        }
        if ((i11 & 4) != 0) {
            kVar = i2Var.unknownFields();
        }
        return i2Var.a(num, f11, kVar);
    }

    public final i2 a(Integer volume_delta, Float volume_absolute_float, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new i2(volume_delta, volume_absolute_float, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Float getVolume_absolute_float() {
        return this.volume_absolute_float;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getVolume_delta() {
        return this.volume_delta;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), i2Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.volume_delta, i2Var.volume_delta) && p013kotlin.jvm.internal.s.e(this.volume_absolute_float, i2Var.volume_absolute_float);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.volume_delta;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        Float f11 = this.volume_absolute_float;
        int iHashCode3 = iHashCode2 + (f11 != null ? f11.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m258newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.volume_delta;
        if (num != null) {
            arrayList.add("volume_delta=" + num);
        }
        Float f11 = this.volume_absolute_float;
        if (f11 != null) {
            arrayList.add("volume_absolute_float=" + f11);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "MediaUpdateVolume{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ i2(Integer num, Float f11, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : f11, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m258newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(Integer num, Float f11, okio.k unknownFields) {
        super(f65112d, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.volume_delta = num;
        this.volume_absolute_float = f11;
        if (x20.d.c(num, f11) > 1) {
            throw new IllegalArgumentException("At most one of volume_delta, volume_absolute_float may be non-null");
        }
    }
}
