package uc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co0.d;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB;\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\u001f\u0010\u0018¨\u0006#"}, d2 = {"Luc0/b;", "Lcom/squareup/wire/f;", "", "", "uuid", "public_username", "Luc0/a;", "public_profile_picture", "public_gamername", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Luc0/a;Ljava/lang/String;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Ljava/lang/String;Luc0/a;Ljava/lang/String;Lokio/k;)Luc0/b;", "Ljava/lang/String;", "f", "b", "e", "c", "Luc0/a;", DateTokenConverter.CONVERTER_KEY, "()Luc0/a;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<b> f116100f = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(b.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)
    private final String uuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "publicUsername", label = q.a.OMIT_IDENTITY, tag = 2)
    private final String public_username;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.vault.info.UnencryptedItem#ADAPTER", jsonName = "publicProfilePicture", label = q.a.OMIT_IDENTITY, tag = 3)
    private final uc0.a public_profile_picture;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "publicGamername", label = q.a.OMIT_IDENTITY, tag = 4)
    private final String public_gamername;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"uc0/b$a", "Lcom/squareup/wire/ProtoAdapter;", "Luc0/b;", "value", "", "c", "(Luc0/b;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Luc0/b;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Luc0/b;", DateTokenConverter.CONVERTER_KEY, "(Luc0/b;)Luc0/b;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.VaultInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b decode(k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            String strDecode = "";
            String strDecode2 = "";
            uc0.a aVarDecode = null;
            String strDecode3 = strDecode2;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new b(strDecode, strDecode3, aVarDecode, strDecode2, reader.e(jD));
                }
                if (iG == 1) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iG == 2) {
                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                } else if (iG == 3) {
                    aVarDecode = uc0.a.f116096d.decode(reader);
                } else if (iG != 4) {
                    reader.m(iG);
                } else {
                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, b value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (!s.f(value.getUuid(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getUuid());
            }
            if (!s.f(value.getPublic_username(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getPublic_username());
            }
            if (value.getPublic_profile_picture() != null) {
                uc0.a.f116096d.encodeWithTag(writer, 3, value.getPublic_profile_picture());
            }
            if (!s.f(value.getPublic_gamername(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getPublic_gamername());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(b value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!s.f(value.getUuid(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUuid());
            }
            if (!s.f(value.getPublic_username(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPublic_username());
            }
            if (value.getPublic_profile_picture() != null) {
                iD += uc0.a.f116096d.encodedSizeWithTag(3, value.getPublic_profile_picture());
            }
            return !s.f(value.getPublic_gamername(), "") ? iD + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getPublic_gamername()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b redact(b value) {
            s.k(value, "value");
            uc0.a public_profile_picture = value.getPublic_profile_picture();
            return b.b(value, null, null, public_profile_picture != null ? uc0.a.f116096d.redact(public_profile_picture) : null, null, okio.k.f97943e, 11, null);
        }
    }

    public b() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ b b(b bVar, String str, String str2, uc0.a aVar, String str3, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bVar.uuid;
        }
        if ((i11 & 2) != 0) {
            str2 = bVar.public_username;
        }
        if ((i11 & 4) != 0) {
            aVar = bVar.public_profile_picture;
        }
        if ((i11 & 8) != 0) {
            str3 = bVar.public_gamername;
        }
        if ((i11 & 16) != 0) {
            kVar = bVar.unknownFields();
        }
        okio.k kVar2 = kVar;
        uc0.a aVar2 = aVar;
        return bVar.a(str, str2, aVar2, str3, kVar2);
    }

    public final b a(String uuid, String public_username, uc0.a public_profile_picture, String public_gamername, okio.k unknownFields) {
        s.k(uuid, "uuid");
        s.k(public_username, "public_username");
        s.k(public_gamername, "public_gamername");
        s.k(unknownFields, "unknownFields");
        return new b(uuid, public_username, public_profile_picture, public_gamername, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPublic_gamername() {
        return this.public_gamername;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final uc0.a getPublic_profile_picture() {
        return this.public_profile_picture;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPublic_username() {
        return this.public_username;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return s.f(unknownFields(), bVar.unknownFields()) && s.f(this.uuid, bVar.uuid) && s.f(this.public_username, bVar.public_username) && s.f(this.public_profile_picture, bVar.public_profile_picture) && s.f(this.public_gamername, bVar.public_gamername);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.uuid.hashCode()) * 37) + this.public_username.hashCode()) * 37;
        uc0.a aVar = this.public_profile_picture;
        int iHashCode2 = ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 37) + this.public_gamername.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m783newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("uuid=" + x20.d.i(this.uuid));
        arrayList.add("public_username=" + x20.d.i(this.public_username));
        uc0.a aVar = this.public_profile_picture;
        if (aVar != null) {
            arrayList.add("public_profile_picture=" + aVar);
        }
        arrayList.add("public_gamername=" + x20.d.i(this.public_gamername));
        return v.y0(arrayList, ", ", "VaultInfo{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ b(String str, String str2, uc0.a aVar, String str3, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? null : aVar, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? okio.k.f97943e : kVar);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m783newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String uuid, String public_username, uc0.a aVar, String public_gamername, okio.k unknownFields) {
        super(f116100f, unknownFields);
        s.k(uuid, "uuid");
        s.k(public_username, "public_username");
        s.k(public_gamername, "public_gamername");
        s.k(unknownFields, "unknownFields");
        this.uuid = uuid;
        this.public_username = public_username;
        this.public_profile_picture = aVar;
        this.public_gamername = public_gamername;
    }
}
