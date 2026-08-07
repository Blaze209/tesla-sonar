package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)Bg\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#Jm\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b0\u00106R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010;\u001a\u0004\b4\u0010<R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010=\u001a\u0004\b7\u0010>¨\u0006?"}, d2 = {"Lvc0/i3;", "Lcom/squareup/wire/f;", "", "Lvc0/h0;", "closureStatuses", "Lvc0/g3;", "vehicleLockState", "Lvc0/h3;", "vehicleSleepStatus", "Lvc0/f3;", "userPresence", "Lvc0/j0;", "detailedClosureStatus", "Lvc0/a3;", "UIDesire", "Lvc0/y0;", "gear", "Lvc0/j1;", "keyLocationStatus", "Lokio/k;", "unknownFields", "<init>", "(Lvc0/h0;Lvc0/g3;Lvc0/h3;Lvc0/f3;Lvc0/j0;Lvc0/a3;Lvc0/y0;Lvc0/j1;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/h0;Lvc0/g3;Lvc0/h3;Lvc0/f3;Lvc0/j0;Lvc0/a3;Lvc0/y0;Lvc0/j1;Lokio/k;)Lvc0/i3;", "Lvc0/h0;", "c", "()Lvc0/h0;", "b", "Lvc0/g3;", IntegerTokenConverter.CONVERTER_KEY, "()Lvc0/g3;", "Lvc0/h3;", "j", "()Lvc0/h3;", DateTokenConverter.CONVERTER_KEY, "Lvc0/f3;", "h", "()Lvc0/f3;", "e", "Lvc0/j0;", "()Lvc0/j0;", "f", "Lvc0/a3;", "g", "()Lvc0/a3;", "Lvc0/y0;", "()Lvc0/y0;", "Lvc0/j1;", "()Lvc0/j1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i3 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ProtoAdapter<i3> f118766j = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(i3.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureStatuses#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final h0 closureStatuses;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.VehicleLockState_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final g3 vehicleLockState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.VehicleSleepStatus_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final h3 vehicleSleepStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.UserPresence_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final f3 userPresence;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.DetailedClosureStatus#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final j0 detailedClosureStatus;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.UIDesire_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final a3 UIDesire;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.Gear_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final y0 gear;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyLocationStatus#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final j1 keyLocationStatus;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/i3$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/i3;", "value", "", "c", "(Lvc0/i3;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/i3;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/i3;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/i3;)Lvc0/i3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<i3> {
        a(com.squareup.wire.b bVar, co0.d<i3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.VehicleStatus", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i3 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            g3 g3VarDecode = g3.VEHICLELOCKSTATE_UNLOCKED;
            h3 h3Var = h3.VEHICLE_SLEEP_STATUS_UNKNOWN;
            f3 f3Var = f3.VEHICLE_USER_PRESENCE_UNKNOWN;
            a3 a3Var = a3.UI_DESIRE_NONE;
            y0 y0Var = y0.GEAR_UNKNOWN;
            long jD = reader.d();
            h0 h0VarDecode = null;
            j0 j0VarDecode = null;
            j1 j1VarDecode = null;
            y0 y0VarDecode = y0Var;
            a3 a3VarDecode = a3Var;
            f3 f3VarDecode = f3Var;
            h3 h3VarDecode = h3Var;
            while (true) {
                g3 g3Var = g3VarDecode;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new i3(h0VarDecode, g3Var, h3VarDecode, f3VarDecode, j0VarDecode, a3VarDecode, y0VarDecode, j1VarDecode, reader.e(jD));
                    }
                    switch (iG) {
                        case 1:
                            h0VarDecode = h0.f118711j.decode(reader);
                            break;
                        case 2:
                            try {
                                g3VarDecode = g3.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            }
                            break;
                        case 3:
                            try {
                                h3VarDecode = h3.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                            }
                            break;
                        case 4:
                            try {
                                f3VarDecode = f3.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e13.value));
                            }
                            break;
                        case 5:
                            j0VarDecode = j0.f118779c.decode(reader);
                            break;
                        case 6:
                            try {
                                a3VarDecode = a3.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e14) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e14.value));
                            }
                            break;
                        case 7:
                            try {
                                y0VarDecode = y0.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e15) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e15.value));
                            }
                            break;
                        case 8:
                            j1VarDecode = j1.f118782c.decode(reader);
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
        public void encode(com.squareup.wire.l writer, i3 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getClosureStatuses() != null) {
                h0.f118711j.encodeWithTag(writer, 1, value.getClosureStatuses());
            }
            if (value.getVehicleLockState() != g3.VEHICLELOCKSTATE_UNLOCKED) {
                g3.ADAPTER.encodeWithTag(writer, 2, value.getVehicleLockState());
            }
            if (value.getVehicleSleepStatus() != h3.VEHICLE_SLEEP_STATUS_UNKNOWN) {
                h3.ADAPTER.encodeWithTag(writer, 3, value.getVehicleSleepStatus());
            }
            if (value.getUserPresence() != f3.VEHICLE_USER_PRESENCE_UNKNOWN) {
                f3.ADAPTER.encodeWithTag(writer, 4, value.getUserPresence());
            }
            if (value.getDetailedClosureStatus() != null) {
                j0.f118779c.encodeWithTag(writer, 5, value.getDetailedClosureStatus());
            }
            if (value.getUIDesire() != a3.UI_DESIRE_NONE) {
                a3.ADAPTER.encodeWithTag(writer, 6, value.getUIDesire());
            }
            if (value.getGear() != y0.GEAR_UNKNOWN) {
                y0.ADAPTER.encodeWithTag(writer, 7, value.getGear());
            }
            if (value.getKeyLocationStatus() != null) {
                j1.f118782c.encodeWithTag(writer, 8, value.getKeyLocationStatus());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(i3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getClosureStatuses() != null) {
                iD += h0.f118711j.encodedSizeWithTag(1, value.getClosureStatuses());
            }
            if (value.getVehicleLockState() != g3.VEHICLELOCKSTATE_UNLOCKED) {
                iD += g3.ADAPTER.encodedSizeWithTag(2, value.getVehicleLockState());
            }
            if (value.getVehicleSleepStatus() != h3.VEHICLE_SLEEP_STATUS_UNKNOWN) {
                iD += h3.ADAPTER.encodedSizeWithTag(3, value.getVehicleSleepStatus());
            }
            if (value.getUserPresence() != f3.VEHICLE_USER_PRESENCE_UNKNOWN) {
                iD += f3.ADAPTER.encodedSizeWithTag(4, value.getUserPresence());
            }
            if (value.getDetailedClosureStatus() != null) {
                iD += j0.f118779c.encodedSizeWithTag(5, value.getDetailedClosureStatus());
            }
            if (value.getUIDesire() != a3.UI_DESIRE_NONE) {
                iD += a3.ADAPTER.encodedSizeWithTag(6, value.getUIDesire());
            }
            if (value.getGear() != y0.GEAR_UNKNOWN) {
                iD += y0.ADAPTER.encodedSizeWithTag(7, value.getGear());
            }
            return value.getKeyLocationStatus() != null ? iD + j1.f118782c.encodedSizeWithTag(8, value.getKeyLocationStatus()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public i3 redact(i3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            h0 closureStatuses = value.getClosureStatuses();
            h0 h0VarRedact = closureStatuses != null ? h0.f118711j.redact(closureStatuses) : null;
            j0 detailedClosureStatus = value.getDetailedClosureStatus();
            j0 j0VarRedact = detailedClosureStatus != null ? j0.f118779c.redact(detailedClosureStatus) : null;
            j1 keyLocationStatus = value.getKeyLocationStatus();
            return i3.b(value, h0VarRedact, null, null, null, j0VarRedact, null, null, keyLocationStatus != null ? j1.f118782c.redact(keyLocationStatus) : null, okio.k.f97943e, 110, null);
        }
    }

    public i3() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ i3 b(i3 i3Var, h0 h0Var, g3 g3Var, h3 h3Var, f3 f3Var, j0 j0Var, a3 a3Var, y0 y0Var, j1 j1Var, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            h0Var = i3Var.closureStatuses;
        }
        if ((i11 & 2) != 0) {
            g3Var = i3Var.vehicleLockState;
        }
        if ((i11 & 4) != 0) {
            h3Var = i3Var.vehicleSleepStatus;
        }
        if ((i11 & 8) != 0) {
            f3Var = i3Var.userPresence;
        }
        if ((i11 & 16) != 0) {
            j0Var = i3Var.detailedClosureStatus;
        }
        if ((i11 & 32) != 0) {
            a3Var = i3Var.UIDesire;
        }
        if ((i11 & 64) != 0) {
            y0Var = i3Var.gear;
        }
        if ((i11 & 128) != 0) {
            j1Var = i3Var.keyLocationStatus;
        }
        if ((i11 & 256) != 0) {
            kVar = i3Var.unknownFields();
        }
        j1 j1Var2 = j1Var;
        okio.k kVar2 = kVar;
        a3 a3Var2 = a3Var;
        y0 y0Var2 = y0Var;
        j0 j0Var2 = j0Var;
        h3 h3Var2 = h3Var;
        return i3Var.a(h0Var, g3Var, h3Var2, f3Var, j0Var2, a3Var2, y0Var2, j1Var2, kVar2);
    }

    public final i3 a(h0 closureStatuses, g3 vehicleLockState, h3 vehicleSleepStatus, f3 userPresence, j0 detailedClosureStatus, a3 UIDesire, y0 gear, j1 keyLocationStatus, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(vehicleLockState, "vehicleLockState");
        p013kotlin.jvm.internal.s.k(vehicleSleepStatus, "vehicleSleepStatus");
        p013kotlin.jvm.internal.s.k(userPresence, "userPresence");
        p013kotlin.jvm.internal.s.k(UIDesire, "UIDesire");
        p013kotlin.jvm.internal.s.k(gear, "gear");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new i3(closureStatuses, vehicleLockState, vehicleSleepStatus, userPresence, detailedClosureStatus, UIDesire, gear, keyLocationStatus, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h0 getClosureStatuses() {
        return this.closureStatuses;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j0 getDetailedClosureStatus() {
        return this.detailedClosureStatus;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final y0 getGear() {
        return this.gear;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), i3Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.closureStatuses, i3Var.closureStatuses) && this.vehicleLockState == i3Var.vehicleLockState && this.vehicleSleepStatus == i3Var.vehicleSleepStatus && this.userPresence == i3Var.userPresence && p013kotlin.jvm.internal.s.f(this.detailedClosureStatus, i3Var.detailedClosureStatus) && this.UIDesire == i3Var.UIDesire && this.gear == i3Var.gear && p013kotlin.jvm.internal.s.f(this.keyLocationStatus, i3Var.keyLocationStatus);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final j1 getKeyLocationStatus() {
        return this.keyLocationStatus;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final a3 getUIDesire() {
        return this.UIDesire;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final f3 getUserPresence() {
        return this.userPresence;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        h0 h0Var = this.closureStatuses;
        int iHashCode2 = (((((((iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37) + this.vehicleLockState.hashCode()) * 37) + this.vehicleSleepStatus.hashCode()) * 37) + this.userPresence.hashCode()) * 37;
        j0 j0Var = this.detailedClosureStatus;
        int iHashCode3 = (((((iHashCode2 + (j0Var != null ? j0Var.hashCode() : 0)) * 37) + this.UIDesire.hashCode()) * 37) + this.gear.hashCode()) * 37;
        j1 j1Var = this.keyLocationStatus;
        int iHashCode4 = iHashCode3 + (j1Var != null ? j1Var.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final g3 getVehicleLockState() {
        return this.vehicleLockState;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final h3 getVehicleSleepStatus() {
        return this.vehicleSleepStatus;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m809newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        h0 h0Var = this.closureStatuses;
        if (h0Var != null) {
            arrayList.add("closureStatuses=" + h0Var);
        }
        arrayList.add("vehicleLockState=" + this.vehicleLockState);
        arrayList.add("vehicleSleepStatus=" + this.vehicleSleepStatus);
        arrayList.add("userPresence=" + this.userPresence);
        j0 j0Var = this.detailedClosureStatus;
        if (j0Var != null) {
            arrayList.add("detailedClosureStatus=" + j0Var);
        }
        arrayList.add("UIDesire=" + this.UIDesire);
        arrayList.add("gear=" + this.gear);
        j1 j1Var = this.keyLocationStatus;
        if (j1Var != null) {
            arrayList.add("keyLocationStatus=" + j1Var);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "VehicleStatus{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ i3(h0 h0Var, g3 g3Var, h3 h3Var, f3 f3Var, j0 j0Var, a3 a3Var, y0 y0Var, j1 j1Var, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? g3.VEHICLELOCKSTATE_UNLOCKED : g3Var, (i11 & 4) != 0 ? h3.VEHICLE_SLEEP_STATUS_UNKNOWN : h3Var, (i11 & 8) != 0 ? f3.VEHICLE_USER_PRESENCE_UNKNOWN : f3Var, (i11 & 16) != 0 ? null : j0Var, (i11 & 32) != 0 ? a3.UI_DESIRE_NONE : a3Var, (i11 & 64) != 0 ? y0.GEAR_UNKNOWN : y0Var, (i11 & 128) != 0 ? null : j1Var, (i11 & 256) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m809newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(h0 h0Var, g3 vehicleLockState, h3 vehicleSleepStatus, f3 userPresence, j0 j0Var, a3 UIDesire, y0 gear, j1 j1Var, okio.k unknownFields) {
        super(f118766j, unknownFields);
        p013kotlin.jvm.internal.s.k(vehicleLockState, "vehicleLockState");
        p013kotlin.jvm.internal.s.k(vehicleSleepStatus, "vehicleSleepStatus");
        p013kotlin.jvm.internal.s.k(userPresence, "userPresence");
        p013kotlin.jvm.internal.s.k(UIDesire, "UIDesire");
        p013kotlin.jvm.internal.s.k(gear, "gear");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.closureStatuses = h0Var;
        this.vehicleLockState = vehicleLockState;
        this.vehicleSleepStatus = vehicleSleepStatus;
        this.userPresence = userPresence;
        this.detailedClosureStatus = j0Var;
        this.UIDesire = UIDesire;
        this.gear = gear;
        this.keyLocationStatus = j1Var;
    }
}
