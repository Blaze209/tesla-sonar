package rc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.q;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lrc0/d;", "Lcom/squareup/wire/f;", "", "Lrc0/h;", "key_identity", "Lokio/k;", "unknownFields", "<init>", "(Lrc0/h;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lrc0/h;Lokio/k;)Lrc0/d;", "Lrc0/h;", "b", "()Lrc0/h;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends com.squareup.wire.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ProtoAdapter<d> f107661c = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(d.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.signatures.KeyIdentity#ADAPTER", jsonName = "keyIdentity", label = q.a.OMIT_IDENTITY, tag = 1)
    private final h key_identity;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"rc0/d$a", "Lcom/squareup/wire/ProtoAdapter;", "Lrc0/d;", "value", "", "c", "(Lrc0/d;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lrc0/d;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lrc0/d;", DateTokenConverter.CONVERTER_KEY, "(Lrc0/d;)Lrc0/d;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<d> {
        a(com.squareup.wire.b bVar, co0.d<d> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/Signatures.GetSessionInfoRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            h hVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new d(hVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    hVarDecode = h.f107673f.decode(reader);
                } else {
                    reader.m(iG);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, d value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getKey_identity() != null) {
                h.f107673f.encodeWithTag(writer, 1, value.getKey_identity());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(d value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            return value.getKey_identity() != null ? iD + h.f107673f.encodedSizeWithTag(1, value.getKey_identity()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public d redact(d value) {
            s.k(value, "value");
            h key_identity = value.getKey_identity();
            return value.a(key_identity != null ? h.f107673f.redact(key_identity) : null, okio.k.f97943e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final d a(h key_identity, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new d(key_identity, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getKey_identity() {
        return this.key_identity;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        return s.f(unknownFields(), dVar.unknownFields()) && s.f(this.key_identity, dVar.key_identity);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        h hVar = this.key_identity;
        int iHashCode2 = iHashCode + (hVar != null ? hVar.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m756newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        h hVar = this.key_identity;
        if (hVar != null) {
            arrayList.add("key_identity=" + hVar);
        }
        return v.y0(arrayList, ", ", "GetSessionInfoRequest{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ d(h hVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : hVar, (i11 & 2) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m756newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, okio.k unknownFields) {
        super(f107661c, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.key_identity = hVar;
    }
}
