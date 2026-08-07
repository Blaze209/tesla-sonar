package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lvc0/z2;", "Lcom/squareup/wire/f;", "", "Lvc0/w2;", "signedMessage", "Lvc0/e3;", "unsignedMessage", "Lokio/k;", "unknownFields", "<init>", "(Lvc0/w2;Lvc0/e3;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/w2;Lvc0/e3;Lokio/k;)Lvc0/z2;", "Lvc0/w2;", "b", "()Lvc0/w2;", "Lvc0/e3;", "c", "()Lvc0/e3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<z2> f119007d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(z2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.SignedMessage#ADAPTER", tag = 1)
    private final w2 signedMessage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.UnsignedMessage#ADAPTER", tag = 2)
    private final e3 unsignedMessage;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/z2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/z2;", "value", "", "c", "(Lvc0/z2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/z2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/z2;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/z2;)Lvc0/z2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<z2> {
        a(com.squareup.wire.b bVar, co0.d<z2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.ToVCSECMessage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public z2 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            w2 w2VarDecode = null;
            e3 e3VarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new z2(w2VarDecode, e3VarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    w2VarDecode = w2.f118986h.decode(reader);
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    e3VarDecode = e3.A.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, z2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            w2.f118986h.encodeWithTag(writer, 1, value.getSignedMessage());
            e3.A.encodeWithTag(writer, 2, value.getUnsignedMessage());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(z2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return value.unknownFields().D() + w2.f118986h.encodedSizeWithTag(1, value.getSignedMessage()) + e3.A.encodedSizeWithTag(2, value.getUnsignedMessage());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public z2 redact(z2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            w2 signedMessage = value.getSignedMessage();
            w2 w2VarRedact = signedMessage != null ? w2.f118986h.redact(signedMessage) : null;
            e3 unsignedMessage = value.getUnsignedMessage();
            return value.a(w2VarRedact, unsignedMessage != null ? e3.A.redact(unsignedMessage) : null, okio.k.f97943e);
        }
    }

    public z2() {
        this(null, null, null, 7, null);
    }

    public final z2 a(w2 signedMessage, e3 unsignedMessage, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new z2(signedMessage, unsignedMessage, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final w2 getSignedMessage() {
        return this.signedMessage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e3 getUnsignedMessage() {
        return this.unsignedMessage;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), z2Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.signedMessage, z2Var.signedMessage) && p013kotlin.jvm.internal.s.f(this.unsignedMessage, z2Var.unsignedMessage);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        w2 w2Var = this.signedMessage;
        int iHashCode2 = (iHashCode + (w2Var != null ? w2Var.hashCode() : 0)) * 37;
        e3 e3Var = this.unsignedMessage;
        int iHashCode3 = iHashCode2 + (e3Var != null ? e3Var.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m853newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        w2 w2Var = this.signedMessage;
        if (w2Var != null) {
            arrayList.add("signedMessage=" + w2Var);
        }
        e3 e3Var = this.unsignedMessage;
        if (e3Var != null) {
            arrayList.add("unsignedMessage=" + e3Var);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "ToVCSECMessage{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ z2(w2 w2Var, e3 e3Var, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : w2Var, (i11 & 2) != 0 ? null : e3Var, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m853newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(w2 w2Var, e3 e3Var, okio.k unknownFields) {
        super(f119007d, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.signedMessage = w2Var;
        this.unsignedMessage = e3Var;
        if (x20.d.c(w2Var, e3Var) > 1) {
            throw new IllegalArgumentException("At most one of signedMessage, unsignedMessage may be non-null");
        }
    }
}
