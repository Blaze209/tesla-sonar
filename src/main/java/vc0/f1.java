package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB?\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lvc0/f1;", "Lcom/squareup/wire/f;", "", "Lvc0/g1;", "informationRequestType", "Lvc0/i1;", "keyId", "Lokio/k;", "publicKey", "", "slot", "unknownFields", "<init>", "(Lvc0/g1;Lvc0/i1;Lokio/k;Ljava/lang/Integer;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/g1;Lvc0/i1;Lokio/k;Ljava/lang/Integer;Lokio/k;)Lvc0/f1;", "Lvc0/g1;", "c", "()Lvc0/g1;", "b", "Lvc0/i1;", DateTokenConverter.CONVERTER_KEY, "()Lvc0/i1;", "Lokio/k;", "e", "()Lokio/k;", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f1 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<f1> f118690f = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(f1.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.InformationRequestType#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final g1 informationRequestType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyIdentifier#ADAPTER", tag = 2)
    private final i1 keyId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 3)
    private final okio.k publicKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 4)
    private final Integer slot;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/f1$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/f1;", "value", "", "c", "(Lvc0/f1;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/f1;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/f1;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/f1;)Lvc0/f1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<f1> {
        a(com.squareup.wire.b bVar, co0.d<f1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.InformationRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f1 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            g1 g1VarDecode = g1.INFORMATION_REQUEST_TYPE_GET_STATUS;
            long jD = reader.d();
            i1 i1VarDecode = null;
            okio.k kVarDecode = null;
            Integer numDecode = null;
            while (true) {
                g1 g1Var = g1VarDecode;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new f1(g1Var, i1VarDecode, kVarDecode, numDecode, reader.e(jD));
                    }
                    if (iG == 1) {
                        try {
                            g1VarDecode = g1.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                        }
                    } else if (iG == 2) {
                        i1VarDecode = i1.f118747c.decode(reader);
                    } else if (iG == 3) {
                        kVarDecode = ProtoAdapter.BYTES.decode(reader);
                    } else if (iG != 4) {
                        reader.m(iG);
                    } else {
                        numDecode = ProtoAdapter.UINT32.decode(reader);
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, f1 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getInformationRequestType() != g1.INFORMATION_REQUEST_TYPE_GET_STATUS) {
                g1.ADAPTER.encodeWithTag(writer, 1, value.getInformationRequestType());
            }
            i1.f118747c.encodeWithTag(writer, 2, value.getKeyId());
            ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.getPublicKey());
            ProtoAdapter.UINT32.encodeWithTag(writer, 4, value.getSlot());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(f1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getInformationRequestType() != g1.INFORMATION_REQUEST_TYPE_GET_STATUS) {
                iD += g1.ADAPTER.encodedSizeWithTag(1, value.getInformationRequestType());
            }
            return iD + i1.f118747c.encodedSizeWithTag(2, value.getKeyId()) + ProtoAdapter.BYTES.encodedSizeWithTag(3, value.getPublicKey()) + ProtoAdapter.UINT32.encodedSizeWithTag(4, value.getSlot());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public f1 redact(f1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            i1 keyId = value.getKeyId();
            return f1.b(value, null, keyId != null ? i1.f118747c.redact(keyId) : null, null, null, okio.k.f97943e, 13, null);
        }
    }

    public f1() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ f1 b(f1 f1Var, g1 g1Var, i1 i1Var, okio.k kVar, Integer num, okio.k kVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            g1Var = f1Var.informationRequestType;
        }
        if ((i11 & 2) != 0) {
            i1Var = f1Var.keyId;
        }
        if ((i11 & 4) != 0) {
            kVar = f1Var.publicKey;
        }
        if ((i11 & 8) != 0) {
            num = f1Var.slot;
        }
        if ((i11 & 16) != 0) {
            kVar2 = f1Var.unknownFields();
        }
        okio.k kVar3 = kVar2;
        okio.k kVar4 = kVar;
        return f1Var.a(g1Var, i1Var, kVar4, num, kVar3);
    }

    public final f1 a(g1 informationRequestType, i1 keyId, okio.k publicKey, Integer slot, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(informationRequestType, "informationRequestType");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new f1(informationRequestType, keyId, publicKey, slot, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g1 getInformationRequestType() {
        return this.informationRequestType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i1 getKeyId() {
        return this.keyId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final okio.k getPublicKey() {
        return this.publicKey;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), f1Var.unknownFields()) && this.informationRequestType == f1Var.informationRequestType && p013kotlin.jvm.internal.s.f(this.keyId, f1Var.keyId) && p013kotlin.jvm.internal.s.f(this.publicKey, f1Var.publicKey) && p013kotlin.jvm.internal.s.f(this.slot, f1Var.slot);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getSlot() {
        return this.slot;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.informationRequestType.hashCode()) * 37;
        i1 i1Var = this.keyId;
        int iHashCode2 = (iHashCode + (i1Var != null ? i1Var.hashCode() : 0)) * 37;
        okio.k kVar = this.publicKey;
        int iHashCode3 = (iHashCode2 + (kVar != null ? kVar.hashCode() : 0)) * 37;
        Integer num = this.slot;
        int iHashCode4 = iHashCode3 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m799newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("informationRequestType=" + this.informationRequestType);
        i1 i1Var = this.keyId;
        if (i1Var != null) {
            arrayList.add("keyId=" + i1Var);
        }
        okio.k kVar = this.publicKey;
        if (kVar != null) {
            arrayList.add("publicKey=" + kVar);
        }
        Integer num = this.slot;
        if (num != null) {
            arrayList.add("slot=" + num);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "InformationRequest{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ f1(g1 g1Var, i1 i1Var, okio.k kVar, Integer num, okio.k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? g1.INFORMATION_REQUEST_TYPE_GET_STATUS : g1Var, (i11 & 2) != 0 ? null : i1Var, (i11 & 4) != 0 ? null : kVar, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? okio.k.f97943e : kVar2);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m799newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1 informationRequestType, i1 i1Var, okio.k kVar, Integer num, okio.k unknownFields) {
        super(f118690f, unknownFields);
        p013kotlin.jvm.internal.s.k(informationRequestType, "informationRequestType");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.informationRequestType = informationRequestType;
        this.keyId = i1Var;
        this.publicKey = kVar;
        this.slot = num;
        if (x20.d.d(i1Var, kVar, num) > 1) {
            throw new IllegalArgumentException("At most one of keyId, publicKey, slot may be non-null");
        }
    }
}
