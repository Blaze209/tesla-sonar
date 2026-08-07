package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BU\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ[\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010(R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b&\u0010(¨\u0006)"}, d2 = {"Lgc0/c0;", "Lcom/squareup/wire/f;", "", "", "Lgc0/b0;", "light_show_options", "", "light_show_schedule_times", "", "light_show_volume_min", "light_show_volume_max", "light_show_volume_step", "Lokio/k;", "unknownFields", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lokio/k;)Lgc0/c0;", "Ljava/lang/Float;", "f", "()Ljava/lang/Float;", "b", "e", "c", "g", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ProtoAdapter<c0> f67983g = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(c0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "lightShowVolumeMin", tag = 1)
    private final Float light_show_volume_min;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "lightShowVolumeMax", tag = 2)
    private final Float light_show_volume_max;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "lightShowVolumeStep", tag = 3)
    private final Float light_show_volume_step;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.LightShowOption#ADAPTER", jsonName = "lightShowOptions", label = com.squareup.wire.q.a.REPEATED, tag = 4)
    private final List<b0> light_show_options;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "lightShowScheduleTimes", label = com.squareup.wire.q.a.PACKED, tag = 5)
    private final List<Long> light_show_schedule_times;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/c0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/c0;", "value", "", "c", "(Lgc0/c0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/c0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/c0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/c0;)Lgc0/c0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<c0> {
        a(com.squareup.wire.b bVar, co0.d<c0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.LightShowSettings", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            long jD = reader.d();
            Float fDecode = null;
            Float fDecode2 = null;
            Float fDecode3 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new c0(arrayList, arrayList2, fDecode, fDecode2, fDecode3, reader.e(jD));
                }
                if (iG == 1) {
                    fDecode = ProtoAdapter.FLOAT.decode(reader);
                } else if (iG == 2) {
                    fDecode2 = ProtoAdapter.FLOAT.decode(reader);
                } else if (iG == 3) {
                    fDecode3 = ProtoAdapter.FLOAT.decode(reader);
                } else if (iG == 4) {
                    arrayList.add(b0.f67975d.decode(reader));
                } else if (iG != 5) {
                    reader.m(iG);
                } else {
                    arrayList2.add(ProtoAdapter.UINT64.decode(reader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, c0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            b0.f67975d.asRepeated().encodeWithTag(writer, 4, value.c());
            ProtoAdapter.UINT64.asPacked().encodeWithTag(writer, 5, value.d());
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            protoAdapter.encodeWithTag(writer, 1, value.getLight_show_volume_min());
            protoAdapter.encodeWithTag(writer, 2, value.getLight_show_volume_max());
            protoAdapter.encodeWithTag(writer, 3, value.getLight_show_volume_step());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(c0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D() + b0.f67975d.asRepeated().encodedSizeWithTag(4, value.c()) + ProtoAdapter.UINT64.asPacked().encodedSizeWithTag(5, value.d());
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            return iD + protoAdapter.encodedSizeWithTag(1, value.getLight_show_volume_min()) + protoAdapter.encodedSizeWithTag(2, value.getLight_show_volume_max()) + protoAdapter.encodedSizeWithTag(3, value.getLight_show_volume_step());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c0 redact(c0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return c0.b(value, x20.d.a(value.c(), b0.f67975d), null, null, null, null, okio.k.f97943e, 30, null);
        }
    }

    public c0() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c0 b(c0 c0Var, List list, List list2, Float f11, Float f12, Float f13, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = c0Var.light_show_options;
        }
        if ((i11 & 2) != 0) {
            list2 = c0Var.light_show_schedule_times;
        }
        if ((i11 & 4) != 0) {
            f11 = c0Var.light_show_volume_min;
        }
        if ((i11 & 8) != 0) {
            f12 = c0Var.light_show_volume_max;
        }
        if ((i11 & 16) != 0) {
            f13 = c0Var.light_show_volume_step;
        }
        if ((i11 & 32) != 0) {
            kVar = c0Var.unknownFields();
        }
        Float f14 = f13;
        okio.k kVar2 = kVar;
        return c0Var.a(list, list2, f11, f12, f14, kVar2);
    }

    public final c0 a(List<b0> light_show_options, List<Long> light_show_schedule_times, Float light_show_volume_min, Float light_show_volume_max, Float light_show_volume_step, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(light_show_options, "light_show_options");
        p013kotlin.jvm.internal.s.k(light_show_schedule_times, "light_show_schedule_times");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new c0(light_show_options, light_show_schedule_times, light_show_volume_min, light_show_volume_max, light_show_volume_step, unknownFields);
    }

    public final List<b0> c() {
        return this.light_show_options;
    }

    public final List<Long> d() {
        return this.light_show_schedule_times;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Float getLight_show_volume_max() {
        return this.light_show_volume_max;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), c0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.light_show_options, c0Var.light_show_options) && p013kotlin.jvm.internal.s.f(this.light_show_schedule_times, c0Var.light_show_schedule_times) && p013kotlin.jvm.internal.s.e(this.light_show_volume_min, c0Var.light_show_volume_min) && p013kotlin.jvm.internal.s.e(this.light_show_volume_max, c0Var.light_show_volume_max) && p013kotlin.jvm.internal.s.e(this.light_show_volume_step, c0Var.light_show_volume_step);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Float getLight_show_volume_min() {
        return this.light_show_volume_min;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Float getLight_show_volume_step() {
        return this.light_show_volume_step;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.light_show_options.hashCode()) * 37) + this.light_show_schedule_times.hashCode()) * 37;
        Float f11 = this.light_show_volume_min;
        int iHashCode2 = (iHashCode + (f11 != null ? f11.hashCode() : 0)) * 37;
        Float f12 = this.light_show_volume_max;
        int iHashCode3 = (iHashCode2 + (f12 != null ? f12.hashCode() : 0)) * 37;
        Float f13 = this.light_show_volume_step;
        int iHashCode4 = iHashCode3 + (f13 != null ? f13.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m392newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.light_show_options.isEmpty()) {
            arrayList.add("light_show_options=" + this.light_show_options);
        }
        if (!this.light_show_schedule_times.isEmpty()) {
            arrayList.add("light_show_schedule_times=" + this.light_show_schedule_times);
        }
        Float f11 = this.light_show_volume_min;
        if (f11 != null) {
            arrayList.add("light_show_volume_min=" + f11);
        }
        Float f12 = this.light_show_volume_max;
        if (f12 != null) {
            arrayList.add("light_show_volume_max=" + f12);
        }
        Float f13 = this.light_show_volume_step;
        if (f13 != null) {
            arrayList.add("light_show_volume_step=" + f13);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "LightShowSettings{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ c0(List list, List list2, Float f11, Float f12, Float f13, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? p013kotlin.collections.v.m() : list, (i11 & 2) != 0 ? p013kotlin.collections.v.m() : list2, (i11 & 4) != 0 ? null : f11, (i11 & 8) != 0 ? null : f12, (i11 & 16) != 0 ? null : f13, (i11 & 32) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m392newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(List<b0> light_show_options, List<Long> light_show_schedule_times, Float f11, Float f12, Float f13, okio.k unknownFields) {
        super(f67983g, unknownFields);
        p013kotlin.jvm.internal.s.k(light_show_options, "light_show_options");
        p013kotlin.jvm.internal.s.k(light_show_schedule_times, "light_show_schedule_times");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.light_show_volume_min = f11;
        this.light_show_volume_max = f12;
        this.light_show_volume_step = f13;
        this.light_show_options = x20.d.g("light_show_options", light_show_options);
        this.light_show_schedule_times = x20.d.g("light_show_schedule_times", light_show_schedule_times);
    }
}
