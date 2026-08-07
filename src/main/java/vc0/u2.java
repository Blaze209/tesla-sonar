package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b¨\u0006 "}, d2 = {"Lvc0/u2;", "Lcom/squareup/wire/f;", "", "Lokio/k;", "token", "", "counter", "publicKey", "unknownFields", "<init>", "(Lokio/k;ILokio/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;ILokio/k;Lokio/k;)Lvc0/u2;", "Lokio/k;", "e", "()Lokio/k;", "b", "I", "c", DateTokenConverter.CONVERTER_KEY, "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<u2> f118941e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(u2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final okio.k token;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final int counter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final okio.k publicKey;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/u2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/u2;", "value", "", "c", "(Lvc0/u2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/u2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/u2;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/u2;)Lvc0/u2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<u2> {
        a(com.squareup.wire.b bVar, co0.d<u2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.SessionInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u2 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            okio.k kVarDecode = okio.k.f97943e;
            long jD = reader.d();
            int iIntValue = 0;
            okio.k kVarDecode2 = kVarDecode;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new u2(kVarDecode, iIntValue, kVarDecode2, reader.e(jD));
                }
                if (iG == 1) {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                } else if (iG == 2) {
                    iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    kVarDecode2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, u2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            okio.k token = value.getToken();
            okio.k kVar = okio.k.f97943e;
            if (!p013kotlin.jvm.internal.s.f(token, kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getToken());
            }
            if (value.getCounter() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getCounter()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getPublicKey(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.getPublicKey());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(u2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            okio.k token = value.getToken();
            okio.k kVar = okio.k.f97943e;
            if (!p013kotlin.jvm.internal.s.f(token, kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getToken());
            }
            if (value.getCounter() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getCounter()));
            }
            return !p013kotlin.jvm.internal.s.f(value.getPublicKey(), kVar) ? iD + ProtoAdapter.BYTES.encodedSizeWithTag(3, value.getPublicKey()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u2 redact(u2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return u2.b(value, null, 0, null, okio.k.f97943e, 7, null);
        }
    }

    public u2() {
        this(null, 0, null, null, 15, null);
    }

    public static /* synthetic */ u2 b(u2 u2Var, okio.k kVar, int i11, okio.k kVar2, okio.k kVar3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            kVar = u2Var.token;
        }
        if ((i12 & 2) != 0) {
            i11 = u2Var.counter;
        }
        if ((i12 & 4) != 0) {
            kVar2 = u2Var.publicKey;
        }
        if ((i12 & 8) != 0) {
            kVar3 = u2Var.unknownFields();
        }
        return u2Var.a(kVar, i11, kVar2, kVar3);
    }

    public final u2 a(okio.k token, int counter, okio.k publicKey, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(token, "token");
        p013kotlin.jvm.internal.s.k(publicKey, "publicKey");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new u2(token, counter, publicKey, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCounter() {
        return this.counter;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final okio.k getPublicKey() {
        return this.publicKey;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final okio.k getToken() {
        return this.token;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), u2Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.token, u2Var.token) && this.counter == u2Var.counter && p013kotlin.jvm.internal.s.f(this.publicKey, u2Var.publicKey);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.token.hashCode()) * 37) + Integer.hashCode(this.counter)) * 37) + this.publicKey.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m843newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("token=" + this.token);
        arrayList.add("counter=" + this.counter);
        arrayList.add("publicKey=" + this.publicKey);
        return p013kotlin.collections.v.y0(arrayList, ", ", "SessionInfo{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ u2(okio.k kVar, int i11, okio.k kVar2, okio.k kVar3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? okio.k.f97943e : kVar, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? okio.k.f97943e : kVar2, (i12 & 8) != 0 ? okio.k.f97943e : kVar3);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m843newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(okio.k token, int i11, okio.k publicKey, okio.k unknownFields) {
        super(f118941e, unknownFields);
        p013kotlin.jvm.internal.s.k(token, "token");
        p013kotlin.jvm.internal.s.k(publicKey, "publicKey");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.token = token;
        this.counter = i11;
        this.publicKey = publicKey;
    }
}
