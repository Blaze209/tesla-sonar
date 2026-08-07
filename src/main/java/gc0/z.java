package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lgc0/z;", "Lcom/squareup/wire/f;", "", "", "remote_control_enabled_OBSOLETE", "remote_control_enabled", "Lokio/k;", "unknownFields", "<init>", "(ZLjava/lang/Boolean;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ZLjava/lang/Boolean;Lokio/k;)Lgc0/z;", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "b", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<z> f68729d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(z.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteControlEnabledOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final boolean remote_control_enabled_OBSOLETE;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteControlEnabled", tag = 101)
    private final Boolean remote_control_enabled;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/z$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/z;", "value", "", "c", "(Lgc0/z;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/z;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/z;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/z;)Lgc0/z;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<z> {
        a(com.squareup.wire.b bVar, co0.d<z> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.LegacyMediaState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public z decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            boolean zBooleanValue = false;
            Boolean boolDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new z(zBooleanValue, boolDecode, reader.e(jD));
                }
                if (iG == 1) {
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (iG != 101) {
                    reader.m(iG);
                } else {
                    boolDecode = ProtoAdapter.BOOL.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, z value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getRemote_control_enabled_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.getRemote_control_enabled_OBSOLETE()));
            }
            ProtoAdapter.BOOL.encodeWithTag(writer, 101, value.getRemote_control_enabled());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(z value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getRemote_control_enabled_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getRemote_control_enabled_OBSOLETE()));
            }
            return iD + ProtoAdapter.BOOL.encodedSizeWithTag(101, value.getRemote_control_enabled());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public z redact(z value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return z.b(value, false, null, okio.k.f97943e, 3, null);
        }
    }

    public z() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ z b(z zVar, boolean z11, Boolean bool, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = zVar.remote_control_enabled_OBSOLETE;
        }
        if ((i11 & 2) != 0) {
            bool = zVar.remote_control_enabled;
        }
        if ((i11 & 4) != 0) {
            kVar = zVar.unknownFields();
        }
        return zVar.a(z11, bool, kVar);
    }

    public final z a(boolean remote_control_enabled_OBSOLETE, Boolean remote_control_enabled, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new z(remote_control_enabled_OBSOLETE, remote_control_enabled, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getRemote_control_enabled() {
        return this.remote_control_enabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getRemote_control_enabled_OBSOLETE() {
        return this.remote_control_enabled_OBSOLETE;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof z)) {
            return false;
        }
        z zVar = (z) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), zVar.unknownFields()) && this.remote_control_enabled_OBSOLETE == zVar.remote_control_enabled_OBSOLETE && p013kotlin.jvm.internal.s.f(this.remote_control_enabled, zVar.remote_control_enabled);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Boolean.hashCode(this.remote_control_enabled_OBSOLETE)) * 37;
        Boolean bool = this.remote_control_enabled;
        int iHashCode2 = iHashCode + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m459newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("remote_control_enabled_OBSOLETE=" + this.remote_control_enabled_OBSOLETE);
        Boolean bool = this.remote_control_enabled;
        if (bool != null) {
            arrayList.add("remote_control_enabled=" + bool);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "LegacyMediaState{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ z(boolean z11, Boolean bool, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m459newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(boolean z11, Boolean bool, okio.k unknownFields) {
        super(f68729d, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.remote_control_enabled_OBSOLETE = z11;
        this.remote_control_enabled = bool;
    }
}
