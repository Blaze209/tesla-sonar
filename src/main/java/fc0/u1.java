package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001cB!\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lfc0/u1;", "Lcom/squareup/wire/f;", "", "", "Lfc0/u1$c;", "hvacSeatHeaterAction", "Lokio/k;", "unknownFields", "<init>", "(Ljava/util/List;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Ljava/util/List;Lokio/k;)Lfc0/u1;", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u1 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ProtoAdapter<u1> f65437c = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(u1.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.HvacSeatHeaterActions$HvacSeatHeaterAction#ADAPTER", label = com.squareup.wire.q.a.REPEATED, tag = 1)
    private final List<c> hvacSeatHeaterAction;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/u1$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/u1;", "value", "", "c", "(Lfc0/u1;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/u1;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/u1;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/u1;)Lfc0/u1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<u1> {
        a(com.squareup.wire.b bVar, co0.d<u1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.HvacSeatHeaterActions", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u1 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new u1(arrayList, reader.e(jD));
                }
                if (iG == 1) {
                    arrayList.add(c.f65440q.decode(reader));
                } else {
                    reader.m(iG);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, u1 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            c.f65440q.asRepeated().encodeWithTag(writer, 1, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(u1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return value.unknownFields().D() + c.f65440q.asRepeated().encodedSizeWithTag(1, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u1 redact(u1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return value.a(x20.d.a(value.b(), c.f65440q), okio.k.f97943e);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BÅ\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#JË\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b)\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b+\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b/\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010&\u001a\u0004\b1\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b-\u0010(R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b3\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b4\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b5\u0010(R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b6\u0010(¨\u00067"}, d2 = {"Lfc0/u1$c;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "SEAT_HEATER_UNKNOWN", "SEAT_HEATER_OFF", "SEAT_HEATER_LOW", "SEAT_HEATER_MED", "SEAT_HEATER_HIGH", "CAR_SEAT_UNKNOWN", "CAR_SEAT_FRONT_LEFT", "CAR_SEAT_FRONT_RIGHT", "CAR_SEAT_REAR_LEFT", "CAR_SEAT_REAR_LEFT_BACK", "CAR_SEAT_REAR_CENTER", "CAR_SEAT_REAR_RIGHT", "CAR_SEAT_REAR_RIGHT_BACK", "CAR_SEAT_THIRD_ROW_LEFT", "CAR_SEAT_THIRD_ROW_RIGHT", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lfc0/u1$c;", "Lec0/h0;", "p", "()Lec0/h0;", "b", "o", "c", "m", DateTokenConverter.CONVERTER_KEY, "n", "e", "l", "f", "k", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends com.squareup.wire.f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final ProtoAdapter<c> f65440q = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(c.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "SEATHEATERUNKNOWN", tag = 1)
        private final ec0.h0 SEAT_HEATER_UNKNOWN;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "SEATHEATEROFF", tag = 2)
        private final ec0.h0 SEAT_HEATER_OFF;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "SEATHEATERLOW", tag = 3)
        private final ec0.h0 SEAT_HEATER_LOW;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "SEATHEATERMED", tag = 4)
        private final ec0.h0 SEAT_HEATER_MED;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "SEATHEATERHIGH", tag = 5)
        private final ec0.h0 SEAT_HEATER_HIGH;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATUNKNOWN", tag = 6)
        private final ec0.h0 CAR_SEAT_UNKNOWN;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATFRONTLEFT", tag = 7)
        private final ec0.h0 CAR_SEAT_FRONT_LEFT;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATFRONTRIGHT", tag = 8)
        private final ec0.h0 CAR_SEAT_FRONT_RIGHT;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATREARLEFT", tag = 9)
        private final ec0.h0 CAR_SEAT_REAR_LEFT;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATREARLEFTBACK", tag = 10)
        private final ec0.h0 CAR_SEAT_REAR_LEFT_BACK;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATREARCENTER", tag = 11)
        private final ec0.h0 CAR_SEAT_REAR_CENTER;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATREARRIGHT", tag = 12)
        private final ec0.h0 CAR_SEAT_REAR_RIGHT;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATREARRIGHTBACK", tag = 13)
        private final ec0.h0 CAR_SEAT_REAR_RIGHT_BACK;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATTHIRDROWLEFT", tag = 14)
        private final ec0.h0 CAR_SEAT_THIRD_ROW_LEFT;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATTHIRDROWRIGHT", tag = 15)
        private final ec0.h0 CAR_SEAT_THIRD_ROW_RIGHT;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/u1$c$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/u1$c;", "value", "", "c", "(Lfc0/u1$c;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/u1$c;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/u1$c;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/u1$c;)Lfc0/u1$c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, co0.d<c> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.HvacSeatHeaterActions.HvacSeatHeaterAction", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c decode(com.squareup.wire.k reader) {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                long jD = reader.d();
                ec0.h0 h0VarDecode = null;
                ec0.h0 h0VarDecode2 = null;
                ec0.h0 h0VarDecode3 = null;
                ec0.h0 h0VarDecode4 = null;
                ec0.h0 h0VarDecode5 = null;
                ec0.h0 h0VarDecode6 = null;
                ec0.h0 h0VarDecode7 = null;
                ec0.h0 h0VarDecode8 = null;
                ec0.h0 h0VarDecode9 = null;
                ec0.h0 h0VarDecode10 = null;
                ec0.h0 h0VarDecode11 = null;
                ec0.h0 h0VarDecode12 = null;
                ec0.h0 h0VarDecode13 = null;
                ec0.h0 h0VarDecode14 = null;
                ec0.h0 h0VarDecode15 = null;
                while (true) {
                    int iG = reader.g();
                    ec0.h0 h0Var = h0VarDecode;
                    if (iG == -1) {
                        return new c(h0VarDecode15, h0Var, h0VarDecode2, h0VarDecode3, h0VarDecode4, h0VarDecode5, h0VarDecode6, h0VarDecode7, h0VarDecode8, h0VarDecode9, h0VarDecode10, h0VarDecode11, h0VarDecode12, h0VarDecode13, h0VarDecode14, reader.e(jD));
                    }
                    switch (iG) {
                        case 1:
                            h0VarDecode15 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 2:
                            h0VarDecode = ec0.h0.f62622b.decode(reader);
                            continue;
                        case 3:
                            h0VarDecode2 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 4:
                            h0VarDecode3 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 5:
                            h0VarDecode4 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 6:
                            h0VarDecode5 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 7:
                            h0VarDecode6 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 8:
                            h0VarDecode7 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 9:
                            h0VarDecode8 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 10:
                            h0VarDecode9 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 11:
                            h0VarDecode10 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 12:
                            h0VarDecode11 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 13:
                            h0VarDecode12 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 14:
                            h0VarDecode13 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 15:
                            h0VarDecode14 = ec0.h0.f62622b.decode(reader);
                            break;
                        default:
                            reader.m(iG);
                            break;
                    }
                    h0VarDecode = h0Var;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void encode(com.squareup.wire.l writer, c value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                protoAdapter.encodeWithTag(writer, 1, value.getSEAT_HEATER_UNKNOWN());
                protoAdapter.encodeWithTag(writer, 2, value.getSEAT_HEATER_OFF());
                protoAdapter.encodeWithTag(writer, 3, value.getSEAT_HEATER_LOW());
                protoAdapter.encodeWithTag(writer, 4, value.getSEAT_HEATER_MED());
                protoAdapter.encodeWithTag(writer, 5, value.getSEAT_HEATER_HIGH());
                protoAdapter.encodeWithTag(writer, 6, value.getCAR_SEAT_UNKNOWN());
                protoAdapter.encodeWithTag(writer, 7, value.getCAR_SEAT_FRONT_LEFT());
                protoAdapter.encodeWithTag(writer, 8, value.getCAR_SEAT_FRONT_RIGHT());
                protoAdapter.encodeWithTag(writer, 9, value.getCAR_SEAT_REAR_LEFT());
                protoAdapter.encodeWithTag(writer, 10, value.getCAR_SEAT_REAR_LEFT_BACK());
                protoAdapter.encodeWithTag(writer, 11, value.getCAR_SEAT_REAR_CENTER());
                protoAdapter.encodeWithTag(writer, 12, value.getCAR_SEAT_REAR_RIGHT());
                protoAdapter.encodeWithTag(writer, 13, value.getCAR_SEAT_REAR_RIGHT_BACK());
                protoAdapter.encodeWithTag(writer, 14, value.getCAR_SEAT_THIRD_ROW_LEFT());
                protoAdapter.encodeWithTag(writer, 15, value.getCAR_SEAT_THIRD_ROW_RIGHT());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(c value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                return iD + protoAdapter.encodedSizeWithTag(1, value.getSEAT_HEATER_UNKNOWN()) + protoAdapter.encodedSizeWithTag(2, value.getSEAT_HEATER_OFF()) + protoAdapter.encodedSizeWithTag(3, value.getSEAT_HEATER_LOW()) + protoAdapter.encodedSizeWithTag(4, value.getSEAT_HEATER_MED()) + protoAdapter.encodedSizeWithTag(5, value.getSEAT_HEATER_HIGH()) + protoAdapter.encodedSizeWithTag(6, value.getCAR_SEAT_UNKNOWN()) + protoAdapter.encodedSizeWithTag(7, value.getCAR_SEAT_FRONT_LEFT()) + protoAdapter.encodedSizeWithTag(8, value.getCAR_SEAT_FRONT_RIGHT()) + protoAdapter.encodedSizeWithTag(9, value.getCAR_SEAT_REAR_LEFT()) + protoAdapter.encodedSizeWithTag(10, value.getCAR_SEAT_REAR_LEFT_BACK()) + protoAdapter.encodedSizeWithTag(11, value.getCAR_SEAT_REAR_CENTER()) + protoAdapter.encodedSizeWithTag(12, value.getCAR_SEAT_REAR_RIGHT()) + protoAdapter.encodedSizeWithTag(13, value.getCAR_SEAT_REAR_RIGHT_BACK()) + protoAdapter.encodedSizeWithTag(14, value.getCAR_SEAT_THIRD_ROW_LEFT()) + protoAdapter.encodedSizeWithTag(15, value.getCAR_SEAT_THIRD_ROW_RIGHT());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public c redact(c value) {
                ec0.h0 h0Var;
                ec0.h0 h0VarRedact;
                p013kotlin.jvm.internal.s.k(value, "value");
                ec0.h0 seat_heater_unknown = value.getSEAT_HEATER_UNKNOWN();
                ec0.h0 h0VarRedact2 = seat_heater_unknown != null ? ec0.h0.f62622b.redact(seat_heater_unknown) : null;
                ec0.h0 seat_heater_off = value.getSEAT_HEATER_OFF();
                ec0.h0 h0VarRedact3 = seat_heater_off != null ? ec0.h0.f62622b.redact(seat_heater_off) : null;
                ec0.h0 seat_heater_low = value.getSEAT_HEATER_LOW();
                ec0.h0 h0VarRedact4 = seat_heater_low != null ? ec0.h0.f62622b.redact(seat_heater_low) : null;
                ec0.h0 seat_heater_med = value.getSEAT_HEATER_MED();
                ec0.h0 h0VarRedact5 = seat_heater_med != null ? ec0.h0.f62622b.redact(seat_heater_med) : null;
                ec0.h0 seat_heater_high = value.getSEAT_HEATER_HIGH();
                ec0.h0 h0VarRedact6 = seat_heater_high != null ? ec0.h0.f62622b.redact(seat_heater_high) : null;
                ec0.h0 car_seat_unknown = value.getCAR_SEAT_UNKNOWN();
                ec0.h0 h0VarRedact7 = car_seat_unknown != null ? ec0.h0.f62622b.redact(car_seat_unknown) : null;
                ec0.h0 car_seat_front_left = value.getCAR_SEAT_FRONT_LEFT();
                ec0.h0 h0VarRedact8 = car_seat_front_left != null ? ec0.h0.f62622b.redact(car_seat_front_left) : null;
                ec0.h0 car_seat_front_right = value.getCAR_SEAT_FRONT_RIGHT();
                ec0.h0 h0VarRedact9 = car_seat_front_right != null ? ec0.h0.f62622b.redact(car_seat_front_right) : null;
                ec0.h0 car_seat_rear_left = value.getCAR_SEAT_REAR_LEFT();
                ec0.h0 h0VarRedact10 = car_seat_rear_left != null ? ec0.h0.f62622b.redact(car_seat_rear_left) : null;
                ec0.h0 car_seat_rear_left_back = value.getCAR_SEAT_REAR_LEFT_BACK();
                ec0.h0 h0VarRedact11 = car_seat_rear_left_back != null ? ec0.h0.f62622b.redact(car_seat_rear_left_back) : null;
                ec0.h0 car_seat_rear_center = value.getCAR_SEAT_REAR_CENTER();
                ec0.h0 h0VarRedact12 = car_seat_rear_center != null ? ec0.h0.f62622b.redact(car_seat_rear_center) : null;
                ec0.h0 car_seat_rear_right = value.getCAR_SEAT_REAR_RIGHT();
                ec0.h0 h0VarRedact13 = car_seat_rear_right != null ? ec0.h0.f62622b.redact(car_seat_rear_right) : null;
                ec0.h0 car_seat_rear_right_back = value.getCAR_SEAT_REAR_RIGHT_BACK();
                ec0.h0 h0VarRedact14 = car_seat_rear_right_back != null ? ec0.h0.f62622b.redact(car_seat_rear_right_back) : null;
                ec0.h0 car_seat_third_row_left = value.getCAR_SEAT_THIRD_ROW_LEFT();
                ec0.h0 h0VarRedact15 = car_seat_third_row_left != null ? ec0.h0.f62622b.redact(car_seat_third_row_left) : null;
                ec0.h0 car_seat_third_row_right = value.getCAR_SEAT_THIRD_ROW_RIGHT();
                if (car_seat_third_row_right != null) {
                    h0VarRedact = ec0.h0.f62622b.redact(car_seat_third_row_right);
                    h0Var = h0VarRedact2;
                } else {
                    h0Var = h0VarRedact2;
                    h0VarRedact = null;
                }
                return value.a(h0Var, h0VarRedact3, h0VarRedact4, h0VarRedact5, h0VarRedact6, h0VarRedact7, h0VarRedact8, h0VarRedact9, h0VarRedact10, h0VarRedact11, h0VarRedact12, h0VarRedact13, h0VarRedact14, h0VarRedact15, h0VarRedact, okio.k.f97943e);
            }
        }

        public c() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        }

        public final c a(ec0.h0 SEAT_HEATER_UNKNOWN, ec0.h0 SEAT_HEATER_OFF, ec0.h0 SEAT_HEATER_LOW, ec0.h0 SEAT_HEATER_MED, ec0.h0 SEAT_HEATER_HIGH, ec0.h0 CAR_SEAT_UNKNOWN, ec0.h0 CAR_SEAT_FRONT_LEFT, ec0.h0 CAR_SEAT_FRONT_RIGHT, ec0.h0 CAR_SEAT_REAR_LEFT, ec0.h0 CAR_SEAT_REAR_LEFT_BACK, ec0.h0 CAR_SEAT_REAR_CENTER, ec0.h0 CAR_SEAT_REAR_RIGHT, ec0.h0 CAR_SEAT_REAR_RIGHT_BACK, ec0.h0 CAR_SEAT_THIRD_ROW_LEFT, ec0.h0 CAR_SEAT_THIRD_ROW_RIGHT, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new c(SEAT_HEATER_UNKNOWN, SEAT_HEATER_OFF, SEAT_HEATER_LOW, SEAT_HEATER_MED, SEAT_HEATER_HIGH, CAR_SEAT_UNKNOWN, CAR_SEAT_FRONT_LEFT, CAR_SEAT_FRONT_RIGHT, CAR_SEAT_REAR_LEFT, CAR_SEAT_REAR_LEFT_BACK, CAR_SEAT_REAR_CENTER, CAR_SEAT_REAR_RIGHT, CAR_SEAT_REAR_RIGHT_BACK, CAR_SEAT_THIRD_ROW_LEFT, CAR_SEAT_THIRD_ROW_RIGHT, unknownFields);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ec0.h0 getCAR_SEAT_FRONT_LEFT() {
            return this.CAR_SEAT_FRONT_LEFT;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ec0.h0 getCAR_SEAT_FRONT_RIGHT() {
            return this.CAR_SEAT_FRONT_RIGHT;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ec0.h0 getCAR_SEAT_REAR_CENTER() {
            return this.CAR_SEAT_REAR_CENTER;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ec0.h0 getCAR_SEAT_REAR_LEFT() {
            return this.CAR_SEAT_REAR_LEFT;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), cVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.SEAT_HEATER_UNKNOWN, cVar.SEAT_HEATER_UNKNOWN) && p013kotlin.jvm.internal.s.f(this.SEAT_HEATER_OFF, cVar.SEAT_HEATER_OFF) && p013kotlin.jvm.internal.s.f(this.SEAT_HEATER_LOW, cVar.SEAT_HEATER_LOW) && p013kotlin.jvm.internal.s.f(this.SEAT_HEATER_MED, cVar.SEAT_HEATER_MED) && p013kotlin.jvm.internal.s.f(this.SEAT_HEATER_HIGH, cVar.SEAT_HEATER_HIGH) && p013kotlin.jvm.internal.s.f(this.CAR_SEAT_UNKNOWN, cVar.CAR_SEAT_UNKNOWN) && p013kotlin.jvm.internal.s.f(this.CAR_SEAT_FRONT_LEFT, cVar.CAR_SEAT_FRONT_LEFT) && p013kotlin.jvm.internal.s.f(this.CAR_SEAT_FRONT_RIGHT, cVar.CAR_SEAT_FRONT_RIGHT) && p013kotlin.jvm.internal.s.f(this.CAR_SEAT_REAR_LEFT, cVar.CAR_SEAT_REAR_LEFT) && p013kotlin.jvm.internal.s.f(this.CAR_SEAT_REAR_LEFT_BACK, cVar.CAR_SEAT_REAR_LEFT_BACK) && p013kotlin.jvm.internal.s.f(this.CAR_SEAT_REAR_CENTER, cVar.CAR_SEAT_REAR_CENTER) && p013kotlin.jvm.internal.s.f(this.CAR_SEAT_REAR_RIGHT, cVar.CAR_SEAT_REAR_RIGHT) && p013kotlin.jvm.internal.s.f(this.CAR_SEAT_REAR_RIGHT_BACK, cVar.CAR_SEAT_REAR_RIGHT_BACK) && p013kotlin.jvm.internal.s.f(this.CAR_SEAT_THIRD_ROW_LEFT, cVar.CAR_SEAT_THIRD_ROW_LEFT) && p013kotlin.jvm.internal.s.f(this.CAR_SEAT_THIRD_ROW_RIGHT, cVar.CAR_SEAT_THIRD_ROW_RIGHT);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ec0.h0 getCAR_SEAT_REAR_LEFT_BACK() {
            return this.CAR_SEAT_REAR_LEFT_BACK;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ec0.h0 getCAR_SEAT_REAR_RIGHT() {
            return this.CAR_SEAT_REAR_RIGHT;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final ec0.h0 getCAR_SEAT_REAR_RIGHT_BACK() {
            return this.CAR_SEAT_REAR_RIGHT_BACK;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ec0.h0 h0Var = this.SEAT_HEATER_UNKNOWN;
            int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
            ec0.h0 h0Var2 = this.SEAT_HEATER_OFF;
            int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
            ec0.h0 h0Var3 = this.SEAT_HEATER_LOW;
            int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
            ec0.h0 h0Var4 = this.SEAT_HEATER_MED;
            int iHashCode5 = (iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0)) * 37;
            ec0.h0 h0Var5 = this.SEAT_HEATER_HIGH;
            int iHashCode6 = (iHashCode5 + (h0Var5 != null ? h0Var5.hashCode() : 0)) * 37;
            ec0.h0 h0Var6 = this.CAR_SEAT_UNKNOWN;
            int iHashCode7 = (iHashCode6 + (h0Var6 != null ? h0Var6.hashCode() : 0)) * 37;
            ec0.h0 h0Var7 = this.CAR_SEAT_FRONT_LEFT;
            int iHashCode8 = (iHashCode7 + (h0Var7 != null ? h0Var7.hashCode() : 0)) * 37;
            ec0.h0 h0Var8 = this.CAR_SEAT_FRONT_RIGHT;
            int iHashCode9 = (iHashCode8 + (h0Var8 != null ? h0Var8.hashCode() : 0)) * 37;
            ec0.h0 h0Var9 = this.CAR_SEAT_REAR_LEFT;
            int iHashCode10 = (iHashCode9 + (h0Var9 != null ? h0Var9.hashCode() : 0)) * 37;
            ec0.h0 h0Var10 = this.CAR_SEAT_REAR_LEFT_BACK;
            int iHashCode11 = (iHashCode10 + (h0Var10 != null ? h0Var10.hashCode() : 0)) * 37;
            ec0.h0 h0Var11 = this.CAR_SEAT_REAR_CENTER;
            int iHashCode12 = (iHashCode11 + (h0Var11 != null ? h0Var11.hashCode() : 0)) * 37;
            ec0.h0 h0Var12 = this.CAR_SEAT_REAR_RIGHT;
            int iHashCode13 = (iHashCode12 + (h0Var12 != null ? h0Var12.hashCode() : 0)) * 37;
            ec0.h0 h0Var13 = this.CAR_SEAT_REAR_RIGHT_BACK;
            int iHashCode14 = (iHashCode13 + (h0Var13 != null ? h0Var13.hashCode() : 0)) * 37;
            ec0.h0 h0Var14 = this.CAR_SEAT_THIRD_ROW_LEFT;
            int iHashCode15 = (iHashCode14 + (h0Var14 != null ? h0Var14.hashCode() : 0)) * 37;
            ec0.h0 h0Var15 = this.CAR_SEAT_THIRD_ROW_RIGHT;
            int iHashCode16 = iHashCode15 + (h0Var15 != null ? h0Var15.hashCode() : 0);
            this.hashCode = iHashCode16;
            return iHashCode16;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final ec0.h0 getCAR_SEAT_THIRD_ROW_LEFT() {
            return this.CAR_SEAT_THIRD_ROW_LEFT;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final ec0.h0 getCAR_SEAT_THIRD_ROW_RIGHT() {
            return this.CAR_SEAT_THIRD_ROW_RIGHT;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final ec0.h0 getCAR_SEAT_UNKNOWN() {
            return this.CAR_SEAT_UNKNOWN;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final ec0.h0 getSEAT_HEATER_HIGH() {
            return this.SEAT_HEATER_HIGH;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final ec0.h0 getSEAT_HEATER_LOW() {
            return this.SEAT_HEATER_LOW;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final ec0.h0 getSEAT_HEATER_MED() {
            return this.SEAT_HEATER_MED;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m344newBuilder();
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final ec0.h0 getSEAT_HEATER_OFF() {
            return this.SEAT_HEATER_OFF;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final ec0.h0 getSEAT_HEATER_UNKNOWN() {
            return this.SEAT_HEATER_UNKNOWN;
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ec0.h0 h0Var = this.SEAT_HEATER_UNKNOWN;
            if (h0Var != null) {
                arrayList.add("SEAT_HEATER_UNKNOWN=" + h0Var);
            }
            ec0.h0 h0Var2 = this.SEAT_HEATER_OFF;
            if (h0Var2 != null) {
                arrayList.add("SEAT_HEATER_OFF=" + h0Var2);
            }
            ec0.h0 h0Var3 = this.SEAT_HEATER_LOW;
            if (h0Var3 != null) {
                arrayList.add("SEAT_HEATER_LOW=" + h0Var3);
            }
            ec0.h0 h0Var4 = this.SEAT_HEATER_MED;
            if (h0Var4 != null) {
                arrayList.add("SEAT_HEATER_MED=" + h0Var4);
            }
            ec0.h0 h0Var5 = this.SEAT_HEATER_HIGH;
            if (h0Var5 != null) {
                arrayList.add("SEAT_HEATER_HIGH=" + h0Var5);
            }
            ec0.h0 h0Var6 = this.CAR_SEAT_UNKNOWN;
            if (h0Var6 != null) {
                arrayList.add("CAR_SEAT_UNKNOWN=" + h0Var6);
            }
            ec0.h0 h0Var7 = this.CAR_SEAT_FRONT_LEFT;
            if (h0Var7 != null) {
                arrayList.add("CAR_SEAT_FRONT_LEFT=" + h0Var7);
            }
            ec0.h0 h0Var8 = this.CAR_SEAT_FRONT_RIGHT;
            if (h0Var8 != null) {
                arrayList.add("CAR_SEAT_FRONT_RIGHT=" + h0Var8);
            }
            ec0.h0 h0Var9 = this.CAR_SEAT_REAR_LEFT;
            if (h0Var9 != null) {
                arrayList.add("CAR_SEAT_REAR_LEFT=" + h0Var9);
            }
            ec0.h0 h0Var10 = this.CAR_SEAT_REAR_LEFT_BACK;
            if (h0Var10 != null) {
                arrayList.add("CAR_SEAT_REAR_LEFT_BACK=" + h0Var10);
            }
            ec0.h0 h0Var11 = this.CAR_SEAT_REAR_CENTER;
            if (h0Var11 != null) {
                arrayList.add("CAR_SEAT_REAR_CENTER=" + h0Var11);
            }
            ec0.h0 h0Var12 = this.CAR_SEAT_REAR_RIGHT;
            if (h0Var12 != null) {
                arrayList.add("CAR_SEAT_REAR_RIGHT=" + h0Var12);
            }
            ec0.h0 h0Var13 = this.CAR_SEAT_REAR_RIGHT_BACK;
            if (h0Var13 != null) {
                arrayList.add("CAR_SEAT_REAR_RIGHT_BACK=" + h0Var13);
            }
            ec0.h0 h0Var14 = this.CAR_SEAT_THIRD_ROW_LEFT;
            if (h0Var14 != null) {
                arrayList.add("CAR_SEAT_THIRD_ROW_LEFT=" + h0Var14);
            }
            ec0.h0 h0Var15 = this.CAR_SEAT_THIRD_ROW_RIGHT;
            if (h0Var15 != null) {
                arrayList.add("CAR_SEAT_THIRD_ROW_RIGHT=" + h0Var15);
            }
            return p013kotlin.collections.v.y0(arrayList, ", ", "HvacSeatHeaterAction{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ c(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, ec0.h0 h0Var5, ec0.h0 h0Var6, ec0.h0 h0Var7, ec0.h0 h0Var8, ec0.h0 h0Var9, ec0.h0 h0Var10, ec0.h0 h0Var11, ec0.h0 h0Var12, ec0.h0 h0Var13, ec0.h0 h0Var14, ec0.h0 h0Var15, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? null : h0Var5, (i11 & 32) != 0 ? null : h0Var6, (i11 & 64) != 0 ? null : h0Var7, (i11 & 128) != 0 ? null : h0Var8, (i11 & 256) != 0 ? null : h0Var9, (i11 & 512) != 0 ? null : h0Var10, (i11 & 1024) != 0 ? null : h0Var11, (i11 & 2048) != 0 ? null : h0Var12, (i11 & 4096) != 0 ? null : h0Var13, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : h0Var14, (i11 & 16384) != 0 ? null : h0Var15, (i11 & 32768) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m344newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, ec0.h0 h0Var5, ec0.h0 h0Var6, ec0.h0 h0Var7, ec0.h0 h0Var8, ec0.h0 h0Var9, ec0.h0 h0Var10, ec0.h0 h0Var11, ec0.h0 h0Var12, ec0.h0 h0Var13, ec0.h0 h0Var14, ec0.h0 h0Var15, okio.k unknownFields) {
            super(f65440q, unknownFields);
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.SEAT_HEATER_UNKNOWN = h0Var;
            this.SEAT_HEATER_OFF = h0Var2;
            this.SEAT_HEATER_LOW = h0Var3;
            this.SEAT_HEATER_MED = h0Var4;
            this.SEAT_HEATER_HIGH = h0Var5;
            this.CAR_SEAT_UNKNOWN = h0Var6;
            this.CAR_SEAT_FRONT_LEFT = h0Var7;
            this.CAR_SEAT_FRONT_RIGHT = h0Var8;
            this.CAR_SEAT_REAR_LEFT = h0Var9;
            this.CAR_SEAT_REAR_LEFT_BACK = h0Var10;
            this.CAR_SEAT_REAR_CENTER = h0Var11;
            this.CAR_SEAT_REAR_RIGHT = h0Var12;
            this.CAR_SEAT_REAR_RIGHT_BACK = h0Var13;
            this.CAR_SEAT_THIRD_ROW_LEFT = h0Var14;
            this.CAR_SEAT_THIRD_ROW_RIGHT = h0Var15;
            if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, h0Var5) <= 1) {
                if (x20.d.e(h0Var6, h0Var7, h0Var8, h0Var9, h0Var10, h0Var11, h0Var12, h0Var13, h0Var14, h0Var15) > 1) {
                    throw new IllegalArgumentException("At most one of CAR_SEAT_UNKNOWN, CAR_SEAT_FRONT_LEFT, CAR_SEAT_FRONT_RIGHT, CAR_SEAT_REAR_LEFT, CAR_SEAT_REAR_LEFT_BACK, CAR_SEAT_REAR_CENTER, CAR_SEAT_REAR_RIGHT, CAR_SEAT_REAR_RIGHT_BACK, CAR_SEAT_THIRD_ROW_LEFT, CAR_SEAT_THIRD_ROW_RIGHT may be non-null");
                }
                return;
            }
            throw new IllegalArgumentException("At most one of SEAT_HEATER_UNKNOWN, SEAT_HEATER_OFF, SEAT_HEATER_LOW, SEAT_HEATER_MED, SEAT_HEATER_HIGH may be non-null");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u1() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final u1 a(List<c> hvacSeatHeaterAction, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(hvacSeatHeaterAction, "hvacSeatHeaterAction");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new u1(hvacSeatHeaterAction, unknownFields);
    }

    public final List<c> b() {
        return this.hvacSeatHeaterAction;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), u1Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.hvacSeatHeaterAction, u1Var.hvacSeatHeaterAction);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.hvacSeatHeaterAction.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m343newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.hvacSeatHeaterAction.isEmpty()) {
            arrayList.add("hvacSeatHeaterAction=" + this.hvacSeatHeaterAction);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "HvacSeatHeaterActions{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ u1(List list, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? p013kotlin.collections.v.m() : list, (i11 & 2) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m343newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(List<c> hvacSeatHeaterAction, okio.k unknownFields) {
        super(f65437c, unknownFields);
        p013kotlin.jvm.internal.s.k(hvacSeatHeaterAction, "hvacSeatHeaterAction");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.hvacSeatHeaterAction = x20.d.g("hvacSeatHeaterAction", hvacSeatHeaterAction);
    }
}
