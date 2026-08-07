package ic0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import vc0.n3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lic0/p;", "Lcom/squareup/wire/f;", "", "Lokio/k;", "sharedHMAC", "Lvc0/n3;", "whitelistOperation", "unknownFields", "<init>", "(Lokio/k;Lvc0/n3;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;Lvc0/n3;Lokio/k;)Lic0/p;", "Lokio/k;", "c", "()Lokio/k;", "b", "Lvc0/n3;", DateTokenConverter.CONVERTER_KEY, "()Lvc0/n3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<p> f77564d = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(p.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final okio.k sharedHMAC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.WhitelistOperation#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final n3 whitelistOperation;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ic0/p$a", "Lcom/squareup/wire/ProtoAdapter;", "Lic0/p;", "value", "", "c", "(Lic0/p;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lic0/p;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lic0/p;", DateTokenConverter.CONVERTER_KEY, "(Lic0/p;)Lic0/p;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<p> {
        a(com.squareup.wire.b bVar, co0.d<p> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.SharedHMACWhitelistOperation", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            okio.k kVarDecode = okio.k.f97943e;
            long jD = reader.d();
            n3 n3VarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new p(kVarDecode, n3VarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    n3VarDecode = n3.f118852o.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, p value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (!s.f(value.getSharedHMAC(), okio.k.f97943e)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getSharedHMAC());
            }
            if (value.getWhitelistOperation() != null) {
                n3.f118852o.encodeWithTag(writer, 2, value.getWhitelistOperation());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(p value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!s.f(value.getSharedHMAC(), okio.k.f97943e)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getSharedHMAC());
            }
            return value.getWhitelistOperation() != null ? iD + n3.f118852o.encodedSizeWithTag(2, value.getWhitelistOperation()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public p redact(p value) {
            s.k(value, "value");
            n3 whitelistOperation = value.getWhitelistOperation();
            return p.b(value, null, whitelistOperation != null ? n3.f118852o.redact(whitelistOperation) : null, okio.k.f97943e, 1, null);
        }
    }

    public p() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ p b(p pVar, okio.k kVar, n3 n3Var, okio.k kVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = pVar.sharedHMAC;
        }
        if ((i11 & 2) != 0) {
            n3Var = pVar.whitelistOperation;
        }
        if ((i11 & 4) != 0) {
            kVar2 = pVar.unknownFields();
        }
        return pVar.a(kVar, n3Var, kVar2);
    }

    public final p a(okio.k sharedHMAC, n3 whitelistOperation, okio.k unknownFields) {
        s.k(sharedHMAC, "sharedHMAC");
        s.k(unknownFields, "unknownFields");
        return new p(sharedHMAC, whitelistOperation, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final okio.k getSharedHMAC() {
        return this.sharedHMAC;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final n3 getWhitelistOperation() {
        return this.whitelistOperation;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof p)) {
            return false;
        }
        p pVar = (p) other;
        return s.f(unknownFields(), pVar.unknownFields()) && s.f(this.sharedHMAC, pVar.sharedHMAC) && s.f(this.whitelistOperation, pVar.whitelistOperation);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.sharedHMAC.hashCode()) * 37;
        n3 n3Var = this.whitelistOperation;
        int iHashCode2 = iHashCode + (n3Var != null ? n3Var.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m474newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sharedHMAC=" + this.sharedHMAC);
        n3 n3Var = this.whitelistOperation;
        if (n3Var != null) {
            arrayList.add("whitelistOperation=" + n3Var);
        }
        return v.y0(arrayList, ", ", "SharedHMACWhitelistOperation{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ p(okio.k kVar, n3 n3Var, okio.k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? okio.k.f97943e : kVar, (i11 & 2) != 0 ? null : n3Var, (i11 & 4) != 0 ? okio.k.f97943e : kVar2);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m474newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(okio.k sharedHMAC, n3 n3Var, okio.k unknownFields) {
        super(f77564d, unknownFields);
        s.k(sharedHMAC, "sharedHMAC");
        s.k(unknownFields, "unknownFields");
        this.sharedHMAC = sharedHMAC;
        this.whitelistOperation = n3Var;
    }
}
