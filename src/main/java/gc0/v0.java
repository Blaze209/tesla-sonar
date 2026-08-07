package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.squareup.wire.ProtoAdapter;
import j$.time.Instant;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#Bw\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ}\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b&\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b*\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b)\u0010\u001d¨\u0006,"}, d2 = {"Lgc0/v0;", "Lcom/squareup/wire/f;", "", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "vehicle_name", "car_version", "detailed_version", "autopilot_hash", "fsd_software_version", "current_profile_name", "china_autopilot_software_version", "Lokio/k;", "unknownFields", "<init>", "(Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/k;)Lgc0/v0;", "Lj$/time/Instant;", IntegerTokenConverter.CONVERTER_KEY, "()Lj$/time/Instant;", "b", "Ljava/lang/String;", "j", "c", DateTokenConverter.CONVERTER_KEY, "g", "e", "f", "h", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ProtoAdapter<v0> f68653j = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(v0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final Instant timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "vehicleName", tag = 2)
    private final String vehicle_name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "carVersion", tag = 3)
    private final String car_version;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "detailedVersion", tag = 4)
    private final String detailed_version;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "autopilotHash", tag = 5)
    private final String autopilot_hash;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fsdSoftwareVersion", tag = 6)
    private final String fsd_software_version;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currentProfileName", tag = 7)
    private final String current_profile_name;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "chinaAutopilotSoftwareVersion", tag = 8)
    private final String china_autopilot_software_version;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/v0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/v0;", "value", "", "c", "(Lgc0/v0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/v0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/v0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/v0;)Lgc0/v0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<v0> {
        a(com.squareup.wire.b bVar, co0.d<v0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleDetailState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public v0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            Instant instantDecode = null;
            String strDecode = null;
            String strDecode2 = null;
            String strDecode3 = null;
            String strDecode4 = null;
            String strDecode5 = null;
            String strDecode6 = null;
            String strDecode7 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new v0(instantDecode, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 2:
                        strDecode = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 3:
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 4:
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 5:
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 6:
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 7:
                        strDecode6 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 8:
                        strDecode7 = ProtoAdapter.STRING.decode(reader);
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, v0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 1, value.getTimestamp());
            }
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(writer, 2, value.getVehicle_name());
            protoAdapter.encodeWithTag(writer, 3, value.getCar_version());
            protoAdapter.encodeWithTag(writer, 4, value.getDetailed_version());
            protoAdapter.encodeWithTag(writer, 5, value.getAutopilot_hash());
            protoAdapter.encodeWithTag(writer, 6, value.getFsd_software_version());
            protoAdapter.encodeWithTag(writer, 7, value.getCurrent_profile_name());
            protoAdapter.encodeWithTag(writer, 8, value.getChina_autopilot_software_version());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(v0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(1, value.getTimestamp());
            }
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iD + protoAdapter.encodedSizeWithTag(2, value.getVehicle_name()) + protoAdapter.encodedSizeWithTag(3, value.getCar_version()) + protoAdapter.encodedSizeWithTag(4, value.getDetailed_version()) + protoAdapter.encodedSizeWithTag(5, value.getAutopilot_hash()) + protoAdapter.encodedSizeWithTag(6, value.getFsd_software_version()) + protoAdapter.encodedSizeWithTag(7, value.getCurrent_profile_name()) + protoAdapter.encodedSizeWithTag(8, value.getChina_autopilot_software_version());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public v0 redact(v0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            Instant timestamp = value.getTimestamp();
            return v0.b(value, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, null, null, null, null, null, okio.k.f97943e, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        }
    }

    public v0() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ v0 b(v0 v0Var, Instant instant, String str, String str2, String str3, String str4, String str5, String str6, String str7, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            instant = v0Var.timestamp;
        }
        if ((i11 & 2) != 0) {
            str = v0Var.vehicle_name;
        }
        if ((i11 & 4) != 0) {
            str2 = v0Var.car_version;
        }
        if ((i11 & 8) != 0) {
            str3 = v0Var.detailed_version;
        }
        if ((i11 & 16) != 0) {
            str4 = v0Var.autopilot_hash;
        }
        if ((i11 & 32) != 0) {
            str5 = v0Var.fsd_software_version;
        }
        if ((i11 & 64) != 0) {
            str6 = v0Var.current_profile_name;
        }
        if ((i11 & 128) != 0) {
            str7 = v0Var.china_autopilot_software_version;
        }
        if ((i11 & 256) != 0) {
            kVar = v0Var.unknownFields();
        }
        String str8 = str7;
        okio.k kVar2 = kVar;
        String str9 = str5;
        String str10 = str6;
        String str11 = str4;
        String str12 = str2;
        return v0Var.a(instant, str, str12, str3, str11, str9, str10, str8, kVar2);
    }

    public final v0 a(Instant timestamp, String vehicle_name, String car_version, String detailed_version, String autopilot_hash, String fsd_software_version, String current_profile_name, String china_autopilot_software_version, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new v0(timestamp, vehicle_name, car_version, detailed_version, autopilot_hash, fsd_software_version, current_profile_name, china_autopilot_software_version, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAutopilot_hash() {
        return this.autopilot_hash;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCar_version() {
        return this.car_version;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getChina_autopilot_software_version() {
        return this.china_autopilot_software_version;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), v0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.timestamp, v0Var.timestamp) && p013kotlin.jvm.internal.s.f(this.vehicle_name, v0Var.vehicle_name) && p013kotlin.jvm.internal.s.f(this.car_version, v0Var.car_version) && p013kotlin.jvm.internal.s.f(this.detailed_version, v0Var.detailed_version) && p013kotlin.jvm.internal.s.f(this.autopilot_hash, v0Var.autopilot_hash) && p013kotlin.jvm.internal.s.f(this.fsd_software_version, v0Var.fsd_software_version) && p013kotlin.jvm.internal.s.f(this.current_profile_name, v0Var.current_profile_name) && p013kotlin.jvm.internal.s.f(this.china_autopilot_software_version, v0Var.china_autopilot_software_version);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCurrent_profile_name() {
        return this.current_profile_name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDetailed_version() {
        return this.detailed_version;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getFsd_software_version() {
        return this.fsd_software_version;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        String str = this.vehicle_name;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.car_version;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.detailed_version;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.autopilot_hash;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.fsd_software_version;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.current_profile_name;
        int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.china_autopilot_software_version;
        int iHashCode9 = iHashCode8 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getVehicle_name() {
        return this.vehicle_name;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m448newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        String str = this.vehicle_name;
        if (str != null) {
            arrayList.add("vehicle_name=" + x20.d.i(str));
        }
        String str2 = this.car_version;
        if (str2 != null) {
            arrayList.add("car_version=" + x20.d.i(str2));
        }
        String str3 = this.detailed_version;
        if (str3 != null) {
            arrayList.add("detailed_version=" + x20.d.i(str3));
        }
        String str4 = this.autopilot_hash;
        if (str4 != null) {
            arrayList.add("autopilot_hash=" + x20.d.i(str4));
        }
        String str5 = this.fsd_software_version;
        if (str5 != null) {
            arrayList.add("fsd_software_version=" + x20.d.i(str5));
        }
        String str6 = this.current_profile_name;
        if (str6 != null) {
            arrayList.add("current_profile_name=" + x20.d.i(str6));
        }
        String str7 = this.china_autopilot_software_version;
        if (str7 != null) {
            arrayList.add("china_autopilot_software_version=" + x20.d.i(str7));
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "VehicleDetailState{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ v0(Instant instant, String str, String str2, String str3, String str4, String str5, String str6, String str7, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : instant, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m448newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Instant instant, String str, String str2, String str3, String str4, String str5, String str6, String str7, okio.k unknownFields) {
        super(f68653j, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.timestamp = instant;
        this.vehicle_name = str;
        this.car_version = str2;
        this.detailed_version = str3;
        this.autopilot_hash = str4;
        this.fsd_software_version = str5;
        this.current_profile_name = str6;
        this.china_autopilot_software_version = str7;
    }
}
