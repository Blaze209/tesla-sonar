package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001dB'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lfc0/q2;", "Lcom/squareup/wire/f;", "", "", "waypoints", "Lfc0/q2$c;", "trip_plan_options", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/String;Lfc0/q2$c;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Lfc0/q2$c;Lokio/k;)Lfc0/q2;", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "b", "Lfc0/q2$c;", "c", "()Lfc0/q2$c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<q2> f65332d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(q2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final String waypoints;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.NavigationWaypointsRequest$TripPlanOptions#ADAPTER", jsonName = "tripPlanOptions", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final c trip_plan_options;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/q2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/q2;", "value", "", "c", "(Lfc0/q2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/q2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/q2;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/q2;)Lfc0/q2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<q2> {
        a(com.squareup.wire.b bVar, co0.d<q2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.NavigationWaypointsRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q2 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            String strDecode = "";
            c cVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new q2(strDecode, cVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    cVarDecode = c.f65336d.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, q2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (!p013kotlin.jvm.internal.s.f(value.getWaypoints(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getWaypoints());
            }
            if (value.getTrip_plan_options() != null) {
                c.f65336d.encodeWithTag(writer, 2, value.getTrip_plan_options());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(q2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!p013kotlin.jvm.internal.s.f(value.getWaypoints(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getWaypoints());
            }
            return value.getTrip_plan_options() != null ? iD + c.f65336d.encodedSizeWithTag(2, value.getTrip_plan_options()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public q2 redact(q2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            c trip_plan_options = value.getTrip_plan_options();
            return q2.b(value, null, trip_plan_options != null ? c.f65336d.redact(trip_plan_options) : null, okio.k.f97943e, 1, null);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0012¨\u0006\u001c"}, d2 = {"Lfc0/q2$c;", "Lcom/squareup/wire/f;", "", "", "destination_start_soe", "destination_arrival_soe", "Lokio/k;", "unknownFields", "<init>", "(IILokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(IILokio/k;)Lfc0/q2$c;", "I", DateTokenConverter.CONVERTER_KEY, "b", "c", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends com.squareup.wire.f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ProtoAdapter<c> f65336d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(c.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "destinationStartSoe", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
        private final int destination_start_soe;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "destinationArrivalSoe", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
        private final int destination_arrival_soe;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/q2$c$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/q2$c;", "value", "", "c", "(Lfc0/q2$c;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/q2$c;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/q2$c;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/q2$c;)Lfc0/q2$c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, co0.d<c> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.NavigationWaypointsRequest.TripPlanOptions", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c decode(com.squareup.wire.k reader) {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                long jD = reader.d();
                int iIntValue = 0;
                int iIntValue2 = 0;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new c(iIntValue, iIntValue2, reader.e(jD));
                    }
                    if (iG == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iG != 2) {
                        reader.m(iG);
                    } else {
                        iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void encode(com.squareup.wire.l writer, c value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                if (value.getDestination_start_soe() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getDestination_start_soe()));
                }
                if (value.getDestination_arrival_soe() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(value.getDestination_arrival_soe()));
                }
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(c value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                if (value.getDestination_start_soe() != 0) {
                    iD += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getDestination_start_soe()));
                }
                return value.getDestination_arrival_soe() != 0 ? iD + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getDestination_arrival_soe())) : iD;
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public c redact(c value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                return c.b(value, 0, 0, okio.k.f97943e, 3, null);
            }
        }

        public c() {
            this(0, 0, null, 7, null);
        }

        public static /* synthetic */ c b(c cVar, int i11, int i12, okio.k kVar, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = cVar.destination_start_soe;
            }
            if ((i13 & 2) != 0) {
                i12 = cVar.destination_arrival_soe;
            }
            if ((i13 & 4) != 0) {
                kVar = cVar.unknownFields();
            }
            return cVar.a(i11, i12, kVar);
        }

        public final c a(int destination_start_soe, int destination_arrival_soe, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new c(destination_start_soe, destination_arrival_soe, unknownFields);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getDestination_arrival_soe() {
            return this.destination_arrival_soe;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getDestination_start_soe() {
            return this.destination_start_soe;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), cVar.unknownFields()) && this.destination_start_soe == cVar.destination_start_soe && this.destination_arrival_soe == cVar.destination_arrival_soe;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.destination_start_soe)) * 37) + Integer.hashCode(this.destination_arrival_soe);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m316newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("destination_start_soe=" + this.destination_start_soe);
            arrayList.add("destination_arrival_soe=" + this.destination_arrival_soe);
            return p013kotlin.collections.v.y0(arrayList, ", ", "TripPlanOptions{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ c(int i11, int i12, okio.k kVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m316newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i11, int i12, okio.k unknownFields) {
            super(f65336d, unknownFields);
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.destination_start_soe = i11;
            this.destination_arrival_soe = i12;
        }
    }

    public q2() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ q2 b(q2 q2Var, String str, c cVar, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = q2Var.waypoints;
        }
        if ((i11 & 2) != 0) {
            cVar = q2Var.trip_plan_options;
        }
        if ((i11 & 4) != 0) {
            kVar = q2Var.unknownFields();
        }
        return q2Var.a(str, cVar, kVar);
    }

    public final q2 a(String waypoints, c trip_plan_options, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(waypoints, "waypoints");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new q2(waypoints, trip_plan_options, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getTrip_plan_options() {
        return this.trip_plan_options;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getWaypoints() {
        return this.waypoints;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), q2Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.waypoints, q2Var.waypoints) && p013kotlin.jvm.internal.s.f(this.trip_plan_options, q2Var.trip_plan_options);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.waypoints.hashCode()) * 37;
        c cVar = this.trip_plan_options;
        int iHashCode2 = iHashCode + (cVar != null ? cVar.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m315newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("waypoints=" + x20.d.i(this.waypoints));
        c cVar = this.trip_plan_options;
        if (cVar != null) {
            arrayList.add("trip_plan_options=" + cVar);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "NavigationWaypointsRequest{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ q2(String str, c cVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : cVar, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m315newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(String waypoints, c cVar, okio.k unknownFields) {
        super(f65332d, unknownFields);
        p013kotlin.jvm.internal.s.k(waypoints, "waypoints");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.waypoints = waypoints;
        this.trip_plan_options = cVar;
    }
}
