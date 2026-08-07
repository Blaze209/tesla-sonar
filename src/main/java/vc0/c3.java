package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB3\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, d2 = {"Lvc0/c3;", "Lcom/squareup/wire/f;", "", "Lvc0/m1;", "keyStatus", "Lvc0/m2;", "publicKey", "Lvc0/h1;", "keyFormFactor", "Lokio/k;", "unknownFields", "<init>", "(Lvc0/m1;Lvc0/m2;Lvc0/h1;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/m1;Lvc0/m2;Lvc0/h1;Lokio/k;)Lvc0/c3;", "Lvc0/m1;", DateTokenConverter.CONVERTER_KEY, "()Lvc0/m1;", "b", "Lvc0/m2;", "e", "()Lvc0/m2;", "c", "Lvc0/h1;", "()Lvc0/h1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c3 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<c3> f118617e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(c3.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyStatus#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final m1 keyStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final m2 publicKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyFormFactor#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final h1 keyFormFactor;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/c3$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/c3;", "value", "", "c", "(Lvc0/c3;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/c3;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/c3;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/c3;)Lvc0/c3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<c3> {
        a(com.squareup.wire.b bVar, co0.d<c3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.UnknownKeyInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c3 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            h1 h1VarDecode = h1.KEY_FORM_FACTOR_UNKNOWN;
            long jD = reader.d();
            m1 m1VarDecode = null;
            m2 m2VarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new c3(m1VarDecode, m2VarDecode, h1VarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    m1VarDecode = m1.f118826i.decode(reader);
                } else if (iG == 2) {
                    m2VarDecode = m2.f118835c.decode(reader);
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    try {
                        h1VarDecode = h1.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, c3 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getKeyStatus() != null) {
                m1.f118826i.encodeWithTag(writer, 1, value.getKeyStatus());
            }
            if (value.getPublicKey() != null) {
                m2.f118835c.encodeWithTag(writer, 2, value.getPublicKey());
            }
            if (value.getKeyFormFactor() != h1.KEY_FORM_FACTOR_UNKNOWN) {
                h1.ADAPTER.encodeWithTag(writer, 3, value.getKeyFormFactor());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(c3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getKeyStatus() != null) {
                iD += m1.f118826i.encodedSizeWithTag(1, value.getKeyStatus());
            }
            if (value.getPublicKey() != null) {
                iD += m2.f118835c.encodedSizeWithTag(2, value.getPublicKey());
            }
            return value.getKeyFormFactor() != h1.KEY_FORM_FACTOR_UNKNOWN ? iD + h1.ADAPTER.encodedSizeWithTag(3, value.getKeyFormFactor()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c3 redact(c3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            m1 keyStatus = value.getKeyStatus();
            m1 m1VarRedact = keyStatus != null ? m1.f118826i.redact(keyStatus) : null;
            m2 publicKey = value.getPublicKey();
            return c3.b(value, m1VarRedact, publicKey != null ? m2.f118835c.redact(publicKey) : null, null, okio.k.f97943e, 4, null);
        }
    }

    public c3() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ c3 b(c3 c3Var, m1 m1Var, m2 m2Var, h1 h1Var, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            m1Var = c3Var.keyStatus;
        }
        if ((i11 & 2) != 0) {
            m2Var = c3Var.publicKey;
        }
        if ((i11 & 4) != 0) {
            h1Var = c3Var.keyFormFactor;
        }
        if ((i11 & 8) != 0) {
            kVar = c3Var.unknownFields();
        }
        return c3Var.a(m1Var, m2Var, h1Var, kVar);
    }

    public final c3 a(m1 keyStatus, m2 publicKey, h1 keyFormFactor, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(keyFormFactor, "keyFormFactor");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new c3(keyStatus, publicKey, keyFormFactor, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h1 getKeyFormFactor() {
        return this.keyFormFactor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final m1 getKeyStatus() {
        return this.keyStatus;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final m2 getPublicKey() {
        return this.publicKey;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), c3Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.keyStatus, c3Var.keyStatus) && p013kotlin.jvm.internal.s.f(this.publicKey, c3Var.publicKey) && this.keyFormFactor == c3Var.keyFormFactor;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        m1 m1Var = this.keyStatus;
        int iHashCode2 = (iHashCode + (m1Var != null ? m1Var.hashCode() : 0)) * 37;
        m2 m2Var = this.publicKey;
        int iHashCode3 = ((iHashCode2 + (m2Var != null ? m2Var.hashCode() : 0)) * 37) + this.keyFormFactor.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m791newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        m1 m1Var = this.keyStatus;
        if (m1Var != null) {
            arrayList.add("keyStatus=" + m1Var);
        }
        m2 m2Var = this.publicKey;
        if (m2Var != null) {
            arrayList.add("publicKey=" + m2Var);
        }
        arrayList.add("keyFormFactor=" + this.keyFormFactor);
        return p013kotlin.collections.v.y0(arrayList, ", ", "UnknownKeyInfo{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ c3(m1 m1Var, m2 m2Var, h1 h1Var, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : m1Var, (i11 & 2) != 0 ? null : m2Var, (i11 & 4) != 0 ? h1.KEY_FORM_FACTOR_UNKNOWN : h1Var, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m791newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(m1 m1Var, m2 m2Var, h1 keyFormFactor, okio.k unknownFields) {
        super(f118617e, unknownFields);
        p013kotlin.jvm.internal.s.k(keyFormFactor, "keyFormFactor");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.keyStatus = m1Var;
        this.publicKey = m2Var;
        this.keyFormFactor = keyFormFactor;
    }
}
