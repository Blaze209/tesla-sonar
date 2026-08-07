package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB-\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lvc0/r1;", "Lcom/squareup/wire/f;", "", "", "Lvc0/v1;", "responses", "Lvc0/i1;", "keyId", "Lokio/k;", "unknownFields", "<init>", "(Ljava/util/List;Lvc0/i1;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Ljava/util/List;Lvc0/i1;Lokio/k;)Lvc0/r1;", "Lvc0/i1;", "b", "()Lvc0/i1;", "Ljava/util/List;", "c", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r1 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<r1> f118901d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(r1.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyIdentifier#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final i1 keyId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NISessionResponse#ADAPTER", label = com.squareup.wire.q.a.REPEATED, tag = 1)
    private final List<v1> responses;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/r1$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/r1;", "value", "", "c", "(Lvc0/r1;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/r1;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/r1;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/r1;)Lvc0/r1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<r1> {
        a(com.squareup.wire.b bVar, co0.d<r1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.NIBatchResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r1 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            i1 i1VarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new r1(arrayList, i1VarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    arrayList.add(v1.f118951e.decode(reader));
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    i1VarDecode = i1.f118747c.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, r1 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            v1.f118951e.asRepeated().encodeWithTag(writer, 1, value.c());
            if (value.getKeyId() != null) {
                i1.f118747c.encodeWithTag(writer, 2, value.getKeyId());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(r1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D() + v1.f118951e.asRepeated().encodedSizeWithTag(1, value.c());
            return value.getKeyId() != null ? iD + i1.f118747c.encodedSizeWithTag(2, value.getKeyId()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public r1 redact(r1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            List<v1> listA = x20.d.a(value.c(), v1.f118951e);
            i1 keyId = value.getKeyId();
            return value.a(listA, keyId != null ? i1.f118747c.redact(keyId) : null, okio.k.f97943e);
        }
    }

    public r1() {
        this(null, null, null, 7, null);
    }

    public final r1 a(List<v1> responses, i1 keyId, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(responses, "responses");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new r1(responses, keyId, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final i1 getKeyId() {
        return this.keyId;
    }

    public final List<v1> c() {
        return this.responses;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), r1Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.responses, r1Var.responses) && p013kotlin.jvm.internal.s.f(this.keyId, r1Var.keyId);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.responses.hashCode()) * 37;
        i1 i1Var = this.keyId;
        int iHashCode2 = iHashCode + (i1Var != null ? i1Var.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m834newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.responses.isEmpty()) {
            arrayList.add("responses=" + this.responses);
        }
        i1 i1Var = this.keyId;
        if (i1Var != null) {
            arrayList.add("keyId=" + i1Var);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "NIBatchResponse{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ r1(List list, i1 i1Var, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? p013kotlin.collections.v.m() : list, (i11 & 2) != 0 ? null : i1Var, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m834newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(List<v1> responses, i1 i1Var, okio.k unknownFields) {
        super(f118901d, unknownFields);
        p013kotlin.jvm.internal.s.k(responses, "responses");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.keyId = i1Var;
        this.responses = x20.d.g("responses", responses);
    }
}
