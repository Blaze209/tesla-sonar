package ec0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lec0/f;", "Lcom/squareup/wire/f;", "", "Lec0/g;", "alert_name", "Lec0/h;", "alert_type", "Lokio/k;", "unknownFields", "<init>", "(Lec0/g;Lec0/h;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/g;Lec0/h;Lokio/k;)Lec0/f;", "Lec0/g;", "c", "()Lec0/g;", "b", "Lec0/h;", DateTokenConverter.CONVERTER_KEY, "()Lec0/h;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<f> f62604d = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(f.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.ChargingAlertName#ADAPTER", jsonName = "alertName", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final g alert_name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.ChargingAlertType#ADAPTER", jsonName = "alertType", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final h alert_type;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ec0/f$a", "Lcom/squareup/wire/ProtoAdapter;", "Lec0/f;", "value", "", "c", "(Lec0/f;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lec0/f;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lec0/f;", DateTokenConverter.CONVERTER_KEY, "(Lec0/f;)Lec0/f;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<f> {
        a(com.squareup.wire.b bVar, co0.d<f> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ChargingAlert", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            g gVarDecode = g.INVALID_ALERT_NAME;
            h hVarDecode = h.INVALID_ALERT_TYPE;
            long jD = reader.d();
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new f(gVarDecode, hVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        gVarDecode = g.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    try {
                        hVarDecode = h.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, f value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getAlert_name() != g.INVALID_ALERT_NAME) {
                g.ADAPTER.encodeWithTag(writer, 1, value.getAlert_name());
            }
            if (value.getAlert_type() != h.INVALID_ALERT_TYPE) {
                h.ADAPTER.encodeWithTag(writer, 2, value.getAlert_type());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(f value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getAlert_name() != g.INVALID_ALERT_NAME) {
                iD += g.ADAPTER.encodedSizeWithTag(1, value.getAlert_name());
            }
            return value.getAlert_type() != h.INVALID_ALERT_TYPE ? iD + h.ADAPTER.encodedSizeWithTag(2, value.getAlert_type()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public f redact(f value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return f.b(value, null, null, okio.k.f97943e, 3, null);
        }
    }

    public f() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ f b(f fVar, g gVar, h hVar, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = fVar.alert_name;
        }
        if ((i11 & 2) != 0) {
            hVar = fVar.alert_type;
        }
        if ((i11 & 4) != 0) {
            kVar = fVar.unknownFields();
        }
        return fVar.a(gVar, hVar, kVar);
    }

    public final f a(g alert_name, h alert_type, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(alert_name, "alert_name");
        p013kotlin.jvm.internal.s.k(alert_type, "alert_type");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new f(alert_name, alert_type, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getAlert_name() {
        return this.alert_name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h getAlert_type() {
        return this.alert_type;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), fVar.unknownFields()) && this.alert_name == fVar.alert_name && this.alert_type == fVar.alert_type;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.alert_name.hashCode()) * 37) + this.alert_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m143newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("alert_name=" + this.alert_name);
        arrayList.add("alert_type=" + this.alert_type);
        return p013kotlin.collections.v.y0(arrayList, ", ", "ChargingAlert{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ f(g gVar, h hVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? g.INVALID_ALERT_NAME : gVar, (i11 & 2) != 0 ? h.INVALID_ALERT_TYPE : hVar, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m143newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g alert_name, h alert_type, okio.k unknownFields) {
        super(f62604d, unknownFields);
        p013kotlin.jvm.internal.s.k(alert_name, "alert_name");
        p013kotlin.jvm.internal.s.k(alert_type, "alert_type");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.alert_name = alert_name;
        this.alert_type = alert_type;
    }
}
