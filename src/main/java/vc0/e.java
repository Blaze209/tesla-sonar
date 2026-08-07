package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BS\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b%\u0010)R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010+\u001a\u0004\b*\u0010,¨\u0006-"}, d2 = {"Lvc0/e;", "Lcom/squareup/wire/f;", "", "", "timeSinceAlertSet_ms", "Lvc0/d1;", "handlePulled", "connectionCount", "", "unknownDevicePresent", "authRequested", "", "Lvc0/c1;", "deviceSpecificPayload", "Lokio/k;", "unknownFields", "<init>", "(ILvc0/d1;IZZLjava/util/List;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ILvc0/d1;IZZLjava/util/List;Lokio/k;)Lvc0/e;", "I", "g", "b", "Lvc0/d1;", "f", "()Lvc0/d1;", "c", DateTokenConverter.CONVERTER_KEY, "Z", "h", "()Z", "e", "Ljava/util/List;", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends com.squareup.wire.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ProtoAdapter<e> f118629h = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(e.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "timeSinceAlertSetMs", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final int timeSinceAlertSet_ms;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.HandlePulled_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final d1 handlePulled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final int connectionCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final boolean unknownDevicePresent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final boolean authRequested;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.HandlePulledWithoutAuthDeviceSpecificPayload#ADAPTER", label = com.squareup.wire.q.a.REPEATED, tag = 6)
    private final List<c1> deviceSpecificPayload;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/e$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/e;", "value", "", "c", "(Lvc0/e;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/e;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/e;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/e;)Lvc0/e;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<e> {
        a(com.squareup.wire.b bVar, co0.d<e> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.AlertHandlePulledWithoutAuth", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            d1 d1VarDecode = d1.HANDLE_PULLED_FRONT_DRIVER_DOOR;
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            int iIntValue = 0;
            int iIntValue2 = 0;
            boolean zBooleanValue = false;
            boolean zBooleanValue2 = false;
            while (true) {
                d1 d1Var = d1VarDecode;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new e(iIntValue, d1Var, iIntValue2, zBooleanValue, zBooleanValue2, arrayList, reader.e(jD));
                    }
                    switch (iG) {
                        case 1:
                            iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                            break;
                        case 2:
                            try {
                                d1VarDecode = d1.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            }
                            break;
                        case 3:
                            iIntValue2 = ProtoAdapter.UINT32.decode(reader).intValue();
                            break;
                        case 4:
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 5:
                            zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 6:
                            arrayList.add(c1.A.decode(reader));
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
        public void encode(com.squareup.wire.l writer, e value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getTimeSinceAlertSet_ms() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.getTimeSinceAlertSet_ms()));
            }
            if (value.getHandlePulled() != d1.HANDLE_PULLED_FRONT_DRIVER_DOOR) {
                d1.ADAPTER.encodeWithTag(writer, 2, value.getHandlePulled());
            }
            if (value.getConnectionCount() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.getConnectionCount()));
            }
            if (value.getUnknownDevicePresent()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.getUnknownDevicePresent()));
            }
            if (value.getAuthRequested()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.getAuthRequested()));
            }
            c1.A.asRepeated().encodeWithTag(writer, 6, value.e());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(e value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getTimeSinceAlertSet_ms() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.getTimeSinceAlertSet_ms()));
            }
            if (value.getHandlePulled() != d1.HANDLE_PULLED_FRONT_DRIVER_DOOR) {
                iD += d1.ADAPTER.encodedSizeWithTag(2, value.getHandlePulled());
            }
            if (value.getConnectionCount() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.getConnectionCount()));
            }
            if (value.getUnknownDevicePresent()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getUnknownDevicePresent()));
            }
            if (value.getAuthRequested()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getAuthRequested()));
            }
            return iD + c1.A.asRepeated().encodedSizeWithTag(6, value.e());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e redact(e value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return e.b(value, 0, null, 0, false, false, x20.d.a(value.e(), c1.A), okio.k.f97943e, 31, null);
        }
    }

    public e() {
        this(0, null, 0, false, false, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e b(e eVar, int i11, d1 d1Var, int i12, boolean z11, boolean z12, List list, okio.k kVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = eVar.timeSinceAlertSet_ms;
        }
        if ((i13 & 2) != 0) {
            d1Var = eVar.handlePulled;
        }
        if ((i13 & 4) != 0) {
            i12 = eVar.connectionCount;
        }
        if ((i13 & 8) != 0) {
            z11 = eVar.unknownDevicePresent;
        }
        if ((i13 & 16) != 0) {
            z12 = eVar.authRequested;
        }
        if ((i13 & 32) != 0) {
            list = eVar.deviceSpecificPayload;
        }
        if ((i13 & 64) != 0) {
            kVar = eVar.unknownFields();
        }
        List list2 = list;
        okio.k kVar2 = kVar;
        boolean z13 = z12;
        int i14 = i12;
        return eVar.a(i11, d1Var, i14, z11, z13, list2, kVar2);
    }

    public final e a(int timeSinceAlertSet_ms, d1 handlePulled, int connectionCount, boolean unknownDevicePresent, boolean authRequested, List<c1> deviceSpecificPayload, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(handlePulled, "handlePulled");
        p013kotlin.jvm.internal.s.k(deviceSpecificPayload, "deviceSpecificPayload");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new e(timeSinceAlertSet_ms, handlePulled, connectionCount, unknownDevicePresent, authRequested, deviceSpecificPayload, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAuthRequested() {
        return this.authRequested;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getConnectionCount() {
        return this.connectionCount;
    }

    public final List<c1> e() {
        return this.deviceSpecificPayload;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), eVar.unknownFields()) && this.timeSinceAlertSet_ms == eVar.timeSinceAlertSet_ms && this.handlePulled == eVar.handlePulled && this.connectionCount == eVar.connectionCount && this.unknownDevicePresent == eVar.unknownDevicePresent && this.authRequested == eVar.authRequested && p013kotlin.jvm.internal.s.f(this.deviceSpecificPayload, eVar.deviceSpecificPayload);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final d1 getHandlePulled() {
        return this.handlePulled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getTimeSinceAlertSet_ms() {
        return this.timeSinceAlertSet_ms;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getUnknownDevicePresent() {
        return this.unknownDevicePresent;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.timeSinceAlertSet_ms)) * 37) + this.handlePulled.hashCode()) * 37) + Integer.hashCode(this.connectionCount)) * 37) + Boolean.hashCode(this.unknownDevicePresent)) * 37) + Boolean.hashCode(this.authRequested)) * 37) + this.deviceSpecificPayload.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m794newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("timeSinceAlertSet_ms=" + this.timeSinceAlertSet_ms);
        arrayList.add("handlePulled=" + this.handlePulled);
        arrayList.add("connectionCount=" + this.connectionCount);
        arrayList.add("unknownDevicePresent=" + this.unknownDevicePresent);
        arrayList.add("authRequested=" + this.authRequested);
        if (!this.deviceSpecificPayload.isEmpty()) {
            arrayList.add("deviceSpecificPayload=" + this.deviceSpecificPayload);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "AlertHandlePulledWithoutAuth{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ e(int i11, d1 d1Var, int i12, boolean z11, boolean z12, List list, okio.k kVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? d1.HANDLE_PULLED_FRONT_DRIVER_DOOR : d1Var, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? false : z11, (i13 & 16) != 0 ? false : z12, (i13 & 32) != 0 ? p013kotlin.collections.v.m() : list, (i13 & 64) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m794newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i11, d1 handlePulled, int i12, boolean z11, boolean z12, List<c1> deviceSpecificPayload, okio.k unknownFields) {
        super(f118629h, unknownFields);
        p013kotlin.jvm.internal.s.k(handlePulled, "handlePulled");
        p013kotlin.jvm.internal.s.k(deviceSpecificPayload, "deviceSpecificPayload");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.timeSinceAlertSet_ms = i11;
        this.handlePulled = handlePulled;
        this.connectionCount = i12;
        this.unknownDevicePresent = z11;
        this.authRequested = z12;
        this.deviceSpecificPayload = x20.d.g("deviceSpecificPayload", deviceSpecificPayload);
    }
}
