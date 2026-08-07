package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lvc0/y2;", "Lcom/squareup/wire/f;", "", "", "counter", "Lvc0/x2;", "signedMessageInformation", "Lokio/k;", "unknownFields", "<init>", "(ILvc0/x2;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ILvc0/x2;Lokio/k;)Lvc0/y2;", "I", "c", "b", "Lvc0/x2;", DateTokenConverter.CONVERTER_KEY, "()Lvc0/x2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<y2> f119000d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(y2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final int counter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.SignedMessage_information_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final x2 signedMessageInformation;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/y2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/y2;", "value", "", "c", "(Lvc0/y2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/y2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/y2;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/y2;)Lvc0/y2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<y2> {
        a(com.squareup.wire.b bVar, co0.d<y2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.SignedMessage_status", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public y2 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            x2 x2VarDecode = x2.SIGNEDMESSAGE_INFORMATION_NONE;
            long jD = reader.d();
            int iIntValue = 0;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new y2(iIntValue, x2VarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    try {
                        x2VarDecode = x2.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, y2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getCounter() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.getCounter()));
            }
            if (value.getSignedMessageInformation() != x2.SIGNEDMESSAGE_INFORMATION_NONE) {
                x2.ADAPTER.encodeWithTag(writer, 2, value.getSignedMessageInformation());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(y2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getCounter() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.getCounter()));
            }
            return value.getSignedMessageInformation() != x2.SIGNEDMESSAGE_INFORMATION_NONE ? iD + x2.ADAPTER.encodedSizeWithTag(2, value.getSignedMessageInformation()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public y2 redact(y2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return y2.b(value, 0, null, okio.k.f97943e, 3, null);
        }
    }

    public y2() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ y2 b(y2 y2Var, int i11, x2 x2Var, okio.k kVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = y2Var.counter;
        }
        if ((i12 & 2) != 0) {
            x2Var = y2Var.signedMessageInformation;
        }
        if ((i12 & 4) != 0) {
            kVar = y2Var.unknownFields();
        }
        return y2Var.a(i11, x2Var, kVar);
    }

    public final y2 a(int counter, x2 signedMessageInformation, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(signedMessageInformation, "signedMessageInformation");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new y2(counter, signedMessageInformation, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCounter() {
        return this.counter;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final x2 getSignedMessageInformation() {
        return this.signedMessageInformation;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), y2Var.unknownFields()) && this.counter == y2Var.counter && this.signedMessageInformation == y2Var.signedMessageInformation;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.counter)) * 37) + this.signedMessageInformation.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m851newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("counter=" + this.counter);
        arrayList.add("signedMessageInformation=" + this.signedMessageInformation);
        return p013kotlin.collections.v.y0(arrayList, ", ", "SignedMessage_status{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ y2(int i11, x2 x2Var, okio.k kVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? x2.SIGNEDMESSAGE_INFORMATION_NONE : x2Var, (i12 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m851newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(int i11, x2 signedMessageInformation, okio.k unknownFields) {
        super(f119000d, unknownFields);
        p013kotlin.jvm.internal.s.k(signedMessageInformation, "signedMessageInformation");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.counter = i11;
        this.signedMessageInformation = signedMessageInformation;
    }
}
