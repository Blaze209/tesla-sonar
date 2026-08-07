package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB'\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016¨\u0006\u001f"}, d2 = {"Lfc0/s5;", "Lcom/squareup/wire/f;", "", "Lec0/n;", "location", "", "token", "Lokio/k;", "unknownFields", "<init>", "(Lec0/n;Ljava/lang/String;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Lec0/n;Ljava/lang/String;Lokio/k;)Lfc0/s5;", "Lec0/n;", "c", "()Lec0/n;", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s5 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<s5> f65399d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(s5.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.LatLong#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final ec0.n location;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final String token;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/s5$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/s5;", "value", "", "c", "(Lfc0/s5;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/s5;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/s5;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/s5;)Lfc0/s5;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<s5> {
        a(com.squareup.wire.b bVar, co0.d<s5> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleControlTriggerHomelinkAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public s5 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            ec0.n nVarDecode = null;
            String strDecode = "";
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new s5(nVarDecode, strDecode, reader.e(jD));
                }
                if (iG == 1) {
                    nVarDecode = ec0.n.f62721d.decode(reader);
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, s5 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getLocation() != null) {
                ec0.n.f62721d.encodeWithTag(writer, 1, value.getLocation());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getToken(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getToken());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(s5 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getLocation() != null) {
                iD += ec0.n.f62721d.encodedSizeWithTag(1, value.getLocation());
            }
            return !p013kotlin.jvm.internal.s.f(value.getToken(), "") ? iD + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getToken()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public s5 redact(s5 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            ec0.n location = value.getLocation();
            return s5.b(value, location != null ? ec0.n.f62721d.redact(location) : null, null, okio.k.f97943e, 2, null);
        }
    }

    public s5() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ s5 b(s5 s5Var, ec0.n nVar, String str, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            nVar = s5Var.location;
        }
        if ((i11 & 2) != 0) {
            str = s5Var.token;
        }
        if ((i11 & 4) != 0) {
            kVar = s5Var.unknownFields();
        }
        return s5Var.a(nVar, str, kVar);
    }

    public final s5 a(ec0.n location, String token, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(token, "token");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new s5(location, token, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ec0.n getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), s5Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.location, s5Var.location) && p013kotlin.jvm.internal.s.f(this.token, s5Var.token);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ec0.n nVar = this.location;
        int iHashCode2 = ((iHashCode + (nVar != null ? nVar.hashCode() : 0)) * 37) + this.token.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m332newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ec0.n nVar = this.location;
        if (nVar != null) {
            arrayList.add("location=" + nVar);
        }
        arrayList.add("token=" + x20.d.i(this.token));
        return p013kotlin.collections.v.y0(arrayList, ", ", "VehicleControlTriggerHomelinkAction{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ s5(ec0.n nVar, String str, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : nVar, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m332newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(ec0.n nVar, String token, okio.k unknownFields) {
        super(f65399d, unknownFields);
        p013kotlin.jvm.internal.s.k(token, "token");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.location = nVar;
        this.token = token;
    }
}
