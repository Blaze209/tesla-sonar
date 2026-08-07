package xc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import expo.modules.contacts.Columns;
import fc0.u5;
import java.util.ArrayList;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001e\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0087\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u008d\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b)\u00104R\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b-\u0010\"R\u001a\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010*\u001a\u0004\b2\u0010,R\u001a\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b7\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00108\u001a\u0004\b6\u00109R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010:\u001a\u0004\b5\u0010;¨\u0006<"}, d2 = {"Lxc0/a;", "Lcom/squareup/wire/f;", "", "", "vehicle_id", "snapshot_hash", "", "is_predelivery", Columns.DISPLAY_NAME, "Lfc0/u5;", "vehicle_data", "Lxc0/b;", "ble_status", "connectionState", "hide_private", "vin", "Lxc0/d;", "precise_location", "Lxc0/c;", "imprecise_location", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lfc0/u5;Lxc0/b;Ljava/lang/String;ZLjava/lang/String;Lxc0/d;Lxc0/c;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lfc0/u5;Lxc0/b;Ljava/lang/String;ZLjava/lang/String;Lxc0/d;Lxc0/c;Lokio/k;)Lxc0/a;", "Ljava/lang/String;", "k", "b", IntegerTokenConverter.CONVERTER_KEY, "c", "Z", "m", "()Z", DateTokenConverter.CONVERTER_KEY, "e", "Lfc0/u5;", "j", "()Lfc0/u5;", "f", "Lxc0/b;", "()Lxc0/b;", "g", "h", "l", "Lxc0/d;", "()Lxc0/d;", "Lxc0/c;", "()Lxc0/c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ProtoAdapter<a> f123224m = new C2670a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(a.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "vehicleId", label = q.a.OMIT_IDENTITY, tag = 1)
    private final String vehicle_id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "snapshotHash", label = q.a.OMIT_IDENTITY, tag = 2)
    private final String snapshot_hash;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPredelivery", label = q.a.OMIT_IDENTITY, tag = 3)
    private final boolean is_predelivery;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayName", label = q.a.OMIT_IDENTITY, tag = 4)
    private final String display_name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.carserver.server.VehicleData#ADAPTER", jsonName = "vehicleData", label = q.a.OMIT_IDENTITY, tag = 5)
    private final u5 vehicle_data;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.widget.BleStatus#ADAPTER", jsonName = "bleStatus", label = q.a.OMIT_IDENTITY, tag = 6)
    private final b ble_status;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 7)
    private final String connectionState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hidePrivate", label = q.a.OMIT_IDENTITY, tag = 8)
    private final boolean hide_private;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 9)
    private final String vin;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.widget.PreciseLocation#ADAPTER", jsonName = "preciseLocation", label = q.a.OMIT_IDENTITY, tag = 10)
    private final d precise_location;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.widget.ImpreciseLocation#ADAPTER", jsonName = "impreciseLocation", label = q.a.OMIT_IDENTITY, tag = 11)
    private final c imprecise_location;

    /* JADX INFO: renamed from: xc0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"xc0/a$a", "Lcom/squareup/wire/ProtoAdapter;", "Lxc0/a;", "value", "", "c", "(Lxc0/a;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lxc0/a;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lxc0/a;", DateTokenConverter.CONVERTER_KEY, "(Lxc0/a;)Lxc0/a;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2670a extends ProtoAdapter<a> {
        C2670a(com.squareup.wire.b bVar, co0.d<a> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.AppVehicle", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a decode(k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            String strDecode = "";
            String strDecode2 = "";
            String strDecode3 = strDecode2;
            boolean zBooleanValue = false;
            boolean zBooleanValue2 = false;
            u5 u5VarDecode = null;
            b bVarDecode = null;
            d dVarDecode = null;
            c cVarDecode = null;
            String strDecode4 = strDecode3;
            String strDecode5 = strDecode4;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new a(strDecode, strDecode4, zBooleanValue, strDecode5, u5VarDecode, bVarDecode, strDecode2, zBooleanValue2, strDecode3, dVarDecode, cVarDecode, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        strDecode = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 2:
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 3:
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 4:
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 5:
                        u5VarDecode = u5.F.decode(reader);
                        break;
                    case 6:
                        bVarDecode = b.f123237f.decode(reader);
                        break;
                    case 7:
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 8:
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 9:
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 10:
                        dVarDecode = d.f123249u.decode(reader);
                        break;
                    case 11:
                        cVarDecode = c.f123243f.decode(reader);
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, a value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (!s.f(value.getVehicle_id(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getVehicle_id());
            }
            if (!s.f(value.getSnapshot_hash(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getSnapshot_hash());
            }
            if (value.getIs_predelivery()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.getIs_predelivery()));
            }
            if (!s.f(value.getDisplay_name(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getDisplay_name());
            }
            if (value.getVehicle_data() != null) {
                u5.F.encodeWithTag(writer, 5, value.getVehicle_data());
            }
            if (value.getBle_status() != null) {
                b.f123237f.encodeWithTag(writer, 6, value.getBle_status());
            }
            if (!s.f(value.getConnectionState(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 7, value.getConnectionState());
            }
            if (value.getHide_private()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, Boolean.valueOf(value.getHide_private()));
            }
            if (!s.f(value.getVin(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 9, value.getVin());
            }
            if (value.getPrecise_location() != null) {
                d.f123249u.encodeWithTag(writer, 10, value.getPrecise_location());
            }
            if (value.getImprecise_location() != null) {
                c.f123243f.encodeWithTag(writer, 11, value.getImprecise_location());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(a value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!s.f(value.getVehicle_id(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getVehicle_id());
            }
            if (!s.f(value.getSnapshot_hash(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSnapshot_hash());
            }
            if (value.getIs_predelivery()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_predelivery()));
            }
            if (!s.f(value.getDisplay_name(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDisplay_name());
            }
            if (value.getVehicle_data() != null) {
                iD += u5.F.encodedSizeWithTag(5, value.getVehicle_data());
            }
            if (value.getBle_status() != null) {
                iD += b.f123237f.encodedSizeWithTag(6, value.getBle_status());
            }
            if (!s.f(value.getConnectionState(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getConnectionState());
            }
            if (value.getHide_private()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getHide_private()));
            }
            if (!s.f(value.getVin(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getVin());
            }
            if (value.getPrecise_location() != null) {
                iD += d.f123249u.encodedSizeWithTag(10, value.getPrecise_location());
            }
            return value.getImprecise_location() != null ? iD + c.f123243f.encodedSizeWithTag(11, value.getImprecise_location()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a redact(a value) {
            s.k(value, "value");
            u5 vehicle_data = value.getVehicle_data();
            u5 u5VarRedact = vehicle_data != null ? u5.F.redact(vehicle_data) : null;
            b ble_status = value.getBle_status();
            b bVarRedact = ble_status != null ? b.f123237f.redact(ble_status) : null;
            d precise_location = value.getPrecise_location();
            d dVarRedact = precise_location != null ? d.f123249u.redact(precise_location) : null;
            c imprecise_location = value.getImprecise_location();
            return a.b(value, null, null, false, null, u5VarRedact, bVarRedact, null, false, null, dVarRedact, imprecise_location != null ? c.f123243f.redact(imprecise_location) : null, okio.k.f97943e, 463, null);
        }
    }

    public a() {
        this(null, null, false, null, null, null, null, false, null, null, null, null, 4095, null);
    }

    public static /* synthetic */ a b(a aVar, String str, String str2, boolean z11, String str3, u5 u5Var, b bVar, String str4, boolean z12, String str5, d dVar, c cVar, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aVar.vehicle_id;
        }
        if ((i11 & 2) != 0) {
            str2 = aVar.snapshot_hash;
        }
        if ((i11 & 4) != 0) {
            z11 = aVar.is_predelivery;
        }
        if ((i11 & 8) != 0) {
            str3 = aVar.display_name;
        }
        if ((i11 & 16) != 0) {
            u5Var = aVar.vehicle_data;
        }
        if ((i11 & 32) != 0) {
            bVar = aVar.ble_status;
        }
        if ((i11 & 64) != 0) {
            str4 = aVar.connectionState;
        }
        if ((i11 & 128) != 0) {
            z12 = aVar.hide_private;
        }
        if ((i11 & 256) != 0) {
            str5 = aVar.vin;
        }
        if ((i11 & 512) != 0) {
            dVar = aVar.precise_location;
        }
        if ((i11 & 1024) != 0) {
            cVar = aVar.imprecise_location;
        }
        if ((i11 & 2048) != 0) {
            kVar = aVar.unknownFields();
        }
        c cVar2 = cVar;
        okio.k kVar2 = kVar;
        String str6 = str5;
        d dVar2 = dVar;
        String str7 = str4;
        boolean z13 = z12;
        u5 u5Var2 = u5Var;
        b bVar2 = bVar;
        return aVar.a(str, str2, z11, str3, u5Var2, bVar2, str7, z13, str6, dVar2, cVar2, kVar2);
    }

    public final a a(String vehicle_id, String snapshot_hash, boolean is_predelivery, String display_name, u5 vehicle_data, b ble_status, String connectionState, boolean hide_private, String vin, d precise_location, c imprecise_location, okio.k unknownFields) {
        s.k(vehicle_id, "vehicle_id");
        s.k(snapshot_hash, "snapshot_hash");
        s.k(display_name, "display_name");
        s.k(connectionState, "connectionState");
        s.k(vin, "vin");
        s.k(unknownFields, "unknownFields");
        return new a(vehicle_id, snapshot_hash, is_predelivery, display_name, vehicle_data, ble_status, connectionState, hide_private, vin, precise_location, imprecise_location, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getBle_status() {
        return this.ble_status;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getConnectionState() {
        return this.connectionState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDisplay_name() {
        return this.display_name;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return s.f(unknownFields(), aVar.unknownFields()) && s.f(this.vehicle_id, aVar.vehicle_id) && s.f(this.snapshot_hash, aVar.snapshot_hash) && this.is_predelivery == aVar.is_predelivery && s.f(this.display_name, aVar.display_name) && s.f(this.vehicle_data, aVar.vehicle_data) && s.f(this.ble_status, aVar.ble_status) && s.f(this.connectionState, aVar.connectionState) && this.hide_private == aVar.hide_private && s.f(this.vin, aVar.vin) && s.f(this.precise_location, aVar.precise_location) && s.f(this.imprecise_location, aVar.imprecise_location);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getHide_private() {
        return this.hide_private;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final c getImprecise_location() {
        return this.imprecise_location;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final d getPrecise_location() {
        return this.precise_location;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.vehicle_id.hashCode()) * 37) + this.snapshot_hash.hashCode()) * 37) + Boolean.hashCode(this.is_predelivery)) * 37) + this.display_name.hashCode()) * 37;
        u5 u5Var = this.vehicle_data;
        int iHashCode2 = (iHashCode + (u5Var != null ? u5Var.hashCode() : 0)) * 37;
        b bVar = this.ble_status;
        int iHashCode3 = (((((((iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 37) + this.connectionState.hashCode()) * 37) + Boolean.hashCode(this.hide_private)) * 37) + this.vin.hashCode()) * 37;
        d dVar = this.precise_location;
        int iHashCode4 = (iHashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 37;
        c cVar = this.imprecise_location;
        int iHashCode5 = iHashCode4 + (cVar != null ? cVar.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSnapshot_hash() {
        return this.snapshot_hash;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final u5 getVehicle_data() {
        return this.vehicle_data;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getVehicle_id() {
        return this.vehicle_id;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getVin() {
        return this.vin;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIs_predelivery() {
        return this.is_predelivery;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m856newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("vehicle_id=" + x20.d.i(this.vehicle_id));
        arrayList.add("snapshot_hash=" + x20.d.i(this.snapshot_hash));
        arrayList.add("is_predelivery=" + this.is_predelivery);
        arrayList.add("display_name=" + x20.d.i(this.display_name));
        u5 u5Var = this.vehicle_data;
        if (u5Var != null) {
            arrayList.add("vehicle_data=" + u5Var);
        }
        b bVar = this.ble_status;
        if (bVar != null) {
            arrayList.add("ble_status=" + bVar);
        }
        arrayList.add("connectionState=" + x20.d.i(this.connectionState));
        arrayList.add("hide_private=" + this.hide_private);
        arrayList.add("vin=" + x20.d.i(this.vin));
        d dVar = this.precise_location;
        if (dVar != null) {
            arrayList.add("precise_location=" + dVar);
        }
        c cVar = this.imprecise_location;
        if (cVar != null) {
            arrayList.add("imprecise_location=" + cVar);
        }
        return v.y0(arrayList, ", ", "AppVehicle{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ a(String str, String str2, boolean z11, String str3, u5 u5Var, b bVar, String str4, boolean z12, String str5, d dVar, c cVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? null : u5Var, (i11 & 32) != 0 ? null : bVar, (i11 & 64) != 0 ? "" : str4, (i11 & 128) == 0 ? z12 : false, (i11 & 256) == 0 ? str5 : "", (i11 & 512) != 0 ? null : dVar, (i11 & 1024) == 0 ? cVar : null, (i11 & 2048) != 0 ? okio.k.f97943e : kVar);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m856newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String vehicle_id, String snapshot_hash, boolean z11, String display_name, u5 u5Var, b bVar, String connectionState, boolean z12, String vin, d dVar, c cVar, okio.k unknownFields) {
        super(f123224m, unknownFields);
        s.k(vehicle_id, "vehicle_id");
        s.k(snapshot_hash, "snapshot_hash");
        s.k(display_name, "display_name");
        s.k(connectionState, "connectionState");
        s.k(vin, "vin");
        s.k(unknownFields, "unknownFields");
        this.vehicle_id = vehicle_id;
        this.snapshot_hash = snapshot_hash;
        this.is_predelivery = z11;
        this.display_name = display_name;
        this.vehicle_data = u5Var;
        this.ble_status = bVar;
        this.connectionState = connectionState;
        this.hide_private = z12;
        this.vin = vin;
        this.precise_location = dVar;
        this.imprecise_location = cVar;
    }
}
