package vc0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b%\u0010&R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lvc0/e2;", "Lcom/squareup/wire/f;", "", "Lvc0/m2;", Action.KEY_ATTRIBUTE, "", "Lvc0/m3;", "permission", "", "secondsToBeActive", "Llc0/a;", "keyRole", "Lokio/k;", "unknownFields", "<init>", "(Lvc0/m2;Ljava/util/List;ILlc0/a;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/m2;Ljava/util/List;ILlc0/a;Lokio/k;)Lvc0/e2;", "Lvc0/m2;", "c", "()Lvc0/m2;", "b", "I", "f", "Llc0/a;", DateTokenConverter.CONVERTER_KEY, "()Llc0/a;", "Ljava/util/List;", "e", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<e2> f118647f = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(e2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final m2 key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final int secondsToBeActive;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.keys.Role#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final lc0.a keyRole;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.WhitelistKeyPermission_E#ADAPTER", label = com.squareup.wire.q.a.REPEATED, tag = 2)
    private final List<m3> permission;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/e2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/e2;", "value", "", "c", "(Lvc0/e2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/e2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/e2;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/e2;)Lvc0/e2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<e2> {
        a(com.squareup.wire.b bVar, co0.d<e2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.PermissionChange", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e2 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            lc0.a aVarDecode = lc0.a.ROLE_NONE;
            long jD = reader.d();
            int iIntValue = 0;
            m2 m2VarDecode = null;
            while (true) {
                lc0.a aVar = aVarDecode;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new e2(m2VarDecode, arrayList, iIntValue, aVar, reader.e(jD));
                    }
                    if (iG == 1) {
                        m2VarDecode = m2.f118835c.decode(reader);
                    } else if (iG == 2) {
                        try {
                            arrayList.add(m3.ADAPTER.decode(reader));
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            jn0.h0 h0Var = jn0.h0.f84049a;
                        }
                    } else if (iG == 3) {
                        iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                    } else if (iG != 4) {
                        reader.m(iG);
                    } else {
                        try {
                            aVarDecode = lc0.a.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                        }
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, e2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getKey() != null) {
                m2.f118835c.encodeWithTag(writer, 1, value.getKey());
            }
            m3.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.e());
            if (value.getSecondsToBeActive() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.getSecondsToBeActive()));
            }
            if (value.getKeyRole() != lc0.a.ROLE_NONE) {
                lc0.a.ADAPTER.encodeWithTag(writer, 4, value.getKeyRole());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(e2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getKey() != null) {
                iD += m2.f118835c.encodedSizeWithTag(1, value.getKey());
            }
            int iEncodedSizeWithTag = iD + m3.ADAPTER.asRepeated().encodedSizeWithTag(2, value.e());
            if (value.getSecondsToBeActive() != 0) {
                iEncodedSizeWithTag += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.getSecondsToBeActive()));
            }
            return value.getKeyRole() != lc0.a.ROLE_NONE ? iEncodedSizeWithTag + lc0.a.ADAPTER.encodedSizeWithTag(4, value.getKeyRole()) : iEncodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e2 redact(e2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            m2 key = value.getKey();
            return e2.b(value, key != null ? m2.f118835c.redact(key) : null, null, 0, null, okio.k.f97943e, 14, null);
        }
    }

    public e2() {
        this(null, null, 0, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e2 b(e2 e2Var, m2 m2Var, List list, int i11, lc0.a aVar, okio.k kVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            m2Var = e2Var.key;
        }
        if ((i12 & 2) != 0) {
            list = e2Var.permission;
        }
        if ((i12 & 4) != 0) {
            i11 = e2Var.secondsToBeActive;
        }
        if ((i12 & 8) != 0) {
            aVar = e2Var.keyRole;
        }
        if ((i12 & 16) != 0) {
            kVar = e2Var.unknownFields();
        }
        okio.k kVar2 = kVar;
        int i13 = i11;
        return e2Var.a(m2Var, list, i13, aVar, kVar2);
    }

    public final e2 a(m2 key, List<? extends m3> permission, int secondsToBeActive, lc0.a keyRole, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(permission, "permission");
        p013kotlin.jvm.internal.s.k(keyRole, "keyRole");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new e2(key, permission, secondsToBeActive, keyRole, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final m2 getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final lc0.a getKeyRole() {
        return this.keyRole;
    }

    public final List<m3> e() {
        return this.permission;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), e2Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.key, e2Var.key) && p013kotlin.jvm.internal.s.f(this.permission, e2Var.permission) && this.secondsToBeActive == e2Var.secondsToBeActive && this.keyRole == e2Var.keyRole;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSecondsToBeActive() {
        return this.secondsToBeActive;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        m2 m2Var = this.key;
        int iHashCode2 = ((((((iHashCode + (m2Var != null ? m2Var.hashCode() : 0)) * 37) + this.permission.hashCode()) * 37) + Integer.hashCode(this.secondsToBeActive)) * 37) + this.keyRole.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m796newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        m2 m2Var = this.key;
        if (m2Var != null) {
            arrayList.add("key=" + m2Var);
        }
        if (!this.permission.isEmpty()) {
            arrayList.add("permission=" + this.permission);
        }
        arrayList.add("secondsToBeActive=" + this.secondsToBeActive);
        arrayList.add("keyRole=" + this.keyRole);
        return p013kotlin.collections.v.y0(arrayList, ", ", "PermissionChange{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ e2(m2 m2Var, List list, int i11, lc0.a aVar, okio.k kVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : m2Var, (i12 & 2) != 0 ? p013kotlin.collections.v.m() : list, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? lc0.a.ROLE_NONE : aVar, (i12 & 16) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m796newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(m2 m2Var, List<? extends m3> permission, int i11, lc0.a keyRole, okio.k unknownFields) {
        super(f118647f, unknownFields);
        p013kotlin.jvm.internal.s.k(permission, "permission");
        p013kotlin.jvm.internal.s.k(keyRole, "keyRole");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.key = m2Var;
        this.secondsToBeActive = i11;
        this.keyRole = keyRole;
        this.permission = x20.d.g("permission", permission);
    }
}
