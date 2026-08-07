package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JG\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b#\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001f\u0010\"¨\u0006$"}, d2 = {"Lfc0/t5;", "Lcom/squareup/wire/f;", "", "Lec0/n;", "location", "Lec0/h0;", "unknown", "vent", "close", "Lokio/k;", "unknownFields", "<init>", "(Lec0/n;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/n;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lfc0/t5;", "Lec0/n;", "c", "()Lec0/n;", "b", "Lec0/h0;", DateTokenConverter.CONVERTER_KEY, "()Lec0/h0;", "e", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t5 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<t5> f65426f = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(t5.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.LatLong#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final ec0.n location;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
    private final ec0.h0 unknown;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
    private final ec0.h0 vent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)
    private final ec0.h0 close;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/t5$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/t5;", "value", "", "c", "(Lfc0/t5;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/t5;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/t5;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/t5;)Lfc0/t5;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<t5> {
        a(com.squareup.wire.b bVar, co0.d<t5> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleControlWindowAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t5 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            ec0.n nVarDecode = null;
            ec0.h0 h0VarDecode = null;
            ec0.h0 h0VarDecode2 = null;
            ec0.h0 h0VarDecode3 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new t5(nVarDecode, h0VarDecode, h0VarDecode2, h0VarDecode3, reader.e(jD));
                }
                if (iG == 1) {
                    nVarDecode = ec0.n.f62721d.decode(reader);
                } else if (iG == 2) {
                    h0VarDecode = ec0.h0.f62622b.decode(reader);
                } else if (iG == 3) {
                    h0VarDecode2 = ec0.h0.f62622b.decode(reader);
                } else if (iG != 4) {
                    reader.m(iG);
                } else {
                    h0VarDecode3 = ec0.h0.f62622b.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, t5 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getLocation() != null) {
                ec0.n.f62721d.encodeWithTag(writer, 1, value.getLocation());
            }
            ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
            protoAdapter.encodeWithTag(writer, 2, value.getUnknown());
            protoAdapter.encodeWithTag(writer, 3, value.getVent());
            protoAdapter.encodeWithTag(writer, 4, value.getClose());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(t5 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getLocation() != null) {
                iD += ec0.n.f62721d.encodedSizeWithTag(1, value.getLocation());
            }
            ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
            return iD + protoAdapter.encodedSizeWithTag(2, value.getUnknown()) + protoAdapter.encodedSizeWithTag(3, value.getVent()) + protoAdapter.encodedSizeWithTag(4, value.getClose());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public t5 redact(t5 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            ec0.n location = value.getLocation();
            ec0.n nVarRedact = location != null ? ec0.n.f62721d.redact(location) : null;
            ec0.h0 unknown = value.getUnknown();
            ec0.h0 h0VarRedact = unknown != null ? ec0.h0.f62622b.redact(unknown) : null;
            ec0.h0 vent = value.getVent();
            ec0.h0 h0VarRedact2 = vent != null ? ec0.h0.f62622b.redact(vent) : null;
            ec0.h0 close = value.getClose();
            return value.a(nVarRedact, h0VarRedact, h0VarRedact2, close != null ? ec0.h0.f62622b.redact(close) : null, okio.k.f97943e);
        }
    }

    public t5() {
        this(null, null, null, null, null, 31, null);
    }

    public final t5 a(ec0.n location, ec0.h0 unknown, ec0.h0 vent, ec0.h0 close, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new t5(location, unknown, vent, close, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ec0.h0 getClose() {
        return this.close;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ec0.n getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ec0.h0 getUnknown() {
        return this.unknown;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ec0.h0 getVent() {
        return this.vent;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), t5Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.location, t5Var.location) && p013kotlin.jvm.internal.s.f(this.unknown, t5Var.unknown) && p013kotlin.jvm.internal.s.f(this.vent, t5Var.vent) && p013kotlin.jvm.internal.s.f(this.close, t5Var.close);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ec0.n nVar = this.location;
        int iHashCode2 = (iHashCode + (nVar != null ? nVar.hashCode() : 0)) * 37;
        ec0.h0 h0Var = this.unknown;
        int iHashCode3 = (iHashCode2 + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        ec0.h0 h0Var2 = this.vent;
        int iHashCode4 = (iHashCode3 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
        ec0.h0 h0Var3 = this.close;
        int iHashCode5 = iHashCode4 + (h0Var3 != null ? h0Var3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m340newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ec0.n nVar = this.location;
        if (nVar != null) {
            arrayList.add("location=" + nVar);
        }
        ec0.h0 h0Var = this.unknown;
        if (h0Var != null) {
            arrayList.add("unknown=" + h0Var);
        }
        ec0.h0 h0Var2 = this.vent;
        if (h0Var2 != null) {
            arrayList.add("vent=" + h0Var2);
        }
        ec0.h0 h0Var3 = this.close;
        if (h0Var3 != null) {
            arrayList.add("close=" + h0Var3);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "VehicleControlWindowAction{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ t5(ec0.n nVar, ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : nVar, (i11 & 2) != 0 ? null : h0Var, (i11 & 4) != 0 ? null : h0Var2, (i11 & 8) != 0 ? null : h0Var3, (i11 & 16) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m340newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(ec0.n nVar, ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, okio.k unknownFields) {
        super(f65426f, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.location = nVar;
        this.unknown = h0Var;
        this.vent = h0Var2;
        this.close = h0Var3;
        if (x20.d.d(h0Var, h0Var2, h0Var3) > 1) {
            throw new IllegalArgumentException("At most one of unknown, vent, close may be non-null");
        }
    }
}
