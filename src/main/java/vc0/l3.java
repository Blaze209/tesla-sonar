package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0015R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lvc0/l3;", "Lcom/squareup/wire/f;", "", "", "numberOfEntries", "", "Lvc0/i1;", "whitelistEntries", "slotMask", "Lokio/k;", "unknownFields", "<init>", "(ILjava/util/List;ILokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ILjava/util/List;ILokio/k;)Lvc0/l3;", "I", "c", "b", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "e", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l3 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<l3> f118821e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(l3.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final int numberOfEntries;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final int slotMask;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyIdentifier#ADAPTER", label = com.squareup.wire.q.a.REPEATED, tag = 2)
    private final List<i1> whitelistEntries;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/l3$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/l3;", "value", "", "c", "(Lvc0/l3;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/l3;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/l3;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/l3;)Lvc0/l3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<l3> {
        a(com.squareup.wire.b bVar, co0.d<l3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.WhitelistInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l3 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            int iIntValue = 0;
            int iIntValue2 = 0;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new l3(iIntValue, arrayList, iIntValue2, reader.e(jD));
                }
                if (iG == 1) {
                    iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (iG == 2) {
                    arrayList.add(i1.f118747c.decode(reader));
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    iIntValue2 = ProtoAdapter.UINT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, l3 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getNumberOfEntries() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.getNumberOfEntries()));
            }
            i1.f118747c.asRepeated().encodeWithTag(writer, 2, value.e());
            if (value.getSlotMask() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.getSlotMask()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(l3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getNumberOfEntries() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.getNumberOfEntries()));
            }
            int iEncodedSizeWithTag = iD + i1.f118747c.asRepeated().encodedSizeWithTag(2, value.e());
            return value.getSlotMask() != 0 ? iEncodedSizeWithTag + ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.getSlotMask())) : iEncodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public l3 redact(l3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return l3.b(value, 0, x20.d.a(value.e(), i1.f118747c), 0, okio.k.f97943e, 5, null);
        }
    }

    public l3() {
        this(0, null, 0, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l3 b(l3 l3Var, int i11, List list, int i12, okio.k kVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = l3Var.numberOfEntries;
        }
        if ((i13 & 2) != 0) {
            list = l3Var.whitelistEntries;
        }
        if ((i13 & 4) != 0) {
            i12 = l3Var.slotMask;
        }
        if ((i13 & 8) != 0) {
            kVar = l3Var.unknownFields();
        }
        return l3Var.a(i11, list, i12, kVar);
    }

    public final l3 a(int numberOfEntries, List<i1> whitelistEntries, int slotMask, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(whitelistEntries, "whitelistEntries");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new l3(numberOfEntries, whitelistEntries, slotMask, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getNumberOfEntries() {
        return this.numberOfEntries;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSlotMask() {
        return this.slotMask;
    }

    public final List<i1> e() {
        return this.whitelistEntries;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), l3Var.unknownFields()) && this.numberOfEntries == l3Var.numberOfEntries && p013kotlin.jvm.internal.s.f(this.whitelistEntries, l3Var.whitelistEntries) && this.slotMask == l3Var.slotMask;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + Integer.hashCode(this.numberOfEntries)) * 37) + this.whitelistEntries.hashCode()) * 37) + Integer.hashCode(this.slotMask);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m820newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("numberOfEntries=" + this.numberOfEntries);
        if (!this.whitelistEntries.isEmpty()) {
            arrayList.add("whitelistEntries=" + this.whitelistEntries);
        }
        arrayList.add("slotMask=" + this.slotMask);
        return p013kotlin.collections.v.y0(arrayList, ", ", "WhitelistInfo{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ l3(int i11, List list, int i12, okio.k kVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? p013kotlin.collections.v.m() : list, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m820newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(int i11, List<i1> whitelistEntries, int i12, okio.k unknownFields) {
        super(f118821e, unknownFields);
        p013kotlin.jvm.internal.s.k(whitelistEntries, "whitelistEntries");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.numberOfEntries = i11;
        this.slotMask = i12;
        this.whitelistEntries = x20.d.g("whitelistEntries", whitelistEntries);
    }
}
