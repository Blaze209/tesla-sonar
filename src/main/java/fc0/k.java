package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lfc0/k;", "Lcom/squareup/wire/f;", "", "", "utf8Name", "Lokio/k;", "macAddress", "unknownFields", "<init>", "(Ljava/lang/String;Lokio/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Lokio/k;Lokio/k;)Lfc0/k;", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "b", "Lokio/k;", "c", "()Lokio/k;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<k> f65144d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(k.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final String utf8Name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final okio.k macAddress;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/k$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/k;", "value", "", "c", "(Lfc0/k;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/k;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/k;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/k;)Lfc0/k;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<k> {
        a(com.squareup.wire.b bVar, co0.d<k> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.BluetoothClassicPairingRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            okio.k kVarDecode = okio.k.f97943e;
            long jD = reader.d();
            String strDecode = "";
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new k(strDecode, kVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, k value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (!p013kotlin.jvm.internal.s.f(value.getUtf8Name(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getUtf8Name());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getMacAddress(), okio.k.f97943e)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getMacAddress());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(k value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!p013kotlin.jvm.internal.s.f(value.getUtf8Name(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUtf8Name());
            }
            return !p013kotlin.jvm.internal.s.f(value.getMacAddress(), okio.k.f97943e) ? iD + ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getMacAddress()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public k redact(k value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return k.b(value, null, null, okio.k.f97943e, 3, null);
        }
    }

    public k() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ k b(k kVar, String str, okio.k kVar2, okio.k kVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kVar.utf8Name;
        }
        if ((i11 & 2) != 0) {
            kVar2 = kVar.macAddress;
        }
        if ((i11 & 4) != 0) {
            kVar3 = kVar.unknownFields();
        }
        return kVar.a(str, kVar2, kVar3);
    }

    public final k a(String utf8Name, okio.k macAddress, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(utf8Name, "utf8Name");
        p013kotlin.jvm.internal.s.k(macAddress, "macAddress");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new k(utf8Name, macAddress, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final okio.k getMacAddress() {
        return this.macAddress;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getUtf8Name() {
        return this.utf8Name;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof k)) {
            return false;
        }
        k kVar = (k) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), kVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.utf8Name, kVar.utf8Name) && p013kotlin.jvm.internal.s.f(this.macAddress, kVar.macAddress);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.utf8Name.hashCode()) * 37) + this.macAddress.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m269newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("utf8Name=" + x20.d.i(this.utf8Name));
        arrayList.add("macAddress=" + this.macAddress);
        return p013kotlin.collections.v.y0(arrayList, ", ", "BluetoothClassicPairingRequest{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ k(String str, okio.k kVar, okio.k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? okio.k.f97943e : kVar, (i11 & 4) != 0 ? okio.k.f97943e : kVar2);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m269newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String utf8Name, okio.k macAddress, okio.k unknownFields) {
        super(f65144d, unknownFields);
        p013kotlin.jvm.internal.s.k(utf8Name, "utf8Name");
        p013kotlin.jvm.internal.s.k(macAddress, "macAddress");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.utf8Name = utf8Name;
        this.macAddress = macAddress;
    }
}
