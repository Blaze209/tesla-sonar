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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB9\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b \u0010\u0014R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b!\u0010\u001c¨\u0006\""}, d2 = {"Lrc0/e;", "Lcom/squareup/wire/f;", "", "Lokio/k;", "epoch", "", "counter", "expires_at", "tag", "unknownFields", "<init>", "(Lokio/k;IILokio/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;IILokio/k;Lokio/k;)Lrc0/e;", "Lokio/k;", DateTokenConverter.CONVERTER_KEY, "()Lokio/k;", "b", "I", "c", "e", "f", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<e> f107664f = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(e.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)
    private final okio.k epoch;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 2)
    private final int counter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FIXED32", jsonName = "expiresAt", label = q.a.OMIT_IDENTITY, tag = 3)
    private final int expires_at;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 4)
    private final okio.k tag;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"rc0/e$a", "Lcom/squareup/wire/ProtoAdapter;", "Lrc0/e;", "value", "", "c", "(Lrc0/e;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lrc0/e;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lrc0/e;", DateTokenConverter.CONVERTER_KEY, "(Lrc0/e;)Lrc0/e;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<e> {
        a(com.squareup.wire.b bVar, co0.d<e> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/Signatures.HMAC_Personalized_Signature_Data", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            okio.k kVarDecode = okio.k.f97943e;
            long jD = reader.d();
            int iIntValue = 0;
            int iIntValue2 = 0;
            okio.k kVarDecode2 = kVarDecode;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new e(kVarDecode, iIntValue, iIntValue2, kVarDecode2, reader.e(jD));
                }
                if (iG == 1) {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                } else if (iG == 2) {
                    iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (iG == 3) {
                    iIntValue2 = ProtoAdapter.FIXED32.decode(reader).intValue();
                } else if (iG != 4) {
                    reader.m(iG);
                } else {
                    kVarDecode2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, e value) {
            s.k(writer, "writer");
            s.k(value, "value");
            okio.k epoch = value.getEpoch();
            okio.k kVar = okio.k.f97943e;
            if (!s.f(epoch, kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getEpoch());
            }
            if (value.getCounter() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getCounter()));
            }
            if (value.getExpires_at() != 0) {
                ProtoAdapter.FIXED32.encodeWithTag(writer, 3, Integer.valueOf(value.getExpires_at()));
            }
            if (!s.f(value.getTag(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 4, value.getTag());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(e value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            okio.k epoch = value.getEpoch();
            okio.k kVar = okio.k.f97943e;
            if (!s.f(epoch, kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getEpoch());
            }
            if (value.getCounter() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getCounter()));
            }
            if (value.getExpires_at() != 0) {
                iD += ProtoAdapter.FIXED32.encodedSizeWithTag(3, Integer.valueOf(value.getExpires_at()));
            }
            return !s.f(value.getTag(), kVar) ? iD + ProtoAdapter.BYTES.encodedSizeWithTag(4, value.getTag()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e redact(e value) {
            s.k(value, "value");
            return e.b(value, null, 0, 0, null, okio.k.f97943e, 15, null);
        }
    }

    public e() {
        this(null, 0, 0, null, null, 31, null);
    }

    public static /* synthetic */ e b(e eVar, okio.k kVar, int i11, int i12, okio.k kVar2, okio.k kVar3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            kVar = eVar.epoch;
        }
        if ((i13 & 2) != 0) {
            i11 = eVar.counter;
        }
        if ((i13 & 4) != 0) {
            i12 = eVar.expires_at;
        }
        if ((i13 & 8) != 0) {
            kVar2 = eVar.tag;
        }
        if ((i13 & 16) != 0) {
            kVar3 = eVar.unknownFields();
        }
        okio.k kVar4 = kVar3;
        int i14 = i12;
        return eVar.a(kVar, i11, i14, kVar2, kVar4);
    }

    public final e a(okio.k epoch, int counter, int expires_at, okio.k tag, okio.k unknownFields) {
        s.k(epoch, "epoch");
        s.k(tag, "tag");
        s.k(unknownFields, "unknownFields");
        return new e(epoch, counter, expires_at, tag, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCounter() {
        return this.counter;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final okio.k getEpoch() {
        return this.epoch;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getExpires_at() {
        return this.expires_at;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return s.f(unknownFields(), eVar.unknownFields()) && s.f(this.epoch, eVar.epoch) && this.counter == eVar.counter && this.expires_at == eVar.expires_at && s.f(this.tag, eVar.tag);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final okio.k getTag() {
        return this.tag;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.epoch.hashCode()) * 37) + Integer.hashCode(this.counter)) * 37) + Integer.hashCode(this.expires_at)) * 37) + this.tag.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m757newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("epoch=" + this.epoch);
        arrayList.add("counter=" + this.counter);
        arrayList.add("expires_at=" + this.expires_at);
        arrayList.add("tag=" + this.tag);
        return v.y0(arrayList, ", ", "HMAC_Personalized_Signature_Data{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ e(okio.k kVar, int i11, int i12, okio.k kVar2, okio.k kVar3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? okio.k.f97943e : kVar, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? okio.k.f97943e : kVar2, (i13 & 16) != 0 ? okio.k.f97943e : kVar3);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m757newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(okio.k epoch, int i11, int i12, okio.k tag, okio.k unknownFields) {
        super(f107664f, unknownFields);
        s.k(epoch, "epoch");
        s.k(tag, "tag");
        s.k(unknownFields, "unknownFields");
        this.epoch = epoch;
        this.counter = i11;
        this.expires_at = i12;
        this.tag = tag;
    }
}
