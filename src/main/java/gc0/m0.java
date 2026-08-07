package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BW\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ]\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.¨\u0006/"}, d2 = {"Lgc0/m0;", "Lcom/squareup/wire/f;", "", "", "Lec0/q;", "precondition_schedules", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "preconditioning_schedule_window", "", "max_num_precondition_schedules", "", "next_schedule", "Lokio/k;", "unknownFields", "<init>", "(Ljava/util/List;Lj$/time/Instant;Lec0/q;Ljava/lang/Integer;Ljava/lang/Boolean;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Ljava/util/List;Lj$/time/Instant;Lec0/q;Ljava/lang/Integer;Ljava/lang/Boolean;Lokio/k;)Lgc0/m0;", "Lj$/time/Instant;", "g", "()Lj$/time/Instant;", "b", "Lec0/q;", "f", "()Lec0/q;", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "Ljava/util/List;", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ProtoAdapter<m0> f68126g = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(m0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2000)
    private final Instant timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.PreconditionSchedule#ADAPTER", jsonName = "preconditioningScheduleWindow", tag = 2)
    private final ec0.q preconditioning_schedule_window;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "maxNumPreconditionSchedules", tag = 3)
    private final Integer max_num_precondition_schedules;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "nextSchedule", tag = 4)
    private final Boolean next_schedule;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.PreconditionSchedule#ADAPTER", jsonName = "preconditionSchedules", label = com.squareup.wire.q.a.REPEATED, tag = 1)
    private final List<ec0.q> precondition_schedules;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/m0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/m0;", "value", "", "c", "(Lgc0/m0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/m0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/m0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/m0;)Lgc0/m0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<m0> {
        a(com.squareup.wire.b bVar, co0.d<m0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.PreconditioningScheduleState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            Instant instantDecode = null;
            ec0.q qVarDecode = null;
            Integer numDecode = null;
            Boolean boolDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new m0(arrayList, instantDecode, qVarDecode, numDecode, boolDecode, reader.e(jD));
                }
                if (iG == 1) {
                    arrayList.add(ec0.q.f62729j.decode(reader));
                } else if (iG == 2) {
                    qVarDecode = ec0.q.f62729j.decode(reader);
                } else if (iG == 3) {
                    numDecode = ProtoAdapter.UINT32.decode(reader);
                } else if (iG == 4) {
                    boolDecode = ProtoAdapter.BOOL.decode(reader);
                } else if (iG != 2000) {
                    reader.m(iG);
                } else {
                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, m0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter<ec0.q> protoAdapter = ec0.q.f62729j;
            protoAdapter.asRepeated().encodeWithTag(writer, 1, value.e());
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 2000, value.getTimestamp());
            }
            protoAdapter.encodeWithTag(writer, 2, value.getPreconditioning_schedule_window());
            ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.getMax_num_precondition_schedules());
            ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.getNext_schedule());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(m0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<ec0.q> protoAdapter = ec0.q.f62729j;
            int iEncodedSizeWithTag = iD + protoAdapter.asRepeated().encodedSizeWithTag(1, value.e());
            if (value.getTimestamp() != null) {
                iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(2000, value.getTimestamp());
            }
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, value.getPreconditioning_schedule_window()) + ProtoAdapter.UINT32.encodedSizeWithTag(3, value.getMax_num_precondition_schedules()) + ProtoAdapter.BOOL.encodedSizeWithTag(4, value.getNext_schedule());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public m0 redact(m0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            List<ec0.q> listE = value.e();
            ProtoAdapter<ec0.q> protoAdapter = ec0.q.f62729j;
            List listA = x20.d.a(listE, protoAdapter);
            Instant timestamp = value.getTimestamp();
            Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
            ec0.q preconditioning_schedule_window = value.getPreconditioning_schedule_window();
            return m0.b(value, listA, instantRedact, preconditioning_schedule_window != null ? protoAdapter.redact(preconditioning_schedule_window) : null, null, null, okio.k.f97943e, 24, null);
        }
    }

    public m0() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ m0 b(m0 m0Var, List list, Instant instant, ec0.q qVar, Integer num, Boolean bool, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = m0Var.precondition_schedules;
        }
        if ((i11 & 2) != 0) {
            instant = m0Var.timestamp;
        }
        if ((i11 & 4) != 0) {
            qVar = m0Var.preconditioning_schedule_window;
        }
        if ((i11 & 8) != 0) {
            num = m0Var.max_num_precondition_schedules;
        }
        if ((i11 & 16) != 0) {
            bool = m0Var.next_schedule;
        }
        if ((i11 & 32) != 0) {
            kVar = m0Var.unknownFields();
        }
        Boolean bool2 = bool;
        okio.k kVar2 = kVar;
        return m0Var.a(list, instant, qVar, num, bool2, kVar2);
    }

    public final m0 a(List<ec0.q> precondition_schedules, Instant timestamp, ec0.q preconditioning_schedule_window, Integer max_num_precondition_schedules, Boolean next_schedule, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(precondition_schedules, "precondition_schedules");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new m0(precondition_schedules, timestamp, preconditioning_schedule_window, max_num_precondition_schedules, next_schedule, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getMax_num_precondition_schedules() {
        return this.max_num_precondition_schedules;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getNext_schedule() {
        return this.next_schedule;
    }

    public final List<ec0.q> e() {
        return this.precondition_schedules;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), m0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.precondition_schedules, m0Var.precondition_schedules) && p013kotlin.jvm.internal.s.f(this.timestamp, m0Var.timestamp) && p013kotlin.jvm.internal.s.f(this.preconditioning_schedule_window, m0Var.preconditioning_schedule_window) && p013kotlin.jvm.internal.s.f(this.max_num_precondition_schedules, m0Var.max_num_precondition_schedules) && p013kotlin.jvm.internal.s.f(this.next_schedule, m0Var.next_schedule);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ec0.q getPreconditioning_schedule_window() {
        return this.preconditioning_schedule_window;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.precondition_schedules.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        ec0.q qVar = this.preconditioning_schedule_window;
        int iHashCode3 = (iHashCode2 + (qVar != null ? qVar.hashCode() : 0)) * 37;
        Integer num = this.max_num_precondition_schedules;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        Boolean bool = this.next_schedule;
        int iHashCode5 = iHashCode4 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m412newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.precondition_schedules.isEmpty()) {
            arrayList.add("precondition_schedules=" + this.precondition_schedules);
        }
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        ec0.q qVar = this.preconditioning_schedule_window;
        if (qVar != null) {
            arrayList.add("preconditioning_schedule_window=" + qVar);
        }
        Integer num = this.max_num_precondition_schedules;
        if (num != null) {
            arrayList.add("max_num_precondition_schedules=" + num);
        }
        Boolean bool = this.next_schedule;
        if (bool != null) {
            arrayList.add("next_schedule=" + bool);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "PreconditioningScheduleState{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ m0(List list, Instant instant, ec0.q qVar, Integer num, Boolean bool, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? p013kotlin.collections.v.m() : list, (i11 & 2) != 0 ? null : instant, (i11 & 4) != 0 ? null : qVar, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : bool, (i11 & 32) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m412newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(List<ec0.q> precondition_schedules, Instant instant, ec0.q qVar, Integer num, Boolean bool, okio.k unknownFields) {
        super(f68126g, unknownFields);
        p013kotlin.jvm.internal.s.k(precondition_schedules, "precondition_schedules");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.timestamp = instant;
        this.preconditioning_schedule_window = qVar;
        this.max_num_precondition_schedules = num;
        this.next_schedule = bool;
        this.precondition_schedules = x20.d.g("precondition_schedules", precondition_schedules);
    }
}
