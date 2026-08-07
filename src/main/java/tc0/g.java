package tc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BW\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ]\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b.\u0010/R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b&\u00101¨\u00062"}, d2 = {"Ltc0/g;", "Lcom/squareup/wire/f;", "", "", "uuid", "", "Ltc0/h;", "classes", "Luc0/b;", "vaultInfo", "Ltc0/d;", "remote_client_key", "Lokio/k;", "pubkeys_reference_id", "", "rewrap_only", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Luc0/b;Ltc0/d;Lokio/k;ZLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Ljava/util/List;Luc0/b;Ltc0/d;Lokio/k;ZLokio/k;)Ltc0/g;", "Ljava/lang/String;", "g", "b", "Luc0/b;", "h", "()Luc0/b;", "c", "Ltc0/d;", "e", "()Ltc0/d;", DateTokenConverter.CONVERTER_KEY, "Lokio/k;", "()Lokio/k;", "Z", "f", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g extends com.squareup.wire.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ProtoAdapter<g> f113160h = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(g.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)
    private final String uuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.vault.info.VaultInfo#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)
    private final uc0.b vaultInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.vault.RemoteClientKey#ADAPTER", jsonName = "remoteClientKey", label = q.a.OMIT_IDENTITY, tag = 4)
    private final d remote_client_key;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "pubkeysReferenceId", label = q.a.OMIT_IDENTITY, tag = 5)
    private final okio.k pubkeys_reference_id;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "rewrapOnly", label = q.a.OMIT_IDENTITY, tag = 6)
    private final boolean rewrap_only;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.vault.VaultClass#ADAPTER", label = q.a.REPEATED, tag = 2)
    private final List<h> classes;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"tc0/g$a", "Lcom/squareup/wire/ProtoAdapter;", "Ltc0/g;", "value", "", "c", "(Ltc0/g;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Ltc0/g;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ltc0/g;", DateTokenConverter.CONVERTER_KEY, "(Ltc0/g;)Ltc0/g;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<g> {
        a(com.squareup.wire.b bVar, co0.d<g> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.Vault", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            okio.k kVarDecode = okio.k.f97943e;
            long jD = reader.d();
            String strDecode = "";
            uc0.b bVarDecode = null;
            boolean zBooleanValue = false;
            d dVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new g(strDecode, arrayList, bVarDecode, dVarDecode, kVarDecode, zBooleanValue, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        strDecode = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 2:
                        arrayList.add(h.f113168g.decode(reader));
                        break;
                    case 3:
                        bVarDecode = uc0.b.f116100f.decode(reader);
                        break;
                    case 4:
                        dVarDecode = d.f113148c.decode(reader);
                        break;
                    case 5:
                        kVarDecode = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 6:
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, g value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (!s.f(value.getUuid(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getUuid());
            }
            h.f113168g.asRepeated().encodeWithTag(writer, 2, value.c());
            if (value.getVaultInfo() != null) {
                uc0.b.f116100f.encodeWithTag(writer, 3, value.getVaultInfo());
            }
            if (value.getRemote_client_key() != null) {
                d.f113148c.encodeWithTag(writer, 4, value.getRemote_client_key());
            }
            if (!s.f(value.getPubkeys_reference_id(), okio.k.f97943e)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 5, value.getPubkeys_reference_id());
            }
            if (value.getRewrap_only()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, Boolean.valueOf(value.getRewrap_only()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(g value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!s.f(value.getUuid(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUuid());
            }
            int iEncodedSizeWithTag = iD + h.f113168g.asRepeated().encodedSizeWithTag(2, value.c());
            if (value.getVaultInfo() != null) {
                iEncodedSizeWithTag += uc0.b.f116100f.encodedSizeWithTag(3, value.getVaultInfo());
            }
            if (value.getRemote_client_key() != null) {
                iEncodedSizeWithTag += d.f113148c.encodedSizeWithTag(4, value.getRemote_client_key());
            }
            if (!s.f(value.getPubkeys_reference_id(), okio.k.f97943e)) {
                iEncodedSizeWithTag += ProtoAdapter.BYTES.encodedSizeWithTag(5, value.getPubkeys_reference_id());
            }
            return value.getRewrap_only() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getRewrap_only())) : iEncodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public g redact(g value) {
            s.k(value, "value");
            List listA = x20.d.a(value.c(), h.f113168g);
            uc0.b vaultInfo = value.getVaultInfo();
            uc0.b bVarRedact = vaultInfo != null ? uc0.b.f116100f.redact(vaultInfo) : null;
            d remote_client_key = value.getRemote_client_key();
            return g.b(value, null, listA, bVarRedact, remote_client_key != null ? d.f113148c.redact(remote_client_key) : null, null, false, okio.k.f97943e, 49, null);
        }
    }

    public g() {
        this(null, null, null, null, null, false, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g b(g gVar, String str, List list, uc0.b bVar, d dVar, okio.k kVar, boolean z11, okio.k kVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = gVar.uuid;
        }
        if ((i11 & 2) != 0) {
            list = gVar.classes;
        }
        if ((i11 & 4) != 0) {
            bVar = gVar.vaultInfo;
        }
        if ((i11 & 8) != 0) {
            dVar = gVar.remote_client_key;
        }
        if ((i11 & 16) != 0) {
            kVar = gVar.pubkeys_reference_id;
        }
        if ((i11 & 32) != 0) {
            z11 = gVar.rewrap_only;
        }
        if ((i11 & 64) != 0) {
            kVar2 = gVar.unknownFields();
        }
        boolean z12 = z11;
        okio.k kVar3 = kVar2;
        okio.k kVar4 = kVar;
        uc0.b bVar2 = bVar;
        return gVar.a(str, list, bVar2, dVar, kVar4, z12, kVar3);
    }

    public final g a(String uuid, List<h> classes, uc0.b vaultInfo, d remote_client_key, okio.k pubkeys_reference_id, boolean rewrap_only, okio.k unknownFields) {
        s.k(uuid, "uuid");
        s.k(classes, "classes");
        s.k(pubkeys_reference_id, "pubkeys_reference_id");
        s.k(unknownFields, "unknownFields");
        return new g(uuid, classes, vaultInfo, remote_client_key, pubkeys_reference_id, rewrap_only, unknownFields);
    }

    public final List<h> c() {
        return this.classes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final okio.k getPubkeys_reference_id() {
        return this.pubkeys_reference_id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final d getRemote_client_key() {
        return this.remote_client_key;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return s.f(unknownFields(), gVar.unknownFields()) && s.f(this.uuid, gVar.uuid) && s.f(this.classes, gVar.classes) && s.f(this.vaultInfo, gVar.vaultInfo) && s.f(this.remote_client_key, gVar.remote_client_key) && s.f(this.pubkeys_reference_id, gVar.pubkeys_reference_id) && this.rewrap_only == gVar.rewrap_only;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRewrap_only() {
        return this.rewrap_only;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final uc0.b getVaultInfo() {
        return this.vaultInfo;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.uuid.hashCode()) * 37) + this.classes.hashCode()) * 37;
        uc0.b bVar = this.vaultInfo;
        int iHashCode2 = (iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 37;
        d dVar = this.remote_client_key;
        int iHashCode3 = ((((iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 37) + this.pubkeys_reference_id.hashCode()) * 37) + Boolean.hashCode(this.rewrap_only);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m778newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("uuid=" + x20.d.i(this.uuid));
        if (!this.classes.isEmpty()) {
            arrayList.add("classes=" + this.classes);
        }
        uc0.b bVar = this.vaultInfo;
        if (bVar != null) {
            arrayList.add("vaultInfo=" + bVar);
        }
        d dVar = this.remote_client_key;
        if (dVar != null) {
            arrayList.add("remote_client_key=" + dVar);
        }
        arrayList.add("pubkeys_reference_id=" + this.pubkeys_reference_id);
        arrayList.add("rewrap_only=" + this.rewrap_only);
        return v.y0(arrayList, ", ", "Vault{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ g(String str, List list, uc0.b bVar, d dVar, okio.k kVar, boolean z11, okio.k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? v.m() : list, (i11 & 4) != 0 ? null : bVar, (i11 & 8) != 0 ? null : dVar, (i11 & 16) != 0 ? okio.k.f97943e : kVar, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? okio.k.f97943e : kVar2);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m778newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String uuid, List<h> classes, uc0.b bVar, d dVar, okio.k pubkeys_reference_id, boolean z11, okio.k unknownFields) {
        super(f113160h, unknownFields);
        s.k(uuid, "uuid");
        s.k(classes, "classes");
        s.k(pubkeys_reference_id, "pubkeys_reference_id");
        s.k(unknownFields, "unknownFields");
        this.uuid = uuid;
        this.vaultInfo = bVar;
        this.remote_client_key = dVar;
        this.pubkeys_reference_id = pubkeys_reference_id;
        this.rewrap_only = z11;
        this.classes = x20.d.g("classes", classes);
    }
}
