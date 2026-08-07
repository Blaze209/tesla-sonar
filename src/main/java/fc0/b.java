package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lfc0/b;", "Lcom/squareup/wire/f;", "", "Lfc0/s2;", "result", "Lfc0/m3;", "result_reason", "Lokio/k;", "unknownFields", "<init>", "(Lfc0/s2;Lfc0/m3;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lfc0/s2;Lfc0/m3;Lokio/k;)Lfc0/b;", "Lfc0/s2;", "c", "()Lfc0/s2;", "b", "Lfc0/m3;", DateTokenConverter.CONVERTER_KEY, "()Lfc0/m3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<b> f64880d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(b.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.OperationStatus_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final s2 result;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.ResultReason#ADAPTER", jsonName = "resultReason", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final m3 result_reason;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/b$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/b;", "value", "", "c", "(Lfc0/b;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/b;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/b;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/b;)Lfc0/b;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, co0.d<b> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ActionStatus", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            s2 s2VarDecode = s2.OPERATIONSTATUS_OK;
            long jD = reader.d();
            m3 m3VarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new b(s2VarDecode, m3VarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        s2VarDecode = s2.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    m3VarDecode = m3.f65242c.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, b value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getResult() != s2.OPERATIONSTATUS_OK) {
                s2.ADAPTER.encodeWithTag(writer, 1, value.getResult());
            }
            if (value.getResult_reason() != null) {
                m3.f65242c.encodeWithTag(writer, 2, value.getResult_reason());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(b value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getResult() != s2.OPERATIONSTATUS_OK) {
                iD += s2.ADAPTER.encodedSizeWithTag(1, value.getResult());
            }
            return value.getResult_reason() != null ? iD + m3.f65242c.encodedSizeWithTag(2, value.getResult_reason()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b redact(b value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            m3 result_reason = value.getResult_reason();
            return b.b(value, null, result_reason != null ? m3.f65242c.redact(result_reason) : null, okio.k.f97943e, 1, null);
        }
    }

    public b() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ b b(b bVar, s2 s2Var, m3 m3Var, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            s2Var = bVar.result;
        }
        if ((i11 & 2) != 0) {
            m3Var = bVar.result_reason;
        }
        if ((i11 & 4) != 0) {
            kVar = bVar.unknownFields();
        }
        return bVar.a(s2Var, m3Var, kVar);
    }

    public final b a(s2 result, m3 result_reason, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(result, "result");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new b(result, result_reason, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final s2 getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final m3 getResult_reason() {
        return this.result_reason;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), bVar.unknownFields()) && this.result == bVar.result && p013kotlin.jvm.internal.s.f(this.result_reason, bVar.result_reason);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.result.hashCode()) * 37;
        m3 m3Var = this.result_reason;
        int iHashCode2 = iHashCode + (m3Var != null ? m3Var.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m202newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("result=" + this.result);
        m3 m3Var = this.result_reason;
        if (m3Var != null) {
            arrayList.add("result_reason=" + m3Var);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "ActionStatus{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ b(s2 s2Var, m3 m3Var, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? s2.OPERATIONSTATUS_OK : s2Var, (i11 & 2) != 0 ? null : m3Var, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m202newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s2 result, m3 m3Var, okio.k unknownFields) {
        super(f64880d, unknownFields);
        p013kotlin.jvm.internal.s.k(result, "result");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.result = result;
        this.result_reason = m3Var;
    }
}
