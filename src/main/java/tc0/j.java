package tc0;

import ch.qos.logback.core.joran.action.Action;
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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001f\u0010\u0016¨\u0006 "}, d2 = {"Ltc0/j;", "Lcom/squareup/wire/f;", "", "", "name", "Lokio/k;", Action.KEY_ATTRIBUTE, "pubkey_id", "unknownFields", "<init>", "(Ljava/lang/String;Lokio/k;Ljava/lang/String;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Lokio/k;Ljava/lang/String;Lokio/k;)Ltc0/j;", "Ljava/lang/String;", "getName", "b", "Lokio/k;", "c", "()Lokio/k;", DateTokenConverter.CONVERTER_KEY, "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<j> f113179e = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(j.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)
    private final okio.k key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "pubkeyId", label = q.a.OMIT_IDENTITY, tag = 3)
    private final String pubkey_id;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"tc0/j$a", "Lcom/squareup/wire/ProtoAdapter;", "Ltc0/j;", "value", "", "c", "(Ltc0/j;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Ltc0/j;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ltc0/j;", DateTokenConverter.CONVERTER_KEY, "(Ltc0/j;)Ltc0/j;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<j> {
        a(com.squareup.wire.b bVar, co0.d<j> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.WrappedClassKey", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            okio.k kVarDecode = okio.k.f97943e;
            long jD = reader.d();
            String strDecode = "";
            String strDecode2 = "";
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new j(strDecode, kVarDecode, strDecode2, reader.e(jD));
                }
                if (iG == 1) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iG == 2) {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, j value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (!s.f(value.getName(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getName());
            }
            if (!s.f(value.getKey(), okio.k.f97943e)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getKey());
            }
            if (!s.f(value.getPubkey_id(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getPubkey_id());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(j value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!s.f(value.getName(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
            }
            if (!s.f(value.getKey(), okio.k.f97943e)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getKey());
            }
            return !s.f(value.getPubkey_id(), "") ? iD + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPubkey_id()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public j redact(j value) {
            s.k(value, "value");
            return j.b(value, null, null, null, okio.k.f97943e, 7, null);
        }
    }

    public j() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ j b(j jVar, String str, okio.k kVar, String str2, okio.k kVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = jVar.name;
        }
        if ((i11 & 2) != 0) {
            kVar = jVar.key;
        }
        if ((i11 & 4) != 0) {
            str2 = jVar.pubkey_id;
        }
        if ((i11 & 8) != 0) {
            kVar2 = jVar.unknownFields();
        }
        return jVar.a(str, kVar, str2, kVar2);
    }

    public final j a(String name, okio.k key, String pubkey_id, okio.k unknownFields) {
        s.k(name, "name");
        s.k(key, "key");
        s.k(pubkey_id, "pubkey_id");
        s.k(unknownFields, "unknownFields");
        return new j(name, key, pubkey_id, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final okio.k getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPubkey_id() {
        return this.pubkey_id;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof j)) {
            return false;
        }
        j jVar = (j) other;
        return s.f(unknownFields(), jVar.unknownFields()) && s.f(this.name, jVar.name) && s.f(this.key, jVar.key) && s.f(this.pubkey_id, jVar.pubkey_id);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37) + this.key.hashCode()) * 37) + this.pubkey_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m781newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=" + x20.d.i(this.name));
        arrayList.add("key=" + this.key);
        arrayList.add("pubkey_id=" + x20.d.i(this.pubkey_id));
        return v.y0(arrayList, ", ", "WrappedClassKey{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ j(String str, okio.k kVar, String str2, okio.k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? okio.k.f97943e : kVar, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? okio.k.f97943e : kVar2);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m781newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String name, okio.k key, String pubkey_id, okio.k unknownFields) {
        super(f113179e, unknownFields);
        s.k(name, "name");
        s.k(key, "key");
        s.k(pubkey_id, "pubkey_id");
        s.k(unknownFields, "unknownFields");
        this.name = name;
        this.key = key;
        this.pubkey_id = pubkey_id;
    }
}
