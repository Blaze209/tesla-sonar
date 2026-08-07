package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import j$.time.Instant;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BS\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJY\u0010\u001d\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lgc0/d0;", "Lcom/squareup/wire/f;", "", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lgc0/c0;", "light_show_settings", "", "light_show_active", "", "light_show_selected_name", "", "light_show_start_time", "Lokio/k;", "unknownFields", "<init>", "(Lj$/time/Instant;Lgc0/c0;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Lj$/time/Instant;Lgc0/c0;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Lokio/k;)Lgc0/d0;", "Lj$/time/Instant;", "g", "()Lj$/time/Instant;", "b", "Lgc0/c0;", "e", "()Lgc0/c0;", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ProtoAdapter<d0> f67995g = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(d0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final Instant timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.LightShowSettings#ADAPTER", jsonName = "lightShowSettings", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final c0 light_show_settings;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "lightShowActive", tag = 2)
    private final Boolean light_show_active;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lightShowSelectedName", tag = 3)
    private final String light_show_selected_name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "lightShowStartTime", tag = 4)
    private final Long light_show_start_time;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/d0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/d0;", "value", "", "c", "(Lgc0/d0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/d0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/d0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/d0;)Lgc0/d0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<d0> {
        a(com.squareup.wire.b bVar, co0.d<d0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.LightShowState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            Instant instantDecode = null;
            c0 c0VarDecode = null;
            Boolean boolDecode = null;
            String strDecode = null;
            Long lDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new d0(instantDecode, c0VarDecode, boolDecode, strDecode, lDecode, reader.e(jD));
                }
                if (iG == 1) {
                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                } else if (iG == 2) {
                    boolDecode = ProtoAdapter.BOOL.decode(reader);
                } else if (iG == 3) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iG == 4) {
                    lDecode = ProtoAdapter.UINT64.decode(reader);
                } else if (iG != 5) {
                    reader.m(iG);
                } else {
                    c0VarDecode = c0.f67983g.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, d0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 1, value.getTimestamp());
            }
            if (value.getLight_show_settings() != null) {
                c0.f67983g.encodeWithTag(writer, 5, value.getLight_show_settings());
            }
            ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.getLight_show_active());
            ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getLight_show_selected_name());
            ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.getLight_show_start_time());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(d0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(1, value.getTimestamp());
            }
            if (value.getLight_show_settings() != null) {
                iD += c0.f67983g.encodedSizeWithTag(5, value.getLight_show_settings());
            }
            return iD + ProtoAdapter.BOOL.encodedSizeWithTag(2, value.getLight_show_active()) + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getLight_show_selected_name()) + ProtoAdapter.UINT64.encodedSizeWithTag(4, value.getLight_show_start_time());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public d0 redact(d0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            Instant timestamp = value.getTimestamp();
            Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
            c0 light_show_settings = value.getLight_show_settings();
            return d0.b(value, instantRedact, light_show_settings != null ? c0.f67983g.redact(light_show_settings) : null, null, null, null, okio.k.f97943e, 28, null);
        }
    }

    public d0() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ d0 b(d0 d0Var, Instant instant, c0 c0Var, Boolean bool, String str, Long l11, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            instant = d0Var.timestamp;
        }
        if ((i11 & 2) != 0) {
            c0Var = d0Var.light_show_settings;
        }
        if ((i11 & 4) != 0) {
            bool = d0Var.light_show_active;
        }
        if ((i11 & 8) != 0) {
            str = d0Var.light_show_selected_name;
        }
        if ((i11 & 16) != 0) {
            l11 = d0Var.light_show_start_time;
        }
        if ((i11 & 32) != 0) {
            kVar = d0Var.unknownFields();
        }
        Long l12 = l11;
        okio.k kVar2 = kVar;
        return d0Var.a(instant, c0Var, bool, str, l12, kVar2);
    }

    public final d0 a(Instant timestamp, c0 light_show_settings, Boolean light_show_active, String light_show_selected_name, Long light_show_start_time, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new d0(timestamp, light_show_settings, light_show_active, light_show_selected_name, light_show_start_time, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getLight_show_active() {
        return this.light_show_active;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLight_show_selected_name() {
        return this.light_show_selected_name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c0 getLight_show_settings() {
        return this.light_show_settings;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), d0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.timestamp, d0Var.timestamp) && p013kotlin.jvm.internal.s.f(this.light_show_settings, d0Var.light_show_settings) && p013kotlin.jvm.internal.s.f(this.light_show_active, d0Var.light_show_active) && p013kotlin.jvm.internal.s.f(this.light_show_selected_name, d0Var.light_show_selected_name) && p013kotlin.jvm.internal.s.f(this.light_show_start_time, d0Var.light_show_start_time);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getLight_show_start_time() {
        return this.light_show_start_time;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
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
        c0 c0Var = this.light_show_settings;
        int iHashCode3 = (iHashCode2 + (c0Var != null ? c0Var.hashCode() : 0)) * 37;
        Boolean bool = this.light_show_active;
        int iHashCode4 = (iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 37;
        String str = this.light_show_selected_name;
        int iHashCode5 = (iHashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        Long l11 = this.light_show_start_time;
        int iHashCode6 = iHashCode5 + (l11 != null ? l11.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m394newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        c0 c0Var = this.light_show_settings;
        if (c0Var != null) {
            arrayList.add("light_show_settings=" + c0Var);
        }
        Boolean bool = this.light_show_active;
        if (bool != null) {
            arrayList.add("light_show_active=" + bool);
        }
        String str = this.light_show_selected_name;
        if (str != null) {
            arrayList.add("light_show_selected_name=" + x20.d.i(str));
        }
        Long l11 = this.light_show_start_time;
        if (l11 != null) {
            arrayList.add("light_show_start_time=" + l11);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "LightShowState{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ d0(Instant instant, c0 c0Var, Boolean bool, String str, Long l11, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : instant, (i11 & 2) != 0 ? null : c0Var, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : l11, (i11 & 32) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m394newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Instant instant, c0 c0Var, Boolean bool, String str, Long l11, okio.k unknownFields) {
        super(f67995g, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.timestamp = instant;
        this.light_show_settings = c0Var;
        this.light_show_active = bool;
        this.light_show_selected_name = str;
        this.light_show_start_time = l11;
    }
}
