package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lvc0/w1;", "Lcom/squareup/wire/f;", "", "Lvc0/t;", "sessionId", "Lvc0/x1;", PermissionsResponse.STATUS_KEY, "Lokio/k;", "unknownFields", "<init>", "(Lvc0/t;Lvc0/x1;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/t;Lvc0/x1;Lokio/k;)Lvc0/w1;", "Lvc0/t;", "c", "()Lvc0/t;", "b", "Lvc0/x1;", DateTokenConverter.CONVERTER_KEY, "()Lvc0/x1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w1 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<w1> f118982d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(w1.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.BLEEndpoint_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final t sessionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NISessionStatus_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final x1 status;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/w1$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/w1;", "value", "", "c", "(Lvc0/w1;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/w1;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/w1;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/w1;)Lvc0/w1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<w1> {
        a(com.squareup.wire.b bVar, co0.d<w1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.NISessionStatus", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public w1 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            t tVarDecode = t.BLE_ENDPOINT_NONE;
            x1 x1VarDecode = x1.NI_SESSION_STATUS_UNKNOWN;
            long jD = reader.d();
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new w1(tVarDecode, x1VarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        tVarDecode = t.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    try {
                        x1VarDecode = x1.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, w1 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getSessionId() != t.BLE_ENDPOINT_NONE) {
                t.ADAPTER.encodeWithTag(writer, 1, value.getSessionId());
            }
            if (value.getStatus() != x1.NI_SESSION_STATUS_UNKNOWN) {
                x1.ADAPTER.encodeWithTag(writer, 2, value.getStatus());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(w1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getSessionId() != t.BLE_ENDPOINT_NONE) {
                iD += t.ADAPTER.encodedSizeWithTag(1, value.getSessionId());
            }
            return value.getStatus() != x1.NI_SESSION_STATUS_UNKNOWN ? iD + x1.ADAPTER.encodedSizeWithTag(2, value.getStatus()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public w1 redact(w1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return w1.b(value, null, null, okio.k.f97943e, 3, null);
        }
    }

    public w1() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ w1 b(w1 w1Var, t tVar, x1 x1Var, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tVar = w1Var.sessionId;
        }
        if ((i11 & 2) != 0) {
            x1Var = w1Var.status;
        }
        if ((i11 & 4) != 0) {
            kVar = w1Var.unknownFields();
        }
        return w1Var.a(tVar, x1Var, kVar);
    }

    public final w1 a(t sessionId, x1 status, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(sessionId, "sessionId");
        p013kotlin.jvm.internal.s.k(status, "status");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new w1(sessionId, status, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final t getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final x1 getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), w1Var.unknownFields()) && this.sessionId == w1Var.sessionId && this.status == w1Var.status;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.sessionId.hashCode()) * 37) + this.status.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m847newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sessionId=" + this.sessionId);
        arrayList.add("status=" + this.status);
        return p013kotlin.collections.v.y0(arrayList, ", ", "NISessionStatus{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ w1(t tVar, x1 x1Var, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? t.BLE_ENDPOINT_NONE : tVar, (i11 & 2) != 0 ? x1.NI_SESSION_STATUS_UNKNOWN : x1Var, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m847newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(t sessionId, x1 status, okio.k unknownFields) {
        super(f118982d, unknownFields);
        p013kotlin.jvm.internal.s.k(sessionId, "sessionId");
        p013kotlin.jvm.internal.s.k(status, "status");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.sessionId = sessionId;
        this.status = status;
    }
}
