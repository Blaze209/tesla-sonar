package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.squareup.wire.ProtoAdapter;
import j$.time.Instant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u007f\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010!J\u0085\u0001\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#R\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b0\u0010!R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u00106\u001a\u0004\b+\u00107R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00106\u001a\u0004\b4\u00107¨\u00068"}, d2 = {"Lgc0/r0;", "Lcom/squareup/wire/f;", "", "", "Lec0/e0;", "allowed_levels", "level_options", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lec0/d0;", "current_level", "target_level", "Lec0/c0;", "movement_state", "", "offroad_on", "", "disabled_reason", "Lokio/k;", "unknownFields", "<init>", "(Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Lec0/d0;Lec0/d0;Lec0/c0;Ljava/lang/Boolean;Ljava/lang/String;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Lec0/d0;Lec0/d0;Lec0/c0;Ljava/lang/Boolean;Ljava/lang/String;Lokio/k;)Lgc0/r0;", "Lj$/time/Instant;", "j", "()Lj$/time/Instant;", "b", "Lec0/d0;", DateTokenConverter.CONVERTER_KEY, "()Lec0/d0;", "c", IntegerTokenConverter.CONVERTER_KEY, "Lec0/c0;", "g", "()Lec0/c0;", "e", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "f", "Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ProtoAdapter<r0> f68439j = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(r0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2000)
    private final Instant timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.SuspensionLevel#ADAPTER", jsonName = "currentLevel", tag = 2)
    private final ec0.d0 current_level;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.SuspensionLevel#ADAPTER", jsonName = "targetLevel", tag = 3)
    private final ec0.d0 target_level;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.SuspensionActuationState#ADAPTER", jsonName = "movementState", tag = 4)
    private final ec0.c0 movement_state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "offroadOn", tag = 5)
    private final Boolean offroad_on;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disabledReason", tag = 6)
    private final String disabled_reason;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.SuspensionLevelObj#ADAPTER", jsonName = "allowedLevels", label = com.squareup.wire.q.a.REPEATED, tag = 1)
    private final List<ec0.e0> allowed_levels;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.SuspensionLevelObj#ADAPTER", jsonName = "levelOptions", label = com.squareup.wire.q.a.REPEATED, tag = 7)
    private final List<ec0.e0> level_options;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/r0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/r0;", "value", "", "c", "(Lgc0/r0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/r0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/r0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/r0;)Lgc0/r0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<r0> {
        a(com.squareup.wire.b bVar, co0.d<r0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.SuspensionState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r0 decode(com.squareup.wire.k reader) throws IOException {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            long jD = reader.d();
            Instant instantDecode = null;
            ec0.d0 d0VarDecode = null;
            ec0.d0 d0VarDecode2 = null;
            ec0.c0 c0VarDecode = null;
            Boolean boolDecode = null;
            String strDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new r0(arrayList, arrayList2, instantDecode, d0VarDecode, d0VarDecode2, c0VarDecode, boolDecode, strDecode, reader.e(jD));
                }
                if (iG != 2000) {
                    switch (iG) {
                        case 1:
                            arrayList.add(ec0.e0.f62601c.decode(reader));
                            break;
                        case 2:
                            try {
                                d0VarDecode = ec0.d0.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            }
                            break;
                        case 3:
                            try {
                                d0VarDecode2 = ec0.d0.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                            }
                            break;
                        case 4:
                            try {
                                c0VarDecode = ec0.c0.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e13.value));
                            }
                            break;
                        case 5:
                            boolDecode = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 6:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 7:
                            arrayList2.add(ec0.e0.f62601c.decode(reader));
                            break;
                        default:
                            reader.m(iG);
                            break;
                    }
                } else {
                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, r0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter<ec0.e0> protoAdapter = ec0.e0.f62601c;
            protoAdapter.asRepeated().encodeWithTag(writer, 1, value.c());
            protoAdapter.asRepeated().encodeWithTag(writer, 7, value.f());
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 2000, value.getTimestamp());
            }
            ProtoAdapter<ec0.d0> protoAdapter2 = ec0.d0.ADAPTER;
            protoAdapter2.encodeWithTag(writer, 2, value.getCurrent_level());
            protoAdapter2.encodeWithTag(writer, 3, value.getTarget_level());
            ec0.c0.ADAPTER.encodeWithTag(writer, 4, value.getMovement_state());
            ProtoAdapter.BOOL.encodeWithTag(writer, 5, value.getOffroad_on());
            ProtoAdapter.STRING.encodeWithTag(writer, 6, value.getDisabled_reason());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(r0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<ec0.e0> protoAdapter = ec0.e0.f62601c;
            int iEncodedSizeWithTag = iD + protoAdapter.asRepeated().encodedSizeWithTag(1, value.c()) + protoAdapter.asRepeated().encodedSizeWithTag(7, value.f());
            if (value.getTimestamp() != null) {
                iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(2000, value.getTimestamp());
            }
            ProtoAdapter<ec0.d0> protoAdapter2 = ec0.d0.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, value.getCurrent_level()) + protoAdapter2.encodedSizeWithTag(3, value.getTarget_level()) + ec0.c0.ADAPTER.encodedSizeWithTag(4, value.getMovement_state()) + ProtoAdapter.BOOL.encodedSizeWithTag(5, value.getOffroad_on()) + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getDisabled_reason());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public r0 redact(r0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            List<ec0.e0> listC = value.c();
            ProtoAdapter<ec0.e0> protoAdapter = ec0.e0.f62601c;
            List listA = x20.d.a(listC, protoAdapter);
            List listA2 = x20.d.a(value.f(), protoAdapter);
            Instant timestamp = value.getTimestamp();
            return r0.b(value, listA, listA2, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, null, null, null, okio.k.f97943e, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        }
    }

    public r0() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ r0 b(r0 r0Var, List list, List list2, Instant instant, ec0.d0 d0Var, ec0.d0 d0Var2, ec0.c0 c0Var, Boolean bool, String str, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = r0Var.allowed_levels;
        }
        if ((i11 & 2) != 0) {
            list2 = r0Var.level_options;
        }
        if ((i11 & 4) != 0) {
            instant = r0Var.timestamp;
        }
        if ((i11 & 8) != 0) {
            d0Var = r0Var.current_level;
        }
        if ((i11 & 16) != 0) {
            d0Var2 = r0Var.target_level;
        }
        if ((i11 & 32) != 0) {
            c0Var = r0Var.movement_state;
        }
        if ((i11 & 64) != 0) {
            bool = r0Var.offroad_on;
        }
        if ((i11 & 128) != 0) {
            str = r0Var.disabled_reason;
        }
        if ((i11 & 256) != 0) {
            kVar = r0Var.unknownFields();
        }
        String str2 = str;
        okio.k kVar2 = kVar;
        ec0.c0 c0Var2 = c0Var;
        Boolean bool2 = bool;
        ec0.d0 d0Var3 = d0Var2;
        Instant instant2 = instant;
        return r0Var.a(list, list2, instant2, d0Var, d0Var3, c0Var2, bool2, str2, kVar2);
    }

    public final r0 a(List<ec0.e0> allowed_levels, List<ec0.e0> level_options, Instant timestamp, ec0.d0 current_level, ec0.d0 target_level, ec0.c0 movement_state, Boolean offroad_on, String disabled_reason, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(allowed_levels, "allowed_levels");
        p013kotlin.jvm.internal.s.k(level_options, "level_options");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new r0(allowed_levels, level_options, timestamp, current_level, target_level, movement_state, offroad_on, disabled_reason, unknownFields);
    }

    public final List<ec0.e0> c() {
        return this.allowed_levels;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ec0.d0 getCurrent_level() {
        return this.current_level;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDisabled_reason() {
        return this.disabled_reason;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), r0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.allowed_levels, r0Var.allowed_levels) && p013kotlin.jvm.internal.s.f(this.level_options, r0Var.level_options) && p013kotlin.jvm.internal.s.f(this.timestamp, r0Var.timestamp) && this.current_level == r0Var.current_level && this.target_level == r0Var.target_level && this.movement_state == r0Var.movement_state && p013kotlin.jvm.internal.s.f(this.offroad_on, r0Var.offroad_on) && p013kotlin.jvm.internal.s.f(this.disabled_reason, r0Var.disabled_reason);
    }

    public final List<ec0.e0> f() {
        return this.level_options;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ec0.c0 getMovement_state() {
        return this.movement_state;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getOffroad_on() {
        return this.offroad_on;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.allowed_levels.hashCode()) * 37) + this.level_options.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        ec0.d0 d0Var = this.current_level;
        int iHashCode3 = (iHashCode2 + (d0Var != null ? d0Var.hashCode() : 0)) * 37;
        ec0.d0 d0Var2 = this.target_level;
        int iHashCode4 = (iHashCode3 + (d0Var2 != null ? d0Var2.hashCode() : 0)) * 37;
        ec0.c0 c0Var = this.movement_state;
        int iHashCode5 = (iHashCode4 + (c0Var != null ? c0Var.hashCode() : 0)) * 37;
        Boolean bool = this.offroad_on;
        int iHashCode6 = (iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 37;
        String str = this.disabled_reason;
        int iHashCode7 = iHashCode6 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final ec0.d0 getTarget_level() {
        return this.target_level;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m436newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.allowed_levels.isEmpty()) {
            arrayList.add("allowed_levels=" + this.allowed_levels);
        }
        if (!this.level_options.isEmpty()) {
            arrayList.add("level_options=" + this.level_options);
        }
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        ec0.d0 d0Var = this.current_level;
        if (d0Var != null) {
            arrayList.add("current_level=" + d0Var);
        }
        ec0.d0 d0Var2 = this.target_level;
        if (d0Var2 != null) {
            arrayList.add("target_level=" + d0Var2);
        }
        ec0.c0 c0Var = this.movement_state;
        if (c0Var != null) {
            arrayList.add("movement_state=" + c0Var);
        }
        Boolean bool = this.offroad_on;
        if (bool != null) {
            arrayList.add("offroad_on=" + bool);
        }
        String str = this.disabled_reason;
        if (str != null) {
            arrayList.add("disabled_reason=" + x20.d.i(str));
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "SuspensionState{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ r0(List list, List list2, Instant instant, ec0.d0 d0Var, ec0.d0 d0Var2, ec0.c0 c0Var, Boolean bool, String str, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? p013kotlin.collections.v.m() : list, (i11 & 2) != 0 ? p013kotlin.collections.v.m() : list2, (i11 & 4) != 0 ? null : instant, (i11 & 8) != 0 ? null : d0Var, (i11 & 16) != 0 ? null : d0Var2, (i11 & 32) != 0 ? null : c0Var, (i11 & 64) != 0 ? null : bool, (i11 & 128) != 0 ? null : str, (i11 & 256) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m436newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(List<ec0.e0> allowed_levels, List<ec0.e0> level_options, Instant instant, ec0.d0 d0Var, ec0.d0 d0Var2, ec0.c0 c0Var, Boolean bool, String str, okio.k unknownFields) {
        super(f68439j, unknownFields);
        p013kotlin.jvm.internal.s.k(allowed_levels, "allowed_levels");
        p013kotlin.jvm.internal.s.k(level_options, "level_options");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.timestamp = instant;
        this.current_level = d0Var;
        this.target_level = d0Var2;
        this.movement_state = c0Var;
        this.offroad_on = bool;
        this.disabled_reason = str;
        this.allowed_levels = x20.d.g("allowed_levels", allowed_levels);
        this.level_options = x20.d.g("level_options", level_options);
    }
}
