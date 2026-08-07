package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB3\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, d2 = {"Lvc0/v1;", "Lcom/squareup/wire/f;", "", "Lvc0/t;", "sessionId", "Lvc0/s1;", "VCSEC_NIConfigurationData", "Lvc0/t1;", "errorCode", "Lokio/k;", "unknownFields", "<init>", "(Lvc0/t;Lvc0/s1;Lvc0/t1;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/t;Lvc0/s1;Lvc0/t1;Lokio/k;)Lvc0/v1;", "Lvc0/t;", DateTokenConverter.CONVERTER_KEY, "()Lvc0/t;", "b", "Lvc0/s1;", "e", "()Lvc0/s1;", "c", "Lvc0/t1;", "()Lvc0/t1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v1 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<v1> f118951e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(v1.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.BLEEndpoint_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final t sessionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NIConfigurationData#ADAPTER", declaredName = "NIConfigurationData", tag = 2)
    private final s1 VCSEC_NIConfigurationData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NIError_E#ADAPTER", tag = 3)
    private final t1 errorCode;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/v1$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/v1;", "value", "", "c", "(Lvc0/v1;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/v1;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/v1;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/v1;)Lvc0/v1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<v1> {
        a(com.squareup.wire.b bVar, co0.d<v1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.NISessionResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public v1 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            t tVarDecode = t.BLE_ENDPOINT_NONE;
            long jD = reader.d();
            s1 s1VarDecode = null;
            t1 t1VarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new v1(tVarDecode, s1VarDecode, t1VarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        tVarDecode = t.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG == 2) {
                    s1VarDecode = s1.f118910c.decode(reader);
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    try {
                        t1VarDecode = t1.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, v1 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getSessionId() != t.BLE_ENDPOINT_NONE) {
                t.ADAPTER.encodeWithTag(writer, 1, value.getSessionId());
            }
            s1.f118910c.encodeWithTag(writer, 2, value.getVCSEC_NIConfigurationData());
            t1.ADAPTER.encodeWithTag(writer, 3, value.getErrorCode());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(v1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getSessionId() != t.BLE_ENDPOINT_NONE) {
                iD += t.ADAPTER.encodedSizeWithTag(1, value.getSessionId());
            }
            return iD + s1.f118910c.encodedSizeWithTag(2, value.getVCSEC_NIConfigurationData()) + t1.ADAPTER.encodedSizeWithTag(3, value.getErrorCode());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public v1 redact(v1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            s1 vCSEC_NIConfigurationData = value.getVCSEC_NIConfigurationData();
            return v1.b(value, null, vCSEC_NIConfigurationData != null ? s1.f118910c.redact(vCSEC_NIConfigurationData) : null, null, okio.k.f97943e, 5, null);
        }
    }

    public v1() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ v1 b(v1 v1Var, t tVar, s1 s1Var, t1 t1Var, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tVar = v1Var.sessionId;
        }
        if ((i11 & 2) != 0) {
            s1Var = v1Var.VCSEC_NIConfigurationData;
        }
        if ((i11 & 4) != 0) {
            t1Var = v1Var.errorCode;
        }
        if ((i11 & 8) != 0) {
            kVar = v1Var.unknownFields();
        }
        return v1Var.a(tVar, s1Var, t1Var, kVar);
    }

    public final v1 a(t sessionId, s1 VCSEC_NIConfigurationData, t1 errorCode, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(sessionId, "sessionId");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new v1(sessionId, VCSEC_NIConfigurationData, errorCode, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final t1 getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final t getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final s1 getVCSEC_NIConfigurationData() {
        return this.VCSEC_NIConfigurationData;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), v1Var.unknownFields()) && this.sessionId == v1Var.sessionId && p013kotlin.jvm.internal.s.f(this.VCSEC_NIConfigurationData, v1Var.VCSEC_NIConfigurationData) && this.errorCode == v1Var.errorCode;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.sessionId.hashCode()) * 37;
        s1 s1Var = this.VCSEC_NIConfigurationData;
        int iHashCode2 = (iHashCode + (s1Var != null ? s1Var.hashCode() : 0)) * 37;
        t1 t1Var = this.errorCode;
        int iHashCode3 = iHashCode2 + (t1Var != null ? t1Var.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m845newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sessionId=" + this.sessionId);
        s1 s1Var = this.VCSEC_NIConfigurationData;
        if (s1Var != null) {
            arrayList.add("VCSEC_NIConfigurationData=" + s1Var);
        }
        t1 t1Var = this.errorCode;
        if (t1Var != null) {
            arrayList.add("errorCode=" + t1Var);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "NISessionResponse{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ v1(t tVar, s1 s1Var, t1 t1Var, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? t.BLE_ENDPOINT_NONE : tVar, (i11 & 2) != 0 ? null : s1Var, (i11 & 4) != 0 ? null : t1Var, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m845newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(t sessionId, s1 s1Var, t1 t1Var, okio.k unknownFields) {
        super(f118951e, unknownFields);
        p013kotlin.jvm.internal.s.k(sessionId, "sessionId");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.sessionId = sessionId;
        this.VCSEC_NIConfigurationData = s1Var;
        this.errorCode = t1Var;
        if (x20.d.c(s1Var, t1Var) > 1) {
            throw new IllegalArgumentException("At most one of VCSEC_NIConfigurationData, errorCode may be non-null");
        }
    }
}
