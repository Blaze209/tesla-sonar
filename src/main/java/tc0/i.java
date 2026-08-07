package tc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016¨\u0006\u001f"}, d2 = {"Ltc0/i;", "Lcom/squareup/wire/f;", "", "Ltc0/k;", "type", "", "pubkey", "Lokio/k;", "unknownFields", "<init>", "(Ltc0/k;Ljava/lang/String;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ltc0/k;Ljava/lang/String;Lokio/k;)Ltc0/i;", "Ltc0/k;", DateTokenConverter.CONVERTER_KEY, "()Ltc0/k;", "b", "Ljava/lang/String;", "c", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<i> f113175d = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(i.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.tesla.generated.vault.vaultKeyType#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)
    private final k type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 2)
    private final String pubkey;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"tc0/i$a", "Lcom/squareup/wire/ProtoAdapter;", "Ltc0/i;", "value", "", "c", "(Ltc0/i;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Ltc0/i;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ltc0/i;", DateTokenConverter.CONVERTER_KEY, "(Ltc0/i;)Ltc0/i;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<i> {
        a(com.squareup.wire.b bVar, co0.d<i> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.VaultKey", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            k kVarDecode = k.VEHICLE_CERT;
            long jD = reader.d();
            String strDecode = "";
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new i(kVarDecode, strDecode, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        kVarDecode = k.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, i value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getType() != k.VEHICLE_CERT) {
                k.ADAPTER.encodeWithTag(writer, 1, value.getType());
            }
            if (!s.f(value.getPubkey(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getPubkey());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(i value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getType() != k.VEHICLE_CERT) {
                iD += k.ADAPTER.encodedSizeWithTag(1, value.getType());
            }
            return !s.f(value.getPubkey(), "") ? iD + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPubkey()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public i redact(i value) {
            s.k(value, "value");
            return i.b(value, null, null, okio.k.f97943e, 3, null);
        }
    }

    public i() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ i b(i iVar, k kVar, String str, okio.k kVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = iVar.type;
        }
        if ((i11 & 2) != 0) {
            str = iVar.pubkey;
        }
        if ((i11 & 4) != 0) {
            kVar2 = iVar.unknownFields();
        }
        return iVar.a(kVar, str, kVar2);
    }

    public final i a(k type, String pubkey, okio.k unknownFields) {
        s.k(type, "type");
        s.k(pubkey, "pubkey");
        s.k(unknownFields, "unknownFields");
        return new i(type, pubkey, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPubkey() {
        return this.pubkey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final k getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return s.f(unknownFields(), iVar.unknownFields()) && this.type == iVar.type && s.f(this.pubkey, iVar.pubkey);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + this.pubkey.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m780newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.type);
        arrayList.add("pubkey=" + x20.d.i(this.pubkey));
        return v.y0(arrayList, ", ", "VaultKey{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ i(k kVar, String str, okio.k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? k.VEHICLE_CERT : kVar, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? okio.k.f97943e : kVar2);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m780newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k type, String pubkey, okio.k unknownFields) {
        super(f113175d, unknownFields);
        s.k(type, "type");
        s.k(pubkey, "pubkey");
        s.k(unknownFields, "unknownFields");
        this.type = type;
        this.pubkey = pubkey;
    }
}
