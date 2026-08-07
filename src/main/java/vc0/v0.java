package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB3\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, d2 = {"Lvc0/v0;", "Lcom/squareup/wire/f;", "", "", "sessionId", "Lvc0/t0;", "firaSessionData", "Lvc0/o0;", "errorCode", "Lokio/k;", "unknownFields", "<init>", "(ILvc0/t0;Lvc0/o0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ILvc0/t0;Lvc0/o0;Lokio/k;)Lvc0/v0;", "I", "e", "b", "Lvc0/t0;", DateTokenConverter.CONVERTER_KEY, "()Lvc0/t0;", "c", "Lvc0/o0;", "()Lvc0/o0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<v0> f118946e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(v0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final int sessionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.FiraSessionData#ADAPTER", tag = 2)
    private final t0 firaSessionData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.FiraError_E#ADAPTER", tag = 3)
    private final o0 errorCode;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/v0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/v0;", "value", "", "c", "(Lvc0/v0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/v0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/v0;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/v0;)Lvc0/v0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<v0> {
        a(com.squareup.wire.b bVar, co0.d<v0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.FiraSessionResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public v0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            int iIntValue = 0;
            t0 t0VarDecode = null;
            o0 o0VarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new v0(iIntValue, t0VarDecode, o0VarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (iG == 2) {
                    t0VarDecode = t0.f118916g.decode(reader);
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    try {
                        o0VarDecode = o0.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, v0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getSessionId() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.getSessionId()));
            }
            t0.f118916g.encodeWithTag(writer, 2, value.getFiraSessionData());
            o0.ADAPTER.encodeWithTag(writer, 3, value.getErrorCode());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(v0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getSessionId() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.getSessionId()));
            }
            return iD + t0.f118916g.encodedSizeWithTag(2, value.getFiraSessionData()) + o0.ADAPTER.encodedSizeWithTag(3, value.getErrorCode());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public v0 redact(v0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            t0 firaSessionData = value.getFiraSessionData();
            return v0.b(value, 0, firaSessionData != null ? t0.f118916g.redact(firaSessionData) : null, null, okio.k.f97943e, 5, null);
        }
    }

    public v0() {
        this(0, null, null, null, 15, null);
    }

    public static /* synthetic */ v0 b(v0 v0Var, int i11, t0 t0Var, o0 o0Var, okio.k kVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = v0Var.sessionId;
        }
        if ((i12 & 2) != 0) {
            t0Var = v0Var.firaSessionData;
        }
        if ((i12 & 4) != 0) {
            o0Var = v0Var.errorCode;
        }
        if ((i12 & 8) != 0) {
            kVar = v0Var.unknownFields();
        }
        return v0Var.a(i11, t0Var, o0Var, kVar);
    }

    public final v0 a(int sessionId, t0 firaSessionData, o0 errorCode, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new v0(sessionId, firaSessionData, errorCode, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final o0 getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final t0 getFiraSessionData() {
        return this.firaSessionData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getSessionId() {
        return this.sessionId;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), v0Var.unknownFields()) && this.sessionId == v0Var.sessionId && p013kotlin.jvm.internal.s.f(this.firaSessionData, v0Var.firaSessionData) && this.errorCode == v0Var.errorCode;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Integer.hashCode(this.sessionId)) * 37;
        t0 t0Var = this.firaSessionData;
        int iHashCode2 = (iHashCode + (t0Var != null ? t0Var.hashCode() : 0)) * 37;
        o0 o0Var = this.errorCode;
        int iHashCode3 = iHashCode2 + (o0Var != null ? o0Var.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m844newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sessionId=" + this.sessionId);
        t0 t0Var = this.firaSessionData;
        if (t0Var != null) {
            arrayList.add("firaSessionData=" + t0Var);
        }
        o0 o0Var = this.errorCode;
        if (o0Var != null) {
            arrayList.add("errorCode=" + o0Var);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "FiraSessionResponse{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ v0(int i11, t0 t0Var, o0 o0Var, okio.k kVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? null : t0Var, (i12 & 4) != 0 ? null : o0Var, (i12 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m844newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(int i11, t0 t0Var, o0 o0Var, okio.k unknownFields) {
        super(f118946e, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.sessionId = i11;
        this.firaSessionData = t0Var;
        this.errorCode = o0Var;
        if (x20.d.c(t0Var, o0Var) > 1) {
            throw new IllegalArgumentException("At most one of firaSessionData, errorCode may be non-null");
        }
    }
}
