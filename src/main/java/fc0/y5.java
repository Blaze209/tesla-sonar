package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB'\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016¨\u0006\u001f"}, d2 = {"Lfc0/y5;", "Lcom/squareup/wire/f;", "", "Lfc0/a3;", "piiKeyResponse", "", AnalyticsAttribute.Error, "Lokio/k;", "unknownFields", "<init>", "(Lfc0/a3;Ljava/lang/String;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Lfc0/a3;Ljava/lang/String;Lokio/k;)Lfc0/y5;", "Lfc0/a3;", DateTokenConverter.CONVERTER_KEY, "()Lfc0/a3;", "b", "Ljava/lang/String;", "c", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y5 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<y5> f65634d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(y5.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.PiiKeyResponse#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final a3 piiKeyResponse;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final String error;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/y5$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/y5;", "value", "", "c", "(Lfc0/y5;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/y5;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/y5;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/y5;)Lfc0/y5;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<y5> {
        a(com.squareup.wire.b bVar, co0.d<y5> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleDataSubscriptionResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public y5 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            a3 a3VarDecode = null;
            String strDecode = "";
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new y5(a3VarDecode, strDecode, reader.e(jD));
                }
                if (iG == 3) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iG != 4) {
                    reader.m(iG);
                } else {
                    a3VarDecode = a3.f64864e.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, y5 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getPiiKeyResponse() != null) {
                a3.f64864e.encodeWithTag(writer, 4, value.getPiiKeyResponse());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getError(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getError());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(y5 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getPiiKeyResponse() != null) {
                iD += a3.f64864e.encodedSizeWithTag(4, value.getPiiKeyResponse());
            }
            return !p013kotlin.jvm.internal.s.f(value.getError(), "") ? iD + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getError()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public y5 redact(y5 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            a3 piiKeyResponse = value.getPiiKeyResponse();
            return y5.b(value, piiKeyResponse != null ? a3.f64864e.redact(piiKeyResponse) : null, null, okio.k.f97943e, 2, null);
        }
    }

    public y5() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ y5 b(y5 y5Var, a3 a3Var, String str, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            a3Var = y5Var.piiKeyResponse;
        }
        if ((i11 & 2) != 0) {
            str = y5Var.error;
        }
        if ((i11 & 4) != 0) {
            kVar = y5Var.unknownFields();
        }
        return y5Var.a(a3Var, str, kVar);
    }

    public final y5 a(a3 piiKeyResponse, String error, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new y5(piiKeyResponse, error, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a3 getPiiKeyResponse() {
        return this.piiKeyResponse;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof y5)) {
            return false;
        }
        y5 y5Var = (y5) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), y5Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.piiKeyResponse, y5Var.piiKeyResponse) && p013kotlin.jvm.internal.s.f(this.error, y5Var.error);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        a3 a3Var = this.piiKeyResponse;
        int iHashCode2 = ((iHashCode + (a3Var != null ? a3Var.hashCode() : 0)) * 37) + this.error.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m377newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        a3 a3Var = this.piiKeyResponse;
        if (a3Var != null) {
            arrayList.add("piiKeyResponse=" + a3Var);
        }
        arrayList.add("error=" + x20.d.i(this.error));
        return p013kotlin.collections.v.y0(arrayList, ", ", "VehicleDataSubscriptionResponse{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ y5(a3 a3Var, String str, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : a3Var, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m377newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(a3 a3Var, String error, okio.k unknownFields) {
        super(f65634d, unknownFields);
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.piiKeyResponse = a3Var;
        this.error = error;
    }
}
