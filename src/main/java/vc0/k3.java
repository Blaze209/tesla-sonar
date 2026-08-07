package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&Bc\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 Ji\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b0\u0010\u001dR\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b-\u00103R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u00104\u001a\u0004\b1\u00105¨\u00066"}, d2 = {"Lvc0/k3;", "Lcom/squareup/wire/f;", "", "Lvc0/i1;", "keyId", "Lvc0/m2;", "publicKey", "", "Lvc0/m3;", "permissions", "Lvc0/l1;", "metadataForKey", "", "secondsEntryRemainsActive", "slot", "Llc0/a;", "keyRole", "Lokio/k;", "unknownFields", "<init>", "(Lvc0/i1;Lvc0/m2;Ljava/util/List;Lvc0/l1;IILlc0/a;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/i1;Lvc0/m2;Ljava/util/List;Lvc0/l1;IILlc0/a;Lokio/k;)Lvc0/k3;", "Lvc0/i1;", "c", "()Lvc0/i1;", "b", "Lvc0/m2;", "g", "()Lvc0/m2;", "Lvc0/l1;", "e", "()Lvc0/l1;", DateTokenConverter.CONVERTER_KEY, "I", "h", IntegerTokenConverter.CONVERTER_KEY, "f", "Llc0/a;", "()Llc0/a;", "Ljava/util/List;", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k3 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ProtoAdapter<k3> f118803i = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(k3.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyIdentifier#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final i1 keyId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final m2 publicKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyMetadata#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final l1 metadataForKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final int secondsEntryRemainsActive;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final int slot;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.keys.Role#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final lc0.a keyRole;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.WhitelistKeyPermission_E#ADAPTER", label = com.squareup.wire.q.a.REPEATED, tag = 3)
    private final List<m3> permissions;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/k3$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/k3;", "value", "", "c", "(Lvc0/k3;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/k3;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/k3;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/k3;)Lvc0/k3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<k3> {
        a(com.squareup.wire.b bVar, co0.d<k3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.WhitelistEntryInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k3 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            lc0.a aVar = lc0.a.ROLE_NONE;
            long jD = reader.d();
            m2 m2VarDecode = null;
            l1 l1VarDecode = null;
            int iIntValue = 0;
            int iIntValue2 = 0;
            lc0.a aVarDecode = aVar;
            i1 i1VarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new k3(i1VarDecode, m2VarDecode, arrayList, l1VarDecode, iIntValue, iIntValue2, aVarDecode, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        i1VarDecode = i1.f118747c.decode(reader);
                        break;
                    case 2:
                        m2VarDecode = m2.f118835c.decode(reader);
                        break;
                    case 3:
                        try {
                            arrayList.add(m3.ADAPTER.decode(reader));
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            jn0.h0 h0Var = jn0.h0.f84049a;
                        }
                        break;
                    case 4:
                        l1VarDecode = l1.f118815c.decode(reader);
                        break;
                    case 5:
                        iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 6:
                        iIntValue2 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 7:
                        try {
                            aVarDecode = lc0.a.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                        }
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, k3 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getKeyId() != null) {
                i1.f118747c.encodeWithTag(writer, 1, value.getKeyId());
            }
            if (value.getPublicKey() != null) {
                m2.f118835c.encodeWithTag(writer, 2, value.getPublicKey());
            }
            m3.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.f());
            if (value.getMetadataForKey() != null) {
                l1.f118815c.encodeWithTag(writer, 4, value.getMetadataForKey());
            }
            if (value.getSecondsEntryRemainsActive() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 5, Integer.valueOf(value.getSecondsEntryRemainsActive()));
            }
            if (value.getSlot() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 6, Integer.valueOf(value.getSlot()));
            }
            if (value.getKeyRole() != lc0.a.ROLE_NONE) {
                lc0.a.ADAPTER.encodeWithTag(writer, 7, value.getKeyRole());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(k3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getKeyId() != null) {
                iD += i1.f118747c.encodedSizeWithTag(1, value.getKeyId());
            }
            if (value.getPublicKey() != null) {
                iD += m2.f118835c.encodedSizeWithTag(2, value.getPublicKey());
            }
            int iEncodedSizeWithTag = iD + m3.ADAPTER.asRepeated().encodedSizeWithTag(3, value.f());
            if (value.getMetadataForKey() != null) {
                iEncodedSizeWithTag += l1.f118815c.encodedSizeWithTag(4, value.getMetadataForKey());
            }
            if (value.getSecondsEntryRemainsActive() != 0) {
                iEncodedSizeWithTag += ProtoAdapter.UINT32.encodedSizeWithTag(5, Integer.valueOf(value.getSecondsEntryRemainsActive()));
            }
            if (value.getSlot() != 0) {
                iEncodedSizeWithTag += ProtoAdapter.UINT32.encodedSizeWithTag(6, Integer.valueOf(value.getSlot()));
            }
            return value.getKeyRole() != lc0.a.ROLE_NONE ? iEncodedSizeWithTag + lc0.a.ADAPTER.encodedSizeWithTag(7, value.getKeyRole()) : iEncodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public k3 redact(k3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            i1 keyId = value.getKeyId();
            i1 i1VarRedact = keyId != null ? i1.f118747c.redact(keyId) : null;
            m2 publicKey = value.getPublicKey();
            m2 m2VarRedact = publicKey != null ? m2.f118835c.redact(publicKey) : null;
            l1 metadataForKey = value.getMetadataForKey();
            return k3.b(value, i1VarRedact, m2VarRedact, null, metadataForKey != null ? l1.f118815c.redact(metadataForKey) : null, 0, 0, null, okio.k.f97943e, 116, null);
        }
    }

    public k3() {
        this(null, null, null, null, 0, 0, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k3 b(k3 k3Var, i1 i1Var, m2 m2Var, List list, l1 l1Var, int i11, int i12, lc0.a aVar, okio.k kVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i1Var = k3Var.keyId;
        }
        if ((i13 & 2) != 0) {
            m2Var = k3Var.publicKey;
        }
        if ((i13 & 4) != 0) {
            list = k3Var.permissions;
        }
        if ((i13 & 8) != 0) {
            l1Var = k3Var.metadataForKey;
        }
        if ((i13 & 16) != 0) {
            i11 = k3Var.secondsEntryRemainsActive;
        }
        if ((i13 & 32) != 0) {
            i12 = k3Var.slot;
        }
        if ((i13 & 64) != 0) {
            aVar = k3Var.keyRole;
        }
        if ((i13 & 128) != 0) {
            kVar = k3Var.unknownFields();
        }
        lc0.a aVar2 = aVar;
        okio.k kVar2 = kVar;
        int i14 = i11;
        int i15 = i12;
        return k3Var.a(i1Var, m2Var, list, l1Var, i14, i15, aVar2, kVar2);
    }

    public final k3 a(i1 keyId, m2 publicKey, List<? extends m3> permissions, l1 metadataForKey, int secondsEntryRemainsActive, int slot, lc0.a keyRole, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(permissions, "permissions");
        p013kotlin.jvm.internal.s.k(keyRole, "keyRole");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new k3(keyId, publicKey, permissions, metadataForKey, secondsEntryRemainsActive, slot, keyRole, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i1 getKeyId() {
        return this.keyId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final lc0.a getKeyRole() {
        return this.keyRole;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final l1 getMetadataForKey() {
        return this.metadataForKey;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), k3Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.keyId, k3Var.keyId) && p013kotlin.jvm.internal.s.f(this.publicKey, k3Var.publicKey) && p013kotlin.jvm.internal.s.f(this.permissions, k3Var.permissions) && p013kotlin.jvm.internal.s.f(this.metadataForKey, k3Var.metadataForKey) && this.secondsEntryRemainsActive == k3Var.secondsEntryRemainsActive && this.slot == k3Var.slot && this.keyRole == k3Var.keyRole;
    }

    public final List<m3> f() {
        return this.permissions;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final m2 getPublicKey() {
        return this.publicKey;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getSecondsEntryRemainsActive() {
        return this.secondsEntryRemainsActive;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        i1 i1Var = this.keyId;
        int iHashCode2 = (iHashCode + (i1Var != null ? i1Var.hashCode() : 0)) * 37;
        m2 m2Var = this.publicKey;
        int iHashCode3 = (((iHashCode2 + (m2Var != null ? m2Var.hashCode() : 0)) * 37) + this.permissions.hashCode()) * 37;
        l1 l1Var = this.metadataForKey;
        int iHashCode4 = ((((((iHashCode3 + (l1Var != null ? l1Var.hashCode() : 0)) * 37) + Integer.hashCode(this.secondsEntryRemainsActive)) * 37) + Integer.hashCode(this.slot)) * 37) + this.keyRole.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getSlot() {
        return this.slot;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m816newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        i1 i1Var = this.keyId;
        if (i1Var != null) {
            arrayList.add("keyId=" + i1Var);
        }
        m2 m2Var = this.publicKey;
        if (m2Var != null) {
            arrayList.add("publicKey=" + m2Var);
        }
        if (!this.permissions.isEmpty()) {
            arrayList.add("permissions=" + this.permissions);
        }
        l1 l1Var = this.metadataForKey;
        if (l1Var != null) {
            arrayList.add("metadataForKey=" + l1Var);
        }
        arrayList.add("secondsEntryRemainsActive=" + this.secondsEntryRemainsActive);
        arrayList.add("slot=" + this.slot);
        arrayList.add("keyRole=" + this.keyRole);
        return p013kotlin.collections.v.y0(arrayList, ", ", "WhitelistEntryInfo{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ k3(i1 i1Var, m2 m2Var, List list, l1 l1Var, int i11, int i12, lc0.a aVar, okio.k kVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : i1Var, (i13 & 2) != 0 ? null : m2Var, (i13 & 4) != 0 ? p013kotlin.collections.v.m() : list, (i13 & 8) != 0 ? null : l1Var, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? 0 : i12, (i13 & 64) != 0 ? lc0.a.ROLE_NONE : aVar, (i13 & 128) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m816newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(i1 i1Var, m2 m2Var, List<? extends m3> permissions, l1 l1Var, int i11, int i12, lc0.a keyRole, okio.k unknownFields) {
        super(f118803i, unknownFields);
        p013kotlin.jvm.internal.s.k(permissions, "permissions");
        p013kotlin.jvm.internal.s.k(keyRole, "keyRole");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.keyId = i1Var;
        this.publicKey = m2Var;
        this.metadataForKey = l1Var;
        this.secondsEntryRemainsActive = i11;
        this.slot = i12;
        this.keyRole = keyRole;
        this.permissions = x20.d.g("permissions", permissions);
    }
}
