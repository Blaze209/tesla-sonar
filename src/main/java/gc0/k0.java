package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import j$.time.Instant;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BG\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJM\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b'\u0010&¨\u0006("}, d2 = {"Lgc0/k0;", "Lcom/squareup/wire/f;", "", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lgc0/j0;", "parental_controls_settings", "", "parental_controls_active", "parental_controls_pin_set", "Lokio/k;", "unknownFields", "<init>", "(Lj$/time/Instant;Lgc0/j0;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lj$/time/Instant;Lgc0/j0;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/k;)Lgc0/k0;", "Lj$/time/Instant;", "f", "()Lj$/time/Instant;", "b", "Lgc0/j0;", "e", "()Lgc0/j0;", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", DateTokenConverter.CONVERTER_KEY, "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<k0> f68098f = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(k0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final Instant timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ParentalControlsSettings#ADAPTER", jsonName = "parentalControlsSettings", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final j0 parental_controls_settings;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "parentalControlsActive", tag = 2)
    private final Boolean parental_controls_active;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "parentalControlsPinSet", tag = 3)
    private final Boolean parental_controls_pin_set;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/k0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/k0;", "value", "", "c", "(Lgc0/k0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/k0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/k0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/k0;)Lgc0/k0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<k0> {
        a(com.squareup.wire.b bVar, co0.d<k0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ParentalControlsState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            Instant instantDecode = null;
            j0 j0VarDecode = null;
            Boolean boolDecode = null;
            Boolean boolDecode2 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new k0(instantDecode, j0VarDecode, boolDecode, boolDecode2, reader.e(jD));
                }
                if (iG == 1) {
                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                } else if (iG == 2) {
                    boolDecode = ProtoAdapter.BOOL.decode(reader);
                } else if (iG == 3) {
                    boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                } else if (iG != 4) {
                    reader.m(iG);
                } else {
                    j0VarDecode = j0.f68082n.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, k0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 1, value.getTimestamp());
            }
            if (value.getParental_controls_settings() != null) {
                j0.f68082n.encodeWithTag(writer, 4, value.getParental_controls_settings());
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(writer, 2, value.getParental_controls_active());
            protoAdapter.encodeWithTag(writer, 3, value.getParental_controls_pin_set());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(k0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(1, value.getTimestamp());
            }
            if (value.getParental_controls_settings() != null) {
                iD += j0.f68082n.encodedSizeWithTag(4, value.getParental_controls_settings());
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iD + protoAdapter.encodedSizeWithTag(2, value.getParental_controls_active()) + protoAdapter.encodedSizeWithTag(3, value.getParental_controls_pin_set());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public k0 redact(k0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            Instant timestamp = value.getTimestamp();
            Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
            j0 parental_controls_settings = value.getParental_controls_settings();
            return k0.b(value, instantRedact, parental_controls_settings != null ? j0.f68082n.redact(parental_controls_settings) : null, null, null, okio.k.f97943e, 12, null);
        }
    }

    public k0() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ k0 b(k0 k0Var, Instant instant, j0 j0Var, Boolean bool, Boolean bool2, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            instant = k0Var.timestamp;
        }
        if ((i11 & 2) != 0) {
            j0Var = k0Var.parental_controls_settings;
        }
        if ((i11 & 4) != 0) {
            bool = k0Var.parental_controls_active;
        }
        if ((i11 & 8) != 0) {
            bool2 = k0Var.parental_controls_pin_set;
        }
        if ((i11 & 16) != 0) {
            kVar = k0Var.unknownFields();
        }
        okio.k kVar2 = kVar;
        Boolean bool3 = bool;
        return k0Var.a(instant, j0Var, bool3, bool2, kVar2);
    }

    public final k0 a(Instant timestamp, j0 parental_controls_settings, Boolean parental_controls_active, Boolean parental_controls_pin_set, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new k0(timestamp, parental_controls_settings, parental_controls_active, parental_controls_pin_set, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getParental_controls_active() {
        return this.parental_controls_active;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getParental_controls_pin_set() {
        return this.parental_controls_pin_set;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final j0 getParental_controls_settings() {
        return this.parental_controls_settings;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), k0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.timestamp, k0Var.timestamp) && p013kotlin.jvm.internal.s.f(this.parental_controls_settings, k0Var.parental_controls_settings) && p013kotlin.jvm.internal.s.f(this.parental_controls_active, k0Var.parental_controls_active) && p013kotlin.jvm.internal.s.f(this.parental_controls_pin_set, k0Var.parental_controls_pin_set);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        j0 j0Var = this.parental_controls_settings;
        int iHashCode3 = (iHashCode2 + (j0Var != null ? j0Var.hashCode() : 0)) * 37;
        Boolean bool = this.parental_controls_active;
        int iHashCode4 = (iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.parental_controls_pin_set;
        int iHashCode5 = iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m408newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        j0 j0Var = this.parental_controls_settings;
        if (j0Var != null) {
            arrayList.add("parental_controls_settings=" + j0Var);
        }
        Boolean bool = this.parental_controls_active;
        if (bool != null) {
            arrayList.add("parental_controls_active=" + bool);
        }
        Boolean bool2 = this.parental_controls_pin_set;
        if (bool2 != null) {
            arrayList.add("parental_controls_pin_set=" + bool2);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "ParentalControlsState{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ k0(Instant instant, j0 j0Var, Boolean bool, Boolean bool2, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : instant, (i11 & 2) != 0 ? null : j0Var, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? null : bool2, (i11 & 16) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m408newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Instant instant, j0 j0Var, Boolean bool, Boolean bool2, okio.k unknownFields) {
        super(f68098f, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.timestamp = instant;
        this.parental_controls_settings = j0Var;
        this.parental_controls_active = bool;
        this.parental_controls_pin_set = bool2;
    }
}
