package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB1\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, d2 = {"Lvc0/p3;", "Lcom/squareup/wire/f;", "", "Lvc0/o3;", "whitelistOperationInformation", "Lvc0/i1;", "signerOfOperation", "Lvc0/c2;", "operationStatus", "Lokio/k;", "unknownFields", "<init>", "(Lvc0/o3;Lvc0/i1;Lvc0/c2;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/o3;Lvc0/i1;Lvc0/c2;Lokio/k;)Lvc0/p3;", "Lvc0/o3;", "e", "()Lvc0/o3;", "b", "Lvc0/i1;", DateTokenConverter.CONVERTER_KEY, "()Lvc0/i1;", "c", "Lvc0/c2;", "()Lvc0/c2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p3 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<p3> f118872e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(p3.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.WhitelistOperation_information_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final o3 whitelistOperationInformation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyIdentifier#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final i1 signerOfOperation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.OperationStatus_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final c2 operationStatus;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/p3$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/p3;", "value", "", "c", "(Lvc0/p3;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/p3;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/p3;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/p3;)Lvc0/p3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<p3> {
        a(com.squareup.wire.b bVar, co0.d<p3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.WhitelistOperation_status", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p3 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            o3 o3VarDecode = o3.WHITELISTOPERATION_INFORMATION_NONE;
            c2 c2VarDecode = c2.OPERATIONSTATUS_OK;
            long jD = reader.d();
            i1 i1VarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new p3(o3VarDecode, i1VarDecode, c2VarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        o3VarDecode = o3.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG == 2) {
                    i1VarDecode = i1.f118747c.decode(reader);
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    try {
                        c2VarDecode = c2.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, p3 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getWhitelistOperationInformation() != o3.WHITELISTOPERATION_INFORMATION_NONE) {
                o3.ADAPTER.encodeWithTag(writer, 1, value.getWhitelistOperationInformation());
            }
            if (value.getSignerOfOperation() != null) {
                i1.f118747c.encodeWithTag(writer, 2, value.getSignerOfOperation());
            }
            if (value.getOperationStatus() != c2.OPERATIONSTATUS_OK) {
                c2.ADAPTER.encodeWithTag(writer, 3, value.getOperationStatus());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(p3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getWhitelistOperationInformation() != o3.WHITELISTOPERATION_INFORMATION_NONE) {
                iD += o3.ADAPTER.encodedSizeWithTag(1, value.getWhitelistOperationInformation());
            }
            if (value.getSignerOfOperation() != null) {
                iD += i1.f118747c.encodedSizeWithTag(2, value.getSignerOfOperation());
            }
            return value.getOperationStatus() != c2.OPERATIONSTATUS_OK ? iD + c2.ADAPTER.encodedSizeWithTag(3, value.getOperationStatus()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public p3 redact(p3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            i1 signerOfOperation = value.getSignerOfOperation();
            return p3.b(value, null, signerOfOperation != null ? i1.f118747c.redact(signerOfOperation) : null, null, okio.k.f97943e, 5, null);
        }
    }

    public p3() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ p3 b(p3 p3Var, o3 o3Var, i1 i1Var, c2 c2Var, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            o3Var = p3Var.whitelistOperationInformation;
        }
        if ((i11 & 2) != 0) {
            i1Var = p3Var.signerOfOperation;
        }
        if ((i11 & 4) != 0) {
            c2Var = p3Var.operationStatus;
        }
        if ((i11 & 8) != 0) {
            kVar = p3Var.unknownFields();
        }
        return p3Var.a(o3Var, i1Var, c2Var, kVar);
    }

    public final p3 a(o3 whitelistOperationInformation, i1 signerOfOperation, c2 operationStatus, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(whitelistOperationInformation, "whitelistOperationInformation");
        p013kotlin.jvm.internal.s.k(operationStatus, "operationStatus");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new p3(whitelistOperationInformation, signerOfOperation, operationStatus, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c2 getOperationStatus() {
        return this.operationStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i1 getSignerOfOperation() {
        return this.signerOfOperation;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final o3 getWhitelistOperationInformation() {
        return this.whitelistOperationInformation;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), p3Var.unknownFields()) && this.whitelistOperationInformation == p3Var.whitelistOperationInformation && p013kotlin.jvm.internal.s.f(this.signerOfOperation, p3Var.signerOfOperation) && this.operationStatus == p3Var.operationStatus;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.whitelistOperationInformation.hashCode()) * 37;
        i1 i1Var = this.signerOfOperation;
        int iHashCode2 = ((iHashCode + (i1Var != null ? i1Var.hashCode() : 0)) * 37) + this.operationStatus.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m827newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("whitelistOperationInformation=" + this.whitelistOperationInformation);
        i1 i1Var = this.signerOfOperation;
        if (i1Var != null) {
            arrayList.add("signerOfOperation=" + i1Var);
        }
        arrayList.add("operationStatus=" + this.operationStatus);
        return p013kotlin.collections.v.y0(arrayList, ", ", "WhitelistOperation_status{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ p3(o3 o3Var, i1 i1Var, c2 c2Var, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? o3.WHITELISTOPERATION_INFORMATION_NONE : o3Var, (i11 & 2) != 0 ? null : i1Var, (i11 & 4) != 0 ? c2.OPERATIONSTATUS_OK : c2Var, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m827newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(o3 whitelistOperationInformation, i1 i1Var, c2 operationStatus, okio.k unknownFields) {
        super(f118872e, unknownFields);
        p013kotlin.jvm.internal.s.k(whitelistOperationInformation, "whitelistOperationInformation");
        p013kotlin.jvm.internal.s.k(operationStatus, "operationStatus");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.whitelistOperationInformation = whitelistOperationInformation;
        this.signerOfOperation = i1Var;
        this.operationStatus = operationStatus;
    }
}
