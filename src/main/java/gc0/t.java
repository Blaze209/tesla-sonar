package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Lgc0/t;", "Lcom/squareup/wire/f;", "", "", "delete_dashcam_clips_available", "format_usb_available", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/k;)Lgc0/t;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "b", DateTokenConverter.CONVERTER_KEY, "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<t> f68449d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(t.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "deleteDashcamClipsAvailable", tag = 1)
    private final Boolean delete_dashcam_clips_available;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "formatUsbAvailable", tag = 2)
    private final Boolean format_usb_available;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/t$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/t;", "value", "", "c", "(Lgc0/t;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/t;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/t;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/t;)Lgc0/t;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<t> {
        a(com.squareup.wire.b bVar, co0.d<t> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.DashcamUtils", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            Boolean boolDecode = null;
            Boolean boolDecode2 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new t(boolDecode, boolDecode2, reader.e(jD));
                }
                if (iG == 1) {
                    boolDecode = ProtoAdapter.BOOL.decode(reader);
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, t value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(writer, 1, value.getDelete_dashcam_clips_available());
            protoAdapter.encodeWithTag(writer, 2, value.getFormat_usb_available());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(t value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iD + protoAdapter.encodedSizeWithTag(1, value.getDelete_dashcam_clips_available()) + protoAdapter.encodedSizeWithTag(2, value.getFormat_usb_available());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public t redact(t value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return t.b(value, null, null, okio.k.f97943e, 3, null);
        }
    }

    public t() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ t b(t tVar, Boolean bool, Boolean bool2, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = tVar.delete_dashcam_clips_available;
        }
        if ((i11 & 2) != 0) {
            bool2 = tVar.format_usb_available;
        }
        if ((i11 & 4) != 0) {
            kVar = tVar.unknownFields();
        }
        return tVar.a(bool, bool2, kVar);
    }

    public final t a(Boolean delete_dashcam_clips_available, Boolean format_usb_available, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new t(delete_dashcam_clips_available, format_usb_available, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getDelete_dashcam_clips_available() {
        return this.delete_dashcam_clips_available;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getFormat_usb_available() {
        return this.format_usb_available;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof t)) {
            return false;
        }
        t tVar = (t) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), tVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.delete_dashcam_clips_available, tVar.delete_dashcam_clips_available) && p013kotlin.jvm.internal.s.f(this.format_usb_available, tVar.format_usb_available);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.delete_dashcam_clips_available;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.format_usb_available;
        int iHashCode3 = iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m437newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.delete_dashcam_clips_available;
        if (bool != null) {
            arrayList.add("delete_dashcam_clips_available=" + bool);
        }
        Boolean bool2 = this.format_usb_available;
        if (bool2 != null) {
            arrayList.add("format_usb_available=" + bool2);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "DashcamUtils{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ t(Boolean bool, Boolean bool2, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : bool2, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m437newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Boolean bool, Boolean bool2, okio.k unknownFields) {
        super(f68449d, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.delete_dashcam_clips_available = bool;
        this.format_usb_available = bool2;
    }
}
