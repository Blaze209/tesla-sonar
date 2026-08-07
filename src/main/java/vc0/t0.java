package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBC\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b!\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001d¨\u0006$"}, d2 = {"Lvc0/t0;", "Lcom/squareup/wire/f;", "", "Lokio/k;", PlaceTypes.ADDRESS, "", "preambleId", "channel", "firaSessionId", "sts", "unknownFields", "<init>", "(Lokio/k;IIILokio/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;IIILokio/k;Lokio/k;)Lvc0/t0;", "Lokio/k;", "c", "()Lokio/k;", "b", "I", "f", DateTokenConverter.CONVERTER_KEY, "e", "g", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ProtoAdapter<t0> f118916g = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(t0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final okio.k address;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final int preambleId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final int channel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final int firaSessionId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final okio.k sts;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/t0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/t0;", "value", "", "c", "(Lvc0/t0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/t0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/t0;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/t0;)Lvc0/t0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<t0> {
        a(com.squareup.wire.b bVar, co0.d<t0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.FiraSessionData", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            okio.k kVarDecode = okio.k.f97943e;
            long jD = reader.d();
            int iIntValue = 0;
            int iIntValue2 = 0;
            int iIntValue3 = 0;
            okio.k kVarDecode2 = kVarDecode;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new t0(kVarDecode, iIntValue, iIntValue2, iIntValue3, kVarDecode2, reader.e(jD));
                }
                if (iG == 1) {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                } else if (iG == 2) {
                    iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (iG == 3) {
                    iIntValue2 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (iG == 4) {
                    iIntValue3 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (iG != 5) {
                    reader.m(iG);
                } else {
                    kVarDecode2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, t0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            okio.k address = value.getAddress();
            okio.k kVar = okio.k.f97943e;
            if (!p013kotlin.jvm.internal.s.f(address, kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getAddress());
            }
            if (value.getPreambleId() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getPreambleId()));
            }
            if (value.getChannel() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.getChannel()));
            }
            if (value.getFiraSessionId() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 4, Integer.valueOf(value.getFiraSessionId()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getSts(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 5, value.getSts());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(t0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            okio.k address = value.getAddress();
            okio.k kVar = okio.k.f97943e;
            if (!p013kotlin.jvm.internal.s.f(address, kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getAddress());
            }
            if (value.getPreambleId() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getPreambleId()));
            }
            if (value.getChannel() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.getChannel()));
            }
            if (value.getFiraSessionId() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(4, Integer.valueOf(value.getFiraSessionId()));
            }
            return !p013kotlin.jvm.internal.s.f(value.getSts(), kVar) ? iD + ProtoAdapter.BYTES.encodedSizeWithTag(5, value.getSts()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public t0 redact(t0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return t0.b(value, null, 0, 0, 0, null, okio.k.f97943e, 31, null);
        }
    }

    public t0() {
        this(null, 0, 0, 0, null, null, 63, null);
    }

    public static /* synthetic */ t0 b(t0 t0Var, okio.k kVar, int i11, int i12, int i13, okio.k kVar2, okio.k kVar3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            kVar = t0Var.address;
        }
        if ((i14 & 2) != 0) {
            i11 = t0Var.preambleId;
        }
        if ((i14 & 4) != 0) {
            i12 = t0Var.channel;
        }
        if ((i14 & 8) != 0) {
            i13 = t0Var.firaSessionId;
        }
        if ((i14 & 16) != 0) {
            kVar2 = t0Var.sts;
        }
        if ((i14 & 32) != 0) {
            kVar3 = t0Var.unknownFields();
        }
        okio.k kVar4 = kVar2;
        okio.k kVar5 = kVar3;
        return t0Var.a(kVar, i11, i12, i13, kVar4, kVar5);
    }

    public final t0 a(okio.k address, int preambleId, int channel, int firaSessionId, okio.k sts, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(address, "address");
        p013kotlin.jvm.internal.s.k(sts, "sts");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new t0(address, preambleId, channel, firaSessionId, sts, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final okio.k getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getFiraSessionId() {
        return this.firaSessionId;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), t0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.address, t0Var.address) && this.preambleId == t0Var.preambleId && this.channel == t0Var.channel && this.firaSessionId == t0Var.firaSessionId && p013kotlin.jvm.internal.s.f(this.sts, t0Var.sts);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getPreambleId() {
        return this.preambleId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final okio.k getSts() {
        return this.sts;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.address.hashCode()) * 37) + Integer.hashCode(this.preambleId)) * 37) + Integer.hashCode(this.channel)) * 37) + Integer.hashCode(this.firaSessionId)) * 37) + this.sts.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m839newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("address=" + this.address);
        arrayList.add("preambleId=" + this.preambleId);
        arrayList.add("channel=" + this.channel);
        arrayList.add("firaSessionId=" + this.firaSessionId);
        arrayList.add("sts=" + this.sts);
        return p013kotlin.collections.v.y0(arrayList, ", ", "FiraSessionData{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ t0(okio.k kVar, int i11, int i12, int i13, okio.k kVar2, okio.k kVar3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? okio.k.f97943e : kVar, (i14 & 2) != 0 ? 0 : i11, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13, (i14 & 16) != 0 ? okio.k.f97943e : kVar2, (i14 & 32) != 0 ? okio.k.f97943e : kVar3);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m839newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(okio.k address, int i11, int i12, int i13, okio.k sts, okio.k unknownFields) {
        super(f118916g, unknownFields);
        p013kotlin.jvm.internal.s.k(address, "address");
        p013kotlin.jvm.internal.s.k(sts, "sts");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.address = address;
        this.preambleId = i11;
        this.channel = i12;
        this.firaSessionId = i13;
        this.sts = sts;
    }
}
