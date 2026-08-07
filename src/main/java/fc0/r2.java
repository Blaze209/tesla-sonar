package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BM\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJS\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b*\u0010)¨\u0006+"}, d2 = {"Lfc0/r2;", "Lcom/squareup/wire/f;", "", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "Lfc0/v;", "destination_charging", "Lfc0/z4;", "superchargers", "", "congestion_sync_time_utc_secs", "Lokio/k;", "unknownFields", "<init>", "(Lj$/time/Instant;Ljava/util/List;Ljava/util/List;JLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lj$/time/Instant;Ljava/util/List;Ljava/util/List;JLokio/k;)Lfc0/r2;", "Lj$/time/Instant;", "f", "()Lj$/time/Instant;", "b", "J", "c", "()J", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "e", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<r2> f65365f = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(r2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final Instant timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "congestionSyncTimeUtcSecs", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final long congestion_sync_time_utc_secs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.DestinationCharging#ADAPTER", jsonName = "destinationCharging", label = com.squareup.wire.q.a.REPEATED, tag = 2)
    private final List<v> destination_charging;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.Superchargers#ADAPTER", label = com.squareup.wire.q.a.REPEATED, tag = 3)
    private final List<z4> superchargers;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/r2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/r2;", "value", "", "c", "(Lfc0/r2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/r2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/r2;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/r2;)Lfc0/r2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<r2> {
        a(com.squareup.wire.b bVar, co0.d<r2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.NearbyChargingSites", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r2 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            long jD = reader.d();
            Instant instantDecode = null;
            long jLongValue = 0;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new r2(instantDecode, arrayList, arrayList2, jLongValue, reader.e(jD));
                }
                if (iG == 1) {
                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                } else if (iG == 2) {
                    arrayList.add(v.f65492n.decode(reader));
                } else if (iG == 3) {
                    arrayList2.add(z4.f65655v.decode(reader));
                } else if (iG != 4) {
                    reader.m(iG);
                } else {
                    jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, r2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 1, value.getTimestamp());
            }
            v.f65492n.asRepeated().encodeWithTag(writer, 2, value.d());
            z4.f65655v.asRepeated().encodeWithTag(writer, 3, value.e());
            if (value.getCongestion_sync_time_utc_secs() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 4, Long.valueOf(value.getCongestion_sync_time_utc_secs()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(r2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(1, value.getTimestamp());
            }
            int iEncodedSizeWithTag = iD + v.f65492n.asRepeated().encodedSizeWithTag(2, value.d()) + z4.f65655v.asRepeated().encodedSizeWithTag(3, value.e());
            return value.getCongestion_sync_time_utc_secs() != 0 ? iEncodedSizeWithTag + ProtoAdapter.INT64.encodedSizeWithTag(4, Long.valueOf(value.getCongestion_sync_time_utc_secs())) : iEncodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public r2 redact(r2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            Instant timestamp = value.getTimestamp();
            return r2.b(value, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, x20.d.a(value.d(), v.f65492n), x20.d.a(value.e(), z4.f65655v), 0L, okio.k.f97943e, 8, null);
        }
    }

    public r2() {
        this(null, null, null, 0L, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ r2 b(r2 r2Var, Instant instant, List list, List list2, long j11, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            instant = r2Var.timestamp;
        }
        if ((i11 & 2) != 0) {
            list = r2Var.destination_charging;
        }
        if ((i11 & 4) != 0) {
            list2 = r2Var.superchargers;
        }
        if ((i11 & 8) != 0) {
            j11 = r2Var.congestion_sync_time_utc_secs;
        }
        if ((i11 & 16) != 0) {
            kVar = r2Var.unknownFields();
        }
        okio.k kVar2 = kVar;
        List list3 = list2;
        return r2Var.a(instant, list, list3, j11, kVar2);
    }

    public final r2 a(Instant timestamp, List<v> destination_charging, List<z4> superchargers, long congestion_sync_time_utc_secs, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(destination_charging, "destination_charging");
        p013kotlin.jvm.internal.s.k(superchargers, "superchargers");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new r2(timestamp, destination_charging, superchargers, congestion_sync_time_utc_secs, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCongestion_sync_time_utc_secs() {
        return this.congestion_sync_time_utc_secs;
    }

    public final List<v> d() {
        return this.destination_charging;
    }

    public final List<z4> e() {
        return this.superchargers;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), r2Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.timestamp, r2Var.timestamp) && p013kotlin.jvm.internal.s.f(this.destination_charging, r2Var.destination_charging) && p013kotlin.jvm.internal.s.f(this.superchargers, r2Var.superchargers) && this.congestion_sync_time_utc_secs == r2Var.congestion_sync_time_utc_secs;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.destination_charging.hashCode()) * 37) + this.superchargers.hashCode()) * 37) + Long.hashCode(this.congestion_sync_time_utc_secs);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m323newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        if (!this.destination_charging.isEmpty()) {
            arrayList.add("destination_charging=" + this.destination_charging);
        }
        if (!this.superchargers.isEmpty()) {
            arrayList.add("superchargers=" + this.superchargers);
        }
        arrayList.add("congestion_sync_time_utc_secs=" + this.congestion_sync_time_utc_secs);
        return p013kotlin.collections.v.y0(arrayList, ", ", "NearbyChargingSites{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ r2(Instant instant, List list, List list2, long j11, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : instant, (i11 & 2) != 0 ? p013kotlin.collections.v.m() : list, (i11 & 4) != 0 ? p013kotlin.collections.v.m() : list2, (i11 & 8) != 0 ? 0L : j11, (i11 & 16) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m323newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(Instant instant, List<v> destination_charging, List<z4> superchargers, long j11, okio.k unknownFields) {
        super(f65365f, unknownFields);
        p013kotlin.jvm.internal.s.k(destination_charging, "destination_charging");
        p013kotlin.jvm.internal.s.k(superchargers, "superchargers");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.timestamp = instant;
        this.congestion_sync_time_utc_secs = j11;
        this.destination_charging = x20.d.g("destination_charging", destination_charging);
        this.superchargers = x20.d.g("superchargers", superchargers);
    }
}
