package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001e\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'Bm\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!Js\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b+\u00105R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u00106\u001a\u0004\b/\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b3\u00109R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b7\u00105¨\u0006="}, d2 = {"Lvc0/f;", "Lcom/squareup/wire/f;", "", "Lokio/k;", "hardware_model_sha256", "Lvc0/k;", "os", "Lvc0/b3;", "UWBAvailable", "Lvc0/k2;", "phoneVersion", "", "batchedNISessionsSupported", "", "batteryLevelPercent", "Lvc0/v;", "batteryState", "Lvc0/j2;", "thermalState", "lowPowerMode", "unknownFields", "<init>", "(Lokio/k;Lvc0/k;Lvc0/b3;Lvc0/k2;ZILvc0/v;Lvc0/j2;ZLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;Lvc0/k;Lvc0/b3;Lvc0/k2;ZILvc0/v;Lvc0/j2;ZLokio/k;)Lvc0/f;", "Lokio/k;", "f", "()Lokio/k;", "b", "Lvc0/k;", "h", "()Lvc0/k;", "c", "Lvc0/b3;", "k", "()Lvc0/b3;", DateTokenConverter.CONVERTER_KEY, "Lvc0/k2;", IntegerTokenConverter.CONVERTER_KEY, "()Lvc0/k2;", "e", "Z", "()Z", "I", "g", "Lvc0/v;", "()Lvc0/v;", "Lvc0/j2;", "j", "()Lvc0/j2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends com.squareup.wire.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ProtoAdapter<f> f118679k = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(f.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "hardwareModelSha256", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final okio.k hardware_model_sha256;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AppOperatingSystem#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final k os;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.UWBAvailability#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final b3 UWBAvailable;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PhoneVersionInfo#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final k2 phoneVersion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final boolean batchedNISessionsSupported;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final int batteryLevelPercent;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.BatteryState_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final v batteryState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PhoneThermalState_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final j2 thermalState;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 9)
    private final boolean lowPowerMode;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/f$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/f;", "value", "", "c", "(Lvc0/f;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/f;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/f;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/f;)Lvc0/f;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<f> {
        a(com.squareup.wire.b bVar, co0.d<f> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.AppDeviceInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            okio.k kVarDecode = okio.k.f97943e;
            k kVar = k.UNKNOWN;
            b3 b3Var = b3.UWB_AVAILABILITY_UNKNOWN;
            v vVar = v.BATTERY_STATE_UNKNOWN;
            j2 j2Var = j2.PHONE_THERMAL_STATE_UNKNOWN;
            long jD = reader.d();
            boolean zBooleanValue = false;
            int iIntValue = 0;
            boolean zBooleanValue2 = false;
            k2 k2VarDecode = null;
            j2 j2VarDecode = j2Var;
            v vVarDecode = vVar;
            b3 b3VarDecode = b3Var;
            k kVarDecode2 = kVar;
            while (true) {
                okio.k kVar2 = kVarDecode;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new f(kVar2, kVarDecode2, b3VarDecode, k2VarDecode, zBooleanValue, iIntValue, vVarDecode, j2VarDecode, zBooleanValue2, reader.e(jD));
                    }
                    switch (iG) {
                        case 1:
                            break;
                        case 2:
                            try {
                                kVarDecode2 = k.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            }
                            break;
                        case 3:
                            try {
                                b3VarDecode = b3.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                            }
                            break;
                        case 4:
                            k2VarDecode = k2.f118795h.decode(reader);
                            break;
                        case 5:
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 6:
                            iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                            break;
                        case 7:
                            try {
                                vVarDecode = v.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e13.value));
                            }
                            break;
                        case 8:
                            try {
                                j2VarDecode = j2.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e14) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e14.value));
                            }
                            break;
                        case 9:
                            zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        default:
                            reader.m(iG);
                            break;
                    }
                }
                kVarDecode = ProtoAdapter.BYTES.decode(reader);
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, f value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (!p013kotlin.jvm.internal.s.f(value.getHardware_model_sha256(), okio.k.f97943e)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getHardware_model_sha256());
            }
            if (value.getOs() != k.UNKNOWN) {
                k.ADAPTER.encodeWithTag(writer, 2, value.getOs());
            }
            if (value.getUWBAvailable() != b3.UWB_AVAILABILITY_UNKNOWN) {
                b3.ADAPTER.encodeWithTag(writer, 3, value.getUWBAvailable());
            }
            if (value.getPhoneVersion() != null) {
                k2.f118795h.encodeWithTag(writer, 4, value.getPhoneVersion());
            }
            if (value.getBatchedNISessionsSupported()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.getBatchedNISessionsSupported()));
            }
            if (value.getBatteryLevelPercent() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 6, Integer.valueOf(value.getBatteryLevelPercent()));
            }
            if (value.getBatteryState() != v.BATTERY_STATE_UNKNOWN) {
                v.ADAPTER.encodeWithTag(writer, 7, value.getBatteryState());
            }
            if (value.getThermalState() != j2.PHONE_THERMAL_STATE_UNKNOWN) {
                j2.ADAPTER.encodeWithTag(writer, 8, value.getThermalState());
            }
            if (value.getLowPowerMode()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 9, Boolean.valueOf(value.getLowPowerMode()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(f value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!p013kotlin.jvm.internal.s.f(value.getHardware_model_sha256(), okio.k.f97943e)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getHardware_model_sha256());
            }
            if (value.getOs() != k.UNKNOWN) {
                iD += k.ADAPTER.encodedSizeWithTag(2, value.getOs());
            }
            if (value.getUWBAvailable() != b3.UWB_AVAILABILITY_UNKNOWN) {
                iD += b3.ADAPTER.encodedSizeWithTag(3, value.getUWBAvailable());
            }
            if (value.getPhoneVersion() != null) {
                iD += k2.f118795h.encodedSizeWithTag(4, value.getPhoneVersion());
            }
            if (value.getBatchedNISessionsSupported()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getBatchedNISessionsSupported()));
            }
            if (value.getBatteryLevelPercent() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(6, Integer.valueOf(value.getBatteryLevelPercent()));
            }
            if (value.getBatteryState() != v.BATTERY_STATE_UNKNOWN) {
                iD += v.ADAPTER.encodedSizeWithTag(7, value.getBatteryState());
            }
            if (value.getThermalState() != j2.PHONE_THERMAL_STATE_UNKNOWN) {
                iD += j2.ADAPTER.encodedSizeWithTag(8, value.getThermalState());
            }
            return value.getLowPowerMode() ? iD + ProtoAdapter.BOOL.encodedSizeWithTag(9, Boolean.valueOf(value.getLowPowerMode())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public f redact(f value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            k2 phoneVersion = value.getPhoneVersion();
            return f.b(value, null, null, null, phoneVersion != null ? k2.f118795h.redact(phoneVersion) : null, false, 0, null, null, false, okio.k.f97943e, 503, null);
        }
    }

    public f() {
        this(null, null, null, null, false, 0, null, null, false, null, 1023, null);
    }

    public static /* synthetic */ f b(f fVar, okio.k kVar, k kVar2, b3 b3Var, k2 k2Var, boolean z11, int i11, v vVar, j2 j2Var, boolean z12, okio.k kVar3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            kVar = fVar.hardware_model_sha256;
        }
        if ((i12 & 2) != 0) {
            kVar2 = fVar.os;
        }
        if ((i12 & 4) != 0) {
            b3Var = fVar.UWBAvailable;
        }
        if ((i12 & 8) != 0) {
            k2Var = fVar.phoneVersion;
        }
        if ((i12 & 16) != 0) {
            z11 = fVar.batchedNISessionsSupported;
        }
        if ((i12 & 32) != 0) {
            i11 = fVar.batteryLevelPercent;
        }
        if ((i12 & 64) != 0) {
            vVar = fVar.batteryState;
        }
        if ((i12 & 128) != 0) {
            j2Var = fVar.thermalState;
        }
        if ((i12 & 256) != 0) {
            z12 = fVar.lowPowerMode;
        }
        if ((i12 & 512) != 0) {
            kVar3 = fVar.unknownFields();
        }
        boolean z13 = z12;
        okio.k kVar4 = kVar3;
        v vVar2 = vVar;
        j2 j2Var2 = j2Var;
        boolean z14 = z11;
        int i13 = i11;
        return fVar.a(kVar, kVar2, b3Var, k2Var, z14, i13, vVar2, j2Var2, z13, kVar4);
    }

    public final f a(okio.k hardware_model_sha256, k os2, b3 UWBAvailable, k2 phoneVersion, boolean batchedNISessionsSupported, int batteryLevelPercent, v batteryState, j2 thermalState, boolean lowPowerMode, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(hardware_model_sha256, "hardware_model_sha256");
        p013kotlin.jvm.internal.s.k(os2, "os");
        p013kotlin.jvm.internal.s.k(UWBAvailable, "UWBAvailable");
        p013kotlin.jvm.internal.s.k(batteryState, "batteryState");
        p013kotlin.jvm.internal.s.k(thermalState, "thermalState");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new f(hardware_model_sha256, os2, UWBAvailable, phoneVersion, batchedNISessionsSupported, batteryLevelPercent, batteryState, thermalState, lowPowerMode, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getBatchedNISessionsSupported() {
        return this.batchedNISessionsSupported;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getBatteryLevelPercent() {
        return this.batteryLevelPercent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final v getBatteryState() {
        return this.batteryState;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), fVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.hardware_model_sha256, fVar.hardware_model_sha256) && this.os == fVar.os && this.UWBAvailable == fVar.UWBAvailable && p013kotlin.jvm.internal.s.f(this.phoneVersion, fVar.phoneVersion) && this.batchedNISessionsSupported == fVar.batchedNISessionsSupported && this.batteryLevelPercent == fVar.batteryLevelPercent && this.batteryState == fVar.batteryState && this.thermalState == fVar.thermalState && this.lowPowerMode == fVar.lowPowerMode;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final okio.k getHardware_model_sha256() {
        return this.hardware_model_sha256;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getLowPowerMode() {
        return this.lowPowerMode;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final k getOs() {
        return this.os;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.hardware_model_sha256.hashCode()) * 37) + this.os.hashCode()) * 37) + this.UWBAvailable.hashCode()) * 37;
        k2 k2Var = this.phoneVersion;
        int iHashCode2 = ((((((((((iHashCode + (k2Var != null ? k2Var.hashCode() : 0)) * 37) + Boolean.hashCode(this.batchedNISessionsSupported)) * 37) + Integer.hashCode(this.batteryLevelPercent)) * 37) + this.batteryState.hashCode()) * 37) + this.thermalState.hashCode()) * 37) + Boolean.hashCode(this.lowPowerMode);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final k2 getPhoneVersion() {
        return this.phoneVersion;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final j2 getThermalState() {
        return this.thermalState;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final b3 getUWBAvailable() {
        return this.UWBAvailable;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m798newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("hardware_model_sha256=" + this.hardware_model_sha256);
        arrayList.add("os=" + this.os);
        arrayList.add("UWBAvailable=" + this.UWBAvailable);
        k2 k2Var = this.phoneVersion;
        if (k2Var != null) {
            arrayList.add("phoneVersion=" + k2Var);
        }
        arrayList.add("batchedNISessionsSupported=" + this.batchedNISessionsSupported);
        arrayList.add("batteryLevelPercent=" + this.batteryLevelPercent);
        arrayList.add("batteryState=" + this.batteryState);
        arrayList.add("thermalState=" + this.thermalState);
        arrayList.add("lowPowerMode=" + this.lowPowerMode);
        return p013kotlin.collections.v.y0(arrayList, ", ", "AppDeviceInfo{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ f(okio.k kVar, k kVar2, b3 b3Var, k2 k2Var, boolean z11, int i11, v vVar, j2 j2Var, boolean z12, okio.k kVar3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? okio.k.f97943e : kVar, (i12 & 2) != 0 ? k.UNKNOWN : kVar2, (i12 & 4) != 0 ? b3.UWB_AVAILABILITY_UNKNOWN : b3Var, (i12 & 8) != 0 ? null : k2Var, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? 0 : i11, (i12 & 64) != 0 ? v.BATTERY_STATE_UNKNOWN : vVar, (i12 & 128) != 0 ? j2.PHONE_THERMAL_STATE_UNKNOWN : j2Var, (i12 & 256) != 0 ? false : z12, (i12 & 512) != 0 ? okio.k.f97943e : kVar3);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m798newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(okio.k hardware_model_sha256, k os2, b3 UWBAvailable, k2 k2Var, boolean z11, int i11, v batteryState, j2 thermalState, boolean z12, okio.k unknownFields) {
        super(f118679k, unknownFields);
        p013kotlin.jvm.internal.s.k(hardware_model_sha256, "hardware_model_sha256");
        p013kotlin.jvm.internal.s.k(os2, "os");
        p013kotlin.jvm.internal.s.k(UWBAvailable, "UWBAvailable");
        p013kotlin.jvm.internal.s.k(batteryState, "batteryState");
        p013kotlin.jvm.internal.s.k(thermalState, "thermalState");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.hardware_model_sha256 = hardware_model_sha256;
        this.os = os2;
        this.UWBAvailable = UWBAvailable;
        this.phoneVersion = k2Var;
        this.batchedNISessionsSupported = z11;
        this.batteryLevelPercent = i11;
        this.batteryState = batteryState;
        this.thermalState = thermalState;
        this.lowPowerMode = z12;
    }
}
