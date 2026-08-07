package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B[\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 Ja\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u00101\u001a\u0004\b-\u00102R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u00103\u001a\u0004\b4\u0010\u001dR\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lvc0/m1;", "Lcom/squareup/wire/f;", "", "Lvc0/i1;", "keyId", "Lvc0/p1;", "nfcPresence", "Lvc0/u;", "blePresence", "Lvc0/m2;", "publicKey", "Lvc0/h1;", "keyFormFactor", "", "slot", "Llc0/a;", "role", "Lokio/k;", "unknownFields", "<init>", "(Lvc0/i1;Lvc0/p1;Lvc0/u;Lvc0/m2;Lvc0/h1;ILlc0/a;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/i1;Lvc0/p1;Lvc0/u;Lvc0/m2;Lvc0/h1;ILlc0/a;Lokio/k;)Lvc0/m1;", "Lvc0/i1;", "e", "()Lvc0/i1;", "b", "Lvc0/p1;", "f", "()Lvc0/p1;", "c", "Lvc0/u;", "()Lvc0/u;", DateTokenConverter.CONVERTER_KEY, "Lvc0/m2;", "g", "()Lvc0/m2;", "Lvc0/h1;", "()Lvc0/h1;", "I", IntegerTokenConverter.CONVERTER_KEY, "Llc0/a;", "h", "()Llc0/a;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m1 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ProtoAdapter<m1> f118826i = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(m1.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyIdentifier#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final i1 keyId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NFCPresence#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final p1 nfcPresence;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.BLEPresence#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final u blePresence;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final m2 publicKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyFormFactor#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final h1 keyFormFactor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final int slot;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.keys.Role#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final lc0.a role;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/m1$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/m1;", "value", "", "c", "(Lvc0/m1;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/m1;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/m1;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/m1;)Lvc0/m1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<m1> {
        a(com.squareup.wire.b bVar, co0.d<m1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.KeyStatus", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m1 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            p1 p1VarDecode = p1.NFC_PRESENCE_NOT_PRESENT;
            u uVar = u.BLE_PRESENCE_NOT_PRESENT;
            h1 h1Var = h1.KEY_FORM_FACTOR_UNKNOWN;
            lc0.a aVar = lc0.a.ROLE_NONE;
            long jD = reader.d();
            m2 m2VarDecode = null;
            int iIntValue = 0;
            lc0.a aVarDecode = aVar;
            i1 i1VarDecode = null;
            h1 h1VarDecode = h1Var;
            u uVarDecode = uVar;
            while (true) {
                p1 p1Var = p1VarDecode;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new m1(i1VarDecode, p1Var, uVarDecode, m2VarDecode, h1VarDecode, iIntValue, aVarDecode, reader.e(jD));
                    }
                    switch (iG) {
                        case 1:
                            i1VarDecode = i1.f118747c.decode(reader);
                            break;
                        case 2:
                            try {
                                p1VarDecode = p1.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            }
                            break;
                        case 3:
                            try {
                                uVarDecode = u.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                            }
                            break;
                        case 4:
                            m2VarDecode = m2.f118835c.decode(reader);
                            break;
                        case 5:
                            try {
                                h1VarDecode = h1.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e13.value));
                            }
                            break;
                        case 6:
                            iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                            break;
                        case 7:
                            try {
                                aVarDecode = lc0.a.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e14) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e14.value));
                            }
                            break;
                        default:
                            reader.m(iG);
                            break;
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, m1 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getKeyId() != null) {
                i1.f118747c.encodeWithTag(writer, 1, value.getKeyId());
            }
            if (value.getNfcPresence() != p1.NFC_PRESENCE_NOT_PRESENT) {
                p1.ADAPTER.encodeWithTag(writer, 2, value.getNfcPresence());
            }
            if (value.getBlePresence() != u.BLE_PRESENCE_NOT_PRESENT) {
                u.ADAPTER.encodeWithTag(writer, 3, value.getBlePresence());
            }
            if (value.getPublicKey() != null) {
                m2.f118835c.encodeWithTag(writer, 4, value.getPublicKey());
            }
            if (value.getKeyFormFactor() != h1.KEY_FORM_FACTOR_UNKNOWN) {
                h1.ADAPTER.encodeWithTag(writer, 5, value.getKeyFormFactor());
            }
            if (value.getSlot() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 6, Integer.valueOf(value.getSlot()));
            }
            if (value.getRole() != lc0.a.ROLE_NONE) {
                lc0.a.ADAPTER.encodeWithTag(writer, 7, value.getRole());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(m1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getKeyId() != null) {
                iD += i1.f118747c.encodedSizeWithTag(1, value.getKeyId());
            }
            if (value.getNfcPresence() != p1.NFC_PRESENCE_NOT_PRESENT) {
                iD += p1.ADAPTER.encodedSizeWithTag(2, value.getNfcPresence());
            }
            if (value.getBlePresence() != u.BLE_PRESENCE_NOT_PRESENT) {
                iD += u.ADAPTER.encodedSizeWithTag(3, value.getBlePresence());
            }
            if (value.getPublicKey() != null) {
                iD += m2.f118835c.encodedSizeWithTag(4, value.getPublicKey());
            }
            if (value.getKeyFormFactor() != h1.KEY_FORM_FACTOR_UNKNOWN) {
                iD += h1.ADAPTER.encodedSizeWithTag(5, value.getKeyFormFactor());
            }
            if (value.getSlot() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(6, Integer.valueOf(value.getSlot()));
            }
            return value.getRole() != lc0.a.ROLE_NONE ? iD + lc0.a.ADAPTER.encodedSizeWithTag(7, value.getRole()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public m1 redact(m1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            i1 keyId = value.getKeyId();
            i1 i1VarRedact = keyId != null ? i1.f118747c.redact(keyId) : null;
            m2 publicKey = value.getPublicKey();
            return m1.b(value, i1VarRedact, null, null, publicKey != null ? m2.f118835c.redact(publicKey) : null, null, 0, null, okio.k.f97943e, 118, null);
        }
    }

    public m1() {
        this(null, null, null, null, null, 0, null, null, 255, null);
    }

    public static /* synthetic */ m1 b(m1 m1Var, i1 i1Var, p1 p1Var, u uVar, m2 m2Var, h1 h1Var, int i11, lc0.a aVar, okio.k kVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i1Var = m1Var.keyId;
        }
        if ((i12 & 2) != 0) {
            p1Var = m1Var.nfcPresence;
        }
        if ((i12 & 4) != 0) {
            uVar = m1Var.blePresence;
        }
        if ((i12 & 8) != 0) {
            m2Var = m1Var.publicKey;
        }
        if ((i12 & 16) != 0) {
            h1Var = m1Var.keyFormFactor;
        }
        if ((i12 & 32) != 0) {
            i11 = m1Var.slot;
        }
        if ((i12 & 64) != 0) {
            aVar = m1Var.role;
        }
        if ((i12 & 128) != 0) {
            kVar = m1Var.unknownFields();
        }
        lc0.a aVar2 = aVar;
        okio.k kVar2 = kVar;
        h1 h1Var2 = h1Var;
        int i13 = i11;
        return m1Var.a(i1Var, p1Var, uVar, m2Var, h1Var2, i13, aVar2, kVar2);
    }

    public final m1 a(i1 keyId, p1 nfcPresence, u blePresence, m2 publicKey, h1 keyFormFactor, int slot, lc0.a role, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(nfcPresence, "nfcPresence");
        p013kotlin.jvm.internal.s.k(blePresence, "blePresence");
        p013kotlin.jvm.internal.s.k(keyFormFactor, "keyFormFactor");
        p013kotlin.jvm.internal.s.k(role, "role");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new m1(keyId, nfcPresence, blePresence, publicKey, keyFormFactor, slot, role, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final u getBlePresence() {
        return this.blePresence;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h1 getKeyFormFactor() {
        return this.keyFormFactor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final i1 getKeyId() {
        return this.keyId;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), m1Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.keyId, m1Var.keyId) && this.nfcPresence == m1Var.nfcPresence && this.blePresence == m1Var.blePresence && p013kotlin.jvm.internal.s.f(this.publicKey, m1Var.publicKey) && this.keyFormFactor == m1Var.keyFormFactor && this.slot == m1Var.slot && this.role == m1Var.role;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final p1 getNfcPresence() {
        return this.nfcPresence;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final m2 getPublicKey() {
        return this.publicKey;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final lc0.a getRole() {
        return this.role;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        i1 i1Var = this.keyId;
        int iHashCode2 = (((((iHashCode + (i1Var != null ? i1Var.hashCode() : 0)) * 37) + this.nfcPresence.hashCode()) * 37) + this.blePresence.hashCode()) * 37;
        m2 m2Var = this.publicKey;
        int iHashCode3 = ((((((iHashCode2 + (m2Var != null ? m2Var.hashCode() : 0)) * 37) + this.keyFormFactor.hashCode()) * 37) + Integer.hashCode(this.slot)) * 37) + this.role.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getSlot() {
        return this.slot;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m821newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        i1 i1Var = this.keyId;
        if (i1Var != null) {
            arrayList.add("keyId=" + i1Var);
        }
        arrayList.add("nfcPresence=" + this.nfcPresence);
        arrayList.add("blePresence=" + this.blePresence);
        m2 m2Var = this.publicKey;
        if (m2Var != null) {
            arrayList.add("publicKey=" + m2Var);
        }
        arrayList.add("keyFormFactor=" + this.keyFormFactor);
        arrayList.add("slot=" + this.slot);
        arrayList.add("role=" + this.role);
        return p013kotlin.collections.v.y0(arrayList, ", ", "KeyStatus{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ m1(i1 i1Var, p1 p1Var, u uVar, m2 m2Var, h1 h1Var, int i11, lc0.a aVar, okio.k kVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : i1Var, (i12 & 2) != 0 ? p1.NFC_PRESENCE_NOT_PRESENT : p1Var, (i12 & 4) != 0 ? u.BLE_PRESENCE_NOT_PRESENT : uVar, (i12 & 8) != 0 ? null : m2Var, (i12 & 16) != 0 ? h1.KEY_FORM_FACTOR_UNKNOWN : h1Var, (i12 & 32) != 0 ? 0 : i11, (i12 & 64) != 0 ? lc0.a.ROLE_NONE : aVar, (i12 & 128) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m821newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(i1 i1Var, p1 nfcPresence, u blePresence, m2 m2Var, h1 keyFormFactor, int i11, lc0.a role, okio.k unknownFields) {
        super(f118826i, unknownFields);
        p013kotlin.jvm.internal.s.k(nfcPresence, "nfcPresence");
        p013kotlin.jvm.internal.s.k(blePresence, "blePresence");
        p013kotlin.jvm.internal.s.k(keyFormFactor, "keyFormFactor");
        p013kotlin.jvm.internal.s.k(role, "role");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.keyId = i1Var;
        this.nfcPresence = nfcPresence;
        this.blePresence = blePresence;
        this.publicKey = m2Var;
        this.keyFormFactor = keyFormFactor;
        this.slot = i11;
        this.role = role;
    }
}
