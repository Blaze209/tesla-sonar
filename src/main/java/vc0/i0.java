package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB3\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lvc0/i0;", "Lcom/squareup/wire/f;", "", "Lvc0/c2;", "operationStatus", "Lvc0/y2;", "signedMessageStatus", "Lvc0/p3;", "whitelistOperationStatus", "Lokio/k;", "unknownFields", "<init>", "(Lvc0/c2;Lvc0/y2;Lvc0/p3;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/c2;Lvc0/y2;Lvc0/p3;Lokio/k;)Lvc0/i0;", "Lvc0/c2;", "c", "()Lvc0/c2;", "b", "Lvc0/y2;", DateTokenConverter.CONVERTER_KEY, "()Lvc0/y2;", "Lvc0/p3;", "e", "()Lvc0/p3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<i0> f118742e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(i0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.OperationStatus_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final c2 operationStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.SignedMessage_status#ADAPTER", tag = 2)
    private final y2 signedMessageStatus;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.WhitelistOperation_status#ADAPTER", tag = 3)
    private final p3 whitelistOperationStatus;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/i0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/i0;", "value", "", "c", "(Lvc0/i0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/i0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/i0;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/i0;)Lvc0/i0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<i0> {
        a(com.squareup.wire.b bVar, co0.d<i0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.CommandStatus", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            c2 c2VarDecode = c2.OPERATIONSTATUS_OK;
            long jD = reader.d();
            y2 y2VarDecode = null;
            p3 p3VarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new i0(c2VarDecode, y2VarDecode, p3VarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        c2VarDecode = c2.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG == 2) {
                    y2VarDecode = y2.f119000d.decode(reader);
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    p3VarDecode = p3.f118872e.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, i0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getOperationStatus() != c2.OPERATIONSTATUS_OK) {
                c2.ADAPTER.encodeWithTag(writer, 1, value.getOperationStatus());
            }
            y2.f119000d.encodeWithTag(writer, 2, value.getSignedMessageStatus());
            p3.f118872e.encodeWithTag(writer, 3, value.getWhitelistOperationStatus());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(i0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getOperationStatus() != c2.OPERATIONSTATUS_OK) {
                iD += c2.ADAPTER.encodedSizeWithTag(1, value.getOperationStatus());
            }
            return iD + y2.f119000d.encodedSizeWithTag(2, value.getSignedMessageStatus()) + p3.f118872e.encodedSizeWithTag(3, value.getWhitelistOperationStatus());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public i0 redact(i0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            y2 signedMessageStatus = value.getSignedMessageStatus();
            y2 y2VarRedact = signedMessageStatus != null ? y2.f119000d.redact(signedMessageStatus) : null;
            p3 whitelistOperationStatus = value.getWhitelistOperationStatus();
            return i0.b(value, null, y2VarRedact, whitelistOperationStatus != null ? p3.f118872e.redact(whitelistOperationStatus) : null, okio.k.f97943e, 1, null);
        }
    }

    public i0() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ i0 b(i0 i0Var, c2 c2Var, y2 y2Var, p3 p3Var, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c2Var = i0Var.operationStatus;
        }
        if ((i11 & 2) != 0) {
            y2Var = i0Var.signedMessageStatus;
        }
        if ((i11 & 4) != 0) {
            p3Var = i0Var.whitelistOperationStatus;
        }
        if ((i11 & 8) != 0) {
            kVar = i0Var.unknownFields();
        }
        return i0Var.a(c2Var, y2Var, p3Var, kVar);
    }

    public final i0 a(c2 operationStatus, y2 signedMessageStatus, p3 whitelistOperationStatus, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(operationStatus, "operationStatus");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new i0(operationStatus, signedMessageStatus, whitelistOperationStatus, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c2 getOperationStatus() {
        return this.operationStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final y2 getSignedMessageStatus() {
        return this.signedMessageStatus;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final p3 getWhitelistOperationStatus() {
        return this.whitelistOperationStatus;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), i0Var.unknownFields()) && this.operationStatus == i0Var.operationStatus && p013kotlin.jvm.internal.s.f(this.signedMessageStatus, i0Var.signedMessageStatus) && p013kotlin.jvm.internal.s.f(this.whitelistOperationStatus, i0Var.whitelistOperationStatus);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.operationStatus.hashCode()) * 37;
        y2 y2Var = this.signedMessageStatus;
        int iHashCode2 = (iHashCode + (y2Var != null ? y2Var.hashCode() : 0)) * 37;
        p3 p3Var = this.whitelistOperationStatus;
        int iHashCode3 = iHashCode2 + (p3Var != null ? p3Var.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m806newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("operationStatus=" + this.operationStatus);
        y2 y2Var = this.signedMessageStatus;
        if (y2Var != null) {
            arrayList.add("signedMessageStatus=" + y2Var);
        }
        p3 p3Var = this.whitelistOperationStatus;
        if (p3Var != null) {
            arrayList.add("whitelistOperationStatus=" + p3Var);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "CommandStatus{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ i0(c2 c2Var, y2 y2Var, p3 p3Var, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? c2.OPERATIONSTATUS_OK : c2Var, (i11 & 2) != 0 ? null : y2Var, (i11 & 4) != 0 ? null : p3Var, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m806newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(c2 operationStatus, y2 y2Var, p3 p3Var, okio.k unknownFields) {
        super(f118742e, unknownFields);
        p013kotlin.jvm.internal.s.k(operationStatus, "operationStatus");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.operationStatus = operationStatus;
        this.signedMessageStatus = y2Var;
        this.whitelistOperationStatus = p3Var;
        if (x20.d.c(y2Var, p3Var) > 1) {
            throw new IllegalArgumentException("At most one of signedMessageStatus, whitelistOperationStatus may be non-null");
        }
    }
}
