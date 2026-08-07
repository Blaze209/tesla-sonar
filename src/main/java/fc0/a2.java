package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB3\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, d2 = {"Lfc0/a2;", "Lcom/squareup/wire/f;", "", "", "public_key", "Lfc0/c2;", "manager_type", "Lec0/n;", "lat_lon", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/String;Lfc0/c2;Lec0/n;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Lfc0/c2;Lec0/n;Lokio/k;)Lfc0/a2;", "Ljava/lang/String;", "e", "b", "Lfc0/c2;", DateTokenConverter.CONVERTER_KEY, "()Lfc0/c2;", "c", "Lec0/n;", "()Lec0/n;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<a2> f64859e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(a2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "publicKey", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final String public_key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.ManagerType#ADAPTER", jsonName = "managerType", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final c2 manager_type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.LatLong#ADAPTER", jsonName = "latLon", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final ec0.n lat_lon;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/a2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/a2;", "value", "", "c", "(Lfc0/a2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/a2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/a2;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/a2;)Lfc0/a2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<a2> {
        a(com.squareup.wire.b bVar, co0.d<a2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ManagedChargingSite", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a2 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            String strDecode = "";
            c2 c2VarDecode = null;
            ec0.n nVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new a2(strDecode, c2VarDecode, nVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iG == 2) {
                    c2VarDecode = c2.f64919c.decode(reader);
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    nVarDecode = ec0.n.f62721d.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, a2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (!p013kotlin.jvm.internal.s.f(value.getPublic_key(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getPublic_key());
            }
            if (value.getManager_type() != null) {
                c2.f64919c.encodeWithTag(writer, 2, value.getManager_type());
            }
            if (value.getLat_lon() != null) {
                ec0.n.f62721d.encodeWithTag(writer, 3, value.getLat_lon());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(a2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!p013kotlin.jvm.internal.s.f(value.getPublic_key(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPublic_key());
            }
            if (value.getManager_type() != null) {
                iD += c2.f64919c.encodedSizeWithTag(2, value.getManager_type());
            }
            return value.getLat_lon() != null ? iD + ec0.n.f62721d.encodedSizeWithTag(3, value.getLat_lon()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a2 redact(a2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            c2 manager_type = value.getManager_type();
            c2 c2VarRedact = manager_type != null ? c2.f64919c.redact(manager_type) : null;
            ec0.n lat_lon = value.getLat_lon();
            return a2.b(value, null, c2VarRedact, lat_lon != null ? ec0.n.f62721d.redact(lat_lon) : null, okio.k.f97943e, 1, null);
        }
    }

    public a2() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ a2 b(a2 a2Var, String str, c2 c2Var, ec0.n nVar, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = a2Var.public_key;
        }
        if ((i11 & 2) != 0) {
            c2Var = a2Var.manager_type;
        }
        if ((i11 & 4) != 0) {
            nVar = a2Var.lat_lon;
        }
        if ((i11 & 8) != 0) {
            kVar = a2Var.unknownFields();
        }
        return a2Var.a(str, c2Var, nVar, kVar);
    }

    public final a2 a(String public_key, c2 manager_type, ec0.n lat_lon, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(public_key, "public_key");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new a2(public_key, manager_type, lat_lon, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ec0.n getLat_lon() {
        return this.lat_lon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c2 getManager_type() {
        return this.manager_type;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPublic_key() {
        return this.public_key;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), a2Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.public_key, a2Var.public_key) && p013kotlin.jvm.internal.s.f(this.manager_type, a2Var.manager_type) && p013kotlin.jvm.internal.s.f(this.lat_lon, a2Var.lat_lon);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.public_key.hashCode()) * 37;
        c2 c2Var = this.manager_type;
        int iHashCode2 = (iHashCode + (c2Var != null ? c2Var.hashCode() : 0)) * 37;
        ec0.n nVar = this.lat_lon;
        int iHashCode3 = iHashCode2 + (nVar != null ? nVar.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m197newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("public_key=" + x20.d.i(this.public_key));
        c2 c2Var = this.manager_type;
        if (c2Var != null) {
            arrayList.add("manager_type=" + c2Var);
        }
        ec0.n nVar = this.lat_lon;
        if (nVar != null) {
            arrayList.add("lat_lon=" + nVar);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "ManagedChargingSite{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ a2(String str, c2 c2Var, ec0.n nVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : c2Var, (i11 & 4) != 0 ? null : nVar, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m197newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(String public_key, c2 c2Var, ec0.n nVar, okio.k unknownFields) {
        super(f64859e, unknownFields);
        p013kotlin.jvm.internal.s.k(public_key, "public_key");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.public_key = public_key;
        this.manager_type = c2Var;
        this.lat_lon = nVar;
    }
}
