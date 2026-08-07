package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BM\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJS\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b(\u0010\u001f¨\u0006)"}, d2 = {"Lvc0/w2;", "Lcom/squareup/wire/f;", "", "Lokio/k;", "token", "", "counter", "keyId", "protobufMessageAsBytes", "Lvc0/v2;", "signatureType", "signature", "unknownFields", "<init>", "(Lokio/k;ILokio/k;Lokio/k;Lvc0/v2;Lokio/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;ILokio/k;Lokio/k;Lvc0/v2;Lokio/k;Lokio/k;)Lvc0/w2;", "Lokio/k;", "h", "()Lokio/k;", "b", "I", "c", DateTokenConverter.CONVERTER_KEY, "e", "Lvc0/v2;", "g", "()Lvc0/v2;", "f", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ProtoAdapter<w2> f118986h = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(w2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final okio.k token;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final int counter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final okio.k keyId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final okio.k protobufMessageAsBytes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.SignatureType#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final v2 signatureType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final okio.k signature;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/w2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/w2;", "value", "", "c", "(Lvc0/w2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/w2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/w2;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/w2;)Lvc0/w2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<w2> {
        a(com.squareup.wire.b bVar, co0.d<w2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.SignedMessage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public w2 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            okio.k kVar = okio.k.f97943e;
            v2 v2Var = v2.SIGNATURE_TYPE_AES_GCM;
            long jD = reader.d();
            okio.k kVarDecode = kVar;
            okio.k kVarDecode2 = kVarDecode;
            v2 v2VarDecode = v2Var;
            int iIntValue = 0;
            okio.k kVarDecode3 = kVarDecode2;
            okio.k kVarDecode4 = kVarDecode3;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new w2(kVarDecode3, iIntValue, kVarDecode4, kVarDecode, v2VarDecode, kVarDecode2, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        kVarDecode3 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 2:
                        kVarDecode = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 3:
                        try {
                            v2VarDecode = v2.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                        }
                        break;
                    case 4:
                        kVarDecode2 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 5:
                        kVarDecode4 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 6:
                        iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, w2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            okio.k token = value.getToken();
            okio.k kVar = okio.k.f97943e;
            if (!p013kotlin.jvm.internal.s.f(token, kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getToken());
            }
            if (value.getCounter() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 6, Integer.valueOf(value.getCounter()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getKeyId(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 5, value.getKeyId());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getProtobufMessageAsBytes(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getProtobufMessageAsBytes());
            }
            if (value.getSignatureType() != v2.SIGNATURE_TYPE_AES_GCM) {
                v2.ADAPTER.encodeWithTag(writer, 3, value.getSignatureType());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getSignature(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 4, value.getSignature());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(w2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            okio.k token = value.getToken();
            okio.k kVar = okio.k.f97943e;
            if (!p013kotlin.jvm.internal.s.f(token, kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getToken());
            }
            if (value.getCounter() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(6, Integer.valueOf(value.getCounter()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getKeyId(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(5, value.getKeyId());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getProtobufMessageAsBytes(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getProtobufMessageAsBytes());
            }
            if (value.getSignatureType() != v2.SIGNATURE_TYPE_AES_GCM) {
                iD += v2.ADAPTER.encodedSizeWithTag(3, value.getSignatureType());
            }
            return !p013kotlin.jvm.internal.s.f(value.getSignature(), kVar) ? iD + ProtoAdapter.BYTES.encodedSizeWithTag(4, value.getSignature()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public w2 redact(w2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return w2.b(value, null, 0, null, null, null, null, okio.k.f97943e, 63, null);
        }
    }

    public w2() {
        this(null, 0, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ w2 b(w2 w2Var, okio.k kVar, int i11, okio.k kVar2, okio.k kVar3, v2 v2Var, okio.k kVar4, okio.k kVar5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            kVar = w2Var.token;
        }
        if ((i12 & 2) != 0) {
            i11 = w2Var.counter;
        }
        if ((i12 & 4) != 0) {
            kVar2 = w2Var.keyId;
        }
        if ((i12 & 8) != 0) {
            kVar3 = w2Var.protobufMessageAsBytes;
        }
        if ((i12 & 16) != 0) {
            v2Var = w2Var.signatureType;
        }
        if ((i12 & 32) != 0) {
            kVar4 = w2Var.signature;
        }
        if ((i12 & 64) != 0) {
            kVar5 = w2Var.unknownFields();
        }
        okio.k kVar6 = kVar4;
        okio.k kVar7 = kVar5;
        v2 v2Var2 = v2Var;
        okio.k kVar8 = kVar2;
        return w2Var.a(kVar, i11, kVar8, kVar3, v2Var2, kVar6, kVar7);
    }

    public final w2 a(okio.k token, int counter, okio.k keyId, okio.k protobufMessageAsBytes, v2 signatureType, okio.k signature, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(token, "token");
        p013kotlin.jvm.internal.s.k(keyId, "keyId");
        p013kotlin.jvm.internal.s.k(protobufMessageAsBytes, "protobufMessageAsBytes");
        p013kotlin.jvm.internal.s.k(signatureType, "signatureType");
        p013kotlin.jvm.internal.s.k(signature, "signature");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new w2(token, counter, keyId, protobufMessageAsBytes, signatureType, signature, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCounter() {
        return this.counter;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final okio.k getKeyId() {
        return this.keyId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final okio.k getProtobufMessageAsBytes() {
        return this.protobufMessageAsBytes;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), w2Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.token, w2Var.token) && this.counter == w2Var.counter && p013kotlin.jvm.internal.s.f(this.keyId, w2Var.keyId) && p013kotlin.jvm.internal.s.f(this.protobufMessageAsBytes, w2Var.protobufMessageAsBytes) && this.signatureType == w2Var.signatureType && p013kotlin.jvm.internal.s.f(this.signature, w2Var.signature);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final okio.k getSignature() {
        return this.signature;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final v2 getSignatureType() {
        return this.signatureType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final okio.k getToken() {
        return this.token;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.token.hashCode()) * 37) + Integer.hashCode(this.counter)) * 37) + this.keyId.hashCode()) * 37) + this.protobufMessageAsBytes.hashCode()) * 37) + this.signatureType.hashCode()) * 37) + this.signature.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m848newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("token=" + this.token);
        arrayList.add("counter=" + this.counter);
        arrayList.add("keyId=" + this.keyId);
        arrayList.add("protobufMessageAsBytes=" + this.protobufMessageAsBytes);
        arrayList.add("signatureType=" + this.signatureType);
        arrayList.add("signature=" + this.signature);
        return p013kotlin.collections.v.y0(arrayList, ", ", "SignedMessage{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ w2(okio.k kVar, int i11, okio.k kVar2, okio.k kVar3, v2 v2Var, okio.k kVar4, okio.k kVar5, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? okio.k.f97943e : kVar, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? okio.k.f97943e : kVar2, (i12 & 8) != 0 ? okio.k.f97943e : kVar3, (i12 & 16) != 0 ? v2.SIGNATURE_TYPE_AES_GCM : v2Var, (i12 & 32) != 0 ? okio.k.f97943e : kVar4, (i12 & 64) != 0 ? okio.k.f97943e : kVar5);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m848newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(okio.k token, int i11, okio.k keyId, okio.k protobufMessageAsBytes, v2 signatureType, okio.k signature, okio.k unknownFields) {
        super(f118986h, unknownFields);
        p013kotlin.jvm.internal.s.k(token, "token");
        p013kotlin.jvm.internal.s.k(keyId, "keyId");
        p013kotlin.jvm.internal.s.k(protobufMessageAsBytes, "protobufMessageAsBytes");
        p013kotlin.jvm.internal.s.k(signatureType, "signatureType");
        p013kotlin.jvm.internal.s.k(signature, "signature");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.token = token;
        this.counter = i11;
        this.keyId = keyId;
        this.protobufMessageAsBytes = protobufMessageAsBytes;
        this.signatureType = signatureType;
        this.signature = signature;
    }
}
