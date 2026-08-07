package jc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co0.d;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import jn0.e;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Ljc0/b;", "Lcom/squareup/wire/f;", "", "Lokio/k;", "publicKey", "", "slot", "unknownFields", "<init>", "(Lokio/k;Ljava/lang/Integer;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;Ljava/lang/Integer;Lokio/k;)Ljc0/b;", "Lokio/k;", "c", "()Lokio/k;", "b", "Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Integer;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<b> f83589d = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(b.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 1)
    private final k publicKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 2)
    private final Integer slot;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"jc0/b$a", "Lcom/squareup/wire/ProtoAdapter;", "Ljc0/b;", "value", "", "c", "(Ljc0/b;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Ljc0/b;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljc0/b;", DateTokenConverter.CONVERTER_KEY, "(Ljc0/b;)Ljc0/b;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/Errors.KeyNotFoundContext", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            k kVarDecode = null;
            Integer numDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new b(kVarDecode, numDecode, reader.e(jD));
                }
                if (iG == 1) {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    numDecode = ProtoAdapter.UINT32.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, b value) {
            s.k(writer, "writer");
            s.k(value, "value");
            ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getPublicKey());
            ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.getSlot());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(b value) {
            s.k(value, "value");
            return value.unknownFields().D() + ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getPublicKey()) + ProtoAdapter.UINT32.encodedSizeWithTag(2, value.getSlot());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b redact(b value) {
            s.k(value, "value");
            return b.b(value, null, null, k.f97943e, 3, null);
        }
    }

    public b() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ b b(b bVar, k kVar, Integer num, k kVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = bVar.publicKey;
        }
        if ((i11 & 2) != 0) {
            num = bVar.slot;
        }
        if ((i11 & 4) != 0) {
            kVar2 = bVar.unknownFields();
        }
        return bVar.a(kVar, num, kVar2);
    }

    public final b a(k publicKey, Integer slot, k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new b(publicKey, slot, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k getPublicKey() {
        return this.publicKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getSlot() {
        return this.slot;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return s.f(unknownFields(), bVar.unknownFields()) && s.f(this.publicKey, bVar.publicKey) && s.f(this.slot, bVar.slot);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        k kVar = this.publicKey;
        int iHashCode2 = (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 37;
        Integer num = this.slot;
        int iHashCode3 = iHashCode2 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m486newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        k kVar = this.publicKey;
        if (kVar != null) {
            arrayList.add("publicKey=" + kVar);
        }
        Integer num = this.slot;
        if (num != null) {
            arrayList.add("slot=" + num);
        }
        return v.y0(arrayList, ", ", "KeyNotFoundContext{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ b(k kVar, Integer num, k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : kVar, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? k.f97943e : kVar2);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m486newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k kVar, Integer num, k unknownFields) {
        super(f83589d, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.publicKey = kVar;
        this.slot = num;
        if (x20.d.c(kVar, num) > 1) {
            throw new IllegalArgumentException("At most one of publicKey, slot may be non-null");
        }
    }
}
