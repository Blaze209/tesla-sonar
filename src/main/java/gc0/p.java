package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import j$.time.Instant;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBG\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JM\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b#\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"¨\u0006%"}, d2 = {"Lgc0/p;", "Lcom/squareup/wire/f;", "", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "cpd_disable_notification_required", "cpd_hvac_active", "cpd_supports_critical_alerts", "Lokio/k;", "unknownFields", "<init>", "(Lj$/time/Instant;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lj$/time/Instant;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/k;)Lgc0/p;", "Lj$/time/Instant;", "f", "()Lj$/time/Instant;", "b", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", DateTokenConverter.CONVERTER_KEY, "e", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<p> f68297f = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(p.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2000)
    private final Instant timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "cpdDisableNotificationRequired", tag = 1)
    private final Boolean cpd_disable_notification_required;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "cpdHvacActive", tag = 2)
    private final Boolean cpd_hvac_active;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "cpdSupportsCriticalAlerts", tag = 3)
    private final Boolean cpd_supports_critical_alerts;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/p$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/p;", "value", "", "c", "(Lgc0/p;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/p;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/p;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/p;)Lgc0/p;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<p> {
        a(com.squareup.wire.b bVar, co0.d<p> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ChildPresenceDetectionState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            Instant instantDecode = null;
            Boolean boolDecode = null;
            Boolean boolDecode2 = null;
            Boolean boolDecode3 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new p(instantDecode, boolDecode, boolDecode2, boolDecode3, reader.e(jD));
                }
                if (iG == 1) {
                    boolDecode = ProtoAdapter.BOOL.decode(reader);
                } else if (iG == 2) {
                    boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                } else if (iG == 3) {
                    boolDecode3 = ProtoAdapter.BOOL.decode(reader);
                } else if (iG != 2000) {
                    reader.m(iG);
                } else {
                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, p value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 2000, value.getTimestamp());
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(writer, 1, value.getCpd_disable_notification_required());
            protoAdapter.encodeWithTag(writer, 2, value.getCpd_hvac_active());
            protoAdapter.encodeWithTag(writer, 3, value.getCpd_supports_critical_alerts());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(p value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(2000, value.getTimestamp());
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iD + protoAdapter.encodedSizeWithTag(1, value.getCpd_disable_notification_required()) + protoAdapter.encodedSizeWithTag(2, value.getCpd_hvac_active()) + protoAdapter.encodedSizeWithTag(3, value.getCpd_supports_critical_alerts());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public p redact(p value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            Instant timestamp = value.getTimestamp();
            return p.b(value, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, null, okio.k.f97943e, 14, null);
        }
    }

    public p() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ p b(p pVar, Instant instant, Boolean bool, Boolean bool2, Boolean bool3, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            instant = pVar.timestamp;
        }
        if ((i11 & 2) != 0) {
            bool = pVar.cpd_disable_notification_required;
        }
        if ((i11 & 4) != 0) {
            bool2 = pVar.cpd_hvac_active;
        }
        if ((i11 & 8) != 0) {
            bool3 = pVar.cpd_supports_critical_alerts;
        }
        if ((i11 & 16) != 0) {
            kVar = pVar.unknownFields();
        }
        okio.k kVar2 = kVar;
        Boolean bool4 = bool2;
        return pVar.a(instant, bool, bool4, bool3, kVar2);
    }

    public final p a(Instant timestamp, Boolean cpd_disable_notification_required, Boolean cpd_hvac_active, Boolean cpd_supports_critical_alerts, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new p(timestamp, cpd_disable_notification_required, cpd_hvac_active, cpd_supports_critical_alerts, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getCpd_disable_notification_required() {
        return this.cpd_disable_notification_required;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getCpd_hvac_active() {
        return this.cpd_hvac_active;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getCpd_supports_critical_alerts() {
        return this.cpd_supports_critical_alerts;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof p)) {
            return false;
        }
        p pVar = (p) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), pVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.timestamp, pVar.timestamp) && p013kotlin.jvm.internal.s.f(this.cpd_disable_notification_required, pVar.cpd_disable_notification_required) && p013kotlin.jvm.internal.s.f(this.cpd_hvac_active, pVar.cpd_hvac_active) && p013kotlin.jvm.internal.s.f(this.cpd_supports_critical_alerts, pVar.cpd_supports_critical_alerts);
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
        Boolean bool = this.cpd_disable_notification_required;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.cpd_hvac_active;
        int iHashCode4 = (iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.cpd_supports_critical_alerts;
        int iHashCode5 = iHashCode4 + (bool3 != null ? bool3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m426newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        Boolean bool = this.cpd_disable_notification_required;
        if (bool != null) {
            arrayList.add("cpd_disable_notification_required=" + bool);
        }
        Boolean bool2 = this.cpd_hvac_active;
        if (bool2 != null) {
            arrayList.add("cpd_hvac_active=" + bool2);
        }
        Boolean bool3 = this.cpd_supports_critical_alerts;
        if (bool3 != null) {
            arrayList.add("cpd_supports_critical_alerts=" + bool3);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "ChildPresenceDetectionState{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ p(Instant instant, Boolean bool, Boolean bool2, Boolean bool3, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : instant, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : bool2, (i11 & 8) != 0 ? null : bool3, (i11 & 16) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m426newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Instant instant, Boolean bool, Boolean bool2, Boolean bool3, okio.k unknownFields) {
        super(f68297f, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.timestamp = instant;
        this.cpd_disable_notification_required = bool;
        this.cpd_hvac_active = bool2;
        this.cpd_supports_critical_alerts = bool3;
    }
}
