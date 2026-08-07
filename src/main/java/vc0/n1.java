package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B5\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, d2 = {"Lvc0/n1;", "Lcom/squareup/wire/f;", "", "", "Lvc0/m1;", "keyStatuses", "Lvc0/r2;", "request_source", "Lvc0/n2;", "QR_code_status", "Lokio/k;", "unknownFields", "<init>", "(Ljava/util/List;Lvc0/r2;Lvc0/n2;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Ljava/util/List;Lvc0/r2;Lvc0/n2;Lokio/k;)Lvc0/n1;", "Lvc0/r2;", "e", "()Lvc0/r2;", "b", "Lvc0/n2;", DateTokenConverter.CONVERTER_KEY, "()Lvc0/n2;", "c", "Ljava/util/List;", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n1 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<n1> f118847e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(n1.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.RequestSource_E#ADAPTER", jsonName = "requestSource", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final r2 request_source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.QRCodeStatus_E#ADAPTER", jsonName = "QRCodeStatus", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final n2 QR_code_status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyStatus#ADAPTER", label = com.squareup.wire.q.a.REPEATED, tag = 1)
    private final List<m1> keyStatuses;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/n1$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/n1;", "value", "", "c", "(Lvc0/n1;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/n1;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/n1;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/n1;)Lvc0/n1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<n1> {
        a(com.squareup.wire.b bVar, co0.d<n1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.KeyStatusInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n1 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            r2 r2VarDecode = r2.REQUEST_SOURCE_NOT_POPULATED;
            n2 n2VarDecode = n2.QR_CODE_STATUS_UNKNOWN;
            long jD = reader.d();
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new n1(arrayList, r2VarDecode, n2VarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    arrayList.add(m1.f118826i.decode(reader));
                } else if (iG == 2) {
                    try {
                        r2VarDecode = r2.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    try {
                        n2VarDecode = n2.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, n1 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            m1.f118826i.asRepeated().encodeWithTag(writer, 1, value.c());
            if (value.getRequest_source() != r2.REQUEST_SOURCE_NOT_POPULATED) {
                r2.ADAPTER.encodeWithTag(writer, 2, value.getRequest_source());
            }
            if (value.getQR_code_status() != n2.QR_CODE_STATUS_UNKNOWN) {
                n2.ADAPTER.encodeWithTag(writer, 3, value.getQR_code_status());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(n1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D() + m1.f118826i.asRepeated().encodedSizeWithTag(1, value.c());
            if (value.getRequest_source() != r2.REQUEST_SOURCE_NOT_POPULATED) {
                iD += r2.ADAPTER.encodedSizeWithTag(2, value.getRequest_source());
            }
            return value.getQR_code_status() != n2.QR_CODE_STATUS_UNKNOWN ? iD + n2.ADAPTER.encodedSizeWithTag(3, value.getQR_code_status()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public n1 redact(n1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return n1.b(value, x20.d.a(value.c(), m1.f118826i), null, null, okio.k.f97943e, 6, null);
        }
    }

    public n1() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ n1 b(n1 n1Var, List list, r2 r2Var, n2 n2Var, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = n1Var.keyStatuses;
        }
        if ((i11 & 2) != 0) {
            r2Var = n1Var.request_source;
        }
        if ((i11 & 4) != 0) {
            n2Var = n1Var.QR_code_status;
        }
        if ((i11 & 8) != 0) {
            kVar = n1Var.unknownFields();
        }
        return n1Var.a(list, r2Var, n2Var, kVar);
    }

    public final n1 a(List<m1> keyStatuses, r2 request_source, n2 QR_code_status, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(keyStatuses, "keyStatuses");
        p013kotlin.jvm.internal.s.k(request_source, "request_source");
        p013kotlin.jvm.internal.s.k(QR_code_status, "QR_code_status");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new n1(keyStatuses, request_source, QR_code_status, unknownFields);
    }

    public final List<m1> c() {
        return this.keyStatuses;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final n2 getQR_code_status() {
        return this.QR_code_status;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final r2 getRequest_source() {
        return this.request_source;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), n1Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.keyStatuses, n1Var.keyStatuses) && this.request_source == n1Var.request_source && this.QR_code_status == n1Var.QR_code_status;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.keyStatuses.hashCode()) * 37) + this.request_source.hashCode()) * 37) + this.QR_code_status.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m824newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.keyStatuses.isEmpty()) {
            arrayList.add("keyStatuses=" + this.keyStatuses);
        }
        arrayList.add("request_source=" + this.request_source);
        arrayList.add("QR_code_status=" + this.QR_code_status);
        return p013kotlin.collections.v.y0(arrayList, ", ", "KeyStatusInfo{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ n1(List list, r2 r2Var, n2 n2Var, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? p013kotlin.collections.v.m() : list, (i11 & 2) != 0 ? r2.REQUEST_SOURCE_NOT_POPULATED : r2Var, (i11 & 4) != 0 ? n2.QR_CODE_STATUS_UNKNOWN : n2Var, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m824newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(List<m1> keyStatuses, r2 request_source, n2 QR_code_status, okio.k unknownFields) {
        super(f118847e, unknownFields);
        p013kotlin.jvm.internal.s.k(keyStatuses, "keyStatuses");
        p013kotlin.jvm.internal.s.k(request_source, "request_source");
        p013kotlin.jvm.internal.s.k(QR_code_status, "QR_code_status");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.request_source = request_source;
        this.QR_code_status = QR_code_status;
        this.keyStatuses = x20.d.g("keyStatuses", keyStatuses);
    }
}
