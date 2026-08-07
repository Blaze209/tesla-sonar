package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import ezvcard.property.Gender;
import j$.time.Instant;
import java.io.IOException;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006 #+',%BG\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJM\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b%\u0010*¨\u0006-"}, d2 = {"Lgc0/o0;", "Lcom/squareup/wire/f;", "", "Lgc0/o0$c;", "soh_result", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lgc0/o0$f;", "soh_test_state", "Lgc0/o0$d;", "soh_test_end_mode", "Lokio/k;", "unknownFields", "<init>", "(Lgc0/o0$c;Lj$/time/Instant;Lgc0/o0$f;Lgc0/o0$d;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lgc0/o0$c;Lj$/time/Instant;Lgc0/o0$f;Lgc0/o0$d;Lokio/k;)Lgc0/o0;", "Lgc0/o0$c;", "b", "()Lgc0/o0$c;", "Lj$/time/Instant;", "e", "()Lj$/time/Instant;", "c", "Lgc0/o0$f;", DateTokenConverter.CONVERTER_KEY, "()Lgc0/o0$f;", "Lgc0/o0$d;", "()Lgc0/o0$d;", "f", "g", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<o0> f68268f = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(o0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.SohState$SohResult#ADAPTER", jsonName = "sohResult", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final c soh_result;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final Instant timestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.SohState$SohTestState#ADAPTER", jsonName = "sohTestState", tag = 1)
    private final f soh_test_state;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.SohState$SohTestEndMode#ADAPTER", jsonName = "sohTestEndMode", tag = 2)
    private final d soh_test_end_mode;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/o0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/o0;", "value", "", "c", "(Lgc0/o0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/o0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/o0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/o0;)Lgc0/o0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<o0> {
        a(com.squareup.wire.b bVar, co0.d<o0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.SohState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            c cVarDecode = null;
            Instant instantDecode = null;
            f fVarDecode = null;
            d dVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new o0(cVarDecode, instantDecode, fVarDecode, dVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    fVarDecode = f.f68292e.decode(reader);
                } else if (iG == 2) {
                    dVarDecode = d.f68282d.decode(reader);
                } else if (iG == 3) {
                    cVarDecode = c.f68274h.decode(reader);
                } else if (iG != 4) {
                    reader.m(iG);
                } else {
                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, o0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getSoh_result() != null) {
                c.f68274h.encodeWithTag(writer, 3, value.getSoh_result());
            }
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 4, value.getTimestamp());
            }
            f.f68292e.encodeWithTag(writer, 1, value.getSoh_test_state());
            d.f68282d.encodeWithTag(writer, 2, value.getSoh_test_end_mode());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(o0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getSoh_result() != null) {
                iD += c.f68274h.encodedSizeWithTag(3, value.getSoh_result());
            }
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getTimestamp());
            }
            return iD + f.f68292e.encodedSizeWithTag(1, value.getSoh_test_state()) + d.f68282d.encodedSizeWithTag(2, value.getSoh_test_end_mode());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public o0 redact(o0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            c soh_result = value.getSoh_result();
            c cVarRedact = soh_result != null ? c.f68274h.redact(soh_result) : null;
            Instant timestamp = value.getTimestamp();
            Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
            f soh_test_state = value.getSoh_test_state();
            f fVarRedact = soh_test_state != null ? f.f68292e.redact(soh_test_state) : null;
            d soh_test_end_mode = value.getSoh_test_end_mode();
            return value.a(cVarRedact, instantRedact, fVarRedact, soh_test_end_mode != null ? d.f68282d.redact(soh_test_end_mode) : null, okio.k.f97943e);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BS\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJY\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b%\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b)\u0010,¨\u0006-"}, d2 = {"Lgc0/o0$c;", "Lcom/squareup/wire/f;", "", "", "soh_calibrated", "Lgc0/o0$g;", "soh_health_result", "soh_regulated", "", "soh", "", "soh_last_test_time", "soh_distance_since_soh_test", "Lokio/k;", "unknownFields", "<init>", "(ZLgc0/o0$g;ZLjava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ZLgc0/o0$g;ZLjava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Lokio/k;)Lgc0/o0$c;", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "b", "Lgc0/o0$g;", "f", "()Lgc0/o0$g;", "c", "h", "Ljava/lang/Float;", "()Ljava/lang/Float;", "e", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends com.squareup.wire.f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final ProtoAdapter<c> f68274h = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(c.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "sohCalibrated", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
        private final boolean soh_calibrated;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.SohState$WarrantyServiceResult#ADAPTER", jsonName = "sohHealthResult", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
        private final g soh_health_result;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "sohRegulated", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
        private final boolean soh_regulated;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
        private final Float soh;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "sohLastTestTime", tag = 5)
        private final Integer soh_last_test_time;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "sohDistanceSinceSohTest", tag = 7)
        private final Integer soh_distance_since_soh_test;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/o0$c$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/o0$c;", "value", "", "c", "(Lgc0/o0$c;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/o0$c;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/o0$c;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/o0$c;)Lgc0/o0$c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, co0.d<c> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.SohState.SohResult", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c decode(com.squareup.wire.k reader) throws IOException {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                g gVarDecode = g.SOH_OK;
                long jD = reader.d();
                Float fDecode = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                Integer numDecode = null;
                Integer numDecode2 = null;
                while (true) {
                    g gVar = gVarDecode;
                    while (true) {
                        int iG = reader.g();
                        if (iG == -1) {
                            return new c(zBooleanValue, gVar, zBooleanValue2, fDecode, numDecode, numDecode2, reader.e(jD));
                        }
                        switch (iG) {
                            case 3:
                                fDecode = ProtoAdapter.FLOAT.decode(reader);
                                break;
                            case 4:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 5:
                                numDecode = ProtoAdapter.UINT32.decode(reader);
                                break;
                            case 6:
                                try {
                                    gVarDecode = g.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                    reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                                }
                                break;
                            case 7:
                                numDecode2 = ProtoAdapter.UINT32.decode(reader);
                                break;
                            case 8:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            default:
                                reader.m(iG);
                                break;
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void encode(com.squareup.wire.l writer, c value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                if (value.getSoh_calibrated()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.getSoh_calibrated()));
                }
                if (value.getSoh_health_result() != g.SOH_OK) {
                    g.ADAPTER.encodeWithTag(writer, 6, value.getSoh_health_result());
                }
                if (value.getSoh_regulated()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, Boolean.valueOf(value.getSoh_regulated()));
                }
                ProtoAdapter.FLOAT.encodeWithTag(writer, 3, value.getSoh());
                ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
                protoAdapter.encodeWithTag(writer, 5, value.getSoh_last_test_time());
                protoAdapter.encodeWithTag(writer, 7, value.getSoh_distance_since_soh_test());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(c value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                if (value.getSoh_calibrated()) {
                    iD += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getSoh_calibrated()));
                }
                if (value.getSoh_health_result() != g.SOH_OK) {
                    iD += g.ADAPTER.encodedSizeWithTag(6, value.getSoh_health_result());
                }
                if (value.getSoh_regulated()) {
                    iD += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getSoh_regulated()));
                }
                int iEncodedSizeWithTag = iD + ProtoAdapter.FLOAT.encodedSizeWithTag(3, value.getSoh());
                ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(5, value.getSoh_last_test_time()) + protoAdapter.encodedSizeWithTag(7, value.getSoh_distance_since_soh_test());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public c redact(c value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                return c.b(value, false, null, false, null, null, null, okio.k.f97943e, 63, null);
            }
        }

        public c() {
            this(false, null, false, null, null, null, null, 127, null);
        }

        public static /* synthetic */ c b(c cVar, boolean z11, g gVar, boolean z12, Float f11, Integer num, Integer num2, okio.k kVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = cVar.soh_calibrated;
            }
            if ((i11 & 2) != 0) {
                gVar = cVar.soh_health_result;
            }
            if ((i11 & 4) != 0) {
                z12 = cVar.soh_regulated;
            }
            if ((i11 & 8) != 0) {
                f11 = cVar.soh;
            }
            if ((i11 & 16) != 0) {
                num = cVar.soh_last_test_time;
            }
            if ((i11 & 32) != 0) {
                num2 = cVar.soh_distance_since_soh_test;
            }
            if ((i11 & 64) != 0) {
                kVar = cVar.unknownFields();
            }
            Integer num3 = num2;
            okio.k kVar2 = kVar;
            Integer num4 = num;
            boolean z13 = z12;
            return cVar.a(z11, gVar, z13, f11, num4, num3, kVar2);
        }

        public final c a(boolean soh_calibrated, g soh_health_result, boolean soh_regulated, Float soh, Integer soh_last_test_time, Integer soh_distance_since_soh_test, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(soh_health_result, "soh_health_result");
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new c(soh_calibrated, soh_health_result, soh_regulated, soh, soh_last_test_time, soh_distance_since_soh_test, unknownFields);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Float getSoh() {
            return this.soh;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getSoh_calibrated() {
            return this.soh_calibrated;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getSoh_distance_since_soh_test() {
            return this.soh_distance_since_soh_test;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), cVar.unknownFields()) && this.soh_calibrated == cVar.soh_calibrated && this.soh_health_result == cVar.soh_health_result && this.soh_regulated == cVar.soh_regulated && p013kotlin.jvm.internal.s.e(this.soh, cVar.soh) && p013kotlin.jvm.internal.s.f(this.soh_last_test_time, cVar.soh_last_test_time) && p013kotlin.jvm.internal.s.f(this.soh_distance_since_soh_test, cVar.soh_distance_since_soh_test);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final g getSoh_health_result() {
            return this.soh_health_result;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Integer getSoh_last_test_time() {
            return this.soh_last_test_time;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getSoh_regulated() {
            return this.soh_regulated;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = ((((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.soh_calibrated)) * 37) + this.soh_health_result.hashCode()) * 37) + Boolean.hashCode(this.soh_regulated)) * 37;
            Float f11 = this.soh;
            int iHashCode2 = (iHashCode + (f11 != null ? f11.hashCode() : 0)) * 37;
            Integer num = this.soh_last_test_time;
            int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
            Integer num2 = this.soh_distance_since_soh_test;
            int iHashCode4 = iHashCode3 + (num2 != null ? num2.hashCode() : 0);
            this.hashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m422newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("soh_calibrated=" + this.soh_calibrated);
            arrayList.add("soh_health_result=" + this.soh_health_result);
            arrayList.add("soh_regulated=" + this.soh_regulated);
            Float f11 = this.soh;
            if (f11 != null) {
                arrayList.add("soh=" + f11);
            }
            Integer num = this.soh_last_test_time;
            if (num != null) {
                arrayList.add("soh_last_test_time=" + num);
            }
            Integer num2 = this.soh_distance_since_soh_test;
            if (num2 != null) {
                arrayList.add("soh_distance_since_soh_test=" + num2);
            }
            return p013kotlin.collections.v.y0(arrayList, ", ", "SohResult{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ c(boolean z11, g gVar, boolean z12, Float f11, Integer num, Integer num2, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? g.SOH_OK : gVar, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? null : f11, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? null : num2, (i11 & 64) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m422newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z11, g soh_health_result, boolean z12, Float f11, Integer num, Integer num2, okio.k unknownFields) {
            super(f68274h, unknownFields);
            p013kotlin.jvm.internal.s.k(soh_health_result, "soh_health_result");
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.soh_calibrated = z11;
            this.soh_health_result = soh_health_result;
            this.soh_regulated = z12;
            this.soh = f11;
            this.soh_last_test_time = num;
            this.soh_distance_since_soh_test = num2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lgc0/o0$d;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "Complete", "Failed", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lokio/k;)Lgc0/o0$d;", "Lec0/h0;", "b", "()Lec0/h0;", "c", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends com.squareup.wire.f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ProtoAdapter<d> f68282d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(d.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
        private final ec0.h0 Complete;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
        private final ec0.h0 Failed;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/o0$d$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/o0$d;", "value", "", "c", "(Lgc0/o0$d;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/o0$d;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/o0$d;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/o0$d;)Lgc0/o0$d;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<d> {
            a(com.squareup.wire.b bVar, co0.d<d> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.SohState.SohTestEndMode", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d decode(com.squareup.wire.k reader) {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                long jD = reader.d();
                ec0.h0 h0VarDecode = null;
                ec0.h0 h0VarDecode2 = null;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new d(h0VarDecode, h0VarDecode2, reader.e(jD));
                    }
                    if (iG == 1) {
                        h0VarDecode = ec0.h0.f62622b.decode(reader);
                    } else if (iG != 2) {
                        reader.m(iG);
                    } else {
                        h0VarDecode2 = ec0.h0.f62622b.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void encode(com.squareup.wire.l writer, d value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                protoAdapter.encodeWithTag(writer, 1, value.getComplete());
                protoAdapter.encodeWithTag(writer, 2, value.getFailed());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(d value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                return iD + protoAdapter.encodedSizeWithTag(1, value.getComplete()) + protoAdapter.encodedSizeWithTag(2, value.getFailed());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public d redact(d value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                ec0.h0 complete = value.getComplete();
                ec0.h0 h0VarRedact = complete != null ? ec0.h0.f62622b.redact(complete) : null;
                ec0.h0 failed = value.getFailed();
                return value.a(h0VarRedact, failed != null ? ec0.h0.f62622b.redact(failed) : null, okio.k.f97943e);
            }
        }

        public d() {
            this(null, null, null, 7, null);
        }

        public final d a(ec0.h0 Complete, ec0.h0 Failed, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new d(Complete, Failed, unknownFields);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ec0.h0 getComplete() {
            return this.Complete;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ec0.h0 getFailed() {
            return this.Failed;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), dVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.Complete, dVar.Complete) && p013kotlin.jvm.internal.s.f(this.Failed, dVar.Failed);
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ec0.h0 h0Var = this.Complete;
            int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
            ec0.h0 h0Var2 = this.Failed;
            int iHashCode3 = iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m423newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ec0.h0 h0Var = this.Complete;
            if (h0Var != null) {
                arrayList.add("Complete=" + h0Var);
            }
            ec0.h0 h0Var2 = this.Failed;
            if (h0Var2 != null) {
                arrayList.add("Failed=" + h0Var2);
            }
            return p013kotlin.collections.v.y0(arrayList, ", ", "SohTestEndMode{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ d(ec0.h0 h0Var, ec0.h0 h0Var2, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m423newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ec0.h0 h0Var, ec0.h0 h0Var2, okio.k unknownFields) {
            super(f68282d, unknownFields);
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.Complete = h0Var;
            this.Failed = h0Var2;
            if (x20.d.c(h0Var, h0Var2) > 1) {
                throw new IllegalArgumentException("At most one of Complete, Failed may be non-null");
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JG\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b \u0010\u001d¨\u0006!"}, d2 = {"Lgc0/o0$e;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "Discharge", "DischargeRest", "Charge", "ChargeRest", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lgc0/o0$e;", "Lec0/h0;", DateTokenConverter.CONVERTER_KEY, "()Lec0/h0;", "b", "e", "c", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends com.squareup.wire.f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final ProtoAdapter<e> f68286f = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(e.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
        private final ec0.h0 Discharge;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
        private final ec0.h0 DischargeRest;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
        private final ec0.h0 Charge;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)
        private final ec0.h0 ChargeRest;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/o0$e$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/o0$e;", "value", "", "c", "(Lgc0/o0$e;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/o0$e;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/o0$e;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/o0$e;)Lgc0/o0$e;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<e> {
            a(com.squareup.wire.b bVar, co0.d<e> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.SohState.SohTestPhase", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e decode(com.squareup.wire.k reader) {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                long jD = reader.d();
                ec0.h0 h0VarDecode = null;
                ec0.h0 h0VarDecode2 = null;
                ec0.h0 h0VarDecode3 = null;
                ec0.h0 h0VarDecode4 = null;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new e(h0VarDecode, h0VarDecode2, h0VarDecode3, h0VarDecode4, reader.e(jD));
                    }
                    if (iG == 1) {
                        h0VarDecode = ec0.h0.f62622b.decode(reader);
                    } else if (iG == 2) {
                        h0VarDecode2 = ec0.h0.f62622b.decode(reader);
                    } else if (iG == 3) {
                        h0VarDecode3 = ec0.h0.f62622b.decode(reader);
                    } else if (iG != 4) {
                        reader.m(iG);
                    } else {
                        h0VarDecode4 = ec0.h0.f62622b.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void encode(com.squareup.wire.l writer, e value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                protoAdapter.encodeWithTag(writer, 1, value.getDischarge());
                protoAdapter.encodeWithTag(writer, 2, value.getDischargeRest());
                protoAdapter.encodeWithTag(writer, 3, value.getCharge());
                protoAdapter.encodeWithTag(writer, 4, value.getChargeRest());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(e value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                return iD + protoAdapter.encodedSizeWithTag(1, value.getDischarge()) + protoAdapter.encodedSizeWithTag(2, value.getDischargeRest()) + protoAdapter.encodedSizeWithTag(3, value.getCharge()) + protoAdapter.encodedSizeWithTag(4, value.getChargeRest());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public e redact(e value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                ec0.h0 discharge = value.getDischarge();
                ec0.h0 h0VarRedact = discharge != null ? ec0.h0.f62622b.redact(discharge) : null;
                ec0.h0 dischargeRest = value.getDischargeRest();
                ec0.h0 h0VarRedact2 = dischargeRest != null ? ec0.h0.f62622b.redact(dischargeRest) : null;
                ec0.h0 charge = value.getCharge();
                ec0.h0 h0VarRedact3 = charge != null ? ec0.h0.f62622b.redact(charge) : null;
                ec0.h0 chargeRest = value.getChargeRest();
                return value.a(h0VarRedact, h0VarRedact2, h0VarRedact3, chargeRest != null ? ec0.h0.f62622b.redact(chargeRest) : null, okio.k.f97943e);
            }
        }

        public e() {
            this(null, null, null, null, null, 31, null);
        }

        public final e a(ec0.h0 Discharge, ec0.h0 DischargeRest, ec0.h0 Charge, ec0.h0 ChargeRest, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new e(Discharge, DischargeRest, Charge, ChargeRest, unknownFields);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ec0.h0 getCharge() {
            return this.Charge;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ec0.h0 getChargeRest() {
            return this.ChargeRest;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ec0.h0 getDischarge() {
            return this.Discharge;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ec0.h0 getDischargeRest() {
            return this.DischargeRest;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), eVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.Discharge, eVar.Discharge) && p013kotlin.jvm.internal.s.f(this.DischargeRest, eVar.DischargeRest) && p013kotlin.jvm.internal.s.f(this.Charge, eVar.Charge) && p013kotlin.jvm.internal.s.f(this.ChargeRest, eVar.ChargeRest);
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ec0.h0 h0Var = this.Discharge;
            int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
            ec0.h0 h0Var2 = this.DischargeRest;
            int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
            ec0.h0 h0Var3 = this.Charge;
            int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
            ec0.h0 h0Var4 = this.ChargeRest;
            int iHashCode5 = iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0);
            this.hashCode = iHashCode5;
            return iHashCode5;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m424newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ec0.h0 h0Var = this.Discharge;
            if (h0Var != null) {
                arrayList.add("Discharge=" + h0Var);
            }
            ec0.h0 h0Var2 = this.DischargeRest;
            if (h0Var2 != null) {
                arrayList.add("DischargeRest=" + h0Var2);
            }
            ec0.h0 h0Var3 = this.Charge;
            if (h0Var3 != null) {
                arrayList.add("Charge=" + h0Var3);
            }
            ec0.h0 h0Var4 = this.ChargeRest;
            if (h0Var4 != null) {
                arrayList.add("ChargeRest=" + h0Var4);
            }
            return p013kotlin.collections.v.y0(arrayList, ", ", "SohTestPhase{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ e(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m424newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, okio.k unknownFields) {
            super(f68286f, unknownFields);
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.Discharge = h0Var;
            this.DischargeRest = h0Var2;
            this.Charge = h0Var3;
            this.ChargeRest = h0Var4;
            if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, new Object[0]) > 1) {
                throw new IllegalArgumentException("At most one of Discharge, DischargeRest, Charge, ChargeRest may be non-null");
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB1\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lgc0/o0$f;", "Lcom/squareup/wire/f;", "", "Lgc0/o0$e;", "soh_test_phase", "", "soh_time_estimate", "soh_time_remaining", "Lokio/k;", "unknownFields", "<init>", "(Lgc0/o0$e;FFLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lgc0/o0$e;FFLokio/k;)Lgc0/o0$f;", "Lgc0/o0$e;", "c", "()Lgc0/o0$e;", "b", Gender.FEMALE, DateTokenConverter.CONVERTER_KEY, "()F", "e", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends com.squareup.wire.f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final ProtoAdapter<f> f68292e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(f.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.SohState$SohTestPhase#ADAPTER", jsonName = "sohTestPhase", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
        private final e soh_test_phase;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "sohTimeEstimate", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
        private final float soh_time_estimate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "sohTimeRemaining", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
        private final float soh_time_remaining;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/o0$f$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/o0$f;", "value", "", "c", "(Lgc0/o0$f;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/o0$f;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/o0$f;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/o0$f;)Lgc0/o0$f;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<f> {
            a(com.squareup.wire.b bVar, co0.d<f> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.SohState.SohTestState", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f decode(com.squareup.wire.k reader) {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                long jD = reader.d();
                e eVarDecode = null;
                float fFloatValue = BitmapDescriptorFactory.HUE_RED;
                float fFloatValue2 = 0.0f;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new f(eVarDecode, fFloatValue, fFloatValue2, reader.e(jD));
                    }
                    if (iG == 1) {
                        eVarDecode = e.f68286f.decode(reader);
                    } else if (iG == 2) {
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (iG != 3) {
                        reader.m(iG);
                    } else {
                        fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void encode(com.squareup.wire.l writer, f value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                if (value.getSoh_test_phase() != null) {
                    e.f68286f.encodeWithTag(writer, 1, value.getSoh_test_phase());
                }
                if (value.getSoh_time_estimate() != BitmapDescriptorFactory.HUE_RED) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, Float.valueOf(value.getSoh_time_estimate()));
                }
                if (value.getSoh_time_remaining() != BitmapDescriptorFactory.HUE_RED) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, Float.valueOf(value.getSoh_time_remaining()));
                }
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(f value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                if (value.getSoh_test_phase() != null) {
                    iD += e.f68286f.encodedSizeWithTag(1, value.getSoh_test_phase());
                }
                if (value.getSoh_time_estimate() != BitmapDescriptorFactory.HUE_RED) {
                    iD += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.getSoh_time_estimate()));
                }
                return value.getSoh_time_remaining() == BitmapDescriptorFactory.HUE_RED ? iD : iD + ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getSoh_time_remaining()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public f redact(f value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                e soh_test_phase = value.getSoh_test_phase();
                return f.b(value, soh_test_phase != null ? e.f68286f.redact(soh_test_phase) : null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, okio.k.f97943e, 6, null);
            }
        }

        public f() {
            this(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 15, null);
        }

        public static /* synthetic */ f b(f fVar, e eVar, float f11, float f12, okio.k kVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                eVar = fVar.soh_test_phase;
            }
            if ((i11 & 2) != 0) {
                f11 = fVar.soh_time_estimate;
            }
            if ((i11 & 4) != 0) {
                f12 = fVar.soh_time_remaining;
            }
            if ((i11 & 8) != 0) {
                kVar = fVar.unknownFields();
            }
            return fVar.a(eVar, f11, f12, kVar);
        }

        public final f a(e soh_test_phase, float soh_time_estimate, float soh_time_remaining, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new f(soh_test_phase, soh_time_estimate, soh_time_remaining, unknownFields);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final e getSoh_test_phase() {
            return this.soh_test_phase;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getSoh_time_estimate() {
            return this.soh_time_estimate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getSoh_time_remaining() {
            return this.soh_time_remaining;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), fVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.soh_test_phase, fVar.soh_test_phase) && this.soh_time_estimate == fVar.soh_time_estimate && this.soh_time_remaining == fVar.soh_time_remaining;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            e eVar = this.soh_test_phase;
            int iHashCode2 = ((((iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 37) + Float.hashCode(this.soh_time_estimate)) * 37) + Float.hashCode(this.soh_time_remaining);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m425newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            e eVar = this.soh_test_phase;
            if (eVar != null) {
                arrayList.add("soh_test_phase=" + eVar);
            }
            arrayList.add("soh_time_estimate=" + this.soh_time_estimate);
            arrayList.add("soh_time_remaining=" + this.soh_time_remaining);
            return p013kotlin.collections.v.y0(arrayList, ", ", "SohTestState{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ f(e eVar, float f11, float f12, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : eVar, (i11 & 2) != 0 ? 0.0f : f11, (i11 & 4) != 0 ? 0.0f : f12, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m425newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar, float f11, float f12, okio.k unknownFields) {
            super(f68292e, unknownFields);
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.soh_test_phase = eVar;
            this.soh_time_estimate = f11;
            this.soh_time_remaining = f12;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 gc0.o0$g, still in use, count: 1, list:
      (r0v0 gc0.o0$g) from 0x0046: CONSTRUCTOR 
      (wrap co0.d:0x003e: INVOKE (wrap java.lang.Class:0x003c: CONST_CLASS  A[WRAPPED] (LINE:61) gc0.o0$g.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:63))
      (wrap com.squareup.wire.o:0x0042: SGET  A[WRAPPED] (LINE:67) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 gc0.o0$g)
     A[MD:(co0.d<gc0.o0$g>, com.squareup.wire.o, gc0.o0$g):void (m), WRAPPED] (LINE:71) call: gc0.o0.g.a.<init>(co0.d, com.squareup.wire.o, gc0.o0$g):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lgc0/o0$g;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "SOH_OK", "SOH_REDUCED", "SOH_NO_INTERNET", "SOH_UNKNOWN", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g implements com.squareup.wire.p {
        SOH_OK(0),
        SOH_REDUCED(1),
        SOH_NO_INTERNET(2),
        SOH_UNKNOWN(3);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<g> ADAPTER = new a(p013kotlin.jvm.internal.o0.b(g.class), com.squareup.wire.o.PROTO_3, new g(0));

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"gc0/o0$g$a", "Lcom/squareup/wire/a;", "Lgc0/o0$g;", "", "value", "f", "(I)Lgc0/o0$g;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends com.squareup.wire.a<g> {
            a(co0.d<g> dVar, com.squareup.wire.o oVar, g gVar) {
                super(dVar, oVar, gVar);
            }

            @Override // com.squareup.wire.a
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public g d(int value) {
                return g.INSTANCE.a(value);
            }
        }

        /* JADX INFO: renamed from: gc0.o0$g$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgc0/o0$g$b;", "", "<init>", "()V", "", "value", "Lgc0/o0$g;", "a", "(I)Lgc0/o0$g;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final g a(int value) {
                if (value == 0) {
                    return g.SOH_OK;
                }
                if (value == 1) {
                    return g.SOH_REDUCED;
                }
                if (value == 2) {
                    return g.SOH_NO_INTERNET;
                }
                if (value != 3) {
                    return null;
                }
                return g.SOH_UNKNOWN;
            }

            private Companion() {
            }
        }

        static {
        }

        private g(int i11) {
            super(str, i);
            this.value = i11;
        }

        public static final g fromValue(int i11) {
            return INSTANCE.a(i11);
        }

        public static EnumEntries<g> getEntries() {
            return $ENTRIES;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    public o0() {
        this(null, null, null, null, null, 31, null);
    }

    public final o0 a(c soh_result, Instant timestamp, f soh_test_state, d soh_test_end_mode, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new o0(soh_result, timestamp, soh_test_state, soh_test_end_mode, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getSoh_result() {
        return this.soh_result;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getSoh_test_end_mode() {
        return this.soh_test_end_mode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getSoh_test_state() {
        return this.soh_test_state;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), o0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.soh_result, o0Var.soh_result) && p013kotlin.jvm.internal.s.f(this.timestamp, o0Var.timestamp) && p013kotlin.jvm.internal.s.f(this.soh_test_state, o0Var.soh_test_state) && p013kotlin.jvm.internal.s.f(this.soh_test_end_mode, o0Var.soh_test_end_mode);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        c cVar = this.soh_result;
        int iHashCode2 = (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 37;
        Instant instant = this.timestamp;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        f fVar = this.soh_test_state;
        int iHashCode4 = (iHashCode3 + (fVar != null ? fVar.hashCode() : 0)) * 37;
        d dVar = this.soh_test_end_mode;
        int iHashCode5 = iHashCode4 + (dVar != null ? dVar.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m421newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        c cVar = this.soh_result;
        if (cVar != null) {
            arrayList.add("soh_result=" + cVar);
        }
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        f fVar = this.soh_test_state;
        if (fVar != null) {
            arrayList.add("soh_test_state=" + fVar);
        }
        d dVar = this.soh_test_end_mode;
        if (dVar != null) {
            arrayList.add("soh_test_end_mode=" + dVar);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "SohState{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ o0(c cVar, Instant instant, f fVar, d dVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : cVar, (i11 & 2) != 0 ? null : instant, (i11 & 4) != 0 ? null : fVar, (i11 & 8) != 0 ? null : dVar, (i11 & 16) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m421newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(c cVar, Instant instant, f fVar, d dVar, okio.k unknownFields) {
        super(f68268f, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.soh_result = cVar;
        this.timestamp = instant;
        this.soh_test_state = fVar;
        this.soh_test_end_mode = dVar;
    }
}
