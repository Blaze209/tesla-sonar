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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BS\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b%\u0010$R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b)\u0010(¨\u0006*"}, d2 = {"Ltc0/h;", "Lcom/squareup/wire/f;", "", "", "name", "Ltc0/a;", "label_key", "data_key", "", "Ltc0/b;", "items", "Ltc0/j;", "wrapped_class_keys", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/String;Ltc0/a;Ltc0/a;Ljava/util/List;Ljava/util/List;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Ltc0/a;Ltc0/a;Ljava/util/List;Ljava/util/List;Lokio/k;)Ltc0/h;", "Ljava/lang/String;", "getName", "b", "Ltc0/a;", "e", "()Ltc0/a;", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "()Ljava/util/List;", "f", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h extends com.squareup.wire.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ProtoAdapter<h> f113168g = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(h.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.vault.EncryptedData#ADAPTER", jsonName = "labelKey", label = q.a.OMIT_IDENTITY, tag = 2)
    private final tc0.a label_key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.vault.EncryptedData#ADAPTER", jsonName = "dataKey", label = q.a.OMIT_IDENTITY, tag = 3)
    private final tc0.a data_key;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.vault.Item#ADAPTER", label = q.a.REPEATED, tag = 4)
    private final List<b> items;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.vault.WrappedClassKey#ADAPTER", jsonName = "wrappedClassKeys", label = q.a.REPEATED, tag = 5)
    private final List<j> wrapped_class_keys;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"tc0/h$a", "Lcom/squareup/wire/ProtoAdapter;", "Ltc0/h;", "value", "", "c", "(Ltc0/h;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Ltc0/h;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ltc0/h;", DateTokenConverter.CONVERTER_KEY, "(Ltc0/h;)Ltc0/h;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<h> {
        a(com.squareup.wire.b bVar, co0.d<h> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.VaultClass", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            long jD = reader.d();
            String strDecode = "";
            tc0.a aVarDecode = null;
            tc0.a aVarDecode2 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new h(strDecode, aVarDecode, aVarDecode2, arrayList, arrayList2, reader.e(jD));
                }
                if (iG == 1) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iG == 2) {
                    aVarDecode = tc0.a.f113132e.decode(reader);
                } else if (iG == 3) {
                    aVarDecode2 = tc0.a.f113132e.decode(reader);
                } else if (iG == 4) {
                    arrayList.add(b.f113137h.decode(reader));
                } else if (iG != 5) {
                    reader.m(iG);
                } else {
                    arrayList2.add(j.f113179e.decode(reader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, h value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (!s.f(value.getName(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getName());
            }
            if (value.getLabel_key() != null) {
                tc0.a.f113132e.encodeWithTag(writer, 2, value.getLabel_key());
            }
            if (value.getData_key() != null) {
                tc0.a.f113132e.encodeWithTag(writer, 3, value.getData_key());
            }
            b.f113137h.asRepeated().encodeWithTag(writer, 4, value.d());
            j.f113179e.asRepeated().encodeWithTag(writer, 5, value.f());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(h value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!s.f(value.getName(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
            }
            if (value.getLabel_key() != null) {
                iD += tc0.a.f113132e.encodedSizeWithTag(2, value.getLabel_key());
            }
            if (value.getData_key() != null) {
                iD += tc0.a.f113132e.encodedSizeWithTag(3, value.getData_key());
            }
            return iD + b.f113137h.asRepeated().encodedSizeWithTag(4, value.d()) + j.f113179e.asRepeated().encodedSizeWithTag(5, value.f());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public h redact(h value) {
            s.k(value, "value");
            tc0.a label_key = value.getLabel_key();
            tc0.a aVarRedact = label_key != null ? tc0.a.f113132e.redact(label_key) : null;
            tc0.a data_key = value.getData_key();
            return h.b(value, null, aVarRedact, data_key != null ? tc0.a.f113132e.redact(data_key) : null, x20.d.a(value.d(), b.f113137h), x20.d.a(value.f(), j.f113179e), okio.k.f97943e, 1, null);
        }
    }

    public h() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h b(h hVar, String str, tc0.a aVar, tc0.a aVar2, List list, List list2, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = hVar.name;
        }
        if ((i11 & 2) != 0) {
            aVar = hVar.label_key;
        }
        if ((i11 & 4) != 0) {
            aVar2 = hVar.data_key;
        }
        if ((i11 & 8) != 0) {
            list = hVar.items;
        }
        if ((i11 & 16) != 0) {
            list2 = hVar.wrapped_class_keys;
        }
        if ((i11 & 32) != 0) {
            kVar = hVar.unknownFields();
        }
        List list3 = list2;
        okio.k kVar2 = kVar;
        return hVar.a(str, aVar, aVar2, list, list3, kVar2);
    }

    public final h a(String name, tc0.a label_key, tc0.a data_key, List<b> items, List<j> wrapped_class_keys, okio.k unknownFields) {
        s.k(name, "name");
        s.k(items, "items");
        s.k(wrapped_class_keys, "wrapped_class_keys");
        s.k(unknownFields, "unknownFields");
        return new h(name, label_key, data_key, items, wrapped_class_keys, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final tc0.a getData_key() {
        return this.data_key;
    }

    public final List<b> d() {
        return this.items;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final tc0.a getLabel_key() {
        return this.label_key;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return s.f(unknownFields(), hVar.unknownFields()) && s.f(this.name, hVar.name) && s.f(this.label_key, hVar.label_key) && s.f(this.data_key, hVar.data_key) && s.f(this.items, hVar.items) && s.f(this.wrapped_class_keys, hVar.wrapped_class_keys);
    }

    public final List<j> f() {
        return this.wrapped_class_keys;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37;
        tc0.a aVar = this.label_key;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 37;
        tc0.a aVar2 = this.data_key;
        int iHashCode3 = ((((iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 37) + this.items.hashCode()) * 37) + this.wrapped_class_keys.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m779newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=" + x20.d.i(this.name));
        tc0.a aVar = this.label_key;
        if (aVar != null) {
            arrayList.add("label_key=" + aVar);
        }
        tc0.a aVar2 = this.data_key;
        if (aVar2 != null) {
            arrayList.add("data_key=" + aVar2);
        }
        if (!this.items.isEmpty()) {
            arrayList.add("items=" + this.items);
        }
        if (!this.wrapped_class_keys.isEmpty()) {
            arrayList.add("wrapped_class_keys=" + this.wrapped_class_keys);
        }
        return v.y0(arrayList, ", ", "VaultClass{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ h(String str, tc0.a aVar, tc0.a aVar2, List list, List list2, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : aVar, (i11 & 4) != 0 ? null : aVar2, (i11 & 8) != 0 ? v.m() : list, (i11 & 16) != 0 ? v.m() : list2, (i11 & 32) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m779newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String name, tc0.a aVar, tc0.a aVar2, List<b> items, List<j> wrapped_class_keys, okio.k unknownFields) {
        super(f113168g, unknownFields);
        s.k(name, "name");
        s.k(items, "items");
        s.k(wrapped_class_keys, "wrapped_class_keys");
        s.k(unknownFields, "unknownFields");
        this.name = name;
        this.label_key = aVar;
        this.data_key = aVar2;
        this.items = x20.d.g("items", items);
        this.wrapped_class_keys = x20.d.g("wrapped_class_keys", wrapped_class_keys);
    }
}
