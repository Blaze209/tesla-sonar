package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001a\u001c\u001d\u001eB!\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lfc0/t1;", "Lcom/squareup/wire/f;", "", "", "Lfc0/t1$c;", "hvacSeatCoolerAction", "Lokio/k;", "unknownFields", "<init>", "(Ljava/util/List;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Ljava/util/List;Lokio/k;)Lfc0/t1;", "Ljava/util/List;", "b", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "e", "c", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t1 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ProtoAdapter<t1> f65407c = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(t1.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.HvacSeatCoolerActions$HvacSeatCoolerAction#ADAPTER", label = com.squareup.wire.q.a.REPEATED, tag = 1)
    private final List<c> hvacSeatCoolerAction;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/t1$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/t1;", "value", "", "c", "(Lfc0/t1;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/t1;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/t1;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/t1;)Lfc0/t1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<t1> {
        a(com.squareup.wire.b bVar, co0.d<t1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.HvacSeatCoolerActions", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t1 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new t1(arrayList, reader.e(jD));
                }
                if (iG == 1) {
                    arrayList.add(c.f65410d.decode(reader));
                } else {
                    reader.m(iG);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, t1 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            c.f65410d.asRepeated().encodeWithTag(writer, 1, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(t1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return value.unknownFields().D() + c.f65410d.asRepeated().encodedSizeWithTag(1, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public t1 redact(t1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return value.a(x20.d.a(value.b(), c.f65410d), okio.k.f97943e);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lfc0/t1$c;", "Lcom/squareup/wire/f;", "", "Lfc0/t1$d;", "seat_cooler_level", "Lfc0/t1$e;", "seat_position", "Lokio/k;", "unknownFields", "<init>", "(Lfc0/t1$d;Lfc0/t1$e;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lfc0/t1$d;Lfc0/t1$e;Lokio/k;)Lfc0/t1$c;", "Lfc0/t1$d;", "c", "()Lfc0/t1$d;", "b", "Lfc0/t1$e;", DateTokenConverter.CONVERTER_KEY, "()Lfc0/t1$e;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends com.squareup.wire.f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ProtoAdapter<c> f65410d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(c.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.HvacSeatCoolerActions$HvacSeatCoolerLevel_E#ADAPTER", jsonName = "seatCoolerLevel", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
        private final d seat_cooler_level;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.HvacSeatCoolerActions$HvacSeatCoolerPosition_E#ADAPTER", jsonName = "seatPosition", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
        private final e seat_position;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/t1$c$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/t1$c;", "value", "", "c", "(Lfc0/t1$c;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/t1$c;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/t1$c;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/t1$c;)Lfc0/t1$c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, co0.d<c> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.HvacSeatCoolerActions.HvacSeatCoolerAction", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c decode(com.squareup.wire.k reader) {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                d dVarDecode = d.HvacSeatCoolerLevel_Unknown;
                e eVarDecode = e.HvacSeatCoolerPosition_Unknown;
                long jD = reader.d();
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new c(dVarDecode, eVarDecode, reader.e(jD));
                    }
                    if (iG == 1) {
                        try {
                            dVarDecode = d.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                        }
                    } else if (iG != 2) {
                        reader.m(iG);
                    } else {
                        try {
                            eVarDecode = e.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void encode(com.squareup.wire.l writer, c value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                if (value.getSeat_cooler_level() != d.HvacSeatCoolerLevel_Unknown) {
                    d.ADAPTER.encodeWithTag(writer, 1, value.getSeat_cooler_level());
                }
                if (value.getSeat_position() != e.HvacSeatCoolerPosition_Unknown) {
                    e.ADAPTER.encodeWithTag(writer, 2, value.getSeat_position());
                }
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(c value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                if (value.getSeat_cooler_level() != d.HvacSeatCoolerLevel_Unknown) {
                    iD += d.ADAPTER.encodedSizeWithTag(1, value.getSeat_cooler_level());
                }
                return value.getSeat_position() != e.HvacSeatCoolerPosition_Unknown ? iD + e.ADAPTER.encodedSizeWithTag(2, value.getSeat_position()) : iD;
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public c redact(c value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                return c.b(value, null, null, okio.k.f97943e, 3, null);
            }
        }

        public c() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ c b(c cVar, d dVar, e eVar, okio.k kVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                dVar = cVar.seat_cooler_level;
            }
            if ((i11 & 2) != 0) {
                eVar = cVar.seat_position;
            }
            if ((i11 & 4) != 0) {
                kVar = cVar.unknownFields();
            }
            return cVar.a(dVar, eVar, kVar);
        }

        public final c a(d seat_cooler_level, e seat_position, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(seat_cooler_level, "seat_cooler_level");
            p013kotlin.jvm.internal.s.k(seat_position, "seat_position");
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new c(seat_cooler_level, seat_position, unknownFields);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final d getSeat_cooler_level() {
            return this.seat_cooler_level;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final e getSeat_position() {
            return this.seat_position;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), cVar.unknownFields()) && this.seat_cooler_level == cVar.seat_cooler_level && this.seat_position == cVar.seat_position;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.seat_cooler_level.hashCode()) * 37) + this.seat_position.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m336newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("seat_cooler_level=" + this.seat_cooler_level);
            arrayList.add("seat_position=" + this.seat_position);
            return p013kotlin.collections.v.y0(arrayList, ", ", "HvacSeatCoolerAction{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ c(d dVar, e eVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? d.HvacSeatCoolerLevel_Unknown : dVar, (i11 & 2) != 0 ? e.HvacSeatCoolerPosition_Unknown : eVar, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m336newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d seat_cooler_level, e seat_position, okio.k unknownFields) {
            super(f65410d, unknownFields);
            p013kotlin.jvm.internal.s.k(seat_cooler_level, "seat_cooler_level");
            p013kotlin.jvm.internal.s.k(seat_position, "seat_position");
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.seat_cooler_level = seat_cooler_level;
            this.seat_position = seat_position;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 fc0.t1$d, still in use, count: 1, list:
      (r0v0 fc0.t1$d) from 0x0050: CONSTRUCTOR 
      (wrap co0.d:0x0048: INVOKE (wrap java.lang.Class:0x0046: CONST_CLASS  A[WRAPPED] (LINE:71) fc0.t1$d.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:73))
      (wrap com.squareup.wire.o:0x004c: SGET  A[WRAPPED] (LINE:77) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 fc0.t1$d)
     A[MD:(co0.d<fc0.t1$d>, com.squareup.wire.o, fc0.t1$d):void (m), WRAPPED] (LINE:81) call: fc0.t1.d.a.<init>(co0.d, com.squareup.wire.o, fc0.t1$d):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lfc0/t1$d;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "HvacSeatCoolerLevel_Unknown", "HvacSeatCoolerLevel_Off", "HvacSeatCoolerLevel_Low", "HvacSeatCoolerLevel_Med", "HvacSeatCoolerLevel_High", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements com.squareup.wire.p {
        HvacSeatCoolerLevel_Unknown(0),
        HvacSeatCoolerLevel_Off(1),
        HvacSeatCoolerLevel_Low(2),
        HvacSeatCoolerLevel_Med(3),
        HvacSeatCoolerLevel_High(4);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<d> ADAPTER = new a(p013kotlin.jvm.internal.o0.b(d.class), com.squareup.wire.o.PROTO_3, new d(0));

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"fc0/t1$d$a", "Lcom/squareup/wire/a;", "Lfc0/t1$d;", "", "value", "f", "(I)Lfc0/t1$d;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends com.squareup.wire.a<d> {
            a(co0.d<d> dVar, com.squareup.wire.o oVar, d dVar2) {
                super(dVar, oVar, dVar2);
            }

            @Override // com.squareup.wire.a
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public d d(int value) {
                return d.INSTANCE.a(value);
            }
        }

        /* JADX INFO: renamed from: fc0.t1$d$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfc0/t1$d$b;", "", "<init>", "()V", "", "value", "Lfc0/t1$d;", "a", "(I)Lfc0/t1$d;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(int value) {
                if (value == 0) {
                    return d.HvacSeatCoolerLevel_Unknown;
                }
                if (value == 1) {
                    return d.HvacSeatCoolerLevel_Off;
                }
                if (value == 2) {
                    return d.HvacSeatCoolerLevel_Low;
                }
                if (value == 3) {
                    return d.HvacSeatCoolerLevel_Med;
                }
                if (value != 4) {
                    return null;
                }
                return d.HvacSeatCoolerLevel_High;
            }

            private Companion() {
            }
        }

        static {
        }

        private d(int i11) {
            super(str, i);
            this.value = i11;
        }

        public static final d fromValue(int i11) {
            return INSTANCE.a(i11);
        }

        public static EnumEntries<d> getEntries() {
            return $ENTRIES;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 fc0.t1$e, still in use, count: 1, list:
      (r0v0 fc0.t1$e) from 0x0050: CONSTRUCTOR 
      (wrap co0.d:0x0048: INVOKE (wrap java.lang.Class:0x0046: CONST_CLASS  A[WRAPPED] (LINE:71) fc0.t1$e.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:73))
      (wrap com.squareup.wire.o:0x004c: SGET  A[WRAPPED] (LINE:77) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 fc0.t1$e)
     A[MD:(co0.d<fc0.t1$e>, com.squareup.wire.o, fc0.t1$e):void (m), WRAPPED] (LINE:81) call: fc0.t1.e.a.<init>(co0.d, com.squareup.wire.o, fc0.t1$e):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lfc0/t1$e;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "HvacSeatCoolerPosition_Unknown", "HvacSeatCoolerPosition_FrontLeft", "HvacSeatCoolerPosition_FrontRight", "HvacSeatCoolerPosition_SecondRowLeft", "HvacSeatCoolerPosition_SecondRowRight", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e implements com.squareup.wire.p {
        HvacSeatCoolerPosition_Unknown(0),
        HvacSeatCoolerPosition_FrontLeft(1),
        HvacSeatCoolerPosition_FrontRight(2),
        HvacSeatCoolerPosition_SecondRowLeft(3),
        HvacSeatCoolerPosition_SecondRowRight(4);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<e> ADAPTER = new a(p013kotlin.jvm.internal.o0.b(e.class), com.squareup.wire.o.PROTO_3, new e(0));

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"fc0/t1$e$a", "Lcom/squareup/wire/a;", "Lfc0/t1$e;", "", "value", "f", "(I)Lfc0/t1$e;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends com.squareup.wire.a<e> {
            a(co0.d<e> dVar, com.squareup.wire.o oVar, e eVar) {
                super(dVar, oVar, eVar);
            }

            @Override // com.squareup.wire.a
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public e d(int value) {
                return e.INSTANCE.a(value);
            }
        }

        /* JADX INFO: renamed from: fc0.t1$e$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfc0/t1$e$b;", "", "<init>", "()V", "", "value", "Lfc0/t1$e;", "a", "(I)Lfc0/t1$e;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final e a(int value) {
                if (value == 0) {
                    return e.HvacSeatCoolerPosition_Unknown;
                }
                if (value == 1) {
                    return e.HvacSeatCoolerPosition_FrontLeft;
                }
                if (value == 2) {
                    return e.HvacSeatCoolerPosition_FrontRight;
                }
                if (value == 3) {
                    return e.HvacSeatCoolerPosition_SecondRowLeft;
                }
                if (value != 4) {
                    return null;
                }
                return e.HvacSeatCoolerPosition_SecondRowRight;
            }

            private Companion() {
            }
        }

        static {
        }

        private e(int i11) {
            super(str, i);
            this.value = i11;
        }

        public static final e fromValue(int i11) {
            return INSTANCE.a(i11);
        }

        public static EnumEntries<e> getEntries() {
            return $ENTRIES;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t1() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final t1 a(List<c> hvacSeatCoolerAction, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(hvacSeatCoolerAction, "hvacSeatCoolerAction");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new t1(hvacSeatCoolerAction, unknownFields);
    }

    public final List<c> b() {
        return this.hvacSeatCoolerAction;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), t1Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.hvacSeatCoolerAction, t1Var.hvacSeatCoolerAction);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.hvacSeatCoolerAction.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m335newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.hvacSeatCoolerAction.isEmpty()) {
            arrayList.add("hvacSeatCoolerAction=" + this.hvacSeatCoolerAction);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "HvacSeatCoolerActions{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ t1(List list, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? p013kotlin.collections.v.m() : list, (i11 & 2) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m335newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(List<c> hvacSeatCoolerAction, okio.k unknownFields) {
        super(f65407c, unknownFields);
        p013kotlin.jvm.internal.s.k(hvacSeatCoolerAction, "hvacSeatCoolerAction");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.hvacSeatCoolerAction = x20.d.g("hvacSeatCoolerAction", hvacSeatCoolerAction);
    }
}
