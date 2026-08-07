package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$Bo\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJu\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 R\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b+\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b0\u0010/R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b,\u00102¨\u00063"}, d2 = {"Lgc0/n;", "Lcom/squareup/wire/f;", "", "", "Lec0/e;", "charge_schedules", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "charge_schedule_window", "", "charge_buffer", "max_num_charge_schedules", "", "next_schedule", "show_schedule_complete_state", "Lokio/k;", "unknownFields", "<init>", "(Ljava/util/List;Lj$/time/Instant;Lec0/e;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Ljava/util/List;Lj$/time/Instant;Lec0/e;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/k;)Lgc0/n;", "Lj$/time/Instant;", IntegerTokenConverter.CONVERTER_KEY, "()Lj$/time/Instant;", "b", "Lec0/e;", DateTokenConverter.CONVERTER_KEY, "()Lec0/e;", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "f", "e", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "h", "Ljava/util/List;", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n extends com.squareup.wire.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ProtoAdapter<n> f68133i = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(n.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2000)
    private final Instant timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.ChargeSchedule#ADAPTER", jsonName = "chargeScheduleWindow", tag = 2)
    private final ec0.e charge_schedule_window;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargeBuffer", tag = 3)
    private final Integer charge_buffer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "maxNumChargeSchedules", tag = 4)
    private final Integer max_num_charge_schedules;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "nextSchedule", tag = 5)
    private final Boolean next_schedule;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showScheduleCompleteState", tag = 6)
    private final Boolean show_schedule_complete_state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.ChargeSchedule#ADAPTER", jsonName = "chargeSchedules", label = com.squareup.wire.q.a.REPEATED, tag = 1)
    private final List<ec0.e> charge_schedules;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/n$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/n;", "value", "", "c", "(Lgc0/n;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/n;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/n;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/n;)Lgc0/n;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<n> {
        a(com.squareup.wire.b bVar, co0.d<n> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ChargeScheduleState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            Instant instantDecode = null;
            ec0.e eVarDecode = null;
            Integer numDecode = null;
            Integer numDecode2 = null;
            Boolean boolDecode = null;
            Boolean boolDecode2 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new n(arrayList, instantDecode, eVarDecode, numDecode, numDecode2, boolDecode, boolDecode2, reader.e(jD));
                }
                if (iG != 2000) {
                    switch (iG) {
                        case 1:
                            arrayList.add(ec0.e.f62588m.decode(reader));
                            break;
                        case 2:
                            eVarDecode = ec0.e.f62588m.decode(reader);
                            break;
                        case 3:
                            numDecode = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 4:
                            numDecode2 = ProtoAdapter.UINT32.decode(reader);
                            break;
                        case 5:
                            boolDecode = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 6:
                            boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        default:
                            reader.m(iG);
                            break;
                    }
                } else {
                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, n value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter<ec0.e> protoAdapter = ec0.e.f62588m;
            protoAdapter.asRepeated().encodeWithTag(writer, 1, value.e());
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 2000, value.getTimestamp());
            }
            protoAdapter.encodeWithTag(writer, 2, value.getCharge_schedule_window());
            ProtoAdapter.INT32.encodeWithTag(writer, 3, value.getCharge_buffer());
            ProtoAdapter.UINT32.encodeWithTag(writer, 4, value.getMax_num_charge_schedules());
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(writer, 5, value.getNext_schedule());
            protoAdapter2.encodeWithTag(writer, 6, value.getShow_schedule_complete_state());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(n value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<ec0.e> protoAdapter = ec0.e.f62588m;
            int iEncodedSizeWithTag = iD + protoAdapter.asRepeated().encodedSizeWithTag(1, value.e());
            if (value.getTimestamp() != null) {
                iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(2000, value.getTimestamp());
            }
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, value.getCharge_schedule_window()) + ProtoAdapter.INT32.encodedSizeWithTag(3, value.getCharge_buffer()) + ProtoAdapter.UINT32.encodedSizeWithTag(4, value.getMax_num_charge_schedules());
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(5, value.getNext_schedule()) + protoAdapter2.encodedSizeWithTag(6, value.getShow_schedule_complete_state());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public n redact(n value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            List<ec0.e> listE = value.e();
            ProtoAdapter<ec0.e> protoAdapter = ec0.e.f62588m;
            List listA = x20.d.a(listE, protoAdapter);
            Instant timestamp = value.getTimestamp();
            Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
            ec0.e charge_schedule_window = value.getCharge_schedule_window();
            return n.b(value, listA, instantRedact, charge_schedule_window != null ? protoAdapter.redact(charge_schedule_window) : null, null, null, null, null, okio.k.f97943e, 120, null);
        }
    }

    public n() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ n b(n nVar, List list, Instant instant, ec0.e eVar, Integer num, Integer num2, Boolean bool, Boolean bool2, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = nVar.charge_schedules;
        }
        if ((i11 & 2) != 0) {
            instant = nVar.timestamp;
        }
        if ((i11 & 4) != 0) {
            eVar = nVar.charge_schedule_window;
        }
        if ((i11 & 8) != 0) {
            num = nVar.charge_buffer;
        }
        if ((i11 & 16) != 0) {
            num2 = nVar.max_num_charge_schedules;
        }
        if ((i11 & 32) != 0) {
            bool = nVar.next_schedule;
        }
        if ((i11 & 64) != 0) {
            bool2 = nVar.show_schedule_complete_state;
        }
        if ((i11 & 128) != 0) {
            kVar = nVar.unknownFields();
        }
        Boolean bool3 = bool2;
        okio.k kVar2 = kVar;
        Integer num3 = num2;
        Boolean bool4 = bool;
        return nVar.a(list, instant, eVar, num, num3, bool4, bool3, kVar2);
    }

    public final n a(List<ec0.e> charge_schedules, Instant timestamp, ec0.e charge_schedule_window, Integer charge_buffer, Integer max_num_charge_schedules, Boolean next_schedule, Boolean show_schedule_complete_state, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(charge_schedules, "charge_schedules");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new n(charge_schedules, timestamp, charge_schedule_window, charge_buffer, max_num_charge_schedules, next_schedule, show_schedule_complete_state, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getCharge_buffer() {
        return this.charge_buffer;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ec0.e getCharge_schedule_window() {
        return this.charge_schedule_window;
    }

    public final List<ec0.e> e() {
        return this.charge_schedules;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof n)) {
            return false;
        }
        n nVar = (n) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), nVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.charge_schedules, nVar.charge_schedules) && p013kotlin.jvm.internal.s.f(this.timestamp, nVar.timestamp) && p013kotlin.jvm.internal.s.f(this.charge_schedule_window, nVar.charge_schedule_window) && p013kotlin.jvm.internal.s.f(this.charge_buffer, nVar.charge_buffer) && p013kotlin.jvm.internal.s.f(this.max_num_charge_schedules, nVar.max_num_charge_schedules) && p013kotlin.jvm.internal.s.f(this.next_schedule, nVar.next_schedule) && p013kotlin.jvm.internal.s.f(this.show_schedule_complete_state, nVar.show_schedule_complete_state);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getMax_num_charge_schedules() {
        return this.max_num_charge_schedules;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getNext_schedule() {
        return this.next_schedule;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getShow_schedule_complete_state() {
        return this.show_schedule_complete_state;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.charge_schedules.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        ec0.e eVar = this.charge_schedule_window;
        int iHashCode3 = (iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 37;
        Integer num = this.charge_buffer;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.max_num_charge_schedules;
        int iHashCode5 = (iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Boolean bool = this.next_schedule;
        int iHashCode6 = (iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.show_schedule_complete_state;
        int iHashCode7 = iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m413newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.charge_schedules.isEmpty()) {
            arrayList.add("charge_schedules=" + this.charge_schedules);
        }
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        ec0.e eVar = this.charge_schedule_window;
        if (eVar != null) {
            arrayList.add("charge_schedule_window=" + eVar);
        }
        Integer num = this.charge_buffer;
        if (num != null) {
            arrayList.add("charge_buffer=" + num);
        }
        Integer num2 = this.max_num_charge_schedules;
        if (num2 != null) {
            arrayList.add("max_num_charge_schedules=" + num2);
        }
        Boolean bool = this.next_schedule;
        if (bool != null) {
            arrayList.add("next_schedule=" + bool);
        }
        Boolean bool2 = this.show_schedule_complete_state;
        if (bool2 != null) {
            arrayList.add("show_schedule_complete_state=" + bool2);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "ChargeScheduleState{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ n(List list, Instant instant, ec0.e eVar, Integer num, Integer num2, Boolean bool, Boolean bool2, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? p013kotlin.collections.v.m() : list, (i11 & 2) != 0 ? null : instant, (i11 & 4) != 0 ? null : eVar, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : num2, (i11 & 32) != 0 ? null : bool, (i11 & 64) != 0 ? null : bool2, (i11 & 128) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m413newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(List<ec0.e> charge_schedules, Instant instant, ec0.e eVar, Integer num, Integer num2, Boolean bool, Boolean bool2, okio.k unknownFields) {
        super(f68133i, unknownFields);
        p013kotlin.jvm.internal.s.k(charge_schedules, "charge_schedules");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.timestamp = instant;
        this.charge_schedule_window = eVar;
        this.charge_buffer = num;
        this.max_num_charge_schedules = num2;
        this.next_schedule = bool;
        this.show_schedule_complete_state = bool2;
        this.charge_schedules = x20.d.g("charge_schedules", charge_schedules);
    }
}
