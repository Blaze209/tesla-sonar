package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import ezvcard.property.Gender;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB9\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b\"\u0010'¨\u0006("}, d2 = {"Lfc0/v4;", "Lcom/squareup/wire/f;", "", "", "show_index", "", "start_time", "", "volume", "", "dance_moves", "Lokio/k;", "unknownFields", "<init>", "(IJFZLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(IJFZLokio/k;)Lfc0/v4;", "I", DateTokenConverter.CONVERTER_KEY, "b", "J", "e", "()J", "c", Gender.FEMALE, "f", "()F", "Z", "()Z", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v4 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<v4> f65519f = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(v4.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "showIndex", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final int show_index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "startTime", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final long start_time;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final float volume;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "danceMoves", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final boolean dance_moves;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/v4$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/v4;", "value", "", "c", "(Lfc0/v4;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/v4;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/v4;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/v4;)Lfc0/v4;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<v4> {
        a(com.squareup.wire.b bVar, co0.d<v4> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.StartLightShowAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public v4 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            int iIntValue = 0;
            boolean zBooleanValue = false;
            long jLongValue = 0;
            float fFloatValue = 0.0f;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new v4(iIntValue, jLongValue, fFloatValue, zBooleanValue, reader.e(jD));
                }
                if (iG == 1) {
                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (iG == 2) {
                    jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                } else if (iG == 3) {
                    fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                } else if (iG != 4) {
                    reader.m(iG);
                } else {
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, v4 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getShow_index() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getShow_index()));
            }
            if (value.getStart_time() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 2, Long.valueOf(value.getStart_time()));
            }
            if (value.getVolume() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 3, Float.valueOf(value.getVolume()));
            }
            if (value.getDance_moves()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.getDance_moves()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(v4 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getShow_index() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getShow_index()));
            }
            if (value.getStart_time() != 0) {
                iD += ProtoAdapter.INT64.encodedSizeWithTag(2, Long.valueOf(value.getStart_time()));
            }
            if (value.getVolume() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getVolume()));
            }
            return value.getDance_moves() ? iD + ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getDance_moves())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public v4 redact(v4 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return v4.b(value, 0, 0L, BitmapDescriptorFactory.HUE_RED, false, okio.k.f97943e, 15, null);
        }
    }

    public v4() {
        this(0, 0L, BitmapDescriptorFactory.HUE_RED, false, null, 31, null);
    }

    public static /* synthetic */ v4 b(v4 v4Var, int i11, long j11, float f11, boolean z11, okio.k kVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = v4Var.show_index;
        }
        if ((i12 & 2) != 0) {
            j11 = v4Var.start_time;
        }
        if ((i12 & 4) != 0) {
            f11 = v4Var.volume;
        }
        if ((i12 & 8) != 0) {
            z11 = v4Var.dance_moves;
        }
        if ((i12 & 16) != 0) {
            kVar = v4Var.unknownFields();
        }
        okio.k kVar2 = kVar;
        float f12 = f11;
        return v4Var.a(i11, j11, f12, z11, kVar2);
    }

    public final v4 a(int show_index, long start_time, float volume, boolean dance_moves, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new v4(show_index, start_time, volume, dance_moves, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDance_moves() {
        return this.dance_moves;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getShow_index() {
        return this.show_index;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getStart_time() {
        return this.start_time;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), v4Var.unknownFields()) && this.show_index == v4Var.show_index && this.start_time == v4Var.start_time && this.volume == v4Var.volume && this.dance_moves == v4Var.dance_moves;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getVolume() {
        return this.volume;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.show_index)) * 37) + Long.hashCode(this.start_time)) * 37) + Float.hashCode(this.volume)) * 37) + Boolean.hashCode(this.dance_moves);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m354newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("show_index=" + this.show_index);
        arrayList.add("start_time=" + this.start_time);
        arrayList.add("volume=" + this.volume);
        arrayList.add("dance_moves=" + this.dance_moves);
        return p013kotlin.collections.v.y0(arrayList, ", ", "StartLightShowAction{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ v4(int i11, long j11, float f11, boolean z11, okio.k kVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? 0L : j11, (i12 & 4) != 0 ? BitmapDescriptorFactory.HUE_RED : f11, (i12 & 8) != 0 ? false : z11, (i12 & 16) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m354newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(int i11, long j11, float f11, boolean z11, okio.k unknownFields) {
        super(f65519f, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.show_index = i11;
        this.start_time = j11;
        this.volume = f11;
        this.dance_moves = z11;
    }
}
