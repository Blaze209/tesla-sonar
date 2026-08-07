package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import j$.time.Instant;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b!\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006-2&4):B\u0095\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u009b\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00108\u001a\u0004\b4\u00109R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<R\"\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b-\u0010BR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010A\u001a\u0004\bC\u0010BR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010.\u001a\u0004\b@\u00100¨\u0006D"}, d2 = {"Lgc0/x;", "Lcom/squareup/wire/f;", "", "", "gui_24_hour_time_OBSOLETE", "show_range_units_OBSOLETE", "Lgc0/x$g;", "gui_tirepressure_units_OBSOLETE", "Lgc0/x$e;", "gui_distance_units", "Lgc0/x$f;", "gui_temperature_units", "Lgc0/x$a;", "gui_charge_rate_units", "Lgc0/x$d;", "gui_range_display", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "gui_24_hour_time", "show_range_units", "gui_tirepressure_units", "Lokio/k;", "unknownFields", "<init>", "(ZZLgc0/x$g;Lgc0/x$e;Lgc0/x$f;Lgc0/x$a;Lgc0/x$d;Lj$/time/Instant;Ljava/lang/Boolean;Ljava/lang/Boolean;Lgc0/x$g;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ZZLgc0/x$g;Lgc0/x$e;Lgc0/x$f;Lgc0/x$a;Lgc0/x$d;Lj$/time/Instant;Ljava/lang/Boolean;Ljava/lang/Boolean;Lgc0/x$g;Lokio/k;)Lgc0/x;", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "b", "l", "c", "Lgc0/x$g;", "j", "()Lgc0/x$g;", "Lgc0/x$e;", "f", "()Lgc0/x$e;", "e", "Lgc0/x$f;", "h", "()Lgc0/x$f;", "Lgc0/x$a;", "()Lgc0/x$a;", "g", "Lgc0/x$d;", "()Lgc0/x$d;", "Lj$/time/Instant;", "m", "()Lj$/time/Instant;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "k", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x extends com.squareup.wire.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ProtoAdapter<x> f68673m = new b(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(x.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "gui24HourTimeOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final boolean gui_24_hour_time_OBSOLETE;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showRangeUnitsOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final boolean show_range_units_OBSOLETE;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.GuiSettings$TirePressureUnit#ADAPTER", jsonName = "guiTirepressureUnitsOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final g gui_tirepressure_units_OBSOLETE;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.GuiSettings$SpeedUnit#ADAPTER", jsonName = "guiDistanceUnits", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final e gui_distance_units;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.GuiSettings$TemperatureUnit#ADAPTER", jsonName = "guiTemperatureUnits", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final f gui_temperature_units;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.GuiSettings$ChargeRateUnit#ADAPTER", jsonName = "guiChargeRateUnits", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final a gui_charge_rate_units;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.GuiSettings$RangeDisplay#ADAPTER", jsonName = "guiRangeDisplay", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final d gui_range_display;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final Instant timestamp;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "gui24HourTime", tag = 104)
    private final Boolean gui_24_hour_time;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showRangeUnits", tag = 106)
    private final Boolean show_range_units;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.GuiSettings$TirePressureUnit#ADAPTER", jsonName = "guiTirepressureUnits", tag = 108)
    private final g gui_tirepressure_units;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cBA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JG\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006!"}, d2 = {"Lgc0/x$a;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "Invalid", "KilometersPerHour", "MilesPerHour", "kW", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lgc0/x$a;", "Lec0/h0;", "b", "()Lec0/h0;", DateTokenConverter.CONVERTER_KEY, "c", "e", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends com.squareup.wire.f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final ProtoAdapter<a> f68686f = new C1403a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(a.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
        private final ec0.h0 Invalid;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
        private final ec0.h0 KilometersPerHour;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
        private final ec0.h0 MilesPerHour;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)
        private final ec0.h0 kW;

        /* JADX INFO: renamed from: gc0.x$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/x$a$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/x$a;", "value", "", "c", "(Lgc0/x$a;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/x$a;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/x$a;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/x$a;)Lgc0/x$a;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1403a extends ProtoAdapter<a> {
            C1403a(com.squareup.wire.b bVar, co0.d<a> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.GuiSettings.ChargeRateUnit", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a decode(com.squareup.wire.k reader) {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                long jD = reader.d();
                ec0.h0 h0VarDecode = null;
                ec0.h0 h0VarDecode2 = null;
                ec0.h0 h0VarDecode3 = null;
                ec0.h0 h0VarDecode4 = null;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new a(h0VarDecode, h0VarDecode2, h0VarDecode3, h0VarDecode4, reader.e(jD));
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
            public void encode(com.squareup.wire.l writer, a value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                protoAdapter.encodeWithTag(writer, 1, value.getInvalid());
                protoAdapter.encodeWithTag(writer, 2, value.getKilometersPerHour());
                protoAdapter.encodeWithTag(writer, 3, value.getMilesPerHour());
                protoAdapter.encodeWithTag(writer, 4, value.getKW());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(a value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                return iD + protoAdapter.encodedSizeWithTag(1, value.getInvalid()) + protoAdapter.encodedSizeWithTag(2, value.getKilometersPerHour()) + protoAdapter.encodedSizeWithTag(3, value.getMilesPerHour()) + protoAdapter.encodedSizeWithTag(4, value.getKW());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public a redact(a value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                ec0.h0 invalid = value.getInvalid();
                ec0.h0 h0VarRedact = invalid != null ? ec0.h0.f62622b.redact(invalid) : null;
                ec0.h0 kilometersPerHour = value.getKilometersPerHour();
                ec0.h0 h0VarRedact2 = kilometersPerHour != null ? ec0.h0.f62622b.redact(kilometersPerHour) : null;
                ec0.h0 milesPerHour = value.getMilesPerHour();
                ec0.h0 h0VarRedact3 = milesPerHour != null ? ec0.h0.f62622b.redact(milesPerHour) : null;
                ec0.h0 kw2 = value.getKW();
                return value.a(h0VarRedact, h0VarRedact2, h0VarRedact3, kw2 != null ? ec0.h0.f62622b.redact(kw2) : null, okio.k.f97943e);
            }
        }

        public a() {
            this(null, null, null, null, null, 31, null);
        }

        public final a a(ec0.h0 Invalid, ec0.h0 KilometersPerHour, ec0.h0 MilesPerHour, ec0.h0 kW, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new a(Invalid, KilometersPerHour, MilesPerHour, kW, unknownFields);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ec0.h0 getInvalid() {
            return this.Invalid;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ec0.h0 getKW() {
            return this.kW;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ec0.h0 getKilometersPerHour() {
            return this.KilometersPerHour;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ec0.h0 getMilesPerHour() {
            return this.MilesPerHour;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), aVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.Invalid, aVar.Invalid) && p013kotlin.jvm.internal.s.f(this.KilometersPerHour, aVar.KilometersPerHour) && p013kotlin.jvm.internal.s.f(this.MilesPerHour, aVar.MilesPerHour) && p013kotlin.jvm.internal.s.f(this.kW, aVar.kW);
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ec0.h0 h0Var = this.Invalid;
            int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
            ec0.h0 h0Var2 = this.KilometersPerHour;
            int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
            ec0.h0 h0Var3 = this.MilesPerHour;
            int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
            ec0.h0 h0Var4 = this.kW;
            int iHashCode5 = iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0);
            this.hashCode = iHashCode5;
            return iHashCode5;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m452newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ec0.h0 h0Var = this.Invalid;
            if (h0Var != null) {
                arrayList.add("Invalid=" + h0Var);
            }
            ec0.h0 h0Var2 = this.KilometersPerHour;
            if (h0Var2 != null) {
                arrayList.add("KilometersPerHour=" + h0Var2);
            }
            ec0.h0 h0Var3 = this.MilesPerHour;
            if (h0Var3 != null) {
                arrayList.add("MilesPerHour=" + h0Var3);
            }
            ec0.h0 h0Var4 = this.kW;
            if (h0Var4 != null) {
                arrayList.add("kW=" + h0Var4);
            }
            return p013kotlin.collections.v.y0(arrayList, ", ", "ChargeRateUnit{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ a(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m452newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, okio.k unknownFields) {
            super(f68686f, unknownFields);
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.Invalid = h0Var;
            this.KilometersPerHour = h0Var2;
            this.MilesPerHour = h0Var3;
            this.kW = h0Var4;
            if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, new Object[0]) > 1) {
                throw new IllegalArgumentException("At most one of Invalid, KilometersPerHour, MilesPerHour, kW may be non-null");
            }
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/x$b", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/x;", "value", "", "c", "(Lgc0/x;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/x;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/x;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/x;)Lgc0/x;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends ProtoAdapter<x> {
        b(com.squareup.wire.b bVar, co0.d<x> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.GuiSettings", oVar, (Object) null);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002c  */
        /* JADX WARN: Code duplicated, block: B:35:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:43:0x0056 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:0x0064 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:0x0078 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:46:0x0086 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:47:0x0098 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:48:0x00a7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:49:0x00b6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:51:0x002f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:52:0x0028 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:0x0024 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:6:0x0020  */
        /* JADX WARN: Failed to find 'out' block for switch in B:12:0x002c. Please report as an issue. */
        /* JADX WARN: Switch 'out' block B:4:0x0019 for B:12:0x002c already processed. Defaulting to fallback option. */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public gc0.x decode(com.squareup.wire.k r20) {
            /*
                Method dump skipped, instruction units count: 330
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: gc0.x.b.decode(com.squareup.wire.k):gc0.x");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, x value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getGui_24_hour_time_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.getGui_24_hour_time_OBSOLETE()));
            }
            if (value.getShow_range_units_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, Boolean.valueOf(value.getShow_range_units_OBSOLETE()));
            }
            if (value.getGui_tirepressure_units_OBSOLETE() != g.TirePressureUnitPsi) {
                g.ADAPTER.encodeWithTag(writer, 8, value.getGui_tirepressure_units_OBSOLETE());
            }
            if (value.getGui_distance_units() != null) {
                e.f68696d.encodeWithTag(writer, 1, value.getGui_distance_units());
            }
            if (value.getGui_temperature_units() != null) {
                f.f68700d.encodeWithTag(writer, 2, value.getGui_temperature_units());
            }
            if (value.getGui_charge_rate_units() != null) {
                a.f68686f.encodeWithTag(writer, 3, value.getGui_charge_rate_units());
            }
            if (value.getGui_range_display() != null) {
                d.f68692d.encodeWithTag(writer, 5, value.getGui_range_display());
            }
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 7, value.getTimestamp());
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(writer, 104, value.getGui_24_hour_time());
            protoAdapter.encodeWithTag(writer, 106, value.getShow_range_units());
            g.ADAPTER.encodeWithTag(writer, 108, value.getGui_tirepressure_units());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(x value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getGui_24_hour_time_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getGui_24_hour_time_OBSOLETE()));
            }
            if (value.getShow_range_units_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getShow_range_units_OBSOLETE()));
            }
            if (value.getGui_tirepressure_units_OBSOLETE() != g.TirePressureUnitPsi) {
                iD += g.ADAPTER.encodedSizeWithTag(8, value.getGui_tirepressure_units_OBSOLETE());
            }
            if (value.getGui_distance_units() != null) {
                iD += e.f68696d.encodedSizeWithTag(1, value.getGui_distance_units());
            }
            if (value.getGui_temperature_units() != null) {
                iD += f.f68700d.encodedSizeWithTag(2, value.getGui_temperature_units());
            }
            if (value.getGui_charge_rate_units() != null) {
                iD += a.f68686f.encodedSizeWithTag(3, value.getGui_charge_rate_units());
            }
            if (value.getGui_range_display() != null) {
                iD += d.f68692d.encodedSizeWithTag(5, value.getGui_range_display());
            }
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(7, value.getTimestamp());
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iD + protoAdapter.encodedSizeWithTag(104, value.getGui_24_hour_time()) + protoAdapter.encodedSizeWithTag(106, value.getShow_range_units()) + g.ADAPTER.encodedSizeWithTag(108, value.getGui_tirepressure_units());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public x redact(x value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            e gui_distance_units = value.getGui_distance_units();
            e eVarRedact = gui_distance_units != null ? e.f68696d.redact(gui_distance_units) : null;
            f gui_temperature_units = value.getGui_temperature_units();
            f fVarRedact = gui_temperature_units != null ? f.f68700d.redact(gui_temperature_units) : null;
            a gui_charge_rate_units = value.getGui_charge_rate_units();
            a aVarRedact = gui_charge_rate_units != null ? a.f68686f.redact(gui_charge_rate_units) : null;
            d gui_range_display = value.getGui_range_display();
            d dVarRedact = gui_range_display != null ? d.f68692d.redact(gui_range_display) : null;
            Instant timestamp = value.getTimestamp();
            return x.b(value, false, false, null, eVarRedact, fVarRedact, aVarRedact, dVarRedact, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, null, okio.k.f97943e, 1799, null);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lgc0/x$d;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "Ideal", "Rated", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lokio/k;)Lgc0/x$d;", "Lec0/h0;", "b", "()Lec0/h0;", "c", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends com.squareup.wire.f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ProtoAdapter<d> f68692d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(d.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
        private final ec0.h0 Ideal;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
        private final ec0.h0 Rated;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/x$d$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/x$d;", "value", "", "c", "(Lgc0/x$d;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/x$d;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/x$d;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/x$d;)Lgc0/x$d;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<d> {
            a(com.squareup.wire.b bVar, co0.d<d> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.GuiSettings.RangeDisplay", oVar, (Object) null);
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
                protoAdapter.encodeWithTag(writer, 1, value.getIdeal());
                protoAdapter.encodeWithTag(writer, 2, value.getRated());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(d value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                return iD + protoAdapter.encodedSizeWithTag(1, value.getIdeal()) + protoAdapter.encodedSizeWithTag(2, value.getRated());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public d redact(d value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                ec0.h0 ideal = value.getIdeal();
                ec0.h0 h0VarRedact = ideal != null ? ec0.h0.f62622b.redact(ideal) : null;
                ec0.h0 rated = value.getRated();
                return value.a(h0VarRedact, rated != null ? ec0.h0.f62622b.redact(rated) : null, okio.k.f97943e);
            }
        }

        public d() {
            this(null, null, null, 7, null);
        }

        public final d a(ec0.h0 Ideal, ec0.h0 Rated, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new d(Ideal, Rated, unknownFields);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ec0.h0 getIdeal() {
            return this.Ideal;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ec0.h0 getRated() {
            return this.Rated;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), dVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.Ideal, dVar.Ideal) && p013kotlin.jvm.internal.s.f(this.Rated, dVar.Rated);
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ec0.h0 h0Var = this.Ideal;
            int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
            ec0.h0 h0Var2 = this.Rated;
            int iHashCode3 = iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m453newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ec0.h0 h0Var = this.Ideal;
            if (h0Var != null) {
                arrayList.add("Ideal=" + h0Var);
            }
            ec0.h0 h0Var2 = this.Rated;
            if (h0Var2 != null) {
                arrayList.add("Rated=" + h0Var2);
            }
            return p013kotlin.collections.v.y0(arrayList, ", ", "RangeDisplay{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ d(ec0.h0 h0Var, ec0.h0 h0Var2, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m453newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ec0.h0 h0Var, ec0.h0 h0Var2, okio.k unknownFields) {
            super(f68692d, unknownFields);
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.Ideal = h0Var;
            this.Rated = h0Var2;
            if (x20.d.c(h0Var, h0Var2) > 1) {
                throw new IllegalArgumentException("At most one of Ideal, Rated may be non-null");
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lgc0/x$e;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "KilometersPerHour", "MilesPerHour", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lokio/k;)Lgc0/x$e;", "Lec0/h0;", "b", "()Lec0/h0;", "c", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends com.squareup.wire.f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ProtoAdapter<e> f68696d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(e.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
        private final ec0.h0 KilometersPerHour;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
        private final ec0.h0 MilesPerHour;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/x$e$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/x$e;", "value", "", "c", "(Lgc0/x$e;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/x$e;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/x$e;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/x$e;)Lgc0/x$e;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<e> {
            a(com.squareup.wire.b bVar, co0.d<e> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.GuiSettings.SpeedUnit", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e decode(com.squareup.wire.k reader) {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                long jD = reader.d();
                ec0.h0 h0VarDecode = null;
                ec0.h0 h0VarDecode2 = null;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new e(h0VarDecode, h0VarDecode2, reader.e(jD));
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
            public void encode(com.squareup.wire.l writer, e value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                protoAdapter.encodeWithTag(writer, 1, value.getKilometersPerHour());
                protoAdapter.encodeWithTag(writer, 2, value.getMilesPerHour());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(e value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                return iD + protoAdapter.encodedSizeWithTag(1, value.getKilometersPerHour()) + protoAdapter.encodedSizeWithTag(2, value.getMilesPerHour());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public e redact(e value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                ec0.h0 kilometersPerHour = value.getKilometersPerHour();
                ec0.h0 h0VarRedact = kilometersPerHour != null ? ec0.h0.f62622b.redact(kilometersPerHour) : null;
                ec0.h0 milesPerHour = value.getMilesPerHour();
                return value.a(h0VarRedact, milesPerHour != null ? ec0.h0.f62622b.redact(milesPerHour) : null, okio.k.f97943e);
            }
        }

        public e() {
            this(null, null, null, 7, null);
        }

        public final e a(ec0.h0 KilometersPerHour, ec0.h0 MilesPerHour, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new e(KilometersPerHour, MilesPerHour, unknownFields);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ec0.h0 getKilometersPerHour() {
            return this.KilometersPerHour;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ec0.h0 getMilesPerHour() {
            return this.MilesPerHour;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), eVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.KilometersPerHour, eVar.KilometersPerHour) && p013kotlin.jvm.internal.s.f(this.MilesPerHour, eVar.MilesPerHour);
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ec0.h0 h0Var = this.KilometersPerHour;
            int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
            ec0.h0 h0Var2 = this.MilesPerHour;
            int iHashCode3 = iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m454newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ec0.h0 h0Var = this.KilometersPerHour;
            if (h0Var != null) {
                arrayList.add("KilometersPerHour=" + h0Var);
            }
            ec0.h0 h0Var2 = this.MilesPerHour;
            if (h0Var2 != null) {
                arrayList.add("MilesPerHour=" + h0Var2);
            }
            return p013kotlin.collections.v.y0(arrayList, ", ", "SpeedUnit{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ e(ec0.h0 h0Var, ec0.h0 h0Var2, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m454newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ec0.h0 h0Var, ec0.h0 h0Var2, okio.k unknownFields) {
            super(f68696d, unknownFields);
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.KilometersPerHour = h0Var;
            this.MilesPerHour = h0Var2;
            if (x20.d.c(h0Var, h0Var2) > 1) {
                throw new IllegalArgumentException("At most one of KilometersPerHour, MilesPerHour may be non-null");
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lgc0/x$f;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "TemperatureF", "TemperatureC", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lokio/k;)Lgc0/x$f;", "Lec0/h0;", "c", "()Lec0/h0;", "b", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends com.squareup.wire.f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ProtoAdapter<f> f68700d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(f.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
        private final ec0.h0 TemperatureF;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
        private final ec0.h0 TemperatureC;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/x$f$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/x$f;", "value", "", "c", "(Lgc0/x$f;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/x$f;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/x$f;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/x$f;)Lgc0/x$f;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<f> {
            a(com.squareup.wire.b bVar, co0.d<f> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.GuiSettings.TemperatureUnit", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f decode(com.squareup.wire.k reader) {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                long jD = reader.d();
                ec0.h0 h0VarDecode = null;
                ec0.h0 h0VarDecode2 = null;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new f(h0VarDecode, h0VarDecode2, reader.e(jD));
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
            public void encode(com.squareup.wire.l writer, f value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                protoAdapter.encodeWithTag(writer, 1, value.getTemperatureF());
                protoAdapter.encodeWithTag(writer, 2, value.getTemperatureC());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(f value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                return iD + protoAdapter.encodedSizeWithTag(1, value.getTemperatureF()) + protoAdapter.encodedSizeWithTag(2, value.getTemperatureC());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public f redact(f value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                ec0.h0 temperatureF = value.getTemperatureF();
                ec0.h0 h0VarRedact = temperatureF != null ? ec0.h0.f62622b.redact(temperatureF) : null;
                ec0.h0 temperatureC = value.getTemperatureC();
                return value.a(h0VarRedact, temperatureC != null ? ec0.h0.f62622b.redact(temperatureC) : null, okio.k.f97943e);
            }
        }

        public f() {
            this(null, null, null, 7, null);
        }

        public final f a(ec0.h0 TemperatureF, ec0.h0 TemperatureC, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new f(TemperatureF, TemperatureC, unknownFields);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ec0.h0 getTemperatureC() {
            return this.TemperatureC;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ec0.h0 getTemperatureF() {
            return this.TemperatureF;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), fVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.TemperatureF, fVar.TemperatureF) && p013kotlin.jvm.internal.s.f(this.TemperatureC, fVar.TemperatureC);
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ec0.h0 h0Var = this.TemperatureF;
            int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
            ec0.h0 h0Var2 = this.TemperatureC;
            int iHashCode3 = iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m455newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ec0.h0 h0Var = this.TemperatureF;
            if (h0Var != null) {
                arrayList.add("TemperatureF=" + h0Var);
            }
            ec0.h0 h0Var2 = this.TemperatureC;
            if (h0Var2 != null) {
                arrayList.add("TemperatureC=" + h0Var2);
            }
            return p013kotlin.collections.v.y0(arrayList, ", ", "TemperatureUnit{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ f(ec0.h0 h0Var, ec0.h0 h0Var2, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m455newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ec0.h0 h0Var, ec0.h0 h0Var2, okio.k unknownFields) {
            super(f68700d, unknownFields);
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.TemperatureF = h0Var;
            this.TemperatureC = h0Var2;
            if (x20.d.c(h0Var, h0Var2) > 1) {
                throw new IllegalArgumentException("At most one of TemperatureF, TemperatureC may be non-null");
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 gc0.x$g, still in use, count: 1, list:
      (r0v0 gc0.x$g) from 0x0032: CONSTRUCTOR 
      (wrap co0.d:0x002a: INVOKE (wrap java.lang.Class:0x0028: CONST_CLASS  A[WRAPPED] (LINE:41) gc0.x$g.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:43))
      (wrap com.squareup.wire.o:0x002e: SGET  A[WRAPPED] (LINE:47) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 gc0.x$g)
     A[MD:(co0.d<gc0.x$g>, com.squareup.wire.o, gc0.x$g):void (m), WRAPPED] (LINE:51) call: gc0.x.g.a.<init>(co0.d, com.squareup.wire.o, gc0.x$g):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lgc0/x$g;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "TirePressureUnitPsi", "TirePressureUnitBar", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g implements com.squareup.wire.p {
        TirePressureUnitPsi(0),
        TirePressureUnitBar(1);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<g> ADAPTER = new a(p013kotlin.jvm.internal.o0.b(g.class), com.squareup.wire.o.PROTO_3, new g(0));

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"gc0/x$g$a", "Lcom/squareup/wire/a;", "Lgc0/x$g;", "", "value", "f", "(I)Lgc0/x$g;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        /* JADX INFO: renamed from: gc0.x$g$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgc0/x$g$b;", "", "<init>", "()V", "", "value", "Lgc0/x$g;", "a", "(I)Lgc0/x$g;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final g a(int value) {
                if (value == 0) {
                    return g.TirePressureUnitPsi;
                }
                if (value != 1) {
                    return null;
                }
                return g.TirePressureUnitBar;
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

    public x() {
        this(false, false, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static /* synthetic */ x b(x xVar, boolean z11, boolean z12, g gVar, e eVar, f fVar, a aVar, d dVar, Instant instant, Boolean bool, Boolean bool2, g gVar2, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = xVar.gui_24_hour_time_OBSOLETE;
        }
        if ((i11 & 2) != 0) {
            z12 = xVar.show_range_units_OBSOLETE;
        }
        if ((i11 & 4) != 0) {
            gVar = xVar.gui_tirepressure_units_OBSOLETE;
        }
        if ((i11 & 8) != 0) {
            eVar = xVar.gui_distance_units;
        }
        if ((i11 & 16) != 0) {
            fVar = xVar.gui_temperature_units;
        }
        if ((i11 & 32) != 0) {
            aVar = xVar.gui_charge_rate_units;
        }
        if ((i11 & 64) != 0) {
            dVar = xVar.gui_range_display;
        }
        if ((i11 & 128) != 0) {
            instant = xVar.timestamp;
        }
        if ((i11 & 256) != 0) {
            bool = xVar.gui_24_hour_time;
        }
        if ((i11 & 512) != 0) {
            bool2 = xVar.show_range_units;
        }
        if ((i11 & 1024) != 0) {
            gVar2 = xVar.gui_tirepressure_units;
        }
        if ((i11 & 2048) != 0) {
            kVar = xVar.unknownFields();
        }
        g gVar3 = gVar2;
        okio.k kVar2 = kVar;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        d dVar2 = dVar;
        Instant instant2 = instant;
        f fVar2 = fVar;
        a aVar2 = aVar;
        return xVar.a(z11, z12, gVar, eVar, fVar2, aVar2, dVar2, instant2, bool3, bool4, gVar3, kVar2);
    }

    public final x a(boolean gui_24_hour_time_OBSOLETE, boolean show_range_units_OBSOLETE, g gui_tirepressure_units_OBSOLETE, e gui_distance_units, f gui_temperature_units, a gui_charge_rate_units, d gui_range_display, Instant timestamp, Boolean gui_24_hour_time, Boolean show_range_units, g gui_tirepressure_units, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(gui_tirepressure_units_OBSOLETE, "gui_tirepressure_units_OBSOLETE");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new x(gui_24_hour_time_OBSOLETE, show_range_units_OBSOLETE, gui_tirepressure_units_OBSOLETE, gui_distance_units, gui_temperature_units, gui_charge_rate_units, gui_range_display, timestamp, gui_24_hour_time, show_range_units, gui_tirepressure_units, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getGui_24_hour_time() {
        return this.gui_24_hour_time;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getGui_24_hour_time_OBSOLETE() {
        return this.gui_24_hour_time_OBSOLETE;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getGui_charge_rate_units() {
        return this.gui_charge_rate_units;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof x)) {
            return false;
        }
        x xVar = (x) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), xVar.unknownFields()) && this.gui_24_hour_time_OBSOLETE == xVar.gui_24_hour_time_OBSOLETE && this.show_range_units_OBSOLETE == xVar.show_range_units_OBSOLETE && this.gui_tirepressure_units_OBSOLETE == xVar.gui_tirepressure_units_OBSOLETE && p013kotlin.jvm.internal.s.f(this.gui_distance_units, xVar.gui_distance_units) && p013kotlin.jvm.internal.s.f(this.gui_temperature_units, xVar.gui_temperature_units) && p013kotlin.jvm.internal.s.f(this.gui_charge_rate_units, xVar.gui_charge_rate_units) && p013kotlin.jvm.internal.s.f(this.gui_range_display, xVar.gui_range_display) && p013kotlin.jvm.internal.s.f(this.timestamp, xVar.timestamp) && p013kotlin.jvm.internal.s.f(this.gui_24_hour_time, xVar.gui_24_hour_time) && p013kotlin.jvm.internal.s.f(this.show_range_units, xVar.show_range_units) && this.gui_tirepressure_units == xVar.gui_tirepressure_units;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e getGui_distance_units() {
        return this.gui_distance_units;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final d getGui_range_display() {
        return this.gui_range_display;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final f getGui_temperature_units() {
        return this.gui_temperature_units;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.gui_24_hour_time_OBSOLETE)) * 37) + Boolean.hashCode(this.show_range_units_OBSOLETE)) * 37) + this.gui_tirepressure_units_OBSOLETE.hashCode()) * 37;
        e eVar = this.gui_distance_units;
        int iHashCode2 = (iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 37;
        f fVar = this.gui_temperature_units;
        int iHashCode3 = (iHashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 37;
        a aVar = this.gui_charge_rate_units;
        int iHashCode4 = (iHashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 37;
        d dVar = this.gui_range_display;
        int iHashCode5 = (iHashCode4 + (dVar != null ? dVar.hashCode() : 0)) * 37;
        Instant instant = this.timestamp;
        int iHashCode6 = (iHashCode5 + (instant != null ? instant.hashCode() : 0)) * 37;
        Boolean bool = this.gui_24_hour_time;
        int iHashCode7 = (iHashCode6 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.show_range_units;
        int iHashCode8 = (iHashCode7 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        g gVar = this.gui_tirepressure_units;
        int iHashCode9 = iHashCode8 + (gVar != null ? gVar.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final g getGui_tirepressure_units() {
        return this.gui_tirepressure_units;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final g getGui_tirepressure_units_OBSOLETE() {
        return this.gui_tirepressure_units_OBSOLETE;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getShow_range_units() {
        return this.show_range_units;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getShow_range_units_OBSOLETE() {
        return this.show_range_units_OBSOLETE;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m451newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("gui_24_hour_time_OBSOLETE=" + this.gui_24_hour_time_OBSOLETE);
        arrayList.add("show_range_units_OBSOLETE=" + this.show_range_units_OBSOLETE);
        arrayList.add("gui_tirepressure_units_OBSOLETE=" + this.gui_tirepressure_units_OBSOLETE);
        e eVar = this.gui_distance_units;
        if (eVar != null) {
            arrayList.add("gui_distance_units=" + eVar);
        }
        f fVar = this.gui_temperature_units;
        if (fVar != null) {
            arrayList.add("gui_temperature_units=" + fVar);
        }
        a aVar = this.gui_charge_rate_units;
        if (aVar != null) {
            arrayList.add("gui_charge_rate_units=" + aVar);
        }
        d dVar = this.gui_range_display;
        if (dVar != null) {
            arrayList.add("gui_range_display=" + dVar);
        }
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        Boolean bool = this.gui_24_hour_time;
        if (bool != null) {
            arrayList.add("gui_24_hour_time=" + bool);
        }
        Boolean bool2 = this.show_range_units;
        if (bool2 != null) {
            arrayList.add("show_range_units=" + bool2);
        }
        g gVar = this.gui_tirepressure_units;
        if (gVar != null) {
            arrayList.add("gui_tirepressure_units=" + gVar);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "GuiSettings{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ x(boolean z11, boolean z12, g gVar, e eVar, f fVar, a aVar, d dVar, Instant instant, Boolean bool, Boolean bool2, g gVar2, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? g.TirePressureUnitPsi : gVar, (i11 & 8) != 0 ? null : eVar, (i11 & 16) != 0 ? null : fVar, (i11 & 32) != 0 ? null : aVar, (i11 & 64) != 0 ? null : dVar, (i11 & 128) != 0 ? null : instant, (i11 & 256) != 0 ? null : bool, (i11 & 512) != 0 ? null : bool2, (i11 & 1024) != 0 ? null : gVar2, (i11 & 2048) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m451newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z11, boolean z12, g gui_tirepressure_units_OBSOLETE, e eVar, f fVar, a aVar, d dVar, Instant instant, Boolean bool, Boolean bool2, g gVar, okio.k unknownFields) {
        super(f68673m, unknownFields);
        p013kotlin.jvm.internal.s.k(gui_tirepressure_units_OBSOLETE, "gui_tirepressure_units_OBSOLETE");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.gui_24_hour_time_OBSOLETE = z11;
        this.show_range_units_OBSOLETE = z12;
        this.gui_tirepressure_units_OBSOLETE = gui_tirepressure_units_OBSOLETE;
        this.gui_distance_units = eVar;
        this.gui_temperature_units = fVar;
        this.gui_charge_rate_units = aVar;
        this.gui_range_display = dVar;
        this.timestamp = instant;
        this.gui_24_hour_time = bool;
        this.show_range_units = bool2;
        this.gui_tirepressure_units = gVar;
    }
}
