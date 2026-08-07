package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB9\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\"\u0010!R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u0015¨\u0006%"}, d2 = {"Lvc0/j3;", "Lcom/squareup/wire/f;", "", "Lvc0/r3;", "appState", "", "leGattNearBackgroundNotificationLimit", "leGattExceededBackgroundNotificationLimit", "", "battery_level_percent", "Lokio/k;", "unknownFields", "<init>", "(Lvc0/r3;ZZILokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/r3;ZZILokio/k;)Lvc0/j3;", "Lvc0/r3;", "c", "()Lvc0/r3;", "b", "Z", "f", "()Z", "e", DateTokenConverter.CONVERTER_KEY, "I", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j3 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<j3> f118785f = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(j3.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.iOS_AppState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final r3 appState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final boolean leGattNearBackgroundNotificationLimit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final boolean leGattExceededBackgroundNotificationLimit;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "batteryLevelPercent", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final int battery_level_percent;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/j3$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/j3;", "value", "", "c", "(Lvc0/j3;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/j3;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/j3;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/j3;)Lvc0/j3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<j3> {
        a(com.squareup.wire.b bVar, co0.d<j3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.WatchAppStateEvent", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j3 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            r3 r3VarDecode = r3.IOS_APPSTATE_SNA;
            long jD = reader.d();
            boolean zBooleanValue = false;
            boolean zBooleanValue2 = false;
            int iIntValue = 0;
            while (true) {
                r3 r3Var = r3VarDecode;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new j3(r3Var, zBooleanValue, zBooleanValue2, iIntValue, reader.e(jD));
                    }
                    if (iG == 1) {
                        try {
                            r3VarDecode = r3.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                        }
                    } else if (iG == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iG == 3) {
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iG != 4) {
                        reader.m(iG);
                    } else {
                        iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, j3 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getAppState() != r3.IOS_APPSTATE_SNA) {
                r3.ADAPTER.encodeWithTag(writer, 1, value.getAppState());
            }
            if (value.getLeGattNearBackgroundNotificationLimit()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.getLeGattNearBackgroundNotificationLimit()));
            }
            if (value.getLeGattExceededBackgroundNotificationLimit()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.getLeGattExceededBackgroundNotificationLimit()));
            }
            if (value.getBattery_level_percent() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 4, Integer.valueOf(value.getBattery_level_percent()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(j3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getAppState() != r3.IOS_APPSTATE_SNA) {
                iD += r3.ADAPTER.encodedSizeWithTag(1, value.getAppState());
            }
            if (value.getLeGattNearBackgroundNotificationLimit()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getLeGattNearBackgroundNotificationLimit()));
            }
            if (value.getLeGattExceededBackgroundNotificationLimit()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getLeGattExceededBackgroundNotificationLimit()));
            }
            return value.getBattery_level_percent() != 0 ? iD + ProtoAdapter.UINT32.encodedSizeWithTag(4, Integer.valueOf(value.getBattery_level_percent())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public j3 redact(j3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return j3.b(value, null, false, false, 0, okio.k.f97943e, 15, null);
        }
    }

    public j3() {
        this(null, false, false, 0, null, 31, null);
    }

    public static /* synthetic */ j3 b(j3 j3Var, r3 r3Var, boolean z11, boolean z12, int i11, okio.k kVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            r3Var = j3Var.appState;
        }
        if ((i12 & 2) != 0) {
            z11 = j3Var.leGattNearBackgroundNotificationLimit;
        }
        if ((i12 & 4) != 0) {
            z12 = j3Var.leGattExceededBackgroundNotificationLimit;
        }
        if ((i12 & 8) != 0) {
            i11 = j3Var.battery_level_percent;
        }
        if ((i12 & 16) != 0) {
            kVar = j3Var.unknownFields();
        }
        okio.k kVar2 = kVar;
        boolean z13 = z12;
        return j3Var.a(r3Var, z11, z13, i11, kVar2);
    }

    public final j3 a(r3 appState, boolean leGattNearBackgroundNotificationLimit, boolean leGattExceededBackgroundNotificationLimit, int battery_level_percent, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(appState, "appState");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new j3(appState, leGattNearBackgroundNotificationLimit, leGattExceededBackgroundNotificationLimit, battery_level_percent, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final r3 getAppState() {
        return this.appState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getBattery_level_percent() {
        return this.battery_level_percent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getLeGattExceededBackgroundNotificationLimit() {
        return this.leGattExceededBackgroundNotificationLimit;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), j3Var.unknownFields()) && this.appState == j3Var.appState && this.leGattNearBackgroundNotificationLimit == j3Var.leGattNearBackgroundNotificationLimit && this.leGattExceededBackgroundNotificationLimit == j3Var.leGattExceededBackgroundNotificationLimit && this.battery_level_percent == j3Var.battery_level_percent;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getLeGattNearBackgroundNotificationLimit() {
        return this.leGattNearBackgroundNotificationLimit;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.appState.hashCode()) * 37) + Boolean.hashCode(this.leGattNearBackgroundNotificationLimit)) * 37) + Boolean.hashCode(this.leGattExceededBackgroundNotificationLimit)) * 37) + Integer.hashCode(this.battery_level_percent);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m813newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("appState=" + this.appState);
        arrayList.add("leGattNearBackgroundNotificationLimit=" + this.leGattNearBackgroundNotificationLimit);
        arrayList.add("leGattExceededBackgroundNotificationLimit=" + this.leGattExceededBackgroundNotificationLimit);
        arrayList.add("battery_level_percent=" + this.battery_level_percent);
        return p013kotlin.collections.v.y0(arrayList, ", ", "WatchAppStateEvent{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ j3(r3 r3Var, boolean z11, boolean z12, int i11, okio.k kVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? r3.IOS_APPSTATE_SNA : r3Var, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? 0 : i11, (i12 & 16) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m813newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(r3 appState, boolean z11, boolean z12, int i11, okio.k unknownFields) {
        super(f118785f, unknownFields);
        p013kotlin.jvm.internal.s.k(appState, "appState");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.appState = appState;
        this.leGattNearBackgroundNotificationLimit = z11;
        this.leGattExceededBackgroundNotificationLimit = z12;
        this.battery_level_percent = i11;
    }
}
