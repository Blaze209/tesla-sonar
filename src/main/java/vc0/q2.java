package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BI\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJO\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lvc0/q2;", "Lcom/squareup/wire/f;", "", "Lvc0/m2;", "keyToAdd", "Llc0/a;", "keyRole", "", "impermanent", "publicKeyToReplace", "", "slotToReplace", "Lokio/k;", "unknownFields", "<init>", "(Lvc0/m2;Llc0/a;ZLvc0/m2;Ljava/lang/Integer;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/m2;Llc0/a;ZLvc0/m2;Ljava/lang/Integer;Lokio/k;)Lvc0/q2;", "Lvc0/m2;", "e", "()Lvc0/m2;", "b", "Llc0/a;", DateTokenConverter.CONVERTER_KEY, "()Llc0/a;", "c", "Z", "()Z", "f", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ProtoAdapter<q2> f118886g = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(q2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final m2 keyToAdd;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.keys.Role#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final lc0.a keyRole;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final boolean impermanent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", tag = 1)
    private final m2 publicKeyToReplace;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 2)
    private final Integer slotToReplace;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/q2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/q2;", "value", "", "c", "(Lvc0/q2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/q2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/q2;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/q2;)Lvc0/q2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<q2> {
        a(com.squareup.wire.b bVar, co0.d<q2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.ReplaceKey", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q2 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            lc0.a aVar = lc0.a.ROLE_NONE;
            long jD = reader.d();
            m2 m2VarDecode = null;
            Integer numDecode = null;
            boolean zBooleanValue = false;
            lc0.a aVarDecode = aVar;
            m2 m2VarDecode2 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new q2(m2VarDecode2, aVarDecode, zBooleanValue, m2VarDecode, numDecode, reader.e(jD));
                }
                if (iG == 1) {
                    m2VarDecode = m2.f118835c.decode(reader);
                } else if (iG == 2) {
                    numDecode = ProtoAdapter.UINT32.decode(reader);
                } else if (iG == 3) {
                    m2VarDecode2 = m2.f118835c.decode(reader);
                } else if (iG == 4) {
                    try {
                        aVarDecode = lc0.a.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG != 5) {
                    reader.m(iG);
                } else {
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, q2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getKeyToAdd() != null) {
                m2.f118835c.encodeWithTag(writer, 3, value.getKeyToAdd());
            }
            if (value.getKeyRole() != lc0.a.ROLE_NONE) {
                lc0.a.ADAPTER.encodeWithTag(writer, 4, value.getKeyRole());
            }
            if (value.getImpermanent()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.getImpermanent()));
            }
            m2.f118835c.encodeWithTag(writer, 1, value.getPublicKeyToReplace());
            ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.getSlotToReplace());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(q2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getKeyToAdd() != null) {
                iD += m2.f118835c.encodedSizeWithTag(3, value.getKeyToAdd());
            }
            if (value.getKeyRole() != lc0.a.ROLE_NONE) {
                iD += lc0.a.ADAPTER.encodedSizeWithTag(4, value.getKeyRole());
            }
            if (value.getImpermanent()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getImpermanent()));
            }
            return iD + m2.f118835c.encodedSizeWithTag(1, value.getPublicKeyToReplace()) + ProtoAdapter.UINT32.encodedSizeWithTag(2, value.getSlotToReplace());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public q2 redact(q2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            m2 keyToAdd = value.getKeyToAdd();
            m2 m2VarRedact = keyToAdd != null ? m2.f118835c.redact(keyToAdd) : null;
            m2 publicKeyToReplace = value.getPublicKeyToReplace();
            return q2.b(value, m2VarRedact, null, false, publicKeyToReplace != null ? m2.f118835c.redact(publicKeyToReplace) : null, null, okio.k.f97943e, 22, null);
        }
    }

    public q2() {
        this(null, null, false, null, null, null, 63, null);
    }

    public static /* synthetic */ q2 b(q2 q2Var, m2 m2Var, lc0.a aVar, boolean z11, m2 m2Var2, Integer num, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            m2Var = q2Var.keyToAdd;
        }
        if ((i11 & 2) != 0) {
            aVar = q2Var.keyRole;
        }
        if ((i11 & 4) != 0) {
            z11 = q2Var.impermanent;
        }
        if ((i11 & 8) != 0) {
            m2Var2 = q2Var.publicKeyToReplace;
        }
        if ((i11 & 16) != 0) {
            num = q2Var.slotToReplace;
        }
        if ((i11 & 32) != 0) {
            kVar = q2Var.unknownFields();
        }
        Integer num2 = num;
        okio.k kVar2 = kVar;
        return q2Var.a(m2Var, aVar, z11, m2Var2, num2, kVar2);
    }

    public final q2 a(m2 keyToAdd, lc0.a keyRole, boolean impermanent, m2 publicKeyToReplace, Integer slotToReplace, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(keyRole, "keyRole");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new q2(keyToAdd, keyRole, impermanent, publicKeyToReplace, slotToReplace, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getImpermanent() {
        return this.impermanent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final lc0.a getKeyRole() {
        return this.keyRole;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final m2 getKeyToAdd() {
        return this.keyToAdd;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), q2Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.keyToAdd, q2Var.keyToAdd) && this.keyRole == q2Var.keyRole && this.impermanent == q2Var.impermanent && p013kotlin.jvm.internal.s.f(this.publicKeyToReplace, q2Var.publicKeyToReplace) && p013kotlin.jvm.internal.s.f(this.slotToReplace, q2Var.slotToReplace);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final m2 getPublicKeyToReplace() {
        return this.publicKeyToReplace;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getSlotToReplace() {
        return this.slotToReplace;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        m2 m2Var = this.keyToAdd;
        int iHashCode2 = (((((iHashCode + (m2Var != null ? m2Var.hashCode() : 0)) * 37) + this.keyRole.hashCode()) * 37) + Boolean.hashCode(this.impermanent)) * 37;
        m2 m2Var2 = this.publicKeyToReplace;
        int iHashCode3 = (iHashCode2 + (m2Var2 != null ? m2Var2.hashCode() : 0)) * 37;
        Integer num = this.slotToReplace;
        int iHashCode4 = iHashCode3 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m831newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        m2 m2Var = this.keyToAdd;
        if (m2Var != null) {
            arrayList.add("keyToAdd=" + m2Var);
        }
        arrayList.add("keyRole=" + this.keyRole);
        arrayList.add("impermanent=" + this.impermanent);
        m2 m2Var2 = this.publicKeyToReplace;
        if (m2Var2 != null) {
            arrayList.add("publicKeyToReplace=" + m2Var2);
        }
        Integer num = this.slotToReplace;
        if (num != null) {
            arrayList.add("slotToReplace=" + num);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "ReplaceKey{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ q2(m2 m2Var, lc0.a aVar, boolean z11, m2 m2Var2, Integer num, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : m2Var, (i11 & 2) != 0 ? lc0.a.ROLE_NONE : aVar, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : m2Var2, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m831newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(m2 m2Var, lc0.a keyRole, boolean z11, m2 m2Var2, Integer num, okio.k unknownFields) {
        super(f118886g, unknownFields);
        p013kotlin.jvm.internal.s.k(keyRole, "keyRole");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.keyToAdd = m2Var;
        this.keyRole = keyRole;
        this.impermanent = z11;
        this.publicKeyToReplace = m2Var2;
        this.slotToReplace = num;
        if (x20.d.c(m2Var2, num) > 1) {
            throw new IllegalArgumentException("At most one of publicKeyToReplace, slotToReplace may be non-null");
        }
    }
}
