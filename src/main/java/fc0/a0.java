package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Lfc0/a0;", "Lcom/squareup/wire/f;", "", "Lfc0/w5;", "field_number", "Lokio/k;", "ciphertext", "tag", "unknownFields", "<init>", "(Lfc0/w5;Lokio/k;Lokio/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lfc0/w5;Lokio/k;Lokio/k;Lokio/k;)Lfc0/a0;", "Lfc0/w5;", DateTokenConverter.CONVERTER_KEY, "()Lfc0/w5;", "b", "Lokio/k;", "c", "()Lokio/k;", "e", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<a0> f64849e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(a0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.VehicleDataFields#ADAPTER", jsonName = "fieldNumber", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final w5 field_number;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final okio.k ciphertext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final okio.k tag;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/a0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/a0;", "value", "", "c", "(Lfc0/a0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/a0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/a0;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/a0;)Lfc0/a0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<a0> {
        a(com.squareup.wire.b bVar, co0.d<a0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.EncryptedData", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            w5 w5VarDecode = w5.NOTHING;
            okio.k kVarDecode = okio.k.f97943e;
            long jD = reader.d();
            okio.k kVarDecode2 = kVarDecode;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new a0(w5VarDecode, kVarDecode, kVarDecode2, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        w5VarDecode = w5.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG == 2) {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    kVarDecode2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, a0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getField_number() != w5.NOTHING) {
                w5.ADAPTER.encodeWithTag(writer, 1, value.getField_number());
            }
            okio.k ciphertext = value.getCiphertext();
            okio.k kVar = okio.k.f97943e;
            if (!p013kotlin.jvm.internal.s.f(ciphertext, kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getCiphertext());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getTag(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.getTag());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(a0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getField_number() != w5.NOTHING) {
                iD += w5.ADAPTER.encodedSizeWithTag(1, value.getField_number());
            }
            okio.k ciphertext = value.getCiphertext();
            okio.k kVar = okio.k.f97943e;
            if (!p013kotlin.jvm.internal.s.f(ciphertext, kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getCiphertext());
            }
            return !p013kotlin.jvm.internal.s.f(value.getTag(), kVar) ? iD + ProtoAdapter.BYTES.encodedSizeWithTag(3, value.getTag()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a0 redact(a0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return a0.b(value, null, null, null, okio.k.f97943e, 7, null);
        }
    }

    public a0() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ a0 b(a0 a0Var, w5 w5Var, okio.k kVar, okio.k kVar2, okio.k kVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            w5Var = a0Var.field_number;
        }
        if ((i11 & 2) != 0) {
            kVar = a0Var.ciphertext;
        }
        if ((i11 & 4) != 0) {
            kVar2 = a0Var.tag;
        }
        if ((i11 & 8) != 0) {
            kVar3 = a0Var.unknownFields();
        }
        return a0Var.a(w5Var, kVar, kVar2, kVar3);
    }

    public final a0 a(w5 field_number, okio.k ciphertext, okio.k tag, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(field_number, "field_number");
        p013kotlin.jvm.internal.s.k(ciphertext, "ciphertext");
        p013kotlin.jvm.internal.s.k(tag, "tag");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new a0(field_number, ciphertext, tag, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final okio.k getCiphertext() {
        return this.ciphertext;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final w5 getField_number() {
        return this.field_number;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final okio.k getTag() {
        return this.tag;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), a0Var.unknownFields()) && this.field_number == a0Var.field_number && p013kotlin.jvm.internal.s.f(this.ciphertext, a0Var.ciphertext) && p013kotlin.jvm.internal.s.f(this.tag, a0Var.tag);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.field_number.hashCode()) * 37) + this.ciphertext.hashCode()) * 37) + this.tag.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m195newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("field_number=" + this.field_number);
        arrayList.add("ciphertext=" + this.ciphertext);
        arrayList.add("tag=" + this.tag);
        return p013kotlin.collections.v.y0(arrayList, ", ", "EncryptedData{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ a0(w5 w5Var, okio.k kVar, okio.k kVar2, okio.k kVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? w5.NOTHING : w5Var, (i11 & 2) != 0 ? okio.k.f97943e : kVar, (i11 & 4) != 0 ? okio.k.f97943e : kVar2, (i11 & 8) != 0 ? okio.k.f97943e : kVar3);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m195newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(w5 field_number, okio.k ciphertext, okio.k tag, okio.k unknownFields) {
        super(f64849e, unknownFields);
        p013kotlin.jvm.internal.s.k(field_number, "field_number");
        p013kotlin.jvm.internal.s.k(ciphertext, "ciphertext");
        p013kotlin.jvm.internal.s.k(tag, "tag");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.field_number = field_number;
        this.ciphertext = ciphertext;
        this.tag = tag;
    }
}
